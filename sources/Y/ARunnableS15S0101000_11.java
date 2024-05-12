package Y;

import X.AbstractViewOnClickListenerC171846om;
import X.AlertDialogC45396Hrk;
import X.BJ9;
import X.C03880Dg;
import X.C0M7;
import X.C15480jA;
import X.C15680jU;
import X.C158056If;
import X.C16880lQ;
import X.C16970lZ;
import X.C1HQ;
import X.C36916EeG;
import X.C36922EeM;
import X.C37558Eoc;
import X.C37631Epn;
import X.C38354F3m;
import X.C38449F7d;
import X.C38891fp;
import X.C39519Ff9;
import X.C44847Hit;
import X.C45848Hz2;
import X.C48008Ism;
import X.C57022Lq;
import X.C57276Mds;
import X.C63077OpF;
import X.C63993P9p;
import X.C64214PIc;
import X.C64266PKc;
import X.C64398PPe;
import X.C65300Pk0;
import X.C65920Pu0;
import X.C65926Pu6;
import X.C65929Pu9;
import X.C65972Puq;
import X.C66063PwJ;
import X.C66083Pwd;
import X.C66089Pwj;
import X.C66090Pwk;
import X.C66091Pwl;
import X.C66092Pwm;
import X.C66093Pwn;
import X.C66097Pwr;
import X.C66138PxW;
import X.C66147Pxf;
import X.C66465Q6r;
import X.C66882QMs;
import X.C66Y;
import X.C67003QRj;
import X.C67004QRk;
import X.C67005QRl;
import X.C67016QRw;
import X.C77121UOn;
import X.C77413UZt;
import X.C78596Usy;
import X.C78983UzD;
import X.C82547WaV;
import X.C82622Wbi;
import X.C88117Yi9;
import X.DialogC57275Mdr;
import X.EVM;
import X.F67;
import X.F9J;
import X.FFM;
import X.FMW;
import X.HXE;
import X.IX8;
import X.InterfaceC38454F7i;
import X.InterfaceC46937IbV;
import X.InterfaceC65784Pro;
import X.InterfaceC66032Pvo;
import X.InterfaceC66041Pvx;
import X.InterfaceC66049Pw5;
import X.InterfaceC81454Vxy;
import X.LD6;
import X.LFG;
import X.LV0;
import X.PEL;
import X.PJC;
import X.PK0;
import X.PK8;
import X.PKB;
import X.PKG;
import X.PKL;
import X.PLI;
import X.PSY;
import X.QBN;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.W13;
import X.W17;
import X.X1D;
import X.Z8A;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.LocalServerSocket;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveDowngradeThreadMapSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchThreadPriorityOptSetting;
import com.bytedance.bae.router.AudioRouteDeviceManager;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.crash.CrashType;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.helios.api.HeliosService;
import com.bytedance.helios.apimonitor.CustomAnchorMonitorImpl;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.ies.actionai.jni.IExecutorRunnable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfNoiseEvaluateFilterImpl;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilterImpl;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AqS161S0100000_11;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes12.dex */
public class ARunnableS15S0101000_11 implements Runnable {
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
            case 15:
                run$15(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x040f, code lost:
    
        if (r3 != null) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0429  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0101000_11.LIZ$1():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        Object LIZLLL;
        boolean z;
        String valueOf;
        if ((PKB.LIZJ().LIZ == null && (PKG.LIZJ == null || !ALog.isInitSuccess())) || !C48008Ism.LIZJ(((PKL) this.l0).LIZ)) {
            int i = this.i1 - 1;
            this.i1 = i;
            if (i > 0) {
                C64214PIc.LIZ().LIZJ(this, 1000L);
                return;
            }
            return;
        }
        for (C64266PKc c64266PKc : ((PKL) this.l0).LIZLLL.values()) {
            c64266PKc.LJIILIIL = true;
            if (c64266PKc.LJIIJ == null && c64266PKc.LJIIIIZZ != -1 && ((!((ArrayList) c64266PKc.LIZIZ).isEmpty() || !((ArrayList) c64266PKc.LIZJ).isEmpty()) && !c64266PKc.LJIILJJIL)) {
                c64266PKc.LJIIJ = new ArrayList<>();
                Iterator it = ((ArrayList) c64266PKc.LIZIZ).iterator();
                String str = "null";
                while (it.hasNext()) {
                    PLI pli = (PLI) it.next();
                    if (!pli.LIZLLL) {
                        List<String> LIZ = PKB.LIZJ().LIZ(pli.LIZIZ, c64266PKc.LJIIJJI);
                        if (LIZ != null) {
                            c64266PKc.LJIIJ.addAll(LIZ);
                        }
                        if (!CrashType.LAUNCH.getName().equals(str)) {
                            str = pli.LJ.getName();
                        }
                    }
                }
                Iterator it2 = ((ArrayList) c64266PKc.LIZJ).iterator();
                while (it2.hasNext()) {
                    PLI pli2 = (PLI) it2.next();
                    if (!pli2.LIZLLL) {
                        List<String> LIZ2 = PKB.LIZJ().LIZ(pli2.LIZIZ, c64266PKc.LJIIJJI);
                        if (LIZ2 != null) {
                            c64266PKc.LJIIJ.addAll(LIZ2);
                        }
                        if (!CrashType.LAUNCH.getName().equals(str)) {
                            str = pli2.LJ.getName();
                        }
                    }
                }
                if (!c64266PKc.LJIILJJIL && !c64266PKc.LJIIJ.isEmpty() && c64266PKc.LJIILIIL) {
                    ArrayList<String> arrayList = c64266PKc.LJIIJ;
                    String str2 = c64266PKc.LJIIJJI;
                    C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(10302, "com/bytedance/crash/alog/AlogUploadManager", "uploadAlog", PKB.class, new Object[]{arrayList, str2}, "java.lang.String", new C65300Pk0(false, "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "-7496478943001955554"));
                    if (LIZJ.LIZ) {
                        LIZLLL = LIZJ.LIZIZ;
                    } else {
                        LIZLLL = PKB.LIZLLL(str2, arrayList);
                    }
                    String[] strArr = new String[6];
                    strArr[0] = "check_result";
                    strArr[1] = LIZLLL;
                    strArr[2] = "crash_type";
                    strArr[3] = str;
                    strArr[4] = "alog_inited";
                    int i2 = c64266PKc.LJII;
                    if (i2 == 0) {
                        valueOf = "uncertain";
                    } else {
                        if (i2 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        valueOf = String.valueOf(z);
                    }
                    strArr[5] = valueOf;
                    C63993P9p c63993P9p = new C63993P9p("alog_check");
                    PJC.LIZ(c63993P9p.LIZ, strArr);
                    c63993P9p.LIZJ();
                }
            }
            PKL pkl = (PKL) this.l0;
            pkl.getClass();
            if (!c64266PKc.LJIIL) {
                PK8.LIZJ(C78596Usy.LJIJI(pkl.LIZ, c64266PKc.LIZ));
                String str3 = c64266PKc.LIZ;
                Context context = PK0.LIZ;
                if (C78596Usy.LJLJLJ == null) {
                    C78596Usy.LJLJLJ = new File(C78596Usy.LJIIZILJ(context), "asdawd");
                }
                PK8.LIZJ(new File(C78596Usy.LJLJLJ, str3));
            }
        }
        ((PKL) this.l0).LIZLLL = null;
    }

    public static final void run$0(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        try {
            ComponentName componentName = new ComponentName((Context) aRunnableS15S0101000_11.l0, (Class<?>) WsChannelService.class);
            Intent intent = new Intent("com.bytedance.article.wschannel.appstate");
            intent.setComponent(componentName);
            intent.putExtra("app_state", aRunnableS15S0101000_11.i1);
            C16880lQ.LLLL((Context) aRunnableS15S0101000_11.l0, intent);
        } catch (Throwable unused) {
        }
    }

    public static final void run$1(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        Double d;
        switch (aRunnableS15S0101000_11.i1) {
            case 0:
                ((AbsAudienceInteractionFragment) aRunnableS15S0101000_11.l0).loadLike();
                return;
            case 1:
                ((LivePlayFragment) aRunnableS15S0101000_11.l0).LLLLIILLL = false;
                return;
            case 2:
                LFG lfg = (LFG) aRunnableS15S0101000_11.l0;
                lfg.LIZLLL.LIZLLL(new LD6(lfg));
                return;
            case 3:
                C77121UOn.LIZIZ().LIZLLL(((Aweme) aRunnableS15S0101000_11.l0).getVideo());
                return;
            case 4:
                ((View) aRunnableS15S0101000_11.l0).setVisibility(4);
                return;
            case 5:
                aRunnableS15S0101000_11.l0.getClass();
                if (!LiveWatchThreadPriorityOptSetting.INSTANCE.enableDowngradeThread()) {
                    return;
                }
                ThreadGroup threadGroup = C16880lQ.LLLLIIIILLL().getThreadGroup();
                ThreadGroup threadGroup2 = threadGroup;
                while (threadGroup != null) {
                    threadGroup2 = threadGroup;
                    threadGroup = threadGroup.getParent();
                }
                LinkedList linkedList = new LinkedList();
                if (threadGroup2 != null) {
                    int activeCount = (int) (threadGroup2.activeCount() * 1.5d);
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup2.enumerate(threadArr);
                    for (int i = 0; i < activeCount; i++) {
                        Thread thread = threadArr[i];
                        if (thread != null) {
                            linkedList.add(new C15480jA(thread));
                        }
                    }
                }
                Map<String, Double> value = LiveDowngradeThreadMapSetting.INSTANCE.getValue();
                if (value == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C15480jA c15480jA = (C15480jA) it.next();
                    if (!TextUtils.isEmpty(c15480jA.LIZ)) {
                        for (String str : value.keySet()) {
                            if (o.LJJJLIIL(c15480jA.LIZ, str, false) && (d = value.get(str)) != null) {
                                double doubleValue = d.doubleValue();
                                int i2 = c15480jA.LIZIZ;
                                if (c15480jA.LIZJ < doubleValue) {
                                    EVM.LIZ(i2, (int) doubleValue);
                                    ((ArrayList) C15680jU.LIZIZ).add(Integer.valueOf(i2));
                                }
                            }
                        }
                    }
                }
                return;
            case 6:
                Context context = (Context) aRunnableS15S0101000_11.l0;
                if (!C16970lZ.LIZIZ(context, "profile_fragment_user_mt")) {
                    C16970lZ.LJFF(context, "profile_fragment_user_mt");
                }
                if (!C16970lZ.LIZIZ(context, "profile_fragment_aweme_list_mus")) {
                    C16970lZ.LJFF(context, "profile_fragment_aweme_list_mus");
                    return;
                }
                return;
            default:
                BmfNoiseEvaluateFilterImpl.LIZ((BmfNoiseEvaluateFilterImpl) aRunnableS15S0101000_11.l0);
                return;
        }
    }

    public static final void run$10(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        boolean LIZ;
        try {
            C65920Pu0.LIZIZ.put(Integer.valueOf(aRunnableS15S0101000_11.i1), Boolean.FALSE);
            C65926Pu6.LIZIZ("Helios:Network-Invoke", new AqS161S0100000_11(aRunnableS15S0101000_11, 84), 0, null, 12);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        boolean LIZ;
        try {
            aRunnableS15S0101000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        String str;
        switch (aRunnableS15S0101000_11.i1) {
            case 1:
                HeliosEnvImpl heliosEnvImpl = (HeliosEnvImpl) aRunnableS15S0101000_11.l0;
                heliosEnvImpl.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                C65972Puq.LJ.onNewSettings(heliosEnvImpl.LJIIJ);
                C66138PxW.LIZJ.onNewSettings(heliosEnvImpl.LJIIJ);
                C66089Pwj.LIZIZ.onNewSettings(heliosEnvImpl.LJIIJ);
                C64398PPe.LIZ.onNewSettings(heliosEnvImpl.LJIIJ);
                C66083Pwd.LJIIIIZZ.onNewSettings(heliosEnvImpl.LJIIJ);
                Iterator it = heliosEnvImpl.LJIILL.iterator();
                while (true) {
                    C0M7 c0m7 = (C0M7) it;
                    if (c0m7.hasNext()) {
                        ((InterfaceC66032Pvo) c0m7.next()).onNewSettings(heliosEnvImpl.LJIIJ);
                    } else {
                        C65929Pu9.LIZ(currentTimeMillis, "HeliosEnvImpl.onNewSettings", true);
                        C1HQ c1hq = new C1HQ();
                        c1hq.put("debug", Boolean.valueOf(heliosEnvImpl.LJFF()));
                        for (String str2 : HeliosEnvImpl.LJIILLIIL) {
                            try {
                                InterfaceC66049Pw5 interfaceC66049Pw5 = (InterfaceC66049Pw5) Class.forName(str2).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                if (interfaceC66049Pw5 != null) {
                                    try {
                                        interfaceC66049Pw5.init(heliosEnvImpl.LJIIIIZZ, heliosEnvImpl.LJIILIIL, c1hq);
                                        if (interfaceC66049Pw5 instanceof HeliosService) {
                                            ((HeliosService) interfaceC66049Pw5).start();
                                        }
                                        heliosEnvImpl.LJIILL.add(interfaceC66049Pw5);
                                    } catch (Throwable th) {
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append("load ");
                                        LIZ.append(interfaceC66049Pw5);
                                        LIZ.append(" error: ");
                                        LIZ.append(th);
                                        C66063PwJ.LIZ("HeliosEnv", X1D.LIZIZ(LIZ), null);
                                    }
                                }
                            } catch (Exception e) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Fetch class error: ");
                                LIZ2.append(str2);
                                C66063PwJ.LIZJ("HeliosService", X1D.LIZIZ(LIZ2), e);
                            }
                        }
                        InterfaceC66041Pvx interfaceC66041Pvx = heliosEnvImpl.LJIILJJIL;
                        if (interfaceC66041Pvx != null) {
                            interfaceC66041Pvx.LIZ();
                        }
                        C65929Pu9.LIZ(currentTimeMillis, "HeliosEnvImpl.checkAllCommonEnvReady", true);
                        return;
                    }
                }
            case 2:
                C66090Pwk c66090Pwk = (C66090Pwk) aRunnableS15S0101000_11.l0;
                c66090Pwk.getClass();
                try {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("JsEngine_");
                    synchronized (C66093Pwn.class) {
                        if (!C66093Pwn.LIZIZ) {
                            C66093Pwn.LIZIZ = true;
                            try {
                                C66093Pwn.LIZ = C66093Pwn.LIZ();
                            } catch (IOException unused) {
                            }
                        }
                        str = C66093Pwn.LIZ;
                    }
                    LIZ3.append(str);
                    LIZ3.append("_devtools_remote");
                    c66090Pwk.LIZ = new LocalServerSocket(X1D.LIZIZ(LIZ3));
                    C66092Pwm c66092Pwm = c66090Pwk.LIZLLL;
                    IX8 ix8 = c66090Pwk.LJ;
                    c66092Pwm.getClass();
                    ix8.LIZIZ(new C37631Epn("/json"), c66092Pwm);
                    ix8.LIZIZ(new C37631Epn("/json/version"), c66092Pwm);
                    c66090Pwk.LIZJ = new C66097Pwr(c66090Pwk.LJ);
                    while (!Thread.interrupted()) {
                        C66091Pwl c66091Pwl = new C66091Pwl(c66090Pwk, c66090Pwk.LIZ.accept());
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("LocalSocketServer_WorkerThread_");
                        LIZ4.append(c66090Pwk.LIZIZ.incrementAndGet());
                        c66091Pwl.setName(X1D.LIZIZ(LIZ4));
                        c66091Pwl.setDaemon(true);
                        c66091Pwl.start();
                    }
                    return;
                } catch (IOException unused2) {
                    return;
                }
            case 3:
                CommentListFragment commentListFragment = (CommentListFragment) aRunnableS15S0101000_11.l0;
                commentListFragment.getClass();
                try {
                    Z8A z8a = Z8A.LIZIZ;
                    Aweme aweme = commentListFragment.LJLJI;
                    z8a.disLikeAweme(aweme, C63077OpF.LIZ(aweme));
                    return;
                } catch (Exception e2) {
                    C36922EeM.LIZ(e2);
                    return;
                }
            case 4:
                C77121UOn.LIZIZ().LIZLLL(((Aweme) aRunnableS15S0101000_11.l0).getVideo());
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aRunnableS15S0101000_11.l0;
                C45848Hz2 c45848Hz2 = videoRecordNewScene.LLIIIILZ;
                if (c45848Hz2 == null || c45848Hz2.getDiContainer() == null) {
                    C78983UzD.LJIILL("plan or diContainer can not be null");
                    return;
                }
                if (videoRecordNewScene.LLJJIJIIJIL) {
                    return;
                }
                videoRecordNewScene.LLJJIJIIJIL = true;
                C82622Wbi diContainer = videoRecordNewScene.LLIIIILZ.getDiContainer();
                ((W13) diContainer.LJ(W13.class, null)).jD();
                diContainer.LJII(HXE.class);
                diContainer.LJII(InterfaceC81454Vxy.class);
                return;
        }
    }

    public static final void run$13(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        UgAwemeActivitySetting ugAwemeActivitySetting;
        UgChannelPopup channelPopup;
        UrlModel resourceUrl;
        UgChannelPopup channelPopup2;
        UgChannelPopup channelPopup3;
        UgChannelPopup channelPopup4;
        UgChannelPopup channelPopup5;
        SharedPreferences LIZIZ;
        int i;
        switch (aRunnableS15S0101000_11.i1) {
            case 0:
                Context context = (Context) aRunnableS15S0101000_11.l0;
                kotlin.jvm.internal.o.LJIIIZ(context, "context");
                if (DialogC57275Mdr.LJLJI) {
                    DialogC57275Mdr.LJLJI = false;
                    return;
                }
                LV0 lv0 = LV0.LJII;
                lv0.LJFF = false;
                UgChannelPopup ugChannelPopup = null;
                if (!LV0.LJI || !lv0.LJFF() || !lv0.LJIIIZ()) {
                    return;
                }
                try {
                    UgAwemeActivitySetting ugAwemeActivitySetting2 = lv0.LIZ;
                    if (ugAwemeActivitySetting2 != null && (channelPopup5 = ugAwemeActivitySetting2.getChannelPopup()) != null) {
                        str = channelPopup5.getButtonText();
                    } else {
                        str = null;
                    }
                } catch (C158056If unused) {
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting3 = lv0.LIZ;
                if (ugAwemeActivitySetting3 != null && (channelPopup4 = ugAwemeActivitySetting3.getChannelPopup()) != null) {
                    str2 = channelPopup4.getContent();
                } else {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting4 = lv0.LIZ;
                if (ugAwemeActivitySetting4 != null && (channelPopup3 = ugAwemeActivitySetting4.getChannelPopup()) != null) {
                    str3 = channelPopup3.getTitle();
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting5 = lv0.LIZ;
                if (ugAwemeActivitySetting5 != null && (channelPopup2 = ugAwemeActivitySetting5.getChannelPopup()) != null) {
                    str4 = channelPopup2.getH5Link();
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting6 = lv0.LIZ;
                if (ugAwemeActivitySetting6 != null && (channelPopup = ugAwemeActivitySetting6.getChannelPopup()) != null && (resourceUrl = channelPopup.getResourceUrl()) != null) {
                    list = resourceUrl.getUrlList();
                } else {
                    list = null;
                }
                if (C38891fp.LJJI(list) || (ugAwemeActivitySetting = lv0.LIZ) == null) {
                    return;
                }
                ugChannelPopup = ugAwemeActivitySetting.getChannelPopup();
                if (ugChannelPopup == null) {
                    return;
                }
                if (!kotlin.jvm.internal.o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS28S0200000_9(ugChannelPopup, context, 4));
                    return;
                } else {
                    C57276Mds.LIZ(context, ugChannelPopup);
                    return;
                }
            default:
                Context context2 = (Context) aRunnableS15S0101000_11.l0;
                C77413UZt.LJI("method_push_start_load_config");
                C67003QRj LJFF = C67003QRj.LJFF();
                LJFF.getClass();
                SharedPreferences LIZIZ2 = F9J.LIZIZ(context2, 0, "push_setting");
                if (context2 != null && (LIZIZ = F9J.LIZIZ(context2, 0, "push_setting")) != null) {
                    if (!LJFF.LIZJ) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    LJFF.LJIILLIIL = LIZIZ.getInt("shut_push_on_stop_service", i);
                    LJFF.LJIILJJIL = LIZIZ.getInt("allow_settings_notify_enable", LJFF.LIZJ ? 1 : 0);
                    LJFF.LJIILL = LIZIZ.getBoolean("notify_enabled", true);
                    C67016QRw c67016QRw = C67016QRw.LIZIZ;
                    if (c67016QRw != null) {
                        LJFF.LIZ = LIZIZ.getString("uninstall_question_url", c67016QRw.LIZ.getDefaultUninstallQuestionUrl());
                        LJFF.LJIILIIL = LIZIZ.getInt("push_clear_switch", 1);
                        LJFF.LJ = LIZIZ.getString("aweme_push_config", "");
                        try {
                            JSONObject jSONObject = new JSONObject(LJFF.LJ);
                            jSONObject.optInt("float_window_show_time");
                            LJFF.LJIIL = jSONObject.optInt("oppo_unify_style");
                            LJFF.LJIILIIL = jSONObject.optInt("push_clear_switch", LJFF.LJIILIIL);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    } else {
                        throw new IllegalStateException("Please call holdService to initialize");
                    }
                }
                if (!((Boolean) C88117Yi9.LJII.getValue()).booleanValue() && LJFF.LIZLLL() != null) {
                    LJFF.LJIIIIZZ = LJFF.LIZLLL().getInt("keep_notify_count", 0);
                    LJFF.LJII = LJFF.LIZLLL().getInt("max_notify_count", 0);
                    LJFF.LJIIIZ = LJFF.LIZLLL().getInt("notify_fresh_period", 0);
                    C67004QRk c67004QRk = LJFF.LJIIJ;
                    String string = LJFF.LIZLLL().getString("notify_message_ids", "");
                    synchronized (c67004QRk) {
                        if (!C38354F3m.LJ(string)) {
                            Logger.debug();
                            try {
                                c67004QRk.LIZIZ.clear();
                                String[] split = string.split("@");
                                if (split != null) {
                                    for (String str5 : split) {
                                        C67005QRl c67005QRl = new C67005QRl();
                                        c67005QRl.LIZ(str5);
                                        c67004QRk.LIZ(c67005QRl);
                                    }
                                }
                            } catch (Exception e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                        }
                    }
                }
                if (!((Boolean) C88117Yi9.LIZLLL.getValue()).booleanValue()) {
                    C36916EeG LIZIZ3 = C36916EeG.LIZIZ(context2);
                    LIZIZ3.getClass();
                    LIZIZ3.LIZIZ = LIZIZ2.getString("tt_push_pop_window_rule", "");
                    LIZIZ3.LIZLLL();
                }
                C77413UZt.LJIIJ("method_push_start_load_config");
                return;
        }
    }

    public static final void run$14(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        switch (aRunnableS15S0101000_11.i1) {
            case 0:
                ((PublicScreenWidget) aRunnableS15S0101000_11.l0).LLIILII();
                return;
            case 1:
                BJ9.LJFF((BJ9) aRunnableS15S0101000_11.l0);
                return;
            case 2:
                aRunnableS15S0101000_11.l0.getClass();
                C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
                c66465Q6r.getClass();
                PSY.LIZIZ("CheckingState", C16880lQ.LLLZ("start stage: %d timeStamp: %d diff: %d", new Object[]{Long.valueOf(c66465Q6r.LJI.LIZ().longValue()), 0L, C44847Hit.LIZ(0L)}));
                return;
            case 3:
                ((InterfaceC65784Pro) aRunnableS15S0101000_11.l0).invoke();
                return;
            case 4:
                return;
            case 5:
                TuxIconView tuxIconView = ((CommentListFragment) aRunnableS15S0101000_11.l0).LLIIII;
                if (tuxIconView != null) {
                    tuxIconView.requestLayout();
                    return;
                }
                return;
            default:
                C82547WaV c82547WaV = (C82547WaV) aRunnableS15S0101000_11.l0;
                if (!c82547WaV.LJLLILLLL) {
                    c82547WaV.LLJJIII();
                    return;
                }
                return;
        }
    }

    public static final void run$15(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        switch (aRunnableS15S0101000_11.i1) {
            case 0:
                ACListenerS25S0100000_5 aCListenerS25S0100000_5 = (ACListenerS25S0100000_5) aRunnableS15S0101000_11.l0;
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(((PublicScreenWidget) aCListenerS25S0100000_5.l0).LLIIII.LIZ, new IDRunnableS6S0101000(1, aCListenerS25S0100000_5, 7));
                return;
            case 1:
                AudioRouteDeviceManager.lambda$semisugar$bluetoothScoDisconnectionForNormalMode$0((AudioRouteDeviceManager) aRunnableS15S0101000_11.l0);
                return;
            case 2:
                ((AuthorizeActivity) aRunnableS15S0101000_11.l0).finish();
                return;
            case 3:
                PhotoModule photoModule = (PhotoModule) aRunnableS15S0101000_11.l0;
                photoModule.LJLIL.y8(new C66882QMs(photoModule));
                return;
            case 4:
                try {
                    ((InterfaceC46937IbV) aRunnableS15S0101000_11.l0).LIZ();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                QBN.LIZ((QBN) aRunnableS15S0101000_11.l0);
                return;
            default:
                AlertDialogC45396Hrk.LIZ((AlertDialogC45396Hrk) aRunnableS15S0101000_11.l0);
                return;
        }
    }

    public static final void run$2(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        switch (aRunnableS15S0101000_11.i1) {
            case 0:
                ((LivePlayFragment) aRunnableS15S0101000_11.l0).hn("init");
                return;
            case 1:
                C77121UOn.LIZIZ().LIZLLL(((Aweme) aRunnableS15S0101000_11.l0).getVideo());
                return;
            case 2:
                aRunnableS15S0101000_11.l0.getClass();
                if (!LiveWatchThreadPriorityOptSetting.INSTANCE.enableDowngradeThread()) {
                    return;
                }
                Iterator it = ((ArrayList) C15680jU.LIZIZ).iterator();
                while (it.hasNext()) {
                    JatoXL.resetPriority(((Number) it.next()).intValue());
                }
                ((ArrayList) C15680jU.LIZIZ).clear();
                return;
            default:
                BmfVQScoreFilterImpl.LIZ((BmfVQScoreFilterImpl) aRunnableS15S0101000_11.l0);
                return;
        }
    }

    public static final void run$3(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        boolean LIZ;
        try {
            CustomAnchorMonitorImpl.INSTANCE.checkDevice((C66147Pxf) aRunnableS15S0101000_11.l0, aRunnableS15S0101000_11.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        switch (aRunnableS15S0101000_11.i1) {
            case 0:
                C66063PwJ.LIZIZ("Helios-Common-Env", ((HeliosEnvImpl) aRunnableS15S0101000_11.l0).LJIIJ.version);
                return;
            case 1:
                C37558Eoc c37558Eoc = (C37558Eoc) aRunnableS15S0101000_11.l0;
                if (c37558Eoc.LJIIL.isRunning()) {
                    c37558Eoc.LIZLLL(Boolean.FALSE, "");
                    return;
                } else {
                    c37558Eoc.LIZJ(c37558Eoc.LJIJ.LJFF);
                    return;
                }
            case 2:
                InterfaceC65784Pro block = (InterfaceC65784Pro) aRunnableS15S0101000_11.l0;
                kotlin.jvm.internal.o.LJIIIZ(block, "$block");
                block.invoke();
                return;
            case 3:
                DetailFragmentPanel.LJJJJJL((DetailFragmentPanel) aRunnableS15S0101000_11.l0);
                return;
            case 4:
                ((BaseListFragmentPanel) aRunnableS15S0101000_11.l0).lambda$partitionFrameExecPageSelected$5();
                return;
            case 5:
                C38449F7d c38449F7d = (C38449F7d) aRunnableS15S0101000_11.l0;
                c38449F7d.getClass();
                try {
                    Iterator<InterfaceC38454F7i> it = c38449F7d.LIZ.iterator();
                    while (it.hasNext()) {
                        InterfaceC38454F7i next = it.next();
                        if (next != null) {
                            next.onChanged();
                        }
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    C36922EeM.LJFF(e);
                    return;
                }
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) aRunnableS15S0101000_11.l0;
                videoRecordNewScene.getClass();
                new DefaultGesturePresenter(videoRecordNewScene.requireAppCompatActivity(), videoRecordNewScene, null, videoRecordNewScene.LLIIJI).LIZLLL(new W17(videoRecordNewScene.LLJI.e8().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) videoRecordNewScene.LLJI.sm0().getLayoutParams())), 1, 100);
                return;
        }
    }

    public static final void run$5(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        boolean LIZ;
        try {
            PEL pel = (PEL) aRunnableS15S0101000_11.l0;
            int i = pel.LIZIZ;
            if (i > -1 && i == 2) {
                int i2 = pel.LIZJ;
                int i3 = aRunnableS15S0101000_11.i1;
                if (i2 != i3) {
                    pel.LIZJ = i3;
                    pel.LIZLLL(i3);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        boolean LIZ;
        int i;
        try {
            VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = (VersionSafeCallbacks$UrlRequestStatusListener) aRunnableS15S0101000_11.l0;
            switch (aRunnableS15S0101000_11.i1) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                default:
                    throw new IllegalArgumentException("No request status found.");
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 6;
                    break;
                case 8:
                    i = 7;
                    break;
                case 9:
                    i = 8;
                    break;
                case 10:
                    i = 9;
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i = 10;
                    break;
                case 12:
                    i = 11;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    i = 12;
                    break;
                case 14:
                    i = 13;
                    break;
                case 15:
                    i = 14;
                    break;
            }
            versionSafeCallbacks$UrlRequestStatusListener.onStatus(i);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        boolean LIZ;
        try {
            aRunnableS15S0101000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e6 A[Catch: all -> 0x034e, TryCatch #8 {, blocks: (B:163:0x02e2, B:165:0x02e6, B:167:0x02ea, B:169:0x02ef, B:170:0x02fd, B:171:0x0304, B:173:0x0314, B:174:0x031c, B:177:0x031e, B:179:0x032a, B:180:0x0332, B:183:0x0334, B:185:0x033f, B:186:0x034c), top: B:162:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ea A[Catch: all -> 0x034e, TryCatch #8 {, blocks: (B:163:0x02e2, B:165:0x02e6, B:167:0x02ea, B:169:0x02ef, B:170:0x02fd, B:171:0x0304, B:173:0x0314, B:174:0x031c, B:177:0x031e, B:179:0x032a, B:180:0x0332, B:183:0x0334, B:185:0x033f, B:186:0x034c), top: B:162:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0314 A[Catch: all -> 0x034e, TryCatch #8 {, blocks: (B:163:0x02e2, B:165:0x02e6, B:167:0x02ea, B:169:0x02ef, B:170:0x02fd, B:171:0x0304, B:173:0x0314, B:174:0x031c, B:177:0x031e, B:179:0x032a, B:180:0x0332, B:183:0x0334, B:185:0x033f, B:186:0x034c), top: B:162:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031e A[Catch: all -> 0x034e, TryCatch #8 {, blocks: (B:163:0x02e2, B:165:0x02e6, B:167:0x02ea, B:169:0x02ef, B:170:0x02fd, B:171:0x0304, B:173:0x0314, B:174:0x031c, B:177:0x031e, B:179:0x032a, B:180:0x0332, B:183:0x0334, B:185:0x033f, B:186:0x034c), top: B:162:0x02e2 }] */
    /* JADX WARN: Type inference failed for: r0v100, types: [X.PaE] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.PaF] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.PaF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.PaC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$8(Y.ARunnableS15S0101000_11 r19) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0101000_11.run$8(Y.ARunnableS15S0101000_11):void");
    }

    public static final void run$9(ARunnableS15S0101000_11 aRunnableS15S0101000_11) {
        switch (aRunnableS15S0101000_11.i1) {
            case 0:
                ((LiveNewAudienceEndFragment) aRunnableS15S0101000_11.l0).LJLJJL.removeCallbacksAndMessages(null);
                return;
            case 1:
                aRunnableS15S0101000_11.l0.getClass();
                return;
            case 2:
                Dialog dialog = (Dialog) aRunnableS15S0101000_11.l0;
                dialog.getClass();
                try {
                    dialog.dismiss();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                IExecutorRunnable iExecutorRunnable = (IExecutorRunnable) aRunnableS15S0101000_11.l0;
                if (iExecutorRunnable == null) {
                    return;
                }
                iExecutorRunnable.run();
                return;
            case 4:
                C16880lQ.LLZILL(Toast.makeText(((View) aRunnableS15S0101000_11.l0).getContext(), "【Security】\nThe current JSB authentication has security risks!\nPlease implement the ISafeWebView interface of JsBridge2\n", 1));
                return;
            case 5:
                AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS15S0101000_11.l0;
                authorizeActivity.getClass();
                Intent intent = new Intent();
                intent.putExtra("platform", authorizeActivity.LJLJJLL);
                authorizeActivity.LLIIIJ(-1, intent);
                return;
            case 6:
                FFM ffm = (FFM) aRunnableS15S0101000_11.l0;
                ffm.getClass();
                try {
                    ffm.LJLIL.onChanged();
                    return;
                } catch (Throwable th) {
                    FMW.LIZLLL("SettingsManagerNotifyCallbackExperiment", "ConfigurationCallbacksWrapper", "onChanged", "", th);
                    Handler handler = C57022Lq.LIZ.LJLIL;
                    F67 f67 = ffm.LJLIL;
                    Objects.requireNonNull(f67);
                    handler.post(new ARunnableS14S0101000_10(4, f67, 2));
                    return;
                }
            case 7:
                ((C66Y) aRunnableS15S0101000_11.l0).LJZI.LIZJ();
                return;
            default:
                AbstractViewOnClickListenerC171846om this$0 = (AbstractViewOnClickListenerC171846om) aRunnableS15S0101000_11.l0;
                kotlin.jvm.internal.o.LJIIIZ(this$0, "this$0");
                this$0.LJLILLLLZI = true;
                return;
        }
    }

    public ARunnableS15S0101000_11(PKL pkl, int i) {
        this.$t = i;
        this.l0 = pkl;
        this.i1 = 100;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS15S0101000_11(android.content.Context r2, int r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i1 = r3
            r0.l0 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.i1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0101000_11.<init>(android.content.Context, int, int):void");
    }

    public ARunnableS15S0101000_11(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
