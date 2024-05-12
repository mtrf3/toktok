package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RKr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69377RKr extends ProtoAdapter<C69378RKs> {
    public C69377RKr() {
        super(FieldEncoding.LENGTH_DELIMITED, C69378RKs.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69378RKs decode(ProtoReader protoReader) {
        C69378RKs c69378RKs = new C69378RKs();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69378RKs.source_url = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69378RKs.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69378RKs.id = ProtoAdapter.INT64.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69378RKs;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69378RKs c69378RKs) {
        C69378RKs c69378RKs2 = c69378RKs;
        return c69378RKs2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(3, c69378RKs2.source_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, c69378RKs2.name) + ProtoAdapter.INT64.encodedSizeWithTag(1, c69378RKs2.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69378RKs c69378RKs) {
        C69378RKs c69378RKs2 = c69378RKs;
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c69378RKs2.id);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c69378RKs2.name);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, c69378RKs2.source_url);
        protoWriter.writeBytes(c69378RKs2.unknownFields());
    }
}
