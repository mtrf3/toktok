package X;

import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import kotlin.jvm.internal.AqS77S1100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Nsv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60757Nsv {
    public static boolean LIZ;
    public static long LIZIZ;
    public static String LIZJ;

    static {
        C76800UCe c76800UCe;
        boolean z;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("hybrid_starling_resource_preload_config");
            if (config != null) {
                if (config.optInt("enable", 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                LIZ = z;
                LIZIZ = config.optLong("max_block_duration", 3000L);
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        HybridSettings.INSTANCE.registerSettings("hybrid_starling_resource_preload_config", new C60758Nsw());
        LIZ = true;
        LIZIZ = 3000L;
    }

    public static String LIZ(String channel) {
        o.LJIIJ(channel, "channel");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("lynx_i18n://");
        LIZ2.append(channel);
        LIZ2.append("/lang.json");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ(C60737Nsb c60737Nsb) {
        String str = LIZJ;
        if (str != null) {
            return str;
        }
        Object obj = c60737Nsb.runtimeInfo.get((Object) "appLanguage");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        return (String) ListProtector.get(s.LJLJJI(C60605NqT.LIZ(), new char[]{'-'}, false, 6), 0);
    }

    public static boolean LJ(C60737Nsb hybridContext) {
        HybridSchemaParam LIZLLL;
        String starlingChannel;
        o.LJIIJ(hybridContext, "hybridContext");
        if (!LIZ) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "preload i18n resource disabled", null, "LYNX_I18N", 2);
            return true;
        }
        InterfaceC60710NsA interfaceC60710NsA = hybridContext.hybridParams;
        if (interfaceC60710NsA != null && (LIZLLL = interfaceC60710NsA.LIZLLL()) != null && (starlingChannel = LIZLLL.getStarlingChannel()) != null) {
            StringBuilder LIZJ2 = b1.LIZJ(starlingChannel, "__");
            LIZJ2.append(LIZIZ(hybridContext));
            String LIZIZ2 = X1D.LIZIZ(LIZJ2);
            if (LIZIZ2 != null) {
                C61325O4z.LJ(new AqS77S1100000_10(hybridContext, LIZIZ2, 1));
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r4 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C60756Nsu LIZJ(X.C60737Nsb r3, java.lang.String r4) {
        /*
            boolean r0 = X.C60757Nsv.LIZ
            r2 = 0
            if (r0 != 0) goto L6
            return r2
        L6:
            java.lang.Class<X.Nsu> r0 = X.C60756Nsu.class
            java.lang.Object r1 = r3.LIZIZ(r0)
            X.Nsu r1 = (X.C60756Nsu) r1
            if (r1 == 0) goto L1b
            if (r4 == 0) goto L1a
            java.lang.String r0 = r1.LJIIIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L1d
        L1a:
            return r1
        L1b:
            if (r4 == 0) goto L28
        L1d:
            X.Nsu r1 = new X.Nsu
            r1.<init>(r4)
            java.lang.Class<X.Nsu> r0 = X.C60756Nsu.class
            r3.LJII(r0, r1)
            return r1
        L28:
            X.NsA r0 = r3.hybridParams
            if (r0 == 0) goto L4c
            com.bytedance.lynx.hybrid.param.HybridSchemaParam r0 = r0.LIZLLL()
            if (r0 == 0) goto L4c
            java.lang.String r1 = r0.getStarlingChannel()
            if (r1 == 0) goto L4c
            java.lang.String r0 = "__"
            java.lang.StringBuilder r1 = defpackage.b1.LIZJ(r1, r0)
            java.lang.String r0 = LIZIZ(r3)
            r1.append(r0)
            java.lang.String r4 = X.X1D.LIZIZ(r1)
            if (r4 == 0) goto L4c
            goto L1d
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60757Nsv.LIZJ(X.Nsb, java.lang.String):X.Nsu");
    }

    public static void LIZLLL(C60737Nsb c60737Nsb, C61295O3v response, boolean z, long j, String str) {
        String LIZ2;
        android.net.Uri LIZIZ2;
        o.LJIIJ(response, "response");
        if (!LIZ) {
            return;
        }
        if (c60737Nsb == null) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, "try handle response but hybridContext is null", null, "LYNX_I18N", 2);
            return;
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        C39048FUe.LIZIZ(c39048FUe, "response handled", null, "LYNX_I18N", 2);
        C60756Nsu LIZJ2 = LIZJ(c60737Nsb, str);
        if (LIZJ2 != null) {
            LIZJ2.LJFF = j;
            LIZJ2.LJI = System.currentTimeMillis();
            String str2 = response.LJZI.getGeckoModel().LJLILLLLZI;
            o.LJIIJ(str2, "<set-?>");
            LIZJ2.LJIIIZ = str2;
            LIZJ2.LIZ = z ? 1 : 0;
            LIZJ2.LJ = response.LLFFF;
            LIZJ2.LIZLLL = response.LJLLLLLL ? 1 : 0;
            LIZJ2.LIZJ = response.P(response.LLD);
            if (!LIZ) {
                return;
            }
            InterfaceC60710NsA interfaceC60710NsA = c60737Nsb.hybridParams;
            if (interfaceC60710NsA == null || (LIZIZ2 = interfaceC60710NsA.LIZIZ()) == null || (LIZ2 = LIZIZ2.toString()) == null) {
                LIZ2 = LIZ(LIZJ2.LJIIIZ);
            }
            o.LJFF(LIZ2, "hybridContext.hybridPara…ummyUrl(category.channel)");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", LIZJ2.LIZ);
            jSONObject.put("block_time", LIZJ2.LIZIZ);
            jSONObject.put("res_from", LIZJ2.LIZJ);
            jSONObject.put("is_preload", LIZJ2.LIZLLL);
            jSONObject.put("channel", LIZJ2.LJIIIZ);
            jSONObject.put("channel_version", LIZJ2.LJ);
            jSONObject.put("finish_timestamp", LIZJ2.LJI);
            jSONObject.put("finish_time", LIZJ2.LJI - LIZJ2.LJFF);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("starling load finished: ");
            LIZ3.append(jSONObject);
            C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ3), null, "LYNX_I18N", 2);
            InterfaceC60761Nsz LJI = c60737Nsb.LJI();
            if (LJI != null) {
                LJI.LIZ(C51029K0z.LJJIIZI(new OSZ("starlingInfo", C113554cx.LJJLIIIIJ(new OSZ("state", Integer.valueOf(LIZJ2.LIZ)), new OSZ("block_time", Long.valueOf(LIZJ2.LIZIZ)), new OSZ("res_from", LIZJ2.LIZJ), new OSZ("is_preload", Integer.valueOf(LIZJ2.LIZLLL)), new OSZ("channel", LIZJ2.LJIIIZ), new OSZ("channel_version", Long.valueOf(LIZJ2.LJ)), new OSZ("finish_timestamp", Long.valueOf(LIZJ2.LJI)), new OSZ("finish_time", Long.valueOf(LIZJ2.LJI - LIZJ2.LJFF))))));
            }
            String str3 = c60737Nsb.containerId;
            C79605VMb c79605VMb = new C79605VMb("hybrid_starling_load_finish_status");
            c79605VMb.LIZIZ = c60737Nsb.bid;
            c79605VMb.LIZ = LIZ2;
            c79605VMb.LIZLLL = jSONObject;
            c79605VMb.LIZIZ(0);
            FD5.LJ(str3, c79605VMb.LIZ());
        }
    }
}
