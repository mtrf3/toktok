package X;

import android.content.Context;
import android.media.MediaRouter;
import android.view.Display;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.ZmB, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90915ZmB extends C90868ZlQ implements InterfaceC90841Zkz {
    public boolean LJJIJ(ZYF zyf) {
        throw null;
    }

    @Override // X.InterfaceC90841Zkz
    public final void LIZIZ(Object obj) {
        Display display;
        int i;
        int LJIJ = LJIJ(obj);
        if (LJIJ >= 0) {
            ZYF zyf = (ZYF) ListProtector.get(this.LJLZ, LJIJ);
            try {
                display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                display = null;
            }
            if (display != null) {
                i = display.getDisplayId();
            } else {
                i = -1;
            }
            if (i != zyf.LIZJ.LIZ.getInt("presentationDisplayId", -1)) {
                C90088ZXg c90088ZXg = new C90088ZXg(zyf.LIZJ);
                c90088ZXg.LIZ.putInt("presentationDisplayId", i);
                zyf.LIZJ = c90088ZXg.LIZIZ();
                LJJIII();
            }
        }
    }

    public C90915ZmB(Context context, ZYH zyh) {
        super(context, zyh);
    }

    @Override // X.C90868ZlQ
    public void LJJ(ZYF zyf, C90088ZXg c90088ZXg) {
        super.LJJ(zyf, c90088ZXg);
        if (!((MediaRouter.RouteInfo) zyf.LIZ).isEnabled()) {
            c90088ZXg.LIZ.putBoolean("enabled", false);
        }
        if (LJJIJ(zyf)) {
            c90088ZXg.LIZ.putInt("connectionState", 1);
        }
        try {
            Display presentationDisplay = ((MediaRouter.RouteInfo) zyf.LIZ).getPresentationDisplay();
            if (presentationDisplay != null) {
                c90088ZXg.LIZ.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
            }
        } catch (NoSuchMethodError unused) {
        }
    }
}
