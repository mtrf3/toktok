package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EAV extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final EAV LJLIL = new EAV();

    public EAV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Object obj;
        IPluginService.ShowConfig showConfig;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        OnboardingFlowData onboardingFlowData;
        List<NewUserJourneyStep> list;
        NewUserJourneyStep newUserJourneyStep;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.ON_BOARDING_FLOW_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData == null || (showConfig = pluginData.showConfig) == null || !o.LJ(showConfig.shouldShow, Boolean.TRUE) || (pluginDataWrapper = pluginData.configData) == null || (onboardingFlowData = pluginDataWrapper.onboardingFlowData) == null || (list = onboardingFlowData.steps) == null) {
            return null;
        }
        Iterator<NewUserJourneyStep> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                newUserJourneyStep = it.next();
                NewUserJourneyStep newUserJourneyStep2 = newUserJourneyStep;
                if (newUserJourneyStep2.newUserInterestPage != null || newUserJourneyStep2.topicInterestList != null) {
                    break;
                }
            } else {
                newUserJourneyStep = null;
                break;
            }
        }
        NewUserJourneyStep newUserJourneyStep3 = newUserJourneyStep;
        if (newUserJourneyStep3 == null) {
            return null;
        }
        return newUserJourneyStep3.abExposeVid;
    }
}
