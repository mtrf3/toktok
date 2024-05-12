package com.bytedance.ies.bullet.service.popup;

import X.ActivityC45651qj;
import X.C141335gf;
import X.C16880lQ;
import X.C39973FmT;
import X.C39976FmW;
import X.C3C5;
import X.C60373Nmj;
import X.C76800UCe;
import X.DialogC60569Npt;
import X.EnumC39958FmE;
import X.EnumC60566Npq;
import X.InterfaceC39974FmU;
import X.InterfaceC60381Nmr;
import X.InterfaceC60447Nnv;
import X.InterfaceC65784Pro;
import X.KMP;
import X.X1D;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class BasePopUpFragment extends AppCompatDialogFragment implements InterfaceC39974FmU, InterfaceC60381Nmr, InterfaceC60447Nnv {
    public static final List<BasePopUpFragment> LJLILLLLZI = new ArrayList();
    public static final List<BasePopUpFragment> LJLJI = new ArrayList();
    public EnumC60566Npq LJLIL;

    @Override // X.InterfaceC60381Nmr
    public final String getBid() {
        return null;
    }

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public abstract String wl();

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        xl(new AqS160S0100000_10(this, 30));
    }

    @Override // X.InterfaceC60381Nmr
    public final Uri getSchema() {
        o.LJIJI("config");
        throw null;
    }

    @Override // X.InterfaceC60381Nmr
    public final String getChannel() {
        C60373Nmj.LIZIZ();
        o.LJIJI("config");
        throw null;
    }

    @Override // X.InterfaceC60381Nmr
    public final String k3() {
        C60373Nmj.LIZIZ();
        o.LJIJI("config");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        o.LJ(null, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o.LJ(null, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        try {
            C16880lQ.LIZ(getDialog());
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.InterfaceC60381Nmr
    public final String zk() {
        return wl();
    }

    @Override // X.InterfaceC60381Nmr
    public final void close() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public static final /* synthetic */ void vl(BasePopUpFragment basePopUpFragment) {
        super.dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context != null) {
            o.LJFF(context, "context!!");
            DialogC60569Npt dialogC60569Npt = new DialogC60569Npt(this, context);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                dialogC60569Npt.setOwnerActivity(mo49getActivity);
            }
            return dialogC60569Npt;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.LJLIL == EnumC60566Npq.UNKNOWN) {
            this.LJLIL = EnumC60566Npq.TAP_MASK;
        }
        super.onDismiss(dialogInterface);
    }

    public final void xl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        try {
            interfaceC65784Pro.invoke();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            C39973FmT.LIZIZ(this, KMP.LJFF(LIZ, "dismiss failed with: ", e, LIZ), null, "popup", 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIJ(view, "view");
        super.onViewCreated(view, bundle);
        C39973FmT.LIZIZ(this, "act and config is not init, dismiss dialog fragment", null, "popup", 2);
        dismissAllowingStateLoss();
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        throw null;
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }
}
