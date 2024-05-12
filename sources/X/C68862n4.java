package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl$inviteUserJoinTopic$2", f = "AddYoursServiceImpl.kt", l = {340}, m = "invokeSuspend")
/* renamed from: X.2n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68862n4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<Long> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68862n4(List<Long> list, long j, String str, InterfaceC67352kd<? super C68862n4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = j;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68862n4(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            List<Long> list = this.LJLILLLLZI;
            long j = this.LJLJI;
            String str = this.LJLJJI;
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            this.LJLIL = 1;
            if (C219908k6.LIZ().invite(ORZ.LLD(list, ",", null, null, null, 62), j, str, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
