package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF7 extends ProtoAdapter<RHE> {
    public RF7() {
        super(FieldEncoding.LENGTH_DELIMITED, RHE.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHE decode(ProtoReader protoReader) {
        RHE rhe = new RHE();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhe.action = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhe.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhe.offline_info_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhe;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHE rhe) {
        RHE rhe2 = rhe;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, rhe2.offline_info_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhe2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rhe2.action) + protoAdapter.encodedSizeWithTag(2, rhe2.text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHE rhe) {
        RHE rhe2 = rhe;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rhe2.offline_info_type);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rhe2.text);
        protoAdapter.encodeWithTag(protoWriter, 3, rhe2.action);
        protoWriter.writeBytes(rhe2.unknownFields());
    }
}
