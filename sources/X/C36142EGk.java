package X;

import com.ss.android.ugc.aweme.poi.PokerBundle;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.channel.poker.EffectPokerHandler$handle$1", f = "EffectPokerHandler.kt", l = {53}, m = "invokeSuspend")
/* renamed from: X.EGk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36142EGk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36144EGm LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36142EGk(int i, C36144EGm c36144EGm, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36144EGm;
        this.LJLJI = i;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36142EGk(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
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
                C36144EGm c36144EGm = this.LJLILLLLZI;
                int i2 = this.LJLJI;
                String str = this.LJLJJI;
                this.LJLIL = 1;
                c36144EGm.getClass();
                Object LJI = XKX.LJI(C78613UtF.LIZJ, new C36145EGn(i2, c36144EGm, str, null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
                if (LJI == obj2) {
                    return obj2;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            H78.LJ(e);
            C36144EGm c36144EGm2 = this.LJLILLLLZI;
            long j = this.LJLJI;
            String jSONObject = c36144EGm2.LJ(1, new PokerBundle(null, null, null, null, null, 31, null)).toString();
            o.LJIIIIZZ(jSONObject, "generateResponse(STATUS_…PokerBundle()).toString()");
            c36144EGm2.LIZLLL(j, jSONObject);
        }
        return C76800UCe.LIZ;
    }
}
