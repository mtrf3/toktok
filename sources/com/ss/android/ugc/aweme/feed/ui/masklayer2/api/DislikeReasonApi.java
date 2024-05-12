package com.ss.android.ugc.aweme.feed.ui.masklayer2.api;

import X.C03660Ck;
import X.C46104I7o;
import X.E4T;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64992Pf2;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DislikeReasonApi {
    public static final RealApi LIZ = (RealApi) C46104I7o.LJIIZILJ(EFJ.LIZJ, RealApi.class);

    /* loaded from: classes2.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/commit/dislike/item/")
        InterfaceC37276Ek4<BaseResponse> disLikeReason(@InterfaceC64992Pf2 Map<String, String> map);
    }

    public static String LIZ(String str, Aweme aweme, String str2) {
        String str3;
        HashMap LIZJ = C03660Ck.LIZJ("dislike_reason_id", str);
        if (aweme.getMusic() != null) {
            str3 = aweme.getMusic().getMid();
        } else {
            str3 = "";
        }
        LIZJ.put("music_id", str3);
        LIZJ.put("author_id", aweme.getAuthorUid());
        if (!TextUtils.isEmpty(str2)) {
            LIZJ.put("commit_type", str2);
        }
        LIZ.disLikeReason(LIZJ).execute();
        return str;
    }
}
