package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69455RNr extends ProtoAdapter<C69456RNs> {
    public C69455RNr() {
        super(FieldEncoding.LENGTH_DELIMITED, C69456RNs.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69456RNs decode(ProtoReader protoReader) {
        C69456RNs c69456RNs = new C69456RNs();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69456RNs.aigc_label_type = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69456RNs;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69456RNs c69456RNs) {
        C69456RNs c69456RNs2 = c69456RNs;
        return c69456RNs2.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, c69456RNs2.aigc_label_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69456RNs c69456RNs) {
        C69456RNs c69456RNs2 = c69456RNs;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69456RNs2.aigc_label_type);
        protoWriter.writeBytes(c69456RNs2.unknownFields());
    }
}
