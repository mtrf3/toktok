package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYQ extends AbstractC65781Prl implements InterfaceC88471Ynr<AuthInfoState, ListState, AuthInfoState> {
    public static final AYQ LJLIL = new AYQ();

    public AYQ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final AuthInfoState invoke(AuthInfoState authInfoState, ListState listState) {
        AuthInfoState inject = authInfoState;
        ListState it = listState;
        o.LJIIIZ(inject, "$this$inject");
        o.LJIIIZ(it, "it");
        return inject.copy(it);
    }
}
