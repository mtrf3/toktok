package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5FN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FN extends C5FH implements C5T8 {
    public ViewOnTouchListenerC141755hL LJLL;
    public C131735Ez LJLLI;
    public C131735Ez LJLLILLLL;
    public InterfaceC88473Ynt<? super Integer, ? super Integer, ? super C5FJ, C76800UCe> LJLLJ;
    public InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> LJLLL;
    public final Stack<Point> LJLLLL;
    public C5OV LJLLLLLL;
    public final AqS184S0100000_2 LJLZ;

    @Override // X.C5FH
    public final void LJFF(View child) {
        o.LJIIIZ(child, "child");
    }

    @Override // X.C5T8
    public final void LIZIZ() {
        ArrayList arrayList = new ArrayList();
        for (Point point : this.LJLLLL) {
            ArrayList arrayList2 = new ArrayList();
            if (!C90193gN.LIZIZ(getContext())) {
                arrayList2.add(Float.valueOf(LJII(point.getX())));
                arrayList2.add(Float.valueOf(LJII(point.getY())));
            } else {
                arrayList2.add(Float.valueOf(getMaxScrollWidth() - LJII(point.getX())));
                arrayList2.add(Float.valueOf(getMaxScrollWidth() - LJII(point.getY())));
            }
            arrayList.add(arrayList2);
        }
        C131735Ez c131735Ez = this.LJLLILLLL;
        if (c131735Ez != null) {
            if (c131735Ez.getPainter() == null) {
                C131735Ez c131735Ez2 = this.LJLLILLLL;
                if (c131735Ez2 != null) {
                    final Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    c131735Ez2.setPainter(new C131705Ew(context) { // from class: X.5Ev
                        public final Context LJFF;
                        public final Paint LJI;
                        public final C62822Ol8 LJII;

                        {
                            super(context);
                            this.LJFF = context;
                            this.LJI = C6D8.LIZIZ(true);
                            this.LJII = C221108m2.LIZIZ(C131715Ex.LJLIL);
                        }

                        @Override // X.InterfaceC131725Ey
                        public final void LIZ(Canvas canvas, View view, List<OSZ<Long, Float>> wavePoints, List<List<Float>> wavePointList) {
                            int i;
                            o.LJIIIZ(canvas, "canvas");
                            o.LJIIIZ(view, "view");
                            o.LJIIIZ(wavePoints, "wavePoints");
                            o.LJIIIZ(wavePointList, "wavePointList");
                            ArrayList arrayList3 = (ArrayList) wavePointList;
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            canvas.save();
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                List list = (List) it.next();
                                Paint paint = this.LJI;
                                Integer LJI = C79045V0n.LJI(R.attr.eh, this.LJFF);
                                if (LJI != null) {
                                    i = LJI.intValue();
                                } else {
                                    i = 0;
                                }
                                paint.setColor(i);
                                this.LJI.setAlpha(127);
                                ((RectF) this.LJII.getValue()).set(((Number) ORZ.LJLLJ(list)).floatValue(), 0.0f, ((Number) ORZ.LLFF(list)).floatValue(), view.getMeasuredHeight());
                                canvas.drawRoundRect((RectF) this.LJII.getValue(), C7MY.LIZIZ(4), C7MY.LIZIZ(4), this.LJI);
                            }
                            canvas.restore();
                        }
                    });
                } else {
                    o.LJIJI("recordAudioWaveLayout");
                    throw null;
                }
            }
            C131735Ez c131735Ez3 = this.LJLLILLLL;
            if (c131735Ez3 != null) {
                c131735Ez3.setWavePointList(arrayList);
                invalidate();
                return;
            } else {
                o.LJIJI("recordAudioWaveLayout");
                throw null;
            }
        }
        o.LJIJI("recordAudioWaveLayout");
        throw null;
    }

    @Override // X.C5T8
    public final Point LIZJ() {
        if (this.LJLLLL.empty()) {
            return null;
        }
        Point pop = this.LJLLLL.pop();
        LIZIZ();
        return pop;
    }

    public final int getMaxScrollWidth() {
        C131735Ez c131735Ez = this.LJLLI;
        if (c131735Ez != null) {
            return c131735Ez.getMeasuredWidth();
        }
        o.LJIJI("originAudioWaveLayout");
        throw null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = Resources.getSystem().getDisplayMetrics().widthPixels / 2;
        View findViewById = findViewById(R.id.hdj);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.origin_audio_wave_layout)");
        this.LJLLI = (C131735Ez) findViewById;
        View findViewById2 = findViewById(R.id.ir1);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.record_audio_wave_layout)");
        this.LJLLILLLL = (C131735Ez) findViewById2;
        View findViewById3 = findViewById(R.id.bbc);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.choose_video_cover_view)");
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = (ViewOnTouchListenerC141755hL) findViewById3;
        this.LJLL = viewOnTouchListenerC141755hL;
        ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC141755hL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i);
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL2 = this.LJLL;
        if (viewOnTouchListenerC141755hL2 != null) {
            viewOnTouchListenerC141755hL2.setLayoutParams(marginLayoutParams);
            setScrollChangeListener(this.LJLZ);
        } else {
            o.LJIJI("coverView");
            throw null;
        }
    }

    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> getOnScrollChangeListener() {
        return this.LJLZ;
    }

    @Override // X.C5T8
    public Stack<Point> getStack() {
        return this.LJLLLL;
    }

    @Override // X.C5T8
    public final Point LIZLLL(int i) {
        Point push = this.LJLLLL.push(new Point(i, i, System.currentTimeMillis()));
        o.LJIIIIZZ(push, "stack.push(Point(start, …tem.currentTimeMillis()))");
        return push;
    }

    @Override // X.C5T8
    public final int LJ(int i) {
        if (i >= getTotalDuration() - 1) {
            return i;
        }
        for (Point point : this.LJLLLL) {
            if (i >= point.getX() && i < point.getY()) {
                return point.getX();
            }
        }
        return -1;
    }

    public final float LJII(float f) {
        return (f / ((float) getTotalDuration())) * getMaxScrollWidth();
    }

    @Override // X.C5T8
    public final void LJJIIJ(float f) {
        float maxScrollWidth = f * getMaxScrollWidth();
        if (C90193gN.LIZIZ(getContext())) {
            maxScrollWidth = -maxScrollWidth;
        }
        scrollTo((int) maxScrollWidth, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void setOnScrollStateChanged(InterfaceC88473Ynt<? super Integer, ? super Integer, ? super C5FJ, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLJ = listener;
        if (getParent() instanceof C5FI) {
            ViewParent parent = getParent();
            o.LJII(parent, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.audioedit.record.RecordHorizontalScrollContainer");
            ((C5FI) parent).setOnScrollStateChangeListener(new C5FM() { // from class: X.5FO
                @Override // X.C5FM
                public final void LIZ(int i, C5FJ state) {
                    o.LJIIIZ(state, "state");
                    InterfaceC88473Ynt<? super Integer, ? super Integer, ? super C5FJ, C76800UCe> interfaceC88473Ynt = C5FN.this.LJLLJ;
                    if (interfaceC88473Ynt != null) {
                        interfaceC88473Ynt.invoke(Integer.valueOf(i), 0, state);
                    }
                }
            });
        }
    }

    public final void setRecording(boolean z) {
        if (z) {
            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = this.LJLL;
            if (viewOnTouchListenerC141755hL != null) {
                viewOnTouchListenerC141755hL.setAlpha(0.5f);
                return;
            } else {
                o.LJIJI("coverView");
                throw null;
            }
        }
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL2 = this.LJLL;
        if (viewOnTouchListenerC141755hL2 != null) {
            viewOnTouchListenerC141755hL2.setAlpha(1.0f);
        } else {
            o.LJIJI("coverView");
            throw null;
        }
    }

    public final void setScrollListener(InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLL = listener;
    }

    @Override // X.C5T8
    public void setStack(Stack<Point> s) {
        o.LJIIIZ(s, "s");
        this.LJLLLL.clear();
        if (!C79004UzY.LJJIFFI(s)) {
            this.LJLLLL.addAll(s);
        }
        LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5FN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLLL = new Stack<>();
        FrameLayout.inflate(context, R.layout.cc3, this);
        this.LJLZ = new AqS184S0100000_2(this, 20);
    }

    @Override // X.C5T8
    public final int LIZ(int i, Point point) {
        int i2;
        if (point != null) {
            i2 = point.getX();
        } else {
            i2 = i;
        }
        for (Point point2 : this.LJLLLL) {
            if (point2.getX() >= i2 && i >= point2.getX() && i <= point2.getY() && !o.LJ(point2, point)) {
                return point2.getX();
            }
        }
        return -1;
    }
}
