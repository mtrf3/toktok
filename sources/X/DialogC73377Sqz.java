package X;

import Y.ACListenerS32S0100000_12;
import Y.AObserverS80S0100000_12;
import Y.IDObjectS183S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.views.IDlS64S0100000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Sqz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC73377Sqz extends OOS implements LifecycleOwner {
    public final ActivityC45651qj LJLJLLL;
    public final C44340Hai LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public boolean LJLLLL;

    public final C73381Sr3 LJJ() {
        return (C73381Sr3) this.LJLLJ.getValue();
    }

    public final C85193Vz LJJI() {
        return (C85193Vz) this.LJLLILLLL.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LJLLI.getValue();
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onStop() {
        ((LifecycleRegistry) this.LJLLI.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        super.onStop();
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        View view;
        Window window = getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        KeyboardUtils.LIZIZ(view);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((LifecycleRegistry) this.LJLLI.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        LJJI().LJIIIIZZ.LIZIZ(null);
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ((LifecycleRegistry) this.LJLLI.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        super.onCreate(bundle);
        setContentView(R.layout.ko);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setLayout(-1, -1);
            window.setSoftInputMode(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.a4p;
            }
        }
        if (!C1B8.LIZJ()) {
            findViewById(R.id.gb4).setVisibility(0);
            C16880lQ.LJIJI((TextView) findViewById(R.id.k0f), new ACListenerS32S0100000_12(this, 11));
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.gmc);
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, new ACListenerS32S0100000_12(this, 8));
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                LTT.LJFF(window2, -16777216, false);
            }
            TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.gmc);
            if (tuxIconView2 != null) {
                C16880lQ.LJJJ(tuxIconView2, new ACListenerS32S0100000_12(this, 9));
            }
            ((TextView) findViewById(R.id.jdh)).setHint(R.string.ju_);
            findViewById(R.id.jdh).setOnKeyListener(new ViewOnKeyListenerC73376Sqy(this));
            ((TextView) findViewById(R.id.jdh)).addTextChangedListener(new IDObjectS183S0100000_12(this, 0));
            C16880lQ.LJIILL((ImageButton) findViewById(R.id.be9), new ACListenerS32S0100000_12(this, 10));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ggt);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(LJJ());
            recyclerView.LJIIJJI(new C73378Sr0(this, recyclerView.getContext()));
            LJJ().setShowFooter(true);
            LJJ().setLoadEmptyText("");
            LJJ().setLoadMoreListener(new AqS162S0100000_12(this, 20));
            C16880lQ.LJJIZ((SY4) findViewById(R.id.m99), new IDlS64S0100000_12(this, 0));
            if (!this.LJLL.LIZ) {
                ((TextView) findViewById(R.id.m99)).setText(R.string.r79);
            }
            C73375Sqx c73375Sqx = (C73375Sqx) this.LJLLL.getValue();
            c73375Sqx.LIZ.LJFF();
            c73375Sqx.LIZ.setVisibility(0);
            c73375Sqx.LJI.LIZ.observe(c73375Sqx.LJFF, new AObserverS80S0100000_12(c73375Sqx, 5));
            c73375Sqx.LJI.LIZJ.observe(c73375Sqx.LJFF, new AObserverS80S0100000_12(c73375Sqx, 6));
            C85193Vz.LIZIZ(LJJI(), false, C3W0.LJLIL, 1);
            LJJI().LIZ.observe(this, new AObserverS80S0100000_12(this, 7));
            LJJI().LIZIZ.observe(this, new AObserverS80S0100000_12(this, 8));
            LJJI().LIZJ.observe(this, new AObserverS80S0100000_12(this, 9));
        }
        findViewById(R.id.btz).getLayoutParams().height = O6R.LJJIIZ(C60996Nwm.LJ(getContext()) * 0.65f);
        findViewById(R.id.btz).requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC73377Sqz(ActivityC45651qj activity, AqS60S1100000_7 aqS60S1100000_7) {
        super(activity, R.style.a4q);
        o.LJIIIZ(activity, "activity");
        this.LJLJLLL = activity;
        C44340Hai c44340Hai = new C44340Hai();
        this.LJLL = c44340Hai;
        aqS60S1100000_7.invoke(c44340Hai);
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 21));
        this.LJLLILLLL = C221108m2.LIZIZ(C69462o2.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 19));
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 22));
    }
}
