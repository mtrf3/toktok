package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JM3 extends AbstractC65781Prl implements InterfaceC88472Yns<C49013JLl, String> {
    public static final JM3 LJLIL = new JM3();

    public JM3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C49013JLl c49013JLl) {
        C49013JLl it = c49013JLl;
        o.LJIIIZ(it, "it");
        User author = it.LJLILLLLZI.getAuthor();
        if (author != null) {
            return author.getRoomTitle();
        }
        return null;
    }
}
