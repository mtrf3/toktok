package com.ss.android.ugc.aweme.music.assem;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C239729ay;
import X.C45804HyK;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VC;
import X.C9BE;
import X.InterfaceC241869eQ;
import X.InterfaceC47328Iho;
import X.TBT;
import X.XUC;
import X.XUP;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class MusicPlayAssem extends Hilt_MusicPlayAssem implements XUC {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C214298b3 LJLJI;

    public MusicPlayAssem() {
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 411);
        C65776Prg LIZ = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 412), C239729ay.INSTANCE, aqS154S0100000_4);
    }

    @Override // X.XUC
    public final boolean LJJIIZI() {
        return true;
    }

    @Override // X.XUC
    public final /* synthetic */ void LJJJJIZL(MusicModel musicModel, Exception exc) {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLLL(MusicModel musicModel, long j) {
    }

    @Override // X.XUC
    public final /* synthetic */ void T3(MusicModel musicModel) {
    }

    public final MusicPlayViewModel v3() {
        return (MusicPlayViewModel) this.LJLJI.getValue();
    }

    @Override // X.XUC
    public final MusicModel LIZLLL() {
        return v3().LJLJJI;
    }

    @Override // X.XUC
    public final Activity LJJIZ() {
        Context context = getContext();
        if (context != null) {
            return C45804HyK.LJJIFFI(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.assem.Hilt_MusicPlayAssem, X.C8W0
    public final void onCreate() {
        final DataCenter dataCenter;
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            dataCenter = DataCenter.gv0(ViewModelProviders.of(LIZLLL), this);
        } else {
            dataCenter = null;
        }
        MusicPlayViewModel v3 = v3();
        v3.getClass();
        MusicDownloadPlayHelper musicDownloadPlayHelper = new MusicDownloadPlayHelper(this);
        v3.LJLILLLLZI = musicDownloadPlayHelper;
        musicDownloadPlayHelper.LLD = false;
        musicDownloadPlayHelper.LJ();
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = v3.LJLILLLLZI;
        if (musicDownloadPlayHelper2 != null) {
            InterfaceC47328Iho interfaceC47328Iho = new InterfaceC47328Iho() { // from class: X.9eM
                @Override // X.InterfaceC47328Iho
                public final void LIZIZ() {
                    DataCenter dataCenter2 = DataCenter.this;
                    if (dataCenter2 != null) {
                        dataCenter2.jv0(Integer.valueOf(EnumC241749eE.DEFAULT.getValue()), "music_status");
                    }
                }
            };
            musicDownloadPlayHelper2.LLF = interfaceC47328Iho;
            musicDownloadPlayHelper2.LJLJJI.LIZJ(interfaceC47328Iho);
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = v3.LJLILLLLZI;
        if (musicDownloadPlayHelper3 != null) {
            musicDownloadPlayHelper3.LJLJJLL = new XUP() { // from class: X.9eL
                @Override // X.XUP
                public final void LIZ() {
                    DataCenter dataCenter2 = DataCenter.this;
                    if (dataCenter2 != null) {
                        dataCenter2.jv0(Integer.valueOf(EnumC241749eE.PLAYING.getValue()), "music_status");
                    }
                }
            };
        }
        v3.LJLJI = dataCenter;
        if (dataCenter != null) {
            dataCenter.iv0("music_status", v3, false);
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC241869eQ.class), new TBT() { // from class: X.9ax
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240369c0) obj).LJFF;
            }
        }, new AqS170S0100000_4(this, 416));
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        v3().nv0(false);
        MusicPlayViewModel v3 = v3();
        v3.LJLJI = null;
        v3.LJLILLLLZI = null;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        v3().nv0(true);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        MusicDownloadPlayHelper musicDownloadPlayHelper = v3().LJLILLLLZI;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.LJLLLL = false;
        }
    }

    @Override // X.XUC
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        Activity LJJIZ;
        if (musicModel != null && str != null && str2 != null && (LJJIZ = LJJIZ()) != null) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.musicOrigin(str2);
            builder.musicPath(str);
            builder.shootWay("artist_music");
            if (!v3().mv0()) {
                builder.shootFrom("others_homepage");
            } else {
                builder.shootFrom("personal_homepage");
            }
            AVExternalServiceImpl.LIZ().asyncService("OriginMusic", new IDLCallbackS0S0300000_7((ActivityC45651qj) LJJIZ, builder.build(), musicModel, 4));
        }
    }
}
