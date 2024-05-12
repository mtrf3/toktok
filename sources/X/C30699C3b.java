package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import kotlin.jvm.internal.o;

/* renamed from: X.C3b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30699C3b implements InterfaceC24140x8, InterfaceC74605TPt {
    public final String LJLIL;
    public final TextureView LJLILLLLZI;
    public final C24130x7 LJLJI;
    public final Object LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public C30704C3g LJLJL;
    public final C30514ByI LJLJLJ;
    public final CKO LJLJLLL;
    public final IFilterManager LJLL;
    public boolean LJLLI;
    public C73411SrX LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public final C0WF LJLLLLLL;
    public final View LJLZ;

    @Override // X.InterfaceC74605TPt
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC74605TPt
    public final /* synthetic */ void LJI() {
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC24140x8
    public final /* synthetic */ void LJIIL(String str, String str2) {
    }

    @Override // X.InterfaceC74605TPt
    public final void LJII() {
        C30514ByI c30514ByI = this.LJLJLJ;
        if (c30514ByI != null) {
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788234, "bpea-multiguest_start_capture_video_in_preview_panel");
            InterfaceC21020s6 interfaceC21020s6 = c30514ByI.LJLJJLL;
            if (interfaceC21020s6 != null) {
                interfaceC21020s6.LJJII(LJJIIJ);
                C1JI.LJJIIJZLJL("capture_video");
            }
        }
    }

    public final void LJIILJJIL() {
        C73411SrX c73411SrX;
        if (!this.LJLLLL) {
            return;
        }
        if (!this.LJLJJL) {
            LJIILL();
            C30514ByI c30514ByI = this.LJLJLJ;
            if (c30514ByI != null) {
                c30514ByI.LJ(C78857UxB.LJJIIJ(1476788483, "bpea-multiguest_destory_linkmic_preview"));
            }
            CKO cko = this.LJLJLLL;
            if (cko != null) {
                cko.LIZJ(C78857UxB.LJJIIJ(1476788483, "bpea-live_stream_pause_in_linkmic_preview"));
                CKO cko2 = this.LJLJLLL;
                if (cko2 != null) {
                    cko2.LJIJJLI(C78857UxB.LJJIIJ(1476788483, "bpea-livestream_release_in_linkmic_preview"));
                }
            }
            this.LJLJJLL = true;
        }
        if (!this.LJLJJL && (c73411SrX = this.LJLLILLLL) != null) {
            c73411SrX.dispose();
        }
    }

    public final void LJIILL() {
        C0WF c0wf = this.LJLLLLLL;
        if (c0wf != null) {
            if (c0wf instanceof InterfaceC31971Nh) {
                c0wf.release();
            }
            C0WF c0wf2 = this.LJLLLLLL;
            if (c0wf2 instanceof InterfaceC31981Ni) {
                o.LJII(c0wf2, "null cannot be cast to non-null type com.bytedance.android.live.effect.api.effect.ILiveComposerManagerB");
                ((InterfaceC31981Ni) c0wf2).LJJI();
            }
        }
    }

    @Override // X.InterfaceC24140x8
    public final InterfaceC75217TfZ getEffectWrapperProxy() {
        return new C30480Bxk(this.LJLJLJ);
    }

    @Override // X.InterfaceC74605TPt
    public final Boolean LJ() {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC24140x8
    public final boolean LJIILIIL() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC24140x8
    public final Object getAttachedComposerManager() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC24140x8
    public final InterfaceC21020s6 getLiveStream() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC24140x8
    public final void LIZ(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.LJLLL = i;
    }

    @Override // X.InterfaceC24140x8
    public final void LIZIZ(C78862UxG c78862UxG) {
        C30514ByI c30514ByI = this.LJLJLJ;
        if (c30514ByI != null) {
            c30514ByI.LJIIZILJ(c78862UxG);
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LIZJ(Cert cert) {
        o.LJIIIZ(cert, "cert");
        try {
            CKO cko = this.LJLJLLL;
            if (cko != null) {
                cko.LIZJ(cert);
            }
        } catch (NullPointerException e) {
            C0NB.LJIIJ(6, this.LJLIL, e.getStackTrace());
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIIZ(int i) {
        C30704C3g c30704C3g = this.LJLJL;
        if (c30704C3g == null) {
            return;
        }
        c30704C3g.LJ(i);
    }

    @Override // X.InterfaceC74605TPt
    public final void LJIIJ(Cert cert) {
        o.LJIIIZ(cert, "cert");
        try {
            CKO cko = this.LJLJLLL;
            if (cko != null) {
                cko.LJIIJJI((AbstractC39330Fc6) cert);
            }
        } catch (NullPointerException e) {
            C0NB.LJIIJ(6, this.LJLIL, e.getStackTrace());
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void release(Cert cert) {
        o.LJIIIZ(cert, "cert");
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        LJIILL();
        C30514ByI c30514ByI = this.LJLJLJ;
        if (c30514ByI != null) {
            c30514ByI.LJ((AbstractC39330Fc6) cert);
        }
        CKO cko = this.LJLJLLL;
        if (cko != null) {
            cko.LJIJI(cert);
            CKO cko2 = this.LJLJLLL;
            if (cko2 != null) {
                cko2.LIZJ(cert);
            }
            CKO cko3 = this.LJLJLLL;
            if (cko3 != null) {
                cko3.LJIJJLI((AbstractC39330Fc6) cert);
            }
        }
        C73411SrX c73411SrX = this.LJLLILLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // X.InterfaceC24140x8
    public final void setCurrentLayoutParam(ViewGroup.LayoutParams layoutParams) {
        View view = this.LJLZ;
        if (view == null) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC24140x8
    public final void setReleaseMode(boolean z) {
        this.LJLLLL = false;
    }

    @Override // X.InterfaceC24140x8
    public final void setStreamCallback(InterfaceC21030s7 interfaceC21030s7) {
        CKO cko;
        if (interfaceC21030s7 != null && (cko = this.LJLJLLL) != null) {
            cko.setStreamCallback(interfaceC21030s7);
        }
    }

    @Override // X.InterfaceC74605TPt
    public final void LJFF(boolean z, Cert cert) {
        o.LJIIIZ(cert, "cert");
        CKO cko = this.LJLJLLL;
        if (cko != null) {
            cko.LJIIL(z, (AbstractC39330Fc6) cert);
        }
    }

    @Override // X.InterfaceC24140x8
    public final void LJIIJJI(Cert cert, boolean z) {
        LiveCore liveCore;
        LiveCore.Builder builder;
        if (z == this.LJLLJ) {
            return;
        }
        this.LJLLJ = z;
        if (z) {
            CKO cko = this.LJLJLLL;
            if (cko != null) {
                cko.LJJIIJZLJL(this.LJLLL, cert);
                return;
            }
            return;
        }
        CKO cko2 = this.LJLJLLL;
        if (cko2 == null || (liveCore = cko2.LJ) == null || (builder = liveCore.getBuilder()) == null) {
            return;
        }
        int videoCaptureDevice = builder.getVideoCaptureDevice();
        if (videoCaptureDevice != 5) {
            this.LJLLL = videoCaptureDevice;
        }
        CKO cko3 = this.LJLJLLL;
        if (cko3 == null) {
            return;
        }
        cko3.LJJIIJZLJL(5, cert);
    }

    public C30699C3b(String str, Context context, SurfaceView surfaceView, TextureView textureView, C24130x7 c24130x7, Object obj) {
        int i;
        boolean z;
        o.LJIIIZ(context, "context");
        this.LJLIL = str;
        this.LJLILLLLZI = textureView;
        this.LJLJI = c24130x7;
        this.LJLJJI = obj;
        boolean z2 = true;
        this.LJLLL = 1;
        this.LJLLLL = true;
        if (surfaceView != null) {
            this.LJLZ = surfaceView;
        }
        if (textureView != null) {
            this.LJLZ = textureView;
        }
        EnumC31814CeA enumC31814CeA = EnumC31814CeA.INST;
        String modelFilePath = enumC31814CeA.getModelFilePath();
        if (c24130x7 == null || c24130x7.LJ != 0) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJLLJ = true;
        if (c24130x7 != null && !c24130x7.LJFF) {
            this.LJLLJ = false;
            i = 5;
        }
        C14080gu c14080gu = new C14080gu(context);
        c14080gu.LJJ = C7N.LJIJ().v70();
        c14080gu.LJJIJ = new C30730C4g();
        c14080gu.LJIJJLI = new C63078OpG();
        c14080gu.LJJIJIIJI = new C5ML();
        c14080gu.LJIJ = i;
        TestEnableEffectSetting testEnableEffectSetting = TestEnableEffectSetting.INSTANCE;
        c14080gu.LJJIJIL = testEnableEffectSetting.disable() ? null : modelFilePath;
        c14080gu.LJJIJL = testEnableEffectSetting.disable() ? null : enumC31814CeA.getResourceFinder(context);
        c14080gu.LJJIL = 240;
        c14080gu.LJJIZ = 320;
        c14080gu.LJJJJIZL = false;
        CKO cko = new CKO(c14080gu.LIZ());
        this.LJLJLLL = cko;
        IFilterManager videoFilterMgr = cko.getVideoFilterMgr();
        this.LJLL = videoFilterMgr;
        if (textureView != null) {
            if (c24130x7 == null || c24130x7.LJI) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJLJ = new C30514ByI(textureView, cko, z);
        }
        if (surfaceView != null) {
            if (c24130x7 != null && !c24130x7.LJI) {
                z2 = false;
            }
            C30514ByI c30514ByI = new C30514ByI(surfaceView, cko, z2, false);
            c30514ByI.LJLL = EnumC30414Bwg.EVENT_PAGE_MULTI_GUEST;
            this.LJLJLJ = c30514ByI;
        }
        if (obj instanceof C0WF) {
            C0WF c0wf = (C0WF) obj;
            this.LJLLLLLL = c0wf;
            if (c0wf != null) {
                C08770Wb c08770Wb = new C08770Wb();
                c08770Wb.LIZLLL = "guest_linkmic";
                c08770Wb.LIZ = C0TY.LJIIIIZZ;
                InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
                o.LJIIIIZZ(LIZ, "getService(T::class.java)");
                c08770Wb.LIZJ = ((IEffectService) LIZ).getDefaultComposerHandler(videoFilterMgr, str);
                c0wf.LJJIIZ(new C08780Wc(c08770Wb));
            }
        }
        C30514ByI c30514ByI2 = this.LJLJLJ;
        if (c30514ByI2 != null) {
            c30514ByI2.LJLJJI = new C30705C3h(this);
        }
        C0NB.LIZIZ(str, "init");
    }
}
