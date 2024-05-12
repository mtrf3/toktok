package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RM4 extends ProtoAdapter<RM5> {
    public RM4() {
        super(FieldEncoding.LENGTH_DELIMITED, RM5.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RM5 decode(ProtoReader protoReader) {
        RM5 rm5 = new RM5();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rm5.fatal_item_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        rm5.logid = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rm5.now = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rm5;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RM5 rm5) {
        RM5 rm52 = rm5;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, rm52.now);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rm52.unknownFields().size() + protoAdapter.asRepeated().encodedSizeWithTag(3, rm52.fatal_item_ids) + protoAdapter.encodedSizeWithTag(2, rm52.logid) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RM5 rm5) {
        RM5 rm52 = rm5;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rm52.now);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rm52.logid);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, rm52.fatal_item_ids);
        protoWriter.writeBytes(rm52.unknownFields());
    }
}
