package com.ss.android.ugc.aweme.ecommerce.router;

import X.AbstractC60482NoU;
import X.ActivityC45651qj;
import X.C5H3;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.OC2;
import X.OC3;
import X.OC5;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class Strategy {
    public static final OC5 Companion = new OC5();
    public boolean excludeStatusBar;
    public final C5H3 fallbackView$delegate;
    public boolean isReconstructed;
    public final Strategy$lifecycleObserver$1 lifecycleObserver;
    public Uri originalUri;
    public final ActivityC45651qj theContext;
    public final AppCompatDialogFragment theFragment;
    public OC2 type;
    public Uri uri;

    /* JADX WARN: Multi-variable type inference failed */
    public Strategy() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final AbstractC60482NoU getFallbackView() {
        return (AbstractC60482NoU) this.fallbackView$delegate.getValue();
    }

    public void onBackPressed(InterfaceC65784Pro<C76800UCe> defaultAction) {
        o.LJIIIZ(defaultAction, "defaultAction");
        int i = OC3.LIZ[this.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                defaultAction.invoke();
                return;
            } else {
                defaultAction.invoke();
                return;
            }
        }
        AbstractC60482NoU fallbackView = getFallbackView();
        if (fallbackView != null && fallbackView.onBackPressed()) {
            return;
        }
        defaultAction.invoke();
    }

    public final void setType(OC2 oc2) {
        o.LJIIIZ(oc2, "<set-?>");
        this.type = oc2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 != null) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1, androidx.lifecycle.LifecycleObserver] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Strategy(X.ActivityC45651qj r3, androidx.appcompat.app.AppCompatDialogFragment r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.theContext = r3
            r2.theFragment = r4
            X.OC2 r0 = X.OC2.UNKNOWN
            r2.type = r0
            r0 = 1
            r2.excludeStatusBar = r0
            com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1 r1 = new com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1
            r1.<init>()
            r2.lifecycleObserver = r1
            if (r3 != 0) goto L30
            if (r4 == 0) goto L3d
        L19:
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            if (r0 == 0) goto L22
            r0.addObserver(r1)
        L22:
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 179(0xb3, float:2.51E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.fallbackView$delegate = r0
            return
        L30:
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            if (r0 == 0) goto L3a
            r0.addObserver(r1)
            goto L22
        L3a:
            if (r4 == 0) goto L22
            goto L19
        L3d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "At least one of theContext or theFragment should be initialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.router.Strategy.<init>(X.1qj, androidx.appcompat.app.AppCompatDialogFragment):void");
    }

    public void onRestoreInstanceState(Activity activity, Bundle bundle) {
        boolean z;
        AbstractC60482NoU fallbackView;
        o.LJIIIZ(activity, "activity");
        if (bundle != null) {
            z = bundle.getBoolean("tiktokec_fallback_is_reconstructed");
        } else {
            z = false;
        }
        this.isReconstructed = z;
        if (OC3.LIZ[this.type.ordinal()] == 1 && (fallbackView = getFallbackView()) != null) {
            fallbackView.LIZ(activity, bundle);
        }
    }

    public void onSaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC60482NoU fallbackView;
        o.LJIIIZ(activity, "activity");
        if (bundle != null) {
            bundle.putBoolean("tiktokec_fallback_is_reconstructed", true);
        }
        if (OC3.LIZ[this.type.ordinal()] == 1 && (fallbackView = getFallbackView()) != null) {
            fallbackView.LIZIZ(activity, bundle);
        }
    }

    public /* synthetic */ Strategy(ActivityC45651qj activityC45651qj, AppCompatDialogFragment appCompatDialogFragment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activityC45651qj, (i & 2) != 0 ? null : appCompatDialogFragment);
    }
}
