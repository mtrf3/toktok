package X;

import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
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

/* loaded from: classes11.dex */
public final class O2F extends O2X {
    public final String LIZ = "GECKO";

    @Override // X.O2X, com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final String getTAG() {
        return this.LIZ;
    }

    public final String LJ(O1M o1m) {
        GeckoConfig LIZIZ = C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(getService()), o1m.LJIILLIIL);
        if (LIZIZ.getGeckoDepender() instanceof InterfaceC61263O2p) {
            InterfaceC61252O2e geckoDepender = LIZIZ.getGeckoDepender();
            if (geckoDepender != null) {
                ((InterfaceC61263O2p) geckoDepender).getSdkVersion();
                return "3.2.29-mt";
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.resource.IRlLoaderDepender");
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.O2X
    public final O26 LIZIZ(O26 input, O1V o1v) {
        o.LJIIJ(input, "input");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start to loadSync load  channel = ");
        LIZ.append(o1v.LJFF);
        LIZ.append(",bundle = ");
        C39048FUe.LIZIZ(c39048FUe, JBR.LJFF(LIZ, o1v.LJI, " from gecko", LIZ), null, null, 6);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(input, o1v, new AqS141S0200000_10(countDownLatch, c68322mC, 64), new AqS176S0100000_10(countDownLatch, 243));
        countDownLatch.await(o1v.LIZJ, TimeUnit.MILLISECONDS);
        return (O26) c68322mC.element;
    }

    public final File LIZLLL(String str, O1M o1m) {
        String str2 = o1m.LJIILLIIL;
        GeckoConfig LIZIZ = C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(getService()), o1m.LJIILLIIL);
        String offlineDir = LIZIZ.getOfflineDir();
        InterfaceC61252O2e geckoDepender = LIZIZ.getGeckoDepender();
        if (geckoDepender != null) {
            String LIZJ = geckoDepender.LIZJ(offlineDir, str2, str);
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("using gecko info [accessKey=");
            LIZ.append(str2);
            LIZ.append(",filePath=");
            LIZ.append(LIZJ);
            LIZ.append(']');
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
            if (LIZJ == null || LIZJ.length() == 0) {
                return null;
            }
            return new File(LIZJ);
        }
        o.LJIIZILJ();
        throw null;
    }

    public final void LIZJ(android.net.Uri uri, O1M o1m, InterfaceC61273O2z interfaceC61273O2z) {
        if (o.LJ(uri.getScheme(), "local_file") && o.LJ(uri.getAuthority(), "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (path.length() > 1 && ujb.o.LJJJLIIL(path, "/", false) && 1 != 0) {
                String substring = path.substring(1);
                o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                if (substring != null) {
                    ArrayList LIZIZ = C05040Hs.LIZIZ(substring);
                    InterfaceC61252O2e geckoDepender = C39927Flj.LIZIZ(C61270O2w.LIZ.LIZ(getService()), o1m.LJIILLIIL).getGeckoDepender();
                    if (geckoDepender != null) {
                        geckoDepender.LJ(o1m, LIZIZ, interfaceC61273O2z);
                        return;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            }
            interfaceC61273O2z.LIZ(new Exception("update failed because channel is null"), new ArrayList());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: FileNotFoundException -> 0x00d4, TryCatch #0 {FileNotFoundException -> 0x00d4, blocks: (B:3:0x0001, B:6:0x0009, B:8:0x0012, B:10:0x001a, B:12:0x0020, B:17:0x0030, B:19:0x0038, B:22:0x0056, B:23:0x005b, B:25:0x0085, B:27:0x008b, B:28:0x00a0, B:29:0x00a7, B:31:0x009d, B:34:0x0040, B:36:0x0048, B:39:0x004f, B:43:0x00aa, B:44:0x00be, B:45:0x00bf, B:46:0x00d3), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C61258O2k LJFF(android.net.Uri r8, X.O1M r9, java.lang.String r10) {
        /*
            r7 = this;
            r2 = 0
            java.lang.String r4 = r8.getScheme()     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r3 = " not found"
            if (r4 == 0) goto Lbf
            int r1 = r4.hashCode()     // Catch: java.io.FileNotFoundException -> Ld4
            r0 = 1303296464(0x4daeb9d0, float:3.6642662E8)
            if (r1 != r0) goto Lbf
            java.lang.String r0 = "local_file"
            boolean r0 = r4.equals(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            if (r0 == 0) goto Lbf
            java.lang.String r5 = r8.getAuthority()     // Catch: java.io.FileNotFoundException -> Ld4
            if (r5 == 0) goto Laa
            int r4 = r5.hashCode()     // Catch: java.io.FileNotFoundException -> Ld4
            r0 = -554435892(0xffffffffdef3facc, float:-8.790294E18)
            java.lang.String r1 = ""
            if (r4 == r0) goto L40
            r0 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r4 != r0) goto Laa
            java.lang.String r0 = "absolute"
            boolean r0 = r5.equals(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            if (r0 == 0) goto Laa
            java.lang.String r0 = r8.getPath()     // Catch: java.io.FileNotFoundException -> Ld4
            if (r0 == 0) goto L56
            r1 = r0
            goto L56
        L40:
            java.lang.String r0 = "relative"
            boolean r0 = r5.equals(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            if (r0 == 0) goto Laa
            java.lang.String r0 = r8.getPath()     // Catch: java.io.FileNotFoundException -> Ld4
            if (r0 == 0) goto L4f
            r1 = r0
        L4f:
            java.io.File r6 = r7.LIZLLL(r1, r9)     // Catch: java.io.FileNotFoundException -> Ld4
            if (r6 == 0) goto La9
            goto L5b
        L56:
            java.io.File r6 = new java.io.File     // Catch: java.io.FileNotFoundException -> Ld4
            r6.<init>(r1)     // Catch: java.io.FileNotFoundException -> Ld4
        L5b:
            X.O2k r4 = new X.O2k     // Catch: java.io.FileNotFoundException -> Ld4
            r4.<init>(r8)     // Catch: java.io.FileNotFoundException -> Ld4
            X.FUe r3 = X.C39048FUe.LIZIZ     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r1 = "load from gecko success"
            r0 = 6
            X.C39048FUe.LIZIZ(r3, r1, r2, r2, r0)     // Catch: java.io.FileNotFoundException -> Ld4
            X.O2r r5 = new X.O2r     // Catch: java.io.FileNotFoundException -> Ld4
            r5.<init>(r6)     // Catch: java.io.FileNotFoundException -> Ld4
            X.O2S r1 = X.C61270O2w.LIZ     // Catch: java.io.FileNotFoundException -> Ld4
            com.bytedance.lynx.hybrid.service.IResourceService r0 = r7.getService()     // Catch: java.io.FileNotFoundException -> Ld4
            X.O2J r1 = r1.LIZ(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r0 = r9.LJIILLIIL     // Catch: java.io.FileNotFoundException -> Ld4
            com.bytedance.lynx.hybrid.resource.config.GeckoConfig r1 = X.C39927Flj.LIZIZ(r1, r0)     // Catch: java.io.FileNotFoundException -> Ld4
            X.O2e r0 = r1.getGeckoDepender()     // Catch: java.io.FileNotFoundException -> Ld4
            boolean r0 = r0 instanceof X.InterfaceC61263O2p     // Catch: java.io.FileNotFoundException -> Ld4
            if (r0 == 0) goto L9d
            X.O2e r3 = r1.getGeckoDepender()     // Catch: java.io.FileNotFoundException -> Ld4
            if (r3 == 0) goto La0
            X.O2p r3 = (X.InterfaceC61263O2p) r3     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r1 = r1.getOfflineDir()     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r0 = r9.LJIILLIIL     // Catch: java.io.FileNotFoundException -> Ld4
            long r0 = r3.LIZLLL(r1, r0, r10)     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            r5.LJLJJI = r0     // Catch: java.io.FileNotFoundException -> Ld4
        L9d:
            r4.LIZ = r5     // Catch: java.io.FileNotFoundException -> Ld4
            goto La8
        La0:
            X.Eqm r1 = new X.Eqm     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.lynx.hybrid.resource.IRlLoaderDepender"
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            throw r1     // Catch: java.io.FileNotFoundException -> Ld4
        La8:
            r2 = r4
        La9:
            return r2
        Laa:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Ld4
            r0.<init>()     // Catch: java.io.FileNotFoundException -> Ld4
            r0.append(r8)     // Catch: java.io.FileNotFoundException -> Ld4
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> Ld4
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            throw r1     // Catch: java.io.FileNotFoundException -> Ld4
        Lbf:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Ld4
            r0.<init>()     // Catch: java.io.FileNotFoundException -> Ld4
            r0.append(r8)     // Catch: java.io.FileNotFoundException -> Ld4
            r0.append(r3)     // Catch: java.io.FileNotFoundException -> Ld4
            java.lang.String r0 = r0.toString()     // Catch: java.io.FileNotFoundException -> Ld4
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Ld4
            throw r1     // Catch: java.io.FileNotFoundException -> Ld4
        Ld4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2F.LJFF(android.net.Uri, X.O1M, java.lang.String):X.O2k");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02b6, code lost:
    
        if (r12 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // X.O2X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.O26 r28, X.O1V r29, X.InterfaceC88472Yns<? super X.O26, X.C76800UCe> r30, X.InterfaceC88472Yns<? super java.lang.Throwable, X.C76800UCe> r31) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2F.LIZ(X.O26, X.O1V, X.Yns, X.Yns):void");
    }

    public final void LJI(O26 o26, O1M o1m, String str, String str2, boolean z, InterfaceC88472Yns<? super O26, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        C61265O2r c61265O2r;
        Object LIZ;
        String LIZ2;
        O2Z o2z;
        String str3;
        FileInputStream fileInputStream;
        C61268O2u c61268O2u = new C61268O2u();
        android.net.Uri LJJIJ = C78949Uyf.LJJIJ(C39927Flj.LIZ(str, str2));
        C61258O2k LJFF = LJFF(LJJIJ, o1m, str);
        if (LJFF != null) {
            c61265O2r = LJFF.LIZ();
        } else {
            c61265O2r = null;
        }
        JSONObject jSONObject = o26.LJIILLIIL;
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
            jSONObject.put("g_local", c61268O2u.LIZ() + ((Number) LIZ).longValue());
        }
        if (c61265O2r != null && c61265O2r.LJLJJL.exists()) {
            try {
                fileInputStream = new FileInputStream(c61265O2r.LJLJJL);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
            if (fileInputStream.available() == 0) {
                if (o26 instanceof O2Z) {
                    ((O2Z) o26).LJIIZILJ = "gecko size 0";
                }
                interfaceC88472Yns2.invoke(new FileNotFoundException("size 0"));
                fileInputStream.close();
                return;
            }
            fileInputStream.close();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            o26.LJII = c61265O2r.LJLJJL.getAbsolutePath();
            o26.LJIIIIZZ = EnumC60881Nuv.DISK;
            o26.LJIIIZ = O29.GECKO;
            Long l = c61265O2r.LJLJJI;
            if (l != null) {
                j = l.longValue();
            }
            o26.LJIIJJI = j;
            o26.LJIIJ = z;
            JSONArray jSONArray = o26.LIZLLL;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", this.LIZ);
            jSONObject2.put("status", "success");
            jSONArray.put(jSONObject2);
            o26.LIZ = LJ(o1m);
            interfaceC88472Yns.invoke(o26);
            return;
        }
        boolean z2 = o26 instanceof O2Z;
        if (z2) {
            if (o1m.LJIILLIIL.length() == 0 && ((str3 = (o2z = (O2Z) o26).LJIIZILJ) == null || str3.length() == 0)) {
                o2z.LJIIZILJ = "gecko accessKey invalid";
            } else {
                ((O2Z) o26).LJIIZILJ = "gecko File Not Found";
            }
        }
        if (z2) {
            LIZ2 = ((O2Z) o26).LJIIZILJ;
        } else {
            LIZ2 = C43588H8u.LIZ("file not find ", LJJIJ);
        }
        interfaceC88472Yns2.invoke(new FileNotFoundException(LIZ2));
    }

    public final void LJII(O26 o26, O1V o1v, String str, String str2, String str3, InterfaceC88472Yns<? super O26, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        boolean z;
        C61268O2u c61268O2u = new C61268O2u();
        if (o.LJ(UriProtector.getQueryParameter(o26.LJI, "onlyLocal"), "1") || o1v.LJ) {
            z = true;
            if (o26 instanceof O2Z) {
                ((O2Z) o26).LJIIZILJ = "gecko only local";
                JSONArray jSONArray = o26.LIZLLL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.LIZ);
                jSONObject.put("status", "failed");
                jSONObject.put("detail", o26);
                jSONArray.put(jSONObject);
            }
            interfaceC88472Yns2.invoke(new Exception("gecko only local"));
        } else {
            z = false;
        }
        android.net.Uri LJJIJ = C78949Uyf.LJJIJ(str);
        o1v.LJJ = 1;
        LIZJ(LJJIJ, o1v, new O2N(this, str3, str, str2, o26, c61268O2u, z, o1v, interfaceC88472Yns, interfaceC88472Yns2));
    }
}
