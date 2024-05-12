package X;

import Y.ALAdapterS1S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5A2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5A2 {
    public final C1303859u LIZ;
    public final C5A5 LIZIZ;
    public final InterfaceC65784Pro<C59G> LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;
    public final C62822Ol8 LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public C5AE LJIILIIL;
    public final int[] LJIILJJIL;
    public final float LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public NLETrackSlot LJIJJLI;
    public long LJIL;
    public final ValueAnimator LJJ;
    public int LJJI;
    public final int LJJIFFI;
    public C5AE LJJII;
    public final C62822Ol8 LJJIII;

    public final C59G LIZLLL() {
        return this.LIZJ.invoke();
    }

    public final boolean LJ() {
        return ((Boolean) this.LJIIIIZZ.getValue()).booleanValue();
    }

    public final void LJII() {
        float f;
        float videosLength$editor_trackpanel_release;
        int right;
        float f2;
        float videosLength$editor_trackpanel_release2;
        int left;
        int i = C1303859u.LLJJI;
        if (LJ()) {
            float f3 = i;
            if (this.LIZLLL.getRight() + this.LJIIL > f3) {
                f2 = i - this.LIZLLL.getRight();
            } else if (!this.LIZ.getCanMoveOutOfMainVideo$editor_trackpanel_release()) {
                videosLength$editor_trackpanel_release2 = f3 - this.LIZ.getMainVideoLength$editor_trackpanel_release();
                if (this.LIZLLL.getLeft() + this.LJIIL < videosLength$editor_trackpanel_release2) {
                    left = this.LIZLLL.getLeft();
                    f2 = videosLength$editor_trackpanel_release2 - left;
                } else {
                    f2 = this.LJIIJ;
                }
            } else if (!this.LIZ.getCanMoveOutOfVideos$editor_trackpanel_release()) {
                videosLength$editor_trackpanel_release2 = f3 - this.LIZ.getVideosLength$editor_trackpanel_release();
                if (this.LIZLLL.getLeft() + this.LJIIL < videosLength$editor_trackpanel_release2) {
                    left = this.LIZLLL.getLeft();
                    f2 = videosLength$editor_trackpanel_release2 - left;
                } else {
                    f2 = this.LJIIJ;
                }
            } else {
                f2 = this.LJIIJ;
            }
            this.LJIIIZ = f2;
        } else {
            float f4 = i;
            if (this.LIZLLL.getLeft() + this.LJIIL < f4) {
                f = i - this.LIZLLL.getLeft();
            } else if (!this.LIZ.getCanMoveOutOfMainVideo$editor_trackpanel_release()) {
                videosLength$editor_trackpanel_release = this.LIZ.getMainVideoLength$editor_trackpanel_release() + f4;
                if (this.LIZLLL.getRight() + this.LJIIL > videosLength$editor_trackpanel_release) {
                    right = this.LIZLLL.getRight();
                    f = videosLength$editor_trackpanel_release - right;
                } else {
                    f = this.LJIIJ;
                }
            } else if (!this.LIZ.getCanMoveOutOfVideos$editor_trackpanel_release()) {
                videosLength$editor_trackpanel_release = this.LIZ.getVideosLength$editor_trackpanel_release() + f4;
                if (this.LIZLLL.getRight() + this.LJIIL > videosLength$editor_trackpanel_release) {
                    right = this.LIZLLL.getRight();
                    f = videosLength$editor_trackpanel_release - right;
                } else {
                    f = this.LJIIJ;
                }
            } else {
                f = this.LJIIJ;
            }
            this.LJIIIZ = f;
        }
        this.LIZLLL.setTranslationX(this.LJIIIZ);
        this.LJII.setTranslationX(this.LJIIIZ);
    }

    public final void LIZJ(java.util.Map<NLETrackSlot, C1301058s> map) {
        float itemMargin$editor_trackpanel_release;
        int paddingTop;
        float paddingTop2;
        NLESegment nLESegment;
        this.LJIJJ = true;
        C5AH trackDragEventListener$editor_trackpanel_release = this.LIZ.getTrackDragEventListener$editor_trackpanel_release();
        if (trackDragEventListener$editor_trackpanel_release != null && !trackDragEventListener$editor_trackpanel_release.LJ(this.LJIJJLI, this.LJIJ)) {
            this.LIZ.LJIIJ();
            return;
        }
        NLETrackSlot nLETrackSlot = this.LJIJJLI;
        EnumC123874tb enumC123874tb = null;
        if (nLETrackSlot != null && (nLESegment = (NLESegment) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot.LJI())) != null) {
            enumC123874tb = nLESegment.LIZJ();
        }
        if (enumC123874tb == EnumC123874tb.IMAGE || enumC123874tb == EnumC123874tb.VIDEO) {
            int intValue = ((Number) C5BA.LIZ(EnumC127484zQ.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue();
            Iterator<Map.Entry<NLETrackSlot, C1301058s>> it = map.entrySet().iterator();
            if (it.hasNext()) {
                int i = it.next().getValue().LJLIL;
                while (it.hasNext()) {
                    int i2 = it.next().getValue().LJLIL;
                    if (i < i2) {
                        i = i2;
                    }
                }
                if (i + 1 == intValue) {
                    this.LJIJI = true;
                    return;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        this.LJIJI = false;
        int rint = (int) Math.rint(C1300758p.LIZIZ() * ((float) this.LIZ.getMainVideoDuration()));
        if (this.LJIIJJI >= 0.0f) {
            itemMargin$editor_trackpanel_release = (this.LIZ.getItemMargin$editor_trackpanel_release() * 0.5f) + (this.LIZ.getItemMargin$editor_trackpanel_release() * this.LJIJ) + (this.LIZ.getItemHeight$editor_trackpanel_release() * (this.LJIJ + 1));
            paddingTop = this.LIZ.getPaddingTop();
        } else {
            if (this.LJIJ == 0) {
                paddingTop2 = this.LIZ.getPaddingTop() / 2.0f;
                View view = this.LJFF;
                view.setVisibility(0);
                int i3 = C1303859u.LLJJI;
                int i4 = (int) paddingTop2;
                view.layout(i3, i4, rint + i3, C134845Qy.LIZ(2.0f) + i4);
            }
            itemMargin$editor_trackpanel_release = (this.LIZ.getItemMargin$editor_trackpanel_release() * 0.5f) + (this.LIZ.getItemMargin$editor_trackpanel_release() * (this.LJIJ - 1)) + (this.LIZ.getItemHeight$editor_trackpanel_release() * r1);
            paddingTop = this.LIZ.getPaddingTop();
        }
        paddingTop2 = paddingTop + itemMargin$editor_trackpanel_release;
        View view2 = this.LJFF;
        view2.setVisibility(0);
        int i32 = C1303859u.LLJJI;
        int i42 = (int) paddingTop2;
        view2.layout(i32, i42, rint + i32, C134845Qy.LIZ(2.0f) + i42);
    }

    public final void LJI(C5AE c5ae) {
        C59G LIZLLL;
        if (this.LJJII == c5ae) {
            return;
        }
        this.LJJII = c5ae;
        if (c5ae == C5AE.NULL) {
            this.LJJ.cancel();
            NLETrackSlot nLETrackSlot = this.LJIJJLI;
            if (nLETrackSlot != null && (LIZLLL = LIZLLL()) != null) {
                LIZLLL.LJIIJJI(nLETrackSlot);
                return;
            }
            return;
        }
        this.LJJ.start();
        C59G LIZLLL2 = LIZLLL();
        if (LIZLLL2 == null) {
            return;
        }
        LIZLLL2.LJI();
    }

    public final int LIZ(int i, int i2) {
        int itemMargin$editor_trackpanel_release = ((this.LIZ.getItemMargin$editor_trackpanel_release() + this.LIZ.getItemHeight$editor_trackpanel_release()) * i) - i2;
        if (itemMargin$editor_trackpanel_release < 0) {
            return itemMargin$editor_trackpanel_release;
        }
        int itemMargin$editor_trackpanel_release2 = ((((this.LIZ.getItemMargin$editor_trackpanel_release() + this.LIZ.getItemHeight$editor_trackpanel_release()) * (i + 1)) + this.LIZ.getPaddingTop()) - i2) - this.LIZ.getMeasuredHeight();
        if (itemMargin$editor_trackpanel_release2 > 0) {
            return itemMargin$editor_trackpanel_release2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(float r25, java.util.Map<com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.C1301058s> r26) {
        /*
            Method dump skipped, instructions count: 1456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5A2.LIZIZ(float, java.util.Map):void");
    }

    public C5A2(C1303859u trackGroup, C5A5 itemHolder, AqS152S0100000_2 aqS152S0100000_2) {
        o.LJIIIZ(trackGroup, "trackGroup");
        o.LJIIIZ(itemHolder, "itemHolder");
        this.LIZ = trackGroup;
        this.LIZIZ = itemHolder;
        this.LIZJ = aqS152S0100000_2;
        this.LIZLLL = itemHolder.getView();
        this.LJ = trackGroup.getPlaceHolderView$editor_trackpanel_release();
        this.LJFF = trackGroup.getPlugInLine$editor_trackpanel_release();
        this.LJI = trackGroup.getTrackGroupDragMask$editor_trackpanel_release();
        this.LJII = trackGroup.getSegmentDragDecorateView$editor_trackpanel_release();
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 855));
        this.LJIILIIL = C5AE.NULL;
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        this.LJIILJJIL = iArr;
        this.LJIILL = C1291054w.LJ().LJIIZILJ;
        this.LJIIZILJ = ColorProtector.parseColor("#03B1BE");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0F, 1F)");
        this.LJJ = ofFloat;
        this.LJJIFFI = C5AW.LIZ / 10;
        this.LJJII = C5AE.NULL;
        this.LJJIII = C221108m2.LIZIZ(C1294156b.LJLIL);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 43));
        ofFloat.addListener(new ALAdapterS1S0100000_2(this, 30));
    }

    public static void LJFF(List list, float f, Rect rect) {
        float min;
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        float f2 = 0.0f;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                Rect rect2 = (Rect) next;
                float f3 = rect2.left;
                if (f <= rect2.right && f3 <= f) {
                    min = 0.0f;
                } else {
                    min = Math.min(Math.abs(f - f3), Math.abs(f - rect2.right));
                }
                if (min <= f2 || i == 0) {
                    rect.set(rect2);
                    f2 = min;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
