package X;

import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BHX extends AbstractC65781Prl implements InterfaceC88472Yns<HashtagResponse, C76800UCe> {
    public static final BHX LJLIL = new BHX();

    public BHX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(HashtagResponse hashtagResponse) {
        Hashtag hashtag;
        List<GameTag> list;
        Hashtag hashtag2;
        List<GameTag> list2;
        Hashtag hashtag3;
        List<Hashtag> list3;
        Hashtag hashtag4;
        Long l;
        Long l2;
        List<Hashtag> list4;
        Hashtag hashtag5;
        Long l3;
        Long l4;
        HashtagResponse hashtagResponse2 = hashtagResponse;
        BHZ bhz = BHZ.VIDEO;
        List<GameTag> list5 = null;
        if (hashtagResponse2 != null && (list4 = hashtagResponse2.hashtags) != null) {
            Iterator<Hashtag> it = list4.iterator();
            while (true) {
                if (it.hasNext()) {
                    hashtag5 = it.next();
                    Hashtag hashtag6 = hashtag5;
                    if (hashtag6 != null) {
                        l3 = hashtag6.id;
                    } else {
                        l3 = null;
                    }
                    Hashtag hashtag7 = bhz.getHashtag();
                    if (hashtag7 != null) {
                        l4 = hashtag7.id;
                    } else {
                        l4 = null;
                    }
                    if (o.LJ(l3, l4)) {
                        break;
                    }
                } else {
                    hashtag5 = null;
                    break;
                }
            }
            hashtag = hashtag5;
        } else {
            hashtag = null;
        }
        if (hashtagResponse2 != null) {
            list = hashtagResponse2.gameTagList;
        } else {
            list = null;
        }
        bhz.updateHashTagGameTag(hashtag, BHV.LIZIZ(bhz, list));
        BHZ bhz2 = BHZ.SCREEN_RECORD;
        if (hashtagResponse2 != null) {
            hashtag2 = hashtagResponse2.gameHashTag;
            list2 = hashtagResponse2.gameTagList;
        } else {
            hashtag2 = null;
            list2 = null;
        }
        bhz2.updateHashTagGameTag(hashtag2, BHV.LIZIZ(bhz2, list2));
        BHZ bhz3 = BHZ.LIVE_VOICE;
        if (hashtagResponse2 != null && (list3 = hashtagResponse2.liveVoiceHashtag) != null) {
            Iterator<Hashtag> it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    hashtag4 = it2.next();
                    Hashtag hashtag8 = hashtag4;
                    if (hashtag8 != null) {
                        l = hashtag8.id;
                    } else {
                        l = null;
                    }
                    Hashtag hashtag9 = bhz3.getHashtag();
                    if (hashtag9 != null) {
                        l2 = hashtag9.id;
                    } else {
                        l2 = null;
                    }
                    if (o.LJ(l, l2)) {
                        break;
                    }
                } else {
                    hashtag4 = null;
                    break;
                }
            }
            hashtag3 = hashtag4;
        } else {
            hashtag3 = null;
        }
        if (hashtagResponse2 != null) {
            list5 = hashtagResponse2.gameTagList;
        }
        bhz3.updateHashTagGameTag(hashtag3, BHV.LIZIZ(bhz3, list5));
        return C76800UCe.LIZ;
    }
}
