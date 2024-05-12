package X;

import X.C30870C9q;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdk.broadcast.VideoPreScheduleStatusChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.C9q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30870C9q extends View {
    public final Paint LJLIL;
    public C9T LJLILLLLZI;
    public LiveMode LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public ValueAnimator LJLJJLL;

    public final void LIZ() {
        Boolean bool;
        int i;
        LiveMode liveMode = this.LJLJI;
        Boolean bool2 = null;
        if (liveMode != null) {
            bool = Boolean.valueOf(C28509BGv.LJI(liveMode));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && this.LJLILLLLZI != C9T.DEFAULT) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
        LiveMode liveMode2 = this.LJLJI;
        if (liveMode2 != null) {
            bool2 = Boolean.valueOf(C28509BGv.LJI(liveMode2));
        }
        if (C29306Beo.LJJIFFI(bool2) && this.LJLILLLLZI == C9T.TESTING) {
            if (this.LJLJJLL == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(2.5f, 1.5f);
                ofFloat.setDuration(500L);
                ofFloat.setRepeatMode(2);
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 9));
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                this.LJLJJLL = ofFloat;
            }
            ValueAnimator valueAnimator = this.LJLJJLL;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } else {
            ValueAnimator valueAnimator2 = this.LJLJJLL;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        o.LJIIIZ(canvas, "canvas");
        float width = getWidth() / 2;
        C9T c9t = this.LJLILLLLZI;
        if (c9t == C9T.TESTING) {
            f = this.LJLJJI;
        } else {
            f = 2.5f;
        }
        C9T c9t2 = C9T.BAD_CONNECTION;
        if (c9t == c9t2) {
            i = R.color.za;
        } else {
            i = R.color.a4m;
        }
        int LIZIZ = C15380j0.LIZIZ(i);
        this.LJLIL.setStyle(Paint.Style.FILL);
        this.LJLIL.setColor(LIZIZ);
        canvas.drawCircle(width, width, C15380j0.LIZ(f), this.LJLIL);
        if (this.LJLILLLLZI == c9t2) {
            i2 = R.color.zb;
        } else {
            i2 = R.color.a4n;
        }
        int LIZIZ2 = C15380j0.LIZIZ(i2);
        this.LJLIL.setStyle(Paint.Style.STROKE);
        this.LJLIL.setStrokeWidth(C15380j0.LIZ(1.0f));
        this.LJLIL.setColor(LIZIZ2);
        canvas.drawCircle(width, width, C15380j0.LIZ(f + 0.5f), this.LJLIL);
        super.onDraw(canvas);
    }

    public final void setFragment(Fragment fragment) {
        Lifecycle lifecycle;
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(fragment);
        if (LJIILIIL != null) {
            LJIILIIL.ov0(fragment, VideoPreScheduleStatusChannel.class, new AqS171S0100000_5(this, 164));
            LJIILIIL.ov0(fragment, LiveModeChannel.class, new AqS171S0100000_5(this, 165));
        }
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.livesdk.broadcast.preview.util.PreviewRingView$setFragment$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    ValueAnimator valueAnimator = C30870C9q.this.LJLJJLL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30870C9q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = C6D8.LIZIZ(true);
        this.LJLILLLLZI = C9T.DEFAULT;
    }
}
