package com.ss.android.ugc.aweme.ecommerce.search.suggest;

import X.C2K0;
import X.C51254K9q;
import X.KA7;
import X.KAU;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* loaded from: classes9.dex */
public interface ISearchSuggestContextAbility extends C2K0 {
    boolean B3();

    C51254K9q Fm0();

    void G0(String str);

    void LJJIL(SearchResultParam searchResultParam);

    void LLLFFI(boolean z);

    int LLLZLL();

    EditText R9();

    void V2(Word word);

    String f1();

    Fragment getFragment();

    FragmentManager getFragmentManager();

    KAU getPageState();

    KA7 u9();
}
