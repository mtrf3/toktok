package X;

import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.E5x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35869E5x extends AbstractC73391SrD<E4G> {
    public final /* synthetic */ I18nSignUpActivity LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public C35869E5x(I18nSignUpActivity i18nSignUpActivity) {
        this.LJLILLLLZI = i18nSignUpActivity;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        E4G plugin = (E4G) obj;
        o.LJIIIZ(plugin, "plugin");
        plugin.getValue();
        C35869E5x c35869E5x = this.LJLILLLLZI.LJLLI;
        if (c35869E5x != null) {
            c35869E5x.dispose();
        }
    }
}
