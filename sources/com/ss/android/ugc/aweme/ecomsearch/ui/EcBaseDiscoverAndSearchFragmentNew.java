package com.ss.android.ugc.aweme.ecomsearch.ui;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C1I0;
import X.C27038AjK;
import X.C29S;
import X.C3C5;
import X.C50321Joz;
import X.C50652JuK;
import X.C50948Jz6;
import X.C51163K6d;
import X.C51186K7a;
import X.C51187K7b;
import X.C51188K7c;
import X.C51189K7d;
import X.C51190K7e;
import X.C51192K7g;
import X.C51201K7p;
import X.C51205K7t;
import X.C51207K7v;
import X.C51208K7w;
import X.C51214K8c;
import X.C51253K9p;
import X.C73411SrX;
import X.C76800UCe;
import X.C84763XOl;
import X.C86V;
import X.C90903hW;
import X.EnumC51264KAa;
import X.InterfaceC51136K5c;
import X.InterfaceC51158K5y;
import X.JTO;
import X.K0D;
import X.K4W;
import X.K5R;
import X.K7U;
import X.K7V;
import X.K7X;
import X.K7Y;
import X.LO7;
import X.QD3;
import X.T16;
import X.T5T;
import X.Z9N;
import Y.ACListenerS26S0101000_8;
import Y.AObjectS146S0100000_8;
import Y.AObserverS62S0101000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS13S0101000_9;
import Y.AfS36S0101000_5;
import Y.IDObjectS180S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.model.EcKeyboardModel;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStateData;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public abstract class EcBaseDiscoverAndSearchFragmentNew extends AmeBaseFragment {
    public static final /* synthetic */ int LLIILII = 0;
    public LinearLayout LJLIL;
    public View LJLILLLLZI;
    public T5T LJLJI;
    public TuxIconView LJLJJI;
    public TextView LJLJJL;
    public TuxIconView LJLJJLL;
    public ImageView LJLJL;
    public FrameLayout LJLJLJ;
    public InterfaceC51136K5c LJLJLLL;
    public SmartImageView LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL = true;
    public ViewStub LJLLJ;
    public SearchStateViewModel LJLLL;
    public C51192K7g LJLLLL;
    public String LJLLLLLL;
    public EcSearchStartViewModel LJLZ;
    public ViewGroup LJZ;
    public C51163K6d LJZI;
    public EcSearchStateData LJZL;
    public boolean LL;
    public C73411SrX LLD;
    public SearchResultParam LLF;
    public K7U LLFF;
    public K7Y LLFFF;
    public InterfaceC51158K5y LLFII;
    public C51189K7d LLFZ;
    public C51190K7e LLI;
    public K7V LLIFFJFJJ;
    public C51207K7v LLII;
    public K7X LLIIII;
    public C51188K7c LLIIIILZ;
    public K5R LLIIIJ;
    public K0D LLIIIL;
    public SugKeywordPresenter LLIIIZ;
    public long LLIIJI;
    public String LLIIJLIL;
    public Word LLIIL;

    public boolean Al() {
        return false;
    }

    public boolean Dl() {
        return true;
    }

    public void Gl() {
    }

    public abstract void Jl();

    public abstract void Nl();

    public abstract void Ql();

    public abstract void Sl();

    public void Tl() {
    }

    public void Zl() {
    }

    public abstract void dm(boolean z);

    public abstract String getEnterFrom();

    public abstract int getLayout();

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public void lm(String str) {
    }

    public abstract void mm();

    public void wl(SearchResultParam searchResultParam) {
    }

    public void xl() {
    }

    public final int Hl() {
        Integer value = this.LJLLL.searchState.getValue();
        if (value == null) {
            Jl();
            return 7;
        }
        return value.intValue();
    }

    public void Vl() {
        C16880lQ.LJJJ(this.LJLJJLL, new ACListenerS26S0101000_8(1, this, 0));
        C16880lQ.LJJJ(this.LJLJJI, new ACListenerS26S0101000_8(1, this, 1));
        this.LJLJJL.setOnTouchListener(new C51187K7b(this));
        C51192K7g c51192K7g = this.LJLLLL;
        T5T t5t = this.LJLJI;
        c51192K7g.getClass();
        if (t5t != null) {
            t5t.addTextChangedListener(new IDObjectS180S0100000_8(c51192K7g, 6));
        }
        pm(new C51201K7p(Il()));
        this.LJLJI.setHint(Il());
        this.LJLJI.setFilters(new InputFilter[]{new C27038AjK()});
        this.LJLJI.addTextChangedListener(new IDObjectS180S0100000_8(this, 0));
        this.LJLJI.setOnTouchListener(new IDTListenerS117S0100000_8(this, 14));
        this.LJLJI.setOnEditorActionListener(new C51186K7a(this));
        if (mo49getActivity() != null) {
            ((LiveData) ((EcKeyboardModel) ViewModelProviders.of(mo49getActivity()).get(EcKeyboardModel.class)).LJLIL.getValue()).observe(mo49getActivity(), new AObserverS76S0100000_8(this, 15));
        }
    }

    public final boolean Xl() {
        if ("homepage_follow".equals(getEnterFrom()) || "homepage_hot".equals(getEnterFrom()) || "homepage_friends".equals(getEnterFrom()) || "homepage_popular".equals(getEnterFrom()) || "homepage_nearby".equals(getEnterFrom()) || "homepage_explore".equals(getEnterFrom()) || LO7.LIZIZ.J1(getEnterFrom())) {
            return true;
        }
        return false;
    }

    public void cm() {
        new Handler().postDelayed(new ARunnableS12S0101000_8(0, this, 27), 800L);
    }

    public final void em() {
        this.LJLJI.postDelayed(new ARunnableS13S0101000_9(1, this, 1), 0L);
    }

    public final String Il() {
        C50948Jz6 c50948Jz6;
        String defaultHintWord;
        if (mo49getActivity() != null && (c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL) != null && c50948Jz6.getEcSearchEntranceData() != null && (defaultHintWord = c50948Jz6.getEcSearchEntranceData().getDefaultHintWord()) != null) {
            return defaultHintWord;
        }
        return C86V.LJFF(R.string.ju_);
    }

    public final String Kl() {
        String enterFrom = getEnterFrom();
        C50321Joz fetchTopFragmentData = C50652JuK.fetchTopFragmentData(mo49getActivity());
        if (fetchTopFragmentData != null && !fetchTopFragmentData.getSearchPosition().isEmpty()) {
            return fetchTopFragmentData.getSearchPosition();
        }
        return enterFrom;
    }

    public void Rl() {
        mo49getActivity().getWindow().setSoftInputMode(50);
    }

    public final boolean Yl() {
        C50948Jz6 c50948Jz6;
        if (mo49getActivity() == null || (c50948Jz6 = JTO.LIZ(requireActivity()).LJLIL) == null) {
            return false;
        }
        return "1".equals(c50948Jz6.obtainLogData("is_from_video"));
    }

    public void km() {
        K7U k7u;
        K7X k7x;
        InterfaceC51158K5y interfaceC51158K5y;
        if (!Dl()) {
            return;
        }
        Gl();
        Z9N.LIZIZ.LLLIILIL();
        String obj = this.LJLJI.getText().toString();
        if (this.LLIIIL != null && !obj.isEmpty()) {
            this.LLIIIL.LIZIZ = obj;
        }
        int selectionStart = this.LJLJI.getSelectionStart();
        if (this.LJLLI) {
            selectionStart = this.LJLJI.getText().length();
        }
        K4W.LJ = selectionStart;
        boolean z = false;
        this.LJLLI = false;
        K5R k5r = this.LLIIIJ;
        if (k5r != null && k5r.LIZJ) {
            z = true;
            xl();
        }
        if (!z && (k7u = this.LLFF) != null && (k7x = k7u.LIZ.LLIIII) != null && k7x.LIZ() == 2 && (interfaceC51158K5y = this.LLFII) != null) {
            interfaceC51158K5y.LJIIIIZZ(obj);
            K7X k7x2 = this.LLIIII;
            if (k7x2 == null) {
                return;
            }
            if (k7x2.LIZ() == 2 && TextUtils.equals(obj, this.LLIIIZ.LIZ())) {
                return;
            }
            this.LLIIIZ.LIZJ(obj);
            this.LLIIII.LIZJ(2);
            this.LLII.LIZ(2);
            this.LLFII.LJI(2);
            return;
        }
        InterfaceC51158K5y interfaceC51158K5y2 = this.LLFII;
        if (interfaceC51158K5y2 != null) {
            interfaceC51158K5y2.LJIIIIZZ(obj);
            K7X k7x3 = this.LLIIII;
            if (k7x3 == null) {
                om(3);
                return;
            }
            if (k7x3.LIZ() == 2 && TextUtils.equals(obj, this.LLIIIZ.LIZ())) {
                om(3);
                return;
            }
            this.LLIIIZ.LIZJ(obj);
            this.LLIIII.LIZJ(2);
            this.LLII.LIZ(2);
            this.LLFII.LJI(2);
            om(3);
            return;
        }
        om(3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLD = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), new C1I0()).LJJL(T16.LIZ()).LJJJJZI(new AfS36S0101000_5(1, this, 11));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LLD = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS36S0101000_5(3, this, 2));
    }

    public void Ml() {
        K4W.LIZ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public final void Ll(boolean z) {
        if (z) {
            em();
        } else {
            KeyboardUtils.LIZIZ(this.LJLJI);
            this.LJLJI.setCursorVisible(false);
        }
    }

    public void Ol(String str) {
        Pl(str, false);
    }

    public final boolean Wl(String str) {
        int size = ((ArrayList) C51214K8c.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, Il())) {
                return true;
            }
        }
        return false;
    }

    public void hm(boolean z) {
        EnumC51264KAa enumC51264KAa;
        if (z) {
            enumC51264KAa = EnumC51264KAa.BACK;
        } else {
            enumC51264KAa = null;
        }
        C51253K9p.LIZ.LIZLLL(enumC51264KAa);
    }

    public final void nm(String str) {
        String str2;
        T5T t5t = this.LJLJI;
        if (t5t != null) {
            str2 = t5t.getText().toString();
            if (TextUtils.isEmpty(str2)) {
                str2 = this.LJLJI.getHint().toString();
            }
        } else {
            str2 = "";
        }
        C51205K7t c51205K7t = new C51205K7t();
        c51205K7t.LJIILL("enter_method", str);
        c51205K7t.LJIILL("search_keyword", str2);
        c51205K7t.LJIILIIL();
    }

    public final void om(int i) {
        this.LJLLL.setSearchState(i);
        EcSearchStateData ecSearchStateData = this.LJZL;
        if (ecSearchStateData.LJLIL == null) {
            ecSearchStateData.LJLIL = new MutableLiveData<>();
        }
        MutableLiveData<Integer> mutableLiveData = ecSearchStateData.LJLIL;
        o.LJII(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>");
        mutableLiveData.setValue(Integer.valueOf(i));
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            this.LJLJLJ.setVisibility(4);
            this.LJLL.setVisibility(4);
        } else {
            this.LJLJLJ.setVisibility(0);
            if (!SearchStateViewModel.isSearchResult(i)) {
                return;
            }
            this.LJLL.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLLL = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity()).get(SearchStateViewModel.class);
        this.LJLLLL = new C51192K7g();
        getArguments();
        this.LJZL = (EcSearchStateData) ViewModelProviders.of(this).get(EcSearchStateData.class);
        this.LJLLL.isLeavingSearchPage.observe(this, new AObserverS62S0101000_8(0, this, 1));
    }

    @QD3
    public void onSearchSugCompletionEvent(C51208K7w c51208K7w) {
        String str;
        if (isViewValid() && c51208K7w != null && (str = c51208K7w.LJLIL) != null && str.length() != 0 && this.LJLJLLL.getViewVisibility() == 0) {
            this.LJLLI = true;
            this.LJLJI.setText(str);
            this.LJLJI.setSelection(str.length());
            this.LJLJI.setCursorVisible(true);
            KeyboardUtils.LIZLLL(this.LJLJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pm(X.C51201K7p r6) {
        /*
            r5 = this;
            X.1qj r0 = r5.mo49getActivity()
            if (r0 == 0) goto L7a
            X.1qj r0 = r5.mo49getActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = X.JTO.LIZ(r0)
            X.Jz6 r4 = r0.LJLIL
            X.1qj r0 = r5.mo49getActivity()
            X.JuI r1 = X.C50652JuK.fetchOwnImmutableData(r0)
            if (r4 == 0) goto L7a
            if (r1 == 0) goto L35
            X.K5P r0 = r1.getSearchEcommerceModel()
            java.lang.String r0 = r0.getHintWord()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L35
            X.K5P r0 = r1.getSearchEcommerceModel()
            java.lang.String r0 = r0.getHintWord()
            r4.setSearchHint(r0)
        L35:
            java.lang.String r0 = r4.getSearchHint()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "hint_group_id"
            java.lang.Object r3 = r4.obtainLogData(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L51
            java.lang.String r3 = r4.getSearchHintWordId()
        L51:
            java.lang.String r0 = "hint_imp_id"
            java.lang.Object r2 = r4.obtainLogData(r0)
            java.lang.String r2 = (java.lang.String) r2
            X.K7p r1 = new X.K7p
            java.lang.String r0 = r4.getSearchHint()
            r1.<init>(r0, r3, r2)
        L62:
            X.1qj r0 = r5.mo49getActivity()
            X.JuI r0 = X.C50652JuK.fetchOwnImmutableData(r0)
            if (r0 == 0) goto L73
            X.Jqn r0 = r0.getSearchCommonModel()
            r0.isFromVideoDetail()
        L73:
            if (r1 != 0) goto L76
        L75:
            return
        L76:
            r5.qm(r1)
            goto L75
        L7a:
            r1 = 0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew.pm(X.K7p):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        if (r3 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qm(X.C51201K7p r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.discover.model.suggest.Word r2 = new com.ss.android.ugc.aweme.discover.model.suggest.Word
            java.lang.String r1 = r7.LIZIZ
            java.lang.String r0 = r7.LIZ
            r2.<init>(r1, r0)
            r6.LLIIL = r2
            X.1qj r0 = r6.mo49getActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterViewModel r0 = X.JTO.LIZ(r0)
            X.Jz6 r3 = r0.LJLIL
            java.lang.String r5 = X.C51249K9l.LJ()
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
            java.lang.String r4 = X.C51249K9l.LJFF
        L35:
            java.lang.String r2 = defpackage.i0.LJFF(r5, r4)
            if (r2 == 0) goto L41
            int r0 = r2.length()
            if (r0 != 0) goto L82
        L41:
            X.T5T r1 = r6.LJLJI
            java.lang.String r0 = r7.LIZ
            r1.setHint(r0)
            if (r3 == 0) goto L78
        L4a:
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            if (r0 == 0) goto L78
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r6.LLIIL
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            java.lang.String r0 = r0.getId()
            r1.setId(r0)
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r6.LLIIL
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            int r0 = r0.getWordPosition()
            r1.setWordPosition(r0)
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r6.LLIIL
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r3.getInboxWord()
            java.lang.String r0 = r0.getImplId()
            r1.setImplId(r0)
        L77:
            return
        L78:
            java.lang.String r1 = r7.LIZJ
            if (r1 == 0) goto L77
            com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = r6.LLIIL
            r0.setImplId(r1)
            goto L77
        L82:
            java.util.Map<java.lang.String, X.JoZ> r1 = X.C51249K9l.LIZIZ
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L41
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.get(r2)
            X.JoZ r0 = (X.C50295JoZ) r0
            if (r0 == 0) goto L41
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L41
            java.util.Map<java.lang.String, X.JoZ> r2 = X.C51249K9l.LIZIZ
            java.lang.String r0 = defpackage.i0.LJFF(r5, r4)
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r1 = r2.get(r0)
            X.JoZ r1 = (X.C50295JoZ) r1
            java.lang.String r0 = r7.LIZ
            r1.LIZJ = r0
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            java.lang.Object r2 = r2.get(r0)
            X.JoZ r2 = (X.C50295JoZ) r2
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJIIJ = r0
            goto L4a
        Lcb:
            java.lang.String r4 = r3.getGroupId()
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew.qm(X.K7p):void");
    }

    public void vl(View view) {
        this.LJLJLJ = (FrameLayout) view.findViewById(R.id.dm7);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.jg8);
        this.LJLLJ = viewStub;
        viewStub.setLayoutResource(R.layout.aox);
        this.LJLLJ.inflate();
        this.LJLJLLL = (InterfaceC51136K5c) view.findViewById(R.id.jg6);
        this.LJLL = (SmartImageView) mo49getActivity().findViewById(R.id.bs_);
        T5T t5t = (T5T) view.findViewById(R.id.jf6);
        this.LJLJI = t5t;
        t5t.setInputType(524289);
        this.LJLJJI = (TuxIconView) view.findViewById(R.id.avi);
        this.LJLJJL = (TextView) view.findViewById(R.id.mj5);
        this.LJLJJLL = (TuxIconView) view.findViewById(R.id.aek);
        this.LJLJL = (ImageView) view.findViewById(R.id.b4e);
        this.LJZ = (ViewGroup) view.findViewById(R.id.e5z);
        this.LJLIL = (LinearLayout) view.findViewById(R.id.g52);
        view.findViewById(R.id.g51);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pl(java.lang.String r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew.Pl(java.lang.String, boolean):void");
    }

    public void fm(SearchResultParam searchResultParam, boolean z) {
        Z9N.LIZIZ.LLLIILIL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Jl();
        om(7);
        this.LJLJLLL.LIZLLL(this, this.LLFF, new AObjectS146S0100000_8(this, 3));
        Vl();
        Ql();
        Tl();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (a.LJIJJ().LJ(null) && mo49getActivity != null && !mo49getActivity.isFinishing()) {
            a.LJIJJ().LJIIJ(mo49getActivity, "deeplink");
        }
        Sl();
        Rl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZJ = C16970lZ.LIZJ(getLayout(), mo49getActivity(), viewGroup, false);
        vl(LIZJ);
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
