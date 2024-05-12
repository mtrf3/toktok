package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TCe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74252TCe extends C74249TCb {
    @Override // X.C74249TCb
    public final TE8 X(int i, Effect effect) {
        return new TE8(effect, i, this.LJLILLLLZI, false, true, C0H1.LIZ("enter_method", "click_personal_board"), this, null, null, 792);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74252TCe(View itemView, TDE stickerImageView, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel) {
        super(itemView, stickerImageView, stickerDataManager, tagHandler, viewModel);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
    }
}
