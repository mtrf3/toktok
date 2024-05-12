package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROV extends ProtoAdapter<ROW> {
    public ROV() {
        super(FieldEncoding.LENGTH_DELIMITED, ROW.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final ROW decode(ProtoReader protoReader) {
        ROW row = new ROW();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    row.banner_enabled = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return row;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(ROW row) {
        ROW row2 = row;
        return row2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(1, row2.banner_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, ROW row) {
        ROW row2 = row;
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, row2.banner_enabled);
        protoWriter.writeBytes(row2.unknownFields());
    }
}
