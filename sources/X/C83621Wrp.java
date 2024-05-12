package X;

import X.WLT;
import Y.AObjectS129S0200000_14;
import Y.AObjectS139S0100000_14;
import Y.AObjectS15S0001000_14;
import Y.AObjectS16S0001000_15;
import Y.AObjectS34S0000000_14;
import Y.AObjectS42S0101000_5;
import Y.AObjectS50S0101000_5;
import Y.AObjectS52S0101000_7;
import Y.AObjectS54S0101000_9;
import Y.AObjectS56S0101000_13;
import Y.AObjectS57S0101000_14;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS17S0201000_14;
import Y.ARunnableS18S0101000_14;
import Y.AfS62S0100000_10;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.lens.VELumaDetectParams;
import com.ss.android.vesdk.lens.VEOneKeyProcessParams;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wrp */
/* loaded from: classes15.dex */
public class C83621Wrp<T extends WLT> extends AbstractC29891Fh<T> implements InterfaceC135635Tz, WLT {
    public final C82622Wbi LJLIL;
    public final C40871j1<Boolean> LJLILLLLZI;
    public final C40871j1<Boolean> LJLJI;
    public final C40871j1<Boolean> LJLJJI;
    public final C29901Fi<C76800UCe> LJLJJL;
    public final C29901Fi<C76800UCe> LJLJJLL;
    public final C29901Fi<Integer> LJLJL;
    public final C29901Fi<HY0> LJLJLJ;
    public final C29901Fi<Boolean> LJLJLLL;
    public final C29901Fi<Boolean> LJLL;
    public final MutableLiveData<HK7> LJLLI;
    public final C29901Fi<Long> LJLLILLLL;
    public final C29901Fi<Long> LJLLJ;
    public final C29901Fi<Long> LJLLL;
    public final C29901Fi<Long> LJLLLL;
    public final C29901Fi<C76800UCe> LJLLLLLL;
    public final C29901Fi<OSZ<Integer, Float>> LJLZ;
    public final C29901Fi<Integer> LJZ;
    public final C29901Fi<C82085WJl> LJZI;
    public final C40871j1<WXA> LJZL;
    public final C29901Fi<Integer> LL;
    public final C29901Fi<Integer> LLD;
    public final C29901Fi<C45314HqQ> LLF;
    public final C29901Fi<WLF> LLFF;
    public final C29901Fi<WTD> LLFFF;
    public final C29901Fi<C76800UCe> LLFII;
    public final C29901Fi<C76800UCe> LLFZ;
    public EnumC82528WaC LLI;
    public final C40871j1<Double> LLIFFJFJJ;
    public final C29901Fi<C76800UCe> LLII;
    public final C29901Fi<C157166Eu> LLIIII;
    public final C29901Fi<OSZ<Integer, Integer>> LLIIIILZ;
    public final MutableLiveData<Float> LLIIIJ;
    public final MutableLiveData<C2PU> LLIIIL;
    public final C29901Fi<Boolean> LLIIIZ;
    public final MutableLiveData<Boolean> LLIIJI;
    public final C29901Fi<C76800UCe> LLIIJLIL;
    public final C29901Fi<Boolean> LLIIL;
    public final C29901Fi<C76800UCe> LLIILII;
    public final C29901Fi<OSZ<Integer, Boolean>> LLIILZL;
    public final C29S LLIIZ;
    public SurfaceView LLIL;
    public TextureView LLILII;
    public int LLILIL;
    public Surface LLILL;
    public InterfaceC83624Wrs LLILLIZIL;
    public InterfaceC83867Wvn LLILLJJLI;
    public VERecorder LLILLL;
    public C83665WsX LLILZ;
    public final CameraComponentModel LLILZIL;
    public IAW LLILZLL;
    public I8O LLIZ;
    public HC5 LLIZLLLIL;
    public SafeHandler LLJ;
    public volatile boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public final InterfaceC83790WuY LLJJ;
    public final InterfaceC44831Hid LLJJI;
    public final InterfaceC83618Wrm LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C83592WrM LLJLIL;
    public final InterfaceC83702Wt8 LLJLILLLLZIIL;
    public InterfaceC83697Wt3 LLJLL;
    public Effect LLJLLIL;
    public boolean LLJLLL;
    public long LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public Toast LLLFF;
    public InterfaceC83889Ww9 LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public float LLLIIIL;
    public boolean LLLIIL;
    public FrameLayout LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public InterfaceC83703Wt9 LLLILZJ;
    public InterfaceC83927Wwl LLLILZLLLI;
    public InterfaceC83725WtV<?> LLLIZZ;
    public WLV LLLJ;
    public C5H3<InterfaceC83867Wvn> LLLJIL;
    public boolean LLLJL;
    public C83666WsY LLLL;
    public InterfaceC83707WtD LLLLII;
    public final InterfaceC83659WsR LLLLIIIILLL;
    public List<String> LLLLIIL;
    public String LLLLIILL;
    public String LLLLIILLL;
    public Boolean LLLLIL;
    public List<String> LLLLILI;
    public final Handler LLLLJ;

    public void LJFF() {
    }

    public T LLJJIII() {
        return this;
    }

    public void LLJJJIL() {
    }

    public void LLJJL(int i, int i2, double d) {
    }

    public void LLJLIL() {
    }

    public void LLJLLIL() {
    }

    public void LLJZIJLIL(int i, int i2, String str) {
    }

    public void LLLFZ() {
    }

    public void LLLI(int i) {
    }

    public void LLLJ(boolean z, float f, List<Integer> list) {
    }

    public void LLLLLIL() {
    }

    public void LLLLLJLJLL() {
    }

    public void LLLLLL() {
    }

    public void LLLLLLIL() {
        LLILZIL();
        if (this.LLJLIL.LJIL) {
            C83623Wrr c83623Wrr = new C83623Wrr(this.LLIIZ, new C83860Wvg(this, this.LLLIZZ, new AObjectS57S0101000_14(0, this, 1), this.LLLJIL.getValue(), new AObjectS139S0100000_14(this, 1), new AObjectS139S0100000_14(this, 2), new AObjectS54S0101000_9(2, this, 2), new AObjectS42S0101000_5(2, this, 37)));
            this.LLILLIZIL = c83623Wrr;
            C29S activity = this.LLIIZ;
            int i = this.LLILIL;
            o.LJIIIZ(activity, "activity");
            c83623Wrr.LIZJ(activity);
            c83623Wrr.getFunctionApiMgr().LIZ(false, InterfaceC83687Wst.class, new AqS38S0001000_14(i, 8));
            c83623Wrr.getFunctionApiMgr().LIZ(true, InterfaceC83701Wt7.class, C83795Wud.LJLIL);
            this.LLLL = LLLLLZIL();
            return;
        }
        this.LLILLIZIL = new C83861Wvh(this.LLIIZ, this.LLJLL);
        int i2 = this.LLILIL;
        if (i2 == 0) {
            SurfaceView LLJJI = LLJJI(this.LLIIZ);
            this.LLIL = LLJJI;
            C79057V0z.LJI(this.LLILLIZIL, LLJJI);
        } else if (i2 == 1) {
            TextureView textureView = new TextureView(this.LLIIZ);
            this.LLILII = textureView;
            C79057V0z.LJI(this.LLILLIZIL, textureView);
        }
        FrameLayout LLJ = LLJ(this.LLIIZ);
        this.LLLIILIL = LLJ;
        C79057V0z.LJI(this.LLILLIZIL, LLJ);
        this.LLLIILIL.bringToFront();
    }

    public void LLLZLL() {
    }

    public void LLLZZ() {
    }

    public boolean LLZLL() {
        return false;
    }

    public void d1(boolean z) {
    }

    public void e0(long j) {
    }

    public void h0() {
    }

    public void j0() {
    }

    public void k0(int i) {
    }

    public void n1() {
    }

    public void o0(int i, int i2) {
    }

    public void v0(String[] strArr, double[] dArr, boolean[] zArr) {
    }

    public void y0() {
    }

    @Override // X.WLT
    public boolean ym0() {
        return true;
    }

    private void LLILZIL() {
        InterfaceC83697Wt3 interfaceC83697Wt3 = this.LLJLL;
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("surface_create");
        }
    }

    private C83733Wtd LLJJIJI() {
        InterfaceC83702Wt8 interfaceC83702Wt8 = this.LLJLILLLLZIIL;
        if (interfaceC83702Wt8 != null) {
            return interfaceC83702Wt8.LIZ();
        }
        return null;
    }

    private C83666WsY LLLLLZIL() {
        C29S c29s = this.LLIIZ;
        InterfaceC83624Wrs interfaceC83624Wrs = this.LLILLIZIL;
        C83666WsY c83666WsY = new C83666WsY(c29s, interfaceC83624Wrs, interfaceC83624Wrs.getCameraController());
        InterfaceC83624Wrs addView = this.LLILLIZIL;
        C83643WsB c83643WsB = new C83643WsB(this.LLIIZ, c83666WsY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        o.LJIIIZ(addView, "$this$addView");
        addView.getViewFunction().LIZ(c83643WsB, layoutParams);
        return c83666WsY;
    }

    private void LLLLZLL() {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.LLJLIL.LIZ.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LLILLIZIL.setLifecycleOwner(this);
        this.LLILLIZIL.v9(this.LLLILZLLLI, LLJJIJI());
        this.LLILLJJLI = this.LLILLIZIL.t9();
        this.LLILLL = this.LLILLIZIL.t9().LJ();
        this.LLJJJIL = this.LLLILZLLLI.LJJJJJL().LJIJJLI();
        this.LLJJJJ = this.LLLILZLLLI.LJJJJJL().LJJIIZI();
        AObjectS15S0001000_14 aObjectS15S0001000_14 = this.LLJLIL.LIZIZ;
        if (aObjectS15S0001000_14 != null) {
            aObjectS15S0001000_14.invoke(this.LLILLIZIL);
        }
    }

    private void LLLLZLLIL() {
        InterfaceC83724WtU<EnumC83818Wv0> LJI;
        C83592WrM c83592WrM = this.LLJLIL;
        if (c83592WrM.LJIL) {
            C83630Wry c83630Wry = new C83630Wry(C16880lQ.LLLLLIL(this.LLIIZ), this.LLLILZLLLI, this, LLJJIJI(), this.LLLLII, this.LLLLIIIILLL, this.LLJLL, new AObjectS50S0101000_5(1, this, 1), this.LLJLLIL);
            C83911WwV c83911WwV = new C83911WwV(c83630Wry.LJLIL, c83630Wry.LJLJI, c83630Wry.LJLJJI, c83630Wry.LJLILLLLZI, c83630Wry.LJLJL, c83630Wry.LJLJLJ, null, c83630Wry.LJLJLLL);
            C83676Wsi c83676Wsi = c83592WrM.LJJIJLIJ;
            if (c83676Wsi != null) {
                LJI = c83676Wsi.invoke();
            } else {
                LJI = C1DF.LJI(new AqS145S0200000_14(c83592WrM, c83630Wry, 7));
            }
            C83826Wv8 create = LJI.create();
            create.LJIIIIZZ(c83911WwV);
            create.t4().LIZ(c83630Wry.LJLJJL);
            create.LJIIJ(c83630Wry.LJLJJLL);
            this.LLLIZZ = create;
            C60595NqJ c60595NqJ = new C60595NqJ(new AObjectS56S0101000_13(4, this, 1), new AObjectS56S0101000_13(2, this, 4));
            create.LJLJJI.LIZ(create.LJ().LJJJJZI(new AfS62S0100000_10(c60595NqJ, 27)));
            create.LJLJJI.LIZ(create.LJIIIZ().LJJJJZI(new AfS62S0100000_10(c60595NqJ, 28)));
        }
    }

    private void LLLZLZ() {
        this.LLJLIL.getClass();
    }

    private void X0() {
        this.LLILLL.LIZLLL = new C83673Wsf(this);
    }

    private void Y() {
        this.LLIIJLIL.LJII(C76800UCe.LIZ);
    }

    private boolean Z() {
        if (this.LLL != 0 || this.LLILZIL.LJIILIIL()) {
            return true;
        }
        return false;
    }

    private void e1() {
        boolean z;
        InterfaceC83624Wrs interfaceC83624Wrs = this.LLILLIZIL;
        if (this.LLJJJJJIL && this.LLJJJJLIIL && !this.LLJL) {
            z = true;
        } else {
            z = false;
        }
        interfaceC83624Wrs.setExposureCompensationEnable(z);
    }

    private void m1() {
        if (this.LLILZIL.LJIIIIZZ()) {
            this.LLILLIZIL.setMusicPath(this.LLILZIL.mWorkspace.getMusicPath());
            this.LLILLIZIL.J9(this.LLILZIL.LJI(), this.LLILZIL.LIZLLL(), this.LLILZIL.mWorkspace.getMusicPath(), this.LLILZIL.isLoopSwitchOn);
            Boolean bool = Boolean.TRUE;
            this.LLJLIL.LJJIIJ.getClass();
            if (bool.equals(Boolean.FALSE)) {
                this.LLILLIZIL.LLZIL();
                this.LLILZIL.isPlayingPreviewMusic = true;
            }
        }
        InterfaceC83624Wrs interfaceC83624Wrs = this.LLILLIZIL;
        C29S c29s = this.LLIIZ;
        this.LLIZ.getClass();
        interfaceC83624Wrs.LLZZLLIL(c29s, new I86());
    }

    private void u0() {
        try {
            C43045Guv.LIZLLL(new AObjectS139S0100000_14(this, 0), 0L);
        } catch (Exception e) {
            C82891Wg3.LIZLLL().LIZ(e.getMessage());
        }
    }

    @Override // X.WLT
    public boolean A0() {
        if (this.LLJLIL.LJIL) {
            return C32151Nz.LJIJJ((InterfaceC83700Wt6) this.LLILLIZIL).A0();
        }
        return this.LLJZIJLIL;
    }

    @Override // X.WLT
    public boolean E4() {
        return this.LLILLIZIL.getCameraController().LJIIIZ().E4();
    }

    @Override // X.WLT
    public SavePhotoStickerInfo Ea0() {
        if (C77413UZt.LJIILL(this.LLLLIIL)) {
            return null;
        }
        return new SavePhotoStickerInfo(new ArrayList(this.LLLLIIL), this.LLLLIILL, this.LLLLIILLL, this.LLLLIL);
    }

    @Override // X.WLT
    public void Eg() {
        List<String> list = this.LLLLIIL;
        if (list != null) {
            list.clear();
            this.LLLLIIL = null;
        }
        this.LLLLIILLL = null;
        this.LLLLIILL = null;
        this.LLLLIL = Boolean.FALSE;
    }

    @Override // X.WLT
    public boolean IE() {
        InterfaceC83624Wrs interfaceC83624Wrs;
        InterfaceC83624Wrs interfaceC83624Wrs2;
        if (this.LJZ.LIZJ() != null) {
            if (this.LLJJLIIIJLLLLLLLZ && (interfaceC83624Wrs2 = this.LLILLIZIL) != null && !interfaceC83624Wrs2.getHasSetFocusAreas() && (this.LJZ.LIZJ().intValue() != 6 || this.LJZ.LIZJ().intValue() != 3)) {
                return true;
            }
            return false;
        }
        if (this.LLJJLIIIJLLLLLLLZ && (interfaceC83624Wrs = this.LLILLIZIL) != null && !interfaceC83624Wrs.getHasSetFocusAreas()) {
            return true;
        }
        return false;
    }

    @Override // X.WLT
    public boolean Jx() {
        return this.LLILLIZIL.getCameraController().LJIIIZ().LJ();
    }

    @Override // X.WLT
    public View K5() {
        if (this.LLJLIL.LJIL) {
            return C32151Nz.LJIJJ((InterfaceC83700Wt6) this.LLILLIZIL).K5();
        }
        return getSurfaceView();
    }

    @Override // X.WLT
    public void LJL() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().LJL();
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        LIZ.LJLJJL = false;
        LIZ.LJLJJI = false;
        LIZ.LJLJL.E9();
    }

    @Override // X.WLT
    public boolean LLFZ() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            return c83665WsX.LIZIZ().LLFZ();
        }
        if (c83665WsX.LIZ().LIZ(false) == 1) {
            return true;
        }
        return false;
    }

    public InterfaceC83927Wwl LLJI() {
        boolean z = false;
        C83593WrN c83593WrN = new C83593WrN(this.LLIIZ, this.LLILZIL, new AObjectS52S0101000_7(0, this, 7));
        C83592WrM c83592WrM = this.LLJLIL;
        c83593WrN.LJLJJI = c83592WrM.LJIILLIIL;
        c83593WrN.LJLJJL = c83592WrM.LJIJI;
        c83593WrN.LJZL = false;
        c83592WrM.getClass();
        C83592WrM c83592WrM2 = this.LLJLIL;
        c83593WrN.LJZ = c83592WrM2.LJIIIZ;
        c83593WrN.LJLLJ = false;
        c83592WrM2.getClass();
        C83592WrM c83592WrM3 = this.LLJLIL;
        c83593WrN.LLF = c83592WrM3.LJJIJIIJI;
        c83592WrM3.getClass();
        if (this.LLJLIL.LJJIJIL && LLZLL()) {
            z = true;
        }
        c83593WrN.LLFF = z;
        C83609Wrd c83609Wrd = this.LLJLIL.LJJIJL;
        o.LJIIIZ(c83609Wrd, "<set-?>");
        c83593WrN.LLFZ = c83609Wrd;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.LLJLIL.LIZ.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c83593WrN);
        }
        return c83593WrN;
    }

    @Override // X.WLT
    public boolean LLJIJIL() {
        return this.LLILLIZIL.LLJIJIL();
    }

    public Intent LLJJ() {
        return this.LLIIZ.getIntent();
    }

    public LifecycleObserver LLJJIJIL() {
        return this.LLILZ.LIZ();
    }

    @Override // X.WLT
    public int LLJJJ() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            return c83665WsX.LIZIZ().LLJJJ();
        }
        return c83665WsX.LIZ().LJLLLL;
    }

    @Override // X.WLT
    public void LLLLLILLIL() {
        if (this.LLILLIZIL.getExposureCompensationEnable()) {
            this.LLILLIZIL.LLLLLILLIL();
        }
    }

    public void LLLLZI() {
        this.LLIZ = new I8O(this.LLIIZ);
    }

    public void LLLZ() {
        if (!this.LLILZIL.LJIILIIL()) {
            return;
        }
        DuetContext duetContext = this.LLILZIL.duetContext;
        HDS hds = EmbaddedWindowInfo.CREATOR;
        int i = duetContext.duetVideoWidth;
        int i2 = duetContext.duetVideoHeight;
        hds.getClass();
        EmbaddedWindowInfo embaddedWindowInfo = new EmbaddedWindowInfo();
        embaddedWindowInfo.x = 0;
        embaddedWindowInfo.y = 0;
        embaddedWindowInfo.width = i;
        embaddedWindowInfo.height = i2;
        embaddedWindowInfo.start = 0;
        embaddedWindowInfo.end = Integer.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(embaddedWindowInfo);
        duetContext.windowInfoList = arrayList;
    }

    public void LLZ() {
        ExtractFramesModel extractFramesModel;
        Application application = this.LLIIZ.getApplication();
        String str = this.LLJLIL.LJIILJJIL;
        InterfaceC83865Wvl mediaController = this.LLILLIZIL.getMediaController();
        this.LLJJI.getClass();
        int i = C44830Hic.LIZIZ;
        this.LLJJI.getClass();
        int i2 = C44830Hic.LIZJ;
        C83592WrM c83592WrM = this.LLJLIL;
        C43786HGk c43786HGk = new C43786HGk(application, str, mediaController, i, i2, c83592WrM.LJIIL, c83592WrM.LJIILIIL, c83592WrM.LJIJJLI, this, c83592WrM.LJIILL);
        this.LLIZLLLIL = c43786HGk;
        CameraComponentModel cameraComponentModel = this.LLILZIL;
        if (cameraComponentModel != null) {
            c43786HGk.LJIIIZ = cameraComponentModel.creationId;
        }
        c43786HGk.LJ = new C43789HGn(this);
        if (cameraComponentModel != null && (extractFramesModel = cameraComponentModel.extractFramesModel) != null) {
            c43786HGk.LIZ = extractFramesModel;
            c43786HGk.LIZLLL.LIZIZ = extractFramesModel.getExtractFramesDir();
        }
        ((C43786HGk) this.LLIZLLLIL).LIZ.removeMultiImages();
    }

    @Override // X.WLT
    public int Nc() {
        return this.LLILLIZIL.getLastFlashMode();
    }

    @Override // X.WLT
    public void Nw() {
        if (this.LLLF) {
            this.LLLF = false;
            this.LLILLIZIL.getMediaController().x8();
        }
    }

    @Override // X.WLT
    public InterfaceC83737Wth O0() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            return c83665WsX.LIZIZ().O0();
        }
        CameraModule LIZ = c83665WsX.LIZ();
        if (LIZ.LJLZ) {
            return null;
        }
        C83639Ws7 c83639Ws7 = new C83639Ws7(LIZ);
        LIZ.LJLZ = true;
        return c83639Ws7;
    }

    @Override // X.WLT
    public VEDisplaySettings O7() {
        return this.LLILLIZIL.getMediaController().O7();
    }

    @Override // X.WLT
    public void RN() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().Y6();
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        int LIZ2 = LIZ.LJLJI.LIZ();
        int i = 1;
        if (1 == LIZ2) {
            i = 0;
        }
        LIZ.LJLJI.LIZJ(i);
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("camera_switch CameraModule switchFrontRearCameraOnlyStore originFacing:");
        LIZ3.append(LIZ2);
        LIZ3.append(", newFacing:");
        LIZ3.append(i);
        LIZLLL.i(X1D.LIZIZ(LIZ3));
    }

    @Override // X.WLT
    public void T6() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().T6();
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        LIZ.LJLJL.x9();
        LIZ.LJLJJL = false;
        LIZ.LJLJJI = false;
        LIZ.LJLJL.E9();
    }

    @Override // X.WLT
    public long VL() {
        VERecorder vERecorder = this.LLILLL;
        if (vERecorder == null) {
            return -1L;
        }
        return vERecorder.LIZIZ.getEffectHandler();
    }

    @Override // X.WLT
    public void Vo() {
        this.LLLLJ.post(new ARunnableS12S0101000_8(6, this, 3));
    }

    public void W0() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().Y3();
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        int i = 0;
        if (LIZ.LIZ(false) != 1) {
            i = 1;
        }
        LIZ.LJLJI.LIZJ(i);
    }

    public void c1() {
        this.LJLLLLLL.LJII(C76800UCe.LIZ);
        this.LLILZIL.mWorkspace.v();
        this.LLILZIL.mWorkspace.LJLIL.LLIIII();
        for (int i = 0; i < this.LLILZIL.LIZIZ().size(); i++) {
            e8().LLZZZIL(null, new AObjectS16S0001000_15(2, 0));
            ((XFZ) C83739Wtj.LIZIZ()).LJFF().LIZ(android.util.Log.getStackTraceString(new Throwable()));
        }
        this.LLILZIL.LIZIZ().clear();
        this.LLILZIL.LJIIJ(0L);
    }

    @Override // X.WLT
    public boolean c40() {
        return this.LLILLIZIL.getCameraController().LJIIIZ().LLJIJIL();
    }

    @Override // X.WLT
    public boolean f8() {
        return this.LLILLIZIL.getCameraController().LJIIIZ().f8();
    }

    public void finish() {
        this.LLIIZ.finish();
    }

    @Override // X.WLT
    public void gc0() {
        this.LJLJJL.LJII(C76800UCe.LIZ);
    }

    @Override // X.WLT
    public int getCameraFacing() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            return c83665WsX.LIZIZ().getCameraFacing();
        }
        return c83665WsX.LIZ().LIZ(false);
    }

    @Override // X.WLT
    public InterfaceC83727WtX getEffectController() {
        return this.LLILZLL.LIZ;
    }

    @Override // X.WLT
    public int getFlashMode() {
        return this.LLILLIZIL.getFlashMode();
    }

    @Override // X.WLT
    public int getNextFlashMode() {
        return this.LLILLIZIL.getNextFlashMode();
    }

    @Override // X.WLT
    public Surface getSurface() {
        if (this.LLJLIL.LJIL) {
            return C32151Nz.LJIJJ((InterfaceC83700Wt6) this.LLILLIZIL).getSurface();
        }
        return this.LLILL;
    }

    @Override // X.WLT
    public Point gz() {
        Point point = new Point();
        View sm0 = sm0();
        if (sm0().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sm0.getLayoutParams();
            point.x = layoutParams.width;
            point.y = layoutParams.height;
        }
        return point;
    }

    public void o1() {
        if (this.LLJLIL.LJIL) {
            C32151Nz.LJIJJ((InterfaceC83700Wt6) this.LLILLIZIL).L5(new C83680Wsm(this));
            return;
        }
        if (getSurfaceView() != null) {
            getSurfaceView().getHolder().addCallback(new SurfaceHolderCallbackC83669Wsb(this));
        }
        TextureView textureView = this.LLILII;
        if (textureView == null) {
            return;
        }
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC83662WsU(this));
    }

    @Override // X.WLT
    public boolean o9() {
        if (this.LLILLIZIL.o9() && !this.LLJLLL) {
            return true;
        }
        return false;
    }

    @Override // X.WLT
    public void oc() {
        this.LJLJJLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        this.LLJLIL.LJIIZILJ.getClass();
        super.onDestroy();
        this.LLILLIZIL.LLLLLLJ(this.LLLFFI);
        this.LLILLIZIL.setDataSourceVideoCompleteListener(null);
        this.LLILLIZIL.setSATZoomListener(null);
        this.LLILLIZIL.LLLLLLZ();
        this.LLILLIZIL.LLLLLJLJLL(this.LLLLII);
        this.LLILLIZIL.LLLLLLL();
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = true;
        if (this.LLJLIL.LJIL) {
            this.LLLIZZ.release();
            ((InterfaceC83700Wt6) this.LLILLIZIL).onDestroy();
        }
        this.LLJLIL.LJIIZILJ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.Wt2] */
    public void q1() {
        CameraComponentModel cameraComponentModel;
        String musicPath;
        HCA LIZIZ = this.LLILZIL.LIZIZ();
        if (!LIZIZ.isEmpty()) {
            final File y = this.LLILZIL.mWorkspace.y();
            final ArrayList arrayList = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = LIZIZ.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (this.LLJLIL.LJJIJIIJIL.invoke(next).booleanValue()) {
                    arrayList.add(new ASMediaSegment(next.getSpeed(), next.getDuration()));
                }
            }
            if (!arrayList.isEmpty()) {
                InterfaceC83865Wvl mediaController = e8().getMediaController();
                String path = y.getPath();
                if (LLZLL() || ((musicPath = (cameraComponentModel = this.LLILZIL).getMusicPath()) == null && (musicPath = cameraComponentModel.duetContext.duetAudioPath) == null)) {
                    musicPath = null;
                }
                mediaController.Q8(arrayList, path, musicPath, this.LLILZIL.mMusicStart, new InterfaceC84052Wym() { // from class: X.Wt2
                    @Override // X.InterfaceC84052Wym
                    public final void LIZ(int i) {
                        C83621Wrp.T(C83621Wrp.this, arrayList, y, i);
                    }
                });
            }
        }
    }

    @Override // X.WLT
    public void qm0() {
        this.LLILLIZIL.y9();
    }

    @Override // X.WLT
    public C82127WLb r4() {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            return c83665WsX.LIZIZ().r4();
        }
        C82127WLb c82127WLb = c83665WsX.LIZ().LJLJJLL;
        o.LJIIIIZZ(c82127WLb, "cameraModule.shakeFreeManager");
        return c82127WLb;
    }

    @Override // X.WLT
    public InterfaceC83867Wvn rX() {
        if (this.LLJLIL.LJIL) {
            return this.LLLJIL.getValue();
        }
        return this.LLILLJJLI;
    }

    @Override // X.WLT
    public View sm0() {
        if (this.LLJLIL.LJIL) {
            return K5();
        }
        if (getSurfaceView() == null) {
            return this.LLILII;
        }
        return getSurfaceView();
    }

    @Override // X.WLT
    public boolean vZ() {
        return this.LLJLIL.LJIJJ.LJLJI;
    }

    private boolean LLIZ() {
        long nanoTime = System.nanoTime();
        long j = this.LLJZ;
        if (j <= 0) {
            this.LLJZ = nanoTime;
            return true;
        }
        if (TimeUnit.NANOSECONDS.toMillis(nanoTime - j) > this.LLJLIL.LJIJ) {
            this.LLJZ = nanoTime;
            return true;
        }
        return false;
    }

    private void Z0() {
        e8().K8(new C84046Wyg(this));
        if (this.LLILZIL.veCherEffectParam != null) {
            e8().J1(this.LLILZIL.veCherEffectParam.getMatrix(), this.LLILZIL.veCherEffectParam.getDuration(), this.LLILZIL.veCherEffectParam.getSegUseCher());
        }
    }

    public void G0() {
        if (getCameraFacing() == 1) {
            Q3(true);
        } else {
            s9(2);
        }
    }

    public void H0() {
        C82891Wg3.LIZLLL().d("CameraLogicComponent => previewCamera");
        m1();
        LLILZLL(new ARunnableS18S0101000_14(5, this, 22));
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LJLJI.LJI(Boolean.TRUE);
        } else {
            this.LJLJI.LJ(Boolean.TRUE);
        }
        this.LLJIJIL = true;
    }

    public void K0() {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLL.LJI(Long.valueOf(currentTimeMillis));
        MutableLiveData<HK7> mutableLiveData = this.LJLLI;
        long j = this.LLJJIJI;
        long j2 = this.LLJJIJIIJIL;
        mutableLiveData.postValue(new HK7(j, currentTimeMillis, j2, j2));
    }

    public void LLLZIIL() {
        e8().init();
        Z0();
        LLLZ();
        if (this.LLLFZ) {
            CameraComponentModel cameraComponentModel = this.LLILZIL;
            int i = cameraComponentModel.mRestoreType;
            if ((i == 2 || i == 1) && !cameraComponentModel.LIZIZ().isEmpty()) {
                this.LLLFZ = false;
                q1();
            }
        }
    }

    public void N0() {
        this.LJLLLL.LJI(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.WLT
    public long fA() {
        long j;
        long endFrameTimeUS = e8().getEndFrameTimeUS() / 1000;
        CameraComponentModel cameraComponentModel = this.LLILZIL;
        if (cameraComponentModel.isRetakeMode) {
            j = cameraComponentModel.mRetakeTime;
        } else {
            j = cameraComponentModel.mTotalRecordingTime;
        }
        if (endFrameTimeUS > 0) {
            return j + TimeSpeedModelExtension.calculateRealTime(endFrameTimeUS, getSpeed().value());
        }
        return j;
    }

    @Override // X.WLT
    public String n40() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (LLJJJJLIIL(LLFZ()) && C83732Wtc.LJIIJ(this.LLIIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (zy(LLFZ(), false) && C82087WJn.LIZ(this.LLIIZ).LIZ.getInt("key_camera_shake_mode", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJLZ.LIZJ() != null && this.LJLZ.LIZJ().getFirst().intValue() == VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(1);
        }
        if (z2) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(2);
        }
        if (z3) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(3);
        }
        return sb.toString();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (this.LLJLIL.LIZJ == EnumC35623DyV.STAGE_ON_CREATE) {
            y0();
        }
        Ib0().LIZLLL(this, new AObjectS89S0100000_14(this, 158));
        this.LLJLIL.LJIIZILJ.getClass();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        this.LLJJL = true;
        this.LLJLIL.LJIIZILJ.getClass();
        X0();
    }

    @Override // X.WLT
    public C0IB<Boolean> AJ() {
        return this.LJLJI;
    }

    @Override // X.WLT
    public LiveEvent<Boolean> AW() {
        return this.LLIIL;
    }

    @Override // X.WLT
    public boolean Al() {
        return this.LLLII;
    }

    @Override // X.WLT
    public LiveData<Float> Au() {
        return this.LLIIIJ;
    }

    @Override // X.WLT
    public LiveEvent<Integer> Ch0() {
        return this.LJLJL;
    }

    @Override // X.WLT
    public LiveEvent<Long> EL() {
        return this.LJLLILLLL;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> HJ() {
        return this.LLIILII;
    }

    @Override // X.WLT
    public boolean Ho() {
        return this.LLLIIII;
    }

    @Override // X.WLT
    public LiveEvent<Boolean> Hv() {
        return this.LJLL;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> IQ() {
        return this.LLIIJLIL;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> Ib0() {
        return this.LJLJJL;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> Is0() {
        return this.LLII;
    }

    @Override // X.WLT
    public InterfaceC83852WvY Iu() {
        return this.LLLIZZ;
    }

    @Override // X.WLT
    public IAW Jo0() {
        return this.LLILZLL;
    }

    @Override // X.WLT
    public LiveData<HK7> LLL() {
        return this.LJLLI;
    }

    @Override // X.WLT
    public LiveEvent<WLF> M70() {
        return this.LLFF;
    }

    @Override // X.WLT
    public InterfaceC83703Wt9 N3() {
        return this.LLLILZJ;
    }

    @Override // X.WLT
    public LiveEvent<OSZ<Integer, Integer>> NG() {
        return this.LLIIIILZ;
    }

    @Override // X.WLT
    public LiveEvent<Long> Nv() {
        return this.LJLLLL;
    }

    @Override // X.WLT
    public C0IB<WXA> QR() {
        return this.LJZL;
    }

    @Override // X.WLT
    public LiveEvent<Boolean> VO() {
        return this.LJLJLLL;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> Wl0() {
        return this.LLFZ;
    }

    @Override // X.WLT
    public I8O Xi0() {
        return this.LLIZ;
    }

    @Override // X.WLT
    public HC5 Xq() {
        return this.LLIZLLLIL;
    }

    @Override // X.WLT
    public LiveData<C2PU> ZM() {
        return this.LLIIIL;
    }

    @Override // X.WLT
    public LiveEvent<C157166Eu> ZU() {
        return this.LLIIII;
    }

    @Override // X.WLT
    public LiveEvent<Long> Zy() {
        return this.LJLLJ;
    }

    @Override // X.WLT
    public LiveEvent<Long> aW() {
        return this.LJLLL;
    }

    @Override // X.WLT
    public C0IB<Boolean> bh() {
        return this.LJLJJI;
    }

    @Override // X.WLT
    public InterfaceC83624Wrs e8() {
        return this.LLILLIZIL;
    }

    @Override // X.WLT
    public LiveEvent<HY0> eX() {
        return this.LJLJLJ;
    }

    @Override // X.WLT
    public List<String> f30() {
        return this.LLLLILI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LLJJIII();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WLT
    public InterfaceC83927Wwl getRecordContext() {
        return this.LLLILZLLLI;
    }

    @Override // X.WLT
    public EnumC82528WaC getSpeed() {
        return this.LLI;
    }

    @Override // X.WLT
    public SurfaceView getSurfaceView() {
        return this.LLIL;
    }

    @Override // X.WLT
    public LiveData<Boolean> iU() {
        return this.LLIIJI;
    }

    @Override // X.WLT
    public C0IB<Boolean> ip0() {
        return this.LJLILLLLZI;
    }

    @Override // X.WLT
    public LiveEvent<Integer> kp() {
        return this.LJZ;
    }

    @Override // X.WLT
    public LiveEvent<C45314HqQ> kw() {
        return this.LLF;
    }

    @Override // X.WLT
    public LiveEvent<Integer> ln0() {
        return this.LL;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> mX() {
        return this.LJLLLLLL;
    }

    @Override // X.WLT
    public /* bridge */ /* synthetic */ LiveEvent md0() {
        return this.LLFFF;
    }

    @Override // X.WLT
    public WLV ng0() {
        return this.LLLJ;
    }

    @Override // X.WLT
    public LiveEvent<C82085WJl> oX() {
        return this.LJZI;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> pM() {
        return this.LJLJJLL;
    }

    @Override // X.WLT
    public boolean ph0() {
        return this.LLLIIIIL;
    }

    @Override // X.WLT
    public C0IB<Double> ru0() {
        return this.LLIFFJFJJ;
    }

    @Override // X.WLT
    public LiveEvent<OSZ<Integer, Boolean>> uB() {
        return this.LLIILZL;
    }

    @Override // X.WLT
    public LiveEvent<Boolean> vV() {
        return this.LLIIIZ;
    }

    @Override // X.WLT
    public boolean vf() {
        return this.LLJJJ;
    }

    @Override // X.WLT
    public LiveEvent<OSZ<Integer, Float>> xV() {
        return this.LJLZ;
    }

    @Override // X.WLT
    public LiveEvent<C76800UCe> xf0() {
        return this.LLFII;
    }

    @Override // X.WLT
    public CameraComponentModel zZ() {
        return this.LLILZIL;
    }

    @Override // X.WLT
    public LiveEvent<Integer> ze() {
        return this.LLD;
    }

    public static C76800UCe B(C83621Wrp c83621Wrp) {
        Intent LLJJ = c83621Wrp.LLJJ();
        c83621Wrp.finish();
        C29S c29s = c83621Wrp.LLIIZ;
        C78598Ut0.LJIJJ(LLJJ, c29s);
        c29s.startActivity(LLJJ);
        return C76800UCe.LIZ;
    }

    public static /* synthetic */ C76800UCe D(C83621Wrp c83621Wrp) {
        InterfaceC83624Wrs interfaceC83624Wrs = c83621Wrp.LLILLIZIL;
        interfaceC83624Wrs.setARCoreParam(interfaceC83624Wrs.getCameraController().LJJIFFI());
        return C76800UCe.LIZ;
    }

    public static /* synthetic */ C76800UCe H(Integer num) {
        if (num.intValue() != 0) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startPreviewAsync ret = ");
            LIZ.append(num);
            LIZLLL.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    public static /* synthetic */ void J(C83621Wrp c83621Wrp) {
        c83621Wrp.LLILLIZIL.u8(c83621Wrp.getSurface(), Build.DEVICE, new AObjectS34S0000000_14(1));
    }

    private FrameLayout LLJ(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-1);
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    public static /* synthetic */ Workspace LLZLLIL(C83621Wrp c83621Wrp) {
        return c83621Wrp.LLILZIL.mWorkspace;
    }

    public static /* synthetic */ void LLZZJLIL(C83621Wrp c83621Wrp) {
        c83621Wrp.LJLILLLLZI.LJI(Boolean.TRUE);
    }

    public static /* synthetic */ void V(C83621Wrp c83621Wrp) {
        InterfaceC83624Wrs interfaceC83624Wrs = c83621Wrp.LLILLIZIL;
        if (interfaceC83624Wrs != null) {
            interfaceC83624Wrs.C9(new InterfaceC83974WxW() { // from class: X.Wt1
                @Override // X.InterfaceC83974WxW
                public final void onResult(String[] strArr) {
                    C83621Wrp.U(C83621Wrp.this, strArr);
                }
            });
        }
    }

    public static /* synthetic */ Boolean e(C83621Wrp c83621Wrp) {
        return Boolean.valueOf(c83621Wrp.LLLJL);
    }

    public static /* synthetic */ InterfaceC82309WSb m(C83621Wrp c83621Wrp) {
        return c83621Wrp.LLILLIZIL.getViewFunction();
    }

    public static /* synthetic */ Boolean n(C83621Wrp c83621Wrp) {
        return Boolean.valueOf(c83621Wrp.LLLJL);
    }

    public static /* synthetic */ C76800UCe u(C83621Wrp c83621Wrp) {
        c83621Wrp.oc();
        return null;
    }

    public static /* synthetic */ C76800UCe v(C83621Wrp c83621Wrp) {
        LiveEvent<Boolean> VO = c83621Wrp.VO();
        if (VO.LIZJ() != null && !VO.LIZJ().booleanValue()) {
            c83621Wrp.Gm0(true);
            return null;
        }
        return null;
    }

    private /* synthetic */ CameraModule w(C82622Wbi c82622Wbi) {
        return LLLLZIL(this, c82622Wbi);
    }

    @Override // X.WLT
    public int B0(float f) {
        return this.LLILZLL.LIZ.B0(f);
    }

    @Override // X.WLT
    public void Ci(boolean z) {
        this.LLJJJJLIIL = z;
        e1();
    }

    @Override // X.WLT
    public void DS(boolean z) {
        this.LLJL = z;
        e1();
    }

    @Override // X.WLT
    public void GK(boolean z) {
        this.LLJJL = z;
        if (!z) {
            this.LLJJLIIIJLLLLLLLZ = true;
        }
    }

    @Override // X.WLT
    public void Gm0(boolean z) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LJLJLLL.LJII(Boolean.valueOf(z));
        } else {
            this.LJLJLLL.LJI(Boolean.valueOf(z));
        }
    }

    @Override // X.WLT
    public void HF(C83607Wrb c83607Wrb) {
        this.LLILLIZIL.getCameraController().LJJI(new int[]{c83607Wrb.LJLIL, c83607Wrb.LJLILLLLZI});
    }

    @Override // X.WLT
    public void I70(float f) {
        this.LLILZLL.LIZ.U9(f);
    }

    @Override // X.WLT
    public void J2(boolean z) {
        FrameLayout frameLayout;
        if (this.LLJLIL.LJIL) {
            C32151Nz.LJIJ((InterfaceC83700Wt6) this.LLILLIZIL).J2(z);
            return;
        }
        if (this.LLLIIIL != -1.0f) {
            Window window = this.LLIIZ.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = this.LLLIIIL;
            window.setAttributes(attributes);
        }
        if (z && (frameLayout = this.LLLIILIL) != null && frameLayout.getAlpha() == 0.5f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LLLIILIL, "alpha", 0.5f, 0.0f);
            ofFloat.setDuration(25L);
            ofFloat.start();
            return;
        }
        this.LLLIILIL.setAlpha(0.0f);
    }

    @Override // X.WLT
    public void Jr(boolean z) {
        this.LLD.LJII(Integer.valueOf(z ? 1 : 0));
    }

    public void LLILZLL(Runnable runnable) {
        runnable.run();
    }

    public SurfaceView LLJJI(Context context) {
        return new SurfaceView(context);
    }

    @Override // X.WLT
    public void LLJJIJIIJIL(boolean z) {
        this.LLILLIZIL.LLJJIJIIJIL(z);
    }

    @Override // X.WLT
    public boolean LLJJJJLIIL(boolean z) {
        return this.LLILLIZIL.LLJJJJLIIL(z);
    }

    public void LLLFFI(int i) {
        LJL();
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            this.LJLJL.LJII(Integer.valueOf(i));
        } else {
            this.LJLJL.LJI(Integer.valueOf(i));
        }
    }

    public void LLLLJI(Surface surface) {
        InterfaceC83697Wt3 interfaceC83697Wt3 = this.LLJLL;
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("surface_set_to_first_frame_render");
            this.LLJLL.LIZ("surface_create", "ve_recorder_start_to_surface_create", "first_frame_captured_to_surface_created");
        }
    }

    @Override // X.WLT
    public void MY(boolean z) {
        int i;
        C29901Fi<Integer> c29901Fi = this.LL;
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        c29901Fi.LJII(Integer.valueOf(i));
    }

    @Override // X.WLT
    public void PY(V8S event) {
        WLF wlf;
        WTD wtd;
        C29901Fi<WTD> c29901Fi = this.LLFFF;
        C29901Fi<WLF> onChange = this.LLFF;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(onChange, "onChange");
        boolean z = event.LJLIL;
        boolean z2 = event.LJLILLLLZI;
        boolean z3 = event.LJLJI;
        if (z2) {
            if (c29901Fi != null) {
                if (!z) {
                    AlphaAnimation LIZIZ = C62850Ola.LIZIZ(0.0f, 1.0f, 150L);
                    LIZIZ.setAnimationListener(new WLG(z3, onChange));
                    wtd = new WTD(LIZIZ, false);
                } else {
                    AlphaAnimation LIZIZ2 = C62850Ola.LIZIZ(1.0f, 0.0f, 150L);
                    LIZIZ2.setAnimationListener(new WLH(z3, onChange));
                    wtd = new WTD(LIZIZ2, true);
                }
                c29901Fi.LJII(wtd);
                return;
            }
            return;
        }
        if (!z) {
            wlf = new WLF(z3, false);
        } else {
            wlf = new WLF(z3, true);
        }
        onChange.LJII(wlf);
    }

    @Override // X.WLT
    public boolean Ph0(VESize vESize) {
        return this.LLILLIZIL.getCameraController().LIZJ(vESize);
    }

    @Override // X.WLT
    public void Q3(boolean z) {
        if (this.LLJLIL.LJIL) {
            C32151Nz.LJIJ((InterfaceC83700Wt6) this.LLILLIZIL).Q3(z);
            return;
        }
        Window window = this.LLIIZ.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.LLLIIIL = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LLLIILIL, "alpha", 0.0f, 0.5f);
            ofFloat.setDuration(25L);
            ofFloat.start();
            return;
        }
        this.LLLIILIL.setAlpha(0.5f);
    }

    @Override // X.WLT
    public void QT(int i) {
        this.LLL = i;
    }

    @Override // X.WLT
    public void Rh(boolean z) {
        this.LLJJIJIL = z;
    }

    public void S0(Cert cert) {
        T0(cert, false);
    }

    @Override // X.WLT
    public void VG(boolean z) {
        this.LJLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.WLT
    public void bM(int i) {
        this.LLILLIZIL.LLLLZLL(i);
        this.LJZ.LJII(Integer.valueOf(i));
    }

    @Override // X.WLT
    public void ch(boolean z) {
        this.LLJJJ = z;
    }

    @Override // X.WLT
    public void cj(int i) {
        this.LLILZLL.LIZ.setDetectInterval(i);
    }

    @Override // X.WLT
    public void detectDirtyLens(InterfaceC88471Ynr<? super Float, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        VETaintSceneDetectParams vETaintSceneDetectParams = new VETaintSceneDetectParams();
        vETaintSceneDetectParams.detectFrequency = 1;
        vETaintSceneDetectParams.algorithmFlag = 21;
        this.LLILLL.LJIIIZ(vETaintSceneDetectParams, new C82919WgV(interfaceC88471Ynr));
    }

    public void f1(WXA wxa) {
        this.LJZL.LJI(wxa);
    }

    @Override // X.WLT
    public void gq0(int i) {
        this.LJZ.LJII(Integer.valueOf(i));
    }

    @Override // X.WLT
    public void jP(C45314HqQ c45314HqQ) {
        C29S c29s = this.LLIIZ;
        CameraComponentModel shortVideoContext = this.LLILZIL;
        C83592WrM c83592WrM = this.LLJLIL;
        boolean z = c83592WrM.LJI;
        boolean z2 = c83592WrM.LJII;
        boolean z3 = c83592WrM.LJIIIIZZ;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if ((shortVideoContext.LJIILIIL() && z) || z2) {
            int i = c45314HqQ.LJLIL;
            if (i != 1) {
                if (i == 2) {
                    shortVideoContext.isMuted = true;
                }
            } else {
                shortVideoContext.isMuted = false;
                if (z3) {
                    C82890Wg2.LJFF.getClass();
                    TMB.LIZJ(R.string.pt5, 1, c29s).LIZ();
                }
            }
        }
        this.LLF.LJII(c45314HqQ);
    }

    @Override // X.WLT
    public void ln(boolean z) {
        this.LLJLLL = z;
    }

    @Override // X.WLT
    public void mi(boolean z) {
        C83665WsX c83665WsX = this.LLILZ;
        if (!c83665WsX.LIZJ) {
            c83665WsX.LIZ().LJLJJI = z;
        }
    }

    @Override // X.WLT
    public void n0(boolean z) {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().n0(z);
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        if (LIZ.LJLLLLLL) {
            return;
        }
        LIZ.LJLJL.setCameraPreviewSizeInterface(LIZ.LJZ);
        LIZ.LJLJL.LLLLZ(LIZ);
        C1DF.LJJI(LIZ.LJLJJLL, z);
        LIZ.LJLLLLLL = true;
    }

    @Override // X.WLT
    public void o30(String str) {
        this.LLLLIILL = str;
    }

    @Override // X.WLT
    public void qA(boolean z) {
        this.LLILLIZIL.D9(C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.AUDIO_START_DUET, HX4.DUET), z);
    }

    @Override // X.WLT
    public int s8(VEDisplaySettings vEDisplaySettings) {
        return this.LLILLIZIL.getMediaController().s8(vEDisplaySettings);
    }

    @Override // X.WLT
    public void s9(int i) {
        int flashMode = getFlashMode();
        this.LLILLIZIL.LJJJJJ(i);
        this.LJZ.LJII(Integer.valueOf(i));
        if (this.LLLIIIIL) {
            bM(flashMode);
        }
    }

    @Override // X.WLT
    public boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        C83665WsX c83665WsX = this.LLILZ;
        c83665WsX.getClass();
        o.LJIIIZ(scaleGestureDetector, "scaleGestureDetector");
        if (c83665WsX.LIZJ) {
            return c83665WsX.LIZIZ().LLJJLIIIJLLLLLLLZ(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan(), scaleGestureDetector.getScaleFactor());
        }
        CameraModule LIZ = c83665WsX.LIZ();
        LIZ.LJLILLLLZI.LJ(LIZ.LJLJJI, LIZ.LJLJL.getMaxCameraZoom(), LIZ.LJLJL.getCameraZoomList());
        if (!LIZ.LJLJJI) {
            LIZ.LIZJ();
            if (!LIZ.LIZLLL()) {
                LIZ.LJLJL.LLJJLIIIJLLLLLLLZ(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan(), scaleGestureDetector.getScaleFactor());
            }
        }
        return true;
    }

    @Override // X.WLT
    public void setBodyBeautyLevel(int i) {
        this.LLILLIZIL.setBodyBeautyLevel(i);
    }

    @Override // X.WLT
    public void setExposureSeekBarProgress(float f) {
        if (this.LLILLIZIL.getExposureCompensationEnable() && this.LLILLIZIL.getIsExposureSeekBarShowing()) {
            this.LLILLIZIL.setExposureSeekBarProgress(f);
            if (this.LLJJL && this.LLJJLIIIJLLLLLLLZ) {
                Y();
            }
            this.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    @Override // X.WLT
    public void setFilter(String str) {
        this.LLILZLL.LIZ.setFilter(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Wt4] */
    @Override // X.WLT
    public void tn0(final InterfaceC84052Wym interfaceC84052Wym) {
        this.LLJLIL.getClass();
        if (!this.LLJLIL.LJFF) {
            interfaceC84052Wym.LIZ(-105);
        } else {
            this.LLLF = true;
            this.LLILLIZIL.getMediaController().S8(new InterfaceC84052Wym() { // from class: X.Wt4
                @Override // X.InterfaceC84052Wym
                public final void LIZ(int i) {
                    C83621Wrp.F(C83621Wrp.this, interfaceC84052Wym, i);
                }
            });
        }
    }

    public boolean v00(boolean z) {
        C82127WLb r4 = r4();
        r4.getClass();
        if (!z && r4.LIZIZ()) {
            return true;
        }
        return false;
    }

    public void w0(int i) {
        this.LJLJJI.LJI(Boolean.TRUE);
        this.LLFII.LJII(C76800UCe.LIZ);
        InterfaceC83727WtX interfaceC83727WtX = this.LLILZLL.LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.j();
        }
        this.LLILLIZIL.C0(this.LLJLIL.LJIIJ);
        boolean z = true;
        this.LLILLIZIL.setHandDetectLowpower(!this.LLJLIL.LJIIJJI);
        CameraComponentModel cameraComponentModel = this.LLILZIL;
        if (cameraComponentModel != null) {
            InterfaceC83624Wrs interfaceC83624Wrs = this.LLILLIZIL;
            if (!cameraComponentModel.LJIIIIZZ() && !this.LLILZIL.LJIIIZ()) {
                z = false;
            }
            interfaceC83624Wrs.w4(z);
        }
        if (this.LLJLIL.LJJIJIIJI) {
            C43045Guv.LIZIZ(new AObjectS56S0101000_13(4, this, 3));
        }
    }

    @Override // X.WLT
    public void wy(C82085WJl c82085WJl) {
        this.LJZI.LJII(c82085WJl);
        if (!c82085WJl.LIZ) {
            s9(0);
            J2(false);
        }
    }

    @Override // X.WLT
    public void xh(boolean z) {
        this.LLJJJJJIL = z;
        e1();
    }

    @Override // X.WLT
    public void y90(EnumC82528WaC enumC82528WaC) {
        this.LLI = enumC82528WaC;
        this.LLIFFJFJJ.LJI(Double.valueOf(enumC82528WaC.value()));
        this.LLII.LJII(C76800UCe.LIZ);
    }

    @Override // X.WLT
    public void ya(int i) {
        this.LLILLIZIL.LLLLLZL(i);
    }

    public static CameraModule LLLLZIL(C83621Wrp c83621Wrp, C82622Wbi c82622Wbi) {
        C29S c29s = (C29S) c82622Wbi.LJ(C29S.class, null);
        InterfaceC83703Wt9 interfaceC83703Wt9 = c83621Wrp.LLLILZJ;
        InterfaceC83659WsR interfaceC83659WsR = c83621Wrp.LLLLIIIILLL;
        InterfaceC83624Wrs interfaceC83624Wrs = c83621Wrp.LLILLIZIL;
        C83592WrM c83592WrM = c83621Wrp.LLJLIL;
        return new CameraModule(c29s, interfaceC83703Wt9, interfaceC83659WsR, interfaceC83624Wrs, c83621Wrp, c83592WrM.LIZLLL, c83592WrM.LJ, c83592WrM.LJIJJ, c83592WrM.LJJIII, c83592WrM.LJJIJ);
    }

    public static /* synthetic */ void U(C83621Wrp c83621Wrp, String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            c83621Wrp.LLLLILI = arrayList;
            Collections.addAll(arrayList, strArr);
            return;
        }
        c83621Wrp.LLLLILI = null;
    }

    public static /* synthetic */ C76800UCe g(C83621Wrp c83621Wrp, Boolean bool) {
        c83621Wrp.LLLJL = bool.booleanValue();
        return C76800UCe.LIZ;
    }

    @Override // X.WLT
    public void B9(String str, java.util.Map<Integer, Float> map) {
        this.LLILZLL.LIZ.B9(str, map);
    }

    @Override // X.WLT
    public void D7(String[] strArr, int i) {
        this.LLILZLL.LIZ.D7(strArr, i);
    }

    public void I0(int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        this.LLJJIJI = currentTimeMillis;
        this.LJLLJ.LJI(Long.valueOf(currentTimeMillis));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" => asve OnFrameAvailable cost time: ");
        LIZ.append(this.LLJJIJI - C44029HPt.LIZ);
        LIZ.append(",  mode is ");
        LIZ.append("normal");
        LIZ.append(", ext:");
        LIZ.append(i);
        C0MT.LJ(LIZ, ", msg:", str, LIZ);
    }

    @Override // X.WLT
    public int I1(String str, float f) {
        return this.LLILZLL.LIZ.I1(str, f);
    }

    @Override // X.WLT
    public void I3(String[] strArr, int i) {
        this.LLILZLL.LIZ.I3(strArr, i);
    }

    public void LLILII(float f, float f2) {
        throw new C79568VKq("scaleRatioChange not support");
    }

    public void LLLILZLLLI(int i, int i2) {
        if (!this.LLJILLL) {
            this.LLJILJIL = i;
            this.LLJILJILJ = i2;
            this.LLJILLL = true;
        }
    }

    public void LLLLLJIL(int i, int i2) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraLogicComponent => surfaceChanged,width: ");
        LIZ.append(i);
        LIZ.append(", height: ");
        LIZ.append(i2);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        this.LLILLIZIL.t8(this.LLILL);
    }

    public void P0(boolean z, Cert cert) {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().U6(cert, z);
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        LIZ.LJLJLJ.oc();
        LIZ.LJLJL.C7(z, cert);
    }

    @Override // X.WLT
    public void R0(float f, float f2) {
        boolean D7;
        boolean z;
        C83667WsZ c83667WsZ = new C83667WsZ(new WeakReference(this.LLJ), this.LLIIIILZ);
        C83665WsX c83665WsX = this.LLILZ;
        View cameraSurfaceView = sm0();
        float f3 = this.LLIIZ.getResources().getDisplayMetrics().density;
        c83665WsX.getClass();
        o.LJIIIZ(cameraSurfaceView, "cameraSurfaceView");
        if (c83665WsX.LIZJ) {
            D7 = c83665WsX.LIZIZ().getCameraController().D7(new VEFocusSettings((int) f, (int) f2, cameraSurfaceView.getWidth(), cameraSurfaceView.getHeight(), f3, c83667WsZ));
        } else {
            CameraModule LIZ = c83665WsX.LIZ();
            D7 = LIZ.LJLJL.D7(new VEFocusSettings((int) f, (int) f2, cameraSurfaceView.getWidth(), cameraSurfaceView.getHeight(), LIZ.LJLIL.getResources().getDisplayMetrics().density, c83667WsZ));
        }
        if (LLIZ() && D7) {
            z = true;
            this.LLILLIZIL.LLLLZIL();
            this.LLILLIZIL.LLLLLL((int) f, (int) f2);
            if (this.LLILLIZIL.getExposureCompensationEnable()) {
                this.LLILLIZIL.LLLLZLLIL(f, f2);
            }
        } else {
            z = false;
        }
        this.LLIIL.LJII(Boolean.valueOf(z));
    }

    public void T0(Cert cert, boolean z) {
        boolean z2;
        int frontCameraPos;
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().V6(cert, z);
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("policyPlaceholder: ");
        LIZ2.append(cert);
        C78922UyE.LIZ("ACTION_NAME_INIT_CAMERA", X1D.LIZIZ(LIZ2));
        boolean z3 = false;
        if (LIZ.LJLJL.getCameraController().getCameraState() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("CameraModule initCamera cameraAlreadyOpened:");
        LIZ3.append(z2);
        LIZLLL.d(X1D.LIZIZ(LIZ3));
        if (LIZ.LIZ(!z2) == 0) {
            z3 = true;
        }
        InterfaceC83624Wrs interfaceC83624Wrs = LIZ.LJLJL;
        if (z3) {
            frontCameraPos = interfaceC83624Wrs.getBackCameraPos();
        } else {
            frontCameraPos = interfaceC83624Wrs.getFrontCameraPos();
        }
        LIZ.LJLJL.setCameraPreviewSizeInterface(LIZ.LJZ);
        LIZ.LJLJL.LLLLZ(LIZ);
        C1DF.LJJI(LIZ.LJLJJLL, z3);
        LIZ.LJLLLLLL = true;
        C82891Wg3.LIZLLL().d("CameraModule => open camera");
        C83639Ws7 c83639Ws7 = new C83639Ws7(LIZ);
        LIZ.LJLZ = true;
        LIZ.LJLILLLLZI.LJII();
        if (LIZ.LJLLI.LJLILLLLZI.invoke().booleanValue()) {
            C82891Wg3.LIZLLL().i("CameraModule => forbid open camera in background");
        } else if (z) {
            LIZ.LJLJL.K9(c83639Ws7, cert);
        } else {
            LIZ.LJLJL.I9(frontCameraPos, c83639Ws7, cert);
        }
    }

    public void U0(boolean z, Cert cert) {
        V0(z, cert, false);
    }

    @Override // X.WLT
    public void Ya0(float f, float f2) {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().LLJJL(f);
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        LIZ.LJLJJI = true;
        LIZ.LIZJ();
        if (LIZ.LIZLLL()) {
            return;
        }
        LIZ.LJLJL.LLJJL(f);
    }

    @Override // X.WLT
    public void l3(int i, String str) {
        this.LLILZLL.LIZ.l3(i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Wsu] */
    @Override // X.WLT
    public void pm(boolean z, final Rect[] rectArr) {
        long j;
        if (this.LLLI != z) {
            this.LLLI = z;
            VERecorder vERecorder = this.LLILLL;
            vERecorder.getClass();
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            C63856P4i.LIZ(j, "te_lens_adaptive_sharpen");
            vERecorder.LIZIZ.enableLensProcess(28, z);
        }
        if (z) {
            this.LLILLIZIL.getCameraController().LJJJ(new InterfaceC88473Ynt() { // from class: X.Wsu
                @Override // X.InterfaceC88473Ynt
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C83621Wrp.M(C83621Wrp.this, rectArr, (Integer) obj, (Integer) obj2, (Integer) obj3);
                }
            });
        }
    }

    public void r0(File file, int i) {
        c1();
        if (this.LLILZIL.mRestoreType == 1) {
            TMB.LIZIZ(C82890Wg2.LJFF, C16880lQ.LLLLLIL(this.LLIIZ), R.string.tmy).LIZ();
            finish();
        }
    }

    @Override // X.WLT
    public void rz(Cert policyPlaceholder, boolean z) {
        int i;
        int i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("policyPlaceholder: ");
        LIZ.append(policyPlaceholder);
        C78922UyE.LIZ("ACTION_NAME_SWITCH_WIDE_CAMERA", X1D.LIZIZ(LIZ));
        int i3 = !Jx() ? 1 : 0;
        C83665WsX c83665WsX = this.LLILZ;
        c83665WsX.getClass();
        o.LJIIIZ(policyPlaceholder, "policyPlaceholder");
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().W6(policyPlaceholder, z);
        } else {
            c83665WsX.LIZ().LJLJL.B9(policyPlaceholder);
        }
        C29901Fi<Integer> c29901Fi = this.LLD;
        if (i3 != 0) {
            i = 3;
        } else {
            i = 2;
        }
        c29901Fi.LJII(Integer.valueOf(i));
        if (o9()) {
            this.LL.LJII(Integer.valueOf(i3 ^ 1));
        }
        if (LLJIJIL()) {
            if (i3 != 0) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            gq0(i2);
        }
        s9(0);
        if (this.LLLIIIIL) {
            ya(0);
        }
    }

    @Override // X.WLT
    public void setFilter(String str, float f) {
        this.LLILZLL.LIZ.setFilter(str, f);
    }

    @Override // X.WLT
    public void sp0(boolean z, C29901Fi<IA8> c29901Fi) {
        C83636Ws4 c83636Ws4 = new C83636Ws4(this, z, c29901Fi);
        VELumaDetectParams vELumaDetectParams = new VELumaDetectParams();
        vELumaDetectParams.algorithmFlag = 27;
        vELumaDetectParams.detectFrames = 1;
        this.LLILLL.LJIIIZ(vELumaDetectParams, c83636Ws4);
    }

    @Override // X.WLT
    public void t4(float f, float f2) {
        this.LLILZLL.LIZ.t4(f, f2);
    }

    public boolean zy(boolean z, boolean z2) {
        C82127WLb r4 = r4();
        r4.getClass();
        if (!z && !z2 && r4.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void F(C83621Wrp c83621Wrp, InterfaceC84052Wym interfaceC84052Wym, int i) {
        c83621Wrp.LLJ.post(new ARunnableS18S0101000_14(i, interfaceC84052Wym, 8));
    }

    public /* synthetic */ void O(String str, String str2, InterfaceC83704WtA interfaceC83704WtA) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            if (interfaceC83704WtA == null) {
                return;
            }
            C142265iA.LIZ(str2, str, new C83674Wsg(interfaceC83704WtA));
        } else {
            if (interfaceC83704WtA == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parameter null, modelName: ");
            LIZ.append(str);
            LIZ.append(" requirement:");
            LIZ.append(str2);
            interfaceC83704WtA.onError(X1D.LIZIZ(LIZ));
        }
    }

    private /* synthetic */ void P(String[] strArr, double[] dArr, boolean[] zArr) {
        if (strArr == null) {
            this.LLILZIL.veCherEffectParam = null;
        } else {
            this.LLILZIL.veCherEffectParam = new ClientCherEffectParam(strArr, dArr, zArr);
        }
        v0(strArr, dArr, zArr);
    }

    @Override // X.WLT
    public void Hl(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.LLLLIIL == null) {
            this.LLLLIIL = new ArrayList();
        }
        this.LLLLIIL.add(str2);
        this.LLLLIILLL = str;
        this.LLLLIL = Boolean.valueOf(z);
    }

    public void In(WRT wrt, WRT wrt2, float f) {
        throw new C79568VKq("setFilterScroll not support");
    }

    @Override // X.WLT
    public int J8(String str, float f, float f2) {
        return this.LLILZLL.LIZ.J8(str, f, f2);
    }

    public void LLLIIIL(int i, int i2, String str) {
        d0(this.LLJIJIL, i, i2, str);
    }

    public void LLLJIL(int i, float f, boolean z) {
        this.LLIIIJ.postValue(Float.valueOf(f));
    }

    public void LLLLJ(Surface surface, int i, int i2) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraLogicComponent => surfaceChanged : width:");
        LIZ.append(i);
        LIZ.append(" height:");
        LIZ.append(i2);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        this.LLILLIZIL.t8(surface);
    }

    @Override // X.WLT
    public void UB(boolean z, VK8 vk8, Cert cert) {
        int i;
        if (z) {
            this.LLD.LJII(0);
            this.LL.LJII(0);
            this.LJZ.LJII(5);
            this.LLILLIZIL.getCameraController().LJJII(vk8, cert);
            return;
        }
        C29901Fi<Integer> c29901Fi = this.LLD;
        if (this.LLILLIZIL.getCameraController().LJIIIZ().LJ()) {
            i = 3;
        } else {
            i = 2;
        }
        c29901Fi.LJII(Integer.valueOf(i));
        this.LL.LJII(1);
        MY(C82127WLb.LIZ(this.LLIIZ));
        this.LLD.LJII(1);
        this.LJZ.LJII(6);
        this.LLILLIZIL.getCameraController().LJIILIIL(cert);
    }

    public void V0(boolean z, Cert cert, boolean z2) {
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            c83665WsX.LIZIZ().X6(z, cert, z2);
            return;
        }
        CameraModule LIZ = c83665WsX.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("async: ");
        LIZ2.append(z);
        LIZ2.append(", policyPlaceholder: ");
        LIZ2.append(cert);
        C78922UyE.LIZ("ACTION_NAME_RELEASE_CAMERA", X1D.LIZIZ(LIZ2));
        C82891Wg3.LIZLLL().i("camera release");
        LIZ.LJLJL.LJJJJJ(0);
        LIZ.LJLJLJ.oc();
        LIZ.LJLJL.C7(z, cert);
        LIZ.LJLJL.setCameraPreviewSizeInterface(null);
        LIZ.LJLJL.w9(LIZ);
        if (!LIZ.LJLLILLLL) {
            return;
        }
        if (LIZ.LJLLI.LJLJI) {
            LIZ.LJLJL.s9(C83652WsK.LIZ("bpea-audio_capture_tools_release_with_camera_closed"), z2);
        } else {
            LIZ.LJLJL.u9(C83652WsK.LIZ("bpea-audio_tools_release_with_camera_closed"));
        }
    }

    public int Yo0(C82085WJl c82085WJl, Cert cert, String str) {
        return OQ(c82085WJl, cert, str, false);
    }

    @Override // X.WLT
    public int setReshape(String str, float f, float f2) {
        return this.LLILZLL.LIZ.setReshape(str, f, f2);
    }

    @Override // X.WLT
    public void uo(OSZ<String, Float> osz, OSZ<String, Float> osz2, float f) {
        float f2;
        if (osz != null && osz2 != null) {
            if (f < 0.0f) {
                f2 = Math.abs(f);
            } else {
                f2 = 1.0f - f;
            }
            this.LLILZLL.LIZ.setFilter(osz.getFirst(), osz2.getFirst(), f2, osz.getSecond().floatValue(), osz2.getSecond().floatValue());
        }
    }

    public static /* synthetic */ void T(C83621Wrp c83621Wrp, List list, File file, int i) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraLogicComponent Restore the segments");
        LIZ.append(list.size());
        LIZ.append(" dir: ");
        LIZ.append(file.getPath());
        LIZ.append("  res: ");
        LIZ.append(i);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        if (i != 0) {
            c83621Wrp.LLIIZ.runOnUiThread(new ARunnableS17S0201000_14(i, c83621Wrp, file, 8));
            InterfaceC83966WxO LJFF = ((XFZ) C83739Wtj.LIZIZ()).LJFF();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CameraLogicComponent tryRestoreAsync -> VECallListener.onDone:");
            LIZ2.append(i);
            LJFF.LIZ(X1D.LIZIZ(LIZ2));
            ((XFZ) C83739Wtj.LIZIZ()).LJFF().LIZ(android.util.Log.getStackTraceString(new Throwable()));
        }
    }

    @Override // X.WLT
    public int OQ(C82085WJl c82085WJl, Cert cert, String str, boolean z) {
        int frontCameraPos;
        C83665WsX c83665WsX = this.LLILZ;
        if (c83665WsX.LIZJ) {
            frontCameraPos = c83665WsX.LIZIZ().z6(z, cert, str);
        } else {
            CameraModule LIZ = c83665WsX.LIZ();
            int LIZ2 = LIZ.LJLJI.LIZ();
            boolean z2 = false;
            int i = 1;
            if (1 == LIZ2) {
                i = 0;
            }
            LIZ.LJLJI.LIZJ(i);
            if (LIZ.LIZ(false) == 0) {
                z2 = true;
                frontCameraPos = LIZ.LJLJL.getBackCameraPos();
            } else {
                frontCameraPos = LIZ.LJLJL.getFrontCameraPos();
            }
            LIZ.LJLJJLL.LIZJ(!z2);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZJ = C06460Ne.LIZJ("camera_switch CameraModule switchFrontRearCamera originFacing:", LIZ2, ", newFacing:", i, ", isBackCamera:");
            C1FL.LJFF(LIZJ, z2, ", cameraIndex:", frontCameraPos, ", enterMethod:");
            LIZJ.append(str);
            LIZLLL.i(X1D.LIZIZ(LIZJ));
            C44428Hc8 LIZ3 = C44428Hc8.LIZ();
            try {
                LIZ.LJLJL.r9(frontCameraPos, new C83660WsS(LIZ3, LIZ, str), cert);
            } catch (Exception e) {
                C82891Wg3.LIZLLL().LIZIZ(e);
            }
            LIZ.LJLJL.z9(new C83656WsO(LIZ3, LIZ, str));
        }
        c82085WJl.getClass();
        wy(c82085WJl);
        return frontCameraPos;
    }

    public void d0(boolean z, int i, int i2, String str) {
        ((C83756Wu0) this.LLJJIII).LIZ(this.LLIIZ);
    }

    @Override // X.WLT
    public void u3(String[] strArr, int i, String[] strArr2, int i2) {
        this.LLILZLL.LIZ.u3(strArr, i, strArr2, i2);
    }

    public static /* synthetic */ C76800UCe M(C83621Wrp c83621Wrp, Rect[] rectArr, Integer num, Integer num2, Integer num3) {
        VEOneKeyProcessParams vEOneKeyProcessParams = new VEOneKeyProcessParams();
        vEOneKeyProcessParams.algorithmFlag = 28;
        vEOneKeyProcessParams.faceRects = rectArr;
        vEOneKeyProcessParams.iso = num.intValue();
        vEOneKeyProcessParams.minIso = num2.intValue();
        vEOneKeyProcessParams.maxIso = num3.intValue();
        c83621Wrp.LLILLL.LJIIIZ(vEOneKeyProcessParams, new C83679Wsl());
        return null;
    }

    public void LLLJL(int i, boolean z, boolean z2, float f, List<Integer> list) {
        this.LLIIIL.postValue(new F9E(i, z, z2, f, list) { // from class: X.2PU
            public final int LJLIL;
            public final boolean LJLILLLLZI;
            public final boolean LJLJI;
            public final float LJLJJI;
            public final List<Integer> LJLJJL;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), this.LJLJJL};
            }

            {
                this.LJLIL = i;
                this.LJLILLLLZI = z;
                this.LJLJI = z2;
                this.LJLJJI = f;
                this.LJLJJL = list;
            }
        });
    }

    public void LLLL(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        C82891Wg3.LIZLLL().d("CameraLogicComponent => OnFrameAvailable");
        if (!LLZLL()) {
            I0(0, "");
        }
        e8().LLLLLLJ(this.LLLFFI);
        this.LLIIIZ.LJI(Boolean.TRUE);
        if (this.LLJI) {
            this.LLJI = false;
            C82891Wg3.LIZLLL().d("CameraLogicComponent => addFragment Open Camera Frame Optimize");
            this.LLJ.post(new ARunnableS18S0101000_14(6, this, 21));
        }
    }

    public C83621Wrp(C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel, InterfaceC83790WuY interfaceC83790WuY, InterfaceC44831Hid interfaceC44831Hid, InterfaceC83618Wrm interfaceC83618Wrm, InterfaceC15040iS<C83592WrM> interfaceC15040iS, InterfaceC83702Wt8 interfaceC83702Wt8) {
        this(c82622Wbi, cameraComponentModel, interfaceC83790WuY, interfaceC44831Hid, interfaceC83618Wrm, interfaceC15040iS, interfaceC83702Wt8, null, null);
    }

    public C83621Wrp(C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel, InterfaceC83790WuY interfaceC83790WuY, InterfaceC44831Hid interfaceC44831Hid, InterfaceC83618Wrm interfaceC83618Wrm, InterfaceC15040iS<C83592WrM> interfaceC15040iS, InterfaceC83702Wt8 interfaceC83702Wt8, InterfaceC83697Wt3 interfaceC83697Wt3, Effect effect) {
        Boolean bool = Boolean.FALSE;
        this.LJLILLLLZI = new C40871j1<>(bool);
        this.LJLJI = new C40871j1<>(bool);
        this.LJLJJI = new C40871j1<>(bool);
        this.LJLJJL = new C29901Fi<>();
        this.LJLJJLL = new C29901Fi<>();
        this.LJLJL = new C29901Fi<>();
        this.LJLJLJ = new C29901Fi<>();
        this.LJLJLLL = new C29901Fi<>();
        this.LJLL = new C29901Fi<>();
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new C29901Fi<>();
        this.LJLLJ = new C29901Fi<>();
        this.LJLLL = new C29901Fi<>();
        this.LJLLLL = new C29901Fi<>();
        this.LJLLLLLL = new C29901Fi<>();
        this.LJLZ = new C29901Fi<>();
        this.LJZ = new C29901Fi<>();
        this.LJZI = new C29901Fi<>();
        this.LJZL = new C40871j1<>(null);
        this.LL = new C29901Fi<>();
        this.LLD = new C29901Fi<>();
        this.LLF = new C29901Fi<>();
        this.LLFF = new C29901Fi<>();
        this.LLFFF = new C29901Fi<>();
        this.LLFII = new C29901Fi<>();
        this.LLFZ = new C29901Fi<>();
        this.LLI = EnumC82528WaC.NORMAL;
        this.LLIFFJFJJ = new C40871j1<>(Double.valueOf(r0.value()));
        this.LLII = new C29901Fi<>();
        this.LLIIII = new C29901Fi<>();
        this.LLIIIILZ = new C29901Fi<>();
        this.LLIIIJ = new MutableLiveData<>();
        this.LLIIIL = new MutableLiveData<>();
        this.LLIIIZ = new C29901Fi<>();
        this.LLIIJI = new MutableLiveData<>();
        this.LLIIJLIL = new C29901Fi<>();
        this.LLIIL = new C29901Fi<>();
        this.LLIILII = new C29901Fi<>();
        this.LLIILZL = new C29901Fi<>();
        this.LLJ = new SafeHandler(this);
        this.LLJI = true;
        this.LLJIJIL = false;
        this.LLJILJIL = 1280;
        this.LLJILJILJ = 720;
        this.LLJJIJIL = true;
        this.LLJJJ = false;
        this.LLJJJIL = false;
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = true;
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = false;
        this.LLJLIL = new C83592WrM();
        this.LLJLLL = false;
        this.LLJZIJLIL = false;
        this.LLL = 0;
        this.LLLF = false;
        this.LLLFFI = new C83692Wsy(this);
        this.LLLFZ = true;
        this.LLLI = false;
        this.LLLIIIL = -1.0f;
        this.LLLIL = true;
        this.LLLILZ = false;
        this.LLLJIL = C221108m2.LIZIZ(new AqS164S0100000_14(new AObjectS52S0101000_7(1, this, 15), 157));
        this.LLLJL = false;
        this.LLLL = null;
        this.LLLLII = new C83681Wsn(this.LLJ, new C83594WrO(this));
        this.LLLLIIIILLL = new C83620Wro(this);
        this.LLLLIIL = null;
        this.LLLLILI = null;
        this.LLLLJ = new Handler(C16880lQ.LLJJJJ());
        this.LJLIL = c82622Wbi;
        this.LLIIZ = (C29S) c82622Wbi.LJ(C29S.class, null);
        this.LLILZIL = cameraComponentModel;
        interfaceC83790WuY = interfaceC83790WuY == null ? new C79543VJr() : interfaceC83790WuY;
        this.LLJJ = interfaceC83790WuY;
        this.LLJJI = interfaceC44831Hid;
        this.LLJJIII = interfaceC83618Wrm;
        this.LLJLILLLLZIIL = interfaceC83702Wt8;
        this.LLJLL = interfaceC83697Wt3;
        this.LLJLLIL = effect;
        if (interfaceC15040iS != null) {
            interfaceC15040iS.accept(this.LLJLIL);
        }
        this.LLJLIL.getClass();
        this.LLILIL = 0;
        this.LLLILZLLLI = LLJI();
        LLLZZ();
        C83789WuX c83789WuX = this.LLJLIL.LJJIIJZLJL;
        this.LLLILZJ = c83789WuX == null ? new C83789WuX(interfaceC83790WuY) : c83789WuX;
        LLLLZLLIL();
        LLLLLLIL();
        LLLLZLL();
        LLLZLZ();
        if (this.LLJLIL.LJIIIZ) {
            this.LLILLIZIL.LIZ(this.LLLLII);
        }
        this.LLILZ = new C83665WsX(new AObjectS129S0200000_14(this, c82622Wbi, 0), new AObjectS57S0101000_14(0, this, 0), this.LLJLIL.LJIL);
        this.LLILZLL = new IAW(this.LLILLIZIL.getEffectController());
        C83592WrM c83592WrM = this.LLJLIL;
        C83607Wrb c83607Wrb = c83592WrM.LJJIIZI;
        if (!c83592WrM.LJIL && (c83607Wrb.LJLIL != 7 || c83607Wrb.LJLILLLLZI != 30)) {
            HF(c83607Wrb);
        }
        d1(true);
        if (this.LLJLIL.LIZJ == EnumC35623DyV.STAGE_CONSTRUCT) {
            y0();
        }
        this.LLILLIZIL.getViewFunction().getView().getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC83619Wrn(this));
    }
}
