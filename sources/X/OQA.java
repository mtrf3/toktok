package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OQA {
    public static /* synthetic */ DialogC62475OfX LIZIZ(ShareDependService shareDependService, Activity activity, C62387Oe7 c62387Oe7) {
        return shareDependService.LJI(activity, c62387Oe7, R.style.a6u);
    }

    public static /* synthetic */ InterfaceC62225ObV LIZ(ShareDependService shareDependService, SharePackage sharePackage, String str, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        return shareDependService.LJJIJIIJI(sharePackage, str);
    }

    public static /* synthetic */ TuxSheet LIZLLL(ShareDependService shareDependService, Activity activity, C62387Oe7 c62387Oe7, Integer num, Bundle bundle, boolean z, int i) {
        if ((i & 8) != 0) {
            bundle = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return shareDependService.LJJIIJ(activity, c62387Oe7, bundle, z);
    }

    public static /* synthetic */ void LIZJ(ShareDependService shareDependService, Aweme aweme, String str, Context context, String str2, String str3, String str4, int i) {
        String str5 = str4;
        if ((i & 64) != 0) {
            str5 = "";
        }
        shareDependService.LJ(aweme, str, context, str2, str3, "", str5, 0);
    }
}
