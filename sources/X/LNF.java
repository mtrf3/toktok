package X;

import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LNF {
    public String LIZ = "";

    public LNF() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBackFromSettingEvent(BackFromSettingEvent event) {
        o.LJIIIZ(event, "event");
        this.LIZ = event.enterFrom;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSyncContactStatusEvent(SyncContactStatusEvent event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(this.LIZ, event.enterFrom) && event.isSuccess && !event.lastValue) {
            C77266UUc.LIZIZ.LJIIZILJ();
        }
    }
}
