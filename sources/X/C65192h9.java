package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView$startPlay$1$streamUrlStruct$1", f = "ECLynxLiveView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65192h9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super StreamUrlStruct>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65192h9(String str, InterfaceC67352kd<? super C65192h9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65192h9(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), this.LJLIL, C65330PkU.LIZJ(C65352Pkq.LJI(StreamUrlStruct.class)));
            if (!(fromJson instanceof StreamUrlStruct)) {
                fromJson = null;
            }
            return fromJson;
        } catch (s unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super StreamUrlStruct> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
