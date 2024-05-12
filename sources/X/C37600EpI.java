package X;

import com.bytedance.pia.core.utils.DefaultResourceLoader;

/* renamed from: X.EpI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37600EpI<T> implements BQ6<Throwable> {
    public final /* synthetic */ DefaultResourceLoader LIZ;
    public final /* synthetic */ InterfaceC37454Emw LIZIZ;
    public final /* synthetic */ BQ6 LIZJ;
    public final /* synthetic */ BQ6 LIZLLL;

    public C37600EpI(DefaultResourceLoader defaultResourceLoader, InterfaceC37454Emw interfaceC37454Emw, BQ6 bq6, BQ6 bq62) {
        this.LIZ = defaultResourceLoader;
        this.LIZIZ = interfaceC37454Emw;
        this.LIZJ = bq6;
        this.LIZLLL = bq62;
    }

    @Override // X.BQ6
    public final void accept(Throwable th) {
        this.LIZ.LIZJ(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }
}
