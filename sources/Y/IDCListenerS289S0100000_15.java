package Y;

import X.AbstractC86252XtA;
import X.C188727au;
import X.C60903NvH;
import X.C86200XsK;
import X.C86V;
import X.FMX;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.XZG;
import X.XZH;
import X.Y47;
import android.content.DialogInterface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDCListenerS289S0100000_15 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            case 3:
                onCancel$3(this, dialogInterface);
                return;
            case 4:
                onCancel$4(this, dialogInterface);
                return;
            case 5:
                onCancel$5(this, dialogInterface);
                return;
            case 6:
                onCancel$6(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS289S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS289S0100000_15 iDCListenerS289S0100000_15, DialogInterface dialogInterface) {
        ((AbstractC86252XtA) iDCListenerS289S0100000_15.l0).LIZ(0, "uploadCancel");
    }

    public static final void onCancel$1(IDCListenerS289S0100000_15 iDCListenerS289S0100000_15, DialogInterface dialogInterface) {
        C86200XsK c86200XsK = (C86200XsK) iDCListenerS289S0100000_15.l0;
        if (c86200XsK.LIZIZ.get() != null) {
            c86200XsK.LIZIZ.get().cancelUpload();
        }
    }

    public static final void onCancel$2(IDCListenerS289S0100000_15 iDCListenerS289S0100000_15, DialogInterface dialogInterface) {
        C60903NvH.LJJI(((Y47) iDCListenerS289S0100000_15.l0).LIZIZ, "cancel");
    }

    public static final void onCancel$3(IDCListenerS289S0100000_15 iDCListenerS289S0100000_15, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDCListenerS289S0100000_15.l0).invoke();
    }

    public static final void onCancel$4(IDCListenerS289S0100000_15 iDCListenerS289S0100000_15, DialogInterface dialogInterface) {
        C60903NvH.LJJI(((Y47) iDCListenerS289S0100000_15.l0).LIZIZ, "cancel");
    }

    public static final void onCancel$5(IDCListenerS289S0100000_15 iDCListenerS289S0100000_15, DialogInterface dialogInterface) {
        String str;
        int i;
        VerticalMusicView verticalMusicView = (VerticalMusicView) iDCListenerS289S0100000_15.l0;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(verticalMusicView.LJLILLLLZI.Z9().LIZIZ());
        XZH xzh = verticalMusicView.LJLJL;
        if (xzh != null) {
            String str2 = xzh.LJII;
            if (extractAVMusic == null || (str = extractAVMusic.getMusicId()) == null) {
                str = "";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "video_edit_page");
            if (str2 == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("creation_id", str2);
            c188727au.LJIIIZ("close_method", "click_blank");
            c188727au.LJIIIZ("selected_music_id", str);
            FMX.LJIIL("close_music_panel", c188727au.LIZ);
            boolean z = true;
            if (verticalMusicView.LLIZLLLIL.LJIIL.getMusicStatus() == 12) {
                if (verticalMusicView.LLIZLLLIL.LJIIJJI.length() > 0) {
                    verticalMusicView.LJLILLLLZI.E5((IStsPrepareHelper) verticalMusicView.LLJJIJI.getValue(), verticalMusicView.LLIZLLLIL.LJIIJJI);
                }
                StsAssetModel stsAssetModel = verticalMusicView.LLIZLLLIL.LJIILIIL;
                MusicModel musicModel = verticalMusicView.LLJJI;
                if (musicModel == null || !musicModel.isSpeechToSong()) {
                    z = false;
                }
                verticalMusicView.LJJIJIIJI(stsAssetModel, z);
            } else if (extractAVMusic == null || !extractAVMusic.isSpeechToSong()) {
                verticalMusicView.LLIZLLLIL.LJIIL.setMusicId("");
                verticalMusicView.LLIZLLLIL.LJIIL.setName(C86V.LJFF(R.string.rhu));
                XZG xzg = verticalMusicView.LLIZLLLIL;
                xzg.LJIILIIL = null;
                MusicModel musicModel2 = xzg.LJIIL;
                if (musicModel2.getMusicStatus() == 10) {
                    i = 10;
                } else {
                    i = 11;
                }
                musicModel2.setMusicStatus(i);
                MusicModel musicModel3 = (MusicModel) ORZ.LJLLLL(verticalMusicView.LLIZLLLIL.LIZ);
                if (musicModel3 != null && musicModel3.isSpeechToSong() && musicModel3.getMusicStatus() == 10) {
                    ListProtector.remove(verticalMusicView.LLIZLLLIL.LIZ, 0);
                }
            }
            ((VerticalMusicView) iDCListenerS289S0100000_15.l0).LJJIIZ();
            XZH xzh2 = ((VerticalMusicView) iDCListenerS289S0100000_15.l0).LJLJL;
            if (xzh2 != null) {
                xzh2.LJIILJJIL.X9(false);
                XZH xzh3 = ((VerticalMusicView) iDCListenerS289S0100000_15.l0).LJLJL;
                if (xzh3 != null) {
                    xzh3.LJIILJJIL.Y9();
                    return;
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            o.LJIJI("params");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    public static final void onCancel$6(IDCListenerS289S0100000_15 iDCListenerS289S0100000_15, DialogInterface dialogInterface) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDCListenerS289S0100000_15.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
