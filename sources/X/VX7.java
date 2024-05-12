package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public final class VX7 implements InterfaceC78204Ume {
    public final J03 LIZ;
    public Context LIZIZ;
    public LifecycleOwner LIZJ;
    public InterfaceC78208Umi LIZLLL;
    public VXG LJ;
    public LocalPlayerController LJI;
    public AbsPlayer LJII;
    public final Object LJFF = new Object();
    public boolean LJIIIIZZ = true;
    public final VXA LJIIIZ = new VXA(this);
    public final VX8 LJIIJ = new VX8(this);

    @Override // X.InterfaceC78204Ume
    public final void LIZIZ() {
        this.LIZLLL = null;
    }

    @Override // X.InterfaceC78204Ume
    public final float LIZJ() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer;
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController != null && (iMediaPlayer = localPlayerController.LJLJLLL) != null) {
            try {
                VideoInfo videoInfo = iMediaPlayer.getVideoInfo();
                if (videoInfo instanceof J00) {
                    return ((J00) videoInfo).LIZ;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return 0.0f;
    }

    @Override // X.InterfaceC78204Ume
    public final void LJII() {
        if (this.LJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopWhenSlideSwitch() called with: playerController = [");
            LIZ.append(this.LJI);
            LIZ.append("]");
            C32444CoK.LIZ("LiveGiftPlay", X1D.LIZIZ(LIZ));
            this.LJI.reset();
        }
    }

    @Override // X.InterfaceC78204Ume
    public final void LJIIIIZZ() {
        synchronized (this.LJFF) {
            this.LJ = null;
        }
    }

    @Override // X.InterfaceC78204Ume
    public final float fps() {
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController != null) {
            VGW vgw = localPlayerController.LLF;
            if (vgw != null) {
                long j = vgw.LLIIIZ;
                if (j > 0) {
                    float f = ((float) (j - vgw.LLIIIL)) / 1000.0f;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("frame : ");
                    LIZ.append(vgw.LLIIIJ);
                    LIZ.append(", duration: ");
                    LIZ.append(f);
                    C32444CoK.LIZLLL("AlphaPlayerRender", X1D.LIZIZ(LIZ));
                    return vgw.LLIIIJ / f;
                }
            } else {
                return 0.0f;
            }
        }
        return -1.0f;
    }

    @Override // X.InterfaceC78204Ume
    public final String getPlayerType() {
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController != null) {
            return localPlayerController.getPlayerType();
        }
        return "unknown";
    }

    @Override // X.InterfaceC78204Ume
    public final boolean isPlaying() {
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController != null && localPlayerController.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC78204Ume
    public final void release() {
        if (this.LJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release() called with: playerController = [");
            LIZ.append(this.LJI);
            LIZ.append("]");
            C32444CoK.LIZ("LiveGiftPlay", X1D.LIZIZ(LIZ));
            LocalPlayerController localPlayerController = this.LJI;
            localPlayerController.LJLJLJ = null;
            localPlayerController.LJLJL = null;
            localPlayerController.release();
            this.LJI = null;
        }
        this.LJIIIIZZ = true;
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LIZLLL = null;
        synchronized (this.LJFF) {
            this.LJ = null;
        }
    }

    @Override // X.InterfaceC78204Ume
    public final void stop() {
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController != null) {
            localPlayerController.stop();
            InterfaceC78208Umi interfaceC78208Umi = this.LIZLLL;
            if (interfaceC78208Umi != null) {
                interfaceC78208Umi.onStop();
            }
        }
    }

    @Override // X.InterfaceC78204Ume
    public final void LIZ(VXG vxg) {
        synchronized (this.LJFF) {
            this.LJ = vxg;
        }
    }

    @Override // X.InterfaceC78204Ume
    public final void LJ(C78207Umh c78207Umh) {
        this.LIZLLL = c78207Umh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r8 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(androidx.lifecycle.LifecycleOwner r11) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VX7.LJIIIZ(androidx.lifecycle.LifecycleOwner):void");
    }

    public final void LJIIJ(int i) {
        InterfaceC79452VGe interfaceC79452VGe;
        VGW vgw;
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController == null || (interfaceC79452VGe = localPlayerController.LJLLJ) == null || (vgw = localPlayerController.LLF) == null) {
            return;
        }
        if (i == 1) {
            if (!(interfaceC79452VGe instanceof SurfaceView)) {
                return;
            }
            vgw.LLFZ = new C64323PMh(interfaceC79452VGe.getView().getContext());
        } else {
            if (i != 4) {
                return;
            }
            vgw.LLFZ = new C64324PMi(localPlayerController.LJLLJ.getView().getContext());
        }
    }

    @Override // X.InterfaceC78204Ume
    public final void attachAlphaView(ViewGroup viewGroup) {
        if (this.LJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("attachAlphaView() called with: playerController = [");
            LIZ.append(this.LJI);
            LIZ.append("]");
            C32444CoK.LIZ("LiveGiftPlay", X1D.LIZIZ(LIZ));
            this.LJI.attachAlphaView(viewGroup);
        }
    }

    @Override // X.InterfaceC78204Ume
    public final void detachAlphaView(ViewGroup viewGroup) {
        if (this.LJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("detachAlphaView() called with: playerController = [");
            LIZ.append(this.LJI);
            LIZ.append("]");
            C32444CoK.LIZ("LiveGiftPlay", X1D.LIZIZ(LIZ));
            this.LJI.detachAlphaView(viewGroup);
        }
    }

    public VX7(Context context, J03 j03) {
        this.LIZIZ = context;
        this.LIZ = j03;
    }

    @Override // X.InterfaceC78204Ume
    public final void LIZLLL(Bitmap bitmap, String str) {
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController != null) {
            MaskSrc maskSrc = new MaskSrc();
            maskSrc.setName(str);
            maskSrc.setType(1);
            maskSrc.setBitmap(bitmap);
            localPlayerController.setMask(maskSrc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0065 A[Catch: IOException -> 0x0072, TRY_ENTER, TryCatch #7 {IOException -> 0x0072, blocks: (B:76:0x006b, B:77:0x006e, B:85:0x0065), top: B:66:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [char[]] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [char[]] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Reader, java.io.InputStreamReader] */
    @Override // X.InterfaceC78204Ume
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78163Ulz LJI(long r9, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VX7.LJI(long, java.lang.String):X.Ulz");
    }

    @Override // X.InterfaceC78204Ume
    public final void LJFF(int i, String str, boolean z, String str2, String str3) {
        LocalPlayerController localPlayerController = this.LJI;
        if (localPlayerController != null) {
            MaskSrc maskSrc = new MaskSrc();
            maskSrc.setName(str);
            maskSrc.setType(0);
            maskSrc.setTextColor(str3);
            maskSrc.setTextSize(i);
            maskSrc.setBold(z);
            maskSrc.setText(str2);
            localPlayerController.setMask(maskSrc);
        }
    }
}
