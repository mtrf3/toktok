package X;

import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98453th {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final C62822Ol8 LIZLLL;

    public final String LJ() {
        return (String) this.LIZLLL.getValue();
    }

    public final void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        C34B.LIZIZ(LJ(), msg);
    }

    public final void LIZLLL(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C34B.LJ(LJ(), throwable);
    }

    public final void LJFF(String msg) {
        o.LJIIIZ(msg, "msg");
        C34B.LJI(LJ(), msg);
    }

    public final void LIZIZ(List dataList, InterfaceC88472Yns msgTransformer) {
        o.LJIIIZ(dataList, "dataList");
        o.LJIIIZ(msgTransformer, "msgTransformer");
        Iterator it = ORZ.LJLILLLLZI(dataList, this.LIZJ).iterator();
        while (it.hasNext()) {
            LIZ(ORZ.LLD((Iterable) it.next(), null, "", null, new AqS167S0100000_1(msgTransformer, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 230), 29));
        }
    }

    public final void LIZJ(String str, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C34B.LIZLLL(LJ(), str, throwable);
    }

    public C98453th(String str, String str2, int i) {
        int i2;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            i2 = 25;
        } else {
            i2 = 0;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i2;
        this.LIZLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 779));
    }

    public final <T> void LJI(String prefix, List<? extends T> dataList, InterfaceC88472Yns<? super T, String> msgTransformer) {
        o.LJIIIZ(prefix, "prefix");
        o.LJIIIZ(dataList, "dataList");
        o.LJIIIZ(msgTransformer, "msgTransformer");
        Iterator it = ORZ.LJLILLLLZI(dataList, this.LIZJ).iterator();
        while (it.hasNext()) {
            LJFF(ORZ.LLD((Iterable) it.next(), null, prefix, null, new AqS167S0100000_1(msgTransformer, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 231), 29));
        }
    }
}
