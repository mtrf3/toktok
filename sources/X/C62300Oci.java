package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Oci, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62300Oci extends AbstractC62304Ocm {
    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.facebook.katana";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "facebook_group";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Facebook Group";
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.f9, LJJL);
            if (LJIIIZ != null) {
                i = LJIIIZ.intValue();
            } else {
                i = 0;
            }
            c2068389v.LIZ = i;
            return c2068389v.LIZ(LJJL);
        }
        return null;
    }

    public static final Intent LJJII(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        o.LJIIIZ(context, "context");
        PackageManager packageManager = context.getPackageManager();
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-5001619552233327943"));
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
            if (s.LJJJLZIJ(targetActivity, "ShareToGroupsAlias", false)) {
                intent.setClassName("com.facebook.katana", targetActivity);
                return intent;
            }
        }
        return null;
    }

    public final Intent LJJIFFI(Context context, AbstractC62625Ohx shareContent) {
        Intent LJJII;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(shareContent, "shareContent");
        if (shareContent instanceof C62224ObU) {
            if (C224878s7.LIZ(context, "com.facebook.katana")) {
                Intent LJIJJLI = LJIJJLI(context, (C62224ObU) shareContent);
                LJJII = LJJII(context, LJIJJLI);
                if (LJJII == null) {
                    return LJIJJLI;
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("https://www.facebook.com/sharer/sharer.php?u=");
                LIZ.append(AbstractC62223ObT.LJIJI((C62224ObU) shareContent));
                LJJII = new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ)));
            }
        } else if (shareContent instanceof C62313Ocv) {
            Intent LJIL = LJIL(context, (C62313Ocv) shareContent);
            LJJII = LJJII(context, LJIL);
            if (LJJII == null) {
                return LJIL;
            }
        } else if (shareContent instanceof C62314Ocw) {
            Intent LJJ = LJJ(context, (C62314Ocw) shareContent);
            LJJII = LJJII(context, LJJ);
            if (LJJII == null) {
                return LJJ;
            }
        } else {
            return null;
        }
        return LJJII;
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent LJJIFFI = LJJIFFI(context, content);
        if (LJJIFFI != null) {
            return LJIJJ(context, LJJIFFI);
        }
        return false;
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent LJJIFFI = LJJIFFI(context, content);
        if (LJJIFFI != null) {
            return LJIJJ(context, LJJIFFI);
        }
        return false;
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent LJJIFFI = LJJIFFI(context, content);
        if (LJJIFFI != null) {
            return LJIJJ(context, LJJIFFI);
        }
        return false;
    }
}
