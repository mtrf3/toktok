package com.ss.android.ugc.trill.setting;

import X.C25895AEh;
import X.C25907AEt;
import X.C61878OQg;
import X.EnumC25904AEq;
import X.InterfaceC25906AEs;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class PreferredLanguageSettingPageViewModel extends ViewModel {
    public final InterfaceC25906AEs LJLIL;
    public final ContentLanguage[] LJLILLLLZI;
    public final String[] LJLJI;
    public final String[] LJLJJI;
    public final EnumC25904AEq LJLJJL;
    public final MutableLiveData<Boolean> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;
    public final MutableLiveData<List<C25895AEh>> LJLJLLL;
    public final MutableLiveData LJLL;
    public final MutableLiveData LJLLI;
    public final MutableLiveData LJLLILLLL;
    public final MutableLiveData LJLLJ;
    public final MutableLiveData LJLLL;
    public final C25907AEt LJLLLL;

    public static List gv0(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C25895AEh) obj).LJLJI) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171 A[LOOP:6: B:58:0x016b->B:60:0x0171, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreferredLanguageSettingPageViewModel(X.InterfaceC25906AEs r18, com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage[] r19, java.lang.String[] r20, java.lang.String[] r21, X.EnumC25904AEq r22) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.setting.PreferredLanguageSettingPageViewModel.<init>(X.AEs, com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage[], java.lang.String[], java.lang.String[], X.AEq):void");
    }
}
