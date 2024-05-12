package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.TokenInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* renamed from: X.P0w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63766P0w extends ProtoAdapter<Request> {
    public final ProtoAdapter<java.util.Map<String, String>> LJ;

    public C63766P0w() {
        super(FieldEncoding.LENGTH_DELIMITED, Request.class);
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Request decode(ProtoReader protoReader) {
        C63767P0x c63767P0x = new C63767P0x();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag != -1) {
                switch (nextTag) {
                    case 1:
                        c63767P0x.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 2:
                        c63767P0x.LJ = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 3:
                        c63767P0x.LJFF = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 4:
                        c63767P0x.LJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 5:
                        try {
                            c63767P0x.LJII = P10.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            c63767P0x.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 6:
                        c63767P0x.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 7:
                        c63767P0x.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        c63767P0x.LJIIJ = RequestBody.ADAPTER.decode(protoReader);
                        break;
                    case 9:
                        c63767P0x.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        c63767P0x.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c63767P0x.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 12:
                        c63767P0x.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c63767P0x.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 14:
                        c63767P0x.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 15:
                        c63767P0x.LJIIZILJ.putAll(this.LJ.decode(protoReader));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c63767P0x.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 17:
                        c63767P0x.LJIJI = TokenInfo.ADAPTER.decode(protoReader);
                        break;
                    case 18:
                        try {
                            c63767P0x.LJIJJ = EnumC63768P0y.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            c63767P0x.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    case 19:
                        c63767P0x.LJIJJLI = MsgTrace.ADAPTER.decode(protoReader);
                        break;
                    case 20:
                        c63767P0x.LJIL = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    default:
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        c63767P0x.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            } else {
                protoReader.endMessage(beginMessage);
                return c63767P0x.build();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Request request) {
        Request request2 = request;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, request2.sequence_id) + protoAdapter.encodedSizeWithTag(1, request2.cmd);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        return request2.unknownFields().size() + protoAdapter.encodedSizeWithTag(20, request2.retry_count) + MsgTrace.ADAPTER.encodedSizeWithTag(19, request2.msg_trace) + EnumC63768P0y.ADAPTER.encodedSizeWithTag(18, request2.auth_type) + TokenInfo.ADAPTER.encodedSizeWithTag(17, request2.token_info) + protoAdapter.encodedSizeWithTag(16, request2.config_id) + this.LJ.encodedSizeWithTag(15, request2.headers) + protoAdapter2.encodedSizeWithTag(14, request2.version_code) + protoAdapter2.encodedSizeWithTag(13, request2.os_version) + protoAdapter2.encodedSizeWithTag(12, request2.device_type) + protoAdapter2.encodedSizeWithTag(11, request2.device_platform) + protoAdapter2.encodedSizeWithTag(10, request2.channel) + protoAdapter2.encodedSizeWithTag(9, request2.device_id) + RequestBody.ADAPTER.encodedSizeWithTag(8, request2.body) + protoAdapter2.encodedSizeWithTag(7, request2.build_number) + protoAdapter.encodedSizeWithTag(6, request2.inbox_type) + P10.ADAPTER.encodedSizeWithTag(5, request2.refer) + protoAdapter2.encodedSizeWithTag(4, request2.token) + protoAdapter2.encodedSizeWithTag(3, request2.sdk_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Request request) {
        Request request2 = request;
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, request2.cmd);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, request2.sequence_id);
        ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, request2.sdk_version);
        protoAdapter2.encodeWithTag(protoWriter, 4, request2.token);
        P10.ADAPTER.encodeWithTag(protoWriter, 5, request2.refer);
        protoAdapter.encodeWithTag(protoWriter, 6, request2.inbox_type);
        protoAdapter2.encodeWithTag(protoWriter, 7, request2.build_number);
        RequestBody.ADAPTER.encodeWithTag(protoWriter, 8, request2.body);
        protoAdapter2.encodeWithTag(protoWriter, 9, request2.device_id);
        protoAdapter2.encodeWithTag(protoWriter, 10, request2.channel);
        protoAdapter2.encodeWithTag(protoWriter, 11, request2.device_platform);
        protoAdapter2.encodeWithTag(protoWriter, 12, request2.device_type);
        protoAdapter2.encodeWithTag(protoWriter, 13, request2.os_version);
        protoAdapter2.encodeWithTag(protoWriter, 14, request2.version_code);
        this.LJ.encodeWithTag(protoWriter, 15, request2.headers);
        protoAdapter.encodeWithTag(protoWriter, 16, request2.config_id);
        TokenInfo.ADAPTER.encodeWithTag(protoWriter, 17, request2.token_info);
        EnumC63768P0y.ADAPTER.encodeWithTag(protoWriter, 18, request2.auth_type);
        MsgTrace.ADAPTER.encodeWithTag(protoWriter, 19, request2.msg_trace);
        protoAdapter.encodeWithTag(protoWriter, 20, request2.retry_count);
        protoWriter.writeBytes(request2.unknownFields());
    }
}
