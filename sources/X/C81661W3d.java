package X;

import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;

/* renamed from: X.W3d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81661W3d implements InterfaceC47920IrM {
    public boolean LIZ = true;
    public final /* synthetic */ FavoriteSticker LIZIZ;

    @Override // X.InterfaceC47920IrM
    public final void LIZ() {
        this.LIZ = false;
    }

    @Override // X.InterfaceC47920IrM
    public final void LIZIZ() {
        if (!this.LIZ) {
            this.LIZIZ.LIZLLL();
            this.LIZ = true;
        }
    }

    public C81661W3d(FavoriteSticker favoriteSticker) {
        this.LIZIZ = favoriteSticker;
    }
}
