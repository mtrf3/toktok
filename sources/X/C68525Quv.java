package X;

import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.Quv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68525Quv extends AbstractC65781Prl implements InterfaceC88472Yns<BaseLoginMethod, Boolean> {
    public static final C68525Quv LJLIL = new C68525Quv();

    public C68525Quv() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(BaseLoginMethod baseLoginMethod) {
        boolean z;
        BaseLoginMethod it = baseLoginMethod;
        o.LJIIIZ(it, "it");
        Boolean isFromReInstallNet = it.isFromReInstallNet();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(isFromReInstallNet, bool) && !o.LJ(it.isTransToNormal(), bool)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
