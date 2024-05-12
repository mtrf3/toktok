package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RNl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69449RNl extends ProtoAdapter<C69450RNm> {
    public C69449RNl() {
        super(FieldEncoding.LENGTH_DELIMITED, C69450RNm.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69450RNm decode(ProtoReader protoReader) {
        C69450RNm c69450RNm = new C69450RNm();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            C1EW.LIZJ(protoReader, protoReader);
                        } else {
                            c69450RNm.star_atlas_order = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c69450RNm.ad_link = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    c69450RNm.top_item = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69450RNm;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69450RNm c69450RNm) {
        C69450RNm c69450RNm2 = c69450RNm;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return c69450RNm2.unknownFields().size() + protoAdapter.encodedSizeWithTag(3, c69450RNm2.star_atlas_order) + protoAdapter.encodedSizeWithTag(2, c69450RNm2.ad_link) + protoAdapter.encodedSizeWithTag(1, c69450RNm2.top_item);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69450RNm c69450RNm) {
        C69450RNm c69450RNm2 = c69450RNm;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, c69450RNm2.top_item);
        protoAdapter.encodeWithTag(protoWriter, 2, c69450RNm2.ad_link);
        protoAdapter.encodeWithTag(protoWriter, 3, c69450RNm2.star_atlas_order);
        protoWriter.writeBytes(c69450RNm2.unknownFields());
    }
}
