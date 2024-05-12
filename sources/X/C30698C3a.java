package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.LiveStreamFpsReportData;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LinkVideoReleaseComposerManagerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoCaptureChangeEvent;
import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableScopeMonitorAbSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautyDebug3Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.android.livesdk.model.ByteAudioConfig;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.C3a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30698C3a extends SurfaceView implements UB9, InterfaceC24140x8, InterfaceC74605TPt, InterfaceC31994Ch4 {
    public final C24130x7 LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public C30704C3g LJLJJI;
    public final StickerMessageManager LJLJJL;
    public final C30514ByI LJLJJLL;
    public final CKO LJLJL;
    public final IFilterManager LJLJLJ;
    public boolean LJLJLLL;
    public C73411SrX LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public InterfaceC17140lq LJLLL;
    public DataChannel LJLLLL;
    public InterfaceC31981Ni LJLLLLLL;

    @Override // X.InterfaceC74605TPt
    public final void LJI() {
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC24140x8
    public /* bridge */ /* synthetic */ void setStreamCallback(InterfaceC21030s7 interfaceC21030s7) {
    }

    @Override // X.InterfaceC74605TPt
    public final void LIZLLL() {
        this.LJLJL.LIZLLL(C78857UxB.LJJIIJ(1476788483, "bpea-568"));
    }

    @Override // X.InterfaceC74605TPt
    public final Boolean LJ() {
        if (this.LJLJL != null) {
            boolean LIZ = C29219BdP.LIZ(getContext(), this.LJLJL);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isAudioBeOccupied:");
            LIZ2.append(LIZ);
            C0NB.LIZIZ("LinkVideo2View", X1D.LIZIZ(LIZ2));
            return Boolean.valueOf(LIZ);
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC74605TPt
    public final void LJII() {
        C0NB.LIZIZ("LinkVideo2View", "startCaptureVideo");
        C30514ByI c30514ByI = this.LJLJJLL;
        if (c30514ByI != null) {
            c30514ByI.LJLJJLL.LJJII(C78857UxB.LJJIIJ(1476788233, "bpea-355"));
            C1JI.LJJIIJZLJL("capture_video");
        }
    }

    @Override // X.InterfaceC31994Ch4
    public final void finishPlayStickerGift() {
        InterfaceC31981Ni interfaceC31981Ni = this.LJLLLLLL;
        if (interfaceC31981Ni != null) {
            interfaceC31981Ni.LIZLLL("effect_gift");
        }
    }

    @Override // X.InterfaceC24140x8
    public InterfaceC75217TfZ getEffectWrapperProxy() {
        return new C30480Bxk(this.LJLJJLL);
    }

    @Override // X.UB9
    public ILiveStream getLiveCore() {
        return this.LJLJL.LJ;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        if ((getParent() instanceof InterfaceC30717C3t) && ((InterfaceC30717C3t) getParent()).LIZIZ()) {
            super.onAttachedToWindow();
            return;
        }
        if ((getParent() instanceof InterfaceC30716C3s) && ((InterfaceC30716C3s) getParent()).isAdjustParent()) {
            super.onAttachedToWindow();
        } else if (C7N.LJIILJJIL().I80()) {
            super.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
            this.LJLJL.LJIIJJI(C78857UxB.LJJIIJ(1476788234, "bpea-373"));
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        C73411SrX c73411SrX;
        if ((getParent() instanceof InterfaceC30717C3t) && ((InterfaceC30717C3t) getParent()).LIZIZ()) {
            super.onDetachedFromWindow();
            return;
        }
        if ((getParent() instanceof InterfaceC30716C3s) && ((InterfaceC30716C3s) getParent()).isAdjustParent()) {
            super.onDetachedFromWindow();
            return;
        }
        if (C7N.LJIILJJIL().I80()) {
            super.onDetachedFromWindow();
            return;
        }
        if (!this.LJLLJ) {
            super.onDetachedFromWindow();
            return;
        }
        if (!this.LJLILLLLZI) {
            this.LJLLLL.qv0(LinkVideoReleaseComposerManagerEvent.class, this.LJLLLLLL);
            InterfaceC31981Ni interfaceC31981Ni = this.LJLLLLLL;
            if (interfaceC31981Ni != null) {
                if (interfaceC31981Ni instanceof InterfaceC31971Nh) {
                    interfaceC31981Ni.release();
                }
                InterfaceC31981Ni interfaceC31981Ni2 = this.LJLLLLLL;
                if (interfaceC31981Ni2 instanceof InterfaceC31981Ni) {
                    interfaceC31981Ni2.LJJI();
                }
            }
            this.LJLLLL.qv0(LiveStreamFpsReportData.class, new C34941Ys());
            this.LJLJJLL.LJ(C78857UxB.LJJIIJ(1476788484, "bpea-433"));
            this.LJLJL.LIZJ(C78857UxB.LJJIIJ(1476788484, "bpea-400"));
            this.LJLJL.LJIJJLI(C78857UxB.LJJIIJ(1476788484, "bpea-493"));
            this.LJLJI = true;
            this.LJLILLLLZI = true;
        }
        super.onDetachedFromWindow();
        if (!this.LJLILLLLZI && (c73411SrX = this.LJLL) != null && !c73411SrX.isDisposed()) {
            this.LJLL.dispose();
        }
    }

    @Override // X.InterfaceC24140x8
    public final boolean LJIILIIL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC24140x8
    public Object getAttachedComposerManager() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC24140x8
    public InterfaceC21020s6 getLiveStream() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC24140x8
    public final void LIZ(boolean z) {
        if (z) {
            this.LJLLILLLL = 2;
        } else {
            this.LJLLILLLL = 1;
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LIZIZ(C78862UxG c78862UxG) {
        LiveCore liveCore;
        C0NB.LIZIZ("LinkVideo2View", "switchCamera");
        if (this.LJLJJLL != null) {
            CKO cko = this.LJLJL;
            if (cko != null && (liveCore = cko.LJ) != null && liveCore.getBuilder() != null) {
                int i = 1;
                if (this.LJLJL.LJ.getBuilder().getVideoCaptureDevice() == 1) {
                    i = 2;
                }
                this.LJLLILLLL = i;
            }
            this.LJLJJLL.LJIIZILJ(c78862UxG);
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LIZJ(Cert cert) {
        try {
            CKO cko = this.LJLJL;
            if (cko != null) {
                cko.LIZJ(cert);
            }
        } catch (NullPointerException e) {
            C0NB.LJIIJ(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIIZ(int i) {
        C30704C3g c30704C3g = this.LJLJJI;
        if (c30704C3g != null) {
            c30704C3g.LJ(i);
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIJ(Cert cert) {
        try {
            CKO cko = this.LJLJL;
            if (cko != null) {
                cko.LJIIJJI((AbstractC39330Fc6) cert);
            }
            this.LJLJJL.start();
        } catch (NullPointerException e) {
            C0NB.LJIIJ(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    @Override // X.UB9
    public final Client create(InteractConfig interactConfig) {
        return this.LJLJL.create(interactConfig);
    }

    @Override // X.InterfaceC74605TPt
    public final void release(Cert cert) {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLJJL.destroy();
        this.LJLILLLLZI = true;
        InterfaceC31981Ni interfaceC31981Ni = this.LJLLLLLL;
        if (interfaceC31981Ni != null) {
            if (interfaceC31981Ni instanceof InterfaceC31971Nh) {
                interfaceC31981Ni.release();
            }
            InterfaceC31981Ni interfaceC31981Ni2 = this.LJLLLLLL;
            if (interfaceC31981Ni2 instanceof InterfaceC31981Ni) {
                interfaceC31981Ni2.LJJI();
            }
        }
        C30514ByI c30514ByI = this.LJLJJLL;
        if (c30514ByI != null) {
            c30514ByI.LJIIIIZZ(this.LJLJJL);
            this.LJLJJLL.getClass();
            this.LJLJJLL.LJ((AbstractC39330Fc6) cert);
        }
        CKO cko = this.LJLJL;
        if (cko != null) {
            cko.LJIJI(cert);
            this.LJLJL.LIZJ(cert);
            this.LJLJL.LJIJJLI((AbstractC39330Fc6) cert);
        }
        C73411SrX c73411SrX = this.LJLL;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            this.LJLL.dispose();
        }
        this.LJLLLL.qv0(LiveStreamFpsReportData.class, new C34941Ys());
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C54992Dv.class);
        dataChannelGlobal.tv0(LiveStreamGlobalChannel.class, C3Z.LIZ.LIZIZ());
    }

    @Override // X.InterfaceC24140x8
    public void setCurrentLayoutParam(ViewGroup.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public void setDataChannel(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        this.LJLLLL = dataChannel;
    }

    public void setLinkMicLiveEffectCallback(InterfaceC17140lq interfaceC17140lq) {
        this.LJLLL = interfaceC17140lq;
    }

    @Override // X.InterfaceC24140x8
    public void setReleaseMode(boolean z) {
        this.LJLLJ = z;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [X.0s6, java.lang.Object, X.CKO, O] */
    public C30698C3a(Context context, C24130x7 c24130x7) {
        super(context, null);
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        this.LJLLILLLL = 1;
        this.LJLLJ = true;
        C30710C3m c30710C3m = new C30710C3m(this);
        this.LJLIL = c24130x7;
        EnumC31814CeA enumC31814CeA = EnumC31814CeA.INST;
        String modelFilePath = enumC31814CeA.getModelFilePath();
        if (c24130x7 == null || c24130x7.LJ != 0) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJLLI = true;
        if (c24130x7 != null && !c24130x7.LJFF) {
            this.LJLLI = false;
            i = 5;
        }
        String value = AdmServerCfgSetting.INSTANCE.getValue();
        ByteAudioConfig byteAudioConfig = new ByteAudioConfig();
        byteAudioConfig.admType = 1;
        byteAudioConfig.admServerCfg = value;
        if (LiveAbLabelSetting.INSTANCE.getIntValue("opt_up_sample") == 1) {
            z = true;
        } else {
            z = false;
        }
        C14080gu c14080gu = new C14080gu(getContext());
        c14080gu.LJJ = C7N.LJIJ().v70();
        c14080gu.LJJIJ = new C30730C4g();
        c14080gu.LJIJJLI = new C63078OpG();
        c14080gu.LJJIJIIJI = new C5ML();
        c14080gu.LJIJ = i;
        c14080gu.LJIJI = 5;
        c14080gu.LJIJJ = byteAudioConfig;
        TestEnableEffectSetting testEnableEffectSetting = TestEnableEffectSetting.INSTANCE;
        c14080gu.LJJIJIL = testEnableEffectSetting.disable() ? null : modelFilePath;
        c14080gu.LJJIJL = testEnableEffectSetting.disable() ? null : enumC31814CeA.getResourceFinder(getContext());
        c14080gu.LJJJIL = C30922CBq.LIZIZ;
        c14080gu.LJJJJ = LiveEnableScopeMonitorAbSetting.INSTANCE.enable();
        if (z) {
            i2 = 540;
            i3 = 960;
        } else {
            i2 = 240;
            i3 = 320;
        }
        c14080gu.LJJIL = i2;
        c14080gu.LJJIZ = i3;
        c14080gu.LJJJJIZL = false;
        if (C30922CBq.LIZIZ) {
            c14080gu.LJI = MultiGuestBeautyDebug3Setting.getValue();
        }
        if (MultiGuestV3ChangeFpsGuestSetting.INSTANCE.isEnable()) {
            c14080gu.LJIIIIZZ = 1;
            c14080gu.LJII = 15;
        }
        String value2 = MultiGuestV3GuestSetting.INSTANCE.getValue();
        if (value2 != null && !value2.isEmpty()) {
            c14080gu.LJJIIZI = value2;
        }
        ?? cko = new CKO(c14080gu.LIZ());
        this.LJLJL = cko;
        if (c24130x7 == null || c24130x7.LJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        C30514ByI c30514ByI = new C30514ByI(this, cko, z2, false);
        c30514ByI.LJLJJL = new ILiveStream.ILiveStreamInfoListener() { // from class: X.ByH
            @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
            public final /* synthetic */ void onInfo(int i4, int i5, String str) {
                C30499By3.LIZ(this, i4, i5, str);
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
            public final void onInfo(int i4, int i5, int i6) {
                DataChannel dataChannel;
                C30698C3a c30698C3a = C30698C3a.this;
                c30698C3a.getClass();
                if ((i4 != 4 && i4 != 5 && i4 != 6) || (dataChannel = c30698C3a.LJLLLL) == null) {
                    return;
                }
                dataChannel.qv0(MultiGuestV3VideoCaptureChangeEvent.class, new OSJ(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
            }
        };
        c30514ByI.LJLL = EnumC30414Bwg.EVENT_PAGE_MULTI_GUEST;
        this.LJLJJLL = c30514ByI;
        IFilterManager videoFilterMgr = cko.getVideoFilterMgr();
        this.LJLJLJ = videoFilterMgr;
        StickerMessageManager stickerMessageManager = new StickerMessageManager(this);
        this.LJLJJL = stickerMessageManager;
        InterfaceC31981Ni composerManagerB = C7N.LJII().composerManagerB();
        o.LJIIIIZZ(composerManagerB, "effectService.composerManagerB()");
        this.LJLLLLLL = composerManagerB;
        C08770Wb c08770Wb = new C08770Wb();
        c08770Wb.LIZLLL = "guest_linkmic";
        c08770Wb.LIZ = C0TY.LJIIIIZZ;
        c08770Wb.LJ = true;
        c08770Wb.LIZJ = ((IEffectService) CN1.LIZ(IEffectService.class)).getDefaultComposerHandler(videoFilterMgr, "LinkVideo2View");
        composerManagerB.LJJIIZ(new C08780Wc(c08770Wb));
        c30514ByI.LJLJJI = new C30706C3i(this);
        c30514ByI.LIZ(stickerMessageManager);
        LiveCore liveCore = cko.LJ;
        if (liveCore != null) {
            liveCore.setDataListener(new ILiveStream.ILiveStreamDataListener() { // from class: X.C3n
                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamDataListener
                public final void onData(int i4, int i5, int i6) {
                    DataChannel dataChannel = C30698C3a.this.LJLLLL;
                    if (dataChannel != null) {
                        dataChannel.qv0(MultiGuestAudioVolumeEvent.class, Integer.valueOf(i5));
                    }
                }
            });
            cko.setStreamCallback(c30710C3m);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((C32537Cpp) dataChannelGlobal.gv0(C54992Dv.class)).LIZ = cko;
        dataChannelGlobal.tv0(LiveStreamGlobalChannel.class, cko);
    }

    @Override // X.InterfaceC74605TPt
    public final void LJFF(boolean z, Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioMute mute=");
        LIZ.append(z);
        LIZ.append(" cert");
        LIZ.append(cert);
        LIZ.append("liveStream=");
        LIZ.append(this.LJLJL);
        C0NB.LIZIZ("LinkVideo2View", X1D.LIZIZ(LIZ));
        CKO cko = this.LJLJL;
        if (cko != null) {
            cko.LJIIL(z, (AbstractC39330Fc6) cert);
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIJJI(Cert cert, boolean z) {
        int videoCaptureDevice;
        CKO cko;
        LiveCore liveCore;
        C10S.LIZ("switchCamera openCamera=", z, "LinkVideo2View");
        if (z == this.LJLLI && ((cko = this.LJLJL) == null || (liveCore = cko.LJ) == null || liveCore.getBuilder() == null || this.LJLLILLLL == this.LJLJL.LJ.getBuilder().getVideoCaptureDevice())) {
            return;
        }
        this.LJLLI = z;
        if (z) {
            this.LJLJL.LJJIIJZLJL(this.LJLLILLLL, cert);
            return;
        }
        LiveCore liveCore2 = this.LJLJL.LJ;
        if (liveCore2 != null && liveCore2.getBuilder() != null && (videoCaptureDevice = this.LJLJL.LJ.getBuilder().getVideoCaptureDevice()) != 5) {
            this.LJLLILLLL = videoCaptureDevice;
        }
        this.LJLJL.LJJIIJZLJL(5, cert);
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIL(String str, String str2) {
        setCustomStickerImage(str, str2, false);
    }

    @Override // X.InterfaceC31994Ch4
    public final void startPlayStickerGift(LiveEffect liveEffect, boolean z) {
        InterfaceC31981Ni interfaceC31981Ni = this.LJLLLLLL;
        if (interfaceC31981Ni != null) {
            interfaceC31981Ni.LIZIZ(liveEffect, "effect_gift");
        }
    }

    @Override // X.InterfaceC31994Ch4
    public final void setCustomStickerImage(String str, String str2, boolean z) {
        IFilterManager iFilterManager;
        if (str == null || "".equals(str) || str2 == null || "".equals(str2) || (iFilterManager = this.LJLJLJ) == null) {
            return;
        }
        iFilterManager.setCustomEffect(str, str2);
    }
}
