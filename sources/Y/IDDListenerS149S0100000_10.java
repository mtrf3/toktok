package Y;

import X.ASQ;
import X.AST;
import X.ASW;
import X.ASX;
import X.ActivityC45651qj;
import X.C59075NGl;
import X.C62876Om0;
import X.DialogC25756A8y;
import X.N8D;
import X.N8O;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.V1B;
import android.app.Activity;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDDListenerS149S0100000_10 implements DialogInterface.OnDismissListener {
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
            default:
                return;
        }
    }

    public IDDListenerS149S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS149S0100000_10 iDDListenerS149S0100000_10, DialogInterface dialogInterface) {
        I18nAuthorizeFragment i18nAuthorizeFragment = (I18nAuthorizeFragment) iDDListenerS149S0100000_10.l0;
        if (!i18nAuthorizeFragment.LJLLLL) {
            if (i18nAuthorizeFragment.LJLLL == null) {
                ActivityC45651qj requireActivity = i18nAuthorizeFragment.requireActivity();
                o.LJIIIIZZ(requireActivity, "this.requireActivity()");
                i18nAuthorizeFragment.LJLLL = new DialogC25756A8y(requireActivity);
            }
            DialogC25756A8y dialogC25756A8y = i18nAuthorizeFragment.LJLLL;
            if (dialogC25756A8y != null) {
                V1B.LJLJJL(dialogC25756A8y);
            }
        }
        ((I18nAuthorizeFragment) iDDListenerS149S0100000_10.l0).LJLLLL = false;
    }

    public static final void onDismiss$1(IDDListenerS149S0100000_10 iDDListenerS149S0100000_10, DialogInterface dialogInterface) {
        ((QRCodePermissionActivity) iDDListenerS149S0100000_10.l0).finish();
    }

    public static final void onDismiss$2(IDDListenerS149S0100000_10 iDDListenerS149S0100000_10, DialogInterface dialogInterface) {
        ((Activity) iDDListenerS149S0100000_10.l0).finish();
    }

    public static final void onDismiss$3(IDDListenerS149S0100000_10 iDDListenerS149S0100000_10, DialogInterface dialogInterface) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((C59075NGl) iDDListenerS149S0100000_10.l0).LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        ASQ.LIZLLL((C59075NGl) iDDListenerS149S0100000_10.l0, ASX.LIZ);
    }

    public static final void onDismiss$4(IDDListenerS149S0100000_10 iDDListenerS149S0100000_10, DialogInterface it) {
        int i;
        ((N8D) iDDListenerS149S0100000_10.l0).getClass();
        o.LJIIIIZZ(it, "it");
        if (ASQ.LJIIIIZZ(it) instanceof N8O) {
            AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
            o.LJII(LJIIIIZZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.autofill.ui.AdAutofillSheetReason");
            if (!((N8O) LJIIIIZZ).LIZ) {
                return;
            }
        }
        AST LJIIIIZZ2 = ASQ.LJIIIIZZ(it);
        if (LJIIIIZZ2 instanceof ASW) {
            ((N8D) iDDListenerS149S0100000_10.l0).LIZIZ(0);
            return;
        }
        if (LJIIIIZZ2 instanceof N8O) {
            N8D n8d = (N8D) iDDListenerS149S0100000_10.l0;
            AST LJIIIIZZ3 = ASQ.LJIIIIZZ(it);
            o.LJII(LJIIIIZZ3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.autofill.ui.AdAutofillSheetReason");
            Integer num = ((N8O) LJIIIIZZ3).LIZIZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            n8d.LIZIZ(i);
            return;
        }
        ((N8D) iDDListenerS149S0100000_10.l0).LIZIZ(1);
    }

    public static final void onDismiss$5(IDDListenerS149S0100000_10 iDDListenerS149S0100000_10, DialogInterface dialogInterface) {
        ((C62876Om0) iDDListenerS149S0100000_10.l0).LJI.reset();
    }

    public static final void onDismiss$6(IDDListenerS149S0100000_10 iDDListenerS149S0100000_10, DialogInterface dialogInterface) {
        ((C62876Om0) iDDListenerS149S0100000_10.l0).LJI.reset();
    }
}
