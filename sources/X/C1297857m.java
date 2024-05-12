package X;

import Y.AUListenerS10S0500000_2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.57m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1297857m implements C59S {
    public final C59L LIZ;
    public float LIZIZ;
    public int LIZJ;
    public int LIZLLL = -1;
    public int LJ;
    public final /* synthetic */ C1297757l LJFF;

    @Override // X.C59S
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C59S
    public final void LIZ() {
        C1297757l c1297757l;
        InterfaceC1298157p interfaceC1298157p;
        C1297757l c1297757l2 = this.LJFF;
        if (!c1297757l2.LJLLILLLL) {
            return;
        }
        c1297757l2.LJZ.cancel();
        this.LJFF.LJZ.removeAllUpdateListeners();
        C16880lQ.LJLJL(this.LJFF.LJZ);
        if (!this.LJFF.LIZJ(this.LIZJ)) {
            this.LIZJ = this.LIZ.getIndex();
        }
        if (((C59L) ListProtector.get(this.LJFF.LJLIL, this.LIZJ)).LLIFFJFJJ) {
            this.LIZJ--;
        }
        Iterator it = ((ArrayList) this.LJFF.LJLIL).iterator();
        while (it.hasNext()) {
            C59V c59v = (C59V) ((C59L) it.next()).LIZ(R.id.et1);
            c59v.LJLL = false;
            c59v.invalidate();
        }
        this.LJFF.getClass();
        if (this.LJFF.LIZJ(this.LIZ.getIndex()) && (interfaceC1298157p = (c1297757l = this.LJFF).LJLJJI) != null) {
            interfaceC1298157p.LJJJLZIJ((NLETrackSlot) ListProtector.get(c1297757l.LJLJI, this.LIZ.getIndex()), this.LIZ.getIndex(), this.LIZJ);
        }
        this.LJFF.LJLILLLLZI.getLayoutParams().width = -2;
        C1297757l c1297757l3 = this.LJFF;
        C16880lQ.LLFII(c1297757l3, c1297757l3.LLF);
        C1297757l c1297757l4 = this.LJFF;
        C16880lQ.LLFII(c1297757l4, c1297757l4.LLFF);
        C1297757l c1297757l5 = this.LJFF;
        c1297757l5.LLF = null;
        c1297757l5.LLFF = null;
    }

    public C1297857m(C1297757l c1297757l, C59L c59l) {
        this.LJFF = c1297757l;
        this.LIZ = c59l;
    }

    @Override // X.C59S
    public final boolean LIZJ(float f, float f2) {
        float f3 = f;
        if (this.LJFF.getSelectIndex() != this.LIZ.getIndex()) {
            this.LJFF.LIZLLL(this.LIZ.getIndex(), EnumC127354zD.LINE);
        }
        C1297757l c1297757l = this.LJFF;
        int i = 0;
        if (!c1297757l.LJLLILLLL) {
            return false;
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(this.LIZ.getIndex(), c1297757l.LJLJI);
        if (nLETrackSlot == null) {
            return false;
        }
        this.LJFF.getClass();
        InterfaceC1298157p interfaceC1298157p = this.LJFF.LJLJJI;
        if (interfaceC1298157p != null) {
            interfaceC1298157p.LJJIZ(nLETrackSlot);
        }
        C1297757l c1297757l2 = this.LJFF;
        C16880lQ.LLFII(c1297757l2.LJLILLLLZI, c1297757l2.LJLJL);
        this.LIZJ = this.LIZ.getIndex();
        C59L c59l = this.LIZ;
        c59l.bringToFront();
        C1302559h c1302559h = (C1302559h) c59l.LIZ(R.id.b_o);
        C1302859k c1302859k = c59l.LLIL;
        float f4 = c1302859k.LJIIJ;
        float f5 = c1302859k.LJIIIZ;
        c1302559h.LJLLJ = f4;
        c1302559h.LJLLILLLL = f5;
        c1302559h.invalidate();
        this.LJFF.getHapticFeedback().LIZ(this.LIZ, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
        int[] iArr = new int[((ArrayList) this.LJFF.LJLIL).size()];
        final int[] iArr2 = new int[((ArrayList) this.LJFF.LJLIL).size()];
        final int[] iArr3 = new int[((ArrayList) this.LJFF.LJLIL).size()];
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = this.LJFF.getResources().getDimensionPixelSize(R.dimen.a96);
        int dimensionPixelSize = this.LJFF.getResources().getDimensionPixelSize(R.dimen.ajg);
        C1297757l c1297757l3 = this.LJFF;
        Iterator it = ((ArrayList) c1297757l3.LJLIL).iterator();
        float f6 = 0.0f;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C59L c59l2 = (C59L) next;
                    c59l2.LJ();
                    if (i < this.LIZ.getIndex()) {
                        f3 = ((c59l2.getWidth() - ((c1297757l3.LL + c1297757l3.LLD) * 2)) - c59l2.getTransitionWidth()) + f3;
                    } else if (i == this.LIZ.getIndex()) {
                        int left = (((View) ListProtector.get(c1297757l3.LJLIL, i)).getLeft() - V2B.LJIIJ(c1297757l3)) + c1297757l3.LL + c1297757l3.LLD;
                        iArr3[i] = left;
                        iArr2[i] = (((int) f3) - left) - (C1300758p.LIZJ / 2);
                        f6 = f3;
                    } else if (i > this.LIZ.getIndex()) {
                        int i3 = C1300758p.LIZJ;
                        f3 += i3 + dimensionPixelSize;
                        int left2 = (((View) ListProtector.get(c1297757l3.LJLIL, i)).getLeft() - V2B.LJIIJ(c1297757l3)) + c1297757l3.LL + c1297757l3.LLD;
                        iArr3[i] = left2;
                        iArr2[i] = (((int) f3) - left2) - (i3 / 2);
                    }
                    iArr[i] = (c59l2.getWidth() - ((c1297757l3.LL + c1297757l3.LLD) * 2)) - C1300758p.LIZJ;
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                for (int index = this.LIZ.getIndex() - 1; -1 < index; index--) {
                    int i4 = C1300758p.LIZJ;
                    f6 -= i4 + dimensionPixelSize;
                    int left3 = ((View) ListProtector.get(this.LJFF.LJLIL, index)).getLeft() - V2B.LJIIJ(this.LJFF);
                    C1297757l c1297757l4 = this.LJFF;
                    int i5 = left3 + c1297757l4.LL + c1297757l4.LLD;
                    iArr3[index] = i5;
                    iArr2[index] = (((int) f6) - i5) - (i4 / 2);
                }
                this.LJFF.LJZ.cancel();
                this.LJFF.LJZ.removeAllUpdateListeners();
                C16880lQ.LJLJL(this.LJFF.LJZ);
                C1297757l c1297757l5 = this.LJFF;
                c1297757l5.LJZ.addUpdateListener(new AUListenerS10S0500000_2(c1297757l5, iArr, c76732zl, iArr3, iArr2, 1));
                this.LJFF.LJLILLLLZI.getLayoutParams().width = this.LJFF.LJLILLLLZI.getWidth();
                this.LJFF.LJZ.start();
                ValueAnimator valueAnimator = this.LJFF.LJZ;
                final C1297757l c1297757l6 = this.LJFF;
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.57n
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v1, types: [X.5B1, android.view.View] */
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        boolean z;
                        long j;
                        NLEResourceNode LIZIZ;
                        o.LJIIIZ(animation, "animation");
                        int i6 = C1300758p.LIZJ;
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i6, C1300758p.LIZLLL);
                        C1297757l c1297757l7 = C1297757l.this;
                        int[] iArr4 = iArr3;
                        C1297857m c1297857m = this;
                        int[] iArr5 = iArr2;
                        layoutParams.topMargin = c1297757l7.LLD;
                        layoutParams.setMarginStart(iArr4[c1297857m.LIZ.getIndex()] + iArr5[c1297857m.LIZ.getIndex()] + c1297757l7.LLD);
                        NLETrackSlot selectedSegment = C1297757l.this.getSelectedSegment();
                        if (selectedSegment != null) {
                            C1297757l c1297757l8 = C1297757l.this;
                            C5B1 c5b1 = c1297757l8.LLF;
                            if (c5b1 != null) {
                                C16880lQ.LLFII(c1297757l8, c5b1);
                                c1297757l8.LLF = null;
                            }
                            int i7 = 0;
                            if (selectedSegment.LJI().LIZJ() == EnumC123874tb.IMAGE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(selectedSegment.LJI());
                            String LIZJ = C5DZ.LIZJ(selectedSegment);
                            if (!ujb.o.LJJJJJL(LIZJ)) {
                                if (!z) {
                                    i7 = C5DZ.LIZ(((int) LJJ.LJIILIIL()) / 1000);
                                    long duration = selectedSegment.LJI().LIZIZ().getDuration() / 1000;
                                    if (i7 > duration) {
                                        i7 = (int) duration;
                                    }
                                }
                                Bitmap LIZ = c1297757l8.LLIFFJFJJ.LIZ(i7, LIZJ);
                                layoutParams.width = i6;
                                ?? r4 = new View(c1297757l8.getContext()) { // from class: X.5B1
                                    public float LJLIL;
                                    public Bitmap LJLILLLLZI;
                                    public String LJLJI;
                                    public final C62822Ol8 LJLJJI;
                                    public final Paint LJLJJL;
                                    public final PorterDuffXfermode LJLJJLL;

                                    private final Paint getTextPaint() {
                                        return (Paint) this.LJLJJI.getValue();
                                    }

                                    public final Bitmap getMBitmap() {
                                        return this.LJLILLLLZI;
                                    }

                                    public final float getMRound() {
                                        return this.LJLIL;
                                    }

                                    public final String getTimeText() {
                                        return this.LJLJI;
                                    }

                                    {
                                        new LinkedHashMap();
                                        setLayerType(1, null);
                                        this.LJLJJI = C221108m2.LIZIZ(C1302059c.LJLIL);
                                        this.LJLJJL = C6D8.LIZIZ(true);
                                        this.LJLJJLL = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
                                    }

                                    @Override // android.view.View
                                    public final void onDraw(Canvas canvas) {
                                        o.LJIIIZ(canvas, "canvas");
                                        super.onDraw(canvas);
                                        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                                        float width = getWidth();
                                        float height = getHeight();
                                        float f7 = this.LJLIL;
                                        canvas.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.LJLJJL);
                                        this.LJLJJL.setXfermode(this.LJLJJLL);
                                        Bitmap bitmap = this.LJLILLLLZI;
                                        if (bitmap != null) {
                                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.LJLJJL);
                                        }
                                        this.LJLJJL.setXfermode(null);
                                        canvas.restore();
                                        String str = this.LJLJI;
                                        if (str != null) {
                                            canvas.drawText(str, C134845Qy.LIZ(4.0f), C1300758p.LIZJ - C134845Qy.LIZ(5.0f), getTextPaint());
                                        }
                                    }

                                    public final void setMBitmap(Bitmap bitmap) {
                                        this.LJLILLLLZI = bitmap;
                                    }

                                    public final void setMRound(float f7) {
                                        this.LJLIL = f7;
                                    }

                                    public final void setTimeText(String str) {
                                        this.LJLJI = str;
                                    }
                                };
                                r4.setLayoutParams(layoutParams);
                                r4.setMRound(r4.getResources().getDimension(R.dimen.od));
                                r4.setMBitmap(LIZ);
                                r4.setAlpha(0.4f);
                                NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(selectedSegment.LJI());
                                if (LJJ2 != null && (LIZIZ = LJJ2.LIZIZ()) != null) {
                                    j = LIZIZ.getDuration();
                                } else {
                                    j = 0;
                                }
                                r4.setTimeText(C1298557t.LIZ(j / 1000));
                                c1297757l8.LLF = r4;
                                c1297757l8.addView(r4);
                            }
                        }
                        this.LIZ.bringToFront();
                    }
                });
                Iterator it2 = ((ArrayList) this.LJFF.LJLIL).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((C59L) next2).LLIFFJFJJ) {
                        obj = next2;
                        break;
                    }
                }
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(8);
                }
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0170, code lost:
    
        if ((r7 - r2[0]) < (r15.LJFF.LJLJJLL / 2)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        if ((r1[0] - r7) < (r15.LJFF.LJLJJLL / 2)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        r12 = true;
     */
    @Override // X.C59S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(float r16, float r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1297857m.LIZLLL(float, float, boolean, boolean):void");
    }
}
