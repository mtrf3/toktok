package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WZy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82514WZy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("mobBeautyOptimizeToastShow netStatus:", str, " type:", str2, " toastStatus:");
        LIZLLL.append(str3);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZLLL));
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("net_status", str);
        hashMap.put("type", str2);
        hashMap.put("toast_status", str3);
        InterfaceC58234MtK interfaceC58234MtK = C82516Wa0.LJIIIZ;
        if (interfaceC58234MtK != null) {
            interfaceC58234MtK.LJ("tools_record_beauty_optimize_toast_show", hashMap);
        }
    }

    public static void LIZIZ(int i, String panel, String str) {
        o.LJIIIZ(panel, "panel");
        if (C82894Wg6.LIZIZ.LJFF()) {
            return;
        }
        StringBuilder LJ = AnonymousClass028.LJ("monitorBeautyListFetch panel:", panel, " code:", i, " msg:");
        LJ.append(str);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LJ));
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("panel", panel);
        C116484hg.LIZIZ(hashMap, "msg", str, i, "code");
        InterfaceC58234MtK interfaceC58234MtK = C82516Wa0.LJIIIZ;
        if (interfaceC58234MtK != null) {
            interfaceC58234MtK.LJ("beauty_fetch_effect_list", hashMap);
        }
    }

    public static void LIZJ(int i, ComposerBeauty composerBeauty, String str) {
        HashMap<String, String> LIZ2 = C1R5.LIZ(str, "errorDesc");
        LIZ2.put("code", String.valueOf(i));
        LIZ2.put("msg", str);
        LIZ2.put("effect_id", composerBeauty.getEffect().getEffectId());
        LIZ2.put("effect_name", composerBeauty.getEffect().getName());
        LIZ2.put("unzip_path", composerBeauty.getEffect().getUnzipPath());
        InterfaceC58234MtK interfaceC58234MtK = C82516Wa0.LJIIIZ;
        if (interfaceC58234MtK != null) {
            interfaceC58234MtK.LJ("beauty_resource_unzip", LIZ2);
        }
    }
}
