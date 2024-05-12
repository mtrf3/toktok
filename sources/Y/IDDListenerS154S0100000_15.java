package Y;

import X.ACW;
import X.ALS;
import X.C7MK;
import X.C85960XoS;
import X.C85966XoY;
import X.C86775Y3v;
import X.InterfaceC65784Pro;
import X.InterfaceC85967XoZ;
import X.XZH;
import X.Y42;
import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDDListenerS154S0100000_15 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            case 6:
                onDismiss$6(this, dialogInterface);
                return;
            case 7:
                onDismiss$7(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS154S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS154S0100000_15 iDDListenerS154S0100000_15, DialogInterface dialogInterface) {
        NowsPublishPopWindowFragment nowsPublishPopWindowFragment = (NowsPublishPopWindowFragment) iDDListenerS154S0100000_15.l0;
        if (nowsPublishPopWindowFragment.LJLJJL) {
            C7MK.LJII(nowsPublishPopWindowFragment.LJLILLLLZI.LIZ, new AqS181S0100000_15(nowsPublishPopWindowFragment, 81));
        }
    }

    public static final void onDismiss$1(IDDListenerS154S0100000_15 iDDListenerS154S0100000_15, DialogInterface dialogInterface) {
        C85966XoY c85966XoY = (C85966XoY) ((C85960XoS) iDDListenerS154S0100000_15.l0).LJLJJL;
        InterfaceC85967XoZ interfaceC85967XoZ = c85966XoY.LIZ.LJLJLJ;
        if (interfaceC85967XoZ != null) {
            interfaceC85967XoZ.onCancel();
        }
        ALS als = c85966XoY.LIZ.LJLJLLL;
        if (als != null) {
            als.LIZ();
        }
    }

    public static final void onDismiss$2(IDDListenerS154S0100000_15 iDDListenerS154S0100000_15, DialogInterface dialogInterface) {
        C85966XoY c85966XoY = (C85966XoY) ((C85960XoS) iDDListenerS154S0100000_15.l0).LJLJJL;
        InterfaceC85967XoZ interfaceC85967XoZ = c85966XoY.LIZ.LJLJLJ;
        if (interfaceC85967XoZ != null) {
            interfaceC85967XoZ.onCancel();
        }
        ALS als = c85966XoY.LIZ.LJLJLLL;
        if (als != null) {
            als.LIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, java.lang.String.valueOf(r0)) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$3(Y.IDDListenerS154S0100000_15 r9, android.content.DialogInterface r10) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDDListenerS154S0100000_15.onDismiss$3(Y.IDDListenerS154S0100000_15, android.content.DialogInterface):void");
    }

    public static final void onDismiss$4(IDDListenerS154S0100000_15 iDDListenerS154S0100000_15, DialogInterface dialogInterface) {
        Y42 LIZIZ;
        if (ACW.LIZIZ() && (LIZIZ = ((C86775Y3v) iDDListenerS154S0100000_15.l0).LIZIZ()) != null) {
            LIZIZ.hd(4);
        }
        C86775Y3v c86775Y3v = (C86775Y3v) iDDListenerS154S0100000_15.l0;
        c86775Y3v.LJLLILLLL = false;
        c86775Y3v.LJLLLL = false;
    }

    public static final void onDismiss$5(IDDListenerS154S0100000_15 iDDListenerS154S0100000_15, DialogInterface dialogInterface) {
        Lifecycle lifecycle;
        ((VerticalMusicView) iDDListenerS154S0100000_15.l0).LJJIIZ();
        TuxSheet tuxSheet = ((VerticalMusicView) iDDListenerS154S0100000_15.l0).LLILZLL;
        if (tuxSheet != null && (lifecycle = tuxSheet.getLifecycle()) != null) {
            lifecycle.removeObserver((VerticalMusicView) iDDListenerS154S0100000_15.l0);
        }
        XZH xzh = ((VerticalMusicView) iDDListenerS154S0100000_15.l0).LJLJL;
        if (xzh != null) {
            xzh.LJIILJJIL.Y9();
        } else {
            o.LJIJI("params");
            throw null;
        }
    }

    public static final void onDismiss$6(IDDListenerS154S0100000_15 iDDListenerS154S0100000_15, DialogInterface dialogInterface) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) iDDListenerS154S0100000_15.l0;
        if (!i18nSettingManageMyAccountActivity.LJLLILLLL) {
            I18nSettingManageMyAccountActivity.LLIILII(false);
        }
        i18nSettingManageMyAccountActivity.LJLLILLLL = false;
    }

    public static final void onDismiss$7(IDDListenerS154S0100000_15 iDDListenerS154S0100000_15, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDDListenerS154S0100000_15.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
