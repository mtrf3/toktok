package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.MallRacunTabInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;

/* renamed from: X.LmV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55263LmV extends AbstractC65781Prl implements InterfaceC88473Ynt<Float, Boolean, Boolean, C76800UCe> {
    public final /* synthetic */ MallRacunPageFragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55263LmV(MallRacunPageFragment mallRacunPageFragment, boolean z, boolean z2) {
        super(3);
        this.LJLIL = mallRacunPageFragment;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Float f, Boolean bool, Boolean bool2) {
        Integer num;
        float floatValue = f.floatValue();
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        View view = this.LJLIL.LJLLJ;
        if (view != null) {
            view.setAlpha(1.0f - floatValue);
        }
        RecyclerView recyclerView = this.LJLIL.LJLZ;
        if (recyclerView != null) {
            recyclerView.setAlpha(floatValue);
        }
        FrameLayout frameLayout = this.LJLIL.LJZ;
        if (frameLayout != null) {
            frameLayout.setAlpha(floatValue);
        }
        FrameLayout frameLayout2 = this.LJLIL.LJZI;
        if (frameLayout2 != null) {
            frameLayout2.setAlpha(floatValue);
        }
        if (this.LJLILLLLZI) {
            if (booleanValue2) {
                View view2 = this.LJLIL.LJLLJ;
                if (view2 != null) {
                    C45804HyK.LJJIJIIJIL(view2);
                }
                if (this.LJLJI) {
                    MallRacunPageFragment mallRacunPageFragment = this.LJLIL;
                    MallRacunTabInfo mallRacunTabInfo = mallRacunPageFragment.LLII;
                    if (mallRacunTabInfo != null) {
                        num = mallRacunTabInfo.getTabType();
                    } else {
                        num = null;
                    }
                    mallRacunPageFragment.wl(num);
                }
                C74291TDr c74291TDr = this.LJLIL.LJZL;
                if (c74291TDr != null) {
                    c74291TDr.LIZ(C45804HyK.LJJI(8), C45804HyK.LJJI(8), 0.0f, 0.0f);
                }
            }
        } else if (booleanValue) {
            View view3 = this.LJLIL.LJLLJ;
            if (view3 != null) {
                C45804HyK.LJJLL(view3);
            }
        } else if (booleanValue2) {
            FrameLayout frameLayout3 = this.LJLIL.LJZ;
            if (frameLayout3 != null) {
                C45804HyK.LJJIJIIJIL(frameLayout3);
            }
            FrameLayout frameLayout4 = this.LJLIL.LJZI;
            if (frameLayout4 != null) {
                C45804HyK.LJJIJIIJIL(frameLayout4);
            }
            RecyclerView recyclerView2 = this.LJLIL.LJLZ;
            if (recyclerView2 != null) {
                C45804HyK.LJJIJIIJIL(recyclerView2);
            }
            C74291TDr c74291TDr2 = this.LJLIL.LJZL;
            if (c74291TDr2 != null) {
                c74291TDr2.LIZ(C45804HyK.LJJI(0), C45804HyK.LJJI(0), 0.0f, 0.0f);
            }
        }
        return C76800UCe.LIZ;
    }
}
