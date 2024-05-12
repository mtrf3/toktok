package X;

import com.ss.android.ugc.aweme.nows.feed.event.NowEventRegistry;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostDeleteServiceImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostDeleteServiceImpl$delete$1", f = "NowPostDeleteService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194927ku extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ NowPostDeleteServiceImpl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194927ku(String str, NowPostDeleteServiceImpl nowPostDeleteServiceImpl, InterfaceC67352kd<? super C194927ku> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = nowPostDeleteServiceImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C194927ku(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        NowEventRegistry<C7MB> nowEventRegistry = C185117Oh.LIZIZ;
        nowEventRegistry.LIZ(new C7MB(this.LJLIL, 0));
        try {
            String aid = this.LJLIL;
            o.LJIIIZ(aid, "aid");
            C7X6.LIZJ().deleteItem(aid).execute();
            C78596Usy.LJJIFFI().LIZJ.LIZIZ(this.LJLIL);
            nowEventRegistry.LIZ(new C7MB(this.LJLIL, 1));
            String aid2 = this.LJLIL;
            o.LJIIIZ(aid2, "aid");
            XKX.LIZLLL((InterfaceC70422pa) C194937kv.LIZ.getValue(), null, null, new C194967ky(aid2, null), 3);
            XKX.LIZLLL(this.LJLILLLLZI.LIZ, EXV.LIZ, null, new C64202fY(null), 2);
        } catch (Exception unused) {
            C185117Oh.LIZIZ.LIZ(new C7MB(this.LJLIL, 2));
            XKX.LIZLLL(this.LJLILLLLZI.LIZ, EXV.LIZ, null, new C64212fZ(null), 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
