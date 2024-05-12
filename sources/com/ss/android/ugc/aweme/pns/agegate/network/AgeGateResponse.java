package com.ss.android.ugc.aweme.pns.agegate.network;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class AgeGateResponse extends BaseResponse {

    @InterfaceC65349Pkn("age_gate_post_action")
    public final Integer ageGatePostAction;

    @InterfaceC65349Pkn("is_mixed_age")
    public final Boolean isMixedAge;

    @InterfaceC65349Pkn("is_prompt")
    public final boolean is_prompt;

    @InterfaceC65349Pkn("register_age_gate_post_action")
    public final Integer registerAgeGatePostAction;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeGateResponse() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final Integer getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public final Integer getRegisterAgeGatePostAction() {
        return this.registerAgeGatePostAction;
    }

    public final Boolean isMixedAge() {
        return this.isMixedAge;
    }

    public final boolean is_prompt() {
        return this.is_prompt;
    }

    public AgeGateResponse(boolean z, Integer num, Integer num2, Boolean bool) {
        super(0, null, null, 7, null);
        this.is_prompt = z;
        this.registerAgeGatePostAction = num;
        this.ageGatePostAction = num2;
        this.isMixedAge = bool;
    }

    public /* synthetic */ AgeGateResponse(boolean z, Integer num, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool);
    }
}
