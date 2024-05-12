package com.ss.android.ugc.aweme.bnpl.biz.verify.otp;

import X.C91809a0b;
import X.F9E;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class OtpRouteArg extends F9E implements IRouteArg {
    public final String previousPageId;
    public final String verifyInfo;
    public static final Parcelable.Creator<OtpRouteArg> CREATOR = new C91809a0b();
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public OtpRouteArg() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OtpRouteArg(String verifyInfo) {
        this(verifyInfo, null, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(verifyInfo, "verifyInfo");
    }

    public static OtpRouteArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("otp_verify_info")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("otp_verify_info"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("previous_page_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page_id"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        return new OtpRouteArg(str, str2, i, defaultConstructorMarker);
    }

    public static /* synthetic */ OtpRouteArg copy$default(OtpRouteArg otpRouteArg, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otpRouteArg.verifyInfo;
        }
        if ((i & 2) != 0) {
            str2 = otpRouteArg.previousPageId;
        }
        return otpRouteArg.copy(str, str2);
    }

    public final OtpRouteArg copy(String verifyInfo, String previousPageId) {
        o.LJIIIZ(verifyInfo, "verifyInfo");
        o.LJIIIZ(previousPageId, "previousPageId");
        return new OtpRouteArg(verifyInfo, previousPageId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.verifyInfo, this.previousPageId};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.verifyInfo);
        out.writeString(this.previousPageId);
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public final String getVerifyInfo() {
        return this.verifyInfo;
    }

    public OtpRouteArg(String verifyInfo, String previousPageId) {
        o.LJIIIZ(verifyInfo, "verifyInfo");
        o.LJIIIZ(previousPageId, "previousPageId");
        this.verifyInfo = verifyInfo;
        this.previousPageId = previousPageId;
    }

    public /* synthetic */ OtpRouteArg(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
