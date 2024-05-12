package X;

import kotlin.jvm.internal.AqS0S2013000_9;
import kotlin.jvm.internal.AqS32S1000000_9;

/* renamed from: X.Lc6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54618Lc6 implements InterfaceC54430LXu {
    @Override // X.InterfaceC54430LXu
    public final void LIZIZ() {
        C53729L6v.LIZIZ("story_creation_cell_show", new AqS32S1000000_9("homepage_follow", 1));
    }

    @Override // X.InterfaceC54430LXu
    public final void LIZJ(int i, int i2, boolean z, int i3) {
        String str;
        if (i == 0) {
            str = "story";
        } else if (i3 == 0) {
            str = "live";
        } else {
            str = "live&story";
        }
        C53729L6v.LIZIZ("topwindow_entrance_show", new AqS0S2013000_9(str, i, z, i2, i3, "homepage_follow", 1));
    }

    @Override // X.InterfaceC54430LXu
    public final void LIZ(int i, boolean z, int i2, int i3, String str) {
        C53729L6v.LIZIZ("enter_topwindow", new AqS0S2013000_9("homepage_follow", i, z, i2, i3, str, 0));
    }
}
