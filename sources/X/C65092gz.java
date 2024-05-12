package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.2gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65092gz extends AbstractC65781Prl implements InterfaceC88471Ynr<Aweme, Aweme, Boolean> {
    public static final C65092gz LJLIL = new C65092gz();

    public C65092gz() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Aweme aweme, Aweme aweme2) {
        Aweme aweme3 = aweme;
        Aweme aweme4 = aweme2;
        o.LJI(aweme3);
        String aid = aweme3.getAid();
        o.LJI(aweme4);
        return Boolean.valueOf(TextUtils.equals(aid, aweme4.getAid()));
    }
}
