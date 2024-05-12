package com.ss.android.ugc.aweme.poi.api;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C85270XdK;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC65002PfC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public interface PoiEventApi {
    public static final C85270XdK LIZ = C85270XdK.LIZ;

    @E4T("tiktok/poi/api/stats/query_event")
    AbstractC73672Svk<BaseResponse> postEvent(@InterfaceC65002PfC("Content-Type") String str, @InterfaceC65002PfC("sgn") String str2, @InterfaceC65002PfC("biz") String str3, @InterfaceC27211Am7 EventRequestBody eventRequestBody);

    /* loaded from: classes2.dex */
    public static final class PoiEventResult extends BaseResponse {

        @InterfaceC65349Pkn("code")
        public final int code;

        @InterfaceC65349Pkn("data")
        public final PoiEventResultData data;

        @InterfaceC65349Pkn("mesg")
        public final String msg;

        public static /* synthetic */ PoiEventResult copy$default(PoiEventResult poiEventResult, int i, PoiEventResultData poiEventResultData, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = poiEventResult.code;
            }
            if ((i2 & 2) != 0) {
                poiEventResultData = poiEventResult.data;
            }
            if ((i2 & 4) != 0) {
                str = poiEventResult.msg;
            }
            return poiEventResult.copy(i, poiEventResultData, str);
        }

        public final PoiEventResult copy(int i, PoiEventResultData poiEventResultData, String str) {
            return new PoiEventResult(i, poiEventResultData, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiEventResult)) {
                return false;
            }
            PoiEventResult poiEventResult = (PoiEventResult) obj;
            return this.code == poiEventResult.code && o.LJ(this.data, poiEventResult.data) && o.LJ(this.msg, poiEventResult.msg);
        }

        public int hashCode() {
            int i = this.code * 31;
            PoiEventResultData poiEventResultData = this.data;
            int hashCode = (i + (poiEventResultData == null ? 0 : poiEventResultData.hashCode())) * 31;
            String str = this.msg;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiEventResult(code=");
            LIZ.append(this.code);
            LIZ.append(", data=");
            LIZ.append(this.data);
            LIZ.append(", msg=");
            return q.LIZIZ(LIZ, this.msg, ')', LIZ);
        }

        public final int getCode() {
            return this.code;
        }

        public final PoiEventResultData getData() {
            return this.data;
        }

        public final String getMsg() {
            return this.msg;
        }

        public PoiEventResult(int i, PoiEventResultData poiEventResultData, String str) {
            this.code = i;
            this.data = poiEventResultData;
            this.msg = str;
        }

        public /* synthetic */ PoiEventResult(int i, PoiEventResultData poiEventResultData, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : poiEventResultData, (i2 & 4) != 0 ? null : str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PoiEventResultData implements Serializable {

        @InterfaceC65349Pkn("id")
        public final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiEventResultData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PoiEventResultData copy$default(PoiEventResultData poiEventResultData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = poiEventResultData.id;
            }
            return poiEventResultData.copy(str);
        }

        public final PoiEventResultData copy(String str) {
            return new PoiEventResultData(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiEventResultData) && o.LJ(this.id, ((PoiEventResultData) obj).id);
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiEventResultData(id=");
            return q.LIZIZ(LIZ, this.id, ')', LIZ);
        }

        public final String getId() {
            return this.id;
        }

        public PoiEventResultData(String str) {
            this.id = str;
        }

        public /* synthetic */ PoiEventResultData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* loaded from: classes12.dex */
    public static final class EventRequestBody {

        @InterfaceC65349Pkn("appid")
        public final int appId;

        @InterfaceC65349Pkn("appversion")
        public final String appVersion;

        @InterfaceC65349Pkn("device")
        public final int device;

        @InterfaceC65349Pkn("did")
        public final String did;

        @InterfaceC65349Pkn("event2")
        public final String event2;

        @InterfaceC65349Pkn("logid")
        public final String logId;

        @InterfaceC65349Pkn("poi_id")
        public final String poiId;

        @InterfaceC65349Pkn("sdkversion")
        public final String sdkVersion;

        @InterfaceC65349Pkn("step")
        public final int step;

        @InterfaceC65349Pkn("timestamp")
        public final long timeStamp;

        @InterfaceC65349Pkn("vid")
        public final String vid;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EventRequestBody() {
            /*
                r15 = this;
                r1 = 0
                r5 = 0
                r11 = 0
                r13 = 2047(0x7ff, float:2.868E-42)
                r0 = r15
                r2 = r1
                r3 = r1
                r4 = r1
                r6 = r5
                r7 = r5
                r8 = r1
                r9 = r1
                r10 = r1
                r14 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.api.PoiEventApi.EventRequestBody.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventRequestBody)) {
                return false;
            }
            EventRequestBody eventRequestBody = (EventRequestBody) obj;
            return o.LJ(this.logId, eventRequestBody.logId) && o.LJ(this.poiId, eventRequestBody.poiId) && o.LJ(this.vid, eventRequestBody.vid) && o.LJ(this.event2, eventRequestBody.event2) && this.step == eventRequestBody.step && this.device == eventRequestBody.device && this.appId == eventRequestBody.appId && o.LJ(this.did, eventRequestBody.did) && o.LJ(this.appVersion, eventRequestBody.appVersion) && o.LJ(this.sdkVersion, eventRequestBody.sdkVersion) && this.timeStamp == eventRequestBody.timeStamp;
        }

        public final int hashCode() {
            String str = this.logId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.poiId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.vid;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.event2;
            int hashCode4 = (((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.step) * 31) + this.device) * 31) + this.appId) * 31;
            String str5 = this.did;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.appVersion;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.sdkVersion;
            return C16880lQ.LLJIJIL(this.timeStamp) + ((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "EventRequestBody(logId=" + this.logId + ", poiId=" + this.poiId + ", vid=" + this.vid + ", event2=" + this.event2 + ", step=" + this.step + ", device=" + this.device + ", appId=" + this.appId + ", did=" + this.did + ", appVersion=" + this.appVersion + ", sdkVersion=" + this.sdkVersion + ", timeStamp=" + this.timeStamp + ')';
        }

        public EventRequestBody(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7, long j) {
            this.logId = str;
            this.poiId = str2;
            this.vid = str3;
            this.event2 = str4;
            this.step = i;
            this.device = i2;
            this.appId = i3;
            this.did = str5;
            this.appVersion = str6;
            this.sdkVersion = str7;
            this.timeStamp = j;
        }

        public /* synthetic */ EventRequestBody(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) == 0 ? i3 : 0, (i4 & 128) != 0 ? null : str5, (i4 & 256) != 0 ? null : str6, (i4 & 512) == 0 ? str7 : null, (i4 & 1024) != 0 ? 0L : j);
        }
    }
}
