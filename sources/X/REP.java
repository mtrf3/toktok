package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class REP extends ProtoAdapter<RGS> {
    public REP() {
        super(FieldEncoding.LENGTH_DELIMITED, RGS.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RGS decode(ProtoReader protoReader) {
        RGS rgs = new RGS();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                if (nextTag != 1) {
                    if (nextTag != 2) {
                        if (nextTag != 3) {
                            if (nextTag != 4) {
                                if (nextTag != 5) {
                                    C1EW.LIZJ(protoReader, protoReader);
                                } else {
                                    rgs.ad_influencer_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                rgs.link_user_info = C69435RMx.ADAPTER.decode(protoReader);
                            }
                        } else {
                            rgs.has_ads_entry = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        rgs.show_star_atlas_cooperation = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    rgs.star_atlas = ProtoAdapter.INT32.decode(protoReader);
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rgs;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RGS rgs) {
        RGS rgs2 = rgs;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rgs2.star_atlas);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        return rgs2.unknownFields().size() + protoAdapter.encodedSizeWithTag(5, rgs2.ad_influencer_type) + C69435RMx.ADAPTER.encodedSizeWithTag(4, rgs2.link_user_info) + protoAdapter2.encodedSizeWithTag(3, rgs2.has_ads_entry) + protoAdapter2.encodedSizeWithTag(2, rgs2.show_star_atlas_cooperation) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RGS rgs) {
        RGS rgs2 = rgs;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, rgs2.star_atlas);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 2, rgs2.show_star_atlas_cooperation);
        protoAdapter2.encodeWithTag(protoWriter, 3, rgs2.has_ads_entry);
        C69435RMx.ADAPTER.encodeWithTag(protoWriter, 4, rgs2.link_user_info);
        protoAdapter.encodeWithTag(protoWriter, 5, rgs2.ad_influencer_type);
        protoWriter.writeBytes(rgs2.unknownFields());
    }
}
