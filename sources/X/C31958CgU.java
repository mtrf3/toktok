package X;

import android.content.Context;

/* renamed from: X.CgU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31958CgU implements InterfaceC60302Nla {
    public final C31965Cgb LIZ = new C31965Cgb();
    public final Context LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC60302Nla
    public final Context getContext() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC60302Nla
    public final /* bridge */ /* synthetic */ C31965Cgb getExtra() {
        return this.LIZ;
    }

    @Override // X.InterfaceC60302Nla
    public final boolean isDebug() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC60302Nla
    public final <T> T LLLIIL(Class<T> cls) {
        return (T) this.LIZ.LIZ(cls);
    }

    public C31958CgU(Context context, boolean z) {
        this.LIZIZ = context;
        this.LIZJ = z;
    }

    @Override // X.InterfaceC60302Nla
    public final <T> void LLLIILIL(Class<T> cls, T t) {
        this.LIZ.LIZIZ(cls, t);
    }
}
