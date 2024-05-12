package X;

/* renamed from: X.6FQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FQ {
    public static void LIZ(int i, long j, String str) {
        HQ7 accountService = C60903NvH.LJIIJJI().getAccountService();
        if (!accountService.isLogin() || accountService.isChildrenMode()) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_name", str);
        c188727au.LJ(j, "react_duration");
        c188727au.LIZLLL(i, "creation_duration");
        GXR.LIZ("tool_performance_ui_react_event", c188727au.LIZ);
    }
}
