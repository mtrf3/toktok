package X;

import com.ss.android.ugc.aweme.notice.api.bean.LiveMessage;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* renamed from: X.LVb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54359LVb implements InterfaceC56268M6m {
    @Override // X.InterfaceC56268M6m
    public final Object LIZ(C56265M6j c56265M6j) {
        try {
            return JsonParseUtils.LIZJ(LiveMessage.class, new String(c56265M6j.LIZ()));
        } catch (Throwable unused) {
            return null;
        }
    }
}
