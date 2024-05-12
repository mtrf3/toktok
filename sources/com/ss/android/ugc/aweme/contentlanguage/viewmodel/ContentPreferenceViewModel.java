package com.ss.android.ugc.aweme.contentlanguage.viewmodel;

import X.ABA;
import X.ABX;
import X.AF2;
import X.AbstractC73672Svk;
import X.AnonymousClass114;
import X.C1A7;
import X.C221108m2;
import X.C25911AEx;
import X.C25912AEy;
import X.C25913AEz;
import X.C38333F2r;
import X.C62822Ol8;
import X.C73969T1h;
import X.C79004UzY;
import X.HG3;
import X.RBX;
import X.T16;
import X.X1D;
import Y.IDxS128S0200000_4;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentPreferenceViewModel extends ViewModel implements AF2 {
    public int LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;

    public final MutableLiveData<ArrayList<ContentLanguage>> hv0() {
        return (MutableLiveData) this.LJLJI.getValue();
    }

    public final MutableLiveData<ArrayList<ABA>> iv0() {
        return (MutableLiveData) this.LJLJJI.getValue();
    }

    public ContentPreferenceViewModel() {
        gv0();
        this.LJLIL = -1;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 100));
        this.LJLJI = C221108m2.LIZIZ(C25912AEy.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(C25913AEz.LJLIL);
    }

    @Override // X.AF2
    public final void LLJJ() {
        Integer num;
        String str;
        ContentLanguage contentLanguage;
        ArrayList<ContentLanguage> value = hv0().getValue();
        if (value != null) {
            num = Integer.valueOf(value.size());
        } else {
            num = null;
        }
        o.LJI(num);
        int intValue = num.intValue();
        String str2 = "";
        for (int i = 0; i < intValue; i++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            ArrayList<ContentLanguage> value2 = hv0().getValue();
            if (value2 != null && (contentLanguage = (ContentLanguage) ListProtector.get(value2, i)) != null) {
                str = contentLanguage.getLanguageCode();
            } else {
                str = null;
            }
            str2 = q.LIZIZ(LIZ, str, ',', LIZ);
        }
        SharePrefCache.inst().getUserAddLanguages().LIZLLL(str2);
    }

    public final void gv0() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            List<String> language = ContentLanguageServiceImpl.LJIIJJI().getLanguage();
            AbstractC73672Svk<ConfigListResponse> unloginContentLanguage = ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(LanguageApi.class)).getUnloginContentLanguage("content_language_region", ContentLanguageServiceImpl.LJIIJJI().LIZJ());
            if (unloginContentLanguage != null) {
                unloginContentLanguage.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS128S0200000_4(language, this, 1));
                return;
            }
            return;
        }
        ContentLanguageServiceImpl.LJIIJJI().LJFF(new C25911AEx(this));
    }

    @Override // X.AF2
    public final void vY(Throwable th) {
        Throwable LJ = C1A7.LJ(th);
        if (LJ instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) LJ;
            int errorCode = c38333F2r.getErrorCode();
            c38333F2r.getResponse();
            if (errorCode == 2090) {
                Activity LIZ = ContentLanguageServiceImpl.LJIIJJI().LIZ();
                if (LIZ != null) {
                    AnonymousClass114.LIZ(LIZ, R.string.rjp);
                }
                ArrayList<ContentLanguage> value = hv0().getValue();
                if (C79004UzY.LJJIFFI(value)) {
                    return;
                }
                if (value != null) {
                    ListProtector.remove(value, value.size() - 1);
                }
                hv0().setValue(value);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void jv0(List<? extends ContentLanguage> list, List<? extends ContentLanguage> list2) {
        if (!C79004UzY.LJJIFFI(list)) {
            hv0().setValue(list);
        }
        if (!C79004UzY.LJJIFFI(list2)) {
            ArrayList<ABA> arrayList = new ArrayList<>();
            o.LJI(list2);
            for (ContentLanguage contentLanguage : list2) {
                arrayList.add(new ABA(new ABX("", contentLanguage.getEnglishName(), contentLanguage.getLanguageCode(), contentLanguage.getLocalName()), false));
            }
            iv0().setValue(arrayList);
        }
    }
}
