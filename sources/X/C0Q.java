package X;

import Y.AfS57S0100000_5;
import android.text.TextUtils;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.GameLiveConvertInfo;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Calendar;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes6.dex */
public final class C0Q {
    public final DataChannel LIZ;
    public Fragment LIZIZ;
    public final C29180Bcm LIZJ;
    public final BUT LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public Window.Callback LJI;
    public C0S LJII;
    public boolean LJIIIIZZ;
    public final C73521StJ<GameLiveConvertInfo> LJIIIZ;
    public C73411SrX LJIIJ;
    public OSZ<Long, Long> LJIIJJI;
    public final AfS57S0100000_5 LJIIL;

    public final OSZ<Long, Long> LIZ() {
        OSZ<Long, Long> osz = this.LJIIJJI;
        if (osz != null) {
            return osz;
        }
        this.LJIIJJI = new OSZ<>(0L, 0L);
        String LIZJ = InterfaceC30442Bx8.T.LIZJ();
        if (TextUtils.isEmpty(LIZJ)) {
            this.LJIIJJI = new OSZ<>(0L, 0L);
        }
        try {
            this.LJIIJJI = (OSZ) C09650Zl.LIZJ.LJII(LIZJ, new C0R().getType());
        } catch (Exception e) {
            C0NB.LJI("PreviewGameContentHelper", e);
        }
        return this.LJIIJJI;
    }

    public final boolean LIZIZ() {
        long j;
        long j2;
        Long second;
        Long first;
        Calendar calendar = Calendar.getInstance();
        OSZ<Long, Long> LIZ = LIZ();
        if (LIZ != null && (first = LIZ.getFirst()) != null) {
            j = first.longValue();
        } else {
            j = 0;
        }
        OSZ<Long, Long> LIZ2 = LIZ();
        if (LIZ2 != null && (second = LIZ2.getSecond()) != null) {
            j2 = second.longValue();
        } else {
            j2 = 0;
        }
        if (j2 != 0) {
            return true;
        }
        if (j != 0 && calendar.getTimeInMillis() - j < 1209600000) {
            return true;
        }
        return false;
    }

    public C0Q(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = liveBroadcastPreviewFragment;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        this.LIZJ = (C29180Bcm) dataChannelGlobal.mv0(C29053Baj.class);
        this.LIZLLL = (BUT) dataChannelGlobal.mv0(C29052Bai.class);
        this.LJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 355));
        this.LJFF = C221108m2.LIZIZ(new AqS155S0100000_5(this, 354));
        this.LJIIIZ = new C73521StJ<>();
        this.LJIIL = new AfS57S0100000_5(this, 295);
    }
}
