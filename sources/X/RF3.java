package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RF3 extends ProtoAdapter<RHA> {
    public RF3() {
        super(FieldEncoding.LENGTH_DELIMITED, RHA.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHA decode(ProtoReader protoReader) {
        RHA rha = new RHA();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rha.user_avatar = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    rha.uid = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rha;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHA rha) {
        RHA rha2 = rha;
        return rha2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(2, rha2.user_avatar) + ProtoAdapter.INT64.encodedSizeWithTag(1, rha2.uid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHA rha) {
        RHA rha2 = rha;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, rha2.uid);
        REV.ADAPTER.encodeWithTag(protoWriter, 2, rha2.user_avatar);
        protoWriter.writeBytes(rha2.unknownFields());
    }
}
