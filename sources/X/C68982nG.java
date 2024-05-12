package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.2nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68982nG extends AbstractC65781Prl implements InterfaceC88471Ynr<Aweme, Aweme, Boolean> {
    public static final C68982nG LJLIL = new C68982nG();

    public C68982nG() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Aweme aweme, Aweme aweme2) {
        Aweme aweme3 = aweme;
        Aweme aweme22 = aweme2;
        o.LJIIIZ(aweme3, "aweme");
        o.LJIIIZ(aweme22, "aweme2");
        return Boolean.valueOf(o.LJ(aweme3.getAid(), aweme22.getAid()));
    }
}
