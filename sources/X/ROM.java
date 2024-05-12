package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class ROM extends ProtoAdapter<RON> {
    public ROM() {
        super(FieldEncoding.LENGTH_DELIMITED, RON.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RON decode(ProtoReader protoReader) {
        RON ron = new RON();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        ron.horizontal = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    ron.vertical.add(ProtoAdapter.FLOAT.decode(protoReader));
                }
            } else {
                protoReader.endMessage(beginMessage);
                return ron;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RON ron) {
        RON ron2 = ron;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        return ron2.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, ron2.horizontal) + protoAdapter.asRepeated().encodedSizeWithTag(1, ron2.vertical);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RON ron) {
        RON ron2 = ron;
        ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, ron2.vertical);
        protoAdapter.encodeWithTag(protoWriter, 2, ron2.horizontal);
        protoWriter.writeBytes(ron2.unknownFields());
    }
}
