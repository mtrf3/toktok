package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;

/* renamed from: X.XlN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85769XlN extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ PasskeyService LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC85767XlL LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85769XlN(PasskeyService passkeyService, Activity activity, String str, String str2, InterfaceC85767XlL interfaceC85767XlL) {
        super(1);
        this.LJLIL = passkeyService;
        this.LJLILLLLZI = activity;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = interfaceC85767XlL;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        PasskeyService.LIZ = str;
        this.LJLIL.LJII(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
