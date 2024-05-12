package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class MG6 {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;

    static {
        MG5 mg5 = MG5.FOLLOW_FEED;
        MG5 mg52 = MG5.TAB_FRIENDS;
        LIZ = C47261Igj.LJJIJIIJI(MG5.FANS.getValue(), MG5.OTHER_FANS.getValue(), mg5.getValue(), MG5.OTHER_FOLLOWING.getValue(), MG5.SUGGESTED_LIST.getValue(), MG5.PUSH_SETTINGS.getValue(), MG5.FIND_FRIENDS.getValue(), mg52.getValue());
        LIZIZ = C47261Igj.LJJIJIIJI(MG5.PERSONAL_PUBLIC_TAB.getValue(), MG5.PERSONAL_FAVORITE_TAB.getValue(), MG5.PERSONAL_PRIVATE_TAB.getValue(), MG5.PERSONAL_REPOSTED_TAB.getValue(), MG5.PERSONAL_MUSIC_TAB.getValue(), MG5.PERSONAL_EFFECT_TAB.getValue(), MG5.PERSONAL_COLLECTION_VIDEOS_TAB.getValue(), MG5.OTHERS_PUBLIC_TAB.getValue(), MG5.OTHERS_FAVORITE_TAB.getValue(), MG5.OTHERS_PRIVATE_TAB.getValue(), MG5.OTHERS_MUSIC_TAB.getValue(), MG5.OTHERS_EFFECT_TAB.getValue(), MG5.OTHERS_COLLECTION_VIDEOS_TAB.getValue());
        MG5 mg53 = MG5.RECOMMEND_FEED;
        LIZJ = C47261Igj.LJJIJ(mg53.getValue());
        LIZLLL = C47261Igj.LJJIJIIJI(mg5.getValue(), mg53.getValue(), mg52.getValue());
    }
}
