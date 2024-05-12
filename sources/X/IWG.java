package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IWG {
    public static boolean LJIIJJI;
    public final IWF LJFF;
    public final InterfaceC46747IWh LJI;
    public boolean LJII;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public final Object LIZJ = new Object();
    public volatile boolean LIZLLL = false;
    public int LJ = 1;
    public volatile boolean LJIIIIZZ = false;
    public final Object LJIIIZ = new Object();
    public final Object LJIIJ = new Object();

    public final void LIZ(boolean z) {
        if (IWS.LIZ) {
            StringBuilder LJI = JBR.LJI("preCreatePlayer force:", z, ", mPreloaded:");
            LJI.append(this.LIZLLL);
            C47150Iew.LIZJ("PreCreateHelper", X1D.LIZIZ(LJI));
        }
        if (!this.LIZLLL) {
            synchronized (this.LIZJ) {
                if (!this.LIZLLL) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (!z) {
                        FFL.LJIIIZ().getClass();
                        if (FFL.LJIIJ(31744, 0, "player_precreateplayer", true) != 1) {
                            this.LIZLLL = true;
                            return;
                        }
                    }
                    this.LIZIZ = -1L;
                    if (this.LJ == 1 && this.LJFF.LJJJJLI() == null && !this.LJFF.LIZIZ) {
                        this.LJI.LJJLL(new IWT());
                        this.LJI.init();
                        this.LJ = 2;
                    }
                    this.LIZIZ = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.LIZLLL = true;
                }
            }
        }
    }

    public final void LIZIZ(boolean z) {
        if (IWS.LIZ) {
            C47150Iew.LIZJ("coldstartplayer", "preCreateNextSessionPlayer : force " + z + ", mNextSessionCreateLock:" + this.LJIIIIZZ);
        }
        if (!this.LJIIIIZZ) {
            synchronized (this.LJIIIZ) {
                if (!this.LJIIIIZZ) {
                    if (!z) {
                        FFL.LJIIIZ().getClass();
                        if (FFL.LJIIJ(31744, 0, "feed_cold_start_precreate_prerender_session", true) == 0) {
                            return;
                        }
                    }
                    if (this.LJFF.LJJJJLI() == null && !this.LJFF.LIZIZ) {
                        this.LJI.LJJZZIII(new IWT());
                    }
                    this.LJIIIIZZ = true;
                }
            }
        }
    }

    public IWG(IWF iwf, InterfaceC46747IWh interfaceC46747IWh) {
        this.LJFF = iwf;
        this.LJI = interfaceC46747IWh;
    }

    public final void LIZJ(Aweme aweme, C46367IHr c46367IHr) {
        boolean z;
        if (C00F.LIZ(31744, 0, "feed_cold_start_enable_prerender", true) == 1) {
            return;
        }
        if (IWS.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryPrepareVideo2FirstStart aweme:");
            LIZ.append(aweme);
            C47150Iew.LIZJ("PreCreateHelper", X1D.LIZIZ(LIZ));
        }
        LIZ(true);
        if ((this.LJ != 2 && !DUE.LIZJ()) || aweme == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZ = -1L;
        Video video = aweme.getVideo();
        C51029K0z.LJJJJZ(IXM.LJFF(C51029K0z.LJJJJ(video))).setSourceId(aweme.getAid());
        if (OUP.LJJIII(aweme) || (aweme.getIsTikTokStory() && aweme.getAwemeType() == 152)) {
            z = true;
        } else {
            z = false;
        }
        C46744IWe c46744IWe = new C46744IWe();
        c46744IWe.LIZ.LIZJ = C51029K0z.LJJJJ(video);
        c46744IWe.LIZ.LIZLLL = Audio.convertToSimAudio(video, aweme.getAudio());
        c46744IWe.LIZIZ(z);
        int infoId = Audio.InfoIdType.ORIGINAL.getInfoId();
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LJ = infoId;
        c46745IWf.LJIIIZ = false;
        c46745IWf.LIZIZ = c46367IHr;
        C46745IWf LIZ2 = c46744IWe.LIZ();
        if (C33842DPy.LIZ() && aweme.getVideo() != null) {
            LIZ2.LJI = C51029K0z.LJJJJI(aweme.getVideo().getPlayAddrH264());
        }
        if (DUE.LIZJ()) {
            synchronized (this.LJIIJ) {
                IWF iwf = this.LJFF;
                if (iwf != null) {
                    iwf.LJJJI(LIZ2);
                }
            }
        } else {
            this.LJFF.LJJJI(LIZ2);
        }
        this.LJ = 3;
        LJIIJJI = true;
        if (C00F.LIZ(31744, 1, "enable_player_pre_create_pause", true) == 1) {
            this.LJI.pause();
        }
        this.LIZ = SystemClock.elapsedRealtime() - elapsedRealtime;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("create_time", this.LIZIZ);
            jSONObject.put("prepare_time", this.LIZ);
            FMX.LJIILJJIL("pre_create_player", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
