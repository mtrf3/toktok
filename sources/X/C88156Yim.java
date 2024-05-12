package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Yim, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88156Yim implements InterfaceC80883Fk {
    public final InterfaceC80883Fk LIZ;
    public final C40679Fxr LIZIZ;
    public final InterfaceC75532xp LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C88157Yin
            if (r0 == 0) goto L20
            r4 = r6
            X.Yin r4 = (X.C88157Yin) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            X.Yim r2 = r4.LJLIL
            goto L40
        L20:
            X.Yin r4 = new X.Yin
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L46
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L46
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L46
            java.lang.Object r0 = r0.LIZ(r4)     // Catch: java.lang.Exception -> L46
            if (r0 != r2) goto L3e
            return r2
        L3e:
            r2 = r5
            goto L43
        L40:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L49
        L43:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> L49
            return r0
        L46:
            r1 = move-exception
            r2 = r5
            goto L4a
        L49:
            r1 = move-exception
        L4a:
            java.lang.String r0 = "clear"
            r2.LJIJI(r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C88164Yiu
            if (r0 == 0) goto L20
            r4 = r6
            X.Yiu r4 = (X.C88164Yiu) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yiu r4 = new X.Yiu
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LIZIZ(r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "getAllUids"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LIZIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C88166Yiw
            if (r0 == 0) goto L20
            r4 = r6
            X.Yiw r4 = (X.C88166Yiw) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yiw r4 = new X.Yiw
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LIZJ(r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "getFriendsCount"
            r2.LJIJI(r1, r0)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = 0
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LIZJ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C88168Yiy
            if (r0 == 0) goto L20
            r4 = r6
            X.Yiy r4 = (X.C88168Yiy) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yiy r4 = new X.Yiy
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L46
            goto L42
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L43
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L43
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L43
            java.lang.Object r3 = r0.LIZLLL(r4)     // Catch: java.lang.Exception -> L43
            if (r3 != r2) goto L42
            return r2
        L42:
            return r3
        L43:
            r1 = move-exception
            r2 = r5
            goto L47
        L46:
            r1 = move-exception
        L47:
            java.lang.String r0 = "getRowCount"
            r2.LJIJI(r1, r0)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = 0
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LIZLLL(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC80883Fk
    public final List<IMUser> LJ(String str) {
        try {
            return this.LIZ.LJ(str);
        } catch (Exception e) {
            LJIJI(e, "queryBySortWeight");
            return new ArrayList();
        }
    }

    @Override // X.InterfaceC80883Fk
    public final IMUser LJII(String secUid) {
        o.LJIIIZ(secUid, "secUid");
        try {
            return this.LIZ.LJII(secUid);
        } catch (Exception e) {
            LJIJI(e, "getIMUserBySecUid");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C88163Yit
            if (r0 == 0) goto L20
            r4 = r6
            X.Yit r4 = (X.C88163Yit) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yit r4 = new X.Yit
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJIIJJI(r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "getAll"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIIJJI(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC80883Fk
    public final IMUser LJIIL(String uid) {
        o.LJIIIZ(uid, "uid");
        try {
            return this.LIZ.LJIIL(uid);
        } catch (Exception e) {
            LJIJI(e, "getIMUserByUid");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.InterfaceC67352kd<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C88165Yiv
            if (r0 == 0) goto L20
            r4 = r6
            X.Yiv r4 = (X.C88165Yiv) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yiv r4 = new X.Yiv
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJIILIIL(r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "getFollowingAndCanSendMessageCount"
            r2.LJIJI(r1, r0)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = 0
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIILIIL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC67352kd<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C88171Yj1
            if (r0 == 0) goto L20
            r4 = r6
            X.Yj1 r4 = (X.C88171Yj1) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yj1 r4 = new X.Yj1
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJIILL(r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "isEmpty"
            r2.LJIJI(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIILL(X.2kd):java.lang.Object");
    }

    public C88156Yim(YW2 yw2, C40679Fxr c40679Fxr) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        this.LIZ = yw2;
        this.LIZIZ = c40679Fxr;
        this.LIZJ = onEventV3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(int r6, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C88172Yj2
            if (r0 == 0) goto L20
            r4 = r7
            X.Yj2 r4 = (X.C88172Yj2) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yj2 r4 = new X.Yj2
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJFF(r6, r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "loadIMUsersForBatchUpdate"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJFF(int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r6, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C88167Yix
            if (r0 == 0) goto L20
            r4 = r7
            X.Yix r4 = (X.C88167Yix) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yix r4 = new X.Yix
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJI(r6, r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "getLimitCanSendMsgFriends"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJI(int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C88169Yiz
            if (r0 == 0) goto L20
            r4 = r7
            X.Yiz r4 = (X.C88169Yiz) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yiz r4 = new X.Yiz
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L45
            goto L4b
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L42
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L42
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.LJIIIIZZ(r6, r4)     // Catch: java.lang.Exception -> L42
            if (r0 != r2) goto L4b
            return r2
        L42:
            r1 = move-exception
            r2 = r5
            goto L46
        L45:
            r1 = move-exception
        L46:
            java.lang.String r0 = "insertOrReplaceIMUser"
            r2.LJIJI(r1, r0)
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIIIIZZ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C88158Yio
            if (r0 == 0) goto L20
            r4 = r7
            X.Yio r4 = (X.C88158Yio) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yio r4 = new X.Yio
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L45
            goto L4b
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L42
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L42
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.LJIILJJIL(r6, r4)     // Catch: java.lang.Exception -> L42
            if (r0 != r2) goto L4b
            return r2
        L42:
            r1 = move-exception
            r2 = r5
            goto L46
        L45:
            r1 = move-exception
        L46:
            java.lang.String r0 = "delete"
            r2.LJIJI(r1, r0)
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIILJJIL(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C88170Yj0
            if (r0 == 0) goto L20
            r4 = r7
            X.Yj0 r4 = (X.C88170Yj0) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yj0 r4 = new X.Yj0
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L45
            goto L4b
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L42
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L42
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.LJIJ(r6, r4)     // Catch: java.lang.Exception -> L42
            if (r0 != r2) goto L4b
            return r2
        L42:
            r1 = move-exception
            r2 = r5
            goto L46
        L45:
            r1 = move-exception
        L46:
            java.lang.String r0 = "insertOrReplaceIMUserWithMentionFields"
            r2.LJIJI(r1, r0)
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIJ(java.util.List, X.2kd):java.lang.Object");
    }

    public final void LJIJI(Exception exc, String str) {
        C39689Fht LIZ;
        C34B.LJ("IMUserDaoErrorReporter", exc);
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("transactionName", str), new OSZ("isRoom", "true"));
        C40679Fxr c40679Fxr = this.LIZIZ;
        c40679Fxr.getClass();
        Throwable th = exc;
        while (true) {
            if (th != null) {
                if (th instanceof SQLiteDatabaseCorruptException) {
                    boolean z = ((Keva) c40679Fxr.LJ.getValue()).getBoolean("did_tried_recover", false);
                    LJJLIIIIJ.put("did_tried_recover", String.valueOf(z));
                    if (!z) {
                        C88173Yj3 c88173Yj3 = new C88173Yj3(c40679Fxr.LIZ, c40679Fxr.LIZJ);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        try {
                            SQLiteDatabase.deleteDatabase(EF7.LIZIZ().getDatabasePath("db_im_xx"));
                            linkedHashMap.put("result", "success");
                        } catch (Exception e) {
                            linkedHashMap.put("result", "fail");
                            linkedHashMap.putAll(C86623ac.LIZ(e));
                        }
                        c88173Yj3.LIZIZ.LIZIZ(c88173Yj3.LIZ + "_CORRUPTION", linkedHashMap);
                        ((Keva) c40679Fxr.LJ.getValue()).storeBoolean("did_tried_recover", true);
                        return;
                    }
                } else {
                    th = th.getCause();
                }
            } else if (exc instanceof SQLiteFullException) {
                try {
                    LIZ = c40679Fxr.LIZIZ.invoke();
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th2) {
                    LIZ = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ);
                }
                C39689Fht c39689Fht = new C39689Fht();
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = c39689Fht;
                }
                C39689Fht c39689Fht2 = (C39689Fht) LIZ;
                LJJLIIIIJ.put("appStorageSize", String.valueOf(c39689Fht2.LJ));
                LJJLIIIIJ.put("availableExternalSize", String.valueOf(c39689Fht2.LIZ));
                LJJLIIIIJ.put("availableInternalSize", String.valueOf(c39689Fht2.LIZJ));
                LJJLIIIIJ.put("totalExternalSize", String.valueOf(c39689Fht2.LIZIZ));
                LJJLIIIIJ.put("totalInternalSize", String.valueOf(c39689Fht2.LIZLLL));
                LJJLIIIIJ.put("isExternalStorage", String.valueOf(c39689Fht2.LJII));
            }
        }
        LJJLIIIIJ.putAll(C86623ac.LIZ(exc));
        this.LIZJ.LIZIZ("SIMPLE_USER_ERROR", LJJLIIIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(int r6, java.util.List<java.lang.String> r7, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C88159Yip
            if (r0 == 0) goto L20
            r4 = r8
            X.Yip r4 = (X.C88159Yip) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yip r4 = new X.Yip
            r4.<init>(r5, r8)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L46
            goto L42
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L43
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L43
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L43
            java.lang.Object r3 = r0.LJIIJ(r6, r7, r4)     // Catch: java.lang.Exception -> L43
            if (r3 != r2) goto L42
            return r2
        L42:
            return r3
        L43:
            r1 = move-exception
            r2 = r5
            goto L47
        L46:
            r1 = move-exception
        L47:
            java.lang.String r0 = "findRecTypeUser"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIIJ(int, java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.util.List<java.lang.String> r6, int r7, int r8, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C88162Yis
            if (r0 == 0) goto L20
            r4 = r9
            X.Yis r4 = (X.C88162Yis) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yis r4 = new X.Yis
            r4.<init>(r5, r9)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJIILLIIL(r6, r7, r8, r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "findWithUids"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIILLIIL(java.util.List, int, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(java.util.List<java.lang.String> r6, int r7, int r8, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C88161Yir
            if (r0 == 0) goto L20
            r4 = r9
            X.Yir r4 = (X.C88161Yir) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.Yim r2 = r4.LJLIL
            goto L26
        L20:
            X.Yir r4 = new X.Yir
            r4.<init>(r5, r9)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJIIZILJ(r6, r7, r8, r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "findWithSecUids"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIIZILJ(java.util.List, int, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.List<java.lang.String> r10, int r11, int r12, java.lang.String r13, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.C88160Yiq
            if (r0 == 0) goto L20
            r8 = r14
            X.Yiq r8 = (X.C88160Yiq) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r3 = r8.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r8.LJLJJI
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            X.Yim r2 = r8.LJLIL
            goto L26
        L20:
            X.Yiq r8 = new X.Yiq
            r8.<init>(r9, r14)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L4a
            goto L46
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r3)
            X.3Fk r3 = r9.LIZ     // Catch: java.lang.Exception -> L47
            r8.LJLIL = r9     // Catch: java.lang.Exception -> L47
            r8.LJLJJI = r0     // Catch: java.lang.Exception -> L47
            r5 = r11
            r4 = r10
            r7 = r13
            r6 = r12
            java.lang.Object r3 = r3.LJIIIZ(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L47
            if (r3 != r2) goto L46
            return r2
        L46:
            return r3
        L47:
            r1 = move-exception
            r2 = r9
            goto L4b
        L4a:
            r1 = move-exception
        L4b:
            java.lang.String r0 = "findWithCondition"
            r2.LJIJI(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88156Yim.LJIIIZ(java.util.List, int, int, java.lang.String, X.2kd):java.lang.Object");
    }
}
