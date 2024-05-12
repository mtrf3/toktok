package X;

import android.app.Activity;
import android.content.res.Configuration;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.36c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C784636c implements G27 {
    public final Activity LJLIL;
    public final IMUser LJLILLLLZI;
    public final String LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<IMUser, C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJLL;
    public final String LJLJL;
    public C26231ARf LJLJLJ;

    public final void LIZIZ() {
        this.LJLJJLL.invoke(Boolean.FALSE);
        String str = this.LJLJI;
        String uid = this.LJLILLLLZI.getUid();
        o.LJIIIIZZ(uid, "mUser.uid");
        String str2 = this.LJLJL;
        C85323Wm LIZJ = C05040Hs.LIZJ(str, "origin", "onEventV3");
        C1HQ LIZJ2 = HXX.LIZJ("enter_from", str, "target", "cancel");
        LIZJ2.put("to_user_id", uid);
        if (str2 != null && str2.length() != 0) {
            LIZJ2.put("chat_type", str2);
        }
        LIZJ.LIZIZ("block_confirm", LIZJ2);
    }

    public final void LJI() {
        String string;
        int i;
        if (this.LJLILLLLZI.isBlock()) {
            C26227ARb c26227ARb = new C26227ARb(this.LJLIL);
            c26227ARb.LJFF(this.LJLIL.getString(R.string.has, this.LJLILLLLZI.getNickName(), this.LJLILLLLZI.getUniqueId()));
            c26227ARb.LIZIZ(this.LJLIL.getString(R.string.hap, this.LJLILLLLZI.getNickName()));
            UC0.LIZJ(c26227ARb, new AqS167S0100000_1(this, 349));
            c26227ARb.LIZJ(new AqS167S0100000_1(this, 350));
            C26231ARf LJI = c26227ARb.LJI();
            this.LJLJLJ = LJI;
            LJI.LIZLLL();
            String str = this.LJLJI;
            C85323Wm LIZJ = C05040Hs.LIZJ(str, "origin", "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("enter_from", str);
            LIZJ.LIZIZ("unblock_popup_show", c1hq);
            return;
        }
        if (o.LJ(this.LJLJI, "group_detail_page")) {
            string = this.LJLIL.getString(R.string.gxc, this.LJLILLLLZI.getNickName());
        } else {
            string = this.LJLIL.getString(R.string.haf, this.LJLILLLLZI.getNickName(), this.LJLILLLLZI.getUniqueId());
        }
        o.LJIIIIZZ(string, "if (origin == ImImproveB…mUser.uniqueId)\n        }");
        if (o.LJ(this.LJLJI, "group_detail_page")) {
            i = R.string.gxd;
        } else {
            i = R.string.ha9;
        }
        C26227ARb c26227ARb2 = new C26227ARb(this.LJLIL);
        c26227ARb2.LJFF(string);
        c26227ARb2.LIZ(i);
        UC0.LIZJ(c26227ARb2, new AqS167S0100000_1(this, 345));
        c26227ARb2.LIZJ(new AqS167S0100000_1(this, 346));
        C26231ARf LJI2 = c26227ARb2.LJI();
        this.LJLJLJ = LJI2;
        LJI2.LIZLLL();
        String str2 = this.LJLJI;
        String str3 = this.LJLJL;
        C85323Wm LIZJ2 = C05040Hs.LIZJ(str2, "origin", "onEventV3");
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", str2);
        if (str3 != null && str3.length() != 0) {
            LIZIZ.put("chat_type", str3);
        }
        LIZJ2.LIZIZ("block_popup_show", LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C784536b
            if (r0 == 0) goto L4f
            r6 = r8
            X.36b r6 = (X.C784536b) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L3f
            if (r0 != r3) goto L55
            X.C141335gf.LIZJ(r1)
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            X.C141335gf.LIZJ(r1)
            X.UtN r1 = X.C36636EZk.LIZ
            X.36R r0 = new X.36R
            r0.<init>(r7, r4)
            r6.LJLIL = r7
            r6.LJLJJI = r2
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r6)
            if (r0 != r5) goto L3d
            return r5
        L3d:
            r0 = r7
            goto L44
        L3f:
            X.36c r0 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L44:
            r6.LJLIL = r4
            r6.LJLJJI = r3
            java.lang.Object r0 = r0.LJ(r2, r6)
            if (r0 != r5) goto L24
            return r5
        L4f:
            X.36b r6 = new X.36b
            r6.<init>(r7, r8)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784636c.LIZLLL(X.2kd):java.lang.Object");
    }

    public final void LJFF(int i) {
        String string;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    string = this.LJLIL.getString(R.string.h5q);
                } else {
                    string = this.LJLIL.getString(R.string.hat, this.LJLILLLLZI.getNickName());
                }
            } else {
                string = this.LJLIL.getString(R.string.hah, this.LJLILLLLZI.getNickName());
            }
        } else {
            string = this.LJLIL.getString(R.string.h5q);
        }
        o.LJIIIIZZ(string, "when (type) {\n          …rror_and_retry)\n        }");
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJIIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C36Z
            if (r0 == 0) goto L68
            r6 = r10
            X.36Z r6 = (X.C36Z) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r7 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 0
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L76
            if (r0 == r2) goto L57
            if (r0 != r3) goto L6e
            X.C141335gf.LIZJ(r7)
        L27:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2a:
            X.C141335gf.LIZJ(r7)
            int r0 = r9.getBlockStaus()
            if (r0 != r1) goto L3c
            r6.LJLJJI = r1
            java.lang.Object r0 = r8.LIZLLL(r6)
            if (r0 != r5) goto L79
            return r5
        L3c:
            int r0 = r9.getBlockStaus()
            if (r0 != 0) goto L7c
        L43:
            X.UtN r1 = X.C36636EZk.LIZ
            X.36S r0 = new X.36S
            r0.<init>(r8, r4)
            r6.LJLIL = r8
            r6.LJLJJI = r2
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r6)
            if (r0 != r5) goto L55
            return r5
        L55:
            r1 = r8
            goto L5c
        L57:
            X.36c r1 = r6.LJLIL
            X.C141335gf.LIZJ(r7)
        L5c:
            r6.LJLIL = r4
            r6.LJLJJI = r3
            r0 = 0
            java.lang.Object r0 = r1.LJ(r0, r6)
            if (r0 != r5) goto L27
            return r5
        L68:
            X.36Z r6 = new X.36Z
            r6.<init>(r8, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            X.C141335gf.LIZJ(r7)
        L79:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784636c.LIZJ(com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(boolean r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C784436a
            if (r0 == 0) goto L64
            r5 = r9
            X.36a r5 = (X.C784436a) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r6 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L4c
            if (r0 != r3) goto L6a
            X.C141335gf.LIZJ(r1)
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            X.C141335gf.LIZJ(r1)
            if (r8 == 0) goto L37
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r7.LJLILLLLZI
            r1 = 0
            r0.setFollowStatus(r1)
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r7.LJLILLLLZI
            r0.setFollowerStatus(r1)
        L37:
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r7.LJLILLLLZI
            r0.setBlock(r8)
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r7.LJLILLLLZI
            r5.LJLIL = r7
            r5.LJLJJI = r2
            r0 = 6
            java.lang.Object r0 = X.C80533Eb.LJIJ(r1, r6, r5, r0)
            if (r0 != r4) goto L4a
            return r4
        L4a:
            r2 = r7
            goto L51
        L4c:
            X.36c r2 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L51:
            X.UtN r1 = X.C36636EZk.LIZ
            X.36Q r0 = new X.36Q
            r0.<init>(r2, r6)
            r5.LJLIL = r6
            r5.LJLJJI = r3
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r5)
            if (r0 != r4) goto L24
            return r4
        L64:
            X.36a r5 = new X.36a
            r5.<init>(r7, r9)
            goto L12
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C784636c.LJ(boolean, X.2kd):java.lang.Object");
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        C26231ARf c26231ARf;
        o.LJIIIZ(newConfig, "newConfig");
        C26231ARf c26231ARf2 = this.LJLJLJ;
        if (c26231ARf2 != null && c26231ARf2.LJII() && (c26231ARf = this.LJLJLJ) != null) {
            c26231ARf.LIZIZ(null);
        }
    }

    public final void LIZ(int i, String str, String str2) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C36O(this, null), 3);
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C36T(this, str, str2, i, null), 3);
    }

    public C784636c(Activity context, IMUser mUser, String origin, AqS151S0100000_1 aqS151S0100000_1, InterfaceC88472Yns onDone, AqS167S0100000_1 aqS167S0100000_1, String str, int i) {
        InterfaceC65784Pro onStartUpdate = aqS151S0100000_1;
        onStartUpdate = (i & 8) != 0 ? C785036g.LJLIL : onStartUpdate;
        onDone = (i & 16) != 0 ? C784936f.LJLIL : onDone;
        InterfaceC88472Yns setSwitchCheckState = aqS167S0100000_1;
        setSwitchCheckState = (i & 32) != 0 ? C784836e.LJLIL : setSwitchCheckState;
        str = (i & 64) != 0 ? null : str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mUser, "mUser");
        o.LJIIIZ(origin, "origin");
        o.LJIIIZ(onStartUpdate, "onStartUpdate");
        o.LJIIIZ(onDone, "onDone");
        o.LJIIIZ(setSwitchCheckState, "setSwitchCheckState");
        this.LJLIL = context;
        this.LJLILLLLZI = mUser;
        this.LJLJI = origin;
        this.LJLJJI = onStartUpdate;
        this.LJLJJL = onDone;
        this.LJLJJLL = setSwitchCheckState;
        this.LJLJL = str;
        C9XU.LIZIZ(context, this);
    }
}
