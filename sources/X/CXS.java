package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes6.dex */
public final class CXS implements C0GM {
    public final /* synthetic */ List<Bitmap> LIZ;
    public final /* synthetic */ C29701Eo LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ List<String> LJ;

    public CXS(List<Bitmap> list, C29701Eo c29701Eo, int i, int i2, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = c29701Eo;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = list2;
    }

    @Override // X.C0GM
    public final void LIZ(C0GY c0gy) {
        List<Bitmap> list = this.LIZ;
        int i = this.LIZJ;
        int i2 = this.LIZLLL;
        C29701Eo c29701Eo = this.LIZIZ;
        List<String> list2 = this.LJ;
        int i3 = 0;
        for (Bitmap bitmap : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                c29701Eo.updateBitmap((String) ListProtector.get(list2, i3), C15380j0.LJ(Bitmap.createScaledBitmap(bitmap, i, i2, false)));
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        this.LIZIZ.playAnimation();
    }
}
