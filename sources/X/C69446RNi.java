package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69446RNi extends ProtoAdapter<C69447RNj> {
    public C69446RNi() {
        super(FieldEncoding.LENGTH_DELIMITED, C69447RNj.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69447RNj decode(ProtoReader protoReader) {
        C69447RNj c69447RNj = new C69447RNj();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69447RNj.badge_thumb = REV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c69447RNj.honor_score = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    c69447RNj.honor_level = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69447RNj;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69447RNj c69447RNj) {
        C69447RNj c69447RNj2 = c69447RNj;
        return c69447RNj2.unknownFields().size() + REV.ADAPTER.encodedSizeWithTag(3, c69447RNj2.badge_thumb) + ProtoAdapter.INT64.encodedSizeWithTag(2, c69447RNj2.honor_score) + ProtoAdapter.INT32.encodedSizeWithTag(1, c69447RNj2.honor_level);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69447RNj c69447RNj) {
        C69447RNj c69447RNj2 = c69447RNj;
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c69447RNj2.honor_level);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c69447RNj2.honor_score);
        REV.ADAPTER.encodeWithTag(protoWriter, 3, c69447RNj2.badge_thumb);
        protoWriter.writeBytes(c69447RNj2.unknownFields());
    }
}
