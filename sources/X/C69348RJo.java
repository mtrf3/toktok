package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RJo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69348RJo extends ProtoAdapter<C69349RJp> {
    public C69348RJo() {
        super(FieldEncoding.LENGTH_DELIMITED, C69349RJp.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69349RJp decode(ProtoReader protoReader) {
        C69349RJp c69349RJp = new C69349RJp();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    C1EW.LIZJ(protoReader, protoReader);
                } else {
                    c69349RJp.track = C69270RGo.ADAPTER.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69349RJp;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69349RJp c69349RJp) {
        C69349RJp c69349RJp2 = c69349RJp;
        return c69349RJp2.unknownFields().size() + C69270RGo.ADAPTER.encodedSizeWithTag(1, c69349RJp2.track);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69349RJp c69349RJp) {
        C69349RJp c69349RJp2 = c69349RJp;
        C69270RGo.ADAPTER.encodeWithTag(protoWriter, 1, c69349RJp2.track);
        protoWriter.writeBytes(c69349RJp2.unknownFields());
    }
}
