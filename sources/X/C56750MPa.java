package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;

/* renamed from: X.MPa */
/* loaded from: classes10.dex */
public final class C56750MPa {
    public static /* synthetic */ AbsUserCardInboxWidget LIZ(InterfaceC57702Mkk interfaceC57702Mkk, Fragment fragment, int i, int i2) {
        return interfaceC57702Mkk.LJI(fragment, i, null, MSJ.LJI, i2);
    }

    public static /* synthetic */ void LIZIZ(InterfaceC57702Mkk interfaceC57702Mkk, Context context, User user, String str, String str2, String str3, String str4, String str5, int i) {
        String str6 = str3;
        String str7 = str2;
        String str8 = str5;
        String str9 = "";
        if ((i & 8) != 0) {
            str7 = "";
        }
        if ((i & 16) != 0) {
            str6 = "";
        }
        if ((i & 32) == 0) {
            str9 = str4;
        }
        if ((i & 64) != 0) {
            str8 = null;
        }
        interfaceC57702Mkk.LJFF(context, user, str, str7, str6, str9, str8);
    }
}
