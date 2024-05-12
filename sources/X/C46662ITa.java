package X;

import Y.ARunnableS7S1200000_8;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.ref.WeakReference;

/* renamed from: X.ITa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46662ITa implements InterfaceC46663ITb {
    public final WeakReference<IX5> LIZ;

    public final void LIZ() {
        IX5 ix5 = this.LIZ.get();
        if (ix5 != null) {
            String str = ix5.LJI;
            OnUIPlayListener onUIPlayListener = ix5.LJJII;
            ix5.LJJIFFI.LIZ(new ARunnableS7S1200000_8(ix5.LJIIIZ(), onUIPlayListener, str, 14));
        }
    }

    public final void LIZIZ() {
        IX5 ix5 = this.LIZ.get();
        if (ix5 != null) {
            String str = ix5.LJI;
            OnUIPlayListener onUIPlayListener = ix5.LJJII;
            ix5.LJJIFFI.LIZ(new ARunnableS7S1200000_8(ix5.LJIIIZ(), onUIPlayListener, str, 13));
        }
    }

    public C46662ITa(IX5 ix5) {
        this.LIZ = new WeakReference<>(ix5);
    }
}
