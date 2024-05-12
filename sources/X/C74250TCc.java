package X;

import Y.ARunnableS39S0100000_3;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TCc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74250TCc extends AbstractViewOnClickListenerC74256TCi {
    public final TEF LJLL;
    public final int LJLLI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition;
        int i;
        o.LJIIIZ(view, "view");
        DATA data = this.LJLIL;
        if (data == 0 || -1 == (adapterPosition = getAdapterPosition())) {
            return;
        }
        HY3 hy3 = (HY3) this.LJLJLJ.LJIIIIZZ().LJFF().getValue();
        if (hy3 != null) {
            i = hy3.LJLIL;
        } else {
            i = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("order", adapterPosition + 1);
        this.LJLJLLL.fX(new TE8(data, this.LJLLI, i, true, true, bundle, null, null, null, 896));
    }

    @Override // X.C73365Sqn
    public final void L(int i, Object obj) {
        String str;
        Effect data = (Effect) obj;
        o.LJIIIZ(data, "data");
        TDE tde = this.LJLJL;
        List<String> urlList = data.getIconUrl().getUrlList();
        if (urlList != null) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        C51029K0z.LJFF(tde, str);
        this.LJLL.LIZ(data, new C64328PMm());
        T43 t43 = this.LJLJJL;
        if (t43 != null && t43.LJJIJIIJIL(data, this.LJLILLLLZI, i)) {
            this.itemView.post(new ARunnableS39S0100000_3(this, 227));
        }
    }

    @Override // X.AbstractViewOnClickListenerC74256TCi, X.C73365Sqn
    public final /* bridge */ /* synthetic */ void M(Effect effect, TEA tea, Integer num) {
        M(effect, tea, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractViewOnClickListenerC74256TCi
    /* renamed from: P */
    public final void M(Effect data, TEA state, Integer num) {
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
        if (C78866UxK.LJJJJZ(this.LJLJLJ, data)) {
            Q(true);
        } else {
            Q(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74250TCc(View itemView, TDE stickerImageView, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel, int i) {
        super(itemView, stickerImageView, stickerDataManager, viewModel);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLL = tagHandler;
        this.LJLLI = i;
    }
}
