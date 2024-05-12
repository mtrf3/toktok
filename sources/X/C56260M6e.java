package X;

import com.ss.android.ugc.aweme.im.service.model.NoticePushMessage;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* renamed from: X.M6e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56260M6e implements InterfaceC56268M6m {
    @Override // X.InterfaceC56268M6m
    public final Object LIZ(C56265M6j c56265M6j) {
        try {
            return (NoticePushMessage) JsonParseUtils.LIZJ(NoticePushMessage.class, new String(c56265M6j.LIZ(), PVC.LIZ));
        } catch (Throwable unused) {
            return null;
        }
    }
}
