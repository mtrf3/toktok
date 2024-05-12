package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4AS */
/* loaded from: classes2.dex */
public final class C4AS {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZJ(W5G w5g, UrlModel urlModel, String scene) {
        o.LJIIIZ(scene, "scene");
        LJII(w5g, urlModel, scene, null, null, 0, 0, 504);
    }

    public static boolean LJIIIZ(UrlModel urlModel) {
        C4AU.LIZ.getClass();
        if (((Boolean) C4AU.LIZIZ.getValue()).booleanValue() && C4AF.LJ(C4AF.LIZ, urlModel)) {
            return true;
        }
        return false;
    }

    public static final UrlModel LJIIJ(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C47261Igj.LJJIJ(str));
        return urlModel;
    }

    public static /* synthetic */ void LJII(W5G w5g, UrlModel urlModel, String str, W4Z w4z, C78742UvK c78742UvK, int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        W4Z w4z2 = w4z;
        int i5 = i2;
        C78742UvK c78742UvK2 = null;
        if ((i3 & 8) != 0) {
            w4z2 = null;
        }
        if ((i3 & 16) == 0) {
            c78742UvK2 = c78742UvK;
        }
        if ((i3 & 32) != 0) {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            i5 = 0;
        }
        if ((i3 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        LJFF(w5g, urlModel, str, w4z2, c78742UvK2, i4, i5, z, null);
    }

    public static final void LIZ(W5G w5g, UrlModel urlModel, String scene, int i, int i2, int i3, boolean z, int i4, InterfaceC81853WAn interfaceC81853WAn) {
        boolean z2;
        o.LJIIIZ(scene, "scene");
        if (urlModel == null) {
            C34B.LJI("MessageFrescoHelper", "Trying to set animation with null URL");
            return;
        }
        C4AZ.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tt_dm_filter_illegal_gif", false) && LJIIIZ(urlModel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = null;
        if (z2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("bindImage with illegal gif ");
            if (C1GE.LJIILIIL(urlModel.getUrlList())) {
                List<String> urlList = urlModel.getUrlList();
                if (urlList != null) {
                    str = (String) ORZ.LJLLLL(urlList);
                }
            } else {
                str = urlModel.getUri();
            }
            C48690J9a.LJIIL(LIZ2, str, LIZ2, "MessageFrescoHelper");
            return;
        }
        List<String> urlList2 = urlModel.getUrlList();
        if (urlList2 != null) {
            str = (String) ORZ.LJLLLL(urlList2);
        }
        C81852WAm c81852WAm = new C81852WAm(interfaceC81853WAn, new C81928WDk(str, scene));
        List<String> urlList3 = urlModel.getUrlList();
        if ((urlList3 == null || urlList3.isEmpty()) && C1GE.LJIIL(urlModel.getUri())) {
            return;
        }
        C4AT c4at = new C4AT();
        c4at.LIZIZ = w5g;
        c4at.LIZ = urlModel;
        c4at.LIZJ = i;
        c4at.LIZLLL = i2;
        c4at.LJII = i3;
        c4at.LJ = c81852WAm;
        c4at.LJIIJ = z;
        c4at.LJIIJJI = i4;
        c4at.LJFF = true;
        c4at.LJI = true;
        if (c4at.LIZIZ == null) {
            C34B.LIZJ("FrescoAnimatedBinder.Builder", "Where do you want to render the image?");
        }
        new KS9(c4at).LIZ();
    }

    public static /* synthetic */ void LIZIZ(W5G w5g, UrlModel urlModel, String str, int i, int i2, int i3, int i4, InterfaceC81853WAn interfaceC81853WAn, int i5) {
        int i6 = i;
        String str2 = str;
        int i7 = i2;
        int i8 = i4;
        int i9 = i3;
        InterfaceC81853WAn interfaceC81853WAn2 = interfaceC81853WAn;
        if ((i5 & 4) != 0) {
            str2 = "";
        }
        if ((i5 & 8) != 0) {
            i6 = 0;
        }
        if ((i5 & 16) != 0) {
            i7 = 0;
        }
        if ((i5 & 32) != 0) {
            i9 = 0;
        }
        if ((i5 & 128) != 0) {
            i8 = 1;
        }
        if ((i5 & 256) != 0) {
            interfaceC81853WAn2 = null;
        }
        LIZ(w5g, urlModel, str2, i6, i7, i9, false, i8, interfaceC81853WAn2);
    }

    public static final void LJFF(W5G w5g, UrlModel urlModel, String scene, W4Z<InterfaceC81599W0t> w4z, VA3 va3, int i, int i2, boolean z, UrlModel urlModel2) {
        o.LJIIIZ(scene, "scene");
        if (w5g == null || urlModel == null) {
            return;
        }
        String str = null;
        if (LJIIIZ(urlModel)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("bindImage with illegal url ");
            if (C1GE.LJIILIIL(urlModel.getUrlList())) {
                List<String> urlList = urlModel.getUrlList();
                if (urlList != null) {
                    str = (String) ORZ.LJLLLL(urlList);
                }
            } else {
                str = urlModel.getUri();
            }
            C48690J9a.LJIIL(LIZ2, str, LIZ2, "MessageFrescoHelper");
            return;
        }
        if (w5g.getVisibility() != 0) {
            C34B.LJIIIIZZ("MessageFrescoHelper", "Fresco image view is not visible when bindImage. Image will not be loaded as DraweeController is detached.");
        }
        List<String> urlList2 = urlModel.getUrlList();
        if (urlList2 != null) {
            str = (String) ORZ.LJLLLL(urlList2);
        }
        C78765Uvh.LJ(w5g, urlModel, i, i2, va3, new C81684W4a(w4z, new C81928WDk(str, scene)), z, urlModel2);
    }

    public static /* synthetic */ void LJI(W5G w5g, UrlModel urlModel, String str, Drawable drawable, Drawable drawable2, VA3 va3, W4Z w4z, UrlModel urlModel2, int i) {
        W4Z w4z2 = w4z;
        VA3 va32 = va3;
        UrlModel urlModel3 = null;
        if ((i & 32) != 0) {
            va32 = null;
        }
        if ((i & 64) != 0) {
            w4z2 = null;
        }
        if ((i & 512) == 0) {
            urlModel3 = urlModel2;
        }
        LJ(w5g, urlModel, str, drawable, drawable2, va32, w4z2, 0, 0, urlModel3);
    }

    public static final void LIZLLL(W5G w5g, UrlModel urlModel, String scene, int i, int i2, VA3 va3, W4Z<InterfaceC81599W0t> w4z, int i3, int i4, UrlModel urlModel2) {
        o.LJIIIZ(scene, "scene");
        if (w5g == null || w5g.getContext() == null) {
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        Context context = w5g.getContext();
        o.LJIIIIZZ(context, "draweeView.context");
        SY9 LIZ2 = c2068389v.LIZ(context);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = i2;
        Context context2 = w5g.getContext();
        o.LJIIIIZZ(context2, "draweeView.context");
        LJ(w5g, urlModel, scene, LIZ2, c2068389v2.LIZ(context2), va3, w4z, i3, i4, urlModel2);
    }

    public static final void LJ(W5G w5g, UrlModel urlModel, String scene, Drawable drawable, Drawable drawable2, VA3 va3, W4Z<InterfaceC81599W0t> w4z, int i, int i2, UrlModel urlModel2) {
        V92 v92;
        o.LJIIIZ(scene, "scene");
        if (w5g == null || w5g.getContext() == null) {
            return;
        }
        Resources resources = w5g.getContext().getResources();
        if (!w5g.hasHierarchy()) {
            v92 = new C79077V1t(resources).LIZ();
        } else {
            V92 hierarchy = w5g.getHierarchy();
            o.LJIIIIZZ(hierarchy, "{\n            draweeView.hierarchy\n        }");
            v92 = hierarchy;
        }
        v92.LJIILL(drawable2, 1);
        v92.LJIILL(drawable, 5);
        w5g.setHierarchy(v92);
        LJFF(w5g, urlModel, scene, w4z, va3, i, i2, true, urlModel2);
    }

    public static /* synthetic */ void LJIIIIZZ(C62846OlW c62846OlW, UrlModel urlModel, String str, int i, int i2, C78742UvK c78742UvK, C4AY c4ay, int i3, int i4, int i5) {
        int i6 = i3;
        C78742UvK c78742UvK2 = c78742UvK;
        int i7 = i4;
        C4AY c4ay2 = null;
        if ((i5 & 32) != 0) {
            c78742UvK2 = null;
        }
        if ((i5 & 64) == 0) {
            c4ay2 = c4ay;
        }
        if ((i5 & 128) != 0) {
            i6 = 0;
        }
        if ((i5 & 256) != 0) {
            i7 = 0;
        }
        LIZLLL(c62846OlW, urlModel, str, i, i2, c78742UvK2, c4ay2, i6, i7, null);
    }
}
