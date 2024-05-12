package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.music.ui.ChooseThirdMusicFragment;
import com.ss.android.ugc.aweme.music.v2.assem.button.MusicPlayFullSongButtonAssem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUE implements View.OnClickListener {
    public final /* synthetic */ C68322mC<ArrayList<ExternalMusicInfo>> LJLIL;
    public final /* synthetic */ SUD LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ MusicPlayFullSongButtonAssem LJLJJI;
    public final /* synthetic */ OX0 LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ java.util.Map<String, String> LJLJLJ;
    public final /* synthetic */ MusicDetail LJLJLLL;

    public SUE(C68322mC<ArrayList<ExternalMusicInfo>> c68322mC, SUD sud, Context context, MusicPlayFullSongButtonAssem musicPlayFullSongButtonAssem, OX0 ox0, boolean z, String str, java.util.Map<String, String> map, MusicDetail musicDetail) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = sud;
        this.LJLJI = context;
        this.LJLJJI = musicPlayFullSongButtonAssem;
        this.LJLJJL = ox0;
        this.LJLJJLL = z;
        this.LJLJL = str;
        this.LJLJLJ = map;
        this.LJLJLLL = musicDetail;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        HashMap hashMap;
        String str;
        String LLD;
        String str2;
        if (this.LJLIL.element.size() == 1) {
            Object obj = ListProtector.get(this.LJLIL.element, 0);
            o.LJIIIIZZ(obj, "thirdMusicList[0]");
            ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) obj;
            SUD sud = this.LJLILLLLZI;
            Context context = this.LJLJI;
            Fragment LJIIIZ = C55096Ljo.LJIIIZ(this.LJLJJI);
            if (LJIIIZ != null) {
                LJIIIZ.getFragmentManager();
            }
            OX0 ox0 = this.LJLJJL;
            MusicPlayFullSongButtonAssem musicPlayFullSongButtonAssem = this.LJLJJI;
            musicPlayFullSongButtonAssem.getClass();
            sud.LIZ(context, externalMusicInfo, false, null, null, ox0, C44140HUa.LIZIZ((String) musicPlayFullSongButtonAssem.LJLLI.getValue(), (String) musicPlayFullSongButtonAssem.LJLLILLLL.getValue(), ox0.getDisableCollect()));
        } else {
            Fragment LJIIIZ2 = C55096Ljo.LJIIIZ(this.LJLJJI);
            if (LJIIIZ2 != null && (fragmentManager = LJIIIZ2.getFragmentManager()) != null) {
                ASL asl = new ASL();
                ArrayList<ExternalMusicInfo> musicInfoList = this.LJLIL.element;
                boolean z = this.LJLJJLL;
                String str3 = (String) this.LJLJJI.LJLLILLLL.getValue();
                String str4 = this.LJLJL;
                String str5 = (String) this.LJLJJI.LJLLI.getValue();
                java.util.Map<String, String> map = this.LJLJLJ;
                if (map instanceof HashMap) {
                    hashMap = (HashMap) map;
                } else {
                    hashMap = null;
                }
                C62053OWz c62053OWz = OX0.Companion;
                MusicDetail musicDetail = this.LJLJLLL;
                c62053OWz.getClass();
                OX0 simpleMusicData = C62053OWz.LIZ(musicDetail);
                o.LJIIIZ(musicInfoList, "musicInfoList");
                o.LJIIIZ(simpleMusicData, "simpleMusicData");
                ChooseThirdMusicFragment chooseThirdMusicFragment = new ChooseThirdMusicFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("music_info_list", musicInfoList);
                bundle.putBoolean("is_exclusive_resso", z);
                bundle.putString("process_id", str3);
                bundle.putString("music_id", str4);
                bundle.putString("group_id", str5);
                bundle.putString("request_id", null);
                bundle.putString("show_type", null);
                bundle.putSerializable("log_extra", hashMap);
                bundle.putSerializable("simple_music_data", simpleMusicData);
                chooseThirdMusicFragment.setArguments(bundle);
                asl.LIZ.LJLLILLLL = chooseThirdMusicFragment;
                asl.LJI(1);
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJZI = false;
                tuxSheet.LJLLJ = true;
                tuxSheet.show(fragmentManager, "ThirdMusic");
            } else {
                return;
            }
        }
        SUD sud2 = this.LJLILLLLZI;
        Context context2 = this.LJLJI;
        ArrayList<ExternalMusicInfo> externalMusicInfoList = this.LJLIL.element;
        C62053OWz c62053OWz2 = OX0.Companion;
        MusicDetail musicDetail2 = this.LJLJLLL;
        c62053OWz2.getClass();
        OX0 simpleMusicData2 = C62053OWz.LIZ(musicDetail2);
        sud2.getClass();
        o.LJIIIZ(externalMusicInfoList, "externalMusicInfoList");
        o.LJIIIZ(simpleMusicData2, "simpleMusicData");
        ArrayList arrayList = new ArrayList(C32I.LJJL(externalMusicInfoList, 10));
        Iterator<ExternalMusicInfo> it = externalMusicInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPartnerSongId());
        }
        String LLD2 = ORZ.LLD(arrayList, ",", null, null, null, 62);
        if (externalMusicInfoList.size() != 1) {
            str = "multi_anchor";
        } else {
            str = ((ExternalMusicInfo) ListProtector.get(externalMusicInfoList, 0)).getPartnerName();
        }
        String str6 = "";
        if (externalMusicInfoList.size() == 1) {
            LLD = "";
        } else {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(externalMusicInfoList, 10));
            Iterator<ExternalMusicInfo> it2 = externalMusicInfoList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getPartnerName());
            }
            LLD = ORZ.LLD(arrayList2, ",", null, null, null, 62);
        }
        if (externalMusicInfoList.size() == 1 && o.LJ("ttm", ((ExternalMusicInfo) ListProtector.get(externalMusicInfoList, 0)).getPartnerName())) {
            str6 = SVB.LIZ(context2) ? "other_app" : "brand_pop_up";
        }
        HashMap LIZ = C45243HpH.LIZ("music_id", LLD2, "music_from", str);
        LIZ.put("multi_anchor", LLD);
        LIZ.put("show_type", str6);
        LIZ.put("process_id", sud2.LIZ);
        LIZ.put("request_id", null);
        LIZ.put("song_id", sud2.LIZIZ);
        LIZ.put("group_id", sud2.LIZJ);
        LIZ.put("button_name", "play_full_song");
        java.util.Map<String, String> map2 = sud2.LIZLLL;
        if (map2 != null) {
            LIZ.putAll(map2);
        }
        if (simpleMusicData2.isPgc()) {
            str2 = "pgc_clip";
        } else {
            str2 = "original_song";
        }
        LIZ.put("from_music_type", str2);
        FMX.LJIIL("click_copyright_music", LIZ);
        if (externalMusicInfoList.size() == 1 && o.LJ("ttm", ((ExternalMusicInfo) ListProtector.get(externalMusicInfoList, 0)).getPartnerName())) {
            MusicDetailService.LJIJJ().LJIILL(LLD2);
        }
    }
}
