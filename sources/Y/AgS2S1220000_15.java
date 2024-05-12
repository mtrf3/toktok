package Y;

import X.C10I;
import X.C10K;
import X.C44426Hc6;
import X.C72834SiE;
import X.C74216TAu;
import X.C78596Usy;
import X.C84887XTf;
import X.C84935XVb;
import X.C84936XVc;
import X.XVW;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class AgS2S1220000_15 implements C10I {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS2S1220000_15 agS2S1220000_15, C10K c10k) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = (MusicDownloadPlayHelper) agS2S1220000_15.l1;
        MusicModel musicModel = (MusicModel) agS2S1220000_15.l2;
        boolean z = agS2S1220000_15.z3;
        String str = agS2S1220000_15.s0;
        boolean z2 = agS2S1220000_15.z4;
        musicDownloadPlayHelper.getClass();
        if (musicDownloadPlayHelper.LJZL.getOrDefault(musicModel.getMusicId(), null).booleanValue()) {
            if (c10k.LJIIL() || c10k.LJIILJJIL()) {
                musicDownloadPlayHelper.dismissDialog();
            } else if (z) {
                musicDownloadPlayHelper.LJIIL(musicModel);
            } else {
                musicDownloadPlayHelper.LJIILIIL(musicModel, str, z2);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x017d, code lost:
    
        if (r13 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0216, code lost:
    
        if (r15 > r11) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$1(Y.AgS2S1220000_15 r17, X.C10K r18) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS2S1220000_15.then$1(Y.AgS2S1220000_15, X.10K):java.lang.Object");
    }

    public static final Object then$2(AgS2S1220000_15 agS2S1220000_15, C10K c10k) {
        int i;
        List<Music> list;
        XVW xvw = (XVW) agS2S1220000_15.l1;
        boolean z = agS2S1220000_15.z3;
        String str = agS2S1220000_15.s0;
        Music music = (Music) agS2S1220000_15.l2;
        boolean z2 = agS2S1220000_15.z4;
        xvw.getClass();
        if (c10k.LJIIL()) {
            return null;
        }
        boolean z3 = true;
        if (c10k.LJIILJJIL()) {
            if (!z) {
                xvw.LIZIZ.jv0(1, "pick_status");
            } else {
                xvw.LIZIZ.jv0(1, "status_pick_load_more");
            }
            C74216TAu c74216TAu = C74216TAu.LIZIZ;
            if (!c74216TAu.LIZIZ() || c74216TAu.LIZLLL() <= 0) {
                return null;
            }
            C78596Usy.LJJJLIIL(xvw.LIZJ, true);
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        MusicPickResponse musicPickResponse = (MusicPickResponse) c10k.LJIIJJI();
        if (!z) {
            if (C84887XTf.LIZ() && z2) {
                C72834SiE.LIZ.clear();
                C72834SiE.LIZ().erase("music_pick_discover");
            }
            ArrayList arrayList = new ArrayList();
            xvw.LIZIZ.jv0(musicPickResponse.bannerList, "data_banner");
            MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
            musicCollectionItem.mcId = "recommend_mc_id";
            Context context = xvw.LIZJ;
            if (CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
                i = R.string.ij2;
            } else {
                i = R.string.puv;
            }
            musicCollectionItem.mcName = context.getString(i);
            List<MusicModel> LIZIZ = C44426Hc6.LIZIZ(musicPickResponse.musicList, musicPickResponse.extra);
            if (C84887XTf.LIZ()) {
                Iterator it = ((ArrayList) LIZIZ).iterator();
                while (it.hasNext()) {
                    ((MusicModel) it.next()).setNeedRecordConsumption(true);
                }
            }
            arrayList.add(new C84936XVc(LIZIZ, musicCollectionItem, 1));
            arrayList.add(new C84935XVb(musicPickResponse.musicCollectionList));
            xvw.LIZIZ.jv0(Integer.valueOf(musicPickResponse.radioCursor), "radio_cursor");
            DataCenter dataCenter = xvw.LIZIZ;
            if (musicPickResponse.musicListType != 1) {
                z3 = false;
            }
            dataCenter.jv0(Boolean.valueOf(z3), "show_music_radio");
            if (str != null && (list = musicPickResponse.extraMusicList) != null && list.size() > 0) {
                if (!XVW.LJI(musicPickResponse.extraMusicList).isEmpty()) {
                    xvw.LIZIZ.jv0(Boolean.FALSE, "data_sticker_music_from_video");
                    xvw.LIZIZ.jv0(XVW.LJI(musicPickResponse.extraMusicList), "data_sticker");
                } else {
                    xvw.LIZIZ.jv0(Boolean.FALSE, "is_busi_sticker");
                }
            } else if (music != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(music);
                if (!XVW.LJI(arrayList2).isEmpty()) {
                    xvw.LIZIZ.jv0(Boolean.TRUE, "data_sticker_music_from_video");
                    xvw.LIZIZ.jv0(XVW.LJI(arrayList2), "data_sticker");
                } else {
                    xvw.LIZIZ.jv0(Boolean.FALSE, "is_busi_sticker");
                }
            }
            xvw.LIZIZ.jv0(arrayList, "list");
            xvw.LIZIZ.jv0(0, "pick_status");
            xvw.LIZIZ.jv0(music, "selected_music");
            return null;
        }
        xvw.LIZIZ.jv0(C44426Hc6.LIZIZ(musicPickResponse.musicList, musicPickResponse.extra), "pick_list_more");
        xvw.LIZIZ.jv0(Integer.valueOf(musicPickResponse.radioCursor), "radio_cursor");
        return null;
    }

    public AgS2S1220000_15(XVW xvw, Music music, String str, boolean z, boolean z2, int i) {
        this.$t = i;
        switch (i) {
            case 1:
                this.l1 = xvw;
                this.z3 = z;
                this.z4 = z2;
                this.s0 = str;
                this.l2 = music;
                return;
            default:
                this.l1 = xvw;
                this.z3 = z;
                this.s0 = str;
                this.l2 = music;
                this.z4 = z2;
                return;
        }
    }

    public AgS2S1220000_15(MusicDownloadPlayHelper musicDownloadPlayHelper, MusicModel musicModel, boolean z, String str, boolean z2, int i) {
        this.$t = i;
        this.l1 = musicDownloadPlayHelper;
        this.l2 = musicModel;
        this.z3 = z;
        this.s0 = str;
        this.z4 = z2;
    }
}
