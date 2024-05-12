package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import com.ss.android.ugc.aweme.share.base.model.TargetClassItem;
import com.ss.android.ugc.aweme.share.base.model.TargetComponentInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ocu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62312Ocu extends AbstractC62304Ocm {
    public Intent LJLIL;
    public Intent LJLILLLLZI;
    public Intent LJLJI;
    public final ShareChannelInfo LJLJJI;

    public static List LJJIFFI(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "8541710589838488974"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 65536);
    }

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return this.LJLJJI.packageName;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return this.LJLJJI.channelKey;
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return this.LJLJJI.labelName;
    }

    public C62312Ocu(ShareChannelInfo shareChannelInfo) {
        o.LJIIIZ(shareChannelInfo, "shareChannelInfo");
        this.LJLJJI = shareChannelInfo;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        Drawable drawable;
        C25600zU LJJL;
        LayerDrawable layerDrawable = null;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            SY9 LIZ = new C2068389v().LIZ(LJJL);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.em);
            c110614Vt.LJII = C7MY.LIZIZ(48);
            c110614Vt.LJI = C7MY.LIZIZ(48);
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            layerDrawable = C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(LJJL));
        }
        java.util.Map map = (java.util.Map) C62321Od3.LIZ.getValue();
        if (map == null || (drawable = (Drawable) map.get(this.LJLJJI.channelKey)) == null) {
            return layerDrawable;
        }
        return drawable;
    }

    public static String LJJIII(int i, ShareChannelInfo shareChannelInfo) {
        List<TargetClassItem> list;
        o.LJIIIZ(shareChannelInfo, "shareChannelInfo");
        TargetComponentInfo targetComponentInfo = shareChannelInfo.targetComponentInfo;
        if (targetComponentInfo == null || (list = targetComponentInfo.targetClassNameList) == null || list.isEmpty()) {
            return "";
        }
        for (TargetClassItem targetClassItem : targetComponentInfo.targetClassNameList) {
            if (targetClassItem.shareMode == i) {
                return targetClassItem.targetClassName;
            }
        }
        return "";
    }

    public final Intent LJJII(Context context, String str) {
        boolean z;
        TargetComponentInfo targetComponentInfo;
        List<Integer> list;
        List<Integer> list2;
        boolean z2;
        TargetComponentInfo targetComponentInfo2;
        List<Integer> list3;
        List<Integer> list4;
        boolean z3;
        TargetComponentInfo targetComponentInfo3;
        List<Integer> list5;
        List<Integer> list6;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        String type = intent.getType();
        String str2 = "";
        Intent intent2 = null;
        if (type != null) {
            int hashCode = type.hashCode();
            if (hashCode != 452781974) {
                if (hashCode != 817335912) {
                    if (hashCode == 1911932022 && type.equals("image/*")) {
                        String LJJIII = LJJIII(4, this.LJLJJI);
                        if (LJJIII == null || LJJIII.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 || ((targetComponentInfo3 = this.LJLJJI.targetComponentInfo) != null && (list6 = targetComponentInfo3.shareModes) != null && !list6.contains(4))) {
                            intent.setPackage(this.LJLJJI.packageName);
                        } else {
                            TargetComponentInfo targetComponentInfo4 = this.LJLJJI.targetComponentInfo;
                            if (targetComponentInfo4 == null || (list5 = targetComponentInfo4.shareModes) == null || !list5.contains(4)) {
                                return null;
                            }
                            String str3 = this.LJLJJI.packageName;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            intent.setClassName(str2, LJJIII);
                            return intent;
                        }
                    }
                } else if (type.equals("text/plain")) {
                    String LJJIII2 = LJJIII(0, this.LJLJJI);
                    if (LJJIII2 == null || LJJIII2.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || ((targetComponentInfo2 = this.LJLJJI.targetComponentInfo) != null && (list4 = targetComponentInfo2.shareModes) != null && !list4.contains(0))) {
                        intent.setPackage(this.LJLJJI.packageName);
                    } else {
                        TargetComponentInfo targetComponentInfo5 = this.LJLJJI.targetComponentInfo;
                        if (targetComponentInfo5 != null && (list3 = targetComponentInfo5.shareModes) != null && list3.contains(0)) {
                            String str4 = this.LJLJJI.packageName;
                            if (str4 != null) {
                                str2 = str4;
                            }
                            intent.setClassName(str2, LJJIII2);
                            return intent;
                        }
                        return LJJII(context, "video/*");
                    }
                }
            } else if (type.equals("video/*")) {
                String LJJIII3 = LJJIII(1, this.LJLJJI);
                if (LJJIII3 == null || LJJIII3.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || ((targetComponentInfo = this.LJLJJI.targetComponentInfo) != null && (list2 = targetComponentInfo.shareModes) != null && !list2.contains(1))) {
                    intent.setPackage(this.LJLJJI.packageName);
                } else {
                    TargetComponentInfo targetComponentInfo6 = this.LJLJJI.targetComponentInfo;
                    if (targetComponentInfo6 == null || (list = targetComponentInfo6.shareModes) == null || !list.contains(1)) {
                        return null;
                    }
                    String str5 = this.LJLJJI.packageName;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    intent.setClassName(str2, LJJIII3);
                    return intent;
                }
            }
        }
        try {
            List LJJIFFI = LJJIFFI(context.getPackageManager(), intent);
            o.LJIIIIZZ(LJJIFFI, "context.packageManager.q…FAULT_ONLY,\n            )");
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIFFI, 10));
            Iterator it = LJJIFFI.iterator();
            while (it.hasNext()) {
                arrayList.add(((ResolveInfo) it.next()).activityInfo.name);
            }
            if (!(!arrayList.isEmpty())) {
                return null;
            }
            String str6 = this.LJLJJI.packageName;
            if (str6 != null) {
                str2 = str6;
            }
            intent2 = intent.setClassName(str2, (String) ListProtector.get(arrayList, 0));
            return intent2;
        } catch (Exception unused) {
            return intent2;
        }
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = this.LJLIL;
        if (intent != null || (intent = LJJII(context, "text/plain")) != null) {
            intent.putExtra("android.intent.extra.TEXT", AbstractC62223ObT.LJIJI(content));
            return LJIJJ(context, intent);
        }
        return false;
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = this.LJLJI;
        if (intent == null) {
            intent = LJJII(context, "image/*");
        }
        String LIZ = C62311Oct.LIZ(content);
        if (intent != null) {
            intent.putExtra("android.intent.extra.STREAM", content.LIZIZ);
            intent.putExtra("android.intent.extra.TEXT", LIZ);
            return LJIJJ(context, intent);
        }
        return false;
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Intent intent = this.LJLILLLLZI;
        if (intent == null) {
            intent = LJJII(context, "video/*");
        }
        String LIZ = C62311Oct.LIZ(content);
        if (intent != null) {
            intent.putExtra("android.intent.extra.STREAM", content.LIZIZ);
            intent.putExtra("android.intent.extra.TEXT", LIZ);
            return LJIJJ(context, intent);
        }
        return false;
    }
}
