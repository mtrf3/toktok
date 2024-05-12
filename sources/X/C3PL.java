package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3PL, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3PL extends TBS implements InterfaceC88472Yns<String, C3PI> {
    public static final C3PL LJLIL = new C3PL();

    public C3PL() {
        super(1, C3PI.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C3PI invoke(String str) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        return new C3PI(p0);
    }
}
