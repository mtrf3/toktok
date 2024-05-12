package X;

import Y.IDComparatorS30S0000000_2;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.5Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134595Pz {
    public final C87230YLi LIZ;
    public final ArrayList<InterfaceC132925Jo> LIZIZ = new ArrayList<>();
    public NLEModel LIZJ;
    public NLETrackSlot LIZLLL;
    public NLETrack LJ;
    public long LJFF;
    public OSZ<Float, Float> LJI;

    public C134595Pz(C87230YLi c87230YLi) {
        this.LIZ = c87230YLi;
        Float valueOf = Float.valueOf(0.0f);
        this.LJI = new OSZ<>(valueOf, valueOf);
        c87230YLi.setOnGestureListener(new InterfaceC87234YLm() { // from class: X.5Q1
            public final SparseIntArray LIZ = new SparseIntArray();

            @Override // X.InterfaceC87234YLm
            public final void LJJJI() {
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJIIZI(MotionEvent event) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                o.LJIIIZ(event, "event");
                ArrayList<InterfaceC132925Jo> arrayList = C134595Pz.this.LIZIZ;
                ArrayList arrayList2 = new ArrayList();
                Iterator<InterfaceC132925Jo> it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (this.LIZ.get(next.hashCode(), -1) != -1) {
                        arrayList2.add(next);
                    }
                }
                C134595Pz c134595Pz = C134595Pz.this;
                Iterator it2 = arrayList2.iterator();
                boolean z6 = false;
                while (it2.hasNext()) {
                    C5HO c5ho = (C5HO) it2.next();
                    int i = this.LIZ.get(c5ho.hashCode());
                    int i2 = i & 1;
                    int i3 = i & 16;
                    int i4 = i & 256;
                    int i5 = i & 4096;
                    int i6 = i & 65536;
                    c134595Pz.getClass();
                    if (!o.LJ(null, Boolean.TRUE)) {
                        if (i2 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i3 != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (c5ho.LJ(z, z2, z3, z4, z5)) {
                            z6 = true;
                        }
                    }
                }
                if (!z6) {
                    C134595Pz.this.getClass();
                }
                this.LIZ.clear();
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJIZ(float f) {
                float f2;
                C134595Pz c134595Pz = C134595Pz.this;
                NLETrack nLETrack = c134595Pz.LJ;
                NLETrackSlot nLETrackSlot = c134595Pz.LIZLLL;
                if (nLETrack == null || nLETrackSlot == null || c134595Pz.LIZIZ.isEmpty()) {
                    C134595Pz.this.getClass();
                    return;
                }
                Iterator<InterfaceC132925Jo> it = C134595Pz.this.LIZIZ.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (next.LJII(nLETrack, nLETrackSlot)) {
                        if (next.LJIJJLI() == EnumC132175Gr.ANTICLOCKWISE) {
                            f2 = -f;
                        } else {
                            f2 = f;
                        }
                        if (!o.LJ(null, Boolean.TRUE)) {
                            if (next.LJIIZILJ(nLETrack, nLETrackSlot, (int) f2)) {
                                LIZ(next, 65536);
                                return;
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                C134595Pz.this.getClass();
            }

            @Override // X.InterfaceC87234YLm
            public final boolean LJJJ(MotionEvent motionEvent) {
                InterfaceC132925Jo LIZ;
                if (motionEvent != null && (LIZ = C134595Pz.this.LIZ(motionEvent, true)) != null) {
                    LIZ(LIZ, 16);
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC87234YLm
            public final boolean LJJJJ(MotionEvent event) {
                o.LJIIIZ(event, "event");
                C134595Pz.this.getClass();
                Iterator<InterfaceC132925Jo> it = C134595Pz.this.LIZIZ.iterator();
                while (it.hasNext()) {
                    if (it.next().LJJJJ(event)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC87234YLm
            public final void onDown(MotionEvent event) {
                o.LJIIIZ(event, "event");
                this.LIZ.clear();
            }

            @Override // X.InterfaceC87234YLm
            public final void onLongPress(MotionEvent e) {
                o.LJIIIZ(e, "e");
            }

            @Override // X.InterfaceC87234YLm
            public final void onScale(float f) {
                C134595Pz c134595Pz = C134595Pz.this;
                NLETrack nLETrack = c134595Pz.LJ;
                NLETrackSlot nLETrackSlot = c134595Pz.LIZLLL;
                if (nLETrack == null || nLETrackSlot == null || c134595Pz.LIZIZ.isEmpty()) {
                    C134595Pz.this.getClass();
                    return;
                }
                Iterator<InterfaceC132925Jo> it = C134595Pz.this.LIZIZ.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (next.LJII(nLETrack, nLETrackSlot)) {
                        if (o.LJ(null, Boolean.TRUE)) {
                            LIZ(next, 4096);
                            return;
                        } else if (next.LJJ(nLETrack, nLETrackSlot, f)) {
                            LIZ(next, 4096);
                            return;
                        }
                    }
                }
                C134595Pz.this.getClass();
            }

            @Override // X.InterfaceC87234YLm
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                InterfaceC132925Jo LIZ;
                if (motionEvent == null || (LIZ = C134595Pz.this.LIZ(motionEvent, false)) == null) {
                    return false;
                }
                LIZ(LIZ, 1);
                return true;
            }

            public final void LIZ(InterfaceC132925Jo interfaceC132925Jo, int i) {
                if (this.LIZ.get(interfaceC132925Jo.hashCode(), -1) == -1) {
                    this.LIZ.put(interfaceC132925Jo.hashCode(), i);
                } else {
                    this.LIZ.put(interfaceC132925Jo.hashCode(), i | this.LIZ.get(interfaceC132925Jo.hashCode()));
                }
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJJJI(float f, float f2, int i) {
                float f3;
                float f4;
                C134595Pz c134595Pz = C134595Pz.this;
                NLETrack nLETrack = c134595Pz.LJ;
                NLETrackSlot nLETrackSlot = c134595Pz.LIZLLL;
                if (nLETrack == null || nLETrackSlot == null || c134595Pz.LIZIZ.isEmpty()) {
                    C134595Pz.this.getClass();
                    return;
                }
                C134595Pz c134595Pz2 = C134595Pz.this;
                Iterator<InterfaceC132925Jo> it = c134595Pz2.LIZIZ.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (next.LJII(nLETrack, nLETrackSlot)) {
                        OSZ<Float, Float> osz = c134595Pz2.LJI;
                        float LJIIJJI = next.LJIIJJI() * f;
                        float LJIIJJI2 = next.LJIIJJI() * f2;
                        if (next.LJIJJ() != C5HP.RIGHT) {
                            float f5 = -1;
                            f3 = f * f5;
                            LJIIJJI *= f5;
                        } else {
                            f3 = f;
                        }
                        if (next.LJIIIIZZ() != C5HQ.DOWN) {
                            float f6 = -1;
                            f4 = f2 * f6;
                            LJIIJJI2 *= f6;
                        } else {
                            f4 = f2;
                        }
                        float floatValue = LJIIJJI / osz.getFirst().floatValue();
                        float floatValue2 = LJIIJJI2 / osz.getSecond().floatValue();
                        if (!o.LJ(null, Boolean.TRUE)) {
                            if (next.LJIIJ(nLETrack, nLETrackSlot, i, f3, f4, floatValue, floatValue2)) {
                                LIZ(next, 256);
                                return;
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                C134595Pz.this.getClass();
            }
        });
    }

    public final InterfaceC132925Jo LIZ(MotionEvent motionEvent, boolean z) {
        NLEModel nLEModel = this.LIZJ;
        if (nLEModel == null) {
            return null;
        }
        long j = this.LJFF;
        Float valueOf = Float.valueOf(nLEModel.getCanvasRatio());
        if (valueOf.floatValue() != 0.0f) {
            valueOf.floatValue();
            VecNLETrackSPtr vecNLETrackSPtr = nLEModel.getTracks();
            NLEVideoFrameModel cover = nLEModel.getCover();
            if (cover != null && cover.getEnable()) {
                vecNLETrackSPtr = nLEModel.getCover().getTracks();
            }
            HashMap hashMap = new HashMap();
            o.LJIIIIZZ(vecNLETrackSPtr, "vecNLETrackSPtr");
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = vecNLETrackSPtr.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                if (next.getEnable()) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NLETrack nLETrack = (NLETrack) it2.next();
                VecNLETrackSlotSPtr LJIILL = nLETrack.LJIILL();
                ArrayList arrayList2 = new ArrayList();
                Iterator<NLETrackSlot> it3 = LJIILL.iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    NLETrackSlot nLETrackSlot = next2;
                    long j2 = Long.MAX_VALUE;
                    if (nLETrackSlot.getEndTime() != Long.MAX_VALUE) {
                        j2 = nLETrackSlot.getEndTime() + 1;
                    }
                    if (nLETrackSlot.getStartTime() <= j && j < j2) {
                        arrayList2.add(next2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    hashMap.put(nLETrack, arrayList2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((NLETrack) entry.getKey()).LJIIZILJ() == EnumC123864ta.STICKER) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (NLETrack nLETrack2 : ORZ.LLILII(new IDComparatorS30S0000000_2(30), linkedHashMap.keySet())) {
                List list = (List) hashMap.get(nLETrack2);
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        InterfaceC132925Jo LIZIZ = LIZIZ(nLETrack2, (NLETrackSlot) it4.next(), motionEvent, z);
                        if (LIZIZ != null) {
                            return LIZIZ;
                        }
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (((NLETrack) entry2.getKey()).LJIIZILJ() != EnumC123864ta.STICKER) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (NLETrack nLETrack3 : ORZ.LLILII(new IDComparatorS30S0000000_2(31), linkedHashMap2.keySet())) {
                List list2 = (List) hashMap.get(nLETrack3);
                if (list2 != null) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        InterfaceC132925Jo LIZIZ2 = LIZIZ(nLETrack3, (NLETrackSlot) it5.next(), motionEvent, z);
                        if (LIZIZ2 != null) {
                            return LIZIZ2;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC132925Jo LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrack r19, com.bytedance.ies.nle.editor_jni.NLETrackSlot r20, android.view.MotionEvent r21, boolean r22) {
        /*
            r18 = this;
            r2 = r18
            java.util.ArrayList<X.5Jo> r0 = r2.LIZIZ
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            r13 = r20
            r1 = r19
            if (r0 == 0) goto L28
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.5Jo r0 = (X.InterfaceC132925Jo) r0
            boolean r0 = r0.LJII(r1, r13)
            if (r0 == 0) goto Ld
            r5.add(r3)
            goto Ld
        L28:
            java.util.Iterator r11 = r5.iterator()
        L2c:
            boolean r0 = r11.hasNext()
            r3 = 0
            if (r0 == 0) goto Lcb
            java.lang.Object r12 = r11.next()
            X.5Jo r12 = (X.InterfaceC132925Jo) r12
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r2.LIZJ
            if (r0 == 0) goto Lc8
            float r0 = r0.getCanvasRatio()
            java.lang.Float r14 = java.lang.Float.valueOf(r0)
        L45:
            X.OSZ<java.lang.Float, java.lang.Float> r15 = r2.LJI
            X.YLi r0 = r2.LIZ
            int r0 = r0.getMeasuredWidth()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            X.YLi r0 = r2.LIZ
            int r0 = r0.getMeasuredHeight()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            X.5PT r5 = X.C132865Ji.LIZIZ(r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L2c
            r4 = r21
            float r10 = r4.getX()
            float r9 = r4.getY()
            r8 = 0
            r7 = 1
            if (r13 != 0) goto L70
            goto L2c
        L70:
            float r0 = r5.LJLJI
            float r10 = r10 - r0
            float r0 = r5.LJLJJI
            float r9 = r9 - r0
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r0 = r5.LJLJJL
            float r0 = (float) r0
            float r0 = -r0
            r6.setRotate(r0)
            r0 = 2
            float[] r0 = new float[r0]
            r0[r8] = r10
            r0[r7] = r9
            r6.mapPoints(r0)
            r8 = r0[r8]
            r7 = r0[r7]
            float r6 = r5.LJLIL
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            float r5 = r5.LJLILLLLZI
            float r5 = r5 / r0
            float r0 = -r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L2c
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L2c
            float r0 = -r5
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L2c
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L2c
            if (r22 == 0) goto Lbb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 != 0) goto Lba
            boolean r0 = r12.LJIL(r1, r13, r4)
        Lb8:
            if (r0 == 0) goto L2c
        Lba:
            return r12
        Lbb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 != 0) goto Lba
            boolean r0 = r12.LJIILLIIL(r1, r13, r4)
            goto Lb8
        Lc8:
            r14 = r3
            goto L45
        Lcb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134595Pz.LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, android.view.MotionEvent, boolean):X.5Jo");
    }
}
