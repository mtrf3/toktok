package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import defpackage.t1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xdk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85296Xdk {
    public static final C85296Xdk LIZ = new C85296Xdk();

    public static Config[] LIZIZ() {
        try {
            return (Config[]) SettingsManager.LIZLLL().LJIIIIZZ("location_popup_config", Config[].class, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean LJFF() {
        Config[] LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            return true;
        }
        boolean z = true;
        for (Config config : LIZIZ) {
            if (config.popupSceneV2 != null && (!r0.isEmpty())) {
                LIZ.getClass();
                if (!LJI(config)) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static Config LIZ(String str) {
        Config[] LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            for (Config config : LIZIZ) {
                if (o.LJ(config.business, str)) {
                    LIZ.getClass();
                    if (!LJI(config)) {
                        return config;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean LJI(Config config) {
        System.currentTimeMillis();
        String str = config.regionSource;
        if (str != null) {
            if (o.LJ(str, "did")) {
                return t1.LJI();
            }
            if (!t1.LJI()) {
                return true;
            }
        }
        return false;
    }

    public static String LIZJ(String business, String scene) {
        List<PopupSceneV2> list;
        PopupSceneV2 LJJIJIIJIL;
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        Config LIZ2 = LIZ(business);
        if (LIZ2 != null && (list = LIZ2.popupSceneV2) != null && (LJJIJIIJIL = C78866UxK.LJJIJIIJIL(scene, list)) != null) {
            return LJJIJIIJIL.popupText;
        }
        return null;
    }

    public static boolean LIZLLL(String business, String scene) {
        List<PopupSceneV2> list;
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        Config LIZ2 = LIZ(business);
        if (LIZ2 == null || (list = LIZ2.popupSceneV2) == null || !C78866UxK.LJJ(scene, list)) {
            return false;
        }
        LIZ.getClass();
        if (LJI(LIZ2)) {
            return false;
        }
        return true;
    }

    public static boolean LJ(String str, String str2) {
        List<PopupSceneV2> list;
        PopupSceneV2 LJJIJIIJIL;
        PopupSceneV2 LJJIJIIJIL2;
        Config LIZ2 = LIZ(str);
        if (LIZ2 == null) {
            return false;
        }
        LIZ.getClass();
        if (LJI(LIZ2)) {
            return false;
        }
        List<PopupSceneV2> list2 = LIZ2.popupSceneV2;
        if ((list2 == null || (LJJIJIIJIL2 = C78866UxK.LJJIJIIJIL(str2, list2)) == null || LJJIJIIJIL2.showPreInstruction != 1) && ((list = LIZ2.popupSceneV2) == null || (LJJIJIIJIL = C78866UxK.LJJIJIIJIL(str2, list)) == null || LJJIJIIJIL.popupUIType != EnumC78452Uqe.PRE.getType())) {
            return false;
        }
        return true;
    }
}
