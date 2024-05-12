package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.54D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54D extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final int LJLJJI;
    public NLETrackSlot LJLJJL;
    public C54C LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LJLIL.getValue()).booleanValue();
    }

    public final OSZ<Float, Float> getAudioSelectFramePosition() {
        return new OSZ<>(Float.valueOf(((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().left), Float.valueOf(((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().right));
    }

    private final int getAudioTrackEndPadding() {
        if (LIZLLL()) {
            return getAudioTrackLeftPadding();
        }
        return getAudioTrackRightPadding();
    }

    private final int getAudioTrackStartPadding() {
        if (LIZLLL()) {
            return getAudioTrackRightPadding();
        }
        return getAudioTrackLeftPadding();
    }

    public final long getAudioSelectFrameEndTime() {
        float f;
        C54Y c54y = (C54Y) LIZ(R.id.a_b);
        if (c54y != null) {
            f = c54y.getScale();
        } else {
            f = this.LJLJI;
        }
        return getAudioSelectFrameStartTime() + O6R.LJJIJ((((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().width() / f) * 1000);
    }

    public final long getAudioSelectFrameStartTime() {
        int i;
        float f;
        float audioTrackStartPadding;
        View LIZ = LIZ(R.id.a_e);
        if (LIZ != null) {
            i = LIZ.getScrollX();
        } else {
            i = 0;
        }
        C54Y c54y = (C54Y) LIZ(R.id.a_b);
        if (c54y != null) {
            f = c54y.getScale();
        } else {
            f = this.LJLJI;
        }
        float f2 = ((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().left;
        float f3 = ((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().right;
        float LIZIZ = LIZIZ(f);
        float f4 = i;
        if (LIZLLL()) {
            audioTrackStartPadding = ((LIZIZ - f4) - f3) - getAudioTrackStartPadding();
        } else {
            audioTrackStartPadding = (f4 + f2) - getAudioTrackStartPadding();
        }
        return O6R.LJJIJ((audioTrackStartPadding / f) * 1000);
    }

    public final int getAudioTrackLeftPadding() {
        C130585Ao c130585Ao = (C130585Ao) LIZ(R.id.a_e);
        if (c130585Ao != null) {
            return c130585Ao.getRootPadding().getFirst().intValue();
        }
        return 0;
    }

    public final int getAudioTrackRightPadding() {
        C130585Ao c130585Ao = (C130585Ao) LIZ(R.id.a_e);
        if (c130585Ao != null) {
            return c130585Ao.getRootPadding().getSecond().intValue();
        }
        return 0;
    }

    public final int getAudioTrackTotalPadding() {
        C130585Ao c130585Ao = (C130585Ao) LIZ(R.id.a_e);
        if (c130585Ao != null) {
            return c130585Ao.getRootPadding().getSecond().intValue() + c130585Ao.getRootPadding().getFirst().intValue();
        }
        return 0;
    }

    public final float getSelectFrameClipLeftBound() {
        int i;
        int audioTrackLeftPadding = getAudioTrackLeftPadding();
        View LIZ = LIZ(R.id.a_e);
        if (LIZ != null) {
            i = LIZ.getScrollX();
        } else {
            i = 0;
        }
        return Math.max(audioTrackLeftPadding - i, this.LJLILLLLZI);
    }

    public final float getSelectFrameClipRightBound() {
        int i;
        float f;
        int audioTrackRightPadding = getAudioTrackRightPadding();
        float f2 = this.LJLJJI - this.LJLILLLLZI;
        View LIZ = LIZ(R.id.a_e);
        if (LIZ != null) {
            i = LIZ.getScrollX();
        } else {
            i = 0;
        }
        C54Y c54y = (C54Y) LIZ(R.id.a_b);
        if (c54y != null) {
            f = c54y.getScale();
        } else {
            f = 0.0f;
        }
        return Math.min((LIZIZ(f) - i) - audioTrackRightPadding, f2);
    }

    public final C54C getAudioSelectFrameClipListener() {
        return this.LJLJJLL;
    }

    public final float LIZIZ(float f) {
        NLESegment nLESegment;
        long duration;
        NLETrackSlot nLETrackSlot = this.LJLJJL;
        if (nLETrackSlot != null) {
            nLESegment = nLETrackSlot.LJI();
        } else {
            nLESegment = null;
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
        if (LIZLLL != null) {
            if (LIZLLL.LIZIZ().getDuration() == 0) {
                duration = LIZLLL.LJIIL() - LIZLLL.LJIILIIL();
            } else {
                duration = LIZLLL.LIZIZ().getDuration();
            }
            return (((((float) duration) / LIZLLL.getAbsSpeed()) / 1000) * f) + getAudioTrackTotalPadding();
        }
        return 0.0f;
    }

    public final void LIZJ(float f) {
        NLESegment nLESegment;
        long j;
        int i;
        float f2;
        float f3;
        NLETrackSlot nLETrackSlot = this.LJLJJL;
        if (nLETrackSlot != null) {
            nLESegment = nLETrackSlot.LJI();
        } else {
            nLESegment = null;
        }
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
        if (LIZLLL != null) {
            NLETrackSlot nLETrackSlot2 = this.LJLJJL;
            if (nLETrackSlot2 != null) {
                j = nLETrackSlot2.getDuration();
            } else {
                j = 0;
            }
            float f4 = ((float) (j / 1000)) * f;
            View LIZ = LIZ(R.id.a_e);
            if (LIZ != null) {
                i = LIZ.getScrollX();
            } else {
                i = 0;
            }
            float LJIILIIL = (((((float) LIZLLL.LJIILIIL()) / LIZLLL.getAbsSpeed()) / 1000) * f) + getAudioTrackStartPadding();
            if (LIZLLL()) {
                f2 = (LIZIZ(f) - LJIILIIL) - i;
            } else {
                f2 = LJIILIIL - i;
            }
            C54Y c54y = (C54Y) LIZ(R.id.a_b);
            if (c54y != null) {
                RectF selectFrameRect = c54y.getSelectFrameRect();
                if (LIZLLL()) {
                    f3 = f2 - f4;
                } else {
                    f3 = f2;
                }
                selectFrameRect.left = f3;
                RectF selectFrameRect2 = c54y.getSelectFrameRect();
                if (!LIZLLL()) {
                    f2 += f4;
                }
                selectFrameRect2.right = f2;
                c54y.setScale(f);
                c54y.invalidate();
            }
            C130585Ao c130585Ao = (C130585Ao) LIZ(R.id.a_e);
            if (c130585Ao != null) {
                c130585Ao.LJLJJLL.setOutScrollX(i);
            }
            C130585Ao c130585Ao2 = (C130585Ao) LIZ(R.id.a_e);
            if (c130585Ao2 != null) {
                c130585Ao2.LIZ(((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().left, ((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().width(), getAudioTrackLeftPadding());
            }
        }
    }

    public final void setAudioScrollListener(C55N listener) {
        o.LJIIIZ(listener, "listener");
        ((C130585Ao) LIZ(R.id.a_e)).setScrollLister$tools_camera_edit_release(listener);
    }

    public final void setAudioSelectFrameClipListener(C54C c54c) {
        this.LJLJJLL = c54c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJL = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 835));
        this.LJLILLLLZI = C134845Qy.LIZ(42.0f);
        this.LJLJI = C134845Qy.LIZ(34.0f) / 1000.0f;
        this.LJLJJI = C134845Qy.LIZJ(C58S.LIZ());
        boolean z = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.as8, this, true) instanceof ViewGroup;
        ((C54Y) LIZ(R.id.a_b)).setOnMoveDownListener(new AqS168S0100000_2(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        ((C54Y) LIZ(R.id.a_b)).setOnMoveListener(new AqS184S0100000_2(this, 67));
        ((C54Y) LIZ(R.id.a_b)).setOnMoveUpListener(new AqS168S0100000_2(this, 501));
    }

    public final void LJ(float f, float f2) {
        C54Y c54y = (C54Y) LIZ(R.id.a_b);
        float f3 = f2 - f;
        c54y.getSelectFrameRect().left = f;
        c54y.getSelectFrameRect().right = f2;
        if (c54y.getSelectFrameRect().left < getSelectFrameClipLeftBound()) {
            c54y.getSelectFrameRect().left = getSelectFrameClipLeftBound();
            c54y.getSelectFrameRect().right = getSelectFrameClipLeftBound() + f3;
            Context context = c54y.getContext();
            o.LJIIIIZZ(context, "context");
            new C61996OUu(context).LIZ(3);
        }
        if (c54y.getSelectFrameRect().right > getSelectFrameClipRightBound()) {
            c54y.getSelectFrameRect().right = getSelectFrameClipRightBound();
            c54y.getSelectFrameRect().left = getSelectFrameClipRightBound() - f3;
            Context context2 = c54y.getContext();
            o.LJIIIIZZ(context2, "context");
            new C61996OUu(context2).LIZ(3);
        }
        c54y.invalidate();
        ((C130585Ao) LIZ(R.id.a_e)).LIZ(((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().left, ((C54Y) LIZ(R.id.a_b)).getSelectFrameRect().width(), getAudioTrackLeftPadding());
    }
}
