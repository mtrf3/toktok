package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.5ZA, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5ZA extends TBS implements InterfaceC88473Ynt<Boolean, Integer, Cert, C76800UCe> {
    public C5ZA(C158716Kt c158716Kt) {
        super(3, c158716Kt, C158716Kt.class, "pauseRecord", "pauseRecord(ZILcom/bytedance/bpea/basics/Cert;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Boolean bool, Integer num, Cert cert) {
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        Cert p2 = cert;
        o.LJIIIZ(p2, "p2");
        ((C158716Kt) this.receiver).LLIIZ(booleanValue, intValue, p2);
        return C76800UCe.LIZ;
    }
}
