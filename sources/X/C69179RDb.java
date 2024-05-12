package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.RDb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69179RDb extends ProtoAdapter<C69232RFc> {
    public C69179RDb() {
        super(FieldEncoding.LENGTH_DELIMITED, C69232RFc.class);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final C69232RFc decode(ProtoReader protoReader) {
        C69232RFc c69232RFc = new C69232RFc();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c69232RFc.uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 2:
                        c69232RFc.nickname = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 3:
                        c69232RFc.signature = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c69232RFc.avatar_thumb = REV.ADAPTER.decode(protoReader);
                        break;
                    case 5:
                        c69232RFc.follow_status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 6:
                        c69232RFc.status = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c69232RFc.user_rate = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 8:
                        c69232RFc.avatar_larger = REV.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c69232RFc.hit_task_info = C69475ROl.ADAPTER.decode(protoReader);
                        break;
                    case 10:
                        c69232RFc.unique_id = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c69232RFc.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        C1EW.LIZJ(protoReader, protoReader);
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c69232RFc;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(C69232RFc c69232RFc) {
        C69232RFc c69232RFc2 = c69232RFc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, c69232RFc2.signature) + protoAdapter.encodedSizeWithTag(2, c69232RFc2.nickname) + protoAdapter.encodedSizeWithTag(1, c69232RFc2.uid);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, c69232RFc2.avatar_thumb) + encodedSizeWithTag;
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        return c69232RFc2.unknownFields().size() + protoAdapter.encodedSizeWithTag(11, c69232RFc2.sec_uid) + protoAdapter.encodedSizeWithTag(10, c69232RFc2.unique_id) + C69475ROl.ADAPTER.encodedSizeWithTag(9, c69232RFc2.hit_task_info) + protoAdapter2.encodedSizeWithTag(8, c69232RFc2.avatar_larger) + protoAdapter3.encodedSizeWithTag(7, c69232RFc2.user_rate) + protoAdapter3.encodedSizeWithTag(6, c69232RFc2.status) + protoAdapter3.encodedSizeWithTag(5, c69232RFc2.follow_status) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, C69232RFc c69232RFc) {
        C69232RFc c69232RFc2 = c69232RFc;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, c69232RFc2.uid);
        protoAdapter.encodeWithTag(protoWriter, 2, c69232RFc2.nickname);
        protoAdapter.encodeWithTag(protoWriter, 3, c69232RFc2.signature);
        ProtoAdapter<REV> protoAdapter2 = REV.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, c69232RFc2.avatar_thumb);
        ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(protoWriter, 5, c69232RFc2.follow_status);
        protoAdapter3.encodeWithTag(protoWriter, 6, c69232RFc2.status);
        protoAdapter3.encodeWithTag(protoWriter, 7, c69232RFc2.user_rate);
        protoAdapter2.encodeWithTag(protoWriter, 8, c69232RFc2.avatar_larger);
        C69475ROl.ADAPTER.encodeWithTag(protoWriter, 9, c69232RFc2.hit_task_info);
        protoAdapter.encodeWithTag(protoWriter, 10, c69232RFc2.unique_id);
        protoAdapter.encodeWithTag(protoWriter, 11, c69232RFc2.sec_uid);
        protoWriter.writeBytes(c69232RFc2.unknownFields());
    }
}
