package com.bytedance.im.core.proto;

import X.C63685Oz3;
import X.C63766P0w;
import X.C63767P0x;
import X.C64537PUn;
import X.DIX;
import X.EnumC63768P0y;
import X.InterfaceC65349Pkn;
import X.P10;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Request extends Message<Request, C63767P0x> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("auth_type")
    public final EnumC63768P0y auth_type;

    @InterfaceC65349Pkn("body")
    public final RequestBody body;

    @InterfaceC65349Pkn("build_number")
    public final String build_number;

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("cmd")
    public final Integer cmd;

    @InterfaceC65349Pkn("config_id")
    public final Integer config_id;

    @InterfaceC65349Pkn("device_id")
    public final String device_id;

    @InterfaceC65349Pkn("device_platform")
    public final String device_platform;

    @InterfaceC65349Pkn("device_type")
    public final String device_type;

    @InterfaceC65349Pkn("headers")
    public final Map<String, String> headers;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;

    @InterfaceC65349Pkn("msg_trace")
    public final MsgTrace msg_trace;

    @InterfaceC65349Pkn("os_version")
    public final String os_version;

    @InterfaceC65349Pkn("refer")
    public final P10 refer;

    @InterfaceC65349Pkn("retry_count")
    public final Integer retry_count;

    @InterfaceC65349Pkn("sdk_version")
    public final String sdk_version;

    @InterfaceC65349Pkn("sequence_id")
    public final Long sequence_id;

    @InterfaceC65349Pkn("token")
    public final String token;

    @InterfaceC65349Pkn("token_info")
    public final TokenInfo token_info;

    @InterfaceC65349Pkn("version_code")
    public final String version_code;
    public static final ProtoAdapter<Request> ADAPTER = new C63766P0w();
    public static final Integer DEFAULT_CMD = 0;
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    public static final P10 DEFAULT_REFER = P10.REFER_NOT_USED;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Integer DEFAULT_CONFIG_ID = 0;
    public static final EnumC63768P0y DEFAULT_AUTH_TYPE = EnumC63768P0y.UNKNOWN_AUTH;
    public static final Integer DEFAULT_RETRY_COUNT = 0;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder */
    public Message.Builder<Request, C63767P0x> newBuilder2() {
        C63767P0x c63767P0x = new C63767P0x();
        c63767P0x.LIZLLL = this.cmd;
        c63767P0x.LJ = this.sequence_id;
        c63767P0x.LJFF = this.sdk_version;
        c63767P0x.LJI = this.token;
        c63767P0x.LJII = this.refer;
        c63767P0x.LJIIIIZZ = this.inbox_type;
        c63767P0x.LJIIIZ = this.build_number;
        c63767P0x.LJIIJ = this.body;
        c63767P0x.LJIIJJI = this.device_id;
        c63767P0x.LJIIL = this.channel;
        c63767P0x.LJIILIIL = this.device_platform;
        c63767P0x.LJIILJJIL = this.device_type;
        c63767P0x.LJIILL = this.os_version;
        c63767P0x.LJIILLIIL = this.version_code;
        c63767P0x.LJIIZILJ = C63685Oz3.LIZLLL("headers", this.headers);
        c63767P0x.LJIJ = this.config_id;
        c63767P0x.LJIJI = this.token_info;
        c63767P0x.LJIJJ = this.auth_type;
        c63767P0x.LJIJJLI = this.msg_trace;
        c63767P0x.LJIL = this.retry_count;
        c63767P0x.addUnknownFields(unknownFields());
        return c63767P0x;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.sdk_version != null) {
            sb.append(", sdk_version=");
            sb.append(this.sdk_version);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.refer != null) {
            sb.append(", refer=");
            sb.append(this.refer);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.build_number != null) {
            sb.append(", build_number=");
            sb.append(this.build_number);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.device_platform != null) {
            sb.append(", device_platform=");
            sb.append(this.device_platform);
        }
        if (this.device_type != null) {
            sb.append(", device_type=");
            sb.append(this.device_type);
        }
        if (this.os_version != null) {
            sb.append(", os_version=");
            sb.append(this.os_version);
        }
        if (this.version_code != null) {
            sb.append(", version_code=");
            sb.append(this.version_code);
        }
        Map<String, String> map = this.headers;
        if (map != null && !map.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.config_id != null) {
            sb.append(", config_id=");
            sb.append(this.config_id);
        }
        if (this.token_info != null) {
            sb.append(", token_info=");
            sb.append(this.token_info);
        }
        if (this.auth_type != null) {
            sb.append(", auth_type=");
            sb.append(this.auth_type);
        }
        if (this.msg_trace != null) {
            sb.append(", msg_trace=");
            sb.append(this.msg_trace);
        }
        if (this.retry_count != null) {
            sb.append(", retry_count=");
            sb.append(this.retry_count);
        }
        return DIX.LIZLLL(sb, 0, 2, "Request{", '}');
    }

    public Request(Integer num, Long l, String str, String str2, P10 p10, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo, EnumC63768P0y enumC63768P0y, MsgTrace msgTrace, Integer num4) {
        this(num, l, str, str2, p10, num2, str3, requestBody, str4, str5, str6, str7, str8, str9, map, num3, tokenInfo, enumC63768P0y, msgTrace, num4, C64537PUn.EMPTY);
    }

    public Request(Integer num, Long l, String str, String str2, P10 p10, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo, EnumC63768P0y enumC63768P0y, MsgTrace msgTrace, Integer num4, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cmd = num;
        this.sequence_id = l;
        this.sdk_version = str;
        this.token = str2;
        this.refer = p10;
        this.inbox_type = num2;
        this.build_number = str3;
        this.body = requestBody;
        this.device_id = str4;
        this.channel = str5;
        this.device_platform = str6;
        this.device_type = str7;
        this.os_version = str8;
        this.version_code = str9;
        this.headers = C63685Oz3.LJI("headers", map);
        this.config_id = num3;
        this.token_info = tokenInfo;
        this.auth_type = enumC63768P0y;
        this.msg_trace = msgTrace;
        this.retry_count = num4;
    }
}
