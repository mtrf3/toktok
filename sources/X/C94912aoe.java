package X;

import android.content.Intent;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$editorContextInitialize$1$1$1", f = "MainFragment.kt", l = {440}, m = "invokeSuspend")
/* renamed from: X.aoe, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94912aoe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C94913aof LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94912aoe(String str, InterfaceC67352kd interfaceC67352kd, C94913aof c94913aof) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = c94913aof;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94912aoe(this.LJLILLLLZI, completion, this.LJLJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer valueOf;
        String str;
        Intent intent;
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
            C93677aUj c93677aUj = C93677aUj.LJ;
            String str2 = this.LJLJI.LJLJI;
            this.LJLIL = 1;
            if (c93677aUj.LIZJ(str2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        MainFragment mainFragment = this.LJLJI.LJLILLLLZI;
        mainFragment.getClass();
        String str3 = "unkown";
        if (o.LJ(C93677aUj.LIZIZ, "unkown")) {
            ActivityC45651qj requireActivity = mainFragment.requireActivity();
            if (requireActivity != null && (intent = requireActivity.getIntent()) != null && 17 == intent.getIntExtra("draft_type", 0)) {
                str = "template";
            } else {
                str = "new_create";
            }
            C93677aUj.LIZIZ = str;
        }
        this.LJLJI.LJLILLLLZI.onEventEnter(this.LJLILLLLZI);
        MainFragment mainFragment2 = this.LJLJI.LJLILLLLZI;
        mainFragment2.getClass();
        ActivityC45651qj requireActivity2 = mainFragment2.requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        Intent intent2 = requireActivity2.getIntent();
        if (intent2 != null && (valueOf = Integer.valueOf(intent2.getIntExtra("draft_type", 0))) != null) {
            if (valueOf.intValue() == 16) {
                str3 = "draft";
            } else if (valueOf.intValue() == 17) {
                str3 = "template";
            } else if (valueOf.intValue() == 0) {
                str3 = "new_create";
            }
        }
        C93677aUj.LIZJ = str3;
        return C76800UCe.LIZ;
    }
}
