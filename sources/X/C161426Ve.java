package X;

import Y.ARunnableS16S0201000_13;
import Y.IDLListenerS190S0100000_2;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161426Ve extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final C82622Wbi LJLIL;
    public InterfaceC152085y0 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public FrameLayout LJLJLLL;
    public final C62822Ol8 LJLL;

    static {
        TBT tbt = new TBT(C161426Ve.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C161426Ve.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp)};
    }

    public static final float LLJILJIL(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final FTCEditInfoStickerViewModel LLJILJILJ() {
        return (FTCEditInfoStickerViewModel) this.LJLJJLL.getValue();
    }

    public final C161416Vd LLJJ() {
        return (C161416Vd) this.LJLL.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJI.getValue();
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        AnonymousClass655 anonymousClass655 = LLJJ().LLFZ;
        if (anonymousClass655 != null) {
            anonymousClass655.hide();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C161426Ve(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJL = UCI.LJI(diContainer, C137965bE.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1054));
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1057));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1055));
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1056));
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [X.6Vg] */
    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC153045zY interfaceC153045zY;
        C161486Vk c161486Vk;
        super.onActivityCreated(bundle);
        o.LJII(this.mActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C161416Vd LLJJ = LLJJ();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLLI[0]);
        LLJJ.LJLZ = value;
        LLJJ.LJZI = videoPublishEditModel;
        final C161416Vd LLJJ2 = LLJJ();
        AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this);
        View view = this.mView;
        List<MediaModel> mediaModelList = LLJJ().LJZI.getMediaModelList();
        LLJJ2.getClass();
        LLJJ2.LJLIL = LJJIJIIJIL.requireAppCompatActivity();
        LLJJ2.LJLILLLLZI = LJJIJIIJIL;
        LLJJ2.LLFF = mediaModelList;
        LLJJ2.LLFII = new SafeHandler(LJJIJIIJIL);
        LLJJ2.LJZ = (FTCInfoStickerViewModel) C165706es.LIZLLL(view).get(FTCInfoStickerViewModel.class);
        LLJJ2.LJZL = view;
        LLJJ2.LLI = (FrameLayout) view.findViewById(R.id.j83);
        LLJJ2.LJLJI = (C161436Vf) LLJJ2.LJZL.findViewById(R.id.emk);
        LLJJ2.LJLJJI = LLJJ2.LJZL.findViewById(R.id.f8p);
        LLJJ2.LJLJJL = LLJJ2.LJZL.findViewById(R.id.btt);
        LLJJ2.LJLJJLL = (C170466mY) LLJJ2.LJZL.findViewById(R.id.l54);
        LLJJ2.LJLJL = (ViewOnTouchListenerC82857WfV) LLJJ2.LJZL.findViewById(R.id.n5k);
        LLJJ2.LJLJLJ = (ImageView) LLJJ2.LJZL.findViewById(R.id.b3n);
        LLJJ2.LJLJLLL = (ImageView) LLJJ2.LJZL.findViewById(R.id.jag);
        LLJJ2.LJLL = (ImageView) LLJJ2.LJZL.findViewById(R.id.axw);
        LLJJ2.LJLLILLLL = LLJJ2.LJZL.findViewById(R.id.hpr);
        LLJJ2.LJLLJ = (TextView) LLJJ2.LJZL.findViewById(R.id.hpm);
        LLJJ2.LJLLL = (TextView) LLJJ2.LJZL.findViewById(R.id.hq0);
        LLJJ2.LJLLLL = (SeekBar) LLJJ2.LJZL.findViewById(R.id.hpy);
        LLJJ2.LJLLLLLL = (ViewGroup) LLJJ2.LJZL.findViewById(R.id.hpz);
        LLJJ2.LLIL = (FTCEditCornerViewModel) C163726bg.LIZJ(LLJJ2.LLI).LIZ(FTCEditCornerViewModel.class);
        C161516Vn c161516Vn = new C161516Vn(LLJJ2.LLILIL, LLJJ2.LJLZ, LLJJ2.LJLIL, LLJJ2.LLILII);
        LLJJ2.LLIILZL = c161516Vn;
        c161516Vn.LJFF = new C6W7(LLJJ2);
        ViewGroup viewGroup = LLJJ2.LJLLLLLL;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new ViewOnTouchListenerC161476Vj(1, LLJJ2));
        }
        LLJJ2.LJLJI.setVisibility(0);
        final C161436Vf c161436Vf = LLJJ2.LJLJI;
        SafeHandler safeHandler = LLJJ2.LLFII;
        InterfaceC153045zY interfaceC153045zY2 = LLJJ2.LJLZ;
        VideoPublishEditModel videoPublishEditModel2 = LLJJ2.LJZI;
        View view2 = LLJJ2.LJZL;
        c161436Vf.LJLJI = interfaceC153045zY2;
        c161436Vf.LJLJJI = safeHandler;
        c161436Vf.LJLJJL = new C161486Vk(c161436Vf, interfaceC153045zY2, view2);
        c161436Vf.LL = new WXC() { // from class: X.6Vg
            @Override // X.C6P6, X.C6V2
            public final boolean LJJIIZI(MotionEvent motionEvent) {
                C161436Vf.this.getClass();
                C161436Vf.this.LLF.set(motionEvent.getRawX(), motionEvent.getRawY());
                C161436Vf c161436Vf2 = C161436Vf.this;
                boolean z = false;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                if (c161436Vf2.LJLZ != null) {
                    c161436Vf2.LJLJLLL.getClass();
                }
                long currentTimeMillis = System.currentTimeMillis();
                C161436Vf c161436Vf3 = C161436Vf.this;
                if (currentTimeMillis - c161436Vf3.LJLLI < 200) {
                    c161436Vf3.LJLJLLL.getClass();
                    C161436Vf c161436Vf4 = C161436Vf.this;
                    C161486Vk c161486Vk2 = c161436Vf4.LJLJJL;
                    if (c161486Vk2 != null) {
                        if (c161486Vk2.LIZIZ != null) {
                            z = true;
                        }
                        c161486Vk2.LIZ();
                        c161436Vf4.LJLLILLLL = z;
                    }
                    C161436Vf.this.LLD.LJII();
                    C161436Vf.this.invalidate();
                    boolean z2 = C161436Vf.this.LJZL;
                    return true;
                }
                boolean z3 = c161436Vf3.LJZL;
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJJIZ(float f) {
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                c161436Vf2.LJLJLLL.getClass();
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJLI(C82537WaL c82537WaL) {
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                PointF pointF = c82537WaL.LJIIIZ;
                float f = pointF.x;
                float f2 = pointF.y;
                float f3 = c161436Vf2.LJLLJ + f;
                float f4 = c161436Vf2.LJLLL + f2;
                float abs = Math.abs(f3 - c161436Vf2.LJLLLL);
                float abs2 = Math.abs(f4 - C161436Vf.this.LJLLLLLL);
                if (abs < 5.0f && abs2 < 5.0f) {
                    return false;
                }
                getClass();
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJLJI(float f) {
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final void LJLJJI(C82537WaL c82537WaL) {
                C6W4 c6w4;
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL || (c6w4 = c161436Vf2.LJLZ) == null) {
                    return;
                }
                c161436Vf2.LJLJLLL.getClass();
                c6w4.LIZIZ(null, true, false);
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                c161436Vf2.LIZIZ();
                getClass();
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LLLLLLZ(float f) {
                C6W4 c6w4;
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL || (c6w4 = c161436Vf2.LJLZ) == null) {
                    return false;
                }
                c161436Vf2.LJLJLLL.getClass();
                c6w4.LIZIZ(null, true, true);
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onDown(MotionEvent motionEvent) {
                C161436Vf.this.LJLL = false;
                float y = motionEvent.getY() - AnonymousClass668.LIZIZ().LIZ();
                C161436Vf.this.LJLLJ = motionEvent.getX();
                C161436Vf c161436Vf2 = C161436Vf.this;
                c161436Vf2.LJLLL = y;
                c161436Vf2.LJLLLL = motionEvent.getX();
                C161436Vf c161436Vf3 = C161436Vf.this;
                c161436Vf3.LJLLLLLL = y;
                c161436Vf3.LJLLI = System.currentTimeMillis();
                C161436Vf c161436Vf4 = C161436Vf.this;
                c161436Vf4.getClass();
                c161436Vf4.LJLJLLL.getClass();
                if (c161436Vf4.LJLJJLL) {
                    motionEvent.getX();
                    if (!C32151Nz.LJJIIJZLJL(c161436Vf4.LJLJJL.LIZ)) {
                        C161486Vk c161486Vk2 = c161436Vf4.LJLJJL;
                        if (c161486Vk2 != null) {
                            Iterator it = ((ArrayList) c161486Vk2.LIZ).iterator();
                            if (it.hasNext()) {
                                it.next().getClass();
                                throw null;
                            }
                        }
                        c161436Vf4.LJLJI.LJZL();
                        Iterator it2 = ((ArrayList) c161436Vf4.LJLJJL.LIZ).iterator();
                        if (!it2.hasNext()) {
                            c161436Vf4.LJLJLLL.getClass();
                            c161436Vf4.LJLJJL.getClass();
                        } else {
                            Object next = it2.next();
                            c161436Vf4.LJLJJL.getClass();
                            next.getClass();
                            throw null;
                        }
                    }
                }
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                c161436Vf2.LJLJLLL.getClass();
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                scaleGestureDetector.getFocusX();
                scaleGestureDetector.getFocusY();
                c161436Vf2.LIZIZ();
                getClass();
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (c161436Vf2.LJLLILLLL) {
                    if (!c161436Vf2.LJZL) {
                        return false;
                    }
                    c161436Vf2.LJZL = false;
                    return true;
                }
                if (c161436Vf2.LJLJJL != null) {
                    motionEvent.getY();
                    AnonymousClass668.LIZIZ().LIZ();
                    C161486Vk c161486Vk2 = C161436Vf.this.LJLJJL;
                    motionEvent.getX();
                    List<C153155zj> list = c161486Vk2.LIZ;
                    if (list != null && ((ArrayList) list).size() != 0) {
                        Iterator it = ((ArrayList) c161486Vk2.LIZ).iterator();
                        while (it.hasNext()) {
                            it.next().getClass();
                        }
                    }
                }
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
                AnonymousClass668.LIZIZ().LIZ();
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                c161436Vf2.LJLJLLL.getClass();
                C161436Vf.this.LIZIZ();
                getClass();
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!C161436Vf.this.LJLJJLL) {
                    return false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onFling: ");
                getClass();
                LIZ.append(true);
                X1D.LIZIZ(LIZ);
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (c161436Vf2.LJLL) {
                    c161436Vf2.LJLL = false;
                    return true;
                }
                c161436Vf2.LJLJLLL.getClass();
                return false;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C161436Vf c161436Vf2 = C161436Vf.this;
                if (!c161436Vf2.LJLJJLL) {
                    return false;
                }
                c161436Vf2.LJLJLLL.getClass();
                return false;
            }
        };
        c161436Vf.LLD.LJIIJ = videoPublishEditModel2;
        if ((c161436Vf.LJLIL == 0 || c161436Vf.LJLILLLLZI == 0) && (interfaceC153045zY = c161436Vf.LJLJI) != null) {
            VESize LLILZ = interfaceC153045zY.LLILZ();
            c161436Vf.LJLIL = LLILZ.width;
            c161436Vf.LJLILLLLZI = LLILZ.height;
            C81184Vtc.LJ(c161436Vf.getContext());
            if (AnonymousClass668.LIZ()) {
                if (!C141525gy.LIZ(c161436Vf.LJLIL, c161436Vf.LJLILLLLZI)) {
                    C81184Vtc.LIZIZ(c161436Vf.getContext());
                    C157226Fa c157226Fa = C157226Fa.LIZ;
                    c157226Fa.LJI();
                    if (c157226Fa.LJIILIIL()) {
                        c157226Fa.LIZLLL();
                    } else {
                        c157226Fa.LIZLLL();
                    }
                    c157226Fa.LJIIJ();
                }
            } else if (!C141525gy.LIZ(c161436Vf.LJLIL, c161436Vf.LJLILLLLZI)) {
                C81184Vtc.LIZIZ(c161436Vf.getContext());
                C157236Fb c157236Fb = C157236Fb.LIZ;
                c157236Fb.getBottomMargin();
                c157236Fb.LIZ();
            }
        }
        LLJJ2.LJLJJL.setVisibility(8);
        LLJJ2.LJLJI.setOnInfoStickerTimeEdit(new C161566Vs(LLJJ2));
        LLJJ2.LJLJI.setOnInfoStickerPinEditClick(new C161586Vu(LLJJ2));
        LLJJ2.LJLJI.setITimeEditListener(LLJJ2);
        LLJJ2.LJLJI.setPinHelper(LLJJ2.LLIILZL);
        LLJJ2.LLI.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(LLJJ2, 11));
        LLJJ2.LJLJI.setStickerOnMoveListener(new C6W4() { // from class: X.6Vx
            @Override // X.C6W4
            public final int LIZIZ(C153155zj c153155zj, boolean z, boolean z2) {
                C161416Vd c161416Vd = C161416Vd.this;
                AnonymousClass671 anonymousClass671 = c161416Vd.LLIIIJ;
                if (anonymousClass671 == null) {
                    return -1;
                }
                if (z) {
                    anonymousClass671.LJIIJJI();
                } else if (c153155zj != null && !c161416Vd.LJIIIIZZ() && !C161416Vd.this.LIZ()) {
                    return C161416Vd.this.LLIIIJ.LJI(null, z2);
                }
                return -1;
            }
        });
        C161486Vk c161486Vk2 = LLJJ2.LJLJI.LJLJJL;
        new InterfaceC1549866k() { // from class: X.6Vy
            @Override // X.InterfaceC1549866k
            public final void accept(Object obj) {
                C161416Vd c161416Vd = C161416Vd.this;
                C153155zj c153155zj = (C153155zj) obj;
                if ((c161416Vd.LJIIIIZZ() || c161416Vd.LIZ()) && c161416Vd.LJLJI.LJLJLJ == 1) {
                    if (c161416Vd.LIZ()) {
                        c161416Vd.LJIIIZ(c153155zj, 1);
                    } else {
                        c161416Vd.LJIIIZ(c153155zj, 0);
                    }
                }
            }
        };
        c161486Vk2.getClass();
        C161416Vd LLJJ3 = LLJJ();
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            if (LLJJ3.LJLZ != null) {
                LLJJ3.LLI.post(new ARunnableS16S0201000_13(2, LLJJ3, frameLayout, 4));
            }
            LLJJ().LLII = getEditPreviewApi().x7();
            LLJJ().LLIFFJFJJ = getEditPreviewApi().C0();
            LLJJ().LJZ.LJLJI = ((FTCEditStickerViewModel) this.LJLJLJ.getValue()).N4();
            LLJJ().LJZ.LJLJJI = ((FTCEditStickerViewModel) this.LJLJLJ.getValue()).hP();
            LLJJ().LJZ.LJLIL = getEditPreviewApi().DM();
            LLJJ().LJZ.LJLILLLLZI = getEditPreviewApi().PM();
            C73297Sph.LJIIJJI(this, LLJILJILJ(), new TBT() { // from class: X.6Vz
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditInfoStickerState) obj).getHideHelpBoxEvent();
                }
            }, new AqS184S0100000_2(this, 92));
            C73297Sph.LJIIJJI(this, LLJILJILJ(), new TBT() { // from class: X.6W1
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditInfoStickerState) obj).getResetVideoLengthEvent();
                }
            }, new AqS184S0100000_2(this, 93));
            C73297Sph.LIZLLL(this, LLJILJILJ(), new TBT() { // from class: X.6W0
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditInfoStickerState) obj).getRefreshVideoSource();
                }
            }, new AqS184S0100000_2(this, 94));
            C73297Sph.LJIIJJI(this, LLJILJILJ(), new TBT() { // from class: X.6W2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditInfoStickerState) obj).getEditViewAnimEvent();
                }
            }, new AqS184S0100000_2(this, 95));
            C73297Sph.LJIIJJI(this, LLJILJILJ(), new TBT() { // from class: X.6W3
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((FTCEditInfoStickerState) obj).getEditViewLayoutEvent();
                }
            }, new AqS184S0100000_2(this, 91));
            LLJJ().LJLJI.setStickerDataChangeListener(new InterfaceC153125zg() { // from class: X.662
                @Override // X.InterfaceC153125zg
                public final void LIZIZ(StickerItemModel stickerItemModel) {
                    if (C161426Ve.this.LLJJ().LJZI.infoStickerModel == null) {
                        VideoPublishEditModel videoPublishEditModel3 = C161426Ve.this.LLJJ().LJZI;
                        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
                        VideoPublishEditModel videoPublishEditModel4 = C161426Ve.this.LLJJ().LJZI;
                        o.LJIIIIZZ(videoPublishEditModel4, "stickerHelper.model");
                        videoPublishEditModel3.infoStickerModel = new InfoStickerModel(LIZIZ.LJJLIIIJJI(videoPublishEditModel4));
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("add infoSticker ");
                    LIZ.append(stickerItemModel.getId());
                    H78.LJI(X1D.LIZIZ(LIZ));
                    C161426Ve.this.LLJJ().LJZI.infoStickerModel.addSticker(stickerItemModel);
                }

                @Override // X.InterfaceC153125zg
                public final void LIZ(StickerItemModel item, boolean z) {
                    o.LJIIIZ(item, "item");
                    C161426Ve.this.LLJJ().LJZI.infoStickerModel.removeSticker(item);
                    C161426Ve c161426Ve = C161426Ve.this;
                    ((C137965bE) c161426Ve.LJLJJL.LIZ(c161426Ve, C161426Ve.LJLLI[1])).LIZJ(item.stickerId);
                }
            });
            C161416Vd LLJJ4 = LLJJ();
            new R3A(this);
            LLJJ4.getClass();
            LLJJ().LLIIIZ = new C68R(this);
            C161416Vd LLJJ5 = LLJJ();
            new C66M() { // from class: X.66h
                @Override // X.C66M
                public final void LIZ() {
                    ((FTCEditTextStickerViewModel) C161426Ve.this.LJLJL.getValue()).LIZLLL();
                }
            };
            C161436Vf c161436Vf2 = LLJJ5.LJLJI;
            if (c161436Vf2 != null && (c161486Vk = c161436Vf2.LJLJJL) != null) {
                c161486Vk.getClass();
            }
            InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
            if (interfaceC152085y0 != null) {
                interfaceC152085y0.LIZIZ(new C6V4(100, LLJJ().LJLJI.getGestureListener()));
                return;
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        o.LJIJI("borderLineLayout");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.az3, viewGroup, false, "inflater.inflate(R.layou…ticker, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
