package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.NFh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59045NFh extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC59043NFf, User> {
    public static final C59045NFh LJLIL = new C59045NFh();

    public C59045NFh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final User invoke(InterfaceC59043NFf interfaceC59043NFf) {
        InterfaceC59043NFf inject = interfaceC59043NFf;
        o.LJIIIZ(inject, "$this$inject");
        return inject.getAuthor();
    }
}
