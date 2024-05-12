package X;

import android.content.Context;

/* renamed from: X.Bc2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29134Bc2 implements InterfaceC30837C8j {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ HandlerC29100BbU LIZIZ;

    @Override // X.InterfaceC30837C8j
    public final void onSuccess() {
        EnumC30836C8i.LiveResource.load(this.LIZ, false);
        this.LIZIZ.LIZIZ();
    }

    public C29134Bc2(Context context, HandlerC29100BbU handlerC29100BbU) {
        this.LIZ = context;
        this.LIZIZ = handlerC29100BbU;
    }
}
