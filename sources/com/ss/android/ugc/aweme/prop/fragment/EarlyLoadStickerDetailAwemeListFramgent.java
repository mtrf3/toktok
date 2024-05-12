package com.ss.android.ugc.aweme.prop.fragment;

import X.ActivityC45651qj;
import X.C2NU;
import X.C40328FsC;
import X.C51031K1b;
import X.C56492MFc;
import X.C56538MGw;
import X.C88531Yop;
import X.MGU;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class EarlyLoadStickerDetailAwemeListFramgent extends StickerDetailAwemeListFramgent {
    public static final /* synthetic */ int LLILZLL = 0;
    public final Map<Integer, View> LLILZIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void Ql() {
        C56538MGw c56538MGw;
        MutableLiveData mutableLiveData;
        C56492MFc c56492MFc = this.LLIILII.get(this.LJLILLLLZI);
        this.LLD = c56492MFc;
        if (c56492MFc == null) {
            C56492MFc c56492MFc2 = new C56492MFc(this.LJLJI, this, this, this.LLILLIZIL, getArguments());
            this.LLD = c56492MFc2;
            c56492MFc2.setLoadMoreListener(this);
            C56492MFc c56492MFc3 = this.LLD;
            c56492MFc3.mmLabel = "detail_list";
            c56492MFc3.LJLJL = this.LLIIJI;
            this.LLIILII.put(this.LJLILLLLZI, c56492MFc3);
        }
        this.LJZ.setAdapter(this.LLD);
        this.LLD.LJLJL = this.LLIIJI;
        mo49getActivity();
        if (C2NU.LIZ.LIZIZ()) {
            C51031K1b c51031K1b = this.LLIIL.get(this.LJLILLLLZI);
            if (c51031K1b instanceof C56538MGw) {
                c56538MGw = (C56538MGw) c51031K1b;
            } else {
                c56538MGw = null;
            }
            MGU mgu = new MGU(this);
            if (c56538MGw != null && (mutableLiveData = c56538MGw.LJLJJLL) != null) {
                mutableLiveData.observe(this, new C88531Yop(mgu));
                return;
            }
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C40328FsC.LIZLLL(mo49getActivity, R.string.img);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
