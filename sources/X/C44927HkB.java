package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HkB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44927HkB {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ() {
        String str;
        String[] strArr;
        C12410eD LJI = C12460eI.LJI();
        String str2 = "";
        if (LJI == null) {
            return "";
        }
        String[] strArr2 = (String[]) s.LJLJJL(LJI.LIZIZ, new String[]{"."}, 0, 6).toArray(new String[0]);
        if (strArr2.length > 1) {
            str = strArr2[1];
        } else {
            str = "b0";
        }
        String str3 = LJI.LIZJ;
        if (str3 != null && (strArr = (String[]) s.LJLJJL(str3, new String[]{"."}, 0, 6).toArray(new String[0])) != null && strArr.length > 1) {
            str2 = strArr[1];
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return C00F.LIZIZ(str2, ',', str);
    }

    public static String LIZJ(Aweme aweme) {
        if (AVExternalServiceImpl.LIZ().publishService().enableEffectWatermark()) {
            List<String> viralEffectIds = AVExternalServiceImpl.LIZ().publishService().viralEffectIds();
            o.LJIIIIZZ(viralEffectIds, "get().getService(IExtern…ervice().viralEffectIds()");
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors == null) {
                return "";
            }
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                Iterator<String> it = viralEffectIds.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), anchorCommonStruct.getId())) {
                        return anchorCommonStruct.getId();
                    }
                }
            }
        }
        return "";
    }

    public static boolean LIZLLL(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return false;
        }
        if (aweme.nowPostInfo != null) {
            z = true;
        } else {
            z = false;
        }
        if (!C54218LPq.LJLIL.LIZ() || !z) {
            return false;
        }
        return true;
    }

    public static void LIZ(Activity context, TokenCert tokenCert, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tokenCert, "tokenCert");
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 33) {
            int LIZ2 = C04330Ez.LIZ(context, "android.permission.READ_MEDIA_VIDEO");
            int LIZ3 = C04330Ez.LIZ(context, "android.permission.READ_MEDIA_IMAGES");
            StringBuilder LIZJ = C06460Ne.LIZJ("download pre check permission, result: ", LIZ2, " / ", LIZ3, ", is granted: ");
            if (LIZ2 == 0) {
                z = true;
            } else {
                z = false;
            }
            LIZJ.append(z);
            LIZJ.append(" / ");
            if (LIZ3 == 0) {
                z2 = true;
            }
            LIZJ.append(z2);
            C36922EeM.LIZLLL(4, "download-request-permission", X1D.LIZIZ(LIZJ));
            if (LIZ2 == 0 && LIZ3 == 0) {
                interfaceC65784Pro.invoke();
                return;
            } else {
                OYF.LJII(context, tokenCert, interfaceC65784Pro);
                return;
            }
        }
        int LIZ4 = C04330Ez.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        StringBuilder LJ = C7MY.LJ("download pre check permission, result: ", LIZ4, ", is granted: ");
        if (LIZ4 == 0) {
            z2 = true;
        }
        LJ.append(z2);
        C36922EeM.LIZLLL(4, "download-request-permission", X1D.LIZIZ(LJ));
        if (LIZ4 == 0) {
            interfaceC65784Pro.invoke();
        } else {
            OYF.LJII(context, tokenCert, interfaceC65784Pro);
        }
    }
}
