package X;

import com.ss.android.ugc.aweme.openauthorize.entity.BCAuthorizationResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.EGe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36136EGe implements InterfaceC73463SsN<BCAuthorizationResponse> {
    public final /* synthetic */ InterfaceC36137EGf LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    public C36136EGe(C36138EGg c36138EGg) {
        this.LJLIL = c36138EGg;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ(new BCAuthorizationResponse(null, null, 3, null));
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(BCAuthorizationResponse bCAuthorizationResponse) {
        BCAuthorizationResponse t = bCAuthorizationResponse;
        o.LJIIIZ(t, "t");
        this.LJLIL.LIZ(t);
    }
}
