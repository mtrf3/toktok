package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Hjm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44902Hjm extends C43170Gww {
    public static final /* synthetic */ int LJI = 0;
    public final Activity LJ;
    public final C44913Hjx LJFF;

    @Override // X.C43170Gww
    public final void LIZ(String url, InterfaceC43172Gwy interfaceC43172Gwy, C42593Gnd c42593Gnd) {
        o.LJIIIZ(url, "url");
        super.LIZ(url, new C44901Hjl(this), c42593Gnd);
    }

    @Override // X.C43170Gww
    public final String LIZIZ(Aweme aweme, int i, C42593Gnd c42593Gnd) {
        o.LJIIIZ(aweme, "aweme");
        return C197747pS.LIZ(aweme);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44902Hjm(WeakReference<Activity> weakReference, Activity activity, Integer num, C44913Hjx c44913Hjx) {
        super(weakReference, num);
        o.LJIIIZ(activity, "activity");
        this.LJ = activity;
        this.LJFF = c44913Hjx;
    }
}
