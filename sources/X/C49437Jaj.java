package X;

import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.config.UserRelationTagStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.Jaj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49437Jaj extends AbstractC65781Prl implements InterfaceC65784Pro<UserRelationTagStyle> {
    public static final C49437Jaj LJLIL = new C49437Jaj();

    public C49437Jaj() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final UserRelationTagStyle invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        UserRelationTagStyle userRelationTagStyle = C49436Jai.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "user_relation_tag_style", 31744, UserRelationTagStyle.class, userRelationTagStyle);
        if (LJIJ != 0) {
            userRelationTagStyle = LJIJ;
        }
        o.LJIIIIZZ(userRelationTagStyle, "ABManager.getInstance().…nt::class.java) ?: CONFIG");
        return userRelationTagStyle;
    }
}
