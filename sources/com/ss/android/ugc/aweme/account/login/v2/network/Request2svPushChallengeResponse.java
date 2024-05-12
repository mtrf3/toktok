package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Request2svPushChallengeResponse {

    @InterfaceC65349Pkn("active_device_names")
    public final List<String> active_device_names;

    @InterfaceC65349Pkn("captcha")
    public final String captcha;

    @InterfaceC65349Pkn("challenge_ticket")
    public final String challenge_ticket;

    @InterfaceC65349Pkn("desc_url")
    public final String desc_url;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public final Integer error_code;

    @InterfaceC65349Pkn("pending")
    public final Boolean pending;

    @InterfaceC65349Pkn("reason")
    public final String reason;

    @InterfaceC65349Pkn("result")
    public final String result;

    @InterfaceC65349Pkn("wait_ticket")
    public final String wait_ticket;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request2svPushChallengeResponse)) {
            return false;
        }
        Request2svPushChallengeResponse request2svPushChallengeResponse = (Request2svPushChallengeResponse) obj;
        return o.LJ(this.captcha, request2svPushChallengeResponse.captcha) && o.LJ(this.desc_url, request2svPushChallengeResponse.desc_url) && o.LJ(this.description, request2svPushChallengeResponse.description) && o.LJ(this.error_code, request2svPushChallengeResponse.error_code) && o.LJ(this.result, request2svPushChallengeResponse.result) && o.LJ(this.wait_ticket, request2svPushChallengeResponse.wait_ticket) && o.LJ(this.challenge_ticket, request2svPushChallengeResponse.challenge_ticket) && o.LJ(this.pending, request2svPushChallengeResponse.pending) && o.LJ(this.reason, request2svPushChallengeResponse.reason) && o.LJ(this.active_device_names, request2svPushChallengeResponse.active_device_names);
    }

    public final int hashCode() {
        String str = this.captcha;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc_url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.error_code;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.result;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.wait_ticket;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.challenge_ticket;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.pending;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.reason;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.active_device_names;
        return hashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request2svPushChallengeResponse(captcha=");
        LIZ.append(this.captcha);
        LIZ.append(", desc_url=");
        LIZ.append(this.desc_url);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", error_code=");
        LIZ.append(this.error_code);
        LIZ.append(", result=");
        LIZ.append(this.result);
        LIZ.append(", wait_ticket=");
        LIZ.append(this.wait_ticket);
        LIZ.append(", challenge_ticket=");
        LIZ.append(this.challenge_ticket);
        LIZ.append(", pending=");
        LIZ.append(this.pending);
        LIZ.append(", reason=");
        LIZ.append(this.reason);
        LIZ.append(", active_device_names=");
        return C1NE.LIZIZ(LIZ, this.active_device_names, ')', LIZ);
    }

    public Request2svPushChallengeResponse(String str, String str2, String str3, Integer num, String str4, String str5, String str6, Boolean bool, String str7, List<String> list) {
        this.captcha = str;
        this.desc_url = str2;
        this.description = str3;
        this.error_code = num;
        this.result = str4;
        this.wait_ticket = str5;
        this.challenge_ticket = str6;
        this.pending = bool;
        this.reason = str7;
        this.active_device_names = list;
    }

    public /* synthetic */ Request2svPushChallengeResponse(String str, String str2, String str3, Integer num, String str4, String str5, String str6, Boolean bool, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool, (i & 256) == 0 ? str7 : null, list);
    }
}
