package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabConfig;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.L8p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53775L8p extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C53775L8p LJLIL = new C53775L8p();

    public C53775L8p() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig = C53774L8o.LIZLLL;
        if (topicFeedTabFeatureConfig != null) {
            C53774L8o.LIZ.getClass();
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig2 = C53774L8o.LIZIZ;
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig3 = (TopicFeedTabFeatureConfig) LIZLLL.LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig2);
            if (topicFeedTabFeatureConfig3 != null) {
                topicFeedTabFeatureConfig2 = topicFeedTabFeatureConfig3;
            }
            List<TopicFeedTabConfig> list = topicFeedTabFeatureConfig.tabs;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<TopicFeedTabConfig> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().topicFeedId));
            }
            List<TopicFeedTabConfig> list2 = topicFeedTabFeatureConfig2.tabs;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<TopicFeedTabConfig> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(it2.next().topicFeedId));
            }
            if (o.LJ(arrayList, arrayList2)) {
                List<TopicFeedTabConfig> list3 = topicFeedTabFeatureConfig.tabs;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list3, 10));
                Iterator<TopicFeedTabConfig> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().title);
                }
                List<TopicFeedTabConfig> list4 = topicFeedTabFeatureConfig2.tabs;
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(list4, 10));
                Iterator<TopicFeedTabConfig> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(it4.next().title);
                }
                if (!o.LJ(arrayList3, arrayList4)) {
                    C53774L8o.LIZLLL = topicFeedTabFeatureConfig2;
                    C53774L8o.LIZ.getClass();
                    Iterator it5 = C53774L8o.LIZ().iterator();
                    while (it5.hasNext()) {
                        ((InterfaceC53777L8r) it5.next()).LIZ();
                    }
                    LO7.LIZIZ.C1();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
