package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6lV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169816lV {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(HBZ.LJLIL);

    public static final boolean LJ(long j) {
        if (j >= ((Number) LIZ.getValue()).longValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(int i, int i2) {
        long max = Math.max(i / 5, 1000L);
        if (i2 != 2) {
            if (i2 != 3) {
                return false;
            }
            return LJ((i - max) + (((float) max) / 0.5f));
        }
        return LJ((max * 2) + i);
    }

    public static final C5RV LJFF(int i, VideoPublishEditModel videoPublishEditModel) {
        EffectPointModel timeEffect;
        if (videoPublishEditModel == null || (timeEffect = videoPublishEditModel.getTimeEffect()) == null) {
            return null;
        }
        long endPoint = timeEffect.getEndPoint();
        long startPoint = timeEffect.getStartPoint();
        String key = timeEffect.getKey();
        if (Math.abs(startPoint - endPoint) < 1000) {
            long max = Math.max(1000L, i / 5);
            long j = i;
            if (startPoint + max > j) {
                startPoint = j - max;
            }
            endPoint = max + startPoint;
        }
        return C5RV.LJFF(startPoint, endPoint, key);
    }

    public static final List<EffectPointModel> LJI(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUiStartPoint((int) j);
        effectPointModel.setUiEndPoint((int) j2);
        effectPointModel.setCategory("time");
        arrayList.add(effectPointModel);
        return arrayList;
    }

    public static final OSZ<Long, Long> LIZIZ(String key, C170006lo recorder, InterfaceC153045zY interfaceC153045zY) {
        long j;
        Long l;
        Long l2;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(recorder, "recorder");
        long j2 = 0;
        if (interfaceC153045zY == null) {
            return new OSZ<>(0L, 0L);
        }
        int LLJJI = interfaceC153045zY.LLJJI(interfaceC153045zY.LJZL());
        if (recorder.LJFF && (l2 = (Long) ((LinkedHashMap) recorder.LIZLLL).get(key)) != null && l2.longValue() > 0) {
            Long l3 = (Long) ((LinkedHashMap) recorder.LIZLLL).get(key);
            if (l3 != null) {
                j = l3.longValue();
            } else {
                j = 0;
            }
        } else {
            j = LLJJI;
        }
        int LLIZLLLIL = interfaceC153045zY.LLIZLLLIL();
        if (recorder.LJFF && (l = (Long) ((LinkedHashMap) recorder.LJ).get(key)) != null && l.longValue() > 0) {
            Long l4 = (Long) ((LinkedHashMap) recorder.LJ).get(key);
            if (l4 != null) {
                j2 = l4.longValue();
            }
        } else {
            j2 = Math.max(LLIZLLLIL / 5, 1000L);
        }
        long j3 = LLIZLLLIL;
        if (j3 - j < j2) {
            j = j3 - j2;
        }
        recorder.LIZLLL.put(key, Long.valueOf(j));
        recorder.LJ.put(key, Long.valueOf(j2));
        return new OSZ<>(Long.valueOf(j), Long.valueOf(j + j2));
    }

    public static final boolean LIZJ(VWL pager, C1BD adapter, boolean z) {
        o.LJIIIZ(pager, "pager");
        o.LJIIIZ(adapter, "adapter");
        if (pager.getCurrentItem() == adapter.getCount() - 1 && z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return (r6 + r8) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        return (r7 - r8) - r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LIZ(com.ss.android.ugc.aweme.effect.EffectPointModel r3, int r4, boolean r5, float r6, float r7, int r8, float r9) {
        /*
            r2 = 0
            if (r3 == 0) goto L57
            java.lang.String r1 = r3.getKey()
        L7:
            java.lang.String r0 = "2"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L29
            X.Ol8 r0 = X.C169816lV.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r0 = (long) r4
            long r2 = r2 - r0
            r0 = 2
            long r0 = (long) r0
            long r2 = r2 / r0
            float r1 = (float) r2
            float r1 = r1 / r9
            if (r5 == 0) goto L4e
        L24:
            float r0 = (float) r8
            float r7 = r7 - r0
            float r6 = r7 - r1
        L28:
            return r6
        L29:
            if (r3 == 0) goto L2f
            java.lang.String r2 = r3.getKey()
        L2f:
            java.lang.String r0 = "3"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L52
            X.Ol8 r0 = X.C169816lV.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r0 = (long) r4
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 / r0
            float r1 = r1 / r9
            if (r5 == 0) goto L4e
            goto L24
        L4e:
            float r0 = (float) r8
            float r6 = r6 + r0
            float r6 = r6 + r1
            goto L28
        L52:
            if (r5 == 0) goto L55
            goto L28
        L55:
            r6 = r7
            goto L28
        L57:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169816lV.LIZ(com.ss.android.ugc.aweme.effect.EffectPointModel, int, boolean, float, float, int, float):float");
    }
}
