package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JaA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49402JaA {
    public final ViewGroup LIZ;
    public SearchUser LIZJ;
    public JQA LIZLLL;
    public C49397Ja5 LJ;
    public InterfaceC49416JaO LJFF;
    public View LJI;
    public final List<MixStruct> LIZIZ = new ArrayList();
    public final C49398Ja6 LJII = new C49398Ja6(this);

    public C49402JaA(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    public final void LIZ(SearchUser searchUser) {
        long j;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        User user;
        User user2;
        Boolean bool;
        Long l;
        String str6 = null;
        if (searchUser == null || searchUser.playlists == null) {
            return;
        }
        ((ArrayList) this.LIZIZ).clear();
        this.LIZJ = searchUser;
        for (MixStruct mixStruct : searchUser.playlists) {
            if (mixStruct != null) {
                ((ArrayList) this.LIZIZ).add(mixStruct);
            }
        }
        MixListResponse mixListResponse = new MixListResponse();
        mixListResponse.setMixList(this.LIZIZ);
        SearchUser searchUser2 = this.LIZJ;
        if (searchUser2 == null || (l = searchUser2.mixCursor) == null) {
            j = 0;
        } else {
            j = l.longValue();
        }
        mixListResponse.setCursor(j);
        SearchUser searchUser3 = this.LIZJ;
        if (searchUser3 == null || (bool = searchUser3.mixHasMore) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        mixListResponse.setHasMore(z);
        C49397Ja5 c49397Ja5 = this.LJ;
        if (c49397Ja5 != null) {
            str = c49397Ja5.getSearchKeyWord();
        } else {
            str = null;
        }
        mixListResponse.setKeyWord(str);
        JQA jqa = this.LIZLLL;
        if (jqa != null) {
            str2 = jqa.LJII;
        } else {
            str2 = null;
        }
        mixListResponse.setSearchId(str2);
        C49397Ja5 c49397Ja52 = this.LJ;
        if (c49397Ja52 != null) {
            str3 = c49397Ja52.getSearchResultId();
        } else {
            str3 = null;
        }
        mixListResponse.setSearchResultId(str3);
        JQA jqa2 = this.LIZLLL;
        if (jqa2 != null) {
            str4 = jqa2.LIZJ;
        } else {
            str4 = null;
        }
        mixListResponse.setSearchType(str4);
        InterfaceC49416JaO interfaceC49416JaO = this.LJFF;
        if (interfaceC49416JaO != null) {
            SearchUser searchUser4 = this.LIZJ;
            if (searchUser4 == null || (user2 = searchUser4.user) == null || (str5 = user2.getUid()) == null) {
                str5 = "";
            }
            SearchUser searchUser5 = this.LIZJ;
            if (searchUser5 != null && (user = searchUser5.user) != null) {
                str6 = user.getSecUid();
            }
            interfaceC49416JaO.LJJIJIIJIL(str5, str6, mixListResponse);
        }
    }
}
