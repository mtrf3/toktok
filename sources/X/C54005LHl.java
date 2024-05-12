package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.LHl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54005LHl extends C54004LHk {
    public final C62822Ol8 LIZLLL;

    public C54005LHl() {
        this("Following", false);
    }

    public final java.util.Map<EnumC53524KzY, java.util.Set<String>> LJIIL() {
        return (java.util.Map) this.LIZLLL.getValue();
    }

    public final void LJIILJJIL() {
        Iterator<SingleTabCounter> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            SingleTabCounter next = it.next();
            next.setNumberCount(0);
            next.setShowRedDot(false);
        }
        LJIIL().clear();
    }

    @Override // X.C54004LHk
    public final void LJ(String str) {
        super.LJ("FRIENDS_FEED");
        LJIIL().clear();
    }

    @Override // X.C54004LHk
    public final void LJIIIIZZ(NewContentResponse response) {
        ArrayList<ContentMetadata> contentMetadataList;
        o.LJIIIZ(response, "response");
        super.LJIIIIZZ(response);
        LJIIL().clear();
        NewContentResponse.FollowFriendMergeFeedRedDotResponse followFriendMergeFeedResponse = response.getFollowFriendMergeFeedResponse();
        if (followFriendMergeFeedResponse == null || (contentMetadataList = followFriendMergeFeedResponse.getContentMetadataList()) == null) {
            return;
        }
        Iterator<ContentMetadata> it = contentMetadataList.iterator();
        while (it.hasNext()) {
            ContentMetadata next = it.next();
            int friendRelationStatus = next.getFriendRelationStatus();
            if (friendRelationStatus != 1) {
                if (friendRelationStatus == 2) {
                    LJIIJJI(EnumC53524KzY.MUTUAL_FOLLOW, next.getAuthorId());
                }
            } else {
                LJIIJJI(EnumC53524KzY.SINGLE_FOLLOW, next.getAuthorId());
            }
        }
    }

    public final int LJIILIIL(EnumC53524KzY numberNoticeType) {
        o.LJIIIZ(numberNoticeType, "numberNoticeType");
        java.util.Set<String> set = LJIIL().get(numberNoticeType);
        if (set != null) {
            return set.size();
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54005LHl(String socialMainFeedName, boolean z) {
        super(socialMainFeedName, z);
        o.LJIIIZ(socialMainFeedName, "socialMainFeedName");
        this.LIZLLL = C221108m2.LIZIZ(C54012LHs.LJLIL);
    }

    @Override // X.C54004LHk
    public final void LIZJ(int i, Aweme aweme) {
        String authorUid;
        if (LIZ() > 0) {
            super.LIZJ(i, aweme);
        }
        if (aweme == null || (authorUid = aweme.getAuthorUid()) == null) {
            return;
        }
        for (Map.Entry<EnumC53524KzY, java.util.Set<String>> entry : LJIIL().entrySet()) {
            entry.getKey();
            entry.getValue().remove(authorUid);
        }
    }

    public final void LJIIJJI(EnumC53524KzY enumC53524KzY, String str) {
        if (C78685UuP.LJJJZ(str)) {
            java.util.Map<EnumC53524KzY, java.util.Set<String>> LJIIL = LJIIL();
            java.util.Set<String> set = LJIIL.get(enumC53524KzY);
            if (set == null) {
                set = new LinkedHashSet<>();
                LJIIL.put(enumC53524KzY, set);
            }
            set.add(str);
        }
    }
}
