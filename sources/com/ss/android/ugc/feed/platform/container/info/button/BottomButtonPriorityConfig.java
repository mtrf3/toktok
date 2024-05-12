package com.ss.android.ugc.feed.platform.container.info.button;

import X.C113554cx;
import X.C210678Op;
import X.C39557Ffl;
import X.C3C8;
import X.C47261Igj;
import X.C51645KOr;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C65776Prg;
import X.C77275UUl;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.OSZ;
import X.Z9N;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.assem.addtostorybutton.AddToStoryButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.analyticsinspiration.AnalyticsInspirationButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.duetbutton.VideoDuetButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPTrigger;
import com.ss.android.ugc.aweme.feed.assem.friendeffect.FriendEffectPromptTrigger;
import com.ss.android.ugc.aweme.feed.assem.friendstab.FriendsTabEducateButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.qabutton.QAInviteButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentTrigger;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnTrigger;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationTrigger;
import com.ss.android.ugc.aweme.feed.assem.stitchbutton.VideoStitchButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BottomButtonPriorityConfig {
    public static final Set<String> LIZ = C77275UUl.LJ("bottom_button_follow", "bottom_button_friends_tab_educate", "bottom_button_user_suggestion", "bottom_button_try_same_effect", "bottom_button_quick_comment", "bottom_button_share_info", "bottom_button_qa_invite", "bottom_button_duet", "bottom_button_add_favorite", "bottom_button_stitch", "bottom_button_add_song_to_playlist", "bottom_button_retag_poi", "bottom_button_see_translation", "bottom_button_start_new_video", "bottom_button_add_yours_entrance", "bottom_button_video_skip", "bottom_button_music_shoot", "bottom_button_story_message", "bottom_button_early_feedback", "bottom_button_share_to_story");
    public static final Map<String, C210678Op> LIZIZ = C113554cx.LJJLIIIIJ(new OSZ("bottom_button_follow", new C210678Op(1, "social")), new OSZ("bottom_button_user_suggestion", new C210678Op(2, "social")), new OSZ("bottom_button_quick_comment", new C210678Op(3, "social")), new OSZ("bottom_button_share_info", new C210678Op(4, "social")), new OSZ("bottom_button_qa_invite", new C210678Op(5, "New format")), new OSZ("bottom_button_duet", new C210678Op(7, "create")), new OSZ("bottom_button_add_favorite", new C210678Op(8, "music")), new OSZ("bottom_button_try_same_effect", new C210678Op(10, "social")), new OSZ("bottom_button_stitch", new C210678Op(11, "create")), new OSZ("bottom_button_start_new_video", new C210678Op(12, "creator monetization")), new OSZ("bottom_button_see_translation", new C210678Op(14, "big_see_translation")), new OSZ("bottom_button_add_song_to_playlist", new C210678Op(16, "music")), new OSZ("bottom_button_video_skip", new C210678Op(17, "search")), new OSZ("bottom_button_add_yours_entrance", new C210678Op(18, "add_yours")), new OSZ("bottom_button_music_shoot", new C210678Op(19, "search")), new OSZ("bottom_button_friends_tab_educate", new C210678Op(20, "social")), new OSZ("bottom_button_story_message", new C210678Op(21, "social")), new OSZ("bottom_button_early_feedback", new C210678Op(22, "ug")), new OSZ("bottom_button_share_to_story", new C210678Op(23, "social")));

    public static void LIZ(FeedBottomButtonContainer feedBottomButtonContainer) {
        PriorityProtocol priorityProtocol;
        PriorityProtocol priorityProtocol2;
        PriorityProtocol priorityProtocol3;
        o.LJIIIZ(feedBottomButtonContainer, "<this>");
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(feedBottomButtonContainer);
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new VideoRelationBtnTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new VideoDuetButtonTrigger()));
        InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LIZ2 = C51645KOr.LIZIZ.LIZ();
        if (LIZ2 != null) {
            Object newInstance = C39557Ffl.LIZ(LIZ2).newInstance();
            if ((newInstance instanceof PriorityProtocol) && (priorityProtocol3 = (PriorityProtocol) newInstance) != null) {
                C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(priorityProtocol3));
            }
        }
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new QAInviteButtonAssem()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new FollowButtonFFPTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new VideoExposeSharerInformationTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new VideoQuickCommentTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new FriendEffectPromptTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new VideoStitchButtonTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new AnalyticsInspirationButtonTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new AddToMusicDspButtonTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new AddYoursEntranceButtonTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new FriendsTabEducateButtonTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new QuickDMEntranceTrigger()));
        Z9N z9n = Z9N.LIZIZ;
        InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJLILLLLZI = z9n.LJLILLLLZI();
        if (LJLILLLLZI != null) {
            Object newInstance2 = C39557Ffl.LIZ(LJLILLLLZI).newInstance();
            if ((newInstance2 instanceof PriorityProtocol) && (priorityProtocol2 = (PriorityProtocol) newInstance2) != null) {
                C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(priorityProtocol2));
            }
        }
        C65776Prg LJIIL = z9n.LLILZ().LJIIL();
        if (LJIIL != null) {
            Object newInstance3 = C39557Ffl.LIZ(LJIIL).newInstance();
            if ((newInstance3 instanceof PriorityProtocol) && (priorityProtocol = (PriorityProtocol) newInstance3) != null) {
                C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(priorityProtocol));
            }
        }
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new EarlyFeedbackButtonTrigger()));
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, PriorityProtocol.class, C47261Igj.LJJIJIL(new AddToStoryButtonTrigger()));
    }
}
