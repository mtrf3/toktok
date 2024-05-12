package X;

import Y.ARunnableS42S0100000_6;
import Y.IDaS217S0100000_6;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageWrapper;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FzC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40762FzC {
    public static C40787Fzb LIZ(OnboardingFlowData onboardingFlowData) {
        List<NewUserJourneyStep> list;
        NewUserJourneyStep newUserJourneyStep;
        G0D LIZ;
        InterfaceC40806Fzu interfaceC40806Fzu;
        C40870G2g LIZ2;
        if (onboardingFlowData != null && (list = onboardingFlowData.steps) != null) {
            Iterator<NewUserJourneyStep> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    newUserJourneyStep = it.next();
                    if (newUserJourneyStep.newUserContentLanguagePage != null) {
                        break;
                    }
                } else {
                    newUserJourneyStep = null;
                    break;
                }
            }
            NewUserJourneyStep newUserJourneyStep2 = newUserJourneyStep;
            if (newUserJourneyStep2 != null) {
                if (C61653OHp.LIZ() == 0 && (LIZ = C40751Fz1.LIZ()) != null && (interfaceC40806Fzu = (InterfaceC40806Fzu) LIZ.LIZ(InterfaceC40806Fzu.class)) != null) {
                    interfaceC40806Fzu.Vf0(newUserJourneyStep2);
                }
                AbstractC73547Stj.LJFF(new IDaS217S0100000_6(new ARunnableS42S0100000_6(newUserJourneyStep2, 103), 2)).LJIILIIL(T16.LIZIZ).LJIIJJI();
                JourneyContentLanguageWrapper journeyContentLanguageWrapper = newUserJourneyStep2.newUserContentLanguagePage;
                if (journeyContentLanguageWrapper == null || (LIZ2 = C40871G2h.LIZ(journeyContentLanguageWrapper)) == null) {
                    return null;
                }
                return new C40787Fzb(LIZ2, newUserJourneyStep2.pageType, newUserJourneyStep2.abExposeVid);
            }
        }
        return null;
    }
}
