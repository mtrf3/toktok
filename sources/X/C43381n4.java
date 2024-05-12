package X;

import Y.IDfS292S0100000;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43381n4 implements C1MZ {
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C22U.LJLIL);
    public C1QB LIZIZ;
    public final String LIZ = "LiveComposerFilterHelper";
    public final int LIZJ = 100;
    public final C1VH LIZLLL = C17250m1.LIZ();

    @Override // X.C1MZ
    public final void LJII(LiveEffect filter, float f) {
        o.LJIIIZ(filter, "filter");
    }

    @Override // X.C1MZ
    public final void LJIIIIZZ(InterfaceC30359Bvn interfaceC30359Bvn) {
    }

    @Override // X.C1MZ
    public final String LIZJ() {
        String name;
        if (((ArrayList) this.LIZLLL.LIZ).isEmpty() || (name = ((LiveEffect) ListProtector.get(this.LIZLLL.LIZ, LJIIIZ())).getName()) == null) {
            return "";
        }
        return name;
    }

    @Override // X.C1MZ
    public final void LIZLLL() {
        if (((ArrayList) this.LIZLLL.LIZ).isEmpty()) {
            return;
        }
        int LJIIIZ = LJIIIZ();
        int i = LJIIIZ - 1;
        if (i < 0) {
            i = ((ArrayList) this.LIZLLL.LIZ).size() - 1;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
        if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        this.LIZLLL.getClass();
        LJIIJ(LJIIIZ, i);
    }

    @Override // X.C1MZ
    public final void LJ() {
        if (((ArrayList) this.LIZLLL.LIZ).isEmpty()) {
            return;
        }
        int LJIIIZ = LJIIIZ();
        int i = LJIIIZ + 1;
        if (i >= ((ArrayList) this.LIZLLL.LIZ).size()) {
            i = 0;
        }
        LiveEffect filterModel = (LiveEffect) ListProtector.get(this.LIZLLL.LIZ, i);
        if (!this.LIZLLL.LJIIIZ(filterModel)) {
            C1VH c1vh = this.LIZLLL;
            c1vh.getClass();
            o.LJIIIZ(filterModel, "filterModel");
            ComposerFilterViewModel composerFilterViewModel = c1vh.LJII;
            composerFilterViewModel.getClass();
            if (!composerFilterViewModel.LJLIL.LJLIL.contains(filterModel)) {
                C1VH c1vh2 = this.LIZLLL;
                c1vh2.getClass();
                c1vh2.LJII.hv0(filterModel, new IDqS172S0200000(c1vh2, filterModel, 62));
                return;
            }
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
        if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        this.LIZLLL.getClass();
        LJIIJ(LJIIIZ, i);
    }

    @Override // X.C1MZ
    public final int LJIIIZ() {
        Integer currentFilterIndex = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(currentFilterIndex, "currentFilterIndex");
        if (currentFilterIndex.intValue() >= ((ArrayList) this.LIZLLL.LIZ).size() || currentFilterIndex.intValue() < 0) {
            return 0;
        }
        return currentFilterIndex.intValue();
    }

    @Override // X.C1MZ
    public final void release() {
        this.LIZLLL.LIZLLL(this);
        C1QB c1qb = this.LIZIZ;
        if (c1qb != null) {
            c1qb.LIZ = null;
        }
    }

    @Override // X.C1MZ
    public final void LIZ(long j) {
        String str;
        Integer currentFilterIndex = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(currentFilterIndex, "currentFilterIndex");
        if (currentFilterIndex.intValue() >= ((ArrayList) this.LIZLLL.LIZ).size()) {
            return;
        }
        if (!C79004UzY.LJJIFFI(this.LIZLLL.LIZ) && currentFilterIndex.intValue() < ((ArrayList) this.LIZLLL.LIZ).size() && currentFilterIndex.intValue() >= 0) {
            str = ((LiveEffect) ListProtector.get(this.LIZLLL.LIZ, currentFilterIndex.intValue())).getName();
        } else {
            str = "";
        }
        ((EffectRelatedApi) C1A.LIZJ(EffectRelatedApi.class)).uploadBeautyParams(j, str, (int) (InterfaceC30442Bx8.LJJI.LIZJ().floatValue() * this.LIZJ), (int) (InterfaceC30442Bx8.LJJIFFI.LIZJ().floatValue() * this.LIZJ), (int) (InterfaceC30442Bx8.LJJII.LIZJ().floatValue() * this.LIZJ), (int) (InterfaceC30442Bx8.LJJIII.LIZJ().floatValue() * this.LIZJ), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1VP
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new IDfS292S0100000(this, 32));
    }

    @Override // X.InterfaceC08060Ti
    public final void LIZIZ(boolean z) {
        if (z && !C79004UzY.LJJIFFI(this.LIZLLL.LIZ)) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
            Integer LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
            if (LIZJ.intValue() > 0) {
                Integer LIZJ2 = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_FILTER_INDEX.value");
                if (LIZJ2.intValue() < ((ArrayList) this.LIZLLL.LIZ).size() && this.LIZIZ != null) {
                    Integer LIZJ3 = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ3, "LIVE_FILTER_INDEX.value");
                    LJI(LIZJ3.intValue());
                }
            }
        }
    }

    @Override // X.C1MZ
    public final void LJFF(C1QB c1qb) {
        this.LIZIZ = c1qb;
        this.LIZLLL.LIZIZ(this);
        int LJIIIZ = LJIIIZ();
        if (LJIIIZ <= 0 || LJIIIZ >= ((ArrayList) this.LIZLLL.LIZ).size()) {
            return;
        }
        ListProtector.get(this.LIZLLL.LIZ, LJIIIZ);
    }

    @Override // X.C1MZ
    public final void LJI(int i) {
        int LJIIIZ = LJIIIZ();
        if (i < 0 || i >= ((ArrayList) this.LIZLLL.LIZ).size()) {
            return;
        }
        C1VH c1vh = this.LIZLLL;
        if (!c1vh.LJIIIZ((LiveEffect) ListProtector.get(c1vh.LIZ, i))) {
            C1VH c1vh2 = this.LIZLLL;
            Object filterModel = ListProtector.get(c1vh2.LIZ, i);
            o.LJIIIZ(filterModel, "filterModel");
            ComposerFilterViewModel composerFilterViewModel = c1vh2.LJII;
            composerFilterViewModel.getClass();
            if (!composerFilterViewModel.LJLIL.LJLIL.contains(filterModel)) {
                C1VH c1vh3 = this.LIZLLL;
                LiveEffect filterModel2 = (LiveEffect) ListProtector.get(c1vh3.LIZ, i);
                o.LJIIIZ(filterModel2, "filterModel");
                c1vh3.LJII.hv0(filterModel2, new IDqS172S0200000(c1vh3, filterModel2, 62));
                return;
            }
            return;
        }
        LJIIJ(LJIIIZ, i);
    }

    public final void LJIIJ(int i, int i2) {
        if (i >= ((ArrayList) this.LIZLLL.LIZ).size() || i2 >= ((ArrayList) this.LIZLLL.LIZ).size()) {
            return;
        }
        C17250m1.LIZ().LJFF(i2);
        C73943T0h.LIZ().LIZIZ(new C11050c1());
    }
}
