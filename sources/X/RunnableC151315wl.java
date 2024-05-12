package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.image.model.EditImageInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageBufferData;
import com.ss.android.ugc.aweme.image.model.ImageFilterInfo;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC151315wl implements Runnable {
    public final SingleImageData LJLIL;
    public final ImageAlbumData LJLILLLLZI;
    public final String LJLJI;
    public final C151385ws LJLJJI;
    public final InterfaceC88472Yns<ImageSynthesisResult, C76800UCe> LJLJJL;
    public final InterfaceC88473Ynt<Integer, Exception, String, C76800UCe> LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public volatile boolean LJLJLLL;
    public volatile boolean LJLL;
    public final ReentrantLock LJLLI;

    public RunnableC151315wl() {
        throw null;
    }

    public final void LIZ() {
        if (this.LJLJJL != null && this.LJLJI != null) {
            if (this.LJLL) {
                return;
            }
            if (this.LJLJLLL) {
                this.LJLLI.lock();
            }
            try {
                if (this.LJLJLLL) {
                    this.LJLLI.lock();
                }
                C76732zl c76732zl = new C76732zl();
                C151225wc LIZLLL = LIZLLL(this.LJLIL);
                OSZ LIZJ = LIZJ(LIZLLL.LIZ);
                int intValue = ((Number) LIZJ.getFirst()).intValue();
                int intValue2 = ((Number) LIZJ.getSecond()).intValue();
                if (this.LJLL) {
                    C151345wo.LIZ(LIZLLL);
                    return;
                }
                c76732zl.element = LJFF(LIZLLL);
                C151345wo.LIZ(LIZLLL);
                if (c76732zl.element == 0) {
                    C151665xK c151665xK = new C151665xK(this, intValue, intValue2);
                    if (!this.LJLL) {
                        C6QQ.LIZ(new AqS152S0100000_2(c151665xK, (InterfaceC65784Pro<C76800UCe>) 665));
                        return;
                    }
                    return;
                }
                AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(this, c76732zl, 68);
                if (!this.LJLL) {
                    C6QQ.LIZ(new AqS152S0100000_2(aqS149S0200000_2, (InterfaceC65784Pro<C76800UCe>) 665));
                    return;
                }
                return;
            } catch (Exception e) {
                AqS149S0200000_2 aqS149S0200000_22 = new AqS149S0200000_2(this, e, 69);
                if (this.LJLL) {
                    return;
                }
                C6QQ.LIZ(new AqS152S0100000_2(aqS149S0200000_22, (InterfaceC65784Pro<C76800UCe>) 665));
                return;
            }
        }
        throw new IllegalArgumentException("image synthesis task targetPath and onSynthesisSuccess must not be null");
    }

    public final Bitmap LIZIZ() {
        Bitmap bitmap;
        C151225wc LIZLLL = LIZLLL(this.LJLIL);
        try {
            bitmap = LIZLLL.LIZ.LJI();
        } catch (Exception e) {
            C60903NvH.LJIIJJI().LJJIIZI().LJIIJJI(e);
            bitmap = null;
        }
        C151345wo.LIZ(LIZLLL);
        return bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static OSZ LIZJ(C151325wm c151325wm) {
        int[] iArr;
        TEImageInterface tEImageInterface = c151325wm.LJII;
        if (tEImageInterface != null) {
            iArr = tEImageInterface.getOutputSize();
        } else {
            iArr = null;
        }
        o.LJI(iArr);
        return new OSZ(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public final C151225wc LIZLLL(SingleImageData singleImageData) {
        C151225wc c151225wc;
        boolean autoEnhanceOn;
        TEImageInterface tEImageInterface;
        String[] LJ;
        float f;
        float f2;
        FilterBean LJIILIIL;
        boolean z;
        int i;
        StickerItemModel next;
        int i2;
        StickerItemModel next2;
        int i3;
        Integer LIZ;
        float f3;
        float f4;
        TEImageInterface tEImageInterface2;
        float f5;
        List<StickerModel> allStickers;
        C151195wZ LJIIIIZZ;
        int i4;
        float f6;
        int i5;
        int i6;
        C151195wZ LJIIIIZZ2;
        float f7;
        AtomicInteger atomicInteger = C151345wo.LIZLLL;
        int i7 = 0;
        if (atomicInteger.get() == -1) {
            atomicInteger.set(0);
        }
        if (atomicInteger.get() >= C151345wo.LJ) {
            C151225wc take = C151345wo.LIZ.take();
            o.LJIIIIZZ(take, "{\n            items.take()\n        }");
            c151225wc = take;
        } else {
            atomicInteger.incrementAndGet();
            C151325wm c151325wm = new C151325wm(0);
            TEImageInterface.nativeEnableOpenGL3(true);
            C151325wm.LJII(c151325wm, C151345wo.LIZJ, C151345wo.LIZIZ, C151365wq.LIZ(c151325wm));
            TEImageInterface tEImageInterface3 = c151325wm.LJII;
            if (tEImageInterface3 != null) {
                tEImageInterface3.enableMmap(true);
            }
            c151225wc = new C151225wc(c151325wm);
        }
        C151325wm c151325wm2 = c151225wc.LIZ;
        int i8 = this.LJLJL;
        int i9 = this.LJLJLJ;
        TEImageInterface tEImageInterface4 = c151325wm2.LJII;
        if (tEImageInterface4 != null) {
            tEImageInterface4.initOffScreenSurface(i8, i9);
        }
        String path = singleImageData.getSrcImageInfo().getPath();
        ImageBufferData bufferData = singleImageData.getBufferData();
        C151535x7.LIZ.getClass();
        int LJI = C151535x7.LJI(path);
        int i10 = 2;
        if (c151225wc.LIZIZ) {
            if (bufferData == null) {
                C151325wm c151325wm3 = c151225wc.LIZ;
                c151325wm3.getClass();
                TEImageInterface tEImageInterface5 = c151325wm3.LJII;
                if (tEImageInterface5 != null) {
                    tEImageInterface5.addNewLayer(path, LJI, true);
                }
                c151325wm3.LIZIZ();
                TEImageInterface tEImageInterface6 = c151325wm3.LJII;
                if (tEImageInterface6 != null) {
                    tEImageInterface6.renderLayerQueue(true);
                }
            } else {
                C151325wm c151325wm4 = c151225wc.LIZ;
                String bufferPath = bufferData.getPath();
                int width = bufferData.getWidth();
                int height = bufferData.getHeight();
                c151325wm4.getClass();
                o.LJIIIZ(bufferPath, "bufferPath");
                TEImageInterface tEImageInterface7 = c151325wm4.LJII;
                if (tEImageInterface7 != null) {
                    tEImageInterface7.addNewLayerWithBuffer(new String[]{bufferPath, path}, width, height, LJI, true);
                }
                c151325wm4.LIZIZ();
                TEImageInterface tEImageInterface8 = c151325wm4.LJII;
                if (tEImageInterface8 != null) {
                    tEImageInterface8.renderLayerQueue(true);
                }
            }
            c151225wc.LIZIZ = false;
        } else if (bufferData == null) {
            C151325wm c151325wm5 = c151225wc.LIZ;
            c151325wm5.getClass();
            TEImageInterface tEImageInterface9 = c151325wm5.LJII;
            if (tEImageInterface9 != null) {
                tEImageInterface9.replaceLayer(path, LJI, true);
            }
            c151325wm5.LIZIZ();
            TEImageInterface tEImageInterface10 = c151325wm5.LJII;
            if (tEImageInterface10 != null) {
                tEImageInterface10.renderLayerQueue(true);
            }
        } else {
            C151325wm c151325wm6 = c151225wc.LIZ;
            String bufferPath2 = bufferData.getPath();
            int width2 = bufferData.getWidth();
            int height2 = bufferData.getHeight();
            c151325wm6.getClass();
            o.LJIIIZ(bufferPath2, "bufferPath");
            TEImageInterface tEImageInterface11 = c151325wm6.LJII;
            if (tEImageInterface11 != null) {
                tEImageInterface11.replaceLayerWithBuffer(new String[]{bufferPath2, path}, width2, height2, LJI, true);
            }
            c151325wm6.LIZIZ();
            TEImageInterface tEImageInterface12 = c151325wm6.LJII;
            if (tEImageInterface12 != null) {
                tEImageInterface12.renderLayerQueue(true);
            }
        }
        Boolean bool = this.LJLJJI.LIZIZ;
        if (bool != null) {
            autoEnhanceOn = bool.booleanValue();
        } else {
            autoEnhanceOn = this.LJLILLLLZI.getAutoEnhanceOn();
        }
        if (!autoEnhanceOn) {
            TEImageInterface tEImageInterface13 = c151225wc.LIZ.LJII;
            if (tEImageInterface13 != null) {
                tEImageInterface13.enableLensHdr(false);
            }
        } else {
            if (!c151225wc.LIZJ && (LJ = C151535x7.LJ()) != null) {
                int[] iArr = new int[0];
                TEImageInterface tEImageInterface14 = c151225wc.LIZ.LJII;
                if (tEImageInterface14 != null) {
                    tEImageInterface14.initLensHdrEngine(LJ, 0, iArr);
                }
                c151225wc.LIZJ = true;
            }
            if (c151225wc.LIZJ && (tEImageInterface = c151225wc.LIZ.LJII) != null) {
                tEImageInterface.enableLensHdr(true);
            }
        }
        C151325wm c151325wm7 = c151225wc.LIZ;
        if (this.LJLIL.getEditImageInfo().getInitializeScaleValue() == null && this.LJLIL.getEditImageInfo().getScaleAfterCrop() == null && (LJIIIIZZ2 = C151325wm.LJIIIIZZ(c151325wm7)) != null) {
            EditImageInfo editImageInfo = this.LJLIL.getEditImageInfo();
            float f8 = LJIIIIZZ2.LJFF;
            float f9 = LJIIIIZZ2.LJI;
            int i11 = this.LJLJL;
            int i12 = this.LJLJLJ;
            float f10 = f8 / f9;
            if (C151105wQ.LIZIZ(f10)) {
                float f11 = i12;
                if (f10 >= i11 / f11) {
                    f7 = f11 / f9;
                    editImageInfo.setInitializeScaleValue(Float.valueOf(f7));
                    this.LJLIL.getEditImageInfo().setRatio(C151535x7.LJFF(this.LJLJL / this.LJLJLJ, LJIIIIZZ2.LJFF / LJIIIIZZ2.LJI));
                }
            }
            f7 = i11 / f8;
            editImageInfo.setInitializeScaleValue(Float.valueOf(f7));
            this.LJLIL.getEditImageInfo().setRatio(C151535x7.LJFF(this.LJLJL / this.LJLJLJ, LJIIIIZZ2.LJFF / LJIIIIZZ2.LJI));
        }
        C151325wm c151325wm8 = c151225wc.LIZ;
        Float scaleAfterCrop = this.LJLIL.getEditImageInfo().getScaleAfterCrop();
        if (scaleAfterCrop != null || (scaleAfterCrop = this.LJLIL.getEditImageInfo().getInitializeScaleValue()) != null) {
            float floatValue = scaleAfterCrop.floatValue();
            C151195wZ LJIIIIZZ3 = C151325wm.LJIIIIZZ(c151325wm8);
            if (LJIIIIZZ3 != null) {
                C151205wa c151205wa = LJIIIIZZ3.LJ;
                float f12 = c151205wa.LIZ;
                float f13 = c151205wa.LIZIZ;
                TEImageInterface tEImageInterface15 = c151325wm8.LJII;
                if (tEImageInterface15 != null) {
                    tEImageInterface15.scale("scale", floatValue, floatValue, f12, f13);
                }
            }
        }
        C151325wm c151325wm9 = c151225wc.LIZ;
        if (this.LJLIL.getEditImageInfo().getOffsetX() != null || this.LJLIL.getEditImageInfo().getOffsetY() != null || !this.LJLIL.getEditImageInfo().isFullScreen()) {
            Float offsetX = this.LJLIL.getEditImageInfo().getOffsetX();
            if (offsetX != null) {
                f = offsetX.floatValue();
            } else {
                f = 0.0f;
            }
            Float offsetY = this.LJLIL.getEditImageInfo().getOffsetY();
            if (offsetY != null) {
                f2 = offsetY.floatValue();
            } else {
                f2 = 0.0f;
            }
            TEImageInterface tEImageInterface16 = c151325wm9.LJII;
            if (tEImageInterface16 != null) {
                tEImageInterface16.translate("translate", f, f2);
            }
        }
        C151325wm c151325wm10 = c151225wc.LIZ;
        ImageFilterInfo filterInfo = singleImageData.getFilterInfo();
        String filterId = filterInfo.getFilterId();
        if (!ujb.o.LJJJJJL(filterId) && (LJIILIIL = TMC.LJIILIIL(C60903NvH.LJIIJJI().LJIILL().LJI().LJJJJIZL(), CastIntegerProtector.parseInt(filterId))) != null) {
            if (this.LJLIL.getFilterInfo().isComposer()) {
                float filterIntensityRatio = filterInfo.getFilterIntensityRatio();
                String filterFolder = LJIILIIL.getFilterFolder();
                o.LJIIIIZZ(filterFolder, "filterBean.filterFolder");
                TEImageInterface tEImageInterface17 = c151325wm10.LJII;
                if (tEImageInterface17 != null) {
                    tEImageInterface17.setComposerSlideFilter("Composer_Slide_Filter", filterFolder, "", 0.0f, filterIntensityRatio);
                }
            } else {
                String filterFolder2 = LJIILIIL.getFilterFolder();
                o.LJIIIIZZ(filterFolder2, "filterBean.filterFolder");
                c151325wm10.LJIIJJI(filterFolder2, "", 0.0f, filterInfo.getFilterIntensityRatio(), 1.0f);
            }
            C151325wm.LIZLLL(c151325wm10);
        }
        C151325wm c151325wm11 = c151225wc.LIZ;
        Iterator<StickerItemModel> it = singleImageData.getStickerInfo().getStickers().iterator();
        int i13 = 0;
        while (true) {
            BitmapFactory.Options options = null;
            if (it.hasNext()) {
                StickerItemModel next3 = it.next();
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    StickerItemModel stickerItemModel = next3;
                    int i15 = stickerItemModel.type;
                    if (i15 == 0 || i15 == 10) {
                        String str = stickerItemModel.path;
                        if (str != null) {
                            c151325wm11.getClass();
                            TEImageInterface tEImageInterface18 = c151325wm11.LJII;
                            if (tEImageInterface18 != null) {
                                i6 = tEImageInterface18.addInfoSticker(str, null, null);
                            } else {
                                i6 = -1;
                            }
                            LJ(c151325wm11, stickerItemModel, i6);
                        }
                    } else if (i15 == 11 && C151325wm.LJIIIIZZ(c151325wm11) != null) {
                        String str2 = stickerItemModel.path;
                        o.LJIIIIZZ(str2, "stickerItemModel.path");
                        Integer LIZ2 = C151325wm.LIZ(c151325wm11, str2, stickerItemModel.x, stickerItemModel.y, stickerItemModel.w, stickerItemModel.h);
                        if (LIZ2 != null && LIZ2.intValue() >= 0) {
                            LJ(c151325wm11, stickerItemModel, LIZ2.intValue());
                        }
                    }
                    i13 = i14;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                C151325wm c151325wm12 = c151225wc.LIZ;
                float ratio = this.LJLIL.getEditImageInfo().getRatio();
                if (ratio == -1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                float f14 = 2.0f;
                if (!z) {
                    TEImageInterface tEImageInterface19 = c151325wm12.LJII;
                    if (tEImageInterface19 != null) {
                        tEImageInterface19.executeConfirmRender();
                    }
                    C151195wZ LJIIIIZZ4 = C151325wm.LJIIIIZZ(c151325wm12);
                    o.LJI(LJIIIIZZ4);
                    C151535x7 c151535x7 = C151535x7.LIZ;
                    float f15 = this.LJLJL;
                    float f16 = f15 / this.LJLJLJ;
                    c151535x7.getClass();
                    if (ratio == f16) {
                        i = 0;
                    } else {
                        i = (int) ((((1.0f / f16) - (1.0f / ratio)) * f15) / 2.0f);
                    }
                    float f17 = this.LJLJLJ - i;
                    C151205wa c151205wa2 = LJIIIIZZ4.LIZ;
                    float f18 = c151205wa2.LIZIZ;
                    if (f17 <= f18) {
                        f18 = f17;
                    }
                    float f19 = i;
                    float f20 = LJIIIIZZ4.LIZIZ.LIZIZ;
                    if (f19 >= f20) {
                        f20 = f19;
                    }
                    if (Math.abs(c151205wa2.LIZ) >= 1.0f || Math.abs(LJIIIIZZ4.LIZLLL.LIZ - this.LJLJL) >= 1.0f || Math.abs(LJIIIIZZ4.LIZ.LIZIZ - f18) >= 1.0f || Math.abs(LJIIIIZZ4.LIZIZ.LIZIZ - f20) >= 1.0f) {
                        float f21 = this.LJLJL;
                        TEImageInterface tEImageInterface20 = c151325wm12.LJII;
                        if (tEImageInterface20 != null) {
                            tEImageInterface20.cutoutImage("scissor", 0.0f, f21, f18, f20);
                        }
                    }
                }
                if (this.LJLJJI.LIZ) {
                    C151325wm c151325wm13 = c151225wc.LIZ;
                    Iterator<StickerItemModel> it2 = this.LJLIL.getStickerInfo().getStickers().iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            int i16 = next.layerWeight;
                            do {
                                StickerItemModel next4 = it2.next();
                                int i17 = next4.layerWeight;
                                if (i16 < i17) {
                                    next = next4;
                                    i16 = i17;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    StickerItemModel stickerItemModel2 = next;
                    if (stickerItemModel2 != null) {
                        i2 = stickerItemModel2.layerWeight;
                    } else {
                        i2 = 0;
                    }
                    for (StickerItemModel stickerItemModel3 : this.LJLIL.getStickerInfo().getStickers()) {
                        if (stickerItemModel3.type == i10) {
                            int i18 = i2 + 1;
                            String str3 = stickerItemModel3.path;
                            if (str3 != null && (LJIIIIZZ = C151325wm.LJIIIIZZ(c151325wm13)) != null) {
                                synchronized (this.LJLIL) {
                                    Bitmap LIZLLL = C44694HgQ.LIZLLL(str3, options);
                                    if (LIZLLL != null) {
                                        if (LIZLLL.getHeight() > LJIIIIZZ.LJI) {
                                            float height3 = LIZLLL.getHeight();
                                            float f22 = LJIIIIZZ.LJI;
                                            i4 = (int) ((height3 - f22) / f14);
                                            int i19 = (int) f22;
                                            if (i4 < 0) {
                                                i19 += i4;
                                                i5 = 0;
                                            } else {
                                                i5 = i4;
                                            }
                                            try {
                                                C42299Git.LJFF(Bitmap.createBitmap(LIZLLL, i7, i5, (int) LJIIIIZZ.LJFF, i19), new File(str3), 100, Bitmap.CompressFormat.PNG);
                                            } catch (Exception e) {
                                                StringBuilder LIZ3 = X1D.LIZ();
                                                LIZ3.append("image layerWidth = ");
                                                LIZ3.append(LJIIIIZZ.LJFF);
                                                LIZ3.append(" image layerHeight = ");
                                                LIZ3.append(LJIIIIZZ.LJI);
                                                LIZ3.append(" bitmapWidth = ");
                                                LIZ3.append(LIZLLL.getWidth());
                                                LIZ3.append(" bitmapHeight = ");
                                                LIZ3.append(LIZLLL.getHeight());
                                                C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
                                                throw e;
                                            }
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i4 < 0) {
                                            f6 = (-i4) / LJIIIIZZ.LJI;
                                        } else {
                                            f6 = 0.0f;
                                        }
                                        Integer LIZ4 = C151325wm.LIZ(c151325wm13, str3, 0.0f, f6, 1.0f, 1.0f);
                                        if (LIZ4 != null) {
                                            c151325wm13.LJIIIZ(LIZ4.intValue(), i18);
                                        }
                                    }
                                }
                            }
                        }
                        i7 = 0;
                        f14 = 2.0f;
                        options = null;
                        i10 = 2;
                    }
                    C151325wm c151325wm14 = c151225wc.LIZ;
                    ArrayList arrayList = new ArrayList();
                    ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData.getStickerInfoNewEngine();
                    if (stickerInfoNewEngine != null && (allStickers = stickerInfoNewEngine.getAllStickers()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (StickerModel stickerModel : allStickers) {
                            if (stickerModel.getBaseSticker().isEmbed()) {
                                arrayList2.add(stickerModel);
                            }
                        }
                        arrayList.addAll(arrayList2);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator<StickerItemModel> it3 = singleImageData.getStickerInfo().getStickers().iterator();
                        if (!it3.hasNext()) {
                            next2 = null;
                        } else {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                int i20 = next2.layerWeight;
                                do {
                                    StickerItemModel next5 = it3.next();
                                    int i21 = next5.layerWeight;
                                    if (i20 < i21) {
                                        next2 = next5;
                                        i20 = i21;
                                    }
                                } while (it3.hasNext());
                            }
                        }
                        StickerItemModel stickerItemModel4 = next2;
                        if (stickerItemModel4 != null) {
                            i3 = stickerItemModel4.layerWeight;
                        } else {
                            i3 = 0;
                        }
                        Iterator it4 = arrayList.iterator();
                        int i22 = 0;
                        while (it4.hasNext()) {
                            Object next6 = it4.next();
                            int i23 = i22 + 1;
                            if (i22 >= 0) {
                                BaseStickerModel baseSticker = ((StickerModel) next6).getBaseSticker();
                                C151195wZ LJIIIIZZ5 = C151325wm.LJIIIIZZ(c151325wm14);
                                if (LJIIIIZZ5 != null && (LIZ = C151325wm.LIZ(c151325wm14, baseSticker.getCompilePath(), 0.0f, 0.0f, baseSticker.getWidth() / LJIIIIZZ5.LJFF, baseSticker.getHeight() / LJIIIIZZ5.LJI)) != null && LIZ.intValue() >= 0) {
                                    int intValue = LIZ.intValue();
                                    int i24 = i22 + i3;
                                    Float scaleAfterCrop2 = this.LJLIL.getEditImageInfo().getScaleAfterCrop();
                                    if (scaleAfterCrop2 != null) {
                                        float floatValue2 = scaleAfterCrop2.floatValue();
                                        Float initializeScaleValue = this.LJLIL.getEditImageInfo().getInitializeScaleValue();
                                        if (initializeScaleValue != null) {
                                            f5 = initializeScaleValue.floatValue();
                                        } else {
                                            f5 = 1.0f;
                                        }
                                        float f23 = 1.0f / (floatValue2 / f5);
                                        c151325wm14.LJIIJ(intValue, f23, f23);
                                    }
                                    if (this.LJLIL.getEditImageInfo().getOffsetX() != null || this.LJLIL.getEditImageInfo().getOffsetY() != null) {
                                        Float offsetX2 = this.LJLIL.getEditImageInfo().getOffsetX();
                                        if (offsetX2 != null) {
                                            f3 = offsetX2.floatValue();
                                        } else {
                                            f3 = 0.0f;
                                        }
                                        float f24 = -f3;
                                        Float offsetY2 = this.LJLIL.getEditImageInfo().getOffsetY();
                                        if (offsetY2 != null) {
                                            f4 = offsetY2.floatValue();
                                        } else {
                                            f4 = 0.0f;
                                        }
                                        c151325wm14.LIZJ(intValue, f24, -f4);
                                        TEImageInterface tEImageInterface21 = c151325wm14.LJII;
                                        if (tEImageInterface21 != null) {
                                            tEImageInterface21.doRenderEffect(false);
                                        }
                                    }
                                    float f25 = -baseSticker.getRotation();
                                    if (intValue >= 0 && (tEImageInterface2 = c151325wm14.LJII) != null) {
                                        tEImageInterface2.setInfoStickerRotation(intValue, f25);
                                    }
                                    c151325wm14.LJIIJ(intValue, baseSticker.getScale(), baseSticker.getScale());
                                    c151325wm14.LIZJ(intValue, (baseSticker.getTranslateX() / baseSticker.getContainerWidth()) * this.LJLJL, (-(baseSticker.getTranslateY() / baseSticker.getContainerHeight())) * this.LJLJLJ);
                                    c151325wm14.LJIIIZ(intValue, i24);
                                }
                                i22 = i23;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                }
                return c151225wc;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (ujb.o.LJJJJ(r1, ".raw", false) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF(X.C151225wc r7) {
        /*
            r6 = this;
            java.lang.String r1 = r6.LJLJI
            r3 = 0
            if (r1 == 0) goto L5a
            java.lang.String r0 = ".raw"
            boolean r1 = ujb.o.LJJJJ(r1, r0, r3)
            r0 = 1
            if (r1 != r0) goto L5a
        Le:
            r5 = -1
            if (r0 == 0) goto L5c
            X.5wm r0 = r7.LIZ
            X.OSZ r1 = LIZJ(r0)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            X.5wm r3 = r7.LIZ
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r4, r2, r1)
            java.lang.String r0 = "createBitmap(width, height, config)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r1 = r6.LJLJI
            r3.getClass()
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            com.ss.android.ttve.nativePort.TEImageInterface r0 = r3.LJII
            if (r0 == 0) goto L59
            int r0 = r0.saveCurrentImageWithRgba(r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L59
            int r5 = r0.intValue()
        L59:
            return r5
        L5a:
            r0 = 0
            goto Le
        L5c:
            X.5wm r0 = r7.LIZ
            java.lang.String r2 = r6.LJLJI
            kotlin.jvm.internal.o.LJI(r2)
            r0.getClass()
            java.lang.System.currentTimeMillis()
            com.ss.android.ttve.nativePort.TEImageInterface r1 = r0.LJII
            if (r1 == 0) goto L73
            r0 = 100
            int r5 = r1.saveCurrentImage(r2, r3, r3, r0)
        L73:
            java.lang.System.currentTimeMillis()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC151315wl.LJFF(X.5wc):int");
    }

    public final void LJ(C151325wm c151325wm, StickerItemModel stickerItemModel, int i) {
        float f;
        TEImageInterface tEImageInterface;
        Float scaleAfterCrop = this.LJLIL.getEditImageInfo().getScaleAfterCrop();
        if (scaleAfterCrop != null) {
            float floatValue = scaleAfterCrop.floatValue();
            Float initializeScaleValue = this.LJLIL.getEditImageInfo().getInitializeScaleValue();
            o.LJI(initializeScaleValue);
            float floatValue2 = 1.0f / (floatValue / initializeScaleValue.floatValue());
            c151325wm.LJIIJ(i, floatValue2, floatValue2);
        }
        if (this.LJLIL.getEditImageInfo().getOffsetX() != null || this.LJLIL.getEditImageInfo().getOffsetY() != null) {
            Float offsetX = this.LJLIL.getEditImageInfo().getOffsetX();
            float f2 = 0.0f;
            if (offsetX != null) {
                f = offsetX.floatValue();
            } else {
                f = 0.0f;
            }
            float f3 = -f;
            Float offsetY = this.LJLIL.getEditImageInfo().getOffsetY();
            if (offsetY != null) {
                f2 = offsetY.floatValue();
            }
            c151325wm.LIZJ(i, f3, -f2);
            TEImageInterface tEImageInterface2 = c151325wm.LJII;
            if (tEImageInterface2 != null) {
                tEImageInterface2.doRenderEffect(false);
            }
        }
        float f4 = -stickerItemModel.rotateAngle;
        if (i >= 0 && (tEImageInterface = c151325wm.LJII) != null) {
            tEImageInterface.setInfoStickerRotation(i, f4);
        }
        float f5 = stickerItemModel.scale;
        c151325wm.LJIIJ(i, f5, f5);
        c151325wm.LIZJ(i, (stickerItemModel.currentOffsetX - 0.5f) * this.LJLJL, (-(stickerItemModel.currentOffsetY - 0.5f)) * this.LJLJLJ);
        c151325wm.LJIIIZ(i, stickerItemModel.layerWeight);
    }

    public RunnableC151315wl(SingleImageData imageItem, ImageAlbumData imageAlbumData, String str, C151385ws synthesisParam, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88473Ynt interfaceC88473Ynt, int i) {
        str = (i & 4) != 0 ? null : str;
        synthesisParam = (i & 8) != 0 ? new C151385ws(3) : synthesisParam;
        interfaceC88472Yns = (i & 16) != 0 ? null : interfaceC88472Yns;
        interfaceC88473Ynt = (i & 32) != 0 ? null : interfaceC88473Ynt;
        o.LJIIIZ(imageItem, "imageItem");
        o.LJIIIZ(imageAlbumData, "imageAlbumData");
        o.LJIIIZ(synthesisParam, "synthesisParam");
        this.LJLIL = imageItem;
        this.LJLILLLLZI = imageAlbumData;
        this.LJLJI = str;
        this.LJLJJI = synthesisParam;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88473Ynt;
        this.LJLJL = imageAlbumData.getSurfaceData().getSurfaceViewWidth();
        this.LJLJLJ = imageAlbumData.getSurfaceData().getSurfaceViewHeight();
        this.LJLLI = new ReentrantLock();
    }
}
