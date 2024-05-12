package X;

import android.os.Trace;
import kotlin.jvm.internal.o;

/* renamed from: X.26e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C530026e extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe> {
    public final /* synthetic */ InterfaceC65784Pro<T> LJLIL;
    public final /* synthetic */ C24400xY LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C530026e(InterfaceC65784Pro<? extends T> interfaceC65784Pro, C24400xY c24400xY, int i) {
        super(3);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c24400xY;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC24420xa<?> interfaceC24420xa, C24570xp c24570xp, InterfaceC24350xT interfaceC24350xT) {
        InterfaceC24420xa<?> interfaceC24420xa2 = interfaceC24420xa;
        C24570xp c24570xp2 = c24570xp;
        C1JX.LJIIIZ(interfaceC24420xa2, "applier", c24570xp2, "slots", interfaceC24350xT, "<anonymous parameter 2>");
        InterfaceC65784Pro<T> interfaceC65784Pro = this.LJLIL;
        C24400xY anchor = this.LJLILLLLZI;
        int i = this.LJLJI;
        Trace.beginSection("composer:createNode:factory");
        try {
            Object invoke = interfaceC65784Pro.invoke();
            o.LJIIIZ(anchor, "anchor");
            c24570xp2.LJJJJIZL(c24570xp2.LIZJ(anchor), invoke);
            interfaceC24420xa2.LJII(i, invoke);
            interfaceC24420xa2.LIZLLL(invoke);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
