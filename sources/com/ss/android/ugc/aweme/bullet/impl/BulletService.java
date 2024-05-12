package com.ss.android.ugc.aweme.bullet.impl;

import X.C10K;
import X.C141335gf;
import X.C1JD;
import X.C221108m2;
import X.C34582Dhi;
import X.C36602EYc;
import X.C36777Ec1;
import X.C36817Ecf;
import X.C36939Eed;
import X.C36989EfR;
import X.C37003Eff;
import X.C38946FQg;
import X.C38947FQh;
import X.C39941Flx;
import X.C3C5;
import X.C40026FnK;
import X.C47117IeP;
import X.C47261Igj;
import X.C58096Mr6;
import X.C5H3;
import X.C60263Nkx;
import X.C60373Nmj;
import X.C77412UZs;
import X.C78685UuP;
import X.C79045V0n;
import X.E2J;
import X.EF7;
import X.EnumC221088m0;
import X.FFL;
import X.GTG;
import X.InterfaceC38945FQf;
import X.InterfaceC60250Nkk;
import X.InterfaceC60260Nku;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxEnv;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BulletService implements IBulletService {
    public final C5H3 LIZ;
    public final C5H3 LIZIZ;

    public static IBulletService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IBulletService.class, false);
        if (LIZ != null) {
            return (IBulletService) LIZ;
        }
        if (C58096Mr6.LLJJJJJIL == null) {
            synchronized (IBulletService.class) {
                if (C58096Mr6.LLJJJJJIL == null) {
                    C58096Mr6.LLJJJJJIL = new BulletService();
                }
            }
        }
        return C58096Mr6.LLJJJJJIL;
    }

    public static void LIZJ() {
        List LJJIJ = C47261Igj.LJJIJ(new C36939Eed(C47261Igj.LJJIJIIJI("gecko_hybrid_prefetch_config", "fe_tiktok_ecommerce_affiliate_prefetch", "resso-tt-lynx_full_song")));
        C36989EfR c36989EfR = new C36989EfR();
        c36989EfR.LJIIIIZZ = 32;
        c36989EfR.LIZ = new C36817Ecf(EF7.LIZIZ(), "bullet_prefetch_store");
        c36989EfR.LIZLLL = new C36777Ec1(LJJIJ);
        c36989EfR.LJI = new C77412UZs();
        c36989EfR.LJFF = new C78685UuP();
        c36989EfR.LIZJ = new C36602EYc();
        ExecutorService BACKGROUND_EXECUTOR = C10K.LJI;
        o.LJIIIIZZ(BACKGROUND_EXECUTOR, "BACKGROUND_EXECUTOR");
        c36989EfR.LIZIZ = BACKGROUND_EXECUTOR;
        C60373Nmj.LIZIZ().LIZLLL(InterfaceC60260Nku.class, new C37003Eff(c36989EfR.LIZ()));
    }

    public final C60263Nkx LIZIZ() {
        return (C60263Nkx) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final boolean LJII() {
        return C34582Dhi.LIZIZ("BulletPreloadTask");
    }

    public BulletService() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        this.LIZ = C221108m2.LIZ(enumC221088m0, new AqS156S0100000_6(this, 31));
        this.LIZIZ = C221108m2.LIZ(enumC221088m0, new AqS156S0100000_6(this, 30));
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJI() {
        LIZIZ().getClass();
        LynxEnv.LJIIIZ().LJIJJLI = false;
        C39941Flx.LIZ();
        C40026FnK.LIZ.LIZ();
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "bullet_service_preload", true, true)) {
            LynxEnv.LJIIIZ().LJIIL();
        }
        if (!LJII()) {
            LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final C60263Nkx LJIILIIL() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJFF() {
        LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJ(Context context) {
        o.LJIIIZ(context, "context");
        C38947FQh.LIZ = new C38946FQg(this);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final String LJIIJ(String str) {
        String LIZ = E2J.LIZ(str);
        if (LIZ == null) {
            return str;
        }
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final View LJIIJJI(Context context) {
        o.LJIIIZ(context, "context");
        return new GTG(context);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJIIL(Class<?> cls) {
        InterfaceC60250Nkk<?, ?, ?, ?> interfaceC60250Nkk;
        Iterator<InterfaceC60250Nkk<?, ?, ?, ?>> it = LIZIZ().LIZ.m3().iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC60250Nkk = it.next();
                if (cls.isAssignableFrom(interfaceC60250Nkk.getClass())) {
                    break;
                }
            } else {
                interfaceC60250Nkk = null;
                break;
            }
        }
        InterfaceC60250Nkk<?, ?, ?, ?> interfaceC60250Nkk2 = interfaceC60250Nkk;
        if (interfaceC60250Nkk2 != null) {
            interfaceC60250Nkk2.LLLLIIIILLL();
        }
    }

    public static Uri LJIILJJIL(Context context, Uri uri) {
        boolean z;
        Uri uri2;
        Object LIZ;
        if (uri.isHierarchical() && o.LJ(UriProtector.getQueryParameter(uri, "container_bgcolor"), "app_theme")) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            uri2 = uri;
        } else {
            uri2 = null;
        }
        if (uri2 != null) {
            try {
                Integer LJI = C79045V0n.LJI(R.attr.cl, context);
                if (LJI != null) {
                    LIZ = Integer.toHexString(LJI.intValue());
                } else {
                    LIZ = null;
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (!C3C5.m12isFailureimpl(LIZ)) {
                obj = LIZ;
            }
            String str = (String) obj;
            if (str != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("replace app_theme with ");
                LIZ2.append(str);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BulletService", X1D.LIZIZ(LIZ2));
                if (uri2.isHierarchical()) {
                    Uri.Builder clearQuery = uri2.buildUpon().clearQuery();
                    Iterator LIZ3 = C47117IeP.LIZ(uri2, "uri.queryParameterNames");
                    while (LIZ3.hasNext()) {
                        String str2 = (String) LIZ3.next();
                        if (!o.LJ(str2, "container_bgcolor")) {
                            clearQuery.appendQueryParameter(str2, UriProtector.getQueryParameter(uri2, str2));
                        }
                    }
                    clearQuery.appendQueryParameter("container_bgcolor", str);
                    Uri build = clearQuery.build();
                    o.LJIIIIZZ(build, "result.build()");
                    return build;
                }
            }
            return uri2;
        }
        return uri;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJIIIIZZ(Context context, String schema) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        LIZLLL(context, schema, null, null);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final boolean LJIIIZ(Context context, String containerID) {
        o.LJIIIZ(containerID, "containerID");
        InterfaceC38945FQf interfaceC38945FQf = (InterfaceC38945FQf) C60373Nmj.LIZIZ().LIZ(InterfaceC38945FQf.class);
        if (interfaceC38945FQf != null) {
            return interfaceC38945FQf.LJIIJ(containerID, new C1JD());
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void open(Context context, String schema, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        LIZLLL(context, schema, null, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r6.LIZIZ()
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            java.util.Set r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r2)
            java.lang.String r3 = "use_spark"
            boolean r0 = r0.contains(r3)
            java.lang.String r1 = "1"
            if (r0 != 0) goto L31
            boolean r0 = X.C35546DxG.LIZLLL(r8)
            if (r0 == 0) goto L31
            android.net.Uri$Builder r0 = r2.buildUpon()
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r3, r1)
            android.net.Uri r2 = r0.build()
        L31:
            r5 = 0
            if (r2 == 0) goto L35
            goto L37
        L35:
            r0 = 0
            goto L3b
        L37:
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r2, r3)     // Catch: java.lang.Throwable -> L45
        L3b:
            boolean r1 = kotlin.jvm.internal.o.LJ(r0, r1)     // Catch: java.lang.Throwable -> L45
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L48
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L48
            goto L50
        L45:
            r0 = move-exception
            r1 = 0
            goto L49
        L48:
            r0 = move-exception
        L49:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L50:
            if (r1 == 0) goto L69
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r0 = "aweme"
            android.net.Uri r0 = X.E98.LIZ(r2, r0)
            java.lang.String r0 = r0.toString()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r7, r0)
            r0.open()
        L68:
            return
        L69:
            X.Nlw r1 = X.C60373Nmj.LIZIZ()
            java.lang.Class<X.FQf> r0 = X.InterfaceC38945FQf.class
            X.Nmx r4 = r1.LIZ(r0)
            X.FQf r4 = (X.InterfaceC38945FQf) r4
            if (r4 == 0) goto L68
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            java.lang.String r0 = "parse(schema)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.4uD r2 = new X.4uD
            r2.<init>(r5)
            if (r10 != 0) goto L8c
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
        L8c:
            r2.LIZ = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r9 == 0) goto L98
            r0.add(r9)
        L98:
            r2.LIZJ = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.FQl r0 = new X.FQl
            r0.<init>(r6, r7)
            r1.add(r0)
            X.FQk r0 = new X.FQk
            r0.<init>(r6, r7)
            r1.add(r0)
            X.FQe r0 = new X.FQe
            r0.<init>(r6, r7)
            r1.add(r0)
            r2.LIZLLL = r1
            X.Nns r0 = new X.Nns
            r0.<init>()
            r2.LJFF = r0
            r4.LJIJJ(r7, r3, r2)
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.impl.BulletService.LIZLLL(android.content.Context, java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}
