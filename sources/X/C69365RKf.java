package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69365RKf extends ProtoAdapter<C69366RKg> {
    public C69365RKf() {
        super(FieldEncoding.LENGTH_DELIMITED, C69366RKg.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69366RKg decode(ProtoReader protoReader) {
        C69366RKg c69366RKg = new C69366RKg();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69366RKg.is_list_item = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    c69366RKg.text = RM1.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69366RKg;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69366RKg c69366RKg) {
        C69366RKg c69366RKg2 = c69366RKg;
        return c69366RKg2.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(2, c69366RKg2.is_list_item) + RM1.ADAPTER.encodedSizeWithTag(1, c69366RKg2.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69366RKg c69366RKg) {
        C69366RKg c69366RKg2 = c69366RKg;
        RM1.ADAPTER.encodeWithTag(protoWriter, 1, c69366RKg2.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c69366RKg2.is_list_item);
        protoWriter.writeBytes(c69366RKg2.unknownFields());
    }
}
