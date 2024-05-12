package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS62S1100000_9;

/* renamed from: X.Ln7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55301Ln7 implements C0C3 {
    public boolean LJLIL = true;
    public boolean LJLILLLLZI;
    public final /* synthetic */ MallRacunFragment LJLJI;

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C55301Ln7(MallRacunFragment mallRacunFragment) {
        this.LJLJI = mallRacunFragment;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LJLILLLLZI = true;
            return;
        }
        this.LJLILLLLZI = false;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        C55297Ln3 c55297Ln3;
        MallRacunPageFragment LJJIIZI;
        MallRacunFragment mallRacunFragment = this.LJLJI;
        mallRacunFragment.LJZL = i;
        if (this.LJLIL) {
            str = "default";
        } else if (this.LJLILLLLZI) {
            str = "slide";
        } else {
            str = "click";
        }
        C212418Vh.LJIIJJI(mallRacunFragment.Al(), new AqS62S1100000_9(mallRacunFragment, str, 15));
        if (!this.LJLIL && (c55297Ln3 = this.LJLJI.LJLLI) != null && (LJJIIZI = c55297Ln3.LJJIIZI(i)) != null) {
            C212418Vh.LJIIJJI((AssemViewModel) LJJIIZI.LJLJLJ.getValue(), new AqS175S0100000_9(LJJIIZI, 637));
        }
        this.LJLIL = false;
    }
}
