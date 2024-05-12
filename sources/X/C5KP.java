package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.prepare.VEEditorUtils$optimizeMediaSize$1", f = "VEEditorUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5KP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C5KT LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ Integer LJLJLJ;
    public final /* synthetic */ int[] LJLJLLL;
    public final /* synthetic */ int[] LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5KP(Context context, String str, int i, int i2, C5KT c5kt, String str2, String str3, Integer num, int[] iArr, int[] iArr2, InterfaceC67352kd<? super C5KP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = c5kt;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = num;
        this.LJLJLLL = iArr;
        this.LJLL = iArr2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5KP(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        Context context = this.LJLIL;
        String str = this.LJLILLLLZI;
        mediaUtil.getClass();
        if (MediaUtil.LIZIZ(context, str)) {
            C145765no.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        } else {
            Context context2 = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            C145765no.LIZJ(this.LJLJI, this.LJLJJI, context2, this.LJLJJL, this.LJLJLJ, str2, this.LJLJJLL, this.LJLJL, this.LJLJLLL, this.LJLL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
