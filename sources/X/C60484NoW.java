package X;

import Y.ARunnableS9S0210000_10;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.SparkContext;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.NoW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60484NoW extends AbstractC60482NoU implements GenericLifecycleObserver {
    public Activity LJLIL;
    public FrameLayout LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public SparkContext LJLJJI;
    public InterfaceC60761Nsz LJLJJL;
    public BottomSheetDialogFragment LJLJJLL;
    public boolean LJLJL;
    public final AtomicBoolean LJLJLJ;
    public final AtomicBoolean LJLJLLL;
    public final int LJLL;
    public EnumC40125Fov LJLLI;
    public long LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;

    @Override // X.AbstractC60482NoU
    public final void LIZ(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.AbstractC60482NoU
    public final void LIZIZ(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
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

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS getSparkView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            return sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        }
        o.LJIJI("sparkView");
        throw null;
    }

    public final FrameLayout getSparkViewContainer() {
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("sparkViewContainer");
        throw null;
    }

    @Override // X.AbstractC60482NoU
    public final boolean onBackPressed() {
        SparkContext sparkContext = this.LJLJJI;
        if (sparkContext != null && this.LJLLL) {
            C27737Aub.LIZLLL(sparkContext, this.LJLLI.getStatus(), this.LJLLJ);
            return false;
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.LJLJI != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(getSparkView());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC60761Nsz kitView;
        this.LJLJLJ.getAndSet(false);
        if (this.LJLJI != null && this.LJLJLLL.compareAndSet(true, true) && (kitView = getSparkView().getKitView()) != null) {
            kitView.onHide();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        InterfaceC60761Nsz kitView;
        this.LJLJLJ.getAndSet(true);
        if (this.LJLJI != null && this.LJLJLLL.compareAndSet(true, true) && (kitView = getSparkView().getKitView()) != null) {
            kitView.onShow();
        }
    }

    public final boolean getDraggable() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60484NoW(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLJLJ = new AtomicBoolean(false);
        this.LJLJLLL = new AtomicBoolean(false);
        this.LJLL = C63081OpJ.LJJJJLI(context);
        this.LJLLI = EnumC40125Fov.LOAD_INIT;
        this.LJLLJ = CardStruct.IStatusCode.DEFAULT;
        this.LJLLLL = true;
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

    public final void setDraggable(boolean z) {
        this.LJLLLL = z;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        o.LJIIIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "<set-?>");
        this.LJLJI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    public final void setSparkViewContainer(FrameLayout frameLayout) {
        o.LJIIIZ(frameLayout, "<set-?>");
        this.LJLILLLLZI = frameLayout;
    }

    public final void LIZLLL(ActivityC45651qj activityC45651qj, android.net.Uri uri, boolean z) {
        String str;
        setActivity(activityC45651qj);
        this.LJLLILLLL = System.currentTimeMillis();
        activityC45651qj.getLifecycle().addObserver(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        if (z) {
            marginLayoutParams.topMargin = this.LJLL;
        }
        setLayoutParams(marginLayoutParams);
        C16880lQ.LLLLIILL(activityC45651qj.getLayoutInflater(), R.layout.aoj, this, true);
        View findViewById = findViewById(R.id.k98);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.spark_view_container)");
        setSparkViewContainer((FrameLayout) findViewById);
        C60485NoX c60485NoX = new C60485NoX(this, (C73305Spp) findViewById(R.id.cyv), activityC45651qj);
        android.net.Uri LIZ = E98.LIZ(uri, "aweme");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        this.LJLJJI = sparkContext;
        String uri2 = LIZ.toString();
        o.LJIIIIZZ(uri2, "sparkUri.toString()");
        sparkContext.LJJIJLIJ(uri2);
        sparkContext.LJIL(c60485NoX);
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C40343FsR.LIZ(C40342FsQ.LIZ(activityC45651qj, sparkContext));
        LIZ2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setSparkView(LIZ2);
        getSparkViewContainer().addView(getSparkView());
        getSparkView().LIZIZ();
        getSparkView().post(new ARunnableS9S0210000_10(uri, this, z, 2));
        SparkContext sparkContext2 = this.LJLJJI;
        if (sparkContext2 != null && o.LJ(C115694gP.LIZ(sparkContext2.url), "fe_teu_lynx_order_center")) {
            this.LJLLL = true;
        }
        if (O3U.LJIILL("fe_teu_lynx_order_center")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJLLJ = str;
        SparkContext sparkContext3 = this.LJLJJI;
        if (sparkContext3 != null) {
            sparkContext3.LJJIIZ(str, "offline");
        }
    }
}
