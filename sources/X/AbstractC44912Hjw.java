package X;

import Y.AgS75S0300000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hjw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44912Hjw {
    public abstract void LJII(Context context, C44913Hjx c44913Hjx);

    public void LIZJ(Activity activity, Context context, Aweme aweme, SharePackage sharePackage, String downloadMethod, String eventType, C7C5 getEnterFromListener) {
        String str;
        String string;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(getEnterFromListener, "getEnterFromListener");
        C44938HkM.LJIIIIZZ = "download";
        Z8A z8a = Z8A.LIZIZ;
        Bundle bundle = sharePackage.extras;
        if (bundle != null) {
            str = bundle.getString("enter_from");
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Bundle bundle2 = sharePackage.extras;
        if (bundle2 != null && (string = bundle2.getString("enter_method")) != null) {
            str2 = string;
        }
        if (z8a.isFromProfileLongPress(str, str2)) {
            C44938HkM.LJ = aweme;
        }
        sharePackage.extras.putString("download_method", downloadMethod);
        if (!C4LD.LIZIZ.LJIL(context, aweme, downloadMethod)) {
            return;
        }
        C44914Hjy c44914Hjy = new C44914Hjy();
        c44914Hjy.LIZ = getEnterFromListener.getEnterFrom(true);
        c44914Hjy.LIZIZ = downloadMethod;
        c44914Hjy.LJFF = aweme;
        c44914Hjy.LJ = sharePackage;
        c44914Hjy.LIZJ = eventType;
        c44914Hjy.LIZLLL = sharePackage.extras.getInt("page_type");
        C44913Hjx c44913Hjx = new C44913Hjx(c44914Hjy);
        if (C4LD.LIZIZ.LJJIJ(context, activity, c44913Hjx, new AqS189S0100000_7(this, 76))) {
            C10K.LIZJ(CallableC44911Hjv.LJLIL).LJ(new AgS75S0300000_7(activity, this, c44913Hjx, 5), C10K.LJIIIIZZ, null);
        }
    }
}
