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
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.settings.IntentSchemeInterceptConfig;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.XpathBusiness;
import java.net.URISyntaxException;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NUP extends NUQ {
    public long LIZJ;
    public boolean LIZLLL;

    public NUP(F3T f3t, NUT nut) {
        super(f3t, nut);
        boolean z;
        NP1 np1;
        NP0 np0;
        Long value;
        this.LIZJ = -1L;
        C59472NVs params = nut.getParams();
        if ((params instanceof NP1) && (np1 = (NP1) params) != null && (np0 = np1.LLF) != null && (value = np0.getValue()) != null && value.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
    }

    public static void LJIIL(NUX nux, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (nux != null) {
            nux.mb(InterfaceC60276NlA.class);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "filter_scheme");
        android.net.Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(rawUrl)");
        JSONObject formatData = new C61040NxU(parse, "intent_scheme_", null, 4).getFormatData();
        Iterator<String> keys = formatData.keys();
        o.LJFF(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, formatData.opt(next));
        }
    }

    @Override // X.NVZ
    public final WebResourceResponse LIZLLL(WebView webView, C59151NJj c59151NJj) {
        PassBackWebInfoBusiness passBackWebInfoBusiness;
        if (c59151NJj != null && c59151NJj.LIZIZ() != null && (!c59151NJj.LIZ().isEmpty()) && (passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LIZIZ.LIZ(PassBackWebInfoBusiness.class)) != null) {
            passBackWebInfoBusiness.LIZJ(String.valueOf(c59151NJj.LIZIZ()), c59151NJj.LIZ());
        }
        super.LIZLLL(webView, c59151NJj);
        throw null;
    }

    @Override // X.NUQ
    public final void LJIIIIZZ(JSONObject jSONObject, boolean z) {
        NP1 np1;
        Long value;
        C59472NVs params = this.LIZIZ.getParams();
        if (!(params instanceof NP1) || (np1 = (NP1) params) == null || (value = np1.LJJZ.getValue()) == null || value.longValue() <= 0) {
            return;
        }
        NUQ.LJIIJ(jSONObject, "creativeId", np1.LJJZ.getValue());
        if (z) {
            if (this.LIZJ > 0) {
                NUQ.LJIIJ(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.LIZJ));
            }
        } else {
            C09900aA.LJIIJJI("aweme_ad_landingpage_open_error", 1, jSONObject);
        }
        C09900aA.LJIIJJI("aweme_ad_landingpage_open_error_rate", !z ? 1 : 0, jSONObject);
    }

    @Override // X.NUQ, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C59614NaU LJI = NUQ.LJI(this.LIZ);
        XpathBusiness xpathBusiness = (XpathBusiness) this.LIZIZ.LIZ(XpathBusiness.class);
        if (xpathBusiness != null) {
            xpathBusiness.xpathDirect(LJI);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LIZIZ.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIJ(LJI, str);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.LIZIZ.LIZ(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.LIZ(false, true);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LIZIZ.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LJFF(LJI, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0268, code lost:
    
        X.C58909NAb.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0271, code lost:
    
        if (X.NH3.LIZ() == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0273, code lost:
    
        X.NUV.LIZIZ(r6, r1, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02aa A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b3 A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d1 A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0288 A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x032f A[Catch: Exception -> 0x0333, TRY_LEAVE, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a4 A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156 A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174 A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0186 A[Catch: Exception -> 0x0333, TryCatch #2 {Exception -> 0x0333, blocks: (B:30:0x0097, B:32:0x00a2, B:33:0x00b4, B:37:0x00be, B:40:0x00c8, B:42:0x00d2, B:43:0x00d6, B:47:0x00df, B:48:0x00e2, B:50:0x00ec, B:52:0x00f0, B:54:0x00f4, B:56:0x00fc, B:57:0x0100, B:62:0x010e, B:63:0x0110, B:69:0x0134, B:75:0x0148, B:77:0x0156, B:79:0x015a, B:81:0x015e, B:83:0x0166, B:84:0x016a, B:86:0x0174, B:90:0x0180, B:92:0x0186, B:98:0x01b6, B:100:0x01be, B:103:0x01c8, B:105:0x01d0, B:107:0x01dc, B:111:0x022e, B:113:0x022b, B:114:0x01e3, B:116:0x01eb, B:117:0x01f2, B:119:0x01fa, B:120:0x0206, B:122:0x020e, B:123:0x021a, B:125:0x0222, B:128:0x0233, B:129:0x0236, B:131:0x023c, B:134:0x0243, B:139:0x024e, B:141:0x0254, B:144:0x025e, B:149:0x0263, B:151:0x0268, B:153:0x0273, B:156:0x0298, B:158:0x029e, B:160:0x02aa, B:161:0x02ad, B:163:0x02b3, B:164:0x02b9, B:168:0x02d1, B:170:0x02e8, B:172:0x02ec, B:173:0x02fc, B:176:0x0301, B:185:0x031e, B:189:0x027d, B:191:0x0288, B:193:0x0293, B:194:0x0323, B:196:0x032f, B:197:0x0195, B:199:0x01a4, B:211:0x0117, B:215:0x0122, B:216:0x0124, B:178:0x030a, B:180:0x0310), top: B:29:0x0097, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0191 A[ADDED_TO_REGION] */
    @Override // X.NUQ, X.NVZ, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUP.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public static void LJIILIIL(String str, String str2, IntentSchemeInterceptConfig intentSchemeInterceptConfig) {
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
        LJ.put("from", C16880lQ.LJLLJ(NUP.class));
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r8 != null) goto L11;
     */
    @Override // X.NUQ, X.NVZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.webkit.WebView r6, X.C59151NJj r7, X.NUZ r8) {
        /*
            r5 = this;
            super.LIZ(r6, r7, r8)
            X.NUX r0 = r5.LIZ
            X.NUQ.LJI(r0)
            X.NUT r1 = r5.LIZIZ
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r0 = com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r4 = r1.LIZ(r0)
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r4 = (com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r4
            if (r4 == 0) goto L36
            r3 = 0
            if (r7 == 0) goto L3b
            android.net.Uri r0 = r7.LIZIZ()
            java.lang.String r2 = r0.toString()
        L1f:
            if (r8 == 0) goto L37
            java.lang.CharSequence r0 = r8.LIZ()
            if (r0 == 0) goto L37
            java.lang.String r1 = r0.toString()
        L2b:
            int r0 = r8.LIZIZ()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L33:
            r4.LJIIL(r3, r2, r1)
        L36:
            return
        L37:
            r1 = r3
            if (r8 == 0) goto L33
            goto L2b
        L3b:
            r2 = r3
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUP.LIZ(android.webkit.WebView, X.NJj, X.NUZ):void");
    }

    @Override // X.NVZ
    public final void LIZIZ(WebView webView, C59151NJj c59151NJj, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LIZIZ.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            Integer num = null;
            if (c59151NJj != null) {
                str = c59151NJj.LIZIZ().toString();
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

    @Override // X.NUQ, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.LIZJ = SystemClock.elapsedRealtime();
        super.onPageStarted(webView, str, bitmap);
        C59614NaU LJI = NUQ.LJI(this.LIZ);
        NUW.LIZ(this.LIZIZ);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LIZIZ.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIJJI(LJI, str);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.LIZIZ.LIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LJI(str);
        }
    }

    @Override // X.NUQ, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        NUQ.LJI(this.LIZ);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.LIZIZ.LIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIL(Integer.valueOf(i), str2, str);
        }
    }

    public final boolean LJIIJJI(String str, android.net.Uri uri, String str2, boolean z, String str3, C59614NaU c59614NaU, NUX nux) {
        Intent intent;
        Context context;
        PackageManager packageManager;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (o.LJ("market", str2)) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(uri);
                intent2.addFlags(268435456);
                intent2.putExtra("pns.sandbox.dataflow_id", 1207965953);
                LJIIL(nux, str3);
                Activity activity = this.LIZIZ.getActivity();
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
                Activity activity2 = this.LIZIZ.getActivity();
                if (activity2 != null) {
                    context = activity2.getBaseContext();
                } else {
                    context = null;
                }
                if (NUK.LIZ(context, intent)) {
                    LJIIL(nux, str3);
                    return true;
                }
                Activity activity3 = this.LIZIZ.getActivity();
                if (activity3 != null) {
                    packageManager = activity3.getPackageManager();
                } else {
                    packageManager = null;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                if (intent != null) {
                    C58909NAb.LIZ.getClass();
                    if (NH3.LIZ() != null && NTF.LJIIL(this.LIZIZ.getActivity())) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("market://details?id=");
                        LIZ.append(intent.getPackage());
                        intent3.setData(UriProtector.parse(X1D.LIZIZ(LIZ)));
                        if (packageManager != null && intent3.resolveActivity(packageManager) != null) {
                            intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
                            intent.addFlags(268435456);
                            LJIIL(nux, str3);
                            Activity activity4 = this.LIZIZ.getActivity();
                            if (activity4 != null) {
                                C16880lQ.LIZIZ(activity4, intent3);
                            }
                            return true;
                        }
                    }
                    String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "browser_fallback_url");
                    if (LLJJIJIIJIL != null) {
                        if (c59614NaU != null) {
                            c59614NaU.loadUrl(LLJJIJIIJIL);
                        }
                        return true;
                    }
                }
                C58909NAb.LIZ.getClass();
                if (NH3.LIZ() != null && !NTF.LJIIL(this.LIZIZ.getActivity())) {
                    Activity activity5 = this.LIZIZ.getActivity();
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
