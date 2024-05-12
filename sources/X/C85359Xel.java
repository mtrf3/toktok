package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import kotlin.jvm.internal.o;

/* renamed from: X.Xel, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85359Xel implements InterfaceC87283bg {
    public final AVPublishContentType LJLIL;
    public final ExtensionMisc LJLILLLLZI;
    public final PoiData LJLJI;
    public final EnumC85244Xcu LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85359Xel)) {
            return false;
        }
        C85359Xel c85359Xel = (C85359Xel) obj;
        return this.LJLIL == c85359Xel.LJLIL && o.LJ(this.LJLILLLLZI, c85359Xel.LJLILLLLZI) && o.LJ(this.LJLJI, c85359Xel.LJLJI) && this.LJLJJI == c85359Xel.LJLJJI;
    }

    public final int hashCode() {
        int hashCode = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        PoiData poiData = this.LJLJI;
        return this.LJLJJI.hashCode() + ((hashCode + (poiData == null ? 0 : poiData.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiPublishExtensionDataV2(contentType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", extensionMisc=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", poiItem=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pageScene=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C85359Xel(AVPublishContentType contentType, ExtensionMisc extensionMisc, PoiData poiData, EnumC85244Xcu pageScene) {
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(extensionMisc, "extensionMisc");
        o.LJIIIZ(pageScene, "pageScene");
        this.LJLIL = contentType;
        this.LJLILLLLZI = extensionMisc;
        this.LJLJI = poiData;
        this.LJLJJI = pageScene;
    }
}
