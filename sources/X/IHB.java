package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class IHB implements IHD<Void> {
    public final /* synthetic */ IHA LIZ;

    public IHB(IHA iha) {
        this.LIZ = iha;
    }

    @Override // X.IHD
    public final void LIZ(W4W<Void> w4w) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload ");
        Aweme aweme = this.LIZ.LIZ.get();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C0MT.LJ(LIZ, str, " failure", LIZ);
        IHA iha = this.LIZ;
        IHC ihc = iha.LIZIZ;
        if (ihc != null) {
            Aweme aweme2 = iha.LIZ.get();
            if (aweme2 != null) {
                aweme2.getAid();
            }
            ihc.onFailure();
        }
        this.LIZ.LIZJ = 3;
    }

    @Override // X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
        IHA iha = this.LIZ;
        IHC ihc = iha.LIZIZ;
        if (ihc != null) {
            Aweme aweme = iha.LIZ.get();
            if (aweme != null) {
                aweme.getAid();
            }
            ihc.LIZIZ();
        }
    }

    @Override // X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload ");
        Aweme aweme = this.LIZ.LIZ.get();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C0MT.LJ(LIZ, str, " cancel", LIZ);
        IHA iha = this.LIZ;
        IHC ihc = iha.LIZIZ;
        if (ihc != null) {
            Aweme aweme2 = iha.LIZ.get();
            if (aweme2 != null) {
                aweme2.getAid();
            }
            ihc.LIZJ();
        }
        this.LIZ.LIZJ = 4;
    }

    @Override // X.IHD
    public final void LIZLLL(W4W<Void> w4w) {
        String str;
        if (w4w != null && w4w.LIZIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preload ");
            Aweme aweme = this.LIZ.LIZ.get();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C0MT.LJ(LIZ, str, " finish", LIZ);
            IHA iha = this.LIZ;
            IHC ihc = iha.LIZIZ;
            if (ihc != null) {
                Aweme aweme2 = iha.LIZ.get();
                if (aweme2 != null) {
                    aweme2.getAid();
                }
                ihc.LIZ();
            }
            this.LIZ.LIZJ = 2;
        }
    }
}
