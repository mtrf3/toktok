package X;

import android.content.Context;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig;
import fjb.a;
import java.io.File;
import java.io.FileReader;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBean$parseEffectTextRes$2", f = "EffectTextBean.kt", l = {45}, m = "invokeSuspend")
/* renamed from: X.6Hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157856Hl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C157776Hd LJLILLLLZI;
    public final /* synthetic */ List<C157916Hr> LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157856Hl(C157776Hd c157776Hd, List<C157916Hr> list, Context context, InterfaceC67352kd<? super C157856Hl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c157776Hd;
        this.LJLJI = list;
        this.LJLJJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C157856Hl(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
                if (!this.LJLILLLLZI.LJLJI.ifStandard) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(this.LJLILLLLZI.effect.getUnzipPath());
                    LIZ.append(File.separator);
                    LIZ.append("effect_text.json");
                    OuterEffectTextLayoutConfig outerEffectTextLayoutConfig = (OuterEffectTextLayoutConfig) C6PB.LIZIZ().LJ(new FileReader(X1D.LIZIZ(LIZ)), OuterEffectTextLayoutConfig.class);
                    XIF xif = EXT.LIZ;
                    WHH whh = new WHH(this.LJLJI, this.LJLILLLLZI, outerEffectTextLayoutConfig, this.LJLJJI, null);
                    this.LJLIL = 1;
                    if (XKX.LJI(xif, whh, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
            return C76800UCe.LIZ;
        } catch (Exception e) {
            C6PB.LIZJ().LIZIZ(e);
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
