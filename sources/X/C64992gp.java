package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64992gp extends F9E {
    public final List<Aweme> LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C64992gp(List<? extends Aweme> videoList, boolean z) {
        o.LJIIIZ(videoList, "videoList");
        this.LJLIL = videoList;
        this.LJLILLLLZI = z;
    }
}
