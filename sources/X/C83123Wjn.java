package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wjn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83123Wjn extends TBS implements InterfaceC88471Ynr<String, String, int[]> {
    public C83123Wjn(C83113Wjd c83113Wjd) {
        super(2, c83113Wjd, C83113Wjd.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final int[] invoke(String str, String str2) {
        String p1 = str;
        String p2 = str2;
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        return ((C83113Wjd) this.receiver).LLII(p1, p2);
    }
}
