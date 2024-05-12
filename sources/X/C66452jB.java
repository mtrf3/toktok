package X;

import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$cleanupDir$2", f = "MobileEffectUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2jB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66452jB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ android.net.Uri LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66452jB(android.net.Uri uri, InterfaceC67352kd<? super C66452jB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = uri;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66452jB(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        String path = this.LJLIL.getPath();
        if (path == null) {
            return Boolean.FALSE;
        }
        boolean z2 = false;
        try {
            File file = new File(path);
            if (file.exists() && file.getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                file = null;
            }
            if (file != null) {
                C36980EfI.LIZ(file.getParent());
            }
            z2 = true;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
