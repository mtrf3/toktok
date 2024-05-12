package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AnonymousClass668;
import X.C157226Fa;
import X.C16880lQ;
import X.C1DH;
import X.C221108m2;
import X.C2308694g;
import X.C2R5;
import X.C37297EkP;
import X.C38499F9b;
import X.C41658GWo;
import X.C43212Gxc;
import X.C44172HVg;
import X.C45848Hz2;
import X.C5HC;
import X.C62822Ol8;
import X.C6FB;
import X.GBT;
import X.GGS;
import X.HEO;
import X.HXF;
import X.HXW;
import X.I2K;
import X.InterfaceC144185lG;
import X.InterfaceC165686eq;
import X.InterfaceC165696er;
import X.InterfaceC42675Gox;
import X.InterfaceC44086HRy;
import X.InterfaceC45540Hu4;
import X.InterfaceC45601Hv3;
import X.InterfaceC51123K4p;
import X.InterfaceC82086WJm;
import X.QD3;
import X.U1F;
import Y.ARunnableS43S0100000_7;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes8.dex */
public abstract class TikTokCameraBaseGroupScene extends RecordSessionScene implements InterfaceC45540Hu4, InterfaceC165696er, HXW, InterfaceC44086HRy, InterfaceC45601Hv3, InterfaceC165686eq, InterfaceC42675Gox {
    public final List<C5HC> LJLLILLLL = new ArrayList();
    public final List<InterfaceC144185lG> LJLLJ = new ArrayList();
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 297));
    public final I2K LJLLLL = new I2K();

    @Override // X.AbstractC42651GoZ
    public final boolean LLJJIJIIJIL() {
        return true;
    }

    public abstract void LLLII(MvChoosePhotoScene mvChoosePhotoScene);

    public abstract void LLLIIII();

    public abstract InterfaceC82086WJm LLLIIIL();

    public abstract C45848Hz2 LLLIILIL();

    public abstract ShortVideoContext LLLILZ();

    public abstract void LLLILZLLLI(boolean z, boolean z2);

    public abstract void LLLIZZ();

    public abstract void LLLJ();

    @Override // X.HXW
    public String getTag() {
        return "VideoRecordNewActivity";
    }

    public abstract void onEvent(C2R5 c2r5);

    public abstract void receiveToast(HXF hxf);

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, X.AbstractC42651GoZ
    public final void LLJJI() {
        String str;
        Serializable serializable;
        Serializable serializable2;
        MicroAppModel microAppModel;
        Bundle bundle = this.mArguments;
        if (bundle == null || (str = bundle.getString("backurl")) == null) {
            str = "";
        }
        if (bundle != null) {
            serializable = bundle.getSerializable("micro_app_info");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            if (bundle != null) {
                serializable2 = bundle.getSerializable("micro_app_info");
            } else {
                serializable2 = null;
            }
            if ((serializable2 instanceof MicroAppModel) && (microAppModel = (MicroAppModel) serializable2) != null) {
                HEO miniAppService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService();
                String str2 = microAppModel.appId;
                miniAppService.getClass();
                C38499F9b.LIZ.LIZIZ().tryMoveMiniAppActivityToFront(str2);
            }
        }
        super.LLJJI();
        if (LLLIILIL() != null) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                LLLIIII();
            } else {
                C1DH.LJJIJIIJI(new ARunnableS43S0100000_7(this, 45));
            }
        }
        if (!TextUtils.isEmpty(str) && ((bundle == null || bundle.getSerializable("micro_app_info") == null) && !TextUtils.isEmpty(str) && !TextUtils.equals("__BACKURL__", str))) {
            try {
                Uri parse = UriProtector.parse(str);
                Intent intent = new Intent();
                intent.setData(parse);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
                Activity activity = this.mActivity;
                if (activity != null) {
                    activity.startActivityIfNeeded(intent, -1);
                    activity.moveTaskToBack(true);
                }
            } catch (Exception unused) {
            }
        }
        C41658GWo.LIZLLL().LJFF();
    }

    @Override // X.AbstractC42651GoZ
    public final int LLJJIII() {
        return C2308694g.LIZ(this.mArguments);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final C43212Gxc LLJZIJLIL() {
        GGS.LIZ.getClass();
        return GGS.LJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIIIIL() {
        /*
            r7 = this;
            android.app.Activity r2 = r7.mActivity
            if (r2 != 0) goto L5
            return
        L5:
            android.os.Bundle r1 = r7.mArguments
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.String r0 = "share_model"
            java.io.Serializable r3 = r1.getSerializable(r0)
        L10:
            boolean r0 = r3 instanceof X.C43722HDy
            if (r0 == 0) goto L31
            X.HDy r3 = (X.C43722HDy) r3
            if (r3 == 0) goto L32
            java.lang.String r1 = r3.mClientKey
        L1a:
            java.lang.String r0 = "clientKey"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.length()
            r6 = 1
            if (r0 != 0) goto L2f
            r0 = 1
        L27:
            java.lang.String r5 = "shoot_way"
            if (r0 == 0) goto L49
            java.lang.Class<X.Gle> r3 = X.C42470Gle.class
            monitor-enter(r3)
            goto L37
        L2f:
            r0 = 0
            goto L27
        L31:
            r3 = r4
        L32:
            java.lang.String r1 = ""
            goto L1a
        L35:
            r3 = r4
            goto L10
        L37:
            java.util.LinkedList<android.app.Activity> r1 = X.C42470Gle.LJFF     // Catch: java.lang.Throwable -> L46
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L46
            android.app.Activity[] r0 = new android.app.Activity[r0]     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Throwable -> L46
            android.app.Activity[] r0 = (android.app.Activity[]) r0     // Catch: java.lang.Throwable -> L46
            goto L5c
        L46:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L49:
            X.HEa r0 = X.C78934UyQ.LJLIL
            r0.getBridgeService()
            android.os.Bundle r0 = r7.mArguments
            if (r0 == 0) goto L56
            java.lang.String r4 = r0.getString(r5)
        L56:
            X.Hyi r0 = X.C45828Hyi.LJIILJJIL
            X.HE2.LIZIZ(r2, r4, r3, r0)
            goto L8c
        L5c:
            monitor-exit(r3)
            int r0 = r0.length
            if (r0 != r6) goto L89
            android.os.Bundle r0 = r7.mArguments
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.getString(r5)
            if (r0 == 0) goto L89
            android.os.Bundle r0 = r7.mArguments
            if (r0 == 0) goto L72
            java.lang.String r4 = r0.getString(r5)
        L72:
            java.lang.String r0 = "camera_shortcut"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L89
            android.content.Intent r1 = new android.content.Intent
            X.5UD r0 = X.C44172HVg.LIZJ
            r0.getClass()
            java.lang.Class<com.ss.android.ugc.aweme.splash.SplashActivity> r0 = com.ss.android.ugc.aweme.splash.SplashActivity.class
            r1.<init>(r2, r0)
            X.C16880lQ.LIZIZ(r2, r1)
        L89:
            r7.LLJJI()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene.LLLIIIIL():void");
    }

    @Override // X.InterfaceC45601Hv3
    public final InterfaceC51123K4p getInflater() {
        return (InterfaceC51123K4p) this.LJLLL.getValue();
    }

    public TikTokCameraBaseGroupScene() {
        LLJLLIL(GBT.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final C6FB LLLFF() {
        if (AnonymousClass668.LIZ()) {
            return C157226Fa.LIZ;
        }
        return super.LLLFF();
    }

    public final void LLLI() {
        ICreativeSAAService LIZ = SAAService.LIZ();
        if (LIZ != null) {
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            LIZ.invokeMethodsSafely(requireActivity, new AqS157S0100000_7(this, 298));
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(requireActivity(), "aweme://main");
        buildRoute.addFlags(268468224);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        C37297EkP.LIZIZ("record");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public void onResume() {
        super.onResume();
        C37297EkP.LIZJ("record");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    public void onActivityCreated(Bundle bundle) {
        U1F.LJFF(requireActivity(), LLJJIJI());
        super.onActivityCreated(bundle);
        C37297EkP.LIZ("record");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReceiveEvent(C2R5 c2r5) {
        onEvent(c2r5);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLILLLL).add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ListProtector.add(this.LJLLILLLL, 0, listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLJ).add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLILLLL).remove(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLJ).remove(listener);
    }

    @QD3(sticky = true)
    public final void onReceiveEvent(HXF hxf) {
        receiveToast(hxf);
    }

    @Override // X.AbstractC42651GoZ, X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it = ((ArrayList) this.LJLLILLLL).iterator();
        while (it.hasNext()) {
            if (((C5HC) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4 && onBackPressed()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC42651GoZ
    public final boolean LLJJL(int i, int i2, Intent intent) {
        Iterator it = ((ArrayList) this.LJLLJ).iterator();
        while (it.hasNext()) {
            if (((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC42651GoZ
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i == 1002 && i2 == -1) {
            ShortVideoContext LLLILZ = LLLILZ();
            if (LLLILZ != null && LLLILZ.microAppModel != null) {
                z = true;
            } else {
                z = false;
            }
            if (intent != null && C16880lQ.LLJJIJI(intent) != null && !z) {
                Intent intent2 = new Intent();
                Activity requireActivity = requireActivity();
                C44172HVg.LIZJ.getClass();
                intent2.setClass(requireActivity, SplashActivity.class);
                intent2.addFlags(67108864);
                Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                if (LLJJIJI != null) {
                    intent2.putExtras(LLJJIJI);
                    C16880lQ.LIZIZ(requireActivity(), intent2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LLJJI();
        }
    }
}
