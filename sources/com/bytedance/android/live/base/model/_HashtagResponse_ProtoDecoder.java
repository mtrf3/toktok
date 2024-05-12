package com.bytedance.android.live.base.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._GameTag_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _HashtagResponse_ProtoDecoder implements InterfaceC31105CIr<HashtagResponse> {
    public static HashtagResponse LIZIZ(Q9H q9h) {
        HashtagResponse hashtagResponse = new HashtagResponse();
        hashtagResponse.obsHashTag = new ArrayList();
        hashtagResponse.liveVoiceHashtag = new ArrayList();
        hashtagResponse.gameTagList = new ArrayList();
        hashtagResponse.hashtags = new ArrayList();
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
                                    hashtagResponse.liveVoiceHashtag.add(_Hashtag_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                hashtagResponse.obsHashTag.add(_Hashtag_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            hashtagResponse.gameHashTag = _Hashtag_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        hashtagResponse.gameTagList.add(_GameTag_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    hashtagResponse.hashtags.add(_Hashtag_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return hashtagResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final HashtagResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
