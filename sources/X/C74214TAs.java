package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TAs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74214TAs {
    public static /* synthetic */ C74211TAp LIZIZ(boolean z, ViewGroup viewGroup, boolean z2, EnumC74213TAr enumC74213TAr, int i) {
        EnumC74213TAr enumC74213TAr2 = enumC74213TAr;
        if ((i & 8) != 0) {
            enumC74213TAr2 = EnumC74213TAr.ONLINE;
        }
        return LIZ(z, viewGroup, z2, enumC74213TAr2, null, null);
    }

    public static C74211TAp LIZ(boolean z, ViewGroup parent, boolean z2, EnumC74213TAr headerType, String str, String str2) {
        int i;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(headerType, "headerType");
        if (z) {
            i = R.layout.ni;
        } else {
            i = R.layout.ng;
        }
        return new C74211TAp(C1FL.LIZIZ(parent, i, parent, false, "from(parent.context).inf…te(layout, parent, false)"), z2, headerType, str, str2);
    }
}
