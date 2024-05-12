package X;

import Y.IDeS151S0200000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardConfig;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.ForwardStreamEditSettingConfig;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$resolve$2", f = "Forward2StoryEnvironment.kt", l = {133, 365}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ ForwardMedia LJLJI;
    public final /* synthetic */ ForwardConfig LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYI(Context context, ForwardMedia forwardMedia, ForwardConfig forwardConfig, InterfaceC67352kd<? super GYI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = context;
        this.LJLJI = forwardMedia;
        this.LJLJJI = forwardConfig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GYI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC65462ha c3cj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            GYP.LIZIZ = C44428Hc8.LIZ();
            GYP.LIZJ = new C44428Hc8();
            GYP.LIZLLL = new C44428Hc8();
            GYP.LJ = new C44428Hc8();
            XIA xia = C78613UtF.LIZJ;
            GLG glg = new GLG(null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, glg, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ProgressDialogC43239Gy3 LIZJ = C42034Gec.LIZJ(this.LJLILLLLZI, EnumC42288Gii.VISIBLE_AFTER_5S, new GYN());
        Context context = this.LJLILLLLZI;
        LIZJ.setIndeterminate(true);
        LIZJ.setMessage(context.getString(R.string.r6l));
        LIZJ.setCancelable(false);
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", LIZJ, new Object[0], "void", new C65300Pk0(false, "()V", "-2339161851400772643")).LIZ) {
            LIZJ.show();
        }
        GYP.LIZLLL(true);
        CreativeInfo LJJJJJ = C44384HbQ.LJJJJJ();
        GYP.LJFF(this.LJLJI, LJJJJJ, this.LJLJJI);
        Context context2 = this.LJLILLLLZI;
        ForwardMedia forwardMedia = this.LJLJI;
        ForwardConfig forwardConfig = this.LJLJJI;
        if (((ForwardStreamEditSettingConfig) C41720GYy.LIZIZ.getValue()).enableStreamEdit) {
            c3cj = new GYJ(V1M.LJIILLIIL(new GYF(forwardMedia, null), new C3C3(new GY7(forwardMedia, null))), LJJJJJ, forwardMedia, forwardConfig, context2);
        } else {
            c3cj = new C3CJ(new C3C3(new C41692GXw(null)), V1M.LJIILLIIL(new GYH(forwardMedia, null), new C3C3(new GY7(forwardMedia, null))), new C41693GXx(context2, LJJJJJ, forwardConfig, forwardMedia, null));
        }
        InterfaceC65462ha LJIIZILJ = V1M.LJIIZILJ(EXT.LIZ, new IDeS151S0200000_10(V1M.LJIIZILJ(C78613UtF.LIZJ, c3cj), new GYM(LIZJ, null), 0));
        GYO gyo = new GYO(this.LJLILLLLZI, this.LJLJI, LIZJ);
        this.LJLIL = 2;
        if (LJIIZILJ.collect(gyo, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
