package X;

import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowPasskeySavedToastEvent;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;

/* renamed from: X.XlH, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85763XlH<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC85767XlL LJLJI;

    public C85763XlH(boolean z, boolean z2, InterfaceC85767XlL interfaceC85767XlL) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = interfaceC85767XlL;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        String str2;
        PasskeyPopUpHelper.LJ().LIZ();
        ShowPasskeySavedToastEvent showPasskeySavedToastEvent = new ShowPasskeySavedToastEvent();
        if (this.LJLIL) {
            str = "personal_homepage";
        } else {
            str = "account_page";
        }
        showPasskeySavedToastEvent.LIZLLL(str, "enter_from");
        if (this.LJLILLLLZI) {
            str2 = "first_passkey";
        } else {
            str2 = "replace_passkey";
        }
        showPasskeySavedToastEvent.LIZLLL(str2, "enter_method");
        showPasskeySavedToastEvent.LJFF();
        this.LJLJI.LJJJJZI(null);
    }
}
