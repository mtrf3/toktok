package defpackage;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArticleModeIntroBottomSheetModel {

    @InterfaceC65349Pkn("dark_mode")
    public final String darkModeUrl;

    @InterfaceC65349Pkn("light_mode")
    public final String lightModeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ArticleModeIntroBottomSheetModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleModeIntroBottomSheetModel)) {
            return false;
        }
        ArticleModeIntroBottomSheetModel articleModeIntroBottomSheetModel = (ArticleModeIntroBottomSheetModel) obj;
        return o.LJ(this.lightModeUrl, articleModeIntroBottomSheetModel.lightModeUrl) && o.LJ(this.darkModeUrl, articleModeIntroBottomSheetModel.darkModeUrl);
    }

    public final int hashCode() {
        String str = this.lightModeUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkModeUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ArticleModeIntroBottomSheetModel(lightModeUrl=");
        LIZ.append(this.lightModeUrl);
        LIZ.append(", darkModeUrl=");
        return q.LIZIZ(LIZ, this.darkModeUrl, ')', LIZ);
    }

    public ArticleModeIntroBottomSheetModel(String str, String str2) {
        this.lightModeUrl = str;
        this.darkModeUrl = str2;
    }

    public /* synthetic */ ArticleModeIntroBottomSheetModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "https://p16.tiktokcdn.com/obj/tiktok-obj/article_mode_1_light.webp" : str, (i & 2) != 0 ? "https://p16.tiktokcdn.com/obj/tiktok-obj/article_mode_1_dark.webp" : str2);
    }
}
