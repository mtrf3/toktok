package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes13.dex */
public final class RD5 extends ProtoAdapter<REY> {
    public RD5() {
        super(FieldEncoding.LENGTH_DELIMITED, REY.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final REY decode(ProtoReader protoReader) {
        REY rey = new REY();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        rey.uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        rey.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        rey.nick_name = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        rey.handle = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        rey.avatar = REV.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        rey.is_verified = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 7:
                        rey.enter_type = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        rey.follow_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 9:
                        rey.is_visible = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 10:
                        rey.follower_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rey.is_private_account = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 12:
                        rey.is_block = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rey.is_blocked = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 14:
                        rey.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return rey;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(REY rey) {
        REY rey2 = rey;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = REV.ADAPTER.encodedSizeWithTag(5, rey2.avatar) + protoAdapter.encodedSizeWithTag(4, rey2.handle) + protoAdapter.encodedSizeWithTag(3, rey2.nick_name) + protoAdapter.encodedSizeWithTag(2, rey2.sec_uid) + protoAdapter.encodedSizeWithTag(1, rey2.uid);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, rey2.is_verified) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return rey2.unknownFields().size() + protoAdapter3.encodedSizeWithTag(14, rey2.status) + protoAdapter2.encodedSizeWithTag(13, rey2.is_blocked) + protoAdapter2.encodedSizeWithTag(12, rey2.is_block) + protoAdapter2.encodedSizeWithTag(11, rey2.is_private_account) + protoAdapter3.encodedSizeWithTag(10, rey2.follower_status) + protoAdapter2.encodedSizeWithTag(9, rey2.is_visible) + protoAdapter3.encodedSizeWithTag(8, rey2.follow_status) + protoAdapter3.encodedSizeWithTag(7, rey2.enter_type) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, REY rey) {
        REY rey2 = rey;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rey2.uid);
        protoAdapter.encodeWithTag(protoWriter, 2, rey2.sec_uid);
        protoAdapter.encodeWithTag(protoWriter, 3, rey2.nick_name);
        protoAdapter.encodeWithTag(protoWriter, 4, rey2.handle);
        REV.ADAPTER.encodeWithTag(protoWriter, 5, rey2.avatar);
        ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 6, rey2.is_verified);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 7, rey2.enter_type);
        protoAdapter3.encodeWithTag(protoWriter, 8, rey2.follow_status);
        protoAdapter2.encodeWithTag(protoWriter, 9, rey2.is_visible);
        protoAdapter3.encodeWithTag(protoWriter, 10, rey2.follower_status);
        protoAdapter2.encodeWithTag(protoWriter, 11, rey2.is_private_account);
        protoAdapter2.encodeWithTag(protoWriter, 12, rey2.is_block);
        protoAdapter2.encodeWithTag(protoWriter, 13, rey2.is_blocked);
        protoAdapter3.encodeWithTag(protoWriter, 14, rey2.status);
        protoWriter.writeBytes(rey2.unknownFields());
    }
}
