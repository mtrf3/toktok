package X;

import com.bytedance.pia.core.utils.DefaultResourceLoader;

/* renamed from: X.EpG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37598EpG<T> implements BQ6<InterfaceC37464En6> {
    public final /* synthetic */ DefaultResourceLoader LIZ;
    public final /* synthetic */ InterfaceC37454Emw LIZIZ;
    public final /* synthetic */ BQ6 LIZJ;
    public final /* synthetic */ BQ6 LIZLLL;

    public C37598EpG(DefaultResourceLoader defaultResourceLoader, InterfaceC37454Emw interfaceC37454Emw, BQ6 bq6, BQ6 bq62) {
        this.LIZ = defaultResourceLoader;
        this.LIZIZ = interfaceC37454Emw;
        this.LIZJ = bq6;
        this.LIZLLL = bq62;
    }

    @Override // X.BQ6
    public final void accept(InterfaceC37464En6 interfaceC37464En6) {
        if (interfaceC37464En6 != null) {
            C37238EjS.LJI(6, "[Resource] Custom resource loader load success.", null);
            BQ6 bq6 = this.LIZJ;
            if (bq6 != null) {
                bq6.accept(interfaceC37464En6);
                return;
            }
            return;
        }
        this.LIZ.LIZJ(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }
}
