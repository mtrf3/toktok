package com.ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import X.AbstractC73672Svk;
import X.C9TG;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.model.PronounResponse;

/* loaded from: classes5.dex */
public interface PronounsAPI {
    public static final C9TG LIZ = C9TG.LIZ;

    @InterfaceC195787mI
    @E4T("/tiktok/user/profile/pronoun/update/v1")
    AbstractC73672Svk<PronounResponse> updatePronouns(@InterfaceC64987Pex("pronouns") String str);
}
