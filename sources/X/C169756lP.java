package X;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169756lP {
    public final WM7 LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final Activity LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C169746lO LJ;

    public final EditEffectVideoModel LIZIZ() {
        return (EditEffectVideoModel) this.LIZLLL.getValue();
    }

    public final List<EffectPointModel> LIZ(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
        ArrayList<EffectPointModel> J7 = LIZIZ().hv0().J7();
        ArrayList arrayList = new ArrayList();
        Iterator<EffectPointModel> it = J7.iterator();
        while (it.hasNext()) {
            EffectPointModel next = it.next();
            if (o.LJ(next.getCategory(), categoryKey)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6lO] */
    public C169756lP(AbstractC42651GoZ abstractC42651GoZ, VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = abstractC42651GoZ;
        this.LIZIZ = editModel;
        Activity requireActivity = abstractC42651GoZ.requireActivity();
        o.LJIIIIZZ(requireActivity, "rootScene.requireActivity()");
        this.LIZJ = requireActivity;
        this.LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 845));
        this.LJ = new InterfaceC165006dk() { // from class: X.6lO
            public boolean LIZ;

            @Override // X.InterfaceC165006dk
            public final boolean LIZ(EffectModel effectModel) {
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC165006dk
            public final void LIZJ() {
            }

            @Override // X.InterfaceC165006dk
            public final void LJ(EffectModel effectModel) {
                o.LJIIIZ(effectModel, "effectModel");
            }

            @Override // X.InterfaceC165006dk
            public final void LJII() {
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIIZ(C5M2 c5m2) {
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIJJI(String str) {
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILIIL(EffectModel effectModel) {
                return false;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJI(String effectId) {
                o.LJIIIZ(effectId, "effectId");
                return false;
            }

            @Override // X.InterfaceC165006dk
            public final void LJIILL(EffectModel effectModel) {
                this.LIZ = false;
                C169756lP.this.LIZIZ().jv0().setValue(VEEffectSelectOp.selectFilter(1, effectModel));
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILLIIL(EffectModel effectModel) {
                o.LJIIIZ(effectModel, "effectModel");
                this.LIZ = true;
                if (C164996dj.LIZLLL(effectModel.category)) {
                    return false;
                }
                C169756lP.this.LIZIZ().jv0().setValue(VEEffectSelectOp.selectFilter(0, effectModel));
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LIZLLL(Effect effect, AqS152S0100000_2 aqS152S0100000_2) {
                o.LJIIIZ(effect, "effect");
                return false;
            }

            @Override // X.InterfaceC165006dk
            public final void LJFF(int i, EffectModel effectModel) {
                EffectCategoryResponse effectCategoryResponse;
                String key;
                C5M2 value = C169756lP.this.LIZIZ().nv0().getValue();
                if (value == null || (effectCategoryResponse = value.LIZIZ) == null || (key = effectCategoryResponse.getKey()) == null) {
                    return;
                }
                VideoPublishEditModel videoPublishEditModel = C169756lP.this.LIZIZ;
                String str = effectModel.key;
                o.LJIIIIZZ(str, "effectModel.key");
                C135005Ro.LJIIIIZZ(videoPublishEditModel, str, key, i, false, false, null, Integer.valueOf(effectModel.source), effectModel.designerId, 64);
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIJ(String categoryKey, List<? extends EffectPointModel> curEffects) {
                EffectCategoryResponse effectCategoryResponse;
                String key;
                o.LJIIIZ(categoryKey, "categoryKey");
                o.LJIIIZ(curEffects, "curEffects");
                C5M2 value = C169756lP.this.LIZIZ().nv0().getValue();
                if (value != null && (effectCategoryResponse = value.LIZIZ) != null && (key = effectCategoryResponse.getKey()) != null && o.LJ(categoryKey, key)) {
                    C169756lP.this.LIZJ(categoryKey, curEffects);
                }
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIIL(int i, EffectModel effectModel) {
                if (C169756lP.this.LIZIZ().LJZL && !this.LIZ) {
                    return false;
                }
                if (5 == i || i == 0) {
                    if (o.LJ(((LiveData) C169756lP.this.LIZIZ().LJZ.getValue()).getValue(), Boolean.TRUE)) {
                        return false;
                    }
                    C170056lt value = C169756lP.this.LIZIZ().lv0().getValue();
                    if (value != null && value.LJLJI) {
                        C24540xm.LIZ(R.string.i_p, C169756lP.this.LIZJ, 3011);
                        return false;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILJJIL(int i, C170416mT c170416mT, int i2) {
                int i3;
                InterfaceC153045zY value = C169756lP.this.LIZIZ().hv0().LIZIZ().getValue();
                if (value != null) {
                    i3 = value.LLIZLLLIL();
                } else {
                    i3 = 0;
                }
                if (C169816lV.LIZLLL(i3, i)) {
                    C24540xm.LIZ(R.string.fsp, C169756lP.this.LIZJ, 3011);
                    return false;
                }
                C169756lP.this.LIZIZ().jv0().setValue(VEEffectSelectOp.selectTime(i));
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIIZILJ(EffectModel effectModel, int i, boolean z) {
                C169756lP.this.LIZIZ().jv0().setValue(VEEffectSelectOp.selectTrans(effectModel));
                return true;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r9 >= 5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r14, java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectPointModel> r15) {
        /*
            r13 = this;
            java.lang.String r0 = "categoryKey"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            if (r15 != 0) goto Lb
            java.util.List r15 = r13.LIZ(r14)
        Lb:
            com.ss.android.ugc.aweme.effect.EditEffectVideoModel r0 = r13.LIZIZ()
            androidx.lifecycle.MutableLiveData r7 = r0.lv0()
            int r0 = r14.length()
            r6 = 1
            r5 = 0
            if (r0 != 0) goto L24
            X.6lt r0 = new X.6lt
            r0.<init>(r5)
        L20:
            r7.setValue(r0)
            return
        L24:
            boolean r0 = X.C164996dj.LIZJ(r14)
            r8 = r0 ^ 1
            if (r8 == 0) goto Lf4
            boolean r0 = r15.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lf4
            r4 = 1
            int r0 = r15.size()
            r3 = 5
            if (r0 >= r3) goto L44
        L3d:
            r6 = 0
        L3e:
            X.6lt r0 = new X.6lt
            r0.<init>(r8, r4, r6)
            goto L20
        L44:
            X.OSZ[] r0 = new X.OSZ[r5]
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            X.C113554cx.LJJLIIIJL(r2, r0)
            java.util.Iterator r12 = r15.iterator()
        L52:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lae
            java.lang.Object r11 = r12.next()
            com.ss.android.ugc.aweme.effect.EffectPointModel r11 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r11
            int r0 = r11.getUiStartPoint()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r10 = r2.get(r0)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L73
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L73:
            int r0 = r11.getUiEndPoint()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r9 = r2.get(r0)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L88
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L88:
            int r0 = r11.getUiStartPoint()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r10.add(r0)
            r2.put(r1, r10)
            int r0 = r11.getUiEndPoint()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.add(r0)
            r2.put(r1, r9)
            goto L52
        Lae:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r11 = r0.iterator()
            r9 = 0
            r10 = 0
        Lb8:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lf0
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        Lce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r1 = r2.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = "point"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.intValue()
            int r10 = r10 + r0
            r0 = 2
            int[] r0 = new int[r0]
            r0[r5] = r10
            r0[r6] = r9
            int r9 = X.C1A7.LJJIIZ(r0)
            goto Lce
        Lf0:
            if (r9 < r3) goto L3d
            goto L3e
        Lf4:
            r4 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169756lP.LIZJ(java.lang.String, java.util.List):void");
    }
}
