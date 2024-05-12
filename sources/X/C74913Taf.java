package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;

/* renamed from: X.Taf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74913Taf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str) {
        C28733BPl.LJIILIIL().LJIIIIZZ(str, C113554cx.LJJLIIIIJ(new OSZ("action", "shrink"), new OSZ("step", "shrinkSuccess")));
    }

    public static void LJ(String str) {
        C28733BPl.LJIILIIL().LJIIIIZZ(str, C113554cx.LJJLIIIIJ(new OSZ("action", "onZoomClick")));
    }

    public static void LIZ(String str, ZoomService zoomService, String str2) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        OSZ[] oszArr = new OSZ[4];
        boolean z = false;
        oszArr[0] = new OSZ("action", "shrink");
        oszArr[1] = new OSZ("step", "entrance");
        if (zoomService == null) {
            z = true;
        }
        oszArr[2] = new OSZ("zoomServiceIsNull", Boolean.valueOf(z));
        oszArr[3] = new OSZ("myLinkMicId", str2);
        LJIILIIL.LJIIIIZZ(str, C113554cx.LJJLIIIIJ(oszArr));
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C28733BPl.LJIILIIL().LJIIIIZZ(str, C113554cx.LJJLIIIIJ(new OSZ("action", "updateZoomViewVisibility"), new OSZ("visibility", str2), new OSZ("source", str3)));
    }

    public static void LIZIZ(int i, String str, String str2, Throwable th) {
        String str3;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("action", "shrink");
        oszArr[1] = new OSZ("step", "shrinkFail");
        oszArr[2] = new OSZ("errorCode", Integer.valueOf(i));
        oszArr[3] = new OSZ("errorMessage", str2);
        if (th != null) {
            str3 = th.getMessage();
        } else {
            str3 = null;
        }
        oszArr[4] = new OSZ("throwable", str3);
        LJIILIIL.LJIIIIZZ(str, C113554cx.LJJLIIIIJ(oszArr));
    }
}
