package X;

import android.content.Context;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutTemplateComponent$compressSingleVideo$2", f = "AutoCutTemplateComponent.kt", l = {377}, m = "invokeSuspend")
/* renamed from: X.2mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68732mr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ Context LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68732mr(Context context, int i, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = context;
        this.LJLJL = str;
        this.LJLJLJ = str2;
        this.LJLJLLL = str3;
        this.LJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68732mr(this.LJLJJLL, this.LJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Context context = this.LJLJJLL;
            String str = this.LJLJL;
            String str2 = this.LJLJLJ;
            String str3 = this.LJLJLLL;
            int i2 = this.LJLL;
            this.LJLIL = context;
            this.LJLILLLLZI = str;
            this.LJLJI = str2;
            this.LJLJJI = str3;
            this.LJLJJL = 1;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            HKU.LIZ(context, str, str2, str3, new int[]{0}, new int[]{i2}, new QXX() { // from class: X.2ms
                @Override // X.QXX
                public final void LLLL(String inputPath, String outputPath) {
                    o.LJIIIZ(inputPath, "inputPath");
                    o.LJIIIZ(outputPath, "outputPath");
                    InterfaceC67352kd<Boolean> interfaceC67352kd = c84654XKg;
                    Boolean bool = Boolean.TRUE;
                    C3C5.m7constructorimpl(bool);
                    interfaceC67352kd.resumeWith(bool);
                }

                @Override // X.QXX
                public final void LLJLLL(String str4, String str5, String str6) {
                    HH1.LIZ(str4, "inputPath", str5, "outputPath", str6, "errorInfo");
                    super.LLJLLL(str4, str5, str6);
                    InterfaceC67352kd<Boolean> interfaceC67352kd = c84654XKg;
                    Boolean bool = Boolean.TRUE;
                    C3C5.m7constructorimpl(bool);
                    interfaceC67352kd.resumeWith(bool);
                }
            });
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
