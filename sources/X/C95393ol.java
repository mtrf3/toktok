package X;

import androidx.lifecycle.LifecycleRegistry;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.FunctionCell;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3ol, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95393ol extends C94443nE {
    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIIIZZ(FunctionCell.class);
        LJIILIIL();
        C8YN.LJII(this, LJIIJJI(), new TBT() { // from class: X.3nT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94453nF) obj).LJLJI;
            }
        }, null, new AqS183S0100000_1(this, 75), 6);
    }

    public final void LJIILIIL() {
        this.LJLJJL.LJFF();
        AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, new C72242sW(), 58);
        C95413on c95413on = new C95413on();
        aqS132S0200000_1.invoke(c95413on);
        this.LJLJJL.LJ(c95413on.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C95393ol(LifecycleRegistry lc) {
        super(lc);
        o.LJIIIZ(lc, "lc");
    }
}
