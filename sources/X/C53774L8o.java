package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabConfig;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabFeatureConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.L8o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53774L8o {
    public static final C53774L8o LIZ = new C53774L8o();
    public static final TopicFeedTabFeatureConfig LIZIZ;
    public static final TopicFeedTabConfig LIZJ;
    public static TopicFeedTabFeatureConfig LIZLLL;
    public static final List<WeakReference<InterfaceC53777L8r>> LJ;
    public static final boolean LJFF;
    public static final int LJI;

    static {
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig = new TopicFeedTabFeatureConfig(null, 1, null);
        LIZIZ = topicFeedTabFeatureConfig;
        LIZJ = new TopicFeedTabConfig(false, 0, null, null, null, 30, null);
        LJ = new ArrayList();
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig2 = LIZLLL;
        if (topicFeedTabFeatureConfig2 == null) {
            topicFeedTabFeatureConfig2 = (TopicFeedTabFeatureConfig) SettingsManager.LIZLLL().LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig);
            if (topicFeedTabFeatureConfig2 == null) {
                topicFeedTabFeatureConfig2 = topicFeedTabFeatureConfig;
            }
            LIZLLL = topicFeedTabFeatureConfig2;
        }
        LJFF = !topicFeedTabFeatureConfig2.tabs.isEmpty();
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig3 = LIZLLL;
        if (topicFeedTabFeatureConfig3 == null) {
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig4 = (TopicFeedTabFeatureConfig) SettingsManager.LIZLLL().LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig);
            if (topicFeedTabFeatureConfig4 != null) {
                topicFeedTabFeatureConfig = topicFeedTabFeatureConfig4;
            }
            LIZLLL = topicFeedTabFeatureConfig;
            topicFeedTabFeatureConfig3 = topicFeedTabFeatureConfig;
        }
        LJI = topicFeedTabFeatureConfig3.tabs.size();
        FH5.LIZIZ().LJFF(C53774L8o.class, C53776L8q.LJLIL);
    }

    public static java.util.Set LIZ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((ArrayList) LJ).iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        int size = linkedHashSet.size();
        ArrayList arrayList = (ArrayList) LJ;
        if (size != arrayList.size()) {
            arrayList.clear();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                ((ArrayList) LJ).add(new WeakReference(next));
            }
        }
        return linkedHashSet;
    }

    public static TopicFeedTabConfig LIZIZ(int i) {
        Boolean bool;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(i);
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig = LIZLLL;
        if (topicFeedTabFeatureConfig == null) {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig2 = LIZIZ;
            topicFeedTabFeatureConfig = (TopicFeedTabFeatureConfig) LIZLLL2.LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig2);
            if (topicFeedTabFeatureConfig == null) {
                topicFeedTabFeatureConfig = topicFeedTabFeatureConfig2;
            }
            LIZLLL = topicFeedTabFeatureConfig;
        }
        TopicFeedTabConfig topicFeedTabConfig = (TopicFeedTabConfig) ORZ.LJLLLLLL(i, topicFeedTabFeatureConfig.tabs);
        if (topicFeedTabConfig != null) {
            bool = Boolean.valueOf(topicFeedTabConfig.LJLIL);
        } else {
            bool = null;
        }
        LIZ2.append(bool);
        X1D.LIZIZ(LIZ2);
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig3 = LIZLLL;
        if (topicFeedTabFeatureConfig3 == null) {
            SettingsManager LIZLLL3 = SettingsManager.LIZLLL();
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig4 = LIZIZ;
            topicFeedTabFeatureConfig3 = (TopicFeedTabFeatureConfig) LIZLLL3.LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig4);
            if (topicFeedTabFeatureConfig3 == null) {
                topicFeedTabFeatureConfig3 = topicFeedTabFeatureConfig4;
            }
            LIZLLL = topicFeedTabFeatureConfig3;
        }
        TopicFeedTabConfig topicFeedTabConfig2 = (TopicFeedTabConfig) ORZ.LJLLLLLL(i, topicFeedTabFeatureConfig3.tabs);
        if (topicFeedTabConfig2 == null) {
            return LIZJ;
        }
        return topicFeedTabConfig2;
    }
}
