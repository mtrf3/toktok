package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;

/* renamed from: X.ODs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61552ODs extends OE9 {
    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, false);
        LIZIZ.LJIIJJI = SystemClock.uptimeMillis() - LIZIZ.LJIJ;
    }

    @Override // X.OE9
    public final void LJFF(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        ODP.LIZIZ(c61546ODm, false).LJIJ = SystemClock.uptimeMillis();
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        int i;
        if (th instanceof C61563OEd) {
            i = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        } else if (th instanceof C61562OEc) {
            i = 401;
        } else {
            i = 402;
        }
        ODP.LIZJ(c61546ODm, i, th);
    }
}
