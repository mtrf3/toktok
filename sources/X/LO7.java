package X;

import com.ss.android.ugc.aweme.ITopicFeedService;
import com.ss.android.ugc.aweme.topicfeed.service.TopicFeedServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LO7 implements ITopicFeedService {
    public static final LO7 LIZIZ = new LO7();
    public final /* synthetic */ ITopicFeedService LIZ = TopicFeedServiceImpl.LIZ();

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void C1() {
        this.LIZ.C1();
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean D1() {
        return this.LIZ.D1();
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean E1(int i) {
        return this.LIZ.E1(i);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean F1(String str) {
        return this.LIZ.F1(str);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean G1(String fragmentIdentifier) {
        o.LJIIIZ(fragmentIdentifier, "fragmentIdentifier");
        return this.LIZ.G1(fragmentIdentifier);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final int H1(String eventType) {
        o.LJIIIZ(eventType, "eventType");
        return this.LIZ.H1(eventType);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void I1(HashMap<String, String> hashMap) {
        this.LIZ.I1(hashMap);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean J1(String str) {
        return this.LIZ.J1(str);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void K1(HashMap<String, String> hashMap) {
        this.LIZ.K1(hashMap);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final Object L1(Object key) {
        o.LJIIIZ(key, "key");
        return this.LIZ.L1(key);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final String M1(int i) {
        return this.LIZ.M1(i);
    }
}
