package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C17N;
import X.C207668Da;
import X.C5S1;
import X.C78685UuP;
import X.C80647Vkx;
import X.J9P;
import X.XVI;
import X.XYC;
import Y.ARunnableS12S0301000_12;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class NewMusicTabFragment extends BaseNewMusicTabFragment {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final Map<Integer, View> LLILLIZIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void Il() {
        C80647Vkx c80647Vkx = this.LJLJJL;
        if (c80647Vkx == null) {
            return;
        }
        c80647Vkx.setTabsMarginTop(C17N.LJIILL(44));
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void Ql() {
        MusicService.LJJLIIIJJI().LJ();
        J9P.LIZJ(this, "", "click_my_music", null, null);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLILLIZIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void Ll(C207668Da kvData) {
        MutableLiveData<Integer> gv0;
        View childAt;
        MutableLiveData<Integer> gv02;
        String str;
        MusicModel value;
        o.LJIIIZ(kvData, "kvData");
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof ChooseMusicFragment) && ((BaseChooseMusicFragment) parentFragment).LJLJJLL) {
            return;
        }
        Object obj = kvData.LIZIZ;
        SelectedMusicViewModel selectedMusicViewModel = null;
        if (obj == null) {
            obj = null;
        }
        XYC xyc = (XYC) obj;
        int i = xyc.LIZLLL;
        MusicModel musicModel = xyc.LJ;
        int i2 = xyc.LIZ;
        SelectedMusicViewModel selectedMusicViewModel2 = XVI.LIZIZ;
        if (selectedMusicViewModel2 != null) {
            MutableLiveData<MusicModel> hv0 = selectedMusicViewModel2.hv0();
            if (hv0 != null && (value = hv0.getValue()) != null) {
                str = value.getMusicId();
            } else {
                str = null;
            }
            if (o.LJ(str, musicModel.getMusicId())) {
                selectedMusicViewModel = selectedMusicViewModel2;
            }
        }
        if (i2 == 0) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                if (this.LJLJI != null && !this.LLILIL.LIZJ("added_to_favorites_show_once", false) && (childAt = ((ViewGroup) this.LJLJI.getChildAt(0)).getChildAt(1)) != null) {
                    childAt.post(new ARunnableS12S0301000_12(1, this, childAt, musicModel, 3));
                }
                if (selectedMusicViewModel == null || (gv02 = selectedMusicViewModel.gv0()) == null) {
                    return;
                }
                gv02.postValue(0);
                return;
            }
            C5S1 c5s1 = new C5S1(mo49getActivity());
            c5s1.LIZJ(R.string.cge);
            c5s1.LJ();
            if (selectedMusicViewModel == null || (gv0 = selectedMusicViewModel.gv0()) == null) {
                return;
            }
            gv0.postValue(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void Pl(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        linearLayout.setShowDividers(0);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment
    public final void Gl(Intent intent, MusicModel musicModel) {
        if (musicModel == null || musicModel.getSearchId() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Sl("music_search_id", musicModel.getSearchId(), hashMap);
        if (C78685UuP.LJJJZ(musicModel.getSearchResultId())) {
            Sl("music_search_result_id", musicModel.getSearchResultId(), hashMap);
        } else {
            Sl("music_search_result_id", musicModel.getMusicId(), hashMap);
        }
        Sl("music_list_item_id", musicModel.getListItemId(), hashMap);
        intent.putExtra("extra_log_params", hashMap);
    }

    public static final void Sl(String str, String str2, HashMap hashMap) {
        if (str2 != null && str2.length() > 0) {
            hashMap.put(str, str2);
        }
    }
}
