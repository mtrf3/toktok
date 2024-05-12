package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BbX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29103BbX<T1, T2, T3, R> implements InterfaceC89813fl {
    public static final C29103BbX<T1, T2, T3, R> LJLIL = new C29103BbX<>();

    @Override // X.InterfaceC89813fl
    public final Object LIZJ(Object obj, Object obj2, Object obj3) {
        C28467BFf roomCreateInfoRsp = (C28467BFf) obj;
        C28467BFf livePermissionApplyRsp = (C28467BFf) obj2;
        C28467BFf broadcastSettingRsp = (C28467BFf) obj3;
        o.LJIIIZ(roomCreateInfoRsp, "roomCreateInfoRsp");
        o.LJIIIZ(livePermissionApplyRsp, "livePermissionApplyRsp");
        o.LJIIIZ(broadcastSettingRsp, "broadcastSettingRsp");
        return new C29018BaA(roomCreateInfoRsp, livePermissionApplyRsp, broadcastSettingRsp);
    }
}
