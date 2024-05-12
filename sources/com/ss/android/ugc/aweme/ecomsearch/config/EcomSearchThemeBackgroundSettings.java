package com.ss.android.ugc.aweme.ecomsearch.config;

import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcomSearchThemeBackgroundSettings {
    public static final EcomSearchThemeBackgroundModel LIZ = new EcomSearchThemeBackgroundModel(C47261Igj.LJJIJ("https://sf16-sg.tiktokcdn.com/obj/eden-sg/1230eh7pldvhpenuhog/searchbg.png"));

    /* loaded from: classes7.dex */
    public static final class EcomSearchThemeBackgroundModel {

        @InterfaceC65349Pkn("ecom_search_default_background")
        public final List<String> ecomSearchDefaultBackground;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcomSearchThemeBackgroundModel) && o.LJ(this.ecomSearchDefaultBackground, ((EcomSearchThemeBackgroundModel) obj).ecomSearchDefaultBackground);
        }

        public final int hashCode() {
            return this.ecomSearchDefaultBackground.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcomSearchThemeBackgroundModel(ecomSearchDefaultBackground=");
            return C1NE.LIZIZ(LIZ, this.ecomSearchDefaultBackground, ')', LIZ);
        }

        public EcomSearchThemeBackgroundModel(List<String> ecomSearchDefaultBackground) {
            o.LJIIIZ(ecomSearchDefaultBackground, "ecomSearchDefaultBackground");
            this.ecomSearchDefaultBackground = ecomSearchDefaultBackground;
        }
    }
}
