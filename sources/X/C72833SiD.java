package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.SiD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72833SiD extends C29701Eo implements GenericLifecycleObserver {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            boolean isAnimating = isAnimating();
            if (this.LJLJI) {
                this.LJLIL = isAnimating;
            }
            if (isAnimating) {
                pauseAnimation();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            if (this.LJLIL && this.LJLJI) {
                resumeAnimation();
            }
        }
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
        ComponentCallbacks2 LIZ = LIZ(this);
        if (LIZ instanceof LifecycleOwner) {
            ((LifecycleOwner) LIZ).getLifecycle().addObserver(this);
        }
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ComponentCallbacks2 LIZ = LIZ(this);
        if (LIZ instanceof LifecycleOwner) {
            ((LifecycleOwner) LIZ).getLifecycle().removeObserver(this);
        }
        C54339LUh.LIZ(this);
    }

    public final Activity LIZ(View view) {
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            o.LJIIIIZZ(context, "context.baseContext");
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // X.C29701Eo
    public void setComposition(C0GY composition) {
        o.LJIIIZ(composition, "composition");
        super.setComposition(composition);
        onVisibilityChanged(this, getVisibility());
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C72833SiD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C29701Eo, android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        try {
            getRepeatMode();
            if (isShown()) {
                if (!this.LJLJI) {
                    this.LJLJI = true;
                    if (!this.LJLILLLLZI && this.LJLIL) {
                        resumeAnimation();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.LJLJI) {
                return;
            }
            this.LJLJI = false;
            boolean isAnimating = isAnimating();
            if (!this.LJLILLLLZI) {
                this.LJLIL = isAnimating;
            }
            if (!isAnimating) {
                return;
            }
            pauseAnimation();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72833SiD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
