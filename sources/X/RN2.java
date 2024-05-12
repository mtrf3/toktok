package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RN2 extends ProtoAdapter<RN3> {
    public RN2() {
        super(FieldEncoding.LENGTH_DELIMITED, RN3.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RN3 decode(ProtoReader protoReader) {
        RN3 rn3 = new RN3();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rn3.game_score = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rn3.game_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rn3;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RN3 rn3) {
        RN3 rn32 = rn3;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rn32.unknownFields().size() + protoAdapter.encodedSizeWithTag(2, rn32.game_score) + protoAdapter.encodedSizeWithTag(1, rn32.game_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RN3 rn3) {
        RN3 rn32 = rn3;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rn32.game_type);
        protoAdapter.encodeWithTag(protoWriter, 2, rn32.game_score);
        protoWriter.writeBytes(rn32.unknownFields());
    }
}
