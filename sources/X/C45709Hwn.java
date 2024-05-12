package X;

import Y.ACListenerS27S0100000_7;
import Y.ACListenerS30S0400000_7;
import Y.AfS59S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LibraryModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS14S0200100_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hwn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45709Hwn extends WMH implements InterfaceC42232Gho {
    public static final /* synthetic */ int LLFII = 0;
    public final C82622Wbi LJLIL;
    public final EnumC45707Hwl LJLILLLLZI;
    public final ShortVideoContext LJLJI;
    public final VideoPublishEditModel LJLJJI;
    public final LibraryMaterialInfoSv LJLJJL;
    public final String LJLJJLL;
    public long LJLJL;
    public final C73318Sq2 LJLJLJ;
    public View LJLJLLL;
    public EnumC45711Hwp LJLL;
    public ViewGroup LJLLI;
    public Context LJLLILLLL;
    public TM0 LJLLJ;
    public C43713HDp LJLLL;
    public ViewPagerBottomSheetBehavior<View> LJLLLL;
    public C42231Ghn LJLLLLLL;
    public final C73893SzJ<Boolean> LJLZ;
    public boolean LJZ;
    public final boolean LJZI;
    public InterfaceC82086WJm LJZL;
    public I0N LL;
    public I8E LLD;
    public InterfaceC143655kP LLF;
    public InterfaceC45540Hu4 LLFF;
    public final C45714Hws LLFFF;

    static {
        new C43712HDo();
    }

    @Override // X.InterfaceC42232Gho
    public final void LJJLIIIJJI() {
        C43713HDp c43713HDp = this.LJLLL;
        String str = null;
        if (c43713HDp != null) {
            TM0 tm0 = this.LJLLJ;
            if (tm0 != null) {
                str = tm0.LLJILJIL();
            }
            C43714HDq LJI = C43713HDp.LJI(c43713HDp);
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("impression_id", str);
            c145995oB.LJI("enter_from", LJI.getEnterFrom());
            c145995oB.LJI("creation_id", LJI.getCreationId());
            c145995oB.LJI("shoot_way", LJI.getShootWay());
            FMX.LJIIL("click_library_user_gallery_button", c145995oB.LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onGalleryButtonClick -> impressionId = ");
            LIZ.append(str);
            LIZ.append(" enterFrom = ");
            LIZ.append(LJI.getEnterFrom());
            LIZ.append(" creationId = ");
            LIZ.append(LJI.getCreationId());
            LIZ.append(" shootWay = ");
            LIZ.append(LJI.getShootWay());
            H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ));
            return;
        }
        o.LJIJI("mobHelper");
        throw null;
    }

    public final void LLJILJIL(boolean z) {
        int i;
        C42231Ghn c42231Ghn = this.LJLLLLLL;
        if (c42231Ghn != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c42231Ghn.setVisibility(i);
            return;
        }
        o.LJIJI("galleryButton");
        throw null;
    }

    public final void LLJILJILJ(LibraryMaterialInfoSv libraryMaterialInfoSv) {
        CreativeFlowData creativeFlowData;
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        CreativeModel creativeModel;
        LibraryModel libraryModel;
        String id;
        CreativeModel creativeModel2;
        LibraryModel libraryModel2;
        CreativeFlowData creativeFlowData2;
        ShortVideoContext shortVideoContext = this.LJLJI;
        String str3 = null;
        if (shortVideoContext != null) {
            creativeFlowData = shortVideoContext.creativeFlowData;
        } else {
            creativeFlowData = null;
        }
        if (creativeFlowData != null) {
            creativeFlowData.setEnterMethod("click_add");
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
        if (videoPublishEditModel != null && (creativeFlowData2 = videoPublishEditModel.creativeFlowData) != null) {
            creativeFlowData2.setEnterMethod("click_add");
        }
        C43713HDp c43713HDp = this.LJLLL;
        if (c43713HDp != null) {
            TM0 tm0 = this.LJLLJ;
            if (tm0 != null) {
                str = tm0.LLJILJIL();
            } else {
                str = null;
            }
            if (libraryMaterialInfoSv != null) {
                str2 = libraryMaterialInfoSv.getId();
                num = libraryMaterialInfoSv.getMaterialType();
                num2 = libraryMaterialInfoSv.getMaterialProvider();
            } else {
                str2 = null;
                num = null;
                num2 = null;
            }
            String valueOf = String.valueOf(num2);
            if (libraryMaterialInfoSv != null) {
                num3 = libraryMaterialInfoSv.getWidth();
                num4 = libraryMaterialInfoSv.getHeight();
            } else {
                num3 = null;
                num4 = null;
            }
            if (this.LJZI) {
                ShortVideoContext shortVideoContext2 = this.LJLJI;
                if (shortVideoContext2 != null && (creativeModel2 = shortVideoContext2.creativeModel) != null && (libraryModel2 = creativeModel2.libraryModel) != null) {
                    str3 = libraryModel2.lastLibraryCategory;
                }
            } else {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLJJI;
                if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null && (libraryModel = creativeModel.libraryModel) != null) {
                    str3 = libraryModel.lastLibraryCategory;
                }
            }
            c43713HDp.LIZLLL(str, 0, str2, num, valueOf, num3, num4, false, "click", str3);
            if (libraryMaterialInfoSv != null && (id = libraryMaterialInfoSv.getId()) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(libraryMaterialInfoSv, 657);
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                I80.LIZ(aqS157S0100000_7, requireActivity, id, new AqS14S0200100_7(libraryMaterialInfoSv, currentTimeMillis, this, 3), 24);
                return;
            }
            return;
        }
        o.LJIJI("mobHelper");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLFF = C163756bj.LIZIZ(this);
    }

    public final void LLJJ(boolean z, boolean z2) {
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        Effect effect;
        C83625Wrt jL;
        I0N i0n;
        InterfaceC46236ICq Sc0;
        InterfaceC83624Wrs e8;
        TEZ LLLLL;
        LiveData<InterfaceC153045zY> Kh2;
        InterfaceC153045zY value2;
        Effect effect2;
        C83625Wrt jL2;
        I0N i0n2;
        InterfaceC46236ICq Sc02;
        InterfaceC83624Wrs e82;
        TEZ LLLLL2;
        if (z) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LJLLLL;
            if (viewPagerBottomSheetBehavior != null) {
                if (viewPagerBottomSheetBehavior.LJIIIZ != 3) {
                    WMH wmh = (WMH) this.mParentScene;
                    if (wmh != null) {
                        wmh.show(this);
                    }
                    ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = this.LJLLLL;
                    if (viewPagerBottomSheetBehavior2 != null) {
                        viewPagerBottomSheetBehavior2.setState(3);
                    } else {
                        o.LJIJI("behavior");
                        throw null;
                    }
                }
                if (this.LJZI) {
                    I0N i0n3 = this.LL;
                    if (i0n3 != null && (LLLLL2 = i0n3.LLLLL()) != null) {
                        effect2 = LLLLL2.LLJJIJIIJIL();
                    } else {
                        effect2 = null;
                    }
                    if (V3N.LJJI(effect2)) {
                        InterfaceC82086WJm interfaceC82086WJm = this.LJZL;
                        if (interfaceC82086WJm != null && (e82 = interfaceC82086WJm.e8()) != null) {
                            e82.LLZ();
                        }
                    } else {
                        I8E i8e = this.LLD;
                        if (i8e != null) {
                            i8e.Ps0(null);
                        }
                    }
                    ShortVideoContext shortVideoContext = this.LJLJI;
                    if (shortVideoContext != null && shortVideoContext.cameraComponentModel.curBackgroundVideo != null && (i0n2 = this.LL) != null && (Sc02 = i0n2.Sc0()) != null) {
                        Sc02.LJI();
                    }
                    InterfaceC82086WJm interfaceC82086WJm2 = this.LJZL;
                    if (interfaceC82086WJm2 != null && (jL2 = interfaceC82086WJm2.jL()) != null) {
                        jL2.LIZJ(I0E.LIBRARY_MATERIAL_SCENE, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_LIBRARY_OPEN, EnumC158826Le.PAGE_INVISIBLE));
                    }
                } else {
                    InterfaceC143655kP interfaceC143655kP = this.LLF;
                    if (interfaceC143655kP != null) {
                        interfaceC143655kP.Ml(true);
                    }
                    InterfaceC143655kP interfaceC143655kP2 = this.LLF;
                    if (interfaceC143655kP2 != null && (Kh2 = interfaceC143655kP2.Kh()) != null && (value2 = Kh2.getValue()) != null) {
                        value2.pause();
                    }
                }
                if (this.LJLJJL != null && z2) {
                    View view = this.LJLJLLL;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                } else {
                    View view2 = this.LJLJLLL;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                InterfaceC45540Hu4 interfaceC45540Hu4 = this.LLFF;
                if (interfaceC45540Hu4 != null) {
                    interfaceC45540Hu4.registerActivityOnKeyDownListener(this.LLFFF);
                    return;
                }
                return;
            }
            o.LJIJI("behavior");
            throw null;
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior3 = this.LJLLLL;
        if (viewPagerBottomSheetBehavior3 != null) {
            if (viewPagerBottomSheetBehavior3.LJIIIZ != 5) {
                WMH wmh2 = (WMH) this.mParentScene;
                if (wmh2 != null) {
                    wmh2.hide(this);
                }
                ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior4 = this.LJLLLL;
                if (viewPagerBottomSheetBehavior4 != null) {
                    viewPagerBottomSheetBehavior4.setState(5);
                } else {
                    o.LJIJI("behavior");
                    throw null;
                }
            }
            TM0 tm0 = this.LJLLJ;
            if (tm0 != null) {
                tm0.LLJJIII();
            }
            if (this.LJZI) {
                I0N i0n4 = this.LL;
                if (i0n4 != null && (LLLLL = i0n4.LLLLL()) != null) {
                    effect = LLLLL.LLJJIJIIJIL();
                } else {
                    effect = null;
                }
                if (V3N.LJJI(effect)) {
                    InterfaceC82086WJm interfaceC82086WJm3 = this.LJZL;
                    if (interfaceC82086WJm3 != null && (e8 = interfaceC82086WJm3.e8()) != null) {
                        e8.LLZIL();
                    }
                } else {
                    I8E i8e2 = this.LLD;
                    if (i8e2 != null) {
                        i8e2.eF(null);
                    }
                }
                ShortVideoContext shortVideoContext2 = this.LJLJI;
                if (shortVideoContext2 != null && shortVideoContext2.cameraComponentModel.curBackgroundVideo != null && (i0n = this.LL) != null && (Sc0 = i0n.Sc0()) != null) {
                    Sc0.LIZIZ();
                }
                InterfaceC82086WJm interfaceC82086WJm4 = this.LJZL;
                if (interfaceC82086WJm4 != null && (jL = interfaceC82086WJm4.jL()) != null) {
                    jL.LIZIZ(I0E.LIBRARY_MATERIAL_SCENE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_CLOSE_LIBRARY, null));
                }
            } else {
                InterfaceC143655kP interfaceC143655kP3 = this.LLF;
                if (interfaceC143655kP3 != null) {
                    interfaceC143655kP3.Ml(false);
                }
                InterfaceC143655kP interfaceC143655kP4 = this.LLF;
                if (interfaceC143655kP4 != null && (Kh = interfaceC143655kP4.Kh()) != null && (value = Kh.getValue()) != null) {
                    value.play();
                }
            }
            InterfaceC45540Hu4 interfaceC45540Hu42 = this.LLFF;
            if (interfaceC45540Hu42 == null) {
                return;
            }
            interfaceC45540Hu42.unRegisterActivityOnKeyDownListener(this.LLFFF);
            return;
        }
        o.LJIJI("behavior");
        throw null;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        C43713HDp c43713HDp;
        WMH wmh;
        CreativeFlowData creativeFlowData;
        String str;
        String str2;
        CreativeFlowData creativeFlowData2;
        CreativeFlowData creativeFlowData3;
        Activity activity;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJJI != null) {
            c43713HDp = new C43713HDp(this.LJLJJI);
        } else if (this.LJLJI != null) {
            c43713HDp = new C43713HDp(this.LJLJI);
        } else {
            c43713HDp = new C43713HDp();
        }
        this.LJLLL = c43713HDp;
        if (this.LJZI) {
            this.LJZL = (InterfaceC82086WJm) this.LJLIL.LJ(InterfaceC82086WJm.class, null);
            this.LL = (I0N) this.LJLIL.LJ(I0N.class, null);
            this.LLD = (I8E) this.LJLIL.LJ(I8E.class, null);
        } else {
            this.LLF = (InterfaceC143655kP) this.LJLIL.LJ(InterfaceC143655kP.class, null);
        }
        View findViewById = findViewById(R.id.k83);
        if (findViewById != null) {
            findViewById.setMinimumHeight(C81184Vtc.LJFF(requireSceneContext()));
        }
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 172), requireViewById(R.id.bfh));
        ViewGroup viewGroup = this.LJLLI;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.mo6);
            textView.setText(textView.getResources().getString(R.string.px2));
            ViewGroup viewGroup2 = this.LJLLI;
            if (viewGroup2 != null) {
                View findViewById2 = viewGroup2.findViewById(R.id.fqg);
                o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R…gallery_button_container)");
                this.LJLLLLLL = (C42231Ghn) findViewById2;
                boolean z = false;
                if (C45716Hwu.LIZ()) {
                    C42231Ghn c42231Ghn = this.LJLLLLLL;
                    if (c42231Ghn != null) {
                        if (!c42231Ghn.LJLJI && (activity = this.mActivity) != null) {
                            ShortVideoContext shortVideoContext = this.LJLJI;
                            if (shortVideoContext != null || this.LJLJJI != null) {
                                VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
                                SY4 sy4 = c42231Ghn.LJLILLLLZI;
                                if (sy4 != null) {
                                    C16880lQ.LJJIZ(sy4, new ACListenerS30S0400000_7(activity, shortVideoContext, videoPublishEditModel, this, 1));
                                }
                                c42231Ghn.LJLJI = true;
                                LLJILJIL(true);
                            } else {
                                LLJILJIL(false);
                            }
                        }
                    } else {
                        o.LJIJI("galleryButton");
                        throw null;
                    }
                }
                C45710Hwo c45710Hwo = new C45710Hwo(this);
                if (this.LJLLJ == null) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLJJI;
                    if (videoPublishEditModel2 == null || (creativeFlowData = videoPublishEditModel2.creativeFlowData) == null) {
                        ShortVideoContext shortVideoContext2 = this.LJLJI;
                        if (shortVideoContext2 != null) {
                            creativeFlowData = shortVideoContext2.creativeFlowData;
                        } else {
                            creativeFlowData = null;
                        }
                    }
                    if (videoPublishEditModel2 == null || (str = videoPublishEditModel2.mShootWay) == null) {
                        ShortVideoContext shortVideoContext3 = this.LJLJI;
                        if (shortVideoContext3 != null) {
                            str = shortVideoContext3.shootWay;
                        } else {
                            str = null;
                        }
                    }
                    if (videoPublishEditModel2 == null || (str2 = videoPublishEditModel2.getCreationId()) == null) {
                        ShortVideoContext shortVideoContext4 = this.LJLJI;
                        if (shortVideoContext4 != null) {
                            str2 = shortVideoContext4.LJI();
                        } else {
                            str2 = null;
                        }
                    }
                    C43713HDp c43713HDp2 = this.LJLLL;
                    if (c43713HDp2 != null) {
                        String str3 = this.LJLJJLL;
                        VideoPublishEditModel videoPublishEditModel3 = this.LJLJJI;
                        if (videoPublishEditModel3 != null && (creativeFlowData3 = videoPublishEditModel3.creativeFlowData) != null) {
                            z = creativeFlowData3.isThroughAnchor();
                        } else {
                            ShortVideoContext shortVideoContext5 = this.LJLJI;
                            if (shortVideoContext5 != null && (creativeFlowData2 = shortVideoContext5.creativeFlowData) != null) {
                                z = creativeFlowData2.isThroughAnchor();
                            }
                        }
                        TM0 tm0 = new TM0(creativeFlowData, str, str2, false, null, c45710Hwo, str3, z, c43713HDp2, 528);
                        add(R.id.btg, tm0, "MvChooseLibraryScene");
                        this.LJLLJ = tm0;
                    } else {
                        o.LJIJI("mobHelper");
                        throw null;
                    }
                }
                TM0 tm02 = this.LJLLJ;
                if (tm02 != null && (wmh = (WMH) tm02.mParentScene) != null) {
                    wmh.show(tm02);
                }
                this.LJLJLJ.LIZ(this.LJLZ.LJJIFFI(new C45713Hwr(this)).LJJLIIIJILLIZJL(1000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS59S0100000_7(this, 69)));
                ViewPagerBottomSheetBehavior<View> LIZ = ViewPagerBottomSheetBehavior.LIZ(findViewById(R.id.c8m));
                o.LJIIIIZZ(LIZ, "from(\n            findVi…n_bottom_sheet)\n        )");
                this.LJLLLL = LIZ;
                LIZ.LJIIZILJ = new C45712Hwq(this);
                ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.LJLLLL;
                if (viewPagerBottomSheetBehavior != null) {
                    viewPagerBottomSheetBehavior.setPeekHeight(C60996Nwm.LIZLLL(requireSceneContext()) + C60996Nwm.LJ(requireSceneContext()));
                    ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = this.LJLLLL;
                    if (viewPagerBottomSheetBehavior2 != null) {
                        viewPagerBottomSheetBehavior2.LJII = true;
                        return;
                    } else {
                        o.LJIJI("behavior");
                        throw null;
                    }
                }
                o.LJIJI("behavior");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdj, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLLI = viewGroup2;
        Context context = viewGroup2.getContext();
        o.LJIIIIZZ(context, "mRootView.context");
        this.LJLLILLLL = context;
        ViewGroup viewGroup3 = this.LJLLI;
        if (viewGroup3 != null) {
            return viewGroup3;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public C45709Hwn(C82622Wbi diContainer, EnumC45707Hwl pageStyle, ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, LibraryMaterialInfoSv libraryMaterialInfoSv, String str) {
        boolean z;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(pageStyle, "pageStyle");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = pageStyle;
        this.LJLJI = shortVideoContext;
        this.LJLJJI = videoPublishEditModel;
        this.LJLJJL = libraryMaterialInfoSv;
        this.LJLJJLL = str;
        this.LJLJLJ = new C73318Sq2();
        this.LJLL = EnumC45711Hwp.NOT_INFLATED;
        this.LJLZ = new C73893SzJ<>();
        if (videoPublishEditModel == null) {
            z = true;
        } else {
            z = false;
        }
        this.LJZI = z;
        this.LLFFF = new C45714Hws(this);
    }
}
