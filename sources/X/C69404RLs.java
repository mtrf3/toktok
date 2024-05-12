package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RLs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69404RLs extends ProtoAdapter<C69405RLt> {
    public C69404RLs() {
        super(FieldEncoding.LENGTH_DELIMITED, C69405RLt.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69405RLt decode(ProtoReader protoReader) {
        C69405RLt c69405RLt = new C69405RLt();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69405RLt.url = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69405RLt.uri = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    c69405RLt.language = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69405RLt;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69405RLt c69405RLt) {
        C69405RLt c69405RLt2 = c69405RLt;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return c69405RLt2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(3, c69405RLt2.url) + protoAdapter.encodedSizeWithTag(2, c69405RLt2.uri) + protoAdapter.encodedSizeWithTag(1, c69405RLt2.language);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69405RLt c69405RLt) {
        C69405RLt c69405RLt2 = c69405RLt;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69405RLt2.language);
        protoAdapter.encodeWithTag(protoWriter, 2, c69405RLt2.uri);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, c69405RLt2.url);
        protoWriter.writeBytes(c69405RLt2.unknownFields());
    }
}
