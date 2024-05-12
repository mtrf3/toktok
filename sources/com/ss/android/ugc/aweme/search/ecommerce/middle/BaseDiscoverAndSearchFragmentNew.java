package com.ss.android.ugc.aweme.search.ecommerce.middle;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C178686zo;
import X.C188727au;
import X.C2068389v;
import X.C27038AjK;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C48690J9a;
import X.C49804Jge;
import X.C50321Joz;
import X.C50491Jrj;
import X.C50545Jsb;
import X.C50605JtZ;
import X.C50650JuI;
import X.C50652JuK;
import X.C50726JvW;
import X.C50730Jva;
import X.C50948Jz6;
import X.C51111K4d;
import X.C51137K5d;
import X.C51138K5e;
import X.C51139K5f;
import X.C51140K5g;
import X.C51141K5h;
import X.C51142K5i;
import X.C51157K5x;
import X.C51160K6a;
import X.C51163K6d;
import X.C51171K6l;
import X.C53765L8f;
import X.C61328O5c;
import X.C73411SrX;
import X.C74044T4e;
import X.C76800UCe;
import X.C78605Ut7;
import X.C78897Uxp;
import X.C84763XOl;
import X.C86V;
import X.C90903hW;
import X.DR0;
import X.EnumC27399Ap9;
import X.EnumC51135K5b;
import X.EnumC51264KAa;
import X.FHD;
import X.FMX;
import X.InterfaceC51136K5c;
import X.InterfaceC51158K5y;
import X.JTO;
import X.K0D;
import X.K5I;
import X.K5J;
import X.K5M;
import X.K5N;
import X.K5O;
import X.K5R;
import X.K5S;
import X.K5T;
import X.K5U;
import X.K5V;
import X.K64;
import X.K65;
import X.K66;
import X.K6D;
import X.K6X;
import X.K7D;
import X.K7J;
import X.KB1;
import X.LO7;
import X.QD3;
import X.T16;
import X.T5T;
import X.Z9N;
import Y.ACListenerS21S0101000_2;
import Y.ACListenerS22S0101000_3;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS29S0101000_12;
import Y.ACListenerS32S0101000_15;
import Y.AObjectS146S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS12S0101000_8;
import Y.AfS36S0101000_5;
import Y.AfS39S0101000_13;
import Y.IDCListenerS10S0101000;
import Y.IDObjectS180S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.MiddleForSearchFromEC;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchStateData;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import o3.IDaS90S0000000_4;
import o3.h0;
import yq4.a;

/* loaded from: classes9.dex */
public abstract class BaseDiscoverAndSearchFragmentNew extends AmeBaseFragment {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public K5T LJLIL;
    public K5U LJLILLLLZI;
    public K5S LJLJI;
    public TuxIconView LJLJJI;
    public EditText LJLJJL;
    public TuxIconView LJLJJLL;
    public LinearLayout LJLJL;
    public View LJLJLJ;
    public TuxIconView LJLJLLL;
    public ViewGroup LJLL;
    public View LJLLI;
    public TextView LJLLILLLL;
    public TuxIconView LJLLJ;
    public ImageView LJLLL;
    public FrameLayout LJLLLL;
    public TuxIconView LJLLLLLL;
    public K5R LJLZ;
    public K0D LJZ;
    public boolean LJZI;
    public K5S LLD;
    public C51163K6d LLF;
    public SearchStateViewModel LLFF;
    public C51142K5i LLFFF;
    public String LLFII;
    public SearchStartViewModel LLFZ;
    public SearchStateData LLI;
    public boolean LLIFFJFJJ;
    public ViewStub LLILL;
    public InterfaceC51136K5c LLILLIZIL;
    public ViewStub LLILLJJLI;
    public InterfaceC51136K5c LLILLL;
    public SearchContainerHeaderVM LLILZ;
    public String LLILZLL;
    public Word LLIZ;
    public boolean LJZL = true;
    public Long LL = 0L;
    public C73411SrX LLII = null;
    public SearchResultParam LLIIII = null;
    public K5M LLIIIILZ = null;
    public K5V LLIIIJ = null;
    public InterfaceC51158K5y LLIIIL = null;
    public InterfaceC51158K5y LLIIIZ = null;
    public C51139K5f LLIIJI = null;
    public C51140K5g LLIIJLIL = null;
    public K5J LLIIL = null;
    public K5N LLIILII = null;
    public K5O LLIILZL = null;
    public C51138K5e LLIIZ = null;
    public SugKeywordPresenter LLIL = null;
    public boolean LLILII = false;
    public C78605Ut7 LLILIL = null;
    public long LLILZIL = 0;

    public void Dl() {
    }

    public void Dm(String str) {
    }

    public void El(View view) {
    }

    public abstract void Em();

    public boolean Hl() {
        return true;
    }

    public void Il() {
    }

    public abstract void Nl();

    public void Nm() {
    }

    public abstract void Sl();

    public abstract void Wl();

    public abstract void Yl();

    public void Zl() {
    }

    public abstract String getEnterFrom();

    public abstract int getLayout();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public abstract boolean km();

    public abstract boolean lm();

    public void nm() {
    }

    public void pm() {
    }

    public abstract void vm(boolean z);

    public final int Jl() {
        Integer value = this.LLFF.searchState.getValue();
        if (value == null) {
            Nl();
            return 7;
        }
        return value.intValue();
    }

    public void Rl() {
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZIZ() && lm()) {
            MiddleForSearchFromEC.LJIILIIL().LJII();
        } else {
            new C50545Jsb(this).LIZIZ(new C50491Jrj());
        }
    }

    public final boolean em() {
        if ("homepage_follow".equals(getEnterFrom()) || "homepage_hot".equals(getEnterFrom()) || "homepage_friends".equals(getEnterFrom()) || "homepage_popular".equals(getEnterFrom()) || "homepage_nearby".equals(getEnterFrom()) || "homepage_explore".equals(getEnterFrom()) || LO7.LIZIZ.J1(getEnterFrom())) {
            return true;
        }
        return false;
    }

    public void om() {
        boolean z;
        this.LLFF.setBackToMiddle(true);
        C51160K6a.LIZIZ("click_clear");
        if (Jl() != 2 || K7J.LIZ(K7D.PRESS_CLEAR)) {
            z = true;
            this.LLFZ.LJLIL = true;
        } else {
            z = false;
            this.LLFZ.LJLIL = false;
        }
        nm();
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZIZ() && lm()) {
            MiddleForSearchFromEC.LJIILIIL().LJIIJ(this.LJLJJL.getText().toString());
        } else {
            C50545Jsb c50545Jsb = new C50545Jsb(this);
            String query = this.LJLJJL.getText().toString();
            o.LJIIIZ(query, "query");
            c50545Jsb.LIZIZ(new C50726JvW(query));
        }
        this.LJLJJL.setText("");
        this.LJLJJL.setSelection(0);
        Ql(z);
        Dm("cancel");
    }

    public void qm() {
        new Handler().postDelayed(new ARunnableS12S0101000_8(3, this, 31), 800L);
    }

    public final void sm() {
        EditText editText = this.LJLJJL;
        if (editText == null) {
            return;
        }
        Tl(editText.getText().toString());
        Hm("click_search");
    }

    public final void xm() {
        long j;
        EditText editText = this.LJLJJL;
        ARunnableS12S0101000_8 aRunnableS12S0101000_8 = new ARunnableS12S0101000_8(2, this, 1);
        if (K6X.LIZ()) {
            j = 0;
        } else {
            j = 200;
        }
        editText.postDelayed(aRunnableS12S0101000_8, j);
    }

    public void Am() {
        boolean z;
        K5M k5m;
        K5O k5o;
        K5M k5m2;
        K5O k5o2;
        if (!Hl()) {
            return;
        }
        Il();
        Z9N.LIZIZ.LLLIILIL();
        String obj = this.LJLJJL.getText().toString();
        if (this.LJZ != null && !obj.isEmpty()) {
            this.LJZ.LIZIZ = obj;
        }
        int selectionStart = this.LJLJJL.getSelectionStart();
        if (this.LJZI) {
            selectionStart = this.LJLJJL.getText().length();
        }
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZIZ() && lm()) {
            MiddleForSearchFromEC.LJIILIIL().LJIIL(selectionStart);
        } else {
            new C50545Jsb(this).LIZIZ(new C50730Jva(selectionStart));
        }
        this.LJZI = false;
        K5R k5r = this.LJLZ;
        if (k5r != null && k5r.LIZJ) {
            z = true;
            Dl();
        } else {
            z = false;
        }
        if (lm()) {
            if (!z && (k5m2 = this.LLIIIILZ) != null && (k5o2 = k5m2.LIZ.LLIILZL) != null && k5o2.LIZ() == 2 && this.LLIIIZ != null) {
                InterfaceC51136K5c interfaceC51136K5c = this.LLILLIZIL;
                if (interfaceC51136K5c != null) {
                    interfaceC51136K5c.setViewVisibility(8);
                }
                InterfaceC51136K5c interfaceC51136K5c2 = this.LLILLL;
                if (interfaceC51136K5c2 != null) {
                    interfaceC51136K5c2.setViewVisibility(0);
                }
                this.LLIIIZ.LJIIIIZZ(obj);
                K5O k5o3 = this.LLIILZL;
                if (k5o3 == null) {
                    return;
                }
                if (k5o3.LIZ() == 2 && TextUtils.equals(obj, this.LLIL.LIZ())) {
                    return;
                }
                this.LLIL.LIZJ(obj);
                this.LLIILZL.LIZJ(2);
                this.LLIILII.LIZ(2);
                this.LLIIIZ.LJI(2);
                return;
            }
            if (this.LLIIIZ != null) {
                InterfaceC51136K5c interfaceC51136K5c3 = this.LLILLIZIL;
                if (interfaceC51136K5c3 != null) {
                    interfaceC51136K5c3.setViewVisibility(8);
                }
                InterfaceC51136K5c interfaceC51136K5c4 = this.LLILLL;
                if (interfaceC51136K5c4 != null) {
                    interfaceC51136K5c4.setViewVisibility(0);
                }
                this.LLIIIZ.LJIIIIZZ(obj);
                K5O k5o4 = this.LLIILZL;
                if (k5o4 == null) {
                    Im(3);
                    return;
                }
                if (k5o4.LIZ() == 2 && TextUtils.equals(obj, this.LLIL.LIZ())) {
                    Im(3);
                    return;
                }
                this.LLIL.LIZJ(obj);
                this.LLIILZL.LIZJ(2);
                this.LLIILII.LIZ(2);
                this.LLIIIZ.LJI(2);
                Im(3);
                return;
            }
            Im(3);
            return;
        }
        if (!z && (k5m = this.LLIIIILZ) != null && (k5o = k5m.LIZ.LLIILZL) != null && k5o.LIZ() == 2 && this.LLIIIL != null) {
            InterfaceC51136K5c interfaceC51136K5c5 = this.LLILLIZIL;
            if (interfaceC51136K5c5 != null) {
                interfaceC51136K5c5.setViewVisibility(0);
            }
            InterfaceC51136K5c interfaceC51136K5c6 = this.LLILLL;
            if (interfaceC51136K5c6 != null) {
                interfaceC51136K5c6.setViewVisibility(8);
            }
            this.LLIIIL.LJIIIIZZ(obj);
            K5O k5o5 = this.LLIILZL;
            if (k5o5 == null) {
                return;
            }
            if (k5o5.LIZ() == 2 && TextUtils.equals(obj, this.LLIL.LIZ())) {
                return;
            }
            this.LLIL.LIZJ(obj);
            this.LLIILZL.LIZJ(2);
            this.LLIILII.LIZ(2);
            this.LLIIIL.LJI(2);
            return;
        }
        if (this.LLIIIL != null) {
            InterfaceC51136K5c interfaceC51136K5c7 = this.LLILLIZIL;
            if (interfaceC51136K5c7 != null) {
                interfaceC51136K5c7.setViewVisibility(0);
            }
            InterfaceC51136K5c interfaceC51136K5c8 = this.LLILLL;
            if (interfaceC51136K5c8 != null) {
                interfaceC51136K5c8.setViewVisibility(8);
            }
            this.LLIIIL.LJIIIIZZ(obj);
            K5O k5o6 = this.LLIILZL;
            if (k5o6 == null) {
                Im(3);
                return;
            }
            if (k5o6.LIZ() == 2 && TextUtils.equals(obj, this.LLIL.LIZ())) {
                Im(3);
                return;
            }
            this.LLIL.LIZJ(obj);
            this.LLIILZL.LIZJ(2);
            this.LLIILII.LIZ(2);
            this.LLIIIL.LJI(2);
            Im(3);
            return;
        }
        Im(3);
    }

    public final String Kl() {
        String defaultHintWord;
        String defaultHintWord2;
        if (mo49getActivity() != null) {
            C50650JuI fetchOwnImmutableData = C50652JuK.fetchOwnImmutableData(mo49getActivity());
            if (fetchOwnImmutableData != null && fetchOwnImmutableData.getSearchEcommerceModel() != null && (defaultHintWord2 = fetchOwnImmutableData.getSearchEcommerceModel().getDefaultHintWord()) != null) {
                return defaultHintWord2;
            }
            if (Ll() != null && (defaultHintWord = Ll().getDefaultHintWord()) != null) {
                return defaultHintWord;
            }
        }
        return C86V.LJFF(R.string.ju_);
    }

    public final ECSearchEntranceData Ll() {
        C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            return c50948Jz6.getEcSearchEntranceData();
        }
        return null;
    }

    public final String Ml() {
        C50948Jz6 c50948Jz6;
        if (mo49getActivity() != null && (c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL) != null) {
            return c50948Jz6.getEnterSearchFrom();
        }
        return "";
    }

    public final String Ol() {
        String enterFrom = getEnterFrom();
        C50321Joz fetchTopFragmentData = C50652JuK.fetchTopFragmentData(mo49getActivity());
        if (fetchTopFragmentData != null && !fetchTopFragmentData.getSearchPosition().isEmpty()) {
            return fetchTopFragmentData.getSearchPosition();
        }
        return enterFrom;
    }

    public void Xl() {
        mo49getActivity().getWindow().setSoftInputMode(50);
    }

    public void cm() {
        if (!K64.LIZ()) {
            C16880lQ.LJJJ(this.LJLLJ, new ACListenerS32S0101000_15(2, this, 8));
            C16880lQ.LJJJ(this.LJLJJLL, new ACListenerS26S0101000_8(1, this, 2));
            C16880lQ.LJJJ(this.LJLJLLL, new ACListenerS21S0101000_2(2, this, 4));
            this.LJLLILLLL.setOnTouchListener(new K5I(this));
            C16880lQ.LJJJ(this.LJLLLLLL, new ACListenerS22S0101000_3(2, this, 5));
        }
        C51142K5i c51142K5i = this.LLFFF;
        EditText editText = this.LJLJJL;
        c51142K5i.getClass();
        if (editText != null) {
            editText.addTextChangedListener(new IDObjectS180S0100000_8(c51142K5i, 5));
        }
        Jm(new C51157K5x(Kl()));
        this.LJLJJL.setHint(Kl());
        this.LJLJJL.setFilters(new InputFilter[]{new C27038AjK()});
        this.LJLJJL.addTextChangedListener(new IDObjectS180S0100000_8(this, 1));
        this.LJLJJL.setOnTouchListener(new IDTListenerS117S0100000_8(this, 10));
        this.LJLJJL.setOnEditorActionListener(new C51137K5d(this));
        if (mo49getActivity() != null) {
            ((LiveData) ((KeyboardModel) ViewModelProviders.of(mo49getActivity()).get(KeyboardModel.class)).LJLIL.getValue()).observe(mo49getActivity(), new AObserverS76S0100000_8(this, 28));
        }
    }

    public final boolean fm() {
        C50948Jz6 c50948Jz6;
        if (mo49getActivity() == null || (c50948Jz6 = JTO.LIZ(requireActivity()).LJLIL) == null) {
            return false;
        }
        return "1".equals(c50948Jz6.obtainLogData("is_from_video"));
    }

    public final boolean hm() {
        C50948Jz6 c50948Jz6;
        if (mo49getActivity() == null || (c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL) == null || !c50948Jz6.getLeftIcon() || !C53765L8f.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLILII = true;
        this.LLII = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), new C48690J9a()).LJJL(T16.LIZ()).LJJJJZI(new AfS39S0101000_13(4, this, 4));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LLILII = false;
        this.LLII = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS36S0101000_5(2, this, 7));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    private int Gl(int i) {
        if (getContext() != null && getContext().getResources() != null && getContext().getResources().getDisplayMetrics() != null) {
            return (int) ((i * getContext().getResources().getDisplayMetrics().density) + 0.5d);
        }
        return 0;
    }

    public static void mm(BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew) {
        if (baseDiscoverAndSearchFragmentNew.LLILII && baseDiscoverAndSearchFragmentNew.km()) {
            K65.LIZ.getClass();
            if (K65.LIZ()) {
                return;
            }
        }
        if (!baseDiscoverAndSearchFragmentNew.isViewValid()) {
            return;
        }
        try {
            baseDiscoverAndSearchFragmentNew.LJLJJL.requestFocus();
            baseDiscoverAndSearchFragmentNew.LJLJJL.setCursorVisible(true);
            KeyboardUtils.LIZLLL(baseDiscoverAndSearchFragmentNew.LJLJJL);
            C51160K6a.LIZ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void vl(BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew) {
        baseDiscoverAndSearchFragmentNew.LLFF.setBackToMiddle(true);
        baseDiscoverAndSearchFragmentNew.Rl();
    }

    public static void wl(BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew) {
        baseDiscoverAndSearchFragmentNew.LLFF.setBackToMiddle(true);
        baseDiscoverAndSearchFragmentNew.Rl();
    }

    public Boolean Al(SearchResultParam searchResultParam) {
        return Boolean.FALSE;
    }

    public final void Hm(String str) {
        String str2;
        EditText editText = this.LJLJJL;
        if (editText != null) {
            str2 = editText.getText().toString();
            if (TextUtils.isEmpty(str2)) {
                str2 = this.LJLJJL.getHint().toString();
            }
        } else {
            str2 = "";
        }
        K66 k66 = new K66();
        k66.LJIIZILJ("enter_method", str);
        k66.LJIIZILJ("search_keyword", str2);
        k66.LJIILIIL();
    }

    public void Im(int i) {
        this.LLFF.setSearchState(i);
        SearchStateData searchStateData = this.LLI;
        if (searchStateData.LJLIL == null) {
            searchStateData.LJLIL = new MutableLiveData<>();
        }
        MutableLiveData<Integer> mutableLiveData = searchStateData.LJLIL;
        o.LJII(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>");
        mutableLiveData.setValue(Integer.valueOf(i));
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            this.LJLLLL.setVisibility(4);
        } else {
            this.LJLLLL.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (kotlin.jvm.internal.o.LJ("1", r4) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jm(X.C51157K5x r7) {
        /*
            r6 = this;
            X.1qj r0 = r6.mo49getActivity()
            r4 = 0
            if (r0 == 0) goto Lc6
            X.1qj r0 = r6.mo49getActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = X.JTO.LIZ(r0)
            X.Jz6 r5 = r0.LJLIL
            X.1qj r0 = r6.mo49getActivity()
            X.JuI r1 = X.C50652JuK.fetchOwnImmutableData(r0)
            if (r5 == 0) goto Lc6
            if (r1 == 0) goto L36
            X.K5P r0 = r1.getSearchEcommerceModel()
            java.lang.String r0 = r0.getHintWord()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L36
            X.K5P r0 = r1.getSearchEcommerceModel()
            java.lang.String r0 = r0.getHintWord()
            r5.setSearchHint(r0)
        L36:
            java.lang.String r0 = r5.getSearchHint()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc6
            java.lang.String r0 = "hint_group_id"
            java.lang.Object r3 = r5.obtainLogData(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L52
            java.lang.String r3 = r5.getSearchHintWordId()
        L52:
            java.lang.String r0 = "hint_imp_id"
            java.lang.Object r1 = r5.obtainLogData(r0)
            java.lang.String r1 = (java.lang.String) r1
            X.K5x r2 = new X.K5x
            java.lang.String r0 = r5.getSearchHint()
            r2.<init>(r0, r3, r1)
        L63:
            X.1qj r0 = r6.mo49getActivity()
            X.JuI r3 = X.C50652JuK.fetchOwnImmutableData(r0)
            if (r3 == 0) goto L77
            X.Jqn r0 = r3.getSearchCommonModel()
            boolean r0 = r0.isFromVideoDetail()
            if (r0 == 0) goto L7e
        L77:
            if (r2 != 0) goto L7a
        L79:
            return
        L7a:
            r6.Km(r2)
            goto L79
        L7e:
            X.1qj r0 = r6.mo49getActivity()
            if (r0 != 0) goto L9e
        L84:
            X.Jqn r0 = r3.getSearchCommonModel()
            r0.getEnterFrom()
            X.1qj r0 = r6.mo49getActivity()
            X.Jz6 r0 = X.JTO.LIZIZ(r0)
            int r0 = X.KB1.LIZ(r0)
            boolean r0 = X.KB1.LJII(r0)
            if (r0 == 0) goto Lb9
            goto L77
        L9e:
            X.1qj r0 = r6.requireActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = X.JTO.LIZ(r0)
            X.Jz6 r1 = r0.LJLIL
            if (r1 == 0) goto Lb0
            java.lang.String r0 = "is_from_photo"
            java.lang.Object r4 = r1.obtainLogData(r0)
        Lb0:
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L84
            goto L77
        Lb9:
            boolean r0 = X.C50779JwN.LIZ()
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel r0 = r6.LLFZ
            boolean r0 = r0.LJLJJLL
            if (r0 == 0) goto L77
            goto L79
        Lc6:
            r2 = r4
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew.Jm(X.K5x):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        if (r3 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Km(X.C51157K5x r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.discover.model.suggest.Word r2 = new com.ss.android.ugc.aweme.discover.model.suggest.Word
            java.lang.String r1 = r7.LIZIZ
            java.lang.String r0 = r7.LIZ
            r2.<init>(r1, r0)
            r6.LLIZ = r2
            X.1qj r0 = r6.mo49getActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = X.JTO.LIZ(r0)
            X.Jz6 r3 = r0.LJLIL
            java.lang.String r5 = X.C50293JoX.LJI()
            if (r3 == 0) goto L41
            java.lang.String r1 = r3.getEnterSearchFrom()
            java.lang.String r0 = "homepage_friends"
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 != 0) goto L33
            java.lang.String r1 = r3.getEnterSearchFrom()
            java.lang.String r0 = "discovery"
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto Lcb
        L33:
            java.lang.String r4 = X.C50293JoX.LJ
        L35:
            java.lang.String r2 = defpackage.i0.LJFF(r5, r4)
            if (r2 == 0) goto L41
            int r0 = r2.length()
            if (r0 != 0) goto L82
        L41:
            android.widget.EditText r1 = r6.LJLJJL
            java.lang.String r0 = r7.LIZ
            r1.setHint(r0)
            if (r3 == 0) goto L78
        L4a:
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            if (r0 == 0) goto L78
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r6.LLIZ
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            java.lang.String r0 = r0.getId()
            r1.setId(r0)
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r6.LLIZ
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            int r0 = r0.getWordPosition()
            r1.setWordPosition(r0)
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r6.LLIZ
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            java.lang.String r0 = r0.getImplId()
            r1.setImplId(r0)
        L77:
            return
        L78:
            java.lang.String r1 = r7.LIZJ
            if (r1 == 0) goto L77
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r6.LLIZ
            r0.setImplId(r1)
            goto L77
        L82:
            java.util.Map<java.lang.String, X.JoY> r1 = X.C50293JoX.LIZ
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L41
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.get(r2)
            X.JoY r0 = (X.C50294JoY) r0
            if (r0 == 0) goto L41
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L41
            java.util.Map<java.lang.String, X.JoY> r2 = X.C50293JoX.LIZ
            java.lang.String r0 = defpackage.i0.LJFF(r5, r4)
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r1 = r2.get(r0)
            X.JoY r1 = (X.C50294JoY) r1
            java.lang.String r0 = r7.LIZ
            r1.LIZJ = r0
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            java.lang.Object r2 = r2.get(r0)
            X.JoY r2 = (X.C50294JoY) r2
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJIIL = r0
            goto L4a
        Lcb:
            java.lang.String r4 = r3.getGroupId()
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew.Km(X.K5x):void");
    }

    public final void Ql(boolean z) {
        if (z) {
            xm();
        } else {
            KeyboardUtils.LIZIZ(this.LJLJJL);
            this.LJLJJL.setCursorVisible(false);
        }
    }

    public void Tl(String str) {
        Vl(str, false);
    }

    public final boolean dm(String str) {
        int size = ((ArrayList) C50605JtZ.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, Kl())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLFF = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchStateViewModel.class);
        if (C49804Jge.LJJIZ()) {
            this.LLILZ = (SearchContainerHeaderVM) ViewModelProviders.of(mo49getActivity()).get(SearchContainerHeaderVM.class);
        }
        this.LLFFF = new C51142K5i();
        getArguments();
        this.LLI = (SearchStateData) ViewModelProviders.of(this).get(SearchStateData.class);
        this.LLFF.isLeavingSearchPage.observe(this, new AObserverS76S0100000_8(this, 84));
    }

    @QD3
    public void onSearchSugCompletionEvent(C178686zo c178686zo) {
        String str;
        if (isViewValid() && c178686zo != null && (str = c178686zo.LJLIL) != null && str.length() != 0) {
            if (lm()) {
                InterfaceC51136K5c interfaceC51136K5c = this.LLILLL;
                if (interfaceC51136K5c != null && interfaceC51136K5c.getViewVisibility() == 0) {
                    this.LJZI = true;
                    this.LJLJJL.setText(str);
                    this.LJLJJL.setSelection(str.length());
                    this.LJLJJL.setCursorVisible(true);
                    KeyboardUtils.LIZLLL(this.LJLJJL);
                    return;
                }
                return;
            }
            if (this.LLILLIZIL.getViewVisibility() != 0) {
                return;
            }
            this.LJZI = true;
            this.LJLJJL.setText(str);
            this.LJLJJL.setSelection(str.length());
            this.LJLJJL.setCursorVisible(true);
            KeyboardUtils.LIZLLL(this.LJLJJL);
        }
    }

    public void xl(View view) {
        int i;
        float LJIIZILJ;
        EnumC51135K5b enumC51135K5b;
        Context context;
        EnumC51135K5b enumC51135K5b2;
        int LJ;
        this.LJLLLL = (FrameLayout) view.findViewById(R.id.dm7);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.jg8);
        this.LLILL = viewStub;
        viewStub.setLayoutResource(R.layout.cgh);
        this.LLILL.inflate();
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(mo49getActivity())));
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZIZ() && LJII) {
            ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.jg7);
            this.LLILLJJLI = viewStub2;
            EcomSearchServiceImpl.LJJJJZI().LIZIZ();
            viewStub2.setLayoutResource(R.layout.aox);
            this.LLILLJJLI.inflate();
            this.LLILLL = (InterfaceC51136K5c) view.findViewById(R.id.jg6);
        }
        this.LLILLIZIL = (InterfaceC51136K5c) view.findViewById(R.id.jg5);
        int i2 = 0;
        if (K64.LIZ()) {
            K5T k5t = (K5T) view.findViewById(R.id.jec);
            this.LJLIL = k5t;
            k5t.setSearchBarHeight(EnumC51135K5b.HIGH);
            T5T editTextView = this.LJLIL.getEditTextView();
            this.LJLJJL = editTextView;
            if (editTextView != null) {
                h0.LJIJI(this.LJLJJL, new C74044T4e(getString(R.string.qbb)));
            }
            this.LJLIL.setOnClickClearListener(new ACListenerS21S0101000_2(0, this, 3));
            this.LJLIL.setEditBackgroundRadius(C32151Nz.LJIILLIIL(8));
            K5S k5s = new K5S();
            this.LLD = k5s;
            k5s.LIZJ(EnumC27399Ap9.SECONDARY);
            if (hm()) {
                this.LLD.LIZ(R.raw.icon_x_mark);
            } else {
                this.LLD.LIZ(R.raw.icon_arrow_left_ltr);
            }
            this.LLD.LIZIZ(Gl(6), 0, Gl(10), Gl(10));
            K5S k5s2 = this.LLD;
            ACListenerS29S0101000_12 aCListenerS29S0101000_12 = new ACListenerS29S0101000_12(1, this, 3);
            k5s2.LJFF = aCListenerS29S0101000_12;
            TuxIconView tuxIconView = k5s2.LJII;
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, aCListenerS29S0101000_12);
            }
            this.LJLIL.setStartAction(this.LLD);
            if (!K64.LIZIZ()) {
                K5U k5u = new K5U();
                this.LJLILLLLZI = k5u;
                k5u.LIZIZ(EnumC27399Ap9.PRIMARY);
                K5U k5u2 = this.LJLILLLLZI;
                String string = getString(R.string.qbb);
                k5u2.LJI = string;
                TuxTextView tuxTextView = k5u2.LJII;
                if (tuxTextView != null) {
                    tuxTextView.setText(string);
                }
                this.LJLILLLLZI.LIZ(Gl(0), 0, Gl(16), Gl(16));
                K5U k5u3 = this.LJLILLLLZI;
                ACListenerS29S0101000_12 aCListenerS29S0101000_122 = new ACListenerS29S0101000_12(2, this, 0);
                k5u3.LJFF = aCListenerS29S0101000_122;
                TuxTextView tuxTextView2 = k5u3.LJII;
                if (tuxTextView2 != null) {
                    C16880lQ.LJJJJI(tuxTextView2, aCListenerS29S0101000_122);
                }
                this.LJLIL.setEndAction(this.LJLILLLLZI);
            }
            if (C51111K4d.LIZLLL(KB1.LJII(KB1.LIZ(JTO.LIZIZ(mo49getActivity()))))) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_microphone_fill;
                c2068389v.LJ = Integer.valueOf(R.attr.gx);
                this.LJLIL.setInnerEmptyEndIcon(c2068389v);
                this.LJLIL.setOnClickInnerEmptyEndIcon(new IDCListenerS10S0101000(3, this, 0));
            }
            K5T k5t2 = this.LJLIL;
            try {
                FHD.LIZLLL().getClass();
                i = FHD.LJ(0, 0, "search_bar_use_radius", true);
            } catch (Throwable unused) {
                i = 0;
            }
            if (i != 1) {
                if (i != 2) {
                    LJIIZILJ = C32151Nz.LJIIZILJ(2);
                } else {
                    LJIIZILJ = C32151Nz.LJIIZILJ(100);
                }
            } else {
                LJIIZILJ = C32151Nz.LJIIZILJ(8);
            }
            k5t2.setEditBackgroundRadius(LJIIZILJ);
            try {
                FHD.LIZLLL().getClass();
                if (FHD.LJ(0, 0, "search_bar_remove_inner_start_icon", true) == 1) {
                    this.LJLIL.setHasInnerStartIcon(false);
                }
            } catch (Throwable unused2) {
            }
            K5T k5t3 = this.LJLIL;
            try {
                FHD.LIZLLL().getClass();
                LJ = FHD.LJ(0, 0, "search_bar_adjust_height", true);
            } catch (Throwable unused3) {
            }
            if (LJ != 1) {
                if (LJ == 2) {
                    enumC51135K5b = EnumC51135K5b.LOW;
                }
                enumC51135K5b = EnumC51135K5b.HIGH;
            } else {
                enumC51135K5b = EnumC51135K5b.MEDIUM;
            }
            k5t3.setSearchBarHeight(enumC51135K5b);
            if (!K64.LIZIZ() || (context = getContext()) == null) {
                return;
            }
            if (this.LJLJJI == null) {
                this.LJLJJI = new TuxIconView(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C32151Nz.LJIILLIIL(44), C32151Nz.LJIILLIIL(28));
                layoutParams.setMarginStart(C32151Nz.LJIILLIIL(6));
                try {
                    FHD.LIZLLL().getClass();
                    i2 = FHD.LJ(0, 0, "search_bar_adjust_height", true);
                } catch (Throwable unused4) {
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        enumC51135K5b2 = EnumC51135K5b.HIGH;
                    } else {
                        enumC51135K5b2 = EnumC51135K5b.LOW;
                    }
                } else {
                    enumC51135K5b2 = EnumC51135K5b.MEDIUM;
                }
                if (enumC51135K5b2 == EnumC51135K5b.HIGH) {
                    layoutParams.setMarginEnd(C32151Nz.LJIILLIIL(6));
                } else {
                    layoutParams.setMarginEnd(C32151Nz.LJIILLIIL(4));
                }
                this.LJLJJI.setLayoutParams(layoutParams);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(100);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
                this.LJLJJI.setBackground(c110614Vt.LIZ(context));
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZIZ = C32151Nz.LJIILLIIL(18);
                c2068389v2.LIZJ = C32151Nz.LJIILLIIL(18);
                c2068389v2.LIZ = R.raw.icon_magnifying_glass_fill;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                this.LJLJJI.setTuxIcon(c2068389v2);
                C16880lQ.LJJJ(this.LJLJJI, new ACListenerS29S0101000_12(3, this, 4));
                C78897Uxp.LJJJJJL(this.LJLJJI, 100.0f);
            }
            this.LJLIL.setCtaView(this.LJLJJI);
            return;
        }
        this.LJLLLLLL = (TuxIconView) view.findViewById(R.id.ay7);
        EditText editText = (EditText) view.findViewById(R.id.czy);
        this.LJLJJL = editText;
        editText.setInputType(524289);
        if (this.LJLJJL != null) {
            h0.LJIJI(this.LJLJJL, new C74044T4e(getString(R.string.qbb)));
        }
        C51171K6l.LIZ.getClass();
        if ((C51171K6l.LIZ() == 1 || C51171K6l.LIZ() == 3) && DR0.LIZ()) {
            this.LJLLLLLL.setIconRes(R.raw.icon_scan);
            this.LJLLLLLL.setIconWidth(Gl(20));
            this.LJLLLLLL.setIconHeight(Gl(20));
            this.LJLLLLLL.setTintColorRes(R.attr.go);
            this.LJLLLLLL.setVisibility(0);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", Ml());
            c188727au.LJIIIZ("action_type", "show");
            FMX.LJIIL("scan_icon", c188727au.LIZ);
        }
        this.LJLJJLL = (TuxIconView) view.findViewById(R.id.avi);
        this.LJLLL = (ImageView) view.findViewById(R.id.b4e);
        this.LJLJL = (LinearLayout) view.findViewById(R.id.g52);
        view.findViewById(R.id.g51);
        this.LJLJLLL = (TuxIconView) view.findViewById(R.id.b0c);
        this.LJLL = (ViewGroup) view.findViewById(R.id.e5z);
        if (C51111K4d.LIZLLL(KB1.LJII(KB1.LIZ(JTO.LIZIZ(mo49getActivity()))))) {
            this.LJLJLLL.setVisibility(0);
        }
        this.LJLLI = view.findViewById(R.id.jid);
        TextView textView = (TextView) view.findViewById(R.id.mj5);
        this.LJLLILLLL = textView;
        if (textView != null) {
            h0.LJIJI(textView, new IDaS90S0000000_4(3));
        }
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.aek);
        this.LJLLJ = tuxIconView2;
        tuxIconView2.setContentDescription(getString(R.string.aub));
    }

    public void zm(boolean z) {
        EnumC51264KAa enumC51264KAa;
        if (z) {
            enumC51264KAa = EnumC51264KAa.BACK;
        } else {
            enumC51264KAa = null;
        }
        Z9N.LIZIZ.LJJLIIIJJI(enumC51264KAa);
    }

    public final void Cm(Context context, SearchResultParam searchResultParam) {
        Z9N.LIZIZ.LLFF(context, searchResultParam);
        if (Al(searchResultParam).booleanValue()) {
            Nm();
        }
        ym(searchResultParam, false);
        KeyboardUtils.LIZIZ(this.LJLJJL);
    }

    public final void Mm(boolean z, boolean z2) {
        K6D k6d;
        if (this.LJLJI == null) {
            K5S k5s = new K5S();
            this.LJLJI = k5s;
            k5s.LIZJ(EnumC27399Ap9.SECONDARY);
            this.LJLJI.LIZ(R.raw.icon_control);
            this.LJLJI.LIZIZ(Gl(0), 0, Gl(16), Gl(16));
            K5S k5s2 = this.LJLJI;
            ACListenerS26S0101000_8 aCListenerS26S0101000_8 = new ACListenerS26S0101000_8(2, this, 3);
            k5s2.LJFF = aCListenerS26S0101000_8;
            TuxIconView tuxIconView = k5s2.LJII;
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, aCListenerS26S0101000_8);
            }
        }
        K5U k5u = null;
        if (z) {
            if (z2) {
                k6d = this.LJLJI;
            } else {
                k6d = null;
            }
            this.LJLIL.setCtaView(null);
        } else {
            if (!K64.LIZIZ()) {
                k5u = this.LJLILLLLZI;
            }
            this.LJLIL.setCtaView(this.LJLJJI);
            k6d = k5u;
        }
        this.LJLIL.setEndAction(k6d);
    }

    public final SearchResultParam Pl(String str, boolean z) {
        String str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setKeyword(str);
        if (Jl() == 3) {
            if (z) {
                str2 = "default_search_keyword";
            } else {
                str2 = "normal_search";
            }
        } else {
            str2 = "click_topright_search";
        }
        searchResultParam.setSearchFrom(str2);
        searchResultParam.setOpenNewSearchContainer(atomicBoolean.get());
        return searchResultParam;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Vl(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew.Vl(java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InterfaceC51136K5c interfaceC51136K5c;
        super.onViewCreated(view, bundle);
        Nl();
        Im(7);
        this.LLILLIZIL.LIZLLL(this, this.LLIIIILZ, new AObjectS146S0100000_8(this, 1));
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(mo49getActivity())));
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZIZ() && LJII && (interfaceC51136K5c = this.LLILLL) != null) {
            interfaceC51136K5c.LIZLLL(this, this.LLIIIILZ, new AObjectS146S0100000_8(this, 2));
        }
        cm();
        Wl();
        Zl();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (a.LJIJJ().LJ(null) && mo49getActivity != null && !mo49getActivity.isFinishing()) {
            a.LJIJJ().LJIIJ(mo49getActivity, "deeplink");
        }
        Yl();
        Xl();
    }

    public void ym(SearchResultParam searchResultParam, boolean z) {
        Z9N.LIZIZ.LLLIILIL();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZJ = C16970lZ.LIZJ(getLayout(), mo49getActivity(), viewGroup, false);
        xl(LIZJ);
        C29S c29s = null;
        if (!(LIZJ instanceof View)) {
            LIZJ = null;
        }
        if (LIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZJ, this);
                C10A.LIZIZ(LIZJ, this);
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
        return LIZJ;
    }
}
