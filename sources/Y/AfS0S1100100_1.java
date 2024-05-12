package Y;

import X.C138615cH;
import X.C2U8;
import X.C43882HKc;
import X.C4RM;
import X.C6BK;
import X.H78;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.shortvideo.subtitle.MusicCopyrightApi;
import java.util.Map;

/* loaded from: classes2.dex */
public class AfS0S1100100_1 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

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

    public static final void accept$0(AfS0S1100100_1 afS0S1100100_1, Object obj) {
        boolean z;
        int i;
        MusicCopyrightApi.MusicCopyrightCheckResponse musicCopyrightCheckResponse = (MusicCopyrightApi.MusicCopyrightCheckResponse) obj;
        if (musicCopyrightCheckResponse.status_code == 0) {
            Map<String, Integer> map = C138615cH.LIZJ;
            String str = afS0S1100100_1.s0;
            Integer num = musicCopyrightCheckResponse.musicIdentification;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            ((InterfaceC88472Yns) afS0S1100100_1.l1).invoke(Boolean.TRUE);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkMusicCopyright error code: ");
            LIZ.append(musicCopyrightCheckResponse.status_code);
            LIZ.append(", msg: ");
            LIZ.append(musicCopyrightCheckResponse.status_msg);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            ((InterfaceC88472Yns) afS0S1100100_1.l1).invoke(Boolean.FALSE);
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - afS0S1100100_1.j2));
        c6bk.LIZ.put("status", Integer.valueOf(musicCopyrightCheckResponse.status_code));
        if (musicCopyrightCheckResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        c6bk.LIZ.put("success", Boolean.valueOf(z));
        c6bk.LIZ.put("errorCode", Integer.valueOf(musicCopyrightCheckResponse.error_code));
        C43882HKc.LIZLLL(0, "music_lyric_copyright_request_info", c6bk.LJ(), true);
    }

    public static final void accept$1(AfS0S1100100_1 afS0S1100100_1, Object obj) {
        NewLiveRoomStruct newLiveRoomStruct = (NewLiveRoomStruct) obj;
        if (newLiveRoomStruct != null) {
            if (afS0S1100100_1.j2 == newLiveRoomStruct.id) {
                return;
            }
        } else if ((newLiveRoomStruct == null && ((NewLiveRoomStruct) afS0S1100100_1.l1) == null) || 1 == 0) {
            return;
        }
        C2U8.LIZ(new C4RM(afS0S1100100_1.s0, newLiveRoomStruct));
    }

    public AfS0S1100100_1(long j, Object obj, String str, int i) {
        this.$t = i;
        this.j2 = j;
        this.l1 = obj;
        this.s0 = str;
    }
}
