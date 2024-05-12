package X;

import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.HFy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43774HFy implements InterfaceC29937Boz {
    public final /* synthetic */ C43773HFx LIZ;
    public final /* synthetic */ HGQ LIZIZ;

    public C43774HFy(HGQ hgq, C43773HFx c43773HFx) {
        this.LIZ = c43773HFx;
        this.LIZIZ = hgq;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        ExtractFramesModel extractFramesModel = this.LIZ.LIZLLL.extractFramesModel;
        if (extractFramesModel != null && extractFramesModel.getExtractFramesDir() != null) {
            String extractFramesDir = this.LIZ.LIZLLL.extractFramesModel.getExtractFramesDir();
            String separator = File.separator;
            o.LJIIIIZZ(separator, "separator");
            if (!ujb.o.LJJJJ(extractFramesDir, separator, false)) {
                extractFramesDir = i0.LJFF(extractFramesDir, separator);
            }
            File[] listFiles = new File(this.LIZ.LJ).listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file : listFiles) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(extractFramesDir);
                    LIZ.append(file.getName());
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C39579Fg7.LIZLLL(file.getAbsolutePath(), LIZIZ);
                    this.LIZ.LIZLLL.extractFramesModel.addFrameAtLastSegment(new FrameItem(LIZIZ, 0, 0, false, null, null, 62, null));
                }
            }
            C39579Fg7.LJIJJLI(this.LIZ.LJ);
            C39579Fg7.LJIL(this.LIZ.LJ);
        }
        this.LIZIZ.onFinish(true);
        this.LIZ.getClass();
        C44422Hc2.LIZJ();
        this.LIZ.LJ();
    }
}
