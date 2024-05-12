package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS3S0200200_15;
import kotlin.jvm.internal.IDqS439S0100000_15;

/* renamed from: X.XdT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85279XdT implements InterfaceC85336XeO {
    public final /* synthetic */ C85287Xdb LJLIL;

    @Override // X.InterfaceC85336XeO
    public final void LJIIZILJ() {
        C84661XKn c84661XKn = this.LJLIL.LIZLLL;
        if (c84661XKn != null) {
            c84661XKn.LIZIZ(null);
        }
        this.LJLIL.LIZIZ = System.currentTimeMillis();
        C85287Xdb c85287Xdb = this.LJLIL;
        c85287Xdb.LIZJ = 0L;
        c85287Xdb.LIZLLL = XKX.LIZIZ(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new ELW(null), 3);
    }

    @Override // X.InterfaceC85336XeO
    public final void LJIJJLI() {
        C84661XKn c84661XKn = this.LJLIL.LIZLLL;
        if (c84661XKn != null) {
            c84661XKn.LIZIZ(null);
        }
    }

    public C85279XdT(C85287Xdb c85287Xdb) {
        this.LJLIL = c85287Xdb;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC85336XeO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C85284XdY
            if (r0 == 0) goto L85
            r4 = r10
            X.XdY r4 = (X.C85284XdY) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r7 = 1
            if (r0 == 0) goto L6b
            if (r0 != r7) goto L8b
            X.XdT r8 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PopupEnableResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PopupEnableResponse) r1
            long r4 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L69
            int r0 = r1.popupRes
            if (r0 != r7) goto L69
        L2e:
            X.M3Z r3 = new X.M3Z
            java.lang.String r2 = "video_post_page"
            r3.<init>(r2)
            java.lang.String r0 = "data_parse"
            r3.LIZLLL = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            r3.LIZ(r0)
            r4 = 2
            r3.LIZIZ(r4)
            X.C56178M3a.LIZ(r3)
            X.M3Z r6 = new X.M3Z
            r6.<init>(r2)
            java.lang.String r0 = "network_data_parse"
            r6.LIZLLL = r0
            long r2 = java.lang.System.currentTimeMillis()
            X.Xdb r0 = r8.LJLIL
            long r0 = r0.LIZIZ
            long r2 = r2 - r0
            r6.LIZ(r2)
            r6.LIZIZ(r4)
            X.C56178M3a.LIZ(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L69:
            r7 = 0
            goto L2e
        L6b:
            X.C141335gf.LIZJ(r1)
            X.XdU r2 = new X.XdU
            X.Xdb r1 = r9.LJLIL
            r0 = 0
            r2.<init>(r1, r0)
            r4.LJLIL = r9
            r4.LJLJJI = r7
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.C74209TAn.LIZJ(r0, r2, r4)
            if (r1 != r3) goto L83
            return r3
        L83:
            r8 = r9
            goto L22
        L85:
            X.XdY r4 = new X.XdY
            r4.<init>(r9, r10)
            goto L12
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85279XdT.LJJJJLL(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC85336XeO
    public final void LL(C85257Xd7 c85257Xd7) {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert with = companion.with("bpea-poi_publish_extension_fetcher_location");
        with.auth("mttu");
        TokenCert with2 = companion.with("bpea-poi_publish_extension_fetcher_location_decrypt");
        with2.auth("mckd");
        C51733KSb.LIZ("poi", "add_location", with, with2, c85257Xd7, 32);
    }

    @Override // X.InterfaceC85336XeO
    public final void LJJZZIII(double d, double d2, String str, boolean z, long j, IDqS439S0100000_15 iDqS439S0100000_15, AqS181S0100000_15 aqS181S0100000_15, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        C85268XdI c85268XdI = new C85268XdI(d2, d, 0L, str, "RECOMMEND", 20L, 0L, z, 0L, j, null, str2, 1503180);
        long currentTimeMillis2 = System.currentTimeMillis();
        C85269XdJ c85269XdJ = PoiSearchApi.LIZ;
        AqS3S0200200_15 aqS3S0200200_15 = new AqS3S0200200_15(this.LJLIL, currentTimeMillis2, iDqS439S0100000_15, currentTimeMillis, 1);
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert with = companion.with("bpea-poi_search_recommend_client_rank");
        with.auth("evru");
        TokenCert with2 = companion.with("bpea-poi_search_recommend_client_rank_decypt");
        with2.auth("mckd");
        c85269XdJ.getClass();
        C85269XdJ.LJI(c85268XdI, aqS3S0200200_15, aqS181S0100000_15, with, with2);
    }
}
