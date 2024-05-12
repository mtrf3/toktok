package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.O1d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61225O1d extends O1T {
    public final String LJLIL = "GECKO";

    @Override // X.O1T, com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.LJLIL;
    }

    public final String LJ(O1L o1l) {
        GeckoConfig LIZIZ = O1F.LIZIZ(C61238O1q.LIZ.LIZ(getService()), o1l.LJIILJJIL);
        if (LIZIZ.getLoaderDepender() instanceof InterfaceC61241O1t) {
            O1Z loaderDepender = LIZIZ.getLoaderDepender();
            if (loaderDepender != null) {
                ((InterfaceC61241O1t) loaderDepender).getSdkVersion();
                return "2.4.1-rc.9.2-bugfix";
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.resourceloader.IRlLoaderDepender");
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.O1T
    public final O1I LIZIZ(O1I input, O1U o1u) {
        o.LJIIJ(input, "input");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start to loadSync load  channel = ");
        LIZ.append(o1u.LJ);
        LIZ.append(",bundle = ");
        C39973FmT.LIZIZ(this, JBR.LJFF(LIZ, o1u.LJFF, " from gecko", LIZ), null, null, 6);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(input, o1u, new AqS141S0200000_10(countDownLatch, c68322mC, 21), new AqS176S0100000_10(countDownLatch, 92));
        countDownLatch.await(o1u.LIZIZ, TimeUnit.MILLISECONDS);
        return (O1I) c68322mC.element;
    }

    public final File LIZLLL(String str, O1L o1l) {
        String str2 = o1l.LJIILJJIL;
        GeckoConfig LIZIZ = O1F.LIZIZ(C61238O1q.LIZ.LIZ(getService()), o1l.LJIILJJIL);
        String LIZJ = LIZIZ.getLoaderDepender().LIZJ(LIZIZ.getOfflineDir(), str2, str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("using gecko info [accessKey=");
        LIZ.append(str2);
        LIZ.append(",filePath=");
        LIZ.append(LIZJ);
        LIZ.append(']');
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), null, null, 6);
        if (LIZJ == null || LIZJ.length() == 0) {
            return null;
        }
        return new File(LIZJ);
    }

    public final void LIZJ(android.net.Uri uri, O1L o1l, InterfaceC61240O1s interfaceC61240O1s) {
        if (o.LJ(uri.getScheme(), "local_file") && o.LJ(uri.getAuthority(), "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (path.length() > 1 && ujb.o.LJJJLIIL(path, "/", false)) {
                String substring = path.substring(1);
                o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                if (substring != null) {
                    O1F.LIZIZ(C61238O1q.LIZ.LIZ(getService()), o1l.LJIILJJIL).getLoaderDepender().LJFF(o1l, C05040Hs.LIZIZ(substring), interfaceC61240O1s);
                    return;
                }
            }
            interfaceC61240O1s.LIZ(new Exception("update failed because channel is null"), new ArrayList());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[Catch: FileNotFoundException -> 0x00d2, TryCatch #0 {FileNotFoundException -> 0x00d2, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0012, B:10:0x001a, B:12:0x0020, B:17:0x0030, B:19:0x0038, B:22:0x0056, B:23:0x005b, B:25:0x0083, B:27:0x0089, B:28:0x009e, B:29:0x00a5, B:31:0x009b, B:34:0x0040, B:36:0x0048, B:39:0x004f, B:43:0x00a8, B:44:0x00bc, B:45:0x00bd, B:46:0x00d1), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C61224O1c LJFF(android.net.Uri r7, X.O1L r8, java.lang.String r9) {
        /*
            r6 = this;
            r2 = 0
            java.lang.String r4 = r7.getScheme()     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r3 = " not found"
            if (r4 == 0) goto Lbd
            int r1 = r4.hashCode()     // Catch: java.io.FileNotFoundException -> Ld2
            r0 = 1303296464(0x4daeb9d0, float:3.6642662E8)
            if (r1 != r0) goto Lbd
            java.lang.String r0 = "local_file"
            boolean r0 = r4.equals(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            if (r0 == 0) goto Lbd
            java.lang.String r5 = r7.getAuthority()     // Catch: java.io.FileNotFoundException -> Ld2
            if (r5 == 0) goto La8
            int r4 = r5.hashCode()     // Catch: java.io.FileNotFoundException -> Ld2
            r0 = -554435892(0xffffffffdef3facc, float:-8.790294E18)
            java.lang.String r1 = ""
            if (r4 == r0) goto L40
            r0 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r4 != r0) goto La8
            java.lang.String r0 = "absolute"
            boolean r0 = r5.equals(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            if (r0 == 0) goto La8
            java.lang.String r0 = r7.getPath()     // Catch: java.io.FileNotFoundException -> Ld2
            if (r0 == 0) goto L56
            r1 = r0
            goto L56
        L40:
            java.lang.String r0 = "relative"
            boolean r0 = r5.equals(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            if (r0 == 0) goto La8
            java.lang.String r0 = r7.getPath()     // Catch: java.io.FileNotFoundException -> Ld2
            if (r0 == 0) goto L4f
            r1 = r0
        L4f:
            java.io.File r3 = r6.LIZLLL(r1, r8)     // Catch: java.io.FileNotFoundException -> Ld2
            if (r3 == 0) goto La7
            goto L5b
        L56:
            java.io.File r3 = new java.io.File     // Catch: java.io.FileNotFoundException -> Ld2
            r3.<init>(r1)     // Catch: java.io.FileNotFoundException -> Ld2
        L5b:
            X.O1c r4 = new X.O1c     // Catch: java.io.FileNotFoundException -> Ld2
            r4.<init>(r7)     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r1 = "load from gecko success"
            r0 = 6
            X.C39973FmT.LIZIZ(r6, r1, r2, r2, r0)     // Catch: java.io.FileNotFoundException -> Ld2
            X.O1n r5 = new X.O1n     // Catch: java.io.FileNotFoundException -> Ld2
            r5.<init>(r3)     // Catch: java.io.FileNotFoundException -> Ld2
            X.O1R r1 = X.C61238O1q.LIZ     // Catch: java.io.FileNotFoundException -> Ld2
            com.bytedance.ies.bullet.service.base.IResourceLoaderService r0 = r6.getService()     // Catch: java.io.FileNotFoundException -> Ld2
            X.O1E r1 = r1.LIZ(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r0 = r8.LJIILJJIL     // Catch: java.io.FileNotFoundException -> Ld2
            com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig r1 = X.O1F.LIZIZ(r1, r0)     // Catch: java.io.FileNotFoundException -> Ld2
            X.O1Z r0 = r1.getLoaderDepender()     // Catch: java.io.FileNotFoundException -> Ld2
            boolean r0 = r0 instanceof X.InterfaceC61241O1t     // Catch: java.io.FileNotFoundException -> Ld2
            if (r0 == 0) goto L9b
            X.O1Z r3 = r1.getLoaderDepender()     // Catch: java.io.FileNotFoundException -> Ld2
            if (r3 == 0) goto L9e
            X.O1t r3 = (X.InterfaceC61241O1t) r3     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r1 = r1.getOfflineDir()     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r0 = r8.LJIILJJIL     // Catch: java.io.FileNotFoundException -> Ld2
            long r0 = r3.LIZLLL(r1, r0, r9)     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            r5.LJLJLLL = r0     // Catch: java.io.FileNotFoundException -> Ld2
        L9b:
            r4.LIZ = r5     // Catch: java.io.FileNotFoundException -> Ld2
            goto La6
        L9e:
            X.Eqm r1 = new X.Eqm     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.ies.bullet.kit.resourceloader.IRlLoaderDepender"
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            throw r1     // Catch: java.io.FileNotFoundException -> Ld2
        La6:
            r2 = r4
        La7:
            return r2
        La8:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Ld2
            r0.<init>()     // Catch: java.io.FileNotFoundException -> Ld2
            r0.append(r7)     // Catch: java.io.FileNotFoundException -> Ld2
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> Ld2
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            throw r1     // Catch: java.io.FileNotFoundException -> Ld2
        Lbd:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Ld2
            r0.<init>()     // Catch: java.io.FileNotFoundException -> Ld2
            r0.append(r7)     // Catch: java.io.FileNotFoundException -> Ld2
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> Ld2
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> Ld2
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Ld2
            throw r1     // Catch: java.io.FileNotFoundException -> Ld2
        Ld2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61225O1d.LJFF(android.net.Uri, X.O1L, java.lang.String):X.O1c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x028b, code lost:
    
        if (r4 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r3 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    @Override // X.O1T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.O1I r26, X.O1U r27, X.InterfaceC88472Yns<? super X.O1I, X.C76800UCe> r28, X.InterfaceC88472Yns<? super java.lang.Throwable, X.C76800UCe> r29) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61225O1d.LIZ(X.O1I, X.O1U, X.Yns, X.Yns):void");
    }

    public final void LJI(O1I o1i, O1L o1l, String str, String str2, boolean z, InterfaceC88472Yns<? super O1I, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        C61235O1n c61235O1n;
        Object LIZ;
        String LIZ2;
        O1W o1w;
        String str3;
        FileInputStream fileInputStream;
        C61237O1p c61237O1p = new C61237O1p();
        android.net.Uri LJJJJLI = O5Y.LJJJJLI(O1F.LIZ(str, str2));
        C61224O1c LJFF = LJFF(LJJJJLI, o1l, str);
        if (LJFF != null) {
            c61235O1n = LJFF.LIZ();
        } else {
            c61235O1n = null;
        }
        JSONObject jSONObject = o1i.LIZLLL.LJII;
        long j = 0;
        if (jSONObject != null) {
            try {
                LIZ = Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "g_local"));
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = 0L;
            }
            jSONObject.put("g_local", c61237O1p.LIZ() + ((Number) LIZ).longValue());
        }
        if (c61235O1n != null && c61235O1n.LJLL.exists()) {
            try {
                fileInputStream = new FileInputStream(c61235O1n.LJLL);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
            if (fileInputStream.available() == 0) {
                if (o1i instanceof O1W) {
                    ((O1W) o1i).LJIILLIIL = "gecko size 0";
                }
                interfaceC88472Yns2.invoke(new FileNotFoundException("size 0"));
                fileInputStream.close();
                return;
            }
            fileInputStream.close();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            o1i.LJI = c61235O1n.LJLL.getAbsolutePath();
            o1i.LJII = F3S.DISK;
            o1i.LJIIIIZZ = EnumC60490Noc.GECKO;
            Long l = c61235O1n.LJLJLLL;
            if (l != null) {
                j = l.longValue();
            }
            o1i.LJIIJ = j;
            o1i.LJIIIZ = z;
            JSONArray jSONArray = o1i.LJ;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", this.LJLIL);
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            o1i.LIZ = LJ(o1l);
            interfaceC88472Yns.invoke(o1i);
            return;
        }
        boolean z2 = o1i instanceof O1W;
        if (z2) {
            if (o1l.LJIILJJIL.length() == 0 && ((str3 = (o1w = (O1W) o1i).LJIILLIIL) == null || str3.length() == 0)) {
                o1w.LJIILLIIL = "gecko accessKey invalid";
            } else {
                ((O1W) o1i).LJIILLIIL = "gecko File Not Found";
            }
        }
        if (z2) {
            LIZ2 = ((O1W) o1i).LJIILLIIL;
        } else {
            LIZ2 = C43588H8u.LIZ("file not find ", LJJJJLI);
        }
        interfaceC88472Yns2.invoke(new FileNotFoundException(LIZ2));
    }

    public final void LJII(O1I o1i, O1U o1u, String str, String str2, String str3, InterfaceC88472Yns<? super O1I, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        boolean z;
        C61237O1p c61237O1p = new C61237O1p();
        if (o.LJ(UriProtector.getQueryParameter(o1i.LJFF, "onlyLocal"), "1") || o1u.LIZLLL) {
            z = true;
            if (o1i instanceof O1W) {
                ((O1W) o1i).LJIILLIIL = "gecko only local";
                JSONArray jSONArray = o1i.LJ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.LJLIL);
                jSONObject.put("status", "failed");
                jSONObject.put("detail", o1i);
                jSONArray.put(jSONObject);
            }
            interfaceC88472Yns2.invoke(new Exception("gecko only local"));
        } else {
            z = false;
        }
        android.net.Uri LJJJJLI = O5Y.LJJJJLI(str);
        o1u.LJIJI = 1;
        LIZJ(LJJJJLI, o1u, new C61230O1i(this, o1i, c61237O1p, str3, str, str2, z, o1u, interfaceC88472Yns, interfaceC88472Yns2));
    }
}
