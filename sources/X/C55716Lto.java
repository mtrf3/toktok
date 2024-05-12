package X;

import Y.IDfS130S0100000_9;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import kotlin.jvm.internal.AqS62S1100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.PermissionPopupChecker$newAuthDialogCenter$1", f = "PermissionPopupChecker.kt", l = {185}, m = "invokeSuspend")
/* renamed from: X.Lto, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55716Lto extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ Aweme LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55716Lto(ActivityC45651qj activityC45651qj, Aweme aweme, InterfaceC67352kd<? super C55716Lto> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = activityC45651qj;
        this.LJLJJI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55716Lto c55716Lto = new C55716Lto(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c55716Lto.LJLILLLLZI = obj;
        return c55716Lto;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        InterfaceC70542pm LJJII;
        C3C3 LIZJ;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            Intent intent = this.LJLJI.getIntent();
            if (intent.getBooleanExtra("is_start_by_login", false) || intent.getBooleanExtra("from_new_user_journey", false) || intent.getBooleanExtra("is_start_by_switch_account", false)) {
                z = true;
            } else {
                z = false;
            }
            boolean LIZIZ = C77266UUc.LIZIZ.LIZLLL().LIZIZ();
            Aweme aweme = this.LJLJJI;
            if (aweme == null || C63081OpJ.LLIIII(aweme) || aweme.isAd()) {
                z2 = true;
            } else {
                z2 = false;
            }
            String LIZJ2 = C55714Ltm.LIZJ(this.LJLJI);
            if (!z && !z2 && !LIZIZ && C57122Ma.LIZ && (LJJII = C78609UtB.LJJII(this.LJLJI, new AqS62S1100000_9(interfaceC70422pa, LIZJ2, 13))) != null && (LIZJ = ((C77202URq) LJJII).LIZJ()) != null) {
                IDfS130S0100000_9 iDfS130S0100000_9 = new IDfS130S0100000_9(this.LJLJI, 9);
                this.LJLIL = 1;
                if (LIZJ.collect(iDfS130S0100000_9, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        C77266UUc.LIZIZ.LIZLLL().LIZLLL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
