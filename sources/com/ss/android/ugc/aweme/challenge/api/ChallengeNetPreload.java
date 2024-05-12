package com.ss.android.ugc.aweme.challenge.api;

import X.C16880lQ;
import X.C38827FLr;
import X.C76L;
import X.InterfaceC88472Yns;
import X.MH2;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChallengeNetPreload implements X8M<ChallengeApi.RealApi, C76L<ChallengeAwemeList>> {
    public String EXTRA_CHALLENGE_IS_HASHTAG = "extra_challenge_is_hashtag";

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("id", "");
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        boolean z = bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false);
        MH2.LIZ.getClass();
        MH2.LIZ(2, str, "challenge_video", null, z, 0L);
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, ChallengeApi.LIZ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public C76L<ChallengeAwemeList> preload(Bundle bundle, InterfaceC88472Yns<? super Class<ChallengeApi.RealApi>, ? extends ChallengeApi.RealApi> create) {
        String str;
        String string;
        o.LJIIIZ(create, "create");
        String str2 = "";
        if (bundle != null && (string = bundle.getString("id", "")) != null) {
            str2 = string;
        }
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean(this.EXTRA_CHALLENGE_IS_HASHTAG, false);
        }
        if (CommerceChallengeServiceImpl.LIZIZ().LJIILIIL(str2)) {
            str = ChallengeApi.LJFF;
        } else {
            str = ChallengeApi.LIZJ;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str2);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str2);
            hashMap.put("query_type", CardStruct.IStatusCode.DEFAULT);
        }
        hashMap.put("cursor", String.valueOf(0L));
        hashMap.put("count", String.valueOf(20));
        hashMap.put("type", "5");
        hashMap.put("source", "challenge_video");
        C76L<ChallengeAwemeList> challengeAwemeList = create.invoke(ChallengeApi.RealApi.class).getChallengeAwemeList(str, hashMap);
        o.LJIIIIZZ(challengeAwemeList, "create.invoke(ChallengeA…llengeAwemeList(url, map)");
        return challengeAwemeList;
    }
}
