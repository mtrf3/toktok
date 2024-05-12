package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XUf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84913XUf {
    public final XU2 LIZ = new XU2("music_detail_page");
    public final C84868XSm LIZIZ;
    public String LIZJ;
    public Activity LIZLLL;
    public InterfaceC84927XUt LJ;
    public C84923XUp LJFF;
    public Effect LJI;
    public Effect LJII;
    public C84916XUi LJIIIIZZ;
    public C84916XUi LJIIIZ;
    public C34821Yg LJIIJ;

    public final void LIZIZ() {
        this.LIZLLL = null;
        C84868XSm c84868XSm = this.LIZIZ;
        if (c84868XSm != null) {
            c84868XSm.release();
        }
        C84916XUi c84916XUi = this.LJIIIIZZ;
        if (c84916XUi != null) {
            c84916XUi.LIZJ();
        }
        if (this.LJ != null) {
            this.LJ = null;
        }
    }

    public final void LIZ(String str) {
        C84919XUl c84919XUl;
        C84868XSm c84868XSm = this.LIZIZ;
        if (c84868XSm != null && this.LJIIIIZZ == null) {
            c84868XSm.LIZ(str);
        }
        C84916XUi c84916XUi = this.LJIIIIZZ;
        if (c84916XUi != null && (c84919XUl = c84916XUi.LJII) != null) {
            c84919XUl.LJFF(null);
        }
    }

    public static void LJI(long j, String str) {
        double d;
        long LIZ = C78496UrM.LIZ(str);
        if (j == 0) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            d = LIZ / j;
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("duration", Long.valueOf(j));
        c198517qh.LIZ.put("speed", Double.valueOf(d));
        c198517qh.LIZ.put("size", Long.valueOf(LIZ));
        c198517qh.LIZ.put("fileName", str);
        FUA.LIZJ("aweme_music_detail_download_success_rate", c198517qh.LJ());
    }

    public final C84916XUi LJ(MusicModel musicModel, String str) {
        if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new C84916XUi(this.LIZLLL, str, musicModel, this.LIZIZ, this.LIZJ);
            }
            return this.LJIIIZ;
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new C84916XUi(this.LIZLLL, str, musicModel, this.LIZIZ, this.LIZJ);
        }
        return this.LJIIIIZZ;
    }

    public final C34821Yg LJFF(MusicModel musicModel, String str) {
        if (this.LJIIJ == null) {
            this.LJIIJ = new C34821Yg(LJ(musicModel, str));
        }
        return this.LJIIJ;
    }

    public C84913XUf(Activity activity, InterfaceC84927XUt interfaceC84927XUt, boolean z) {
        this.LIZLLL = activity;
        C84868XSm c84868XSm = new C84868XSm((Context) this.LIZLLL, "music_detail_page", z, true, true);
        this.LIZIZ = c84868XSm;
        this.LIZJ = "music_detail_page";
        c84868XSm.LIZIZ(2);
        this.LJ = interfaceC84927XUt;
    }

    public final void LIZLLL(MusicModel musicModel, String str, boolean z, int i, boolean z2, boolean z3) {
        this.LIZ.pause();
        if (this.LIZLLL != null) {
            IExternalService LIZ = AVExternalServiceImpl.LIZ();
            if (LIZ != null && LIZ.configService().avsettingsConfig().needLoginBeforeRecord()) {
                this.LJ.LLJJJJ();
            } else {
                if (C2NU.LIZ.LIZIZ()) {
                    LIZJ(musicModel, str, false, z, i, z2, z3);
                    return;
                }
                C5S1 c5s1 = new C5S1(this.LIZLLL);
                c5s1.LIZJ(R.string.img);
                c5s1.LJ();
            }
        }
    }

    public final void LIZJ(MusicModel musicModel, String str, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        C84923XUp c84923XUp;
        if ((!z || !((Boolean) IJH.LIZIZ.getValue()).booleanValue()) && musicModel != null) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ID：");
            LIZ.append(musicModel.getId());
            C36922EeM.LIZLLL(4, "Music Download", X1D.LIZIZ(LIZ));
            if (!z2 && !z4) {
                this.LJFF = new C84923XUp(this, musicModel, z3, str, i, currentTimeMillis);
                C34821Yg LJFF = LJFF(musicModel, str);
                if (z) {
                    c84923XUp = null;
                } else {
                    c84923XUp = this.LJFF;
                }
                LJFF.LJIIIZ(null, c84923XUp, z3, ((AbstractC84920XUm) LJFF.LIZ).LIZIZ, false);
                return;
            }
            this.LIZIZ.LIZJ(musicModel, new C84924XUq(this, musicModel, i, currentTimeMillis), true, true);
        }
    }
}
