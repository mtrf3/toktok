package X;

import Y.AfS22S1200000_13;
import Y.AfS4S1210000_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestZoomLayoutBugfixSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tc0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74996Tc0 extends AbstractC75001Tc5 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJFF;
    public final String LIZJ;
    public final C74861TZp LIZLLL;
    public final C31657Cbd LJ;

    static {
        TBT tbt = new TBT(C74996Tc0.class, "anchorUserManager", "getAnchorUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IAnchorUserManager;", 0);
        C65352Pkq.LIZ.getClass();
        LJFF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC75001Tc5, X.InterfaceC74935Tb1
    public final EnumC74949TbF LIZ() {
        this.LIZ.getClass();
        return LIZLLL(C74995Tbz.LJII());
    }

    @Override // X.AbstractC75001Tc5, X.InterfaceC74935Tb1
    public final void destroy() {
        InterfaceC75441TjB R6;
        InterfaceC76652U6m LJZL;
        super.destroy();
        C74861TZp c74861TZp = this.LIZLLL;
        c74861TZp.getClass();
        C8E.LJ().X3(c74861TZp.LJ);
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c74861TZp.LIZLLL.LIZ(c74861TZp, C74861TZp.LJII[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(c74861TZp.LJFF);
        }
        if (MultiGuestZoomLayoutBugfixSetting.INSTANCE.getValue() && (R6 = C8E.LJ().R6()) != null && (LJZL = R6.LJZL()) != null) {
            LJZL.LJJJJI(c74861TZp.LJI);
        }
    }

    public C74996Tc0(C74993Tbx c74993Tbx) {
        super(c74993Tbx);
        this.LIZJ = "Zoom/ZoomAnchorPresent";
        this.LIZLLL = new C74861TZp(this, c74993Tbx);
        this.LJ = new C31657Cbd("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
    }

    @Override // X.AbstractC75001Tc5, X.InterfaceC74935Tb1
    public final EnumC74949TbF LIZLLL(String str) {
        if (LJII(str)) {
            EnumC74949TbF enumC74949TbF = EnumC74949TbF.CAN_ZOOM_TO_MAX;
            if (!(!o.LJ(str, this.LIZ.LIZJ)) || enumC74949TbF == null) {
                return EnumC74949TbF.CAN_ZOOM_TO_MIN;
            }
            return enumC74949TbF;
        }
        return EnumC74949TbF.ZOOM_DISABLED;
    }

    public final boolean LJII(String linkMicId) {
        boolean LJ;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (C19N.LIZLLL()) {
            int LJIIIZ = C74995Tbz.LJIIIZ(this.LIZ, linkMicId);
            C74995Tbz.LJII.getClass();
            if (LJIIIZ != C74995Tbz.LJIIIZ) {
                boolean LJI = this.LIZ.LJI(linkMicId);
                if (LIZJ()) {
                    if (!LJI) {
                        C74995Tbz c74995Tbz = this.LIZ;
                        c74995Tbz.getClass();
                        if (o.LJ(((LinkedHashMap) c74995Tbz.LIZLLL).get(linkMicId), Boolean.TRUE)) {
                            return false;
                        }
                    }
                    return true;
                }
                Layout LIZIZ = this.LIZ.LIZIZ();
                if (LIZIZ == null) {
                    return false;
                }
                if (LJI) {
                    LJ = o.LJ(LIZIZ.getLayoutId(), LIZIZ.getAnchorZoomLayoutId());
                } else {
                    C74995Tbz c74995Tbz2 = this.LIZ;
                    c74995Tbz2.getClass();
                    if (!o.LJ(((LinkedHashMap) c74995Tbz2.LIZLLL).get(linkMicId), Boolean.TRUE)) {
                        LJ = o.LJ(LIZIZ.getLayoutId(), LIZIZ.getZoomLayoutId());
                    }
                }
                return !LJ;
            }
        }
        return false;
    }

    @Override // X.InterfaceC74935Tb1
    public final void LJ(String linkMicId, InterfaceC75014TcI interfaceC75014TcI, boolean z, boolean z2, EnumC74929Tav zoomSource) {
        int i;
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(zoomSource, "zoomSource");
        int LIZ = this.LIZ.LIZ(linkMicId, z2);
        C28733BPl.LJIILIIL().LJIIIIZZ(this.LIZJ, C113554cx.LJJLIIIIJ(new OSZ("action", "zoom"), new OSZ("linkMicId", linkMicId), new OSZ("noMoreZoom", Boolean.valueOf(z)), new OSZ("zoomFromAnchor", Boolean.valueOf(z2)), new OSZ(WM7.SCENE_SERVICE, Integer.valueOf(LIZ)), new OSZ("zoomSource", zoomSource.name())));
        if (LIZ != 1 && LIZ != 2) {
            this.LIZ.getClass();
            java.util.Map<String, String> LIZLLL = C74995Tbz.LIZLLL(LIZ, linkMicId, z);
            if (this.LIZ.LJI(linkMicId)) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                String str = this.LIZJ;
                java.util.Map<String, ?> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("action", "zoomAnchorToMin"), new OSZ("linkMicId", linkMicId));
                LJJLIIIIJ.putAll(LIZLLL);
                LJIILIIL.LJIIIIZZ(str, LJJLIIIIJ);
                this.LIZIZ.LIZ(C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).zoom(LIZLLL)).LJJJLIIL(new AfS22S1200000_13(this, interfaceC75014TcI, linkMicId, 3), new AfS22S1200000_13(this, interfaceC75014TcI, linkMicId, 4)));
                return;
            }
            LJIIJ(linkMicId, interfaceC75014TcI, LIZLLL, z, zoomSource);
            return;
        }
        String str2 = null;
        if (!LJII(linkMicId)) {
            if (interfaceC75014TcI != null) {
                C75013TcH.LIZ(interfaceC75014TcI, linkMicId, EnumC75004Tc8.E_C_GUEST_REJECT_ZOOM.ordinal(), null, 12);
            }
        } else {
            this.LIZ.getClass();
            if (DataChannelGlobal.LJLJJI.mv0(C29044Baa.class) == null) {
                if (interfaceC75014TcI != null) {
                    C75013TcH.LIZ(interfaceC75014TcI, linkMicId, EnumC75004Tc8.E_C_ROOM_EMPTY.ordinal(), null, 12);
                }
            } else {
                C28733BPl.LJIILIIL().LJIIIIZZ(this.LIZJ, C113554cx.LJJLIIIIJ(new OSZ("action", "tryZoomToMax status ready")));
                String LJIIL = this.LIZ.LJIIL(linkMicId);
                this.LIZ.getClass();
                java.util.Map<String, String> LIZLLL2 = C74995Tbz.LIZLLL(LIZ, linkMicId, false);
                if (LJIIL == null) {
                    if (interfaceC75014TcI == null) {
                        return;
                    }
                    C75013TcH.LIZ(interfaceC75014TcI, linkMicId, EnumC75004Tc8.E_C_LAYOUT_EMPTY.ordinal(), null, 12);
                    return;
                }
                if (this.LIZ.LJI(linkMicId)) {
                    if (LIZJ()) {
                        Layout LJ = this.LIZ.LJ();
                        if (LJ != null) {
                            str2 = LJ.getLayoutId();
                        }
                        if (o.LJ(LJIIL, str2)) {
                            String str3 = this.LIZ.LIZJ;
                            if (str3 == null) {
                                return;
                            }
                            HashMap hashMap = (HashMap) LIZLLL2;
                            hashMap.put(WM7.SCENE_SERVICE, "3");
                            String str4 = this.LIZ.LIZJ;
                            String str5 = "";
                            if (str4 == null) {
                                str4 = "";
                            }
                            hashMap.put("linkmic_id", str4);
                            String str6 = this.LIZ.LIZJ;
                            if (str6 != null) {
                                str5 = str6;
                            }
                            hashMap.put("guest_user_id", String.valueOf(C74998Tc2.LIZJ(str5)));
                            LJIIJ(str3, interfaceC75014TcI, LIZLLL2, false, zoomSource);
                            return;
                        }
                    }
                    C28733BPl LJIILIIL2 = C28733BPl.LJIILIIL();
                    String str7 = this.LIZJ;
                    java.util.Map<String, ?> LJJLIIIIJ2 = C113554cx.LJJLIIIIJ(new OSZ("action", "zoomAnchorToMax"), new OSZ("linkMicId", linkMicId));
                    LJJLIIIIJ2.putAll(LIZLLL2);
                    LJIILIIL2.LJIIIIZZ(str7, LJJLIIIIJ2);
                    C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).zoom(LIZLLL2)).LJJJLIIL(new AfS4S1210000_13(interfaceC75014TcI, linkMicId, this, LJI(), 0), new AfS22S1200000_13(this, interfaceC75014TcI, linkMicId, 2));
                    return;
                }
                C28733BPl LJIILIIL3 = C28733BPl.LJIILIIL();
                String str8 = this.LIZJ;
                java.util.Map<String, ?> LJJLIIIIJ3 = C113554cx.LJJLIIIIJ(new OSZ("action", "zoomGuestToMax"), new OSZ("linkMicId", linkMicId));
                LJJLIIIIJ3.putAll(LIZLLL2);
                LJIILIIL3.LJIIIIZZ(str8, LJJLIIIIJ3);
                if (!LIZJ()) {
                    i = 0;
                } else if (LJI()) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.LIZIZ.LIZ(C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).zoom(LIZLLL2)).LJJJLIIL(new C74999Tc3(this, linkMicId, i, interfaceC75014TcI), new AfS22S1200000_13(this, interfaceC75014TcI, linkMicId, 5)));
                return;
            }
        }
        C28733BPl.LJIILIIL().LJIIIIZZ(this.LIZJ, C113554cx.LJJLIIIIJ(new OSZ("action", "tryZoomToMax status check failed")));
    }

    public final void LJIIIIZZ(Throwable th, InterfaceC75014TcI interfaceC75014TcI, String str, int i, String eMessage) {
        if (eMessage == null) {
            eMessage = C15380j0.LJIILJJIL(R.string.sp2);
        }
        if (th != null) {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StackTraceElement[] stackTrace = th.getStackTrace();
            LJIILIIL.getClass();
            C0NE.LJIIL(0, stackTrace);
        } else {
            C28733BPl.LJIILIIL().LJIIIIZZ(this.LIZJ, C113554cx.LJJLIIIIJ(new OSZ("action", "zoomGuestToMax"), new OSZ("linkMicId", str), new OSZ("errorCode", Integer.valueOf(i)), new OSZ("errorMessage", eMessage)));
        }
        if (interfaceC75014TcI != null) {
            o.LJIIIIZZ(eMessage, "eMessage");
            interfaceC75014TcI.LIZ(i, str, eMessage, th);
        }
    }

    public final void LJIIJ(String linkMicId, InterfaceC75014TcI interfaceC75014TcI, java.util.Map<String, String> map, boolean z, EnumC74929Tav enumC74929Tav) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        String str = this.LIZJ;
        java.util.Map<String, ?> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("action", "zoomGuestToMin"), new OSZ("linkMicId", linkMicId));
        LJJLIIIIJ.putAll(map);
        LJIILIIL.LJIIIIZZ(str, LJJLIIIIJ);
        C74995Tbz c74995Tbz = this.LIZ;
        c74995Tbz.getClass();
        o.LJIIIZ(linkMicId, "linkMicId");
        c74995Tbz.LIZLLL.put(linkMicId, Boolean.valueOf(z));
        this.LIZIZ.LIZ(C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).zoom(map)).LJJJLIIL(new C75000Tc4(enumC74929Tav, linkMicId, interfaceC75014TcI, this), new AfS22S1200000_13(this, interfaceC75014TcI, linkMicId, 6)));
    }
}
