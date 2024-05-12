package com.ss.ugc.android.editor.track.viewmodels;

import X.C1279250i;
import X.C1279850o;
import X.C1280250s;
import X.C1280750x;
import X.C221108m2;
import X.C47261Igj;
import X.C62822Ol8;
import androidx.lifecycle.MutableLiveData;
import com.ss.ugc.android.editor.track.TrackState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTrackPanelViewModel extends TrackPanelViewModel {
    public static final /* synthetic */ int LLJI = 0;
    public final C62822Ol8 LLJ = C221108m2.LIZIZ(C1279250i.LJLIL);

    @Override // com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel
    public final int gv0(List<C1280750x> subTrackList) {
        o.LJIIIZ(subTrackList, "subTrackList");
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0.isEmpty() == true) goto L13;
     */
    @Override // com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iv0() {
        /*
            r10 = this;
            androidx.lifecycle.MutableLiveData<X.50s> r0 = r10.LJZI
            java.lang.Object r0 = r0.getValue()
            X.50s r0 = (X.C1280250s) r0
            if (r0 == 0) goto Le
            com.ss.ugc.android.editor.track.TrackState r0 = r0.LJLIL
            if (r0 != 0) goto L10
        Le:
            com.ss.ugc.android.editor.track.TrackState r0 = com.ss.ugc.android.editor.track.TrackState.NORMAL
        L10:
            float r4 = r10.tv0(r0)
            float r5 = r10.vv0(r0)
            float r6 = r10.uv0(r0)
            float r7 = r10.sv0(r0)
            androidx.lifecycle.MutableLiveData<X.50s> r1 = r10.LJZI
            java.lang.Object r2 = r1.getValue()
            X.50s r2 = (X.C1280250s) r2
            if (r2 == 0) goto L48
            androidx.lifecycle.MutableLiveData<java.util.List<X.50x>> r0 = r10.LJZL
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L46
            boolean r0 = r0.isEmpty()
            r8 = 1
            if (r0 != r8) goto L46
        L3b:
            r3 = 0
            r9 = 449(0x1c1, float:6.29E-43)
            X.50s r0 = X.C1280250s.L(r2, r3, r4, r5, r6, r7, r8, r9)
        L42:
            r1.setValue(r0)
            return
        L46:
            r8 = 0
            goto L3b
        L48:
            r0 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel.iv0():void");
    }

    private final float sv0(TrackState trackState) {
        if (!this.LJLZ) {
            return 0.0f;
        }
        int i = 1;
        boolean z = !this.LLIIII.isEmpty();
        if (C1279850o.LIZ[trackState.ordinal()] == 1 || !z) {
            i = 0;
        }
        return (i * 5.0f) + 4.0f;
    }

    private final float tv0(TrackState trackState) {
        boolean z;
        int size;
        boolean z2 = !this.LLFZ.isEmpty();
        int i = 0;
        if ((!this.LLIIIILZ.isEmpty()) && this.LJLZ) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !this.LLIIII.isEmpty();
        if (!this.LJLLLLLL) {
            return 20.0f;
        }
        int[] iArr = C1279850o.LIZ;
        switch (iArr[trackState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                int i2 = iArr[trackState.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            ArrayList LJII = C47261Igj.LJII(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
                            ArrayList arrayList = new ArrayList();
                            Iterator it = LJII.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (((Boolean) next).booleanValue()) {
                                    arrayList.add(next);
                                }
                            }
                            size = arrayList.size();
                        } else {
                            ArrayList LJII2 = C47261Igj.LJII(Boolean.valueOf(z3), Boolean.valueOf(z2));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = LJII2.iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (((Boolean) next2).booleanValue()) {
                                    arrayList2.add(next2);
                                }
                            }
                            size = arrayList2.size();
                        }
                    } else {
                        ArrayList LJII3 = C47261Igj.LJII(Boolean.valueOf(z), Boolean.valueOf(z3));
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = LJII3.iterator();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            if (((Boolean) next3).booleanValue()) {
                                arrayList3.add(next3);
                            }
                        }
                        size = arrayList3.size();
                    }
                } else {
                    ArrayList LJII4 = C47261Igj.LJII(Boolean.valueOf(z), Boolean.valueOf(z2));
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = LJII4.iterator();
                    while (it4.hasNext()) {
                        Object next4 = it4.next();
                        if (((Boolean) next4).booleanValue()) {
                            arrayList4.add(next4);
                        }
                    }
                    size = arrayList4.size();
                }
                return 20.0f + (size * 5.0f);
            case 4:
                if (!((Boolean) this.LLJ.getValue()).booleanValue()) {
                    ArrayList LJII5 = C47261Igj.LJII(Boolean.valueOf(z), Boolean.valueOf(z3));
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = LJII5.iterator();
                    while (it5.hasNext()) {
                        Object next5 = it5.next();
                        if (((Boolean) next5).booleanValue()) {
                            arrayList5.add(next5);
                        }
                    }
                    i = arrayList5.size();
                }
                return ((z2 ? 1.0f : 0.0f) * 26.0f) + (i * 5.0f) + 20.0f;
            default:
                return 20.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r5 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float uv0(com.ss.ugc.android.editor.track.TrackState r8) {
        /*
            r7 = this;
            java.util.ArrayList<X.50x> r0 = r7.LLIIIILZ
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            r6 = 0
            if (r0 == 0) goto Lb9
            boolean r0 = r7.LJLZ
            if (r0 == 0) goto Lb9
            r5 = 1
        L11:
            java.util.ArrayList<X.50x> r0 = r7.LLIIII
            boolean r0 = r0.isEmpty()
            r4 = r0 ^ 1
            int[] r1 = X.C1279850o.LIZ
            int r0 = r8.ordinal()
            r2 = r1[r0]
            if (r2 == r3) goto L6e
            r0 = 4
            r1 = 2
            if (r2 == r0) goto L71
            r0 = 5
            if (r2 == r0) goto L37
            r0 = 6
            if (r2 == r0) goto L37
            if (r4 == 0) goto L7f
        L2f:
            float r1 = (float) r3
            r0 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 + r0
            return r1
        L37:
            java.lang.Boolean[] r1 = new java.lang.Boolean[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1[r6] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1[r3] = r0
            java.util.ArrayList r0 = X.C47261Igj.LJII(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L52
            r3.add(r1)
            goto L52
        L69:
            int r3 = r3.size()
            goto L2f
        L6e:
            if (r5 == 0) goto L7f
            goto L2f
        L71:
            X.Ol8 r0 = r7.LLJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
        L7f:
            r3 = 0
            goto L2f
        L81:
            java.lang.Boolean[] r1 = new java.lang.Boolean[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1[r6] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1[r3] = r0
            java.util.ArrayList r0 = X.C47261Igj.LJII(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L9c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9c
            r3.add(r1)
            goto L9c
        Lb3:
            int r3 = r3.size()
            goto L2f
        Lb9:
            r5 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel.uv0(com.ss.ugc.android.editor.track.TrackState):float");
    }

    private final float vv0(TrackState trackState) {
        if (!this.LJLLLLLL) {
            if (((Boolean) this.LLJ.getValue()).booleanValue()) {
                return 0.0f;
            }
        } else {
            int i = C1279850o.LIZ[trackState.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (((Boolean) this.LLJ.getValue()).booleanValue()) {
                    return 0.0f;
                }
            } else {
                if (!this.LLIIIJ.isEmpty()) {
                    return 9.0f;
                }
                if (((Boolean) this.LLJ.getValue()).booleanValue()) {
                    return 0.0f;
                }
            }
        }
        return 4.0f;
    }

    @Override // com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel
    public final void rv0(TrackState subTrackState) {
        TrackState trackState;
        boolean z;
        o.LJIIIZ(subTrackState, "subTrackState");
        C1280250s value = this.LJZI.getValue();
        C1280250s c1280250s = null;
        if (value != null) {
            trackState = value.LJLIL;
        } else {
            trackState = null;
        }
        float tv0 = tv0(subTrackState);
        float vv0 = vv0(subTrackState);
        float uv0 = uv0(subTrackState);
        float sv0 = sv0(subTrackState);
        TrackState trackState2 = TrackState.PIP;
        if (trackState == trackState2 && subTrackState != trackState2) {
            z = true;
        } else {
            z = false;
        }
        boolean isEmpty = nv0(subTrackState).isEmpty();
        MutableLiveData<C1280250s> mutableLiveData = this.LJZI;
        C1280250s value2 = mutableLiveData.getValue();
        if (value2 != null) {
            c1280250s = C1280250s.L(value2, subTrackState, tv0, vv0, uv0, sv0, isEmpty, 448);
        }
        mutableLiveData.setValue(c1280250s);
        if (trackState != subTrackState && !z) {
            this.LJLL.setValue(Boolean.TRUE);
            this.LJZL.setValue(mv0());
        }
    }
}
