package X;

import android.text.TextUtils;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class O1Y extends IXResourceLoader {
    public final String LJLIL = "BuildIn";

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.LJLIL;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:7|(2:20|(2:22|(4:26|10|11|(3:16|17|18)(2:13|14)))(2:27|(7:29|(1:40)(1:33)|34|(2:36|(1:38)(1:39))|10|11|(0)(0))))|9|10|11|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[Catch: Exception -> 0x0085, TryCatch #0 {Exception -> 0x0085, blocks: (B:16:0x0078, B:13:0x0081, B:14:0x0084), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[Catch: Exception -> 0x0085, TRY_ENTER, TryCatch #0 {Exception -> 0x0085, blocks: (B:16:0x0078, B:13:0x0081, B:14:0x0084), top: B:11:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C61224O1c LIZIZ(android.net.Uri r7) {
        /*
            java.lang.String r2 = r7.getScheme()
            if (r2 == 0) goto Lb6
            int r1 = r2.hashCode()
            r0 = -1408207997(0xffffffffac107383, float:-2.0527753E-12)
            if (r1 != r0) goto Lb6
            java.lang.String r5 = "assets"
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto Lb6
            java.lang.String r2 = r7.getAuthority()
            java.lang.String r4 = "absolute"
            if (r2 != 0) goto L29
        L1f:
            java.lang.String r1 = ""
        L21:
            X.O1R r0 = X.C61238O1q.LIZ
            android.app.Application r0 = r0.LIZJ
            r6 = 0
            if (r0 == 0) goto L81
            goto L78
        L29:
            int r1 = r2.hashCode()
            r0 = -554435892(0xffffffffdef3facc, float:-8.790294E18)
            if (r1 == r0) goto L47
            r0 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r1 == r0) goto L38
            goto L1f
        L38:
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L1f
            java.lang.String r0 = r7.getPath()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L21
        L47:
            java.lang.String r0 = "relative"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r3 = r7.getPath()
            r2 = 0
            if (r3 == 0) goto L5c
            boolean r0 = ujb.o.LJJJJJL(r3)
            if (r0 == 0) goto L62
        L5c:
            r0 = 1
        L5d:
            java.lang.String r1 = "offline"
            if (r0 == 0) goto L64
            goto L21
        L62:
            r0 = 0
            goto L5d
        L64:
            java.lang.String r0 = "/"
            boolean r0 = ujb.o.LJJJLIIL(r3, r0, r2)
            if (r0 == 0) goto L71
            java.lang.String r1 = defpackage.i0.LJFF(r1, r3)
            goto L21
        L71:
            java.lang.String r0 = "offline/"
            java.lang.String r1 = defpackage.i0.LJFF(r0, r3)
            goto L21
        L78:
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Exception -> L85
            java.io.InputStream r6 = r0.open(r1)     // Catch: java.lang.Exception -> L85
            goto L85
        L81:
            kotlin.jvm.internal.o.LJIIZILJ()     // Catch: java.lang.Exception -> L85
            throw r6     // Catch: java.lang.Exception -> L85
        L85:
            X.O1c r3 = new X.O1c
            r3.<init>(r7)
            X.O1o r2 = new X.O1o
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r5)
            android.net.Uri$Builder r0 = r0.authority(r4)
            android.net.Uri$Builder r1 = r0.path(r1)
            java.lang.String r0 = "Uri.Builder()\n    .schem…RITY_ABSOLUTE).path(path)"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            android.net.Uri r1 = r1.build()
            java.lang.String r0 = "Uri.Builder()\n    .schem…raPart(sourceUri).build()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            r2.<init>(r6, r1)
            r3.LIZ = r2
            return r3
        Lb6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error scheme"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O1Y.LIZIZ(android.net.Uri):X.O1c");
    }

    public final C61224O1c LIZ(String str) {
        int i;
        String substring;
        C39973FmT.LIZIZ(this, i0.LJFF("interceptAssetRequest# url=", str), null, null, 6);
        O1E LIZ = C61238O1q.LIZ.LIZ(getService());
        if (LIZ.LJFF.isEmpty()) {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJFF(parse, "Uri.parse(url)");
            return new C61224O1c(parse);
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = LIZ.LJFF;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        for (String str2 : list) {
            if (O1F.LIZLLL(str2)) {
                Pattern compile = PatternProtector.compile(str2);
                o.LJFF(compile, "Pattern.compile(it)");
                arrayList.add(compile);
            }
            arrayList2.add(C76800UCe.LIZ);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Matcher matcher = ((Pattern) ListProtector.get(arrayList, i2)).matcher(str);
            if (matcher.find()) {
                int LJJLIIIJL = s.LJJLIIIJL(str, "?", 0, false, 6);
                int LJJLIIIJL2 = s.LJJLIIIJL(str, "#", 0, false, 6);
                if (LJJLIIIJL > LJJLIIIJL2) {
                    i = LJJLIIIJL2;
                } else {
                    i = LJJLIIIJL;
                }
                if (i == -1) {
                    if (LJJLIIIJL < LJJLIIIJL2) {
                        LJJLIIIJL = LJJLIIIJL2;
                    }
                    i = LJJLIIIJL;
                }
                if (i != -1) {
                    substring = str.substring(matcher.end(), i);
                    o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    substring = str.substring(matcher.end());
                    o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                }
                if (ujb.o.LJJJJ(substring, "/", false)) {
                    substring = substring.substring(0, substring.length() - 1);
                    o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                if (!TextUtils.isEmpty(substring)) {
                    return LIZIZ(O5Y.LJJJJL(substring));
                }
            }
        }
        android.net.Uri parse2 = UriProtector.parse(str);
        o.LJFF(parse2, "Uri.parse(url)");
        return new C61224O1c(parse2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final O1I loadSync(O1I input, O1L config) {
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        C39973FmT.LIZIZ(this, "start to sync load from assets", null, null, 6);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(input, config, new AqS56S0400000_10(this, c68322mC, input, countDownLatch, 4), new AqS114S0300000_10(this, input, countDownLatch, 7));
        countDownLatch.await(config.LIZIZ, TimeUnit.MILLISECONDS);
        return (O1I) c68322mC.element;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(O1I input, O1L config, InterfaceC88472Yns<? super O1I, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        boolean z;
        String str;
        String str2;
        String str3;
        InputStream inputStream;
        android.net.Uri uri;
        String str4;
        InputStream inputStream2;
        android.net.Uri uri2;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        C61237O1p c61237O1p = new C61237O1p();
        InputStream inputStream3 = null;
        C39973FmT.LIZIZ(this, "start to async load from assets", null, null, 6);
        if (!config.LJIIIIZZ) {
            if (input instanceof O1W) {
                ((O1W) input).LJIJI = "buildIn disable";
            }
            reject.invoke(new Throwable("buildIn disable"));
            return;
        }
        boolean z2 = false;
        if (config.LJ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "";
        if (z) {
            C60235NkV c60235NkV = input.LJIILIIL;
            if (c60235NkV == null || !c60235NkV.LJLJI || (str = c60235NkV.LJLIL) == null) {
                str = "";
            }
        } else {
            str = config.LJ;
        }
        if (config.LJFF.length() == 0) {
            C60235NkV c60235NkV2 = input.LJIILIIL;
            if (c60235NkV2 == null || !c60235NkV2.LJLJI || (str2 = c60235NkV2.LJLILLLLZI) == null) {
                str2 = "";
            }
        } else {
            str2 = config.LJFF;
        }
        if (str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            if (input instanceof O1W) {
                ((O1W) input).LJIJI = "buildIn Channel/Bundle invalid";
                JSONObject jSONObject = input.LIZLLL.LJII;
                if (jSONObject != null) {
                    jSONObject.put("b_total", c61237O1p.LIZIZ());
                }
            }
            reject.invoke(new Exception("buildIn Channel/Bundle invalid"));
            return;
        }
        try {
            C61224O1c LIZIZ = LIZIZ(O5Y.LJJJJL(O1F.LIZ(str, str2)));
            JSONObject jSONObject2 = input.LIZLLL.LJII;
            if (jSONObject2 != null) {
                jSONObject2.put("b_find", c61237O1p.LIZ());
            }
            C61236O1o LIZIZ2 = LIZIZ.LIZIZ();
            if (LIZIZ2 != null) {
                inputStream3 = LIZIZ2.LJLJLJ;
            }
            if (inputStream3 == null) {
                String uri3 = input.LJFF.toString();
                o.LJFF(uri3, "input.srcUri.toString()");
                C61224O1c LIZ = LIZ(uri3);
                JSONObject jSONObject3 = input.LIZLLL.LJII;
                if (jSONObject3 != null) {
                    jSONObject3.put("b_match", c61237O1p.LIZ());
                }
                C61236O1o LIZIZ3 = LIZ.LIZIZ();
                if (LIZIZ3 != null && LIZIZ3.LJLJLJ != null) {
                    C61236O1o LIZIZ4 = LIZ.LIZIZ();
                    if (LIZIZ4 == null || (uri2 = LIZIZ4.LJLJLLL) == null || (str4 = uri2.getPath()) == null) {
                        str4 = "";
                    }
                    if (O1F.LIZLLL(str4)) {
                        str5 = str4.substring(1, str4.length());
                        o.LJFF(str5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    input.LJI = str5;
                    if (LIZIZ4 == null) {
                        inputStream2 = null;
                    } else {
                        inputStream2 = LIZIZ4.LJLJLJ;
                    }
                    input.LJIIL = inputStream2;
                    input.LJII = F3S.ASSET;
                    input.LJIIIIZZ = EnumC60490Noc.BUILTIN;
                    input.LJIIIZ = true;
                    JSONArray jSONArray = input.LJ;
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("name", "BUILDIN");
                    jSONObject4.put("status", "success");
                    jSONArray.put(jSONObject4);
                    JSONObject jSONObject5 = input.LIZLLL.LJII;
                    if (jSONObject5 != null) {
                        jSONObject5.put("b_total", c61237O1p.LIZIZ());
                    }
                    resolve.invoke(input);
                    return;
                }
                if (input instanceof O1W) {
                    ((O1W) input).LJIJI = "buildIn File Not Found";
                }
                JSONObject jSONObject6 = input.LIZLLL.LJII;
                if (jSONObject6 != null) {
                    jSONObject6.put("b_total", c61237O1p.LIZIZ());
                }
                reject.invoke(new FileNotFoundException("buildIn File Not Found"));
                return;
            }
            C61236O1o LIZIZ5 = LIZIZ.LIZIZ();
            JSONArray jSONArray2 = input.LJ;
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("name", "BUILDIN");
            jSONObject7.put("status", "success");
            jSONArray2.put(jSONObject7);
            if (LIZIZ5 == null || (uri = LIZIZ5.LJLJLLL) == null || (str3 = uri.getPath()) == null) {
                str3 = "";
            }
            if (O1F.LIZLLL(str3)) {
                str5 = str3.substring(1, str3.length());
                o.LJFF(str5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            input.LJI = str5;
            if (LIZIZ5 == null) {
                inputStream = null;
            } else {
                inputStream = LIZIZ5.LJLJLJ;
            }
            input.LJIIL = inputStream;
            input.LJII = F3S.ASSET;
            input.LJIIIIZZ = EnumC60490Noc.BUILTIN;
            input.LJIIIZ = true;
            JSONObject jSONObject8 = input.LIZLLL.LJII;
            if (jSONObject8 != null) {
                jSONObject8.put("b_total", c61237O1p.LIZIZ());
            }
            resolve.invoke(input);
        } catch (Exception e) {
            JSONObject jSONObject9 = input.LIZLLL.LJII;
            if (jSONObject9 != null) {
                jSONObject9.put("b_total", c61237O1p.LIZIZ());
            }
            if (input instanceof O1W) {
                String str6 = "buildIn " + e.getMessage();
                o.LJIIJ(str6, "<set-?>");
                ((O1W) input).LJIJI = str6;
            }
            reject.invoke(e);
        }
    }
}
