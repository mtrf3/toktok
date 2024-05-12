package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1A implements InterfaceC36329ENp {
    public final /* synthetic */ H16 LIZ;
    public final /* synthetic */ H15 LIZIZ;
    public final /* synthetic */ H1B LIZJ;

    @Override // X.InterfaceC36329ENp
    public final Object LIZ(InterfaceC67352kd<? super String> interfaceC67352kd) {
        Bitmap decodeBitmap;
        ExtractFramesModel extractFramesModel = ((C41932Gcy) this.LIZ.LIZ).LJLIL;
        if (extractFramesModel == null) {
            return null;
        }
        List<FrameItem> allFrames = extractFramesModel.getAllFrames();
        int i = 0;
        if (allFrames == null || allFrames.isEmpty()) {
            return null;
        }
        List LJIIZILJ = C86793Y4n.LJIIZILJ(this.LIZ.LIZJ.LIZ, allFrames);
        String LJ = this.LIZIZ.LJ();
        ArrayList arrayList = new ArrayList();
        Iterator it = LJIIZILJ.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            File file = new File(((FrameItem) it.next()).getPath());
            if (file.exists() && (decodeBitmap = BitmapUtils.decodeBitmap(file)) != null) {
                Bitmap LJJIJIL = C86793Y4n.LJJIJIL(decodeBitmap, this.LIZ.LIZJ.LIZIZ.getFirst().intValue(), this.LIZ.LIZJ.LIZIZ.getSecond().intValue());
                InterfaceC88472Yns<Bitmap, Bitmap> interfaceC88472Yns = this.LIZ.LIZLLL.LIZIZ;
                if (interfaceC88472Yns != null) {
                    LJJIJIL = interfaceC88472Yns.invoke(decodeBitmap);
                }
                H1B h1b = this.LIZJ;
                String valueOf = String.valueOf(i);
                String LJ2 = this.LIZIZ.LJ();
                h1b.getClass();
                String absolutePath = H1B.LIZIZ(LJJIJIL, valueOf, LJ2, null).getAbsolutePath();
                o.LJIIIIZZ(absolutePath, "file.absolutePath");
                arrayList.add(absolutePath);
            }
            i = i2;
        }
        return C38978FRm.LIZ(LJ, arrayList);
    }

    public H1A(H1B h1b, H16 h16, H15 h15) {
        this.LIZ = h16;
        this.LIZIZ = h15;
        this.LIZJ = h1b;
    }
}
