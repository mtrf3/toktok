package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RG7 extends ProtoAdapter<RHP> {
    public RG7() {
        super(FieldEncoding.LENGTH_DELIMITED, RHP.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHP decode(ProtoReader protoReader) {
        RHP rhp = new RHP();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        rhp.score = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    rhp.emoji = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHP rhp) {
        RHP rhp2 = rhp;
        return rhp2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, rhp2.score) + ProtoAdapter.STRING.encodedSizeWithTag(1, rhp2.emoji);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHP rhp) {
        RHP rhp2 = rhp;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rhp2.emoji);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, rhp2.score);
        protoWriter.writeBytes(rhp2.unknownFields());
    }
}
