package X;

import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31081Jw extends F9E {
    public final /* synthetic */ int LJLIL = 1;
    public final Object LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI};
            default:
                return new Object[]{this.LJLILLLLZI};
        }
    }

    public C31081Jw(BottomToastVM bottomToastVM) {
        o.LJIIIZ(bottomToastVM, "bottomToastVM");
        this.LJLILLLLZI = bottomToastVM;
    }

    public C31081Jw(List list) {
        this.LJLILLLLZI = list;
    }
}
