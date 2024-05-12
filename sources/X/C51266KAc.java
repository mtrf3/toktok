package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KAc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51266KAc implements InterfaceC214228aw<KCM> {
    public final C51260K9w LIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ KCM getOperator() {
        return this.LIZ;
    }

    public C51266KAc(ActivityC45651qj activityC45651qj, InterfaceC70422pa viewModelScope, KA0 ka0) {
        o.LJIIIZ(viewModelScope, "viewModelScope");
        this.LIZ = new C51260K9w(activityC45651qj, viewModelScope, ka0);
    }
}
