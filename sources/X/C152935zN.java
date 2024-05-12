package X;

import Y.ACallableS105S0100000_2;
import Y.ARunnableS0S0500000_2;
import android.util.Size;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS53S0201000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5zN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152935zN {
    public static final LinkedBlockingQueue<Runnable> LJ = new LinkedBlockingQueue<>();
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C38006Evq.LJLIL);
    public final VideoPublishEditModel LIZ;
    public C76940UHo LIZIZ;
    public InterfaceC153045zY LIZJ;
    public final List<RunnableC151315wl> LIZLLL;

    public final void LIZ() {
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            RunnableC151315wl runnableC151315wl = (RunnableC151315wl) it.next();
            if (!runnableC151315wl.LJLL) {
                runnableC151315wl.LJLL = true;
            }
        }
        LJ.clear();
        LIZIZ();
    }

    public final void LIZIZ() {
        C76940UHo c76940UHo = this.LIZIZ;
        if (c76940UHo != null) {
            c76940UHo.LIZ();
        }
        this.LIZIZ = null;
        InterfaceC153045zY interfaceC153045zY = this.LIZJ;
        if (interfaceC153045zY != null) {
            C10K.LIZJ(new ACallableS105S0100000_2(interfaceC153045zY, 20));
        }
    }

    public final boolean LIZLLL() {
        Iterator<SingleImageData> it = this.LIZ.getImageAlbumData().getImageList().iterator();
        while (it.hasNext()) {
            if (it.next().getSynthesisData() == null) {
                return true;
            }
        }
        return false;
    }

    public C152935zN(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LIZ = model;
        if (H7R.LJJJJL(model)) {
            int maxImageHeight = model.getImageAlbumData().getMaxImageHeight();
            int maxImageWidth = model.getImageAlbumData().getMaxImageWidth();
            C151345wo.LIZIZ = maxImageHeight;
            C151345wo.LIZJ = maxImageWidth;
        }
        C6YM.LIZ();
        C69B.LIZ();
        this.LIZLLL = new ArrayList();
    }

    public final String LIZJ(int i, String str, boolean z) {
        String str2;
        VideoPublishEditModel editModel = this.LIZ;
        o.LJIIIZ(editModel, "editModel");
        String path = V16.LJIIJJI(editModel, EnumC43650HBe.SYNTHESISE, "image_mode_synthesis").getPath();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C173376rF.LJI(str));
        LIZ.append('_');
        LIZ.append(System.currentTimeMillis());
        LIZ.append('_');
        LIZ.append(i);
        if (!z ? ((Boolean) GSE.LIZ.getValue()).booleanValue() : ((Boolean) C153005zU.LIZ.getValue()).booleanValue()) {
            str2 = ".webp";
        } else {
            str2 = ".jpeg";
        }
        LIZ.append(str2);
        String path2 = new File(path, X1D.LIZIZ(LIZ)).getPath();
        o.LJIIIIZZ(path2, "File(\n            synthe…ngleImage)\n        ).path");
        return path2;
    }

    public final void LJ(VideoPublishEditModel model, InterfaceC88471Ynr<? super ImageSynthesisResult, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88473Ynt<? super Integer, ? super Exception, ? super String, C76800UCe> interfaceC88473Ynt, InterfaceC88472Yns<? super List<ImageSynthesisResult>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(model, "model");
        if (H7R.LJJIJLIJ(model)) {
            if (C5OG.LIZ()) {
                ((ExecutorService) LJFF.getValue()).submit(new ARunnableS0S0500000_2(this, model, interfaceC88471Ynr, interfaceC88473Ynt, interfaceC88472Yns, 1));
                return;
            } else {
                LJI(model, interfaceC88471Ynr, interfaceC88473Ynt, interfaceC88472Yns);
                return;
            }
        }
        InterfaceC152975zR LJJIIJZLJL = C60903NvH.LJIIJJI().LJJIIJZLJL();
        InterfaceC43072GvM LJ2 = C62850Ola.LJ();
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        LJJIIJZLJL.LIZIZ(LJ2.LIZLLL(creativeInfo));
        C76732zl c76732zl = new C76732zl();
        List<SingleImageData> imageList = model.getImageAlbumData().getImageList();
        C152945zO c152945zO = new C152945zO(c76732zl, interfaceC88471Ynr, imageList, interfaceC88472Yns, this);
        int i = 0;
        for (SingleImageData singleImageData : model.getImageAlbumData().getImageList()) {
            int i2 = i + 1;
            if (i >= 0) {
                SingleImageData singleImageData2 = singleImageData;
                ExecutorService executorService = (ExecutorService) LJFF.getValue();
                ImageAlbumData imageAlbumData = model.getImageAlbumData();
                o.LJIIIIZZ(imageAlbumData, "model.imageAlbumData");
                RunnableC151315wl runnableC151315wl = new RunnableC151315wl(singleImageData2, imageAlbumData, LIZJ(i, singleImageData2.getSrcImageInfo().getPath(), false), null, new AqS53S0201000_2(imageList, i, c152945zO, 2), new IDqS427S0100000_2(interfaceC88473Ynt, (InterfaceC88473Ynt<? super Integer, ? super Exception, ? super String, C76800UCe>) 3), 8);
                ((ArrayList) this.LIZLLL).add(runnableC151315wl);
                executorService.submit(runnableC151315wl);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0101, code lost:
    
        if (java.lang.Math.max(r4.getWidth(), r4.getHeight()) <= java.lang.Math.max(r9.getWidth(), r9.getHeight())) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r16, X.InterfaceC88471Ynr<? super com.ss.android.ugc.aweme.image.model.ImageSynthesisResult, ? super java.lang.Integer, X.C76800UCe> r17, X.InterfaceC88473Ynt<? super java.lang.Integer, ? super java.lang.Exception, ? super java.lang.String, X.C76800UCe> r18, X.InterfaceC88472Yns<? super java.util.List<com.ss.android.ugc.aweme.image.model.ImageSynthesisResult>, X.C76800UCe> r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152935zN.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.Ynr, X.Ynt, X.Yns):void");
    }

    public final void LJFF(final VideoPublishEditModel model, final SrcImageInfo srcImageInfo, final Size size, final String generatePath, final InterfaceC88471Ynr<? super ImageSynthesisResult, ? super Integer, C76800UCe> interfaceC88471Ynr, final InterfaceC88473Ynt<? super Integer, ? super Exception, ? super String, C76800UCe> interfaceC88473Ynt, final InterfaceC88472Yns<? super List<ImageSynthesisResult>, C76800UCe> interfaceC88472Yns, final InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns2) {
        VEVideoEncodeSettings.COMPILE_TYPE compile_type;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(generatePath, "generatePath");
        C150785vu.LIZ(model);
        InterfaceC153045zY LIZIZ = C60903NvH.LJIIJJI().getPublishService().LJI().LIZIZ(model, new AqS168S0100000_2(this, 393));
        LIZIZ.LLILLJJLI(0);
        if (!((Boolean) C152985zS.LIZ.getValue()).booleanValue()) {
            LIZIZ.LLJ(size.getWidth(), size.getHeight());
        }
        C5UF.LIZ(this.LIZJ);
        this.LIZJ = LIZIZ;
        C87278YNe c87278YNe = new C87278YNe(2);
        if (((Boolean) C153005zU.LIZ.getValue()).booleanValue()) {
            compile_type = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_WEBP;
        } else {
            compile_type = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_JPEG;
        }
        c87278YNe.LIZIZ.compileType = compile_type;
        c87278YNe.LJIIJ(size.getWidth(), size.getHeight());
        c87278YNe.LIZIZ.resizeMode = 1;
        VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
        LIZ.setImageCompileQuality(((Number) C153025zW.LIZ.getValue()).intValue());
        InterfaceC153045zY interfaceC153045zY = this.LIZJ;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.LLF(generatePath, null, LIZ, new InterfaceC134045Nw() { // from class: X.5zM
                @Override // X.InterfaceC134045Nw
                public final void onCompileDone() {
                    ImageSynthesisResult imageSynthesisResult;
                    List<SingleImageData> imageList;
                    SingleImageData singleImageData;
                    C152935zN.this.LIZIZ();
                    if (((Boolean) C152985zS.LIZ.getValue()).booleanValue()) {
                        imageSynthesisResult = new ImageSynthesisResult(generatePath, size.getWidth(), size.getHeight());
                    } else {
                        imageSynthesisResult = new ImageSynthesisResult(generatePath, srcImageInfo.getWidth(), srcImageInfo.getHeight());
                    }
                    ImageAlbumData imageAlbumData = model.getImageAlbumData();
                    if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) ListProtector.get(imageList, 0)) != null) {
                        singleImageData.setSynthesisData(imageSynthesisResult);
                    }
                    InterfaceC88471Ynr<ImageSynthesisResult, Integer, C76800UCe> interfaceC88471Ynr2 = interfaceC88471Ynr;
                    if (interfaceC88471Ynr2 != null) {
                        interfaceC88471Ynr2.invoke(imageSynthesisResult, 0);
                    }
                    InterfaceC88472Yns<List<ImageSynthesisResult>, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns;
                    if (interfaceC88472Yns3 != null) {
                        interfaceC88472Yns3.invoke(C47261Igj.LJJIJ(imageSynthesisResult));
                    }
                }

                @Override // X.InterfaceC134045Nw
                public final void onCompileProgress(float f) {
                    InterfaceC88472Yns<Float, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
                    if (interfaceC88472Yns3 != null) {
                        interfaceC88472Yns3.invoke(Float.valueOf(f));
                    }
                }

                @Override // X.InterfaceC134045Nw
                public final void onCompileError(int i, int i2, float f, String str) {
                    C152935zN.this.LIZIZ();
                    InterfaceC88473Ynt<Integer, Exception, String, C76800UCe> interfaceC88473Ynt2 = interfaceC88473Ynt;
                    if (interfaceC88473Ynt2 != null) {
                        Integer valueOf = Integer.valueOf(i);
                        if (str == null) {
                            str = "";
                        }
                        interfaceC88473Ynt2.invoke(valueOf, null, str);
                    }
                }
            });
        } else {
            if (interfaceC88473Ynt == null) {
                return;
            }
            interfaceC88473Ynt.invoke(-1, null, "Failed to initialize VEEditor");
        }
    }
}
