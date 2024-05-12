package X;

import Y.ACListenerS22S0100000_2;
import Y.ACallableS105S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS1S1201000_2;
import Y.ARunnableS38S0100000_2;
import Y.AgS107S0200000_2;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageBufferData;
import com.ss.android.ugc.aweme.image.model.ImageFilterInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5wL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151055wL extends UserVisibleHintGroupScene implements InterfaceC151685xM, InterfaceC151245we, InterfaceC135635Tz, InterfaceC151255wf {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILZL;
    public final SingleImageData LJLIL;
    public final ImageAlbumData LJLILLLLZI;
    public final InterfaceC151165wW LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final CreativeInfo LJLJJL;
    public final C82622Wbi LJLJJLL;
    public ImageView LJLJL;
    public C151285wi LJLJLJ;
    public C151085wO LJLJLLL;
    public FrameLayout LJLL;
    public SurfaceView LJLLI;
    public View LJLLILLLL;
    public final C149085tA LJLLJ;
    public C151225wc LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public final boolean LJZ;
    public final C151155wV LJZI;
    public final C151035wJ LJZL;
    public final C151065wM LL;
    public DialogC254029y2 LLD;
    public C6VC LLF;
    public final C82632Wbs LLFF;
    public final C82632Wbs LLFFF;
    public final C82632Wbs LLFII;
    public final C5H3 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;

    static {
        TBT tbt = new TBT(C151055wL.class, "editItemStickerApi", "getEditItemStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIILZL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C151055wL.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C151055wL.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C151055wL.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC151685xM
    public final void LJJJJL() {
    }

    @Override // X.InterfaceC151685xM
    public final void LJLL() {
    }

    @Override // X.InterfaceC151255wf
    public final void LJLLLLLL() {
        C6QQ.LIZ(new AqS152S0100000_2(this, 84));
    }

    public final void LLJILJIL() {
        if (this.LJLIL.getSrcImageInfo().getWidth() <= 0 || this.LJLIL.getSrcImageInfo().getHeight() <= 0) {
            return;
        }
        LLJLL();
        LLJLILLLLZIIL();
    }

    public final C151085wO LLJJ() {
        C151085wO c151085wO = this.LJLJLLL;
        if (c151085wO != null) {
            return c151085wO;
        }
        o.LJIJI("maskView");
        throw null;
    }

    public final C150845w0 LLJJI() {
        return (C150845w0) this.LLI.getValue();
    }

    public final SurfaceView LLJJIII() {
        SurfaceView surfaceView = this.LJLLI;
        if (surfaceView != null) {
            return surfaceView;
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    public final void LLJJIJI() {
        float f;
        ((InterfaceC151215wb) this.LLFZ.getValue()).LN(this);
        float imageRadio = this.LJLIL.getSrcImageInfo().getImageRadio();
        C151105wQ.LJIIIIZZ = imageRadio;
        if (C151105wQ.LIZIZ(imageRadio)) {
            f = C151105wQ.LIZJ;
        } else {
            f = C151105wQ.LJIIIIZZ;
        }
        C151105wQ.LJIIIZ = f;
    }

    public final void LLJJIJIL() {
        if (this.LJLIL.getFilterInfo().getNeedRender()) {
            C151285wi c151285wi = this.LJLJLJ;
            if (c151285wi != null) {
                if (c151285wi.LIZIZ.getFilterInfo().getNeedRender() && c151285wi.LIZ.getVisibility() == 0) {
                    c151285wi.LIZ(null);
                    return;
                }
                return;
            }
            o.LJIJI("imageViewManager");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (r8.LJLIL.getFilterInfo().getNeedRender() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJJ() {
        /*
            r8 = this;
            X.Ol8 r0 = r8.LLIIII
            java.lang.Object r0 = r0.getValue()
            X.5w5 r0 = (X.InterfaceC150895w5) r0
            if (r0 == 0) goto Ld
            r0.ja()
        Ld:
            X.5wV r0 = r8.LJZI
            java.util.ArrayList<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r1 = r0.LIZ
            X.5wY r0 = X.C151185wY.LJLIL
            X.ORS.LJJLIL(r0, r1)
            X.5wV r7 = r8.LJZI
            X.Ol8 r0 = r8.LLIFFJFJJ
            java.lang.Object r0 = r0.getValue()
            X.5dx r0 = (X.InterfaceC139655dx) r0
            java.util.List r1 = r0.RW()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r6.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
            r2 = 0
        L35:
            boolean r0 = r4.hasNext()
            r5 = 0
            if (r0 == 0) goto L53
            java.lang.Object r0 = r4.next()
            int r1 = r2 + 1
            if (r2 < 0) goto L4f
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = (com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData) r0
            com.ss.android.ugc.aweme.editSticker.model.StickerItemModel r0 = X.C151525x6.LJFF(r0, r2)
            r6.add(r0)
            r2 = r1
            goto L35
        L4f:
            X.C47261Igj.LJJJJJ()
            throw r5
        L53:
            r7.getClass()
            java.util.ArrayList<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r7.LIZ
            r0.addAll(r6)
            X.5wM r0 = r8.LL
            com.ss.android.ugc.aweme.image.model.SingleImageData r4 = r0.LIZIZ
            X.5wV r0 = r0.LIZJ
            r0.getClass()
            com.ss.android.ugc.aweme.image.model.ImageStickerInfo r2 = new com.ss.android.ugc.aweme.image.model.ImageStickerInfo
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r0 = r0.LIZ
            r1.<init>(r0)
            r2.<init>(r1)
            r4.setStickerInfo(r2)
            com.ss.android.ugc.aweme.image.model.SingleImageData r0 = r8.LJLIL
            com.ss.android.ugc.aweme.image.model.EditImageInfo r2 = r0.getEditImageInfo()
            X.5wM r0 = r8.LL
            boolean r0 = r0.LJFF
            if (r0 != 0) goto L87
            X.5wi r0 = r8.LJLJLJ
            if (r0 == 0) goto Lab
            android.graphics.Bitmap r0 = r0.LJFF
            if (r0 == 0) goto L8c
        L87:
            r3 = 1
        L88:
            r2.setNeedCompileLocalImage(r3)
            return
        L8c:
            com.ss.android.ugc.aweme.image.model.ImageAlbumData r0 = r8.LJLILLLLZI
            boolean r1 = r0.getAutoEnhanceOn()
            com.ss.android.ugc.aweme.image.model.SingleImageData r0 = r8.LJLIL
            com.ss.android.ugc.aweme.image.model.EditImageInfo r0 = r0.getEditImageInfo()
            boolean r0 = r0.isLocalImageWithEnhance()
            if (r1 != r0) goto L87
            com.ss.android.ugc.aweme.image.model.SingleImageData r0 = r8.LJLIL
            com.ss.android.ugc.aweme.image.model.ImageFilterInfo r0 = r0.getFilterInfo()
            boolean r0 = r0.getNeedRender()
            if (r0 == 0) goto L88
            goto L87
        Lab:
            java.lang.String r0 = "imageViewManager"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151055wL.LLJJJJ():void");
    }

    public final void LLJLIL() {
        if (!this.LLIIIL) {
            C151225wc c151225wc = this.LJLLL;
            if (c151225wc != null && !c151225wc.LIZIZ) {
                C10K.LIZJ(new ACallableS105S0100000_2(this, 8));
            } else {
                LLJJJIL(true);
            }
            this.LLIIIL = true;
        }
    }

    public final void LLJLL() {
        if (this.LJLIL.getEditImageInfo().getRatio() <= 0.0f) {
            C151535x7 c151535x7 = C151535x7.LIZ;
            int width = this.LJLIL.getSrcImageInfo().getWidth();
            int height = this.LJLIL.getSrcImageInfo().getHeight();
            int LIZ = C151105wQ.LIZ();
            int LIZ2 = C151105wQ.LIZ();
            c151535x7.getClass();
            if (height > LIZ2 || width > LIZ) {
                if (height - LIZ2 > width - LIZ) {
                    width = (int) ((width / height) * LIZ2);
                    height = LIZ2;
                } else {
                    height = (int) (LIZ / (width / height));
                    width = LIZ;
                }
            }
            OSZ osz = new OSZ(Integer.valueOf(width), Integer.valueOf(height));
            this.LJLIL.getSrcImageInfo().setWidth(((Number) osz.getFirst()).intValue());
            this.LJLIL.getSrcImageInfo().setHeight(((Number) osz.getSecond()).intValue());
            this.LJLIL.getEditImageInfo().setRatio(C151535x7.LJFF(this.LJLLLL / this.LJLLLLLL, this.LJLIL.getSrcImageInfo().getImageRadio()));
            if (C151105wQ.LIZIZ(this.LJLIL.getSrcImageInfo().getImageRadio())) {
                this.LJLIL.getEditImageInfo().setFullScreen(true);
            }
        }
        this.LJLIL.getEditImageInfo().isFullScreen();
    }

    @Override // X.InterfaceC151245we
    public final void onLayerAdded() {
        C6QQ.LIZ(new AqS152S0100000_2(this, 83));
    }

    public final void LLJJJ() {
        InterfaceC150615vd interfaceC150615vd;
        MutableLiveData<Boolean> ul;
        FilterBean LJIILIIL;
        C66Y LLJJJJ;
        C1548165t c1548165t;
        C66Y LLJJJJ2;
        C1548265u c1548265u;
        C151325wm c151325wm;
        C151195wZ LJIIIIZZ;
        float f;
        float f2;
        TEImageInterface tEImageInterface;
        if (getSceneContext() == null) {
            return;
        }
        if (C1539462k.LIZ()) {
            C151535x7.LIZ.getClass();
            String[] LJ = C151535x7.LJ();
            if (LJ != null) {
                C151225wc c151225wc = this.LJLLL;
                if (c151225wc != null && !c151225wc.LIZJ) {
                    C151325wm c151325wm2 = c151225wc.LIZ;
                    if (c151325wm2 != null) {
                        int[] iArr = new int[0];
                        TEImageInterface tEImageInterface2 = c151325wm2.LJII;
                        if (tEImageInterface2 != null) {
                            tEImageInterface2.initLensHdrEngine(LJ, 0, iArr);
                        }
                    }
                    C151225wc c151225wc2 = this.LJLLL;
                    if (c151225wc2 != null) {
                        c151225wc2.LIZJ = true;
                    }
                }
                C151065wM c151065wM = this.LL;
                boolean autoEnhanceOn = ((ImageAlbumData) this.LJLJJLL.LJ(ImageAlbumData.class, null)).getAutoEnhanceOn();
                C151325wm LIZIZ = c151065wM.LIZ.LIZIZ();
                if (LIZIZ != null && (tEImageInterface = LIZIZ.LJII) != null) {
                    tEImageInterface.enableLensHdr(autoEnhanceOn);
                }
            }
        }
        C151225wc c151225wc3 = this.LJLLL;
        if (c151225wc3 != null && (c151325wm = c151225wc3.LIZ) != null && (LJIIIIZZ = C151325wm.LJIIIIZZ(c151325wm)) != null) {
            Float scaleAfterCrop = this.LJLIL.getEditImageInfo().getScaleAfterCrop();
            if (scaleAfterCrop != null || (scaleAfterCrop = this.LJLIL.getEditImageInfo().getInitializeScaleValue()) != null) {
                f = scaleAfterCrop.floatValue();
            } else {
                C151535x7 c151535x7 = C151535x7.LIZ;
                float f3 = LJIIIIZZ.LJFF;
                float f4 = LJIIIIZZ.LJI;
                int i = this.LJLLLL;
                int i2 = this.LJLLLLLL;
                c151535x7.getClass();
                float f5 = f3 / f4;
                if (C151105wQ.LIZIZ(f5)) {
                    float f6 = i2;
                    if (f5 >= i / f6) {
                        f = f6 / f4;
                    }
                }
                f = i / f3;
            }
            SrcImageInfo srcImageInfo = this.LJLIL.getSrcImageInfo();
            srcImageInfo.setWidth((int) LJIIIIZZ.LJFF);
            srcImageInfo.setHeight((int) LJIIIIZZ.LJI);
            if (this.LJLIL.getEditImageInfo().getInitializeScaleValue() == null) {
                this.LJLIL.getEditImageInfo().setInitializeScaleValue(Float.valueOf(f));
            }
            C151065wM c151065wM2 = this.LL;
            C151205wa c151205wa = LJIIIIZZ.LJ;
            c151065wM2.LJII(f, c151205wa.LIZ, c151205wa.LIZIZ, false);
            LLJLL();
            if (!this.LJLIL.getEditImageInfo().isFullScreen() || this.LJLIL.getEditImageInfo().getOffsetX() != null || this.LJLIL.getEditImageInfo().getOffsetY() != null) {
                C151065wM c151065wM3 = this.LL;
                Float offsetX = this.LJLIL.getEditImageInfo().getOffsetX();
                float f7 = 0.0f;
                if (offsetX != null) {
                    f2 = offsetX.floatValue();
                } else {
                    f2 = 0.0f;
                }
                Float offsetY = this.LJLIL.getEditImageInfo().getOffsetY();
                if (offsetY != null) {
                    f7 = offsetY.floatValue();
                }
                c151065wM3.LJIIIIZZ(f2, f7, false);
            }
            LLJILJIL();
        }
        Activity activity = this.mActivity;
        if (activity != null && !activity.isFinishing() && !C42000Ge4.LJIIL((VideoPublishEditModel) this.LJLJJLL.LJ(VideoPublishEditModel.class, null))) {
            if (this.LLIIIZ) {
                LLJJLIIIJLLLLLLLZ(false);
                C82632Wbs c82632Wbs = this.LLFII;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIILZL;
                InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) c82632Wbs.LIZ(this, interfaceC74236TBoArr[3]);
                boolean z = !((InterfaceC143655kP) this.LLFII.LIZ(this, interfaceC74236TBoArr[3])).qF();
                interfaceC143655kP.U2(z, false, z);
            } else {
                this.LLIIIZ = true;
                LLJJI().LLLII();
                WMH wmh = (WMH) findSceneByTag("EditStickerScene");
                if (wmh != null && (c1548165t = (C1548165t) wmh.findSceneByTag("EditInfoStickerScene")) != null && (LLJJJJ2 = c1548165t.LLJJJJ()) != null && (c1548265u = LLJJJJ2.LJLJI) != null) {
                    c1548265u.LJLJI = this.LJLLLL;
                    c1548265u.LJLJJI = this.LJLLLLLL;
                    c1548265u.LJLIL = 0;
                    c1548265u.LJLILLLLZI = 0;
                    C153065za c153065za = c1548265u.LJLJLJ;
                    if (c153065za != null) {
                        c153065za.LJFF.LJLILLLLZI = this.LL;
                    }
                }
                C1548165t c1548165t2 = (C1548165t) this.LLII.getValue();
                if (c1548165t2 != null && (LLJJJJ = c1548165t2.LLJJJJ()) != null) {
                    C1548265u c1548265u2 = LLJJJJ.LJLJI;
                    if (c1548265u2 != null) {
                        c1548265u2.setStickerHintEnable(false);
                    }
                    LLJJJJ.LLIIJI = 0;
                    C1548265u c1548265u3 = LLJJJJ.LJLJI;
                    if (c1548265u3 != null) {
                        c1548265u3.LLIIJLIL = 0;
                        C153065za c153065za2 = c1548265u3.LJLJLJ;
                        if (c153065za2 != null) {
                            c153065za2.LJIIL = 0;
                        }
                    }
                }
                C1548165t c1548165t3 = (C1548165t) this.LLII.getValue();
                if (c1548165t3 != null) {
                    c1548165t3.LLJJLIIIJLLLLLLLZ((InfoStickerModel) this.LJZI.LIZIZ.getValue());
                }
                C82632Wbs c82632Wbs2 = this.LLFII;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr2 = LLIILZL;
                InterfaceC143655kP interfaceC143655kP2 = (InterfaceC143655kP) c82632Wbs2.LIZ(this, interfaceC74236TBoArr2[3]);
                boolean z2 = !((InterfaceC143655kP) this.LLFII.LIZ(this, interfaceC74236TBoArr2[3])).qF();
                interfaceC143655kP2.U2(z2, false, z2);
            }
        }
        if (this.LJLIL.getFilterInfo().getFilterId().length() > 0) {
            ImageFilterInfo filterInfo = this.LJLIL.getFilterInfo();
            o.LJIIIZ(filterInfo, "<this>");
            if (C78685UuP.LJJJZ(filterInfo.getFilterId()) && (LJIILIIL = TMC.LJIILIIL(C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL(), CastIntegerProtector.parseInt(filterInfo.getFilterId()))) != null) {
                LLJILJILJ(false, LJIILIIL);
            } else {
                C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL().LIZJ().observe(this, new AObserverS70S0100000_2(this, 32));
            }
        } else {
            LLJJL(null);
        }
        C151325wm LIZIZ2 = this.LL.LIZ.LIZIZ();
        if (LIZIZ2 != null) {
            TEImageInterface tEImageInterface3 = LIZIZ2.LJII;
            if (tEImageInterface3 != null) {
                tEImageInterface3.doRenderEffect(false);
            }
            LIZIZ2.LJ(null, false);
        }
        C151285wi c151285wi = this.LJLJLJ;
        if (c151285wi != null) {
            c151285wi.LIZ.setVisibility(8);
            DialogC254029y2 dialogC254029y2 = this.LLD;
            if (dialogC254029y2 != null && dialogC254029y2.isShowing()) {
                DialogC254029y2 dialogC254029y22 = this.LLD;
                if (dialogC254029y22 != null) {
                    dialogC254029y22.dismiss();
                }
                C42303Gix.LIZ(1106, GGO.DISMISS, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_GONE, null);
            }
            C151065wM c151065wM4 = this.LL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c151065wM4.LJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            c151065wM4.LJI = null;
            c151065wM4.LJII = true;
            if (this.LLIIIJ != 0 || (interfaceC150615vd = (InterfaceC150615vd) this.LJLJJLL.LJIIIIZZ(null, InterfaceC150615vd.class)) == null || (ul = interfaceC150615vd.ul()) == null) {
                return;
            }
            ul.setValue(Boolean.TRUE);
            return;
        }
        o.LJIJI("imageViewManager");
        throw null;
    }

    public final void LLJLILLLLZIIL() {
        int i;
        LLJJ().LJLIL = -1;
        float ratio = this.LJLIL.getEditImageInfo().getRatio();
        C151535x7 c151535x7 = C151535x7.LIZ;
        float f = this.LJLLLL;
        float f2 = f / this.LJLLLLLL;
        c151535x7.getClass();
        if (ratio == f2) {
            i = 0;
        } else {
            i = (int) ((((1.0f / f2) - (1.0f / ratio)) * f) / 2.0f);
        }
        LLJJ().setEditRect(new Rect(0, i, this.LJLLLL, this.LJLLLLLL - i));
        if (LLJJ().getVisibility() == 8) {
            LLJJ().setVisibility(0);
        } else {
            LLJJ().invalidate();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        Activity activity;
        super.onDestroyView();
        InterfaceC150885w4 interfaceC150885w4 = (InterfaceC150885w4) this.LLIIIILZ.getValue();
        if (interfaceC150885w4 != null) {
            interfaceC150885w4.Bj(this.LLIIIJ);
        }
        boolean z = false;
        if (!this.LLIIJLIL && (activity = this.mActivity) != null && !activity.isFinishing()) {
            z = true;
        }
        C151285wi c151285wi = this.LJLJLJ;
        if (c151285wi != null) {
            c151285wi.LIZIZ(z);
            ViewParent parent = LLJJIII().getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(LLJJIII(), (ViewGroup) parent);
            return;
        }
        o.LJIJI("imageViewManager");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        C151225wc c151225wc;
        C151325wm c151325wm;
        super.onResume();
        if (this.LLIIJI && (c151225wc = this.LJLLL) != null && (c151325wm = c151225wc.LIZ) != null) {
            c151325wm.LJ(null, false);
        }
        this.LLIIJI = true;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJLL;
    }

    public final void LLJJIJIIJIL(boolean z) {
        C151285wi c151285wi = this.LJLJLJ;
        if (c151285wi != null) {
            if (z != c151285wi.LIZJ() && c151285wi.LIZ.getVisibility() == 0) {
                c151285wi.LIZ(Boolean.valueOf(z));
                return;
            }
            return;
        }
        o.LJIJI("imageViewManager");
        throw null;
    }

    public final void LLJJJIL(final boolean z) {
        C151225wc c151225wc = this.LJLLL;
        if (c151225wc != null) {
            final String originPath = this.LJLIL.getSrcImageInfo().getPath();
            ImageBufferData bufferData = this.LJLIL.getBufferData();
            C151535x7 c151535x7 = C151535x7.LIZ;
            String path = this.LJLIL.getSrcImageInfo().getPath();
            c151535x7.getClass();
            final int LJI = C151535x7.LJI(path);
            o.LJIIIZ(originPath, "originPath");
            if (c151225wc.LIZIZ) {
                if (bufferData != null) {
                    final C151325wm c151325wm = c151225wc.LIZ;
                    String bufferPath = bufferData.getPath();
                    final int width = bufferData.getWidth();
                    final int height = bufferData.getHeight();
                    c151325wm.getClass();
                    o.LJIIIZ(bufferPath, "bufferPath");
                    final String[] strArr = {bufferPath, originPath};
                    if (c151325wm.LIZIZ.LJLJJI != EnumC151405wu.Changed) {
                        ((ArrayList) c151325wm.LJI).add(new Runnable() { // from class: X.5wS
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ;
                                try {
                                    TEImageInterface tEImageInterface = C151325wm.this.LJII;
                                    if (tEImageInterface != null) {
                                        tEImageInterface.addNewLayerWithBuffer(strArr, width, height, LJI, false);
                                    }
                                    this.onLayerAdded();
                                    C151325wm.this.LIZIZ();
                                    C151325wm.this.LJ(null, false);
                                } finally {
                                    if (LIZ) {
                                    }
                                }
                            }
                        });
                    } else {
                        TEImageInterface tEImageInterface = c151325wm.LJII;
                        if (tEImageInterface != null) {
                            tEImageInterface.addNewLayerWithBuffer(strArr, width, height, LJI, false);
                        }
                        onLayerAdded();
                        c151325wm.LIZIZ();
                        c151325wm.LJ(null, false);
                    }
                } else {
                    C151325wm c151325wm2 = c151225wc.LIZ;
                    c151325wm2.getClass();
                    if (c151325wm2.LIZIZ.LJLJJI != EnumC151405wu.Changed) {
                        ((ArrayList) c151325wm2.LJI).add(new ARunnableS1S1201000_2(c151325wm2, this, LJI, originPath, 0));
                    } else {
                        TEImageInterface tEImageInterface2 = c151325wm2.LJII;
                        if (tEImageInterface2 != null) {
                            tEImageInterface2.addNewLayer(originPath, LJI, false);
                        }
                        onLayerAdded();
                        c151325wm2.LIZIZ();
                        c151325wm2.LJ(null, false);
                    }
                }
                c151225wc.LIZIZ = false;
                return;
            }
            if (bufferData != null) {
                final C151325wm c151325wm3 = c151225wc.LIZ;
                String bufferPath2 = bufferData.getPath();
                final int width2 = bufferData.getWidth();
                final int height2 = bufferData.getHeight();
                c151325wm3.getClass();
                o.LJIIIZ(bufferPath2, "bufferPath");
                final String[] strArr2 = {bufferPath2, originPath};
                if (c151325wm3.LIZIZ.LJLJJI != EnumC151405wu.Changed) {
                    ((ArrayList) c151325wm3.LJI).add(new Runnable() { // from class: X.5wT
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                TEImageInterface tEImageInterface3 = C151325wm.this.LJII;
                                if (tEImageInterface3 != null) {
                                    tEImageInterface3.replaceLayerWithBuffer(strArr2, width2, height2, LJI, false);
                                }
                                this.LJLLLLLL();
                                C151325wm.this.LIZIZ();
                                if (!z) {
                                    return;
                                }
                                C151325wm.this.LJ(null, false);
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    });
                    return;
                }
                TEImageInterface tEImageInterface3 = c151325wm3.LJII;
                if (tEImageInterface3 != null) {
                    tEImageInterface3.replaceLayerWithBuffer(strArr2, width2, height2, LJI, false);
                }
                LJLLLLLL();
                c151325wm3.LIZIZ();
                if (!z) {
                    return;
                }
                c151325wm3.LJ(null, false);
                return;
            }
            final C151325wm c151325wm4 = c151225wc.LIZ;
            c151325wm4.getClass();
            if (c151325wm4.LIZIZ.LJLJJI != EnumC151405wu.Changed) {
                ((ArrayList) c151325wm4.LJI).add(new Runnable() { // from class: X.5wU
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            TEImageInterface tEImageInterface4 = C151325wm.this.LJII;
                            if (tEImageInterface4 != null) {
                                tEImageInterface4.replaceLayer(originPath, LJI, false);
                            }
                            this.LJLLLLLL();
                            C151325wm.this.LIZIZ();
                            if (!z) {
                                return;
                            }
                            C151325wm.this.LJ(null, false);
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                return;
            }
            TEImageInterface tEImageInterface4 = c151325wm4.LJII;
            if (tEImageInterface4 != null) {
                tEImageInterface4.replaceLayer(originPath, LJI, false);
            }
            LJLLLLLL();
            c151325wm4.LIZIZ();
            if (!z) {
                return;
            }
            c151325wm4.LJ(null, false);
        }
    }

    public final void LLJJL(FilterBean filterBean) {
        if (this.mUserVisibleHint) {
            C82632Wbs c82632Wbs = this.LLFII;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIILZL;
            if (((InterfaceC143655kP) c82632Wbs.LIZ(this, interfaceC74236TBoArr[3])).qF()) {
                ((InterfaceC146235oZ) this.LLFF.LIZ(this, interfaceC74236TBoArr[1])).Au0(filterBean, false, true, this.mActivity);
            }
        }
    }

    public final void LLJJLIIIJLLLLLLLZ(boolean z) {
        C151325wm LIZIZ;
        C1548165t c1548165t = (C1548165t) this.LLII.getValue();
        if (c1548165t != null) {
            c1548165t.LLJJ(false);
        }
        C1548165t c1548165t2 = (C1548165t) this.LLII.getValue();
        if (c1548165t2 != null) {
            c1548165t2.LLJJLIIIJLLLLLLLZ((InfoStickerModel) this.LJZI.LIZIZ.getValue());
        }
        if (z && (LIZIZ = this.LL.LIZ.LIZIZ()) != null) {
            TEImageInterface tEImageInterface = LIZIZ.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.doRenderEffect(false);
            }
            LIZIZ.LJ(null, false);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.f6l);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.iv_local)");
        ImageView imageView = (ImageView) requireViewById;
        this.LJLJL = imageView;
        C16880lQ.LJIILLIIL(imageView, new ACListenerS22S0100000_2(this, 24));
        View requireViewById2 = requireViewById(R.id.cp2);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.edit_mask_view)");
        this.LJLJLLL = (C151085wO) requireViewById2;
        View requireViewById3 = requireViewById(R.id.kur);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.surface_view_container)");
        this.LJLL = (FrameLayout) requireViewById3;
        View requireViewById4 = requireViewById(R.id.kuj);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.surfaceView)");
        this.LJLLI = (SurfaceView) requireViewById4;
        View requireViewById5 = requireViewById(R.id.ehd);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.image_item_root)");
        this.LJLLILLLL = requireViewById5;
        ImageView imageView2 = this.LJLJL;
        if (imageView2 != null) {
            this.LJLJLJ = new C151285wi(imageView2, this.LJLIL, this.LJLILLLLZI, this.LLIIIJ, this.LJLJJL);
            if (((VideoPublishEditModel) this.LLFFF.LIZ(this, LLIILZL[2])).isFromRestoreRecover && this.LJLIL.getFilterInfo().getFilterId().length() > 0) {
                this.LLIILII = true;
            }
            int i = C151105wQ.LIZ;
            if (i > 0) {
                this.LJLLLLLL = i;
                this.LJLLLL = C151105wQ.LIZIZ;
                LLJILJIL();
            } else {
                View view = this.LJLLILLLL;
                if (view != null) {
                    view.post(new ARunnableS38S0100000_2(this, 33));
                } else {
                    o.LJIJI("rootView");
                    throw null;
                }
            }
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            this.LLF = C78897Uxp.LJIILIIL(requireSceneContext, (ViewGroup) requireViewById(R.id.cor));
            C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 70));
            C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 71));
            C44384HbQ.LJJJI(this);
            C60903NvH.LJIIJJI().LJIJJLI();
            C6VC c6vc = this.LLF;
            if (c6vc != null) {
                c6vc.LIZIZ(new C6V4(0, (C6V2) this.LJLJJLL.LJ(C152155y7.class, null)));
                InterfaceC150885w4 interfaceC150885w4 = (InterfaceC150885w4) this.LLIIIILZ.getValue();
                if (interfaceC150885w4 != null) {
                    int i2 = this.LLIIIJ;
                    C6VC c6vc2 = this.LLF;
                    if (c6vc2 != null) {
                        interfaceC150885w4.pt(i2, c6vc2);
                    } else {
                        o.LJIJI("gestureService");
                        throw null;
                    }
                }
                if (this.LJZ) {
                    if (this.mUserVisibleHint) {
                        this.LJLJI.LIZIZ(new C151075wN(this));
                        LLJJIJI();
                    } else {
                        C151285wi c151285wi = this.LJLJLJ;
                        if (c151285wi != null) {
                            c151285wi.LJ();
                        } else {
                            o.LJIJI("imageViewManager");
                            throw null;
                        }
                    }
                } else {
                    this.LJLJI.LIZIZ(new C151075wN(this));
                }
                this.LJZL.LIZIZ = new AqS152S0100000_2(this, 86);
                C151155wV c151155wV = this.LJZI;
                List<StickerItemModel> addedStickers = this.LJLIL.getStickerInfo().getStickers();
                c151155wV.getClass();
                o.LJIIIZ(addedStickers, "addedStickers");
                c151155wV.LIZ.addAll(addedStickers);
                SceneExtensionsKt.LIZIZ(this, new ARunnableS38S0100000_2(this, 32));
                this.LJLZ = true;
                return;
            }
            o.LJIJI("gestureService");
            throw null;
        }
        o.LJIJI("localImageView");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.LJLZ && this.LJZ) {
            if (z) {
                LLJJIJI();
                this.LJLJI.LIZIZ(new C151075wN(this));
                return;
            }
            AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 87);
            if (!this.LL.LJFF) {
                boolean autoEnhanceOn = this.LJLILLLLZI.getAutoEnhanceOn();
                C151285wi c151285wi = this.LJLJLJ;
                if (c151285wi != null) {
                    if (autoEnhanceOn == c151285wi.LIZJ()) {
                        aqS152S0100000_2.invoke();
                        return;
                    }
                } else {
                    o.LJIJI("imageViewManager");
                    throw null;
                }
            }
            C10K.LIZJ(new ACallableS105S0100000_2(this, 9)).LJIILLIIL(new AgS107S0200000_2(this, aqS152S0100000_2, 1), C10K.LJIIIIZZ);
        }
    }

    public final void LLJILJILJ(boolean z, FilterBean filterBean) {
        filterBean.setCompareKey(this.LJLIL.getFilterInfo().getCompareKey());
        if (this.LJLIL.getFilterInfo().isComposer()) {
            this.LL.LIZ(this.LJLIL.getFilterInfo().getFilterIntensityRatio(), filterBean, z);
        } else {
            this.LL.LIZIZ(this.LJLIL.getFilterInfo().getFilterIntensityRatio(), filterBean, z);
        }
        LLJJL(filterBean);
        if (this.LLIILII) {
            this.LL.LJFF = true;
            this.LLIILII = false;
        }
    }

    @Override // X.InterfaceC151685xM
    public final void onSurfaceChanged(int i, int i2) {
        float f;
        String path;
        String str;
        Bitmap bitmap;
        String str2;
        Bitmap bitmap2;
        OSJ<String, String, ? extends WeakReference<Bitmap>> osj;
        WeakReference<Bitmap> third;
        WeakReference<Bitmap> third2;
        this.LJLLLL = i;
        this.LJLLLLLL = i2;
        C151105wQ.LIZ = i2;
        C151105wQ.LIZIZ = i;
        C151105wQ.LIZJ = i / i2;
        if (C151105wQ.LIZIZ(C151105wQ.LJIIIIZZ)) {
            f = C151105wQ.LIZJ;
        } else {
            f = C151105wQ.LJIIIIZZ;
        }
        C151105wQ.LJIIIZ = f;
        this.LL.getClass();
        boolean z = true;
        if (!C151435wx.LIZIZ().getEnableFirstImageDecode() || this.LLIIIJ != 0 || !this.LLIIL || (path = this.LJLIL.getSrcImageInfo().getPath()) == null || ujb.o.LJJJJJL(path) || this.LJLIL.getEditImageInfo().getTempSynthesisPath() != null) {
            LLJLIL();
            return;
        }
        this.LLIIL = false;
        String newPath = this.LJLIL.getSrcImageInfo().getPath();
        o.LJIIIZ(newPath, "newPath");
        StringBuilder LIZIZ = C25620zW.LIZIZ("getFirstImageBitmap: newPath:", newPath, ", second:");
        OSJ<String, String, ? extends WeakReference<Bitmap>> osj2 = C151425ww.LIZIZ;
        if (osj2 != null) {
            str = osj2.getSecond();
        } else {
            str = null;
        }
        LIZIZ.append(str);
        LIZIZ.append(", ");
        OSJ<String, String, ? extends WeakReference<Bitmap>> osj3 = C151425ww.LIZIZ;
        if (osj3 != null && (third2 = osj3.getThird()) != null) {
            bitmap = third2.get();
        } else {
            bitmap = null;
        }
        LIZIZ.append(bitmap);
        X1D.LIZIZ(LIZIZ);
        OSJ<String, String, ? extends WeakReference<Bitmap>> osj4 = C151425ww.LIZIZ;
        if (osj4 != null) {
            str2 = osj4.getSecond();
        } else {
            str2 = null;
        }
        if (o.LJ(newPath, str2) && (osj = C151425ww.LIZIZ) != null && (third = osj.getThird()) != null) {
            bitmap2 = third.get();
        } else {
            bitmap2 = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("optShowFirstFrame-get bitmap success: ");
        if (bitmap2 == null) {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (bitmap2 != null) {
            C151285wi c151285wi = this.LJLJLJ;
            if (c151285wi != null) {
                c151285wi.LIZLLL(bitmap2);
                SceneExtensionsKt.LIZIZ(this, new ARunnableS38S0100000_2(this, 34));
                return;
            } else {
                o.LJIJI("imageViewManager");
                throw null;
            }
        }
        LLJLIL();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdb, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C151055wL(SingleImageData imageData, ImageAlbumData imageModeData, InterfaceC151165wW veImageManager, InterfaceC65784Pro<C76800UCe> onImageClickListener, CreativeInfo creativeInfo, C82622Wbi diContainer) {
        o.LJIIIZ(imageData, "imageData");
        o.LJIIIZ(imageModeData, "imageModeData");
        o.LJIIIZ(veImageManager, "veImageManager");
        o.LJIIIZ(onImageClickListener, "onImageClickListener");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = imageData;
        this.LJLILLLLZI = imageModeData;
        this.LJLJI = veImageManager;
        this.LJLJJI = onImageClickListener;
        this.LJLJJL = creativeInfo;
        this.LJLJJLL = diContainer;
        this.LJLLJ = new C149085tA(this);
        this.LJZ = true;
        C151155wV c151155wV = new C151155wV();
        this.LJZI = c151155wV;
        C151035wJ c151035wJ = new C151035wJ(new AqS152S0100000_2(this, 81));
        this.LJZL = c151035wJ;
        this.LL = new C151065wM(c151035wJ, imageData, c151155wV);
        this.LLFF = UCI.LJI(diContainer, InterfaceC146235oZ.class, null);
        this.LLFFF = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LLFII = UCI.LJI(diContainer, InterfaceC150615vd.class, null);
        this.LLFZ = C269113v.LIZ(this, InterfaceC151215wb.class);
        this.LLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 85));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 79));
        this.LLII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 82));
        this.LLIIII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 78));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 80));
        this.LLIIIJ = -1;
        this.LLIIL = true;
    }
}
