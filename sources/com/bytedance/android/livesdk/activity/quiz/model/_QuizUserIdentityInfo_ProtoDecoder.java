package com.bytedance.android.livesdk.activity.quiz.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _QuizUserIdentityInfo_ProtoDecoder implements InterfaceC31105CIr<QuizUserIdentityInfo> {
    public static QuizUserIdentityInfo LIZIZ(Q9H q9h) {
        QuizUserIdentityInfo quizUserIdentityInfo = new QuizUserIdentityInfo();
        quizUserIdentityInfo.userIdentityInfos = new ArrayList();
        quizUserIdentityInfo.userQuestionResult = new ArrayList();
        quizUserIdentityInfo.userLiveEventInfos = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        quizUserIdentityInfo.messageType = q9h.LJIIJ();
                        break;
                    case 2:
                        quizUserIdentityInfo.quizId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        quizUserIdentityInfo.quizType = q9h.LJIIJ();
                        break;
                    case 4:
                        quizUserIdentityInfo.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        quizUserIdentityInfo.userDataVersion = q9h.LJIIJ();
                        break;
                    case 6:
                        quizUserIdentityInfo.deviceId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        quizUserIdentityInfo.userStatus = q9h.LJIIJ();
                        break;
                    case 8:
                        quizUserIdentityInfo.respawnBalance = q9h.LJIIJ();
                        break;
                    case 9:
                        quizUserIdentityInfo.doubleBonusBalance = q9h.LJIIJ();
                        break;
                    case 10:
                        quizUserIdentityInfo.spectatorType = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        quizUserIdentityInfo.isQuestionEncrypt = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        quizUserIdentityInfo.questionEncryptKey = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        quizUserIdentityInfo.userQuestionResult.add(_QuizUserQuestionResult_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 14:
                        quizUserIdentityInfo.availableRespawnBalance = q9h.LJIIJ();
                        break;
                    case 15:
                        quizUserIdentityInfo.availableDoubleBonusBalance = q9h.LJIIJ();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        quizUserIdentityInfo.isRetainIfWrong = Q9J.LIZ(q9h);
                        break;
                    case 17:
                        quizUserIdentityInfo.userLiveEventInfos.add(_UserLiveEventInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 18:
                        quizUserIdentityInfo.userIdentityInfos.add(LIZIZ(q9h));
                        break;
                    default:
                        switch (LJI) {
                            case 51:
                                quizUserIdentityInfo.extra1 = Q9J.LIZIZ(q9h);
                                break;
                            case 52:
                                quizUserIdentityInfo.extra2 = Q9J.LIZIZ(q9h);
                                break;
                            case 53:
                                quizUserIdentityInfo.extra3 = Q9J.LIZIZ(q9h);
                                break;
                            case 54:
                                quizUserIdentityInfo.extra4 = Q9J.LIZIZ(q9h);
                                break;
                            case 55:
                                quizUserIdentityInfo.extra5 = Q9J.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return quizUserIdentityInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuizUserIdentityInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
