package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RMk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69422RMk extends ProtoAdapter<C69423RMl> {
    public C69422RMk() {
        super(FieldEncoding.LENGTH_DELIMITED, C69423RMl.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69423RMl decode(ProtoReader protoReader) {
        C69423RMl c69423RMl = new C69423RMl();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69423RMl.original_item_gap = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c69423RMl.item_param_for_pitaya = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69423RMl;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69423RMl c69423RMl) {
        C69423RMl c69423RMl2 = c69423RMl;
        return c69423RMl2.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(2, c69423RMl2.original_item_gap) + ProtoAdapter.STRING.encodedSizeWithTag(1, c69423RMl2.item_param_for_pitaya);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69423RMl c69423RMl) {
        C69423RMl c69423RMl2 = c69423RMl;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69423RMl2.item_param_for_pitaya);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c69423RMl2.original_item_gap);
        protoWriter.writeBytes(c69423RMl2.unknownFields());
    }
}
