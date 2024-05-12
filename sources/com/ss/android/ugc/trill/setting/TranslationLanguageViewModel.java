package com.ss.android.ugc.trill.setting;

import X.ABA;
import X.C770830u;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class TranslationLanguageViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ABA>> LJLIL;
    public final TranslationLanguageApi LJLILLLLZI;

    public TranslationLanguageViewModel() {
        TranslationLanguageApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = Api.LIZ;
        this.LJLILLLLZI = (TranslationLanguageApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(TranslationLanguageApi.class);
    }
}
