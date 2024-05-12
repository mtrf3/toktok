package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public class ChatMessage extends CR6 {
    public transient String LJLIL;

    @InterfaceC65349Pkn("at_user")
    public User atUser;

    @InterfaceC65349Pkn("background_image")
    public ImageModel background;

    @InterfaceC65349Pkn("background_image_v2")
    public ImageModel backgroundImageV2;

    @InterfaceC65349Pkn("chat_id")
    public long chatId;

    @InterfaceC65349Pkn("comment_quality_scores")
    public List<CommentQualityScore> commentQualityScores;

    @InterfaceC65349Pkn("comment_tag")
    public List<Integer> commentTag;

    @InterfaceC65349Pkn("community_flagged_status")
    public int communityflaggedStatus;

    @InterfaceC65349Pkn("content")
    public String content;

    /* renamed from: emotes, reason: collision with root package name */
    @InterfaceC65349Pkn("emotes")
    public List<EmoteWithIndex> f117emotes;

    @InterfaceC65349Pkn("gift_image")
    public ImageModel giftImage;

    @InterfaceC65349Pkn("input_type")
    public int inputType;

    @InterfaceC65349Pkn("msg_filter")
    public MsgFilter msgFilter;

    @InterfaceC65349Pkn("public_area_common")
    public PublicAreaCommon publicAreaCommon;

    @InterfaceC65349Pkn("quick_chat_scene")
    public int quickChatScene;

    @InterfaceC65349Pkn("user_identity")
    public UserIdentity userIdentity;

    @InterfaceC65349Pkn("user")
    public User userInfo;

    @InterfaceC65349Pkn("visible_to_sender")
    public boolean visibleToSender;

    @InterfaceC65349Pkn("full_screen_text_color")
    public String fullScreenTextColor = "#FF0000";

    @InterfaceC65349Pkn("content_language")
    public String contentLanguage = "";

    public final boolean LIZ() {
        if (this.inputType == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        List<EmoteWithIndex> list;
        if (this.userInfo != null && (!TextUtils.isEmpty(this.content) || ((list = this.f117emotes) != null && !list.isEmpty()))) {
            return true;
        }
        return false;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public ChatMessage() {
        this.type = EnumC31509CYf.CHAT;
    }
}
