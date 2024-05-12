package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TCh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnLongClickListenerC74255TCh extends C74249TCb implements View.OnLongClickListener {
    public final ImageView LJLL;
    public final InterfaceC88473Ynt<Effect, Integer, Integer, C76800UCe> LJLLI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int adapterPosition;
        o.LJIIIZ(view, "view");
        DATA data = this.LJLIL;
        if (data == 0 || -1 == (adapterPosition = getAdapterPosition())) {
            return true;
        }
        this.LJLLI.invoke(data, Integer.valueOf(adapterPosition), Integer.valueOf(this.LJLILLLLZI));
        return true;
    }

    @Override // X.AbstractViewOnClickListenerC74256TCi, X.C73365Sqn
    public final /* bridge */ /* synthetic */ void M(Effect effect, TEA tea, Integer num) {
        M(effect, tea, num);
    }

    @Override // X.AbstractViewOnClickListenerC74256TCi
    /* renamed from: P */
    public final void M(Effect data, TEA state, Integer num) {
        boolean z;
        int i;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        super.M(data, state, num);
        T4I<Effect> t4i = this.LJLJLLL;
        MobileEffect mobileEffect = null;
        if ((t4i instanceof MyEffectsViewModel) && t4i != null) {
            this.itemView.setOnLongClickListener(this);
        }
        if (data instanceof MobileEffect) {
            mobileEffect = (MobileEffect) data;
        }
        if (mobileEffect != null && mobileEffect.getModerationStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.LJLL;
        if (imageView != null) {
            if (z || (data instanceof DraftEffect)) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        TextView textView = this.LJLJL.getTextView();
        if (textView != null) {
            textView.setText(data.getName());
        }
        if (data instanceof DraftEffect) {
            C74257TCj c74257TCj = this.LJLJJLL;
            if (c74257TCj != null) {
                this.LJLJLJ.LLJJIJIIJIL();
                if (C78866UxK.LJJJJZI(c74257TCj.LIZ.LJLJLJ, data) && !V3N.LJIILLIIL(data)) {
                    this.LJLJL.getImageView().setAlpha(1.0f);
                    return;
                }
            }
            this.LJLJL.getImageView().setAlpha(0.5f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnLongClickListenerC74255TCh(View itemView, TDE stickerImageView, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel, ImageView imageView, InterfaceC88473Ynt<? super Effect, ? super Integer, ? super Integer, C76800UCe> deleteEffectHandler) {
        super(itemView, stickerImageView, stickerDataManager, tagHandler, viewModel);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(deleteEffectHandler, "deleteEffectHandler");
        this.LJLL = imageView;
        this.LJLLI = deleteEffectHandler;
    }
}
