package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.a1;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ICL {
    public final LifecycleOwner LIZ;
    public final CreativeInfo LIZIZ;
    public final Effect LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public ICL(C29S owner, CreativeInfo creativeInfo, Effect faceSticker) {
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
        String LJ = a1.LJ(LJFF, str, "background_v");
        this.LJ = LJ;
        String LJ2 = a1.LJ(LJFF, str, "background_a");
        this.LJFF = LJ2;
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("background_v_");
        LIZ2.append(C173376rF.LJI(LJ));
        this.LJI = LIZIZ.LJJJZ(creativeInfo, X1D.LIZIZ(LIZ2));
        InterfaceC171126nc LIZIZ2 = C5YW.LIZIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("background_a_");
        LIZ3.append(C173376rF.LJI(LJ2));
        this.LJII = LIZIZ2.LJJJZ(creativeInfo, X1D.LIZIZ(LIZ3));
    }
}
