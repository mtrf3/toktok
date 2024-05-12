package X;

import android.net.Uri;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$createProduct$1", f = "QuickProductSlot.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75052x3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71256Rxs LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75052x3(C71256Rxs c71256Rxs, String str, InterfaceC67352kd<? super C75052x3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71256Rxs;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75052x3(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Uri.Builder appendQueryParameter = UriProtector.parse(this.LJLIL.LJLLILLLL).buildUpon().appendQueryParameter("screenshot_path", new File(this.LJLILLLLZI).toURI().toString());
            Room room = this.LJLIL.LJLLI;
            if (room != null) {
                appendQueryParameter.appendQueryParameter("room_id", String.valueOf(room.getId()));
            }
            SmartRouter.buildRoute(this.LJLIL.LJLIL, appendQueryParameter.build().toString()).open();
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
