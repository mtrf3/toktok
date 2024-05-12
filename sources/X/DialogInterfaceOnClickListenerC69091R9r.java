package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.io.Serializable;

/* renamed from: X.R9r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogInterfaceOnClickListenerC69091R9r implements DialogInterface.OnClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ BaseAccountFlowFragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public DialogInterfaceOnClickListenerC69091R9r(BaseAccountFlowFragment baseAccountFlowFragment, String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = baseAccountFlowFragment;
        this.LJLJI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int value;
        C68988R5s c68988R5s;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C35936E8m c35936E8m = new C35936E8m();
                c35936E8m.LIZLLL("platform", "email");
                c35936E8m.LIZLLL("enter_from", this.LJLIL);
                c35936E8m.LIZLLL("enter_method", this.LJLILLLLZI.getEnterMethod());
                FMX.LJIIL("click_forget_password", c35936E8m.LIZ);
            }
        } else {
            C35936E8m c35936E8m2 = new C35936E8m();
            c35936E8m2.LIZLLL("platform", "phone");
            c35936E8m2.LIZLLL("enter_from", this.LJLIL);
            c35936E8m2.LIZLLL("enter_method", this.LJLILLLLZI.getEnterMethod());
            FMX.LJIIL("click_forget_password", c35936E8m2.LIZ);
        }
        BaseAccountFlowFragment baseAccountFlowFragment = this.LJLILLLLZI;
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        boolean z2 = this.LJLJI;
        BaseAccountFlowFragment baseAccountFlowFragment2 = this.LJLILLLLZI;
        if (i == 1) {
            value = EnumC69113RAn.INPUT_EMAIL_FIND_PASSWORD.getValue();
        } else {
            value = EnumC69113RAn.INPUT_PHONE_FIND_PASSWORD.getValue();
        }
        arguments.putInt("next_page", value);
        if (z2) {
            Bundle arguments2 = baseAccountFlowFragment2.getArguments();
            Serializable serializable = null;
            if (arguments2 != null) {
                serializable = arguments2.getSerializable("recover_account_data");
            }
            if ((serializable instanceof C68988R5s) && (c68988R5s = (C68988R5s) serializable) != null) {
                c68988R5s.setNeedStoreLastMethod(true);
                z = !c68988R5s.getSafe();
            }
            arguments.putInt("current_scene", EnumC69116RAq.RECOVER_ACCOUNT.getValue());
        } else {
            arguments.putInt("current_scene", EnumC69116RAq.SET_OR_RESET_PASSWORD.getValue());
        }
        if ((baseAccountFlowFragment2 instanceof InterfaceC69092R9s) && z) {
            RBV.LJIIJJI(baseAccountFlowFragment2, ((InterfaceC69092R9s) baseAccountFlowFragment2).getEmail());
        }
        baseAccountFlowFragment.rh(arguments);
        dialogInterface.dismiss();
    }
}
