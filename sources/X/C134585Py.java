package X;

import Y.IDComparatorS30S0000000_2;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.5Py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134585Py {
    public final C87230YLi LIZ;
    public final PreviewPanelViewModel LIZIZ;
    public final ArrayList<InterfaceC132925Jo> LIZJ = new ArrayList<>();
    public C5Q2 LIZLLL;

    public C134585Py(C87230YLi c87230YLi, PreviewPanelViewModel previewPanelViewModel) {
        this.LIZ = c87230YLi;
        this.LIZIZ = previewPanelViewModel;
        c87230YLi.setOnGestureListener(new InterfaceC87234YLm() { // from class: X.5Q0
            public final SparseIntArray LIZ = new SparseIntArray();

            @Override // X.InterfaceC87234YLm
            public final void LJJJI() {
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJIIZI(MotionEvent event) {
                C5Q2 c5q2;
                boolean z;
                boolean z2;
                boolean z3;
                Boolean bool;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                o.LJIIIZ(event, "event");
                PreviewPanelViewModel previewPanelViewModel2 = C134585Py.this.LIZIZ;
                NLEEditor nLEEditor = previewPanelViewModel2.LJLZ;
                if (nLEEditor != null) {
                    previewPanelViewModel2.LJZ.removeCallbacksAndMessages(null);
                    NLEEditorJniJNI.NLEEditor_setGlobalExtra(nLEEditor.LIZ, nLEEditor, "only_update_preview_panel", "FALSE");
                    NLEEditor nLEEditor2 = previewPanelViewModel2.LJLZ;
                    if (nLEEditor2 != null) {
                        nLEEditor2.LIZIZ();
                    }
                }
                ArrayList<InterfaceC132925Jo> arrayList = C134585Py.this.LIZJ;
                ArrayList arrayList2 = new ArrayList();
                Iterator<InterfaceC132925Jo> it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (this.LIZ.get(next.hashCode(), -1) != -1) {
                        arrayList2.add(next);
                    }
                }
                C134585Py c134585Py = C134585Py.this;
                Iterator it2 = arrayList2.iterator();
                boolean z9 = false;
                while (it2.hasNext()) {
                    InterfaceC132925Jo interfaceC132925Jo = (InterfaceC132925Jo) it2.next();
                    int i = this.LIZ.get(interfaceC132925Jo.hashCode());
                    int i2 = i & 1;
                    int i3 = i & 16;
                    int i4 = i & 256;
                    if (i4 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = i & 4096;
                    if (i5 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i6 = i & 65536;
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C5Q2 c5q22 = c134585Py.LIZLLL;
                    if (c5q22 != null) {
                        c5q22.LJII(interfaceC132925Jo, z, z2, z3);
                        bool = Boolean.FALSE;
                    } else {
                        bool = null;
                    }
                    if (!o.LJ(bool, Boolean.TRUE)) {
                        if (i2 != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i3 != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i4 != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i6 != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (interfaceC132925Jo.LJ(z4, z5, z6, z7, z8)) {
                            z9 = true;
                        }
                    }
                }
                if (!z9 && (c5q2 = C134585Py.this.LIZLLL) != null) {
                    c5q2.LJIIL();
                }
                this.LIZ.clear();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC87234YLm
            public final void LJJIZ(float f) {
                NLETrack nLETrack;
                NLETrackSlot nLETrackSlot;
                float f2;
                Boolean bool;
                boolean LJIIZILJ;
                OSZ osz = (OSZ) C134585Py.this.LIZIZ.LJLLLL.getValue();
                if (osz != null) {
                    nLETrack = (NLETrack) osz.getFirst();
                } else {
                    nLETrack = null;
                }
                OSZ osz2 = (OSZ) C134585Py.this.LIZIZ.LJLLLL.getValue();
                if (osz2 != null) {
                    nLETrackSlot = (NLETrackSlot) osz2.getSecond();
                } else {
                    nLETrackSlot = null;
                }
                if (nLETrack == null || nLETrackSlot == null || C134585Py.this.LIZJ.isEmpty()) {
                    C5Q2 c5q2 = C134585Py.this.LIZLLL;
                    if (c5q2 != null) {
                        c5q2.LJIIIIZZ();
                        return;
                    }
                    return;
                }
                C134585Py c134585Py = C134585Py.this;
                Iterator<InterfaceC132925Jo> it = c134585Py.LIZJ.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (next.LJII(nLETrack, nLETrackSlot)) {
                        if (next.LJIJJLI() == EnumC132175Gr.ANTICLOCKWISE) {
                            f2 = -f;
                        } else {
                            f2 = f;
                        }
                        C5Q2 c5q22 = c134585Py.LIZLLL;
                        if (c5q22 != null) {
                            c5q22.LIZJ(next, nLETrack, nLETrackSlot);
                            bool = Boolean.FALSE;
                        } else {
                            bool = null;
                        }
                        if (o.LJ(bool, Boolean.TRUE)) {
                            LJIIZILJ = bool.booleanValue();
                        } else {
                            LJIIZILJ = next.LJIIZILJ(nLETrack, nLETrackSlot, (int) f2);
                        }
                        if (LJIIZILJ) {
                            LIZ(next, 65536);
                            return;
                        }
                    }
                }
                C5Q2 c5q23 = C134585Py.this.LIZLLL;
                if (c5q23 != null) {
                    c5q23.LJIIIIZZ();
                }
            }

            @Override // X.InterfaceC87234YLm
            public final boolean LJJJ(MotionEvent motionEvent) {
                if (motionEvent != null) {
                    C134585Py c134585Py = C134585Py.this;
                    InterfaceC132925Jo LIZ = c134585Py.LIZ(motionEvent, true);
                    if (LIZ != null) {
                        LIZ(LIZ, 16);
                        return true;
                    }
                    C5Q2 c5q2 = c134585Py.LIZLLL;
                    if (c5q2 != null) {
                        c5q2.LJFF(motionEvent);
                        return false;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC87234YLm
            public final boolean LJJJJ(MotionEvent event) {
                o.LJIIIZ(event, "event");
                C5Q2 c5q2 = C134585Py.this.LIZLLL;
                if (c5q2 != null) {
                    c5q2.LJIIJJI(event);
                }
                Iterator<InterfaceC132925Jo> it = C134585Py.this.LIZJ.iterator();
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

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC87234YLm
            public final void onScale(float f) {
                NLETrack nLETrack;
                NLETrackSlot nLETrackSlot;
                Boolean bool;
                OSZ osz = (OSZ) C134585Py.this.LIZIZ.LJLLLL.getValue();
                if (osz != null) {
                    nLETrack = (NLETrack) osz.getFirst();
                } else {
                    nLETrack = null;
                }
                OSZ osz2 = (OSZ) C134585Py.this.LIZIZ.LJLLLL.getValue();
                if (osz2 != null) {
                    nLETrackSlot = (NLETrackSlot) osz2.getSecond();
                } else {
                    nLETrackSlot = null;
                }
                if (nLETrack == null || nLETrackSlot == null || C134585Py.this.LIZJ.isEmpty()) {
                    C5Q2 c5q2 = C134585Py.this.LIZLLL;
                    if (c5q2 != null) {
                        c5q2.LJIIJ();
                        return;
                    }
                    return;
                }
                C134585Py c134585Py = C134585Py.this;
                Iterator<InterfaceC132925Jo> it = c134585Py.LIZJ.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (next.LJII(nLETrack, nLETrackSlot)) {
                        C5Q2 c5q22 = c134585Py.LIZLLL;
                        if (c5q22 != null) {
                            c5q22.LJIIIZ(next, nLETrack, nLETrackSlot);
                            bool = Boolean.FALSE;
                        } else {
                            bool = null;
                        }
                        if (o.LJ(bool, Boolean.TRUE)) {
                            LIZ(next, 4096);
                            return;
                        } else if (next.LJJ(nLETrack, nLETrackSlot, f)) {
                            LIZ(next, 4096);
                            return;
                        }
                    }
                }
                C5Q2 c5q23 = C134585Py.this.LIZLLL;
                if (c5q23 != null) {
                    c5q23.LJIIJ();
                }
            }

            @Override // X.InterfaceC87234YLm
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (motionEvent != null) {
                    C134585Py c134585Py = C134585Py.this;
                    InterfaceC132925Jo LIZ = c134585Py.LIZ(motionEvent, false);
                    if (LIZ != null) {
                        LIZ(LIZ, 1);
                        return true;
                    }
                    C5Q2 c5q2 = c134585Py.LIZLLL;
                    if (c5q2 != null) {
                        c5q2.LIZLLL(motionEvent);
                    }
                }
                return false;
            }

            public final void LIZ(InterfaceC132925Jo interfaceC132925Jo, int i) {
                if (this.LIZ.get(interfaceC132925Jo.hashCode(), -1) == -1) {
                    this.LIZ.put(interfaceC132925Jo.hashCode(), i);
                } else {
                    this.LIZ.put(interfaceC132925Jo.hashCode(), i | this.LIZ.get(interfaceC132925Jo.hashCode()));
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC87234YLm
            public final void LJJJJI(float f, float f2, int i) {
                NLETrack nLETrack;
                NLETrackSlot nLETrackSlot;
                float f3;
                float f4;
                Boolean bool;
                boolean LJIIJ;
                OSZ osz = (OSZ) C134585Py.this.LIZIZ.LJLLLL.getValue();
                if (osz != null) {
                    nLETrack = (NLETrack) osz.getFirst();
                } else {
                    nLETrack = null;
                }
                OSZ osz2 = (OSZ) C134585Py.this.LIZIZ.LJLLLL.getValue();
                if (osz2 != null) {
                    nLETrackSlot = (NLETrackSlot) osz2.getSecond();
                } else {
                    nLETrackSlot = null;
                }
                if (nLETrack == null || nLETrackSlot == null || C134585Py.this.LIZJ.isEmpty()) {
                    C5Q2 c5q2 = C134585Py.this.LIZLLL;
                    if (c5q2 != null) {
                        c5q2.LJ();
                        return;
                    }
                    return;
                }
                C134585Py c134585Py = C134585Py.this;
                Iterator<InterfaceC132925Jo> it = c134585Py.LIZJ.iterator();
                while (it.hasNext()) {
                    InterfaceC132925Jo next = it.next();
                    if (next.LJII(nLETrack, nLETrackSlot)) {
                        OSZ<Float, Float> jv0 = c134585Py.LIZIZ.jv0(c134585Py.LIZ);
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
                        float floatValue = LJIIJJI / jv0.getFirst().floatValue();
                        float floatValue2 = LJIIJJI2 / jv0.getSecond().floatValue();
                        C5Q2 c5q22 = c134585Py.LIZLLL;
                        if (c5q22 != null) {
                            c5q22.LIZ(next, nLETrack, nLETrackSlot);
                            bool = Boolean.FALSE;
                        } else {
                            bool = null;
                        }
                        if (o.LJ(bool, Boolean.TRUE)) {
                            LJIIJ = bool.booleanValue();
                        } else {
                            LJIIJ = next.LJIIJ(nLETrack, nLETrackSlot, i, f3, f4, floatValue, floatValue2);
                        }
                        if (LJIIJ) {
                            LIZ(next, 256);
                            return;
                        }
                    }
                }
                C5Q2 c5q23 = C134585Py.this.LIZLLL;
                if (c5q23 != null) {
                    c5q23.LJ();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC132925Jo LIZ(MotionEvent motionEvent, boolean z) {
        NLEVideoFrameModel cover;
        NLEModel value = this.LIZIZ.LJLIL.getValue();
        if (value == null) {
            return null;
        }
        Long l = (Long) this.LIZIZ.LJLJI.getValue();
        if (l == null) {
            l = 0L;
        }
        long longValue = l.longValue();
        NLEModel value2 = this.LIZIZ.LJLIL.getValue();
        if (value2 != null) {
            Float valueOf = Float.valueOf(value2.getCanvasRatio());
            if (valueOf.floatValue() != 0.0f) {
                valueOf.floatValue();
                VecNLETrackSPtr vecNLETrackSPtr = value.getTracks();
                NLEModel value3 = this.LIZIZ.LJLIL.getValue();
                if (value3 != null && (cover = value3.getCover()) != null && cover.getEnable()) {
                    vecNLETrackSPtr = value.getCover().getTracks();
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
                        long j = Long.MAX_VALUE;
                        if (nLETrackSlot.getEndTime() != Long.MAX_VALUE) {
                            j = nLETrackSlot.getEndTime() + 1;
                        }
                        if (nLETrackSlot.getStartTime() <= longValue && longValue < j) {
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
                for (NLETrack nLETrack2 : ORZ.LLILII(new IDComparatorS30S0000000_2(28), linkedHashMap.keySet())) {
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
                for (NLETrack nLETrack3 : ORZ.LLILII(new IDComparatorS30S0000000_2(29), linkedHashMap2.keySet())) {
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
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[EDGE_INSN: B:41:0x009d->B:42:0x009d BREAK  A[LOOP:1: B:13:0x0026->B:45:0x0026], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC132925Jo LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrack r11, com.bytedance.ies.nle.editor_jni.NLETrackSlot r12, android.view.MotionEvent r13, boolean r14) {
        /*
            r10 = this;
            java.util.ArrayList<X.5Jo> r0 = r10.LIZJ
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5Jo r0 = (X.InterfaceC132925Jo) r0
            boolean r0 = r0.LJII(r11, r12)
            if (r0 == 0) goto Lb
            r3.add(r1)
            goto Lb
        L22:
            java.util.Iterator r9 = r3.iterator()
        L26:
            boolean r0 = r9.hasNext()
            r2 = 0
            if (r0 == 0) goto Lb7
            java.lang.Object r1 = r9.next()
            X.5Jo r1 = (X.InterfaceC132925Jo) r1
            com.ss.ugc.android.editor.preview.PreviewPanelViewModel r3 = r10.LIZIZ
            X.YLi r0 = r10.LIZ
            X.5PT r3 = r3.kv0(r1, r0, r12)
            if (r3 == 0) goto L26
            float r8 = r13.getX()
            float r7 = r13.getY()
            r6 = 0
            r5 = 1
            if (r12 != 0) goto L4a
            goto L26
        L4a:
            float r0 = r3.LJLJI
            float r8 = r8 - r0
            float r0 = r3.LJLJJI
            float r7 = r7 - r0
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r0 = r3.LJLJJL
            float r0 = (float) r0
            float r0 = -r0
            r4.setRotate(r0)
            r0 = 2
            float[] r0 = new float[r0]
            r0[r6] = r8
            r0[r5] = r7
            r4.mapPoints(r0)
            r6 = r0[r6]
            r5 = r0[r5]
            float r4 = r3.LJLIL
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r3 = r3.LJLILLLLZI
            float r3 = r3 / r0
            float r0 = -r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L26
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L26
            float r0 = -r3
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L26
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L26
            if (r14 == 0) goto L9e
            X.5Q2 r0 = r10.LIZLLL
            if (r0 == 0) goto L8f
            r0.LJI(r1, r11, r12, r13)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L8f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 != 0) goto L9d
            boolean r0 = r1.LJIL(r11, r12, r13)
        L9b:
            if (r0 == 0) goto L26
        L9d:
            return r1
        L9e:
            X.5Q2 r0 = r10.LIZLLL
            if (r0 == 0) goto Laa
            boolean r0 = r0.LIZIZ(r1, r11, r12, r13)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        Laa:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 != 0) goto L9d
            boolean r0 = r1.LJIILLIIL(r11, r12, r13)
            goto L9b
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134585Py.LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, android.view.MotionEvent, boolean):X.5Jo");
    }
}
