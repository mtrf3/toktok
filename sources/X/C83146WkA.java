package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfoCopy;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUesTabInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUsedInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import djb.IDaS27S0000000_14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS176S0200000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS69S0110000_14;
import kotlin.jvm.internal.AqS74S0400000_14;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ujb.s;

/* renamed from: X.WkA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83146WkA implements InterfaceC83142Wk6 {
    public String LIZ;
    public final C68148Qoq LIZIZ = new C68148Qoq();
    public volatile List<BeautyCategory> LIZJ = new ArrayList();
    public final SafeMutableLiveData<Boolean> LIZLLL = new SafeMutableLiveData<>();
    public final SafeMutableLiveData<Boolean> LJ = new SafeMutableLiveData<>();
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LJFF = new SafeMutableLiveData<>();
    public final C81017Vqv<BeautyComposerInfo> LJI = new C81017Vqv<>();
    public final C29901Fi<ArrayList<BeautyComposerInfo>> LJII = new C29901Fi<>();
    public final java.util.Map<String, C81017Vqv<BeautyComposerInfo>> LJIIIIZZ = new LinkedHashMap();
    public final C5H3 LJIIIZ;
    public final SafeMutableLiveData<ComposerBeauty> LJIIJ;
    public final C83186Wko LJIIJJI;
    public C68249QqT LJIIL;
    public final SafeMutableLiveData<Integer> LJIILIIL;
    public final SafeMutableLiveData<java.util.Map<String, Integer>> LJIILJJIL;
    public final SafeMutableLiveData<C65768PrY<ComposerBeauty>> LJIILL;
    public InterfaceC83166WkU LJIILLIIL;
    public final List<BeautifyUesTabInfo> LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;
    public final C62822Ol8 LJIJJ;
    public final C83109WjZ LJIJJLI;
    public final C17J LJIL;
    public boolean LJJ;
    public final C64962gm LJJI;
    public ILU LJJIFFI;
    public List<BeautyCategory> LJJII;
    public boolean LJJIII;
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LJJIIJ;
    public final C83155WkJ LJJIIJZLJL;
    public final InterfaceC83159WkN LJJIIZ;
    public final BeautyFilterConfig LJJIIZI;
    public final Gson LJJIJ;

    @Override // X.InterfaceC83142Wk6
    public final void F7(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
    }

    public final BeautifyUsedInfo LJIIJ() {
        return (BeautifyUsedInfo) this.LJIJ.getValue();
    }

    public final C83154WkI LJIIJJI() {
        return (C83154WkI) this.LJIJJ.getValue();
    }

    @Override // X.InterfaceC83142Wk6
    public final synchronized void P7() {
        LJIJ(false);
    }

    @Override // X.InterfaceC83142Wk6
    public final void R7(ComposerBeauty composerBeauty) {
    }

    @Override // X.InterfaceC83142Wk6
    public final void a8() {
        this.LJIIL = null;
    }

    @Override // X.InterfaceC83142Wk6
    public final void e8() {
        LJIJ(false);
    }

    @Override // X.InterfaceC83142Wk6
    public final void f8() {
    }

    @Override // X.InterfaceC83142Wk6
    public final void h8(BeautyCategory category) {
        o.LJIIIZ(category, "category");
    }

    @Override // X.InterfaceC83142Wk6
    public final void u7(ComposerBeauty beautyMode) {
        o.LJIIIZ(beautyMode, "beautyMode");
    }

    @Override // X.InterfaceC83142Wk6
    public final List<ComposerBeauty> C7() {
        List<BeautyCategory> list = this.LIZJ;
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 323);
        List LJIIL = C1DH.LJIIL(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJIIL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) aqS180S0100000_14.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC83142Wk6
    public final void G7() {
        boolean z;
        BeautyCategory beautyCategory;
        if (this.LJJIIZ.LJIIL()) {
            Iterator<BeautyCategory> it = this.LIZJ.iterator();
            while (true) {
                z = false;
                if (it.hasNext()) {
                    beautyCategory = it.next();
                    if (s.LJJJLZIJ(beautyCategory.getCategoryResponse().getKey(), "beauty", false)) {
                        break;
                    }
                } else {
                    beautyCategory = null;
                    break;
                }
            }
            BeautyCategory beautyCategory2 = beautyCategory;
            if (beautyCategory2 != null) {
                Iterator<ComposerBeauty> it2 = beautyCategory2.getBeautyList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (it2.next().getDefaultProgress() != 0) {
                        z = true;
                        break;
                    }
                }
            }
            this.LJJIIZ.LIZJ(z);
            if (!z) {
                s7();
            }
            this.LJJIIZ.LJIJ();
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final String K7() {
        String str = this.LIZ;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // X.InterfaceC83142Wk6
    public final boolean LIZ() {
        return this.LJJIIZ.LIZ();
    }

    @Override // X.InterfaceC83142Wk6
    public final BeautyCategory LIZIZ() {
        BeautyCategory beautyCategory;
        Iterator<BeautyCategory> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                beautyCategory = it.next();
                if (s.LJJJLZIJ(beautyCategory.getCategoryResponse().getKey(), "beauty", false)) {
                    break;
                }
            } else {
                beautyCategory = null;
                break;
            }
        }
        return beautyCategory;
    }

    public final void LJIILL() {
        C83156WkK c83156WkK = this.LJJIIZI.getDataConfig().LIZ;
        if (c83156WkK != null) {
            C17J c17j = this.LJIL;
            BeautyFilterConfig beautyFilterConfig = this.LJJIIZI;
            c17j.getClass();
            o.LJIIIZ(beautyFilterConfig, "beautyFilterConfig");
            ArrayList arrayList = new ArrayList();
            EffectCategoryResponse LIZIZ = c83156WkK.LIZIZ();
            BeautyCategoryExtra LIZ = c83156WkK.LIZ();
            ArrayList arrayList2 = new ArrayList();
            List<C83162WkQ> LIZJ = c83156WkK.LIZJ();
            if ((!((ArrayList) LIZJ).isEmpty()) && LIZJ != null) {
                for (C83162WkQ c83162WkQ : LIZJ) {
                    ComposerBeautyExtra composerBeautyExtra = new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null);
                    Effect effect = new Effect(null, 1, null);
                    effect.setEffectId(c83162WkQ.LJLILLLLZI);
                    effect.setResourceId(c83162WkQ.LJLJI);
                    effect.setName(c83162WkQ.LJLJJI);
                    effect.setUnzipPath(c83162WkQ.LJLJJL);
                    ComposerBeautyExtraBeautify composerBeautyExtraBeautify = new ComposerBeautyExtraBeautify(null, null, 3, null);
                    ArrayList arrayList3 = new ArrayList();
                    ComposerBeautyExtraBeautify.ItemsBean itemsBean = new ComposerBeautyExtraBeautify.ItemsBean(false, 0, 0, 0, null, null, 63, null);
                    itemsBean.setDoubleDirection(false);
                    itemsBean.setMin(c83162WkQ.LJLJJLL);
                    itemsBean.setMax(c83162WkQ.LJLJLJ);
                    itemsBean.setValue(c83162WkQ.LJLJL);
                    itemsBean.setTag(c83162WkQ.LJLJLLL);
                    itemsBean.setName(c83162WkQ.LJLJJI);
                    arrayList3.add(itemsBean);
                    composerBeautyExtraBeautify.setItems(arrayList3);
                    ComposerBeauty composerBeauty = new ComposerBeauty(effect, composerBeautyExtra, composerBeautyExtraBeautify, null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, true, c83162WkQ.LJLIL, 0, 16, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 4849656, null);
                    InterfaceC88472Yns<ComposerBeautyExtraBeautify, C76800UCe> getChildrenInitBeautyValueVBlock = beautyFilterConfig.getGetChildrenInitBeautyValueVBlock();
                    if (getChildrenInitBeautyValueVBlock != null) {
                        getChildrenInitBeautyValueVBlock.invoke(composerBeauty.getBeautifyExtra());
                    }
                    arrayList2.add(composerBeauty);
                }
            }
            arrayList.add(new BeautyCategory(LIZIZ, LIZ, arrayList2, true));
            LJIILLIIL(arrayList);
            this.LJJ = true;
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final void Y7() {
        C34K c34k = new C34K();
        boolean z = false;
        c34k.element = false;
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(c34k, 326);
        List<BeautyCategory> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (BeautyCategory beautyCategory : list) {
            if (beautyCategory.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(beautyCategory);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BeautyCategory beautyCategory2 = (BeautyCategory) it.next();
            h8(beautyCategory2);
            List<ComposerBeauty> checkSubBeautySelected = beautyCategory2.getBeautyList();
            o.LJIIIZ(checkSubBeautySelected, "$this$checkSubBeautySelected");
            if (((ComposerBeauty) ORZ.LJLLLL(checkSubBeautySelected)) != null) {
                ((C34K) aqS180S0100000_14.l0).element = !r0.getSelected();
            }
        }
        boolean z2 = c34k.element;
        C34K c34k2 = new C34K();
        c34k2.element = false;
        AqS180S0100000_14 aqS180S0100000_142 = new AqS180S0100000_14(c34k2, 325);
        for (BeautyCategory beautyCategory3 : this.LIZJ) {
            h8(beautyCategory3);
            aqS180S0100000_142.invoke$35(beautyCategory3.getBeautyList());
        }
        boolean z3 = c34k2.element;
        Iterator<BeautyCategory> it2 = this.LIZJ.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            for (ComposerBeauty composerBeauty : it2.next().getBeautyList()) {
                if (composerBeauty.isBeautyMode()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it3 = childList.iterator();
                        boolean z5 = false;
                        while (it3.hasNext()) {
                            if (LJII(it3.next())) {
                                z5 = true;
                            }
                        }
                        if (z5) {
                            z4 = true;
                        }
                    }
                } else if (LJII(composerBeauty)) {
                    z4 = true;
                }
            }
        }
        if (z2 || ((z3 || z4) && LIZ())) {
            z = true;
        }
        C43045Guv.LIZLLL(new AqS69S0110000_14(this, z, 2), 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0070, code lost:
    
        r3 = r5.getBeautyList().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007c, code lost:
    
        if (r3.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007e, code lost:
    
        r2 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008d, code lost:
    
        if (r2.getExtra().isNone() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x008f, code lost:
    
        if (r2 == null) goto L79;
     */
    @Override // X.InterfaceC83142Wk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata j7() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83146WkA.j7():com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata");
    }

    @Override // X.InterfaceC83142Wk6
    public final void j8() {
        Iterator<BeautyCategory> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            for (ComposerBeauty composerBeauty : it.next().getBeautyList()) {
                composerBeauty.setEnable(true);
                AqS161S0200000_14 aqS161S0200000_14 = new AqS161S0200000_14(composerBeauty, this, 45);
                if (composerBeauty.isBeautyMode()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            aqS161S0200000_14.LIZ$5();
                        }
                    }
                } else {
                    aqS161S0200000_14.LIZ$5();
                }
            }
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final MBeautyStateInfoCopy m7() {
        int i = 0;
        if (!C82516Wa0.LJFF) {
            return new MBeautyStateInfoCopy(0, 0);
        }
        if (C82516Wa0.LJI == 2) {
            i = 1;
        }
        return new MBeautyStateInfoCopy(i ^ 1, 1);
    }

    @Override // X.InterfaceC83142Wk6
    public final void n7() {
        C78966Uyw.LJJJJL(this.LJFF, new ArrayList());
    }

    @Override // X.InterfaceC83142Wk6
    public final boolean p7() {
        return this.LJJIIZ.LLJILJILJ();
    }

    @Override // X.InterfaceC83142Wk6
    public final ComposerBeautyBuriedInfoCopy r7() {
        if (this.LJJ) {
            return new ComposerBeautyBuriedInfoCopy(0, 0, 0, null, 12, null);
        }
        C76732zl c76732zl = new C76732zl();
        int i = 0;
        c76732zl.element = 0;
        C76732zl c76732zl2 = new C76732zl();
        c76732zl2.element = 0;
        ArrayList arrayList = new ArrayList();
        AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14(arrayList, new AqS118S0300000_14(this, new AqS176S0200000_14(this, c76732zl, 1), c76732zl2, 4), 27);
        for (BeautyCategory beautyCategory : this.LIZJ) {
            if (beautyCategory.getBeautyCategoryExtra().getExclusive()) {
                Iterator<ComposerBeauty> it = beautyCategory.getBeautyList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ComposerBeauty next = it.next();
                        if (next.getSelected()) {
                            if (next != null) {
                                aqS145S0200000_14.invoke(next);
                            }
                        }
                    }
                }
            } else {
                for (ComposerBeauty composerBeauty : beautyCategory.getBeautyList()) {
                    if (composerBeauty.isCollectionType()) {
                        List<ComposerBeauty> childList = composerBeauty.getChildList();
                        if (childList != null) {
                            Iterator<ComposerBeauty> it2 = childList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    ComposerBeauty next2 = it2.next();
                                    if (next2.getSelected()) {
                                        if (next2 != null) {
                                            aqS145S0200000_14.invoke(next2);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        aqS145S0200000_14.invoke(composerBeauty);
                    }
                }
            }
        }
        int i2 = c76732zl.element;
        InterfaceC82517Wa1 interfaceC82517Wa1 = C82516Wa0.LJIIIIZZ;
        if (interfaceC82517Wa1 != null) {
            interfaceC82517Wa1.LIZ();
            i = 1;
        }
        return new ComposerBeautyBuriedInfoCopy(i2, i, c76732zl2.element, arrayList);
    }

    @Override // X.InterfaceC83142Wk6
    public final void release() {
        this.LJIIJJI.LIZJ().LJ().clear();
    }

    @Override // X.InterfaceC83142Wk6
    public final void s7() {
        BeautyCategory beautyCategory;
        Iterator<BeautyCategory> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                beautyCategory = it.next();
                if (s.LJJJLZIJ(beautyCategory.getCategoryResponse().getKey(), "beauty", false)) {
                    break;
                }
            } else {
                beautyCategory = null;
                break;
            }
        }
        BeautyCategory beautyCategory2 = beautyCategory;
        if (beautyCategory2 != null) {
            for (ComposerBeauty composerBeauty : beautyCategory2.getBeautyList()) {
                Z7(composerBeauty, true);
                composerBeauty.setSelected(false);
                composerBeauty.setEnable(false);
            }
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final ComposerBeauty v7() {
        ComposerBeauty composerBeauty;
        BeautyCategory beautyCategory;
        Iterator<BeautyCategory> it = this.LIZJ.iterator();
        while (true) {
            composerBeauty = null;
            if (it.hasNext()) {
                beautyCategory = it.next();
                if (s.LJJJLZIJ(beautyCategory.getCategoryResponse().getKey(), "makeup", false)) {
                    break;
                }
            } else {
                beautyCategory = null;
                break;
            }
        }
        BeautyCategory beautyCategory2 = beautyCategory;
        if (beautyCategory2 == null) {
            return null;
        }
        Iterator<ComposerBeauty> it2 = beautyCategory2.getBeautyList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ComposerBeauty next = it2.next();
            if (next.getSelected()) {
                composerBeauty = next;
                break;
            }
        }
        return composerBeauty;
    }

    @Override // X.InterfaceC83142Wk6
    public final C29901Fi<ArrayList<BeautyComposerInfo>> A7() {
        return this.LJII;
    }

    @Override // X.InterfaceC83142Wk6
    public final SafeMutableLiveData<Boolean> B7() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC83142Wk6
    public final C83186Wko E7() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC83142Wk6
    public final SafeMutableLiveData<List<BeautyComposerInfo>> LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC83142Wk6
    public final List<BeautyCategory> M7() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC83142Wk6
    public final List<BeautyCategory> O7() {
        return this.LJJII;
    }

    @Override // X.InterfaceC83142Wk6
    public final BeautyFilterConfig S7() {
        return this.LJJIIZI;
    }

    @Override // X.InterfaceC83142Wk6
    public final SafeMutableLiveData<List<BeautyComposerInfo>> W7() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC83142Wk6
    public final SafeMutableLiveData<ComposerBeauty> c8() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC83142Wk6
    public final SafeMutableLiveData<java.util.Map<String, Integer>> g8() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC83142Wk6
    public final SafeMutableLiveData<Integer> i8() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC83142Wk6
    public final java.util.Map<String, C81017Vqv<BeautyComposerInfo>> q7() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC83142Wk6
    public final ILU w7() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC83142Wk6
    public final SafeMutableLiveData<C65768PrY<ComposerBeauty>> x7() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC83142Wk6
    public final C81017Vqv<BeautyComposerInfo> z7() {
        return this.LJI;
    }

    public static boolean LJII(ComposerBeauty composerBeauty) {
        C34K c34k = new C34K();
        c34k.element = false;
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(c34k, 322);
        boolean isCollectionType = composerBeauty.isCollectionType();
        if (isCollectionType) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<ComposerBeauty> it = childList.iterator();
                while (it.hasNext()) {
                    aqS180S0100000_14.LIZ$34(it.next());
                }
            }
        } else if (!isCollectionType) {
            aqS180S0100000_14.LIZ$34(composerBeauty);
        }
        return c34k.element;
    }

    @Override // X.InterfaceC83142Wk6
    public final void D7(C82942Wgs beautySequence) {
        o.LJIIIZ(beautySequence, "beautySequence");
        C83154WkI LJIIJJI = LJIIJJI();
        LJIIJJI.getClass();
        synchronized (LJIIJJI) {
            LJIIJJI.LIZ.remove(beautySequence);
        }
        LJIIJJI.LIZLLL();
    }

    @Override // X.InterfaceC83142Wk6
    public final void H7(boolean z) {
        this.LJJIIZ.LJIIIZ(z);
    }

    @Override // X.InterfaceC83142Wk6
    public final void J7(C83123Wjn c83123Wjn) {
        C68148Qoq c68148Qoq = this.LIZIZ;
        C64962gm scope = this.LJJI;
        c68148Qoq.getClass();
        o.LJIIIZ(scope, "scope");
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) c68148Qoq.LJLIL;
        if (interfaceC79150V4o != null && !interfaceC79150V4o.isCancelled()) {
            interfaceC79150V4o.LIZIZ(null);
        }
        c68148Qoq.LJLIL = XKX.LIZLLL(scope, null, null, new C83188Wkq(this, null, c68148Qoq, scope, c83123Wjn, this), 3);
    }

    @Override // X.InterfaceC83142Wk6
    public final void LIZJ(boolean z) {
        this.LJJIIZ.LIZJ(z);
    }

    public final boolean LJI(ComposerBeauty composerBeauty) {
        if (!composerBeauty.getExtra().getDisableCache() || this.LJJIIZI.getAutoApplyBeauty()) {
            return true;
        }
        return false;
    }

    public final C157166Eu LJIIL(ComposerBeauty composerBeauty) {
        int i;
        boolean z;
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        int i2 = 0;
        if (items == null || items.isEmpty()) {
            i = 0;
            z = false;
        } else {
            C83169WkX LIZIZ = C83168WkW.LIZIZ(new C83169WkX(((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getDoubleDirection(), ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getMax(), ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getMin(), U7(composerBeauty, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getTag(), ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getValue()), 0, ((ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, 0)).getValue(), 1676));
            composerBeauty.setDefaultProgress(LIZIZ.LJFF);
            i2 = LIZIZ.LJFF;
            i = LIZIZ.LIZIZ;
            z = LIZIZ.LJI;
        }
        return new C157166Eu(Integer.valueOf(i2), Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final synchronized void LJIILIIL(ILU ilu) {
        ArrayList arrayList = new ArrayList();
        C83175Wkd.LIZIZ("LJT initComposerNodes: start");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LJT initComposerNodes: allData size is ");
        LIZ.append(this.LJJII.size());
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
        for (BeautyCategory beautyCategory : this.LJJII) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LJT initComposerNodes: add ");
            LIZ2.append(beautyCategory.getCategoryResponse().getName());
            LIZ2.append(" to result");
            C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("LJT initComposerNodes: panelType is ");
            LIZ3.append(beautyCategory.getBeautyCategoryExtra().getPanelType());
            LIZ3.append(", genderFlag is: ");
            LIZ3.append(ilu.getFlag());
            C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ3));
            if (o.LJ(beautyCategory.getBeautyCategoryExtra().getPanelType(), ilu.getFlag()) || o.LJ(beautyCategory.getBeautyCategoryExtra().getPanelType(), ILU.ALL.getFlag())) {
                arrayList.add(beautyCategory);
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("LJT initComposerNodes: result size is ");
        LIZ4.append(arrayList.size());
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("LJT initComposerNodes: allData size is ");
        LIZ5.append(this.LJJII.size());
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ5));
        if (o.LJ(this.LIZJ, arrayList)) {
            return;
        }
        this.LIZJ = arrayList;
        C83175Wkd.LIZIZ("LJT initComposerNodes: assign result to panelData");
        C78966Uyw.LJJJJL(this.LJ, Boolean.TRUE);
        XKX.LIZLLL(this.LJJI, null, null, new C83150WkE(this, arrayList, null), 3);
    }

    public final boolean LJIILJJIL(ComposerBeauty composerBeauty) {
        C83186Wko c83186Wko = this.LJIIJJI;
        c83186Wko.getClass();
        if (C1DH.LJJJIL(composerBeauty.getEffect().getEffectId()) < 0 || composerBeauty.isLocalItem()) {
            return true;
        }
        boolean LJJIL = c83186Wko.LIZJ.LJJIL(composerBeauty.getEffect());
        if (LJJIL) {
            return LJJIL;
        }
        StringBuilder LJI = JBR.LJI("isDownloaded: ", LJJIL, ",effect= ");
        LJI.append(composerBeauty.getEffect());
        C83175Wkd.LIZ(X1D.LIZIZ(LJI));
        return LJJIL;
    }

    public final void LJIILLIIL(List<BeautyCategory> value) {
        o.LJIIIZ(value, "value");
        this.LJJII = value;
        String flag = this.LJJIIZI.getDefaultGender().getFlag();
        o.LJIIIZ(flag, "default");
        String string = C82944Wgu.LIZ.getString("key_last_gender", flag);
        o.LJIIIIZZ(string, "KEVA.getString(KEY_LAST_GENDER, default)");
        ILU ilu = ILU.FEMALE;
        if (!o.LJ(string, ilu.getFlag())) {
            ilu = ILU.MALE;
            if (!o.LJ(string, ilu.getFlag())) {
                ilu = this.LJJIIZI.getDefaultGender();
            }
        }
        o7(false, ilu);
    }

    public final void LJIIZILJ(ComposerBeauty composerBeauty) {
        C65768PrY<ComposerBeauty> value = this.LJIILL.getValue();
        if (value != null) {
            value.add(composerBeauty);
        }
        SafeMutableLiveData<C65768PrY<ComposerBeauty>> safeMutableLiveData = this.LJIILL;
        C78966Uyw.LJJJJL(safeMutableLiveData, safeMutableLiveData.getValue());
    }

    public final void LJIJ(boolean z) {
        InterfaceC88472Yns<InterfaceC65784Pro<C76800UCe>, Boolean> updateComposerNodesInterceptor;
        if (!z && (updateComposerNodesInterceptor = this.LJJIIZI.getUpdateComposerNodesInterceptor()) != null && updateComposerNodesInterceptor.invoke(new AqS164S0100000_14(this, 341)).booleanValue()) {
            return;
        }
        SafeMutableLiveData<List<BeautyComposerInfo>> safeMutableLiveData = this.LJFF;
        List<BeautyCategory> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (BeautyCategory beautyCategory : list) {
            if (LJFF(beautyCategory.getCategoryResponse().getId(), this.LJJIIZI.getBeautySwitchStatus())) {
                arrayList.add(beautyCategory);
            }
        }
        AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14(this, arrayList, 29);
        C81017Vqv c81017Vqv = new C81017Vqv();
        Iterator<BeautyComposerInfo> it = this.LJI.iterator();
        while (it.hasNext()) {
            BeautyComposerInfo next = it.next();
            if (aqS145S0200000_14.LIZ$5(next)) {
                c81017Vqv.add(next);
            }
        }
        C78966Uyw.LJJJJL(safeMutableLiveData, c81017Vqv);
        C82527WaB.LIZ(this, true, false, null, 14);
    }

    public final void LJIJI(ComposerBeauty composerBeauty) {
        if (this.LJJIIZI.getBeautyDownloadToThread()) {
            C43045Guv.LIZIZ(new AqS161S0200000_14(composerBeauty, this, 46));
        } else {
            C43045Guv.LIZLLL(new AqS161S0200000_14(composerBeauty, this, 47), 0L);
        }
    }

    public final void LJIJJ(ComposerBeauty composerBeauty) {
        String effectId = composerBeauty.getEffect().getEffectId();
        int LIZIZ = this.LJIIJJI.LIZIZ(composerBeauty, false);
        java.util.Map<String, Integer> value = this.LJIILJJIL.getValue();
        if (value != null) {
            value.put(effectId, Integer.valueOf(LIZIZ));
        }
        Iterator<BeautyCategory> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            for (ComposerBeauty composerBeauty2 : it.next().getBeautyList()) {
                if (composerBeauty2.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty2.getChildList();
                    if (childList != null) {
                        for (ComposerBeauty composerBeauty3 : childList) {
                            int LIZIZ2 = this.LJIIJJI.LIZIZ(composerBeauty3, false);
                            if (composerBeauty3.getDownloadState() != LIZIZ2) {
                                composerBeauty3.setDownloadState(LIZIZ2);
                                if (value != null) {
                                    value.put(composerBeauty3.getEffect().getEffectId(), Integer.valueOf(LIZIZ2));
                                }
                            }
                        }
                    }
                } else {
                    int LIZIZ3 = this.LJIIJJI.LIZIZ(composerBeauty2, false);
                    if (composerBeauty2.getDownloadState() != LIZIZ3) {
                        composerBeauty2.setDownloadState(LIZIZ3);
                        if (value != null) {
                            value.put(composerBeauty2.getEffect().getEffectId(), Integer.valueOf(LIZIZ3));
                        }
                    }
                }
            }
        }
        if (value != null) {
            if (this.LJJIIZI.getBeautyDownloadToThread()) {
                this.LJIILJJIL.postValue(value);
            } else {
                this.LJIILJJIL.setValue(value);
            }
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final void Q7(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        if (!this.LJIIJJI.LIZLLL(composerBeauty, false)) {
            C83186Wko c83186Wko = this.LJIIJJI;
            C83160WkO c83160WkO = new C83160WkO(composerBeauty);
            C83155WkJ callback = this.LJJIIJZLJL;
            c83186Wko.getClass();
            o.LJIIIZ(callback, "callback");
            C83310Wmo<C83160WkO, Void> LIZJ = c83186Wko.LIZJ();
            LIZJ.getClass();
            LIZJ.LJIIIIZZ(new AqS74S0400000_14(LIZJ, c83160WkO, callback, (InterfaceC65784Pro) null, 2));
            C83186Wko c83186Wko2 = this.LJIIJJI;
            C83160WkO c83160WkO2 = new C83160WkO(composerBeauty);
            c83186Wko2.getClass();
            c83186Wko2.LIZJ().LIZLLL(c83160WkO2, null);
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final void V7(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        this.LJJIIZ.LJIIZILJ(composerBeauty, this.LJJIFFI);
        Y7();
    }

    @Override // X.InterfaceC83142Wk6
    public final void X7(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        Z7(composerBeauty, false);
    }

    @Override // X.InterfaceC83142Wk6
    public final String b8(ComposerBeauty parentBeauty) {
        o.LJIIIZ(parentBeauty, "parentBeauty");
        return this.LJJIIZ.LJII(parentBeauty, this.LJJIFFI);
    }

    @Override // X.InterfaceC83142Wk6
    public final void d8(BeautyCategory beautyCategory) {
        this.LJJIIZ.LIZIZ(this.LJJIFFI, beautyCategory.getCategoryResponse().getId());
        this.LIZ = beautyCategory.getCategoryResponse().getName();
    }

    @Override // X.InterfaceC83142Wk6
    public final boolean k7(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        if (composerBeauty.getExtra().isNone() || ((Boolean) LJIIL(composerBeauty).LJLJI).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83142Wk6
    public final void l7(C82942Wgs beautySequence) {
        o.LJIIIZ(beautySequence, "beautySequence");
        C83154WkI LJIIJJI = LJIIJJI();
        LJIIJJI.getClass();
        synchronized (LJIIJJI) {
            LJIIJJI.LIZ.add(beautySequence);
        }
        LJIIJJI.LIZLLL();
    }

    @Override // X.InterfaceC83142Wk6
    public final void y7(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        this.LJJIIZ.LJI(composerBeauty, this.LJJIFFI);
    }

    @Override // X.InterfaceC83142Wk6
    public final void I7(boolean z, boolean z2) {
        ComposerBeauty composerBeauty;
        Iterator<BeautyCategory> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            for (ComposerBeauty composerBeauty2 : it.next().getBeautyList()) {
                if (!z2) {
                    composerBeauty2.setSelected(false);
                }
                composerBeauty2.setEnable(z2);
                boolean isCollectionType = composerBeauty2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = composerBeauty2.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it2 = childList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                composerBeauty = it2.next();
                                if (composerBeauty.getSelected()) {
                                    break;
                                }
                            } else {
                                composerBeauty = null;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty3 = composerBeauty;
                        if (composerBeauty3 != null) {
                            Z7(composerBeauty3, z);
                        }
                    }
                } else if (!isCollectionType) {
                    Z7(composerBeauty2, z);
                }
            }
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final void LJ(String categoryId, boolean z) {
        o.LJIIIZ(categoryId, "categoryId");
        this.LJJIIZ.LJ(categoryId, z);
    }

    @Override // X.InterfaceC83142Wk6
    public final boolean LJFF(String categoryId, boolean z) {
        o.LJIIIZ(categoryId, "categoryId");
        return this.LJJIIZ.LJFF(categoryId, z);
    }

    public final List<BeautyComposerInfo> LJIJJLI(ComposerBeauty composerBeauty, C83160WkO c83160WkO) {
        boolean LJI;
        ArrayList arrayList = new ArrayList();
        if (new AqS145S0200000_14(this, c83160WkO, 28).LIZ$4(composerBeauty) && C1DH.LJIJI(composerBeauty)) {
            if (C1DH.LJJ(composerBeauty)) {
                LJI = composerBeauty.getSelected();
            } else {
                LJI = LJI(composerBeauty);
            }
            if (LJI) {
                ArrayList arrayList2 = (ArrayList) LJIIIZ(composerBeauty, false, false);
                if (!arrayList2.isEmpty()) {
                    composerBeauty.setAdd2Nodes(true);
                    C1DJ.LJJII(this, new C83172Wka(arrayList2));
                    arrayList.addAll(arrayList2);
                    LJIIZILJ(composerBeauty);
                    this.LJJIIZ.LJIIJ(composerBeauty.needFaceDetect());
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC83142Wk6
    public final void N7(ComposerBeauty composerBeauty, InterfaceC83180Wki interfaceC83180Wki) {
        ArrayList arrayList;
        BeautyCategory beautyCategory;
        ComposerBeauty LJIIJJI;
        List<ComposerBeauty> childList;
        o.LJIIIZ(composerBeauty, "composerBeauty");
        if (this.LJIIJJI.LIZLLL(composerBeauty, false) && C1DH.LJIJI(composerBeauty)) {
            if (!C1DH.LJJ(composerBeauty) || composerBeauty.getSelected()) {
                List LJIIIZ = LJIIIZ(composerBeauty, false, false);
                if (C1DH.LJJ(composerBeauty)) {
                    List<BeautyCategory> list = this.LIZJ;
                    Object obj = null;
                    if (!C1DH.LJJ(composerBeauty)) {
                        arrayList = new ArrayList();
                    } else if (composerBeauty.isBeautyMode()) {
                        arrayList = new ArrayList();
                        if (list != null) {
                            for (BeautyCategory beautyCategory2 : list) {
                                Iterator<ComposerBeauty> it = beautyCategory2.getBeautyList().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        ComposerBeauty next = it.next();
                                        if (o.LJ(next, composerBeauty)) {
                                            if (next != null) {
                                                arrayList.addAll(beautyCategory2.getBeautyList());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (C1DH.LJIJ(composerBeauty)) {
                        arrayList = new ArrayList();
                        if (C1DH.LJIJ(composerBeauty) && (LJIIJJI = C1DH.LJIIJJI(composerBeauty, list)) != null && (childList = LJIIJJI.getChildList()) != null && (!childList.isEmpty())) {
                            arrayList.addAll(childList);
                        }
                    } else if (C1DH.LJIJJ(composerBeauty)) {
                        arrayList = new ArrayList();
                        if (C1DH.LJIJJ(composerBeauty) && list != null) {
                            Iterator<BeautyCategory> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    beautyCategory = it2.next();
                                    if (o.LJ(beautyCategory.getCategoryResponse().getId(), composerBeauty.getCategoryId())) {
                                        break;
                                    }
                                } else {
                                    beautyCategory = null;
                                    break;
                                }
                            }
                            BeautyCategory beautyCategory3 = beautyCategory;
                            if (beautyCategory3 != null) {
                                arrayList.addAll(beautyCategory3.getBeautyList());
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next2 = it3.next();
                            if (((ComposerBeauty) next2).getAdd2Nodes() && (!o.LJ(r1, composerBeauty))) {
                                obj = next2;
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                        if (composerBeauty2 != null) {
                            composerBeauty2.setAdd2Nodes(false);
                            D7(new C82942Wgs(composerBeauty.getEffect().getEffectId(), 1));
                            arrayList2.addAll(LJIIIZ(composerBeauty2, false, false));
                            C65768PrY<ComposerBeauty> value = this.LJIILL.getValue();
                            if (value != null) {
                                value.remove(composerBeauty2);
                            }
                        }
                        composerBeauty.setAdd2Nodes(true);
                        l7(new C82942Wgs(composerBeauty.getEffect().getEffectId(), 1));
                        interfaceC83180Wki.LIZ(arrayList2, LJIIIZ);
                        C1DJ.LJJII(this, new C83173Wkb(arrayList2, LJIIIZ));
                        LJIIZILJ(composerBeauty);
                        this.LJJIIZ.LJIIJ(composerBeauty.needFaceDetect());
                        return;
                    }
                    return;
                }
                composerBeauty.setAdd2Nodes(true);
                l7(new C82942Wgs(composerBeauty.getEffect().getEffectId(), 1));
                interfaceC83180Wki.LIZIZ(LJIIIZ);
                C1DJ.LJJII(this, new C83172Wka(LJIIIZ));
                LJIIZILJ(composerBeauty);
                this.LJJIIZ.LJIIJ(composerBeauty.needFaceDetect());
            }
        }
    }

    @Override // X.InterfaceC83142Wk6
    public final void Z7(ComposerBeauty composerBeauty, boolean z) {
        boolean LIZ;
        o.LJIIIZ(composerBeauty, "composerBeauty");
        if (C1DH.LJIJ(composerBeauty) && !k7(composerBeauty) && composerBeauty.getEnable()) {
            ComposerBeauty LJIIJJI = C1DH.LJIIJJI(composerBeauty, this.LIZJ);
            if (LJIIJJI != null) {
                if (z) {
                    LIZ = false;
                } else {
                    LIZ = LIZ();
                }
                LJIIJJI.setShowDot(LIZ);
            }
            composerBeauty.setShowDot(false);
            return;
        }
        if (!C1DH.LJIJJ(composerBeauty) && !k7(composerBeauty) && composerBeauty.getEnable()) {
            ComposerBeauty LJIIJJI2 = C1DH.LJIIJJI(composerBeauty, this.LIZJ);
            if (LJIIJJI2 != null) {
                LJIIJJI2.setShowDot(false);
            }
            composerBeauty.setShowDot(!z);
            return;
        }
        ComposerBeauty LJIIJJI3 = C1DH.LJIIJJI(composerBeauty, this.LIZJ);
        if (LJIIJJI3 != null) {
            LJIIJJI3.setShowDot(false);
        }
        composerBeauty.setShowDot(false);
    }

    @Override // X.InterfaceC83142Wk6
    public final synchronized void o7(boolean z, ILU gender) {
        int LJIIJJI;
        o.LJIIIZ(gender, "gender");
        if (this.LJJIIZI.isConvertKey()) {
            C82944Wgu.LIZ(this.LJJII);
        }
        if (!this.LJIILLIIL.LJI(this.LJJIIZI, this.LJJII)) {
            return;
        }
        if (z && gender == ILU.FEMALE && (LJIIJJI = this.LJJIIZ.LJIIJJI()) < 3) {
            this.LJJIIZ.LJIILJJIL(LJIIJJI + 1);
        }
        if (!this.LJJIII && this.LJJIFFI == gender && this.LJJ) {
            return;
        }
        this.LJJIII = false;
        this.LJJIFFI = gender;
        C83154WkI LJIIJJI2 = LJIIJJI();
        LJIIJJI2.getClass();
        LJIIJJI2.LIZIZ = gender;
        LJIIJJI().LIZJ();
        String gender2 = this.LJJIFFI.getFlag();
        o.LJIIIZ(gender2, "gender");
        C82944Wgu.LIZ.storeString("key_last_gender", gender2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("curGender:");
        LIZ.append(this.LJJIFFI.getFlag());
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ));
        LJIILIIL(gender);
    }

    @Override // X.InterfaceC83142Wk6
    public final void L7(String str, boolean z, C83124Wjo c83124Wjo) {
        C84499XEh.LJFF((InterfaceC84497XEf) this.LJIIIZ.getValue(), str, new C83158WkM(this, str, c83124Wjo), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo> LJIIIZ(com.ss.android.ugc.aweme.beauty.ComposerBeauty r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83146WkA.LJIIIZ(com.ss.android.ugc.aweme.beauty.ComposerBeauty, boolean, boolean):java.util.List");
    }

    @Override // X.InterfaceC83142Wk6
    public final BeautifyUsedInfo T7(boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns) {
        if (z2) {
            ((ArrayList) this.LJIIZILJ).clear();
        }
        if (z && this.LJJIIZI.getBeautyMobAddConfig()) {
            XKX.LIZLLL(this.LJJI, C78613UtF.LIZJ, null, new C83149WkD(this, interfaceC88472Yns, null), 2);
        }
        BeautifyUsedInfo LJIIJ = LJIIJ();
        LJIIJ.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(LJIIJ.info);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            BeautifyUesTabInfo beautifyUesTabInfo = (BeautifyUesTabInfo) it.next();
            arrayList.add(new BeautifyUesTabInfo(beautifyUesTabInfo.tabName, beautifyUesTabInfo.categoryName, beautifyUesTabInfo.categoryDiy, beautifyUesTabInfo.parentNameList, beautifyUesTabInfo.parentValueList));
        }
        return new BeautifyUsedInfo(arrayList);
    }

    @Override // X.InterfaceC83142Wk6
    public final float U7(ComposerBeauty composerBeauty, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        return this.LJJIIZ.LJIILIIL(composerBeauty, this.LJJIFFI, str, f);
    }

    @Override // X.InterfaceC83142Wk6
    public final void t7(ComposerBeauty composerBeauty, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        this.LJJIIZ.LJIILL(composerBeauty, this.LJJIFFI, str, f);
        Y7();
    }

    public C83146WkA(InterfaceC83159WkN interfaceC83159WkN, BeautyFilterConfig beautyFilterConfig, Gson gson, InterfaceC65784Pro<? extends InterfaceC84497XEf> interfaceC65784Pro) {
        java.util.Map<String, Integer> c1hq;
        this.LJJIIZ = interfaceC83159WkN;
        this.LJJIIZI = beautyFilterConfig;
        this.LJJIJ = gson;
        C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, new AqS164S0100000_14(interfaceC65784Pro, 340));
        this.LJIIIZ = LIZ;
        this.LJIIJ = new SafeMutableLiveData<>();
        this.LJIIJJI = new C83186Wko((InterfaceC84497XEf) LIZ.getValue());
        this.LJIILIIL = new SafeMutableLiveData<>();
        SafeMutableLiveData<java.util.Map<String, Integer>> safeMutableLiveData = new SafeMutableLiveData<>();
        if (beautyFilterConfig.getBeautyDownloadToThread()) {
            c1hq = new ConcurrentHashMap<>();
        } else {
            c1hq = new C1HQ<>();
        }
        safeMutableLiveData.setValue(c1hq);
        this.LJIILJJIL = safeMutableLiveData;
        this.LJIILL = new SafeMutableLiveData<>();
        this.LJIILLIIL = new C78949Uyf();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = C221108m2.LIZIZ(C83145Wk9.LJLIL);
        this.LJIJI = C221108m2.LIZIZ(C83178Wkg.LJLIL);
        this.LJIJJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 339));
        this.LJIJJLI = new C83109WjZ();
        this.LJIL = new C17J();
        this.LJJ = true;
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        IDaS27S0000000_14 iDaS27S0000000_14 = new IDaS27S0000000_14(CoroutineExceptionHandler.LJJJJIZL, 0);
        XIF xif = EXU.LIZ;
        this.LJJI = C48841JEv.LIZ(xif.plus(LJIILIIL).plus(iDaS27S0000000_14));
        this.LJJIFFI = ILU.FEMALE;
        this.LJJII = new ArrayList();
        C83154WkI LJIIJJI = LJIIJJI();
        ILU ilu = this.LJJIFFI;
        LJIIJJI.getClass();
        o.LJIIIZ(ilu, "<set-?>");
        LJIIJJI.LIZIZ = ilu;
        XKX.LIZLLL(C780334l.LJLIL, xif, null, new C83152WkG(this, null), 2);
        this.LJJIII = true;
        this.LJJIIJ = new SafeMutableLiveData<>();
        this.LJJIIJZLJL = new C83155WkJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.beauty.ComposerBeauty LJIIIIZZ(com.ss.android.ugc.effectmanager.effect.model.Effect r57, java.lang.String r58, boolean r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra r63) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83146WkA.LJIIIIZZ(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra):com.ss.android.ugc.aweme.beauty.ComposerBeauty");
    }
}
