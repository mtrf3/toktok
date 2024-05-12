package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOZ implements TO7<Object, Object, Object> {
    public int LJLIL = -1;
    public final /* synthetic */ XP8 LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    public TOZ(XP8 xp8, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLILLLLZI = xp8;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // X.TO7
    public final void LJII(int i, Object obj) {
        if (C82894Wg6.LIZIZ.LJIIIIZZ()) {
            if (i == this.LJLIL) {
                return;
            } else {
                this.LJLIL = i;
            }
        }
        this.LJLJI.invoke(Integer.valueOf(i));
    }

    @Override // X.TO7
    public final void LJIIJJI(Object obj, Object obj2) {
        this.LJLILLLLZI.LJIIJ(new C74564TOe(obj, obj2, true, null, null, null));
    }

    @Override // X.TO7
    public final void LIZ(Object obj, Object obj2, Object obj3, long j) {
        this.LJLILLLLZI.LJIIJ(new C74564TOe(obj, obj2, false, obj3, Long.valueOf(j), null));
    }

    @Override // X.TO7
    public final void LIZIZ(Object obj, Exception exc, Object obj2, long j) {
        String str;
        if (exc != null) {
            str = exc.getMessage();
        } else {
            str = null;
        }
        if (o.LJ(str, "10019")) {
            LJII(this.LJLIL, obj);
        } else {
            this.LJLILLLLZI.LJIIJ(new C74564TOe(obj, null, false, obj2, Long.valueOf(j), exc));
        }
    }
}
