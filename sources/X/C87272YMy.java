package X;

import com.ss.android.ugc.aweme.search.source.neo.model.FeedSceneInfo;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import defpackage.g0;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.YMy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87272YMy extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchBehaviorSignalState, YN8, SearchBehaviorSignalState> {
    public static final C87272YMy LJLIL = new C87272YMy();

    public C87272YMy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final SearchBehaviorSignalState invoke(SearchBehaviorSignalState searchBehaviorSignalState, YN8 yn8) {
        FeedSceneInfo feedSceneInfo;
        SearchBehaviorSignalState lastState = searchBehaviorSignalState;
        YN8 action = yn8;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        String str = action.LJLIL;
        int i = 0;
        if (str != null && str.length() != 0) {
            Iterator<FeedSceneInfo> it = lastState.feedSceneInfo.iterator();
            while (true) {
                if (it.hasNext()) {
                    feedSceneInfo = it.next();
                    if (o.LJ(feedSceneInfo.awemeId, action.LJLIL)) {
                        break;
                    }
                } else {
                    feedSceneInfo = null;
                    break;
                }
            }
            FeedSceneInfo feedSceneInfo2 = feedSceneInfo;
            if (feedSceneInfo2 == null) {
                feedSceneInfo2 = new FeedSceneInfo(Long.valueOf(System.currentTimeMillis()), action.LJLIL, null, null, null, null, null, 124, null);
                lastState.feedSceneInfo.add(feedSceneInfo2);
            }
            FeedSceneInfo LIZ = FeedSceneInfo.LIZ(feedSceneInfo2, g0.LJJIJ(action.LJLILLLLZI, String.valueOf(feedSceneInfo2.playTime)), null, null, null, C87273YMz.LIZ(feedSceneInfo2.actSet, action.LJLJI), 59);
            try {
                Iterator<FeedSceneInfo> it2 = lastState.feedSceneInfo.iterator();
                while (it2.hasNext()) {
                    FeedSceneInfo next = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (o.LJ(next.awemeId, LIZ.awemeId)) {
                            lastState.feedSceneInfo.set(i, LIZ);
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return lastState;
    }
}
