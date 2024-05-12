package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.Callable;

/* renamed from: X.8BU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BU<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;

    public C8BU(boolean z) {
        this.LJLIL = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        C188727au c188727au = new C188727au();
        if (this.LJLIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("is_top_tab", str);
        FMX.LJIIL("follow_tab_show", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
