package X;

import Y.AfS54S0200000_5;
import android.app.Activity;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BXM implements InterfaceC05250In {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ Activity LIZIZ;

    @Override // X.InterfaceC05250In
    public final C76800UCe LJI() {
        InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.LIZ);
        if (LJIILIIL != null) {
            LJIILIIL.LJIILIIL();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe onFailed(String msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.length() > 0) {
            C30868C9o.LJI(msg);
        }
        return C76800UCe.LIZ;
    }

    public BXM(ActivityC45651qj activityC45651qj, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = activityC45651qj;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe LJFF(String str, String str2) {
        long j;
        Long l;
        C30868C9o.LIZJ(R.string.k9c);
        Hashtag hashtag = (Hashtag) this.LIZ.kv0(HashtagChangedChannel.class);
        if (hashtag != null && (l = hashtag.id) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        C28718BOw.LIZ().LIZ().getPreviewRoomCreateInfo(j).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(this.LIZIZ, this.LIZ, 61), new InterfaceC64592gB() { // from class: X.9D0
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        return C76800UCe.LIZ;
    }
}
