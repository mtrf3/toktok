package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.2jU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66642jU extends AbstractC65781Prl implements InterfaceC88471Ynr<Aweme, Aweme, Boolean> {
    public static final C66642jU LJLIL = new C66642jU();

    public C66642jU() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Aweme aweme, Aweme aweme2) {
        Aweme a = aweme;
        Aweme b = aweme2;
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        return Boolean.valueOf(o.LJ(a.getAid(), b.getAid()));
    }
}
