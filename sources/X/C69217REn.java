package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.REn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69217REn extends ProtoAdapter<RHB> {
    public C69217REn() {
        super(FieldEncoding.LENGTH_DELIMITED, RHB.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RHB decode(ProtoReader protoReader) {
        RHB rhb = new RHB();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            rhb.card_insert_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        rhb.card_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    rhb.card_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rhb;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RHB rhb) {
        RHB rhb2 = rhb;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return rhb2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, rhb2.card_insert_status) + ProtoAdapter.INT64.encodedSizeWithTag(2, rhb2.card_id) + protoAdapter.encodedSizeWithTag(1, rhb2.card_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RHB rhb) {
        RHB rhb2 = rhb;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rhb2.card_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, rhb2.card_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rhb2.card_insert_status);
        protoWriter.writeBytes(rhb2.unknownFields());
    }
}
