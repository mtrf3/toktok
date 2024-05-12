package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DigitalWellbeingResponse extends BaseResponse {

    @InterfaceC65349Pkn("screen_time_setting")
    public final ScreenTimeSetting screenTimeSetting;

    /* JADX WARN: Multi-variable type inference failed */
    public DigitalWellbeingResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DigitalWellbeingResponse copy$default(DigitalWellbeingResponse digitalWellbeingResponse, ScreenTimeSetting screenTimeSetting, int i, Object obj) {
        if ((i & 1) != 0) {
            screenTimeSetting = digitalWellbeingResponse.screenTimeSetting;
        }
        return digitalWellbeingResponse.copy(screenTimeSetting);
    }

    public final DigitalWellbeingResponse copy(ScreenTimeSetting screenTimeSetting) {
        return new DigitalWellbeingResponse(screenTimeSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DigitalWellbeingResponse) && o.LJ(this.screenTimeSetting, ((DigitalWellbeingResponse) obj).screenTimeSetting);
    }

    public int hashCode() {
        ScreenTimeSetting screenTimeSetting = this.screenTimeSetting;
        if (screenTimeSetting == null) {
            return 0;
        }
        return screenTimeSetting.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DigitalWellbeingResponse(screenTimeSetting=");
        LIZ.append(this.screenTimeSetting);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ScreenTimeSetting getScreenTimeSetting() {
        return this.screenTimeSetting;
    }

    public DigitalWellbeingResponse(ScreenTimeSetting screenTimeSetting) {
        this.screenTimeSetting = screenTimeSetting;
    }

    public /* synthetic */ DigitalWellbeingResponse(ScreenTimeSetting screenTimeSetting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ScreenTimeSetting(null, 1, null) : screenTimeSetting);
    }
}
