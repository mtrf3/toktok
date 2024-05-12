package X;

import android.app.Activity;
import android.media.AudioManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizAudioFixSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BPr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28739BPr implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C28736BPo LJLIL;

    public C28739BPr(C28736BPo c28736BPo) {
        this.LJLIL = c28736BPo;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C28736BPo c28736BPo = this.LJLIL;
        c28736BPo.LIZ = i;
        if (!c28736BPo.LIZLLL) {
            return;
        }
        c28736BPo.getClass();
        if (LiveQuizAudioFixSetting.INSTANCE.getValue() && c28736BPo.LJFF) {
            return;
        }
        if (i == -2 || i == -3 || i == -1) {
            this.LJLIL.LJ = System.currentTimeMillis();
            C28736BPo c28736BPo2 = this.LJLIL;
            c28736BPo2.LIZJ(c28736BPo2.LJI, c28736BPo2.LJII, true);
            C73943T0h.LIZ().LIZIZ(new B44(true, true));
            return;
        }
        if (i != 1) {
            return;
        }
        this.LJLIL.getClass();
        Activity topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
        List<Class> liveActivityClass = ((IHostAction) CN1.LIZ(IHostAction.class)).getLiveActivityClass();
        if (topActivity == null || liveActivityClass == null || liveActivityClass.isEmpty()) {
            return;
        }
        Iterator<Class> it = liveActivityClass.iterator();
        while (it.hasNext()) {
            if (topActivity.getClass() == it.next()) {
                C28736BPo c28736BPo3 = this.LJLIL;
                c28736BPo3.LJ = -1L;
                c28736BPo3.LIZJ(c28736BPo3.LJI, c28736BPo3.LJII, false);
                C73943T0h.LIZ().LIZIZ(new B44(false, true));
                return;
            }
        }
    }
}
