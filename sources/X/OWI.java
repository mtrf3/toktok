package X;

import android.content.ContentValues;
import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes11.dex */
public final class OWI {
    public final Context LIZ;
    public final OWG LIZIZ;
    public TTVideoEngine LIZJ;
    public SurfaceHolder LIZLLL;
    public LiveWallPaperBean LJ;
    public boolean LJFF = true;

    public final void LIZLLL() {
        TTVideoEngine tTVideoEngine;
        LiveWallPaperBean liveWallPaperBean = this.LJ;
        if (liveWallPaperBean == null || liveWallPaperBean.isForceToPause() || (tTVideoEngine = this.LIZJ) == null) {
            return;
        }
        tTVideoEngine.LJJLI();
    }

    public final void LIZ(SurfaceHolder surfaceHolder) {
        float volume;
        if (this.LIZJ != null) {
            return;
        }
        TTVideoEngine tTVideoEngine = new TTVideoEngine(this.LIZ, 0);
        this.LIZJ = tTVideoEngine;
        tTVideoEngine.LJLLLL(4, 2);
        this.LIZJ.LJLLLL(7, 0);
        this.LIZJ.LJLLLL(415, 1);
        this.LIZJ.LLFII(true);
        this.LIZJ.LLILZLL(surfaceHolder);
        LiveWallPaperBean liveWallPaperBean = this.LJ;
        if (liveWallPaperBean != null) {
            if (liveWallPaperBean.isShouldMute()) {
                volume = 0.0f;
            } else {
                volume = this.LJ.getVolume();
            }
            this.LIZJ.LLJJIJIL(volume, volume);
        }
        this.LIZJ.LLJJ(new OWJ(new OWK(this)));
    }

    public OWI(Context context, OWG owg) {
        this.LIZ = context;
        this.LIZIZ = owg;
    }

    public final void LIZIZ(String str, boolean z) {
        LiveWallPaperBean liveWallPaperBean;
        OWG owg = this.LIZIZ;
        if (owg != null && (liveWallPaperBean = this.LJ) != null) {
            String source = liveWallPaperBean.getSource();
            AmeLiveWallpaper ameLiveWallpaper = (AmeLiveWallpaper) owg;
            if (ameLiveWallpaper.LJLJI == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("result", Boolean.valueOf(z));
            contentValues.put("source", source);
            contentValues.put("message", str);
            try {
                ameLiveWallpaper.LJLJI.insert(WallPaperDataProvider.LJLJJLL, contentValues);
            } catch (Exception e) {
                StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "LiveWallPaper insert failed ");
                LIZIZ.append(e.getMessage());
                C36922EeM.LJ(X1D.LIZIZ(LIZIZ));
            }
        }
    }

    public final void LIZJ(SurfaceHolder surfaceHolder, String str) {
        this.LIZLLL = surfaceHolder;
        if (surfaceHolder == null) {
            return;
        }
        LIZ(surfaceHolder);
        try {
            this.LIZJ.LL(str);
            LIZLLL();
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "onSurfaceCreated media play exception ");
            LIZIZ.append(e.getMessage());
            LIZIZ(X1D.LIZIZ(LIZIZ), false);
        }
    }
}
