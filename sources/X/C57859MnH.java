package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.MnH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57859MnH implements Serializable {
    public final ActivityC45651qj LJLIL;
    public final Fragment LJLILLLLZI;
    public final C57846Mn4 LJLJI;
    public final C57867MnP LJLJJI;
    public final C57819Mmd LJLJJL;
    public final C57866MnO LJLJJLL;
    public final Bundle LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C57859MnH() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C57859MnH copy$default(C57859MnH c57859MnH, ActivityC45651qj activityC45651qj, Fragment fragment, C57846Mn4 c57846Mn4, C57867MnP c57867MnP, C57819Mmd c57819Mmd, C57866MnO c57866MnO, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            activityC45651qj = c57859MnH.LJLIL;
        }
        if ((i & 2) != 0) {
            fragment = c57859MnH.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c57846Mn4 = c57859MnH.LJLJI;
        }
        if ((i & 8) != 0) {
            c57867MnP = c57859MnH.LJLJJI;
        }
        if ((i & 16) != 0) {
            c57819Mmd = c57859MnH.LJLJJL;
        }
        if ((i & 32) != 0) {
            c57866MnO = c57859MnH.LJLJJLL;
        }
        if ((i & 64) != 0) {
            bundle = c57859MnH.LJLJL;
        }
        return c57859MnH.copy(activityC45651qj, fragment, c57846Mn4, c57867MnP, c57819Mmd, c57866MnO, bundle);
    }

    public final C57859MnH copy(ActivityC45651qj activityC45651qj, Fragment fragment, C57846Mn4 uiConfig, C57867MnP listConfig, C57819Mmd trackerConfig, C57866MnO apiConfig, Bundle bundle) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(listConfig, "listConfig");
        o.LJIIIZ(trackerConfig, "trackerConfig");
        o.LJIIIZ(apiConfig, "apiConfig");
        return new C57859MnH(activityC45651qj, fragment, uiConfig, listConfig, trackerConfig, apiConfig, bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57859MnH)) {
            return false;
        }
        C57859MnH c57859MnH = (C57859MnH) obj;
        return o.LJ(this.LJLIL, c57859MnH.LJLIL) && o.LJ(this.LJLILLLLZI, c57859MnH.LJLILLLLZI) && o.LJ(this.LJLJI, c57859MnH.LJLJI) && o.LJ(this.LJLJJI, c57859MnH.LJLJJI) && o.LJ(this.LJLJJL, c57859MnH.LJLJJL) && o.LJ(this.LJLJJLL, c57859MnH.LJLJJLL) && o.LJ(this.LJLJL, c57859MnH.LJLJL);
    }

    public int hashCode() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        int hashCode = (activityC45651qj == null ? 0 : activityC45651qj.hashCode()) * 31;
        Fragment fragment = this.LJLILLLLZI;
        int hashCode2 = (this.LJLJJLL.hashCode() + ((this.LJLJJL.hashCode() + ((this.LJLJJI.hashCode() + ((this.LJLJI.hashCode() + ((hashCode + (fragment == null ? 0 : fragment.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        Bundle bundle = this.LJLJL;
        return hashCode2 + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserCardConfig(hostActivity=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hostFragment=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", uiConfig=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listConfig=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", trackerConfig=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", apiConfig=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", arguments=");
        LIZ.append(this.LJLJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C57866MnO getApiConfig() {
        return this.LJLJJLL;
    }

    public final Bundle getArguments() {
        return this.LJLJL;
    }

    public final ActivityC45651qj getHostActivity() {
        return this.LJLIL;
    }

    public final Fragment getHostFragment() {
        return this.LJLILLLLZI;
    }

    public final C57867MnP getListConfig() {
        return this.LJLJJI;
    }

    public final C57819Mmd getTrackerConfig() {
        return this.LJLJJL;
    }

    public final C57846Mn4 getUiConfig() {
        return this.LJLJI;
    }

    public C57859MnH(ActivityC45651qj activityC45651qj, Fragment fragment, C57846Mn4 uiConfig, C57867MnP listConfig, C57819Mmd trackerConfig, C57866MnO apiConfig, Bundle bundle) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(listConfig, "listConfig");
        o.LJIIIZ(trackerConfig, "trackerConfig");
        o.LJIIIZ(apiConfig, "apiConfig");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = fragment;
        this.LJLJI = uiConfig;
        this.LJLJJI = listConfig;
        this.LJLJJL = trackerConfig;
        this.LJLJJLL = apiConfig;
        this.LJLJL = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C57859MnH(ActivityC45651qj activityC45651qj, Fragment fragment, C57846Mn4 c57846Mn4, C57867MnP c57867MnP, C57819Mmd c57819Mmd, C57866MnO c57866MnO, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activityC45651qj, (i & 2) != 0 ? null : fragment, (i & 4) != 0 ? new C57846Mn4(0) : c57846Mn4, (i & 8) != 0 ? new C57867MnP(0) : c57867MnP, (i & 16) != 0 ? new C57819Mmd(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 8191) : c57819Mmd, (i & 32) != 0 ? new C57866MnO(null, 131071) : c57866MnO, (i & 64) == 0 ? bundle : null);
    }
}
