package X;

import kotlin.jvm.internal.o;

/* renamed from: X.45P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45P extends AbstractC65781Prl implements InterfaceC88472Yns<C1023940d, Boolean> {
    public static final C45P LJLIL = new C45P();

    public C45P() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C1023940d c1023940d) {
        boolean z;
        C1023940d resumeCurrentTask = c1023940d;
        o.LJIIIZ(resumeCurrentTask, "$this$resumeCurrentTask");
        if (resumeCurrentTask.LIZ.getSceneId() == C45Q.BOTTOM) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
