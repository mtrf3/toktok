package Y;

import X.AbstractC50059Jkl;
import X.C17N;
import X.C49059JNf;
import X.C49111JPf;
import X.C49586Jd8;
import X.C49587Jd9;
import X.C50321Joz;
import X.C50651JuJ;
import X.C50652JuK;
import X.C76800UCe;
import X.EnumC191797fr;
import X.InterfaceC55251LmJ;
import X.JN8;
import X.JNE;
import X.JP2;
import X.JQA;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ACallableS9S2100000_8 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS9S2100000_8 aCallableS9S2100000_8) {
        String str;
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ;
        InterfaceC55251LmJ interfaceC55251LmJ;
        C49586Jd8 c49586Jd8;
        Video video;
        VideoTag videoTag;
        String englishTitle;
        JQA LJLJL = ((SearchPhotoHolder) aCallableS9S2100000_8.l2).LJLJL();
        int i = LJLJL.LJIIL;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = ((SearchPhotoHolder) aCallableS9S2100000_8.l2).itemView;
        c50651JuJ.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        String str2 = "";
        if (LIZLLL == null || (str = LIZLLL.getSearchKeyword()) == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme = ((SearchPhotoHolder) aCallableS9S2100000_8.l2).LJLIL;
        if (aweme != null && (video = aweme.getVideo()) != null && (videoTag = video.getVideoTag()) != null && (englishTitle = videoTag.getEnglishTitle()) != null) {
            str2 = englishTitle;
        }
        linkedHashMap.put("video_tag", str2);
        View itemView = ((SearchPhotoHolder) aCallableS9S2100000_8.l2).itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ISearchContextAbility LJJJJJ = C17N.LJJJJJ(itemView);
        C49586Jd8 c49586Jd82 = null;
        if (LJJJJJ != null && (ut0 = LJJJJJ.ut0()) != null && (LIZJ = ut0.LIZJ()) != null && (interfaceC55251LmJ = (InterfaceC55251LmJ) ((SearchPhotoHolder) aCallableS9S2100000_8.l2).LJLLJ.getValue()) != null && (c49586Jd8 = (C49586Jd8) interfaceC55251LmJ.getSource()) != null) {
            SearchServiceImpl.LLLZI().LLILL(c49586Jd8, LIZJ);
        }
        LJLJL.LIZ(aCallableS9S2100000_8.s0);
        Aweme mData = ((SearchPhotoHolder) aCallableS9S2100000_8.l2).LJLIL;
        o.LJIIIIZZ(mData, "mData");
        String str3 = aCallableS9S2100000_8.s1;
        View itemView2 = ((SearchPhotoHolder) aCallableS9S2100000_8.l2).itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        InterfaceC55251LmJ interfaceC55251LmJ2 = (InterfaceC55251LmJ) ((SearchPhotoHolder) aCallableS9S2100000_8.l2).LJLLJ.getValue();
        if (interfaceC55251LmJ2 != null) {
            c49586Jd82 = (C49586Jd8) interfaceC55251LmJ2.getSource();
        }
        JNE.LIZLLL(mData, str3, LJLJL, itemView2, c49586Jd82, str, i, linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS9S2100000_8 aCallableS9S2100000_8) {
        String str;
        String str2;
        String str3;
        TuxIconView tuxIconView;
        String str4;
        Video video;
        VideoTag videoTag;
        Video video2;
        VideoTag videoTag2;
        JQA LJLJL = ((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLJL();
        int i = LJLJL.LJIIL;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = ((SearchVideoHolder) aCallableS9S2100000_8.l2).itemView;
        c50651JuJ.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        String str5 = "";
        if (LIZLLL == null || (str = LIZLLL.getSearchKeyword()) == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchVideoHolder searchVideoHolder = (SearchVideoHolder) aCallableS9S2100000_8.l2;
        Aweme aweme = searchVideoHolder.LJLIL;
        if (aweme == null || (video2 = aweme.getVideo()) == null || (videoTag2 = video2.getVideoTag()) == null || (str2 = videoTag2.getEnglishTitle()) == null) {
            str2 = "";
        }
        linkedHashMap.put("video_tag", str2);
        Aweme aweme2 = searchVideoHolder.LJLIL;
        C49586Jd8 c49586Jd8 = null;
        String str6 = null;
        if (aweme2 != null && (video = aweme2.getVideo()) != null && (videoTag = video.getVideoTag()) != null) {
            str3 = videoTag.getType();
        } else {
            str3 = null;
        }
        if (o.LJ(str3, EnumC191797fr.POI_DISTANCE.getType())) {
            linkedHashMap.put("video_tag", "distance");
        }
        C49059JNf c49059JNf = searchVideoHolder.LLI;
        if ((c49059JNf != null && c49059JNf.getVisibility() == 0) || ((tuxIconView = searchVideoHolder.LLIFFJFJJ) != null && tuxIconView.getVisibility() == 0)) {
            Aweme aweme3 = searchVideoHolder.LJLIL;
            if (aweme3 != null) {
                str5 = JNE.LIZ(aweme3);
            }
            linkedHashMap.put("anchor_info", str5);
        }
        LJLJL.LIZ(aCallableS9S2100000_8.s0);
        if (JP2.LIZ(((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLIL)) {
            JN8 jn8 = new JN8(LJLJL);
            jn8.LJIIZILJ("search_id", LJLJL.LJII);
            jn8.LJIJI(LJLJL.LJFF);
            jn8.LJIJ("search_result_id", LJLJL.LJJIJIIJI);
            jn8.LJIIZILJ("search_keyword", str);
            jn8.LJIIZILJ("token_type", ((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLJL().LJJIJ);
            jn8.LJJIIJZLJL("1");
            jn8.LJJI(Integer.valueOf(((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLJL().LJIIL));
            jn8.LJIILIIL();
        } else if (C49111JPf.LIZLLL(((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLLILLLL)) {
            JN8 jn82 = new JN8(LJLJL);
            jn82.LJIIZILJ("search_id", LJLJL.LJII);
            jn82.LJIJI(LJLJL.LJFF);
            Aweme aweme4 = ((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLIL;
            if (aweme4 != null) {
                str4 = aweme4.getAid();
            } else {
                str4 = null;
            }
            jn82.LJIJ("search_result_id", str4);
            jn82.LJIIZILJ("search_keyword", str);
            SearchSpot searchSpot = ((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLLILLLL;
            if (searchSpot != null) {
                str6 = searchSpot.alaSrc;
            }
            jn82.LJIIZILJ("token_type", str6);
            jn82.LJJIIJZLJL("1");
            jn82.LJJI(Integer.valueOf(LJLJL.LJIIL));
            jn82.LJIIZILJ("item_num", String.valueOf((Object) 1));
            jn82.LJIIZILJ("trending_type", "video");
            jn82.LJIILIIL();
        } else {
            Aweme mData = ((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLIL;
            o.LJIIIIZZ(mData, "mData");
            String str7 = aCallableS9S2100000_8.s1;
            View itemView = ((SearchVideoHolder) aCallableS9S2100000_8.l2).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            InterfaceC55251LmJ interfaceC55251LmJ = (InterfaceC55251LmJ) ((SearchVideoHolder) aCallableS9S2100000_8.l2).LJLLLL.getValue();
            if (interfaceC55251LmJ != null) {
                c49586Jd8 = (C49586Jd8) interfaceC55251LmJ.getSource();
            }
            JNE.LIZLLL(mData, str7, LJLJL, itemView, c49586Jd8, str, i, linkedHashMap);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS9S2100000_8(SearchPhotoHolder searchPhotoHolder, String str, int i) {
        this.$t = i;
        this.l2 = searchPhotoHolder;
        this.s0 = str;
        this.s1 = "general_search";
    }

    public ACallableS9S2100000_8(SearchVideoHolder searchVideoHolder, String str, String str2, int i) {
        this.$t = i;
        this.l2 = searchVideoHolder;
        this.s0 = str;
        this.s1 = str2;
    }
}
