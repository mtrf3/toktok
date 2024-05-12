package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeCacheVideoManager$cacheVideos$1$1", f = "OfflineModeCacheVideoManager.kt", l = {171}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AQT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQT(Aweme aweme, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AQT(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                if (this.LJLILLLLZI != null) {
                    String aid = this.LJLJI.getAid();
                    o.LJIIIIZZ(aid, "it.aid");
                    String str = this.LJLILLLLZI;
                    this.LJLIL = 1;
                    InterfaceC26200AQa LIZJ = AQY.LIZJ();
                    String curSecUserId = AQY.LIZ.getCurSecUserId();
                    if (curSecUserId == null) {
                        num = new Integer(0);
                    } else {
                        num = new Integer(LIZJ.LIZ(curSecUserId, aid, str));
                    }
                    if (num == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        } catch (Exception e) {
            AQW.LIZLLL.LIZLLL(String.valueOf(e));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
