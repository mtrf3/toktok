package X;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidGaussBlurOptSetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: X.ByI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30514ByI extends AbstractC30473Bxd implements IFilterManager.FaceDetectListener, ILiveStream.ILiveStreamErrorListener, IFilterManager.EffectMsgListener, ILiveStream.ILiveStreamInfoListener, ILiveStream.ITextureFrameAvailableListener {
    public InterfaceC30497By1 LJLJJI;
    public ILiveStream.ILiveStreamInfoListener LJLJJL;
    public InterfaceC21020s6 LJLJJLL;
    public IFilterManager LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL = 1;
    public EnumC30414Bwg LJLL;
    public final boolean LJLLI;
    public boolean LJLLILLLL;
    public OSJ<Integer, Integer, String> LJLLJ;

    @Override // X.AbstractC30473Bxd
    public final void LJFF() {
    }

    @Override // X.AbstractC30473Bxd
    public final void LJI() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
    public final /* synthetic */ void onInfo(int i, int i2, String str) {
        C30499By3.LIZ(this, i, i2, str);
    }

    @Override // X.AbstractC30473Bxd
    public final EffectImageInfo LIZLLL() {
        return this.LJLJL.getEffectCapturedImagewithKey("navi_capture");
    }

    public final void LJIJ() {
        int videoCaptureDevice;
        if (this.LJLJJLL.getLiveCore() != null && this.LJLJJLL.getLiveCore().getBuilder() != null && (videoCaptureDevice = this.LJLJJLL.getLiveCore().getBuilder().getVideoCaptureDevice()) != 5) {
            this.LJLJLLL = videoCaptureDevice;
        }
    }

    public final void LJIILL() {
        InterfaceC05190Ih interfaceC05190Ih;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) == null || this.LJLJJLL.getLiveCore() == null || !(interfaceC05190Ih instanceof User)) {
            return;
        }
        ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(interfaceC05190Ih.getAvatarThumb(), new C30515ByJ(this));
    }

    @Override // X.AbstractC30473Bxd
    public final void LIZIZ(C11030bz c11030bz) {
        c11030bz.LIZ = this.LJLJL;
    }

    @Override // X.AbstractC30473Bxd
    public final void LIZJ(boolean z) {
        this.LJLJJLL.LJIJ(z);
    }

    @Override // X.AbstractC30473Bxd
    public final void LJ(AbstractC39330Fc6 abstractC39330Fc6) {
        this.LJLJI = null;
        this.LJLJJLL.LJJIIZI(abstractC39330Fc6);
        C1JI.LJJIIJZLJL("release_video");
        this.LJLJL.setFaceDetectListener(null);
        this.LJLJL.setEffectMsgListener(null);
    }

    @Override // X.AbstractC30473Bxd
    public final int LJII(String str) {
        return this.LJLJL.composerRemoveNodes(new String[]{str}, 1);
    }

    @Override // X.AbstractC30473Bxd
    public final int LJIIJ(String str) {
        return this.LJLJL.composerAppendNodes(new String[]{str}, 1);
    }

    @Override // X.AbstractC30473Bxd
    public final synchronized void LJIIJJI(InterfaceC30498By2 interfaceC30498By2) {
        InterfaceC21020s6 interfaceC21020s6;
        super.LJIIJJI(interfaceC30498By2);
        if (interfaceC30498By2 == null && (interfaceC21020s6 = this.LJLJJLL) != null) {
            interfaceC21020s6.LJIIIIZZ(this);
        }
    }

    @Override // X.AbstractC30473Bxd
    public final void LJIIL(InterfaceC30497By1 interfaceC30497By1) {
        this.LJLJJI = interfaceC30497By1;
    }

    public final void LJIIZILJ(C78862UxG c78862UxG) {
        if (this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = true;
        this.LJLJJLL.LJJI(c78862UxG);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.FaceDetectListener
    public final void onFaceDetectResultCallback(int i) {
        List<IVideoEffectProcessor.FaceDetectListener> list = this.LJLIL;
        if (list == null) {
            return;
        }
        for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
            ((IVideoEffectProcessor.FaceDetectListener) ListProtector.get(this.LJLIL, size)).onFaceDetectResultCallback(i);
        }
    }

    public final void LJIILLIIL(Cert cert, boolean z) {
        LJIJ();
        if (z) {
            this.LJLJJLL.LJJIIJZLJL(this.LJLJLLL, cert);
            return;
        }
        this.LJLJJLL.LJJIIJZLJL(5, cert);
        if (MultiGuestAndroidGaussBlurOptSetting.INSTANCE.isOptGaussBlur()) {
            return;
        }
        LJIILL();
    }

    public C30514ByI(TextureView textureView, CKO cko, boolean z) {
        LJIILJJIL(textureView, cko, z, false);
    }

    @Override // X.AbstractC30473Bxd
    public final void LJIILIIL(C30477Bxh c30477Bxh, boolean z, boolean z2) {
        InterfaceC30497By1 interfaceC30497By1;
        this.LJLJJI = c30477Bxh;
        if (z2) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (dataChannelGlobal.mv0(C29056Bam.class) != null) {
                this.LJLLJ = (OSJ) dataChannelGlobal.mv0(C29056Bam.class);
                ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29056Bam.class);
            }
        }
        OSJ<Integer, Integer, String> osj = this.LJLLJ;
        if (osj == null) {
            return;
        }
        if ((z2 || (z && this.LJLLILLLL)) && (interfaceC30497By1 = this.LJLJJI) != null) {
            interfaceC30497By1.onInfo(1, osj.getFirst().intValue(), this.LJLLJ.getSecond().intValue(), this.LJLLJ.getThird());
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i, int i2, Exception exc) {
        InterfaceC30497By1 interfaceC30497By1 = this.LJLJJI;
        if (interfaceC30497By1 != null) {
            interfaceC30497By1.onError(i, i2);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
    public final void onInfo(int i, int i2, int i3) {
        if (i == 5) {
            this.LJLJLJ = false;
        }
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.LJLJJL;
        if (iLiveStreamInfoListener != null) {
            iLiveStreamInfoListener.onInfo(i, i2, i3);
        }
    }

    public C30514ByI(SurfaceView surfaceView, InterfaceC21020s6 interfaceC21020s6, boolean z, boolean z2) {
        LJIILJJIL(surfaceView, interfaceC21020s6, z, z2);
    }

    @Override // X.AbstractC30473Bxd
    public final int LJIIIZ(int i, int i2, int i3, String str) {
        return this.LJLJL.sendEffectMsg(i, i2, i3, str);
    }

    public final void LJIILJJIL(View view, InterfaceC21020s6 interfaceC21020s6, boolean z, boolean z2) {
        boolean z3;
        this.LJLJJLL = interfaceC21020s6;
        interfaceC21020s6.LJJIJ(view);
        this.LJLJJLL.setTextureFrameAvailableListener(this);
        this.LJLJJLL.setErrorListener(this);
        this.LJLJJLL.setInfoListener(this);
        IFilterManager videoFilterMgr = this.LJLJJLL.getVideoFilterMgr();
        this.LJLJL = videoFilterMgr;
        if (!LiveEffectDowngradeSetting.INSTANCE.remove() || !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        videoFilterMgr.enable(z3);
        this.LJLJL.setFaceDetectListener(this);
        this.LJLJL.setEffectMsgListener(this);
        if (z) {
            this.LJLJJLL.LJJII(C78857UxB.LJJIIJ(1476788233, "bpea-355"));
            C1JI.LJJIIJZLJL("capture_video");
        }
        LJIJ();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.OSJ<java.lang.Integer, java.lang.Integer, java.lang.String>, O] */
    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.EffectMsgListener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 2139095041) {
            this.LJLLILLLL = true;
            this.LJLLJ = new OSJ<>(Integer.valueOf(i2), Integer.valueOf(i3), str);
            Boolean bool = Boolean.TRUE;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (bool.equals(dataChannelGlobal.mv0(C29032BaO.class))) {
                ((C32537Cpp) dataChannelGlobal.gv0(C29056Bam.class)).LIZ = this.LJLLJ;
            }
        }
        if (this.LJLL == EnumC30414Bwg.EVENT_PAGE_BROADCAST_PREVIEW && this.LJLLI) {
            Iterator<InterfaceC30516ByK> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().onMessageReceived(i, i2, i3, str);
            }
            return;
        }
        if (i == 2139095041) {
            InterfaceC30497By1 interfaceC30497By1 = this.LJLJJI;
            if (interfaceC30497By1 != null) {
                interfaceC30497By1.onInfo(1, i2, i3, str);
                return;
            }
            return;
        }
        if (i == 32) {
            InterfaceC30497By1 interfaceC30497By12 = this.LJLJJI;
            if (interfaceC30497By12 == null) {
                return;
            }
            interfaceC30497By12.onInfo(2, i2, i3, str);
            return;
        }
        if (i == 112) {
            LJIIIZ(112, 2, 1, "");
            return;
        }
        Iterator<InterfaceC30516ByK> it2 = this.LJLILLLLZI.iterator();
        while (it2.hasNext()) {
            it2.next().onMessageReceived(i, i2, i3, str);
        }
    }

    public C30514ByI(SurfaceView surfaceView, InterfaceC21020s6 interfaceC21020s6, boolean z, boolean z2, boolean z3) {
        this.LJLLI = z3;
        LJIILJJIL(surfaceView, interfaceC21020s6, z, z2);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public final void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        InterfaceC30498By2 interfaceC30498By2 = this.LJLJI;
        if (interfaceC30498By2 != null) {
            interfaceC30498By2.LIZ(eGLContext, i, z ? 1 : 0, i2, i3, j);
        }
    }
}
