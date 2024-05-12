package X;

import Y.ARunnableS11S0201000_8;
import Y.ARunnableS14S0110000_8;
import android.content.Context;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ima, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47624Ima implements Runnable {
    public final C47751Iod LJLIL;
    public final Context LJLILLLLZI;
    public final Handler LJLJI = new Handler(C16880lQ.LLJJJJ());
    public final C47752Ioe LJLJJI;
    public final InterfaceC47580Ils LJLJJL;
    public final C47625Imb LJLJJLL;

    public final void LIZ() {
        BufferedReader bufferedReader;
        int LIZIZ;
        InterfaceC47616ImS interfaceC47616ImS;
        String str;
        C78253UnR.LJI("VideoEventLoggerV2", "AyncGetLogDataRunnable enter");
        C47751Iod c47751Iod = this.LJLIL;
        if (c47751Iod == null) {
            C78253UnR.LIZLLL("VideoEventLoggerV2", "rEvent is null, return.");
            return;
        }
        Context context = this.LJLILLLLZI;
        C47752Ioe c47752Ioe = this.LJLJJI;
        InterfaceC47580Ils interfaceC47580Ils = this.LJLJJL;
        c47751Iod.LLIIJI = (int) C47756Ioi.LJIIIZ(context);
        int i = -1;
        if (c47752Ioe != null) {
            c47752Ioe.LJIIL();
            ArrayList<String> arrayList = new ArrayList<>();
            if ((c47752Ioe.LJJII.equals("vid") || c47752Ioe.LJJII.equals("feed")) && (interfaceC47616ImS = c47752Ioe.LJJJJZ) != null) {
                for (C47160If6 c47160If6 : interfaceC47616ImS.LIZLLL()) {
                    String LIZIZ2 = c47160If6.LIZIZ(48);
                    String LIZIZ3 = c47160If6.LIZIZ(18);
                    String LIZIZ4 = c47160If6.LIZIZ(8);
                    LIZIZ4.getClass();
                    switch (LIZIZ4.hashCode()) {
                        case 3148040:
                            if (LIZIZ4.equals("h264")) {
                                str = CardStruct.IStatusCode.DEFAULT;
                                break;
                            }
                            break;
                        case 355428636:
                            if (LIZIZ4.equals("bytevc1")) {
                                str = "1";
                                break;
                            }
                            break;
                        case 355428637:
                            if (LIZIZ4.equals("bytevc2")) {
                                str = "2";
                                break;
                            }
                            break;
                    }
                    str = "-1";
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZIZ3);
                    LIZ.append('_');
                    LIZ.append(LIZIZ2);
                    LIZ.append('_');
                    LIZ.append(str);
                    arrayList.add(X1D.LIZIZ(LIZ));
                }
                c47752Ioe.LJII = arrayList;
            }
            c47752Ioe.LJJJJZI = C47752Ioe.LJIIIZ();
            if (c47752Ioe.LJJLIIIJILLIZJL.LIZ == 2) {
                c47751Iod.LLZIL.put("preload", 1);
            }
            java.util.Map map = c47752Ioe.LJJZZIII;
            if (map != null && !((HashMap) map).isEmpty()) {
                c47751Iod.LLZIL.putAll(c47752Ioe.LJJZZIII);
                int i2 = c47752Ioe.LJL;
                if (i2 >= 0) {
                    c47751Iod.LJLLL = String.valueOf(i2);
                }
            }
        }
        c47751Iod.U = C77117UOj.LJIILIIL();
        if (c47752Ioe.LJJLI) {
            double LJ = c47752Ioe.LJ();
            double LJFF = c47752Ioe.LJFF();
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            if (LJ > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && LJFF > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                c47751Iod.O = LJ;
                c47751Iod.Q = LJFF;
            } else {
                C47626Imc LJII = c47752Ioe.LJII();
                if (LJII != null) {
                    double d2 = LJII.LIZ;
                    double d3 = 1.401298464324817E-45d;
                    if (d2 <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        d2 = 1.401298464324817E-45d;
                    }
                    c47751Iod.O = d2;
                    double d4 = LJII.LIZIZ;
                    if (d4 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        d3 = d4;
                    }
                    c47751Iod.Q = d3;
                }
            }
            if (!c47751Iod.LLLZLL.isEmpty()) {
                while (c47751Iod.LLLZLL.iterator().hasNext()) {
                    d += r2.next().floatValue();
                }
                c47751Iod.T = (float) (d / c47751Iod.LLLZLL.size());
            }
        }
        if (!C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 2L) && (LIZIZ = C47795IpL.LIZIZ(context)) >= 0) {
            c47751Iod.S = LIZIZ;
        }
        C47578Ilq.LIZ().getClass();
        c47751Iod.LLLZZIL = -1;
        if (interfaceC47580Ils != null) {
            c47751Iod.LLZ = ((C47577Ilp) interfaceC47580Ils).LIZ(new ArrayList(c47751Iod.LLLZL), new ArrayList(c47751Iod.LLLZ));
        }
        String property = System.getProperty("os.arch");
        if (property != null && property.contains("64")) {
            i = 64;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("appBits:");
            LIZ2.append(64);
            LIZ2.append(" != osBits:");
            LIZ2.append(32);
            C78253UnR.LJI("VideoEventLoggerV2", X1D.LIZIZ(LIZ2));
        }
        c47751Iod.p0 = i;
        JSONObject LIZLLL = this.LJLIL.LIZLLL(this.LJLJJI);
        boolean z = this.LJLJJI.LJJZZI;
        C47625Imb c47625Imb = this.LJLJJLL;
        String str2 = this.LJLIL.LLLLLLLZIL;
        synchronized (c47625Imb) {
            if (((HashSet) c47625Imb.LIZIZ).contains(str2)) {
                ((HashSet) c47625Imb.LIZIZ).remove(str2);
                EngineThreadPool.addExecuteTask(new ARunnableS11S0201000_8(4, c47625Imb, str2, 4));
            }
        }
        C47625Imb c47625Imb2 = this.LJLJJLL;
        boolean z2 = this.LJLJJI.LJJZZI;
        c47625Imb2.getClass();
        if (!C47625Imb.LIZLLL) {
            C47625Imb.LIZLLL = true;
            if (!c47625Imb2.LIZ.exists()) {
                TTVideoEngineLog.w("EventSaver", "dir does not exist");
            } else {
                File[] listFiles = c47625Imb2.LIZ.listFiles();
                if (listFiles == null) {
                    C78253UnR.LJI("EventSaver", "no file in directory");
                } else {
                    for (File file : listFiles) {
                        if (file != null && !file.isDirectory()) {
                            StringBuilder sb = new StringBuilder();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(file));
                            } catch (IOException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        sb.append(readLine);
                                    } else {
                                        bufferedReader.close();
                                        try {
                                            EnumC47567Ilf.instance.LIZJ(new JSONObject(sb.toString()), z2);
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("saved event uploaded: ");
                                            LIZ3.append(file.getName());
                                            C78253UnR.LJI("EventSaver", X1D.LIZIZ(LIZ3));
                                        } catch (JSONException e2) {
                                            C16880lQ.LLLLIIL(e2);
                                        }
                                        C16880lQ.LLLZZIL(file);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.LJLJI.post(new ARunnableS14S0110000_8(z, LIZLLL, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47624Ima(Context context, C47751Iod c47751Iod, C47752Ioe c47752Ioe, C47577Ilp c47577Ilp, C47625Imb c47625Imb) {
        this.LJLIL = c47751Iod;
        this.LJLILLLLZI = context;
        this.LJLJJI = c47752Ioe;
        this.LJLJJL = c47577Ilp;
        this.LJLJJLL = c47625Imb;
    }
}
