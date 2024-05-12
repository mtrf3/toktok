package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog$show$1", f = "LiveProfileDialog.kt", l = {224}, m = "invokeSuspend")
/* renamed from: X.Bhc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29480Bhc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveProfileDialog LJLILLLLZI;
    public final /* synthetic */ C29471BhT LJLJI;
    public final /* synthetic */ FragmentManager LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29480Bhc(LiveProfileDialog liveProfileDialog, C29471BhT c29471BhT, FragmentManager fragmentManager, String str, InterfaceC67352kd<? super C29480Bhc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveProfileDialog;
        this.LJLJI = c29471BhT;
        this.LJLJJI = fragmentManager;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29480Bhc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            LiveProfileDialog liveProfileDialog = this.LJLILLLLZI;
            C29471BhT c29471BhT = this.LJLJI;
            FragmentManager fragmentManager = this.LJLJJI;
            String str = this.LJLJJL;
            this.LJLIL = 1;
            if (liveProfileDialog.vl(c29471BhT, fragmentManager, str, this) == enumC58928NAu) {
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
