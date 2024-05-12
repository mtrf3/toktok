package X;

import com.ss.android.vesdk.VEFileDownloader;

/* renamed from: X.EWw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36570EWw extends AbstractC36569EWv {
    public final /* synthetic */ E0U LJLIL;
    public final /* synthetic */ VEFileDownloader LJLILLLLZI;

    @Override // X.E0U
    public final void LJJJJI(String str) {
        E0U e0u = this.LJLIL;
        if (e0u != null) {
            e0u.LJJJJI(str);
        }
    }

    @Override // X.E0U
    public final void LJJJLIIL(String str) {
        this.LJLILLLLZI.destroyFileDownload();
        E0U e0u = this.LJLIL;
        if (e0u != null) {
            e0u.LJJJLIIL(str);
        }
    }

    public C36570EWw(VEFileDownloader vEFileDownloader, E0U e0u) {
        this.LJLILLLLZI = vEFileDownloader;
        this.LJLIL = e0u;
    }

    @Override // X.E0U
    public final void LJIIJ(String str, boolean z) {
        E0U e0u = this.LJLIL;
        if (e0u != null) {
            e0u.LJIIJ(str, z);
        }
    }

    @Override // X.E0U
    public final void LJJJJJ(String str, float f) {
        E0U e0u = this.LJLIL;
        if (e0u != null) {
            e0u.LJJJJJ(str, f);
        }
    }

    @Override // X.E0U
    public final void LJJJ(String str, int i, int i2, String str2) {
        this.LJLILLLLZI.destroyFileDownload();
        E0U e0u = this.LJLIL;
        if (e0u != null) {
            e0u.LJJJ(str, i, i2, str2);
        }
    }

    @Override // X.AbstractC36569EWv
    public final void LIZ(String str, int i, int i2, float f, String str2) {
        E0U e0u = this.LJLIL;
        if (e0u != null && (e0u instanceof AbstractC36569EWv)) {
            ((AbstractC36569EWv) e0u).LIZ(str, i, i2, f, str2);
        }
    }
}
