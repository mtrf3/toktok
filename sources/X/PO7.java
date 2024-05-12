package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class PO7 implements C0GP {
    public final /* synthetic */ HashMap<String, Bitmap> LJLIL;

    public PO7(HashMap<String, Bitmap> hashMap) {
        this.LJLIL = hashMap;
    }

    @Override // X.C0GP
    public final Bitmap LJIILLIIL(C04750Gp c04750Gp) {
        Bitmap bitmap;
        String str = c04750Gp.LIZLLL;
        if (TextUtils.isEmpty(str) || !this.LJLIL.containsKey(str) || (bitmap = this.LJLIL.get(str)) == null || bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }
}
