package X;

import kotlin.jvm.internal.o;

/* renamed from: X.45O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45O extends AbstractC65781Prl implements InterfaceC88472Yns<C1023940d, Boolean> {
    public static final C45O LJLIL = new C45O();

    public C45O() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C1023940d c1023940d) {
        boolean z;
        C1023940d pauseCurrentTask = c1023940d;
        o.LJIIIZ(pauseCurrentTask, "$this$pauseCurrentTask");
        if (pauseCurrentTask.LIZ.getSceneId() == C45Q.BOTTOM) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}