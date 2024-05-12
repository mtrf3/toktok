package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.keywords;

import X.C26045AKb;
import X.C61878OQg;
import X.C63024OoO;
import X.InterfaceC71924SKq;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes13.dex */
public final class KeyWordsViewModel extends ViewModel {
    public WeakReference<Activity> LJLIL;
    public final MutableLiveData<Integer> LJLILLLLZI;
    public int LJLJI;
    public List<String> LJLJJI;
    public InterfaceC71924SKq LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    public KeyWordsViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Integer.valueOf(C63024OoO.LIZ()));
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = C63024OoO.LIZ();
        this.LJLJJI = C61878OQg.INSTANCE;
    }

    public static final void gv0(KeyWordsViewModel keyWordsViewModel, String str) {
        Activity activity;
        WeakReference<Activity> weakReference = keyWordsViewModel.LJLIL;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            if (!TextUtils.isEmpty(str)) {
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJ(R.style.ul);
                c26045AKb.LIZ(true);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
                return;
            }
            C26045AKb c26045AKb2 = new C26045AKb(activity);
            c26045AKb2.LJ(R.style.ul);
            c26045AKb2.LIZ(true);
            c26045AKb2.LJIIIIZZ(R.string.djz);
            c26045AKb2.LJIIJ();
        }
    }
}
