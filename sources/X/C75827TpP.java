package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;

/* renamed from: X.TpP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75827TpP implements InterfaceC214228aw<InterfaceC75826TpO> {
    public final C75822TpK LIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC75826TpO getOperator() {
        return this.LIZ;
    }

    public C75827TpP(ISessionAbility iSessionAbility) {
        this.LIZ = new C75822TpK(iSessionAbility);
    }
}
