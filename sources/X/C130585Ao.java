package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130585Ao extends HorizontalScrollView {
    public NLETrackSlot LJLIL;
    public float LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final int LJLJJI;
    public final C5BK LJLJJL;
    public final C130685Ay LJLJJLL;
    public C55N LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public final Handler LJLL;

    public final OSZ<Integer, Integer> getRootPadding() {
        return new OSZ<>(Integer.valueOf(this.LJLJI.getPaddingLeft()), Integer.valueOf(this.LJLJI.getPaddingRight()));
    }

    public final float getPxPerMS() {
        return this.LJLILLLLZI;
    }

    public final C55N getScrollLister$tools_camera_edit_release() {
        return this.LJLJL;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0) {
            this.LJLJLJ = true;
        }
        int action = ev.getAction();
        if (action == 1 || action == 3) {
            this.LJLJLJ = false;
            this.LJLL.removeMessages(1);
            this.LJLL.sendEmptyMessageDelayed(1, 80L);
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        int action = ev.getAction();
        if (action == 1 || action == 3) {
            this.LJLJLJ = false;
            this.LJLL.removeMessages(1);
            this.LJLL.sendEmptyMessageDelayed(1, 80L);
        }
        return super.onTouchEvent(ev);
    }

    public final void setAudioNLETrackSlot(NLETrackSlot slot) {
        float f;
        o.LJIIIZ(slot, "slot");
        if (!C124574uj.LJJIJL(slot)) {
            return;
        }
        this.LJLIL = slot;
        this.LJLJI.removeAllViews();
        setSegment(slot);
        long j = 0;
        if (slot.LJI().LIZIZ().getDuration() == 0) {
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(slot.LJI());
            if (LIZLLL != null) {
                j = LIZLLL.LJIIL() - LIZLLL.LJIILIIL();
            }
        } else {
            j = slot.LJI().LIZIZ().getDuration();
        }
        setTimelineScale(this.LJLILLLLZI);
        setMinDrawRegionWidth(this.LJLJJI - this.LJLJI.getPaddingStart());
        String stickPointExtra = slot.getExtra("audio_stick_points");
        o.LJIIIIZZ(stickPointExtra, "stickPointExtra");
        setAllStickPoints(C67502ks.LIZ(stickPointExtra));
        NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(slot.LJI());
        if (LIZLLL2 != null) {
            f = LIZLLL2.getAbsSpeed();
        } else {
            f = 1.0f;
        }
        int i = (int) (((((float) j) / f) / 1000) * this.LJLILLLLZI);
        this.LJLJI.addView(this.LJLJJL, i, -1);
        this.LJLJI.addView(this.LJLJJLL, i, -1);
    }

    public final void setAudioTrackPaint(C5BJ paint) {
        o.LJIIIZ(paint, "paint");
        setPainter(paint);
    }

    public final void setPxPerMS(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setScrollLister$tools_camera_edit_release(C55N c55n) {
        this.LJLJL = c55n;
    }

    public final void setScrollState(int i) {
        if (this.LJLJLLL != i) {
            this.LJLJLLL = i;
            C55N c55n = this.LJLJL;
            if (c55n != null) {
                c55n.LIZ(i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.5Ak, X.5BK, android.view.View, X.5As] */
    public C130585Ao(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = C1300758p.LIZIZ();
        FrameLayout frameLayout = new FrameLayout(context);
        this.LJLJI = frameLayout;
        this.LJLJJI = C134845Qy.LIZJ(C58S.LIZ());
        ?? r1 = new C130545Ak(context) { // from class: X.5BK
            @Override // X.C130545Ak
            public final void LJIIJ() {
                setBgRadius(C134845Qy.LIZ(6.0f));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0);
                a1.LJFF(context, "context");
            }
        };
        r1.setId(R.id.ab6);
        r1.setDrawDivider(false);
        r1.setDrawLabel(false);
        r1.setItemSelected(false);
        r1.setNeedDrawStickPoint(true);
        r1.setNeedDrawGradientLayer(false);
        r1.setDrawStartDivider(false);
        r1.setDrawEndDivider(false);
        this.LJLJJL = r1;
        this.LJLJJLL = new C130685Ay(context);
        addView(frameLayout, 0, new FrameLayout.LayoutParams(-2, -1));
        C16880lQ.LJIILJJIL(frameLayout, new View.OnClickListener() { // from class: X.5C2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        this.LJLL = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.5BL
            public int LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message msg) {
                o.LJIIIZ(msg, "msg");
                if (msg.what != 1) {
                    return false;
                }
                int scrollY = C130585Ao.this.getScrollY();
                C130585Ao c130585Ao = C130585Ao.this;
                if (!c130585Ao.LJLJLJ && this.LJLIL == scrollY) {
                    this.LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
                    c130585Ao.setScrollState(0);
                } else {
                    this.LJLIL = scrollY;
                    c130585Ao.LJLL.removeMessages(1);
                    c130585Ao.LJLL.sendEmptyMessageDelayed(1, 80L);
                }
                return true;
            }
        });
    }

    public final void LIZ(float f, float f2, float f3) {
        this.LJLJJLL.setAnchorViewLeft(f);
        this.LJLJJLL.setAnchorViewWidth(f2);
        this.LJLJJLL.setMarginScrollLeft(f3);
        this.LJLJJLL.invalidate();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        setOutScrollX(Integer.valueOf(i));
        invalidate();
        this.LJLJJLL.setOutScrollX(i);
        this.LJLJJLL.invalidate();
        if (this.LJLJLJ) {
            setScrollState(1);
        } else {
            setScrollState(2);
            this.LJLL.removeMessages(1);
            this.LJLL.sendEmptyMessageDelayed(1, 80L);
        }
        C55N c55n = this.LJLJL;
        if (c55n != null) {
            c55n.LIZIZ();
        }
    }
}
