package Y;

import X.C0NB;
import X.C164906da;
import X.C16880lQ;
import X.C29306Beo;
import X.C3C5;
import X.C40221FqT;
import X.C72743Sgl;
import X.C76867UEt;
import X.C76869UEv;
import X.C76944UHs;
import X.C77150UPq;
import X.C78900Uxs;
import X.C78906Uxy;
import X.C78907Uxz;
import X.EnumC61598OFm;
import X.FragmentC78904Uxw;
import X.InterfaceC61107NyZ;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.UP0;
import X.UQ4;
import X.URU;
import X.URV;
import X.XJL;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDeS156S0200000_13 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZ$0(IDeS156S0200000_13 iDeS156S0200000_13) {
    }

    public static final void LIZ$1(IDeS156S0200000_13 iDeS156S0200000_13) {
    }

    public static final void LIZ$2(IDeS156S0200000_13 iDeS156S0200000_13) {
    }

    public static final void LIZ$3(IDeS156S0200000_13 iDeS156S0200000_13) {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            case 3:
                LIZ$3(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c164906daArr);
                return;
            case 1:
                LIZIZ$1(this, c164906daArr);
                return;
            case 2:
                LIZIZ$2(this, c164906daArr);
                return;
            case 3:
                LIZIZ$3(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public static final void LIZIZ$0(IDeS156S0200000_13 iDeS156S0200000_13, C164906da... results) {
        o.LJIIIZ(results, "results");
        boolean z = false;
        int i = C76869UEv.LIZ[results[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    UQ4.LJ(((ContactUFR) iDeS156S0200000_13.l0).LIZLLL(), "system", "contact", false, false, ((ContactUFR) iDeS156S0200000_13.l0).LJ(), "off", UQ4.LJII(), null, ((ContactUFR) iDeS156S0200000_13.l0).LJLJJL, 256);
                    ((ContactUFR) iDeS156S0200000_13.l0).LJIILIIL();
                    z = false;
                    ((InterfaceC73573Su9) iDeS156S0200000_13.l1).onNext(new C77150UPq(false, 0, 0, null, 30));
                    ((InterfaceC73573Su9) iDeS156S0200000_13.l1).onComplete();
                }
            } else {
                UQ4.LJ(((ContactUFR) iDeS156S0200000_13.l0).LIZLLL(), "system", "contact", false, false, ((ContactUFR) iDeS156S0200000_13.l0).LJ(), "unknown", UQ4.LJII(), null, ((ContactUFR) iDeS156S0200000_13.l0).LJLJJL, 272);
                ((ContactUFR) iDeS156S0200000_13.l0).LJIILIIL();
                z = false;
                ((InterfaceC73573Su9) iDeS156S0200000_13.l1).onNext(new C77150UPq(false, 0, 0, null, 30));
                ((InterfaceC73573Su9) iDeS156S0200000_13.l1).onComplete();
            }
        } else {
            UQ4.LJ(((ContactUFR) iDeS156S0200000_13.l0).LIZLLL(), "system", "contact", true, false, ((ContactUFR) iDeS156S0200000_13.l0).LJ(), "unknown", UQ4.LJII(), null, ((ContactUFR) iDeS156S0200000_13.l0).LJLJJL, 272);
            ((InterfaceC73573Su9) iDeS156S0200000_13.l1).onNext(new C77150UPq(true, 0, 0, null, 30));
            ((InterfaceC73573Su9) iDeS156S0200000_13.l1).onComplete();
        }
        UP0 up0 = (UP0) ((ContactUFR) iDeS156S0200000_13.l0).LJLLJ.getValue();
        if (((C72743Sgl) up0.LJFF.getValue()).LIZIZ) {
            C72743Sgl c72743Sgl = (C72743Sgl) up0.LJFF.getValue();
            if (c72743Sgl.LIZIZ) {
                C16880lQ.LJLLLL(c72743Sgl.LIZLLL, c72743Sgl.LIZJ);
                c72743Sgl.LIZIZ = z;
            }
        }
    }

    public static final void LIZIZ$1(IDeS156S0200000_13 iDeS156S0200000_13, C164906da... results) {
        Boolean bool;
        o.LJIIIZ(results, "results");
        int length = results.length;
        int i = 0;
        while (true) {
            bool = null;
            if (i >= length) {
                break;
            }
            C164906da c164906da = results[i];
            if (o.LJ(c164906da.LIZ, "android.permission.BLUETOOTH_CONNECT")) {
                bool = Boolean.valueOf(c164906da.LIZ());
                break;
            }
            i++;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            ((InterfaceC65784Pro) iDeS156S0200000_13.l0).invoke();
        } else {
            ((InterfaceC65784Pro) iDeS156S0200000_13.l1).invoke();
        }
    }

    public static final void LIZIZ$2(IDeS156S0200000_13 iDeS156S0200000_13, C164906da... results) {
        o.LJIIIZ(results, "results");
        new URV(((RelationAuthDialogControl) iDeS156S0200000_13.l0).LIZ(), "system", null).LIZLLL(null);
        int i = C76867UEt.LIZ[results[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    new URU(((RelationAuthDialogControl) iDeS156S0200000_13.l0).LIZ(), "system", false, null, 1, 8).LIZLLL(null);
                    ((RelationAuthDialogControl) iDeS156S0200000_13.l0).LJ();
                    XJL xjl = (XJL) iDeS156S0200000_13.l1;
                    Boolean bool = Boolean.FALSE;
                    C3C5.m7constructorimpl(bool);
                    xjl.resumeWith(bool);
                }
            } else {
                new URU(((RelationAuthDialogControl) iDeS156S0200000_13.l0).LIZ(), "system", false, null, 0, 8).LIZLLL(null);
                ((RelationAuthDialogControl) iDeS156S0200000_13.l0).LJ();
                XJL xjl2 = (XJL) iDeS156S0200000_13.l1;
                Boolean bool2 = Boolean.FALSE;
                C3C5.m7constructorimpl(bool2);
                xjl2.resumeWith(bool2);
            }
        } else {
            new URU(((RelationAuthDialogControl) iDeS156S0200000_13.l0).LIZ(), "system", true, null, null, 24).LIZLLL(null);
            XJL xjl3 = (XJL) iDeS156S0200000_13.l1;
            Boolean bool3 = Boolean.TRUE;
            C3C5.m7constructorimpl(bool3);
            xjl3.resumeWith(bool3);
        }
        C72743Sgl c72743Sgl = (C72743Sgl) ((RelationAuthDialogControl) iDeS156S0200000_13.l0).LJLJLJ.getValue();
        if (c72743Sgl.LIZIZ) {
            C16880lQ.LJLLLL(c72743Sgl.LIZLLL, c72743Sgl.LIZJ);
            c72743Sgl.LIZIZ = false;
        }
    }

    public static final void LIZIZ$3(IDeS156S0200000_13 iDeS156S0200000_13, C164906da... c164906daArr) {
        String[] strArr = new String[c164906daArr.length];
        int[] iArr = new int[c164906daArr.length];
        int i = 0;
        for (C164906da c164906da : c164906daArr) {
            strArr[i] = c164906da.LIZ;
            if (c164906da.LIZIZ == EnumC61598OFm.GRANTED) {
                iArr[i] = 0;
            } else {
                iArr[i] = -1;
            }
            i++;
        }
        if (C76944UHs.LIZLLL(((C78907Uxz) iDeS156S0200000_13.l0).LIZ, strArr, iArr)) {
            ((C78907Uxz) iDeS156S0200000_13.l0).LIZIZ(true);
            return;
        }
        if (C76944UHs.LIZJ(((C78907Uxz) iDeS156S0200000_13.l0).LIZ, strArr)) {
            ((C78907Uxz) iDeS156S0200000_13.l0).LIZ();
            C78907Uxz c78907Uxz = (C78907Uxz) iDeS156S0200000_13.l0;
            c78907Uxz.LJ.LJ("DENY_FROM_REQUEST_RESULT_SHOW_NEXT_TIME", c78907Uxz.LIZJ);
            return;
        }
        Activity activity = ((C78907Uxz) iDeS156S0200000_13.l0).LIZ;
        if (!FragmentC78904Uxw.LIZJ(activity, C40221FqT.LIZ.LIZIZ(activity))) {
            Activity activity2 = ((C78907Uxz) iDeS156S0200000_13.l0).LIZ;
            if (!FragmentC78904Uxw.LIZJ(activity2, FragmentC78904Uxw.LIZ(activity2)) && !FragmentC78904Uxw.LIZJ(((C78907Uxz) iDeS156S0200000_13.l0).LIZ, new Intent("android.settings.APPLICATION_SETTINGS"))) {
                C0NB.LIZIZ("PermissionFragment", "afterPermissionRequest: AppSettingIntent is not avaliable.");
                ((C78907Uxz) iDeS156S0200000_13.l0).LIZ();
                C78907Uxz c78907Uxz2 = (C78907Uxz) iDeS156S0200000_13.l0;
                c78907Uxz2.LJ.LJ("DENY_FROM_REQUEST_RESULT_ERROR", c78907Uxz2.LIZJ);
                return;
            }
        }
        C78907Uxz c78907Uxz3 = (C78907Uxz) iDeS156S0200000_13.l0;
        String[] LIZ = C76944UHs.LIZ(c78907Uxz3.LIZ, c78907Uxz3.LIZJ);
        C78907Uxz c78907Uxz4 = (C78907Uxz) iDeS156S0200000_13.l0;
        c78907Uxz4.LIZLLL = LIZ;
        FragmentC78904Uxw fragmentC78904Uxw = (FragmentC78904Uxw) iDeS156S0200000_13.l1;
        fragmentC78904Uxw.getClass();
        C78906Uxy c78906Uxy = new C78906Uxy(fragmentC78904Uxw, c78907Uxz4);
        Activity activity3 = c78907Uxz4.LIZ;
        C78900Uxs.LIZ.getClass();
        c78907Uxz4.LJFF.LIZ(activity3, c78906Uxy, c78907Uxz4.LIZJ);
    }

    public IDeS156S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
