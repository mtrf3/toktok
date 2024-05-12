package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import kotlin.jvm.internal.AqS0S0020100_9;
import kotlin.jvm.internal.AqS15S2100000_6;
import kotlin.jvm.internal.AqS1S2001000_9;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.AqS49S0110000_6;
import org.json.JSONObject;

/* renamed from: X.Lyj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56021Lyj implements InterfaceC56083Lzj {
    public final /* synthetic */ ShopMainContentAssem LIZ;

    @Override // X.InterfaceC56083Lzj
    public final void LJIILJJIL() {
        this.LIZ.v3().LIZ(EnumC56059LzL.TEMPLATE_ERROR_RETRY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        continue;
     */
    @Override // X.InterfaceC56083Lzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C56085Lzl LJIIZILJ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem r0 = r8.LIZ
            androidx.fragment.app.Fragment r0 = X.C212428Vi.LIZLLL(r0)
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L1b
            boolean r0 = r0.isVisible()
            if (r0 != r3) goto L1b
            com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem r0 = r8.LIZ
            r4 = 2131374464(0x7f0a3180, float:1.8369048E38)
            android.view.View r0 = r0._$_findCachedViewById(r4)
            if (r0 != 0) goto L21
        L1b:
            X.Lzl r0 = new X.Lzl
            r0.<init>(r1, r1, r3)
            return r0
        L21:
            r2 = 2
            int[] r1 = new int[r2]
            com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem r0 = r8.LIZ
            android.view.View r0 = r0._$_findCachedViewById(r4)
            if (r0 == 0) goto L2f
            r0.getLocationInWindow(r1)
        L2f:
            r1 = r1[r3]
            com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem r0 = r8.LIZ
            android.view.View r0 = r0._$_findCachedViewById(r4)
            int r7 = r0.getHeight()
            int r7 = r7 + r1
            int[] r6 = new int[r2]
            com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem r0 = r8.LIZ
            r0.getClass()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            android.view.View r0 = r0._$_findCachedViewById(r4)
            r5.add(r0)
        L4f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L82
            java.lang.Object r2 = r5.poll()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L4f
            Y.IDObjectS330S0100000_9 r1 = new Y.IDObjectS330S0100000_9
            r0 = 1
            r1.<init>(r2, r0)
            java.util.Iterator r2 = r1.iterator()
        L67:
            r1 = r2
            X.Lz2 r1 = (X.C56040Lz2) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r1.next()
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L9f
            r5.clear()
            if (r1 == 0) goto L82
            r1.getLocationInWindow(r6)
        L82:
            r0 = r6[r3]
            int r7 = r7 - r0
            com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem r0 = r8.LIZ
            android.view.View r0 = r0._$_findCachedViewById(r4)
            boolean r0 = r0.canScrollVertically(r3)
            r2 = r0 ^ 1
            X.Lzl r1 = new X.Lzl
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            int r0 = X.C79081V1x.LJJIIZI(r0)
            r1.<init>(r2, r0, r3)
            return r1
        L9f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L67
            r5.add(r1)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56021Lyj.LJIIZILJ():X.Lzl");
    }

    @Override // X.InterfaceC56083Lzj
    public final String LJIJI() {
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public C56021Lyj(ShopMainContentAssem shopMainContentAssem) {
        this.LIZ = shopMainContentAssem;
    }

    @Override // X.InterfaceC56083Lzj
    public final void LJIILL(String str) {
        ShopMainContentAssem shopMainContentAssem = this.LIZ;
        shopMainContentAssem.getClass();
        Fragment LIZLLL = C212428Vi.LIZLLL(shopMainContentAssem);
        if (LIZLLL == null || !LIZLLL.isAdded() || LIZLLL.isDetached()) {
            return;
        }
        ShopMainViewModel x3 = this.LIZ.x3();
        x3.getClass();
        x3.LJLJJLL = str;
    }

    @Override // X.InterfaceC56083Lzj
    public final void LJIILLIIL(java.util.Map<String, String> map) {
        if (!map.isEmpty()) {
            ShopMainViewModel x3 = this.LIZ.x3();
            x3.getClass();
            x3.LJLJL = map;
        }
    }

    @Override // X.InterfaceC56083Lzj
    public final void LJIJJ(String str) {
        this.LIZ.v3().LJLL = str;
    }

    @Override // X.InterfaceC56083Lzj
    public final void LJIJ(java.util.Map map, boolean z) {
        ShopMainContentAssem shopMainContentAssem = this.LIZ;
        shopMainContentAssem.getClass();
        Fragment LIZLLL = C212428Vi.LIZLLL(shopMainContentAssem);
        if (LIZLLL == null || !LIZLLL.isAdded() || LIZLLL.isDetached()) {
            return;
        }
        this.LIZ.LJLILLLLZI.getValue().setState(new AqS49S0110000_6(z, map, 1));
    }

    @Override // X.InterfaceC56083Lzj
    public final void LJIJJLI(boolean z, boolean z2) {
        String str;
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ.v3().LJLIL;
        c56045Lz7.getClass();
        C76542zS.LIZJ("rd_tiktokec_mall_market_load_dur", new AqS0S0020100_9(currentTimeMillis, z, z2, 0));
        C76542zS.LIZJ("rd_tiktokec_mall_recommend_load_dur", new AqS0S0020100_9(System.currentTimeMillis() - this.LIZ.v3().LJLIL, z, z2, 1));
        if (!this.LIZ.v3().LJLILLLLZI) {
            this.LIZ.v3().LJLILLLLZI = true;
            String str2 = this.LIZ.v3().LJLL;
            if (this.LIZ.v3().LJLJJL == EnumC55971Lxv.NEW) {
                str = "tools_in";
            } else {
                str = "tools_out";
            }
            int i = this.LIZ.v3().LJLJI;
            String str3 = this.LIZ.v3().LJZ;
            C76542zS.LIZJ("tiktokec_enter_page", new AqS1S2001000_9(str2, str, i, 1));
            C76542zS.LIZJ("rd_tiktokec_enter_mall", new AqS32S1000000_9(str3, 7));
            String str4 = this.LIZ.v3().LJLJL;
            if (str4 != null) {
                ShopMainContentAssem shopMainContentAssem = this.LIZ;
                FCG fcg = FCH.LIZIZ;
                EnumC56031Lyt enumC56031Lyt = EnumC56031Lyt.FIRST_SCREEN;
                JSONObject LIZ = C56048LzA.LIZ(enumC56031Lyt, str4);
                fcg.getClass();
                FCG.LIZ("ec_mall_deeplink", LIZ);
                C76542zS.LIZJ("rd_tiktokec_deeplink_event_send", new AqS15S2100000_6(str4, enumC56031Lyt.getValue(), (String) C55909Lwv.LIZJ(str4), (java.util.Map<String, String>) 0));
                shopMainContentAssem.v3().LJLJL = null;
            }
        }
        ShopMainContentAssem shopMainContentAssem2 = this.LIZ;
        shopMainContentAssem2.LJLJJL = true;
        shopMainContentAssem2.LJLJJLL = z;
        shopMainContentAssem2.LJLJL = z2;
        shopMainContentAssem2.A3();
    }
}
