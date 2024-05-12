package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.ROt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69483ROt extends ProtoAdapter<C69484ROu> {
    public C69483ROt() {
        super(FieldEncoding.LENGTH_DELIMITED, C69484ROu.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69484ROu decode(ProtoReader protoReader) {
        C69484ROu c69484ROu = new C69484ROu();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69484ROu.dynamic_cover = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69484ROu.cover = REV.ADAPTER.decode(protoReader);
                    }
                } else {
                    c69484ROu.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69484ROu;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69484ROu c69484ROu) {
        C69484ROu c69484ROu2 = c69484ROu;
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c69484ROu2.aweme_id);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        return c69484ROu2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69484ROu2.dynamic_cover) + protoAdapter.encodedSizeWithTag(2, c69484ROu2.cover) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69484ROu c69484ROu) {
        C69484ROu c69484ROu2 = c69484ROu;
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c69484ROu2.aweme_id);
        ProtoAdapter<REV> protoAdapter = REV.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, c69484ROu2.cover);
        protoAdapter.encodeWithTag(protoWriter, 3, c69484ROu2.dynamic_cover);
        protoWriter.writeBytes(c69484ROu2.unknownFields());
    }
}
