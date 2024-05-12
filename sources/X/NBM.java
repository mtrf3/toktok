package X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NBM implements InterfaceC58942NBi, NCA {
    public final Aweme LIZ;
    public final Context LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final IAnoleManager LJ;
    public View LJFF;
    public boolean LJI;
    public boolean LJII;
    public NBN LJIIIIZZ;

    @Override // X.NCA
    public final NDG LIZLLL() {
        if (this.LJFF != null) {
            return new NDG(new C58958NBy(r6.getWidth(), r6.getHeight()), new PointF(r6.getWidth() / 2, r6.getHeight() / 2));
        }
        return null;
    }

    @Override // X.NCA
    public final NBS LJI() {
        NLW nlw;
        String LIZ = C59055NFr.LIZ("scene_anole_format");
        C1PH c1ph = new C1PH();
        Bundle bundle = new Bundle();
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        if ((LIZLLL instanceof NLW) && (nlw = (NLW) LIZLLL) != null) {
            nlw.LJIIIIZZ(this.LIZIZ, bundle, this.LIZ);
        }
        return new NBS(bundle, LIZ, c1ph);
    }

    @Override // X.InterfaceC58942NBi
    public final void LJIILJJIL() {
        IAnoleManager iAnoleManager = this.LJ;
        if (iAnoleManager != null) {
            iAnoleManager.clear();
        }
    }

    public final IVideoPlayTaskManager LJIILLIIL() {
        return (IVideoPlayTaskManager) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC58942NBi
    public final void LJJIIZ() {
        IAnoleManager iAnoleManager = this.LJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZIZ();
        }
        LJIILLIIL().reset();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewHolderUnSelected,aweme = ");
        LIZ.append(this.LIZ.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC58942NBi
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prerender aweme = ");
        LIZ.append(this.LIZ.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        IAnoleManager iAnoleManager = this.LJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
    }

    @Override // X.InterfaceC58942NBi
    public final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unbind,aweme = ");
        LIZ.append(this.LIZ.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC58942NBi
    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload aweme = ");
        LIZ.append(this.LIZ.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        ((IAnoleService) this.LIZLLL.getValue()).LIZ(this.LIZ);
    }

    @Override // X.InterfaceC58942NBi
    public final void LJJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewHolderSelected,aweme = ");
        LIZ.append(this.LIZ.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        IAnoleManager iAnoleManager = this.LJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJFF();
        }
    }

    @Override // X.InterfaceC58942NBi
    public final IAnoleManager LJIIIIZZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC58942NBi
    public final NBN LJIIIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC58942NBi
    public final void LJFF(View view) {
        this.LJFF = view;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind,aweme = ");
        LIZ.append(this.LIZ.getAid());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NCA
    public final C58958NBy LJII(String slotID) {
        o.LJIIIZ(slotID, "slotID");
        Context context = this.LIZIZ;
        return new C58958NBy(KL2.LJIILL(context, C47135Ieh.LIZ(100, C47135Ieh.LIZ(12, KL2.LJIIJJI(context)))), -1.0d);
    }

    @Override // X.InterfaceC58942NBi
    public final void LJIIJJI(NBN nbn) {
        this.LJIIIIZZ = nbn;
    }

    @Override // X.InterfaceC58942NBi
    public final void LJIILIIL(AbstractC58939NBf event) {
        o.LJIIIZ(event, "event");
        if (event instanceof NBW) {
            this.LJI = ((NBW) event).LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CommentDialogStatus = ");
            LIZ.append(this.LJI);
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        } else if (event instanceof NBX) {
            this.LJII = ((NBX) event).LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ShareDialogStatus = ");
            LIZ2.append(this.LJII);
            C242549fW.LIZ(X1D.LIZIZ(LIZ2));
        }
        IAnoleManager iAnoleManager = this.LJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIIZ(event);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("handleEvent,AnoleFromBusinessEvent= ");
        LIZ3.append(C16880lQ.LJLLJ(event.getClass()));
        C242549fW.LIZ(X1D.LIZIZ(LIZ3));
    }

    @Override // X.InterfaceC58942NBi
    public final void LJIILL(NBU playState) {
        o.LJIIIZ(playState, "playState");
        if (playState instanceof NBR) {
            LJIILLIIL().LJLIIL();
        } else if (playState instanceof NBQ) {
            LJIILLIIL().LJLJJLL();
        } else if (playState instanceof NBP) {
            LJIILLIIL().LJLJL();
        } else if (playState instanceof NBO) {
            LJIILLIIL().LJJJ();
        }
        IAnoleManager iAnoleManager = this.LJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIIZ(playState);
        }
    }

    public NBM(Context context, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        this.LIZ = aweme;
        this.LIZIZ = context;
        this.LIZJ = C221108m2.LIZIZ(N67.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(NBI.LJLIL);
        this.LIZLLL = LIZIZ;
        this.LJ = ((IAnoleService) LIZIZ.getValue()).LIZIZ(context, aweme, this, null);
    }

    @Override // X.NCA
    public final void LJIIJ(AbstractC58948NBo event, NC9 nc9) {
        o.LJIIIZ(event, "event");
        NBN nbn = this.LJIIIIZZ;
        if (nbn != null) {
            nbn.N(event);
        }
    }

    @Override // X.NCA
    public final boolean LJIIL(String slotID, NC9 nc9) {
        o.LJIIIZ(slotID, "slotID");
        if (!this.LJI && !this.LJII) {
            return true;
        }
        return false;
    }

    @Override // X.NCA
    public final boolean LJ(Runnable runnable, int i, String token) {
        o.LJIIIZ(token, "token");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerPlayProgressObserver,token = ");
        LIZ.append(token);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        Video video = this.LIZ.getVideo();
        if (video != null) {
            int duration = video.getDuration();
            IVideoPlayTaskManager LJIILLIIL = LJIILLIIL();
            N68 n68 = new N68(token);
            n68.LIZIZ(duration);
            n68.LIZJ = i;
            n68.LIZLLL = runnable;
            n68.LJ = true;
            LJIILLIIL.LJLJLJ(n68.LIZ());
            return true;
        }
        return false;
    }
}
