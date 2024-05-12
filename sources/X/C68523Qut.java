package X;

import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Qut, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68523Qut extends AbstractC65781Prl implements InterfaceC88472Yns<BaseLoginMethod, Boolean> {
    public static final C68523Qut LJLIL = new C68523Qut();

    public C68523Qut() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(BaseLoginMethod baseLoginMethod) {
        String oneClickLoginToken;
        BaseLoginMethod it = baseLoginMethod;
        o.LJIIIZ(it, "it");
        boolean z = false;
        if (!it.isHistoryLogin() && it.m102isOneClickLogin() && ((oneClickLoginToken = it.getOneClickLoginToken()) == null || oneClickLoginToken.length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
