package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.AbstractC029409q;
import X.AbstractC030309z;
import X.AbstractC73295Spf;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C03040Aa;
import X.C03880Dg;
import X.C0A2;
import X.C0AY;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C145995oB;
import X.C15280iq;
import X.C165706es;
import X.C16880lQ;
import X.C221108m2;
import X.C2312095o;
import X.C28871Bj;
import X.C29S;
import X.C3C5;
import X.C3XE;
import X.C42090GfW;
import X.C42625Go9;
import X.C45741HxJ;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C71813SGj;
import X.C73849Syb;
import X.C73893SzJ;
import X.C74266TCs;
import X.C76732zl;
import X.C76800UCe;
import X.C90903hW;
import X.EGX;
import X.EGY;
import X.EQG;
import X.ES4;
import X.H78;
import X.IA2;
import X.InterfaceC45540Hu4;
import X.InterfaceC73367Sqp;
import X.InterfaceC73389SrB;
import X.InterfaceC74377TGz;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.QD3;
import X.TD3;
import X.TE0;
import X.TE1;
import X.TE3;
import X.TE4;
import X.TE5;
import X.TEF;
import X.TEJ;
import X.TEN;
import X.TEW;
import X.TEZ;
import X.TF5;
import X.TGH;
import X.TKR;
import X.X1D;
import X.XKX;
import Y.AObserverS75S0200000_12;
import Y.AObserverS80S0100000_12;
import Y.ARunnableS23S0300000_12;
import Y.ARunnableS48S0100000_12;
import Y.IDCListenerS247S0100000_12;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes13.dex */
public final class EffectTemplateCategoryFragment extends Fragment implements InterfaceC74377TGz<Fragment> {
    public static final /* synthetic */ int LLFF = 0;
    public final ShortVideoContext LJLIL;
    public final C73849Syb<C76800UCe> LJLILLLLZI;
    public TGH LJLJI;
    public int LJLJJLL;
    public TEZ LJLJL;
    public TEJ LJLJLJ;
    public TF5 LJLJLLL;
    public boolean LJLLJ;
    public RecyclerView LJLLL;
    public TEW LJLLLL;
    public final C28871Bj LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public final TE3 LJLJJI = new TE3(this);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 972));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 968));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 973));
    public final C73893SzJ<Integer> LJLLILLLL = new C73893SzJ<>();
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 974));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 969));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(TE5.LJLIL);

    @Override // X.InterfaceC74377TGz
    public final Fragment N7() {
        return this;
    }

    public final EffectCategoryModel Al() {
        return (EffectCategoryModel) this.LJLL.getValue();
    }

    public final TD3 Dl() {
        return (TD3) this.LJLZ.getValue();
    }

    public final MyEffectsViewModel Gl() {
        return (MyEffectsViewModel) this.LL.getValue();
    }

    public final C74266TCs Hl() {
        return (C74266TCs) this.LJLLLLLL.getValue();
    }

    public final TemplateEffectsViewModel Il() {
        return (TemplateEffectsViewModel) this.LLD.getValue();
    }

    public final void Kl() {
        C28871Bj c28871Bj;
        String str;
        RecyclerView recyclerView = this.LJLLL;
        if (recyclerView != null) {
            AbstractC029409q adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C28871Bj) || (c28871Bj = (C28871Bj) adapter) == null) {
                return;
            }
            List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> LJLZ = c28871Bj.LJLZ();
            o.LJIIIIZZ(LJLZ, "adapter.adapters");
            for (AbstractC029409q<? extends RecyclerView.ViewHolder> abstractC029409q : LJLZ) {
                if (abstractC029409q instanceof C74266TCs) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("category_model", Al());
                    if (((ArrayList) ((AbstractC73295Spf) abstractC029409q).LJLILLLLZI).isEmpty()) {
                        return;
                    }
                    EffectCategoryModel Al = Al();
                    if (Al != null) {
                        str = Al.getName();
                    } else {
                        str = null;
                    }
                    RecyclerView recyclerView2 = this.LJLLL;
                    if (recyclerView2 != null) {
                        C0A2 layoutManager = recyclerView2.getLayoutManager();
                        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                        int LLILL = ((LinearLayoutManager) layoutManager).LLILL();
                        RecyclerView recyclerView3 = this.LJLLL;
                        if (recyclerView3 != null) {
                            C0A2 layoutManager2 = recyclerView3.getLayoutManager();
                            o.LJII(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                            int LLILLJJLI = ((LinearLayoutManager) layoutManager2).LLILLJJLI();
                            TEJ tej = this.LJLJLJ;
                            if (tej != null) {
                                TE1 te1 = tej.LIZ;
                                if (te1 != null) {
                                    te1.LIZIZ(LLILL, LLILLJJLI, str, bundle, new AqS143S0200000_12(this, c28871Bj, 66));
                                }
                            } else {
                                o.LJIJI("optionalDependency");
                                throw null;
                            }
                        } else {
                            o.LJIJI("recyclerView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("recyclerView");
                        throw null;
                    }
                }
            }
            return;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public final void Nl() {
        List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> LJLZ = this.LJZI.LJLZ();
        o.LJIIIIZZ(LJLZ, "concatAdapter.adapters");
        Iterator<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> it = LJLZ.iterator();
        while (it.hasNext()) {
            this.LJZI.LJZI(it.next());
        }
    }

    public final void vl() {
        RecyclerView recyclerView = this.LJLLL;
        String str = null;
        if (recyclerView != null) {
            if (recyclerView.getAdapter() == null) {
                return;
            }
            TEJ tej = this.LJLJLJ;
            if (tej != null) {
                TE1 te1 = tej.LIZ;
                if (te1 != null) {
                    EffectCategoryModel Al = Al();
                    if (Al != null) {
                        str = Al.getName();
                    }
                    te1.clear(str);
                    return;
                }
                return;
            }
            o.LJIJI("optionalDependency");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    @Override // X.TGQ
    public final AbstractC73672Svk<Integer> yg() {
        C73893SzJ<Integer> c73893SzJ = this.LJLLILLLL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final void B1() {
        Nl();
        C28871Bj c28871Bj = this.LJZI;
        c28871Bj.LJLLLLLL(new C3XE(R.string.fzz));
        c28871Bj.LJLLLLLL(Hl());
        c28871Bj.LJLLLLLL(new C3XE(R.string.g00));
        this.LJZI.LJLLLLLL((AbstractC029409q) this.LJZ.getValue());
    }

    public final InterfaceC73367Sqp Ml() {
        String str;
        StickerStatesStoreViewModel stickerStatesStoreViewModel = (StickerStatesStoreViewModel) C165706es.LJII(getView(), null, 6).get(StickerStatesStoreViewModel.class);
        TEZ tez = this.LJLJL;
        if (tez != null) {
            InterfaceC73389SrB LJ = tez.LJJJJLL().LJ();
            EffectCategoryModel Al = Al();
            if (Al == null || (str = Al.getKey()) == null) {
                str = "";
            }
            return StickerStatesStoreViewModel.hv0(stickerStatesStoreViewModel, LJ, str, 4);
        }
        o.LJIJI("stickerDataManager");
        throw null;
    }

    public final void Pl() {
        boolean z;
        boolean z2;
        TEN value = Il().LJLJJL.getValue();
        TEN ten = TEN.LOADING;
        boolean z3 = true;
        int i = 0;
        if (value == ten || Gl().LJLJJL.getValue() == ten) {
            z = true;
        } else {
            z = false;
        }
        TEN value2 = Il().LJLJJL.getValue();
        TEN ten2 = TEN.ERROR;
        if (value2 == ten2 || Gl().LJLJJL.getValue() == ten2) {
            z2 = true;
        } else {
            z2 = false;
        }
        TEW tew = this.LJLLLL;
        if (tew != null) {
            if (!z) {
                if (z2) {
                    ten = ten2;
                } else {
                    ten = TEN.NONE;
                }
            }
            tew.setState(ten);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("observeInitialDataLoaded isLoading=");
            LIZ.append(z);
            LIZ.append(", isError=");
            LIZ.append(z2);
            C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ));
            if (z || z2) {
                z3 = false;
            }
            RecyclerView recyclerView = this.LJLLL;
            if (recyclerView != null) {
                if (!z3) {
                    i = 8;
                }
                recyclerView.setVisibility(i);
                if (z3) {
                    List<Effect> value3 = Il().LJLILLLLZI.getValue();
                    if (value3 == null) {
                        value3 = C61878OQg.INSTANCE;
                    }
                    List<Effect> value4 = Gl().LJLILLLLZI.getValue();
                    if (value4 == null) {
                        value4 = C61878OQg.INSTANCE;
                    }
                    Integer value5 = Gl().LJLZ.getValue();
                    ((ArrayList) Hl().LJLILLLLZI).clear();
                    Hl().setData(value3);
                    if (value4.isEmpty()) {
                        B1();
                        return;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("showing nonEmpty view, jumpAllMyEffectIndex=");
                    LIZ2.append(value5);
                    H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ2));
                    Nl();
                    C28871Bj c28871Bj = this.LJZI;
                    c28871Bj.LJLLLLLL(new C3XE(R.string.fzz));
                    c28871Bj.LJLLLLLL(Hl());
                    c28871Bj.LJLLLLLL(new C3XE(R.string.g00));
                    this.LJZI.LJLLLLLL(Dl());
                    ((ArrayList) Dl().LJLILLLLZI).clear();
                    Dl().setData(value4);
                    RecyclerView recyclerView2 = this.LJLLL;
                    if (recyclerView2 != null) {
                        recyclerView2.LJJJJZI();
                        if (value5 == null || value5.intValue() < 0) {
                            return;
                        }
                        ((Handler) this.LJLJJL.getValue()).post(new ARunnableS23S0300000_12(this, value4, value5, 5));
                        return;
                    }
                    o.LJIJI("recyclerView");
                    throw null;
                }
                return;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) this.LJZL.getValue();
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityResultListener(this.LJLJJI);
        }
        C42625Go9.LIZJ(this);
        ((LinkedHashMap) this.LLF).clear();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockEffectEvent(TE4 event) {
        o.LJIIIZ(event, "event");
        if (Hl().LJLZ(event.LJLIL) != -1) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS48S0100000_12(this, 58), 500L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-4870473964639979365");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/gamora/recorder/sticker/templateeffect/effectpanel/EffectTemplateCategoryFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/gamora/recorder/sticker/templateeffect/effectpanel/EffectTemplateCategoryFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.LJLLL == null) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/gamora/recorder/sticker/templateeffect/effectpanel/EffectTemplateCategoryFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        if (z) {
            Kl();
        } else {
            vl();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/gamora/recorder/sticker/templateeffect/effectpanel/EffectTemplateCategoryFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final Map<String, String> wl(Effect effect) {
        MobileEffect mobileEffect;
        String str;
        String str2 = null;
        if ((effect instanceof MobileEffect) && (mobileEffect = (MobileEffect) effect) != null) {
            C145995oB c145995oB = new C145995oB();
            MobileEffectTemplateInfo templateInfo = mobileEffect.getTemplateInfo();
            if (templateInfo != null) {
                str = templateInfo.getTemplateId();
            } else {
                str = null;
            }
            c145995oB.LJI("template_id", str);
            MobileEffectTemplateInfo templateInfo2 = mobileEffect.getTemplateInfo();
            if (templateInfo2 != null) {
                str2 = templateInfo2.getTemplateName();
            }
            c145995oB.LJI("template_name", str2);
            c145995oB.LJI("effect_id", mobileEffect.getEffectId());
            c145995oB.LJI("effect_name", mobileEffect.getName());
            c145995oB.LJI("creation_id", C42090GfW.LIZJ(mobileEffect));
            c145995oB.LJI("shoot_way", this.LJLIL.shootWay);
            c145995oB.LJI("enter_from", this.LJLIL.enterFrom);
            Map<String, String> map = c145995oB.LIZ;
            o.LJIIIIZZ(map, "newBuilder()\n           …text.enterFrom).builder()");
            return map;
        }
        return C113554cx.LJJJLIIL();
    }

    public final TD3 xl(FixedStickerListViewModel fixedStickerListViewModel) {
        TEZ tez = this.LJLJL;
        if (tez != null) {
            TF5 tf5 = this.LJLJLLL;
            if (tf5 != null) {
                TEF tef = tf5.LJ;
                TE0 te0 = tf5.LJFF;
                int i = te0.LJLIL;
                int i2 = te0.LJLILLLLZI;
                float f = te0.LJLJI;
                InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns = te0.LJLJJI;
                InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns2 = te0.LJLJJL;
                InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns3 = te0.LJLJJLL;
                InterfaceC88472Yns<? super ViewGroup, ? extends OSZ<? extends View, ? extends View>> interfaceC88472Yns4 = te0.LJLJL;
                TKR stickerViewHolderConfigure = te0.LJLJLJ;
                boolean z = te0.LJLJLLL;
                boolean z2 = te0.LJLL;
                boolean z3 = te0.LJLLI;
                InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns5 = te0.LJLLILLLL;
                InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns6 = te0.LJLLJ;
                boolean z4 = te0.LJLLLL;
                boolean z5 = te0.LJLLLLLL;
                o.LJIIIZ(stickerViewHolderConfigure, "stickerViewHolderConfigure");
                TE0 te02 = new TE0(i, i2, f, interfaceC88472Yns, interfaceC88472Yns2, interfaceC88472Yns3, interfaceC88472Yns4, stickerViewHolderConfigure, z, z2, z3, interfaceC88472Yns5, interfaceC88472Yns6, true, z4, z5);
                TEJ tej = this.LJLJLJ;
                if (tej != null) {
                    return new TD3(tez, tef, fixedStickerListViewModel, te02, tej.LIZLLL, tej.LIZIZ, tej, Al(), this.LJLJJLL, new IDqS436S0100000_12(this, 26), this.LJLILLLLZI, this.LJLIL, new IDqS436S0100000_12(this, 27));
                }
                o.LJIJI("optionalDependency");
                throw null;
            }
            o.LJIJI("requiredDependency");
            throw null;
        }
        o.LJIJI("stickerDataManager");
        throw null;
    }

    public EffectTemplateCategoryFragment(ShortVideoContext shortVideoContext, C73849Syb<C76800UCe> c73849Syb) {
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = c73849Syb;
        C0AY c0ay = new C0AY();
        c0ay.LIZ = false;
        this.LJZI = new C28871Bj(new C03040Aa(c0ay.LIZ, c0ay.LIZIZ), (AbstractC029409q<? extends RecyclerView.ViewHolder>[]) new AbstractC029409q[0]);
        this.LJZL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 971));
        this.LL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 970));
        this.LLD = C221108m2.LIZIZ(new AqS162S0100000_12(this, 975));
    }

    public final void Ll(FixedStickerListViewModel fixedStickerListViewModel, C74266TCs c74266TCs) {
        fixedStickerListViewModel.Sg0().observe(this, new AObserverS75S0200000_12(c74266TCs, this, 40));
        TEZ tez = this.LJLJL;
        if (tez != null) {
            tez.LJIIIIZZ().LIZ().observe(this, new AObserverS80S0100000_12(c74266TCs, 97));
        } else {
            o.LJIJI("stickerDataManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.kie);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.sticker_list)");
        this.LJLLL = (RecyclerView) findViewById;
        Map LJJL = C113554cx.LJJL(new OSZ(TEN.LOADING, new AqS178S0100000_12(this, 550)), new OSZ(TEN.EMPTY, new AqS178S0100000_12(this, 551)), new OSZ(TEN.ERROR, new AqS178S0100000_12(this, 553)));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "root.context");
        TEW tew = new TEW(context, LJJL, TEN.NONE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        tew.setLayoutParams(layoutParams);
        View view2 = getView();
        o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(tew);
        this.LJLLLL = tew;
        RecyclerView recyclerView = this.LJLLL;
        if (recyclerView != null) {
            TF5 tf5 = this.LJLJLLL;
            if (tf5 != null) {
                recyclerView.setItemViewCacheSize(tf5.LJFF.LJLILLLLZI);
                TF5 tf52 = this.LJLJLLL;
                if (tf52 != null) {
                    recyclerView.LJIIJJI(new C45741HxJ(tf52.LJFF.LJLLI));
                    C76732zl c76732zl = new C76732zl();
                    C76732zl c76732zl2 = new C76732zl();
                    if (C2312095o.LIZIZ()) {
                        c76732zl.element = 5;
                        c76732zl2.element = 5;
                    } else if (C2312095o.LIZJ()) {
                        c76732zl.element = 4;
                        c76732zl2.element = 4;
                    } else {
                        c76732zl2.element = 4;
                        c76732zl.element = 5;
                    }
                    getContext();
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(20);
                    gridLayoutManager.LLIILII = new C71813SGj(recyclerView, this, c76732zl, c76732zl2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView.LJIIJJI(new IDrS50S0100000_12(this, 16));
                    recyclerView.addOnAttachStateChangeListener(new IDCListenerS247S0100000_12(this, 2));
                    if (C2312095o.LIZIZ()) {
                        recyclerView.LJII(new AbstractC030309z() { // from class: X.4iU
                            @Override // X.AbstractC030309z
                            public final void LJ(Rect rect, View view3, RecyclerView recyclerView2, C0AC c0ac) {
                                Integer num;
                                GridLayoutManager gridLayoutManager2;
                                Integer num2;
                                Integer num3;
                                int i;
                                int i2;
                                int LIZ;
                                int LJJIIZ;
                                AbstractC028509h abstractC028509h;
                                C1BU c1bu;
                                int LIZJ = C1JX.LIZJ(rect, "outRect", view3, "view", recyclerView2, "parent", c0ac, "state", view3);
                                AbstractC029409q adapter = recyclerView2.getAdapter();
                                Integer num4 = null;
                                if (adapter != null) {
                                    num = Integer.valueOf(adapter.getItemViewType(LIZJ));
                                } else {
                                    num = null;
                                }
                                C0A2 layoutManager = recyclerView2.getLayoutManager();
                                if (layoutManager instanceof GridLayoutManager) {
                                    gridLayoutManager2 = (GridLayoutManager) layoutManager;
                                } else {
                                    gridLayoutManager2 = null;
                                }
                                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                                if ((layoutParams2 instanceof C1BU) && (c1bu = (C1BU) layoutParams2) != null) {
                                    num2 = Integer.valueOf(c1bu.LJLIL);
                                } else {
                                    num2 = null;
                                }
                                if (gridLayoutManager2 != null) {
                                    num3 = Integer.valueOf(gridLayoutManager2.LLIIIL);
                                } else {
                                    num3 = null;
                                }
                                AbstractC029409q adapter2 = recyclerView2.getAdapter();
                                int i3 = 0;
                                if (adapter2 != null) {
                                    i = adapter2.getItemCount();
                                } else {
                                    i = 0;
                                }
                                if (LIZJ < i) {
                                    if (gridLayoutManager2 != null && (abstractC028509h = gridLayoutManager2.LLIILII) != null) {
                                        i2 = abstractC028509h.LJFF(LIZJ);
                                    } else {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = -1;
                                }
                                if (num == null || num.intValue() != R.layout.atf) {
                                    if (i2 == 5) {
                                        i3 = C278817o.LIZ(16.0f);
                                    } else {
                                        AbstractC029409q adapter3 = recyclerView2.getAdapter();
                                        if (adapter3 != null && LIZJ == adapter3.getItemCount() - 1) {
                                            i3 = C278817o.LIZ(32.0f);
                                        }
                                    }
                                } else {
                                    i3 = C278817o.LIZ(5.0f);
                                }
                                rect.bottom = i3;
                                if (num2 == null || num2.intValue() != 0) {
                                    LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(9.0f))) / 2;
                                } else {
                                    LIZ = C278817o.LIZ(9.0f);
                                }
                                rect.left = LIZ;
                                if (num2 != null) {
                                    num4 = C77339UWx.LIZIZ(num2, i2);
                                }
                                if (o.LJ(num4, num3)) {
                                    LJJIIZ = C278817o.LIZ(9.0f);
                                } else {
                                    LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(9.0f))) / 2;
                                }
                                rect.right = LJJIIZ;
                            }
                        }, -1);
                    } else if (C2312095o.LIZJ()) {
                        recyclerView.LJII(new AbstractC030309z() { // from class: X.4YT
                            @Override // X.AbstractC030309z
                            public final void LJ(Rect outRect, View view3, RecyclerView parent, C0AC state) {
                                int i;
                                o.LJIIIZ(outRect, "outRect");
                                o.LJIIIZ(view3, "view");
                                o.LJIIIZ(parent, "parent");
                                o.LJIIIZ(state, "state");
                                Context context2 = view3.getContext();
                                o.LJIIIIZZ(context2, "view.context");
                                int LIZIZ = (int) C74275TDb.LIZIZ(context2, 11.0f);
                                Context context3 = view3.getContext();
                                o.LJIIIIZZ(context3, "view.context");
                                int LIZIZ2 = (int) C74275TDb.LIZIZ(context3, 16.0f);
                                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                                if (layoutParams2 != null) {
                                    GridLayoutManager gridLayoutManager2 = (GridLayoutManager) parent.getLayoutManager();
                                    int i2 = ((C1BU) layoutParams2).LJLIL;
                                    if (gridLayoutManager2 != null) {
                                        i = gridLayoutManager2.LLIIIL;
                                    } else {
                                        i = 5;
                                    }
                                    outRect.left = (i2 * LIZIZ) / i;
                                    outRect.right = LIZIZ - (((i2 + 1) * LIZIZ) / i);
                                    outRect.bottom = LIZIZ2;
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
                            }
                        }, -1);
                    }
                    C28871Bj c28871Bj = this.LJZI;
                    c28871Bj.LJLLLLLL(new C3XE(R.string.fzz));
                    c28871Bj.LJLLLLLL(Hl());
                    c28871Bj.LJLLLLLL(new C3XE(R.string.g00));
                    recyclerView.setAdapter(this.LJZI);
                    H78.LIZIZ("DiyProp", "EffectTemplateCategoryFragment onViewCreated");
                    if (!this.LJLLJ) {
                        this.LJLLJ = true;
                        H78.LIZIZ("DiyProp", "setting up observer");
                        Il().LJLJJL.observe(this, new AObserverS80S0100000_12(this, 98));
                        Gl().LJLJJL.observe(this, new AObserverS80S0100000_12(this, 99));
                        Gl().LJLLLLLL.observe(this, new AObserverS80S0100000_12(this, 100));
                        Gl().LJZ.observe(this, new AObserverS80S0100000_12(this, 101));
                        Ll(Il(), Hl());
                        Ll(Gl(), Dl());
                    }
                    ShortVideoContext shortVideoContext = this.LJLIL;
                    Jl(this, shortVideoContext.mUnpublishedEffectId, shortVideoContext.mSavedDraftId, false, 4);
                    InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) this.LJZL.getValue();
                    if (interfaceC45540Hu4 != null) {
                        interfaceC45540Hu4.registerActivityResultListener(this.LJLJJI);
                    }
                    C42625Go9.LIZIZ(this);
                    return;
                }
                o.LJIJI("requiredDependency");
                throw null;
            }
            o.LJIJI("requiredDependency");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.crj, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public final void Ol(int i, TF5 requiredDependency, TEJ optionalDependency, RecyclerView.RecycledViewPool recycledViewPool) {
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        this.LJLJJLL = i;
        this.LJLJL = requiredDependency.LIZ;
        this.LJLJLLL = requiredDependency;
        this.LJLJLJ = optionalDependency;
    }

    public static void Jl(EffectTemplateCategoryFragment effectTemplateCategoryFragment, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        int i2 = 4;
        if ((i & 4) != 0) {
            z = false;
        }
        effectTemplateCategoryFragment.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetching sticker data, jumpEffectId=");
        LIZ.append(str);
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
        if (ES4.LIZ()) {
            if (C2312095o.LIZJ()) {
                i2 = 5;
            }
            TemplateEffectsViewModel Il = effectTemplateCategoryFragment.Il();
            Il.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(Il), null, null, new EGY(Il, i2, null), 3);
        } else {
            TemplateEffectsViewModel Il2 = effectTemplateCategoryFragment.Il();
            Il2.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(Il2), null, null, new EGX(Il2, null), 3);
        }
        if (!z) {
            MyEffectsViewModel Gl = effectTemplateCategoryFragment.Gl();
            Gl.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(Gl), null, null, new EQG(Gl, str, str2, null), 3);
        }
    }
}
