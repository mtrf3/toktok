package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Ngm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60004Ngm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2) {
        boolean z = false;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return false;
        }
        if (TextUtils.isEmpty(str) || !(z = FCD.LJFF(EF7.LIZIZ(), str))) {
            if (!TextUtils.isEmpty(str2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(str2));
                return FCD.LJ(EF7.LIZIZ(), intent);
            }
            return z;
        }
        return z;
    }

    public static boolean LIZIZ(Context context, String str, String url) {
        o.LJIIIZ(url, "url");
        if (!C78857UxB.LJJIZ(EF7.LIZIZ(), str)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(url)) {
                if (ujb.o.LJJJLIIL(url, "intent://", false)) {
                    Intent parseUri = Intent.parseUri(url, 1);
                    parseUri.setFlags(268468224);
                    C16880lQ.LIZJ(context, parseUri);
                } else {
                    AnonymousClass004 anonymousClass004 = new AnonymousClass004();
                    anonymousClass004.LIZ().LIZ.setPackage(str);
                    anonymousClass004.LIZ().LIZ(context, UriProtector.parse(url));
                }
            } else {
                C16880lQ.LIZJ(context, FCD.LIZIZ(context, str));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
