package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wlc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83236Wlc extends TBS implements InterfaceC88471Ynr<String, String, int[]> {
    public C83236Wlc(C83216WlI c83216WlI) {
        super(2, c83216WlI, C83216WlI.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final int[] invoke(String str, String str2) {
        String p1 = str;
        String p2 = str2;
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        return ((C83216WlI) this.receiver).LIZIZ(p1, p2);
    }
}
