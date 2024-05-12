package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl$logSaveDraftEvent$1$1", f = "TiktokEffectCreatePipelineImpl.kt", l = {419, 424}, m = "invokeSuspend")
/* renamed from: X.amo, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94798amo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ CKEDraftInfo LJLJI;
    public final /* synthetic */ C145995oB LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94798amo(CKEDraftInfo cKEDraftInfo, C145995oB c145995oB, InterfaceC67352kd<? super C94798amo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = cKEDraftInfo;
        this.LJLJJI = c145995oB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94798amo(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    java.util.Map<String, String> map = this.LJLJJI.LIZ;
                    o.LJIIIIZZ(map, "builder()");
                    C78897Uxp.LJJJ("ame_save_effect_draft", map);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            absolutePath = (String) this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            CKEDraftInfo cKEDraftInfo = this.LJLJI;
            String absolutePath2 = OR7.LLLILZJ(new File(cKEDraftInfo.draftPath), cKEDraftInfo.effectPath).getAbsolutePath();
            File LJFF = C43073GvN.LJFF(C60903NvH.LJIIJJI().LJJIJL().getPathService(), EnumC43651HBf.ADVANCED_MOBILE_EFFECT, null, 6);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI.draftID);
            LIZ.append("_effect.zip");
            absolutePath = OR7.LLLILZJ(LJFF, X1D.LIZIZ(LIZ)).getAbsolutePath();
            XIA xia = C78613UtF.LIZJ;
            C94797amn c94797amn = new C94797amn(absolutePath, absolutePath2, null);
            this.LJLIL = absolutePath;
            this.LJLILLLLZI = 1;
            obj = XKX.LJI(xia, c94797amn, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJJI.LIZIZ(((Number) obj).longValue(), "effect_size");
        XIA xia2 = C78613UtF.LIZJ;
        C94796amm c94796amm = new C94796amm(absolutePath, null);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        if (XKX.LJI(xia2, c94796amm, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        java.util.Map<String, String> map2 = this.LJLJJI.LIZ;
        o.LJIIIIZZ(map2, "builder()");
        C78897Uxp.LJJJ("ame_save_effect_draft", map2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
