package X;

import android.graphics.Bitmap;
import com.lynx.component.svg.UISvg;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VHj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79483VHj {
    public final WeakReference<UISvg> LIZ;
    public final VNU LIZIZ;
    public final HashMap<String, Bitmap> LIZJ = new HashMap<>();

    public final void LIZ() {
        Iterator<Map.Entry<String, Bitmap>> it = this.LIZJ.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().recycle();
            } catch (Throwable unused) {
            }
        }
        this.LIZJ.clear();
    }

    public C79483VHj(VNU vnu, UISvg uISvg) {
        this.LIZIZ = vnu;
        this.LIZ = new WeakReference<>(uISvg);
    }
}
