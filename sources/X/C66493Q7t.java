package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Q7t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66493Q7t {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Q7O q7o, Q97 q97, Q82 q82) {
        if (q97 == null || q82 == null) {
            return;
        }
        Q8K callbackManager = ((Q85) q97).LIZ;
        C66494Q7u c66494Q7u = new C66494Q7u(q82);
        o.LJIIIZ(callbackManager, "callbackManager");
        if (callbackManager instanceof Q6B) {
            if (q7o.LIZLLL == null) {
                q7o.LIZLLL = callbackManager;
            }
            q7o.LJFF((Q6B) callbackManager, c66494Q7u);
            return;
        }
        throw new Q4W("Unexpected CallbackManager, please use the provided Factory.");
    }
}
