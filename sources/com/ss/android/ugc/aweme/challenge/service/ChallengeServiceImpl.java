package com.ss.android.ugc.aweme.challenge.service;

import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.C58096Mr6;
import X.HDP;
import X.HDQ;
import X.HWO;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;

/* loaded from: classes8.dex */
public class ChallengeServiceImpl implements IChallengeService {
    public final HDP LIZ = HDQ.LIZ;

    public static IChallengeService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IChallengeService.class, false);
        if (LIZ != null) {
            return (IChallengeService) LIZ;
        }
        if (C58096Mr6.LLJLILLLLZIIL == null) {
            synchronized (IChallengeService.class) {
                if (C58096Mr6.LLJLILLLLZIIL == null) {
                    C58096Mr6.LLJLILLLLZIIL = new ChallengeServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Class<? extends Activity> LIZJ() {
        this.LIZ.getClass();
        return ChallengeDetailActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final AbstractC186347Ta LIZ(Context context, Boolean bool) {
        return this.LIZ.LIZ(context, bool);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final AbstractC186377Td LJ(Context context, Boolean bool) {
        return this.LIZ.LJ(context, bool);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Challenge LIZIZ(int i, String str, boolean z) {
        return this.LIZ.LIZIZ(i, str, z);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final void LIZLLL(String str, String str2, String str3, Music music, HWO hwo) {
        this.LIZ.LIZLLL(str, str2, str3, music, hwo);
    }
}
