package X;

import Y.AfS61S0100000_9;
import Y.AfS64S0100000_12;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TIo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74418TIo implements TJV {
    public final C62822Ol8 LIZ;
    public final java.util.Map<String, Effect> LIZIZ;
    public final java.util.Map<String, Effect> LIZJ;
    public final List<EffectCategoryModel> LIZLLL;
    public final java.util.Map<String, List<Effect>> LJ;
    public final HashMap<String, List<TJT>> LJFF;
    public final CopyOnWriteArrayList<C74389THl> LJI;
    public TJ0 LJII;
    public final C73318Sq2 LJIIIIZZ;
    public final MutableLiveData<List<String>> LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;
    public final String LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final XJO LJIJI;
    public final C5H3<TJD> LJIJJ;
    public final C5H3<TIK> LJIJJLI;
    public final C5H3<InterfaceC74429TIz> LJIL;
    public final List<EffectCategoryModel> LJJ;
    public final PropInfoData LJJI;

    public final InterfaceC70422pa LJIIZILJ() {
        return (InterfaceC70422pa) this.LIZ.getValue();
    }

    @Override // X.InterfaceC74309TEj
    public final LiveData<C74413TIj<RecommendSearchWordsResponse>> LJFF() {
        return (LiveData) this.LJIILJJIL.getValue();
    }

    @Override // X.InterfaceC74309TEj
    public final LiveData<C74413TIj<SearchEffectResponseV2>> LJI() {
        return (LiveData) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC74309TEj
    public final MutableLiveData LJIIJJI() {
        return (MutableLiveData) this.LJIIJ.getValue();
    }

    public final java.util.Map<String, LiveData<C74413TIj<CategoryEffectModel>>> LJIILIIL() {
        return (java.util.Map) this.LJIIL.getValue();
    }

    public final boolean LJIJ() {
        if (this.LJIIJJI.isInitialized() && ((LiveData) this.LJIIJJI.getValue()).getValue() != null) {
            Object value = ((LiveData) this.LJIIJJI.getValue()).getValue();
            o.LJI(value);
            if (((C74413TIj) value).LIZIZ != EnumC74323TEx.ERROR) {
                return false;
            }
        }
        return true;
    }

    @Override // X.TJV
    public final void dispose() {
        this.LJIIIIZZ.LIZLLL();
        C48841JEv.LIZJ(LJIIZILJ(), null);
    }

    @Override // X.InterfaceC74309TEj
    public final List<EffectCategoryModel> LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC74309TEj
    public final MutableLiveData LJIIIIZZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC74309TEj
    public final java.util.Map<String, Effect> LJIIIZ() {
        return this.LIZIZ;
    }

    @Override // X.TJV
    public final void LIZ(TJ0 repository) {
        o.LJIIIZ(repository, "repository");
        this.LJII = repository;
        this.LJIIIIZZ.LIZ(repository.LJIIZILJ().LJJIJL(C30461Hm.LJLIL).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 155)));
        LJIILJJIL(repository);
        this.LJIIIIZZ.LIZ(repository.LJIILIIL().LJJIJL(C1DF.LJLJI).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 157)));
        this.LJIIIIZZ.LIZ(repository.LJIIJ().LJJIJL(C74416TIm.LJLIL).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 156)));
        this.LJIIIIZZ.LIZ(repository.LJIJJ().LJJIJL(C74424TIu.LJLIL).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 153)));
        C73318Sq2 c73318Sq2 = this.LJIIIIZZ;
        C73454SsE LJJJ = repository.LJIIIZ().LJJJ(C73969T1h.LIZIZ());
        AfS64S0100000_12 afS64S0100000_12 = new AfS64S0100000_12(this, 152);
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        c73318Sq2.LIZ(LJJJ.LJJJLIIL(afS64S0100000_12, c42222Ghe));
        this.LJIIIIZZ.LIZ(repository.LJIIL().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 94), c42222Ghe));
        this.LJIIIIZZ.LIZ(repository.LJIILL().LJJIJL(C82519Wa3.LJLILLLLZI).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 154)));
    }

    @Override // X.InterfaceC74309TEj
    public final List<TJT> LIZLLL(String category) {
        o.LJIIIZ(category, "category");
        List<TJT> list = this.LJFF.get(category);
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC74309TEj
    public final void LJII(List<? extends Effect> data) {
        o.LJIIIZ(data, "data");
        for (Effect effect : data) {
            ((HashMap) this.LIZIZ).put(effect.getEffectId(), effect);
        }
    }

    @Override // X.InterfaceC74309TEj
    public final void LJIIL(List<? extends Effect> data) {
        o.LJIIIZ(data, "data");
        for (Effect effect : data) {
            ((HashMap) this.LIZJ).put(effect.getEffectId(), effect);
        }
    }

    public void LJIILJJIL(TJ0 repository) {
        o.LJIIIZ(repository, "repository");
        this.LJIIIIZZ.LIZ(repository.LIZLLL().LJJIJL(C74415TIl.LJLIL).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 151)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CategoryEffectModel LJIILL(String category) {
        C74413TIj c74413TIj;
        o.LJIIIZ(category, "category");
        LiveData liveData = (LiveData) ((LinkedHashMap) this.LJIIL.getValue()).get(category);
        if (liveData != null && (c74413TIj = (C74413TIj) liveData.getValue()) != null) {
            return (CategoryEffectModel) c74413TIj.LIZ;
        }
        return null;
    }

    public final MutableLiveData<C74413TIj<CategoryEffectModel>> LJIILLIIL(String key) {
        o.LJIIIZ(key, "key");
        MutableLiveData<C74413TIj<CategoryEffectModel>> mutableLiveData = (MutableLiveData) ((LinkedHashMap) this.LJIIL.getValue()).get(key);
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<C74413TIj<CategoryEffectModel>> mutableLiveData2 = new MutableLiveData<>();
        ((java.util.Map) this.LJIIL.getValue()).put(key, mutableLiveData2);
        return mutableLiveData2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103 A[Catch: all -> 0x012c, TryCatch #3 {all -> 0x012c, blocks: (B:27:0x009f, B:29:0x00ad, B:39:0x0103), top: B:26:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.OSZ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r17, boolean r18, X.InterfaceC67352kd<? super X.C76800UCe> r19) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74418TIo.LJIJI(com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel, boolean, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC74309TEj
    public LiveData LIZIZ(String str, boolean z, boolean z2, boolean z3) {
        if (z && LJIJ()) {
            ((LiveData) this.LJIIJJI.getValue()).setValue(C74413TIj.LIZIZ());
            if (str == null) {
                str = "";
            }
            PropInfoData propInfoData = this.LJJI;
            if (propInfoData != null) {
                propInfoData.setPanelInfoInvokeTime1(Long.valueOf(System.currentTimeMillis()));
            }
            TJ0 tj0 = this.LJII;
            if (tj0 != null) {
                tj0.LJIILJJIL(new TPM(str, z2, z3, 94));
            }
        }
        return (LiveData) this.LJIIJJI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r0.LIZIZ == X.EnumC74323TEx.ERROR) goto L8;
     */
    @Override // X.InterfaceC74309TEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.lifecycle.MutableLiveData LJIIJ(java.lang.String r12, java.util.Map r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "category"
            r4 = r12
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            androidx.lifecycle.MutableLiveData r2 = r11.LJIILLIIL(r4)
            if (r14 == 0) goto L3b
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r2.getValue()
            kotlin.jvm.internal.o.LJI(r0)
            X.TIj r0 = (X.C74413TIj) r0
            X.TEx r1 = r0.LIZIZ
            X.TEx r0 = X.EnumC74323TEx.ERROR
            if (r1 != r0) goto L3b
        L21:
            X.TIj r0 = X.C74413TIj.LIZIZ()
            r2.setValue(r0)
            X.TJ0 r0 = r11.LJII
            if (r0 == 0) goto L3b
            X.TJI r3 = new X.TJI
            r5 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r9 = r13
            r8 = r15
            r6 = r5
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.LIZIZ(r3)
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74418TIo.LJIIJ(java.lang.String, java.util.Map, boolean, boolean):androidx.lifecycle.MutableLiveData");
    }

    public C74418TIo(PropInfoData propInfoData, List defaultCategories, C62822Ol8 c62822Ol8, C62822Ol8 c62822Ol82, C62822Ol8 c62822Ol83) {
        o.LJIIIZ(defaultCategories, "defaultCategories");
        this.LJIJJ = c62822Ol8;
        this.LJIJJLI = c62822Ol82;
        this.LJIL = c62822Ol83;
        this.LJJ = defaultCategories;
        this.LJJI = propInfoData;
        this.LIZ = C221108m2.LIZIZ(C3CN.LJLIL);
        this.LIZIZ = new HashMap();
        this.LIZJ = new HashMap();
        this.LIZLLL = new ArrayList();
        this.LJ = new LinkedHashMap();
        this.LJFF = new HashMap<>();
        this.LJI = new CopyOnWriteArrayList<>();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJIIIIZZ = c73318Sq2;
        this.LJIIIZ = new MutableLiveData<>();
        this.LJIIJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1253));
        this.LJIIJJI = C221108m2.LIZIZ(TJB.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(TJ1.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(TJ9.LJLIL);
        this.LJIILJJIL = C221108m2.LIZIZ(TJ8.LJLIL);
        this.LJIILL = C221108m2.LIZIZ(TJA.LJLIL);
        this.LJIILLIIL = C221108m2.LIZIZ(C74304TEe.LJLIL);
        this.LJIIZILJ = "hot";
        this.LJIJ = C221108m2.LIZIZ(C35966E9q.LJLIL);
        this.LJIJI = XJR.LIZ();
        c73318Sq2.LIZ(((TIK) c62822Ol82.getValue()).LIZJ().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 149)));
        c73318Sq2.LIZ(((TJD) c62822Ol8.getValue()).LIZ().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 150)));
    }

    @Override // X.InterfaceC74309TEj
    public LiveData LIZJ(boolean z, boolean z2, String category, int i, int i2, int i3, java.util.Map map) {
        o.LJIIIZ(category, "category");
        return LJIIJ(category, map, true, z2);
    }
}
