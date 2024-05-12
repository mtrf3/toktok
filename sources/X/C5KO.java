package X;

import android.content.Context;
import com.ss.android.vesdk.VEEditor;
import fjb.a;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.templatedownload.ResizeMediasManager$resizeSingleMedia$job$1", f = "ResizeMediasManager.kt", l = {139}, m = "invokeSuspend")
/* renamed from: X.5KO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int[] LJLJL;
    public final /* synthetic */ int[] LJLJLJ;
    public final /* synthetic */ C68322mC<VEEditor> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5KO(boolean z, Context context, String str, String str2, String str3, int[] iArr, int[] iArr2, C68322mC<VEEditor> c68322mC, InterfaceC67352kd<? super C5KO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = context;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = iArr;
        this.LJLJLJ = iArr2;
        this.LJLJLLL = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5KO(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
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
            if (this.LJLILLLLZI) {
                Context context = this.LJLJI;
                String inputPath = this.LJLJJI;
                o.LJIIIIZZ(inputPath, "inputPath");
                C145765no.LIZ(context, inputPath, 1080, 1080, new C45439HsR(), this.LJLJJL);
            } else {
                Context context2 = this.LJLJI;
                String str = this.LJLJJLL;
                String inputPath2 = this.LJLJJI;
                o.LJIIIIZZ(inputPath2, "inputPath");
                String str2 = this.LJLJJL;
                int[] iArr = this.LJLJL;
                int[] iArr2 = this.LJLJLJ;
                AqS56S1100000_2 aqS56S1100000_2 = new AqS56S1100000_2(this.LJLJJI, this.LJLJLLL, 5);
                this.LJLIL = 1;
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                aqS56S1100000_2.invoke(C145765no.LIZJ(1080, 1080, context2, new C45437HsP(new AqS168S0100000_2(c84654XKg, 495)), null, inputPath2, str2, str, iArr, iArr2));
                Object LIZ = c84654XKg.LIZ();
                if (LIZ != enumC58928NAu) {
                    LIZ = C76800UCe.LIZ;
                }
                if (LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
