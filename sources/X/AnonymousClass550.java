package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.550, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass550 {
    public final InterfaceC88472Yns<? super ViewGroup, ? extends View> LIZ;
    public final InterfaceC88472Yns<? super ViewGroup, ? extends View> LIZIZ;
    public final InterfaceC88472Yns<? super ViewGroup, ? extends OSZ<? extends View, ? extends View>> LIZJ;
    public final C1295856s LIZLLL;
    public final AnonymousClass552 LJ;
    public final C1296156v LJFF;
    public final C57B LJI;
    public final C1295956t LJII;
    public final AnonymousClass553 LJIIIIZZ;
    public final C55U LJIIIZ;

    public AnonymousClass550() {
        this(null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass550)) {
            return false;
        }
        AnonymousClass550 anonymousClass550 = (AnonymousClass550) obj;
        return o.LJ(this.LIZ, anonymousClass550.LIZ) && o.LJ(this.LIZIZ, anonymousClass550.LIZIZ) && o.LJ(this.LIZJ, anonymousClass550.LIZJ) && o.LJ(this.LIZLLL, anonymousClass550.LIZLLL) && o.LJ(this.LJ, anonymousClass550.LJ) && o.LJ(this.LJFF, anonymousClass550.LJFF) && o.LJ(this.LJI, anonymousClass550.LJI) && o.LJ(this.LJII, anonymousClass550.LJII) && o.LJ(this.LJIIIIZZ, anonymousClass550.LJIIIIZZ) && o.LJ(this.LJIIIZ, anonymousClass550.LJIIIZ);
    }

    public final int hashCode() {
        InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns = this.LIZ;
        int hashCode = (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode()) * 31;
        InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns2 = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC88472Yns2 == null ? 0 : interfaceC88472Yns2.hashCode())) * 31;
        InterfaceC88472Yns<? super ViewGroup, ? extends OSZ<? extends View, ? extends View>> interfaceC88472Yns3 = this.LIZJ;
        return this.LJIIIZ.hashCode() + ((this.LJIIIIZZ.hashCode() + ((this.LJII.hashCode() + ((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((hashCode2 + (interfaceC88472Yns3 != null ? interfaceC88472Yns3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceListViewConfig(loadingView=");
        LIZ.append(this.LIZ);
        LIZ.append(", emptyView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorRetryView=");
        LIZ.append(this.LIZJ);
        LIZ.append(", downloadIconConfig=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", downloadingIconConfig=");
        LIZ.append(this.LJ);
        LIZ.append(", resourceImageConfig=");
        LIZ.append(this.LJFF);
        LIZ.append(", resourceTextConfig=");
        LIZ.append(this.LJI);
        LIZ.append(", itemSelectorConfig=");
        LIZ.append(this.LJII);
        LIZ.append(", firstNullItemConfig=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", customItemConfig=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass550(C1295856s c1295856s, C1296156v c1296156v, C1295956t c1295956t, int i) {
        AnonymousClass552 downloadingIconConfig;
        C57B resourceTextConfig;
        AnonymousClass553 firstNullItemConfig;
        C55U customItemConfig;
        C1295956t itemSelectorConfig = c1295956t;
        C1295856s downloadIconConfig = c1295856s;
        C1296156v resourceImageConfig = c1296156v;
        downloadIconConfig = (i & 8) != 0 ? new C1295856s(0, 0, 0, null, 127) : downloadIconConfig;
        if ((i & 16) != 0) {
            downloadingIconConfig = new AnonymousClass552(0);
        } else {
            downloadingIconConfig = null;
        }
        resourceImageConfig = (i & 32) != 0 ? new C1296156v(0, 0, 0, 0, 0, 0.0f, 511) : resourceImageConfig;
        if ((i & 64) != 0) {
            resourceTextConfig = new C57B(0, 0, null, 0, 0.0f, null, null, 1023);
        } else {
            resourceTextConfig = null;
        }
        itemSelectorConfig = (i & 128) != 0 ? new C1295956t(false, 0, 0, 0, 255) : itemSelectorConfig;
        if ((i & 256) != 0) {
            firstNullItemConfig = new AnonymousClass553(false, 0, false, null, null, 127);
        } else {
            firstNullItemConfig = null;
        }
        if ((i & 512) != 0) {
            customItemConfig = new C55U(0);
        } else {
            customItemConfig = null;
        }
        o.LJIIIZ(downloadIconConfig, "downloadIconConfig");
        o.LJIIIZ(downloadingIconConfig, "downloadingIconConfig");
        o.LJIIIZ(resourceImageConfig, "resourceImageConfig");
        o.LJIIIZ(resourceTextConfig, "resourceTextConfig");
        o.LJIIIZ(itemSelectorConfig, "itemSelectorConfig");
        o.LJIIIZ(firstNullItemConfig, "firstNullItemConfig");
        o.LJIIIZ(customItemConfig, "customItemConfig");
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = downloadIconConfig;
        this.LJ = downloadingIconConfig;
        this.LJFF = resourceImageConfig;
        this.LJI = resourceTextConfig;
        this.LJII = itemSelectorConfig;
        this.LJIIIIZZ = firstNullItemConfig;
        this.LJIIIZ = customItemConfig;
    }
}
