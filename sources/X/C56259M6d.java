package X;

import com.ss.android.ugc.aweme.notice.api.bean.BCVideosInPushMsg;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* renamed from: X.M6d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56259M6d implements InterfaceC56268M6m {
    @Override // X.InterfaceC56268M6m
    public final Object LIZ(C56265M6j c56265M6j) {
        try {
            return (BCVideosInPushMsg) JsonParseUtils.LIZJ(BCVideosInPushMsg.class, new String(c56265M6j.LIZ(), PVC.LIZ));
        } catch (Throwable unused) {
            return null;
        }
    }
}
