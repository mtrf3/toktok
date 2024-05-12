package X;

import android.app.Activity;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.reedit.EditPostMusicHelper$onEditMusic$1$result$1", f = "EditPostMusicHelper.kt", l = {46}, m = "invokeSuspend")
/* renamed from: X.2kJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67152kJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends String>>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67152kJ(Context context, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67152kJ(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
                C78774Uvq c78774Uvq = C72602t6.LIZ;
                List<String> list = this.LJLILLLLZI;
                if (list == null) {
                    list = C47261Igj.LJJIJ("");
                }
                this.LJLIL = 1;
                obj = c78774Uvq.LIZ(list, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return (List) obj;
        } catch (Throwable unused) {
            Activity LJIILLIIL = C78555UsJ.LJIILLIIL(this.LJLJI);
            o.LJIIIIZZ(LJIILLIIL, "getActivity(context)");
            C26045AKb c26045AKb = new C26045AKb(LJIILLIIL);
            c26045AKb.LJIIIIZZ(R.string.im9);
            c26045AKb.LJIIJ();
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
