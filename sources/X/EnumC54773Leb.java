package X;

import com.bytedance.router.SmartRoute;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Leb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC54773Leb implements L6T {
    public static final EnumC54773Leb COMMENT;
    public static final EnumC54773Leb DM;
    public static final EnumC54773Leb FEED;
    public static final EnumC54773Leb FOLLOW_LIST;
    public static final EnumC54773Leb FOLLOW_SKYLIGHT;
    public static final EnumC54773Leb FRIENDS_SKYLIGHT;
    public static final EnumC54773Leb INBOX;
    public static final EnumC54773Leb INBOX_SUGGESTED_ACCOUNT;
    public static final EnumC54773Leb INBOX_TOP_LIST;
    public static final /* synthetic */ EnumC54773Leb[] LJLIL;
    public static final EnumC54773Leb OTHER;
    public static final EnumC54773Leb PROFILE;
    public static final EnumC54773Leb PROFILE_VIEWS;
    public static final EnumC54773Leb SEARCH;
    public static final EnumC54773Leb STORY_GUIDE_CARD;
    public static final EnumC54773Leb STORY_VIEWS_LIST_PANEL;

    public EnumC54773Leb() {
        throw null;
    }

    public static EnumC54773Leb valueOf(String str) {
        return (EnumC54773Leb) V0N.LJJJ(EnumC54773Leb.class, str);
    }

    public static EnumC54773Leb[] values() {
        return (EnumC54773Leb[]) LJLIL.clone();
    }

    @Override // X.L6T
    public abstract /* synthetic */ void onEnterPlayer(SmartRoute smartRoute, String str);

    static {
        EnumC54773Leb enumC54773Leb = new EnumC54773Leb() { // from class: X.Leg
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_AVATAR";
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        FEED = enumC54773Leb;
        EnumC54773Leb enumC54773Leb2 = new EnumC54773Leb() { // from class: X.Lei
            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_AVATAR";
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        INBOX = enumC54773Leb2;
        EnumC54773Leb enumC54773Leb3 = new EnumC54773Leb() { // from class: X.Leq
            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                route.withParam("story type", 0);
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        PROFILE = enumC54773Leb3;
        EnumC54773Leb enumC54773Leb4 = new EnumC54773Leb() { // from class: X.Leh
            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_AVATAR";
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        FOLLOW_LIST = enumC54773Leb4;
        EnumC54773Leb enumC54773Leb5 = new EnumC54773Leb() { // from class: X.Lef
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_INBOX_TOP_LIST";
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_INBOX_TOP_LIST");
                route.withParam("enter_from", "notification_page");
                route.withParam("previous_page", "notification_page");
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "top_cell"));
            }
        };
        INBOX_TOP_LIST = enumC54773Leb5;
        EnumC54773Leb enumC54773Leb6 = new EnumC54773Leb() { // from class: X.Lep
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "interaction_panel"));
            }
        };
        COMMENT = enumC54773Leb6;
        EnumC54773Leb enumC54773Leb7 = new EnumC54773Leb() { // from class: X.Lel
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        DM = enumC54773Leb7;
        EnumC54773Leb enumC54773Leb8 = new EnumC54773Leb() { // from class: X.Leo
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        SEARCH = enumC54773Leb8;
        EnumC54773Leb enumC54773Leb9 = new EnumC54773Leb() { // from class: X.Lem
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        INBOX_SUGGESTED_ACCOUNT = enumC54773Leb9;
        EnumC54773Leb enumC54773Leb10 = new EnumC54773Leb() { // from class: X.Len
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return true;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        PROFILE_VIEWS = enumC54773Leb10;
        EnumC54773Leb enumC54773Leb11 = new EnumC54773Leb() { // from class: X.Lee
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST";
                route.withParam("story type", 0);
                route.withParam("enter_from", "homepage_follow");
                route.withParam("video_from", "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST");
                route.withParam("previous_page", "homepage_follow");
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "top_cell"));
            }
        };
        FOLLOW_SKYLIGHT = enumC54773Leb11;
        EnumC54773Leb enumC54773Leb12 = new EnumC54773Leb() { // from class: X.Led
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_FEED_TOP_LIST";
                route.withParam("story type", 0);
                route.withParam("enter_from", "homepage_friends");
                route.withParam("video_from", "STORY_ENTRANCE_FEED_TOP_LIST");
                route.withParam("previous_page", "homepage_friends");
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "top_cell"));
            }
        };
        FRIENDS_SKYLIGHT = enumC54773Leb12;
        EnumC54773Leb enumC54773Leb13 = new EnumC54773Leb() { // from class: X.Lek
            @Override // X.EnumC54773Leb, X.L6T
            public final boolean skipGray() {
                return false;
            }

            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_GUIDE_CARD";
                route.withParam("story type", 0);
                route.withParam("enter_from", "homepage_hot");
                route.withParam("video_from", "STORY_ENTRANCE_GUIDE_CARD");
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "story_card"));
            }
        };
        STORY_GUIDE_CARD = enumC54773Leb13;
        EnumC54773Leb enumC54773Leb14 = new EnumC54773Leb() { // from class: X.Lej
            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
                C222578oP.LIZIZ = "STORY_ENTRANCE_AVATAR";
                route.withParam("story type", 0);
                route.withParam("video_from", "STORY_ENTRANCE_AVATAR");
                route.withParam("enter_from", str);
                route.withParam("enter_position", "head");
                route.withParam("feed_param_extra", C03660Ck.LIZJ("enter_position", "head"));
            }
        };
        STORY_VIEWS_LIST_PANEL = enumC54773Leb14;
        EnumC54773Leb enumC54773Leb15 = new EnumC54773Leb() { // from class: X.Lec
            @Override // X.EnumC54773Leb, X.L6T
            public final void onEnterPlayer(SmartRoute route, String str) {
                o.LJIIIZ(route, "route");
            }
        };
        OTHER = enumC54773Leb15;
        LJLIL = new EnumC54773Leb[]{enumC54773Leb, enumC54773Leb2, enumC54773Leb3, enumC54773Leb4, enumC54773Leb5, enumC54773Leb6, enumC54773Leb7, enumC54773Leb8, enumC54773Leb9, enumC54773Leb10, enumC54773Leb11, enumC54773Leb12, enumC54773Leb13, enumC54773Leb14, enumC54773Leb15};
    }

    @Override // X.L6T
    public boolean skipGray() {
        return C7EI.LIZIZ;
    }

    public EnumC54773Leb(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
