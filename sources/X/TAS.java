package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TAS extends C74249TCb {
    public final ShortVideoContext LJLL;
    public final InterfaceC88473Ynt<Effect, Integer, Integer, C76800UCe> LJLLI;
    public final Au2S19S0200000_12 LJLLILLLL;

    @Override // X.C74249TCb, android.view.View.OnClickListener
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        DATA data = this.LJLIL;
        if (data == 0 || -1 == getAdapterPosition()) {
            return;
        }
        if (!(data instanceof ProTemplateEffect)) {
            super.onClick(view);
        }
        if (ESC.LIZ()) {
            super.onClick(view);
        } else {
            this.LJLLILLLL.onClick(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TAS(View itemView, TDE stickerImageView, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel, ShortVideoContext shortVideoContext, InterfaceC88473Ynt<? super Effect, ? super Integer, ? super Integer, C76800UCe> proTemplateClicked) {
        super(itemView, stickerImageView, stickerDataManager, tagHandler, viewModel);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(proTemplateClicked, "proTemplateClicked");
        this.LJLL = shortVideoContext;
        this.LJLLI = proTemplateClicked;
        this.LJLLILLLL = new Au2S19S0200000_12(this, stickerDataManager, 52);
    }
}
