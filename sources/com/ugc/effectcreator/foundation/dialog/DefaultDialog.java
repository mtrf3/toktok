package com.ugc.effectcreator.foundation.dialog;

import X.C03880Dg;
import X.C65300Pk0;
import X.C68322mC;
import X.C93474aRS;
import X.C93981aZd;
import X.EnumC93404aQK;
import X.InterfaceC93473aRR;
import Y.IDCListenerS167S0100000_42;
import Y.IDCListenerS290S0100000_42;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DefaultDialog implements IDialog {
    public static void com_ugc_effectcreator_foundation_dialog_DefaultDialog_android_app_AlertDialog_show(AlertDialog alertDialog) {
        if (new C03880Dg(2).LIZJ(300000, "android/app/AlertDialog", "show", alertDialog, new Object[0], "void", new C65300Pk0(false, "()V", "460174395310659326")).LIZ) {
            return;
        }
        alertDialog.show();
    }

    private final void showDialogWith2Button(Context context, String str, String str2, String str3, String str4, InterfaceC93473aRR interfaceC93473aRR) {
        AlertDialog create = new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(str4, new IDCListenerS167S0100000_42(interfaceC93473aRR, 3)).setPositiveButton(str3, new IDCListenerS167S0100000_42(interfaceC93473aRR, 4)).create();
        create.setOnCancelListener(new IDCListenerS290S0100000_42(interfaceC93473aRR, 1));
        com_ugc_effectcreator_foundation_dialog_DefaultDialog_android_app_AlertDialog_show(create);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.app.AlertDialog, T] */
    private final void showConfimDialog(Context context, String str, String str2, String str3, String str4, String str5, InterfaceC93473aRR interfaceC93473aRR) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        ?? create = new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(str4, new IDCListenerS167S0100000_42(interfaceC93473aRR, 0)).setPositiveButton(str3, new IDCListenerS167S0100000_42(interfaceC93473aRR, 1)).setNeutralButton(str5, new IDCListenerS167S0100000_42(c68322mC, 2)).create();
        c68322mC.element = create;
        if (create != 0) {
            com_ugc_effectcreator_foundation_dialog_DefaultDialog_android_app_AlertDialog_show(create);
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog
    public void show(Context context, String title, String msg, String confirm, String str, InterfaceC93473aRR action, String neutral, String topImageUrl, Rect rect, List<C93474aRS> gridItems, EnumC93404aQK dialogStyle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(confirm, "confirm");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(neutral, "neutral");
        o.LJIIIZ(topImageUrl, "topImageUrl");
        o.LJIIIZ(gridItems, "gridItems");
        o.LJIIIZ(dialogStyle, "dialogStyle");
        int i = C93981aZd.LIZ[dialogStyle.ordinal()];
        String str2 = "";
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (str != null) {
                str2 = str;
            }
            showConfimDialog(context, title, msg, confirm, str2, neutral, action);
            return;
        }
        if (str != null) {
            str2 = str;
        }
        showDialogWith2Button(context, title, msg, confirm, str2, action);
    }
}
