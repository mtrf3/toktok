package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationPlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Oe9 */
/* loaded from: classes11.dex */
public final class C62389Oe9 {
    public static void LIZJ(Context context, Aweme aweme, String channelKey, String str) {
        String str2;
        Long l;
        String userAgent;
        String str3;
        String obj;
        String str4;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(channelKey, "channelKey");
        o.LJIIIZ(context, "context");
        C8BR c8br = new C8BR();
        c8br.LJJ(new C43169Gwv());
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = aweme.getAid();
        c62683Oit.LIZIZ = 1;
        c62683Oit.LJ = 0;
        c62683Oit.LJI = 1;
        c62683Oit.LJII = channelKey;
        if (aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            Long l2 = null;
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getLogExtra();
            } else {
                str2 = null;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                l = awemeRawAd2.getAdId();
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                l2 = awemeRawAd3.getCreativeId();
            }
            String valueOf2 = String.valueOf(l2);
            c62683Oit.LJJI = valueOf;
            if (str2 != null) {
                c62683Oit.LJJIFFI = str2;
            }
            c62683Oit.LJJ = valueOf2;
            userAgent = FLE.LIZ("other");
            o.LJIIIZ(userAgent, "userAgent");
            c62683Oit.LJJII = userAgent;
            String LLJILJILJ = C16880lQ.LLJILJILJ(context);
            o.LJIIIIZZ(LLJILJILJ, "getNetworkAccessType(context)");
            c62683Oit.LJJIIJZLJL = LLJILJILJ;
            String packageName = context.getPackageName();
            o.LJIIIIZZ(packageName, "context.packageName");
            c62683Oit.LJJIII = packageName;
            Pair<String, Boolean> LIZ = C39247Fal.LIZ(context);
            if (LIZ != null && (str4 = (String) LIZ.first) != null) {
                c62683Oit.LJJIIJ = str4;
            }
            java.util.Map<String, Object> LIZ2 = EngagementTraceImpl.LIZIZ().LIZ();
            Object obj2 = LIZ2.get("duration");
            String str5 = "";
            if (obj2 == null || (str3 = obj2.toString()) == null) {
                str3 = "";
            }
            c62683Oit.LJJIJ = str3;
            Object obj3 = LIZ2.get("play_order");
            if (obj3 != null && (obj = obj3.toString()) != null) {
                str5 = obj;
            }
            c62683Oit.LJJIJIIJI = str5;
        } else {
            c62683Oit.LJJIIZI = str;
        }
        c8br.LJIILL(c62683Oit.LIZ());
    }

    public static void LIZ(Aweme aweme, C62394OeE c62394OeE, Activity activity, String enterFrom, String enterMethod, boolean z, ArrayList forbiddenList) {
        boolean z2;
        String str;
        Bundle bundle;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(forbiddenList, "forbiddenList");
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        OperationPlatform operationPlatform = null;
        if (LIZ != null) {
            operationPlatform = LIZ.operationPlatform;
        }
        c62394OeE.LJIJ = true;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        c62394OeE.LJI = true;
        BaseSharePackage baseSharePackage = c62394OeE.LJIIZILJ;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
            z2 = bundle.getBoolean("is_async_sort");
        } else {
            z2 = false;
        }
        BaseSharePackage baseSharePackage2 = c62394OeE.LJIIZILJ;
        if (baseSharePackage2 == null || (str = baseSharePackage2.itemType) == null) {
            str = "";
        }
        c62394OeE.LJFF(new C62355Odb(str, z2, 2));
        c62394OeE.LJIIJJI = new AqS176S0100000_10(operationPlatform, 252);
        c62394OeE.LJJII = !z;
        List LIZ2 = C62280OcO.LIZ(aweme, new C62297Ocf(new C62550Ogk(activity), new AqS62S1100000_9(aweme, enterMethod, 7)), forbiddenList);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ2, 10));
        Iterator it = ((ArrayList) LIZ2).iterator();
        while (it.hasNext()) {
            c62394OeE.LIZIZ((InterfaceC62225ObV) it.next());
            arrayList.add(c62394OeE);
        }
    }

    public static /* synthetic */ void LIZIZ(Aweme aweme, C62394OeE c62394OeE, Activity activity, String str, String str2, boolean z, int i) {
        ArrayList arrayList;
        boolean z2 = z;
        Activity activity2 = activity;
        String str3 = str;
        if ((i & 4) != 0) {
            activity2 = C84763XOl.LJIIIIZZ();
        }
        String str4 = "";
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) == 0) {
            str4 = str2;
        }
        if ((i & 32) != 0) {
            z2 = true;
        }
        if ((i & 64) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        LIZ(aweme, c62394OeE, activity2, str3, str4, z2, arrayList);
    }
}
