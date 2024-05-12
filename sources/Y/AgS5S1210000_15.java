package Y;

import X.C10I;
import X.C10K;
import X.C44384HbQ;
import X.C84859XSd;
import X.C84939XVf;
import X.C84940XVg;
import X.C84941XVh;
import X.XTR;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class AgS5S1210000_15 implements C10I {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS5S1210000_15 agS5S1210000_15, C10K c10k) {
        C84859XSd c84859XSd = (C84859XSd) agS5S1210000_15.l1;
        MusicModel musicModel = (MusicModel) agS5S1210000_15.l2;
        String str = agS5S1210000_15.s0;
        boolean z = agS5S1210000_15.z3;
        c84859XSd.getClass();
        if (c84859XSd.LJIIIZ.getOrDefault(musicModel.getMusicId(), null).booleanValue()) {
            if (c10k.LJIIL() || c10k.LJIILJJIL()) {
                XTR xtr = c84859XSd.LIZJ;
                if (xtr != null) {
                    xtr.dismiss();
                    c84859XSd.LIZJ = null;
                }
            } else {
                c84859XSd.LIZLLL(musicModel, str, z);
            }
        }
        return null;
    }

    public static final Object then$1(AgS5S1210000_15 agS5S1210000_15, C10K c10k) {
        List<Music> list;
        C84939XVf c84939XVf = (C84939XVf) agS5S1210000_15.l1;
        boolean z = agS5S1210000_15.z3;
        String str = agS5S1210000_15.s0;
        Music music = (Music) agS5S1210000_15.l2;
        c84939XVf.getClass();
        if (c10k.LJIIL()) {
            return null;
        }
        boolean z2 = true;
        if (c10k.LJIILJJIL()) {
            if (!z) {
                c84939XVf.LIZIZ.jv0(1, "pick_status");
                return null;
            }
            c84939XVf.LIZIZ.jv0(1, "status_pick_load_more");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            MusicPickResponse musicPickResponse = (MusicPickResponse) c10k.LJIIJJI();
            c84939XVf.LIZIZ.jv0(musicPickResponse.bannerList, "data_banner");
            MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
            musicCollectionItem.mcId = "recommend_mc_id";
            musicCollectionItem.mcName = c84939XVf.LIZLLL.getString(R.string.puv);
            arrayList.add(new C84941XVh(C44384HbQ.LJIJJLI(musicPickResponse.musicList), musicCollectionItem));
            arrayList.add(new C84940XVg(musicPickResponse.musicCollectionList));
            c84939XVf.LIZIZ.jv0(Integer.valueOf(musicPickResponse.radioCursor), "radio_cursor");
            DataCenter dataCenter = c84939XVf.LIZIZ;
            if (musicPickResponse.musicListType != 1) {
                z2 = false;
            }
            dataCenter.jv0(Boolean.valueOf(z2), "show_music_radio");
            if (str != null && (list = musicPickResponse.extraMusicList) != null && list.size() > 0) {
                c84939XVf.LIZIZ.jv0(Boolean.FALSE, "data_sticker_music_from_video");
                c84939XVf.LIZIZ.jv0(musicPickResponse.extraMusicList, "data_sticker");
            } else if (music != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(music);
                c84939XVf.LIZIZ.jv0(Boolean.TRUE, "data_sticker_music_from_video");
                c84939XVf.LIZIZ.jv0(arrayList2, "data_sticker");
            }
            c84939XVf.LIZIZ.jv0(arrayList, "list");
            c84939XVf.LIZIZ.jv0(0, "pick_status");
            return null;
        }
        MusicPickResponse musicPickResponse2 = (MusicPickResponse) c10k.LJIIJJI();
        c84939XVf.LIZIZ.jv0(C44384HbQ.LJIJJLI(musicPickResponse2.musicList), "pick_list_more");
        c84939XVf.LIZIZ.jv0(Integer.valueOf(musicPickResponse2.radioCursor), "radio_cursor");
        return null;
    }

    public AgS5S1210000_15(Object obj, boolean z, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z3 = z;
        this.s0 = str;
        this.l2 = obj2;
    }
}
