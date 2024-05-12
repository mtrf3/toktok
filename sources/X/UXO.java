package X;

import com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UXO implements UXI {
    public static final KeywordsLibraryInfo LIZJ = new KeywordsLibraryInfo(C61878OQg.INSTANCE, 0);
    public final Keva LIZ;
    public KeywordsLibraryInfo LIZIZ;

    public UXO() {
        Keva repo = Keva.getRepo("hot_word_gift_library");
        o.LJIIIIZZ(repo, "getRepo(KEVA_LIBRARY_REPO_NAME)");
        this.LIZ = repo;
    }

    @Override // X.UXI
    public final KeywordsLibraryInfo LIZIZ(boolean z) {
        KeywordsLibraryInfo keywordsLibraryInfo;
        if (z && (keywordsLibraryInfo = this.LIZIZ) != null) {
            return keywordsLibraryInfo;
        }
        try {
            String string = this.LIZ.getString("full_data", "");
            UXY.LIZ.getClass();
            KeywordsLibraryInfo keywordsLibraryInfo2 = (KeywordsLibraryInfo) GsonProtectorUtils.fromJson(UXW.LIZIZ, string, KeywordsLibraryInfo.class);
            if (keywordsLibraryInfo2 != null) {
                this.LIZIZ = keywordsLibraryInfo2;
                return keywordsLibraryInfo2;
            }
            return LIZJ;
        } catch (s unused) {
            return LIZJ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.UXI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super java.util.List<com.bytedance.android.livesdk.guide.model.KeywordsLibrary>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.UXQ
            if (r0 == 0) goto L31
            r4 = r6
            X.UXQ r4 = (X.UXQ) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L25
            if (r1 != r0) goto L37
            X.C141335gf.LIZJ(r3)
        L20:
            com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo r3 = (com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo) r3
            java.util.List<com.bytedance.android.livesdk.guide.model.KeywordsLibrary> r0 = r3.libraries
            return r0
        L25:
            X.C141335gf.LIZJ(r3)
            r4.LJLJI = r0
            com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo r3 = r5.LIZIZ(r0)
            if (r3 != r2) goto L20
            return r2
        L31:
            X.UXQ r4 = new X.UXQ
            r4.<init>(r5, r6)
            goto L12
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UXO.LIZJ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.UXI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.UXP
            if (r0 == 0) goto L84
            r4 = r10
            X.UXP r4 = (X.UXP) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJL
            r0 = 1
            if (r1 == 0) goto L72
            if (r1 != r0) goto L8a
            com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo r9 = r4.LJLILLLLZI
            X.UXO r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L24:
            com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo r3 = (com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo) r3
            long r3 = r3.version
            long r1 = r9.version
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L38
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L6f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6f
        L38:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = "Storing new library, languages: "
            r3.append(r0)
            java.util.List<com.bytedance.android.livesdk.guide.model.KeywordsLibrary> r0 = r9.libraries
            int r0 = r0.size()
            r3.append(r0)
            java.lang.String r0 = ", version: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r3)
            java.lang.String r0 = "HotWordGift"
            X.C0NB.LIZIZ(r0, r1)
            r5.LIZIZ = r9
            com.bytedance.keva.Keva r2 = r5.LIZ
            X.UXW r0 = X.UXY.LIZ
            r0.getClass()
            com.google.gson.Gson r0 = X.UXW.LIZIZ
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r9)
            java.lang.String r0 = "full_data"
            r2.storeString(r0, r1)
        L6f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L72:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r8
            r4.LJLILLLLZI = r9
            r4.LJLJJL = r0
            com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo r3 = r8.LIZIZ(r0)
            if (r3 != r2) goto L82
            return r2
        L82:
            r5 = r8
            goto L24
        L84:
            X.UXP r4 = new X.UXP
            r4.<init>(r8, r10)
            goto L12
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UXO.LIZ(com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo, X.2kd):java.lang.Object");
    }
}
