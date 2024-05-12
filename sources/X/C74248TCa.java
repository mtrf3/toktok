package X;

import Y.ARunnableS45S0100000_9;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;
import o53.IDdS197S0200000_12;

/* renamed from: X.TCa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74248TCa extends C74249TCb {
    public final TKR LJLL;

    public final void Y(Effect effect) {
        String str = (String) ORZ.LJLLLL(effect.getIconUrl().getUrlList());
        if (str != null) {
            if (this.LJLJLJ.LJFF() == -1 && this.LJLJLJ.LJIJI() == -1) {
                C51029K0z.LJFF(this.LJLJL, str);
                return;
            }
            C51029K0z.LJI(this.LJLJL, str, new SIY(), new IDdS197S0200000_12(this.LJLJLJ, this.LJLJI, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(boolean z) {
        int adapterPosition;
        Effect effect = (Effect) this.LJLIL;
        if (effect == null || -1 == (adapterPosition = getAdapterPosition())) {
            return;
        }
        java.util.Map<String, List<Integer>> LJJIIJZLJL = this.LJLJLJ.LJJIIJZLJL();
        this.LJLJLJ.LJJJJZ();
        Integer num = null;
        List<Integer> list = LJJIIJZLJL.get(null);
        int i = 0;
        if (list != null) {
            ListIterator<Integer> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Integer previous = listIterator.previous();
                if (adapterPosition > previous.intValue()) {
                    num = previous;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 != null) {
                i = num2.intValue();
            }
        }
        int i2 = adapterPosition - i;
        if (!z && (!o.LJ(this.LJLJLJ.LLJJIJIIJIL(), effect))) {
            if (ET3.LIZIZ(1, hashCode(), effect.getId())) {
                ET3.LIZJ(1, hashCode(), effect.getId());
                Y(effect);
            }
        }
        this.LJLJLLL.fX(X(i2, effect));
    }

    @Override // X.C74249TCb, android.view.View.OnClickListener
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        a0(false);
    }

    @Override // X.AbstractViewOnClickListenerC74256TCi, X.C73365Sqn
    public final /* bridge */ /* synthetic */ void M(Effect effect, TEA tea, Integer num) {
        M(effect, tea, num);
    }

    @Override // X.AbstractViewOnClickListenerC74256TCi
    /* renamed from: P */
    public final void M(Effect data, TEA state, Integer num) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        super.M(data, state, num);
        String url = ET3.LIZ(data, this.LJLL.LLII);
        if (url == null || url.length() == 0) {
            Y(data);
            return;
        }
        if (ET3.LIZIZ(1, hashCode(), data.getId())) {
            return;
        }
        TDE bindDynamicImageViewUrl = this.LJLJL;
        o.LJIIIZ(bindDynamicImageViewUrl, "$this$bindDynamicImageViewUrl");
        o.LJIIIZ(url, "url");
        C78764Uvg.LIZIZ(bindDynamicImageViewUrl.getDynamicView(), url, -1, -1);
        ET3.LIZLLL(1, hashCode(), data.getId());
    }

    @Override // X.C74249TCb
    public final void U(Effect effect, int i, int i2) {
        o.LJIIIZ(effect, "effect");
        T43 t43 = this.LJLJJL;
        if (t43 == null || !t43.LJJIJIIJIL(effect, i, i2)) {
            return;
        }
        if (ID0.LJIIZILJ(effect) && i2 == 1) {
            this.LJLJLJ.LJJIFFI();
            if (this.LJLJLJ.LJIILL() || this.LJLJLJ.LJII()) {
                return;
            }
        }
        this.itemView.post(new ARunnableS45S0100000_9(this, 119));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74248TCa(View itemView, TDE stickerImageView, TEZ stickerDataManager, TEF tagHandler, T4I<Effect> viewModel, TKR stickerViewHolderConfigure) {
        super(itemView, stickerImageView, stickerDataManager, tagHandler, viewModel);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(stickerViewHolderConfigure, "stickerViewHolderConfigure");
        this.LJLL = stickerViewHolderConfigure;
    }
}
