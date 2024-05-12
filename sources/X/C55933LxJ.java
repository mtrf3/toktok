package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.LxJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55933LxJ implements InterfaceC53896LDg {
    public final /* synthetic */ CustomDotAssem LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public C55933LxJ(CustomDotAssem customDotAssem) {
        this.LJLIL = customDotAssem;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        this.LJLIL.v3().LJLZ = false;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        this.LJLIL.v3().LJLZ = true;
        this.LJLIL.LJLIL.LJI(EnumC55811LvL.OTHER);
    }
}
