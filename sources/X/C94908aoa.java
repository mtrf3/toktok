package X;

import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.ies.effectcreator.swig.ProjectCreateFrom;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.bytedance.ugc.effectcreator.main.MainViewModel;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import fjb.a;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$applyTemplate$1", f = "MainFragment.kt", l = {1483}, m = "invokeSuspend")
/* renamed from: X.aoa, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94908aoa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MainFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94908aoa(MainFragment mainFragment, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mainFragment;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94908aoa(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            StatisticReporter LIZ = C93670aUc.LIZ();
            if (LIZ != null) {
                LIZ.onEvent("addsheet_template_apply", C51029K0z.LJJIIZI(new OSZ("template_id", this.LJLJI)));
            }
            MainViewModel Ol = this.LJLILLLLZI.Ol();
            String str = this.LJLJJI;
            this.LJLIL = 1;
            Ol.getClass();
            if (XKX.LJI(C78613UtF.LIZJ, new C94900aoS(str, null), this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C93677aUj.LIZIZ = "template";
        C93677aUj.LIZJ = "template";
        if (CKEffectEditorContext.LJII(this.LJLJJI, true, ProjectCreateFrom.ProjectCreateFrom_Template, new C94332afI(this))) {
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
                intent.putExtra("draft_type", 17);
                intent.putExtra("key_template_id", this.LJLJI);
                intent.putExtra("template_res_id", this.LJLJJL);
            }
            LifecycleOwner viewLifecycleOwner = this.LJLILLLLZI.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            CKEffectEditorContext.LIZJ(viewLifecycleOwner, new IDqS423S0100000_42(this, 143));
        } else {
            this.LJLILLLLZI.requireActivity().finish();
        }
        return C76800UCe.LIZ;
    }
}
