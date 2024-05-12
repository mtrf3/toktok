package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeCacheVideoManager$cacheVideos$1$urlKey$2$1", f = "OfflineModeCacheVideoManager.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AQR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQR(Aweme aweme, InterfaceC67352kd<? super AQR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AQR(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                String aid = this.LJLILLLLZI.getAid();
                o.LJIIIIZZ(aid, "it.aid");
                this.LJLIL = 1;
                InterfaceC26200AQa LIZJ = AQY.LIZJ();
                String curSecUserId = AQY.LIZ.getCurSecUserId();
                if (curSecUserId == null) {
                    obj = new Integer(0);
                } else {
                    obj = new Integer(LIZJ.LJIIJJI(System.currentTimeMillis(), curSecUserId, aid));
                }
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            if (((Number) obj).intValue() > 0) {
                AQW.LIZ.getClass();
                AQO.LJI(AQW.LJI() / 1024.0d);
                AQO.LJII(AQY.LIZIZ());
                if (AQO.LIZIZ() >= AQO.LIZ()) {
                    if (AQO.LIZJ() == C9SN.DOWNLOADING) {
                        AQW.LJIIIZ(C9SO.DOWNLOAD_FINISH.getValue());
                    }
                    AQO.LJIIIIZZ(C9SN.DOWNLOADED);
                }
                C26222AQw c26222AQw = AQW.LIZLLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update cache state ");
                LIZ.append(this.LJLILLLLZI.getAid());
                c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ));
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
