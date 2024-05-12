package com.ss.android.ugc.aweme.badge;

import X.C73969T1h;
import X.C85999Xp5;
import X.T16;
import Y.AfS58S0100000_6;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeApi;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EditProfileBadgeViewModel extends JediViewModel<EditProfileBadgeState> {
    public final List<EditProfileBadgeModel> LJLJJLL = new ArrayList();

    public final void Hv0() {
        ((ArrayList) this.LJLJJLL).clear();
        setState(new AqS172S0100000_6(this, 87));
        EditProfileBadgeApi.Api api = (EditProfileBadgeApi.Api) EditProfileBadgeApi.LIZ.getValue();
        String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
        o.LJIIIIZZ(appLanguage, "get().getService(IAVSett…::class.java).appLanguage");
        String appLogRegion = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLogRegion();
        o.LJIIIIZZ(appLogRegion, "get().getService(IAVSett…:class.java).appLogRegion");
        String LIZIZ = C85999Xp5.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getAppLocale()");
        api.getProfileBadgeList(appLanguage, appLogRegion, LIZIZ).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS58S0100000_6(this, 43), new AfS58S0100000_6(this, 44));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final EditProfileBadgeState kv0() {
        return new EditProfileBadgeState(null, 1, null);
    }
}
