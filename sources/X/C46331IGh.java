package X;

import android.text.TextUtils;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import java.util.HashMap;

/* renamed from: X.IGh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46331IGh {
    public Aweme LIZ;
    public Aweme LIZIZ;
    public final C47246IgU LIZJ;
    public final OnUIPlayListener LIZLLL;
    public int LJFF;
    public InterfaceC46330IGg LJI;
    public HashMap<String, Object> LJII;
    public IWH LJIIIIZZ;
    public Boolean LJIIIZ = Boolean.FALSE;
    public final C2LB LJ = null;

    public final VideoUrlModel LIZ() {
        Video video;
        VideoUrlModel properPlayAddr;
        Aweme aweme = this.LIZ;
        if (aweme == null || (video = aweme.getVideo()) == null || (properPlayAddr = video.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme2 = this.LIZIZ;
        if (aweme2 == null) {
            aweme2 = this.LIZ;
        }
        video.setRationAndSourceId(aweme2.getAid());
        return properPlayAddr;
    }

    public final boolean LIZIZ() {
        C2LB c2lb;
        if (!this.LIZJ.d4()) {
            return false;
        }
        Aweme aweme = this.LIZ;
        if (aweme != null && aweme.getStatus() != null && this.LIZ.getStatus().isDelete()) {
            return false;
        }
        if (TextUtils.isEmpty(null) && (c2lb = this.LJ) != null) {
            c2lb.LJFF();
        }
        return true;
    }

    public final void LIZJ() {
        InterfaceC46330IGg interfaceC46330IGg = this.LJI;
        if (interfaceC46330IGg != null && interfaceC46330IGg.LJJLIIIJLJLI(this.LIZLLL)) {
            this.LJI.LJJJLL(null);
        }
    }

    public final long LIZLLL() {
        InterfaceC46330IGg interfaceC46330IGg = this.LJI;
        if (interfaceC46330IGg != null) {
            return interfaceC46330IGg.getCurrentPosition();
        }
        return 0L;
    }

    public final void LJ() {
        InterfaceC46330IGg interfaceC46330IGg;
        Video video;
        if (LIZ() != null && (interfaceC46330IGg = this.LJI) != null) {
            interfaceC46330IGg.LJJJLL(this.LIZLLL);
            this.LJI.setSurface(this.LIZJ.getSurface());
            this.LJIIIZ = Boolean.TRUE;
            Aweme aweme = this.LIZ;
            if (aweme == null) {
                video = null;
            } else {
                video = aweme.getVideo();
            }
            OUP.LJJIII(this.LIZ);
            C46744IWe c46744IWe = new C46744IWe();
            SimVideo LJJIJLIJ = b.LJJIJLIJ(video);
            C46745IWf c46745IWf = c46744IWe.LIZ;
            c46745IWf.LIZJ = LJJIJLIJ;
            c46745IWf.LJIIIZ = true;
            c46744IWe.LIZ.LJIJJLI = video.isNeedSetCookie();
            c46744IWe.LIZLLL(video.getVideoAdTag());
            c46744IWe.LIZ.LIZLLL = Audio.convertToSimAudio(video, null);
            c46744IWe.LIZ.LJ = Audio.InfoIdType.ORIGINAL.getInfoId();
            this.LJI.LJIIJ(c46744IWe.LIZ());
        }
    }

    public final void LJFF() {
        InterfaceC46330IGg interfaceC46330IGg;
        boolean z;
        if (!LIZIZ()) {
            return;
        }
        this.LJFF = 0;
        if (LIZ() != null && (interfaceC46330IGg = this.LJI) != null) {
            interfaceC46330IGg.LJJJLL(this.LIZLLL);
            this.LJI.setSurface(this.LIZJ.getSurface());
            Video video = null;
            C46259IDn LIZ = IQ6.LIZ(this.LIZ, -1, null);
            InterfaceC46330IGg interfaceC46330IGg2 = this.LJI;
            Aweme aweme = this.LIZ;
            if (aweme != null) {
                video = aweme.getVideo();
            }
            boolean LJJIII = OUP.LJJIII(this.LIZ);
            OnUIPlayListener onUIPlayListener = this.LIZLLL;
            HashMap<String, Object> hashMap = this.LJII;
            if (hashMap != null) {
                z = true;
            } else {
                z = false;
            }
            interfaceC46330IGg2.LJJJIL(video, LJJIII, onUIPlayListener, 0, z, hashMap, LIZ);
        }
    }

    public final void LJI(InterfaceC46330IGg interfaceC46330IGg) {
        this.LJI = interfaceC46330IGg;
        if (interfaceC46330IGg != null && this.LJII != null) {
            IWH LJJIJIL = interfaceC46330IGg.LJJIJIL();
            this.LJIIIIZZ = LJJIJIL;
            if (LJJIJIL != null) {
                LJJIJIL.LIZLLL().LJ(new IGQ(this));
                this.LJIIIIZZ.LIZLLL().LIZLLL(new O5Y());
            }
        }
    }

    public C46331IGh(JGI jgi, JGI jgi2) {
        this.LIZJ = C47246IgU.LIZJ(jgi);
        this.LIZLLL = jgi2;
    }
}
