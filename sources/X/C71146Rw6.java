package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.Product;
import kotlin.jvm.internal.o;

/* renamed from: X.Rw6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71146Rw6 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC70422pa, C76800UCe> {
    public final /* synthetic */ OecInitData LJLIL;
    public final /* synthetic */ C71151RwB LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Fragment LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71146Rw6(OecInitData oecInitData, C71151RwB c71151RwB, Room room, boolean z, LivePlayFragment livePlayFragment) {
        super(1);
        this.LJLIL = oecInitData;
        this.LJLILLLLZI = c71151RwB;
        this.LJLJI = room;
        this.LJLJJI = z;
        this.LJLJJL = livePlayFragment;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC70422pa coroutineScope) {
        OecInitData oecInitData;
        Product product;
        String LIZ;
        o.LJIIIZ(coroutineScope, "coroutineScope");
        OecInitData oecInitData2 = this.LJLIL;
        int i = oecInitData2.productNum;
        int i2 = oecInitData2.displayProductNum;
        if (i > 0 || i2 > 0) {
            C71139Rvz c71139Rvz = this.LJLILLLLZI.LIZ;
            if (c71139Rvz != null) {
                Room room = this.LJLJI;
                boolean z = this.LJLJJI;
                o.LJIIIZ(room, "room");
                if (z) {
                    c71139Rvz.LIZJ = XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C71137Rvx(c71139Rvz, room, null), 3);
                }
                XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C71136Rvw(c71139Rvz, z, room, null), 3);
            }
            ECommerceService.createIECommerceServicebyMonsterPlugin(false).onEnterEcommerceLiveRoom(this.LJLJJL);
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZ), null, null, new C71155RwF(this.LJLIL, this.LJLJI, this.LJLILLLLZI, null), 3);
        } else if (this.LJLJJI) {
            C71144Rw4.LIZ(String.valueOf(this.LJLJI.getId()), null);
        }
        if (this.LJLJJL.getContext() != null && (product = (oecInitData = this.LJLIL).product) != null && (LIZ = product.LIZ()) != null) {
            int LJIIL = C43001GuD.LJIIL(oecInitData.pinCardMinimalism);
            C70870Rre.LIZ(Integer.valueOf(LJIIL), Integer.valueOf(LJIIL), LIZ);
        }
        return C76800UCe.LIZ;
    }
}
