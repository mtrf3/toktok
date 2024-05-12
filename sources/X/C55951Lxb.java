package X;

import com.google.gson.internal.b;
import kotlin.jvm.internal.o;

/* renamed from: X.Lxb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55951Lxb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C56141M1p c56141M1p) {
        String str;
        java.util.Map<String, Object> map;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("stage", EnumC55950Lxa.REQUEST_REACH_CFG.getValue());
        if (c56141M1p == null || (str = c56141M1p.LIZ) == null) {
            str = "";
        }
        oszArr[1] = new OSZ("video_id", str);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (c56141M1p != null && (map = c56141M1p.LJIIJ) != null) {
            LJJLIIIIJ.putAll(map);
        }
        b.LJJIJIIJI("rd_tiktokec_shop_video_guide", LJJLIIIIJ);
    }

    public static void LIZIZ(C56141M1p c56141M1p, String errMsg) {
        String str;
        java.util.Map<String, Object> map;
        o.LJIIIZ(errMsg, "errMsg");
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ(WM7.SCENE_SERVICE, 1);
        oszArr[1] = new OSZ("stage", EnumC55950Lxa.VIDEO_GUIDE_SHOW_FAIL.getValue());
        if (c56141M1p == null || (str = c56141M1p.LIZ) == null) {
            str = "";
        }
        oszArr[2] = new OSZ("video_id", str);
        oszArr[3] = new OSZ("err_msg", errMsg);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (c56141M1p != null && (map = c56141M1p.LJIIJ) != null) {
            LJJLIIIIJ.putAll(map);
        }
        b.LJJIJIIJI("rd_tiktokec_shop_video_guide", LJJLIIIIJ);
    }
}
