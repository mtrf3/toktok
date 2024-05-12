package com.ss.android.ugc.aweme.search.pages.sug.core.ui;

import X.C04650Gf;
import X.C04740Go;
import X.C09G;
import X.C78570UsY;
import X.C78571UsZ;
import X.C79234V7u;
import X.C7MY;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SugLiveLottieDrawable extends Drawable implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final View LJLIL;
    public final C04740Go LJLILLLLZI;
    public final int LJLJI;
    public final Paint LJLJJI;
    public final float LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZ() {
        Lifecycle lifecycle;
        C04740Go c04740Go = this.LJLILLLLZI;
        C78571UsZ.LIZ = (int) c04740Go.LJLJI.LJLJJLL;
        c04740Go.stop();
        C04740Go c04740Go2 = this.LJLILLLLZI;
        c04740Go2.LJI();
        c04740Go2.invalidateSelf();
        this.LJLILLLLZI.setCallback(null);
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.LJLIL);
        if (LJIIIZ != null && (lifecycle = LJIIIZ.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    public final void LIZJ() {
        if (this.LJLJJLL || this.LJLJL) {
            C04740Go c04740Go = this.LJLILLLLZI;
            c04740Go.getClass();
            c04740Go.LJLJJL.clear();
            c04740Go.LJLJI.LJFF(true);
            return;
        }
        this.LJLILLLLZI.LJIJ();
    }

    public SugLiveLottieDrawable(View view) {
        Lifecycle lifecycle;
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        int LIZIZ = C7MY.LIZIZ(16);
        C04740Go c04740Go = new C04740Go();
        c04740Go.setCallback(new C78570UsY(this));
        c04740Go.LJIJI(C04650Gf.LIZLLL(view.getContext(), "sug_live_icon.json").LIZ);
        c04740Go.LJLJI.setRepeatCount(-1);
        c04740Go.LJIJJLI(C78571UsZ.LIZ + 1);
        this.LJLILLLLZI = c04740Go;
        int width = c04740Go.LJLILLLLZI.LJIIIIZZ.width();
        this.LJLJI = width;
        float f = width;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, f, Color.rgb(255, 23, 100), Color.rgb(237, 52, 149), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        this.LJLJJI = paint;
        this.LJLJJL = LIZIZ / f;
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        if (LJIIIZ != null && (lifecycle = LJIIIZ.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        setBounds(new Rect(0, 0, LIZIZ, LIZIZ));
    }

    public final void LIZIZ(boolean z) {
        this.LJLJL = !z;
        LIZJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float f = this.LJLJJL;
        canvas.scale(f, f);
        int i = this.LJLJI;
        canvas.drawRoundRect(0.0f, 0.0f, i, i, i * 0.1875f, i * 0.1875f, this.LJLJJI);
        this.LJLILLLLZI.draw(canvas);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZIZ(this, owner);
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZJ(this, owner);
        this.LJLJJLL = true;
        LIZJ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZLLL(this, owner);
        this.LJLJJLL = false;
        LIZJ();
    }
}
