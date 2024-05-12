package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HeC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44556HeC extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44557HeD LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        boolean z;
        Object next;
        int i;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        boolean LIZ = C44674Hg6.LIZ();
        if ((e1.LIZ(31744, "enable_creative_compile_import_hw_encode", true, false) || LIZ) && GAD.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        vEVideoEncodeConfigParams2.setSupportHWEncoder(z);
        vEVideoEncodeConfigParams2.setExternalSettingsJsonStr(C44752HhM.LIZ());
        List<VideoSegment> list = this.LIZIZ.LIZ;
        o.LJIIIZ(list, "<this>");
        int LIZ2 = C44517HdZ.LIZ();
        if (list.isEmpty()) {
            if (LIZ2 <= 0) {
                LIZ2 = 30;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SourceImportFps ; fps : ");
            LIZ3.append(LIZ2);
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
        } else {
            ArrayList arrayList = new ArrayList();
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.isDeleted) {
                    arrayList.add(videoSegment);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int LJI = ((VideoSegment) next).LJI();
                    do {
                        Object next2 = it.next();
                        int LJI2 = ((VideoSegment) next2).LJI();
                        if (LJI < LJI2) {
                            next = next2;
                            LJI = LJI2;
                        }
                    } while (it.hasNext());
                }
            }
            VideoSegment videoSegment2 = (VideoSegment) next;
            if (videoSegment2 != null) {
                i = videoSegment2.LJI();
            } else {
                i = 0;
            }
            int max = Math.max(30, i);
            if (LIZ2 > 0) {
                if (max > LIZ2) {
                    C5Z5.LIZIZ("SourceImportFps -> maxFps = " + max + ", fpsLimit = " + LIZ2 + ", compileFps = " + LIZ2);
                    C5Z5.LIZIZ("SourceImportFps ; fps : this");
                } else {
                    C5Z5.LIZIZ("SourceImportFps -> maxFps = " + max + ", fpsLimit = " + LIZ2 + ", compileFps = " + max);
                    LIZ2 = max;
                    C5Z5.LIZIZ("SourceImportFps ; fps : this");
                }
            } else {
                if (51 <= max && max < 75) {
                    StringBuilder sb = new StringBuilder("SourceImportFps -> maxFps = ");
                    sb.append(max);
                    sb.append(", compileFps = ");
                    max /= 2;
                    sb.append(max);
                    C5Z5.LIZIZ(sb.toString());
                } else if (max >= 75) {
                    StringBuilder sb2 = new StringBuilder("SourceImportFps -> maxFps = ");
                    sb2.append(max);
                    sb2.append(" compileFps = ");
                    LIZ2 = max / 3;
                    sb2.append(LIZ2);
                    C5Z5.LIZIZ(sb2.toString());
                    C5Z5.LIZIZ("SourceImportFps ; fps : this");
                } else {
                    C5Z5.LIZIZ("SourceImportFps -> maxFps = " + max + " compileFps = " + max);
                }
                LIZ2 = max;
                C5Z5.LIZIZ("SourceImportFps ; fps : this");
            }
        }
        vEVideoEncodeConfigParams2.setFps(LIZ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44556HeC(InterfaceC44653Hfl strategy, C44557HeD initParams) {
        super(strategy);
        C44583Hed c44583Hed = C44583Hed.LIZ;
        String name = c44583Hed.key;
        int i = c44583Hed.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "source";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
