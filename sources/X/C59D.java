package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59D implements InterfaceC131385Dq {
    public final C1303859u LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final ConcurrentHashMap<NLETrackSlot, C1301058s> LIZLLL = new ConcurrentHashMap<>();
    public java.util.Map<NLETrackSlot, java.util.Set<C1290754t>> LJ = new LinkedHashMap();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1002));

    @Override // X.InterfaceC131385Dq
    public final synchronized C5E1 LIZ() {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        LinkedHashSet linkedHashSet3;
        int scrollX;
        int i;
        AnonymousClass594 anonymousClass594;
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJ);
        linkedHashSet = new LinkedHashSet();
        linkedHashSet2 = new LinkedHashSet();
        linkedHashSet3 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        float timelineScale = this.LIZ.getTimelineScale();
        if (((Boolean) this.LJFF.getValue()).booleanValue()) {
            scrollX = -C1303859u.LLJJI;
            i = this.LIZ.getScrollX();
        } else {
            scrollX = this.LIZ.getScrollX();
            i = C1303859u.LLJJI;
        }
        float f = (scrollX - i) / timelineScale;
        float width = this.LIZ.getWidth() / timelineScale;
        float f2 = AnonymousClass594.LJLJL / timelineScale;
        for (Map.Entry<NLETrackSlot, C1301058s> entry : this.LIZLLL.entrySet()) {
            NLETrackSlot key = entry.getKey();
            C1301058s value = entry.getValue();
            C5A5 c5a5 = value.LJLILLLLZI;
            if ((c5a5 instanceof AnonymousClass594) && (anonymousClass594 = (AnonymousClass594) c5a5) != null) {
                if (anonymousClass594.LJLILLLLZI) {
                    java.util.Set set = (java.util.Set) LJJLIL.remove(key);
                    if (set != null) {
                        linkedHashSet3.addAll(set);
                        linkedHashMap.put(key, set);
                    }
                } else {
                    C5A6 c5a6 = anonymousClass594.LJLJJL;
                    if ((c5a6 instanceof C5A6) && c5a6 != null) {
                        java.util.Set<C1290754t> LIZJ = LIZJ(key, value.LJLIL, c5a6.LJLJJI, f, width, f2);
                        java.util.Set set2 = (java.util.Set) LJJLIL.remove(key);
                        if (set2 == null) {
                            linkedHashSet2.addAll(LIZJ);
                        } else {
                            linkedHashSet.addAll(F5P.LJIIIZ(set2, LIZJ));
                            linkedHashSet2.addAll(F5P.LJIIIZ(LIZJ, set2));
                        }
                        linkedHashSet3.addAll(LIZJ);
                        linkedHashMap.put(key, LIZJ);
                    }
                }
            }
        }
        Iterator it = ((LinkedHashMap) LJJLIL).entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll((java.util.Set) ((Map.Entry) it.next()).getValue());
        }
        this.LJ = linkedHashMap;
        return new C5E1(ORZ.LLJILJILJ(linkedHashSet), ORZ.LLJILJILJ(linkedHashSet2), ORZ.LLJILJILJ(linkedHashSet3));
    }

    @Override // X.InterfaceC131385Dq
    public final void LIZIZ(C5DY key) {
        o.LJIIIZ(key, "key");
        C2ND.LIZIZ(new AqS149S0200000_2(this, key, 104), 0L);
    }

    public C59D(C1303859u c1303859u, int i, int i2) {
        this.LIZ = c1303859u;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public final java.util.Set<C1290754t> LIZJ(NLETrackSlot nLETrackSlot, int i, boolean z, float f, float f2, float f3) {
        long j;
        long duration;
        boolean z2;
        boolean z3;
        int i2;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (z) {
            j = -(((float) (LJJ.LJIILIIL() / 1000)) / C124574uj.LIZ(LJJ));
        } else {
            j = 0;
        }
        long j2 = 1000;
        long startTime = (nLETrackSlot.getStartTime() / j2) + j;
        double d = f;
        double d2 = f2;
        long max = Math.max(startTime, (long) (d - (0.5d * d2)));
        if (z) {
            duration = LJJ.getDuration() / j2;
        } else {
            duration = nLETrackSlot.getDuration() / j2;
        }
        long min = Math.min(duration + (nLETrackSlot.getStartTime() / j2), (long) ((d2 * 1.5d) + d));
        if (min - max <= 0) {
            return OQY.INSTANCE;
        }
        int scrollY = this.LIZ.getScrollY();
        int i3 = this.LIZIZ;
        int i4 = (this.LIZJ + i3) * i;
        int i5 = i3 + i4;
        if (i4 - this.LIZ.getHeight() < scrollY && i5 > scrollY) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = 2;
        if (LJJ.LIZJ() == EnumC123874tb.IMAGE) {
            if (((float) (nLETrackSlot.getMeasuredEndTime() / j2)) > f && ((float) (nLETrackSlot.getStartTime() / j2)) < f + f2) {
                if (z2) {
                    i6 = 3;
                } else {
                    i6 = 1;
                }
            } else if (!z2) {
                i6 = 0;
            }
            String LIZJ = LJJ.LIZIZ().LIZJ();
            o.LJIIIIZZ(LIZJ, "convertToSegmentVideo.resource.resourceFile");
            return C77275UUl.LJ(new C1290754t(LIZJ, 0, i6, true));
        }
        float startTime2 = ((float) (nLETrackSlot.getStartTime() / j2)) - (((float) (LJJ.LJIILIIL() / j2)) / C124574uj.LIZ(LJJ));
        float f4 = startTime2;
        while (true) {
            float f5 = f4 + f3;
            if (f5 >= ((float) max)) {
                break;
            }
            f4 = f5;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(f4));
        if (z2) {
            while (true) {
                f4 += f3;
                if (f4 > ((float) min)) {
                    break;
                }
                arrayList.add(Float.valueOf(f4));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String LIZJ2 = C5DZ.LIZJ(nLETrackSlot);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            if (floatValue + f3 < f || floatValue - f3 > f + f2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2) {
                if (z3) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
            } else if (z3) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int LIZ = C5DZ.LIZ((int) (C124574uj.LIZ(LJJ) * (floatValue - startTime2)));
            if (LIZ > LJJ.LIZIZ().getDuration() / j2) {
                LIZ = (int) (LJJ.LIZIZ().getDuration() / j2);
            }
            linkedHashSet.add(new C1290754t(LIZJ2, LIZ, i2, false));
        }
        return linkedHashSet;
    }
}
