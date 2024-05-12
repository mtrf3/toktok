package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.settings.IntentSchemeInterceptConfig;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.XpathBusiness;
import java.net.URISyntaxException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NUO extends NUR {
    public long LJLJJI;
    public boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NUO(NVO container) {
        super(container);
        boolean z;
        NP1 np1;
        NP0 np0;
        Long value;
        o.LJIIIZ(container, "container");
        this.LJLJJI = -1L;
        C59472NVs params = this.LJLJI.getParams();
        if ((params instanceof NP1) && (np1 = (NP1) params) != null && (np0 = np1.LLF) != null && (value = np0.getValue()) != null && value.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
    }

    @Override // X.NUR, X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        super.LJ(webView, str);
        XpathBusiness xpathBusiness = (XpathBusiness) this.LJLJI.LIZ(XpathBusiness.class);
        if (xpathBusiness != null) {
            xpathBusiness.xpathDirect(webView);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJI.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIJ(webView, str);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LJLJI.LIZ(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.LIZ(false, true);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LJLJI.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LJFF(webView, true);
        }
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJ(WebView webView, WebResourceRequest webResourceRequest) {
        PassBackWebInfoBusiness passBackWebInfoBusiness;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            o.LJIIIIZZ(webResourceRequest.getRequestHeaders(), "request.requestHeaders");
            if ((!r0.isEmpty()) && (passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LJLJI.LIZ(PassBackWebInfoBusiness.class)) != null) {
                String uri = webResourceRequest.getUrl().toString();
                o.LJIIIIZZ(uri, "request.url.toString()");
                java.util.Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                o.LJIIIIZZ(requestHeaders, "request.requestHeaders");
                passBackWebInfoBusiness.LIZJ(uri, requestHeaders);
            }
        }
        return super.LJIJ(webView, webResourceRequest);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0271, code lost:
    
        X.C58909NAb.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x027a, code lost:
    
        if (X.NH3.LIZ() == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027c, code lost:
    
        X.NUV.LIZIZ(r2, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:?, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7 A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b2 A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bb A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d3 A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0291 A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0331 A[Catch: Exception -> 0x0335, TRY_LEAVE, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01ab A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017b A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018d A[Catch: Exception -> 0x0335, TryCatch #2 {Exception -> 0x0335, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d0, B:44:0x00d4, B:46:0x00d9, B:47:0x00dd, B:51:0x00e6, B:52:0x00e9, B:54:0x00f3, B:56:0x00f7, B:58:0x00fb, B:60:0x0103, B:61:0x0107, B:66:0x0115, B:67:0x0117, B:73:0x013b, B:79:0x014f, B:81:0x015d, B:83:0x0161, B:85:0x0165, B:87:0x016d, B:88:0x0171, B:90:0x017b, B:94:0x0187, B:96:0x018d, B:102:0x01bf, B:104:0x01c7, B:107:0x01d1, B:109:0x01d9, B:111:0x01e5, B:115:0x0237, B:117:0x0234, B:118:0x01ec, B:120:0x01f4, B:121:0x01fb, B:123:0x0203, B:124:0x020f, B:126:0x0217, B:127:0x0223, B:129:0x022b, B:132:0x023c, B:133:0x023f, B:135:0x0245, B:138:0x024c, B:142:0x0256, B:144:0x025c, B:147:0x0266, B:152:0x026c, B:154:0x0271, B:156:0x027c, B:161:0x02a1, B:163:0x02a7, B:165:0x02b2, B:166:0x02b5, B:168:0x02bb, B:169:0x02c1, B:173:0x02d3, B:175:0x02ea, B:177:0x02ee, B:178:0x02fe, B:181:0x0303, B:190:0x0320, B:194:0x0286, B:196:0x0291, B:198:0x029c, B:201:0x0325, B:203:0x0331, B:204:0x019c, B:206:0x01ab, B:218:0x011e, B:222:0x0129, B:223:0x012b, B:183:0x030c, B:185:0x0312), top: B:29:0x0097, inners: #0, #1 }] */
    @Override // X.NUR, X.AbstractC60423NnX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIL(android.webkit.WebView r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUO.LJIL(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // X.NUR
    public final void LJJ(JSONObject jSONObject, boolean z) {
        NP1 np1;
        Long value;
        C59472NVs params = this.LJLJI.getParams();
        if (!(params instanceof NP1) || (np1 = (NP1) params) == null || (value = np1.LJJZ.getValue()) == null || value.longValue() <= 0) {
            return;
        }
        NUR.LJJIFFI(jSONObject, "creativeId", np1.LJJZ.getValue());
        if (z) {
            if (this.LJLJJI > 0) {
                NUR.LJJIFFI(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.LJLJJI));
            }
        } else {
            C09900aA.LJIIJJI("aweme_ad_landingpage_open_error", 1, jSONObject);
        }
        C09900aA.LJIIJJI("aweme_ad_landingpage_open_error_rate", !z ? 1 : 0, jSONObject);
    }

    public static void LJJIII(String str, String str2, IntentSchemeInterceptConfig intentSchemeInterceptConfig) {
        String shortClassName;
        String str3;
        String packageName;
        String str4;
        String className;
        String str5;
        String str6;
        if (str2 == null || ujb.o.LJJJJJL(str2) || ujb.o.LJJJJJL(str)) {
            return;
        }
        JSONObject LJ = C47135Ieh.LJ("url", str, "scheme", str2);
        LJ.put("from", C16880lQ.LJLLJ(NUO.class));
        if (intentSchemeInterceptConfig != null) {
            LJ.put("pattern", intentSchemeInterceptConfig.pattern);
            LJ.put("config_type", intentSchemeInterceptConfig.type);
        }
        if (o.LJ("intent", str2)) {
            try {
                Intent parseUri = Intent.parseUri(str, 1);
                if (parseUri != null) {
                    String str7 = parseUri.getPackage();
                    if (str7 != null && !ujb.o.LJJJJJL(str7)) {
                        LJ.put("package", parseUri.getPackage());
                    }
                    if (C16880lQ.LLJJIJI(parseUri) != null) {
                        Bundle LLJJIJI = C16880lQ.LLJJIJI(parseUri);
                        if (LLJJIJI != null) {
                            str6 = LLJJIJI.toString();
                        } else {
                            str6 = null;
                        }
                        LJ.put("extra", str6);
                    }
                    ComponentName component = parseUri.getComponent();
                    if (component != null && (className = component.getClassName()) != null && (!ujb.o.LJJJJJL(className))) {
                        ComponentName component2 = parseUri.getComponent();
                        if (component2 != null) {
                            str5 = component2.getClassName();
                        } else {
                            str5 = null;
                        }
                        LJ.put("className", str5);
                    }
                    ComponentName component3 = parseUri.getComponent();
                    if (component3 != null && (packageName = component3.getPackageName()) != null && (!ujb.o.LJJJJJL(packageName))) {
                        ComponentName component4 = parseUri.getComponent();
                        if (component4 != null) {
                            str4 = component4.getPackageName();
                        } else {
                            str4 = null;
                        }
                        LJ.put("packageName", str4);
                    }
                    ComponentName component5 = parseUri.getComponent();
                    if (component5 != null && (shortClassName = component5.getShortClassName()) != null && (!ujb.o.LJJJJJL(shortClassName))) {
                        ComponentName component6 = parseUri.getComponent();
                        if (component6 != null) {
                            str3 = component6.getShortClassName();
                        } else {
                            str3 = null;
                        }
                        LJ.put("shortClassName", str3);
                    }
                    String action = parseUri.getAction();
                    if (action != null && !ujb.o.LJJJJJL(action)) {
                        LJ.put("action", parseUri.getAction());
                    }
                    java.util.Set<String> categories = parseUri.getCategories();
                    if (categories != null && !categories.isEmpty()) {
                        LJ.put("categories", parseUri.getCategories().toString());
                    }
                    String dataString = parseUri.getDataString();
                    if (dataString != null && !ujb.o.LJJJJJL(dataString)) {
                        LJ.put("data", parseUri.getDataString());
                    }
                    String type = parseUri.getType();
                    if (type != null && !ujb.o.LJJJJJL(type)) {
                        LJ.put("type", parseUri.getType());
                    }
                    LJ.put("flag", parseUri.getFlags());
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                LJ.put("exception_name", C16880lQ.LJLLJ(e.getClass()));
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                LJ.put("exception_message", message);
            }
        }
        C58656N0i.LIZ("webview_intent_scheme_log", null, LJ);
    }

    @Override // X.NUR, X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        SparkContext sparkContext;
        NP1 np1;
        String str2;
        AdWebStatBusiness adWebStatBusiness;
        this.LJLJJI = SystemClock.elapsedRealtime();
        super.LJFF(webView, str, bitmap);
        NVO nvo = this.LJLILLLLZI;
        if (!nvo.LLFFF && (sparkContext = nvo.LJLJLJ) != null && (np1 = (NP1) sparkContext.LIZIZ(NP1.class)) != null) {
            nvo.LJLJLLL = np1;
            SparkContext sparkContext2 = nvo.LJLJLJ;
            Bundle bundle = null;
            if (sparkContext2 != null) {
                str2 = sparkContext2.url;
            } else {
                str2 = null;
            }
            android.net.Uri parse = UriProtector.parse(str2);
            SparkContext sparkContext3 = nvo.LJLJLJ;
            if (sparkContext3 != null) {
                bundle = (Bundle) sparkContext3.LIZIZ(Bundle.class);
            }
            NOV nov = new NOV();
            C59473NVt.LIZ(parse, bundle, nov);
            nvo.LJLL = nov;
            if (nvo.LLFZ) {
                np1.LLIFFJFJJ = 1;
            }
            nvo.LJLIL.LJ(np1);
            nvo.LJLIL.LJII(nvo.LJLL);
        }
        NUW.LIZ(this.LJLJI);
        NUT nut = this.LJLJI;
        if (nut != null && (adWebStatBusiness = (AdWebStatBusiness) nut.LIZ(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.LJIIJJI(webView, str);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LJLJI.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LJI(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r8 != null) goto L13;
     */
    @Override // X.NUR, X.AbstractC60423NnX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(android.webkit.WebView r6, android.webkit.WebResourceRequest r7, android.webkit.WebResourceError r8) {
        /*
            r5 = this;
            super.LJIIIIZZ(r6, r7, r8)
            X.NUT r1 = r5.LJLJI
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r0 = com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r4 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r4 = (com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r4
            if (r4 == 0) goto L33
            r3 = 0
            if (r7 == 0) goto L38
            android.net.Uri r0 = r7.getUrl()
            if (r0 == 0) goto L38
            java.lang.String r2 = r0.toString()
        L1c:
            if (r8 == 0) goto L34
            java.lang.CharSequence r0 = r8.getDescription()
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.toString()
        L28:
            int r0 = r8.getErrorCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L30:
            r4.LJIIL(r3, r2, r1)
        L33:
            return
        L34:
            r1 = r3
            if (r8 == 0) goto L30
            goto L28
        L38:
            r2 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUO.LJIIIIZZ(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    @Override // X.AbstractC60423NnX
    public final void LJIIJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        android.net.Uri url;
        super.LJIIJ(webView, webResourceRequest, webResourceResponse);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJI.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            Integer num = null;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                str = url.toString();
            } else {
                str = null;
            }
            if (webResourceResponse != null) {
                str2 = webResourceResponse.getReasonPhrase();
                num = Integer.valueOf(webResourceResponse.getStatusCode());
            } else {
                str2 = null;
            }
            adWebStatBusiness.LJIIL(num, str, str2);
        }
    }

    @Override // X.NUR, X.AbstractC60423NnX
    public final void LJII(WebView webView, int i, String str, String str2) {
        super.LJII(webView, i, str, str2);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LJLJI.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIL(Integer.valueOf(i), str2, str);
        }
    }

    public final boolean LJJII(String str, android.net.Uri uri, String str2, boolean z, String str3, WebView webView) {
        Intent intent;
        Context context;
        PackageManager packageManager;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (o.LJ("market", str2)) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(uri);
                intent2.addFlags(268435456);
                if (!TextUtils.isEmpty(str3)) {
                    this.LJLJI.LIZIZ();
                }
                Activity activity = this.LJLJI.getActivity();
                if (activity != null) {
                    C16880lQ.LIZIZ(activity, intent2);
                }
                return true;
            }
            if (o.LJ("intent", str2) && z) {
                String str4 = null;
                try {
                    intent = Intent.parseUri(str3, 1);
                } catch (URISyntaxException e) {
                    C78983UzD.LJIIZILJ(e);
                    intent = null;
                }
                Activity activity2 = this.LJLJI.getActivity();
                if (activity2 != null) {
                    context = activity2.getBaseContext();
                } else {
                    context = null;
                }
                if (NUK.LIZ(context, intent)) {
                    if (!TextUtils.isEmpty(str3)) {
                        this.LJLJI.LIZIZ();
                    }
                    return true;
                }
                Activity activity3 = this.LJLJI.getActivity();
                if (activity3 != null) {
                    packageManager = activity3.getPackageManager();
                } else {
                    packageManager = null;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                if (intent != null) {
                    C58909NAb.LIZ.getClass();
                    if (NH3.LIZ() != null && NTF.LJIIL(this.LJLJI.getActivity())) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("market://details?id=");
                        LIZ.append(intent.getPackage());
                        intent3.setData(UriProtector.parse(X1D.LIZIZ(LIZ)));
                        if (packageManager != null && intent3.resolveActivity(packageManager) != null) {
                            intent.addFlags(268435456);
                            intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
                            if (!TextUtils.isEmpty(str3)) {
                                this.LJLJI.LIZIZ();
                            }
                            Activity activity4 = this.LJLJI.getActivity();
                            if (activity4 != null) {
                                C16880lQ.LIZIZ(activity4, intent3);
                            }
                            return true;
                        }
                    }
                    String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "browser_fallback_url");
                    if (LLJJIJIIJIL != null) {
                        if (webView != null) {
                            C16880lQ.LLZZ(webView, LLJJIJIIJIL);
                        }
                        return true;
                    }
                }
                C58909NAb.LIZ.getClass();
                if (NH3.LIZ() != null && !NTF.LJIIL(this.LJLJI.getActivity())) {
                    Activity activity5 = this.LJLJI.getActivity();
                    if (intent != null) {
                        str4 = intent.getPackage();
                    }
                    return NTF.LJIILLIIL(activity5, str4);
                }
            }
        }
        return false;
    }
}
