package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ix9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48279Ix9 extends F9E implements C33Q {
    public final List<Aweme> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48279Ix9(List<? extends Aweme> itemList) {
        o.LJIIIZ(itemList, "itemList");
        this.LJLIL = itemList;
    }
}
