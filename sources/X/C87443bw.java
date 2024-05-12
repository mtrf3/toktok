package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87443bw extends AbstractC65781Prl implements InterfaceC88472Yns<C87453bx, C87453bx> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87443bw(boolean z, String str) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C87453bx invoke(C87453bx c87453bx) {
        C87453bx setState = c87453bx;
        o.LJIIIZ(setState, "$this$setState");
        ArrayList arrayList = new ArrayList();
        boolean z = this.LJLIL;
        String str = this.LJLILLLLZI;
        arrayList.addAll(setState.LJLILLLLZI);
        if (z) {
            arrayList.add(str);
        } else {
            arrayList.remove(str);
        }
        return C87453bx.LIZ(setState, null, arrayList, 0, false, 13);
    }
}
