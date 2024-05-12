package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69465ROb extends ProtoAdapter<C69466ROc> {
    public C69465ROb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69466ROc.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69466ROc decode(ProtoReader protoReader) {
        C69466ROc c69466ROc = new C69466ROc();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69466ROc.show_info_bar_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69466ROc.show_opt_out_button = ProtoAdapter.BOOL.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69466ROc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69466ROc c69466ROc) {
        C69466ROc c69466ROc2 = c69466ROc;
        return c69466ROc2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(2, c69466ROc2.show_info_bar_type) + ProtoAdapter.BOOL.encodedSizeWithTag(1, c69466ROc2.show_opt_out_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69466ROc c69466ROc) {
        C69466ROc c69466ROc2 = c69466ROc;
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c69466ROc2.show_opt_out_button);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c69466ROc2.show_info_bar_type);
        protoWriter.writeBytes(c69466ROc2.unknownFields());
    }
}
