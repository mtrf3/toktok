package X;

import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lf8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54806Lf8<SUBSCRIBE_DATA, OUTPUT_DATA> {
    public final ConcurrentHashMap<InterfaceC54770LeY, java.util.Set<StoryReceiver>> LIZ = new ConcurrentHashMap<>();
    public final C73849Syb<C54789Ler<SUBSCRIBE_DATA, OUTPUT_DATA>> LIZIZ = new C73849Syb<>();
    public final C54807Lf9 LIZJ = new C54807Lf9(this);

    public abstract Object LIZ(SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data);

    public final void LIZIZ(InterfaceC54770LeY storyView, StoryReceiver storyReceiver) {
        o.LJIIIZ(storyView, "storyView");
        ConcurrentHashMap<InterfaceC54770LeY, java.util.Set<StoryReceiver>> concurrentHashMap = this.LIZ;
        java.util.Set<StoryReceiver> set = concurrentHashMap.get(storyView);
        if (set == null) {
            set = new LinkedHashSet<>();
        }
        ORS.LJJLIIJ(set, new AqS175S0100000_9(storyReceiver, 628));
        set.add(storyReceiver);
        concurrentHashMap.put(storyView, set);
    }
}
