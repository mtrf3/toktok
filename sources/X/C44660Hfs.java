package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.property.FastImport4kHighRes50FpsInBenchmarkStrategy;
import com.ss.android.ugc.aweme.property.FastImport4kHighRes60FpsInBenchmarkStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hfs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44660Hfs {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        String LIZ2;
        String LIZ3;
        Boolean LIZIZ = C03090Af.LIZIZ("fast_import_1080p_higher_benchmark_enable", false);
        Boolean valueOf = Boolean.valueOf(InterfaceC44775Hhj.LJ.enableFastImport1080pHigher());
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "fast_import_1080p_higher_benchmark_enable", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ2 = String.valueOf(valueOf);
            } else {
                LIZ2 = C44877HjN.LIZ(valueOf);
            }
            C44847Hit.LIZJ(LIZIZ2, LIZ2, LIZIZ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("key : ", "fast_import_1080p_higher_benchmark_enable", " , libraValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ3 = String.valueOf(LIZIZ);
            } else {
                LIZ3 = C44877HjN.LIZ(LIZIZ);
            }
            C44847Hit.LIZJ(LIZIZ3, LIZ3, LIZIZ3);
        }
        return LIZIZ.booleanValue();
    }

    public static boolean LIZLLL() {
        String LIZ2;
        String LIZ3;
        Boolean LIZIZ = C03090Af.LIZIZ("fast_import_1080p_lower_benchmark_enable", false);
        Boolean valueOf = Boolean.valueOf(InterfaceC44775Hhj.LJ.enableFastImport1080pLower());
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("key : ", "fast_import_1080p_lower_benchmark_enable", " , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ2 = String.valueOf(valueOf);
            } else {
                LIZ2 = C44877HjN.LIZ(valueOf);
            }
            C44847Hit.LIZJ(LIZIZ2, LIZ2, LIZIZ2);
            LIZIZ = valueOf;
        } else {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("key : ", "fast_import_1080p_lower_benchmark_enable", " , libraValue : ");
            if (C30581Hy.LJJIFFI(Boolean.class)) {
                LIZ3 = String.valueOf(LIZIZ);
            } else {
                LIZ3 = C44877HjN.LIZ(LIZIZ);
            }
            C44847Hit.LIZJ(LIZIZ3, LIZ3, LIZIZ3);
        }
        return LIZIZ.booleanValue();
    }

    public static int LJIIIIZZ() {
        return C00F.LIZ(31744, 40, "fast_import_fps_limit", true);
    }

    public static OSZ LJIIIZ() {
        List LJLJJL = s.LJLJJL((TextUtils.isEmpty("2160*4096") || !new OJD("[0-9]+\\*[0-9]*").matches("2160*4096")) ? "720*1280" : "2160*4096", new String[]{"*"}, 0, 6);
        if (o.LJ(ListProtector.get(LJLJJL, 1), "")) {
            return new OSZ(Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 0))), -1);
        }
        return new OSZ(Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 0))), Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 1))));
    }

    public static float LIZIZ() {
        InterfaceC09240Xw LIZ2 = C09580Ze.LIZJ().LIZ();
        C05060Hu c05060Hu = C05060Hu.LJ;
        Bundle bundle = new Bundle();
        LIZ2.LJIILIIL(new C05060Hu[]{c05060Hu}, bundle);
        return bundle.getFloat(c05060Hu.LIZ);
    }

    public static Boolean LJ() {
        InterfaceC09240Xw LIZ2;
        FastImport4kHighRes50FpsInBenchmarkStrategy fastImport4kHighRes50FpsInBenchmarkStrategy;
        C09580Ze LIZJ = C09580Ze.LIZJ();
        if (LIZJ != null && (LIZ2 = LIZJ.LIZ()) != null && (fastImport4kHighRes50FpsInBenchmarkStrategy = (FastImport4kHighRes50FpsInBenchmarkStrategy) LIZ2.LJIILJJIL(FastImport4kHighRes50FpsInBenchmarkStrategy.class)) != null) {
            return Boolean.valueOf(fastImport4kHighRes50FpsInBenchmarkStrategy.getEnable());
        }
        return null;
    }

    public static Boolean LJFF() {
        InterfaceC09240Xw LIZ2;
        FastImport4kHighRes60FpsInBenchmarkStrategy fastImport4kHighRes60FpsInBenchmarkStrategy;
        C09580Ze LIZJ = C09580Ze.LIZJ();
        if (LIZJ != null && (LIZ2 = LIZJ.LIZ()) != null && (fastImport4kHighRes60FpsInBenchmarkStrategy = (FastImport4kHighRes60FpsInBenchmarkStrategy) LIZ2.LJIILJJIL(FastImport4kHighRes60FpsInBenchmarkStrategy.class)) != null) {
            return Boolean.valueOf(fastImport4kHighRes60FpsInBenchmarkStrategy.getEnable());
        }
        return null;
    }

    public static boolean LJI() {
        Boolean LJ = LJ();
        if (LJ != null) {
            return LJ.booleanValue();
        }
        float LIZIZ = LIZIZ();
        C44662Hfu.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (LIZIZ > SettingsManager.LIZJ("high_res_high40_50_benchmark", 8.9f)) {
            return true;
        }
        return false;
    }

    public static boolean LJII() {
        Boolean LJFF = LJFF();
        if (LJFF != null) {
            return LJFF.booleanValue();
        }
        float LIZIZ = LIZIZ();
        C44663Hfv.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (LIZIZ >= SettingsManager.LIZJ("high_res_high50_60_benchmark", 9.2f)) {
            return true;
        }
        return false;
    }

    public static OSZ LIZ(int i, int i2, int i3, int i4) {
        OSZ LJIIIZ = LJIIIZ();
        if (C19N.LJ("fast_import_not_support_enable", false)) {
            return new OSZ(-3, Boolean.FALSE);
        }
        OSZ osz = new OSZ(Integer.valueOf(i), Integer.valueOf(i2));
        if (((Number) LJIIIZ.getSecond()).intValue() > 0 ? !(((Number) osz.getFirst()).intValue() > ((Number) LJIIIZ.getFirst()).intValue() || ((Number) osz.getSecond()).intValue() > ((Number) LJIIIZ.getSecond()).intValue()) : ((Number) osz.getFirst()).intValue() <= ((Number) LJIIIZ.getFirst()).intValue()) {
            ArrayList arrayList = new ArrayList();
            if (C44982Hl4.LIZ() && ((Boolean) C44675Hg7.LIZ.getValue()).booleanValue()) {
                arrayList.add(new C44680HgC());
                arrayList.add(new C44678HgA());
                arrayList.add(new C44679HgB(Math.max(1081, ((Number) LJIIIZ.getFirst()).intValue())));
            } else {
                arrayList.add(new C44522Hde());
                arrayList.add(new C44521Hdd());
                arrayList.add(new C44661Hft(Math.max(1081, ((Number) LJIIIZ.getFirst()).intValue())));
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OSZ<Boolean, OSZ<Integer, Boolean>> LIZ2 = ((InterfaceC44516HdY) it.next()).LIZ(i, i2, i3, i4);
                    if (LIZ2.getFirst().booleanValue()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("isFastImport by ByteBench or not ByteBench ");
                        LIZ3.append(LIZ2.getSecond());
                        H78.LIZIZ("ByteBench", X1D.LIZIZ(LIZ3));
                        return LIZ2.getSecond();
                    }
                }
            }
            return new OSZ(-1, Boolean.FALSE);
        }
        return new OSZ(-11004, Boolean.FALSE);
    }
}
