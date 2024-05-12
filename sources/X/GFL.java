package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GFL implements IToolsVolumeKeydownRunnerSpi {
    public static final GFL LIZIZ = new GFL();
    public final /* synthetic */ IToolsVolumeKeydownRunnerSpi LIZ;

    @Override // com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi
    public final void LIZJ(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        this.LIZ.LIZJ(i, event);
    }

    public GFL() {
        IToolsVolumeKeydownRunnerSpi iToolsVolumeKeydownRunnerSpi;
        Object LIZ = C58096Mr6.LIZ(IToolsVolumeKeydownRunnerSpi.class, false);
        if (LIZ != null) {
            iToolsVolumeKeydownRunnerSpi = (IToolsVolumeKeydownRunnerSpi) LIZ;
        } else {
            if (C58096Mr6.B0 == null) {
                synchronized (IToolsVolumeKeydownRunnerSpi.class) {
                    if (C58096Mr6.B0 == null) {
                        C58096Mr6.B0 = new OpenOnMuteImpl();
                    }
                }
            }
            iToolsVolumeKeydownRunnerSpi = C58096Mr6.B0;
        }
        this.LIZ = iToolsVolumeKeydownRunnerSpi;
    }
}
