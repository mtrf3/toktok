package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class TTX implements TYD {
    public final /* synthetic */ TTW LJLIL;

    @Override // X.TYD
    public final void LJJLJ() {
    }

    @Override // X.TYD
    public final boolean LLLLLLLLL() {
        return true;
    }

    @Override // X.TYD
    public final void LLILLJJLI() {
        Room room;
        TTZ ttz = this.LJLIL.LJLIL;
        DataChannel dataChannel = null;
        if (ttz != null) {
            room = ttz.LIZ;
            dataChannel = ttz.LIZJ;
        } else {
            room = null;
        }
        C74776TWi.LJII(room, dataChannel, true);
    }

    public TTX(TTW ttw) {
        this.LJLIL = ttw;
    }

    @Override // X.TYD
    public final void LJJLIIIJL(Throwable th) {
        Context context;
        TTZ ttz = this.LJLIL.LJLIL;
        if (ttz != null) {
            context = ttz.LIZIZ;
        } else {
            context = null;
        }
        BPP.LIZLLL(context, th, R.string.stz);
    }

    @Override // X.TYD
    public final void LLLLIILL(boolean z) {
        TTZ ttz;
        DataChannel dataChannel;
        if (z && (ttz = this.LJLIL.LJLIL) != null && (dataChannel = ttz.LIZJ) != null) {
            C74776TWi.LJII(ttz.LIZ, dataChannel, false);
        }
    }
}
