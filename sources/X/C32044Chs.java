package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Chs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32044Chs implements InterfaceC48038ItG, InterfaceC114054dl, JIT, InterfaceC73592SuS {
    public static final C32044Chs LJLIL = new C32044Chs();
    public static final C32044Chs LJLILLLLZI = new C32044Chs();
    public static boolean LJLJI;
    public static int LJLJJI;
    public static int LJLJJL;

    @Override // X.JIT
    public void LIZ(String str) {
    }

    @Override // X.JIT
    public void LIZJ() {
    }

    @Override // X.JIT
    public void LIZLLL() {
    }

    public static boolean LJ() {
        if (LJLJI && LJLJJI > 0 && LJLJJL > 0) {
            return true;
        }
        return false;
    }

    public static int LJII() {
        return (int) KL2.LIZJ(EF7.LIZIZ(), LJLJJL);
    }

    public static int LJIIIIZZ() {
        return (int) KL2.LIZJ(EF7.LIZIZ(), LJLJJI);
    }

    public static void LJFF(long j) {
        C12830et c12830et = C12840eu.LIZ.LIZ.get(j);
        if (c12830et != null) {
            c12830et.LIZ();
        }
    }

    public static C12830et LJI(View view) {
        C12830et c12830et;
        while (view != null) {
            Object tag = view.getTag(R.id.jw0);
            if ((tag instanceof C12830et) && (c12830et = (C12830et) tag) != null) {
                return c12830et;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        TrendingTopicOrAd it = (TrendingTopicOrAd) obj;
        o.LJIIIZ(it, "it");
        return new DiscoverSectionItem.TrendingTopicOrAdSection(it);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        return true;
    }

    @Override // X.InterfaceC114054dl
    public void LIZIZ(String str, java.util.Map map) {
        C188727au c188727au = new C188727au();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                c188727au.LJI(str2, (String) value);
            } else if (value instanceof Long) {
                c188727au.LJ(((Number) value).longValue(), str2);
            } else if (value instanceof Integer) {
                c188727au.LIZLLL(((Number) value).intValue(), str2);
            } else if (value instanceof Double) {
                c188727au.LIZJ(str2, ((Number) value).doubleValue());
            } else if (value instanceof Float) {
                c188727au.LIZIZ(((Number) value).floatValue(), str2);
            } else {
                c188727au.LJFF(value, str2);
            }
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if ("unknownRHA".equalsIgnoreCase(r1) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if ("RHA-N29m".equalsIgnoreCase(r1) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(int r5, int r6, boolean r7) {
        /*
            android.content.Context r1 = X.EF7.LIZIZ()
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "HUAWEI"
            boolean r0 = r2.equalsIgnoreCase(r3)
            r4 = 0
            if (r0 == 0) goto L4e
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "com.huawei.hardware.sensor.posture"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L4e
        L1b:
            X.C32044Chs.LJLJI = r7
            if (r7 == 0) goto L49
            X.C32044Chs.LJLJJI = r5
            X.C32044Chs.LJLJJL = r6
        L23:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "sIsInMultiWindowMode = "
            r1.append(r0)
            boolean r0 = X.C32044Chs.LJLJI
            r1.append(r0)
            java.lang.String r0 = " sScreenWidthDpInMultiWindowMode = "
            r1.append(r0)
            int r0 = X.C32044Chs.LJLJJI
            r1.append(r0)
            java.lang.String r0 = "  sScreenHeightDpInMultiWindowMode = "
            r1.append(r0)
            int r0 = X.C32044Chs.LJLJJL
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            return
        L49:
            X.C32044Chs.LJLJJI = r4
            X.C32044Chs.LJLJJL = r4
            goto L23
        L4e:
            boolean r0 = r2.equalsIgnoreCase(r3)
            if (r0 == 0) goto L77
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "HWTAH "
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "HWTAH-C"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "unknownRLI"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "unknownRHA"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L77
            goto L1b
        L77:
            boolean r0 = r2.equalsIgnoreCase(r3)
            if (r0 == 0) goto Lc1
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "TAH-AN00"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "TAH-N29"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "TAH-AN00m"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "TAH-N29m"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "RLI-AN00"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "RLI-N29"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "RHA-AN00m"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "RHA-N29m"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lc1
            goto L1b
        Lc1:
            X.C32044Chs.LJLJI = r4
            X.C32044Chs.LJLJJI = r4
            X.C32044Chs.LJLJJL = r4
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32044Chs.LJIIJJI(int, int, boolean):void");
    }

    public static void LJIIJ(FragmentManager fragmentManager, InterfaceC32911Qx interfaceC32911Qx, String str, C30923CBr c30923CBr) {
        if (fragmentManager == null || interfaceC32911Qx == null) {
            return;
        }
        long nanoTime = System.nanoTime();
        if (c30923CBr != null) {
            c30923CBr.LIZ(nanoTime);
        }
        LiveSheetHostFragment liveSheetHostFragment = new LiveSheetHostFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.bytedance.android.live.design.view.sheet.FRAGMENT_TAG", str);
        bundle.putLong("com.bytedance.android.live.design.view.sheet.SHEET_TOKEN", nanoTime);
        liveSheetHostFragment.LJLJJL = interfaceC32911Qx;
        liveSheetHostFragment.setArguments(bundle);
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIIIZZ(0, 1, liveSheetHostFragment, String.valueOf(SystemClock.elapsedRealtime()));
        c1b3.LJII();
    }

    public static long LJIIIZ(FragmentManager fragmentManager, Class cls, String str, SheetOptions sheetOptions, Bundle bundle) {
        if (fragmentManager == null || cls == null) {
            return 0L;
        }
        long nanoTime = System.nanoTime();
        LiveSheetHostFragment liveSheetHostFragment = new LiveSheetHostFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("com.bytedance.android.live.design.view.sheet.FRAGMENT_CLASS", C16880lQ.LJLLILLLL(cls));
        bundle2.putString("com.bytedance.android.live.design.view.sheet.FRAGMENT_TAG", str);
        bundle2.putLong("com.bytedance.android.live.design.view.sheet.SHEET_TOKEN", nanoTime);
        bundle2.putParcelable("com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS", sheetOptions);
        bundle2.putBundle("com.bytedance.android.live.design.view.sheet.SHEET_START_ARGS", bundle);
        liveSheetHostFragment.setArguments(bundle2);
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIIIZZ(0, 1, liveSheetHostFragment, String.valueOf(SystemClock.elapsedRealtime()));
        c1b3.LJII();
        return nanoTime;
    }
}
