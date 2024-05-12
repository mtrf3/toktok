package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragmentPanel;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.LjE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55060LjE extends C78588Usq {
    public final /* synthetic */ MallRacunPageFragment LJLILLLLZI;

    public C55060LjE(MallRacunPageFragment mallRacunPageFragment) {
        this.LJLILLLLZI = mallRacunPageFragment;
    }

    @Override // X.C78588Usq, X.PRT
    public final void LIZIZ(String type) {
        C80796VnM c80796VnM;
        InterfaceC55057LjB LIZIZ;
        o.LJIIIZ(type, "type");
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LJLILLLLZI.LLFF;
        InterfaceC55062LjG interfaceC55062LjG = null;
        if (mallRacunFragmentPanel != null) {
            c80796VnM = mallRacunFragmentPanel.getViewPager();
        } else {
            c80796VnM = null;
        }
        MallRacunFragmentPanel mallRacunFragmentPanel2 = this.LJLILLLLZI.LLFF;
        if (mallRacunFragmentPanel2 != null) {
            interfaceC55062LjG = mallRacunFragmentPanel2.getAdapter();
        }
        if (c80796VnM != null && interfaceC55062LjG != null && (LIZIZ = C40443Fu3.LIZIZ(type)) != null) {
            int currentItem = c80796VnM.getCurrentItem();
            Aweme item = interfaceC55062LjG.getItem(currentItem);
            String num = Integer.toString(currentItem);
            o.LJIIIIZZ(num, "toString(position)");
            LIZIZ.LIZ("launch_vv", num);
            LIZIZ.LIZ("current_video", C40438Fty.LIZ(item));
        }
    }

    @Override // X.C78588Usq, X.PRT
    public final void onStop(String type) {
        C80796VnM c80796VnM;
        InterfaceC55057LjB LIZIZ;
        o.LJIIIZ(type, "type");
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LJLILLLLZI.LLFF;
        InterfaceC55062LjG interfaceC55062LjG = null;
        if (mallRacunFragmentPanel != null) {
            c80796VnM = mallRacunFragmentPanel.getViewPager();
        } else {
            c80796VnM = null;
        }
        MallRacunFragmentPanel mallRacunFragmentPanel2 = this.LJLILLLLZI.LLFF;
        if (mallRacunFragmentPanel2 != null) {
            interfaceC55062LjG = mallRacunFragmentPanel2.getAdapter();
        }
        if (c80796VnM != null && interfaceC55062LjG != null && (LIZIZ = C40443Fu3.LIZIZ(type)) != null) {
            LIZIZ.LIZ("next_video", C40438Fty.LIZ(interfaceC55062LjG.getItem(c80796VnM.getCurrentItem())));
        }
    }
}
