package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.0jO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15620jO {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static boolean LJ(android.net.Uri uri) {
        W5O LIZ2;
        if (uri != null && (LIZ2 = W5O.LIZ(uri)) != null) {
            W5N LJI = W5N.LJI();
            LJI.getClass();
            C245519kJ LJ = LJI.LJ(LIZ2.LIZIZ);
            if (LJ != null) {
                return W8E.LJII().LJIIIZ().LJII(LJ);
            }
        }
        return false;
    }

    public static void LJFF(ImageModel imageModel) {
        if (C15380j0.LIZLLL() == null || imageModel == null || C32151Nz.LJJIIJZLJL(imageModel.getUrls())) {
            return;
        }
        W5I.LIZ().LJIIL(W5O.LIZIZ((String) ListProtector.get(imageModel.getUrls(), 0)), C15380j0.LIZLLL());
    }

    public static void LIZ(C47061t0 c47061t0, int i) {
        if (c47061t0 == null) {
            return;
        }
        c47061t0.setImageURI(W5P.LIZJ(i).LIZ().LIZIZ);
    }

    public static void LIZIZ(ImageModel imageModel, C47061t0 c47061t0) {
        LIZJ(c47061t0, imageModel, null, null, null, false);
    }

    public static W5O[] LIZLLL(ImageModel imageModel, C79238V7y c79238V7y, C78739UvH c78739UvH) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new W5O[0];
        }
        ArrayList arrayList = new ArrayList();
        C43331mz c43331mz = new C43331mz();
        for (String str : imageModel.getUrls()) {
            if (!C38354F3m.LJ(str)) {
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
                if (c78739UvH != null) {
                    LIZLLL.LJIIJ = c78739UvH;
                }
                if (c79238V7y != null) {
                    LIZLLL.LIZJ = c79238V7y;
                }
                c43331mz.LIZIZ++;
                LIZLLL.LJIILJJIL = c43331mz;
                arrayList.add(LIZLLL.LIZ());
            }
        }
        if (arrayList.size() == 0) {
            return new W5O[0];
        }
        return (W5O[]) arrayList.toArray(new W5O[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(W5G w5g, ImageModel imageModel, Drawable drawable, C78739UvH c78739UvH, InterfaceC75158Tec interfaceC75158Tec, boolean z) {
        C79238V7y c79238V7y;
        if (LiveImageLoaderModuleSetting.useImageModule() && c78739UvH == null) {
            if (!C15650jR.LIZIZ(imageModel)) {
                return;
            }
            C78720Uuy LIZ2 = C15650jR.LIZ().LIZ(imageModel.getUrls());
            LIZ2.LJ = -1;
            LIZ2.LJFF = -1;
            LIZ2.LJIIJJI = interfaceC75158Tec;
            LIZ2.LJIL = false;
            LIZ2.LJIIJ = drawable;
            LIZ2.LJIJ = z;
            LIZ2.LJIJI = Boolean.FALSE;
            LIZ2.LJIIJJI(w5g);
            return;
        }
        if (w5g == null || imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return;
        }
        int measuredWidth = w5g.getMeasuredWidth();
        int measuredHeight = w5g.getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            c79238V7y = new C79238V7y(measuredWidth, measuredHeight);
        } else {
            c79238V7y = null;
        }
        W5O[] LIZLLL = LIZLLL(imageModel, c79238V7y, c78739UvH);
        if (LIZLLL == 0 || LIZLLL.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        if (!RoomSlowFunctionOptSetting.watchOpt()) {
            LIZJ.LJFF(true, LIZLLL);
        } else if (LIZLLL.length == 1) {
            LIZJ.LIZLLL = LIZLLL[0];
        } else {
            LIZJ.LJFF(false, LIZLLL);
        }
        if (z) {
            LIZJ.LJIIJ = true;
        }
        if (drawable != null) {
            if (w5g.getHierarchy() == null) {
                C79077V1t c79077V1t = new C79077V1t(w5g.getContext().getResources());
                C79077V1t.LJIJ = 300;
                c79077V1t.LIZJ = drawable;
                c79077V1t.LIZLLL = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
                w5g.setHierarchy(c79077V1t.LIZ());
            } else {
                V92 hierarchy = w5g.getHierarchy();
                hierarchy.LJIILLIIL(300);
                hierarchy.LJIILL(drawable, 1);
                w5g.setHierarchy(hierarchy);
            }
        }
        LIZJ.LJII = new C1UQ(imageModel, interfaceC75158Tec);
        w5g.setController(LIZJ.LIZ());
    }
}
