package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RFk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69240RFk extends ProtoAdapter<RHV> {
    public C69240RFk() {
        super(FieldEncoding.LENGTH_DELIMITED, RHV.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHV decode(ProtoReader protoReader) {
        RHV rhv = new RHV();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhv.info = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        rhv.word_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    rhv.word = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhv;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHV rhv) {
        RHV rhv2 = rhv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return rhv2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rhv2.info) + protoAdapter.encodedSizeWithTag(2, rhv2.word_id) + protoAdapter.encodedSizeWithTag(1, rhv2.word);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHV rhv) {
        RHV rhv2 = rhv;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rhv2.word);
        protoAdapter.encodeWithTag(protoWriter, 2, rhv2.word_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rhv2.info);
        protoWriter.writeBytes(rhv2.unknownFields());
    }
}
