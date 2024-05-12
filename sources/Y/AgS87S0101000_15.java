package Y;

import X.C10I;
import X.C10K;
import X.C176376w5;
import X.C38816FLg;
import X.C44066HRe;
import X.C44384HbQ;
import X.C44426Hc6;
import X.C84939XVf;
import X.V16;
import X.XRT;
import X.XVW;
import com.google.gson.internal.i;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class AgS87S0101000_15 implements C10I {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS87S0101000_15 agS87S0101000_15, C10K c10k) {
        List<MusicModel> LIZIZ;
        switch (agS87S0101000_15.i1) {
            case 0:
                XVW xvw = (XVW) agS87S0101000_15.l0;
                xvw.LJIILJJIL = false;
                if (c10k.LJIILJJIL()) {
                    xvw.LIZIZ.jv0(Boolean.FALSE, "show_loading_view_by_see_more");
                    return null;
                }
                if (!c10k.LJIILIIL()) {
                    return null;
                }
                CollectedMusicList collectedMusicList = (CollectedMusicList) c10k.LJIIJJI();
                new XRT();
                DataCenter dataCenter = xvw.LIZIZ;
                Boolean bool = Boolean.FALSE;
                boolean booleanValue = ((Boolean) dataCenter.get("HAS_LEFT_FAV_TAB", bool)).booleanValue();
                if (xvw.LJII == null || booleanValue) {
                    xvw.LIZIZ.jv0(bool, "HAS_LEFT_FAV_TAB");
                    CollectedMusicList collectedMusicList2 = xvw.LJI;
                    LIZIZ = C44426Hc6.LIZIZ(collectedMusicList2.items, collectedMusicList2.extra);
                    CollectedMusicList collectedMusicList3 = xvw.LJI;
                    xvw.LJII = C44426Hc6.LIZIZ(collectedMusicList3.items, collectedMusicList3.extra);
                } else {
                    LIZIZ = new ArrayList<>(xvw.LJII);
                }
                List<MusicModel> LIZIZ2 = C44426Hc6.LIZIZ(collectedMusicList.items, collectedMusicList.extra);
                LIZIZ.addAll(LIZIZ2);
                ((ArrayList) xvw.LJII).addAll(LIZIZ2);
                List<Music> list = xvw.LJI.items;
                list.addAll(collectedMusicList.items);
                xvw.LJI = collectedMusicList;
                collectedMusicList.items = list;
                xvw.LIZIZ.jv0(collectedMusicList, "cached_collected_music_response");
                boolean isHasMore = collectedMusicList.isHasMore();
                boolean booleanValue2 = ((Boolean) xvw.LIZIZ.get("show_recommended_music_section", Boolean.TRUE)).booleanValue();
                xvw.LJIIIZ = booleanValue2;
                if (isHasMore && booleanValue2) {
                    MusicModel musicModel = new MusicModel();
                    musicModel.setMusicItemType(MusicModel.MusicItemType.SEE_MORE_BUTTON);
                    LIZIZ.add(musicModel);
                }
                xvw.LJFF(LIZIZ, xvw.LJIIIIZZ, collectedMusicList);
                return null;
            default:
                C176376w5 c176376w5 = (C176376w5) agS87S0101000_15.l0;
                c176376w5.getClass();
                if (!c10k.LJIILJJIL()) {
                    CommentItemList commentItemList = (CommentItemList) c10k.LJIIJJI();
                    c176376w5.LJIILL(commentItemList);
                    return commentItemList;
                }
                throw c10k.LJIIJ();
        }
    }

    public static final Object then$1(AgS87S0101000_15 agS87S0101000_15, C10K c10k) {
        XVW xvw = (XVW) agS87S0101000_15.l0;
        int i = agS87S0101000_15.i1;
        xvw.getClass();
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "status_second_level_music_list");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        xvw.LIZIZ.jv0(0, "status_second_level_music_list");
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Integer.valueOf(musicList.getCursor()));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
        xrt.LIZ.put("action_type", 1);
        xrt.LIZ.put("list_level", Integer.valueOf(i));
        xrt.LIZIZ("list_collection_data", musicList.childCollections);
        V16.LJJJLZIJ(xrt, C44426Hc6.LIZIZ(musicList.items, musicList.extra));
        xvw.LIZIZ.jv0(xrt, "second_level_music_list");
        return null;
    }

    public static final Object then$2(AgS87S0101000_15 agS87S0101000_15, C10K c10k) {
        switch (agS87S0101000_15.i1) {
            case 0:
                XVW xvw = (XVW) agS87S0101000_15.l0;
                xvw.getClass();
                if (c10k.LJIILJJIL()) {
                    xvw.LIZIZ.jv0(1, "refresh_status_music_sheet");
                } else if (c10k.LJIILIIL()) {
                    xvw.LIZIZ.jv0(0, "refresh_status_music_sheet");
                    MusicCollection musicCollection = (MusicCollection) c10k.LJIIJJI();
                    XRT xrt = new XRT();
                    xrt.LIZ.put("list_cursor", Long.valueOf(musicCollection.cursor));
                    xrt.LIZ.put("list_hasmore", Boolean.valueOf(musicCollection.hasMore));
                    xrt.LIZ.put("action_type", 1);
                    xrt.LIZIZ("list_data", musicCollection.getItems());
                    xvw.LIZIZ.jv0(xrt, "music_sheet_list");
                }
                return null;
            default:
                C44066HRe c44066HRe = (C44066HRe) agS87S0101000_15.l0;
                c44066HRe.getClass();
                if (c10k.LJIILJJIL()) {
                    c44066HRe.LIZLLL();
                } else if (!c44066HRe.LJIJ) {
                    C38816FLg.LIZJ(new ARunnableS11S0101000_7(6, c44066HRe, 10));
                    C38816FLg.LJ(new ARunnableS11S0101000_7(10, c44066HRe, 11));
                }
                return null;
        }
    }

    public static final Object then$3(AgS87S0101000_15 agS87S0101000_15, C10K c10k) {
        switch (agS87S0101000_15.i1) {
            case 0:
                C84939XVf c84939XVf = (C84939XVf) agS87S0101000_15.l0;
                c84939XVf.LJI = false;
                if (c10k.LJIILJJIL()) {
                    c84939XVf.LIZIZ.jv0(1, "refresh_status_hot_music_list");
                } else if (c10k.LJIILIIL()) {
                    com.ss.android.ugc.aweme.kids.music.model.MusicList musicList = (com.ss.android.ugc.aweme.kids.music.model.MusicList) c10k.LJIIJJI();
                    XRT xrt = new XRT();
                    xrt.LIZ.put("refresh_status_hot_music_list", 0);
                    int i = musicList.radioCursor;
                    if (i <= 0) {
                        i = musicList.cursor;
                    }
                    xrt.LIZ.put("list_cursor", Integer.valueOf(i));
                    xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
                    xrt.LIZ.put("action_type", 1);
                    xrt.LIZIZ("list_data", C44384HbQ.LJIJJLI(musicList.items));
                    c84939XVf.LIZIZ.jv0(xrt, "hot_music_list_data");
                }
                return null;
            default:
                i.LIZJ((Runnable) agS87S0101000_15.l0);
                return null;
        }
    }

    public static final Object then$4(AgS87S0101000_15 agS87S0101000_15, C10K c10k) {
        C84939XVf c84939XVf = (C84939XVf) agS87S0101000_15.l0;
        int i = agS87S0101000_15.i1;
        c84939XVf.getClass();
        if (c10k.LJIILJJIL()) {
            c84939XVf.LIZIZ.jv0(1, "status_second_level_music_list");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        c84939XVf.LIZIZ.jv0(0, "status_second_level_music_list");
        com.ss.android.ugc.aweme.kids.music.model.MusicList musicList = (com.ss.android.ugc.aweme.kids.music.model.MusicList) c10k.LJIIJJI();
        XRT xrt = new XRT();
        int i2 = musicList.radioCursor;
        if (i2 <= 0) {
            i2 = musicList.cursor;
        }
        xrt.LIZ.put("list_cursor", Integer.valueOf(i2));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
        xrt.LIZ.put("action_type", 1);
        xrt.LIZ.put("list_level", Integer.valueOf(i));
        xrt.LIZ.put("list_collection_data", musicList.childCollections);
        xrt.LIZIZ("list_data", C44384HbQ.LJIJJLI(musicList.items));
        c84939XVf.LIZIZ.jv0(xrt, "second_level_music_list");
        return null;
    }

    public AgS87S0101000_15(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
