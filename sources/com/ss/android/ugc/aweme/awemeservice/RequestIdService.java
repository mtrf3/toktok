package com.ss.android.ugc.aweme.awemeservice;

import X.C58096Mr6;
import X.C7D6;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class RequestIdService implements IRequestIdService {
    public final Map<String, C7D6> LIZ = new ConcurrentHashMap();

    public static IRequestIdService LJ() {
        Object LIZ = C58096Mr6.LIZ(IRequestIdService.class, false);
        if (LIZ != null) {
            return (IRequestIdService) LIZ;
        }
        if (C58096Mr6.LLJILJILJ == null) {
            synchronized (IRequestIdService.class) {
                if (C58096Mr6.LLJILJILJ == null) {
                    C58096Mr6.LLJILJILJ = new RequestIdService();
                }
            }
        }
        return C58096Mr6.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final C7D6 LIZLLL(String str) {
        C7D6 c7d6 = (C7D6) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c7d6 == null) {
            return new C7D6();
        }
        return c7d6;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final JSONObject LIZ(int i, Aweme aweme) {
        String str;
        if (aweme == null) {
            return new JSONObject();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aweme.getAid());
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        JSONObject jSONObject = new JSONObject();
        try {
            C7D6 LIZLLL = LIZLLL(LIZIZ);
            String str2 = LIZLLL.LIZ;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("request_id", str2);
            }
            Integer num = LIZLLL.LIZIZ;
            if (num != null) {
                jSONObject.put("order", num);
            }
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_photo", str);
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && !TextUtils.isEmpty(playListInfo.getMixId())) {
                PlayListInfo playListInfo2 = aweme.playlist_info;
                o.LJI(playListInfo2);
                jSONObject.put("playlist_id", playListInfo2.getMixId());
                return jSONObject;
            }
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final String LIZIZ(int i, Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aweme.getAid());
        LIZ.append(i);
        String str = LIZLLL(X1D.LIZIZ(LIZ)).LIZ;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService
    public final void LIZJ(int i, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, C7D6> map = this.LIZ;
        o.LJI(str);
        ((ConcurrentHashMap) map).put(str, new C7D6(str2, i));
    }
}
