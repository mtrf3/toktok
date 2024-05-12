package X;

import android.os.SystemClock;
import com.bytedance.android.live.publicscreen.api.ExtendedPublicScreenFilterTypeChannel;
import com.bytedance.android.live.publicscreen.impl.displayfilter.ExtendedScreenRadioFilterWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BPY implements InterfaceC28722BPa {
    public final /* synthetic */ ExtendedScreenRadioFilterWidget LIZ;

    public BPY(ExtendedScreenRadioFilterWidget extendedScreenRadioFilterWidget) {
        this.LIZ = extendedScreenRadioFilterWidget;
    }

    @Override // X.InterfaceC28722BPa
    public final void LIZ(C28725BPd buttonView, boolean z) {
        DataChannel dataChannel;
        int i;
        o.LJIIIZ(buttonView, "buttonView");
        if (!z) {
            return;
        }
        Integer num = (Integer) this.LIZ.dataChannel.kv0(ExtendedPublicScreenFilterTypeChannel.class);
        int i2 = 0;
        if (num == null || num.intValue() != 0) {
            DataChannel dataChannel2 = this.LIZ.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ExtendedScreenRadioFilterWidget extendedScreenRadioFilterWidget = this.LIZ;
            long j = elapsedRealtime - extendedScreenRadioFilterWidget.LJLJL;
            Integer num2 = (Integer) extendedScreenRadioFilterWidget.dataChannel.kv0(ExtendedPublicScreenFilterTypeChannel.class);
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            BPX.LIZLLL(dataChannel2, j, C47261Igj.LJJIJ(Integer.valueOf(i)));
        }
        this.LIZ.LJLJL = SystemClock.elapsedRealtime();
        int id = buttonView.getId();
        if (id == R.id.lq_) {
            DataChannel dataChannel3 = this.LIZ.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.rv0(ExtendedPublicScreenFilterTypeChannel.class, 0);
            }
        } else if (id == R.id.lqb) {
            DataChannel dataChannel4 = this.LIZ.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.rv0(ExtendedPublicScreenFilterTypeChannel.class, 1);
            }
        } else if (id == R.id.lqc) {
            DataChannel dataChannel5 = this.LIZ.dataChannel;
            if (dataChannel5 != null) {
                dataChannel5.rv0(ExtendedPublicScreenFilterTypeChannel.class, 2);
            }
        } else if (id == R.id.lqd) {
            DataChannel dataChannel6 = this.LIZ.dataChannel;
            if (dataChannel6 != null) {
                dataChannel6.rv0(ExtendedPublicScreenFilterTypeChannel.class, 4);
            }
        } else if (id == R.id.lqa && (dataChannel = this.LIZ.dataChannel) != null) {
            dataChannel.rv0(ExtendedPublicScreenFilterTypeChannel.class, 8);
        }
        Integer num3 = (Integer) this.LIZ.dataChannel.kv0(ExtendedPublicScreenFilterTypeChannel.class);
        if (num3 != null) {
            i2 = num3.intValue();
        }
        DataChannel dataChannel7 = this.LIZ.dataChannel;
        o.LJIIIIZZ(dataChannel7, "dataChannel");
        BPX.LIZIZ(dataChannel7, "bottom_select", i2, C47261Igj.LJJIJ(Integer.valueOf(i2)), "");
    }
}
