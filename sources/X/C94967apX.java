package X;

import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.Tool$compressRes$1", f = "Tool.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94967apX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94967apX(String str, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94967apX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        File file = new File(this.LJLIL);
        String filename = file.getName();
        boolean z = false;
        if (this.LJLILLLLZI) {
            o.LJIIIIZZ(filename, "filename");
            String str2 = "";
            if (!s.LJJJLZIJ(filename, ".", false)) {
                str = "";
            } else {
                str = (String) ORZ.LLFF(s.LJLJJL(filename, new String[]{"."}, 0, 6));
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            try {
                if (file.exists()) {
                    str2 = PN5.LIZ(new C64334PMs(file), 9, 8192L);
                }
            } catch (Throwable unused) {
            }
            LIZ.append(str2);
            LIZ.append(".");
            LIZ.append(str);
            filename = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ttmd5 cost = ");
            LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ2));
        }
        C68322mC c68322mC = new C68322mC();
        String str3 = C93965aZN.LIZ;
        if (str3 != null) {
            o.LJIIIIZZ(filename, "filename");
            ?? LIZIZ = C93965aZN.LIZIZ(str3, filename);
            c68322mC.element = LIZIZ;
            ?? LIZ3 = C94023aaJ.LIZ(this.LJLIL, LIZIZ, 1280.0f, 80, 16);
            c68322mC.element = LIZ3;
            if (LIZ3.length() > 0) {
                z = true;
            }
            if (z && new File((String) c68322mC.element).exists()) {
                XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94966apW(this, c68322mC, null), 3);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("IMAGE_CACHE_PATH");
        throw null;
    }
}
