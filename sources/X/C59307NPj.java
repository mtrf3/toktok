package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.NPj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59307NPj {
    /* JADX WARN: Can't wrap try/catch for region: R(58:1|(1:3)(2:225|(2:227|(1:232)))|4|(1:6)(2:174|(57:176|(1:224)(1:182)|183|(2:185|(3:187|(1:189)(8:195|(3:198|(2:200|201)(1:202)|196)|203|204|(1:206)|207|208|209)|190))(2:216|(3:218|219|(1:221)(0))(0))|191|(1:193)|194|8|(1:10)(1:173)|11|(2:15|(3:17|(3:21|(4:24|(3:26|27|28)(1:30)|29|22)|31)|32))|33|(1:35)(1:172)|36|(1:171)|38|(1:40)|41|(1:43)|44|45|46|47|(1:49)(1:166)|50|(6:52|(1:56)|57|(1:61)|62|(1:64)(2:65|(1:67)))|(1:69)|70|(1:165)(1:74)|75|(1:79)|80|(1:82)(1:164)|83|(1:85)(1:(4:157|(1:163)(1:161)|162|87))|88|(1:90)(1:155)|91|(1:154)|95|(1:97)|98|(1:100)|101|(1:104)|105|(1:107)(1:(2:148|(1:150)(2:151|(1:153))))|108|(1:110)|111|(1:113)|114|(1:116)(6:129|(1:146)(1:135)|136|137|(1:141)|143)|117|(1:125)|126|127))|7|8|(0)(0)|11|(3:13|15|(0))|33|(0)(0)|36|(0)|38|(0)|41|(0)|44|45|46|47|(0)(0)|50|(0)|(0)|70|(1:72)|165|75|(2:77|79)|80|(0)(0)|83|(0)(0)|88|(0)(0)|91|(1:93)|154|95|(0)|98|(0)|101|(1:104)|105|(0)(0)|108|(0)|111|(0)|114|(0)(0)|117|(4:119|121|123|125)|126|127|(2:(0)|(1:169))) */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0233, code lost:
    
        r3 = ((java.lang.Integer) X.AbstractC57425MgH.LJIIIIZZ(r1, "page_depth_of_report_show", r22, "page_depth_of_report_show", java.lang.Integer.class, 0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x024d, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0529, code lost:
    
        if (r5 != null) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0595  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C59314NPq LIZ(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59307NPj.LIZ(android.os.Bundle):X.NPq");
    }

    public static void LIZIZ(boolean z, android.net.Uri uri) {
        int i;
        try {
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", path);
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                hashMap.put("host", host);
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("is_sec_url_wrapped", String.valueOf(i));
            FMX.LJIIL("awewebview_append_common_params", hashMap);
        } catch (Exception unused) {
        }
    }
}
