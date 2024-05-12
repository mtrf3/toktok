package X;

import Y.ACListenerS27S0300000_1;
import Y.ACListenerS36S0200000_1;
import Y.ARunnableS5S0101000_1;
import Y.IDObjectS1S0101000_1;
import Y.IDObjectS326S0100000_1;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BrandInvitationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupGreetingContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LinkInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageTitle;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NamedValue;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NudgeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareEffectContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareProductContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSubOnlyVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TakoForFeedContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Title;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSug;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.viewholder.TakoSugWordCell;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS26S0001000_1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC110124Tw {
    public static final EnumC110124Tw AWEME_TEMPLATE_CARD_RECEIVE;
    public static final EnumC110124Tw AWEME_TEMPLATE_CARD_SEND;
    public static final EnumC110124Tw BRAND_INVITATION_CARD_RECEIVE;
    public static final EnumC110124Tw BRAND_INVITATION_CARD_SEND;
    public static final EnumC110124Tw CARD;
    public static final EnumC110124Tw COMMENT_RECEIVE;
    public static final EnumC110124Tw COMMENT_SEND;
    public static final C110134Tx Companion;
    public static final EnumC110124Tw DATE_SEPARATOR;
    public static final EnumC110124Tw DYNAMIC_CARD_RECEIVE;
    public static final EnumC110124Tw DYNAMIC_CARD_SEND;
    public static final EnumC110124Tw GROUP_GREETING_MSG;
    public static final EnumC110124Tw GROUP_INVITE_RECEIVE;
    public static final EnumC110124Tw GROUP_INVITE_SEND;
    public static final EnumC110124Tw GROUP_SYSTEM_MSG;
    public static final EnumC110124Tw IMAGE_CARD_MULTI_RECEIVE;
    public static final EnumC110124Tw IMAGE_CARD_MULTI_SEND;
    public static final EnumC110124Tw IMAGE_CARD_SIMPLE_RECEIVE;
    public static final EnumC110124Tw IMAGE_CARD_SIMPLE_SEND;
    public static final EnumC110124Tw INFO_CARD_RECEIVE;
    public static final EnumC110124Tw INFO_CARD_SEND;
    public static final EnumC110124Tw INTERACTIVE_NOTICE;
    public static final /* synthetic */ EnumC110124Tw[] LJLJI;
    public static final EnumC110124Tw LOAD_MORE;
    public static final EnumC110124Tw MESSAGE_VIOLATION_RECEIVE;
    public static final EnumC110124Tw MESSAGE_VIOLATION_SEND;
    public static final EnumC110124Tw NUDGE_BACK_RECEIVE;
    public static final EnumC110124Tw NUDGE_BACK_SEND;
    public static final EnumC110124Tw NUDGE_RECEIVE;
    public static final EnumC110124Tw NUDGE_SEND;
    public static final EnumC110124Tw PHOTO_CARD_RECEIVE;
    public static final EnumC110124Tw PHOTO_CARD_SEND;
    public static final EnumC110124Tw PORTRAIT_CARD_RECEIVE;
    public static final EnumC110124Tw PORTRAIT_CARD_SEND;
    public static final EnumC110124Tw PROFILE_ITEM;
    public static final EnumC110124Tw RECOMMENDATION_USER_CARD;
    public static final EnumC110124Tw SAY_HELLO;
    public static final EnumC110124Tw SHARE_AWEME_RECEIVE;
    public static final EnumC110124Tw SHARE_AWEME_SEND;
    public static final EnumC110124Tw SHARE_CHALLENGE_MULTI_RECEIVE;
    public static final EnumC110124Tw SHARE_CHALLENGE_MULTI_SEND;
    public static final EnumC110124Tw SHARE_CHALLENGE_SIMPLE_RECEIVE;
    public static final EnumC110124Tw SHARE_CHALLENGE_SIMPLE_SEND;
    public static final EnumC110124Tw SHARE_COMPILATION_MULTI_RECEIVE;
    public static final EnumC110124Tw SHARE_COMPILATION_MULTI_SEND;
    public static final EnumC110124Tw SHARE_COMPILATION_SIMPLE_RECEIVE;
    public static final EnumC110124Tw SHARE_COMPILATION_SIMPLE_SEND;
    public static final EnumC110124Tw SHARE_EFFECT_MULTI_RECEIVE;
    public static final EnumC110124Tw SHARE_EFFECT_MULTI_SEND;
    public static final EnumC110124Tw SHARE_EFFECT_SIMPLE_RECEIVE;
    public static final EnumC110124Tw SHARE_EFFECT_SIMPLE_SEND;
    public static final EnumC110124Tw SHARE_GIF_RECEIVE;
    public static final EnumC110124Tw SHARE_GIF_SEND;
    public static final EnumC110124Tw SHARE_LIVE_EVENT_RECEIVE;
    public static final EnumC110124Tw SHARE_LIVE_EVENT_SEND;
    public static final EnumC110124Tw SHARE_LIVE_RECEIVE;
    public static final EnumC110124Tw SHARE_LIVE_SEND;
    public static final EnumC110124Tw SHARE_LIVE_SUBSCRIBE_RECEIVE;
    public static final EnumC110124Tw SHARE_LIVE_SUBSCRIBE_SEND;
    public static final EnumC110124Tw SHARE_MUSIC_MULTI_RECEIVE;
    public static final EnumC110124Tw SHARE_MUSIC_MULTI_SEND;
    public static final EnumC110124Tw SHARE_MUSIC_SIMPLE_RECEIVE;
    public static final EnumC110124Tw SHARE_MUSIC_SIMPLE_SEND;
    public static final EnumC110124Tw SHARE_PHOTOMODE_AWEME_RECEIVE;
    public static final EnumC110124Tw SHARE_PHOTOMODE_AWEME_SEND;
    public static final EnumC110124Tw SHARE_PRODUCT_RECEIVE;
    public static final EnumC110124Tw SHARE_PRODUCT_SEND;
    public static final EnumC110124Tw SHARE_QNA_MULTI_RECEIVE;
    public static final EnumC110124Tw SHARE_QNA_MULTI_SEND;
    public static final EnumC110124Tw SHARE_QNA_SIMPLE_RECEIVE;
    public static final EnumC110124Tw SHARE_QNA_SIMPLE_SEND;
    public static final EnumC110124Tw SHARE_SEARCH_RECEIVE;
    public static final EnumC110124Tw SHARE_SEARCH_SEND;
    public static final EnumC110124Tw SHARE_STORY_RECEIVE;
    public static final EnumC110124Tw SHARE_STORY_SEND;
    public static final EnumC110124Tw SHARE_SUB_ONLY_VIDEO_RECEIVE;
    public static final EnumC110124Tw SHARE_SUB_ONLY_VIDEO_SEND;
    public static final EnumC110124Tw SHARE_USER_MULTI_RECEIVE;
    public static final EnumC110124Tw SHARE_USER_MULTI_SEND;
    public static final EnumC110124Tw SHARE_USER_SIMPLE_RECEIVE;
    public static final EnumC110124Tw SHARE_USER_SIMPLE_SEND;
    public static final EnumC110124Tw SHARE_WEB_FROM_THIRD_RECEIVE;
    public static final EnumC110124Tw SHARE_WEB_FROM_THIRD_SEND;
    public static final EnumC110124Tw SHARE_WEB_RECEIVE;
    public static final EnumC110124Tw SHARE_WEB_SEND;
    public static final EnumC110124Tw STORE_STICKER_RECEIVE;
    public static final EnumC110124Tw STORE_STICKER_SEND;
    public static final EnumC110124Tw SYSTEM_RECEIVE;
    public static final EnumC110124Tw TAKO_ANSWER_RECEIVE;
    public static final EnumC110124Tw TAKO_FYP;
    public static final EnumC110124Tw TAKO_SUG_WORD;
    public static final EnumC110124Tw TEXT_BIG_EMOJI_RECEIVE;
    public static final EnumC110124Tw TEXT_BIG_EMOJI_SEND;
    public static final EnumC110124Tw TEXT_RECEIVE;
    public static final EnumC110124Tw TEXT_SEND;
    public static final EnumC110124Tw TYPING_STATUS;
    public static final EnumC110124Tw UNSUPPORTED_RECEIVE;
    public static final EnumC110124Tw UNSUPPORTED_SEND;
    public static final EnumC110124Tw VIDEO_CARD_RECEIVE;
    public static final EnumC110124Tw VIDEO_CARD_SEND;
    public static final java.util.Map<Integer, EnumC110124Tw> lookupMap;
    public final int LJLIL;
    public final Class<? extends BaseContent> LJLILLLLZI;

    public EnumC110124Tw() {
        throw null;
    }

    public static final BaseContent jsonContent(int i, String str, String str2, boolean z, long j) {
        Companion.getClass();
        return C110134Tx.LIZIZ(i, str, str2, z, j);
    }

    public static final BaseContent jsonContent(C109544Rq c109544Rq) {
        Companion.getClass();
        return C110134Tx.LIZJ(c109544Rq);
    }

    public static final <T extends BaseContent> T jsonContent(C109544Rq c109544Rq, EnumC110124Tw enumC110124Tw) {
        Companion.getClass();
        return (T) C110134Tx.LIZLLL(c109544Rq, enumC110124Tw);
    }

    public static final EnumC110124Tw valueOf(int i) {
        Companion.getClass();
        return C110134Tx.LJ(i);
    }

    public static final EnumC110124Tw valueOf(C109544Rq c109544Rq) {
        Companion.getClass();
        return C110134Tx.LJFF(c109544Rq);
    }

    public static EnumC110124Tw valueOf(String str) {
        return (EnumC110124Tw) V0N.LJJJ(EnumC110124Tw.class, str);
    }

    public static EnumC110124Tw[] values() {
        return (EnumC110124Tw[]) LJLJI.clone();
    }

    public abstract Integer getContentLayoutId();

    public abstract int getItemLayoutId();

    public abstract C47R getMessagePositionType();

    static {
        EnumC110124Tw enumC110124Tw = new EnumC110124Tw() { // from class: X.4JM
            public final int LJLJJI = R.layout.b53;
            public final Class<SystemContent> LJLJJL = SystemContent.class;
            public final C47R LJLJJLL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<SystemContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        SYSTEM_RECEIVE = enumC110124Tw;
        EnumC110124Tw enumC110124Tw2 = new EnumC110124Tw() { // from class: X.4U7
            public final int LJLJJI = R.layout.b59;
            public final int LJLJJL = R.layout.b57;
            public final Class<TextContent> LJLJJLL = TextContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<TextContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        TEXT_RECEIVE = enumC110124Tw2;
        EnumC110124Tw enumC110124Tw3 = new EnumC110124Tw() { // from class: X.4U9
            public final int LJLJJI = R.layout.b5_;
            public final int LJLJJL = R.layout.b58;
            public final Class<TextContent> LJLJJLL = TextContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<TextContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        TEXT_SEND = enumC110124Tw3;
        EnumC110124Tw enumC110124Tw4 = new EnumC110124Tw() { // from class: X.4UK
            public final int LJLJJI = R.layout.b4y;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareAwemeContent> LJLJJLL = ShareAwemeContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareAwemeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_AWEME_RECEIVE = enumC110124Tw4;
        EnumC110124Tw enumC110124Tw5 = new EnumC110124Tw() { // from class: X.4Jh
            public final int LJLJJI = R.layout.b4z;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareAwemeContent> LJLJJLL = ShareAwemeContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareAwemeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_AWEME_SEND = enumC110124Tw5;
        EnumC110124Tw enumC110124Tw6 = new EnumC110124Tw() { // from class: X.4VC
            public final int LJLJJI = R.layout.b31;
            public final C47R LJLJJL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        DATE_SEPARATOR = enumC110124Tw6;
        EnumC110124Tw enumC110124Tw7 = new EnumC110124Tw() { // from class: X.4Ul
            public final int LJLJJI = R.layout.b4y;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareSubOnlyVideoContent> LJLJJLL = ShareSubOnlyVideoContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareSubOnlyVideoContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_SUB_ONLY_VIDEO_RECEIVE = enumC110124Tw7;
        EnumC110124Tw enumC110124Tw8 = new EnumC110124Tw() { // from class: X.4Um
            public final int LJLJJI = R.layout.b4z;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareSubOnlyVideoContent> LJLJJLL = ShareSubOnlyVideoContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareSubOnlyVideoContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_SUB_ONLY_VIDEO_SEND = enumC110124Tw8;
        EnumC110124Tw enumC110124Tw9 = new EnumC110124Tw() { // from class: X.4UL
            public final int LJLJJI = R.layout.b4y;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareAwemeContent> LJLJJLL = ShareAwemeContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareAwemeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_PHOTOMODE_AWEME_RECEIVE = enumC110124Tw9;
        EnumC110124Tw enumC110124Tw10 = new EnumC110124Tw() { // from class: X.4UM
            public final int LJLJJI = R.layout.b4z;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareAwemeContent> LJLJJLL = ShareAwemeContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareAwemeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_PHOTOMODE_AWEME_SEND = enumC110124Tw10;
        EnumC110124Tw enumC110124Tw11 = new EnumC110124Tw() { // from class: X.4Uj
            public final int LJLJJI = R.layout.b4y;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareStoryContent> LJLJJLL = ShareStoryContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareStoryContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_STORY_RECEIVE = enumC110124Tw11;
        EnumC110124Tw enumC110124Tw12 = new EnumC110124Tw() { // from class: X.4Uk
            public final int LJLJJI = R.layout.b4z;
            public final int LJLJJL = R.layout.b4h;
            public final Class<ShareStoryContent> LJLJJLL = ShareStoryContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareStoryContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_STORY_SEND = enumC110124Tw12;
        EnumC110124Tw enumC110124Tw13 = new EnumC110124Tw() { // from class: X.4Ue
            public final int LJLJJI = R.layout.b3w;
            public final int LJLJJL = R.layout.b3v;
            public final Class<GifContent> LJLJJLL = GifContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<GifContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_GIF_RECEIVE = enumC110124Tw13;
        EnumC110124Tw enumC110124Tw14 = new EnumC110124Tw() { // from class: X.4Ug
            public final int LJLJJI = R.layout.b3x;
            public final int LJLJJL = R.layout.b3v;
            public final Class<GifContent> LJLJJLL = GifContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<GifContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_GIF_SEND = enumC110124Tw14;
        EnumC110124Tw enumC110124Tw15 = new EnumC110124Tw() { // from class: X.4U2
            public final int LJLJJI = R.layout.b3x;
            public final int LJLJJL = R.layout.b3v;
            public final Class<NudgeContent> LJLJJLL = NudgeContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<NudgeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }

            @Override // X.EnumC110124Tw
            public final BaseContent LIZJ(C109544Rq chatMessage) {
                NudgeContent nudgeContent;
                o.LJIIIZ(chatMessage, "chatMessage");
                BaseContent LIZJ = super.LIZJ(chatMessage);
                if (!(LIZJ instanceof NudgeContent) || (nudgeContent = (NudgeContent) LIZJ) == null) {
                    return null;
                }
                nudgeContent.setNudgeBack(false);
                nudgeContent.setReceive(false);
                return nudgeContent;
            }
        };
        NUDGE_SEND = enumC110124Tw15;
        EnumC110124Tw enumC110124Tw16 = new EnumC110124Tw() { // from class: X.4U1
            public final int LJLJJI = R.layout.b3w;
            public final int LJLJJL = R.layout.b3v;
            public final Class<NudgeContent> LJLJJLL = NudgeContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<NudgeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }

            @Override // X.EnumC110124Tw
            public final BaseContent LIZJ(C109544Rq chatMessage) {
                NudgeContent nudgeContent;
                o.LJIIIZ(chatMessage, "chatMessage");
                BaseContent LIZJ = super.LIZJ(chatMessage);
                if (!(LIZJ instanceof NudgeContent) || (nudgeContent = (NudgeContent) LIZJ) == null) {
                    return null;
                }
                nudgeContent.setNudgeBack(false);
                nudgeContent.setReceive(true);
                return nudgeContent;
            }
        };
        NUDGE_RECEIVE = enumC110124Tw16;
        EnumC110124Tw enumC110124Tw17 = new EnumC110124Tw() { // from class: X.4U0
            public final int LJLJJI = R.layout.b3x;
            public final int LJLJJL = R.layout.b3v;
            public final Class<NudgeContent> LJLJJLL = NudgeContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<NudgeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }

            @Override // X.EnumC110124Tw
            public final BaseContent LIZJ(C109544Rq chatMessage) {
                NudgeContent nudgeContent;
                o.LJIIIZ(chatMessage, "chatMessage");
                BaseContent LIZJ = super.LIZJ(chatMessage);
                if (!(LIZJ instanceof NudgeContent) || (nudgeContent = (NudgeContent) LIZJ) == null) {
                    return null;
                }
                nudgeContent.setNudgeBack(true);
                nudgeContent.setReceive(false);
                return nudgeContent;
            }
        };
        NUDGE_BACK_SEND = enumC110124Tw17;
        EnumC110124Tw enumC110124Tw18 = new EnumC110124Tw() { // from class: X.4U3
            public final int LJLJJI = R.layout.b3w;
            public final int LJLJJL = R.layout.b3v;
            public final Class<NudgeContent> LJLJJLL = NudgeContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<NudgeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }

            @Override // X.EnumC110124Tw
            public final BaseContent LIZJ(C109544Rq chatMessage) {
                NudgeContent nudgeContent;
                o.LJIIIZ(chatMessage, "chatMessage");
                BaseContent LIZJ = super.LIZJ(chatMessage);
                if (!(LIZJ instanceof NudgeContent) || (nudgeContent = (NudgeContent) LIZJ) == null) {
                    return null;
                }
                nudgeContent.setNudgeBack(true);
                nudgeContent.setReceive(true);
                return nudgeContent;
            }
        };
        NUDGE_BACK_RECEIVE = enumC110124Tw18;
        EnumC110124Tw enumC110124Tw19 = new EnumC110124Tw() { // from class: X.4JS
            public final int LJLJJI = R.layout.b3p;
            public final int LJLJJL = R.layout.b3o;
            public final Class<CommentContent> LJLJJLL = CommentContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<CommentContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        COMMENT_RECEIVE = enumC110124Tw19;
        EnumC110124Tw enumC110124Tw20 = new EnumC110124Tw() { // from class: X.4JT
            public final int LJLJJI = R.layout.b3q;
            public final int LJLJJL = R.layout.b3o;
            public final Class<CommentContent> LJLJJLL = CommentContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<CommentContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        COMMENT_SEND = enumC110124Tw20;
        EnumC110124Tw enumC110124Tw21 = new EnumC110124Tw() { // from class: X.4VE
            public final int LJLJJI = R.layout.b3d;
            public final C47R LJLJJL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        LOAD_MORE = enumC110124Tw21;
        EnumC110124Tw enumC110124Tw22 = new EnumC110124Tw() { // from class: X.4U4
            public final int LJLJJI;
            public final Class<? extends BaseContent> LJLJJL;
            public final C47R LJLJJLL;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            {
                EnumC110124Tw enumC110124Tw23 = EnumC110124Tw.TEXT_RECEIVE;
                this.LJLJJI = enumC110124Tw23.getItemLayoutId();
                this.LJLJJL = enumC110124Tw23.getMessageContentClazz();
                this.LJLJJLL = C47R.START;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<? extends BaseContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final BaseContent LIZJ(C109544Rq chatMessage) {
                o.LJIIIZ(chatMessage, "chatMessage");
                return C4U6.LIZIZ;
            }
        };
        UNSUPPORTED_RECEIVE = enumC110124Tw22;
        EnumC110124Tw enumC110124Tw23 = new EnumC110124Tw() { // from class: X.4U5
            public final int LJLJJI;
            public final Class<? extends BaseContent> LJLJJL;
            public final C47R LJLJJLL;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            {
                EnumC110124Tw enumC110124Tw24 = EnumC110124Tw.TEXT_SEND;
                this.LJLJJI = enumC110124Tw24.getItemLayoutId();
                this.LJLJJL = enumC110124Tw24.getMessageContentClazz();
                this.LJLJJLL = C47R.END;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<? extends BaseContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final BaseContent LIZJ(C109544Rq chatMessage) {
                o.LJIIIZ(chatMessage, "chatMessage");
                return C4U6.LIZ;
            }
        };
        UNSUPPORTED_SEND = enumC110124Tw23;
        EnumC110124Tw enumC110124Tw24 = new EnumC110124Tw() { // from class: X.4JG
            public final int LJLJJI = R.layout.b4b;
            public final Class<SayHelloContent> LJLJJL = SayHelloContent.class;
            public final C47R LJLJJLL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<SayHelloContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final BaseContent LIZJ(C109544Rq chatMessage) {
                o.LJIIIZ(chatMessage, "chatMessage");
                return new SayHelloContent(null, null, null, null, 15, null);
            }
        };
        SAY_HELLO = enumC110124Tw24;
        EnumC110124Tw enumC110124Tw25 = new EnumC110124Tw() { // from class: X.4UH
            public final int LJLJJI = R.layout.b4q;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareMusicContent> LJLJJLL = ShareMusicContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareMusicContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_MUSIC_MULTI_SEND = enumC110124Tw25;
        EnumC110124Tw enumC110124Tw26 = new EnumC110124Tw() { // from class: X.4UG
            public final int LJLJJI = R.layout.b4p;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareMusicContent> LJLJJLL = ShareMusicContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareMusicContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_MUSIC_MULTI_RECEIVE = enumC110124Tw26;
        EnumC110124Tw enumC110124Tw27 = new EnumC110124Tw() { // from class: X.4UJ
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareMusicContent> LJLJJLL = ShareMusicContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareMusicContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_MUSIC_SIMPLE_SEND = enumC110124Tw27;
        EnumC110124Tw enumC110124Tw28 = new EnumC110124Tw() { // from class: X.4UI
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareMusicContent> LJLJJLL = ShareMusicContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareMusicContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_MUSIC_SIMPLE_RECEIVE = enumC110124Tw28;
        EnumC110124Tw enumC110124Tw29 = new EnumC110124Tw() { // from class: X.4UC
            public final int LJLJJI = R.layout.b4k;
            public final int LJLJJL = R.layout.b4i;
            public final Class<ShareLiveEventContent> LJLJJLL = ShareLiveEventContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareLiveEventContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_LIVE_EVENT_SEND = enumC110124Tw29;
        EnumC110124Tw enumC110124Tw30 = new EnumC110124Tw() { // from class: X.4UA
            public final int LJLJJI = R.layout.b4j;
            public final int LJLJJL = R.layout.b4i;
            public final Class<ShareLiveEventContent> LJLJJLL = ShareLiveEventContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareLiveEventContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_LIVE_EVENT_RECEIVE = enumC110124Tw30;
        EnumC110124Tw enumC110124Tw31 = new EnumC110124Tw() { // from class: X.4UZ
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareSearchContent> LJLJJLL = ShareSearchContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareSearchContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_SEARCH_SEND = enumC110124Tw31;
        EnumC110124Tw enumC110124Tw32 = new EnumC110124Tw() { // from class: X.4UX
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareSearchContent> LJLJJLL = ShareSearchContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareSearchContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_SEARCH_RECEIVE = enumC110124Tw32;
        EnumC110124Tw enumC110124Tw33 = new EnumC110124Tw() { // from class: X.4UP
            public final int LJLJJI = R.layout.b4q;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareChallengeContent> LJLJJLL = ShareChallengeContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareChallengeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_CHALLENGE_MULTI_SEND = enumC110124Tw33;
        EnumC110124Tw enumC110124Tw34 = new EnumC110124Tw() { // from class: X.4UN
            public final int LJLJJI = R.layout.b4p;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareChallengeContent> LJLJJLL = ShareChallengeContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareChallengeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_CHALLENGE_MULTI_RECEIVE = enumC110124Tw34;
        EnumC110124Tw enumC110124Tw35 = new EnumC110124Tw() { // from class: X.4U8
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareChallengeContent> LJLJJLL = ShareChallengeContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareChallengeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_CHALLENGE_SIMPLE_SEND = enumC110124Tw35;
        EnumC110124Tw enumC110124Tw36 = new EnumC110124Tw() { // from class: X.4UR
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareChallengeContent> LJLJJLL = ShareChallengeContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareChallengeContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_CHALLENGE_SIMPLE_RECEIVE = enumC110124Tw36;
        EnumC110124Tw enumC110124Tw37 = new EnumC110124Tw() { // from class: X.4Uh
            public final int LJLJJI = R.layout.b4q;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareUserContent> LJLJJLL = ShareUserContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareUserContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_USER_MULTI_SEND = enumC110124Tw37;
        EnumC110124Tw enumC110124Tw38 = new EnumC110124Tw() { // from class: X.4Uf
            public final int LJLJJI = R.layout.b4p;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareUserContent> LJLJJLL = ShareUserContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareUserContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_USER_MULTI_RECEIVE = enumC110124Tw38;
        EnumC110124Tw enumC110124Tw39 = new EnumC110124Tw() { // from class: X.4UD
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareUserContent> LJLJJLL = ShareUserContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareUserContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_USER_SIMPLE_SEND = enumC110124Tw39;
        EnumC110124Tw enumC110124Tw40 = new EnumC110124Tw() { // from class: X.4UB
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareUserContent> LJLJJLL = ShareUserContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareUserContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_USER_SIMPLE_RECEIVE = enumC110124Tw40;
        EnumC110124Tw enumC110124Tw41 = new EnumC110124Tw() { // from class: X.4JL
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareWebContent> LJLJJLL = ShareWebContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareWebContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_WEB_SEND = enumC110124Tw41;
        EnumC110124Tw enumC110124Tw42 = new EnumC110124Tw() { // from class: X.4JK
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareWebContent> LJLJJLL = ShareWebContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareWebContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_WEB_RECEIVE = enumC110124Tw42;
        EnumC110124Tw enumC110124Tw43 = new EnumC110124Tw() { // from class: X.4UF
            public final int LJLJJI = R.layout.b4n;
            public final int LJLJJL = R.layout.b4l;
            public final Class<ShareLiveContent> LJLJJLL = ShareLiveContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareLiveContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_LIVE_SEND = enumC110124Tw43;
        EnumC110124Tw enumC110124Tw44 = new EnumC110124Tw() { // from class: X.4UE
            public final int LJLJJI = R.layout.b4m;
            public final int LJLJJL = R.layout.b4l;
            public final Class<ShareLiveContent> LJLJJLL = ShareLiveContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareLiveContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_LIVE_RECEIVE = enumC110124Tw44;
        EnumC110124Tw enumC110124Tw45 = new EnumC110124Tw() { // from class: X.4US
            public final int LJLJJI = R.layout.b4p;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareCompilationContent> LJLJJLL = ShareCompilationContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareCompilationContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_COMPILATION_MULTI_RECEIVE = enumC110124Tw45;
        EnumC110124Tw enumC110124Tw46 = new EnumC110124Tw() { // from class: X.4UU
            public final int LJLJJI = R.layout.b4q;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareCompilationContent> LJLJJLL = ShareCompilationContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareCompilationContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_COMPILATION_MULTI_SEND = enumC110124Tw46;
        EnumC110124Tw enumC110124Tw47 = new EnumC110124Tw() { // from class: X.4UW
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareCompilationContent> LJLJJLL = ShareCompilationContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareCompilationContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_COMPILATION_SIMPLE_RECEIVE = enumC110124Tw47;
        EnumC110124Tw enumC110124Tw48 = new EnumC110124Tw() { // from class: X.4UY
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareCompilationContent> LJLJJLL = ShareCompilationContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareCompilationContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_COMPILATION_SIMPLE_SEND = enumC110124Tw48;
        EnumC110124Tw enumC110124Tw49 = new EnumC110124Tw() { // from class: X.4Ua
            public final int LJLJJI = R.layout.b4p;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareEffectContent> LJLJJLL = ShareEffectContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareEffectContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_EFFECT_MULTI_RECEIVE = enumC110124Tw49;
        EnumC110124Tw enumC110124Tw50 = new EnumC110124Tw() { // from class: X.4Ub
            public final int LJLJJI = R.layout.b4q;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareEffectContent> LJLJJLL = ShareEffectContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareEffectContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_EFFECT_MULTI_SEND = enumC110124Tw50;
        EnumC110124Tw enumC110124Tw51 = new EnumC110124Tw() { // from class: X.4Uc
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareEffectContent> LJLJJLL = ShareEffectContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareEffectContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_EFFECT_SIMPLE_RECEIVE = enumC110124Tw51;
        EnumC110124Tw enumC110124Tw52 = new EnumC110124Tw() { // from class: X.4Ud
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareEffectContent> LJLJJLL = ShareEffectContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareEffectContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_EFFECT_SIMPLE_SEND = enumC110124Tw52;
        EnumC110124Tw enumC110124Tw53 = new EnumC110124Tw() { // from class: X.4VH
            public final int LJLJJI = R.layout.b59;
            public final C47R LJLJJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        SHARE_WEB_FROM_THIRD_SEND = enumC110124Tw53;
        EnumC110124Tw enumC110124Tw54 = new EnumC110124Tw() { // from class: X.4VG
            public final int LJLJJI = R.layout.b59;
            public final C47R LJLJJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        SHARE_WEB_FROM_THIRD_RECEIVE = enumC110124Tw54;
        EnumC110124Tw enumC110124Tw55 = new EnumC110124Tw() { // from class: X.4UQ
            public final int LJLJJI = R.layout.b56;
            public final int LJLJJL = R.layout.b54;
            public final Class<TextContent> LJLJJLL = TextContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<TextContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        TEXT_BIG_EMOJI_SEND = enumC110124Tw55;
        EnumC110124Tw enumC110124Tw56 = new EnumC110124Tw() { // from class: X.4UO
            public final int LJLJJI = R.layout.b55;
            public final int LJLJJL = R.layout.b54;
            public final Class<TextContent> LJLJJLL = TextContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<TextContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        TEXT_BIG_EMOJI_RECEIVE = enumC110124Tw56;
        EnumC110124Tw enumC110124Tw57 = new EnumC110124Tw() { // from class: X.4Uq
            public final int LJLJJI = R.layout.b52;
            public final Class<SystemCardContent> LJLJJL = SystemCardContent.class;
            public final C47R LJLJJLL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<SystemCardContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        CARD = enumC110124Tw57;
        EnumC110124Tw enumC110124Tw58 = new EnumC110124Tw() { // from class: X.4JF
            public final int LJLJJI = R.layout.b3z;
            public final Class<GroupGreetingContent> LJLJJL = GroupGreetingContent.class;
            public final C47R LJLJJLL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<GroupGreetingContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        GROUP_GREETING_MSG = enumC110124Tw58;
        EnumC110124Tw enumC110124Tw59 = new EnumC110124Tw() { // from class: X.4Ur
            public final int LJLJJI = R.layout.b53;
            public final Class<GroupSystemContent> LJLJJL = GroupSystemContent.class;
            public final C47R LJLJJLL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<GroupSystemContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        GROUP_SYSTEM_MSG = enumC110124Tw59;
        EnumC110124Tw enumC110124Tw60 = new EnumC110124Tw() { // from class: X.4Tv
            public final int LJLJJI = R.layout.b4q;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareQnAContent> LJLJJLL = ShareQnAContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareQnAContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_QNA_MULTI_SEND = enumC110124Tw60;
        EnumC110124Tw enumC110124Tw61 = new EnumC110124Tw() { // from class: X.4Up
            public final int LJLJJI = R.layout.b6n;
            public final Class<BaseContent> LJLJJL = BaseContent.class;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<BaseContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        MESSAGE_VIOLATION_SEND = enumC110124Tw61;
        EnumC110124Tw enumC110124Tw62 = new EnumC110124Tw() { // from class: X.4Ui
            public final int LJLJJI = R.layout.b6m;
            public final Class<BaseContent> LJLJJL = BaseContent.class;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<BaseContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        MESSAGE_VIOLATION_RECEIVE = enumC110124Tw62;
        EnumC110124Tw enumC110124Tw63 = new EnumC110124Tw() { // from class: X.4Tu
            public final int LJLJJI = R.layout.b4p;
            public final int LJLJJL = R.layout.b4o;
            public final Class<ShareQnAContent> LJLJJLL = ShareQnAContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareQnAContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_QNA_MULTI_RECEIVE = enumC110124Tw63;
        EnumC110124Tw enumC110124Tw64 = new EnumC110124Tw() { // from class: X.4UV
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareQnAContent> LJLJJLL = ShareQnAContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareQnAContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_QNA_SIMPLE_SEND = enumC110124Tw64;
        EnumC110124Tw enumC110124Tw65 = new EnumC110124Tw() { // from class: X.4UT
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareQnAContent> LJLJJLL = ShareQnAContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareQnAContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_QNA_SIMPLE_RECEIVE = enumC110124Tw65;
        EnumC110124Tw enumC110124Tw66 = new EnumC110124Tw() { // from class: X.4JO
            public final int LJLJJI = R.layout.b41;
            public final int LJLJJL = R.layout.b4v;
            public final Class<GroupInviteCardContent> LJLJJLL = GroupInviteCardContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<GroupInviteCardContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        GROUP_INVITE_SEND = enumC110124Tw66;
        EnumC110124Tw enumC110124Tw67 = new EnumC110124Tw() { // from class: X.4JN
            public final int LJLJJI = R.layout.b40;
            public final int LJLJJL = R.layout.b4v;
            public final Class<GroupInviteCardContent> LJLJJLL = GroupInviteCardContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<GroupInviteCardContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        GROUP_INVITE_RECEIVE = enumC110124Tw67;
        EnumC110124Tw enumC110124Tw68 = new EnumC110124Tw() { // from class: X.4Uo
            public final int LJLJJI = R.layout.b3n;
            public final int LJLJJL = R.layout.b3l;
            public final Class<BrandInvitationContent> LJLJJLL = BrandInvitationContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<BrandInvitationContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        BRAND_INVITATION_CARD_SEND = enumC110124Tw68;
        EnumC110124Tw enumC110124Tw69 = new EnumC110124Tw() { // from class: X.4Un
            public final int LJLJJI = R.layout.b3m;
            public final int LJLJJL = R.layout.b3l;
            public final Class<BrandInvitationContent> LJLJJLL = BrandInvitationContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<BrandInvitationContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        BRAND_INVITATION_CARD_RECEIVE = enumC110124Tw69;
        EnumC110124Tw enumC110124Tw70 = new EnumC110124Tw() { // from class: X.4SM
            public final int LJLJJI = R.layout.b4t;
            public final int LJLJJL = R.layout.b4r;
            public final Class<ShareProductContent> LJLJJLL = ShareProductContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareProductContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_PRODUCT_SEND = enumC110124Tw70;
        EnumC110124Tw enumC110124Tw71 = new EnumC110124Tw() { // from class: X.4SN
            public final int LJLJJI = R.layout.b4s;
            public final int LJLJJL = R.layout.b4r;
            public final Class<ShareProductContent> LJLJJLL = ShareProductContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareProductContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_PRODUCT_RECEIVE = enumC110124Tw71;
        EnumC110124Tw enumC110124Tw72 = new EnumC110124Tw() { // from class: X.4JJ
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareSubscribeInviteContent> LJLJJLL = ShareSubscribeInviteContent.class;
            public final C47R LJLJL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareSubscribeInviteContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_LIVE_SUBSCRIBE_SEND = enumC110124Tw72;
        EnumC110124Tw enumC110124Tw73 = new EnumC110124Tw() { // from class: X.4JI
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final Class<ShareSubscribeInviteContent> LJLJJLL = ShareSubscribeInviteContent.class;
            public final C47R LJLJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<ShareSubscribeInviteContent> getMessageContentClazz() {
                return this.LJLJJLL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJL;
            }
        };
        SHARE_LIVE_SUBSCRIBE_RECEIVE = enumC110124Tw73;
        EnumC110124Tw enumC110124Tw74 = new EnumC110124Tw() { // from class: X.4Uw
            public final int LJLJJI = R.layout.b4p;
            public final int LJLJJL = R.layout.b4o;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        IMAGE_CARD_MULTI_RECEIVE = enumC110124Tw74;
        EnumC110124Tw enumC110124Tw75 = new EnumC110124Tw() { // from class: X.4V6
            public final int LJLJJI = R.layout.b4q;
            public final int LJLJJL = R.layout.b4o;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        IMAGE_CARD_MULTI_SEND = enumC110124Tw75;
        EnumC110124Tw enumC110124Tw76 = new EnumC110124Tw() { // from class: X.4Ux
            public final int LJLJJI = R.layout.b4w;
            public final int LJLJJL = R.layout.b4u;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        IMAGE_CARD_SIMPLE_RECEIVE = enumC110124Tw76;
        EnumC110124Tw enumC110124Tw77 = new EnumC110124Tw() { // from class: X.4Uy
            public final int LJLJJI = R.layout.b4x;
            public final int LJLJJL = R.layout.b4u;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        IMAGE_CARD_SIMPLE_SEND = enumC110124Tw77;
        EnumC110124Tw enumC110124Tw78 = new EnumC110124Tw() { // from class: X.4Uz
            public final int LJLJJI = R.layout.b43;
            public final int LJLJJL = R.layout.b42;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        INFO_CARD_RECEIVE = enumC110124Tw78;
        EnumC110124Tw enumC110124Tw79 = new EnumC110124Tw() { // from class: X.4V9
            public final int LJLJJI = R.layout.b44;
            public final int LJLJJL = R.layout.b42;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        INFO_CARD_SEND = enumC110124Tw79;
        EnumC110124Tw enumC110124Tw80 = new EnumC110124Tw() { // from class: X.4V1
            public final int LJLJJI = R.layout.b46;
            public final int LJLJJL = R.layout.b3g;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        PHOTO_CARD_SEND = enumC110124Tw80;
        EnumC110124Tw enumC110124Tw81 = new EnumC110124Tw() { // from class: X.4V0
            public final int LJLJJI = R.layout.b45;
            public final int LJLJJL = R.layout.b3g;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        PHOTO_CARD_RECEIVE = enumC110124Tw81;
        EnumC110124Tw enumC110124Tw82 = new EnumC110124Tw() { // from class: X.4V8
            public final int LJLJJI = R.layout.b46;
            public final int LJLJJL = R.layout.b3g;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        VIDEO_CARD_SEND = enumC110124Tw82;
        EnumC110124Tw enumC110124Tw83 = new EnumC110124Tw() { // from class: X.4V7
            public final int LJLJJI = R.layout.b45;
            public final int LJLJJL = R.layout.b3g;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        VIDEO_CARD_RECEIVE = enumC110124Tw83;
        EnumC110124Tw enumC110124Tw84 = new EnumC110124Tw() { // from class: X.4VJ
            public final int LJLJJI = R.layout.b4a;
            public final C47R LJLJJL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        RECOMMENDATION_USER_CARD = enumC110124Tw84;
        EnumC110124Tw enumC110124Tw85 = new EnumC110124Tw() { // from class: X.4V4
            public final int LJLJJI = R.layout.b4e;
            public final int LJLJJL = R.layout.b4d;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        STORE_STICKER_RECEIVE = enumC110124Tw85;
        EnumC110124Tw enumC110124Tw86 = new EnumC110124Tw() { // from class: X.4V5
            public final int LJLJJI = R.layout.b4f;
            public final int LJLJJL = R.layout.b4d;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        STORE_STICKER_SEND = enumC110124Tw86;
        EnumC110124Tw enumC110124Tw87 = new EnumC110124Tw() { // from class: X.4Ut
            public final int LJLJJI = R.layout.b3j;
            public final int LJLJJL = R.layout.b0l;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        AWEME_TEMPLATE_CARD_SEND = enumC110124Tw87;
        EnumC110124Tw enumC110124Tw88 = new EnumC110124Tw() { // from class: X.4Us
            public final int LJLJJI = R.layout.b3i;
            public final int LJLJJL = R.layout.b0l;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        AWEME_TEMPLATE_CARD_RECEIVE = enumC110124Tw88;
        EnumC110124Tw enumC110124Tw89 = new EnumC110124Tw() { // from class: X.4VK
            public final int LJLJJI = R.layout.b2x;
            public final C47R LJLJJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        TAKO_ANSWER_RECEIVE = enumC110124Tw89;
        EnumC110124Tw enumC110124Tw90 = new EnumC110124Tw() { // from class: X.4V2
            public final int LJLJJI = R.layout.b48;
            public final int LJLJJL = R.layout.b47;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        PORTRAIT_CARD_RECEIVE = enumC110124Tw90;
        EnumC110124Tw enumC110124Tw91 = new EnumC110124Tw() { // from class: X.4V3
            public final int LJLJJI = R.layout.b49;
            public final int LJLJJL = R.layout.b47;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        PORTRAIT_CARD_SEND = enumC110124Tw91;
        EnumC110124Tw enumC110124Tw92 = new EnumC110124Tw() { // from class: X.4VM
            public final int LJLJJI = R.layout.b6g;
            public final C47R LJLJJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        TYPING_STATUS = enumC110124Tw92;
        EnumC110124Tw enumC110124Tw93 = new EnumC110124Tw() { // from class: X.4VL
            public final int LJLJJI = R.layout.b2y;
            public final C47R LJLJJL = C47R.START;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        TAKO_SUG_WORD = enumC110124Tw93;
        EnumC110124Tw enumC110124Tw94 = new EnumC110124Tw() { // from class: X.4JH
            public final int LJLJJI = R.layout.b3k;
            public final Class<TakoForFeedContent> LJLJJL = TakoForFeedContent.class;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final Class<TakoForFeedContent> getMessageContentClazz() {
                return this.LJLJJL;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        TAKO_FYP = enumC110124Tw94;
        EnumC110124Tw enumC110124Tw95 = new EnumC110124Tw() { // from class: X.4Uv
            public final int LJLJJI = R.layout.b3u;
            public final int LJLJJL = R.layout.b3s;
            public final C47R LJLJJLL = C47R.END;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        DYNAMIC_CARD_SEND = enumC110124Tw95;
        EnumC110124Tw enumC110124Tw96 = new EnumC110124Tw() { // from class: X.4Uu
            public final int LJLJJI = R.layout.b3t;
            public final int LJLJJL = R.layout.b3s;
            public final C47R LJLJJLL = C47R.START;

            @Override // X.EnumC110124Tw
            public final Integer getContentLayoutId() {
                return Integer.valueOf(this.LJLJJL);
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJLL;
            }
        };
        DYNAMIC_CARD_RECEIVE = enumC110124Tw96;
        EnumC110124Tw enumC110124Tw97 = new EnumC110124Tw() { // from class: X.4VD
            public final int LJLJJI = R.layout.b3b;
            public final C47R LJLJJL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        INTERACTIVE_NOTICE = enumC110124Tw97;
        EnumC110124Tw enumC110124Tw98 = new EnumC110124Tw() { // from class: X.4VI
            public final int LJLJJI = R.layout.b32;
            public final C47R LJLJJL = C47R.CENTER;

            @Override // X.EnumC110124Tw
            public final /* bridge */ /* synthetic */ Integer getContentLayoutId() {
                return null;
            }

            @Override // X.EnumC110124Tw
            public final int getItemLayoutId() {
                return this.LJLJJI;
            }

            @Override // X.EnumC110124Tw
            public final C47R getMessagePositionType() {
                return this.LJLJJL;
            }
        };
        PROFILE_ITEM = enumC110124Tw98;
        LJLJI = new EnumC110124Tw[]{enumC110124Tw, enumC110124Tw2, enumC110124Tw3, enumC110124Tw4, enumC110124Tw5, enumC110124Tw6, enumC110124Tw7, enumC110124Tw8, enumC110124Tw9, enumC110124Tw10, enumC110124Tw11, enumC110124Tw12, enumC110124Tw13, enumC110124Tw14, enumC110124Tw15, enumC110124Tw16, enumC110124Tw17, enumC110124Tw18, enumC110124Tw19, enumC110124Tw20, enumC110124Tw21, enumC110124Tw22, enumC110124Tw23, enumC110124Tw24, enumC110124Tw25, enumC110124Tw26, enumC110124Tw27, enumC110124Tw28, enumC110124Tw29, enumC110124Tw30, enumC110124Tw31, enumC110124Tw32, enumC110124Tw33, enumC110124Tw34, enumC110124Tw35, enumC110124Tw36, enumC110124Tw37, enumC110124Tw38, enumC110124Tw39, enumC110124Tw40, enumC110124Tw41, enumC110124Tw42, enumC110124Tw43, enumC110124Tw44, enumC110124Tw45, enumC110124Tw46, enumC110124Tw47, enumC110124Tw48, enumC110124Tw49, enumC110124Tw50, enumC110124Tw51, enumC110124Tw52, enumC110124Tw53, enumC110124Tw54, enumC110124Tw55, enumC110124Tw56, enumC110124Tw57, enumC110124Tw58, enumC110124Tw59, enumC110124Tw60, enumC110124Tw61, enumC110124Tw62, enumC110124Tw63, enumC110124Tw64, enumC110124Tw65, enumC110124Tw66, enumC110124Tw67, enumC110124Tw68, enumC110124Tw69, enumC110124Tw70, enumC110124Tw71, enumC110124Tw72, enumC110124Tw73, enumC110124Tw74, enumC110124Tw75, enumC110124Tw76, enumC110124Tw77, enumC110124Tw78, enumC110124Tw79, enumC110124Tw80, enumC110124Tw81, enumC110124Tw82, enumC110124Tw83, enumC110124Tw84, enumC110124Tw85, enumC110124Tw86, enumC110124Tw87, enumC110124Tw88, enumC110124Tw89, enumC110124Tw90, enumC110124Tw91, enumC110124Tw92, enumC110124Tw93, enumC110124Tw94, enumC110124Tw95, enumC110124Tw96, enumC110124Tw97, enumC110124Tw98};
        Companion = new C110134Tx();
        EnumC110124Tw[] values = values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ >= 16 ? LJJIIZ : 16);
        for (EnumC110124Tw enumC110124Tw99 : values) {
            linkedHashMap.put(Integer.valueOf(enumC110124Tw99.LJLIL), enumC110124Tw99);
        }
        lookupMap = linkedHashMap;
    }

    public Class<? extends BaseContent> getMessageContentClazz() {
        return this.LJLILLLLZI;
    }

    public final int getViewType() {
        return this.LJLIL;
    }

    public BaseContent LIZJ(C109544Rq chatMessage) {
        BaseContent baseContent;
        o.LJIIIZ(chatMessage, "chatMessage");
        try {
            baseContent = (BaseContent) C62070OXq.LIZ(getMessageContentClazz(), chatMessage.getContent());
        } catch (Exception e) {
            C34B.LJ("MessageViewType", e);
            baseContent = null;
        }
        if (baseContent == null) {
            try {
                String msg = "MessageViewType parse: itemType:" + this.LJLIL + " message id:" + chatMessage.getMsgId();
                o.LJIIIZ(msg, "msg");
                baseContent = getMessageContentClazz().newInstance();
                return baseContent;
            } catch (IllegalAccessException e2) {
                C34B.LJ("MessageViewType", e2);
                return baseContent;
            } catch (InstantiationException e3) {
                C34B.LJ("MessageViewType", e3);
                return baseContent;
            }
        }
        return baseContent;
    }

    public final AbstractC1041546x getViewHolder(final View itemView) {
        o.LJIIIZ(itemView, "itemView");
        switch (C110144Ty.LIZ[ordinal()]) {
            case 1:
            case 2:
                return new AnonymousClass480(itemView, this);
            case 3:
            case 4:
                return new C4AP(itemView, this) { // from class: X.4AR
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "messageType");
                    }

                    @Override // X.C4AP, X.AnonymousClass460
                    public final /* bridge */ /* synthetic */ void p0(C109544Rq c109544Rq, C109544Rq c109544Rq2, NudgeContent nudgeContent, int i) {
                        p0(c109544Rq, c109544Rq2, nudgeContent, i);
                    }

                    @Override // X.C4AP
                    /* renamed from: t0 */
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, NudgeContent nudgeContent, int i) {
                        int i2;
                        o.LJIIIZ(msg, "msg");
                        super.p0(msg, c109544Rq, nudgeContent, i);
                        C62846OlW c62846OlW = this.LLIIIZ;
                        if (C4FU.LJ()) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        c62846OlW.setScaleX(i2 * (-1.0f));
                    }
                };
            case 5:
            case 6:
                return new C4AP(itemView, this);
            case 7:
            case 8:
                return new AnonymousClass480(itemView, this) { // from class: X.482
                    @Override // X.AbstractC1041546x
                    public final boolean V(C109544Rq msg) {
                        o.LJIIIZ(msg, "msg");
                        return C93793mB.LJIIL(msg);
                    }

                    @Override // X.AnonymousClass480, X.AbstractC1041546x
                    public final boolean X(C109544Rq c109544Rq) {
                        return C93793mB.LJIIL(c109544Rq);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "messageType");
                    }

                    @Override // X.AnonymousClass480
                    public final void s0(boolean z, C49V backgroundConfig) {
                        int i;
                        o.LJIIIZ(backgroundConfig, "backgroundConfig");
                        C4AH c4ah = backgroundConfig.LIZ;
                        if (c4ah != null) {
                            AppCompatImageView appCompatImageView = this.LLIIZ;
                            if (appCompatImageView != null) {
                                if (z) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                appCompatImageView.setVisibility(i);
                            }
                            View view = this.LLIIIZ;
                            if (view == null) {
                                return;
                            }
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            view.setBackground(new C80862VoQ(context, c4ah, this.LLIIZ));
                            return;
                        }
                        super.s0(z, backgroundConfig);
                    }

                    @Override // X.AnonymousClass480
                    public final C49V t0(boolean z, boolean z2, boolean z3) {
                        boolean z4;
                        C48E c48e;
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        if (z && !z3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean LIZ = C90193gN.LIZ();
                        C4AH LIZ2 = C49W.LIZ(true, z4, LIZ);
                        if (z2) {
                            if (LIZ) {
                                LIZ2 = C4AH.L(LIZ2, 7);
                            } else {
                                LIZ2 = C4AH.L(LIZ2, 11);
                            }
                        }
                        Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZ, context);
                        if (LJI != null) {
                            c48e = new C48E(LJI.intValue());
                        } else {
                            c48e = null;
                        }
                        return new C49V(LIZ2, C1042447g.LJLIL, c48e);
                    }

                    @Override // X.AnonymousClass480, X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        o.LJIIIZ(msg, "msg");
                        super.N(c49v, msg, c109544Rq, c109544Rq2);
                        if (!v0()) {
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZIZ, context);
                            if (LJI != null) {
                                this.LLIIJLIL.setTextColor(LJI.intValue());
                            }
                        }
                    }
                };
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
                return new AnonymousClass476(itemView, this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return new AnonymousClass476(itemView, this) { // from class: X.47L
                    @Override // X.AnonymousClass476
                    public final boolean w0() {
                        return false;
                    }

                    @Override // X.AnonymousClass476
                    public final String s0() {
                        return C88913eJ.LIZ(this.itemView, R.string.qip, "itemView.context.getStri…end_muf_you_shared_video)");
                    }

                    @Override // X.AnonymousClass476
                    public final String t0() {
                        return C88913eJ.LIZ(this.itemView, R.string.tjm, "itemView.context.getStri…eocover_heading_DM_inbox)");
                    }

                    @Override // X.AnonymousClass476
                    public final String v0(C109544Rq message) {
                        o.LJIIIZ(message, "message");
                        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
                        if (companion.isVideoTag$im_base_release(message)) {
                            return this.itemView.getContext().getString(R.string.epd);
                        }
                        if (companion.isVideoMention$im_base_release(message)) {
                            return this.itemView.getContext().getString(R.string.epb);
                        }
                        if (companion.isVideoMentionAndTag$im_base_release(message)) {
                            return this.itemView.getContext().getString(R.string.epc);
                        }
                        return null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                    }
                };
            case 17:
                return new AnonymousClass460<BaseContent>(itemView, this) { // from class: X.4Ks
                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        o.LJIIIZ(msg, "msg");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                        o.LJIIIIZZ(itemView.findViewById(R.id.itp), "itemView.findViewById(R.id.refresh_iv)");
                    }
                };
            case 18:
            case 19:
                return new AnonymousClass460<SystemContent>(itemView, this) { // from class: X.464
                    public final AnonymousClass472<TuxTextView> LLIIIL;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                        this.LLIIIL = new AnonymousClass472<>(R.id.gnu, new C47D(itemView));
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, SystemContent systemContent, int i) {
                        SystemContent systemContent2 = systemContent;
                        o.LJIIIZ(msg, "msg");
                        C101323yK.LIZIZ(null, msg, systemContent2, this.LLIIIL, this.LLFZ, C1EU.LIZ(this.itemView, "itemView.context", R.attr.go), 0, true, null);
                        if (systemContent2 instanceof GroupSystemContent) {
                            Keva kevaRepo = C105004Ae.LIZ();
                            o.LJIIIIZZ(kevaRepo, "kevaRepo");
                        }
                    }
                };
            case 20:
                return new AnonymousClass480(itemView, this);
            case 21:
                return new AnonymousClass480(itemView, this) { // from class: X.482
                    @Override // X.AbstractC1041546x
                    public final boolean V(C109544Rq msg) {
                        o.LJIIIZ(msg, "msg");
                        return C93793mB.LJIIL(msg);
                    }

                    @Override // X.AnonymousClass480, X.AbstractC1041546x
                    public final boolean X(C109544Rq c109544Rq) {
                        return C93793mB.LJIIL(c109544Rq);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "messageType");
                    }

                    @Override // X.AnonymousClass480
                    public final void s0(boolean z, C49V backgroundConfig) {
                        int i;
                        o.LJIIIZ(backgroundConfig, "backgroundConfig");
                        C4AH c4ah = backgroundConfig.LIZ;
                        if (c4ah != null) {
                            AppCompatImageView appCompatImageView = this.LLIIZ;
                            if (appCompatImageView != null) {
                                if (z) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                appCompatImageView.setVisibility(i);
                            }
                            View view = this.LLIIIZ;
                            if (view == null) {
                                return;
                            }
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            view.setBackground(new C80862VoQ(context, c4ah, this.LLIIZ));
                            return;
                        }
                        super.s0(z, backgroundConfig);
                    }

                    @Override // X.AnonymousClass480
                    public final C49V t0(boolean z, boolean z2, boolean z3) {
                        boolean z4;
                        C48E c48e;
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        if (z && !z3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean LIZ = C90193gN.LIZ();
                        C4AH LIZ2 = C49W.LIZ(true, z4, LIZ);
                        if (z2) {
                            if (LIZ) {
                                LIZ2 = C4AH.L(LIZ2, 7);
                            } else {
                                LIZ2 = C4AH.L(LIZ2, 11);
                            }
                        }
                        Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZ, context);
                        if (LJI != null) {
                            c48e = new C48E(LJI.intValue());
                        } else {
                            c48e = null;
                        }
                        return new C49V(LIZ2, C1042447g.LJLIL, c48e);
                    }

                    @Override // X.AnonymousClass480, X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        o.LJIIIZ(msg, "msg");
                        super.N(c49v, msg, c109544Rq, c109544Rq2);
                        if (!v0()) {
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            Integer LJI = C79045V0n.LJI(C49R.LIZ.LIZIZ, context);
                            if (LJI != null) {
                                this.LLIIJLIL.setTextColor(LJI.intValue());
                            }
                        }
                    }
                };
            case 22:
            case 23:
                return new C4AO(itemView, this);
            case 24:
            case 25:
                return new C4JU(itemView, this);
            case 26:
                return new AnonymousClass465(itemView, this, false, null, null);
            case 27:
                return new C45J(itemView, this);
            case 28:
            case 29:
                return new AbstractC1048549p<ShareMusicContent>(itemView, this) { // from class: X.4Tq
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        v0(R.raw.icon_music_note_s_alt);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        ShareMusicContent shareMusicContent = (ShareMusicContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 17);
                        }
                        if (shareMusicContent != null) {
                            C13670gF LIZJ = C13670gF.LIZJ();
                            this.LLIILZL.setText(shareMusicContent.getMusicName());
                            this.LLIIZ.setVisibility(0);
                            this.LLIIZ.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.t5, shareMusicContent.getUserCount(), LIZJ.LJFF(C7C7.LIZ(shareMusicContent.getUserCount()))));
                            t0("ShareMusicMultiReceiveViewHolder", shareMusicContent.getAwemeCoverList(), s0().LIZ);
                        }
                    }
                };
            case 30:
            case 31:
                return new C4A4<ShareMusicContent>(itemView, this) { // from class: X.4Tp
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        x0(R.raw.icon_2pt_music_note, ((Boolean) C221108m2.LIZIZ(C110094Tt.LJLIL).getValue()).booleanValue());
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        ShareMusicContent shareMusicContent = (ShareMusicContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 17);
                        }
                        if (shareMusicContent != null) {
                            C13670gF LIZJ = C13670gF.LIZJ();
                            this.LLIILZL.setText(shareMusicContent.getMusicName());
                            this.LLIIZ.setVisibility(0);
                            this.LLIIZ.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.t5, shareMusicContent.getUserCount(), LIZJ.LJFF(C7C7.LIZ(shareMusicContent.getUserCount()))));
                            this.LLIL.setText(R.string.h7a);
                            v0(shareMusicContent.getCoverThumb(), "ShareMusicSimpleReceiveViewHolder", null);
                        }
                    }
                };
            case 32:
            case 33:
                return new AbstractC1048549p<ShareQnAContent>(itemView, this) { // from class: X.4Tm
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        v0(R.raw.icon_qa_ltr);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        String str;
                        int i2;
                        long j;
                        ShareQnAContent shareQnAContent = (ShareQnAContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 49);
                        }
                        C13670gF LIZJ = C13670gF.LIZJ();
                        TuxTextView tuxTextView = this.LLIILZL;
                        List<UrlModel> list = null;
                        if (shareQnAContent != null) {
                            str = shareQnAContent.getQuestionName();
                        } else {
                            str = null;
                        }
                        tuxTextView.setText(str);
                        this.LLIIZ.setVisibility(0);
                        TuxTextView tuxTextView2 = this.LLIIZ;
                        Resources resources = this.itemView.getContext().getResources();
                        if (shareQnAContent != null) {
                            i2 = shareQnAContent.getUserCount();
                        } else {
                            i2 = 0;
                        }
                        Object[] objArr = new Object[1];
                        if (shareQnAContent != null) {
                            j = shareQnAContent.getUserCount();
                        } else {
                            j = 0;
                        }
                        objArr[0] = LIZJ.LJFF(C7C7.LIZ(j));
                        tuxTextView2.setText(resources.getQuantityString(R.plurals.t5, i2, objArr));
                        if (shareQnAContent != null) {
                            list = shareQnAContent.getAwemeCoverList();
                        }
                        t0("ShareQnAMultiReceiveViewHolder", list, s0().LIZ);
                    }
                };
            case 34:
            case 35:
                return new C4A4<ShareQnAContent>(itemView, this) { // from class: X.4Tr
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        w0(R.raw.icon_2pt_qa_ltr);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        String str;
                        int i2;
                        long j;
                        ShareQnAContent shareQnAContent = (ShareQnAContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 49);
                        }
                        C13670gF LIZJ = C13670gF.LIZJ();
                        TuxTextView tuxTextView = this.LLIILZL;
                        if (shareQnAContent != null) {
                            str = shareQnAContent.getQuestionName();
                        } else {
                            str = null;
                        }
                        tuxTextView.setText(str);
                        this.LLIIZ.setVisibility(0);
                        TuxTextView tuxTextView2 = this.LLIIZ;
                        Resources resources = this.itemView.getContext().getResources();
                        if (shareQnAContent != null) {
                            i2 = shareQnAContent.getUserCount();
                        } else {
                            i2 = 0;
                        }
                        Object[] objArr = new Object[1];
                        if (shareQnAContent != null) {
                            j = shareQnAContent.getUserCount();
                        } else {
                            j = 0;
                        }
                        objArr[0] = LIZJ.LJFF(C7C7.LIZ(j));
                        tuxTextView2.setText(resources.getQuantityString(R.plurals.t5, i2, objArr));
                    }
                };
            case 36:
            case 37:
                return new AnonymousClass460<ShareLiveEventContent>(itemView, this) { // from class: X.4AC
                    public final View LLIIIL;
                    public final SmartAvatarImageView LLIIIZ;
                    public final TuxTextView LLIIJI;
                    public final TuxTextView LLIIJLIL;
                    public final TuxTextView LLIIL;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        View findViewById = itemView.findViewById(R.id.btt);
                        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
                        this.LLIIIL = findViewById;
                        View findViewById2 = itemView.findViewById(R.id.d0f);
                        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.event_name_tv)");
                        this.LLIIJI = (TuxTextView) findViewById2;
                        View findViewById3 = itemView.findViewById(R.id.d08);
                        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.event_avatar_iv)");
                        this.LLIIIZ = (SmartAvatarImageView) findViewById3;
                        View findViewById4 = itemView.findViewById(R.id.d0g);
                        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.event_start_time_tv)");
                        this.LLIIJLIL = (TuxTextView) findViewById4;
                        View findViewById5 = itemView.findViewById(R.id.d0b);
                        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.event_hoster_tv)");
                        this.LLIIL = (TuxTextView) findViewById5;
                        o.LJIIIIZZ(itemView.findViewById(R.id.l0i), "itemView.findViewById(R.id.tag_tv)");
                    }

                    @Override // X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        o.LJIIIZ(msg, "msg");
                        View view = this.LLIIIL;
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        C77413UZt.LJFF(gradientDrawable, c49v);
                        view.setBackground(gradientDrawable);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
                    @Override // X.AnonymousClass460
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void p0(X.C109544Rq r6, X.C109544Rq r7, com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent r8, int r9) {
                        /*
                            r5 = this;
                            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent r8 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent) r8
                            java.lang.String r0 = "msg"
                            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
                            X.470 r2 = r5.LJLJJI
                            if (r2 == 0) goto L16
                            r0 = 45
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                            r0 = 50331648(0x3000000, float:3.761582E-37)
                            r2.LIZIZ(r0, r1)
                        L16:
                            X.470 r1 = r5.LJLJJI
                            r4 = 150994945(0x9000001, float:1.5407441E-33)
                            if (r1 == 0) goto L22
                            java.lang.Boolean r0 = java.lang.Boolean.FALSE
                            r1.LIZIZ(r4, r0)
                        L22:
                            r3 = 0
                            if (r8 == 0) goto Lf1
                            java.lang.String r0 = r8.getLinkUrl()
                            if (r0 == 0) goto Lf1
                            java.lang.String r0 = java.net.URLDecoder.decode(r0)
                            if (r0 == 0) goto Lf1
                            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                            java.lang.String r0 = "Uri.parse(this)"
                            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                        L3a:
                            boolean r2 = X.C79045V0n.LJIILIIL(r1)
                            if (r8 == 0) goto Lee
                            java.lang.String r1 = r8.getEventId()
                        L44:
                            java.lang.String r0 = "show"
                            X.C1042547h.LIZIZ(r1, r0, r2)
                            X.4AE r1 = X.C4AE.LIZ
                            if (r8 == 0) goto Leb
                            java.lang.String r0 = r8.getLinkUrl()
                        L51:
                            boolean r0 = X.C4AE.LIZIZ(r1, r0)
                            if (r0 != 0) goto L65
                            X.4AF r1 = X.C4AF.LIZ
                            if (r8 == 0) goto Le8
                            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.getOrganizerAvatar()
                        L5f:
                            boolean r0 = X.C4AF.LJ(r1, r0)
                            if (r0 == 0) goto L85
                        L65:
                            X.470 r1 = r5.LJLJJI
                            if (r1 == 0) goto L6e
                            java.lang.Boolean r0 = java.lang.Boolean.TRUE
                            r1.LIZIZ(r4, r0)
                        L6e:
                            com.bytedance.tux.input.TuxTextView r1 = r5.LLIIJI
                            r0 = 2131831848(0x7f112c28, float:1.9296733E38)
                            r1.setText(r0)
                            r0 = 2131233385(0x7f080a69, float:1.8082906E38)
                            X.W5F r1 = X.W5U.LJ(r0)
                            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r0 = r5.LLIIIZ
                            r1.LJJIIJ = r0
                            X.C16880lQ.LLJJJ(r1)
                        L84:
                            return
                        L85:
                            com.bytedance.tux.input.TuxTextView r1 = r5.LLIIJI
                            if (r8 == 0) goto L9c
                            java.lang.String r0 = r8.getTitle()
                        L8d:
                            r1.setText(r0)
                            com.bytedance.tux.input.TuxTextView r2 = r5.LLIIJLIL
                            if (r8 == 0) goto La3
                            java.lang.String r0 = r8.getStartTime()
                            if (r0 == 0) goto La3
                            goto L9e
                        L9c:
                            r0 = r3
                            goto L8d
                        L9e:
                            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> La3
                            goto La5
                        La3:
                            r0 = 0
                        La5:
                            java.lang.String r0 = X.C86036Xpg.LJFF(r0)
                            r2.setText(r0)
                            com.bytedance.tux.input.TuxTextView r1 = r5.LLIIL
                            if (r8 == 0) goto Le6
                            java.lang.String r0 = r8.getOrganizerName()
                        Lb4:
                            r1.setText(r0)
                            if (r8 == 0) goto Le4
                            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.getOrganizerAvatar()
                        Lbd:
                            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r0)
                            X.W5F r1 = X.W5U.LJII(r0)
                            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r0 = r5.LLIIIZ
                            r1.LJJIIJ = r0
                            X.C16880lQ.LLJJJ(r1)
                            android.view.View r0 = r5.itemView
                            android.content.Context r2 = r0.getContext()
                            if (r8 == 0) goto Le2
                            java.lang.String r1 = r8.getOrganizerVerifyReason()
                            java.lang.String r3 = r8.getOrganizerEnterprise()
                        Ldc:
                            com.bytedance.tux.input.TuxTextView r0 = r5.LLIIL
                            X.AJ9.LJ(r2, r1, r3, r0)
                            goto L84
                        Le2:
                            r1 = r3
                            goto Ldc
                        Le4:
                            r0 = r3
                            goto Lbd
                        Le6:
                            r0 = r3
                            goto Lb4
                        Le8:
                            r0 = r3
                            goto L5f
                        Leb:
                            r0 = r3
                            goto L51
                        Lee:
                            r1 = r3
                            goto L44
                        Lf1:
                            r1 = r3
                            goto L3a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C4AC.p0(X.4Rq, X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int):void");
                    }
                };
            case 38:
            case 39:
                return new AbstractC1048549p<ShareChallengeContent>(itemView, this) { // from class: X.4Tn
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        v0(R.raw.icon_number);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
                    
                        if (X.C76800UCe.LIZ == null) goto L14;
                     */
                    @Override // X.AnonymousClass460
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void p0(X.C109544Rq r10, X.C109544Rq r11, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r12, int r13) {
                        /*
                            r9 = this;
                            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent r12 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent) r12
                            java.lang.String r0 = "msg"
                            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
                            X.470 r2 = r9.LJLJJI
                            if (r2 == 0) goto L16
                            r0 = 18
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                            r0 = 50331648(0x3000000, float:3.761582E-37)
                            r2.LIZIZ(r0, r1)
                        L16:
                            com.bytedance.tux.input.TuxTextView r1 = r9.LLIILZL
                            r3 = 0
                            if (r12 == 0) goto L83
                            java.lang.String r0 = r12.getTitle()
                        L1f:
                            r1.setText(r0)
                            if (r12 == 0) goto L6b
                            long r0 = r12.getUserCount()
                            java.lang.Long r2 = java.lang.Long.valueOf(r0)
                            long r7 = r2.longValue()
                            r4 = 0
                            r6 = 0
                            r1 = 1
                            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                            if (r0 < 0) goto L6b
                            long r7 = r2.longValue()
                            com.bytedance.tux.input.TuxTextView r5 = r9.LLIIZ
                            android.view.View r0 = r9.itemView
                            android.content.Context r0 = r0.getContext()
                            android.content.res.Resources r4 = r0.getResources()
                            java.lang.Object[] r2 = new java.lang.Object[r1]
                            X.0gF r1 = X.C13670gF.LIZJ()
                            java.lang.String r0 = X.C7C7.LIZ(r7)
                            java.lang.String r0 = r1.LJFF(r0)
                            r2[r6] = r0
                            r0 = 2131831298(0x7f112a02, float:1.9295618E38)
                            java.lang.String r0 = r4.getString(r0, r2)
                            r5.setText(r0)
                            com.bytedance.tux.input.TuxTextView r0 = r9.LLIIZ
                            r0.setVisibility(r6)
                            X.UCe r0 = X.C76800UCe.LIZ
                            if (r0 != 0) goto L71
                        L6b:
                            com.bytedance.tux.input.TuxTextView r1 = r9.LLIIZ
                            r0 = 4
                            r1.setVisibility(r0)
                        L71:
                            if (r12 == 0) goto L77
                            java.util.List r3 = r12.getCoverUrl()
                        L77:
                            X.49w r0 = r9.s0()
                            android.graphics.drawable.Drawable r1 = r0.LIZ
                            java.lang.String r0 = "ShareChallengeViewHolder"
                            r9.t0(r0, r3, r1)
                            return
                        L83:
                            r0 = r3
                            goto L1f
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C110034Tn.p0(X.4Rq, X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int):void");
                    }
                };
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
            case 41:
                return new C4A4<ShareChallengeContent>(itemView, this) { // from class: X.4To
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        w0(R.raw.icon_2pt_number);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        String str;
                        long j;
                        Boolean bool;
                        ShareChallengeContent shareChallengeContent = (ShareChallengeContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 18);
                        }
                        AnonymousClass470 anonymousClass4702 = this.LJLJJI;
                        if (anonymousClass4702 != null) {
                            if (shareChallengeContent != null) {
                                bool = Boolean.valueOf(shareChallengeContent.isCommerce());
                            } else {
                                bool = null;
                            }
                            anonymousClass4702.LIZIZ(50331649, bool);
                        }
                        TuxTextView tuxTextView = this.LLIILZL;
                        if (shareChallengeContent == null || (str = shareChallengeContent.getTitle()) == null) {
                            str = "";
                        }
                        tuxTextView.setText(str);
                        this.LLIIZ.setVisibility(0);
                        TuxTextView tuxTextView2 = this.LLIIZ;
                        String string = this.itemView.getContext().getResources().getString(R.string.h4p);
                        o.LJIIIIZZ(string, "itemView.context.resourc….im_challenge_user_count)");
                        Object[] objArr = new Object[1];
                        if (shareChallengeContent != null) {
                            j = shareChallengeContent.getUserCount();
                        } else {
                            j = 0;
                        }
                        objArr[0] = C7C7.LIZ(j);
                        C025908h.LJ(objArr, 1, string, "format(format, *args)", tuxTextView2);
                        this.LLIL.setText(R.string.h4o);
                    }
                };
            case 42:
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return new C88373dR(itemView, this);
            case 44:
            case 45:
                return new C1043547r(itemView, this);
            case 46:
            case 47:
                return new C4A6<ShareWebContent>(itemView, this) { // from class: X.4A5
                    public final TuxIconView LLILL;
                    public final TuxIconView LLILLIZIL;

                    @Override // X.C4A4, X.AbstractC1041546x
                    public final void M() {
                        super.M();
                        float dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.tu);
                        TuxIconView tuxIconView = this.LLILL;
                        if (tuxIconView == null) {
                            return;
                        }
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZIZ = Integer.valueOf(t0().LIZIZ);
                        if (C1049149v.LIZ()) {
                            C17N.LJJJJZ(this.LLIIL, new float[]{dimensionPixelSize, 0.0f, 0.0f, dimensionPixelSize}, Integer.valueOf(t0().LIZ));
                            c110614Vt.LJIIIIZZ = Float.valueOf(dimensionPixelSize);
                            c110614Vt.LJIIJ = Float.valueOf(dimensionPixelSize);
                        } else {
                            C17N.LJJJJZ(this.LLIIL, new float[]{0.0f, dimensionPixelSize, dimensionPixelSize, 0.0f}, Integer.valueOf(t0().LIZ));
                            c110614Vt.LJIIIZ = Float.valueOf(dimensionPixelSize);
                            c110614Vt.LJIIJJI = Float.valueOf(dimensionPixelSize);
                        }
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        tuxIconView.setBackground(c110614Vt.LIZ(context));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        this.LLILL = (TuxIconView) itemView.findViewById(R.id.ecx);
                        this.LLILLIZIL = (TuxIconView) itemView.findViewById(R.id.ecw);
                    }

                    @Override // X.C4A4, X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        TuxIconView tuxIconView;
                        C99033ud c99033ud;
                        float[] fArr;
                        o.LJIIIZ(msg, "msg");
                        super.N(c49v, msg, c109544Rq, c109544Rq2);
                        C4AH c4ah = c49v.LIZ;
                        if (c4ah != null && (tuxIconView = this.LLILL) != null && (c99033ud = this.LJLLL) != null && c99033ud.isHighRiskConversation()) {
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            float f = c4ah.LJLIL;
                            float f2 = c4ah.LJLJJI;
                            if (C90193gN.LIZ()) {
                                fArr = new float[]{0.0f, 0.0f, f, f, f2, f2, 0.0f, 0.0f};
                            } else {
                                fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
                            }
                            gradientDrawable.setCornerRadii(fArr);
                            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.ee);
                            if (LIZIZ != null) {
                                gradientDrawable.setColor(LIZIZ.intValue());
                            }
                            tuxIconView.setBackground(gradientDrawable);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
                    @Override // X.C4A6, X.AnonymousClass460
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void p0(X.C109544Rq r10, X.C109544Rq r11, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r12, int r13) {
                        /*
                            Method dump skipped, instructions count: 310
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C4A5.p0(X.4Rq, X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int):void");
                    }
                };
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
            case C61447O9r.LJIIJ:
                return new AbstractC1041546x(itemView, this) { // from class: X.4AG
                    public final TuxTextView LLIIIILZ;

                    @Override // X.AbstractC1041546x
                    public final void h0(C109544Rq c109544Rq) {
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        View findViewById = itemView.findViewById(R.id.lao);
                        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.title_tv)");
                        this.LLIIIILZ = (TuxTextView) findViewById;
                    }

                    @Override // X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        AnonymousClass470 anonymousClass470;
                        View view;
                        o.LJIIIZ(msg, "msg");
                        C4AH c4ah = c49v.LIZ;
                        if (c4ah == null || (anonymousClass470 = this.LJLJJI) == null || (view = anonymousClass470.LIZ) == null) {
                            return;
                        }
                        view.setBackground(new YAT(C32151Nz.LJIIZILJ(Double.valueOf(0.5d)), C32151Nz.LJIIZILJ(4), C32151Nz.LJIIZILJ(2), -3355444, c4ah.LJLIL, c4ah.LJLILLLLZI, c4ah.LJLJJI, c4ah.LJLJI));
                    }

                    @Override // X.AbstractC1041546x
                    public final void P(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2, int i) {
                        o.LJIIIZ(msg, "msg");
                        super.P(msg, c109544Rq, c109544Rq2, i);
                        C1DG.LJI(this.itemView, R.string.h0t, this.LLIIIILZ);
                    }
                };
            case 50:
            case 51:
                return new C4A6<ShareSearchContent>(itemView, this) { // from class: X.4AB
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                    }

                    @Override // X.C4A6, X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        ShareSearchContent shareSearchContent = (ShareSearchContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        super.p0(msg, c109544Rq, shareSearchContent, i);
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 47);
                        }
                        if (shareSearchContent == null) {
                            return;
                        }
                        C4AF c4af = C4AF.LIZ;
                        if (C4AF.LIZLLL(c4af, shareSearchContent.getImage()) || C4AF.LIZLLL(c4af, shareSearchContent.getUrl()) || C4AE.LIZIZ(C4AE.LIZ, shareSearchContent.getSchema())) {
                            z0();
                            return;
                        }
                        this.LLIILZL.setText(shareSearchContent.getTitle());
                        this.LLIIZ.setVisibility(0);
                        if (shareSearchContent.getDesc() != null && !TextUtils.isEmpty(shareSearchContent.getDesc())) {
                            this.LLIIZ.setText(shareSearchContent.getDesc());
                            this.LLIIZ.setVisibility(0);
                        } else {
                            this.LLIIZ.setVisibility(8);
                        }
                        this.LLIL.setText(R.string.h_q);
                        v0(C4AS.LJIIJ(shareSearchContent.getImage()), "ShareSearchReceiveViewHolder", null);
                    }
                };
            case 52:
            case 53:
                return new C4RJ(itemView, this);
            case 54:
            case 55:
                return new AbstractC1048549p<ShareCompilationContent>(itemView, this) { // from class: X.4KB
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                        v0(R.raw.icon_playlist);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        ShareCompilationContent shareCompilationContent = (ShareCompilationContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 38);
                        }
                        if (shareCompilationContent != null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(this.itemView.getContext().getString(R.string.jsw));
                            LIZ.append(" • ");
                            LIZ.append(shareCompilationContent.getTitle());
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            TuxTextView tuxTextView = this.LLIILZL;
                            C116724i4 c116724i4 = new C116724i4();
                            c116724i4.LIZIZ(LIZIZ);
                            tuxTextView.setText(c116724i4.LIZ);
                            this.LLIIZ.setVisibility(0);
                            this.LLIIZ.setText(this.itemView.getContext().getString(R.string.jtt, shareCompilationContent.getAuthorName()));
                            t0("ShareCompilationViewHolder", shareCompilationContent.getAwemeCoverList(), s0().LIZ);
                        }
                    }
                };
            case 56:
            case 57:
                return new C4A4<ShareCompilationContent>(itemView, this) { // from class: X.4KC
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                        w0(R.raw.icon_2pt_playlist);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        ShareCompilationContent shareCompilationContent = (ShareCompilationContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 38);
                        }
                        if (shareCompilationContent != null) {
                            this.LLIILZL.setText(" ");
                            this.LLIILZL.measure(0, 0);
                            int measuredHeight = this.LLIILZL.getMeasuredHeight();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(this.itemView.getContext().getString(R.string.jsw));
                            LIZ.append(" • ");
                            LIZ.append(shareCompilationContent.getTitle());
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            TuxTextView tuxTextView = this.LLIILZL;
                            C116724i4 c116724i4 = new C116724i4();
                            c116724i4.LIZIZ(LIZIZ);
                            tuxTextView.setText(c116724i4.LIZ);
                            this.LLIILZL.post(new ARunnableS5S0101000_1(this, measuredHeight, 14));
                            this.LLIIZ.setVisibility(0);
                            this.LLIIZ.setText(this.itemView.getContext().getString(R.string.jtt, shareCompilationContent.getAuthorName()));
                        }
                        this.LLIL.setText(R.string.ds7);
                    }
                };
            case 58:
            case 59:
                return new AbstractC1048549p<ShareEffectContent>(itemView, this) { // from class: X.4Tl
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                        v0(R.raw.icon_effect);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        long j;
                        ShareEffectContent shareEffectContent = (ShareEffectContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 39);
                        }
                        if (shareEffectContent != null) {
                            C13670gF LIZJ = C13670gF.LIZJ();
                            this.LLIILZL.setText(shareEffectContent.getTitle());
                            TuxTextView tuxTextView = this.LLIIZ;
                            Resources resources = this.itemView.getContext().getResources();
                            Object[] objArr = new Object[1];
                            Long userCount = shareEffectContent.getUserCount();
                            if (userCount != null) {
                                j = userCount.longValue();
                            } else {
                                j = 0;
                            }
                            objArr[0] = LIZJ.LJFF(C7C7.LIZ(j));
                            tuxTextView.setText(resources.getString(R.string.drb, objArr));
                            this.LLIIZ.setVisibility(0);
                            t0("ShareStickerViewHolder", shareEffectContent.getAwemeCoverList(), s0().LIZ);
                        }
                    }
                };
            case 60:
            case 61:
                return new C4A4<ShareEffectContent>(itemView, this) { // from class: X.4Tk
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                        x0(R.raw.icon_2pt_effect, ((Boolean) C221108m2.LIZIZ(C110084Ts.LJLIL).getValue()).booleanValue());
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        long j;
                        ShareEffectContent shareEffectContent = (ShareEffectContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        if (shareEffectContent != null) {
                            this.LLIILZL.setText(shareEffectContent.getTitle());
                            this.LLIIZ.setVisibility(0);
                            TuxTextView tuxTextView = this.LLIIZ;
                            Resources resources = this.itemView.getContext().getResources();
                            Object[] objArr = new Object[1];
                            Long userCount = shareEffectContent.getUserCount();
                            if (userCount != null) {
                                j = userCount.longValue();
                            } else {
                                j = 0;
                            }
                            objArr[0] = C7C7.LIZ(j);
                            tuxTextView.setText(resources.getString(R.string.drb, objArr));
                            v0(shareEffectContent.getCover(), "ShareStickerSimpleViewHolder", null);
                        }
                        this.LLIL.setText(R.string.rom);
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 39);
                        }
                    }
                };
            case BaseNotice.CREATOR /* 62 */:
                return new C111924aK(itemView, this);
            case 63:
                return new AnonymousClass460<GroupGreetingContent>(itemView, this) { // from class: X.4J9
                    public final List<C4JA> LLIIIL;
                    public final C62822Ol8 LLIIIZ;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        this.LLIIIL = new ArrayList();
                        this.LLIIIZ = C221108m2.LIZIZ(C4JB.LJLIL);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, GroupGreetingContent groupGreetingContent, int i) {
                        List<IMUser> userList;
                        GroupGreetingContent groupGreetingContent2 = groupGreetingContent;
                        o.LJIIIZ(msg, "msg");
                        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(0, this.LJLJI, 0, 0);
                        this.itemView.setLayoutParams(marginLayoutParams);
                        ((ArrayList) this.LLIIIL).clear();
                        ((RecyclerView) this.itemView.findViewById(R.id.dz0)).setAdapter((AbstractC029409q) this.LLIIIZ.getValue());
                        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.dz0);
                        this.itemView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                        if (groupGreetingContent2 != null && (userList = groupGreetingContent2.getUserList()) != null) {
                            if (userList.size() > 6) {
                                List<C4JA> list = this.LLIIIL;
                                List<IMUser> subList = userList.subList(0, 6);
                                ArrayList arrayList = new ArrayList(C32I.LJJL(subList, 10));
                                Iterator<IMUser> it = subList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C4JA(0, it.next()));
                                }
                                ((ArrayList) list).addAll(ORZ.LLIIJI(new C4JA(userList.size() - 6, null), arrayList));
                            } else {
                                List<C4JA> list2 = this.LLIIIL;
                                ArrayList arrayList2 = new ArrayList(C32I.LJJL(userList, 10));
                                Iterator<IMUser> it2 = userList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new C4JA(0, it2.next()));
                                }
                                ((ArrayList) list2).addAll(arrayList2);
                            }
                        }
                        ((C4II) this.LLIIIZ.getValue()).setShowFooter(false);
                        ((C8HS) this.LLIIIZ.getValue()).setData(this.LLIIIL);
                    }
                };
            case 64:
            case 65:
                return new AnonymousClass460<GroupInviteCardContent>(itemView, this) { // from class: X.4A3
                    public final View LLIIIL;
                    public final C72433Sbl LLIIIZ;
                    public final TextView LLIIJI;
                    public final TextView LLIIJLIL;
                    public final C62822Ol8 LLIIL;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        this.LLIIL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 815));
                        View findViewById = itemView.findViewById(R.id.btt);
                        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
                        this.LLIIIL = findViewById;
                        View findViewById2 = itemView.findViewById(R.id.ebu);
                        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon_iv)");
                        this.LLIIIZ = (C72433Sbl) findViewById2;
                        View findViewById3 = itemView.findViewById(R.id.lao);
                        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.title_tv)");
                        this.LLIIJI = (TextView) findViewById3;
                        View findViewById4 = itemView.findViewById(R.id.c7z);
                        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.desc_tv)");
                        this.LLIIJLIL = (TextView) findViewById4;
                    }

                    @Override // X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        o.LJIIIZ(msg, "msg");
                        View view = this.LLIIIL;
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        C77413UZt.LJFF(gradientDrawable, c49v);
                        view.setBackground(gradientDrawable);
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, GroupInviteCardContent groupInviteCardContent, int i) {
                        UrlModel urlModel;
                        String str;
                        String avatarUrl;
                        GroupInviteCardContent groupInviteCardContent2 = groupInviteCardContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 46);
                        }
                        if (groupInviteCardContent2 != null) {
                            C72433Sbl c72433Sbl = this.LLIIIZ;
                            GroupInfo group = groupInviteCardContent2.getGroup();
                            if (group != null && (avatarUrl = group.getAvatarUrl()) != null) {
                                urlModel = C4AS.LJIIJ(avatarUrl);
                            } else {
                                urlModel = null;
                            }
                            C1048849s.LIZ(c72433Sbl, urlModel, "GroupInviteCardViewHolder", (Drawable) this.LLIIL.getValue());
                            this.LLIIJI.setText(EF7.LIZIZ().getString(R.string.gwq));
                            TextView textView = this.LLIIJLIL;
                            C116724i4 c116724i4 = new C116724i4();
                            GroupInfo group2 = groupInviteCardContent2.getGroup();
                            if (group2 == null || (str = group2.getName()) == null) {
                                str = "";
                            }
                            c116724i4.LIZIZ(str);
                            textView.setText(c116724i4.LIZ);
                        }
                    }
                };
            case 66:
                return new AnonymousClass460<BrandInvitationContent>(itemView, this) { // from class: X.4aJ
                    public final String LLIIIL;
                    public final TuxIconView LLIIIZ;
                    public final TuxTextView LLIIJI;
                    public final C62846OlW LLIIJLIL;
                    public final TuxTextView LLIIL;
                    public final LinearLayout LLIILII;
                    public final C62822Ol8 LLIILZL;

                    @Override // X.AbstractC1041546x
                    public final boolean Y() {
                        return true;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        this.LLIIIL = "BrandInvitationCardViewHolder";
                        this.LLIILZL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 809));
                        View findViewById = this.itemView.findViewById(R.id.ef_);
                        o.LJIIIIZZ(findViewById, "this.itemView.findViewById(R.id.im_msg_card_icon)");
                        this.LLIIIZ = (TuxIconView) findViewById;
                        View findViewById2 = this.itemView.findViewById(R.id.eff);
                        o.LJIIIIZZ(findViewById2, "this.itemView.findViewById(R.id.im_msg_card_title)");
                        this.LLIIJI = (TuxTextView) findViewById2;
                        View findViewById3 = this.itemView.findViewById(R.id.ef8);
                        o.LJIIIIZZ(findViewById3, "this.itemView.findViewBy…_msg_card_business_image)");
                        this.LLIIJLIL = (C62846OlW) findViewById3;
                        View findViewById4 = this.itemView.findViewById(R.id.ef6);
                        o.LJIIIIZZ(findViewById4, "this.itemView.findViewBy….im_msg_campaign_message)");
                        this.LLIIL = (TuxTextView) findViewById4;
                        View findViewById5 = this.itemView.findViewById(R.id.efa);
                        o.LJIIIIZZ(findViewById5, "this.itemView.findViewBy…_msg_card_info_container)");
                        this.LLIILII = (LinearLayout) findViewById5;
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BrandInvitationContent brandInvitationContent, int i) {
                        String str;
                        List<NamedValue> infos;
                        AnonymousClass470 anonymousClass470;
                        MessageTitle title;
                        BrandInvitationContent brandInvitationContent2 = brandInvitationContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass4702 = this.LJLJJI;
                        if (anonymousClass4702 != null) {
                            anonymousClass4702.LIZIZ(50331648, 52);
                        }
                        TuxIconView tuxIconView = this.LLIIIZ;
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_dollar_sign;
                        c2068389v.LJ = Integer.valueOf(R.attr.go);
                        tuxIconView.setTuxIcon(c2068389v);
                        if (brandInvitationContent2 != null) {
                            TuxTextView tuxTextView = this.LLIIL;
                            TextInfo textInfo = brandInvitationContent2.getTextInfo();
                            if (textInfo == null || (title = textInfo.getTitle()) == null || (str = title.getTitle()) == null) {
                                str = "";
                            }
                            tuxTextView.setText(str);
                            LinkInfo linkInfo = brandInvitationContent2.getLinkInfo();
                            if (linkInfo != null && (anonymousClass470 = this.LJLJJI) != null) {
                                anonymousClass470.LIZ(new ACListenerS36S0200000_1(this, linkInfo, 26));
                            }
                            VideoInfo videoInfo = brandInvitationContent2.getVideoInfo();
                            if (videoInfo == null) {
                                this.LLIIJLIL.setVisibility(8);
                            } else {
                                this.LLIIJLIL.setVisibility(0);
                                C1048849s.LIZ(this.LLIIJLIL, videoInfo.getCover(), this.LLIIIL, (Drawable) this.LLIILZL.getValue());
                            }
                            this.LLIILII.removeAllViews();
                            TextInfo textInfo2 = brandInvitationContent2.getTextInfo();
                            if (textInfo2 != null && (infos = textInfo2.getInfos()) != null) {
                                Iterator<NamedValue> it = infos.iterator();
                                while (it.hasNext()) {
                                    C43132GwK.LIZ(it.next(), this.LLIILII);
                                }
                            }
                            Title title2 = brandInvitationContent2.getTitle();
                            if (title2 != null) {
                                this.LLIIJI.setText(title2.getTitle());
                            }
                        }
                    }
                };
            case 67:
                return new AnonymousClass460<BrandInvitationContent>(itemView, this) { // from class: X.4aJ
                    public final String LLIIIL;
                    public final TuxIconView LLIIIZ;
                    public final TuxTextView LLIIJI;
                    public final C62846OlW LLIIJLIL;
                    public final TuxTextView LLIIL;
                    public final LinearLayout LLIILII;
                    public final C62822Ol8 LLIILZL;

                    @Override // X.AbstractC1041546x
                    public final boolean Y() {
                        return true;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        this.LLIIIL = "BrandInvitationCardViewHolder";
                        this.LLIILZL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 809));
                        View findViewById = this.itemView.findViewById(R.id.ef_);
                        o.LJIIIIZZ(findViewById, "this.itemView.findViewById(R.id.im_msg_card_icon)");
                        this.LLIIIZ = (TuxIconView) findViewById;
                        View findViewById2 = this.itemView.findViewById(R.id.eff);
                        o.LJIIIIZZ(findViewById2, "this.itemView.findViewById(R.id.im_msg_card_title)");
                        this.LLIIJI = (TuxTextView) findViewById2;
                        View findViewById3 = this.itemView.findViewById(R.id.ef8);
                        o.LJIIIIZZ(findViewById3, "this.itemView.findViewBy…_msg_card_business_image)");
                        this.LLIIJLIL = (C62846OlW) findViewById3;
                        View findViewById4 = this.itemView.findViewById(R.id.ef6);
                        o.LJIIIIZZ(findViewById4, "this.itemView.findViewBy….im_msg_campaign_message)");
                        this.LLIIL = (TuxTextView) findViewById4;
                        View findViewById5 = this.itemView.findViewById(R.id.efa);
                        o.LJIIIIZZ(findViewById5, "this.itemView.findViewBy…_msg_card_info_container)");
                        this.LLIILII = (LinearLayout) findViewById5;
                    }

                    @Override // X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BrandInvitationContent brandInvitationContent, int i) {
                        String str;
                        List<NamedValue> infos;
                        AnonymousClass470 anonymousClass470;
                        MessageTitle title;
                        BrandInvitationContent brandInvitationContent2 = brandInvitationContent;
                        o.LJIIIZ(msg, "msg");
                        AnonymousClass470 anonymousClass4702 = this.LJLJJI;
                        if (anonymousClass4702 != null) {
                            anonymousClass4702.LIZIZ(50331648, 52);
                        }
                        TuxIconView tuxIconView = this.LLIIIZ;
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_dollar_sign;
                        c2068389v.LJ = Integer.valueOf(R.attr.go);
                        tuxIconView.setTuxIcon(c2068389v);
                        if (brandInvitationContent2 != null) {
                            TuxTextView tuxTextView = this.LLIIL;
                            TextInfo textInfo = brandInvitationContent2.getTextInfo();
                            if (textInfo == null || (title = textInfo.getTitle()) == null || (str = title.getTitle()) == null) {
                                str = "";
                            }
                            tuxTextView.setText(str);
                            LinkInfo linkInfo = brandInvitationContent2.getLinkInfo();
                            if (linkInfo != null && (anonymousClass470 = this.LJLJJI) != null) {
                                anonymousClass470.LIZ(new ACListenerS36S0200000_1(this, linkInfo, 26));
                            }
                            VideoInfo videoInfo = brandInvitationContent2.getVideoInfo();
                            if (videoInfo == null) {
                                this.LLIIJLIL.setVisibility(8);
                            } else {
                                this.LLIIJLIL.setVisibility(0);
                                C1048849s.LIZ(this.LLIIJLIL, videoInfo.getCover(), this.LLIIIL, (Drawable) this.LLIILZL.getValue());
                            }
                            this.LLIILII.removeAllViews();
                            TextInfo textInfo2 = brandInvitationContent2.getTextInfo();
                            if (textInfo2 != null && (infos = textInfo2.getInfos()) != null) {
                                Iterator<NamedValue> it = infos.iterator();
                                while (it.hasNext()) {
                                    C43132GwK.LIZ(it.next(), this.LLIILII);
                                }
                            }
                            Title title2 = brandInvitationContent2.getTitle();
                            if (title2 != null) {
                                this.LLIIJI.setText(title2.getTitle());
                            }
                        }
                    }
                };
            case 68:
            case 69:
                return new C107204Iq(itemView, this);
            case 70:
            case 71:
                return new C4A6<ShareSubscribeInviteContent>(itemView, this) { // from class: X.4AA
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                    }

                    @Override // X.C4A6, X.AnonymousClass460
                    public final void p0(C109544Rq msg, C109544Rq c109544Rq, BaseContent baseContent, int i) {
                        int i2;
                        boolean z;
                        ShareSubscribeInviteContent shareSubscribeInviteContent = (ShareSubscribeInviteContent) baseContent;
                        o.LJIIIZ(msg, "msg");
                        super.p0(msg, c109544Rq, shareSubscribeInviteContent, i);
                        if (shareSubscribeInviteContent == null) {
                            return;
                        }
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 56);
                        }
                        this.LLIILZL.setText(shareSubscribeInviteContent.getTitle());
                        if (shareSubscribeInviteContent.getDesc() != null) {
                            String desc = shareSubscribeInviteContent.getDesc();
                            o.LJI(desc);
                            int length = desc.length() - 1;
                            int i3 = 0;
                            boolean z2 = false;
                            while (i3 <= length) {
                                if (!z2) {
                                    i2 = i3;
                                } else {
                                    i2 = length;
                                }
                                if (o.LJIIJJI(desc.charAt(i2), 32) <= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z2) {
                                    if (!z) {
                                        z2 = true;
                                    } else {
                                        i3++;
                                    }
                                } else if (!z) {
                                    break;
                                } else {
                                    length--;
                                }
                            }
                            if (desc.subSequence(i3, length + 1).toString().length() > 0) {
                                this.LLIIZ.setText(shareSubscribeInviteContent.getDesc());
                                this.LLIIZ.setVisibility(0);
                                this.LLIL.setText(R.string.h_q);
                                v0(C4AS.LJIIJ(shareSubscribeInviteContent.getImage()), "ShareSubscribeInviteReceiveViewHolder", null);
                            }
                        }
                        this.LLIIZ.setVisibility(8);
                        this.LLIL.setText(R.string.h_q);
                        v0(C4AS.LJIIJ(shareSubscribeInviteContent.getImage()), "ShareSubscribeInviteReceiveViewHolder", null);
                    }
                };
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
            case 73:
                return new AnonymousClass461<ImageCardTemplate>(itemView, this) { // from class: X.49q
                    public final C113084cC LLIIIJ;
                    public final TuxIconView LLIIIL;
                    public final C62846OlW LLIIIZ;
                    public final TuxTextView LLIIJI;
                    public final TuxTextView LLIIJLIL;
                    public final SmartImageView LLIIL;
                    public final SmartImageView LLIILII;
                    public final SmartImageView LLIILZL;
                    public final C62822Ol8 LLIIZ;
                    public final C62822Ol8 LLIL;
                    public final C62822Ol8 LLILII;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                        this.LLIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 985));
                        this.LLIL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 984));
                        this.LLILII = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 986));
                        View findViewById = itemView.findViewById(R.id.ej7);
                        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.img_container)");
                        this.LLIIIJ = (C113084cC) findViewById;
                        View findViewById2 = itemView.findViewById(R.id.lao);
                        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.title_tv)");
                        this.LLIIJI = (TuxTextView) findViewById2;
                        View findViewById3 = itemView.findViewById(R.id.c7z);
                        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.desc_tv)");
                        this.LLIIJLIL = (TuxTextView) findViewById3;
                        View findViewById4 = itemView.findViewById(R.id.eir);
                        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.img1)");
                        this.LLIIL = (SmartImageView) findViewById4;
                        View findViewById5 = itemView.findViewById(R.id.eis);
                        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.img2)");
                        this.LLIILII = (SmartImageView) findViewById5;
                        View findViewById6 = itemView.findViewById(R.id.eit);
                        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.img3)");
                        this.LLIILZL = (SmartImageView) findViewById6;
                        View findViewById7 = itemView.findViewById(R.id.ecv);
                        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.icon_tux)");
                        TuxIconView tuxIconView = (TuxIconView) findViewById7;
                        this.LLIIIL = tuxIconView;
                        View findViewById8 = itemView.findViewById(R.id.ebu);
                        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.icon_iv)");
                        C62846OlW c62846OlW = (C62846OlW) findViewById8;
                        this.LLIIIZ = c62846OlW;
                        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                        tuxIconView.setTintColorRes(R.attr.go);
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LJFF = Integer.valueOf(R.attr.dz);
                        c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
                        Context context = tuxIconView.getContext();
                        o.LJIIIIZZ(context, "tuxIconView.context");
                        tuxIconView.setBackground(c110614Vt.LIZ(context));
                        c62846OlW.setVisibility(8);
                        tuxIconView.setVisibility(0);
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 101);
                        }
                    }

                    @Override // X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        C4AH c4ah;
                        o.LJIIIZ(msg, "msg");
                        C113084cC c113084cC = this.LLIIIJ;
                        C4AH c4ah2 = c49v.LIZ;
                        if (c4ah2 != null) {
                            c4ah = C4AH.L(c4ah2, 12);
                        } else {
                            c4ah = null;
                        }
                        c113084cC.setRoundingParams(c4ah);
                    }

                    @Override // X.AnonymousClass461
                    public final void m0(C109544Rq msg, C109544Rq c109544Rq, ImageCardTemplate imageCardTemplate, int i) {
                        List<String> list;
                        UrlModel LJJIIJ;
                        ImageCardTemplate imageCardTemplate2 = imageCardTemplate;
                        o.LJIIIZ(msg, "msg");
                        String str = imageCardTemplate2.titleBar.title.text;
                        if (str.length() == 0) {
                            str = C88913eJ.LIZ(this.itemView, R.string.ev4, "itemView.context.getStri…t_card_unavailable_title)");
                        }
                        TuxTextView tuxTextView = this.LLIIJI;
                        C116724i4 c116724i4 = new C116724i4();
                        c116724i4.LIZIZ(str);
                        tuxTextView.setText(c116724i4.LIZ);
                        if (imageCardTemplate2.titleBar.subtitle.text.length() == 0 && 1 != 0) {
                            this.LLIIJLIL.setVisibility(8);
                        } else {
                            this.LLIIJLIL.setText(imageCardTemplate2.titleBar.subtitle.text);
                            this.LLIIJLIL.setVisibility(0);
                        }
                        Drawable drawable = ((C1049249w) this.LLILII.getValue()).LIZ;
                        List<VideoCoverComponent> list2 = imageCardTemplate2.videoCoversComponentList;
                        ArrayList arrayList = new ArrayList();
                        Iterator<VideoCoverComponent> it = list2.iterator();
                        while (it.hasNext()) {
                            ImageComponent imageComponent = it.next().coverImage;
                            if (imageComponent != null && (list = imageComponent.urls) != null && (LJJIIJ = C78934UyQ.LJJIIJ(list)) != null) {
                                arrayList.add(LJJIIJ);
                            }
                        }
                        if (drawable == null) {
                            W5F LJII = W5U.LJII(C78939UyV.LJ((UrlModel) ORZ.LJLLLLLL(0, arrayList)));
                            LJII.LJJIIJ = this.LLIIL;
                            C43659HBn.LJIJ(LJII, i0.LJFF("ImageCardMultiReceiveViewHolder", ":img1"), false, null, 6);
                            W5F LJII2 = W5U.LJII(C78939UyV.LJ((UrlModel) ORZ.LJLLLLLL(1, arrayList)));
                            LJII2.LJJIIJ = this.LLIILII;
                            C43659HBn.LJIJ(LJII2, i0.LJFF("ImageCardMultiReceiveViewHolder", ":img2"), false, null, 6);
                            W5F LJII3 = W5U.LJII(C78939UyV.LJ((UrlModel) ORZ.LJLLLLLL(2, arrayList)));
                            LJII3.LJJIIJ = this.LLIILZL;
                            C43659HBn.LJIJ(LJII3, i0.LJFF("ImageCardMultiReceiveViewHolder", ":img3"), false, null, 6);
                        } else {
                            W5F LJII4 = W5U.LJII(C78939UyV.LJ((UrlModel) ORZ.LJLLLLLL(0, arrayList)));
                            LJII4.LJJIIJ = this.LLIIL;
                            LJII4.LJIILIIL = drawable;
                            LJII4.LJIILLIIL = drawable;
                            C43659HBn.LJIJ(LJII4, i0.LJFF("ImageCardMultiReceiveViewHolder", ":img1"), false, null, 6);
                            W5F LJII5 = W5U.LJII(C78939UyV.LJ((UrlModel) ORZ.LJLLLLLL(1, arrayList)));
                            LJII5.LJJIIJ = this.LLIILII;
                            LJII5.LJIILIIL = drawable;
                            LJII5.LJIILLIIL = drawable;
                            C43659HBn.LJIJ(LJII5, i0.LJFF("ImageCardMultiReceiveViewHolder", ":img2"), false, null, 6);
                            W5F LJII6 = W5U.LJII(C78939UyV.LJ((UrlModel) ORZ.LJLLLLLL(2, arrayList)));
                            LJII6.LJJIIJ = this.LLIILZL;
                            LJII6.LJIILIIL = drawable;
                            LJII6.LJIILLIIL = drawable;
                            C43659HBn.LJIJ(LJII6, i0.LJFF("ImageCardMultiReceiveViewHolder", ":img3"), false, null, 6);
                        }
                        String scene = msg.getScene();
                        List<String> list3 = imageCardTemplate2.titleBar.leftImage.urls;
                        int LIZIZ = C107304Ja.LIZIZ(scene, true);
                        if (LIZIZ != -1) {
                            this.LLIIIL.setIconRes(LIZIZ);
                            this.LLIIIL.setBackground((Drawable) this.LLIL.getValue());
                        } else {
                            this.LLIIIL.setBackground((Drawable) this.LLIIZ.getValue());
                        }
                        if (!list3.isEmpty()) {
                            this.LLIIIZ.setVisibility(0);
                            this.LLIIIL.setVisibility(8);
                            C4AS.LJII(this.LLIIIZ, C78934UyQ.LJJIIJ(list3), "ImageCard:leftIcon", null, null, 0, 0, 504);
                        }
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZ(new ACListenerS27S0300000_1(msg, this, imageCardTemplate2, 10));
                        }
                    }
                };
            case 74:
            case 75:
                return new C1048749r(itemView, this);
            case 76:
                return new C49G(itemView, this) { // from class: X.47M
                    @Override // X.C49G
                    public final String o0() {
                        return C88913eJ.LIZ(this.itemView, R.string.qip, "itemView.context.getStri…end_muf_you_shared_video)");
                    }

                    @Override // X.C49G
                    public final String p0(C109544Rq c109544Rq) {
                        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
                        if (companion.isVideoTag$im_base_release(c109544Rq)) {
                            return this.itemView.getContext().getString(R.string.epd);
                        }
                        if (companion.isVideoMention$im_base_release(c109544Rq)) {
                            return this.itemView.getContext().getString(R.string.epb);
                        }
                        if (companion.isVideoMentionAndTag$im_base_release(c109544Rq)) {
                            return this.itemView.getContext().getString(R.string.epc);
                        }
                        return null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                    }
                };
            case 77:
                return new C49G(itemView, this);
            case 78:
                return new C4X6(itemView, this);
            case 79:
                return new C4X6(itemView, this) { // from class: X.4X8
                    @Override // X.AbstractC1041546x
                    public final void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        this.LLIIIZ.LJIIL();
                    }

                    @Override // X.AbstractC1041546x
                    public final void onDetachedFromWindow() {
                        String uuid;
                        super.onDetachedFromWindow();
                        C112874br c112874br = this.LLIIIZ;
                        C109544Rq c109544Rq = c112874br.LJ;
                        if (c109544Rq == null || (uuid = c109544Rq.getUuid()) == null) {
                            return;
                        }
                        C117874jv.LJIIIIZZ(c112874br, uuid);
                    }

                    @Override // X.C4X6, X.AbstractC1041546x
                    public final void setOnClickListener(View.OnClickListener onClickListener) {
                        o.LJIIIZ(onClickListener, "onClickListener");
                        super.setOnClickListener(onClickListener);
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZ(new ACListenerS36S0200000_1(onClickListener, this, 72));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                    }

                    @Override // X.C4X6, X.AnonymousClass461
                    public final /* bridge */ /* synthetic */ void m0(C109544Rq c109544Rq, C109544Rq c109544Rq2, PictureCardTemplate pictureCardTemplate, int i) {
                        m0(c109544Rq, c109544Rq2, pictureCardTemplate, i);
                    }

                    @Override // X.C4X6
                    /* renamed from: n0 */
                    public final void m0(C109544Rq msg, C109544Rq c109544Rq, PictureCardTemplate pictureCardTemplate, int i) {
                        int i2;
                        o.LJIIIZ(msg, "msg");
                        super.m0(msg, c109544Rq, pictureCardTemplate, i);
                        if (msg.getMsgStatus() == 0) {
                            C112874br c112874br = this.LLIIIZ;
                            String uuid = msg.getUuid();
                            o.LJIIIIZZ(uuid, "msg.uuid");
                            Integer num = (Integer) ((LinkedHashMap) C117874jv.LIZJ).get(uuid);
                            if (num != null) {
                                i2 = num.intValue();
                            } else {
                                i2 = -1;
                            }
                            c112874br.onProgress(i2);
                            return;
                        }
                        if (msg.getMsgStatus() != 1) {
                            return;
                        }
                        this.LLIIIZ.onProgress(99);
                    }
                };
            case 80:
                return new C4X7(itemView, this) { // from class: X.4X9
                    @Override // X.AbstractC1041546x
                    public final void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        this.LLIIIZ.LJIIL();
                    }

                    @Override // X.AbstractC1041546x
                    public final void onDetachedFromWindow() {
                        String uuid;
                        super.onDetachedFromWindow();
                        C112874br c112874br = this.LLIIIZ;
                        C109544Rq c109544Rq = c112874br.LJ;
                        if (c109544Rq == null || (uuid = c109544Rq.getUuid()) == null) {
                            return;
                        }
                        C117874jv.LJIIIIZZ(c112874br, uuid);
                    }

                    @Override // X.C4X7, X.AbstractC1041546x
                    public final void setOnClickListener(View.OnClickListener onClickListener) {
                        o.LJIIIZ(onClickListener, "onClickListener");
                        super.setOnClickListener(onClickListener);
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZ(new ACListenerS36S0200000_1(onClickListener, this, 74));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "itemType");
                    }

                    @Override // X.C4X7, X.AnonymousClass461
                    public final /* bridge */ /* synthetic */ void m0(C109544Rq c109544Rq, C109544Rq c109544Rq2, VideoCardTemplate videoCardTemplate, int i) {
                        m0(c109544Rq, c109544Rq2, videoCardTemplate, i);
                    }

                    @Override // X.C4X7
                    /* renamed from: n0 */
                    public final void m0(C109544Rq msg, C109544Rq c109544Rq, VideoCardTemplate videoCardTemplate, int i) {
                        int i2;
                        o.LJIIIZ(msg, "msg");
                        super.m0(msg, c109544Rq, videoCardTemplate, i);
                        if (msg.getMsgStatus() == 0) {
                            C112874br c112874br = this.LLIIIZ;
                            String uuid = msg.getUuid();
                            o.LJIIIIZZ(uuid, "msg.uuid");
                            Integer num = (Integer) ((LinkedHashMap) C117874jv.LIZJ).get(uuid);
                            if (num != null) {
                                i2 = num.intValue();
                            } else {
                                i2 = -1;
                            }
                            c112874br.onProgress(i2);
                            return;
                        }
                        if (msg.getMsgStatus() != 1) {
                            return;
                        }
                        this.LLIIIZ.onProgress(99);
                    }
                };
            case 81:
                return new C4X7(itemView, this);
            case 82:
                return new C4A0(itemView, this);
            case 83:
                return new C4A0(itemView, this) { // from class: X.4A1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                    }

                    @Override // X.C4A0
                    public final void n0(C109544Rq msg, InfoCardTemplate infoCardTemplate) {
                        o.LJIIIZ(msg, "msg");
                        LinearLayout linearLayout = this.LLIIIJ;
                        if (linearLayout != null) {
                            linearLayout.removeAllViews();
                        }
                        List<InfoCardButtonComponent> list = infoCardTemplate.infoCardButtons;
                        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                        Iterator<InfoCardButtonComponent> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().cardText.text);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            String displayText = (String) it2.next();
                            LinearLayout linearLayout2 = this.LLIIIJ;
                            if (linearLayout2 != null) {
                                o.LJIIIZ(displayText, "displayText");
                                TuxTextView o0 = o0(displayText);
                                o0.setAlpha(0.34f);
                                linearLayout2.addView(o0);
                            }
                        }
                    }
                };
            case 84:
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return new C4AJ(itemView, this);
            case 86:
            case 87:
                return new AnonymousClass461<PortraitCardTemplate>(itemView, this) { // from class: X.4AI
                    public final View LLIIIJ;
                    public final SmartImageView LLIIIL;
                    public final SmartImageView LLIIIZ;
                    public final TuxTextView LLIIJI;
                    public final TuxTextView LLIIJLIL;
                    public final TuxTextView LLIIL;
                    public final TuxTextView LLIILII;

                    @Override // X.AbstractC1041546x
                    public final void M() {
                        float dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.tu);
                        C17N.LJJJJZ(this.LLIIIL, new float[]{dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f}, null);
                    }

                    @Override // X.AbstractC1041546x
                    public final void setOnClickListener(View.OnClickListener onClickListener) {
                        o.LJIIIZ(onClickListener, "onClickListener");
                        super.setOnClickListener(onClickListener);
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZ(onClickListener);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "type");
                        View findViewById = itemView.findViewById(R.id.btt);
                        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
                        this.LLIIIJ = findViewById;
                        View findViewById2 = itemView.findViewById(R.id.ejr);
                        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.img_picture)");
                        this.LLIIIL = (SmartImageView) findViewById2;
                        View findViewById3 = itemView.findViewById(R.id.eiw);
                        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.img_avatar)");
                        this.LLIIIZ = (SmartImageView) findViewById3;
                        View findViewById4 = itemView.findViewById(R.id.mby);
                        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_name)");
                        this.LLIIJI = (TuxTextView) findViewById4;
                        View findViewById5 = itemView.findViewById(R.id.mo6);
                        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_title)");
                        this.LLIIJLIL = (TuxTextView) findViewById5;
                        View findViewById6 = itemView.findViewById(R.id.m4n);
                        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_desc)");
                        this.LLIIL = (TuxTextView) findViewById6;
                        View findViewById7 = itemView.findViewById(R.id.m8i);
                        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.tv_hint)");
                        this.LLIILII = (TuxTextView) findViewById7;
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(50331648, 105);
                        }
                    }

                    @Override // X.AbstractC1041546x
                    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
                        o.LJIIIZ(msg, "msg");
                        C4AH c4ah = c49v.LIZ;
                        if (c4ah != null) {
                            V92 hierarchy = this.LLIIIL.getHierarchy();
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            hierarchy.LJIL(g0.LJIL(context, c4ah.LJLIL, c4ah.LJLILLLLZI, 0.0f, 0.0f));
                        }
                        View view = this.LLIIIJ;
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        C77413UZt.LJFF(gradientDrawable, new C49V(c49v.LIZ, C1042447g.LJLIL, c49v.LIZJ));
                        view.setBackground(gradientDrawable);
                    }

                    @Override // X.AnonymousClass461
                    public final void m0(C109544Rq msg, C109544Rq c109544Rq, PortraitCardTemplate portraitCardTemplate, int i) {
                        String str;
                        List<String> list;
                        String str2;
                        String str3;
                        String str4;
                        TextComponent textComponent;
                        ImageComponent imageComponent;
                        PortraitCardTemplate portraitCardTemplate2 = portraitCardTemplate;
                        o.LJIIIZ(msg, "msg");
                        ImageComponent imageComponent2 = portraitCardTemplate2.imageComponent;
                        String str5 = null;
                        if (imageComponent2 != null) {
                            str = imageComponent2.id;
                            list = imageComponent2.urls;
                        } else {
                            str = null;
                            list = null;
                        }
                        W5F LJII = W5U.LJII(new ImageUrlModel(str, list));
                        SmartImageView smartImageView = this.LLIIIL;
                        LJII.LJJIIJ = smartImageView;
                        int width = smartImageView.getWidth();
                        int height = this.LLIIIL.getHeight();
                        LJII.LJII = width;
                        LJII.LJIIIIZZ = height;
                        LJII.LIZIZ("IMPortraitCard");
                        C16880lQ.LLJJJ(LJII);
                        BaseUserComponent baseUserComponent = portraitCardTemplate2.userInfoComponent;
                        if (baseUserComponent != null && (imageComponent = baseUserComponent.avatar) != null) {
                            W5F LJII2 = W5U.LJII(new ImageUrlModel(imageComponent.id, imageComponent.urls));
                            SmartImageView smartImageView2 = this.LLIIIZ;
                            LJII2.LJJIIJ = smartImageView2;
                            int width2 = smartImageView2.getWidth();
                            int height2 = this.LLIIIZ.getHeight();
                            LJII2.LJII = width2;
                            LJII2.LJIIIIZZ = height2;
                            LJII2.LIZIZ("IMPortraitCard");
                            C16880lQ.LLJJJ(LJII2);
                        }
                        OSZ[] oszArr = new OSZ[4];
                        TuxTextView tuxTextView = this.LLIIJI;
                        BaseUserComponent baseUserComponent2 = portraitCardTemplate2.userInfoComponent;
                        if (baseUserComponent2 != null && (textComponent = baseUserComponent2.nickname) != null) {
                            str2 = textComponent.text;
                        } else {
                            str2 = null;
                        }
                        oszArr[0] = new OSZ(tuxTextView, str2);
                        TuxTextView tuxTextView2 = this.LLIIJLIL;
                        TextComponent textComponent2 = portraitCardTemplate2.titleComponent;
                        if (textComponent2 != null) {
                            str3 = textComponent2.text;
                        } else {
                            str3 = null;
                        }
                        oszArr[1] = new OSZ(tuxTextView2, str3);
                        TuxTextView tuxTextView3 = this.LLIIL;
                        TextComponent textComponent3 = portraitCardTemplate2.subTitleComponent;
                        if (textComponent3 != null) {
                            str4 = textComponent3.text;
                        } else {
                            str4 = null;
                        }
                        oszArr[2] = new OSZ(tuxTextView3, str4);
                        TuxTextView tuxTextView4 = this.LLIILII;
                        TextComponent textComponent4 = portraitCardTemplate2.hintTitleComponent;
                        if (textComponent4 != null) {
                            str5 = textComponent4.text;
                        }
                        oszArr[3] = new OSZ(tuxTextView4, str5);
                        for (OSZ osz : C47261Igj.LJJIJIIJI(oszArr)) {
                            CharSequence charSequence = (CharSequence) osz.getSecond();
                            if (charSequence == null || charSequence.length() == 0) {
                                ((View) osz.getFirst()).setVisibility(8);
                            } else {
                                ((View) osz.getFirst()).setVisibility(0);
                                ((TextView) osz.getFirst()).setText((CharSequence) osz.getSecond());
                            }
                        }
                        AnonymousClass470 anonymousClass470 = this.LJLJJI;
                        if (anonymousClass470 != null) {
                            anonymousClass470.LIZIZ(150994944, portraitCardTemplate2);
                        }
                    }
                };
            case 88:
                return new C1044247y(itemView, this);
            case 89:
                return new AnonymousClass429(itemView, this);
            case 90:
                return new ViewOnClickListenerC85343Wo(itemView, this);
            case 91:
                return new C97063rS(itemView, this);
            case 92:
            case 93:
                return new AnonymousClass480(itemView, this);
            case 94:
            case 95:
                return new DynamicCardViewHolder(itemView, this);
            case 96:
                return new AbstractC1041546x(itemView, this) { // from class: X.3ra
                    public String LLIIIILZ;
                    public C29701Eo LLIIIJ;
                    public final ImageView LLIIIL;
                    public final View LLIIIZ;
                    public final View LLIIJI;
                    public final View LLIIJLIL;
                    public final C97173rd LLIIL;
                    public long LLIILII;
                    public long LLIILZL;
                    public long LLIIZ;

                    @Override // X.AbstractC1041546x
                    public final void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        C29701Eo c29701Eo = this.LLIIIJ;
                        if (c29701Eo != null && c29701Eo.isAnimating()) {
                            return;
                        }
                        C29701Eo c29701Eo2 = this.LLIIIJ;
                        if (c29701Eo2 != null) {
                            c29701Eo2.playAnimation();
                        }
                        if (this.LLIIZ != this.LLIILZL) {
                            C32O.LIZ(0, this.LLIIIILZ);
                            this.LLIILZL = this.LLIIZ;
                        }
                    }

                    @Override // X.AbstractC1041546x
                    public final void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        C29701Eo c29701Eo = this.LLIIIJ;
                        if (c29701Eo != null) {
                            c29701Eo.cancelAnimation();
                        }
                    }

                    @Override // X.AbstractC1041546x
                    public final boolean X(C109544Rq c109544Rq) {
                        return C93793mB.LJIIL(c109544Rq);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        float f;
                        float f2;
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "messageType");
                        this.LLIIIILZ = "";
                        this.LLIIIJ = (C29701Eo) itemView.findViewById(R.id.ep6);
                        View findViewById = itemView.findViewById(R.id.msj);
                        this.LLIIIZ = findViewById;
                        View findViewById2 = itemView.findViewById(R.id.gnq);
                        this.LLIIJI = findViewById2;
                        this.LLIIJLIL = itemView.findViewById(R.id.ep5);
                        this.LLIIIL = (ImageView) itemView.findViewById(R.id.acf);
                        this.LLIIL = (C97173rd) itemView.findViewById(R.id.msk);
                        if (findViewById != null) {
                            if (C90193gN.LIZ()) {
                                f = -1.0f;
                            } else {
                                f = 1.0f;
                            }
                            findViewById.setScaleX(f);
                        }
                        if (findViewById2 != null) {
                            if (C90193gN.LIZ()) {
                                f2 = -1.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            findViewById2.setScaleX(f2);
                        }
                        C29701Eo c29701Eo = this.LLIIIJ;
                        if (c29701Eo != null) {
                            c29701Eo.setScaleX(C90193gN.LIZ() ? -1.0f : 1.0f);
                        }
                        Activity topActivity = ActivityStack.getTopActivity();
                        if (topActivity != null && AnonymousClass636.LJIILJJIL(topActivity)) {
                            if (findViewById2 != null) {
                                findViewById2.setBackgroundResource(R.drawable.bhz);
                            }
                            if (findViewById != null) {
                                findViewById.setBackgroundResource(R.drawable.bhx);
                            }
                            C29701Eo c29701Eo2 = this.LLIIIJ;
                            if (c29701Eo2 != null) {
                                c29701Eo2.setAnimation("dm_input_status_dark_mode.json");
                                return;
                            }
                            return;
                        }
                        if (findViewById2 != null) {
                            findViewById2.setBackgroundResource(R.drawable.bi0);
                        }
                        if (findViewById != null) {
                            findViewById.setBackgroundResource(R.drawable.bhy);
                        }
                        C29701Eo c29701Eo3 = this.LLIIIJ;
                        if (c29701Eo3 == null) {
                            return;
                        }
                        c29701Eo3.setAnimation("dm_input_status_normal_mode.json");
                    }

                    @Override // X.AbstractC1041546x
                    public final void P(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2, int i) {
                        C97173rd c97173rd;
                        o.LJIIIZ(msg, "msg");
                        super.P(msg, c109544Rq, c109544Rq2, i);
                        C97173rd c97173rd2 = this.LLIIL;
                        if (c97173rd2 != null) {
                            c97173rd2.setMsg(msg);
                        }
                        C99033ud c99033ud = this.LJLLL;
                        if (c99033ud != null && c99033ud.isTakoChat$im_base_release()) {
                            View view = this.itemView;
                            Integer LIZJ = AnonymousClass391.LIZJ(4);
                            C96963rI.LJIIIZ().getClass();
                            C97343ru.LIZJ(view, LIZJ, Integer.valueOf(C97223ri.LIZJ()), 5);
                        }
                        View view2 = this.LLIIJLIL;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        this.LLIIIJ = (C29701Eo) this.itemView.findViewById(R.id.ep6);
                        String conversationId = msg.getConversationId();
                        o.LJIIIIZZ(conversationId, "msg.conversationId");
                        this.LLIIIILZ = conversationId;
                        this.LLIIZ = msg.getCreatedAt();
                        C82223Ko c82223Ko = C99033ud.Companion;
                        String str = this.LLIIIILZ;
                        c82223Ko.getClass();
                        if (C82223Ko.LIZ(str)) {
                            ImageView imageView = this.LLIIIL;
                            if (imageView != null) {
                                imageView.setVisibility(8);
                            }
                            int LJ = C97343ru.LJ(R.dimen.vl);
                            View view3 = this.LLIIIZ;
                            if (view3 != null) {
                                C97343ru.LIZIZ(view3, new AqS26S0001000_1(LJ, 1));
                            }
                            C29701Eo c29701Eo = this.LLIIIJ;
                            if (c29701Eo != null) {
                                C97343ru.LIZIZ(c29701Eo, new AqS26S0001000_1(LJ, 2));
                            }
                            View view4 = this.LLIIJI;
                            if (view4 != null) {
                                C97343ru.LIZIZ(view4, new AqS26S0001000_1(LJ, 3));
                            }
                        }
                        String str2 = this.LLIIIILZ;
                        c82223Ko.getClass();
                        if (C82223Ko.LIZ(str2)) {
                            C97173rd c97173rd3 = this.LLIIL;
                            if (c97173rd3 != null) {
                                c97173rd3.setVisibility(0);
                            }
                            if (this.LLIILII != msg.getCreatedAt() && (c97173rd = this.LLIIL) != null) {
                                AnimatorSet animatorSet = c97173rd.LJLIL;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                }
                                Iterator it = new IDObjectS326S0100000_1(c97173rd, 14).iterator();
                                while (true) {
                                    IDObjectS1S0101000_1 iDObjectS1S0101000_1 = (IDObjectS1S0101000_1) it;
                                    if (!iDObjectS1S0101000_1.hasNext()) {
                                        break;
                                    } else {
                                        ((ArrayList) c97173rd.LJLILLLLZI).add(iDObjectS1S0101000_1.next());
                                    }
                                }
                                c97173rd.removeAllViews();
                                BotTypingProcessInfoManager botTypingProcessInfoManager = BotTypingProcessInfoManager.INSTANCE;
                                C76112yl processingData$im_base_release = botTypingProcessInfoManager.getProcessingData$im_base_release();
                                int size = processingData$im_base_release.LJLIL.size();
                                int i2 = processingData$im_base_release.LJLILLLLZI;
                                if (i2 >= 0 && size > 0) {
                                    c97173rd.LIZIZ(processingData$im_base_release.LJLIL.subList(0, Math.min(i2 + 1, size)));
                                }
                                botTypingProcessInfoManager.setChangeListener$im_base_release(c97173rd);
                            }
                            this.LLIILII = msg.getCreatedAt();
                            return;
                        }
                        C97173rd c97173rd4 = this.LLIIL;
                        if (c97173rd4 != null) {
                            c97173rd4.setVisibility(8);
                        }
                    }
                };
            case 97:
                return new AbstractC1041546x(itemView, this) { // from class: X.3rU
                    public final SYL LLIIIILZ;
                    public final TextView LLIIIJ;
                    public final View LLIIIL;
                    public final View LLIIIZ;
                    public final C62822Ol8 LLIIJI;

                    @Override // X.AbstractC1041546x
                    public final boolean V(C109544Rq msg) {
                        o.LJIIIZ(msg, "msg");
                        return C93793mB.LJIIL(msg);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(itemView, this);
                        o.LJIIIZ(itemView, "itemView");
                        o.LJIIIZ(this, "messageType");
                        this.LLIIJI = C221108m2.LIZIZ(C97093rV.LJLIL);
                        View findViewById = itemView.findViewById(R.id.ao6);
                        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.bot_sug_word_list)");
                        SYL syl = (SYL) findViewById;
                        this.LLIIIILZ = syl;
                        View findViewById2 = itemView.findViewById(R.id.ao7);
                        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.bot_sug_word_title)");
                        this.LLIIIJ = (TextView) findViewById2;
                        View findViewById3 = itemView.findViewById(R.id.bub);
                        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.content_start_guide)");
                        this.LLIIIZ = findViewById3;
                        View findViewById4 = itemView.findViewById(R.id.btl);
                        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.content_end_guide)");
                        this.LLIIIL = findViewById4;
                        syl.LLLF.LJZL(TakoSugWordCell.class);
                    }

                    @Override // X.AbstractC1041546x
                    public final void P(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2, int i) {
                        List<TakoSug> list;
                        ConstraintLayout constraintLayout;
                        o.LJIIIZ(msg, "msg");
                        super.P(msg, c109544Rq, c109544Rq2, i);
                        TextView textView = this.LLIIIJ;
                        String LJFF = C97343ru.LJFF(R.string.s37);
                        C96963rI.LJII().getClass();
                        int i2 = 0;
                        String LLLZ = C16880lQ.LLLZ(LJFF, Arrays.copyOf(new Object[]{C97353rv.LIZJ()}, 1));
                        o.LJIIIIZZ(LLLZ, "format(format, *args)");
                        textView.setText(LLLZ);
                        C99873vz c99873vz = C96963rI.LJI().LIZ;
                        if (c99873vz != null && (list = c99873vz.LJIIIIZZ) != null) {
                            List<TakoSug> list2 = null;
                            if (!list.isEmpty()) {
                                boolean LJ = o.LJ(((TakoSug) ListProtector.get(list, 0)).LIZIZ, "");
                                ViewParent parent = this.LLIIIILZ.getParent();
                                if (parent instanceof ConstraintLayout) {
                                    constraintLayout = (ConstraintLayout) parent;
                                } else {
                                    constraintLayout = null;
                                }
                                AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
                                if (LJ) {
                                    LIZ.LJIJJLI(this.LLIIIILZ.getId(), 6, O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                                    LIZ.LJIJJLI(this.LLIIIILZ.getId(), 7, O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                                    LIZ.LJIIIIZZ(this.LLIIIILZ.getId(), 3, this.LLIIIJ.getId(), 4);
                                    LIZ.LJIJJLI(this.LLIIIILZ.getId(), 3, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                                    LIZ.LIZIZ(constraintLayout);
                                    TextView textView2 = this.LLIIIJ;
                                    C99873vz c99873vz2 = C96963rI.LJI().LIZ;
                                    if (c99873vz2 != null) {
                                        list2 = c99873vz2.LJIIIIZZ;
                                    }
                                    if (!C1GE.LJIILIIL(list2)) {
                                        i2 = 8;
                                    }
                                    textView2.setVisibility(i2);
                                    C97343ru.LIZJ(this.itemView, 0, 0, 5);
                                } else {
                                    LIZ.LJIJJLI(this.LLIIIILZ.getId(), 6, C97343ru.LJ(R.dimen.vl));
                                    LIZ.LJIJJLI(this.LLIIIILZ.getId(), 7, ((Number) this.LLIIJI.getValue()).intValue());
                                    LIZ.LJIIIIZZ(this.LLIIIILZ.getId(), 3, 0, 3);
                                    LIZ.LJIJJLI(this.LLIIIILZ.getId(), 3, 0);
                                    LIZ.LIZIZ(constraintLayout);
                                    C17N.LJJIIJZLJL(this.LLIIIJ);
                                    C97343ru.LIZJ(this.itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), 0, 5);
                                }
                                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                                Iterator<TakoSug> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C97073rT(it.next(), this.LJLLL));
                                }
                                this.LLIIIILZ.getState().LJIILLIIL(arrayList);
                            }
                        }
                    }
                };
            case 98:
                return new C1044347z(itemView, this);
            default:
                throw new C162476Zf();
        }
    }

    public EnumC110124Tw(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.LJLIL = ordinal();
        this.LJLILLLLZI = TextContent.class;
    }
}
