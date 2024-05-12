package com.ss.android.ugc.sdk.channel.third.facebook;

import X.AbstractC62223ObT;
import X.AbstractC62625Ohx;
import X.C03880Dg;
import X.C224878s7;
import X.C32I;
import X.C39519Ff9;
import X.C52222KeY;
import X.C62224ObU;
import X.C62313Ocv;
import X.C62314Ocw;
import X.C62494Ofq;
import X.C62670Oig;
import X.C62673Oij;
import X.C65300Pk0;
import X.C84763XOl;
import X.InterfaceC62573Oh7;
import X.OYP;
import X.X1D;
import Y.AObjectS128S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class FacebookChannel extends IWrapChannel {
    @Override // X.AbstractC62304Ocm, X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJIFFI() {
        return "facebook";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJII() {
        return "com.facebook.katana";
    }

    public final Intent LJJIIZ(Context context, AbstractC62625Ohx shareContent) {
        Intent LJJIIZI;
        o.LJIIIZ(shareContent, "shareContent");
        if (shareContent instanceof C62224ObU) {
            if (C224878s7.LIZ(context, "com.facebook.katana")) {
                Intent LJIJJLI = LJIJJLI(context, (C62224ObU) shareContent);
                LJJIIZI = LJJIIZI(context, LJIJJLI);
                if (LJJIIZI == null) {
                    return LJIJJLI;
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("https://www.facebook.com/sharer/sharer.php?u=");
                LIZ.append(AbstractC62223ObT.LJIJI((C62224ObU) shareContent));
                LJJIIZI = new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ)));
            }
        } else if (shareContent instanceof C62313Ocv) {
            Intent LJIL = LJIL(context, (C62313Ocv) shareContent);
            LJJIIZI = LJJIIZI(context, LJIL);
            if (LJJIIZI == null) {
                return LJIL;
            }
        } else if (shareContent instanceof C62314Ocw) {
            Intent LJJ = LJJ(context, (C62314Ocw) shareContent);
            LJJIIZI = LJJIIZI(context, LJJ);
            if (LJJIIZI == null) {
                return LJJ;
            }
        } else {
            return null;
        }
        return LJJIIZI;
    }

    public final Intent LJJIIZI(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "613109479778971004"));
        if (LIZJ.LIZ) {
            queryIntentActivities = (List) LIZJ.LIZIZ;
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        o.LJIIIIZZ(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
        ArrayList arrayList = new ArrayList(C32I.LJJL(queryIntentActivities, 10));
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().activityInfo.name);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String targetActivity = (String) it2.next();
            o.LJIIIIZZ(targetActivity, "targetActivity");
            if (s.LJJJLZIJ(targetActivity, "ImplicitShareIntentHandler", false)) {
                intent.setClassName("com.facebook.katana", targetActivity);
                return intent;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIII(OYP content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        if (C52222KeY.LIZ()) {
            Intent LJJIIZ = LJJIIZ(activity, content);
            if (LJJIIZ == null) {
                return false;
            }
            return LJIJJ(activity, LJJIIZ);
        }
        C62673Oij.LIZ = true;
        if (C62670Oig.LIZIZ(activity) && !C62494Ofq.LJ.LIZJ(activity)) {
            return false;
        }
        FacebookShareActivity.LJLJJL = interfaceC62573Oh7;
        String str = "";
        if (C62494Ofq.LJ.LIZJ(activity)) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || C62494Ofq.LJ.LIZJ(LJIIIIZZ)) {
                C62670Oig.LIZ(new AqS157S0200000_10(activity, content, 16));
            } else {
                Uri parse = UriProtector.parse(content.LIZLLL);
                o.LJIIIIZZ(parse, "parse(content.url)");
                String str2 = content.LIZJ;
                if (str2 != null) {
                    str = str2;
                }
                C62673Oij.LIZJ(activity, parse, "link_share", "landscape_link_share", str);
            }
            return C62673Oij.LIZ;
        }
        Uri parse2 = UriProtector.parse(content.LIZLLL);
        o.LJIIIIZZ(parse2, "parse(content.url)");
        String str3 = content.LIZJ;
        if (str3 != null) {
            str = str3;
        }
        C62673Oij.LIZJ(activity, parse2, "link_share", "non_landscape_link_share", str);
        return C62673Oij.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIIJ(C62313Ocv content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        if (C52222KeY.LIZ()) {
            Intent LJJIIZ = LJJIIZ(activity, content);
            if (LJJIIZ == null) {
                return false;
            }
            return LJIJJ(activity, LJJIIZ);
        }
        C62673Oij.LIZ = true;
        if (C62670Oig.LIZIZ(activity) && !C62494Ofq.LJ.LIZJ(activity)) {
            return false;
        }
        FacebookShareActivity.LJLJJL = interfaceC62573Oh7;
        if (C62494Ofq.LJ.LIZJ(activity)) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || C62494Ofq.LJ.LIZJ(LJIIIIZZ)) {
                C62670Oig.LIZ(new AqS160S0100000_10(content, 370));
                return true;
            }
            C62673Oij.LIZ(content, LJIIIIZZ, new AObjectS128S0200000_10(LJIIIIZZ, content, 0));
            return true;
        }
        return C62673Oij.LIZ(content, activity, new AObjectS128S0200000_10(activity, content, 1));
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJIIJZLJL(C62314Ocw content, Activity activity, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        if (C52222KeY.LIZ()) {
            Intent LJJIIZ = LJJIIZ(activity, content);
            if (LJJIIZ == null) {
                return false;
            }
            return LJIJJ(activity, LJJIIZ);
        }
        C62673Oij.LIZ = true;
        if (C62670Oig.LIZIZ(activity) && !C62494Ofq.LJ.LIZJ(activity)) {
            return false;
        }
        FacebookShareActivity.LJLJJL = interfaceC62573Oh7;
        if (C62494Ofq.LJ.LIZJ(activity)) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || C62494Ofq.LJ.LIZJ(LJIIIIZZ)) {
                C62670Oig.LIZ(new AqS160S0100000_10(content, 371));
            } else {
                C62673Oij.LIZJ(LJIIIIZZ, content.LIZIZ, "video_share", "landscape_video_share", "");
            }
            return C62673Oij.LIZ;
        }
        C62673Oij.LIZJ(activity, content.LIZIZ, "video_share", "non_landscape_video_share", "");
        return C62673Oij.LIZ;
    }
}
