package com.ss.android.ugc.aweme.shortvideo.edit;

import X.AbstractC143185je;
import X.AbstractC45018Hle;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10K;
import X.C122034qd;
import X.C132385Hm;
import X.C133765Mu;
import X.C137965bE;
import X.C138395bv;
import X.C139895eL;
import X.C140445fE;
import X.C143285jo;
import X.C145995oB;
import X.C147535qf;
import X.C149125tE;
import X.C150305v8;
import X.C151105wQ;
import X.C1536161d;
import X.C156806Dk;
import X.C156906Du;
import X.C156916Dv;
import X.C158096Ij;
import X.C16880lQ;
import X.C188727au;
import X.C1B3;
import X.C1DG;
import X.C24540xm;
import X.C26227ARb;
import X.C2R5;
import X.C2U8;
import X.C37297EkP;
import X.C41025G8f;
import X.C41355GKx;
import X.C41384GMa;
import X.C41482GPu;
import X.C42000Ge4;
import X.C42097Gfd;
import X.C42315Gj9;
import X.C42326GjK;
import X.C42562Gn8;
import X.C43014GuQ;
import X.C44298Ha2;
import X.C44384HbQ;
import X.C45087Hml;
import X.C45828Hyi;
import X.C45829Hyj;
import X.C48331Ixz;
import X.C52912Kpg;
import X.C53099Ksh;
import X.C53235Kut;
import X.C58096Mr6;
import X.C5HC;
import X.C5K0;
import X.C5QW;
import X.C5QZ;
import X.C5Z7;
import X.C60903NvH;
import X.C63D;
import X.C68M;
import X.C69B;
import X.C6E8;
import X.C6E9;
import X.C6EV;
import X.C6F2;
import X.C6F4;
import X.C6F7;
import X.C6FI;
import X.C6FQ;
import X.C6FS;
import X.C6FW;
import X.C6FY;
import X.C6FZ;
import X.C6IE;
import X.C6IG;
import X.C6KC;
import X.C6KD;
import X.C6YM;
import X.C6Z6;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78685UuP;
import X.C78688UuS;
import X.C78915Uy7;
import X.C78934UyQ;
import X.C78983UzD;
import X.C82622Wbi;
import X.C89471Z9n;
import X.EnumC42099Gff;
import X.FMX;
import X.FNU;
import X.G8G;
import X.H7B;
import X.H7C;
import X.H8F;
import X.H92;
import X.HE2;
import X.HEM;
import X.HTP;
import X.HZV;
import X.InterfaceC133845Nc;
import X.InterfaceC136115Vv;
import X.InterfaceC139045cy;
import X.InterfaceC139655dx;
import X.InterfaceC142515iZ;
import X.InterfaceC142545ic;
import X.InterfaceC144185lG;
import X.InterfaceC145815nt;
import X.InterfaceC147475qZ;
import X.InterfaceC147865rC;
import X.InterfaceC149485to;
import X.InterfaceC150695vl;
import X.InterfaceC153045zY;
import X.InterfaceC153215zp;
import X.InterfaceC165696er;
import X.InterfaceC42675Gox;
import X.InterfaceC45540Hu4;
import X.InterfaceC88472Yns;
import X.OKG;
import X.Q8U;
import X.QD3;
import X.TLA;
import X.UC0;
import X.V0Z;
import X.WM7;
import X.X1D;
import Y.AObjectS132S0100000_2;
import Y.AObjectS47S0101000_2;
import Y.AObjectS52S0101000_7;
import Y.AObjectS53S0101000_8;
import Y.AObjectS84S0100000_2;
import Y.AObserverS58S0101000_2;
import Y.AObserverS66S0200000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS11S0201000_8;
import Y.IDObserverS9S0101000;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.servicimpl.EditRootSceneFactoryDelegate;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import dmt.av.video.CompileProbeViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public class VideoEditContainerScene extends VideoPublishEditContainerScene implements InterfaceC45540Hu4, InterfaceC165696er, InterfaceC42675Gox {
    public static String LLJILJIL = "VEVideoPublishEditActivity";
    public ViewGroup LJLLL;
    public ViewGroup LJLLLL;
    public int LJLLLLLL;
    public AVMusic LJLZ;
    public String LJZ;
    public boolean LJZI;
    public VideoPublishEditModel LJZL;
    public C6FY LL;
    public C82622Wbi LLD;
    public boolean LLF;
    public C137965bE LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public C6E9 LLI;
    public InterfaceC142515iZ LLIFFJFJJ;
    public InterfaceC142545ic LLII;
    public InterfaceC145815nt LLIIII;
    public InterfaceC147865rC LLIIIILZ;
    public C63D LLIIIJ;
    public InterfaceC139045cy LLIIIL;
    public InterfaceC139655dx LLIIIZ;
    public InterfaceC136115Vv LLIIJI;
    public InterfaceC147475qZ LLIIJLIL;
    public CompileProbeViewModel LLIIL;
    public C6F2 LLIILII;
    public InterfaceC150695vl LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public C6FI LLILIL;
    public View LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILZ;
    public Bundle LLILZIL;
    public boolean LLILL = true;
    public String LLILLL = "";
    public final C6FZ LLILZLL = new C6FZ();
    public final List<C5HC> LLIZ = new ArrayList();
    public final List<InterfaceC144185lG> LLIZLLLIL = new ArrayList();
    public final C6FW LLJ = new C5HC() { // from class: X.6FW
        @Override // X.C5HC
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            GFL.LIZIZ.LIZJ(i, keyEvent);
            return false;
        }
    };
    public final IComplianceBusinessService LLJI = ComplianceBusinessServiceImpl.LJJJJIZL();
    public final OKG LLJIJIL = new OKG();

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onPause() {
        this.LLIL = false;
        super.onPause();
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        Activity activity = this.mActivity;
        VideoPublishEditModel videoPublishEditModel = this.LJZL;
        c44298Ha2.pause(activity, "video_edit", videoPublishEditModel.mShootWay, videoPublishEditModel.getCreationId());
        C42315Gj9.LIZJ("tool_edit_enter");
        VEMem.getInstance().uploadVirtualMemSize(3);
        unRegisterActivityOnKeyDownListener(this.LLJ);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LJIJI() {
        if (this.LLILIL == null) {
            return;
        }
        if (this.LJLLJ.LJI() <= 0 || this.LJLLJ.LIZLLL() <= 0) {
            C78983UzD.LJIILL("edit page modifyDisplayView failed");
        }
        LLLFF().LJII(this.LJLLJ.LIZLLL(), this.LJLLJ.LJI(), this.LLILLIZIL);
        this.LLII.L();
    }

    public final void LJLJJL() {
        if (this.LLIILII.LLJLL()) {
            this.LLIILII.LLJJIII().LJLJJL();
        }
    }

    @Override // X.AbstractC42651GoZ
    public final void LLJJI() {
        boolean z;
        String str;
        VideoPublishEditModel videoPublishEditModel = this.LJZL;
        if (videoPublishEditModel != null && (str = videoPublishEditModel.commerceData) != null) {
            C2U8.LIZ(new C2R5(str));
        } else if (C52912Kpg.LIZ()) {
            C2U8.LIZ(new C2R5(null));
        } else {
            VideoPublishEditModel videoPublishEditModel2 = this.LJZL;
            if (videoPublishEditModel2 != null && videoPublishEditModel2.isShoutout()) {
                z = true;
            } else {
                z = false;
            }
            if (C45087Hml.LJ(z, CommerceMediaServiceImpl.LIZJ().LIZ())) {
                C2U8.LIZ(new C2R5(null));
            }
        }
        super.LLJJI();
    }

    @Override // X.AbstractC42651GoZ
    public final int LLJJIII() {
        Bundle bundle = this.mArguments;
        if (bundle == null || bundle.getInt("creation_mode", 1) != 3) {
            return 1;
        }
        return 10;
    }

    @Override // X.AbstractC42651GoZ
    public final int LLJJIJI() {
        Bundle bundle = this.mArguments;
        if (bundle == null || bundle.getInt("creation_mode", 1) != 3) {
            return 1;
        }
        return 10;
    }

    public final C145995oB LLLIIIIL() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("creation_id", this.LJZL.getCreationId());
        if (!TextUtils.isEmpty(this.LJZL.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", this.LJZL.newDraftId);
        }
        return c145995oB;
    }

    public final C147535qf LLLIIIL() {
        boolean z;
        C6FY c6fy = C149125tE.LIZ;
        if (c6fy != null) {
            C149125tE.LIZ = null;
        } else {
            c6fy = null;
        }
        this.LL = c6fy;
        if (c6fy == null) {
            this.LL = new C6FY();
        }
        C6FY c6fy2 = this.LL;
        if (c6fy2.LIZ != null) {
            c6fy2.LIZIZ(false);
            return this.LL.LIZ;
        }
        Bundle bundle = this.mArguments;
        o.LJIIIZ(bundle, "bundle");
        C147535qf LJIIIIZZ = C41384GMa.LJIIIIZZ(bundle, this);
        C6FY c6fy3 = this.LL;
        c6fy3.LIZ = LJIIIIZZ;
        VideoPublishEditModel videoPublishEditModel = LJIIIIZZ.LIZ;
        if (c6fy3.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        videoPublishEditModel.enterFromImageSwitch = z;
        c6fy3.LIZIZ(false);
        return LJIIIIZZ;
    }

    public final C6FS LLLIILIL() {
        InterfaceC142515iZ interfaceC142515iZ = this.LLIFFJFJJ;
        if (interfaceC142515iZ == null) {
            return null;
        }
        return interfaceC142515iZ.Zh0().LIZ();
    }

    public final InterfaceC153045zY LLLILZ() {
        return this.LLII.Kh().getValue();
    }

    public final void LLLILZLLLI() {
        this.LLIIIZ = ((InterfaceC142515iZ) this.LLD.LJ(InterfaceC142515iZ.class, null)).mu().LIZ();
        if (!C42000Ge4.LJIILIIL(this.LJZL) && this.LLIIIJ == null) {
            this.LLIIIJ = ((InterfaceC142515iZ) this.LLD.LJ(InterfaceC142515iZ.class, null)).PI().LIZ();
        }
        if (C42000Ge4.LJIILIIL(this.LJZL) && this.LLIIIL == null) {
            this.LLIIIL = ((InterfaceC142515iZ) this.LLD.LJ(InterfaceC142515iZ.class, null)).vF().LIZ();
        }
    }

    public final void LLLIZZ() {
        AbstractC143185je videoSizeProvider = this.LJLLJ;
        o.LJIIIZ(videoSizeProvider, "videoSizeProvider");
        C78685UuP.LJIIJJI(this, C89471Z9n.LJLIL);
        C78688UuS.LJIIIZ(this, false, new AqS133S0200000_2(this, videoSizeProvider, 43));
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 193));
        C44384HbQ.LJJJI(this);
        C60903NvH.LJIIJJI().LJIJJLI();
        C82622Wbi c82622Wbi = C44384HbQ.LJJJI(this).LJLLL;
        this.LLD = c82622Wbi;
        InterfaceC142545ic interfaceC142545ic = this.LLII;
        if (interfaceC142545ic instanceof C143285jo) {
            ((C143285jo) interfaceC142545ic).LJI((InterfaceC142545ic) c82622Wbi.LJ(InterfaceC142545ic.class, null));
        }
        this.LLII = (InterfaceC142545ic) this.LLD.LJ(InterfaceC142545ic.class, null);
        this.LLIIII = (InterfaceC145815nt) this.LLD.LJ(InterfaceC145815nt.class, null);
        this.LLIFFJFJJ = (InterfaceC142515iZ) this.LLD.LJ(InterfaceC142515iZ.class, null);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.cpg);
        this.LJLLLL = viewGroup;
        Activity activity = this.mActivity;
        if (activity instanceof SAAActivity) {
            ((SAAActivity) activity).LLIIJI("getIntent", new AObjectS132S0100000_2(this, 1));
        } else {
            viewGroup.addView(this.LLII.Iy());
        }
        this.LJLLLL.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d4, this.mActivity));
        this.LLII.D50().observe(this, new AObserverS58S0101000_2(1, this, 14));
        this.LLII.tG().observe(this, new AObserverS58S0101000_2(1, this, 23));
        this.LLII.wf0().observe(this, new Observer() { // from class: X.5tK
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                VideoEditContainerScene videoEditContainerScene = VideoEditContainerScene.this;
                videoEditContainerScene.getClass();
                C162256Yj LJFF = C60903NvH.LJIIJJI().getPublishService().LJFF();
                ExecutorC149205tM executorC149205tM = ExecutorC149205tM.LJLILLLLZI;
                executorC149205tM.LJLIL.postDelayed(new ARunnableS11S0201000_8(1, videoEditContainerScene, LJFF, 4), 2000L);
                if (C5RS.LIZ()) {
                    C44694HgQ.LJIILIIL.getClass();
                    C44694HgQ.LJIIL = false;
                    C44694HgQ.LJIIIZ.evictAll();
                }
                if (!videoEditContainerScene.LJZL.enterFromImageSwitch && e1.LIZ(31744, "editor_lazy_detect_loudness_optimization", true, false)) {
                    H8F.LJJIJLIJ(C62819Ol5.LJIJ(videoEditContainerScene.mActivity), videoEditContainerScene.mArguments, videoEditContainerScene.LJZL, Boolean.valueOf(videoEditContainerScene.LLILLJJLI), videoEditContainerScene.LLILLL);
                }
                if (videoEditContainerScene.LLILZ) {
                    boolean z = videoEditContainerScene.mArguments.getBoolean("extra_has_use_edit", false);
                    ArrayList<OSZ<String, String>> arrayList = (ArrayList) videoEditContainerScene.mArguments.getSerializable("extra_inline_caption_caches");
                    C5LG LIZ = videoEditContainerScene.LLIFFJFJJ.oO().LIZ();
                    if (LIZ != null) {
                        LIZ.yb(z, arrayList, true);
                    }
                    videoEditContainerScene.LLLILZLLLI();
                    if (videoEditContainerScene.LLIIIZ != null) {
                        videoEditContainerScene.LLIIIJ.ao(true);
                    }
                }
            }
        });
    }

    public final void LLLJ() {
        IEditRootSceneFactory iEditRootSceneFactory;
        C6F7 c6f7;
        boolean z;
        C6F2 c6f2;
        Object LIZ = C58096Mr6.LIZ(IEditRootSceneFactory.class, false);
        if (LIZ != null) {
            iEditRootSceneFactory = (IEditRootSceneFactory) LIZ;
        } else {
            if (C58096Mr6.m6 == null) {
                synchronized (IEditRootSceneFactory.class) {
                    if (C58096Mr6.m6 == null) {
                        C58096Mr6.m6 = new EditRootSceneFactoryDelegate();
                    }
                }
            }
            iEditRootSceneFactory = C58096Mr6.m6;
        }
        C6F2 editRootScene = iEditRootSceneFactory.LIZ(this.LLD);
        C6F2 c6f22 = this.LLIILII;
        if (c6f22 instanceof C6F7) {
            c6f7 = (C6F7) c6f22;
            c6f7.getClass();
            o.LJIIIZ(editRootScene, "editRootScene");
            c6f7.LJLJJI = editRootScene;
            c6f7.LLJZIJLIL(true);
        } else {
            c6f7 = null;
        }
        this.LLIILII = editRootScene;
        editRootScene.LLJLILLLLZIIL(this.LLFF);
        this.LLIILII.LLJJLIIIJLLLLLLLZ(this.LLIIJLIL);
        H7B.LIZIZ("EditorLoadUiAfterSurfaceCreated", "try to load EditRootScene. ");
        C6F2 scene = this.LLIILII;
        o.LJIIIZ(scene, "scene");
        H7B.LIZIZ("EditorLoadUiAfterSurfaceCreated", "try to load EditRootScene. ");
        this.LJLLI = scene;
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && (c6f2 = this.LJLLI) != null) {
            add(R.id.cpl, c6f2, "EditRootScene");
            this.LJLLILLLL = true;
        }
        this.LLII.Zq0().observe(this, new AObserverS70S0100000_2(this, 57));
        boolean[] zArr = new boolean[1];
        if (!C53099Ksh.LIZJ() && !this.LJZL.isShouldEditorStartOptimization()) {
            z = true;
        } else {
            z = false;
        }
        zArr[0] = z;
        this.LLII.Kh().observe(this, new AObserverS66S0200000_2(this, zArr, 6));
        this.LLII.qP().observe(this, new IDObserverS9S0101000(1, this, 0));
        this.LLII.Xb0().observe(this, new AObserverS70S0100000_2(this, 58));
        this.LLII.TL().observe(this, new AObserverS70S0100000_2(this, 59));
        this.LLII.p20().observe(this, new AObserverS70S0100000_2(this, 60));
        this.LLII.Dw().observe(this, new AObserverS58S0101000_2(1, this, 0));
        this.LLIFFJFJJ.Zh0().LIZLLL(this, new AObjectS84S0100000_2(this, 64));
        if (c6f7 != null) {
            c6f7.LLJZIJLIL(false);
        }
    }

    @Override // X.InterfaceC42675Gox
    public final void aa() {
        View view = this.LLILLIZIL;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // X.InterfaceC42675Gox
    public final void j1() {
        View view = this.LLILLIZIL;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // X.AbstractC42651GoZ
    public final boolean onBackPressed() {
        InterfaceC153215zp interfaceC153215zp;
        Fragment LJJJI = ((ActivityC45651qj) this.mActivity).getSupportFragmentManager().LJJJI(R.id.j5l);
        if (LJJJI != null) {
            FragmentManager supportFragmentManager = ((ActivityC45651qj) this.mActivity).getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJI(LJJJI);
            c1b3.LJIILJJIL();
            return true;
        }
        C6F2 c6f2 = this.LLIILII;
        if (c6f2 == null || c6f2.LLJJI() == null || ((interfaceC153215zp = (InterfaceC153215zp) this.LLIILII.LLJJI().LJIIIIZZ(null, InterfaceC153215zp.class)) != null && interfaceC153215zp.xu0())) {
            return true;
        }
        if (C140445fE.LIZ()) {
            this.LLIILII.LLJILJIL();
            LLLJL(C45828Hyi.LJIILJJIL);
        } else {
            if (LLLIILIL() == null) {
                return true;
            }
            ((AbstractC45018Hle) this.LLIIL.gv0(this.LJZL)).Y7();
            C6FS LLLIILIL = LLLIILIL();
            if (LLLIILIL != null) {
                LLLIILIL.rj0();
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public final void onDestroyView() {
        boolean z;
        C37297EkP.LIZIZ("edit");
        VideoPublishEditModel videoPublishEditModel = this.LJZL;
        if (videoPublishEditModel != null && C42000Ge4.LJIILIIL(videoPublishEditModel)) {
            z = true;
        } else {
            z = false;
        }
        super.onDestroyView();
        V0Z.LIZIZ("publish");
        boolean z2 = C149125tE.LIZIZ;
        if (!z2) {
            if (!z) {
                C69B.LJ(new C44384HbQ());
            }
        } else {
            C149125tE.LIZIZ = false;
        }
        C6IG.LIZ(C6IE.EDIT_PAGE_PANEL);
        C60903NvH.LJIIJJI().getAccountService().LJIIJJI(this.LLJIJIL);
        C60903NvH.LJIIJJI().LJIIJ().LJIIJ();
        C156806Dk.LIZ = false;
        C156916Dv c156916Dv = C132385Hm.LJII;
        if (c156916Dv != null) {
            ((C73318Sq2) c156916Dv.LJII.getValue()).LIZLLL();
        }
        C132385Hm.LJII = null;
        if (!z2) {
            C78934UyQ.LJLIL.getMusicService().LJJIII(new InterfaceC149485to() { // from class: X.6F3
                @Override // X.InterfaceC149485to
                public final MusicBuzModel LIZIZ() {
                    return VideoEditContainerScene.this.LJZL.creativeModel.musicBuzModel;
                }

                @Override // X.InterfaceC149485to
                public final void LIZ(AVMusic aVMusic) {
                    I9T.LJI(aVMusic, false, VideoEditContainerScene.this.LJZL.creativeModel.musicBuzModel);
                }
            });
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C43014GuQ.LJII(true);
        }
        C1536161d.LJIIJJI = true;
        C68M.LJIIJ().getClass();
        ((ArrayList) TLA.LIZ).clear();
        if (C44384HbQ.LJJIFFI()) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C43014GuQ c43014GuQ = C43014GuQ.LIZ;
            c43014GuQ.LJIIIZ(null);
            C78934UyQ.LJLIL.getMusicService().LJIL();
            c43014GuQ.LJIIJ(null);
        }
        G8G.LIZ.leave(this.mActivity, "video_edit");
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Activity activity = this.mActivity;
        c42326GjK.getClass();
        C42326GjK.LIZ(activity);
        C41025G8f.LIZ("normal").LIZJ("at_edit_page");
        H92 h92 = H92.LJLIL;
        if (H92.LJ()) {
            H92.LJLLJ.LIZIZ(H92.LJLILLLLZI[9], Boolean.FALSE);
            h92.setInCommercialSoundPage(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onResume() {
        String creationId;
        C156906Du c156906Du;
        String str;
        VideoPublishEditModel videoPublishEditModel;
        H7B.LIZ("VEVideoPublishEditActivity onResume");
        super.onResume();
        C37297EkP.LIZJ("edit");
        this.LJZL.setCompileFinished(false);
        C150305v8.LIZJ(this.LJZL);
        G8G.LIZ.step("av_video_edit", "onResume");
        this.LLFFF = false;
        this.LLILL = true;
        C6FS LLLIILIL = LLLIILIL();
        if (LLLIILIL != null) {
            LLLIILIL.uR(false);
        }
        VEMem.getInstance().uploadVirtualMemSize(2);
        long j = this.mArguments.getLong("extra_start_enter_edit_page", 0L);
        String string = this.mArguments.getString("extra_start_enter_edit_reason");
        if (string != null && TextUtils.equals(string, "click_next")) {
            this.LLILZLL.LIZ(this.LJZL.getPreviewInfo().getPreviewVideoLength(), System.currentTimeMillis() - j, "click_record_next", true);
        }
        if (this.mArguments.getBoolean("click_next_in_album_time", false)) {
            C6FQ.LIZ(this.LJZL.getPreviewInfo().getPreviewVideoLength(), System.currentTimeMillis() - j, "click_next_in_album");
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJZL;
        EnumC42099Gff enumC42099Gff = EnumC42099Gff.ENTER_EDIT;
        C42562Gn8 c42562Gn8 = C42562Gn8.LIZIZ;
        if (videoPublishEditModel2 == null) {
            creationId = null;
        } else {
            creationId = videoPublishEditModel2.getCreationId();
        }
        c42562Gn8.LIZIZ(creationId, new C42097Gfd(enumC42099Gff, videoPublishEditModel2, null), this.mActivity);
        if (C5QW.LJ && (videoPublishEditModel = this.LJZL) != null) {
            int i = C5QW.LJFF;
            C5QW.LJFF = 0;
            C5QW.LJ = false;
            C10K.LIZJ(new C5QZ(i, System.currentTimeMillis(), videoPublishEditModel));
        }
        if (C6KD.LIZIZ(this.LJZL) != null && getSceneContext() != null) {
            C6KC.LIZIZ(getSceneContext(), C6KD.LIZIZ(this.LJZL), "video_upload", true, new AObjectS52S0101000_7(2, this, 2));
        }
        this.LLIL = true;
        registerActivityOnKeyDownListener(this.LLJ);
        if (C158096Ij.LIZ) {
            Lifecycle lifecycle = getLifecycle();
            IComplianceBusinessService iComplianceBusinessService = this.LLJI;
            Activity activity = this.mActivity;
            VideoPublishEditModel videoPublishEditModel3 = this.LJZL;
            lifecycle.addObserver(iComplianceBusinessService.LJIIJ(activity, R.string.g0m, videoPublishEditModel3.mShootWay, videoPublishEditModel3.enterFrom, videoPublishEditModel3.getCreationId(), null));
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LJZL;
        if (videoPublishEditModel4 != null && videoPublishEditModel4.creativeModel.soundEffectInfoModel.shouldShowRemoveToast) {
            H7C.LJI(3, "SoundEffect", null, "show soundEffect removed toast on edit page");
            C24540xm.LIZ(R.string.fnu, requireActivity(), 1014);
            this.LJZL.creativeModel.soundEffectInfoModel.shouldShowRemoveToast = false;
        }
        C82622Wbi c82622Wbi = this.LLD;
        if (c82622Wbi != null && c82622Wbi.LJIIIIZZ(null, C156906Du.class) != null) {
            c156906Du = (C156906Du) this.LLD.LJIIIIZZ(null, C156906Du.class);
        } else {
            c156906Du = new C156906Du(requireAppCompatActivity(), this.LJZL, new AObjectS53S0101000_8(2, this, 0));
        }
        if (C1536161d.LJIIJJI && !this.LJZL.getEditorProModel().getFromEditorProAnchor() && !this.LJZL.getEditorProModel().getFromEditorProEntranceInAlbum()) {
            VideoPublishEditModel videoPublishEditModel5 = this.LJZL;
            if (videoPublishEditModel5 != null && (str = videoPublishEditModel5.enterFrom) != null && str.equals("effect_qr_scan")) {
                return;
            }
            VideoPublishEditModel videoPublishEditModel6 = this.LJZL;
            C6E8 c6e8 = new C6E8(this);
            if (c156906Du.LJFF(videoPublishEditModel6)) {
                c6e8.LIZ(true);
                return;
            } else {
                c156906Du.LIZJ(new AqS133S0200000_2(c156906Du, (C156906Du) new AqS133S0200000_2(c156906Du, c6e8, 85), (InterfaceC88472Yns<? super Boolean, C76800UCe>) 84));
                return;
            }
        }
        if (!this.LJZL.creativeModel.draftInfoModel.isDraft) {
            return;
        }
        if (C60903NvH.LJIIJJI().LJJJI().LIZIZ() && this.LJLLLLLL == 3) {
            C5Z7.LIZIZ(requireAppCompatActivity(), this.LJZL);
            C6EV.LIZ = true;
        } else {
            C6EV.LIZ = false;
        }
    }

    static {
        C6YM.LIZ();
        C69B.LIZ();
        if (e1.LIZ(31744, "nle_so_load_necessary_editor", true, false)) {
            if (!C139895eL.LIZIZ) {
                C5K0.LIZIZ();
                return;
            }
            return;
        }
        C5K0.LIZIZ();
    }

    public final void LLLII() {
        boolean inLowMemMode = VEMem.getInstance().inLowMemMode();
        this.LLIILII.LLJJJIL();
        if ((C138395bv.LIZ() && LLLILZ() != null) || inLowMemMode) {
            LLLL(false, null, null);
        } else {
            C41384GMa.LJII(new C41355GKx(this));
        }
    }

    public final void LLLLIIIILLL() {
        int i;
        if (C53235Kut.LIZ()) {
            i = R.string.rfy;
        } else {
            i = R.string.ez1;
        }
        Activity context = requireActivity();
        Integer valueOf = Integer.valueOf(R.string.ez2);
        AObjectS47S0101000_2 aObjectS47S0101000_2 = new AObjectS47S0101000_2(3, this, 2);
        AObjectS47S0101000_2 aObjectS47S0101000_22 = new AObjectS47S0101000_2(3, this, 3);
        o.LJIIIZ(context, "context");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZ(i);
        UC0.LIZJ(c26227ARb, new FNU(aObjectS47S0101000_2, aObjectS47S0101000_22));
        if (valueOf != null) {
            c26227ARb.LJ(valueOf.intValue());
        }
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.G90
    public final Analysis getAnalysis() {
        String str;
        Analysis analysis = super.getAnalysis();
        if (analysis == null) {
            return analysis;
        }
        HashMap hashMap = new HashMap();
        VideoPublishEditModel videoPublishEditModel = this.LJZL;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.getCreationId();
        } else {
            str = "";
        }
        hashMap.put("creation_id", str);
        hashMap.put("is_story_shoot", CardStruct.IStatusCode.DEFAULT);
        analysis.setExtraMap(hashMap);
        return analysis;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onStart() {
        super.onStart();
        if (!TextUtils.isEmpty(this.LJZL.getMMusicPath()) && this.LJZL.getMCurMusicLength() <= 0) {
            this.LJZL.setMCurMusicLength(C78934UyQ.LJLIL.getMusicService().getMusicDuration(this.LJZL.getMMusicPath()));
        }
        VideoPublishEditModel model = this.LJZL;
        o.LJIIIZ(model, "model");
        if (C48331Ixz.LIZ()) {
            return;
        }
        C145995oB LJJJLIIL = H8F.LJJJLIIL(model);
        LJJJLIIL.LJI(WM7.SCENE_SERVICE, "start_edit");
        Q8U.LIZJ(LJJJLIIL, "shoot_way", model.mShootWay, model, "creation_id");
        LJJJLIIL.LJI("enter_from", "video_edit_page");
        HTP.LJLJL.getClass();
        LJJJLIIL.LIZIZ(0L, "dalvikPss");
        LJJJLIIL.LIZIZ(0L, "nativePss");
        LJJJLIIL.LIZIZ(0L, "otherPss");
        LJJJLIIL.LIZIZ(0L, "totalPss");
        FMX.LJIIL("av_memory_log", LJJJLIIL.LIZ);
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onStop() {
        super.onStop();
        C60903NvH.LJIIJJI().getPublishService().LJIIJJI().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final boolean LLLF() {
        return this.LLILL;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZIZ(boolean z) {
        C6FI c6fi = this.LLILIL;
        if (c6fi == null) {
            return;
        }
        c6fi.LIZIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZJ(boolean z) {
        C6FI c6fi = this.LLILIL;
        if (c6fi == null) {
            return;
        }
        c6fi.LIZJ(z);
    }

    public final void LLLI(Boolean bool) {
        String creationId;
        C42562Gn8 c42562Gn8 = C42562Gn8.LIZIZ;
        VideoPublishEditModel videoPublishEditModel = this.LJZL;
        if (videoPublishEditModel == null) {
            creationId = null;
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        c42562Gn8.LIZ(creationId);
        boolean inLowMemMode = VEMem.getInstance().inLowMemMode();
        this.LLIILII.LLJJJIL();
        if ((C138395bv.LIZ() && LLLILZ() != null) || inLowMemMode) {
            LLLL(false, null, null);
            return;
        }
        Intent intent = new Intent();
        if (!C1DG.LJIIIIZZ() && this.LJLLLLLL != 3) {
            HZV.LIZ().LIZ(requireActivity(), intent, bool.booleanValue(), this.LJZL.creativeModel.draftInfoModel.isConvertToNormalDraft);
        }
        C41384GMa.LJII(new C41355GKx(this));
    }

    public final void LLLIIII(VideoPublishEditModel videoPublishEditModel) {
        C122034qd c122034qd;
        InterfaceC153045zY LLLILZ = LLLILZ();
        if (LLLILZ instanceof C133765Mu) {
            c122034qd = ((C133765Mu) LLLILZ).LJI();
        } else {
            c122034qd = null;
        }
        if (C150305v8.LIZIZ(videoPublishEditModel, c122034qd, this.LLIILII.LLJJIII())) {
            C150305v8.LIZLLL(videoPublishEditModel, this.LJLLJ);
        } else {
            C150305v8.LIZJ(videoPublishEditModel);
        }
    }

    public final void LLLJL(C45828Hyi c45828Hyi) {
        if (!"green_screen_kit".equals(this.mArguments.getString("shoot_way"))) {
            ((HE2) C78934UyQ.LJLIL.getBridgeService()).LIZJ((ActivityC45651qj) this.mActivity, this.LJZL, c45828Hyi);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0285, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x072b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0792 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b5  */
    /* JADX WARN: Type inference failed for: r3v189, types: [X.6FV] */
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 2091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene.onActivityCreated(android.os.Bundle):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C6F4 c6f4) {
        ShoutOutsData shoutOutsData = this.LJZL.mShoutOutsData;
        if (shoutOutsData != null) {
            shoutOutsData.setPrice(c6f4.LJLILLLLZI);
            this.LJZL.mShoutOutsData.setDesc(c6f4.LJLIL);
            this.LJZL.mShoutOutsData.setBuyerMoneyDes(c6f4.LJLJI);
        }
    }

    @Override // X.WMH, X.WM7
    public final void onSaveInstanceState(Bundle bundle) {
        InterfaceC136115Vv LIZ;
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        bundle.remove("android:support:fragments");
        InterfaceC142515iZ interfaceC142515iZ = this.LLIFFJFJJ;
        if (interfaceC142515iZ != null && (LIZ = interfaceC142515iZ.zi().LIZ()) != null) {
            LIZ.onSaveInstanceState(bundle);
        }
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC c5hc) {
        ((ArrayList) this.LLIZ).add(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC c5hc) {
        ListProtector.add(this.LLIZ, 0, c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        ((ArrayList) this.LLIZLLLIL).add(interfaceC144185lG);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC c5hc) {
        ((ArrayList) this.LLIZ).remove(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        ((ArrayList) this.LLIZLLLIL).remove(interfaceC144185lG);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C41482GPu c41482GPu) {
        c41482GPu.LIZ(this.LJZL);
        this.LLIILII.LLJJJJ();
        this.LLIILII.LLJLLIL();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C6Z6 c6z6) {
        LLJJI();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(HEM hem) {
        LLJJI();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LLLFZ(int i, int i2) {
        C6FI c6fi = this.LLILIL;
        if (c6fi == null) {
            return;
        }
        c6fi.LIZLLL(i, i2);
        this.LLII.gw(i);
        this.LLII.YM(i2);
        C151105wQ.LJI = Integer.valueOf(i);
        C151105wQ.LJII = Integer.valueOf(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0019, code lost:
    
        if (r5 == 4) goto L9;
     */
    @Override // X.AbstractC42651GoZ, X.C5HC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            r2 = 0
            r3 = 1
            r0 = 4
            if (r5 != r0) goto L19
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LJZL
            java.lang.String r1 = r0.enterFrom
            java.lang.String r0 = "effect_qr_scan"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L1b
            r0 = 0
            r4.LLJLLL(r2, r0)
            r4.LLJJI()
            return r3
        L19:
            if (r5 != r0) goto L29
        L1b:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LJZL
            if (r0 == 0) goto L29
            boolean r0 = X.C44384HbQ.LJLLLLLL(r0)
            if (r0 == 0) goto L29
            r4.LLJJI()
            return r3
        L29:
            java.util.List<X.5HC> r0 = r4.LLIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L31:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.next()
            X.5HC r0 = (X.C5HC) r0
            boolean r0 = r0.onKeyDown(r5, r6)
            if (r0 == 0) goto L31
            return r3
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final void LLLL(final boolean z, final Intent intent, final VideoPublishEditModel videoPublishEditModel) {
        this.LLFZ = false;
        if (LLLILZ() == null) {
            return;
        }
        LLLILZ().LLLIL(new InterfaceC133845Nc() { // from class: X.5fl
            @Override // X.InterfaceC133845Nc
            public final void LIZ() {
                VideoEditContainerScene videoEditContainerScene = VideoEditContainerScene.this;
                videoEditContainerScene.LLFZ = false;
                boolean z2 = z;
                Intent intent2 = intent;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                if (z2) {
                    C41384GMa.LJII(new GL1(videoEditContainerScene, intent2, videoPublishEditModel2));
                } else {
                    C41384GMa.LJII(new C41355GKx(videoEditContainerScene));
                }
            }

            @Override // X.InterfaceC133845Nc
            public final void LIZIZ() {
                VideoEditContainerScene videoEditContainerScene = VideoEditContainerScene.this;
                videoEditContainerScene.LLFZ = true;
                boolean z2 = z;
                Intent intent2 = intent;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                if (z2) {
                    C41384GMa.LJII(new GL1(videoEditContainerScene, intent2, videoPublishEditModel2));
                } else {
                    C41384GMa.LJII(new C41355GKx(videoEditContainerScene));
                }
            }
        });
    }

    @Override // X.AbstractC42651GoZ
    public final void onActivityResult(int i, int i2, Intent intent) {
        H7B.LIZ("VEVideoPublishEditActivity -> onActivityResult");
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZLLL(intent);
        Iterator it = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it.hasNext()) {
            if (((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        if (i == 1003) {
            if (i2 == -1) {
                Activity requireActivity = requireActivity();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.iconColorRes(R.attr.e8);
                creativeToastBuilder.message(getString(R.string.px0));
                creativeToastBuilder.acrossActivities(true);
                C78915Uy7.LJJIIZI(requireActivity, 1012, creativeToastBuilder);
                LLJLLL(-1, null);
                LLJJI();
                return;
            }
            Activity requireActivity2 = requireActivity();
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.message(getString(R.string.pwz));
            C78915Uy7.LJJIIZI(requireActivity2, 1012, creativeToastBuilder2);
            return;
        }
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (intent != null && C16880lQ.LLJJIJI(intent) != null) {
                String string = C16880lQ.LLJJIJI(intent).getString("publish result");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PublishEditActivity success");
                LIZ.append(string);
                intent2.putExtra("edit result", X1D.LIZIZ(LIZ));
                intent2.putExtras(C16880lQ.LLJJIJI(intent));
            }
            LLJLLL(i2, intent2);
            if (i2 != -1) {
                return;
            }
            LLJJI();
            return;
        }
        if (i == 8) {
            if (i2 != 9) {
                return;
            }
            Intent intent3 = new Intent();
            if (intent != null && C16880lQ.LLJJIJI(intent) != null) {
                intent3.putExtras(C16880lQ.LLJJIJI(intent));
            }
            LLJLLL(i2, intent3);
            LLJJI();
            return;
        }
        if (i != 10004 || i2 != -1 || !intent.hasExtra("custom_sticker") || !intent.hasExtra("custom_sticker_image_info")) {
            return;
        }
        this.LLIILII.LLJJL((Effect) intent.getParcelableExtra("custom_sticker"), (CustomStickerInfo) intent.getParcelableExtra("custom_sticker_image_info"));
    }

    public final void LLLJIL(String str, String str2, String str3, String str4, String str5, String str6, String str7, C45828Hyi c45828Hyi, String str8) {
        int i;
        if (str8.equals("image")) {
            i = 1;
        } else {
            i = 2;
        }
        C188727au LIZ = C45829Hyj.LIZ(str3, str4, c45828Hyi, str5, str6, str7, i, -1);
        LIZ.LJIIIZ("enter_from", "video_edit_page");
        LIZ.LJI("creation_id", this.LJZL.getCreationId());
        if (str2 != null) {
            LIZ.LJI("music_id", str2);
        }
        FMX.LJIIL(str, LIZ.LIZ);
    }
}
