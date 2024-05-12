package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatManager$dismissSingleReChat$1", f = "RecommendedChatManager.kt", l = {139}, m = "invokeSuspend")
/* renamed from: X.2zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76642zc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76642zc(String str, InterfaceC67352kd<? super C76642zc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76642zc(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long LIZLLL;
        C68322mC c68322mC;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                LIZLLL = this.LJLIL;
                c68322mC = this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            LIZLLL = C81273Gx.LIZLLL(this.LJLJJI);
            c68322mC = new C68322mC();
            c68322mC.element = "";
            if (LIZLLL > 0) {
                C76662ze c76662ze = C76662ze.LJLIL;
                String str = this.LJLJJI;
                int value = EnumC76652zd.REMOVE_RECOMMENDED_FLAG.getValue();
                this.LJLILLLLZI = c68322mC;
                this.LJLIL = LIZLLL;
                this.LJLJI = 1;
                c76662ze.getClass();
                if (C76662ze.LJIILIIL(value, str, null, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        C76662ze.LJLIL.getClass();
        Iterator it = ((ArrayList) C76662ze.LJII()).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!o.LJ(str2, String.valueOf(LIZLLL))) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((String) c68322mC.element);
                LIZ.append(str2);
                LIZ.append('_');
                c68322mC.element = X1D.LIZIZ(LIZ);
            }
        }
        C76582zW.LJ((String) c68322mC.element);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
