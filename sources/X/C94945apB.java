package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$showSavaDraftDlg$3$onConfirm$1$etData$1", f = "MainFragment.kt", l = {331}, m = "invokeSuspend")
/* renamed from: X.apB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94945apB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super EffectPackageData>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C94946apC LJLJI;
    public final /* synthetic */ C68322mC LJLJJI;
    public final /* synthetic */ C68322mC LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94945apB(C94946apC c94946apC, C68322mC c68322mC, C68322mC c68322mC2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c94946apC;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c68322mC2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94945apB(this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super EffectPackageData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EffectPackageData Ml;
        String str;
        String str2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                Ml = (EffectPackageData) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Ml = this.LJLJI.LJLJJI.LIZ.Ml();
            C94010aa6.LIZIZ(Ml, 1);
            CKEDraftInfo cKEDraftInfo = (CKEDraftInfo) this.LJLJJI.element;
            String str3 = "";
            if (cKEDraftInfo == null || (str = cKEDraftInfo.draftPath) == null) {
                str = "";
            }
            if (new File(str).exists()) {
                MainFragment mainFragment = this.LJLJI.LJLJJI.LIZ;
                CKEDraftInfo cKEDraftInfo2 = (CKEDraftInfo) this.LJLJJI.element;
                if (cKEDraftInfo2 != null && (str2 = cKEDraftInfo2.draftPath) != null) {
                    str3 = str2;
                }
                this.LJLIL = Ml;
                this.LJLILLLLZI = 1;
                if (mainFragment.Hl(Ml, str3, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        C93677aUj.LJIIIIZZ((String) this.LJLJJL.element, Ml);
        return Ml;
    }
}
