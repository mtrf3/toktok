package X;

import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9C extends C9U4 {
    public H9C() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // X.C9U4
    public final Object LIZLLL(String key) {
        Integer missionLabelType;
        String missionId;
        o.LJIIIZ(key, "key");
        int i = 1;
        switch (key.hashCode()) {
            case -1605893267:
                if (key.equals("creator_type")) {
                    return CommerceMissionServiceImpl.LJIIIIZZ().LJ();
                }
                throw new C9U1(key);
            case -1019096117:
                if (key.equals("page_source")) {
                    Mission mission = (Mission) LJ().get(Mission.class);
                    if (mission == null) {
                        return null;
                    }
                    return mission.getEnterFrom();
                }
                throw new C9U1(key);
            case -930847859:
                if (key.equals("eligibility")) {
                    HTCMissionModule hTCMissionModule = (HTCMissionModule) LJ().get(HTCMissionModule.class);
                    if (hTCMissionModule != null && o.LJ(hTCMissionModule.isEligibleUser(), Boolean.TRUE)) {
                        return "1";
                    }
                    return CardStruct.IStatusCode.DEFAULT;
                }
                throw new C9U1(key);
            case -892481550:
                if (key.equals("status")) {
                    HTCMissionModule hTCMissionModule2 = (HTCMissionModule) LJ().get(HTCMissionModule.class);
                    if (hTCMissionModule2 == null || (missionLabelType = hTCMissionModule2.getMissionLabelType()) == null) {
                        return null;
                    }
                    return Integer.valueOf(missionLabelType.intValue() + 1);
                }
                throw new C9U1(key);
            case -93915986:
                if (key.equals("mission_id")) {
                    Mission mission2 = (Mission) LJ().get(Mission.class);
                    if (mission2 == null || (missionId = mission2.getMissionId()) == null) {
                        HTCMissionModule hTCMissionModule3 = (HTCMissionModule) LJ().get(HTCMissionModule.class);
                        if (hTCMissionModule3 == null) {
                            return null;
                        }
                        return hTCMissionModule3.getMissionId();
                    }
                    return missionId;
                }
                throw new C9U1(key);
            case 411045517:
                if (key.equals("label_version")) {
                    HTCMissionModule hTCMissionModule4 = (HTCMissionModule) LJ().get(HTCMissionModule.class);
                    if (hTCMissionModule4 != null) {
                        Integer bannerType = hTCMissionModule4.getBannerType();
                        Integer textType = hTCMissionModule4.getTextType();
                        if (bannerType != null && textType != null) {
                            if (bannerType.intValue() == 0) {
                                i = 0;
                            } else if (bannerType.intValue() != 1 || textType.intValue() != 0) {
                                if (bannerType.intValue() == 2 && textType.intValue() == 0) {
                                    i = 2;
                                } else if (bannerType.intValue() == 1 && textType.intValue() == 1) {
                                    i = 3;
                                } else if (bannerType.intValue() == 2 && textType.intValue() == 1) {
                                    i = 4;
                                }
                            }
                            return Integer.valueOf(i);
                        }
                    }
                    i = -1;
                    return Integer.valueOf(i);
                }
                throw new C9U1(key);
            case 962926530:
                if (key.equals("creator_followers")) {
                    return Integer.valueOf(CommerceMissionServiceImpl.LJIIIIZZ().LJI());
                }
                throw new C9U1(key);
            case 1468785045:
                if (key.equals("current_page")) {
                    Object obj = LJ().get(E3X.class);
                    if (obj != null) {
                        return ((E3X) obj).getMobValue();
                    }
                    throw new C9U2(E3X.class);
                }
                throw new C9U1(key);
            default:
                throw new C9U1(key);
        }
    }

    public final void LJIIJJI(Mission mission, int i) {
        LJIIIZ(mission);
        LIZIZ("value", Integer.valueOf(i));
        LJII("mission_requirement_modified", "mission_id", "page_source", "creator_followers", "creator_type");
    }

    public final void LJIILIIL(int i, Long l) {
        H9A h9a = H9A.LIZ;
        LJI("mission_requirement_toast", new OSZ<>("reason", Integer.valueOf(i)), new OSZ<>("mission_id", l), new OSZ<>("creator_followers", h9a), new OSZ<>("creator_type", h9a));
    }

    public final void LJIILJJIL(Mission mission, int i) {
        LJIIIIZZ(mission);
        LIZIZ("reason", Integer.valueOf(i));
        LJII("mission_requirement_toast", "mission_id", "page_source", "creator_followers", "creator_type");
    }

    public final void LJIIJ(Mission mission, boolean z, EnumC42507GmF clickButton) {
        o.LJIIIZ(mission, "mission");
        o.LJIIIZ(clickButton, "clickButton");
        LJIIIIZZ(mission);
        LJI("mission_post_reminder_click", new OSZ<>("mission_id", H9A.LIZ), new OSZ<>("box_checked", Integer.valueOf(z ? 1 : 0)), new OSZ<>("button_click_type", Integer.valueOf(clickButton.getValue())));
    }

    public final void LJIIL(Mission mission, int i, int i2) {
        LJIIIZ(mission);
        LIZIZ("event", Integer.valueOf(i));
        LIZIZ("sticker_type", Integer.valueOf(i2));
        LJII("mission_requirement_sticker", "mission_id", "page_source", "creator_followers");
    }
}
