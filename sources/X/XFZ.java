package X;

import android.app.Application;
import com.bef.effectsdk.ResourceFinder;
import com.google.gson.Gson;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.setting.performance.PageModeCodecConfigParam;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFZ implements HV5 {
    public final Gson LIZ;
    public final C44839Hil LIZIZ;
    public final ResourceFinder LIZJ;
    public final C63946P7u LIZLLL;
    public final C62822Ol8 LJ;
    public final ExecutorService LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final File LJIIIZ;

    public static final boolean LIZIZ() {
        Boolean bool = C44984Hl6.LJFF;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C19N.LJ("enable_bytevc1_hw_decoder", false);
    }

    public static final boolean LIZJ() {
        Boolean bool = C44984Hl6.LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C19N.LJ("enable_h264_hw_decoder", false);
    }

    public static final int LIZLLL() {
        java.util.Map<String, Integer> map = C44984Hl6.LIZLLL;
        if (map != null) {
            Integer num = map.get("higher_fps_min_side_threshold");
            if (num == null) {
                return 1070;
            }
            return num.intValue();
        }
        return Q7K.LIZIZ("high_fps_min_side_bytevc1_hw_decoder", 1070);
    }

    public static final int LJ() {
        java.util.Map<String, Integer> map = C44984Hl6.LIZLLL;
        if (map != null) {
            Integer num = map.get("higher_fps_threshold");
            if (num == null) {
                return 40;
            }
            return num.intValue();
        }
        return Q7K.LIZIZ("high_fps_lower_limit_bytevc1_hw_decoder", 40);
    }

    public static final int LJI() {
        java.util.Map<String, Integer> map = C44984Hl6.LIZLLL;
        if (map != null) {
            Integer num = map.get("lower_fps_min_side_threshold");
            if (num != null) {
                return num.intValue();
            }
            return 1070;
        }
        return Q7K.LIZIZ("min_size_bytevc1_hw_decoder", 1090);
    }

    public static final int LJII() {
        java.util.Map<String, Integer> map = C44984Hl6.LIZ;
        if (map != null) {
            Integer num = map.get("lower_fps_min_side_threshold");
            if (num == null) {
                return 1090;
            }
            return num.intValue();
        }
        try {
            Integer hdHwDecoderMinSideSize = C2YJ.LIZIZ.LIZ.getHdHwDecoderMinSideSize();
            o.LJIIIIZZ(hdHwDecoderMinSideSize, "get().hdHwDecoderMinSideSize");
            int intValue = hdHwDecoderMinSideSize.intValue();
            if (intValue <= 720 || intValue >= 2200) {
                return 1090;
            }
            return intValue;
        } catch (C158056If unused) {
            return 1090;
        }
    }

    public static final P86 LJIIIZ() {
        P86 p86;
        int i;
        PageModeCodecConfigParam pageModeCodecConfigParam = (PageModeCodecConfigParam) C84520XFc.LIZIZ.getValue();
        if (pageModeCodecConfigParam != null && (i = pageModeCodecConfigParam.pageMode) >= 0) {
            p86 = new P86(i, pageModeCodecConfigParam.highResolutionVideoMinSide, pageModeCodecConfigParam.highFpsResolutionVideoMinSide);
        } else {
            p86 = null;
        }
        java.util.Map<String, Integer> map = C44984Hl6.LJ;
        if (p86 != null) {
            if (p86.LIZ >= 0) {
                return p86;
            }
            P86 LIZ = LIZ(map);
            if (LIZ != null) {
                return LIZ;
            }
        }
        return LIZ(map);
    }

    public static final P86 LJIIJ() {
        P86 p86;
        int i;
        PageModeCodecConfigParam pageModeCodecConfigParam = (PageModeCodecConfigParam) C84522XFe.LIZIZ.getValue();
        if (pageModeCodecConfigParam != null && (i = pageModeCodecConfigParam.pageMode) >= 0) {
            p86 = new P86(i, pageModeCodecConfigParam.highResolutionVideoMinSide, pageModeCodecConfigParam.highFpsResolutionVideoMinSide);
        } else {
            p86 = null;
        }
        java.util.Map<String, Integer> map = C44984Hl6.LIZIZ;
        if (p86 != null) {
            if (p86.LIZ >= 0) {
                return p86;
            }
            P86 LIZ = LIZ(map);
            if (LIZ != null) {
                return LIZ;
            }
        }
        return LIZ(map);
    }

    public final InterfaceC83966WxO LJFF() {
        return (InterfaceC83966WxO) this.LJI.getValue();
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    public final PreviewSize LJIIJJI() {
        boolean z;
        Gson gson = this.LIZ;
        String LIZ = C44744HhE.LIZ();
        if (LIZ == null || LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!z) {
            try {
                obj = gson.LJI(LIZ, PreviewSize.class);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return (PreviewSize) obj;
    }

    public static P86 LIZ(java.util.Map map) {
        int i;
        int i2;
        int i3 = 0;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Integer num = (Integer) map.get("page_mode");
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        Integer num2 = (Integer) map.get("lower_fps_min_side_threshold");
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        Integer num3 = (Integer) map.get("higher_fps_min_side_threshold");
        if (num3 != null) {
            i3 = num3.intValue();
        }
        return new P86(i, i2, i3);
    }

    public XFZ(Application application, Gson gSon, C44839Hil vesdkabManager, DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder, C63946P7u veAppField, C84525XFh c84525XFh) {
        o.LJIIIZ(application, "application");
        o.LJIIIZ(gSon, "gSon");
        o.LJIIIZ(vesdkabManager, "vesdkabManager");
        o.LJIIIZ(veAppField, "veAppField");
        this.LIZ = gSon;
        this.LIZIZ = vesdkabManager;
        this.LIZJ = downloadableModelSupportResourceFinder;
        this.LIZLLL = veAppField;
        this.LJ = C221108m2.LIZIZ(DKB.LJLIL);
        ExecutorService executorService = C38016Ew0.LIZ;
        o.LJIIIIZZ(executorService, "getNormalExecutor()");
        this.LJFF = executorService;
        this.LJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 16));
        this.LJII = C221108m2.LIZIZ(C83067Wit.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C53732L6y.LJLIL);
        this.LJIIIZ = new File(application.getFilesDir(), "vesdk");
    }
}
