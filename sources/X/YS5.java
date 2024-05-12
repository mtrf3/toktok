package X;

import Y.ARunnableS51S0100000_15;
import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.controller.VideoController;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes16.dex */
public final class YS5 {
    public AbstractC47819Ipj LJFF;
    public InterfaceC87405YSb LJI;
    public YTA LJII;
    public InterfaceC87404YSa LJIIIIZZ;
    public VideoContext LJIIIZ;
    public final java.util.Map<C79985VaH, YS7> LIZ = new HashMap();
    public final java.util.Map<C79985VaH, YD6> LIZIZ = new HashMap();
    public final Queue<C79985VaH> LIZJ = new LinkedList();
    public final C32810CuE LIZLLL = new C32810CuE();
    public InterfaceC58392Mvs LJ = new C78949Uyf();
    public int LJIIJ = 2;
    public final Handler LJIIJJI = new Handler(C16880lQ.LLJJJJ());

    public final void LIZJ(C79985VaH c79985VaH) {
        if (c79985VaH != null) {
            YD6 LIZLLL = LIZLLL(c79985VaH);
            if (LIZLLL != null) {
                LIZLLL.setSurfaceTextureListener(null);
            }
            this.LJIIJJI.post(new ARunnableS51S0100000_15(LIZLLL, 134));
            YS7 LJ = LJ(c79985VaH);
            ((LinkedList) this.LIZJ).remove(c79985VaH);
            if (LJ != null) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("releasePreparedVideoController vid:");
                    LIZ.append(c79985VaH.LIZ);
                    LIZ.append(" title:");
                    LIZ.append((String) null);
                    LIZ.append(" size:");
                    LIZ.append(((LinkedList) this.LIZJ).size());
                    LIZ.append(" context:");
                    LIZ.append(C16880lQ.LJLLJ(this.LJIIIZ.getContext().getClass()));
                    X1D.LIZIZ(LIZ);
                } catch (Exception unused) {
                }
                LJ.release();
            }
        }
    }

    public final YD6 LIZLLL(C79985VaH c79985VaH) {
        if (c79985VaH != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("retrieveTextureVideoView vid:");
            LIZ.append(c79985VaH.LIZ);
            LIZ.append(" title:");
            LIZ.append((String) null);
            X1D.LIZIZ(LIZ);
        }
        ((LinkedList) this.LIZJ).remove(c79985VaH);
        return (YD6) ((HashMap) this.LIZIZ).remove(c79985VaH);
    }

    public final YS7 LJ(C79985VaH c79985VaH) {
        if (c79985VaH != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("retrieveVideoController vid:");
            LIZ.append(c79985VaH.LIZ);
            LIZ.append(" title:");
            LIZ.append((String) null);
            X1D.LIZIZ(LIZ);
        }
        ((LinkedList) this.LIZJ).remove(c79985VaH);
        return (YS7) ((HashMap) this.LIZ).remove(c79985VaH);
    }

    public final void LIZIZ(C79985VaH c79985VaH, boolean z) {
        Activity LIZ;
        ViewGroup viewGroup;
        if (c79985VaH == null || ((HashMap) this.LIZ).containsKey(c79985VaH) || ((HashMap) this.LIZIZ).containsKey(c79985VaH) || (LIZ = C48672J8i.LIZ(this.LJIIIZ.getContext())) == null || (viewGroup = (ViewGroup) LIZ.findViewById(R.id.content)) == null) {
            return;
        }
        VideoContext videoContext = this.LJIIIZ;
        if (videoContext != null && videoContext.isCurrentSource(c79985VaH) && !this.LJIIIZ.isReleased()) {
            return;
        }
        if (((LinkedList) this.LIZJ).size() >= this.LJIIJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("prepareQueue over maxsize release first one. prepareQueue.size:");
            LIZ2.append(((LinkedList) this.LIZJ).size());
            X1D.LIZIZ(LIZ2);
            LIZJ((C79985VaH) ((LinkedList) this.LIZJ).peek());
        }
        ((LinkedList) this.LIZJ).offer(c79985VaH);
        C32810CuE c32810CuE = this.LIZLLL;
        VideoContext videoContext2 = this.LJIIIZ;
        c32810CuE.getClass();
        VideoController videoController = new VideoController(videoContext2);
        ((HashMap) this.LIZ).put(c79985VaH, videoController);
        videoController.setVideoEngineFactory(this.LJ);
        videoController.setTtvNetClient(this.LJFF);
        videoController.setVideoPlayConfiger(this.LJI);
        YTA yta = this.LJII;
        if (yta != null) {
            videoController.setPlayUrlConstructor(yta);
        }
        videoController.setPlayEntity(c79985VaH);
        C79994VaQ c79994VaQ = c79985VaH.LJIIIIZZ;
        if (c79994VaQ != null) {
            videoController.setRememberVideoPosition(c79994VaQ.LIZJ);
        }
        videoController.setVideoPlayListener(this.LJIIIIZZ);
        VideoContext videoContext3 = this.LJIIIZ;
        int i = 1;
        if ((videoContext3 != null && videoContext3.getLayerHostMediaLayout() != null && this.LJIIIZ.getLayerHostMediaLayout().LJIILLIIL()) || z) {
            if (Build.VERSION.SDK_INT < 24) {
                i = 2;
            }
            videoController.setVideoViewType(i);
            videoController.prepare();
        } else {
            YD6 yd6 = new YD6(this.LJIIIZ.getContext());
            yd6.setReuseSurfaceTexture(true);
            ((HashMap) this.LIZIZ).put(c79985VaH, yd6);
            yd6.setSurfaceTextureListener(new YSC(this, yd6, c79985VaH, videoController));
            viewGroup.addView(yd6, new ViewGroup.LayoutParams(0, 0));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("prepare vid:");
        LIZ3.append(c79985VaH.LIZ);
        LIZ3.append(" title:");
        LIZ3.append((String) null);
        X1D.LIZIZ(LIZ3);
    }

    public final C47160If6 LIZ(InterfaceC48221IwD interfaceC48221IwD, C47164IfA c47164IfA, C79985VaH c79985VaH) {
        C47160If6 LJFF;
        InterfaceC87405YSb interfaceC87405YSb = this.LJI;
        if (!(interfaceC87405YSb instanceof InterfaceC87411YSh) || (LJFF = ((InterfaceC87411YSh) interfaceC87405YSb).LJFF(interfaceC48221IwD, c47164IfA, c79985VaH)) == null) {
            C47160If6 LIZJ = this.LJI.LIZJ(c47164IfA);
            if (LIZJ == null) {
                return this.LJI.LJ(c47164IfA.LIZJ);
            }
            return LIZJ;
        }
        return LJFF;
    }
}
