package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.54L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54L implements InterfaceC131385Dq {
    public final Context LIZ;
    public final C54O LIZIZ;
    public final C62822Ol8 LIZJ;
    public java.util.Map<NLETrackSlot, java.util.Set<C1290754t>> LIZLLL;
    public List<? extends NLETrackSlot> LJ;
    public int LJFF;
    public int LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Set] */
    @Override // X.InterfaceC131385Dq
    public final C5E1 LIZ() {
        float f;
        boolean z;
        int LIZ;
        int i;
        int i2;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C54K frameData = this.LIZIZ.getFrameData();
        int curScrollX = this.LIZIZ.getCurScrollX();
        int LIZJ = C134845Qy.LIZJ(C58S.LIZ()) / 2;
        float f2 = curScrollX - this.LJFF;
        float f3 = frameData.LJLIL;
        float f4 = f2 / f3;
        float f5 = (LIZJ * 2) / f3;
        float f6 = frameData.LJLILLLLZI / f3;
        int i3 = 0;
        for (NLETrackSlot nLETrackSlot : this.LJ) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                if (nLETrackSlot2.LJI().LIZJ() == EnumC123874tb.VIDEO || nLETrackSlot2.LJI().LIZJ() == EnumC123874tb.IMAGE) {
                    float startTime = ((float) nLETrackSlot2.getStartTime()) / 1000.0f;
                    long j = 1000;
                    float duration = ((float) (nLETrackSlot2.getDuration() / j)) + startTime;
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot2.LJI());
                    Iterator<? extends NLETrackSlot> it = this.LJ.iterator();
                    long j2 = 0;
                    while (it.hasNext()) {
                        j2 += it.next().getDuration() / j;
                    }
                    float f7 = 2;
                    float f8 = f5 - ((this.LJI / this.LIZIZ.getFrameData().LJLIL) * f7);
                    if (((Boolean) this.LIZJ.getValue()).booleanValue()) {
                        f = (((float) j2) - f4) - f8;
                    } else {
                        f = f4;
                    }
                    float max = Math.max(startTime, f - f5);
                    float min = Math.min(duration, (f7 * f5) + f);
                    String LIZJ2 = C5DZ.LIZJ(nLETrackSlot2);
                    if (nLETrackSlot2.LJI().LIZJ() == EnumC123874tb.IMAGE) {
                        z = true;
                        LIZ = 0;
                    } else {
                        z = false;
                        LIZ = C5DZ.LIZ(((int) LJJ.LJIILIIL()) / 1000);
                        long duration2 = LJJ.LIZIZ().getDuration() / j;
                        if (LIZ > duration2) {
                            LIZ = (int) duration2;
                        }
                    }
                    if (min <= max) {
                        linkedHashSet = C77275UUl.LJ(new C1290754t(LIZJ2, LIZ, 2, z));
                    } else {
                        float f9 = f4 + f5;
                        if (z) {
                            if ((max <= f4 && f4 <= min) || ((max <= f9 && f9 <= min) || (f4 <= max && max <= f9))) {
                                i2 = 3;
                            } else {
                                i2 = 2;
                            }
                            String LIZJ3 = LJJ.LIZIZ().LIZJ();
                            o.LJIIIIZZ(LIZJ3, "videoSeg.resource.resourceFile");
                            linkedHashSet = C77275UUl.LJ(new C1290754t(LIZJ3, LIZ, i2, true));
                        } else {
                            float LJIILIIL = startTime - (((float) (LJJ.LJIILIIL() / j)) / C124574uj.LIZ(LJJ));
                            float f10 = LJIILIIL;
                            while (true) {
                                float f11 = f10 + f6;
                                if (f11 >= max) {
                                    break;
                                }
                                f10 = f11;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Float.valueOf(f10));
                            while (true) {
                                f10 += f6;
                                if (f10 > min) {
                                    break;
                                }
                                arrayList.add(Float.valueOf(f10));
                            }
                            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                            Iterator it2 = arrayList.iterator();
                            boolean z2 = false;
                            while (it2.hasNext()) {
                                float floatValue = ((Number) it2.next()).floatValue();
                                if (floatValue + f6 < f4 || floatValue - f6 > f9) {
                                    i = 2;
                                } else {
                                    i = 3;
                                }
                                int LIZ2 = C5DZ.LIZ((int) ((floatValue - LJIILIIL) * C124574uj.LIZ(LJJ)));
                                long duration3 = LJJ.LIZIZ().getDuration() / j;
                                if (LIZ2 > duration3) {
                                    LIZ2 = (int) duration3;
                                }
                                if (LIZ2 == LIZ) {
                                    z2 = true;
                                }
                                linkedHashSet5.add(new C1290754t(LIZJ2, LIZ2, i, false));
                            }
                            linkedHashSet = linkedHashSet5;
                            if (!z2) {
                                linkedHashSet5.add(new C1290754t(LIZJ2, LIZ, 2, false));
                                linkedHashSet = linkedHashSet5;
                            }
                        }
                    }
                    java.util.Set<C1290754t> remove = this.LIZLLL.remove(nLETrackSlot2);
                    if (remove == null) {
                        linkedHashSet3.addAll(linkedHashSet);
                    } else {
                        linkedHashSet2.addAll(F5P.LJIIIZ(remove, linkedHashSet));
                        linkedHashSet3.addAll(F5P.LJIIIZ(linkedHashSet, remove));
                    }
                    linkedHashSet4.addAll(linkedHashSet);
                    linkedHashMap.put(nLETrackSlot2, linkedHashSet);
                }
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Iterator it3 = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        while (it3.hasNext()) {
            linkedHashSet2.addAll((Collection) ((Map.Entry) it3.next()).getValue());
        }
        this.LIZLLL = linkedHashMap;
        return new C5E1(ORZ.LLJILJILJ(linkedHashSet2), ORZ.LLJILJILJ(linkedHashSet3), ORZ.LLJILJILJ(linkedHashSet4));
    }

    @Override // X.InterfaceC131385Dq
    public final void LIZIZ(C5DY key) {
        o.LJIIIZ(key, "key");
        this.LIZIZ.LIZ();
    }

    public C54L(Context context, C54O callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LIZ = context;
        this.LIZIZ = callBack;
        this.LIZJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 669));
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new ArrayList();
        this.LJFF = C134845Qy.LIZJ(C58S.LIZ()) / 2;
    }
}
