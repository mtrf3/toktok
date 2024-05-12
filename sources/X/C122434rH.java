package X;

import android.graphics.PointF;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122434rH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List timeMaps, NLEEditor nLEEditor, Long l) {
        Long l2;
        NLEResourceNode LIZIZ;
        EnumC123874tb LJFF;
        NLESegmentVideo LJJ;
        Object obj;
        long j;
        double d;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        double d2;
        double d3;
        o.LJIIIZ(timeMaps, "timeMaps");
        System.currentTimeMillis();
        NLEModel LJ = nLEEditor.LJ();
        if (LJ == null || Long.valueOf(LJ.getEndTime()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        arrayList2.add(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        arrayList3.add(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
        int i = 0;
        for (Object obj2 : timeMaps) {
            int i2 = i + 1;
            if (i >= 0) {
                List list = (List) obj2;
                if (list.size() != 2) {
                    return;
                }
                if (i != 1 || ((Number) ListProtector.get(list, 0)).floatValue() != 0.0f || ((Number) ListProtector.get(list, 1)).floatValue() != 0.0f) {
                    arrayList2.add(Double.valueOf(((Number) ListProtector.get(list, 0)).floatValue()));
                    arrayList3.add(Double.valueOf(((Number) ListProtector.get(list, 1)).floatValue()));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (arrayList2.size() != arrayList3.size() || arrayList2.size() <= 1) {
            return;
        }
        if (nLEEditor.LJ() != null) {
            double endTime = r0.getEndTime() / 1000000.0d;
            if (l != null) {
                d = l.longValue() / 1000.0d;
            } else {
                Iterator LIZJ = C141415gn.LIZJ(nLEEditor, "nleEditor.model.tracks");
                while (true) {
                    if (LIZJ.hasNext()) {
                        obj = LIZJ.next();
                        if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NLETrack nLETrack = (NLETrack) obj;
                if (nLETrack != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILL())) != null && (LJI = nLETrackSlot.LJI()) != null) {
                    j = LJI.getDuration();
                } else {
                    j = 0;
                }
                d = j / 1000000.0d;
            }
            Double d5 = (Double) ORZ.LLFII(arrayList2);
            if (d5 != null) {
                d2 = d5.doubleValue();
            } else {
                d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            Double d6 = (Double) ORZ.LLFII(arrayList3);
            if (d6 != null) {
                d3 = d6.doubleValue();
            } else {
                d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            if (d2 < endTime && d3 < d) {
                arrayList2.add(Double.valueOf(endTime));
                arrayList3.add(Double.valueOf(d));
            }
        }
        double doubleValue = ((Number) AnonymousClass028.LIZIZ(arrayList3, 1, arrayList3)).doubleValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("input video duration ");
        NLEModel LJ2 = nLEEditor.LJ();
        if (LJ2 != null) {
            l2 = Long.valueOf(LJ2.getEndTime());
        } else {
            l2 = null;
        }
        LIZ2.append(l2);
        X1D.LIZIZ(LIZ2);
        int size = arrayList2.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            double doubleValue2 = (((Number) ListProtector.get(arrayList2, i4)).doubleValue() - ((Number) ListProtector.get(arrayList2, i3)).doubleValue()) / (((Number) ListProtector.get(arrayList3, i4)).doubleValue() - ((Number) ListProtector.get(arrayList3, i3)).doubleValue());
            if (doubleValue2 < d4) {
                return;
            }
            double doubleValue3 = ((Number) ListProtector.get(arrayList3, i3)).doubleValue();
            double doubleValue4 = ((Number) ListProtector.get(arrayList3, i4)).doubleValue();
            int i5 = 1;
            do {
                arrayList.add(new PointF((float) C7MY.LIZ(i5 - 1, (doubleValue4 - doubleValue3) / 3.0d, doubleValue3, doubleValue), (float) doubleValue2));
                i5++;
            } while (i5 < 4);
            arrayList.add(new PointF((float) (((((doubleValue4 - doubleValue3) / 30.0d) * 29.0d) + doubleValue3) / doubleValue), (float) doubleValue2));
            d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            i3 = i4;
        }
        if (nLEEditor.LJ().getMainTrack() != null) {
            nLEEditor.LJ().getMainTrack().LJIILL().isEmpty();
        }
        NLETrackSlot nLETrackSlot2 = nLEEditor.LJ().getMainTrack().LJIILL().get(0);
        NLESegment LJI2 = nLETrackSlot2.LJI();
        if (LJI2 != null && (LIZIZ = LJI2.LIZIZ()) != null && (LJFF = LIZIZ.LJFF()) != null) {
            C122484rM c122484rM = new C122484rM(arrayList, new C79057V0z());
            if (C122444rI.LIZ[LJFF.ordinal()] == 1 && (LJJ = NLESegmentVideo.LJJ(nLETrackSlot2.LJI())) != null) {
                NLEEditorJniJNI.NLESegmentAudio_clearCurveSpeedPoint(LJJ.LIZJ, LJJ);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PointF pointF = (PointF) it.next();
                    NLEPoint nLEPoint = new NLEPoint();
                    nLEPoint.LIZIZ(pointF.x);
                    nLEPoint.LIZJ(pointF.y);
                    NLEEditorJniJNI.NLESegmentAudio_addCurveSpeedPoint(LJJ.LIZJ, LJJ, NLEPoint.LIZ(nLEPoint), nLEPoint);
                }
                LJJ.setExtra("curve_speed_name", c122484rM.LIZIZ);
                if (LJJ.getAbsSpeed() != 1.0f) {
                    LJJ.setAbsSpeed(1.0f);
                }
                nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + ((long) ((LJJ.LJIIL() - LJJ.LJIILIIL()) / LJJ.LJFF())));
                NLEEditorJniJNI.NLETrackSlot_adjustKeyFrame__SWIG_0(nLETrackSlot2.LIZ, nLETrackSlot2, 100L);
                nLEEditor.LIZIZ();
                InterfaceC122454rJ interfaceC122454rJ = c122484rM.LIZJ;
                if (interfaceC122454rJ != null) {
                    interfaceC122454rJ.onChanged();
                }
            }
        }
        if (nLEEditor.LJ() != null) {
            double endTime2 = r0.getEndTime() / 1000000.0d;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("warped video actual duration ");
            LIZ3.append(endTime2);
            LIZ3.append(",  loss is ");
            LIZ3.append(endTime2 - doubleValue);
            X1D.LIZIZ(LIZ3);
        }
        System.currentTimeMillis();
    }
}
