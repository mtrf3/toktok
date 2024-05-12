package X;

import android.content.Context;
import com.tiktok.sticker.commonsticker.model.PollStickerModel;

/* renamed from: X.64W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64W extends C64N {
    public final C64P LJ;
    public final PollStickerModel LJFF;

    @Override // X.C64N
    public final PollStickerModel LIZIZ() {
        return this.LJFF;
    }

    @Override // X.C64N
    public final C64P LIZJ() {
        return this.LJ;
    }

    public C64W(Context context, PollStickerModel pollStickerModel) {
        this.LJ = new C64P(context);
        this.LJFF = pollStickerModel;
    }
}
