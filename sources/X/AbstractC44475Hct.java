package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Hct, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44475Hct implements InterfaceC44470Hco {
    public final WaterMarkBuilder LIZ;
    public final C62822Ol8 LIZIZ;
    public boolean LIZJ;
    public HOW LIZLLL;

    public final C44485Hd3 LIZLLL() {
        Integer[] numArr = (Integer[]) C47261Igj.LJJIJIIJI(Integer.valueOf(this.LIZ.video.getWidth()), Integer.valueOf(this.LIZ.video.getHeight())).toArray(new Integer[0]);
        VEVideoEncodeSettings LIZ = C44526Hdi.LIZ(numArr[0].intValue(), numArr[1].intValue());
        String str = this.LIZ.inputPath;
        o.LJIIIIZZ(str, "markBuilder.inputPath");
        String str2 = this.LIZ.outPath;
        o.LJIIIIZZ(str2, "markBuilder.outPath");
        C44485Hd3 c44485Hd3 = new C44485Hd3(str, str2, null, LIZ);
        if (this.LIZ.richEndMode) {
            c44485Hd3.LJII = -1;
        }
        return c44485Hd3;
    }

    @Override // X.InterfaceC44470Hco
    public final void LIZ() {
        WaterMarkBuilder waterMarkBuilder;
        if (this.LIZ.addInterMark) {
            LJ();
            HOW how = this.LIZLLL;
            if (how != null) {
                how.LIZ(true, this.LIZ.author);
            }
            HOW how2 = this.LIZLLL;
            if (how2 != null) {
                how2.LIZ(false, this.LIZ.author);
            }
        }
        if (this.LIZ.isInstagram) {
            C44172HVg.LJII.getClass();
            if (C44496HdE.LIZ() && this.LIZIZ.getValue() != null && (waterMarkBuilder = this.LIZ) != null) {
                int width = waterMarkBuilder.video.getWidth();
                int height = this.LIZ.video.getHeight();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(width));
                arrayList.add(Integer.valueOf(height));
                InterfaceC43114Gw2 LIZJ = C60903NvH.LJIIJJI().LIZJ();
                WaterMarkBuilder waterMarkBuilder2 = this.LIZ;
                String str = waterMarkBuilder2.inputPath;
                InterfaceC45930I0w interfaceC45930I0w = waterMarkBuilder2.author;
                o.LJIIIIZZ(interfaceC45930I0w, "markBuilder.author");
                LIZJ.LIZJ(arrayList, str, interfaceC45930I0w, null, null);
            }
        }
    }

    public final void LJ() {
        int i;
        if (this.LIZLLL == null) {
            WaterMarkBuilder waterMarkBuilder = this.LIZ;
            if (waterMarkBuilder.isInstagram) {
                i = 2;
            } else {
                i = -1;
            }
            int width = waterMarkBuilder.video.getWidth();
            int height = this.LIZ.video.getHeight();
            CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            String bitRatedRatioUri = this.LIZ.video.getPlayAddrH264().getBitRatedRatioUri();
            o.LJIIIIZZ(bitRatedRatioUri, "markBuilder.video.playAddrH264.bitRatedRatioUri");
            this.LIZLLL = HOV.LIZIZ(creativeInfo, i, bitRatedRatioUri, false, new int[]{width, height});
        }
    }

    public AbstractC44475Hct(WaterMarkBuilder watermarkBuilder) {
        boolean z;
        o.LJIIIZ(watermarkBuilder, "watermarkBuilder");
        this.LIZ = watermarkBuilder;
        C45804HyK.LJIIJ(watermarkBuilder.inputPath, "inputPath can't be null", new Object[0]);
        C45804HyK.LJIIJ(watermarkBuilder.outPath, "outPath can't be null", new Object[0]);
        C45804HyK.LJIIJ(watermarkBuilder.author, "author can't be null", new Object[0]);
        C45804HyK.LJIIJ(watermarkBuilder.video, "video can't be null", new Object[0]);
        boolean z2 = true;
        if (watermarkBuilder.addInterMark || watermarkBuilder.addEndMark) {
            z = true;
        } else {
            z = false;
        }
        C45804HyK.LJIIIZ("watermark invoked with error parameters", z, new Object[0]);
        File file = new File(watermarkBuilder.outPath);
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            z2 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\n                create output dir failed \n                outPath = ");
        LIZ.append(watermarkBuilder.outPath);
        LIZ.append("\n                outPath isExist = ");
        LIZ.append(file.exists());
        LIZ.append("\n                outPath isfile =  ");
        LIZ.append(file.isFile());
        LIZ.append("\n                outDir  = ");
        LIZ.append(parentFile.getPath());
        LIZ.append("\n                outDir.isDirectory() = ");
        LIZ.append(parentFile.isDirectory());
        LIZ.append("\n                outDir.mkdirs() = ");
        LIZ.append(parentFile.mkdirs());
        LIZ.append("\n                ");
        C45804HyK.LJIIIZ(C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ)), z2, new Object[0]);
        this.LIZIZ = C221108m2.LIZIZ(H4R.INSTANCE);
    }

    @Override // X.InterfaceC44470Hco
    public final void LIZJ(WaterMarkBuilder waterMarkBuilder) {
        throw new UnsupportedOperationException("No longer need to set watermarkBuilder");
    }

    @Override // X.InterfaceC44470Hco
    public final void waterMark(WaterMarkBuilder waterMarkBuilder) {
        o.LJIIIZ(waterMarkBuilder, "waterMarkBuilder");
        throw new UnsupportedOperationException("Use com.ss.android.ugc.aweme.watermark.composer.IWatermarkComposer.addWatermark instead");
    }
}
