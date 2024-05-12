package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment$checkAweStatus$2$1", f = "VideoCreationTailFragment.kt", l = {681, 686}, m = "invokeSuspend")
/* renamed from: X.3eS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89003eS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoCreationTailFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89003eS(VideoCreationTailFragment videoCreationTailFragment, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C89003eS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoCreationTailFragment;
        this.LJLJI = str;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C89003eS(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AwemeDetailList awemeDetailList;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            C34B.LJ("VideoCreationTailFragment", e);
            awemeDetailList = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.vl().LJLILLLLZI = SystemClock.elapsedRealtime();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            LIZ.append(this.LJLJI);
            LIZ.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ);
            this.LJLIL = 1;
            obj = C30U.LIZIZ(LIZIZ, "", this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        awemeDetailList = (AwemeDetailList) obj;
        XIF xif = EXV.LIZ;
        C88993eR c88993eR = new C88993eR(awemeDetailList, this.LJLILLLLZI, this.LJLJJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(xif, c88993eR, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
