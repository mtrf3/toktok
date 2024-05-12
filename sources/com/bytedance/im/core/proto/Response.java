package com.bytedance.im.core.proto;

import X.C63652OyW;
import X.C63653OyX;
import X.C63685Oz3;
import X.C64537PUn;
import X.DIX;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Response extends Message<Response, C63653OyX> {
    public static final long serialVersionUID = 0;

    @InterfaceC65349Pkn("body")
    public final ResponseBody body;

    @InterfaceC65349Pkn("cmd")
    public final Integer cmd;

    @InterfaceC65349Pkn("error_desc")
    public final String error_desc;

    @InterfaceC65349Pkn("headers")
    public final Map<String, String> headers;

    @InterfaceC65349Pkn("inbox_type")
    public final Integer inbox_type;

    @InterfaceC65349Pkn("log_id")
    public final String log_id;

    @InterfaceC65349Pkn("request_arrived_time")
    public final Long request_arrived_time;

    @InterfaceC65349Pkn("retry_count")
    public final Integer retry_count;

    @InterfaceC65349Pkn("sequence_id")
    public final Long sequence_id;

    @InterfaceC65349Pkn("server_execution_end_time")
    public final Long server_execution_end_time;

    @InterfaceC65349Pkn("server_start_time")
    public final Long server_start_time;

    @InterfaceC65349Pkn("start_time_stamp")
    public final Long start_time_stamp;

    @InterfaceC65349Pkn("status_code")
    public final Integer status_code;
    public static final ProtoAdapter<Response> ADAPTER = new C63652OyW();
    public static final Integer DEFAULT_CMD = 0;
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_START_TIME_STAMP = 0L;
    public static final Long DEFAULT_REQUEST_ARRIVED_TIME = 0L;
    public static final Long DEFAULT_SERVER_EXECUTION_END_TIME = 0L;
    public static final Integer DEFAULT_RETRY_COUNT = 0;
    public static final Long DEFAULT_SERVER_START_TIME = 0L;

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Message.Builder<Response, C63653OyX> newBuilder2() {
        C63653OyX c63653OyX = new C63653OyX();
        c63653OyX.LIZLLL = this.cmd;
        c63653OyX.LJ = this.sequence_id;
        c63653OyX.LJFF = this.status_code;
        c63653OyX.LJI = this.error_desc;
        c63653OyX.LJII = this.inbox_type;
        c63653OyX.LJIIIIZZ = this.body;
        c63653OyX.LJIIIZ = this.log_id;
        c63653OyX.LJIIJ = C63685Oz3.LIZLLL("headers", this.headers);
        c63653OyX.LJIIJJI = this.start_time_stamp;
        c63653OyX.LJIIL = this.request_arrived_time;
        c63653OyX.LJIILIIL = this.server_execution_end_time;
        c63653OyX.LJIILJJIL = this.retry_count;
        c63653OyX.LJIILL = this.server_start_time;
        c63653OyX.addUnknownFields(unknownFields());
        return c63653OyX;
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
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.error_desc != null) {
            sb.append(", error_desc=");
            sb.append(this.error_desc);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.log_id != null) {
            sb.append(", log_id=");
            sb.append(this.log_id);
        }
        Map<String, String> map = this.headers;
        if (map != null && !map.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.start_time_stamp != null) {
            sb.append(", start_time_stamp=");
            sb.append(this.start_time_stamp);
        }
        if (this.request_arrived_time != null) {
            sb.append(", request_arrived_time=");
            sb.append(this.request_arrived_time);
        }
        if (this.server_execution_end_time != null) {
            sb.append(", server_execution_end_time=");
            sb.append(this.server_execution_end_time);
        }
        if (this.retry_count != null) {
            sb.append(", retry_count=");
            sb.append(this.retry_count);
        }
        if (this.server_start_time != null) {
            sb.append(", server_start_time=");
            sb.append(this.server_start_time);
        }
        return DIX.LIZLLL(sb, 0, 2, "Response{", '}');
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l2, Long l3, Long l4, Integer num4, Long l5) {
        this(num, l, num2, str, num3, responseBody, str2, map, l2, l3, l4, num4, l5, C64537PUn.EMPTY);
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l2, Long l3, Long l4, Integer num4, Long l5, C64537PUn c64537PUn) {
        super(ADAPTER, c64537PUn);
        this.cmd = num;
        this.sequence_id = l;
        this.status_code = num2;
        this.error_desc = str;
        this.inbox_type = num3;
        this.body = responseBody;
        this.log_id = str2;
        this.headers = C63685Oz3.LJI("headers", map);
        this.start_time_stamp = l2;
        this.request_arrived_time = l3;
        this.server_execution_end_time = l4;
        this.retry_count = num4;
        this.server_start_time = l5;
    }
}
