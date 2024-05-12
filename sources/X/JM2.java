package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JM2 extends AbstractC65781Prl implements InterfaceC88472Yns<C49013JLl, UrlModel> {
    public static final JM2 LJLIL = new JM2();

    public JM2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final UrlModel invoke(C49013JLl c49013JLl) {
        C49013JLl it = c49013JLl;
        o.LJIIIZ(it, "it");
        User author = it.LJLILLLLZI.getAuthor();
        if (author != null) {
            return author.roomCover;
        }
        return null;
    }
}
