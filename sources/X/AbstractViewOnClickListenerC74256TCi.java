package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import kotlin.jvm.internal.o;

/* renamed from: X.TCi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractViewOnClickListenerC74256TCi extends C73365Sqn<Effect> implements View.OnClickListener {
    public T43 LJLJJL;
    public final C74257TCj LJLJJLL;
    public final TDE LJLJL;
    public final TEZ LJLJLJ;
    public T4I<Effect> LJLJLLL;

    public void Q(boolean z) {
        this.LJLJL.setCustomSelected(z);
    }

    @Override // X.C73365Sqn
    public final void N(float f, boolean z) {
        if (z) {
            this.itemView.setOnTouchListener(new ViewOnTouchListenerC170476mZ(f, 100L, this.LJLJL));
        } else {
            this.itemView.setOnTouchListener(null);
        }
    }

    public final void T(TEA state, Integer num) {
        o.LJIIIZ(state, "state");
        if (!this.LJLJLJ.LJJII()) {
            return;
        }
        int i = TEB.LIZ[state.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    return;
                }
                if (num == null) {
                    this.LJLJL.LJIJJLI();
                    return;
                } else {
                    this.LJLJL.LJIJI(num.intValue());
                    return;
                }
            }
            this.LJLJL.LJIJJ();
            return;
        }
        this.LJLJL.LJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C73365Sqn
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void M(Effect data, TEA state, Integer num) {
        String str;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        String effectId = data.getEffectId();
        EffectTemplate effectTemplate = (EffectTemplate) this.LJLIL;
        if (effectTemplate != null) {
            str = effectTemplate.getEffectId();
        } else {
            str = null;
        }
        if (!o.LJ(effectId, str)) {
            return;
        }
        T(state, num);
        C74257TCj c74257TCj = this.LJLJJLL;
        if (c74257TCj != null) {
            this.LJLJLJ.LLJJIJIIJIL();
            if (C78866UxK.LJJJJZI(c74257TCj.LIZ.LJLJLJ, data) && !V3N.LJIILLIIL(data)) {
                C51029K0z.LJJIJIL(this.LJLJL, true);
                return;
            }
        }
        C51029K0z.LJJIJIL(this.LJLJL, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractViewOnClickListenerC74256TCi(View itemView, TDE stickerImageView, TEZ stickerDataManager, T4I<Effect> viewModel) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLJL = stickerImageView;
        this.LJLJLJ = stickerDataManager;
        this.LJLJLLL = viewModel;
        this.LJLJJLL = new C74257TCj(this);
        C16880lQ.LJIIJ(this, itemView);
        stickerImageView.setShowDownloadIcon(true);
    }
}
