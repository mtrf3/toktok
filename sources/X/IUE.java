package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IUE implements InterfaceC46645ISj {
    public final InterfaceC46747IWh LIZ;
    public final AbstractC46746IWg LIZIZ;
    public final IUF LIZJ;

    @Override // X.InterfaceC46645ISj
    public final float LIZJ() {
        return this.LIZ.LIZIZ(10);
    }

    @Override // X.InterfaceC46645ISj
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC46645ISj
    public final int LJ() {
        ITI videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZ;
        }
        return 0;
    }

    @Override // X.InterfaceC46645ISj
    public final int LJFF() {
        ITI videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZJ;
        }
        return -1;
    }

    @Override // X.InterfaceC46645ISj
    public final String LJI() {
        String str = (String) this.LIZ.LIZJ(C46668ITg.LIZLLL);
        if (str == null) {
            return "Unknown";
        }
        return str;
    }

    @Override // X.InterfaceC46645ISj
    public final float LJII() {
        return this.LIZ.LIZIZ(2);
    }

    @Override // X.InterfaceC46645ISj
    public final void LJIIIZ() {
        this.LIZ.getVideoInfo();
    }

    @Override // X.InterfaceC46645ISj
    public final int LJIIJ() {
        ITI videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZIZ;
        }
        return -1;
    }

    @Override // X.InterfaceC46645ISj
    public final String LJIIL() {
        return this.LIZ.LJLLL();
    }

    @Override // X.InterfaceC46645ISj
    public final int LJIILL() {
        return (int) this.LIZ.LIZIZ(9);
    }

    @Override // X.InterfaceC46645ISj
    public final SimVideoUrlModel LJIILLIIL() {
        return this.LIZIZ.LIZLLL;
    }

    @Override // X.InterfaceC46645ISj
    public void LJJJLIIL() {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJJLIIL();
        }
    }

    @Override // X.InterfaceC46645ISj
    public void LJJJZ() {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJJZ();
        }
    }

    @Override // X.InterfaceC46645ISj
    public final float getBitrate() {
        return this.LIZ.LIZIZ(8);
    }

    @Override // X.InterfaceC46645ISj
    public final long getCurrentPosition() {
        return this.LIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC46645ISj
    public final long getDuration() {
        return this.LIZ.getDuration();
    }

    @Override // X.InterfaceC46645ISj
    public final int getHeight() {
        ITI videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LJ;
        }
        return 0;
    }

    @Override // X.InterfaceC46645ISj
    public final float getSpeed() {
        return this.LIZJ.LIZ;
    }

    @Override // X.InterfaceC46645ISj
    public final ITI getVideoInfo() {
        return this.LIZ.getVideoInfo();
    }

    @Override // X.InterfaceC46645ISj
    public final int getWatchedDuration() {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            return interfaceC46747IWh.getWatchedDuration();
        }
        return -1;
    }

    @Override // X.InterfaceC46645ISj
    public final int getWidth() {
        ITI videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZLLL;
        }
        return 0;
    }

    @Override // X.InterfaceC46645ISj
    public final boolean isMute() {
        return this.LIZ.isMute();
    }

    @Override // X.InterfaceC46645ISj
    public final ITZ getPlayerType() {
        return ITZ.TT;
    }

    @Override // X.InterfaceC46645ISj
    public final Object LIZ(AbstractC46667ITf abstractC46667ITf) {
        AbstractC46746IWg abstractC46746IWg = this.LIZIZ;
        if (abstractC46746IWg != null) {
            return abstractC46746IWg.LIZ(abstractC46667ITf);
        }
        return abstractC46667ITf.LIZIZ;
    }

    @Override // X.InterfaceC46645ISj
    public final float LIZIZ(int i) {
        return this.LIZ.LIZIZ(i);
    }

    @Override // X.InterfaceC46645ISj
    public final C46649ISn LJIIIIZZ(String str) {
        AbstractC46746IWg abstractC46746IWg = this.LIZIZ;
        if (abstractC46746IWg == null || str == null) {
            return new C46649ISn();
        }
        C46543IOl c46543IOl = abstractC46746IWg.LJIILLIIL;
        if (c46543IOl != null) {
            JSONObject LIZ = c46543IOl.LIZ(str);
            C46649ISn c46649ISn = new C46649ISn();
            if (LIZ != null) {
                c46649ISn.LIZ = LIZ.optLong("format_open_input", 0L);
                c46649ISn.LIZIZ = LIZ.optLong("tran_connect", 0L);
                c46649ISn.LIZJ = LIZ.optLong("http_response", 0L);
                c46649ISn.LIZLLL = LIZ.optLong("receive_first_video_frame", 0L);
                c46649ISn.LJ = LIZ.optLong("decode_first_video_frame", 0L);
                c46649ISn.LJFF = LIZ.optLong("render_first_video_frame", 0L);
                c46649ISn.LJI = LIZ.optLong("prepared", 0L);
                return c46649ISn;
            }
            return c46649ISn;
        }
        return new C46649ISn();
    }

    @Override // X.InterfaceC46645ISj
    public final C46650ISo LJIILIIL(String str) {
        AbstractC46746IWg abstractC46746IWg;
        if (TextUtils.isEmpty(str) || (abstractC46746IWg = this.LIZIZ) == null) {
            return new C46650ISo();
        }
        return abstractC46746IWg.LJIJ(str);
    }

    @Override // X.InterfaceC46645ISj
    public final SimVideoUrlModel LJIILJJIL(String str) {
        AbstractC46746IWg abstractC46746IWg;
        C35740E0y c35740E0y;
        if (str == null || (abstractC46746IWg = this.LIZIZ) == null || (c35740E0y = abstractC46746IWg.LJIJI) == null) {
            return null;
        }
        return c35740E0y.get(str);
    }

    @Override // X.InterfaceC46645ISj
    public void LJJJLZIJ(int i) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJJLZIJ(i);
        }
    }

    public IUE(InterfaceC46747IWh interfaceC46747IWh, AbstractC46746IWg abstractC46746IWg, IUF iuf) {
        this.LIZ = interfaceC46747IWh;
        this.LIZIZ = abstractC46746IWg;
        this.LIZJ = iuf;
    }

    @Override // X.InterfaceC46645ISj
    public final int LJIIJJI(ITZ itz, boolean z, boolean z2) {
        C47282Ih4 playerConfig;
        AbstractC46746IWg abstractC46746IWg = this.LIZIZ;
        abstractC46746IWg.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(itz.toString());
        LIZ.append("_");
        LIZ.append(false);
        LIZ.append("_");
        LIZ.append(z);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LIZIZ == null || !abstractC46746IWg.LJIJJ.containsKey(LIZIZ) || (playerConfig = abstractC46746IWg.LJIJJ.get(LIZIZ)) == null) {
            playerConfig = IUA.LIZ.LIZ().getPlayerConfig(itz, false, z);
            if (LIZIZ != null) {
                if (playerConfig == null) {
                    return 0;
                }
                abstractC46746IWg.LJIJJ.put(LIZIZ, playerConfig);
            } else if (playerConfig == null) {
                return 0;
            }
        }
        C47274Igw c47274Igw = playerConfig.LJJJJI;
        if (c47274Igw == null) {
            return 0;
        }
        if (z2) {
            return c47274Igw.LIZ;
        }
        return c47274Igw.LIZIZ;
    }
}
