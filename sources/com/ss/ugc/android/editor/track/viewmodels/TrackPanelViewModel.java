package com.ss.ugc.android.editor.track.viewmodels;

import X.C124574uj;
import X.C1279150h;
import X.C1279350j;
import X.C1279550l;
import X.C1279650m;
import X.C1280250s;
import X.C1280750x;
import X.C1300758p;
import X.C134845Qy;
import X.C146165oS;
import X.C221108m2;
import X.C32I;
import X.C47261Igj;
import X.C50N;
import X.C5BA;
import X.C61878OQg;
import X.C62822Ol8;
import X.C76800UCe;
import X.EnumC127354zD;
import X.EnumC127484zQ;
import X.EnumC1280050q;
import X.InterfaceC88472Yns;
import X.ORZ;
import Y.IDComparatorS30S0000000_2;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.editor.track.TrackState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class TrackPanelViewModel extends ViewModel {
    public NLEModel LJLILLLLZI;
    public NLEModel LJLJI;
    public final MutableLiveData<NLEModel> LJLJJL;
    public final MutableLiveData<C50N> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;
    public final MutableLiveData<C1279550l> LJLJLLL;
    public final MutableLiveData<Boolean> LJLL;
    public final MutableLiveData<Integer> LJLLI;
    public final MutableLiveData<C76800UCe> LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final MutableLiveData<NLETrack> LJZ;
    public final MutableLiveData<C1280250s> LJZI;
    public final MutableLiveData<List<C1280750x>> LJZL;
    public final MutableLiveData<C1279150h> LL;
    public final MutableLiveData<List<C1280750x>> LLD;
    public final MutableLiveData<List<C1280750x>> LLF;
    public final MutableLiveData<List<C1280750x>> LLFF;
    public final MutableLiveData<List<C1280750x>> LLFFF;
    public final MutableLiveData<Boolean> LLFII;
    public final ArrayList<C1280750x> LLFZ;
    public final ArrayList<C1280750x> LLI;
    public final ArrayList<C1280750x> LLIFFJFJJ;
    public final ArrayList<C1280750x> LLII;
    public final ArrayList<C1280750x> LLIIII;
    public final ArrayList<C1280750x> LLIIIILZ;
    public final ArrayList<C1280750x> LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final MutableLiveData LLIIIZ;
    public final MutableLiveData LLIIJI;
    public final MutableLiveData LLIIJLIL;
    public final MutableLiveData LLIIL;
    public final MutableLiveData LLIILII;
    public final MutableLiveData LLIILZL;
    public final MutableLiveData LLIIZ;
    public final MutableLiveData LLIL;
    public final MutableLiveData LLILII;
    public final MutableLiveData<C50N> LLILIL;
    public final MutableLiveData<C1280250s> LLILL;
    public final MutableLiveData<Integer> LLILLIZIL;
    public final MutableLiveData<C1279150h> LLILLJJLI;
    public final MutableLiveData<List<C1280750x>> LLILLL;
    public final MutableLiveData<List<C1280750x>> LLILZ;
    public final MutableLiveData<List<C1280750x>> LLILZIL;
    public final MutableLiveData LLILZLL;
    public InterfaceC88472Yns<? super NLETrack, Boolean> LLIZ;
    public boolean LLIZLLLIL;
    public final String LJLIL = "TrackPanelViewModel";
    public boolean LJLJJI = true;

    public void iv0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackPanelViewModel() {
        MutableLiveData<NLEModel> mutableLiveData = new MutableLiveData<>();
        this.LJLJJL = mutableLiveData;
        MutableLiveData<C50N> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData2;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(bool);
        this.LJLJL = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>(Boolean.TRUE);
        this.LJLJLJ = mutableLiveData4;
        MutableLiveData<C1279550l> mutableLiveData5 = new MutableLiveData<>(new C1279550l(true, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 510));
        this.LJLJLLL = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>(bool);
        this.LJLL = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>();
        this.LJLLI = mutableLiveData7;
        MutableLiveData<C76800UCe> mutableLiveData8 = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData8;
        this.LJLLJ = true;
        this.LJLLLL = true;
        this.LJLLLLLL = true;
        this.LJLZ = true;
        MutableLiveData<NLETrack> mutableLiveData9 = new MutableLiveData<>();
        this.LJZ = mutableLiveData9;
        MutableLiveData<C1280250s> mutableLiveData10 = new MutableLiveData<>(new C1280250s(TrackState.NORMAL, 20.0f, 4.0f, 4.0f));
        this.LJZI = mutableLiveData10;
        MutableLiveData<List<C1280750x>> mutableLiveData11 = new MutableLiveData<>();
        this.LJZL = mutableLiveData11;
        MutableLiveData<C1279150h> mutableLiveData12 = new MutableLiveData<>(new C1279150h(0 == true ? 1 : 0));
        this.LL = mutableLiveData12;
        MutableLiveData<List<C1280750x>> mutableLiveData13 = new MutableLiveData<>();
        this.LLD = mutableLiveData13;
        MutableLiveData<List<C1280750x>> mutableLiveData14 = new MutableLiveData<>();
        this.LLF = mutableLiveData14;
        this.LLFF = new MutableLiveData<>();
        MutableLiveData mutableLiveData15 = new MutableLiveData();
        MutableLiveData<List<C1280750x>> mutableLiveData16 = new MutableLiveData<>();
        this.LLFFF = mutableLiveData16;
        MutableLiveData<Boolean> mutableLiveData17 = new MutableLiveData<>();
        this.LLFII = mutableLiveData17;
        this.LLFZ = new ArrayList<>();
        this.LLI = new ArrayList<>();
        this.LLIFFJFJJ = new ArrayList<>();
        this.LLII = new ArrayList<>();
        this.LLIIII = new ArrayList<>();
        this.LLIIIILZ = new ArrayList<>();
        this.LLIIIJ = new ArrayList<>();
        this.LLIIIL = C221108m2.LIZIZ(C1279350j.LJLIL);
        this.LLIIIZ = mutableLiveData9;
        this.LLIIJI = mutableLiveData;
        this.LLIIJLIL = mutableLiveData6;
        this.LLIIL = mutableLiveData3;
        this.LLIILII = mutableLiveData4;
        this.LLIILZL = mutableLiveData5;
        this.LLIIZ = mutableLiveData15;
        this.LLIL = mutableLiveData17;
        this.LLILII = mutableLiveData11;
        this.LLILIL = mutableLiveData2;
        this.LLILL = mutableLiveData10;
        this.LLILLIZIL = mutableLiveData7;
        this.LLILLJJLI = mutableLiveData12;
        this.LLILLL = mutableLiveData13;
        this.LLILZ = mutableLiveData14;
        this.LLILZIL = mutableLiveData16;
        this.LLILZLL = mutableLiveData8;
    }

    public final TrackState jv0() {
        TrackState trackState;
        C1280250s value = this.LJZI.getValue();
        if (value == null || (trackState = value.LJLIL) == null) {
            return TrackState.NORMAL;
        }
        return trackState;
    }

    public final List<C1280750x> mv0() {
        TrackState trackState;
        C1280250s value = this.LJZI.getValue();
        if (value != null) {
            trackState = value.LJLIL;
        } else {
            trackState = null;
        }
        return nv0(trackState);
    }

    public final boolean ov0() {
        if (jv0() == TrackState.NORMAL) {
            return true;
        }
        return false;
    }

    public static void hv0(ArrayList arrayList) {
        int i = 0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C1280750x c1280750x = (C1280750x) next;
                if (c1280750x.LIZ > 300) {
                    ListProtector.set(arrayList, i, C1280750x.LIZ(c1280750x, i));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public int gv0(List<C1280750x> subTrackList) {
        o.LJIIIZ(subTrackList, "subTrackList");
        return C134845Qy.LIZ(48.0f);
    }

    public final List<C1280750x> nv0(TrackState trackState) {
        if (trackState != null) {
            int i = 0;
            switch (C1279650m.LIZJ[trackState.ordinal()]) {
                case 1:
                    return this.LLIIII;
                case 2:
                    return this.LLFZ;
                case 3:
                    return this.LLIIIILZ;
                case 4:
                    if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_MENU_HIERARCHY_OPTIMIZATION, Boolean.FALSE)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        if (!this.LLIIIJ.isEmpty()) {
                            ArrayList<C1280750x> arrayList2 = this.LLIIIJ;
                            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                            Iterator<C1280750x> it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(C1280750x.LIZ(it.next(), 0));
                            }
                            arrayList.addAll(arrayList3);
                            i = 1;
                        }
                        if (!this.LLIIII.isEmpty()) {
                            ArrayList<C1280750x> arrayList4 = this.LLIIII;
                            ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
                            Iterator<C1280750x> it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(C1280750x.LIZ(it2.next(), i));
                            }
                            arrayList.addAll(arrayList5);
                            i++;
                        }
                        if (!(!this.LLIIIILZ.isEmpty())) {
                            return arrayList;
                        }
                        ArrayList<C1280750x> arrayList6 = this.LLIIIILZ;
                        ArrayList arrayList7 = new ArrayList(C32I.LJJL(arrayList6, 10));
                        Iterator<C1280750x> it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            arrayList7.add(C1280750x.LIZ(it3.next(), i));
                        }
                        arrayList.addAll(arrayList7);
                        return arrayList;
                    }
                    return this.LLIIIJ;
                case 5:
                    return this.LLIIIJ;
                case 6:
                    ArrayList<C1280750x> arrayList8 = this.LLIIIJ;
                    ArrayList arrayList9 = new ArrayList();
                    Iterator<C1280750x> it4 = arrayList8.iterator();
                    while (it4.hasNext()) {
                        C1280750x next = it4.next();
                        if (o.LJ(next.LJ, "AUDIO_RECORD")) {
                            arrayList9.add(next);
                        }
                    }
                    List LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(19), arrayList9);
                    ArrayList arrayList10 = new ArrayList(C32I.LJJL(LLILII, 10));
                    Iterator it5 = LLILII.iterator();
                    while (it5.hasNext()) {
                        arrayList10.add(C1280750x.LIZ((C1280750x) it5.next(), i));
                        i++;
                    }
                    return arrayList10;
                case 7:
                    return this.LLI;
                case 8:
                    return this.LLII;
                case 9:
                    return this.LLIFFJFJJ;
            }
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010e, code lost:
    
        if (r8 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void rv0(com.ss.ugc.android.editor.track.TrackState r21) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel.rv0(com.ss.ugc.android.editor.track.TrackState):void");
    }

    public static boolean pv0(NLETrack nLETrack, NLETrack nLETrack2) {
        VecNLETrackSlotSPtr LJIILLIIL = nLETrack.LJIILLIIL();
        VecNLETrackSlotSPtr LJIILLIIL2 = nLETrack2.LJIILLIIL();
        if (LJIILLIIL.size() != LJIILLIIL2.size() || C146165oS.LIZLLL(nLETrack.LJIJ(), nLETrack2.LJIJ())) {
            return true;
        }
        int size = LJIILLIIL2.size();
        for (int i = 0; i < size; i++) {
            NLETrackSlot nLETrackSlot = LJIILLIIL.get(i);
            NLETrackSlot nLETrackSlot2 = LJIILLIIL2.get(i);
            if (!o.LJ(nLETrackSlot.getStringId(), nLETrackSlot2.getStringId()) && (C146165oS.LIZ(nLETrackSlot, nLETrackSlot2) || !o.LJ(nLETrackSlot.getUUID(), nLETrackSlot2.getUUID()) || nLETrackSlot.LJFF().size() != nLETrackSlot2.LJFF().size())) {
                return true;
            }
        }
        return false;
    }

    public final void kv0(VecNLETrackSPtr vecNLETrackSPtr, VecNLETrackSPtr vecNLETrackSPtr2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = vecNLETrackSPtr.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (C124574uj.LJJIJIL(next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it2 = vecNLETrackSPtr2.iterator();
        while (it2.hasNext()) {
            NLETrack next2 = it2.next();
            if (C124574uj.LJJIJIL(next2)) {
                arrayList2.add(next2);
            }
        }
        if (arrayList.size() != arrayList2.size()) {
            this.LJLLILLLL.setValue(C76800UCe.LIZ);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!o.LJ(((NLENode) ListProtector.get(arrayList, i)).getStringId(), ((NLENode) ListProtector.get(arrayList2, i)).getStringId())) {
                this.LJLLILLLL.setValue(C76800UCe.LIZ);
                return;
            }
        }
    }

    public final void lv0(VecNLETrackSPtr vecNLETrackSPtr, VecNLETrackSPtr vecNLETrackSPtr2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = vecNLETrackSPtr.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (C124574uj.LJJJJJL(next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it2 = vecNLETrackSPtr2.iterator();
        while (it2.hasNext()) {
            NLETrack next2 = it2.next();
            if (C124574uj.LJJJJJL(next2)) {
                arrayList2.add(next2);
            }
        }
        if (arrayList.size() != arrayList2.size()) {
            this.LLIZLLLIL = true;
            return;
        }
        if (!(!arrayList2.isEmpty())) {
            return;
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            NLETrack nLETrack = (NLETrack) ListProtector.get(arrayList, i);
            NLETrack nLETrack2 = (NLETrack) ListProtector.get(arrayList2, i);
            if (!o.LJ(nLETrack.getStringId(), nLETrack2.getStringId()) && pv0(nLETrack, nLETrack2)) {
                this.LLIZLLLIL = true;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void qv0(C1279550l c1279550l, boolean z) {
        NLETrack nLETrack;
        C1279550l c1279550l2;
        NLETrack nLETrack2;
        NLETrack nLETrack3;
        NLETrackSlot nLETrackSlot;
        C1279550l c1279550l3 = c1279550l;
        C1279550l value = this.LJLJLLL.getValue();
        if (((Boolean) this.LLIIIL.getValue()).booleanValue() && (nLETrackSlot = c1279550l3.LIZJ) != null && Boolean.parseBoolean(nLETrackSlot.getExtra("is_black_frame")) && !this.LJLLLL) {
            return;
        }
        NLETrackSlot nLETrackSlot2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (C1300758p.LJI) {
            int i = C1279650m.LIZ[c1279550l3.LJFF.ordinal()];
            boolean z2 = true;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.LJLLLL && !z) {
                        boolean z3 = false;
                        c1279550l3 = r4;
                        C1279550l c1279550l4 = new C1279550l(true, c1279550l3.LIZIZ, nLETrackSlot2, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, EnumC1280050q.NORMAL, z3, z3, z3, 476);
                    }
                } else {
                    if (this.LJLLL && (nLETrack3 = c1279550l3.LIZIZ) != null && nLETrack3.LJIIJ() && c1279550l3.LJ == EnumC127354zD.CLIP) {
                        c1279550l2 = C1279550l.LIZ(c1279550l3, EnumC127354zD.LINE, null, 495);
                    } else {
                        c1279550l2 = c1279550l3;
                    }
                    if (c1279550l3.LJ == EnumC127354zD.LINE && this.LJLLLL) {
                        c1279550l3 = C1279550l.LIZ(c1279550l3, EnumC127354zD.CLIP, null, 495);
                    }
                    c1279550l3 = c1279550l2;
                }
            } else if (this.LJLLJ || (value != null && (nLETrack2 = value.LIZIZ) != null && nLETrack2.LJIIJ())) {
                EnumC127354zD enumC127354zD = c1279550l3.LJ;
                EnumC127354zD enumC127354zD2 = EnumC127354zD.LINE;
                if (enumC127354zD == enumC127354zD2) {
                    boolean z4 = false;
                    c1279550l2 = new C1279550l(z2, c1279550l3.LIZIZ, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, c1279550l3.LJFF, z4, z4, z4, 476);
                    c1279550l3 = c1279550l2;
                } else if (enumC127354zD == EnumC127354zD.CLIP && (nLETrack = c1279550l3.LIZIZ) != null && nLETrack.LJIIJ() && !this.LJLLLL) {
                    c1279550l3 = C1279550l.LIZ(c1279550l3, enumC127354zD2, null, 495);
                }
            } else {
                return;
            }
        } else if (!this.LJLLLL && c1279550l3.LJ == EnumC127354zD.CLIP) {
            c1279550l3 = C1279550l.LIZ(c1279550l3, EnumC127354zD.LINE, null, 495);
        }
        this.LJLJLLL.setValue(c1279550l3);
    }
}
