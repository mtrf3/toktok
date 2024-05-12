package X;

import com.google.gson.Gson;
import com.ss.android.ugc.asve.context.PreviewSize;

/* loaded from: classes8.dex */
public final class HJG extends AbstractC65781Prl implements InterfaceC65784Pro<int[]> {
    public static final HJG INSTANCE = new HJG();

    public HJG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final int[] invoke() {
        boolean z;
        Gson LIZ = C60903NvH.LJIIJJI().LIZ();
        String LIZ2 = C44744HhE.LIZ();
        if (LIZ2 == null || LIZ2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!z) {
            try {
                obj = LIZ.LJI(LIZ2, PreviewSize.class);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        PreviewSize previewSize = (PreviewSize) obj;
        if (previewSize != null) {
            return new int[]{previewSize.getWidth(), previewSize.getHeight()};
        }
        return new int[0];
    }
}
