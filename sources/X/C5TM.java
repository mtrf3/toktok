package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.5TM, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5TM extends TBS implements InterfaceC88474Ynu<Boolean, Integer, Cert, String, C76800UCe> {
    public C5TM(C135445Tg c135445Tg) {
        super(4, c135445Tg, C135445Tg.class, "pauseRecord", "pauseRecord(ZILcom/bytedance/bpea/basics/Cert;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Boolean bool, Integer num, Cert cert, String str) {
        String p3 = str;
        o.LJIIIZ(p3, "p3");
        ((C135445Tg) this.receiver).LLJI(bool.booleanValue(), num.intValue(), cert, p3);
        return C76800UCe.LIZ;
    }
}
