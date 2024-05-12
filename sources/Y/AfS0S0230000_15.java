package Y;

import X.InterfaceC64592gB;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.notificatoin.AudioLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes16.dex */
public class AfS0S0230000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0230000_15 afS0S0230000_15, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            AudioLiveService.showDefaultNotification$default((AudioLiveService) afS0S0230000_15.l0, (Room) afS0S0230000_15.l1, afS0S0230000_15.z2, afS0S0230000_15.z3, afS0S0230000_15.z4, null, 16, null);
        } else {
            ((AudioLiveService) afS0S0230000_15.l0).showDefaultNotification((Room) afS0S0230000_15.l1, afS0S0230000_15.z2, afS0S0230000_15.z3, afS0S0230000_15.z4, bitmap);
        }
    }

    public static final void accept$1(AfS0S0230000_15 afS0S0230000_15, Object obj) {
        AudioLiveService.showDefaultNotification$default((AudioLiveService) afS0S0230000_15.l0, (Room) afS0S0230000_15.l1, afS0S0230000_15.z2, afS0S0230000_15.z3, afS0S0230000_15.z4, null, 16, null);
    }

    public AfS0S0230000_15(AudioLiveService audioLiveService, Room room, boolean z, boolean z2, boolean z3, int i) {
        this.$t = i;
        this.l0 = audioLiveService;
        this.l1 = room;
        this.z2 = z;
        this.z3 = z2;
        this.z4 = z3;
    }
}
