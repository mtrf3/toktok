package X;

import com.ss.android.ugc.aweme.topicfeed.ui.tab.BaseTopicTabProtocol;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol0;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol1;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol2;
import com.ss.android.ugc.aweme.topicfeed.ui.tab.TopicTabProtocol3;

/* loaded from: classes10.dex */
public final class LAU extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<EnumC53808L9w, ? extends BaseTopicTabProtocol>> {
    public static final LAU LJLIL = new LAU();

    public LAU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<EnumC53808L9w, ? extends BaseTopicTabProtocol> invoke() {
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        c65864Pt6.put(EnumC53808L9w.TOPIC0, new TopicTabProtocol0());
        c65864Pt6.put(EnumC53808L9w.TOPIC1, new TopicTabProtocol1());
        c65864Pt6.put(EnumC53808L9w.TOPIC2, new TopicTabProtocol2());
        c65864Pt6.put(EnumC53808L9w.TOPIC3, new TopicTabProtocol3());
        c65864Pt6.build();
        return c65864Pt6;
    }
}
