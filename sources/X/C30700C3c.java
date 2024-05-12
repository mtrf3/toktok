package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.model.ByteAudioConfig;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* renamed from: X.C3c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30700C3c extends SurfaceView implements InterfaceC24140x8, InterfaceC74605TPt {
    public final C30514ByI LJLIL;
    public final InterfaceC21020s6 LJLILLLLZI;
    public boolean LJLJI;
    public CXQ LJLJJI;
    public final C30712C3o LJLJJL;

    @Override // X.InterfaceC24140x8
    public final void LIZ(boolean z) {
    }

    @Override // X.InterfaceC24140x8
    public final void LIZIZ(C78862UxG c78862UxG) {
    }

    @Override // X.InterfaceC74605TPt
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC74605TPt
    public final /* synthetic */ void LJI() {
    }

    @Override // X.InterfaceC74605TPt
    public final /* synthetic */ void LJII() {
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIIZ(int i) {
    }

    @Override // X.InterfaceC24140x8
    public final /* synthetic */ void LJIIL(String str, String str2) {
    }

    @Override // X.InterfaceC24140x8
    public final /* synthetic */ boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC24140x8
    public Object getAttachedComposerManager() {
        return null;
    }

    @Override // X.InterfaceC24140x8
    public /* bridge */ /* synthetic */ InterfaceC75217TfZ getEffectWrapperProxy() {
        return null;
    }

    public /* bridge */ /* synthetic */ void setDataChannel(DataChannel dataChannel) {
    }

    public /* bridge */ /* synthetic */ void setLinkMicLiveEffectCallback(InterfaceC17140lq interfaceC17140lq) {
    }

    @Override // X.InterfaceC24140x8
    public void setReleaseMode(boolean z) {
    }

    @Override // X.InterfaceC24140x8
    public /* bridge */ /* synthetic */ void setStreamCallback(InterfaceC21030s7 interfaceC21030s7) {
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIIIZZ() {
        Handler handler;
        CXQ cxq = this.LJLJJI;
        if (cxq != null && (handler = cxq.LJLJLLL) != null) {
            handler.sendEmptyMessage(234);
        }
    }

    public LiveCore getLiveCore() {
        return this.LJLILLLLZI.getLiveCore();
    }

    @Override // X.InterfaceC74605TPt
    public final Boolean LJ() {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC24140x8
    public InterfaceC21020s6 getLiveStream() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC74605TPt
    public final void LIZJ(Cert cert) {
        try {
            this.LJLIL.getClass();
            this.LJLILLLLZI.LIZJ(cert);
        } catch (NullPointerException e) {
            C0NB.LJIIJ(6, "VirtualLinkView", e.getStackTrace());
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIJ(Cert cert) {
        try {
            this.LJLIL.getClass();
            this.LJLILLLLZI.LJIIJJI((AbstractC39330Fc6) cert);
        } catch (NullPointerException e) {
            C0NB.LJIIJ(6, "VirtualLinkView", e.getStackTrace());
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void release(Cert cert) {
        this.LJLIL.getClass();
        AbstractC39330Fc6 abstractC39330Fc6 = (AbstractC39330Fc6) cert;
        this.LJLIL.LJ(abstractC39330Fc6);
        this.LJLILLLLZI.LIZJ(cert);
        this.LJLILLLLZI.LJIJJLI(abstractC39330Fc6);
    }

    @Override // X.InterfaceC24140x8
    public void setCurrentLayoutParam(ViewGroup.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC74605TPt
    public final void LJFF(boolean z, Cert cert) {
        this.LJLILLLLZI.LJIIL(z, (AbstractC39330Fc6) cert);
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIJJI(Cert cert, boolean z) {
        this.LJLJI = z;
        if (z) {
            CXQ cxq = new CXQ(getLiveCore(), this.LJLJJL);
            this.LJLJJI = cxq;
            cxq.start();
        } else {
            CXQ cxq2 = this.LJLJJI;
            if (cxq2 == null) {
                return;
            }
            cxq2.quitSafely();
            this.LJLJJI = null;
        }
    }

    public C30700C3c(Context context, C24130x7 c24130x7, String str, String str2) {
        super(context);
        C30712C3o c30712C3o = new C30712C3o();
        this.LJLJJL = c30712C3o;
        this.LJLJI = c24130x7.LJFF;
        c30712C3o.LIZ = str2;
        c30712C3o.LIZJ = 320;
        c30712C3o.LIZIZ = 240;
        String value = AdmServerCfgSetting.INSTANCE.getValue();
        ByteAudioConfig byteAudioConfig = new ByteAudioConfig();
        byteAudioConfig.admType = 1;
        byteAudioConfig.admServerCfg = value;
        C14080gu c14080gu = new C14080gu(getContext());
        c14080gu.LJJ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).v70();
        c14080gu.LJJIJ = new C30730C4g();
        c14080gu.LJIJJLI = new C63078OpG();
        c14080gu.LJJIJIIJI = new C5ML();
        c14080gu.LJIJ = 5;
        c14080gu.LJJIL = 240;
        c14080gu.LJJIZ = 320;
        c14080gu.LJJIJIIJIL = getContext().getAssets();
        c14080gu.LJIJI = 5;
        c14080gu.LJIILJJIL = -1L;
        c14080gu.LJIJJ = byteAudioConfig;
        if (!TextUtils.isEmpty(str)) {
            c14080gu.LJJIIZI = str;
        }
        InterfaceC21020s6 createLiveStream = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveStream(c14080gu.LIZ());
        this.LJLILLLLZI = createLiveStream;
        createLiveStream.getVideoFilterMgr().enable(true);
        createLiveStream.getVideoFilterMgr().composerSetMode(1, 0);
        this.LJLIL = new C30514ByI(this, createLiveStream, true, false);
        createLiveStream.LIZLLL(C78857UxB.LJJIIJ(1476788234, "bpea-1643"));
        if (this.LJLJI) {
            CXQ cxq = new CXQ(getLiveCore(), c30712C3o);
            this.LJLJJI = cxq;
            cxq.start();
        }
        createLiveStream.LJIIJJI(C78857UxB.LJJIIJ(1476788234, "bpea-1644"));
    }
}
