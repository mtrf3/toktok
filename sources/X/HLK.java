package X;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class HLK {
    public static final String LIZ;
    public static final String LIZIZ;

    public static void LIZ() {
        AssetManager assets = C60903NvH.LJ.getAssets();
        boolean ulikeBeautyCopied = C60903NvH.LJIIJJI().LJJIL().getUlikeBeautyCopied(false);
        try {
            String str = LIZ;
            if (!C44687HgJ.LIZIZ(str) || !ulikeBeautyCopied) {
                C16880lQ.LJJLL(assets.open("reshape.zip"), str);
            }
            String str2 = LIZIZ;
            if (!C44687HgJ.LIZIZ(str2) || !ulikeBeautyCopied) {
                C16880lQ.LJJLL(assets.open("smooth.zip"), str2);
            }
            C60903NvH.LJIIJJI().LJJIL().setUlikeBeautyCopied(true);
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    static {
        String LJJJJZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJJZ();
        File file = new File(LJJJJZ);
        if (!file.exists()) {
            file.mkdirs();
        }
        LIZ = new File(LJJJJZ, "reshape").getAbsolutePath();
        LIZIZ = new File(LJJJJZ, "smooth").getAbsolutePath();
        new File(LJJJJZ, "contour").getAbsolutePath();
        LIZ();
    }
}
