package X;

import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hak, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44342Hak {
    public final C82622Wbi LIZ;
    public final InterfaceC82086WJm LIZIZ;
    public final InterfaceC65784Pro<Boolean> LIZJ;
    public final C62822Ol8 LIZLLL;

    public C44342Hak(C82622Wbi context, InterfaceC82086WJm cameraApiComponent, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = context;
        this.LIZIZ = cameraApiComponent;
        this.LIZJ = aqS157S0100000_7;
        this.LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 586));
    }

    public final void LIZ(int i, long j, long j2, String str) {
        String str2 = str;
        StringBuilder LIZLLL = C1FJ.LIZLLL("[Client --> Effect]: msgID(", i, "), arg1(", j);
        C0MT.LIZLLL(LIZLLL, "), arg2(", j2, "), arg3(");
        LIZLLL.append(str2);
        LIZLLL.append(')');
        H78.LIZIZ("SharedAR", X1D.LIZIZ(LIZLLL));
        InterfaceC83624Wrs e8 = this.LIZIZ.e8();
        if (str2 == null) {
            str2 = "empty_message";
        }
        e8.LJJIJL(i, j, j2, str2);
    }
}
