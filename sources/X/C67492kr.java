package X;

import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM$mobShowMask$1", f = "GeneralVideoMaskVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67492kr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ GeneralVideoMaskVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67492kr(GeneralVideoMaskVM generalVideoMaskVM, InterfaceC67352kd<? super C67492kr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = generalVideoMaskVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67492kr(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Aweme aweme;
        C141335gf.LIZJ(obj);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("scenario", "general");
        VideoItemParams gv0 = this.LJLIL.gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("group_id", str);
        FMX.LJIIL("tns_show_mask_layer", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
