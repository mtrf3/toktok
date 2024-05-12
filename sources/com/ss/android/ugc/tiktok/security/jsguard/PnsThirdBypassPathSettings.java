package com.ss.android.ugc.tiktok.security.jsguard;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PnsThirdBypassPathSettings {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes7.dex */
    public static final class PnsThirdBypassPathModel {

        @InterfaceC65349Pkn("first_jump")
        public final List<String> firstJump;

        @InterfaceC65349Pkn("single_page")
        public final List<String> singlePage;

        @InterfaceC65349Pkn("third_initial_page")
        public final List<String> thirdInitialPage;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PnsThirdBypassPathModel)) {
                return false;
            }
            PnsThirdBypassPathModel pnsThirdBypassPathModel = (PnsThirdBypassPathModel) obj;
            return o.LJ(this.firstJump, pnsThirdBypassPathModel.firstJump) && o.LJ(this.singlePage, pnsThirdBypassPathModel.singlePage) && o.LJ(this.thirdInitialPage, pnsThirdBypassPathModel.thirdInitialPage);
        }

        public final int hashCode() {
            List<String> list = this.firstJump;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.singlePage;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.thirdInitialPage;
            return hashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PnsThirdBypassPathModel(firstJump=");
            LIZ.append(this.firstJump);
            LIZ.append(", singlePage=");
            LIZ.append(this.singlePage);
            LIZ.append(", thirdInitialPage=");
            return C1NE.LIZIZ(LIZ, this.thirdInitialPage, ')', LIZ);
        }

        public PnsThirdBypassPathModel(List<String> list, List<String> list2, List<String> list3) {
            this.firstJump = list;
            this.singlePage = list2;
            this.thirdInitialPage = list3;
        }
    }

    public static final PnsThirdBypassPathModel LIZ() {
        PnsThirdBypassPathModel pnsThirdBypassPathModel = (PnsThirdBypassPathModel) SettingsManager.LIZLLL().LJIIIIZZ("pns_third_bypass_path", PnsThirdBypassPathModel.class, null);
        if (pnsThirdBypassPathModel == null) {
            return null;
        }
        return pnsThirdBypassPathModel;
    }
}
