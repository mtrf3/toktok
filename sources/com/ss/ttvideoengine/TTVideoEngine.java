package com.ss.ttvideoengine;

import X.AbstractC47819Ipj;
import X.C05L;
import X.C146165oS;
import X.C16880lQ;
import X.C36071bH;
import X.C46886Iag;
import X.C46929IbN;
import X.C47069Idd;
import X.C47075Idj;
import X.C47087Idv;
import X.C47088Idw;
import X.C47089Idx;
import X.C47091Idz;
import X.C47092Ie0;
import X.C47102IeA;
import X.C47116IeO;
import X.C47121IeT;
import X.C47147Iet;
import X.C47148Ieu;
import X.C47149Iev;
import X.C47160If6;
import X.C47163If9;
import X.C47164IfA;
import X.C47192Ifc;
import X.C47193Ifd;
import X.C47276Igy;
import X.C47396Iiu;
import X.C47523Ikx;
import X.C47529Il3;
import X.C47533Il7;
import X.C47538IlC;
import X.C47558IlW;
import X.C47559IlX;
import X.C47560IlY;
import X.C47561IlZ;
import X.C47562Ila;
import X.C47566Ile;
import X.C47570Ili;
import X.C47575Iln;
import X.C47578Ilq;
import X.C47619ImV;
import X.C47631Imh;
import X.C47735IoN;
import X.C47736IoO;
import X.C47750Ioc;
import X.C47752Ioe;
import X.C47756Ioi;
import X.C47789IpF;
import X.C47824Ipo;
import X.C47852IqG;
import X.C47856IqK;
import X.C47865IqT;
import X.C47924IrQ;
import X.C47988IsS;
import X.C48433Izd;
import X.C73343SqR;
import X.C77117UOj;
import X.C78253UnR;
import X.C78598Ut0;
import X.C78966Uyw;
import X.EnumC47176IfM;
import X.EnumC47567Ilf;
import X.EnumC48033ItB;
import X.InterfaceC46853Ia9;
import X.InterfaceC46854IaA;
import X.InterfaceC46858IaE;
import X.InterfaceC47042IdC;
import X.InterfaceC47563Ilb;
import X.InterfaceC47616ImS;
import X.InterfaceC47731IoJ;
import X.InterfaceC47787IpD;
import X.InterfaceC47814Ipe;
import X.InterfaceC47884Iqm;
import X.InterfaceC47895Iqx;
import X.InterfaceC47896Iqy;
import X.X1D;
import X.XXB;
import Y.ARunnableS12S0101000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.networkpredictor.AwemeSpeedPredictor;
import com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.texturerender.VideoSurface;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.FileDescriptor;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class TTVideoEngine {
    public static int[] LIZIZ = null;
    public static boolean LIZJ = false;
    public static boolean LIZLLL = false;
    public static int LJ = 0;
    public static int LJFF = 500;
    public static int LJI = 0;
    public static int LJII = 100;
    public static int LJIIIIZZ = 0;
    public static int LJIIIZ = 0;
    public static int LJIIJ = 0;
    public static int LJIIJJI = 0;
    public static int LJIIL = 0;
    public static int LJIILIIL = 0;
    public static int LJIILJJIL = 0;
    public static int LJIILL = 0;
    public static boolean LJIILLIIL = true;
    public static int LJIIZILJ;
    public static final List<InterfaceC47563Ilb> LJIJ = new ArrayList();
    public final TTVideoEngineImpl LIZ;

    public synchronized void LJIIIIZZ() {
        this.LIZ.LLILZIL();
    }

    public synchronized void LJJLIIIJILLIZJL() {
        this.LIZ.LLLIIIL();
    }

    public synchronized void LJJLIIIJJI() {
        this.LIZ.LLLIIL();
    }

    public static float LJJIJIIJI() {
        float f;
        C47529Il3 c47529Il3 = C47147Iet.LIZ;
        if (c47529Il3.LJIIIIZZ(803) != 0) {
            if (c47529Il3.LJIJJLI == 0) {
                f = c47529Il3.LJ().getFloatValue(20401, -1.0f);
            } else {
                c47529Il3.LJJI.lock();
                try {
                    if (!c47529Il3.LJIL && c47529Il3.LJJ > 0.0f) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("speed doesnt need to be updated, update: ");
                        LIZ.append(c47529Il3.LJIL);
                        LIZ.append(", last: ");
                        LIZ.append(c47529Il3.LJJ);
                        TTVideoEngineLog.d("VCStrategy", X1D.LIZIZ(LIZ));
                        f = c47529Il3.LJJ;
                    } else {
                        float floatValue = c47529Il3.LJ().getFloatValue(20401, -1.0f);
                        if (floatValue > 0.0f) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("speed update success, result: ");
                            LIZ2.append(floatValue);
                            TTVideoEngineLog.d("VCStrategy", X1D.LIZIZ(LIZ2));
                            c47529Il3.LJJ = floatValue;
                            c47529Il3.LJIL = false;
                        }
                        f = c47529Il3.LJJ;
                    }
                } finally {
                    c47529Il3.LJJI.unlock();
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" get network speed from vod strategy. info = ");
            LIZ3.append(f);
            C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ3));
            return f;
        }
        ISpeedPredictor iSpeedPredictor = C78966Uyw.LJLJLLL;
        if (iSpeedPredictor == null) {
            return -1.0f;
        }
        float predictSpeed = iSpeedPredictor.getPredictSpeed();
        String format = new DecimalFormat("#.000000000").format(predictSpeed);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("[IESSpeedPredictor] get network speed:");
        LIZ4.append(format);
        TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ4));
        return predictSpeed;
    }

    public static synchronized void LJJLIIIJJIZ() {
        synchronized (TTVideoEngine.class) {
            try {
                C47988IsS.LIZLLL().LJI();
            } catch (NullPointerException unused) {
            }
        }
    }

    public static void LLIIIILZ() {
        C47148Ieu.LIZ.getClass();
    }

    public static void LLIIIZ() {
        C47148Ieu.LIZ.getClass();
    }

    public final void LJFF() {
        this.LIZ.LLILLJJLI();
    }

    public final String LJIILIIL() {
        return this.LIZ.LLJIJIL();
    }

    public final Context LJIILLIIL() {
        return this.LIZ.LIZLLL;
    }

    public final String LJIIZILJ() {
        return this.LIZ.LLJILJIL();
    }

    public final int LJIJ() {
        return this.LIZ.LLJILJILJ();
    }

    public final int LJIJI() {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        int i = tTVideoEngineImpl.LJI;
        if (i == 2 || i == 5 || tTVideoEngineImpl.LIZ(602, tTVideoEngineImpl.z5) <= 0) {
            return tTVideoEngineImpl.LLJILJILJ();
        }
        return tTVideoEngineImpl.y5;
    }

    public final String LJIJJ() {
        return this.LIZ.y1;
    }

    public final EnumC47176IfM LJIJJLI() {
        return this.LIZ.f126n;
    }

    public final int LJIL() {
        return this.LIZ.LJJJLZIJ;
    }

    public final String LJJI() {
        return this.LIZ.T5;
    }

    public final InterfaceC47616ImS LJJIFFI() {
        return this.LIZ.LLZZZZ;
    }

    public final int LJJIII() {
        return this.LIZ.LJIILIIL;
    }

    public final InterfaceC47731IoJ LJJIIJ() {
        return this.LIZ.e;
    }

    public final float LJJIIZ() {
        return this.LIZ.LLJJ();
    }

    public final C47824Ipo LJJIIZI() {
        return this.LIZ.LLJJI();
    }

    public final int LJJIJIIJIL() {
        return this.LIZ.LJIIL;
    }

    public final String LJJIJIL() {
        return this.LIZ.LLJJIII();
    }

    public final Surface LJJIJLIJ() {
        return this.LIZ.LLJJIJIIJIL();
    }

    public final VideoSurface LJJIL() {
        return this.LIZ.O0;
    }

    public final InterfaceC46858IaE LJJIZ() {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        return new C47619ImV(tTVideoEngineImpl);
    }

    public final int LJJJ() {
        return this.LIZ.LIZLLL();
    }

    public final C47164IfA LJJJI() {
        return this.LIZ.LLJJJ();
    }

    public final int LJJJIL() {
        return this.LIZ.LJ();
    }

    public final float LJJJJ() {
        return this.LIZ.LLJJJIL();
    }

    public final int LJJJJI() {
        return this.LIZ.LJFF();
    }

    public final void LJJJJJ() {
        this.LIZ.LLJJJJLIIL();
    }

    public final boolean LJJJJJL() {
        return this.LIZ.LLD;
    }

    public final boolean LJJJJL() {
        return this.LIZ.LJJJJZ;
    }

    public final boolean LJJJJLI() {
        return this.LIZ.LLJL();
    }

    public final boolean LJJJJLL() {
        return this.LIZ.LJJIJIL;
    }

    public final boolean LJJJJZ() {
        return this.LIZ.LJJIIJZLJL;
    }

    public final boolean LJJJJZI() {
        return this.LIZ.LJJIJIIJI;
    }

    public final boolean LJJJLIIL() {
        return this.LIZ.LJJIL();
    }

    public final boolean LJJJLL() {
        return this.LIZ.LLJZIJLIL();
    }

    public final void LJJJLZIJ() {
        this.LIZ.LLLFF();
    }

    public void LJJL() {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause,");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZJ(2);
        } else {
            tTVideoEngineImpl.LJJJI();
        }
    }

    public void LJJLI() {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play:");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (tTVideoEngineImpl.LJIIJJI == 5) {
            C78253UnR.LIZLLL("TTVideoEngine", "already released, return");
            return;
        }
        Iterator it = ((ArrayList) LJIJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC47563Ilb) it.next()).LIZIZ();
        }
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZJ(1);
        } else {
            tTVideoEngineImpl.LJJJIL();
        }
    }

    public final void LJJLIIIIJ() {
        this.LIZ.LLLII();
    }

    public final Bitmap LJJLIIIJL() {
        return this.LIZ.LLLILZLLLI();
    }

    public final void LJJLIIIJLLLLLLLZ() {
        this.LIZ.LLLIZZ();
    }

    public final void LJLI() {
        this.LIZ.k0 = true;
    }

    public final void LLIIII() {
        this.LIZ.LLLLZ();
    }

    public void LLJJJJJIL() {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop:");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        Iterator it = ((ArrayList) LJIJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC47563Ilb) it.next()).LIZ();
        }
        tTVideoEngineImpl.LJJIIJZLJL = false;
        tTVideoEngineImpl.z0 = false;
        tTVideoEngineImpl.Q0 = false;
        tTVideoEngineImpl.LJJJJIZL = false;
        tTVideoEngineImpl.LJJIIZ = true;
        tTVideoEngineImpl.u1 = 0;
        tTVideoEngineImpl.LJLJI.remove(652);
        tTVideoEngineImpl.H = 0;
        tTVideoEngineImpl.LJLJI.remove(24);
        tTVideoEngineImpl.I = 0;
        tTVideoEngineImpl.LJLJI.remove(25);
        tTVideoEngineImpl.m0 = false;
        tTVideoEngineImpl.LJLJI.remove(984);
        tTVideoEngineImpl.n0 = false;
        tTVideoEngineImpl.LJLJI.remove(4022);
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZJ(3);
        } else {
            tTVideoEngineImpl.LJJLIIIJLLLLLLLZ();
        }
    }

    public final boolean LLJJJJLIIL() {
        return this.LIZ.LLZLLIL();
    }

    public final String[] LLJJL() {
        return this.LIZ.LLZLLLL();
    }

    public final void LLJJLIIIJLLLLLLLZ() {
        this.LIZ.LLZZLLIL();
    }

    public static void LIZIZ(C47069Idd c47069Idd) {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        if (c47069Idd != null) {
            if (dataLoaderHelper.LJJIJLIJ != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dataLoaderHelper);
                arrayList.add(c47069Idd);
                dataLoaderHelper.LJJIJLIJ.LIZ(115, arrayList);
                return;
            }
            dataLoaderHelper.LJ(c47069Idd);
            return;
        }
        dataLoaderHelper.getClass();
    }

    public static long LJIILJJIL(String str) {
        return C47148Ieu.LIZ.LJJIII(str);
    }

    public static long LJJLIIIJ(String str) {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        long LJJJJI = dataLoaderHelper.LJJJJI(str);
        if (LJJJJI == 0) {
            return dataLoaderHelper.LJJIII(str);
        }
        return LJJJJI;
    }

    public static void LJJLJ(Map map) {
        HashMap hashMap = (HashMap) map;
        if (hashMap.size() > 0) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setAppInfo:");
                LIZ.append(map.toString());
                TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
                C146165oS.LIZ = C47756Ioi.LJIILL(hashMap.get("appid"));
                C146165oS.LIZIZ = (String) hashMap.get("appname");
                C146165oS.LIZJ = (String) hashMap.get("appchannel");
                C146165oS.LIZLLL = (String) hashMap.get("appversion");
                if (hashMap.containsKey("screen_height")) {
                    C146165oS.LJII = ((Integer) hashMap.get("screen_height")).intValue();
                }
                if (hashMap.containsKey("screen_width")) {
                    C146165oS.LJI = ((Integer) hashMap.get("screen_width")).intValue();
                }
                if (hashMap.containsKey("device_id_secret")) {
                    C146165oS.LJIIIIZZ = (String) hashMap.get("device_id_secret");
                }
                if (hashMap.containsKey("deviceid")) {
                    C146165oS.LJ = (String) hashMap.get("deviceid");
                }
                if (hashMap.containsKey("region")) {
                    C146165oS.LJFF = (String) hashMap.get("region");
                }
                C47147Iet.LIZ.LIZLLL(C146165oS.LJFF(), map);
                C47735IoN c47735IoN = C47538IlC.LIZ;
                c47735IoN.LIZIZ();
                c47735IoN.LJI();
                if (TextUtils.isEmpty(C47752Ioe.LJLIL)) {
                    C47752Ioe.LJLIL = C78966Uyw.LJJII(C146165oS.LJ);
                }
            } catch (Exception e) {
                TTVideoEngineLog.d("TTVideoEngine", e.toString());
            }
        }
    }

    public static void LJLILLLLZI(C47102IeA c47102IeA) {
        C47148Ieu.LIZ.LIZ.LIZ = c47102IeA;
    }

    public static void LJZ(C47523Ikx c47523Ikx) {
        C47147Iet.LIZ.LJIJJ = c47523Ikx;
    }

    public static void LJZL(C47116IeO c47116IeO) {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.LJJ.LIZJ(0);
        try {
            AVMDLDataLoader.getInstance().setEventListener(c47116IeO);
        } finally {
            dataLoaderHelper.LJJ.LJ(0);
        }
    }

    public static void LLIFFJFJJ(C47089Idx c47089Idx) {
        C47578Ilq.LIZ().LIZ.LJ = c47089Idx;
    }

    public static void LLIIIL(C47192Ifc c47192Ifc) {
        C47529Il3 c47529Il3 = C47147Iet.LIZ;
        c47529Il3.LJIILJJIL.lock();
        try {
            if (c47529Il3.LIZJ == null) {
                c47529Il3.LJ().setAppServer(new C47193Ifd(c47529Il3));
            }
            c47529Il3.LIZJ = c47192Ifc;
        } finally {
            c47529Il3.LJIILJJIL.unlock();
        }
    }

    public static void LLIL(C47088Idw c47088Idw) {
        C47529Il3 c47529Il3 = C47147Iet.LIZ;
        c47529Il3.LJIILJJIL.lock();
        try {
            c47529Il3.LIZLLL = c47088Idw;
        } finally {
            c47529Il3.LJIILJJIL.unlock();
        }
    }

    public static void LLILII(C47087Idv c47087Idv) {
        C47147Iet.LIZ.LIZIZ = c47087Idv;
    }

    public static void LLJI(String str) {
        synchronized (C47856IqK.class) {
            if (!TextUtils.isEmpty(str)) {
                C47852IqG.LJI = str;
            }
        }
    }

    public static void LLJJJ(int i) {
        LJIIJ = i;
        if (i == 2) {
            C47148Ieu.LIZ.LJJJ(112, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        } else {
            C47148Ieu.LIZ.LJJJ(112, 0);
        }
    }

    public static void LLJJJIL(Context context) {
        C47736IoO c47736IoO;
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        if (context == null) {
            dataLoaderHelper.getClass();
            TTVideoEngineLog.d("DataLoaderHelper", "set context null");
        } else {
            dataLoaderHelper.LJJ.LIZJ(2);
            try {
                if (dataLoaderHelper.LJIIJJI == null) {
                    C47735IoN c47735IoN = C47538IlC.LIZ;
                    c47735IoN.LJII(context);
                    if (c47735IoN.LIZIZ != null && (c47736IoO = c47735IoN.LIZ) != null) {
                        new PthreadThread(new ARunnableS12S0101000_8(c47736IoO, 37), "SettingsManager").start();
                    }
                }
                dataLoaderHelper.LJIIJJI = context;
                dataLoaderHelper.LJJ.LJ(2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("set context end");
                LIZ.append(context);
                TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ));
            } catch (Throwable th) {
                dataLoaderHelper.LJJ.LJ(2);
                throw th;
            }
        }
        try {
            dataLoaderHelper.LJJJIL();
            TTVideoEngineLog.d("TTVideoEngine", "DataLoader Start");
        } catch (Exception e) {
            TTVideoEngineLog.d("TTVideoEngine", "DataLoader Start Fail");
            throw e;
        }
    }

    public static void LLJJJJ(int i) {
        if (C47147Iet.LIZ.LJIIIIZZ(803) != 0) {
            C78253UnR.LJI("TTVideoEngine", "startIESSpeedPredictor, vod strategy speed predictor");
            return;
        }
        if (C78966Uyw.LJLJLLL != null) {
            return;
        }
        TTVideoEngineLog.d("TTVideoEngine", C16880lQ.LLLZI(Locale.US, "[IESSpeedPredictor] start speed predictor, type:%d", new Object[]{Integer.valueOf(i)}));
        if (i == 1 || i == 0 || i == 2 || i == 3) {
            C78966Uyw.LJLJLLL = new DefaultSpeedPredictor(i);
        } else {
            try {
                AwemeSpeedPredictor awemeSpeedPredictor = new AwemeSpeedPredictor(C78966Uyw.LJLJL);
                C78966Uyw.LJLJLLL = awemeSpeedPredictor;
                awemeSpeedPredictor.setupAlgorithmTypeAndConfig(i, C78966Uyw.LJLJLJ);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (C47147Iet.LIZ.LJIIIIZZ(803) != 0) {
            C78253UnR.LJI("TTVideoEngine", "setPredictorDataLoaderListener, vod strategy speed predictor");
        } else {
            C47148Ieu.LIZ.LIZ.LIZIZ.addIfAbsent(C47559IlX.LIZ);
        }
    }

    public final void LJ(boolean z) {
        this.LIZ.LLILL(z);
    }

    public final void LJII(EnumC47176IfM enumC47176IfM) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("configResolution ");
        LIZ.append(enumC47176IfM);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (enumC47176IfM == null) {
            return;
        }
        tTVideoEngineImpl.LJJIIZI(enumC47176IfM, null);
    }

    public final void LJIIJ(boolean z) {
        this.LIZ.LLJ(z);
    }

    public final float LJJ(int i) {
        return this.LIZ.LLJILLL(i);
    }

    public final int LJJII(int i) {
        return this.LIZ.LJJIJIIJIL(i);
    }

    public final long LJJIIJZLJL(int i) {
        return this.LIZ.LJJIJIL(i);
    }

    public final String LJJIJL(int i) {
        return this.LIZ.LLJJIJI(i);
    }

    public final void LJJJJIZL(boolean z) {
        this.LIZ.LLJJJJ(z);
    }

    public final void LJJJZ(boolean z) {
        this.LIZ.LLLFZ(z);
    }

    public final void LJJLIIJ(C46929IbN c46929IbN) {
        this.LIZ.LLLJ(c46929IbN);
    }

    public final void LJJLL(AudioProcessor audioProcessor) {
        this.LIZ.LLLJL(audioProcessor);
    }

    public final void LJJZZI(int i) {
        this.LIZ.LLLLII(i);
    }

    public final void LJLIL(String str) {
        this.LIZ.LLLLIL(str);
    }

    public final void LJLJI(InterfaceC47884Iqm interfaceC47884Iqm) {
        this.LIZ.LLZIL = interfaceC47884Iqm;
    }

    public final void LJLJJL(String str) {
        this.LIZ.LLLLILI(str);
    }

    public final void LJLJJLL(String str) {
        this.LIZ.LLLLJ(str);
    }

    public final void LJLJLJ(Bundle bundle) {
        this.LIZ.LLLLLILLIL(bundle);
    }

    public final void LJLJLLL(String str) {
        this.LIZ.LLLLLJIL(str);
    }

    public final void LJLLL(String str) {
        this.LIZ.LLLLLL(str);
    }

    public final void LJLZ(boolean z) {
        this.LIZ.LLLLLLIL(z);
    }

    public final void LJZI(InterfaceC47814Ipe interfaceC47814Ipe) {
        this.LIZ.LLLLLLJ(interfaceC47814Ipe);
    }

    public final void LL(String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(18, 0, 0, str);
        } else {
            tTVideoEngineImpl.LJJJLL(str);
        }
    }

    public final void LLFII(boolean z) {
        this.LIZ.LLLLLLLZIL(z);
    }

    public final void LLFZ(InterfaceC47895Iqx interfaceC47895Iqx) {
        this.LIZ.LLLLLLZ(interfaceC47895Iqx);
    }

    public final void LLI(AbstractC47819Ipj abstractC47819Ipj) {
        this.LIZ.LLZ = abstractC47819Ipj;
    }

    public void LLIIIJ(C46886Iag c46886Iag) {
        this.LIZ.LLLLZIL(c46886Iag);
    }

    public final void LLIIZ(int i) {
        this.LIZ.LLLZ(i);
    }

    public final void LLILIL(InterfaceC47042IdC interfaceC47042IdC) {
        this.LIZ.LLZL.LJLJJI = interfaceC47042IdC;
    }

    public final void LLILLJJLI(C47631Imh c47631Imh) {
        this.LIZ.LLLZI(c47631Imh);
    }

    public final void LLILLL(C36071bH c36071bH) {
        this.LIZ.LLLZIIL(c36071bH);
    }

    public void LLILZ(String str) {
        this.LIZ.LJJ(str);
    }

    public void LLILZIL(Surface surface) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setsurface = ");
        LIZ.append(surface);
        LIZ.append(", pre-surface:");
        LIZ.append(tTVideoEngineImpl.LJIIIIZZ);
        LIZ.append(",this:");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (surface == null) {
            tTVideoEngineImpl.e2 = System.currentTimeMillis();
        }
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(54, 0, 0, surface);
        } else {
            tTVideoEngineImpl.LJJLIIIJILLIZJL(surface);
        }
    }

    public void LLILZLL(SurfaceHolder surfaceHolder) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurfaceHolder = ");
        LIZ.append(surfaceHolder);
        LIZ.append(", this:");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (surfaceHolder == null) {
            tTVideoEngineImpl.e2 = System.currentTimeMillis();
        }
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(55, 0, 0, surfaceHolder);
        } else {
            tTVideoEngineImpl.LJJLIIIJJI(surfaceHolder, false);
        }
    }

    public final void LLIZ(SurfaceHolder surfaceHolder) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurfaceHolderSync = ");
        LIZ.append(surfaceHolder);
        LIZ.append(", this:");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (surfaceHolder == null) {
            tTVideoEngineImpl.e2 = System.currentTimeMillis();
        }
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            if (!tTVideoEngineImpl.b5.LJII(tTVideoEngineImpl.LIZ(950, (int) tTVideoEngineImpl.V5), surfaceHolder, 55) && surfaceHolder != null) {
                tTVideoEngineImpl.f2 = 1;
                return;
            }
            return;
        }
        tTVideoEngineImpl.LJJLIIIJJI(surfaceHolder, false);
    }

    public final void LLJ(Surface surface) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurfaceSync = ");
        LIZ.append(surface);
        LIZ.append(",this:");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        tTVideoEngineImpl.LLFII(surface, tTVideoEngineImpl.LIZ(950, (int) tTVideoEngineImpl.V5), false);
    }

    public void LLJIJIL(String str) {
        this.LIZ.LJJI(str);
    }

    public final void LLJILJIL(String str) {
        this.LIZ.LLLZLZ(str);
    }

    public final void LLJILJILJ(int[] iArr) {
        this.LIZ.LLLZZ(iArr);
    }

    public final void LLJILLL(C47276Igy c47276Igy) {
        this.LIZ.LLLZZIL(c47276Igy);
    }

    public void LLJJ(InterfaceC47787IpD interfaceC47787IpD) {
        this.LIZ.LLZ(interfaceC47787IpD);
    }

    public void LLJJI(InterfaceC46853Ia9 interfaceC46853Ia9) {
        this.LIZ.LLZLLLL = interfaceC46853Ia9;
    }

    public final void LLJJIII(C47575Iln c47575Iln) {
        this.LIZ.LLZ(c47575Iln);
    }

    public void LLJJIJI(InterfaceC46854IaA interfaceC46854IaA) {
        this.LIZ.LLZIL(interfaceC46854IaA);
    }

    public final void LLJJIJIIJIL(C47164IfA c47164IfA) {
        C73343SqR.LIZIZ();
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        if (c47164IfA == null) {
            tTVideoEngineImpl.getClass();
        } else if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(16, 0, 0, c47164IfA);
        } else {
            tTVideoEngineImpl.LJJLIIIJLJLI(c47164IfA);
        }
    }

    public TTVideoEngine(Context context, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, type:");
        LIZ.append(i);
        LIZ.append(", this:");
        LIZ.append(this);
        LIZ.append(", version:");
        LIZ.append("1.10.149.1-mt");
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        this.LIZ = new TTVideoEngineImpl(context, i, null, this);
    }

    public static void LIZ(String str, List list) {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.getClass();
        if (list == null) {
            return;
        }
        if (str == null) {
            str = C47091Idz.LIZ.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[preload] add preload  mediaList ,size = ");
        LIZ.append(list.size());
        LIZ.append("sceneId = ");
        LIZ.append(str);
        C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ));
        for (int i = 0; i < list.size(); i++) {
            C47075Idj c47075Idj = (C47075Idj) ListProtector.get(list, i);
            c47075Idj.LIZIZ = str;
            if (!(c47075Idj instanceof C47092Ie0) && (c47075Idj instanceof C47069Idd)) {
                if (i == list.size() - 1) {
                    ((C47069Idd) c47075Idj).LJIIZILJ = true;
                }
                C47069Idd c47069Idd = (C47069Idd) c47075Idj;
                InterfaceC47616ImS interfaceC47616ImS = c47069Idd.LIZLLL;
                if (interfaceC47616ImS == null || c47069Idd.LJ == null) {
                    C78253UnR.LIZLLL("DataLoaderHelper", "[preload] addTask videoModel input invalid");
                    if (c47069Idd.LIZJ != null) {
                        C47121IeT c47121IeT = new C47121IeT(3);
                        c47121IeT.LIZJ = new C47789IpF("kTTVideoErrorDomainDataLoaderPreload", -100001);
                        c47069Idd.LIZJ.LIZ(c47121IeT);
                    }
                } else if (TextUtils.isEmpty(interfaceC47616ImS.LJJI(2))) {
                    C78253UnR.LIZLLL("DataLoaderHelper", "[preload] videoId invalid.");
                    if (c47069Idd.LIZJ != null) {
                        C47121IeT c47121IeT2 = new C47121IeT(3);
                        c47121IeT2.LIZJ = new C47789IpF("kTTVideoErrorDomainDataLoaderPreload", -100001);
                        c47069Idd.LIZJ.LIZ(c47121IeT2);
                    }
                } else {
                    String str2 = c47069Idd.LIZIZ;
                    if (dataLoaderHelper.LJJIJLIJ != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(dataLoaderHelper);
                        arrayList.add(c47069Idd);
                        arrayList.add(str2);
                        dataLoaderHelper.LJJIJLIJ.LIZ(111, arrayList);
                    } else {
                        dataLoaderHelper.LIZLLL(c47069Idd, str2);
                    }
                }
            }
        }
    }

    public static C47160If6 LJIIL(InterfaceC47616ImS interfaceC47616ImS, int i) {
        C47160If6 c47160If6 = null;
        if (interfaceC47616ImS != null) {
            boolean z = true;
            if (i != 0 && i != 1) {
                z = false;
            }
            List<C47160If6> LIZLLL2 = interfaceC47616ImS.LIZLLL();
            if (LIZLLL2 != null && !LIZLLL2.isEmpty()) {
                long j = 0;
                for (C47160If6 c47160If62 : LIZLLL2) {
                    if (!z || c47160If62.LIZ() == i) {
                        long LJJIII = C47148Ieu.LIZ.LJJIII(c47160If62.LIZIZ(15));
                        if (LJJIII > j) {
                            c47160If6 = c47160If62;
                            j = LJJIII;
                        }
                    }
                }
            }
        }
        return c47160If6;
    }

    public static long LJIILL(InterfaceC47616ImS interfaceC47616ImS, EnumC47176IfM enumC47176IfM) {
        long j = 0;
        if (interfaceC47616ImS == null || enumC47176IfM == null) {
            return 0L;
        }
        C47160If6 LJIILLIIL2 = interfaceC47616ImS.LJIILLIIL(enumC47176IfM, 0, null, false);
        if (LJIILLIIL2 != null) {
            j = 0 + C47148Ieu.LIZ.LJJIII(LJIILLIIL2.LIZIZ(15));
        }
        C47160If6 LJIILLIIL3 = interfaceC47616ImS.LJIILLIIL(enumC47176IfM, 1, null, true);
        if (LJIILLIIL3 != null) {
            return j + C47148Ieu.LIZ.LJJIII(LJIILLIIL3.LIZIZ(15));
        }
        return j;
    }

    public static void LJJLIL(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[strategy] setAlgorithmJson key=");
        LIZ.append(i);
        LIZ.append(" jsonString");
        LIZ.append(str);
        TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
        C47147Iet.LIZ.LJIIL(i, str);
    }

    public static void LJLLJ(int i, float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTVideoEngine.setFloatValue key=");
        LIZ.append(i);
        LIZ.append(" value=");
        LIZ.append(f);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (i != 738) {
            if (i != 739) {
                return;
            }
            C47147Iet.LIZ.LJ().businessEvent(1004, Float.toString(f));
            return;
        }
        if (f == Float.NaN || f <= 0.0f) {
            return;
        }
        C47533Il7.LIZ.LIZ(Float.valueOf(f), "device_score");
        C47148Ieu.LIZ.LJJJ(123, (int) (f * 10.0f));
    }

    public static void LJLLLLLL(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTVideoEngine.setIntValue key=");
        LIZ.append(i);
        LIZ.append(" value=");
        LIZ.append(i2);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (i == 672) {
            C05L.LJFF("do set static render type, value = ", i2, "TTVideoEngine");
            C47149Iev.LIZ.LIZ = i2;
            return;
        }
        if (i == 674) {
            C78253UnR.LJI("TTVideoEngine", "enable https for fetch");
            C77117UOj.LJLIL = i2;
            return;
        }
        boolean z = true;
        if (i == 112) {
            if (i2 > 0) {
                LJIIJ = 2;
                C47148Ieu.LIZ.LJJJ(112, i2);
                return;
            } else {
                LJIIJ = 1;
                C47148Ieu.LIZ.LJJJ(112, 0);
                return;
            }
        }
        if (i == 676) {
            ISpeedPredictor iSpeedPredictor = C78966Uyw.LJLJLLL;
            if (iSpeedPredictor != null) {
                iSpeedPredictor.setSpeedQueueSize(i2);
            }
            C47147Iet.LIZ.LJ().businessEvent(1002, i2);
            return;
        }
        if (i == 702) {
            C47149Iev.LIZ.LIZIZ = i2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("set log level:");
            LIZ2.append(i2);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ2));
            return;
        }
        if (i == 1501) {
            C47149Iev.LIZ.LIZJ = i2;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("set log level percise:");
            LIZ3.append(i2);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ3));
            return;
        }
        if (i == 684) {
            return;
        }
        if (i == 960) {
            LJIIJJI = i2;
            C48433Izd.LJJII(1015, i2);
            return;
        }
        if (i == 961) {
            LJIIL = i2;
            C48433Izd.LJJII(1016, i2);
            return;
        }
        if (i == 689) {
            C05L.LJFF("do set static enable cpp opt bvc1, value = ", i2, "TTVideoEngine");
            C47149Iev.LIZ.LJ = i2;
            return;
        }
        if (i == 719) {
            C47149Iev.LIZ.LJFF = i2;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("enable bmf");
            LIZ4.append(i2);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ4));
            return;
        }
        if (i == 720) {
            C47149Iev.LIZ.LJI = i2;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("set use realbitrate:");
            LIZ5.append(i2);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ5));
            return;
        }
        if (i == 737) {
            C47149Iev.LIZ.LJII = i2;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("set lazy load videodec:");
            LIZ6.append(i2);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ6));
            return;
        }
        if (i == 750) {
            LJIILIIL = i2;
            return;
        }
        if (i == 749) {
            LJIILJJIL = i2;
            return;
        }
        if (i == 964) {
            LJIILL = i2;
            return;
        }
        if (i == 34) {
            C47149Iev.LIZ.LJIIIIZZ = i2;
            C47148Ieu.LIZ.LJJJ(i, i2);
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("set enablePcdnAuto:");
            LIZ7.append(i2);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ7));
            return;
        }
        if (i == 4027) {
            C47149Iev.LIZ.LJIIJ = i2;
            return;
        }
        if (i == 4026) {
            C47149Iev.LIZ.LJIIJJI = i2;
            return;
        }
        if (i == 4028) {
            C47149Iev.LIZ.LJIIL = i2;
            return;
        }
        if (i == 966) {
            if (i2 <= 0) {
                z = false;
            }
            EngineThreadPool.setOptimizeLock(z);
            return;
        }
        if (i == 967) {
            if (i2 <= 0) {
                z = false;
            }
            EngineThreadPool.setOptimizeEnabled(z);
            return;
        }
        if (i == 969) {
            if (i2 != 1) {
                z = false;
            }
            LJIILLIIL = z;
            return;
        }
        if (i == 751) {
            C47149Iev.LIZ.LJIILIIL = i2;
            C47148Ieu.LIZ.LJJ.LJFF(i2);
            return;
        }
        if (i == 752) {
            C47149Iev.LIZ.LJIILJJIL = i2;
            return;
        }
        if (i == 971) {
            if (i2 != 1) {
                z = false;
            }
            C47924IrQ.LJI = z;
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("TTVideoEngine.sCpuRefreshFix key=");
            LIZ8.append(z);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ8));
            return;
        }
        if (i == 972) {
            if (i2 != 1) {
                z = false;
            }
            C47924IrQ.LJII = z;
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("TTVideoEngine.sUseNativeThread key=");
            LIZ9.append(z);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ9));
            return;
        }
        if (i == 973) {
            LJIIZILJ = i2;
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append("TTVideoEngine.sBuryDataOptimizeV2:");
            LIZ10.append(i2);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ10));
            return;
        }
        C47148Ieu.LIZ.LJJJ(i, i2);
        if (i != 120) {
            if (i == 121) {
                C78598Ut0.LJLILLLLZI = i2;
            }
        } else {
            C78598Ut0.LJLIL = i2;
        }
        C47529Il3 c47529Il3 = C47147Iet.LIZ;
        c47529Il3.getClass();
        if (i <= 50000 || i >= 60000) {
            return;
        }
        if (i >= 58000 && i <= 58999 && i == 58001) {
            c47529Il3.LJIJJLI = i2;
        }
        if (c47529Il3.LJ().isLoadLibrarySucceed()) {
            c47529Il3.LJ().setIntValue(i, i2);
            return;
        }
        ((ConcurrentHashMap) c47529Il3.LJIJ).put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void LLFFF(int i, long j) {
        int i2;
        boolean z;
        if (i == 217) {
            C47149Iev.LIZ.LIZLLL = j;
            return;
        }
        if (i == 745) {
            C47149Iev.LIZ.LJIIIZ = j;
            return;
        }
        boolean z2 = false;
        if (i == 4300) {
            C47558IlW c47558IlW = C47149Iev.LIZ;
            long[] jArr = c47558IlW.LJIILL;
            if (jArr[0] != j) {
                z = true;
            } else {
                z = false;
            }
            jArr[0] = j;
            if (!z) {
                return;
            }
            c47558IlW.LJIILLIIL = true;
            return;
        }
        if (i == 4301) {
            C47558IlW c47558IlW2 = C47149Iev.LIZ;
            long[] jArr2 = c47558IlW2.LJIILL;
            if (jArr2[1] != j) {
                z2 = true;
            }
            jArr2[1] = j;
            if (!z2) {
                return;
            }
            c47558IlW2.LJIILLIIL = true;
            return;
        }
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.LJJ.LIZJ(1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLongValue key = ");
        LIZ.append(i);
        LIZ.append(", value = ");
        LIZ.append(j);
        TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ));
        try {
            try {
                if (i != 62) {
                    if (i != 1142) {
                        if (i != 1144) {
                            if (i != 1152) {
                                if (i == 1153) {
                                    dataLoaderHelper.LJIIJ.mMonitorMinAllowLoadSize = j;
                                } else {
                                    switch (i) {
                                        case 22:
                                            i2 = 7210;
                                            break;
                                        case 23:
                                            i2 = 7211;
                                            break;
                                        case 24:
                                            i2 = 7212;
                                            break;
                                        case 25:
                                            i2 = 7213;
                                            break;
                                        case 26:
                                            i2 = 7214;
                                            break;
                                        case 27:
                                            i2 = 7215;
                                            break;
                                        case 28:
                                            i2 = 7338;
                                            break;
                                    }
                                }
                            } else {
                                dataLoaderHelper.LJIIJ.mMonitorTimeInternal = j;
                            }
                        } else {
                            dataLoaderHelper.LJIIJ.mConnectPoolStragetyValue = j;
                        }
                    } else {
                        dataLoaderHelper.LJIIJ.mP2PStragetyLevel = j;
                    }
                    i2 = -1;
                } else {
                    i2 = 1100;
                }
                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
                if (aVMDLDataLoader != null) {
                    aVMDLDataLoader.setLongValue(i2, j);
                }
            } catch (Exception unused) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setLongValue failed, key: ");
                LIZ2.append(i);
                LIZ2.append(", value: ");
                LIZ2.append(j);
                C78253UnR.LIZLLL("DataLoaderHelper", X1D.LIZIZ(LIZ2));
            }
        } finally {
            dataLoaderHelper.LJJ.LJ(1);
        }
    }

    public static void LLIIJLIL(Context context, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setReportLogByEngine ");
        LIZ.append(z);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (context == null) {
            C78253UnR.LIZLLL("TTVideoEngine", "setReportLogByEngine context is null");
            return;
        }
        C47570Ili c47570Ili = C47562Ila.LIZ;
        c47570Ili.LIZ = C16880lQ.LLLLL(context);
        if (z) {
            C47148Ieu.LIZ.LJJIZ(c47570Ili);
            EnumC47567Ilf.instance.setEngineUploader(c47570Ili);
        } else {
            DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
            synchronized (dataLoaderHelper) {
                dataLoaderHelper.LJIILL = null;
            }
            EnumC47567Ilf.instance.setEngineUploader(null);
        }
    }

    public static void LLILLIZIL(int i, String str) {
        if (i > 50000 && i < 60000) {
            C47529Il3 c47529Il3 = C47147Iet.LIZ;
            c47529Il3.getClass();
            if (c47529Il3.LJ().isLoadLibrarySucceed()) {
                c47529Il3.LJ().setStringValue(i, str);
            } else {
                ((ConcurrentHashMap) c47529Il3.LJIJI).put(Integer.valueOf(i), str);
            }
        }
        C47538IlC.LIZ.getClass();
        switch (i) {
            case 116:
                C47566Ile.LIZJ = str;
                break;
            case 117:
                C47566Ile.LIZIZ = str;
                break;
            case 118:
                C47566Ile.LIZ = str;
                break;
        }
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setStringValue key = ");
        LIZ.append(i);
        LIZ.append(", value = ");
        LIZ.append(str);
        TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ));
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            try {
                switch (i) {
                    case 0:
                        dataLoaderHelper.LJIIJ.mCacheDir = str;
                        break;
                    case 102:
                        dataLoaderHelper.LJIIJ.mNetCacheDir = str;
                        break;
                    case 107:
                        AVMDLDNSParser.setStringValue(8, str);
                        break;
                    case 108:
                        AVMDLDNSParser.setStringValue(9, str);
                        break;
                    case 111:
                        dataLoaderHelper.LJIIJ.mDownloadDir = str;
                        break;
                    case 514:
                        dataLoaderHelper.LJIIJ.mLiveContainerString = str;
                        break;
                    case 1106:
                        dataLoaderHelper.LJIIJ.mVdpABTestId = str;
                        break;
                    case 1107:
                        dataLoaderHelper.LJIIJ.mVdpGroupId = str;
                        break;
                    case 1149:
                        dataLoaderHelper.LJIIJ.mNetSchedulerConfigStr = str;
                        break;
                    case 1165:
                        dataLoaderHelper.LJIIJ.mDynamicPreconnectConfigStr = str;
                        break;
                    case 1173:
                        dataLoaderHelper.LJIIJ.mSpeedEngineSetting = str;
                        break;
                    case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                        dataLoaderHelper.LJIIJ.mMdlExtensionOptsStr = str;
                        break;
                    case 1502:
                        dataLoaderHelper.LJIIJ.mTemporaryOptStr = str;
                        break;
                    case 1506:
                    case 1507:
                    case 1508:
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.isEmpty(dataLoaderHelper.LJIIJ.mCustomUA)) {
                                dataLoaderHelper.LJIIJ.mCustomUA = str;
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = dataLoaderHelper.LJIIJ;
                                LIZ2.append(aVMDLDataLoaderConfigure.mCustomUA);
                                LIZ2.append(",");
                                LIZ2.append(str);
                                aVMDLDataLoaderConfigure.mCustomUA = X1D.LIZIZ(LIZ2);
                            }
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("cur custom UA");
                        LIZ3.append(dataLoaderHelper.LJIIJ.mCustomUA);
                        TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ3));
                        break;
                    case 1510:
                        dataLoaderHelper.LJIIJ.mFileRingBufferOptStr = str;
                        break;
                    case 1511:
                        dataLoaderHelper.LJIIJ.mN80OptsStr = str;
                        break;
                    case 1512:
                        dataLoaderHelper.LJIIJ.mMdlTTQuicHeOptsStr = str;
                        break;
                    case 2007:
                        dataLoaderHelper.LJIIJ.mStoStrategyConfig = str;
                        break;
                    case 2029:
                        dataLoaderHelper.LJIIJ.mPrecisePreloadConfigStr = str;
                        break;
                    case 2101:
                        dataLoaderHelper.LJIIJ.mVdpExtGlobalInfo = str;
                        break;
                    case 9002:
                        dataLoaderHelper.LJIIJ.mSettingsDomain = str;
                        break;
                    case 9003:
                        dataLoaderHelper.LJIIJ.mDmDomain = str;
                        break;
                    case 9004:
                        dataLoaderHelper.LJIIJ.mForesightDomain = str;
                        break;
                    case 9005:
                        dataLoaderHelper.LJIIJ.mDomains = str;
                        break;
                    case 9006:
                        dataLoaderHelper.LJIIJ.mKeyDomain = str;
                        break;
                    case 9007:
                        dataLoaderHelper.LJIIJ.mKeyToken = str;
                        break;
                    case 9010:
                        dataLoaderHelper.LJIIJ.mSocketTraingCenterConfigStr = str;
                        break;
                    case 9012:
                        dataLoaderHelper.LJIIJ.mP2PConfigStr = str;
                        break;
                    case 9020:
                        for (String str2 : str.split(",")) {
                            if (!TextUtils.isEmpty(str2)) {
                                dataLoaderHelper.LJJJZ.add(Integer.valueOf(Integer.parseInt(str2)));
                            }
                        }
                        break;
                    case 12003:
                        dataLoaderHelper.LJIIJ.mFileKeyRule = str;
                        break;
                }
            } catch (Exception e) {
                TTVideoEngineLog.d(e);
            }
            dataLoaderHelper.LJJ.LJ(1);
            if (i == 122) {
                C47561IlZ c47561IlZ = C47560IlY.LIZ;
                c47561IlZ.LIZ = str;
                C47529Il3 c47529Il32 = C47147Iet.LIZ;
                if (c47529Il32.LJII()) {
                    c47529Il32.LJ().businessEvent(31207, c47561IlZ.LIZ);
                }
            }
        } catch (Throwable th) {
            dataLoaderHelper.LJJ.LJ(1);
            throw th;
        }
    }

    public final void LJI(EnumC47176IfM enumC47176IfM, Map<Integer, String> map) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("configParams res:");
        LIZ.append(enumC47176IfM);
        LIZ.append(", params:");
        LIZ.append(map);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        if (enumC47176IfM == null) {
            return;
        }
        tTVideoEngineImpl.LJJIIZI(enumC47176IfM, map);
    }

    public final ArrayList<HashMap<String, Object>> LJIIIZ(ArrayList<TTVideoEngine> arrayList, HashMap<String, C47865IqT> hashMap) {
        return this.LIZ.LLILZLL(arrayList, hashMap);
    }

    public void LJJLIIIJLJLI(int i, InterfaceC47896Iqy interfaceC47896Iqy) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seek to time:");
        LIZ.append(i);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        tTVideoEngineImpl.LJJJJLI = interfaceC47896Iqy;
        if (tTVideoEngineImpl.LJ != null && tTVideoEngineImpl.LJJIJIIJI) {
            tTVideoEngineImpl.LLIIIZ(i, false);
        }
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(7, i, 0, null);
        } else {
            tTVideoEngineImpl.LJZI(i, false);
        }
    }

    public final void LJJLJLI(int i, boolean z) {
        this.LIZ.LLLJIL(i, z);
    }

    public final void LJJZ(int i, int i2) {
        this.LIZ.LLLL(i, i2);
    }

    public final void LJJZZIII(String str, String str2) {
        this.LIZ.LLLLIIIILLL(str, str2);
    }

    public final void LJL(int i, int i2) {
        this.LIZ.LLLLIIL(i, i2);
    }

    public final void LJLIIIL(String str, String str2) {
        this.LIZ.LLLLIILL(str, str2);
    }

    public final void LJLIIL(EnumC48033ItB enumC48033ItB, Object obj) {
        this.LIZ.LLLLIILLL(enumC48033ItB, obj);
    }

    public final void LJLJL(String str, String str2) {
        C73343SqR.LIZIZ();
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str3 = tTVideoEngineImpl.LLLZZ;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        tTVideoEngineImpl.LLLLL(str2, str3, new String[]{str});
    }

    public final void LJLL(XXB xxb, String str) {
        this.LIZ.getClass();
    }

    public final void LJLLI(Surface surface, int i) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        synchronized (tTVideoEngineImpl.LLZZLLIL) {
            tTVideoEngineImpl.LLZZLLIL.offer(new Pair<>(surface, Integer.valueOf(i)));
            tTVideoEngineImpl.LLF();
        }
    }

    public void LJLLILLLL(float f, int i) {
        this.LIZ.LLLLLJLJLL(f, i);
    }

    public void LJLLLL(int i, int i2) {
        this.LIZ.LJIJI(i, i2);
    }

    public final void LLD(int i, int i2) {
        this.LIZ.LLLLLLL(i, i2);
    }

    public final void LLF(int i, long j) {
        this.LIZ.LLLLLLLLL(i, j);
    }

    public void LLFF(int i, long j) {
        this.LIZ.LLLLLLLLLL(i, j);
    }

    public final void LLII(int i, String str) {
        C73343SqR.LIZIZ();
        this.LIZ.LLLLLZL(i, str);
    }

    public final void LLIIJI(int i, boolean z) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.LLJLL = z ? 1 : 0;
        tTVideoEngineImpl.LLJLLIL = i;
    }

    public final void LLIILII(int i, String str) {
        this.LIZ.LLLLZLLIL(i, str);
    }

    public final void LLIILZL(int i, int i2) {
        this.LIZ.LLLLZLLLI(1440, 1440);
    }

    public void LLILL(int i, String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(108, i, 0, str);
        } else {
            tTVideoEngineImpl.LJJLIIIIJ(i, str);
        }
    }

    public final void LLIZLLLIL(long j, Surface surface) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurfaceSync = ");
        LIZ.append(surface);
        LIZ.append(",timeout:");
        LIZ.append(j);
        LIZ.append("this:");
        LIZ.append(tTVideoEngineImpl);
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        tTVideoEngineImpl.LLFII(surface, j, true);
    }

    public void LLJJIJIL(float f, float f2) {
        this.LIZ.LLZILL(f, f2);
    }

    public TTVideoEngine(Context context, int i, Map map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init2, type:");
        LIZ.append(i);
        LIZ.append(", this:");
        LIZ.append(this);
        LIZ.append(", version:");
        LIZ.append("1.10.149.1-mt");
        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ));
        this.LIZ = new TTVideoEngineImpl(context, i, map, this);
    }

    public static EnumC47176IfM LJIIJJI(InterfaceC47616ImS interfaceC47616ImS, EnumC47176IfM enumC47176IfM, int i) {
        C47163If9 c47163If9;
        int abs;
        int i2 = 0;
        if (interfaceC47616ImS != null && enumC47176IfM != null) {
            int length = EnumC47176IfM.getAllResolutions().length;
            EnumC47176IfM[] LJJIIJ = interfaceC47616ImS.LJJIIJ();
            if (LJJIIJ != null && LJJIIJ.length != 0) {
                int length2 = LJJIIJ.length;
                EnumC47176IfM enumC47176IfM2 = enumC47176IfM;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        EnumC47176IfM enumC47176IfM3 = LJJIIJ[i3];
                        if (enumC47176IfM3 != null && (abs = Math.abs(enumC47176IfM3.ordinal() - enumC47176IfM.ordinal())) < length) {
                            if (abs == 0) {
                                enumC47176IfM = enumC47176IfM3;
                                break;
                            }
                            enumC47176IfM2 = enumC47176IfM3;
                            length = abs;
                        }
                        i3++;
                    } else {
                        enumC47176IfM = enumC47176IfM2;
                        break;
                    }
                }
            }
        } else {
            enumC47176IfM = EnumC47176IfM.Standard;
        }
        long j = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return enumC47176IfM;
                    }
                    if (interfaceC47616ImS == null || enumC47176IfM == null) {
                        return EnumC47176IfM.Standard;
                    }
                    if ((interfaceC47616ImS instanceof C47164IfA) && (c47163If9 = ((C47164IfA) interfaceC47616ImS).LIZJ) != null && !TextUtils.isEmpty("{\"select_resolution\":[\"net_target_bitrate\"]}")) {
                        c47163If9.LJJLIIIJL = "{\"select_resolution\":[\"net_target_bitrate\"]}";
                    }
                    List<C47160If6> LIZLLL2 = interfaceC47616ImS.LIZLLL();
                    if (LIZLLL2 == null || LIZLLL2.size() == 0) {
                        return enumC47176IfM;
                    }
                    C47578Ilq.LIZ().getClass();
                    double d = C47578Ilq.LIZJ;
                    if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        return enumC47176IfM;
                    }
                    double d2 = 3.4028234663852886E38d;
                    for (C47160If6 c47160If6 : LIZLLL2) {
                        if (c47160If6 != null) {
                            double d3 = c47160If6.LJIILL;
                            if (d3 <= d) {
                                double d4 = d - d3;
                                if (d4 < d2) {
                                    enumC47176IfM = c47160If6.getResolution();
                                    d2 = d4;
                                }
                            }
                        }
                    }
                    return enumC47176IfM;
                }
                ISpeedPredictor iSpeedPredictor = C78966Uyw.LJLJLLL;
                if (iSpeedPredictor == null) {
                    return enumC47176IfM;
                }
                iSpeedPredictor.getPredictSpeed();
                return enumC47176IfM;
            }
            if (interfaceC47616ImS != null && enumC47176IfM != null) {
                EnumC47176IfM[] LJJIIJ2 = interfaceC47616ImS.LJJIIJ();
                if (LJJIIJ2 == null || LJJIIJ2.length == 0) {
                    return enumC47176IfM;
                }
                int length3 = LJJIIJ2.length;
                while (i2 < length3) {
                    EnumC47176IfM enumC47176IfM4 = LJJIIJ2[i2];
                    if (LJIILL(interfaceC47616ImS, enumC47176IfM4) > 0 && enumC47176IfM4.ordinal() > enumC47176IfM.ordinal()) {
                        enumC47176IfM = enumC47176IfM4;
                    }
                    i2++;
                }
                return enumC47176IfM;
            }
            return EnumC47176IfM.Standard;
        }
        if (interfaceC47616ImS != null && enumC47176IfM != null) {
            EnumC47176IfM[] LJJIIJ3 = interfaceC47616ImS.LJJIIJ();
            if (LJJIIJ3 == null || LJJIIJ3.length == 0) {
                return enumC47176IfM;
            }
            int length4 = LJJIIJ3.length;
            while (i2 < length4) {
                EnumC47176IfM enumC47176IfM5 = LJJIIJ3[i2];
                long LJIILL2 = LJIILL(interfaceC47616ImS, enumC47176IfM5);
                if (LJIILL2 > j) {
                    enumC47176IfM = enumC47176IfM5;
                    j = LJIILL2;
                }
                i2++;
            }
            return enumC47176IfM;
        }
        return EnumC47176IfM.Standard;
    }

    public final void LJLJJI(FileDescriptor fileDescriptor, long j, long j2) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ;
        tTVideoEngineImpl.r0 = j;
        tTVideoEngineImpl.s0 = j2;
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(12, 0, 0, fileDescriptor);
            return;
        }
        tTVideoEngineImpl.LJJII();
        tTVideoEngineImpl.q0 = fileDescriptor;
        C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
        if (c47750Ioc == null) {
            return;
        }
        c47750Ioc.LJJJJ(6, null);
    }

    public static void LIZLLL(long j, String str, String str2, String[] strArr) {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.getClass();
        if (strArr == null || strArr.length == 0) {
            C78253UnR.LIZLLL("DataLoaderHelper", "urls invalid.");
        } else {
            dataLoaderHelper.LJIILLIIL(new C47396Iiu(j, str, str2, strArr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0026, code lost:
    
        if (r7 == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJJIJ(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            com.ss.ttvideoengine.DataLoaderHelper r4 = X.C47148Ieu.LIZ
            X.Io8 r0 = r4.LJJ
            r3 = 1
            r0.LIZJ(r3)
            r5 = 0
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r4.LJIIIZ     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto Lf
            goto L2a
        Lf:
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r4.LJIIJ     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L18
            int r0 = r0.mEnableMissReason     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L18
            goto L2a
        L18:
            if (r7 != 0) goto L26
            android.content.Context r0 = r4.LJIIJJI     // Catch: java.lang.Throwable -> L21
            java.lang.String r8 = X.C47756Ioi.LJIIL(r0, r8)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0)     // Catch: java.lang.Throwable -> L49
            goto L2a
        L26:
            if (r7 != r3) goto L2a
        L28:
            if (r8 != 0) goto L30
        L2a:
            X.Io8 r0 = r4.LJJ
            r0.LJ(r3)
            return r5
        L30:
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r4.LJIIJ     // Catch: java.lang.Throwable -> L21
            int r0 = r0.mEnableUseGroupId     // Catch: java.lang.Throwable -> L21
            if (r0 <= 0) goto L3d
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L3d
            r9 = r10
        L3d:
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r4.LJIIIZ     // Catch: java.lang.Throwable -> L21
            long r1 = r0.getMissReason(r8, r9)     // Catch: java.lang.Throwable -> L21
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r5 = r1
            goto L2a
        L49:
            r1 = move-exception
            X.Io8 r0 = r4.LJJ
            r0.LJ(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.LJJIJ(int, java.lang.String, java.lang.String, java.lang.String):long");
    }

    public static void LIZJ(long j, String str, String str2, String str3, String[] strArr) {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.getClass();
        if (strArr == null || strArr.length == 0) {
            C78253UnR.LIZLLL("DataLoaderHelper", "urls invalid.");
        } else {
            dataLoaderHelper.LJIILLIIL(new C47396Iiu(j, str, str2, str3, strArr));
        }
    }

    public final void LLIIL(int i, int i2, int i3, int i4, String str) {
        this.LIZ.LLLLZLL(i, i2, i3, i4, str);
    }
}
