package com.ss.android.ugc.aweme.compliance.business.banappeal.popup.viewmodel;

import X.C26005AIn;
import X.C63030OoU;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui.AppealDialogActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AppealDialogViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final Context LJLIL;
    public final AppealStatusResponse LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final MutableLiveData<C63030OoU> LJLJJLL;
    public InterfaceC65784Pro<C76800UCe> LJLJL;
    public boolean LJLJLJ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C63031OoV gv0(com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.PopButton r6) {
        /*
            r5 = this;
            java.lang.Integer r2 = r6.getBtnType()
            X.OoT r0 = X.EnumC63029OoT.EXTERNAL_APPEAL_WEB
            int r1 = r0.getValue()
            if (r2 != 0) goto L43
        Lc:
            java.lang.Integer r2 = r6.getBtnType()
            X.OoT r0 = X.EnumC63029OoT.INTERNAL_APPEAL_WEB
            int r1 = r0.getValue()
            if (r2 != 0) goto L4a
        L18:
            r0 = 0
        L19:
            r5.LJLJLJ = r0
            java.lang.Integer r0 = r6.getBtnType()
            if (r0 == 0) goto L41
            r0.intValue()
            X.OoV r4 = new X.OoV
            java.lang.String r3 = r6.getBtnContent()
            X.OoY r1 = X.EnumC63033OoX.Companion
            int r0 = r6.getBtnStyle()
            r1.getClass()
            X.OoX r2 = X.C63034OoY.LIZ(r0)
            kotlin.jvm.internal.AqS173S0200000_10 r1 = new kotlin.jvm.internal.AqS173S0200000_10
            r0 = 1
            r1.<init>(r5, r6, r0)
            r4.<init>(r3, r2, r1)
        L40:
            return r4
        L41:
            r4 = 0
            goto L40
        L43:
            int r0 = r2.intValue()
            if (r0 == r1) goto L50
            goto Lc
        L4a:
            int r0 = r2.intValue()
            if (r0 != r1) goto L18
        L50:
            r0 = 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.popup.viewmodel.AppealDialogViewModel.gv0(com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.PopButton):X.OoV");
    }

    public final void iv0(String str) {
        if (str != null) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            Context context = this.LJLIL;
            String str2 = this.LJLJJI;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = this.LJLJI;
            if (str4 != null) {
                str3 = str4;
            }
            SmartRouter.buildRoute(context, C26005AIn.LIZIZ(0, str, str3, str2)).open();
        }
    }

    public final void jv0(String str) {
        if (str != null) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            Context context = this.LJLIL;
            String str2 = this.LJLJJI;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = this.LJLJI;
            if (str4 != null) {
                str3 = str4;
            }
            SmartRouter.buildRoute(context, C26005AIn.LIZIZ(1, str, str3, str2)).open();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0206, code lost:
    
        if (r11.intValue() == r1) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(java.lang.Integer r11, java.lang.String r12, java.lang.String r13, android.content.DialogInterface r14) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.popup.viewmodel.AppealDialogViewModel.hv0(java.lang.Integer, java.lang.String, java.lang.String, android.content.DialogInterface):void");
    }

    public AppealDialogViewModel(AppealDialogActivity context, AppealStatusResponse appealStatusResponse, String str, String str2, String str3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appealStatusResponse, "appealStatusResponse");
        this.LJLIL = context;
        this.LJLILLLLZI = appealStatusResponse;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = new MutableLiveData<>();
    }
}
