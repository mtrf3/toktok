package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RJf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69339RJf extends ProtoAdapter<C69340RJg> {
    public C69339RJf() {
        super(FieldEncoding.LENGTH_DELIMITED, C69340RJg.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69340RJg decode(ProtoReader protoReader) {
        C69340RJg c69340RJg = new C69340RJg();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69340RJg.nature_classification_info = RHK.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69340RJg;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69340RJg c69340RJg) {
        C69340RJg c69340RJg2 = c69340RJg;
        return c69340RJg2.unknownFields().size() + RHK.ADAPTER.encodedSizeWithTag(1, c69340RJg2.nature_classification_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69340RJg c69340RJg) {
        C69340RJg c69340RJg2 = c69340RJg;
        RHK.ADAPTER.encodeWithTag(protoWriter, 1, c69340RJg2.nature_classification_info);
        protoWriter.writeBytes(c69340RJg2.unknownFields());
    }
}
