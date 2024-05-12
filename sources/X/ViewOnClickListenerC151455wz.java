package X;

import Y.ALAdapterS1S0110000_2;
import Y.ARunnableS38S0100000_2;
import Y.AUListenerS78S0300000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.image.model.EditImageInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC151455wz extends WM7 implements View.OnClickListener, C5HC, InterfaceC135635Tz, InterfaceC151715xP {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIZ;
    public final C82622Wbi LJLIL;
    public View LJLILLLLZI;
    public C151465x0 LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public TextView LJLLI;
    public TextView LJLLILLLL;
    public TextView LJLLJ;
    public TextView LJLLL;
    public TextView LJLLLL;
    public final C82632Wbs LJLLLLLL;
    public final C82632Wbs LJLZ;
    public final C82631Wbr LJZ;
    public final C62822Ol8 LJZI;
    public final C82632Wbs LJZL;
    public final C82632Wbs LL;
    public C151065wM LLD;
    public int LLF;
    public SingleImageData LLFF;
    public C151085wO LLFFF;
    public boolean LLFII;
    public ValueAnimator LLFZ;
    public boolean LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public float LLII;
    public ValueAnimator LLIIII;
    public boolean LLIIIILZ;
    public float LLIIIJ;
    public float LLIIIL;
    public float LLIIIZ;
    public float LLIIJI;
    public Float LLIIJLIL;
    public Float LLIIL;
    public Float LLIILII;
    public final C151475x1 LLIILZL;

    static {
        TBT tbt = new TBT(ViewOnClickListenerC151455wz.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(ViewOnClickListenerC151455wz.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0, c65351Pkp), C61845OOz.LIZJ(ViewOnClickListenerC151455wz.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0, c65351Pkp), C61845OOz.LIZJ(ViewOnClickListenerC151455wz.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(ViewOnClickListenerC151455wz.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0, c65351Pkp)};
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

    public final float LLJILJIL() {
        return ((Number) this.LLIFFJFJJ.getValue()).floatValue();
    }

    public final InterfaceC151215wb LLJILJILJ() {
        return (InterfaceC151215wb) this.LJLZ.LIZ(this, LLIIZ[1]);
    }

    public final VideoPublishEditModel LLJJ() {
        return (VideoPublishEditModel) this.LJZL.LIZ(this, LLIIZ[3]);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJI() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC151455wz.LLJJI():void");
    }

    public final void cancel() {
        float f;
        float f2;
        C151065wM c151065wM;
        float f3;
        float f4;
        Float f5 = this.LLIIL;
        if (f5 != null) {
            f = f5.floatValue();
        } else {
            f = this.LLIIIZ;
        }
        float f6 = f - this.LLIIIZ;
        Float f7 = this.LLIILII;
        if (f7 != null) {
            f2 = f7.floatValue();
        } else {
            f2 = this.LLIIJI;
        }
        float f8 = f2 - this.LLIIJI;
        Float f9 = this.LLIIJLIL;
        if (f9 != null && !o.LIZJ(f9, this.LLIIIL)) {
            float f10 = C151105wQ.LIZIZ / 2;
            Float f11 = this.LLIIL;
            if (f11 != null) {
                f3 = f11.floatValue();
            } else {
                f3 = 0.0f;
            }
            float f12 = f10 + f3;
            float f13 = C151105wQ.LIZ / 2;
            Float f14 = this.LLIILII;
            if (f14 != null) {
                f4 = f14.floatValue();
            } else {
                f4 = 0.0f;
            }
            float f15 = f13 + f4;
            C151065wM c151065wM2 = this.LLD;
            if (c151065wM2 != null) {
                float f16 = this.LLIIIL;
                Float f17 = this.LLIIJLIL;
                o.LJI(f17);
                c151065wM2.LJII(f16 / f17.floatValue(), f12, f15, true);
            }
        }
        if ((f6 == 0.0f && f8 == 0.0f) || (c151065wM = this.LLD) == null) {
            return;
        }
        c151065wM.LJIIIIZZ(-f6, -f8, true);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLLLLLL.LIZ(this, LLIIZ[0]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.5x1] */
    public ViewOnClickListenerC151455wz(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLLLLLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLZ = UCI.LJI(diContainer, InterfaceC151215wb.class, null);
        this.LJZ = UCI.LJII(diContainer, InterfaceC150685vk.class, null);
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1001));
        this.LJZL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LL = UCI.LJI(diContainer, InterfaceC45540Hu4.class, null);
        this.LLF = -1;
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1000));
        this.LLIIIJ = 1.0f;
        this.LLIIIL = -1.0f;
        this.LLIILZL = new C6P6() { // from class: X.5x1
            @Override // X.C6P6, X.C6V2
            public final boolean LJJIIZI(MotionEvent motionEvent) {
                ViewOnClickListenerC151455wz.this.LLJJI();
                ViewOnClickListenerC151455wz viewOnClickListenerC151455wz = ViewOnClickListenerC151455wz.this;
                viewOnClickListenerC151455wz.LLIIIILZ = false;
                C151465x0 c151465x0 = viewOnClickListenerC151455wz.LJLJI;
                if (c151465x0 != null) {
                    c151465x0.setCanShowAuxiliaryLines(false);
                    return true;
                }
                o.LJIJI("previewMaskView");
                throw null;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJLI(C82537WaL c82537WaL) {
                PointF pointF;
                if (c82537WaL != null && (pointF = c82537WaL.LJIIIZ) != null) {
                    ViewOnClickListenerC151455wz viewOnClickListenerC151455wz = ViewOnClickListenerC151455wz.this;
                    float f = (int) pointF.x;
                    float f2 = (int) pointF.y;
                    C151065wM c151065wM = viewOnClickListenerC151455wz.LLD;
                    if (c151065wM != null) {
                        c151065wM.LJIIIIZZ(f, -f2, true);
                    }
                }
                ViewOnClickListenerC151455wz viewOnClickListenerC151455wz2 = ViewOnClickListenerC151455wz.this;
                viewOnClickListenerC151455wz2.LLIIIILZ = true;
                C151465x0 c151465x0 = viewOnClickListenerC151455wz2.LJLJI;
                if (c151465x0 != null) {
                    c151465x0.setCanShowAuxiliaryLines(true);
                    return true;
                }
                o.LJIJI("previewMaskView");
                throw null;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                RectF LJFF;
                if (scaleGestureDetector == null) {
                    C151465x0 c151465x0 = ViewOnClickListenerC151455wz.this.LJLJI;
                    if (c151465x0 != null) {
                        c151465x0.setCanShowAuxiliaryLines(false);
                        return false;
                    }
                    o.LJIJI("previewMaskView");
                    throw null;
                }
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = (C151105wQ.LIZ + C151105wQ.LJ) - (scaleGestureDetector.getFocusY() + C151105wQ.LJFF);
                ViewOnClickListenerC151455wz viewOnClickListenerC151455wz = ViewOnClickListenerC151455wz.this;
                C151065wM c151065wM = viewOnClickListenerC151455wz.LLD;
                if (c151065wM != null && (LJFF = c151065wM.LJFF()) != null) {
                    float width = LJFF.width();
                    if (viewOnClickListenerC151455wz.LJLJI != null) {
                        if (width / r0.getCropAreaRect().width() >= 0.8f) {
                            float height = LJFF.height();
                            if (viewOnClickListenerC151455wz.LJLJI != null) {
                                if (height / r0.getCropAreaRect().height() >= 0.8f) {
                                    c151065wM.LJII(scaleFactor, focusX, focusY, true);
                                }
                            } else {
                                o.LJIJI("previewMaskView");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("previewMaskView");
                        throw null;
                    }
                }
                C151465x0 c151465x02 = ViewOnClickListenerC151455wz.this.LJLJI;
                if (c151465x02 != null) {
                    c151465x02.setCanShowAuxiliaryLines(true);
                    return true;
                }
                o.LJIJI("previewMaskView");
                throw null;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                C151465x0 c151465x0 = ViewOnClickListenerC151455wz.this.LJLJI;
                if (c151465x0 != null) {
                    c151465x0.setCanShowAuxiliaryLines(true);
                    return true;
                }
                o.LJIJI("previewMaskView");
                throw null;
            }

            @Override // X.C6P6, X.C6V2
            public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
                C151465x0 c151465x0 = ViewOnClickListenerC151455wz.this.LJLJI;
                if (c151465x0 != null) {
                    c151465x0.setCanShowAuxiliaryLines(true);
                    return true;
                }
                o.LJIJI("previewMaskView");
                throw null;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIII(final boolean r13) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC151455wz.LLJJIII(boolean):void");
    }

    public final void LLJJIJI(final boolean z) {
        SrcImageInfo srcImageInfo;
        float f;
        float f2;
        float cropAreaWidth;
        int width;
        int i;
        EditImageInfo editImageInfo;
        EditImageInfo editImageInfo2;
        EditImageInfo editImageInfo3;
        final float f3;
        final float LLJILJIL;
        final float f4;
        SingleImageData singleImageData;
        EditImageInfo editImageInfo4;
        EditImageInfo editImageInfo5;
        Float scaleAfterCrop;
        EditImageInfo editImageInfo6;
        Float initializeScaleValue;
        SingleImageData singleImageData2 = this.LLFF;
        if (singleImageData2 != null && (srcImageInfo = singleImageData2.getSrcImageInfo()) != null) {
            SingleImageData singleImageData3 = this.LLFF;
            float f5 = 1.0f;
            if (singleImageData3 != null && (editImageInfo6 = singleImageData3.getEditImageInfo()) != null && (initializeScaleValue = editImageInfo6.getInitializeScaleValue()) != null) {
                f = initializeScaleValue.floatValue();
            } else {
                f = 1.0f;
            }
            SingleImageData singleImageData4 = this.LLFF;
            if (singleImageData4 != null && (editImageInfo5 = singleImageData4.getEditImageInfo()) != null && (scaleAfterCrop = editImageInfo5.getScaleAfterCrop()) != null) {
                f2 = scaleAfterCrop.floatValue();
            } else {
                f2 = f;
            }
            float height = srcImageInfo.getHeight() / srcImageInfo.getWidth();
            C151465x0 c151465x0 = this.LJLJI;
            if (c151465x0 != null) {
                float measuredHeight = c151465x0.getMeasuredHeight();
                if (this.LJLJI != null) {
                    if (height > measuredHeight / r0.getCropAreaWidth()) {
                        C151465x0 c151465x02 = this.LJLJI;
                        if (c151465x02 != null) {
                            cropAreaWidth = c151465x02.getMeasuredHeight();
                            width = srcImageInfo.getHeight();
                        } else {
                            o.LJIJI("previewMaskView");
                            throw null;
                        }
                    } else {
                        C151465x0 c151465x03 = this.LJLJI;
                        if (c151465x03 != null) {
                            cropAreaWidth = c151465x03.getCropAreaWidth();
                            width = srcImageInfo.getWidth();
                        } else {
                            o.LJIJI("previewMaskView");
                            throw null;
                        }
                    }
                    this.LLIIIJ = cropAreaWidth / width;
                    if (z) {
                        i = this.LLF;
                    } else if (this.LLI) {
                        i = this.LLF;
                    } else {
                        SingleImageData singleImageData5 = this.LLFF;
                        if (singleImageData5 != null && (editImageInfo2 = singleImageData5.getEditImageInfo()) != null && editImageInfo2.getRatioMode() == -1) {
                            SingleImageData singleImageData6 = this.LLFF;
                            if (singleImageData6 != null && (editImageInfo3 = singleImageData6.getEditImageInfo()) != null && editImageInfo3.isFullScreen()) {
                                i = 0;
                            } else {
                                i = 4;
                            }
                        } else {
                            SingleImageData singleImageData7 = this.LLFF;
                            if (singleImageData7 != null && (editImageInfo = singleImageData7.getEditImageInfo()) != null) {
                                i = editImageInfo.getRatioMode();
                            } else {
                                i = -1;
                            }
                        }
                    }
                    final float f6 = (this.LLIIIJ / f) * f2;
                    if (this.LLI || (singleImageData = this.LLFF) == null || (editImageInfo4 = singleImageData.getEditImageInfo()) == null || editImageInfo4.getRatioMode() != -1) {
                        int width2 = srcImageInfo.getWidth();
                        int height2 = srcImageInfo.getHeight();
                        float LIZIZ = C151045wK.LIZIZ(i);
                        float f7 = height2 / width2;
                        if (f7 <= LIZIZ) {
                            f5 = f7 / LIZIZ;
                        }
                        f6 *= f5;
                    }
                    ValueAnimator valueAnimator = this.LLFZ;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    this.LLFZ = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                    if (z) {
                        f3 = f2;
                        LLJILJIL = this.LLII;
                    } else {
                        f3 = f6;
                        f6 = f2;
                        LLJILJIL = LLJILJIL();
                    }
                    if (z) {
                        f4 = LLJILJIL();
                    } else {
                        f4 = this.LLII;
                    }
                    final C56K c56k = new C56K();
                    c56k.element = f3;
                    ValueAnimator valueAnimator2 = this.LLFZ;
                    if (valueAnimator2 != null) {
                        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5wP
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                Rect rect;
                                Rect rect2;
                                float floatValue = ((Float) C264612c.LIZ(valueAnimator3, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                                float f8 = f3;
                                float f9 = f6;
                                float LIZIZ2 = C06420Na.LIZIZ(f9, f8, floatValue, f8);
                                float f10 = LIZIZ2 / c56k.element;
                                float f11 = C151105wQ.LIZIZ / 2;
                                float f12 = LLJILJIL;
                                float f13 = ((f4 - f12) / (1.0f - (f9 / f8))) + f12;
                                C151065wM c151065wM = this.LLD;
                                if (c151065wM != null) {
                                    c151065wM.LJII(f10, f11, f13, true);
                                }
                                C151085wO c151085wO = this.LLFFF;
                                if (c151085wO != null) {
                                    boolean z2 = z;
                                    c151085wO.LJLIL = 0;
                                    C151535x7 c151535x7 = C151535x7.LIZ;
                                    if (z2) {
                                        rect = c151085wO.LJLJI;
                                        rect2 = c151085wO.LJLJJI;
                                    } else {
                                        rect = c151085wO.LJLJJI;
                                        rect2 = c151085wO.LJLJI;
                                    }
                                    c151535x7.getClass();
                                    c151085wO.LJLJJL = C151535x7.LIZJ(floatValue, rect, rect2);
                                    c151085wO.invalidate();
                                }
                                c56k.element = LIZIZ2;
                            }
                        });
                    }
                    ValueAnimator valueAnimator3 = this.LLFZ;
                    if (valueAnimator3 != null) {
                        valueAnimator3.addListener(new ALAdapterS1S0110000_2(this, z, 6));
                    }
                    ValueAnimator valueAnimator4 = this.LLFZ;
                    if (valueAnimator4 != null) {
                        valueAnimator4.start();
                        return;
                    }
                    return;
                }
                o.LJIJI("previewMaskView");
                throw null;
            }
            o.LJIJI("previewMaskView");
            throw null;
        }
    }

    public final TextView LLJJIJIIJIL(int i) {
        TextView textView;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            textView = this.LJLLILLLL;
                            if (textView == null) {
                                o.LJIJI("tvFull");
                                throw null;
                            }
                        } else {
                            textView = this.LJLLI;
                            if (textView == null) {
                                o.LJIJI("tvOriginal");
                                throw null;
                            }
                        }
                    } else {
                        textView = this.LJLLLL;
                        if (textView == null) {
                            o.LJIJI("tv4v3");
                            throw null;
                        }
                    }
                } else {
                    textView = this.LJLLL;
                    if (textView == null) {
                        o.LJIJI("tv1v1");
                        throw null;
                    }
                }
            } else {
                textView = this.LJLLJ;
                if (textView == null) {
                    o.LJIJI("tv3v4");
                    throw null;
                }
            }
        } else {
            textView = this.LJLLILLLL;
            if (textView == null) {
                o.LJIJI("tvFull");
                throw null;
            }
        }
        return textView;
    }

    public final View LLJJIJIL(int i) {
        View view;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            view = this.LJLJJLL;
                            if (view == null) {
                                o.LJIJI("btn9V16");
                                throw null;
                            }
                        } else {
                            view = this.LJLJJL;
                            if (view == null) {
                                o.LJIJI("btnOriginal");
                                throw null;
                            }
                        }
                    } else {
                        view = this.LJLJLLL;
                        if (view == null) {
                            o.LJIJI("btn4V3");
                            throw null;
                        }
                    }
                } else {
                    view = this.LJLJL;
                    if (view == null) {
                        o.LJIJI("btn1V1");
                        throw null;
                    }
                }
            } else {
                view = this.LJLJLJ;
                if (view == null) {
                    o.LJIJI("btn3V4");
                    throw null;
                }
            }
        } else {
            view = this.LJLJJLL;
            if (view == null) {
                o.LJIJI("btn9V16");
                throw null;
            }
        }
        return view;
    }

    public final void LLJJJ(RectF rectF) {
        float width = rectF.width();
        o.LJI(this.LLFF);
        this.LLIIJLIL = Float.valueOf(width / r0.getSrcImageInfo().getWidth());
        this.LLIIL = Float.valueOf(rectF.centerX() - (C151105wQ.LIZIZ / 2));
        this.LLIILII = Float.valueOf(rectF.centerY() - this.LLII);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.j83);
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C151555x9 c151555x9 = new C151555x9(requireSceneContext);
        c151555x9.LJII = true;
        EnumC151645xI enumC151645xI = EnumC151645xI.NO_NAV_BAR;
        o.LJIIIZ(enumC151645xI, "<set-?>");
        c151555x9.LIZIZ = enumC151645xI;
        c151555x9.LIZLLL = C47261Igj.LJJIJIL(new C151915xj(SFS.LJI(190.0d), 2));
        c151555x9.LJFF = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c151555x9.LIZ), R.layout.bk_, viewGroup, false);
        c151555x9.LJI = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c151555x9.LIZ), R.layout.bk9, viewGroup, false);
        C151885xg c151885xg = new C151885xg(c151555x9);
        if (viewGroup != null) {
            viewGroup.addView(c151885xg, -1, -1);
        }
        View requireViewById = requireViewById(R.id.fk4);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.layout_panel)");
        this.LJLILLLLZI = requireViewById;
        requireViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.5xS
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        View requireViewById2 = requireViewById(R.id.geh);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.mask)");
        this.LJLJI = (C151465x0) requireViewById2;
        View requireViewById3 = requireViewById(R.id.io3);
        o.LJIIIIZZ(requireViewById3, "requireViewById(id.ratio9To16_v2)");
        this.LJLJJLL = requireViewById3;
        View requireViewById4 = requireViewById(R.id.inx);
        o.LJIIIIZZ(requireViewById4, "requireViewById(id.ratio1To1_v2)");
        this.LJLJL = requireViewById4;
        View requireViewById5 = requireViewById(R.id.inz);
        o.LJIIIIZZ(requireViewById5, "requireViewById(id.ratio3To4_v2)");
        this.LJLJLJ = requireViewById5;
        View requireViewById6 = requireViewById(R.id.io1);
        o.LJIIIIZZ(requireViewById6, "requireViewById(id.ratio4To3_v2)");
        this.LJLJLLL = requireViewById6;
        View requireViewById7 = requireViewById(R.id.io6);
        o.LJIIIIZZ(requireViewById7, "requireViewById(id.ratio_original_v2)");
        this.LJLJJL = requireViewById7;
        C16880lQ.LJIIJ(this, requireViewById7);
        View view = this.LJLJJLL;
        if (view != null) {
            C16880lQ.LJIIJ(this, view);
            View view2 = this.LJLJL;
            if (view2 != null) {
                C16880lQ.LJIIJ(this, view2);
                View view3 = this.LJLJLJ;
                if (view3 != null) {
                    C16880lQ.LJIIJ(this, view3);
                    View view4 = this.LJLJLLL;
                    if (view4 != null) {
                        C16880lQ.LJIIJ(this, view4);
                        View requireViewById8 = requireViewById(R.id.mcx);
                        o.LJIIIIZZ(requireViewById8, "requireViewById(id.tv_original)");
                        this.LJLLI = (TextView) requireViewById8;
                        View requireViewById9 = requireViewById(R.id.m7c);
                        o.LJIIIIZZ(requireViewById9, "requireViewById(id.tv_full)");
                        this.LJLLILLLL = (TextView) requireViewById9;
                        View requireViewById10 = requireViewById(R.id.lyp);
                        o.LJIIIIZZ(requireViewById10, "requireViewById(id.tv_3v4)");
                        this.LJLLJ = (TextView) requireViewById10;
                        View requireViewById11 = requireViewById(R.id.lyo);
                        o.LJIIIIZZ(requireViewById11, "requireViewById(id.tv_1v1)");
                        this.LJLLL = (TextView) requireViewById11;
                        View requireViewById12 = requireViewById(R.id.lyq);
                        o.LJIIIIZZ(requireViewById12, "requireViewById(id.tv_4v3)");
                        this.LJLLLL = (TextView) requireViewById12;
                        View requireViewById13 = requireViewById(R.id.is9);
                        o.LJIIIIZZ(requireViewById13, "requireViewById<View>(id.rect_original)");
                        this.LJLL = requireViewById13;
                        C16880lQ.LJIIJ(this, requireViewById(R.id.m1c));
                        C16880lQ.LJIIJ(this, requireViewById(R.id.mij));
                        View requireViewById14 = requireViewById(R.id.lfo);
                        o.LJIIIIZZ(requireViewById14, "requireViewById<View>(R.id.top_mask)");
                        this.LJLJJI = requireViewById14;
                        requireViewById14.setBackgroundColor(C151465x0.LJLLL);
                        View view5 = this.LJLJJI;
                        if (view5 != null) {
                            ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.height = C151105wQ.LJFF;
                            View view6 = this.LJLJJI;
                            if (view6 != null) {
                                view6.setLayoutParams(marginLayoutParams);
                                View view7 = this.LJLJJI;
                                if (view7 != null) {
                                    view7.setOnTouchListener(new View.OnTouchListener() { // from class: X.5xT
                                        @Override // android.view.View.OnTouchListener
                                        public final boolean onTouch(View view8, MotionEvent motionEvent) {
                                            return true;
                                        }
                                    });
                                    ((InterfaceC45540Hu4) this.LL.LIZ(this, LLIIZ[4])).registerActivityOnKeyDownListener(this);
                                    Context requireSceneContext2 = requireSceneContext();
                                    o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                                    C78897Uxp.LJIILIIL(requireSceneContext2, (ViewGroup) requireViewById(R.id.drl)).LIZIZ(new C6V4(0, this.LLIILZL));
                                    return;
                                }
                                o.LJIJI("topMaskView");
                                throw null;
                            }
                            o.LJIJI("topMaskView");
                            throw null;
                        }
                        o.LJIJI("topMaskView");
                        throw null;
                    }
                    o.LJIJI("btn4V3");
                    throw null;
                }
                o.LJIJI("btn3V4");
                throw null;
            }
            o.LJIJI("btn1V1");
            throw null;
        }
        o.LJIJI("btn9V16");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        boolean z;
        String str;
        EditImageInfo editImageInfo;
        EditImageInfo editImageInfo2;
        boolean z2;
        ValueAnimator valueAnimator = this.LLIIII;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.LLIIIILZ) {
            return;
        }
        C151465x0 c151465x0 = this.LJLJI;
        if (c151465x0 != null) {
            ValueAnimator valueAnimator2 = c151465x0.LJLLILLLL;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return;
            }
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num == null) {
                return;
            }
            if (num.intValue() == R.id.m1c) {
                cancel();
                LLJJIII(false);
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "video_edit_page");
                c145995oB.LJI("creation_id", LLJJ().getCreationId());
                c145995oB.LJI("shoot_way", LLJJ().mShootWay);
                c145995oB.LJI("content_source", LLJJ().getAvetParameter().getContentSource());
                c145995oB.LJI("content_type", LLJJ().getAvetParameter().getContentType());
                c145995oB.LIZ(1, "is_multi_content");
                c145995oB.LJI("mix_type", "photo");
                FMX.LJIIL("click_crop_cancel", c145995oB.LIZ);
                return;
            }
            if (num == null) {
                return;
            }
            if (num.intValue() == R.id.mij) {
                this.LLI = true;
                C151535x7 c151535x7 = C151535x7.LIZ;
                int i = this.LLF;
                c151535x7.getClass();
                float LJII = C151535x7.LJII(i);
                SingleImageData singleImageData = this.LLFF;
                if (singleImageData != null && (editImageInfo2 = singleImageData.getEditImageInfo()) != null) {
                    int i2 = this.LLF;
                    if (i2 == 0 || (i2 == 4 && C151105wQ.LIZIZ(LJII))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    editImageInfo2.setFullScreen(z2);
                }
                this.LLII = C151105wQ.LIZ / 2;
                SingleImageData singleImageData2 = this.LLFF;
                if (singleImageData2 == null || (editImageInfo = singleImageData2.getEditImageInfo()) == null || this.LLF != editImageInfo.getRatioMode()) {
                    C151085wO c151085wO = this.LLFFF;
                    if (c151085wO != null) {
                        SingleImageData singleImageData3 = this.LLFF;
                        o.LJI(singleImageData3);
                        float width = singleImageData3.getSrcImageInfo().getWidth();
                        o.LJI(this.LLFF);
                        c151085wO.setCropRect(C151045wK.LIZ(LJII, width / r0.getSrcImageInfo().getHeight(), this.mView.getWidth(), this.mView.getHeight()));
                    }
                    C151085wO c151085wO2 = this.LLFFF;
                    if (c151085wO2 != null) {
                        InterfaceC151215wb LLJILJILJ = LLJILJILJ();
                        if (this.LLF == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c151085wO2.setEditRect(LLJILJILJ.Ha0(z, LJII));
                    }
                }
                LLJJIII(false);
                C145995oB c145995oB2 = new C145995oB();
                c145995oB2.LJI("enter_from", "video_edit_page");
                c145995oB2.LJI("creation_id", LLJJ().getCreationId());
                c145995oB2.LJI("shoot_way", LLJJ().mShootWay);
                c145995oB2.LJI("content_source", LLJJ().getAvetParameter().getContentSource());
                c145995oB2.LJI("content_type", LLJJ().getAvetParameter().getContentType());
                c145995oB2.LIZ(1, "is_multi_content");
                c145995oB2.LJI("mix_type", "photo");
                int i3 = this.LLF;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    str = "";
                                } else {
                                    str = "original";
                                }
                            } else {
                                str = "4:3";
                            }
                        } else {
                            str = "1:1";
                        }
                    } else {
                        str = "3:4";
                    }
                } else {
                    str = "9:16";
                }
                c145995oB2.LJI("size_type", str);
                FMX.LJIIL("click_crop_complete", c145995oB2.LIZ);
                return;
            }
            if (num.intValue() == R.id.inx) {
                LLJJJIL(2, true);
                return;
            }
            if (num.intValue() == R.id.io1) {
                LLJJJIL(3, true);
                return;
            }
            if (num.intValue() == R.id.io3) {
                LLJJJIL(0, true);
                return;
            } else if (num.intValue() == R.id.inz) {
                LLJJJIL(1, true);
                return;
            } else {
                if (num.intValue() != R.id.io6) {
                    return;
                }
                LLJJJIL(4, true);
                return;
            }
        }
        o.LJIJI("previewMaskView");
        throw null;
    }

    public final void LLJJJIL(int i, boolean z) {
        int i2 = this.LLF;
        if (i2 == i) {
            return;
        }
        LLJJIJIL(i2).setSelected(false);
        TextView LLJJIJIIJIL = LLJJIJIIJIL(this.LLF);
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        LLJJIJIIJIL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dl, requireSceneContext));
        ((TuxTextView) LLJJIJIIJIL).setTuxFont(61);
        this.LLF = i;
        LLJJIJIL(i).setSelected(true);
        TextView LLJJIJIIJIL2 = LLJJIJIIJIL(this.LLF);
        Context requireSceneContext2 = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
        LLJJIJIIJIL2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, requireSceneContext2));
        ((TuxTextView) LLJJIJIIJIL2).setTuxFont(62);
        C151465x0 c151465x0 = this.LJLJI;
        if (c151465x0 != null) {
            int i3 = c151465x0.LJLIL;
            c151465x0.LJLIL = i;
            if (z) {
                ValueAnimator valueAnimator = c151465x0.LJLLILLLL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                Rect LIZ = c151465x0.LIZ(i3);
                Rect LIZ2 = c151465x0.LIZ(i);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(342L);
                duration.setInterpolator(new C58U(4.0f));
                duration.addUpdateListener(new AUListenerS78S0300000_2(c151465x0, LIZ, LIZ2, 3));
                duration.start();
                c151465x0.LJLLILLLL = duration;
                C151465x0 c151465x02 = this.LJLJI;
                if (c151465x02 != null) {
                    c151465x02.post(new ARunnableS38S0100000_2(this, 185));
                    return;
                } else {
                    o.LJIJI("previewMaskView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("previewMaskView");
        throw null;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !isVisible()) {
            return false;
        }
        cancel();
        LLJJIII(false);
        return true;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cda, viewGroup, false, "inflater.inflate(layoutRes, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
