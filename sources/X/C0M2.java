package X;

import Y.IDRunnableS85S0100000;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import java.util.LinkedList;

/* renamed from: X.0M2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M2 {
    public static volatile C0M2 LJ;
    public final String LIZIZ;
    public long LIZ = 2500;
    public final StringBuilder LIZJ = new StringBuilder(LinkMicRtcMixBitrateSetting.DEFAULT);
    public final LinkedList<PEE> LIZLLL = new LinkedList<>();

    public static C0M2 LIZ() {
        if (LJ == null) {
            synchronized (C0M2.class) {
                if (LJ == null) {
                    LJ = new C0M2();
                }
            }
        }
        return LJ;
    }

    public C0M2() {
        new IDRunnableS85S0100000(this, 66);
        new IDRunnableS85S0100000(this, 67);
        this.LIZIZ = C0M2.class.getName();
    }
}
