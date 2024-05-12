package webcast.api.activity_quiz;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.activity.quiz.model._QuizUserIdentityInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _QueryUserIdentityResponse_ProtoDecoder implements InterfaceC31105CIr<QueryUserIdentityResponse> {
    @Override // X.InterfaceC31105CIr
    public final QueryUserIdentityResponse LIZ(Q9H q9h) {
        QueryUserIdentityResponse queryUserIdentityResponse = new QueryUserIdentityResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    queryUserIdentityResponse.body = _QuizUserIdentityInfo_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                queryUserIdentityResponse.timestamp = q9h.LJIIJJI();
                            }
                        } else {
                            queryUserIdentityResponse.retainDeviceId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        queryUserIdentityResponse.version = q9h.LJIIJJI();
                    }
                } else {
                    queryUserIdentityResponse.primaryId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return queryUserIdentityResponse;
            }
        }
    }
}
