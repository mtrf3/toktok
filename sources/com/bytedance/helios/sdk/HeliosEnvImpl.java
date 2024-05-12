package com.bytedance.helios.sdk;

import X.AbstractC65815PsJ;
import X.C0H1;
import X.C0M4;
import X.C16880lQ;
import X.C53655L3z;
import X.C61878OQg;
import X.C64403PPj;
import X.C64409PPp;
import X.C64483PSl;
import X.C65935PuF;
import X.C65985Pv3;
import X.C65986Pv4;
import X.C65998PvG;
import X.C65999PvH;
import X.C66030Pvm;
import X.C66031Pvn;
import X.C66033Pvp;
import X.C66034Pvq;
import X.C66035Pvr;
import X.C66036Pvs;
import X.C66038Pvu;
import X.C66117PxB;
import X.C93G;
import X.EnumC65997PvF;
import X.HandlerThreadC64418PPy;
import X.HandlerThreadC65936PuG;
import X.InterfaceC65981Puz;
import X.InterfaceC66032Pvo;
import X.InterfaceC66041Pvx;
import X.InterfaceC66045Pw1;
import X.InterfaceC66053Pw9;
import X.InterfaceC66086Pwg;
import X.X1D;
import Y.ARunnableS14S0201000_11;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS17S0110000_11;
import Y.IDRunnableS6S0101000;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.bytedance.helios.api.config.SettingsModel;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class HeliosEnvImpl extends C66036Pvs implements InterfaceC66032Pvo {
    public static final String[] LJIILLIIL = {"com.bytedance.helios.apimonitor.ApiMonitorService", "com.bytedance.helios.sdk.appops.AppOpsService", "com.bytedance.helios.binder.impl.BinderService", "com.bytedance.helios.nativeaudio.NativeAudioService", "com.bytedance.helios.storage.offline.StorageOfflineService", "com.bytedance.helios.consumer.DefaultConsumerComponent", "com.bytedance.helios.tools.skyeye.SkyEyeComponent", "com.bytedance.helios.cache.CacheComponent"};
    public static final HeliosEnvImpl LJIIZILJ = new HeliosEnvImpl();
    public InterfaceC66086Pwg LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public volatile boolean LJII;
    public Application LJIIIIZZ;
    public AbstractC65815PsJ LJIIIZ;
    public String LIZJ = "";
    public SettingsModel LJIIJ = new SettingsModel();
    public final List<CheckPoint> LJIIJJI = new LinkedList();
    public final C0M4 LJIIL = new C0M4();
    public InterfaceC66045Pw1 LJIILIIL = null;
    public InterfaceC66041Pvx LJIILJJIL = null;
    public final C0M4 LJIILL = new C0M4();

    public final synchronized void LJIIIIZZ() {
        if (!this.LJFF && this.LJI) {
            this.LJFF = true;
            C66117PxB.LIZ = true;
            C66117PxB.LIZIZ = LJFF();
            String str = this.LJIIJ.engineType;
            o.LJIIIZ(str, "<set-?>");
            C66117PxB.LIZJ = str;
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS15S0101000_11(1, this, 12));
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.postDelayed(new ARunnableS15S0101000_11(0, this, 4), 10000L);
        }
    }

    /* loaded from: classes7.dex */
    public static class CheckPoint {
        public final String message;
        public final String name;
        public final long timestamp;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CheckPoint(name=");
            LIZ.append(this.name);
            LIZ.append(", message=");
            LIZ.append(this.message);
            LIZ.append(", timestamp=");
            return C0H1.LIZJ(LIZ, this.timestamp, ")", LIZ);
        }

        public CheckPoint(String str, String str2) {
            this(str, str2, System.currentTimeMillis());
        }

        public CheckPoint(String str, String str2, long j) {
            this.name = str;
            this.message = str2;
            this.timestamp = j;
        }
    }

    @Override // X.C66036Pvs
    public final String LIZLLL() {
        return this.LJIIJ.engineType;
    }

    @Override // X.C66036Pvs
    public final boolean LJFF() {
        if (this.LJ || this.LJIIJ.testEnvChannels.contains(this.LIZJ)) {
            return true;
        }
        return false;
    }

    @Override // X.C66036Pvs
    public final void LJII() {
        if (this.LJIIIZ != null) {
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new IDRunnableS6S0101000(4, this, 14));
        }
    }

    public final InterfaceC66053Pw9 LJIIIZ() {
        InterfaceC66045Pw1 interfaceC66045Pw1 = this.LJIILIIL;
        if (interfaceC66045Pw1 == null) {
            return null;
        }
        return interfaceC66045Pw1.LIZ();
    }

    public final String LJIIJ() {
        InterfaceC66086Pwg interfaceC66086Pwg = this.LIZIZ;
        if (interfaceC66086Pwg == null) {
            return "";
        }
        return interfaceC66086Pwg.LIZLLL();
    }

    public final boolean LJIIJJI() {
        if (this.LIZLLL || (this.LJI && this.LJIIJ.enabled)) {
            return true;
        }
        return false;
    }

    public HeliosEnvImpl() {
        System.currentTimeMillis();
    }

    public static HeliosEnvImpl get() {
        return LJIIZILJ;
    }

    @Override // X.C66036Pvs
    public final C53655L3z LIZJ(int i) {
        boolean z;
        if (C65986Pv4.LIZ(i) != null) {
            z = true;
        } else {
            z = false;
        }
        return new C53655L3z(i, z, true ^ this.LJIIJ.interceptIgnoreApiIds.contains(Integer.valueOf(i)));
    }

    @Override // X.C66036Pvs
    public final void LJI(Map<String, Object> map) {
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new IDRunnableS6S0101000(2, map, 13));
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel settingsModel) {
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS14S0201000_11(0, this, settingsModel, 4));
    }

    @Override // X.C66036Pvs
    public final void LJ(C66038Pvu c66038Pvu, C66033Pvp c66033Pvp) {
        boolean z;
        if (this.LJII) {
            return;
        }
        this.LJIILIIL = c66038Pvu;
        this.LJII = true;
        this.LJIILJJIL = c66033Pvp;
        C66031Pvn c66031Pvn = c66038Pvu.LIZIZ;
        this.LIZIZ = c66031Pvn;
        Application application = c66031Pvn.LIZIZ.LJLIL;
        this.LJIIIIZZ = application;
        if ((application.getApplicationInfo().flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(application.getPackageManager(), application.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                LLLLLLZ.getLongVersionCode();
            }
        } catch (Exception unused) {
        }
        C65935PuF c65935PuF = c66031Pvn.LIZIZ;
        this.LIZJ = c65935PuF.LJLJJI;
        this.LIZLLL = c65935PuF.LJLJJLL;
        C66031Pvn c66031Pvn2 = c66038Pvu.LIZIZ;
        c66031Pvn2.getClass();
        C66030Pvm c66030Pvm = new C66030Pvm(c66031Pvn2);
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS14S0201000_11(0, this, c66030Pvm, 3));
        C64483PSl c64483PSl = C64483PSl.LIZ;
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJI.setUncaughtExceptionHandler(c64483PSl);
        HandlerThreadC65936PuG.LIZ();
        HandlerThreadC65936PuG.LJLIL.setUncaughtExceptionHandler(c64483PSl);
        c66038Pvu.LIZIZ.getClass();
        C93G.LIZ().post(new ARunnableS17S0110000_11((Object) this, true, 3));
        HeliosEnvImpl heliosEnvImpl = get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        Map<String, List<String>> map = heliosEnvImpl.LJIIJ.signalConfig.composition;
        EnumC65997PvF enumC65997PvF = EnumC65997PvF.CAMERA;
        List<String> list = map.get("video");
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        C65985Pv3.LIZ(enumC65997PvF, list);
        EnumC65997PvF enumC65997PvF2 = EnumC65997PvF.AUDIO;
        List<String> list2 = map.get("audio");
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        C65985Pv3.LIZ(enumC65997PvF2, list2);
        Map<EnumC65997PvF, InterfaceC65981Puz> map2 = C65985Pv3.LIZIZ;
        map2.put(enumC65997PvF, C66035Pvr.LIZIZ);
        map2.put(enumC65997PvF2, C66034Pvq.LIZIZ);
        C64403PPj.LJ(C65999PvH.LIZ);
        C64409PPp.LJI(C65998PvG.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isFirstStart:");
        LIZ.append(this.LIZLLL);
        LIZ.append(",version:");
        LIZ.append(this.LJIIJ.version);
        CheckPoint checkPoint = new CheckPoint("helios init", X1D.LIZIZ(LIZ));
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS14S0201000_11(0, this, checkPoint, 2));
    }
}
