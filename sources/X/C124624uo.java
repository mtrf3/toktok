package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124624uo extends C124704uw implements InterfaceC124684uu {
    public final long LJLJJLL;
    public final C1GE LJLJL;

    @Override // X.InterfaceC124684uu
    public final boolean LIZIZ() {
        if (LJJLIIIJ() != null) {
            return !r0.LJFF().isEmpty();
        }
        return false;
    }

    @Override // X.InterfaceC124684uu
    public final boolean LJJJJIZL() {
        boolean z;
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIJ == null) {
            return false;
        }
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(LJJLIIIJ.LJI());
        if (LJJ != null) {
            z = LJJ.LJJII();
        } else {
            z = false;
        }
        if (!LJJLIIIJ.LJFF().isEmpty()) {
            Iterator<NLETrackSlot> it = LJJLIIIJ.LJFF().iterator();
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(next.LJI());
                if (LJJ2 != null && LJJ2.LJJII()) {
                    if (next == null) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        return z;
    }

    @Override // X.InterfaceC124684uu
    public final long LJIILJJIL() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C124624uo(InterfaceC124924vI editorContext) {
        super(editorContext);
        o.LJIIIZ(editorContext, "editorContext");
        this.LJLJJLL = 100L;
        this.LJLJL = new C1GE();
        new MutableLiveData();
    }

    @Override // X.InterfaceC124684uu
    public final void LIZLLL(long j) {
        float f;
        Float f2;
        Float f3;
        float f4;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideo;
        NLETrackSlot nLETrackSlot2;
        NLESegmentVideo nLESegmentVideo2;
        NLESegment LJI;
        NLESegment LJI2;
        float LJJIIZI;
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIJ == null || LJJLIIIJ.LJFF().isEmpty()) {
            return;
        }
        this.LJLJL.getClass();
        Float f5 = null;
        if (LJJLIIIJ.LJFF().size() >= 2) {
            Iterator<NLETrackSlot> it = LJJLIIIJ.LJFF().iterator();
            long j2 = -1;
            long j3 = Long.MAX_VALUE;
            NLETrackSlot nLETrackSlot3 = null;
            NLETrackSlot nLETrackSlot4 = null;
            int i = 0;
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    NLETrackSlot keyframe = next;
                    long startTime = LJJLIIIJ.getStartTime();
                    o.LJIIIIZZ(keyframe, "keyframe");
                    long startTime2 = keyframe.getStartTime() + startTime;
                    if (j2 > startTime2 || j < startTime2) {
                        if (j <= startTime2 && j3 >= startTime2) {
                            nLETrackSlot4 = keyframe;
                            j3 = startTime2;
                        }
                    } else {
                        nLETrackSlot3 = keyframe;
                        j2 = startTime2;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (nLETrackSlot3 != null && nLETrackSlot4 != null) {
                f = ((float) (j - j2)) / ((float) (j3 - j2));
            } else {
                f = 1.0f;
            }
            C124634up c124634up = new C124634up(nLETrackSlot3, nLETrackSlot4, f);
            NLETrackSlot nLETrackSlot5 = c124634up.LJLIL;
            if (nLETrackSlot5 != null && (LJI2 = nLETrackSlot5.LJI()) != null) {
                f2 = Float.valueOf(C1GE.LJIIIIZZ(LJI2));
            } else {
                f2 = null;
            }
            NLETrackSlot nLETrackSlot6 = c124634up.LJLILLLLZI;
            if (nLETrackSlot6 != null && (LJI = nLETrackSlot6.LJI()) != null) {
                f3 = Float.valueOf(C1GE.LJIIIIZZ(LJI));
            } else {
                f3 = null;
            }
            float f6 = 0.0f;
            if (f2 != null && (nLETrackSlot2 = c124634up.LJLIL) != null && (nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot2.LJI())) != null && !nLESegmentVideo2.LJJII()) {
                f2 = Float.valueOf(0.0f);
            }
            if (f3 != null && (nLETrackSlot = c124634up.LJLILLLLZI) != null && (nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot.LJI())) != null && !nLESegmentVideo.LJJII()) {
                f3 = Float.valueOf(0.0f);
            }
            if (f2 != null) {
                if (f3 != null) {
                    f5 = Float.valueOf(f2.floatValue() + ((f3.floatValue() - f2.floatValue()) * c124634up.LJLJI));
                } else {
                    f4 = f2.floatValue();
                }
            } else {
                f4 = 0.0f;
            }
            if (f3 != null) {
                f6 = f3.floatValue();
            }
            f5 = Float.valueOf(f4 + f6);
        }
        if (f5 != null) {
            LJJIIZI = f5.floatValue();
        } else {
            NLESegment LJI3 = LJJLIIIJ.LJI();
            o.LJIIIIZZ(LJI3, "this.mainSegment");
            LJJIIZI = C124574uj.LJJIIZI(LJI3);
        }
        NLESegment LJI4 = LJJLIIIJ.LJI();
        o.LJIIIIZZ(LJI4, "this.mainSegment");
        C124574uj.LJJLIIIJJI(LJI4, LJJIIZI);
        LJJLIIIJ.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotVolume(), String.valueOf(LJJIIZI));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("time=");
        LIZ.append(j);
        LIZ.append(" updateSlotFromLocal: ");
        NLESegment LJI5 = LJJLIIIJ.LJI();
        o.LJIIIIZZ(LJI5, "selectSlot.mainSegment");
        LIZ.append(C124574uj.LJJIIZI(LJI5));
        C131935Ft.LIZIZ("KeyframeEditor", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC124684uu
    public final void LJJIJIIJIL(boolean z) {
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIIJ == null || LJJLIIIJ == null) {
            return;
        }
        NLEEditorJniJNI.NLETrackSlot_addOrUpdateKeyframe(LJJLIIIJ.LIZ, LJJLIIIJ, C78926UyI.LJJJI(this.LJLJJL.H9()), this.LJLIL.getKeyframeEditor().LJIILJJIL(), z);
        if (!z) {
            return;
        }
        LIZLLL(this.LJLJJL.H9() * 1000);
    }

    @Override // X.InterfaceC124684uu
    public final void LJJJJLL(NLETrackSlot nleTrackSlot) {
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        NLEEditorJniJNI.NLETrackSlot_adjustKeyFrame__SWIG_0(nleTrackSlot.LIZ, nleTrackSlot, this.LJLJJLL);
    }
}
