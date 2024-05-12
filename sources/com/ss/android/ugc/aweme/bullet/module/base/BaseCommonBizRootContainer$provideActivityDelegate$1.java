package com.ss.android.ugc.aweme.bullet.module.base;

import X.C58909NAb;
import X.C59614NaU;
import X.C59832Ne0;
import X.C86298Xtu;
import X.KL2;
import X.NH3;
import X.OHQ;
import X.ViewOnClickListenerC59660NbE;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.business.WalletBusiness;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class BaseCommonBizRootContainer$provideActivityDelegate$1 extends CommonBizActivityDelegate {
    public final /* synthetic */ BaseCommonBizRootContainer LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public BaseCommonBizRootContainer$provideActivityDelegate$1(BaseCommonBizRootContainer baseCommonBizRootContainer) {
        this.LJLILLLLZI = baseCommonBizRootContainer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r5.pauseTimers();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r6.LJII() != false) goto L15;
     */
    @Override // X.C59551NYt, X.InterfaceC60180Njc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.app.Activity r8) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer r1 = r7.LJLILLLLZI
            java.lang.String r0 = "onPause"
            r1.LJIIIIZZ(r0)
            com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer r6 = r7.LJLILLLLZI
            X.NaU r5 = r6.LJLJLJ
            r3 = 0
            if (r5 == 0) goto L47
            r5.onPause()
            java.util.List<java.lang.String> r0 = r6.LJZI
            if (r0 == 0) goto L90
            X.KOz r0 = X.ORZ.LJLIIIL(r0)
            X.4g9 r0 = X.OJ4.LJJJJIZL(r0)
            X.4g8 r4 = new X.4g8
            r4.<init>(r0)
        L27:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            X.NaU r0 = r6.LJLJLJ
            r1 = 1
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L27
            boolean r0 = ujb.o.LJJJLIIL(r0, r2, r3)
            if (r0 != r1) goto L27
        L44:
            r5.pauseTimers()
        L47:
            com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer r0 = r7.LJLILLLLZI
            X.NUT r1 = r0.LJLILLLLZI
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness> r0 = com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r1 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness r1 = (com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness) r1
            if (r1 == 0) goto L5c
            com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer r0 = r7.LJLILLLLZI
            X.NaU r0 = r0.LJLJLJ
            r1.LJFF(r0, r3)
        L5c:
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.NUm r0 = X.NH3.LIZ()
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer r0 = r7.LJLILLLLZI
            android.app.Activity r1 = r0.LJLZ
            X.NaU r0 = r0.LJLJLJ
            X.C59832Ne0.LIZIZ(r1, r0)
        L70:
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer r4 = r7.LJLILLLLZI
            long r0 = r4.LJZL
            long r2 = r2 - r0
            r0 = 0
            r4.LJZL = r0
            java.lang.String r0 = "duration"
            X.7au r0 = X.C169696lJ.LJ(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "h5_stay_time"
            X.FMX.LJIIL(r0, r1)
            com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer r0 = r7.LJLILLLLZI
            r0.LJIIJ(r8)
            return
        L90:
            boolean r0 = r6.LJII()
            if (r0 == 0) goto L47
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer$provideActivityDelegate$1.LIZIZ(android.app.Activity):void");
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        EventBus.LIZJ().LJIJ(this.LJLILLLLZI);
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null) {
            C59832Ne0.LIZ(this.LJLILLLLZI.LJLJLJ);
        }
        this.LJLILLLLZI.LJIIIZ(activity);
        this.LJLILLLLZI.LJIIIIZZ("onDestroy");
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LIZLLL(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI.LJIIIIZZ("onResume");
        C59614NaU c59614NaU = this.LJLILLLLZI.LJLJLJ;
        if (c59614NaU != null) {
            c59614NaU.onResume();
            c59614NaU.resumeTimers();
        }
        this.LJLILLLLZI.LJLILLLLZI.LIZ(WalletBusiness.class);
        this.LJLILLLLZI.LJZL = System.currentTimeMillis();
        this.LJLILLLLZI.LJIIJJI(activity);
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI.LJIIIIZZ("onStop");
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LJII(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI.LJIIIIZZ("onStart");
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LJFF(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        this.LJLILLLLZI.LJLILLLLZI.LJIIIIZZ(activity);
        EventBus.LIZJ().LJIILJJIL(this.LJLILLLLZI);
        this.LJLILLLLZI.getClass();
        this.LJLILLLLZI.LJIIIIZZ("onCreate");
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE;
        o.LJIIIZ(activity, "activity");
        if (configuration == null || (viewOnClickListenerC59660NbE = this.LJLILLLLZI.LJLJL) == null) {
            return;
        }
        viewOnClickListenerC59660NbE.setLayoutParams(new FrameLayout.LayoutParams((int) KL2.LIZJ(activity, configuration.screenWidthDp), (int) KL2.LIZJ(activity, configuration.screenHeightDp)));
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LJI(Activity activity, int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(activity, i, grantResults);
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LJIIJ(Activity activity, int i, int i2, Intent intent) {
        o.LJIIIZ(activity, "activity");
        if (this.LJLILLLLZI.LJLILLLLZI.LIZ(WalletBusiness.class) != null) {
            WalletBusiness.LIZ(this.LJLILLLLZI.LJLLILLLL, i, i2, intent);
        }
    }
}
