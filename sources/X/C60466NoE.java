package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NoE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60466NoE extends AbstractC60482NoU implements GenericLifecycleObserver {
    public Activity LJLIL;
    public BulletActivityWrapper LJLILLLLZI;
    public C60193Njp LJLJI;
    public InterfaceC40516FvE LJLJJI;
    public C59614NaU LJLJJL;
    public BottomSheetDialogFragment LJLJJLL;
    public boolean LJLJL;
    public final int LJLJLJ;
    public boolean LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    public final Activity getActivity() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            return activity;
        }
        o.LJIJI("activity");
        throw null;
    }

    public final BulletActivityWrapper getActivityWrapper() {
        BulletActivityWrapper bulletActivityWrapper = this.LJLILLLLZI;
        if (bulletActivityWrapper != null) {
            return bulletActivityWrapper;
        }
        o.LJIJI("activityWrapper");
        throw null;
    }

    public final C60193Njp getBulletContainerView() {
        C60193Njp c60193Njp = this.LJLJI;
        if (c60193Njp != null) {
            return c60193Njp;
        }
        o.LJIJI("bulletContainerView");
        throw null;
    }

    @Override // X.AbstractC60482NoU
    public final boolean onBackPressed() {
        return getActivityWrapper().LJIIL(getActivity());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        getBulletContainerView().release();
        ((ConcurrentHashMap) getBulletContainerView().getProviderFactory().LIZJ).clear();
    }

    public final boolean getDraggable() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60466NoE(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLJLJ = C63081OpJ.LJJJJLI(context);
        this.LJLJLLL = true;
    }

    @Override // X.AbstractC60482NoU
    public final void LIZJ(CommerceBottomSheetDialogFragment bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        this.LJLJJLL = bottomSheet;
    }

    public final void setActivity(Activity activity) {
        o.LJIIIZ(activity, "<set-?>");
        this.LJLIL = activity;
    }

    public final void setActivityWrapper(BulletActivityWrapper bulletActivityWrapper) {
        o.LJIIIZ(bulletActivityWrapper, "<set-?>");
        this.LJLILLLLZI = bulletActivityWrapper;
    }

    public final void setBulletContainerView(C60193Njp c60193Njp) {
        o.LJIIIZ(c60193Njp, "<set-?>");
        this.LJLJI = c60193Njp;
    }

    public final void setDraggable(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // X.AbstractC60482NoU
    public final void LIZ(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        getActivityWrapper().LJIIIIZZ(activity, bundle);
    }

    @Override // X.AbstractC60482NoU
    public final void LIZIZ(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        getActivityWrapper().LJIIIZ(activity, bundle);
    }

    public final void LIZLLL(ActivityC45651qj activityC45651qj, android.net.Uri uri, boolean z) {
        setActivity(activityC45651qj);
        activityC45651qj.getLifecycle().addObserver(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        if (z) {
            marginLayoutParams.topMargin = this.LJLJLJ;
        }
        setLayoutParams(marginLayoutParams);
        C16880lQ.LLLLIILL(activityC45651qj.getLayoutInflater(), R.layout.aoi, this, true);
        View findViewById = findViewById(R.id.b14);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.bullet_view)");
        setBulletContainerView((C60193Njp) findViewById);
        C73305Spp c73305Spp = (C73305Spp) findViewById(R.id.cyv);
        BulletActivityWrapper c60472NoK = new C60472NoK(activityC45651qj);
        c60472NoK.LJIILJJIL(activityC45651qj);
        setActivityWrapper(c60472NoK);
        getBulletContainerView().post(new RunnableC60465NoD(this, activityC45651qj, uri, z, c73305Spp));
    }
}
