package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LIm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54032LIm implements LDY {
    public final /* synthetic */ ActivityC45651qj LJLIL;

    public C54032LIm(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        if (o.LJ(str, "page_profile") || o.LJ(to, "page_profile") || o.LJ(str, "profile_fake_child") || o.LJ(to, "profile_fake_child")) {
            C54030LIk.LIZIZ = null;
        } else {
            OSZ LIZIZ = C54030LIk.LIZIZ(this.LJLIL, to);
            C54030LIk.LIZJ(str, to, (String) LIZIZ.getFirst(), ((Boolean) LIZIZ.getSecond()).booleanValue(), this.LJLIL);
        }
    }
}
