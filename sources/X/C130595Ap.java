package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130595Ap extends HorizontalScrollView implements C56G {
    public final int LJLIL;
    public NLETrackSlot LJLILLLLZI;
    public final float LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public float LJLL;
    public Integer LJLLI;
    public InterfaceC130805Bk LJLLILLLL;
    public final float LJLLJ;
    public final float LJLLL;
    public final RelativeLayout LJLLLL;
    public final C130545Ak LJLLLLLL;
    public final C130605Aq LJLZ;
    public final C86941YAf LJZ;

    @Override // X.C56G
    public HorizontalScrollView getHorizontalScrollView() {
        return this;
    }

    @Override // X.C56G
    public int getCurTimePosition() {
        return this.LJLJLLL;
    }

    public final float getMaxTimeScale() {
        return this.LJLLL;
    }

    public final float getMinTimeScale() {
        return this.LJLLJ;
    }

    public float getPxPerMS() {
        return this.LJLJJI;
    }

    @Override // X.C56G
    public Integer getSelectedBeat() {
        return this.LJLLI;
    }

    public final void LIZ(NLETrackSlot nLETrackSlot) {
        int i;
        C130605Aq c130605Aq = this.LJLZ;
        float f = this.LJLJJI;
        c130605Aq.getClass();
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
        int i2 = 0;
        if (LIZLLL != null) {
            i = C78926UyI.LJJIZ(LIZLLL.LJIILIIL());
        } else {
            i = 0;
        }
        c130605Aq.LJLJL = i;
        NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
        if (LIZLLL2 != null) {
            i2 = C78926UyI.LJJIZ(LIZLLL2.LJIIL());
        }
        c130605Aq.LJLJLJ = i2;
        c130605Aq.LJLJJLL = c130605Aq.LJLJL * f;
        c130605Aq.LJLJJI = f;
        this.LJLLLLLL.setTimelineScale(this.LJLJJI);
        int rint = (int) Math.rint(this.LJLJJLL * this.LJLJJI);
        int LIZ = C134845Qy.LIZ(48.0f);
        if (this.LJLLLLLL.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = this.LJLLLLLL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = rint;
                layoutParams.height = LIZ;
            }
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(rint, LIZ);
            layoutParams2.width = rint;
            layoutParams2.height = LIZ;
            layoutParams2.setMarginStart(this.LJLIL);
            layoutParams2.setMarginEnd(this.LJLIL);
            this.LJLLLLLL.setLayoutParams(layoutParams2);
        }
        float f2 = C130605Aq.LJLLJ;
        int i3 = rint + ((int) (2 * f2));
        if (this.LJLZ.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams3 = this.LJLZ.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = i3;
                layoutParams3.height = C134845Qy.LIZ(12.0f);
            }
        } else {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i3, C134845Qy.LIZ(12.0f));
            layoutParams4.addRule(3, this.LJLLLLLL.getId());
            layoutParams4.topMargin = C134845Qy.LIZ(8.0f);
            int i4 = (int) f2;
            layoutParams4.setMarginStart(this.LJLIL - i4);
            layoutParams4.setMarginEnd(this.LJLIL - i4);
            this.LJLZ.setLayoutParams(layoutParams4);
        }
        this.LJLLLLLL.requestLayout();
        this.LJLZ.requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC130805Bk interfaceC130805Bk;
        if (motionEvent != null && motionEvent.getActionMasked() == 5) {
            this.LJZ.LIZJ(motionEvent, this);
            this.LJLJJL = true;
            return true;
        }
        this.LJLJJL = false;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent && (interfaceC130805Bk = this.LJLLILLLL) != null) {
            interfaceC130805Bk.LIZIZ();
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LJLJJL || ev.getPointerCount() >= 2) {
            return this.LJZ.LIZJ(ev, this);
        }
        return super.onTouchEvent(ev);
    }

    @Override // X.C56G
    public void setAudioNLETrackSlot(NLETrackSlot slot) {
        int i;
        o.LJIIIZ(slot, "slot");
        if (!C124574uj.LJJIJL(slot)) {
            return;
        }
        NLETrackSlot LIZ = NLETrackSlot.LIZ(slot.deepClone(true));
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(LIZ.LJI());
        if (LIZLLL != null) {
            LIZLLL.setSpeed(1.0f);
        }
        NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(LIZ.LJI());
        int i2 = 0;
        if (LIZLLL2 != null) {
            i = C78926UyI.LJJIZ(LIZLLL2.LJIILIIL());
        } else {
            i = 0;
        }
        this.LJLJL = i;
        NLESegmentAudio LIZLLL3 = NLESegmentAudio.LIZLLL(LIZ.LJI());
        if (LIZLLL3 != null) {
            i2 = C78926UyI.LJJIZ(LIZLLL3.LJIIL());
        }
        this.LJLJJLL = i2 - i;
        this.LJLJLLL = this.LJLJL;
        this.LJLILLLLZI = LIZ;
        this.LJLLLL.removeAllViews();
        this.LJLLLLLL.setSegment(LIZ);
        LIZ(LIZ);
        this.LJLLLL.addView(this.LJLLLLLL);
        this.LJLLLL.addView(this.LJLZ);
        this.LJLZ.postInvalidateDelayed(150L);
        this.LJLZ.setOnBeatClickListener(new AqS168S0100000_2(this, 513));
    }

    @Override // X.C56G
    public void setAudioTrackPaint(C5BJ paint) {
        o.LJIIIZ(paint, "paint");
        this.LJLLLLLL.setPainter(paint);
    }

    @Override // X.C56G
    public void setBeats(List<Integer> beats) {
        o.LJIIIZ(beats, "beats");
        this.LJLZ.setBeats(beats);
        C130605Aq c130605Aq = this.LJLZ;
        Integer LIZ = c130605Aq.LIZ(this.LJLJLLL);
        c130605Aq.LJLLILLLL = LIZ;
        this.LJLLI = LIZ;
        InterfaceC130805Bk interfaceC130805Bk = this.LJLLILLLL;
        if (interfaceC130805Bk != null) {
            interfaceC130805Bk.LIZLLL(LIZ);
        }
    }

    @Override // X.C56G
    public void setListener(InterfaceC130805Bk listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLILLLL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130595Ap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLIL = C134845Qy.LIZJ(C58S.LIZ()) / 2;
        this.LJLJI = C1300758p.LIZJ / 1000.0f;
        this.LJLJJI = C1300758p.LIZIZ();
        this.LJLL = 1000 / C1300758p.LIZ;
        this.LJLLJ = C1291054w.LJ().LJJJJI;
        this.LJLLL = C1291054w.LJ().LJJJJIZL;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.LJLLLL = relativeLayout;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C130545Ak c130545Ak = new C130545Ak(context2, null, 0);
        c130545Ak.setId(R.id.ab6);
        c130545Ak.setDrawDivider(false);
        c130545Ak.setDrawLabel(false);
        c130545Ak.setItemSelected(false);
        c130545Ak.setTimelineScale(this.LJLJJI);
        c130545Ak.setNeedDrawStickPoint(false);
        c130545Ak.setAudioBeatsUse(true);
        this.LJLLLLLL = c130545Ak;
        this.LJLZ = new C130605Aq(getContext());
        this.LJZ = new C86941YAf(new InterfaceC86942YAg() { // from class: X.5BB
            @Override // X.InterfaceC86942YAg
            public final void LIZ(View view, C86941YAf detector) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(detector, "detector");
            }

            @Override // X.InterfaceC86942YAg
            public final boolean LIZIZ(View view, C86941YAf detector) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(detector, "detector");
                float LIZIZ = detector.LIZIZ() * C130595Ap.this.LJLL;
                if (LIZIZ > C130595Ap.this.getMaxTimeScale()) {
                    LIZIZ = C130595Ap.this.getMaxTimeScale();
                }
                if (LIZIZ < C130595Ap.this.getMinTimeScale()) {
                    LIZIZ = C130595Ap.this.getMinTimeScale();
                }
                C130595Ap c130595Ap = C130595Ap.this;
                if (LIZIZ == c130595Ap.LJLL) {
                    return false;
                }
                c130595Ap.LJLL = LIZIZ;
                c130595Ap.LJLJJI = c130595Ap.LJLJI * LIZIZ;
                NLETrackSlot nLETrackSlot = c130595Ap.LJLILLLLZI;
                if (nLETrackSlot != null) {
                    c130595Ap.LIZ(nLETrackSlot);
                }
                C130595Ap c130595Ap2 = C130595Ap.this;
                int i = (int) (c130595Ap2.LJLJLLL * c130595Ap2.LJLJJI);
                if (c130595Ap2.getScrollX() != i) {
                    C130595Ap.this.scrollTo(i, 0);
                }
                return true;
            }

            @Override // X.InterfaceC86942YAg
            public final void LIZJ(View view, C86941YAf detector) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(detector, "detector");
                InterfaceC130805Bk interfaceC130805Bk = C130595Ap.this.LJLLILLLL;
                if (interfaceC130805Bk != null) {
                    interfaceC130805Bk.LIZJ();
                }
            }
        });
        setHorizontalScrollBarEnabled(false);
        addView(relativeLayout, 0, new FrameLayout.LayoutParams(-2, -1));
        C16880lQ.LJIJ(relativeLayout, new View.OnClickListener() { // from class: X.5C4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.LJLLLLLL.setOutScrollX(Integer.valueOf(i));
        this.LJLLLLLL.invalidate();
        this.LJLZ.invalidate();
        int floor = this.LJLJL + ((int) Math.floor(i / this.LJLJJI));
        this.LJLJLLL = floor;
        if (floor < 0) {
            this.LJLJLLL = 0;
        }
        InterfaceC130805Bk interfaceC130805Bk = this.LJLLILLLL;
        if (interfaceC130805Bk != null) {
            interfaceC130805Bk.LJ();
        }
        if (i >= this.LJLLLL.getWidth() - (this.LJLIL * 2)) {
            InterfaceC130805Bk interfaceC130805Bk2 = this.LJLLILLLL;
            if (interfaceC130805Bk2 != null) {
                interfaceC130805Bk2.LIZ();
            }
            this.LJLJLJ = true;
        } else {
            this.LJLJLJ = false;
        }
        C130605Aq c130605Aq = this.LJLZ;
        Integer LIZ = c130605Aq.LIZ(this.LJLJLLL);
        c130605Aq.LJLLILLLL = LIZ;
        if (!o.LJ(this.LJLLI, LIZ)) {
            InterfaceC130805Bk interfaceC130805Bk3 = this.LJLLILLLL;
            if (interfaceC130805Bk3 != null) {
                interfaceC130805Bk3.LIZLLL(LIZ);
            }
            this.LJLLI = LIZ;
        }
    }
}
