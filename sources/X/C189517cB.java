package X;

import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7cB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189517cB extends F9E implements Serializable {
    public final List<StoryInsertUser> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C189517cB copy$default(C189517cB c189517cB, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c189517cB.LJLIL;
        }
        return c189517cB.copy(list);
    }

    public final C189517cB copy(List<StoryInsertUser> insertUsers) {
        o.LJIIIZ(insertUsers, "insertUsers");
        return new C189517cB(insertUsers);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public final List<StoryInsertUser> getInsertUsers() {
        return this.LJLIL;
    }

    public C189517cB(List<StoryInsertUser> insertUsers) {
        o.LJIIIZ(insertUsers, "insertUsers");
        this.LJLIL = insertUsers;
    }
}
