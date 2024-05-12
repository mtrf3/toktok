package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.3uI */
/* loaded from: classes2.dex */
public final class C98823uI {
    public static /* synthetic */ void LIZ(InterfaceC98813uH interfaceC98813uH, Context context, Bundle bundle, boolean z, Integer num, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        interfaceC98813uH.LJIILLIIL(context, bundle, z, num);
    }

    public static /* synthetic */ void LIZIZ(InterfaceC98813uH interfaceC98813uH, FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, boolean z, String str3, QuickDMEntranceAssem quickDMEntranceAssem, int i) {
        boolean z2 = z;
        String str4 = str2;
        String str5 = str3;
        QuickDMEntranceAssem quickDMEntranceAssem2 = quickDMEntranceAssem;
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        if ((i & 512) != 0) {
            quickDMEntranceAssem2 = null;
        }
        interfaceC98813uH.LJIIIIZZ(fragmentManager, user, aweme, str, str4, null, null, z2, str5, quickDMEntranceAssem2);
    }
}
