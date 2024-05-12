package X;

import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.NLt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59213NLt {
    public static final C59213NLt LIZ = new C59213NLt();
    public static WeakReference<FeedAdLynxCard> LIZIZ;
    public static boolean LIZJ;

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        FeedAdLynxCard feedAdLynxCard;
        o.LJIIIZ(event, "event");
        WeakReference<FeedAdLynxCard> weakReference = LIZIZ;
        if (weakReference != null && (feedAdLynxCard = weakReference.get()) != null) {
            feedAdLynxCard.onCardStatusEvent(event);
        }
    }
}
