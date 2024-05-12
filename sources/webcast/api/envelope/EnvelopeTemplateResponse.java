package webcast.api.envelope;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class EnvelopeTemplateResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class AnchorOnBoardPermit {

        @InterfaceC65349Pkn("anchor_onboard_permit")
        public boolean anchorOnboardPermit;

        @InterfaceC65349Pkn("permit_tips")
        public String permitTips = "";
    }

    /* loaded from: classes17.dex */
    public static final class CustomRule {

        @InterfaceC65349Pkn("max_countdown_second")
        public int maxCountdownSecond;

        @InterfaceC65349Pkn("max_diamond")
        public int maxDiamond;

        @InterfaceC65349Pkn("max_people_count")
        public int maxPeopleCount;

        @InterfaceC65349Pkn("min_countdown_second")
        public int minCountdownSecond;

        @InterfaceC65349Pkn("min_diamond")
        public int minDiamond;

        @InterfaceC65349Pkn("min_people_count")
        public int minPeopleCount;
    }

    /* loaded from: classes17.dex */
    public static final class EnvelopeTemplate {

        @InterfaceC65349Pkn("business_type")
        public int businessType;

        @InterfaceC65349Pkn("countdown_second")
        public int countdownSecond;

        @InterfaceC65349Pkn("diamond_count")
        public int diamondCount;

        @InterfaceC65349Pkn("envelope_template_id")
        public String envelopeTemplateId = "";

        @InterfaceC65349Pkn("people_count")
        public int peopleCount;
    }

    /* loaded from: classes17.dex */
    public static final class PortalCustomRule {

        @InterfaceC65349Pkn("max_diamonds")
        public int maxDiamonds;

        @InterfaceC65349Pkn("min_diamonds")
        public int minDiamonds;
    }

    /* loaded from: classes17.dex */
    public static final class PortalTemplate {

        @InterfaceC65349Pkn("envelope_diamonds")
        public int envelopeDiamonds;

        @InterfaceC65349Pkn("portal_diamonds")
        public int portalDiamonds;

        @InterfaceC65349Pkn("target_touch_count")
        public int targetTouchCount;

        @InterfaceC65349Pkn("template_id")
        public String templateId = "";

        @InterfaceC65349Pkn("total_diamonds")
        public int totalDiamonds;
    }

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("custom_rule")
        public CustomRule customRule;

        @InterfaceC65349Pkn("envelope_templates")
        public List<EnvelopeTemplate> envelopeTemplates;

        @InterfaceC65349Pkn("is_gpppa")
        public boolean isGpppa;

        @InterfaceC65349Pkn("portal_custom_rule")
        public PortalCustomRule portalCustomRule;

        @InterfaceC65349Pkn("portal_on_board_permit")
        public AnchorOnBoardPermit portalOnBoardPermit;

        @InterfaceC65349Pkn("portal_permission_recalled")
        public boolean portalPermissionRecalled;

        @InterfaceC65349Pkn("portal_template")
        public PortalTemplate portalTemplate;

        @InterfaceC65349Pkn("portal_templates")
        public List<PortalTemplate> portalTemplates;

        @InterfaceC65349Pkn("show_portal_red_dot")
        public boolean showPortalRedDot;

        @InterfaceC65349Pkn("special_room_type")
        public int specialRoomType;

        @InterfaceC65349Pkn("treasure_on_board_permit")
        public AnchorOnBoardPermit treasureOnBoardPermit;
    }
}
