package X;

import com.ss.android.ugc.aweme.notice.api.bean.PushChallengeInfoMsg;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* renamed from: X.M6b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56257M6b implements InterfaceC56268M6m {
    @Override // X.InterfaceC56268M6m
    public final Object LIZ(C56265M6j c56265M6j) {
        try {
            return (PushChallengeInfoMsg) JsonParseUtils.LIZJ(PushChallengeInfoMsg.class, new String(c56265M6j.LIZ()));
        } catch (Throwable unused) {
            return null;
        }
    }
}
