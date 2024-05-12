package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import kotlin.jvm.internal.o;

/* renamed from: X.XlM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85768XlM extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC85767XlL, C76800UCe> {
    public final /* synthetic */ PasskeyService LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85768XlM(PasskeyService passkeyService, Activity activity, String str, String str2) {
        super(1);
        this.LJLIL = passkeyService;
        this.LJLILLLLZI = activity;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC85767XlL interfaceC85767XlL) {
        InterfaceC85767XlL newCallback = interfaceC85767XlL;
        o.LJIIIZ(newCallback, "newCallback");
        PasskeyService passkeyService = this.LJLIL;
        Activity activity = this.LJLILLLLZI;
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        passkeyService.getClass();
        PasskeyService.LJI(activity, str, str2, true, true, true, newCallback);
        return C76800UCe.LIZ;
    }
}
