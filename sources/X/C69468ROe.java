package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69468ROe extends ProtoAdapter<C69469ROf> {
    public C69468ROe() {
        super(FieldEncoding.LENGTH_DELIMITED, C69469ROf.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69469ROf decode(ProtoReader protoReader) {
        C69469ROf c69469ROf = new C69469ROf();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        C1EW.LIZJ(protoReader, protoReader);
                    } else {
                        c69469ROf.reason = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69469ROf.status = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69469ROf;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69469ROf c69469ROf) {
        C69469ROf c69469ROf2 = c69469ROf;
        return c69469ROf2.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, c69469ROf2.reason) + ProtoAdapter.INT32.encodedSizeWithTag(1, c69469ROf2.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69469ROf c69469ROf) {
        C69469ROf c69469ROf2 = c69469ROf;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69469ROf2.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c69469ROf2.reason);
        protoWriter.writeBytes(c69469ROf2.unknownFields());
    }
}
