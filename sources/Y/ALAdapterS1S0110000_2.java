package Y;

import X.C144025l0;
import X.C144515ln;
import X.C144855mL;
import X.C151065wM;
import X.C151085wO;
import X.C151105wQ;
import X.C151535x7;
import X.C6OF;
import X.InterfaceC150685vk;
import X.OSZ;
import X.ViewOnClickListenerC151455wz;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData;
import com.ss.android.ugc.aweme.image.model.EditImageInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ALAdapterS1S0110000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationCancel$0(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                onAnimationEnd$4(this, animator);
                return;
            case 6:
                onAnimationEnd$5(this, animator);
                return;
            case 7:
                onAnimationEnd$6(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
            case 2:
            case 3:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                onAnimationStart$1(this, animator);
                return;
            case 6:
                onAnimationStart$2(this, animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6OF.LJIIJ((C6OF) aLAdapterS1S0110000_2.l0, aLAdapterS1S0110000_2.z1);
        ((C6OF) aLAdapterS1S0110000_2.l0).getSoftKeyBoardListener().LIZIZ((C6OF) aLAdapterS1S0110000_2.l0);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [STATE, X.5ln] */
    public static final void onAnimationEnd$0(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        float f;
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS1S0110000_2.z1) {
            C144855mL c144855mL = (C144855mL) aLAdapterS1S0110000_2.l0;
            if (c144855mL.LJLJLLL) {
                Video2StickerModel video2StickerModel = c144855mL.LJLJL;
                if (video2StickerModel != null) {
                    Float f2 = video2StickerModel.videoCropData.scaleAfterCrop;
                    if (f2 != null) {
                        f = f2.floatValue();
                    } else {
                        f = video2StickerModel.editVideoInfo.initializeScale;
                    }
                    float floatValue = c144855mL.getUiActions().LJLJLJ.invoke().floatValue();
                    if (f != floatValue) {
                        Video2StickerModel video2StickerModel2 = c144855mL.LJLJL;
                        if (video2StickerModel2 != null) {
                            video2StickerModel2.videoCropData.scaleAfterCrop = Float.valueOf(floatValue);
                        } else {
                            o.LJIJI("video2StickerModel");
                            throw null;
                        }
                    }
                    OSZ<Float, Float> invoke = c144855mL.getUiActions().LJLJLLL.invoke();
                    float floatValue2 = invoke.getFirst().floatValue();
                    Video2StickerModel video2StickerModel3 = c144855mL.LJLJL;
                    if (video2StickerModel3 != null) {
                        VideoCropData videoCropData = video2StickerModel3.videoCropData;
                        if (floatValue2 != videoCropData.transformX) {
                            videoCropData.transformX = invoke.getFirst().floatValue();
                        }
                        float floatValue3 = invoke.getSecond().floatValue();
                        Video2StickerModel video2StickerModel4 = c144855mL.LJLJL;
                        if (video2StickerModel4 != null) {
                            float f3 = floatValue3 + video2StickerModel4.editVideoInfo.initializeTransY;
                            VideoCropData videoCropData2 = video2StickerModel4.videoCropData;
                            if (f3 != videoCropData2.transformY) {
                                videoCropData2.transformY = f3;
                            }
                            int i = c144855mL.getUiStates().LJ.LJFF;
                            Video2StickerModel video2StickerModel5 = c144855mL.LJLJL;
                            if (video2StickerModel5 != null) {
                                VideoCropData videoCropData3 = video2StickerModel5.videoCropData;
                                if (i != videoCropData3.cropRatioMode) {
                                    videoCropData3.cropRatioMode = c144855mL.getUiStates().LJ.LJFF;
                                    c144855mL.getUiActions().LJLLI.invoke(Boolean.TRUE, Float.valueOf(C144025l0.LIZJ(c144855mL.getUiStates().LJ.LJFF)));
                                }
                            } else {
                                o.LJIJI("video2StickerModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("video2StickerModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("video2StickerModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("video2StickerModel");
                    throw null;
                }
            }
        } else {
            C144855mL c144855mL2 = (C144855mL) aLAdapterS1S0110000_2.l0;
            c144855mL2.getUiActions().LJLJLJ.invoke().floatValue();
            OSZ<Float, Float> invoke2 = c144855mL2.getUiActions().LJLJLLL.invoke();
            c144855mL2.getUiStates().LJ = C144515ln.LIZ(c144855mL2.getUiStates().LJ, c144855mL2.getUiActions().LJLJLJ.invoke().floatValue(), invoke2.getSecond().floatValue(), 0, null, 121);
        }
        ((C144855mL) aLAdapterS1S0110000_2.l0).getUiActions().LJLLILLLL.invoke(Boolean.valueOf(aLAdapterS1S0110000_2.z1));
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((EditorProScene) aLAdapterS1S0110000_2.l0).finish(aLAdapterS1S0110000_2.z1);
        ((EditorProScene) aLAdapterS1S0110000_2.l0).setAnimOutFinish(true);
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animator) {
        if (aLAdapterS1S0110000_2.z1) {
            ((View) aLAdapterS1S0110000_2.l0).setVisibility(8);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6OF.LJIIJ((C6OF) aLAdapterS1S0110000_2.l0, aLAdapterS1S0110000_2.z1);
        ((C6OF) aLAdapterS1S0110000_2.l0).getSoftKeyBoardListener().LIZIZ((C6OF) aLAdapterS1S0110000_2.l0);
    }

    public static final void onAnimationEnd$4(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS1S0110000_2.z1) {
            ((View) aLAdapterS1S0110000_2.l0).setVisibility(8);
        }
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$5(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        RectF LJFF;
        EditImageInfo editImageInfo;
        boolean z;
        C151065wM c151065wM;
        EditImageInfo editImageInfo2;
        RectF LJFF2;
        SingleImageData singleImageData;
        EditImageInfo editImageInfo3;
        float f;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!aLAdapterS1S0110000_2.z1) {
            ViewOnClickListenerC151455wz viewOnClickListenerC151455wz = (ViewOnClickListenerC151455wz) aLAdapterS1S0110000_2.l0;
            if (viewOnClickListenerC151455wz.LLI) {
                C151065wM c151065wM2 = viewOnClickListenerC151455wz.LLD;
                if (c151065wM2 != null && (LJFF2 = c151065wM2.LJFF()) != null && (singleImageData = viewOnClickListenerC151455wz.LLFF) != null && (editImageInfo3 = singleImageData.getEditImageInfo()) != null) {
                    Float scaleAfterCrop = editImageInfo3.getScaleAfterCrop();
                    if (scaleAfterCrop != null || (scaleAfterCrop = editImageInfo3.getInitializeScaleValue()) != null) {
                        f = scaleAfterCrop.floatValue();
                    } else {
                        f = 1.0f;
                    }
                    float width = LJFF2.width();
                    o.LJI(viewOnClickListenerC151455wz.LLFF);
                    float width2 = width / r0.getSrcImageInfo().getWidth();
                    if (width2 != f) {
                        editImageInfo3.setScaleAfterCrop(Float.valueOf(width2));
                    }
                    float centerX = LJFF2.centerX() - (C151105wQ.LIZIZ / 2);
                    if (!o.LIZ(centerX, editImageInfo3.getOffsetX())) {
                        editImageInfo3.setOffsetX(Float.valueOf(centerX));
                    }
                    float centerY = LJFF2.centerY() - viewOnClickListenerC151455wz.LLII;
                    if (!o.LIZ(centerY, editImageInfo3.getOffsetY())) {
                        editImageInfo3.setOffsetY(Float.valueOf(centerY));
                    }
                }
                SingleImageData singleImageData2 = viewOnClickListenerC151455wz.LLFF;
                if (singleImageData2 == null || (editImageInfo2 = singleImageData2.getEditImageInfo()) == null || viewOnClickListenerC151455wz.LLF != editImageInfo2.getRatioMode()) {
                    SingleImageData singleImageData3 = viewOnClickListenerC151455wz.LLFF;
                    if (singleImageData3 != null && (editImageInfo = singleImageData3.getEditImageInfo()) != null) {
                        editImageInfo.setRatioMode(viewOnClickListenerC151455wz.LLF);
                        C151535x7 c151535x7 = C151535x7.LIZ;
                        int i = viewOnClickListenerC151455wz.LLF;
                        c151535x7.getClass();
                        editImageInfo.setRatio(C151535x7.LJII(i));
                        int i2 = viewOnClickListenerC151455wz.LLF;
                        if (i2 == 0 || (i2 == 4 && C151105wQ.LIZIZ(editImageInfo.getRatio()))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        editImageInfo.setFullScreen(z);
                    }
                    viewOnClickListenerC151455wz.LLJILJILJ().Xm();
                    C151065wM c151065wM3 = viewOnClickListenerC151455wz.LLD;
                    if (c151065wM3 != null) {
                        c151065wM3.LJFF = true;
                    }
                }
                if ((viewOnClickListenerC151455wz.LLIIJLIL != null || viewOnClickListenerC151455wz.LLIIL != null || viewOnClickListenerC151455wz.LLIILII != null) && (c151065wM = viewOnClickListenerC151455wz.LLD) != null) {
                    c151065wM.LJFF = true;
                }
                InterfaceC150685vk interfaceC150685vk = (InterfaceC150685vk) viewOnClickListenerC151455wz.LJZ.LIZ(viewOnClickListenerC151455wz, ViewOnClickListenerC151455wz.LLIIZ[2]);
                if (interfaceC150685vk != null) {
                    interfaceC150685vk.Pr();
                }
            }
            ((ViewOnClickListenerC151455wz) aLAdapterS1S0110000_2.l0).LLJILJILJ().Cu0(false);
            return;
        }
        C151085wO c151085wO = ((ViewOnClickListenerC151455wz) aLAdapterS1S0110000_2.l0).LLFFF;
        if (c151085wO != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c151085wO, "alpha", 0.5f, 0.0f);
            ofFloat.setDuration(150L);
            ofFloat.addListener(new ALAdapterS1S0100000_2(c151085wO, 21));
            ofFloat.start();
        }
        ViewOnClickListenerC151455wz viewOnClickListenerC151455wz2 = (ViewOnClickListenerC151455wz) aLAdapterS1S0110000_2.l0;
        C151065wM c151065wM4 = viewOnClickListenerC151455wz2.LLD;
        if (c151065wM4 == null || (LJFF = c151065wM4.LJFF()) == null) {
            return;
        }
        float width3 = LJFF.width();
        o.LJI(viewOnClickListenerC151455wz2.LLFF);
        viewOnClickListenerC151455wz2.LLIIIL = width3 / r0.getSrcImageInfo().getWidth();
        viewOnClickListenerC151455wz2.LLIIIZ = LJFF.centerX() - (C151105wQ.LIZIZ / 2);
        viewOnClickListenerC151455wz2.LLIIJI = LJFF.centerY() - viewOnClickListenerC151455wz2.LLII;
    }

    public static final void onAnimationEnd$6(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animator) {
        if (aLAdapterS1S0110000_2.z1) {
            ((View) aLAdapterS1S0110000_2.l0).setVisibility(8);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationStart$0(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C144855mL) aLAdapterS1S0110000_2.l0).getUiActions().LJLLL.invoke();
    }

    public static final void onAnimationStart$1(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6OF.LJIIJ((C6OF) aLAdapterS1S0110000_2.l0, aLAdapterS1S0110000_2.z1);
    }

    public static final void onAnimationStart$2(ALAdapterS1S0110000_2 aLAdapterS1S0110000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C151085wO c151085wO = ((ViewOnClickListenerC151455wz) aLAdapterS1S0110000_2.l0).LLFFF;
        if (c151085wO != null) {
            c151085wO.setVisibility(0);
        }
    }

    public ALAdapterS1S0110000_2(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
