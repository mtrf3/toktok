package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.45S, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45S {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r5 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.Object r5, X.VA8 r6) {
        /*
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.base.model.UrlModel
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = (com.ss.android.ugc.aweme.base.model.UrlModel) r5
            java.lang.String r5 = X.OYF.LJI(r5)
            if (r5 != 0) goto Le
        Lc:
            java.lang.String r5 = ""
        Le:
            java.lang.String r0 = "/"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            r4 = 0
            java.util.List r3 = ujb.s.LJLJJL(r5, r1, r4, r0)
            java.util.Iterator r2 = r3.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = "avatar"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1e
            int r0 = r3.indexOf(r1)
            int r1 = r0 + 2
            int r0 = r3.size()
            if (r1 >= r0) goto L1e
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1e
            r4 = 1
            goto L1e
        L4a:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L51
            java.lang.String r5 = (java.lang.String) r5
            goto Le
        L51:
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.base.ImageUrlModel
            if (r0 == 0) goto Lc
            com.ss.android.ugc.aweme.base.ImageUrlModel r5 = (com.ss.android.ugc.aweme.base.ImageUrlModel) r5
            java.util.List<java.lang.String> r1 = r5.mUrls
            java.lang.String r0 = "urlModel.urls"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Object r5 = X.ORZ.LJLLLL(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto Le
            goto Lc
        L67:
            LJI(r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45S.LIZ(java.lang.Object, X.VA8):void");
    }

    public static void LJI(VA8 va8, boolean z) {
        V92 hierarchy;
        V8L v8l;
        if (va8 instanceof C119574mf) {
            ((C119574mf) va8).setShouldDrawBorder(!z);
        }
        if (va8 != null && (hierarchy = va8.getHierarchy()) != null && (v8l = hierarchy.LIZJ) != null) {
            if (z) {
                v8l.LIZIZ = false;
                v8l.LJFF = 0;
            } else {
                v8l.LIZIZ = true;
                v8l.LJFF = C78609UtB.LJJJ(R.attr.dz, EF7.LIZIZ());
            }
        }
    }

    public static void LIZJ(C62846OlW c62846OlW, UrlModel urlModel, String scene) {
        o.LJIIIZ(scene, "scene");
        LIZ(urlModel, c62846OlW);
        C4AS.LJII(c62846OlW, urlModel, scene, null, null, 0, 0, 504);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static W5F LIZIZ(InterfaceC85013Vh interfaceC85013Vh, String urlModel, int i, int i2, int i3, int i4) {
        o.LJIIIZ(urlModel, "urlModel");
        VA8 va8 = null;
        if (interfaceC85013Vh instanceof SmartAvatarImageView) {
            va8 = (VA8) interfaceC85013Vh;
        }
        LIZ(urlModel, va8);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(urlModel);
        LJIIIIZZ.LJJIIJ = interfaceC85013Vh;
        LJIIIIZZ.LJII = i;
        LJIIIIZZ.LJIIIIZZ = i2;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i3;
        c2068389v.LIZIZ = i;
        c2068389v.LIZJ = i2;
        o.LJII(interfaceC85013Vh, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
        View view = (View) interfaceC85013Vh;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "avatarView as SmartAvatarImageView).context");
        LJIIIIZZ.LJIILLIIL = c2068389v.LIZ(context);
        Integer valueOf = Integer.valueOf(i4);
        if (valueOf.intValue() > 0) {
            valueOf.intValue();
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = i4;
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "avatarView.context");
            LJIIIIZZ.LJIILIIL = c2068389v2.LIZ(context2);
        }
        return LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static W5F LJ(InterfaceC85013Vh interfaceC85013Vh, ImageUrlModel imageUrlModel, int i, int i2, String str, int i3) {
        VA8 va8;
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            str = null;
        }
        if (interfaceC85013Vh instanceof VA8) {
            va8 = (VA8) interfaceC85013Vh;
        } else {
            va8 = null;
        }
        LIZ(imageUrlModel, va8);
        W5F LJII = W5U.LJII(imageUrlModel);
        LJII.LJJIIJ = interfaceC85013Vh;
        if (str != null) {
            LJII.LJJJIL = str;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = i;
            o.LJII(interfaceC85013Vh, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
            Context context = ((View) interfaceC85013Vh).getContext();
            o.LJIIIIZZ(context, "avatarView as SmartAvatarImageView).context");
            LJII.LJIILLIIL = c2068389v.LIZ(context);
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (valueOf2.intValue() > 0) {
            valueOf2.intValue();
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = i2;
            o.LJII(interfaceC85013Vh, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
            Context context2 = ((View) interfaceC85013Vh).getContext();
            o.LJIIIIZZ(context2, "avatarView as SmartAvatarImageView).context");
            LJII.LJIILIIL = c2068389v2.LIZ(context2);
        }
        return LJII;
    }

    public static void LIZLLL(C62846OlW c62846OlW, UrlModel urlModel, String scene, Drawable drawable, Drawable drawable2, W4Z w4z, UrlModel urlModel2) {
        o.LJIIIZ(scene, "scene");
        LIZ(urlModel, c62846OlW);
        C4AS.LJI(c62846OlW, urlModel, scene, drawable, drawable2, null, w4z, urlModel2, 416);
    }

    public static void LJFF(C62846OlW c62846OlW, UrlModel urlModel, String scene, int i, int i2, C4AY c4ay, UrlModel urlModel2, int i3) {
        UrlModel urlModel3 = urlModel2;
        C4AY c4ay2 = c4ay;
        if ((i3 & 64) != 0) {
            c4ay2 = null;
        }
        if ((i3 & 512) != 0) {
            urlModel3 = null;
        }
        o.LJIIIZ(scene, "scene");
        LIZ(urlModel, c62846OlW);
        C4AS.LIZLLL(c62846OlW, urlModel, scene, i, i2, null, c4ay2, 0, 0, urlModel3);
    }
}
