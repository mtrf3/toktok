package X;

import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$handleChallengeId$2", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HCK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ EditConfig LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCK(EditConfig editConfig, InterfaceC67352kd<? super HCK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = editConfig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HCK(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            EditConfig editConfig = this.LJLIL;
            List<String> challengeIds = editConfig.getChallengeIds();
            ArrayList arrayList = null;
            if (challengeIds != null) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(challengeIds, 10));
                for (String str : challengeIds) {
                    ((HBO) C44172HVg.LIZLLL).getClass();
                    new HWD();
                    arrayList2.add(HWD.LIZ(ChallengeApi.LIZ(0, str, null, false).challenge));
                }
                arrayList = arrayList2;
            }
            editConfig.setChallenges(arrayList);
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
