package X;

import Y.IDRunnableS6S0101000;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC39751hD extends Dialog implements LifecycleOwner, C18I {
    public LifecycleRegistry LJLIL;
    public final OnBackPressedDispatcher LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.LJLIL;
        if (lifecycleRegistry == null) {
            LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
            this.LJLIL = lifecycleRegistry2;
            return lifecycleRegistry2;
        }
        return lifecycleRegistry;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.LJLILLLLZI.LIZJ();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        LifecycleRegistry lifecycleRegistry = this.LJLIL;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.LJLIL = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.LJLIL = null;
        super.onStop();
    }

    public final void LIZ() {
        Window window = getWindow();
        o.LJI(window);
        ViewTreeLifecycleOwner.set(window.getDecorView(), this);
        Window window2 = getWindow();
        o.LJI(window2);
        View decorView = window2.getDecorView();
        o.LJIIIIZZ(decorView, "window!!.decorView");
        decorView.setTag(R.id.nck, this);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        LifecycleRegistry lifecycleRegistry = this.LJLIL;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.LJLIL = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // X.C18I
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.LJLILLLLZI;
    }

    public DialogC39751hD(Context context) {
        super(context, 0);
        this.LJLILLLLZI = new OnBackPressedDispatcher(new IDRunnableS6S0101000(0, this, 2));
    }

    public static void LIZIZ(DialogC39751hD this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LifecycleRegistry lifecycleRegistry = this.LJLIL;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.LJLIL = lifecycleRegistry;
        }
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        o.LJIIIZ(view, "view");
        LIZ();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        LIZ();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(view, "view");
        LIZ();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(view, "view");
        LIZ();
        super.setContentView(view, layoutParams);
    }
}
