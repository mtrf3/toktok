package X;

import android.graphics.Canvas;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.58t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1301158t implements InterfaceC1304259y {
    public static final int LJIIIIZZ = C1300758p.LJ;
    public static final int LJIIIZ = C1300758p.LJFF;
    public final C1303859u LIZ;
    public final C1303959v LIZIZ;
    public final InterfaceC1299858g LIZJ;
    public final C5C0 LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 854));
    public boolean LJFF = true;
    public final java.util.Map<NLETrackSlot, C1301058s> LJI = new LinkedHashMap();
    public final int LJII = LJIIIIZZ;

    @Override // X.InterfaceC1304259y
    public boolean LJ() {
        return !(this instanceof C1301558x);
    }

    @Override // X.InterfaceC1304259y
    public long LJI() {
        return 100L;
    }

    @Override // X.InterfaceC1304259y
    public void LJII(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    @Override // X.InterfaceC1304259y
    public boolean LJIIIZ() {
        return true;
    }

    @Override // X.InterfaceC1304259y
    public int LJIIJ() {
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC1304259y
    public void onMoveFail(NLETrackSlot nLETrackSlot) {
    }

    @Override // X.InterfaceC1304259y
    public void onScrollChanged() {
    }

    @Override // X.InterfaceC1304259y
    public void LIZLLL() {
        this.LIZJ.pause();
    }

    public final int LJIIL() {
        return this.LIZ.getScrollX();
    }

    public final float LJIILIIL() {
        return this.LIZ.getTimelineScale();
    }

    public final boolean LJIILJJIL() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1304259y
    public final int LIZIZ() {
        return LJIIIZ;
    }

    @Override // X.InterfaceC1304259y
    public int getItemHeight() {
        return this.LJII;
    }

    @Override // X.InterfaceC1304259y
    public int LJIIIIZZ(int i) {
        if (i <= 0) {
            return C0EH.LIZ(getItemHeight(), LJIIIZ, i, this.LIZ.getPaddingTop());
        }
        return this.LIZ.getPaddingTop() + getItemHeight() + ((getItemHeight() + LJIIIZ) * (i - 1)) + C134845Qy.LIZ(1.0f) + ((int) (getItemHeight() * 0.33333334f));
    }

    public final void LJIILL(OSZ<? extends NLETrackSlot, C1301058s> osz) {
        double floor;
        int scrollX;
        if (osz == null) {
            return;
        }
        NLETrackSlot first = osz.getFirst();
        int itemHeight = (getItemHeight() + LJIIIZ) * osz.getSecond().LJLIL;
        int scrollY = this.LIZ.getScrollY();
        int i = itemHeight - scrollY;
        if (i >= 0) {
            i = ((getItemHeight() + itemHeight) - scrollY) - this.LIZ.getMeasuredHeight();
            if (i <= 0) {
                i = 0;
            }
        }
        this.LIZ.LJIILLIIL(i);
        long j = 1000;
        long duration = first.getDuration() / j;
        float abs = Math.abs(this.LIZ.getScrollX()) / LJIILIIL();
        if (abs < ((float) (first.getStartTime() / j))) {
            floor = Math.ceil(LJIILIIL() * ((float) (first.getStartTime() / j)));
        } else {
            if (abs < ((float) ((first.getStartTime() / j) + duration))) {
                return;
            }
            floor = Math.floor((LJIILIIL() * ((float) (first.getMeasuredEndTime() / j))) - 2);
        }
        int i2 = (int) floor;
        if (i2 >= 0) {
            C59G callback = this.LIZ.getCallback();
            if (callback != null) {
                callback.LIZIZ();
            }
            C1303959v c1303959v = this.LIZIZ;
            if (LJIILJJIL()) {
                scrollX = this.LIZ.getScrollX() + i2;
            } else {
                scrollX = i2 - this.LIZ.getScrollX();
            }
            c1303959v.LJJJJJ(scrollX, false);
        }
    }

    @Override // X.InterfaceC1304259y
    public void LJFF(OSZ<? extends NLETrackSlot, C1301058s> osz, boolean z) {
        if (!z && osz != null) {
            this.LIZJ.pause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        r8.put(r9, java.lang.Integer.valueOf(r6.LIZ));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.util.List r20, com.bytedance.ies.nle.editor_jni.NLETrackSlot r21) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1301158t.LJIILLIIL(java.util.List, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    @Override // X.InterfaceC1304259y
    public final void onClip(long j, long j2) {
        C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
        if (trackGroupActionListener != null) {
            trackGroupActionListener.onClip(j, j2);
        }
    }

    public void LJIIJJI(C5A5 holder, NLETrackSlot slot, int i) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(slot, "slot");
        holder.setSegment(slot);
        if (holder.getView() instanceof AbstractC130625As) {
            View view = holder.getView();
            o.LJII(view, "null cannot be cast to non-null type com.ss.ugc.android.editor.track.fuctiontrack.keyframe.BaseTrackKeyframeItemView");
            AbstractC130625As abstractC130625As = (AbstractC130625As) view;
            abstractC130625As.setFrameDelegate(this.LIZLLL);
            abstractC130625As.setListener(new InterfaceC130925Bw() { // from class: X.591
                @Override // X.InterfaceC130925Bw
                public final void LIZJ() {
                    C59G callback = AbstractC1301158t.this.LIZ.getCallback();
                    if (callback != null) {
                        callback.LJIIIZ();
                    }
                }

                @Override // X.InterfaceC130925Bw
                public final void LIZ(NLETrackSlot nLETrackSlot) {
                    C59G callback = AbstractC1301158t.this.LIZ.getCallback();
                    if (callback != null) {
                        callback.LJIIJ(nLETrackSlot);
                    }
                }

                @Override // X.InterfaceC130925Bw
                public final void LIZIZ(long j) {
                    C59G callback = AbstractC1301158t.this.LIZ.getCallback();
                    if (callback != null) {
                        callback.LJII(j);
                    }
                }
            });
        }
    }

    public AbstractC1301158t(C1303859u c1303859u, C1303959v c1303959v, C1299358b c1299358b, C58R c58r) {
        this.LIZ = c1303859u;
        this.LIZIZ = c1303959v;
        this.LIZJ = c1299358b;
        this.LIZLLL = c58r;
    }
}
