package com.ss.android.ugc.aweme.contentlanguage;

import X.AF0;
import X.C38987FRv;
import X.C45804HyK;
import X.C55511LqV;
import X.C58096Mr6;
import X.C63081OpJ;
import X.EJB;
import X.EUJ;
import X.FKM;
import X.FR4;
import X.InterfaceC55381LoP;
import X.LNZ;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.aweme.storage.StorageCleanServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public class ContentLanguageServiceImpl implements IContentLanguageService {
    public final InterfaceC55381LoP LIZ = LNZ.LIZIZ.getUnloginSignUpUtils();
    public List<String> LIZIZ = null;

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LJIIIZ() {
        this.LIZIZ = null;
        this.LIZIZ = new ArrayList();
        String LIZ = SharePrefCache.inst().getUserAddLanguages().LIZ();
        if (!TextUtils.isEmpty(LIZ)) {
            this.LIZIZ.addAll(Arrays.asList(LIZ.split(",")));
        }
    }

    public static IContentLanguageService LJIIJJI() {
        StorageCleanServiceImpl storageCleanServiceImpl = C58096Mr6.LIZ;
        Object LIZ = C58096Mr6.LIZ(IContentLanguageService.class, false);
        if (LIZ != null) {
            return (IContentLanguageService) LIZ;
        }
        if (C58096Mr6.l == null) {
            synchronized (IContentLanguageService.class) {
                if (C58096Mr6.l == null) {
                    C58096Mr6.l = new ContentLanguageServiceImpl();
                }
            }
        }
        return C58096Mr6.l;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final String LIZJ() {
        return LNZ.LIZIZ.getUnloginSignUpUtils().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final List<String> getLanguage() {
        return this.LIZ.getLanguage();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final Activity LIZ() {
        return FKM.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final String LJ() {
        return ContentLanguageGuideServiceImpl.LIZIZ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LIZLLL(ContentLanguage contentLanguage) {
        this.LIZ.LIZLLL(contentLanguage);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LJFF(EUJ euj) {
        EJB.LIZIZ.LJFF(euj);
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final Pair<Boolean, String> LJII(Context context) {
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ instanceof MainActivity) {
            Fragment curFragment = ((MainActivity) LJIJJ).getCurFragment();
            if (curFragment instanceof MainFragment) {
                FeedFragment w2 = ((MainFragment) curFragment).w2();
                if ((w2 instanceof FeedRecommendFragment) && w2.isResumed() && w2.getUserVisibleHint()) {
                    Aweme aweme = null;
                    if (C38987FRv.LIZLLL().booleanValue() && ((FeedRecommendFragment) w2).LJLL.getCurIndex() == 0) {
                        return new Pair<>(Boolean.FALSE, null);
                    }
                    FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) w2;
                    RecommendFeedFragmentPanel recommendFeedFragmentPanel = feedRecommendFragment.LJLL;
                    if (recommendFeedFragmentPanel != null) {
                        aweme = recommendFeedFragmentPanel.getCurrentAweme();
                    }
                    if (LJIIJ(aweme)) {
                        return new Pair<>(Boolean.TRUE, feedRecommendFragment.LJLJI);
                    }
                }
            }
        }
        return new Pair<>(Boolean.FALSE, "");
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final void LJIIIIZZ(Activity activity) {
        if (activity != null) {
            ContentLanguageGuideServiceImpl.LIZIZ().LJIIJ(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final boolean LJIIJ(Aweme aweme) {
        FR4 fr4 = FR4.LIZ;
        if (!FR4.LJ && !C55511LqV.LJII() && !C63081OpJ.LJJLIIIJJI(aweme) && !C63081OpJ.LLIIII(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    public final AF0 LJI(List<String> list, List<? extends ContentLanguage> list2) {
        return this.LIZ.LJI(list, list2);
    }
}
