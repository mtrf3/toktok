package com.ss.android.ugc.aweme.music.service;

import X.C10I;
import X.C10K;
import X.C168386jC;
import X.C26045AKb;
import X.C53006KrC;
import X.C5S1;
import X.C84913XUf;
import X.HG3;
import X.HWG;
import X.HWH;
import X.HWI;
import X.HWK;
import X.OV1;
import X.OV6;
import X.RBX;
import X.RunnableC40339FsN;
import X.V1B;
import Y.ACallableS115S0100000_12;
import Y.ARunnableS14S0400000_10;
import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class MusicRecordService implements IMusicRecordService {
    public long LIZIZ;
    public HWH LIZJ;
    public HWH LIZLLL;
    public C84913XUf LJ;
    public boolean LJFF;
    public boolean LJII;
    public boolean LIZ = true;
    public boolean LJI = true;

    public static ArrayList LIZ(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            this.LJFF = false;
            HWH hwh = this.LIZLLL;
            if (hwh != null) {
                V1B.LJLILLLLZI(hwh);
            }
            this.LIZLLL = null;
        }
        HWH hwh2 = this.LIZJ;
        if (hwh2 != null) {
            hwh2.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(Activity activity, final MusicModel musicModel, OV6 ov6, Boolean bool) {
        if (bool.booleanValue() && (activity instanceof LifecycleOwner)) {
            this.LJFF = true;
            new SafeHandler((LifecycleOwner) activity).postDelayed(new RunnableC40339FsN(2, this, activity, musicModel), 300L);
        } else {
            if (ov6 != null) {
                ov6.LJFF(musicModel);
            }
            this.LIZJ = HWG.LIZIZ(activity, HWK.VISIBLE_AFTER_5S, new HWI() { // from class: X.OV9
                @Override // X.HWI
                public final void LIZIZ() {
                    MusicRecordService musicRecordService = MusicRecordService.this;
                    MusicModel musicModel2 = musicModel;
                    musicRecordService.LJII = true;
                    musicRecordService.LJ.LIZ(musicModel2.getMusicId());
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, OV6 ov6, int i, boolean z, String str3, int i2, String str4, String str5, Boolean bool) {
        Boolean bool2 = Boolean.FALSE;
        startRecord(lifecycleOwner, activity, musicModel, str, str2, ov6, i, z, str3, i2, str4, str5, null, bool2, null, bool, bool2, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, OV6 ov6, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData) {
        startRecord(lifecycleOwner, activity, musicModel, str, str2, ov6, i, z, str3, i2, str4, str5, str6, bool, str7, bool2, bool3, str8, str9, shootExtraData, true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, OV6 ov6, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2) {
        startRecord(lifecycleOwner, activity, musicModel, str, str2, ov6, i, z, str3, i2, str4, str5, str6, bool, str7, bool2, bool3, str8, str9, shootExtraData, z2, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, final Activity activity, final MusicModel musicModel, final String str, String str2, OV6 ov6, final int i, final boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, Boolean bool4) {
        String str10;
        if (((RBX) HG3.LJIILL()).getCurUser().isLive()) {
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZJ(R.string.hjl);
            c5s1.LJ();
            return;
        }
        if (!AVExternalServiceImpl.LIZ().publishService().checkIsAlreadyPublished(activity)) {
            return;
        }
        if (musicModel != null && !MusicService.LJJLIIIJJI().LJJIL(musicModel, activity, true)) {
            return;
        }
        if (!C168386jC.LIZ && 0 == 0 && musicModel != null) {
            musicModel.setMusicVolumeInfo(null);
        }
        this.LIZIZ = System.currentTimeMillis();
        C84913XUf c84913XUf = new C84913XUf(activity, new OV1(this, activity, ov6, z, str8, str3, i2, str6, str4, str5, bool, bool2, bool4, str7, str9, shootExtraData, str, str2, bool3, i), true);
        this.LJ = c84913XUf;
        c84913XUf.LIZJ = str7;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.music.service.MusicRecordService.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                MusicRecordService musicRecordService = MusicRecordService.this;
                musicRecordService.LIZ = false;
                musicRecordService.LJ.LIZIZ();
            }
        });
        this.LJI = true;
        this.LJII = false;
        if (!z) {
            if (!bool.booleanValue()) {
                LIZJ(activity, musicModel, ov6, Boolean.FALSE);
            } else {
                new Handler().postDelayed(new ARunnableS14S0400000_10(activity, ov6, this, musicModel, 3), 3000L);
            }
        }
        if (((Boolean) C53006KrC.LIZ.getValue()).booleanValue() && !z2) {
            boolean booleanValue = bool.booleanValue();
            if (this.LIZ) {
                this.LJI = false;
                Music music = musicModel.getMusic();
                if (booleanValue && CommerceMediaServiceImpl.LIZJ().LJIILLIIL(music)) {
                    C26045AKb c26045AKb = new C26045AKb(activity);
                    c26045AKb.LJIIIIZZ(R.string.iim);
                    c26045AKb.LJIIJ();
                    LIZIZ(z);
                    return;
                }
                if (music != null && !TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
                    LIZIZ(z);
                    C26045AKb c26045AKb2 = new C26045AKb(activity);
                    c26045AKb2.LJIIIZ(music.getOwnerBanShowInfo());
                    c26045AKb2.LJIIJ();
                    return;
                }
                if (this.LJII) {
                    return;
                }
                C84913XUf c84913XUf2 = this.LJ;
                if (!TextUtils.isEmpty(str)) {
                    ArrayList LIZ = LIZ(str);
                    if (!LIZ.isEmpty()) {
                        str10 = (String) ListProtector.get(LIZ, 0);
                        c84913XUf2.LIZLLL(musicModel, str10, false, i, z, false);
                        return;
                    }
                }
                str10 = null;
                c84913XUf2.LIZLLL(musicModel, str10, false, i, z, false);
                return;
            }
            return;
        }
        final boolean booleanValue2 = bool.booleanValue();
        C10K.LIZJ(new ACallableS115S0100000_12(musicModel, 1)).LJ(new C10I() { // from class: X.OV7
            @Override // X.C10I
            public final Object then(C10K c10k) {
                String str11;
                MusicRecordService musicRecordService = MusicRecordService.this;
                boolean z3 = booleanValue2;
                Activity activity2 = activity;
                boolean z4 = z;
                MusicModel musicModel2 = musicModel;
                String str12 = str;
                int i3 = i;
                if (musicRecordService.LIZ) {
                    musicRecordService.LJI = false;
                    if (c10k.LJIILIIL()) {
                        Music music2 = (Music) c10k.LJIIJJI();
                        if (z3 && CommerceMediaServiceImpl.LIZJ().LJIILLIIL(music2)) {
                            C26045AKb c26045AKb3 = new C26045AKb(activity2);
                            c26045AKb3.LJIIIIZZ(R.string.iim);
                            c26045AKb3.LJIIJ();
                            musicRecordService.LIZIZ(z4);
                        } else if (music2 != null && !TextUtils.isEmpty(music2.getOwnerBanShowInfo())) {
                            musicRecordService.LIZIZ(z4);
                            C26045AKb c26045AKb4 = new C26045AKb(activity2);
                            c26045AKb4.LJIIIZ(music2.getOwnerBanShowInfo());
                            c26045AKb4.LJIIJ();
                        } else if (!musicRecordService.LJII) {
                            C84913XUf c84913XUf3 = musicRecordService.LJ;
                            if (!TextUtils.isEmpty(str12)) {
                                ArrayList LIZ2 = MusicRecordService.LIZ(str12);
                                if (!LIZ2.isEmpty()) {
                                    str11 = (String) ListProtector.get(LIZ2, 0);
                                    c84913XUf3.LIZLLL(musicModel2, str11, false, i3, z4, false);
                                }
                            }
                            str11 = null;
                            c84913XUf3.LIZLLL(musicModel2, str11, false, i3, z4, false);
                        }
                    } else {
                        musicRecordService.LIZIZ(z4);
                    }
                }
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }
}
