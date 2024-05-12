package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Bbg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29112Bbg extends TBS implements InterfaceC88471Ynr<android.net.Uri, Integer, C76800UCe> {
    public C29112Bbg(HandlerC29100BbU handlerC29100BbU) {
        super(2, handlerC29100BbU, HandlerC29100BbU.class, "handleGoLive", "handleGoLive(Landroid/net/Uri;I)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(android.net.Uri uri, Integer num) {
        android.net.Uri p0 = uri;
        int intValue = num.intValue();
        o.LJIIIZ(p0, "p0");
        ((HandlerC29100BbU) this.receiver).LJIIIIZZ(p0, intValue);
        return C76800UCe.LIZ;
    }
}
