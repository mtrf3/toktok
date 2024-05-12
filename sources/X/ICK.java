package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.a1;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ICK {
    public final LifecycleOwner LIZ;
    public final CreativeInfo LIZIZ;
    public final Effect LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public final String LJI;
    public final String LJII;

    public ICK(C29S owner, CreativeInfo creativeInfo, Effect faceSticker) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(faceSticker, "faceSticker");
        this.LIZ = owner;
        this.LIZIZ = creativeInfo;
        this.LIZJ = faceSticker;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(faceSticker.getUnzipPath());
        String str = File.separator;
        String LJFF = JBR.LJFF(LIZ, str, "res_split", LIZ);
        this.LIZLLL = LJFF;
        this.LJ = a1.LJ(LJFF, str, "background_v");
        this.LJFF = a1.LJ(LJFF, str, "background_a");
        this.LJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJZ(creativeInfo, "background_v");
        this.LJII = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJZ(creativeInfo, "background_a");
    }
}
