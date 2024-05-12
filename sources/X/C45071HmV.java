package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.HmV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45071HmV implements InterfaceC84907XTz {
    public final /* synthetic */ C45054HmE LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C63A LIZJ;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        if (!this.LIZ.LLLL(this.LIZIZ, this.LIZJ)) {
            return;
        }
        C45054HmE.LLLJ(this.LIZ, 1002, null, 0, 4, null);
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        if (!this.LIZ.LLLL(this.LIZIZ, this.LIZJ)) {
            return;
        }
        if (aVMusic == null) {
            C45054HmE.LLLJ(this.LIZ, 1003, null, 0, 4, null);
        } else {
            this.LIZ.LLILZLL(aVMusic, this.LIZIZ, this.LIZJ);
        }
    }

    public C45071HmV(C45054HmE c45054HmE, int i, C63A c63a) {
        this.LIZ = c45054HmE;
        this.LIZIZ = i;
        this.LIZJ = c63a;
    }
}
