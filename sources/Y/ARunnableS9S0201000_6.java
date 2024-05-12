package Y;

import X.AbstractC37502Eni;
import X.ActivityC45651qj;
import X.BPQ;
import X.BQ6;
import X.C06M;
import X.C141335gf;
import X.C16880lQ;
import X.C2050382x;
import X.C31319CQx;
import X.C37238EjS;
import X.C37428EmW;
import X.C37449Emr;
import X.C37463En5;
import X.C37473EnF;
import X.C37508Eno;
import X.C37509Enp;
import X.C37515Env;
import X.C37558Eoc;
import X.C37582Ep0;
import X.C37595EpD;
import X.C37607EpP;
import X.C37618Epa;
import X.C37683Eqd;
import X.C37684Eqe;
import X.C37688Eqi;
import X.C39105FWj;
import X.C39144FXw;
import X.C39168FYu;
import X.C3C5;
import X.C46745IWf;
import X.C46748IWi;
import X.C47634Imk;
import X.C54437LYb;
import X.C5S1;
import X.C61145NzB;
import X.CR6;
import X.EF7;
import X.EnumC37570Eoo;
import X.FYA;
import X.HandlerC37687Eqh;
import X.IWH;
import X.IWL;
import X.IX4;
import X.InterfaceC37408EmC;
import X.InterfaceC37474EnG;
import X.InterfaceC37591Ep9;
import X.W5V;
import X.W6U;
import X.X1D;
import Y.ARunnableS9S0201000_6;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pia.core.bridge.protocol.ProtocolMessage;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.pitaya.cep_engine.timer.Timer;
import com.bytedance.tux.tag.TuxTag;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.IOThreadBoostTask;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public class ARunnableS9S0201000_6 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            C16880lQ.LLLJL(EF7.LIZIZ(), (Intent) this.l0, (ServiceConnection) this.l1, this.i2);
        } finally {
        }
    }

    public static final void run$0(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                AbstractC37502Eni abstractC37502Eni = (AbstractC37502Eni) aRunnableS9S0201000_6.l1;
                String str = (String) aRunnableS9S0201000_6.l0;
                View LJI = abstractC37502Eni.LIZ.LJI();
                if (LJI instanceof WebView) {
                    C37238EjS.LJI(6, "[Streaming] appendChunkByBridge by evaluate JavaScript.", null);
                    StringBuilder sb = new StringBuilder("(function(_){function n(_){if(!window.__PAGE_FINISH__){window.__PIA_DEV__&&console.log(_);var n=document.createRange();n.selectNode(document.body);var e=n.createContextualFragment(_);document.body.appendChild(e)}}window.__pia_chunks__||(window.__pia_chunks__=[]),window.__pia_chunks__.push(_),function _(){if(\"undefined\"!=typeof document&&\"complete\"===document.readyState){if(window.__pia_chunks__)for(var e=0;e<window.__pia_chunks__.length;e++)n(window.__pia_chunks__[e]);window.__pia_chunks__=[]}else setTimeout(_,50)}()})");
                    C37618Epa.LIZ(str, sb);
                    sb.append(";");
                    C37618Epa.LIZIZ((WebView) LJI, sb.toString(), null);
                    return;
                }
                return;
            case 1:
                Timer.m83timer$lambda6((String) aRunnableS9S0201000_6.l0, (Runnable) aRunnableS9S0201000_6.l1);
                return;
            default:
                Bitmap bitmap = (Bitmap) aRunnableS9S0201000_6.l1;
                TuxTag tuxTag = (TuxTag) aRunnableS9S0201000_6.l0;
                if (bitmap == null) {
                    return;
                }
                tuxTag.setTagIconBitmap(bitmap);
                return;
        }
    }

    public static final void run$1(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                ((AbsAudienceInteractionFragment) aRunnableS9S0201000_6.l0).lambda$loadWidgetWithFirstFrameP2$48((IBannerService) aRunnableS9S0201000_6.l1);
                return;
            case 1:
                C37558Eoc c37558Eoc = (C37558Eoc) aRunnableS9S0201000_6.l0;
                String str = (String) aRunnableS9S0201000_6.l1;
                c37558Eoc.getClass();
                c37558Eoc.LJII(EventName.WorkerExecuteStart).LIZ();
                c37558Eoc.LJIIL.evaluateJavaScript(str, c37558Eoc.LJII.toString());
                c37558Eoc.LJIIL.evaluateJavaScript("if(typeof globalThis.__activate==='function'){globalThis.__activate();}");
                c37558Eoc.LJIJJ = EnumC37570Eoo.Ready;
                return;
            case 2:
                C37683Eqd c37683Eqd = (C37683Eqd) aRunnableS9S0201000_6.l0;
                View view = (View) aRunnableS9S0201000_6.l1;
                c37683Eqd.getClass();
                ViewParent parent = view.getRootView().getParent();
                Handler LJFF = C37684Eqe.LJFF(parent);
                if (LJFF != null) {
                    c37683Eqd.LJLILLLLZI.LJ = new HandlerC37687Eqh(LJFF, parent);
                    C37688Eqi.LIZIZ(LJFF, c37683Eqd.LJLILLLLZI.LJ);
                    return;
                }
                return;
            default:
                Video video = (Video) aRunnableS9S0201000_6.l0;
                video.setVideoModelObject(((IWH) aRunnableS9S0201000_6.l1).LJIILJJIL(video.getVideoModelStr()));
                return;
        }
    }

    public static final void run$10(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        ActivityC45651qj mo49getActivity;
        Fragment LIZ;
        FYA LIZIZ;
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                final W5V w5v = (W5V) aRunnableS9S0201000_6.l0;
                final W6U w6u = (W6U) aRunnableS9S0201000_6.l1;
                w5v.getClass();
                final File LJII = W5V.LJII(w6u);
                if (LJII == null) {
                    return;
                }
                C2050382x.LIZ.execute(new Runnable() { // from class: X.FYU
                    @Override // java.lang.Runnable
                    public final void run() {
                        FYV fyv;
                        W5V w5v2 = W5V.this;
                        W6U w6u2 = w6u;
                        File file = LJII;
                        List<SoftReference<FYV>> list = w5v2.LIZ.get(w6u2);
                        if (list != null && !list.isEmpty()) {
                            for (int i = 0; i < list.size(); i++) {
                                SoftReference softReference = (SoftReference) ListProtector.get(list, i);
                                if (softReference != null && (fyv = (FYV) softReference.get()) != null) {
                                    fyv.LIZ(file);
                                }
                            }
                            w5v2.LIZ.remove(w6u2);
                            return;
                        }
                        if (w6u2 != null) {
                            if (((LinkedList) w5v2.LIZIZ).size() >= 10) {
                                ListProtector.remove(w5v2.LIZIZ, 0);
                            }
                            ((LinkedList) w5v2.LIZIZ).add(w6u2);
                        }
                    }
                });
                return;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) aRunnableS9S0201000_6.l0;
                FragmentManager fragmentManager = (FragmentManager) aRunnableS9S0201000_6.l1;
                long currentTimeMillis = System.currentTimeMillis();
                if (atomicBoolean.get()) {
                    List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
                    if (LJJJJLI.size() > 0 && ((Fragment) ListProtector.get(LJJJJLI, 0)).mo49getActivity() != null && (mo49getActivity = ((Fragment) ListProtector.get(LJJJJLI, 0)).mo49getActivity()) != null && mo49getActivity.getSupportFragmentManager() != null && (LIZ = BPQ.LIZ(mo49getActivity.getSupportFragmentManager().LJJJJLI())) != null && (LIZIZ = C39144FXw.LIZIZ()) != null) {
                        LIZIZ.LIZ(LIZ.mo49getActivity(), LIZ);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("FragmentManagerLancet#execPendingActions find fragment cost:");
                    LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
                    String msg = X1D.LIZIZ(LIZ2);
                    o.LJIIIZ(msg, "msg");
                    return;
                }
                return;
            case 2:
                C61145NzB this$0 = (C61145NzB) aRunnableS9S0201000_6.l0;
                View container = (View) aRunnableS9S0201000_6.l1;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(container, "$container");
                this$0.LIZ(container);
                return;
            default:
                C46748IWi.LJJIIZI((C46748IWi) aRunnableS9S0201000_6.l0, (IX4) aRunnableS9S0201000_6.l1);
                return;
        }
    }

    public static final void run$2(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        boolean LIZ;
        try {
            IOThreadBoostTask iOThreadBoostTask = (IOThreadBoostTask) aRunnableS9S0201000_6.l0;
            int i = aRunnableS9S0201000_6.i2;
            iOThreadBoostTask.getClass();
            try {
                CpusetManager.bindLittleCore();
                Process.setThreadPriority(Math.min(19, i + 2));
            } catch (Throwable unused) {
            }
            ((Runnable) aRunnableS9S0201000_6.l1).run();
            IOThreadBoostTask iOThreadBoostTask2 = (IOThreadBoostTask) aRunnableS9S0201000_6.l0;
            int i2 = aRunnableS9S0201000_6.i2;
            iOThreadBoostTask2.getClass();
            try {
                CpusetManager.resetCoreBind();
                Process.setThreadPriority(i2);
            } catch (Throwable unused2) {
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        boolean LIZ;
        try {
            aRunnableS9S0201000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                C37558Eoc c37558Eoc = (C37558Eoc) aRunnableS9S0201000_6.l0;
                Throwable th = (Throwable) aRunnableS9S0201000_6.l1;
                if (th == null) {
                    c37558Eoc.LIZ.LIZ("Load resource failed.");
                } else {
                    C37607EpP<String> c37607EpP = c37558Eoc.LIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Load resource failed, error: ");
                    LIZ.append(th.getMessage());
                    c37607EpP.LIZ(X1D.LIZIZ(LIZ));
                }
                c37558Eoc.LJIIL.terminate();
                return;
            case 1:
                MainLooperOptService mainLooperOptService = (MainLooperOptService) aRunnableS9S0201000_6.l0;
                View view = (View) aRunnableS9S0201000_6.l1;
                mainLooperOptService.getClass();
                view.getViewTreeObserver().removeOnPreDrawListener(mainLooperOptService.LLF);
                return;
            default:
                IEffectService.OnVideoCoverCallback onVideoCoverCallback = (IEffectService.OnVideoCoverCallback) aRunnableS9S0201000_6.l0;
                Bitmap bitmap = (Bitmap) aRunnableS9S0201000_6.l1;
                if (onVideoCoverCallback != null) {
                    if (bitmap != null) {
                        onVideoCoverCallback.onGetVideoCoverSuccess(bitmap);
                        return;
                    } else {
                        onVideoCoverCallback.onGetVideoCoverFailed(-1);
                        return;
                    }
                }
                return;
        }
    }

    public static final void run$5(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        Object LIZ;
        Integer num;
        Integer num2;
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                ((C31319CQx) aRunnableS9S0201000_6.l0).LJJIIZI((CR6) aRunnableS9S0201000_6.l1, false, null);
                return;
            case 1:
                final C37449Emr c37449Emr = (C37449Emr) aRunnableS9S0201000_6.l0;
                j jVar = (j) aRunnableS9S0201000_6.l1;
                c37449Emr.getClass();
                try {
                    LIZ = (ProtocolMessage) GsonUtils.LIZIZ().LIZJ(jVar, ProtocolMessage.class);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                ProtocolMessage protocolMessage = (ProtocolMessage) LIZ;
                if (protocolMessage == null) {
                    return;
                }
                if (ProtocolMessage.Type.Invocation != protocolMessage.type || TextUtils.isEmpty(protocolMessage.name) || (num = protocolMessage.id) == null) {
                    if (ProtocolMessage.Type.Callback != protocolMessage.type || (num2 = protocolMessage.id) == null || num2.intValue() == 0 || protocolMessage.status == null) {
                        return;
                    }
                    C37428EmW c37428EmW = new C37428EmW(protocolMessage.id.intValue(), protocolMessage.status.intValue(), protocolMessage.data, protocolMessage.message);
                    BQ6<C37428EmW> bq6 = c37449Emr.LJII.get(c37428EmW.LIZ);
                    if (bq6 == null) {
                        return;
                    }
                    c37449Emr.LJII.remove(c37428EmW.LIZ);
                    bq6.accept(c37428EmW);
                    return;
                }
                int intValue = num.intValue();
                String str = protocolMessage.name;
                if (str != null) {
                    final C37595EpD c37595EpD = new C37595EpD(protocolMessage.data, str, intValue);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    c37449Emr.LIZIZ(new C37582Ep0(c37449Emr, c37595EpD, atomicBoolean), new BQ6() { // from class: X.Eoz
                        @Override // X.BQ6
                        public final void accept(Object obj) {
                            m mVar;
                            m LIZ2;
                            C37449Emr c37449Emr2 = C37449Emr.this;
                            C37595EpD c37595EpD2 = c37595EpD;
                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                            C37394Ely c37394Ely = (C37394Ely) obj;
                            c37449Emr2.getClass();
                            if (c37394Ely.getMessage() != null && c37394Ely.getMessage().startsWith("{")) {
                                try {
                                    com.google.gson.o oVar = GsonUtils.LIZIZ;
                                    String message = c37394Ely.getMessage();
                                    oVar.getClass();
                                    mVar = (m) com.google.gson.o.LIZ(message);
                                } catch (Throwable unused) {
                                }
                                LIZ2 = ProtocolMessage.LIZ(new C37428EmW(c37595EpD2.LIZ, c37394Ely.getCode(), mVar, c37394Ely.getMessage()));
                                if (LIZ2 == null && atomicBoolean2.compareAndSet(false, true)) {
                                    c37449Emr2.LJ.LIZ(LIZ2);
                                    return;
                                }
                            }
                            mVar = null;
                            LIZ2 = ProtocolMessage.LIZ(new C37428EmW(c37595EpD2.LIZ, c37394Ely.getCode(), mVar, c37394Ely.getMessage()));
                            if (LIZ2 == null) {
                            }
                        }
                    }, c37595EpD.LIZJ, c37595EpD.LIZIZ);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            default:
                C54437LYb c54437LYb = (C54437LYb) aRunnableS9S0201000_6.l0;
                Object obj = aRunnableS9S0201000_6.l1;
                if (!c54437LYb.LIZ.isViewValid()) {
                    return;
                }
                if (AVExternalServiceImpl.LIZ().publishService().isPublishServiceRunning(EF7.LIZIZ()) || !(obj instanceof MainActivity) || a.LJ().LJ(1)) {
                    return;
                }
                c54437LYb.LIZIZ(null, false, "AvApiFragmentObserver onAttach", null);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Ep1] */
    public static final void run$6(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                ((C31319CQx) aRunnableS9S0201000_6.l0).LJJIIZI((CR6) aRunnableS9S0201000_6.l1, false, null);
                return;
            default:
                final C37449Emr c37449Emr = (C37449Emr) aRunnableS9S0201000_6.l0;
                final InterfaceC37591Ep9 interfaceC37591Ep9 = (InterfaceC37591Ep9) aRunnableS9S0201000_6.l1;
                c37449Emr.LJFF = interfaceC37591Ep9;
                C37607EpP<m> c37607EpP = c37449Emr.LJ;
                interfaceC37591Ep9.getClass();
                c37607EpP.LIZJ(new BQ6() { // from class: X.Ep8
                    @Override // X.BQ6
                    public final void accept(Object obj) {
                        InterfaceC37591Ep9.this.LIZIZ((m) obj);
                    }
                });
                interfaceC37591Ep9.LIZ(new BQ6() { // from class: X.Ep1
                    @Override // X.BQ6
                    public final void accept(Object obj) {
                        C37449Emr c37449Emr2 = C37449Emr.this;
                        c37449Emr2.getClass();
                        C37613EpV.LIZJ(new ARunnableS9S0201000_6(1, c37449Emr2, obj, 5));
                    }
                });
                return;
        }
    }

    public static final void run$7(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                C37463En5 c37463En5 = (C37463En5) aRunnableS9S0201000_6.l0;
                String str = (String) aRunnableS9S0201000_6.l1;
                c37463En5.getClass();
                c37463En5.LIZLLL(null);
                C37508Eno c37508Eno = C37515Env.LIZ;
                C37473EnF c37473EnF = c37508Eno.LIZIZ(str).LJFF;
                if (c37473EnF != null) {
                    c37463En5.LIZLLL(c37473EnF);
                }
                List<InterfaceC37408EmC<InterfaceC37474EnG>> list = C37509Enp.LJI;
                c37463En5.LJ(list);
                List<InterfaceC37408EmC<InterfaceC37474EnG>> list2 = c37508Eno.LIZIZ(str).LIZLLL;
                if (list2 != list) {
                    c37463En5.LJ(list2);
                    return;
                }
                return;
            case 1:
                C39105FWj c39105FWj = (C39105FWj) aRunnableS9S0201000_6.l0;
                Runnable runnable = (Runnable) aRunnableS9S0201000_6.l1;
                c39105FWj.LIZ.set(null);
                Queue<Message> queue = c39105FWj.LIZLLL.get();
                c39105FWj.LIZLLL.set(null);
                if (runnable != null) {
                    runnable.run();
                }
                if (queue != null) {
                    if (c39105FWj.LJ == null) {
                        c39105FWj.LJ = new Handler(C06M.LIZ("EndlessLooper").getLooper());
                    }
                    c39105FWj.LJ.post(new ARunnableS8S0201000_5(1, c39105FWj, queue, 9));
                    return;
                }
                return;
            case 2:
                Context context = (Context) aRunnableS9S0201000_6.l0;
                String str2 = (String) aRunnableS9S0201000_6.l1;
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZLLL(str2);
                c5s1.LJ();
                return;
            default:
                C47634Imk c47634Imk = (C47634Imk) aRunnableS9S0201000_6.l0;
                Object obj = aRunnableS9S0201000_6.l1;
                if (obj != null) {
                    ((ArrayList) c47634Imk.LIZJ).remove(obj);
                } else {
                    c47634Imk.getClass();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("listener: ");
                LIZ.append(((ArrayList) c47634Imk.LIZJ).size());
                TTVideoEngineLog.d("HeadsetStateMonitor", X1D.LIZIZ(LIZ));
                return;
        }
    }

    public static final void run$8(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        boolean z;
        Field field;
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) aRunnableS9S0201000_6.l0;
                Object obj = aRunnableS9S0201000_6.l1;
                try {
                    if (C39168FYu.LIZ == null) {
                        Class<?> cls = Class.forName("androidx.fragment.app.FragmentManagerImpl");
                        C39168FYu.LIZ = cls;
                        C39168FYu.LIZIZ = cls.getDeclaredField("mPendingActions");
                    }
                    field = C39168FYu.LIZIZ;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (field != null && obj != null) {
                    z = true;
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && (obj2 instanceof List)) {
                        if (((List) obj2).size() != 0) {
                            atomicBoolean.set(z);
                            return;
                        }
                    }
                }
                z = false;
                atomicBoolean.set(z);
                return;
            case 1:
                C61145NzB this$0 = (C61145NzB) aRunnableS9S0201000_6.l0;
                View container = (View) aRunnableS9S0201000_6.l1;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(container, "$container");
                this$0.LIZ(container);
                return;
            default:
                C46748IWi.LJJIJ((C46748IWi) aRunnableS9S0201000_6.l0, (C46745IWf) aRunnableS9S0201000_6.l1);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$9(ARunnableS9S0201000_6 aRunnableS9S0201000_6) {
        switch (aRunnableS9S0201000_6.i2) {
            case 0:
                IWL.LJI((IWL) aRunnableS9S0201000_6.l0, (String) aRunnableS9S0201000_6.l1);
                return;
            default:
                AbsDownloadService this$0 = (AbsDownloadService) aRunnableS9S0201000_6.l0;
                Object obj = aRunnableS9S0201000_6.l1;
                o.LJIIIZ(this$0, "this$0");
                List list = (List) ((LinkedHashMap) this$0.LJLILLLLZI).get(Integer.valueOf(Binder.getCallingPid()));
                if (list == null) {
                    list = new ArrayList();
                    this$0.LJLILLLLZI.put(Integer.valueOf(Binder.getCallingPid()), list);
                }
                list.add(obj);
                return;
        }
    }

    public ARunnableS9S0201000_6(String str, Runnable runnable, int i) {
        this.$t = i;
        this.i2 = 1;
        this.l0 = str;
        this.l1 = runnable;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS9S0201000_6(int r2, java.lang.Object r3, java.lang.Object r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i2 = r2
            r0.l0 = r3
            r0.l1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.i2 = r2
            r0.l1 = r3
            r0.l0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S0201000_6.<init>(int, java.lang.Object, java.lang.Object, int):void");
    }

    public ARunnableS9S0201000_6(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
