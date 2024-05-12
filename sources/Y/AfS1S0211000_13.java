package Y;

import X.ARN;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.C243529h6;
import X.C38306F1q;
import X.C38333F2r;
import X.C47261Igj;
import X.C73411SrX;
import X.C76265TwT;
import X.C76272Twa;
import X.C76279Twh;
import X.C76324TxQ;
import X.C77134UPa;
import X.C77150UPq;
import X.InterfaceC58007Mpf;
import X.InterfaceC64592gB;
import X.InterfaceC73573Su9;
import X.UPG;
import X.UPK;
import X.UPQ;
import X.UQ4;
import X.X1D;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS1S0211000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S0211000_13 afS1S0211000_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C76272Twa.LJJJJJ(afS1S0211000_13.z2, "other", throwable, (HashMap) afS1S0211000_13.l0);
        ((C76279Twh) afS1S0211000_13.l1).LJIIIIZZ(throwable);
        C76265TwT.LJII(afS1S0211000_13.i3, "reject");
        C76324TxQ.LIZJ();
    }

    public static final void accept$1(AfS1S0211000_13 afS1S0211000_13, Object obj) {
        String str;
        String str2;
        if (afS1S0211000_13.z2) {
            String LIZLLL = ((ContactUFR) afS1S0211000_13.l0).LIZLLL();
            int i = afS1S0211000_13.i3;
            if (i == 1) {
                str = "system";
            } else {
                str = "user";
                if (i != 1) {
                    if (i != 2) {
                        str2 = "did";
                    } else {
                        str2 = "uid";
                    }
                    UQ4.LIZLLL(LIZLLL, str, "contact", ((ContactUFR) afS1S0211000_13.l0).LJ(), str2, "process", null, ((ContactUFR) afS1S0211000_13.l0).LJLJJL, 192);
                }
            }
            str2 = "both";
            UQ4.LIZLLL(LIZLLL, str, "contact", ((ContactUFR) afS1S0211000_13.l0).LJ(), str2, "process", null, ((ContactUFR) afS1S0211000_13.l0).LJLJJL, 192);
        }
        ((InterfaceC73573Su9) afS1S0211000_13.l1).onNext(new C77150UPq(afS1S0211000_13.z2, 0, 0, null, 30));
        ((ContactUFR) afS1S0211000_13.l0).LJIIJJI(afS1S0211000_13.z2);
        ((InterfaceC73573Su9) afS1S0211000_13.l1).onComplete();
        C73411SrX c73411SrX = ((ContactUFR) afS1S0211000_13.l0).LJLJLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$2(AfS1S0211000_13 afS1S0211000_13, Object obj) {
        int i;
        C38306F1q c38306F1q;
        String str;
        String str2;
        String str3;
        Throwable th = (Throwable) obj;
        if (afS1S0211000_13.z2) {
            Keva repo = Keva.getRepo("cold_boot_for_fb_and_ctx");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("contact_sync_on_failure");
            LIZ.append(((ContactUFR) afS1S0211000_13.l0).LJFF());
            repo.storeBoolean(X1D.LIZIZ(LIZ), true);
            String LIZLLL = ((ContactUFR) afS1S0211000_13.l0).LIZLLL();
            int i2 = afS1S0211000_13.i3;
            if (i2 != 1) {
                if (i2 != 2) {
                    str = "";
                } else {
                    str = "user";
                }
            } else if (((ContactUFR) afS1S0211000_13.l0).LJLLI) {
                str = "guide";
            } else {
                str = "system";
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    str2 = "did";
                } else {
                    str2 = "uid";
                }
            } else {
                str2 = "both";
            }
            String LJ = ((ContactUFR) afS1S0211000_13.l0).LJ();
            ContactUFR contactUFR = (ContactUFR) afS1S0211000_13.l0;
            if (contactUFR.LJLLI) {
                str3 = "auto";
            } else {
                str3 = "process";
            }
            UQ4.LIZIZ(LIZLLL, str, "contact", str2, LJ, str3, 0, contactUFR.LJLJJL, 3328);
        }
        InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) afS1S0211000_13.l1;
        boolean z = afS1S0211000_13.z2;
        if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null) {
            i = c38306F1q.getErrorCode();
        } else {
            i = -1;
        }
        interfaceC73573Su9.onNext(new C77150UPq(z, 0, i, null, 26));
        ((ContactUFR) afS1S0211000_13.l0).LJIIJJI(afS1S0211000_13.z2);
        ((InterfaceC73573Su9) afS1S0211000_13.l1).onComplete();
        C73411SrX c73411SrX = ((ContactUFR) afS1S0211000_13.l0).LJLJLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$3(AfS1S0211000_13 afS1S0211000_13, Object obj) {
        String str;
        if (afS1S0211000_13.z2) {
            String LIZLLL = ((UPG) afS1S0211000_13.l0).LIZLLL();
            if (afS1S0211000_13.i3 == 1) {
                str = "both";
            } else {
                str = "uid";
            }
            String LJ = ((UPG) afS1S0211000_13.l0).LJ();
            UPG upg = (UPG) afS1S0211000_13.l0;
            UQ4.LIZJ(LIZLLL, "user", "facebook", LJ, str, "process", upg.LJLL, upg.LJLLI, upg.LJLJJL);
        }
        ((InterfaceC73573Su9) afS1S0211000_13.l1).onNext(new C77150UPq(afS1S0211000_13.z2, 0, 0, null, 30));
        UPG upg2 = (UPG) afS1S0211000_13.l0;
        ((InterfaceC58007Mpf) upg2.LJLLL.getValue()).LIZJ(new UPQ(upg2, afS1S0211000_13.z2));
        ((InterfaceC73573Su9) afS1S0211000_13.l1).onComplete();
        C73411SrX c73411SrX = ((UPG) afS1S0211000_13.l0).LJLLILLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$4(AfS1S0211000_13 afS1S0211000_13, Object obj) {
        int i;
        C38306F1q c38306F1q;
        String str;
        int i2;
        Throwable th = (Throwable) obj;
        if (afS1S0211000_13.z2) {
            Keva repo = Keva.getRepo("cold_boot_for_fb_and_ctx");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("facebook_sync_on_failure");
            LIZ.append(((UPG) afS1S0211000_13.l0).LJFF());
            repo.storeBoolean(X1D.LIZIZ(LIZ), true);
            String LIZLLL = ((UPG) afS1S0211000_13.l0).LIZLLL();
            if (afS1S0211000_13.i3 == 1) {
                str = "both";
            } else {
                str = "uid";
            }
            String LJ = ((UPG) afS1S0211000_13.l0).LJ();
            UPG upg = (UPG) afS1S0211000_13.l0;
            Integer num = upg.LJLLI;
            if (C77134UPa.LIZ.LJI(upg.LJFF()).length() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            UQ4.LIZ(LIZLLL, "user", "facebook", str, LJ, "process", 1, 0, num, ((UPG) afS1S0211000_13.l0).LJLJJL, Integer.valueOf(i2 ^ 1), 0);
        }
        InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) afS1S0211000_13.l1;
        boolean z = afS1S0211000_13.z2;
        if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null) {
            i = c38306F1q.getErrorCode();
        } else {
            i = -1;
        }
        interfaceC73573Su9.onNext(new C77150UPq(z, 0, i, null, 26));
        UPG upg2 = (UPG) afS1S0211000_13.l0;
        ((InterfaceC58007Mpf) upg2.LJLLL.getValue()).LIZJ(new UPQ(upg2, afS1S0211000_13.z2));
        ((InterfaceC73573Su9) afS1S0211000_13.l1).onComplete();
        C73411SrX c73411SrX = ((UPG) afS1S0211000_13.l0).LJLLILLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$5(AfS1S0211000_13 afS1S0211000_13, Object obj) {
        ARN arn;
        if (afS1S0211000_13.z2 && (arn = (ARN) afS1S0211000_13.l0) != null) {
            arn.LIZ().LIZIZ(null);
        }
        UPK upk = (UPK) afS1S0211000_13.l1;
        int i = afS1S0211000_13.i3;
        upk.getClass();
        new C243529h6(((UPK) afS1S0211000_13.l1).LIZLLL.invoke(), ((UPK) afS1S0211000_13.l1).LJFF(), true, false, UPK.LIZIZ(i).getStr()).LIZLLL(null);
        UPK upk2 = (UPK) afS1S0211000_13.l1;
        ActivityC45651qj requireActivity = upk2.LIZ.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        upk2.LJIIJ(requireActivity, ((UPK) afS1S0211000_13.l1).LIZLLL.invoke(), ((UPK) afS1S0211000_13.l1).LJFF(), C47261Igj.LJJIJ(Integer.valueOf(afS1S0211000_13.i3)));
    }

    public static final void accept$6(AfS1S0211000_13 afS1S0211000_13, Object obj) {
        ARN arn;
        UPK upk = (UPK) afS1S0211000_13.l0;
        int i = afS1S0211000_13.i3;
        upk.getClass();
        new C243529h6(((UPK) afS1S0211000_13.l0).LIZLLL.invoke(), ((UPK) afS1S0211000_13.l0).LJFF(), false, false, UPK.LIZIZ(i).getStr()).LIZLLL(null);
        if (afS1S0211000_13.z2 && (arn = (ARN) afS1S0211000_13.l1) != null) {
            arn.LIZ().LIZIZ(null);
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            AnonymousClass114.LIZ(topActivity, R.string.f3g);
        }
        ((UPK) afS1S0211000_13.l0).getClass();
        UPK.LJIIIZ();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS1S0211000_13(int r2, X.ARN r3, X.UPK r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 5: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.i3 = r2
            r0.z2 = r5
            r0.l1 = r3
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.z2 = r5
            r0.l0 = r3
            r0.l1 = r4
            r0.i3 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0211000_13.<init>(int, X.ARN, X.UPK, boolean, int):void");
    }

    public AfS1S0211000_13(boolean z, Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.z2 = z;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj2;
    }
}
