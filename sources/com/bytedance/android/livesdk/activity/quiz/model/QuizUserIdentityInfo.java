package com.bytedance.android.livesdk.activity.quiz.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class QuizUserIdentityInfo {

    @InterfaceC65349Pkn("available_double_bonus_balance")
    public int availableDoubleBonusBalance;

    @InterfaceC65349Pkn("available_respawn_balance")
    public int availableRespawnBalance;

    @InterfaceC65349Pkn("double_bonus_balance")
    public int doubleBonusBalance;

    @InterfaceC65349Pkn("extra1")
    public String extra1;

    @InterfaceC65349Pkn("extra2")
    public String extra2;

    @InterfaceC65349Pkn("extra3")
    public String extra3;

    @InterfaceC65349Pkn("extra4")
    public String extra4;

    @InterfaceC65349Pkn("extra5")
    public String extra5;

    @InterfaceC65349Pkn("is_question_encrypt")
    public boolean isQuestionEncrypt;

    @InterfaceC65349Pkn("is_retain_if_wrong")
    public boolean isRetainIfWrong;

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    @InterfaceC65349Pkn("quiz_type")
    public int quizType;

    @InterfaceC65349Pkn("respawn_balance")
    public int respawnBalance;

    @InterfaceC65349Pkn("spectator_type")
    public int spectatorType;

    @InterfaceC65349Pkn("user_data_version")
    public int userDataVersion;

    @InterfaceC65349Pkn("user_identity_infos")
    public List<QuizUserIdentityInfo> userIdentityInfos;

    @InterfaceC65349Pkn("user_live_event_infos")
    public List<UserLiveEventInfo> userLiveEventInfos;

    @InterfaceC65349Pkn("user_question_result")
    public List<QuizUserQuestionResult> userQuestionResult;

    @InterfaceC65349Pkn("user_status")
    public int userStatus;

    @InterfaceC65349Pkn("quiz_id")
    public String quizId = "";

    @InterfaceC65349Pkn("extra")
    public String extra = "";

    @InterfaceC65349Pkn("device_id")
    public String deviceId = "";

    @InterfaceC65349Pkn("question_encrypt_key")
    public String questionEncryptKey = "";

    public QuizUserIdentityInfo() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.userQuestionResult = c61878OQg;
        this.userLiveEventInfos = c61878OQg;
        this.extra1 = "";
        this.extra2 = "";
        this.extra3 = "";
        this.extra4 = "";
        this.extra5 = "";
        this.userIdentityInfos = c61878OQg;
    }
}
