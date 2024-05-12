package Y;

import X.C05L;
import X.C156426By;
import X.C16880lQ;
import X.C28635BLr;
import X.C29S;
import X.C30091BrT;
import X.C35274Dss;
import X.C36508EUm;
import X.C36595EXv;
import X.C36943Eeh;
import X.C37491EnX;
import X.C37493EnZ;
import X.C37684Eqe;
import X.C37688Eqi;
import X.C37691Eql;
import X.C38383F4p;
import X.C38646FEs;
import X.C39105FWj;
import X.C39144FXw;
import X.C39189FZp;
import X.C39741Fij;
import X.C39774FjG;
import X.C40049Fnh;
import X.C46748IWi;
import X.C47634Imk;
import X.C48236IwS;
import X.C48693J9d;
import X.C55366LoA;
import X.C55369LoD;
import X.C67012k5;
import X.C67168QXs;
import X.C79004UzY;
import X.CN1;
import X.EF7;
import X.EVM;
import X.EVS;
import X.EnumC30204BtI;
import X.F2D;
import X.F9J;
import X.FAJ;
import X.FFH;
import X.FN7;
import X.FYA;
import X.FYB;
import X.FYE;
import X.FYH;
import X.HandlerC37689Eqj;
import X.HandlerC39740Fii;
import X.IDP;
import X.IWL;
import X.InterfaceC38263Ezz;
import X.InterfaceC39114FWs;
import X.InterfaceC39773FjF;
import X.InterfaceC65784Pro;
import X.VY0;
import X.W5I;
import X.X1D;
import X.X5R;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import android.view.ViewParent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.dex.DexTricksNativeHolder;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.StorageDeteriorationTask;
import com.ss.android.ugc.aweme.legoImp.task.TrafficDeteriorationTask;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ARunnableS10S0101000_6 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Field declaredField;
        Resources resources = (Resources) this.l0;
        int i = this.i1;
        try {
            try {
                Field declaredField2 = resources.getClass().getDeclaredField("mResourcesImpl");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(resources);
                if (obj != null && (declaredField = obj.getClass().getDeclaredField("mCachedXmlBlocks")) != null) {
                    declaredField.setAccessible(true);
                    synchronized (declaredField.get(obj)) {
                        Field declaredField3 = obj.getClass().getDeclaredField("mCachedXmlBlockFiles");
                        if (declaredField3 != null) {
                            declaredField3.setAccessible(true);
                            String[] strArr = (String[]) declaredField3.get(obj);
                            if (strArr.length == 4) {
                                String[] strArr2 = new String[i];
                                Field declaredField4 = obj.getClass().getDeclaredField("mCachedXmlBlockCookies");
                                declaredField4.setAccessible(true);
                                int[] iArr = new int[i];
                                int[] iArr2 = (int[]) declaredField4.get(obj);
                                Object[] objArr = (Object[]) Array.newInstance(declaredField.getType().getComponentType(), i);
                                Object[] objArr2 = (Object[]) declaredField.get(obj);
                                int i2 = 0;
                                do {
                                    strArr2[i2] = strArr[i2];
                                    iArr[i2] = iArr2[i2];
                                    objArr[i2] = objArr2[i2];
                                    i2++;
                                } while (i2 < 4);
                                declaredField3.set(obj, strArr2);
                                declaredField4.set(obj, iArr);
                                declaredField.set(obj, objArr);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public final void LIZ$1() {
        Application application = (Application) this.l0;
        ExecutorService executorService = JatoXL.sConfig.mExecuteService;
        int i = this.i1;
        synchronized (EVM.class) {
            if (!EVM.LIZJ && EVM.LIZ != -1) {
                EVM.LIZJ = true;
                CpusetManager.bindBigCore(EVM.LIZ);
                EVM.LIZ(EVM.LIZ, i);
            } else if (!EVM.LIZIZ) {
                EVM.LIZIZ = true;
                application.registerActivityLifecycleCallbacks(new C36943Eeh(application, i, executorService));
            }
        }
    }

    public final void LIZ$2() {
        StorageDeteriorationTask storageDeteriorationTask = (StorageDeteriorationTask) this.l0;
        int i = this.i1;
        storageDeteriorationTask.getClass();
        String str = "";
        try {
            File LLIIJLIL = C16880lQ.LLIIJLIL(EF7.LIZIZ());
            if (LLIIJLIL != null && LLIIJLIL.exists()) {
                File file = new File(LLIIJLIL, "storage_degradation_ab");
                if (file.exists() || file.mkdirs()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(System.currentTimeMillis());
                    File file2 = new File(file, X1D.LIZIZ(LIZ));
                    if (file2.exists() || file2.mkdirs()) {
                        try {
                            str = new File(file2, "enlargeKaBuff").getCanonicalPath();
                        } catch (IOException unused) {
                        }
                        StorageDeteriorationTask.LIZLLL(i / 10, str);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static final void run$0(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        switch (aRunnableS10S0101000_6.i1) {
            case 0:
                ((IDP) aRunnableS10S0101000_6.l0).LLIIIJ(7, null, false, true);
                return;
            case 1:
                C39741Fij c39741Fij = (C39741Fij) aRunnableS10S0101000_6.l0;
                c39741Fij.getViewTreeObserver().removeOnPreDrawListener(c39741Fij.LJLILLLLZI.LJFF);
                return;
            case 2:
                ((C156426By) aRunnableS10S0101000_6.l0).LJIJJLI();
                return;
            case 3:
                ((LiveStream) aRunnableS10S0101000_6.l0).lambda$stopVideoCapture$7();
                return;
            default:
                C47634Imk c47634Imk = (C47634Imk) aRunnableS10S0101000_6.l0;
                c47634Imk.LJ = c47634Imk.LIZ(c47634Imk.LIZ);
                return;
        }
    }

    public static final void run$1(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        boolean LIZ;
        try {
            Process.setThreadPriority(aRunnableS10S0101000_6.i1);
        } catch (Throwable unused) {
        }
        try {
            ((Runnable) aRunnableS10S0101000_6.l0).run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        boolean LIZ;
        try {
            if (!C39189FZp.LJLJJI.isEmpty()) {
                ((InterfaceC38263Ezz) aRunnableS10S0101000_6.l0).LIZ("onGyroscopeChange", C38383F4p.LIZLLL(C39189FZp.LJLJJI));
            }
            Handler handler = C39189FZp.LJLILLLLZI;
            if (handler != null) {
                handler.postDelayed(aRunnableS10S0101000_6, aRunnableS10S0101000_6.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        switch (aRunnableS10S0101000_6.i1) {
            case 0:
                ((CommentWidget) aRunnableS10S0101000_6.l0).LLILII("livesdk_comment_rethink_dismiss_click");
                return;
            case 1:
                C39741Fij c39741Fij = (C39741Fij) aRunnableS10S0101000_6.l0;
                ViewParent parent = c39741Fij.getRootView().getParent();
                c39741Fij.LJLILLLLZI.LJI = new HandlerC39740Fii(c39741Fij.LJLILLLLZI, C37684Eqe.LJFF(parent), parent);
                HandlerC39740Fii handlerC39740Fii = c39741Fij.LJLILLLLZI.LJI;
                ViewParent viewParent = handlerC39740Fii.LIZIZ.get();
                if (viewParent != null) {
                    C37684Eqe.LIZJ(handlerC39740Fii, viewParent);
                    C37684Eqe.LIZIZ(handlerC39740Fii.LIZ, handlerC39740Fii);
                }
                Handler handler = null;
                MainLooperOptService LJIIJ = MainLooperOptService.LJIIJ(null);
                LJIIJ.getClass();
                try {
                    handler = (Handler) C36508EUm.LIZJ(parent, "mHandler");
                } catch (Throwable th) {
                    Log.getStackTraceString(th);
                }
                LJIIJ.LJLJL = handler;
                FN7.LIZIZ = c39741Fij.LJLILLLLZI.LIZLLL;
                return;
            default:
                ((LiveStream) aRunnableS10S0101000_6.l0).lambda$startAudioCapture$5();
                return;
        }
    }

    public static final void run$12(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        Object obj = aRunnableS10S0101000_6.l0;
        int i = aRunnableS10S0101000_6.i1;
        FYA LIZIZ = C39144FXw.LIZIZ();
        if (LIZIZ != null) {
            int hashCode = obj.hashCode();
            FYB fyb = LIZIZ.LIZJ;
            if (fyb != null) {
                if (i == 0) {
                    if (!fyb.LJ.containsKey(Integer.valueOf(fyb.hashCode()))) {
                        fyb.LJ.put(Integer.valueOf(hashCode), new FYE("com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout", "CommentNestedLayout"));
                    }
                    FYE fye = fyb.LJ.get(Integer.valueOf(hashCode));
                    if (fye != null) {
                        fye.LIZ(false);
                    }
                    fyb.LJI++;
                } else {
                    FYE fye2 = fyb.LJ.get(Integer.valueOf(hashCode));
                    if (fye2 != null) {
                        fye2.LIZ(true);
                    }
                    fyb.LJI--;
                }
                Set<Map.Entry<Integer, FYE>> entrySet = fyb.LJ.entrySet();
                o.LJIIIIZZ(entrySet, "dialogSceneMap.entries");
                for (Map.Entry<Integer, FYE> entry : entrySet) {
                    if (!entry.getValue().LIZ) {
                        fyb.LJFF = entry.getValue();
                    }
                }
                if (fyb.LJI == 0) {
                    fyb.LJFF = null;
                }
            }
            FYH fyh = LIZIZ.LJ;
            if (fyh != null) {
                fyh.LJII();
            }
        }
    }

    public static final void run$13(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        C55369LoD c55369LoD;
        Printer printer;
        switch (aRunnableS10S0101000_6.i1) {
            case 0:
                HybridDialogFragment hybridDialogFragment = (HybridDialogFragment) aRunnableS10S0101000_6.l0;
                int i = hybridDialogFragment.LLII;
                if (i != 0) {
                    hybridDialogFragment.Al(i);
                    return;
                } else {
                    hybridDialogFragment.Dl(hybridDialogFragment.LLIIII, hybridDialogFragment.LLIIIILZ, hybridDialogFragment.LLIIIL, hybridDialogFragment.LLIIIJ);
                    return;
                }
            case 1:
                ((C67168QXs) aRunnableS10S0101000_6.l0).LIZIZ.LIZLLL(null);
                return;
            case 2:
                C39105FWj c39105FWj = (C39105FWj) aRunnableS10S0101000_6.l0;
                c39105FWj.getClass();
                MessageQueue myQueue = Looper.myQueue();
                while (true) {
                    try {
                        Message message = (Message) C36595EXv.LJ.invoke(myQueue, new Object[0]);
                        if (message != null) {
                            Handler handler = c39105FWj.LIZ.get();
                            Handler target = message.getTarget();
                            if (target == handler) {
                                if (message.obj == C39105FWj.LJFF) {
                                    handler.postAtFrontOfQueue(message.getCallback());
                                    C36595EXv.LIZ.invoke(message, new Object[0]);
                                    return;
                                }
                            } else {
                                List<InterfaceC39114FWs> list = c39105FWj.LIZIZ.get();
                                if (!C79004UzY.LJJIFFI(list)) {
                                    Queue<Message> queue = c39105FWj.LIZLLL.get();
                                    Iterator<InterfaceC39114FWs> it = list.iterator();
                                    boolean z = false;
                                    while (true) {
                                        if (it.hasNext()) {
                                            z = it.next().LIZ(message);
                                            if (z && queue != null) {
                                                queue.offer(message);
                                            }
                                        } else if (z) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            try {
                                printer = (Printer) C36595EXv.LIZLLL.get(Looper.myLooper());
                            } catch (Throwable unused) {
                                printer = null;
                            }
                            if (printer != null) {
                                printer.println(">>>>> Dispatching to " + target + " " + message.getCallback() + ": " + message.what);
                            }
                            InterfaceC39773FjF interfaceC39773FjF = c39105FWj.LIZJ.get();
                            if (interfaceC39773FjF != null) {
                                interfaceC39773FjF.LIZIZ();
                            }
                            target.dispatchMessage(message);
                            if (interfaceC39773FjF != null) {
                                interfaceC39773FjF.LIZ();
                            }
                            if (printer != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("<<<<< Finished to ");
                                LIZ.append(target);
                                LIZ.append(" ");
                                LIZ.append(message.getCallback());
                                printer.println(X1D.LIZIZ(LIZ));
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                Binder.clearCallingIdentity();
                            }
                            try {
                                C36595EXv.LIZ.invoke(message, new Object[0]);
                            } catch (Throwable unused2) {
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable unused3) {
                        return;
                    }
                }
                break;
            case 3:
                C55366LoA c55366LoA = ((DetailFragmentPanel) aRunnableS10S0101000_6.l0).LLIIIL;
                if (c55366LoA != null && (c55369LoD = c55366LoA.LJLIL) != null) {
                    c55369LoD.onDestroy();
                    return;
                }
                return;
            case 4:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) aRunnableS10S0101000_6.l0;
                if (ecBaseDiscoverAndSearchFragmentNew.mStatusDestroyed) {
                    return;
                }
                if (C39774FjG.LIZ() && !TextUtils.isEmpty(ecBaseDiscoverAndSearchFragmentNew.LJLJI.getText())) {
                    return;
                }
                ecBaseDiscoverAndSearchFragmentNew.hm(false);
                return;
            default:
                C05L.LIZLLL((Context) aRunnableS10S0101000_6.l0, R.string.h1u);
                return;
        }
    }

    public static final void run$14(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        switch (aRunnableS10S0101000_6.i1) {
            case 0:
                W5I.LIZ().LIZIZ((Uri) aRunnableS10S0101000_6.l0);
                return;
            case 1:
                new Handler().postDelayed(new IDRunnableS6S0101000(5, aRunnableS10S0101000_6.l0, 14), 500L);
                return;
            case 2:
                Context context = (Context) aRunnableS10S0101000_6.l0;
                C48693J9d.LJFF();
                EVS.LIZ(context);
                if (!EVS.LIZJ) {
                    return;
                }
                DexTricksNativeHolder.verifyNone(EVS.LIZIZ, EVS.LIZ);
                return;
            case 3:
                ((FFH) aRunnableS10S0101000_6.l0).stop();
                return;
            default:
                InterfaceC65784Pro tmp0 = (InterfaceC65784Pro) aRunnableS10S0101000_6.l0;
                o.LJIIIZ(tmp0, "$tmp0");
                tmp0.invoke();
                return;
        }
    }

    public static final void run$2(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        switch (aRunnableS10S0101000_6.i1) {
            case 0:
                C30091BrT c30091BrT = (C30091BrT) aRunnableS10S0101000_6.l0;
                c30091BrT.getClass();
                ((IGiftService) CN1.LIZ(IGiftService.class)).loadBehavior(c30091BrT.LIZ.getContext(), c30091BrT.LIZ.mDataChannel, EnumC30204BtI.FAST_GIFT.ordinal());
                return;
            case 1:
                C37491EnX c37491EnX = (C37491EnX) aRunnableS10S0101000_6.l0;
                if (!c37491EnX.LIZLLL.compareAndSet(false, true)) {
                    return;
                }
                Set<Map.Entry<String, ?>> entrySet = c37491EnX.LIZIZ.getAll().entrySet();
                int i = (int) (c37491EnX.LIZJ * 0.25d);
                PriorityQueue priorityQueue = new PriorityQueue(i, new F2D(0));
                C37493EnZ c37493EnZ = new C37493EnZ();
                Iterator<Map.Entry<String, ?>> it = entrySet.iterator();
                while (it.hasNext()) {
                    c37493EnZ.LJLIL = it.next();
                    if (priorityQueue.size() < i) {
                        priorityQueue.offer(c37493EnZ);
                    } else {
                        Map.Entry entry = (Map.Entry) priorityQueue.peek();
                        if (entry != null && ((Long) entry.getValue()).longValue() > c37493EnZ.getValue().longValue()) {
                            priorityQueue.poll();
                            priorityQueue.offer(c37493EnZ);
                        }
                    }
                }
                Iterator it2 = priorityQueue.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    c37491EnX.LIZ.erase((String) entry2.getKey());
                    c37491EnX.LIZIZ.erase((String) entry2.getKey());
                }
                c37491EnX.LIZLLL.set(false);
                return;
            case 2:
                Map.Entry entry3 = (Map.Entry) aRunnableS10S0101000_6.l0;
                ((Executor) entry3.getValue()).execute((Runnable) entry3.getKey());
                return;
            case 3:
                ((C38646FEs) aRunnableS10S0101000_6.l0).LJIILJJIL(true);
                return;
            case 4:
                FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) aRunnableS10S0101000_6.l0;
                if (fTCVideoRecordNewActivity.LLILLJJLI() != null) {
                    fTCVideoRecordNewActivity.LLILLJJLI().l10(true, true);
                    return;
                }
                return;
            case 5:
                ((MainActivity) aRunnableS10S0101000_6.l0).callLazyDoIt();
                return;
            case 6:
                C46748IWi.LJJIZ((C46748IWi) aRunnableS10S0101000_6.l0);
                return;
            default:
                C29S this$0 = (C29S) aRunnableS10S0101000_6.l0;
                o.LJIIIZ(this$0, "this$0");
                this$0.findViewById(R.id.n43).setVisibility(8);
                return;
        }
    }

    public static final void run$3(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0101000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0101000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        boolean LIZ;
        try {
            LeakDetectorInstaller.INSTANCE.install((Context) ((ACallableS109S0100000_6) aRunnableS10S0101000_6.l0).l0, aRunnableS10S0101000_6.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        boolean LIZ;
        try {
            aRunnableS10S0101000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        TrafficDeteriorationTask trafficDeteriorationTask = (TrafficDeteriorationTask) aRunnableS10S0101000_6.l0;
        int i = aRunnableS10S0101000_6.i1;
        trafficDeteriorationTask.getClass();
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "traffic_de_ab_v2_sp");
        LIZIZ.edit().putInt("key_ab_lab_did_count", LIZIZ.getInt("key_ab_lab_did_count", 0) + 1).putLong("key_ab_lab_did_lasttime", System.currentTimeMillis()).apply();
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(TrafficDeteriorationTask.LJLILLLLZI);
            LIZ.append("_");
            LIZ.append(i2);
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
            LIZ2.append("/traffic_de_ab/");
            LIZ2.append(LIZIZ2);
            String LIZIZ3 = X1D.LIZIZ(LIZ2);
            X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with("https://sf16-va.tiktokcdn.com/obj/ml-obj/13353e8b9c05");
            with.LJII = 0;
            with.LJ = LIZIZ3;
            with.LIZJ = "datafile";
            with.LJJI = true;
            with.LJIIJ = "traffic_de_ab";
            with.LJIIL = new C40049Fnh(LIZIZ3);
            with.LIZJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$8(Y.ARunnableS10S0101000_6 r11) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS10S0101000_6.run$8(Y.ARunnableS10S0101000_6):void");
    }

    public static final void run$9(ARunnableS10S0101000_6 aRunnableS10S0101000_6) {
        Handler LJ;
        switch (aRunnableS10S0101000_6.i1) {
            case 0:
                ((C28635BLr) aRunnableS10S0101000_6.l0).LJFF.LIZIZ();
                return;
            case 1:
                Application application = (Application) aRunnableS10S0101000_6.l0;
                if (C48236IwS.LJIJJ()) {
                    C37688Eqi c37688Eqi = C37691Eql.LIZ;
                    if (c37688Eqi.LIZ) {
                        return;
                    }
                    c37688Eqi.LIZ = true;
                    application.registerActivityLifecycleCallbacks(c37688Eqi.LIZIZ);
                    if ((!((Boolean) C35274Dss.LJFF.getValue()).booleanValue() && !FAJ.LJI()) || (LJ = C37684Eqe.LJ()) == null) {
                        return;
                    }
                    HandlerC37689Eqj handlerC37689Eqj = new HandlerC37689Eqj(LJ);
                    c37688Eqi.LIZJ = handlerC37689Eqj;
                    C37688Eqi.LIZIZ(LJ, handlerC37689Eqj);
                    return;
                }
                return;
            case 2:
                ((C67012k5) aRunnableS10S0101000_6.l0).LIZLLL();
                return;
            case 3:
                ((VY0) aRunnableS10S0101000_6.l0).LJLIL.LJIL();
                return;
            default:
                IWL.LJIIIIZZ((IWL) aRunnableS10S0101000_6.l0);
                return;
        }
    }

    public ARunnableS10S0101000_6(CommentNestedLayout commentNestedLayout, int i) {
        this.$t = i;
        this.l0 = commentNestedLayout;
        this.i1 = 0;
    }

    public ARunnableS10S0101000_6(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
