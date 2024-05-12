package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RDC extends ProtoAdapter<RF0> {
    public RDC() {
        super(FieldEncoding.LENGTH_DELIMITED, RF0.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final RF0 decode(ProtoReader protoReader) {
        RF0 rf0 = new RF0();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rf0.uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rf0.unique_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rf0.nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rf0.avatar_168x168 = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        rf0.avatar_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        rf0.follow_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        rf0.follower_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        rf0.is_private_account = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        rf0.custom_verify = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        rf0.enterprise_verify_reason = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case 12:
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rf0.interest_level = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 14:
                        rf0.is_business_account = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 15:
                        rf0.invitation_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rf0;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(RF0 rf0) {
        RF0 rf02 = rf0;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, rf02.nickname) + protoAdapter.encodedSizeWithTag(2, rf02.unique_id) + protoAdapter.encodedSizeWithTag(1, rf02.uid);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, rf02.avatar_thumb) + protoAdapter2.encodedSizeWithTag(4, rf02.avatar_168x168) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return rf02.unknownFields().size() + protoAdapter3.encodedSizeWithTag(15, rf02.invitation_status) + ProtoAdapter.BOOL.encodedSizeWithTag(14, rf02.is_business_account) + protoAdapter3.encodedSizeWithTag(13, rf02.interest_level) + protoAdapter.encodedSizeWithTag(10, rf02.enterprise_verify_reason) + protoAdapter.encodedSizeWithTag(9, rf02.custom_verify) + protoAdapter3.encodedSizeWithTag(8, rf02.is_private_account) + protoAdapter3.encodedSizeWithTag(7, rf02.follower_status) + protoAdapter3.encodedSizeWithTag(6, rf02.follow_status) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, RF0 rf0) {
        RF0 rf02 = rf0;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rf02.uid);
        protoAdapter.encodeWithTag(protoWriter, 2, rf02.unique_id);
        protoAdapter.encodeWithTag(protoWriter, 3, rf02.nickname);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, rf02.avatar_168x168);
        protoAdapter2.encodeWithTag(protoWriter, 5, rf02.avatar_thumb);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 6, rf02.follow_status);
        protoAdapter3.encodeWithTag(protoWriter, 7, rf02.follower_status);
        protoAdapter3.encodeWithTag(protoWriter, 8, rf02.is_private_account);
        protoAdapter.encodeWithTag(protoWriter, 9, rf02.custom_verify);
        protoAdapter.encodeWithTag(protoWriter, 10, rf02.enterprise_verify_reason);
        protoAdapter3.encodeWithTag(protoWriter, 13, rf02.interest_level);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, rf02.is_business_account);
        protoAdapter3.encodeWithTag(protoWriter, 15, rf02.invitation_status);
        protoWriter.writeBytes(rf02.unknownFields());
    }
}
