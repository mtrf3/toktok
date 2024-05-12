package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UX3 implements InterfaceC61107NyZ {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ LocalMusicTabFragment LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da[] results) {
        o.LJIIIZ(results, "results");
        C164906da c164906da = (C164906da) ORY.LJJJ(results);
        if (c164906da != null) {
            String str = this.LIZ;
            LocalMusicTabFragment localMusicTabFragment = this.LIZIZ;
            ActivityC45651qj activityC45651qj = this.LIZJ;
            int i = C76866UEs.LIZ[c164906da.LIZIZ.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (o.LJ(str, "import_sound_from_video_click")) {
                    C45820Hya.LIZ("upload_video_music_authorization_popup_click", "allow");
                    System.currentTimeMillis();
                    AVExternalServiceImpl.LIZ().asyncService(activityC45651qj, "extract music", new C63056Oou(activityC45651qj));
                    return;
                } else {
                    if (!o.LJ(str, "import_sounds_from_device_click")) {
                        return;
                    }
                    C45820Hya.LIZ("upload_music_authorization_popup_click", "allow");
                    localMusicTabFragment.Sl();
                    return;
                }
            }
            if (o.LJ(str, "import_sound_from_video_click")) {
                C45820Hya.LIZ("upload_video_music_authorization_popup_click", "reject");
                C188727au c188727au = new C188727au();
                C78963Uyt.LIZJ(c188727au);
                FMX.LJIIL("upload_video_music_authorization_guide_popup_show", c188727au.LIZ);
                C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
                c26227ARb.LIZ(R.string.bmk);
                UC0.LIZJ(c26227ARb, new AqS179S0100000_13(localMusicTabFragment, 484));
                c26227ARb.LJI().LIZLLL();
                return;
            }
            if (!o.LJ(str, "import_sounds_from_device_click")) {
                return;
            }
            C45820Hya.LIZ("upload_music_authorization_popup_click", "reject");
            C188727au c188727au2 = new C188727au();
            C78963Uyt.LIZJ(c188727au2);
            FMX.LJIIL("upload_music_authorization_guide_popup_show", c188727au2.LIZ);
            C26227ARb c26227ARb2 = new C26227ARb(activityC45651qj);
            c26227ARb2.LIZ(R.string.bml);
            UC0.LIZJ(c26227ARb2, new AqS179S0100000_13(localMusicTabFragment, 482));
            c26227ARb2.LJI().LIZLLL();
        }
    }

    public UX3(String str, LocalMusicTabFragment localMusicTabFragment, ActivityC45651qj activityC45651qj) {
        this.LIZ = str;
        this.LIZIZ = localMusicTabFragment;
        this.LIZJ = activityC45651qj;
    }
}
