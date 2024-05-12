package X;

import com.ss.android.ugc.aweme.liveevent.LiveEventApi;
import com.ss.android.ugc.aweme.liveevent.LiveEventResponse;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.3I5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3I5<V> implements Callable {
    public static final C3I5<V> LJLIL = new C3I5<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HG3.LJIIL();
        LiveEventResponse liveEventResponse = ((LiveEventApi.RealApi) LiveEventApi.LIZ.create(LiveEventApi.RealApi.class)).getAnchorSelectionResponse(HG3.LJLJL.LJFF().getCurUserId(), 6, 0, 100).get();
        o.LJIIIIZZ(liveEventResponse, "RETROFIT\n            .cr…, 100)\n            .get()");
        return liveEventResponse;
    }
}
