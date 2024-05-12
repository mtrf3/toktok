package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$tryShowCleanStorageUI$1$2$1", f = "DraftFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DraftFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLJ(DraftFragment draftFragment, InterfaceC67352kd<? super GLJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = draftFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLJ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ActivityC45651qj mo49getActivity;
        String str;
        C141335gf.LIZJ(obj);
        DraftFragment draftFragment = this.LJLIL;
        if (!draftFragment.LJLJJLL && (mo49getActivity = draftFragment.mo49getActivity()) != null) {
            try {
                AKH akh = new AKH(mo49getActivity);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_exclamation_mark_circle;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
                A21 a21 = akh.LIZ;
                Context context = akh.LIZIZ;
                if (context != null) {
                    str = context.getString(R.string.cfd);
                } else {
                    str = null;
                }
                a21.LJ = str;
                akh.LIZ.LIZIZ = 86400000L;
                int LIZJ = (int) KL2.LIZJ(mo49getActivity, 12.0f);
                A21 a212 = akh.LIZ;
                a212.LJIIIIZZ = LIZJ;
                a212.LJIIIZ = 0;
                draftFragment.LLFZ = akh;
                akh.LIZIZ();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "draft");
                c188727au.LJIIIZ("type", "draft_storage");
                FMX.LJIIL("clean_storage_toast", c188727au.LIZ);
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "draft");
                c188727au2.LJIIIZ("type", "draft_storage");
                FMX.LJIIL("storage_toast_clean", c188727au2.LIZ);
            } catch (Exception e) {
                C60903NvH.LJIIJJI().LJJIIJ();
                H78.LIZJ(e.getLocalizedMessage());
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
