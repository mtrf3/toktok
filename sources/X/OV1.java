package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.UUID;

/* loaded from: classes11.dex */
public final class OV1 implements InterfaceC84927XUt {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ OV6 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ Boolean LJLL;
    public final /* synthetic */ Boolean LJLLI;
    public final /* synthetic */ Boolean LJLLILLLL;
    public final /* synthetic */ String LJLLJ;
    public final /* synthetic */ String LJLLL;
    public final /* synthetic */ ShootExtraData LJLLLL;
    public final /* synthetic */ String LJLLLLLL;
    public final /* synthetic */ String LJLZ;
    public final /* synthetic */ Boolean LJZ;
    public final /* synthetic */ int LJZI;
    public final /* synthetic */ MusicRecordService LJZL;

    @Override // X.InterfaceC84927XUt
    public final void LLJJLIIIJLLLLLLLZ(MusicModel musicModel) {
    }

    @Override // X.InterfaceC84927XUt
    public final boolean LJLIL() {
        return this.LJZL.LIZ;
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJJJJ() {
        J9P.LIZIZ(this.LJLIL, "single_song", "click_music_shoot", null, null);
    }

    @Override // X.InterfaceC84927XUt
    public final void LLILZ(MusicModel musicModel, boolean z) {
        if (z) {
            this.LJZL.LIZJ(this.LJLIL, musicModel, null, Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLLLLLLL(int i, boolean z) {
        HWH hwh;
        HWH hwh2;
        OV6 ov6 = this.LJLILLLLZI;
        if (ov6 != null) {
            ov6.LIZLLL();
        }
        if (!z && (hwh = this.LJZL.LIZJ) != null) {
            hwh.setProgress(i);
            if (i >= 98 && (hwh2 = this.LJZL.LIZJ) != null) {
                hwh2.setCancelable(true);
            }
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLLZLL(boolean z, boolean z2) {
        OV6 ov6 = this.LJLILLLLZI;
        if (ov6 != null) {
            ov6.LIZJ();
        }
        if (z) {
            this.LJZL.LIZIZ(z);
            return;
        }
        HWH hwh = this.LJZL.LIZJ;
        if (hwh != null) {
            hwh.dismiss();
        }
    }

    @Override // X.InterfaceC84927XUt
    public final void LLLZZIL(Effect effect, MusicModel musicModel) {
        String uuid;
        String str = this.LJLJJI;
        if (str != null) {
            C78939UyV.LJLJI = str;
        }
        this.LJZL.LIZIZ(true);
        String str2 = this.LJLJL;
        if (str2 == null || str2.isEmpty()) {
            uuid = UUID.randomUUID().toString();
        } else {
            uuid = this.LJLJL;
        }
        AVExternalServiceImpl.LIZ().asyncService("MusicRecordService", new OV0(this, uuid, effect, musicModel));
    }

    @Override // X.InterfaceC84927XUt
    public final void LLJILLL(String str, MusicModel musicModel, int i) {
        String uuid;
        String str2;
        OV6 ov6 = this.LJLILLLLZI;
        if (ov6 != null) {
            ov6.LIZ(musicModel, str);
        }
        this.LJZL.LIZIZ(this.LJLJI);
        HWH hwh = this.LJZL.LIZJ;
        if (hwh != null) {
            hwh.dismiss();
        }
        String str3 = this.LJLJJI;
        if (str3 != null) {
            C78939UyV.LJLJI = str3;
        }
        boolean isRecording = AVExternalServiceImpl.LIZ().configService().shortVideoConfig().isRecording();
        long currentTimeMillis = System.currentTimeMillis() - this.LJZL.LIZIZ;
        if (isRecording && this.LJLIL != null) {
            AVExternalServiceImpl.LIZ().publishService().addMusic(musicModel, 0);
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            MusicRecordService musicRecordService = this.LJZL;
            String str4 = this.LJLJJL;
            int i2 = this.LJLJJLL;
            musicRecordService.getClass();
            if (TextUtils.equals(str4, "choose_music_with_banner") && i2 == 2) {
                str2 = "shoot_page_banner";
            } else if (TextUtils.equals(str4, "choose_music_with_banner") && i2 == 0) {
                str2 = "edit_page_banner";
            } else {
                str2 = "";
            }
            intent.putExtra("music_origin", str2);
            this.LJLIL.setResult(-1, intent);
            this.LJLIL.finish();
            return;
        }
        String str5 = this.LJLJL;
        if (str5 == null || str5.isEmpty()) {
            uuid = UUID.randomUUID().toString();
        } else {
            uuid = this.LJLJL;
        }
        AVExternalServiceImpl.LIZ().asyncService("MusicRecordService", new C62001OUz(this, uuid, str, currentTimeMillis, i, musicModel));
    }

    public OV1(MusicRecordService musicRecordService, Activity activity, OV6 ov6, boolean z, String str, String str2, int i, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, String str7, ShootExtraData shootExtraData, String str8, String str9, Boolean bool4, int i2) {
        this.LJZL = musicRecordService;
        this.LJLIL = activity;
        this.LJLILLLLZI = ov6;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = i;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = str5;
        this.LJLL = bool;
        this.LJLLI = bool2;
        this.LJLLILLLL = bool3;
        this.LJLLJ = str6;
        this.LJLLL = str7;
        this.LJLLLL = shootExtraData;
        this.LJLLLLLL = str8;
        this.LJLZ = str9;
        this.LJZ = bool4;
        this.LJZI = i2;
    }
}
