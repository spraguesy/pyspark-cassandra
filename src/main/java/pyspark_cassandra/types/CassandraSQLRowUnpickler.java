package pyspark_cassandra.types;

import org.apache.spark.sql.cassandra.CassandraSQLRow;

import scala.collection.immutable.IndexedSeq;

public class CassandraSQLRowUnpickler extends StructUnpickler {
	@Override
	public Object construct(IndexedSeq<String> fieldNames, IndexedSeq<Object> fieldValues) {
		return new CassandraSQLRow(fieldNames, fieldValues);
	}
}
