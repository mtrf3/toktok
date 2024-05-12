package X;

import android.view.MotionEvent;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;
import com.bytedance.android.livesdk.dataChannel.PublicScreenLongClickEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CSW extends SJC {
    public final /* synthetic */ PortraitPublicScreenWidget LJLIL;

    public CSW(PortraitPublicScreenWidget portraitPublicScreenWidget) {
        this.LJLIL = portraitPublicScreenWidget;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        super.onLongPress(e);
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(PublicScreenLongClickEvent.class, Boolean.TRUE);
        }
    }
}
