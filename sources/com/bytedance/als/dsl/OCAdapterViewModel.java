package com.bytedance.als.dsl;

import X.C275616i;
import X.C82621Wbh;
import X.C82622Wbi;
import X.C82628Wbo;
import X.InterfaceC82629Wbp;
import androidx.lifecycle.ViewModel;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class OCAdapterViewModel extends ViewModel {
    public final C82621Wbh LJLIL;
    public C82622Wbi LJLILLLLZI;
    public final StackTraceElement[] LJLJI;

    public final C82622Wbi gv0() {
        C82622Wbi LIZ = this.LJLIL.LIZ();
        InterfaceC82629Wbp interfaceC82629Wbp = LIZ.LIZ;
        o.LJIIIIZZ(interfaceC82629Wbp, "it.name");
        interfaceC82629Wbp.LIZIZ(this.LJLJI);
        this.LJLILLLLZI = LIZ;
        return LIZ;
    }

    public final C82622Wbi hv0() {
        C82622Wbi c82622Wbi = this.LJLILLLLZI;
        if (c82622Wbi != null) {
            return c82622Wbi;
        }
        return gv0();
    }

    public OCAdapterViewModel(String str, C82622Wbi c82622Wbi, C275616i config, StackTraceElement[] stackTraceElementArr) {
        C82621Wbh c82621Wbh;
        o.LJIIIZ(config, "config");
        this.LJLJI = stackTraceElementArr;
        if (c82622Wbi == null) {
            c82621Wbh = new C82621Wbh(new C82628Wbo(i0.LJFF(str, " data{}")), null);
        } else {
            c82621Wbh = new C82621Wbh(new C82628Wbo(i0.LJFF(str, " data{}")), c82622Wbi);
        }
        this.LJLIL = c82621Wbh;
    }
}
