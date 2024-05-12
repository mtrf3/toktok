package X;

import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import o53.IDdS197S0200000_12;

/* renamed from: X.TCb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74249TCb extends AbstractViewOnClickListenerC74256TCi implements InterfaceC43949HMr {
    @Override // X.InterfaceC43949HMr
    public final void LJJJJI() {
        TDE tde = this.LJLJL;
        if (!tde.LLILZIL.hasStarted()) {
            return;
        }
        ImageView imageView = tde.LLILLJJLI;
        if (imageView != null) {
            imageView.setImageResource(tde.LLJ);
            ImageView imageView2 = tde.LLILLJJLI;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                ImageView imageView3 = tde.LLILLJJLI;
                if (imageView3 != null) {
                    imageView3.clearAnimation();
                    return;
                } else {
                    o.LJIJI("downloadImg");
                    throw null;
                }
            }
            o.LJIJI("downloadImg");
            throw null;
        }
        o.LJIJI("downloadImg");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onClick(View view) {
        int adapterPosition;
        o.LJIIIZ(view, "view");
        Effect effect = (Effect) this.LJLIL;
        if (effect == null || -1 == (adapterPosition = getAdapterPosition())) {
            return;
        }
        this.LJLJLLL.fX(X(adapterPosition, effect));
    }

    @Override // X.C73365Sqn
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void L(int i, Effect data) {
        o.LJIIIZ(data, "data");
        String name = data.getName();
        if (name != null) {
            this.LJLJL.setText(name);
        }
        String str = (String) ORZ.LJLLLL(data.getIconUrl().getUrlList());
        if (str != null) {
            if (this.LJLJLJ.LJFF() == -1 && this.LJLJLJ.LJIJI() == -1) {
                C51029K0z.LJFF(this.LJLJL, str);
            } else {
                C51029K0z.LJI(this.LJLJL, str, new SIY(), new IDdS197S0200000_12(this.LJLJLJ, this.LJLJI, 0));
            }
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setContentDescription(data.getName());
        if (ID0.LJIILJJIL(data)) {
            this.LJLJL.getImageView().setPadding((int) C74275TDb.LIZ(3.0f), (int) C74275TDb.LIZ(3.0f), (int) C74275TDb.LIZ(3.0f), (int) C74275TDb.LIZ(3.0f));
        } else {
            this.LJLJL.getImageView().setPadding(0, 0, 0, 0);
        }
        U(data, this.LJLILLLLZI, i);
    }

    public TE8 X(int i, Effect effect) {
        return new TE8(effect, i, this.LJLILLLLZI, false, true, C0H1.LIZ("tab_type", "main_panel"), this, null, new AqS162S0100000_12(this, 1020), 280);
    }

    public void U(Effect effect, int i, int i2) {
        o.LJIIIZ(effect, "effect");
        T43 t43 = this.LJLJJL;
        if (t43 == null || !t43.LJJIJIIJIL(effect, i, i2) || !ID0.LJIIZILJ(effect) || i2 != 1) {
            return;
        }
        this.LJLJLJ.LJJIFFI();
        if (this.LJLJLJ.LJIILL()) {
            return;
        }
        this.LJLJLJ.LJII();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74249TCb(View itemView, TDE stickerImageView, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel) {
        super(itemView, stickerImageView, stickerDataManager, viewModel);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
    }
}
