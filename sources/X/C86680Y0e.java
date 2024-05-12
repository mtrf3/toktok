package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Y0e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86680Y0e implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;
    public final /* synthetic */ C224048qm LIZJ;
    public final /* synthetic */ Aweme LIZLLL;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        Context mContext = this.LIZ.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        C245649kW c245649kW = this.LIZ.LJLJLLL;
        InteractStickerStruct interactStickerStruct = this.LIZIZ;
        C224048qm rootView = this.LIZJ;
        Aweme aweme = this.LIZLLL;
        o.LJIIIZ(interactStickerStruct, "interactStickerStruct");
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(aweme, "aweme");
        return new C223598q3(interactStickerStruct.getType(), mContext, rootView, interactStickerStruct, c245649kW, aweme);
    }

    public C86680Y0e(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct, C224048qm c224048qm, Aweme aweme) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
        this.LIZJ = c224048qm;
        this.LIZLLL = aweme;
    }
}
