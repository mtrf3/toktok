package X;

import Y.AfS54S0100000_2;
import Y.IDaS213S0100000_2;
import Y.IDhS95S0100000_2;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162466Ze {
    public static final /* synthetic */ int LJI = 0;
    public boolean LIZ;
    public VideoPublishEditModel LIZIZ;
    public Context LIZJ;
    public AqS56S1100000_2 LIZLLL;
    public final MutableLiveData<C149405tg<C149465tm>> LJ = new MutableLiveData<>();
    public InterfaceC92693kP LJFF;

    public final C73422Sri LIZ(VideoPublishEditModel videoPublishEditModel, final InterfaceC149485to interfaceC149485to, final boolean z) {
        String str;
        AbstractC73672Svk LJJIJL;
        if (C5WB.LIZ()) {
            LJJIJL = AbstractC73672Svk.LJJI(new RuntimeException());
        } else {
            IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) C60903NvH.LJIIJJI().LJJIJ();
            if (iAnotherMusicService == null) {
                LJJIJL = C73536StY.LJLIL;
                o.LJIIIIZZ(LJJIJL, "empty()");
            } else {
                boolean LJIIJJI = C1JD.LJIIJJI(videoPublishEditModel);
                iAnotherMusicService.LJIL();
                C43014GuQ c43014GuQ = C43014GuQ.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
                String str2 = null;
                if (videoPublishEditModel2 == null || (str = videoPublishEditModel2.mShootWay) == null) {
                    str = "";
                }
                if (videoPublishEditModel != null) {
                    str2 = videoPublishEditModel.getCreationId();
                }
                LJJIJL = c43014GuQ.LIZLLL(str, false, 1, LJIIJJI ? 1 : 0, str2).LJJIJL(QCU.LJLILLLLZI);
            }
        }
        return LJJIJL.LJJLIIIJ(1L).LJJIJL(C41813Gb3.LJLIL).LJJIII(new IDhS95S0100000_2(this, 4), false).LJJIJL(C63183Oqx.LJLILLLLZI).LJJLIIIJJIZ(20L, TimeUnit.SECONDS, AbstractC73672Svk.LJJI(new RuntimeException("load music time out"))).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIL(new AfS54S0100000_2(this, 8)).LJIILLIIL(new IDaS213S0100000_2(this, 1)).LJIJJLI(new InterfaceC64592gB() { // from class: X.5tc
            /* JADX WARN: Type inference failed for: r5v0, types: [X.5tm] */
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str3;
                CreativeModel creativeModel;
                ChangeAvatarModel changeAvatarModel;
                AVMusic it = (AVMusic) obj;
                if (C127694zl.LIZ) {
                    return;
                }
                VideoPublishEditModel videoPublishEditModel3 = C162466Ze.this.LIZIZ;
                if (videoPublishEditModel3 != null && (creativeModel = videoPublishEditModel3.creativeModel) != null && (changeAvatarModel = creativeModel.changeAvatarModel) != null && changeAvatarModel.isFromChangeAvatar) {
                    videoPublishEditModel3.setMusicOrigin("profile_photo");
                }
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(interfaceC149485to.LIZIZ());
                if (extractAVMusic == null || (str3 = extractAVMusic.getMusicId()) == null) {
                    str3 = "";
                }
                boolean z2 = !ujb.o.LJJJJJL(str3);
                MutableLiveData<C149405tg<C149465tm>> mutableLiveData = C162466Ze.this.LJ;
                o.LJIIIIZZ(it, "it");
                C77357UXp.LJJJJI(mutableLiveData, new C149405tg(EnumC149415th.SUCCESS, new F9E(it, z2) { // from class: X.5tm
                    public final AVMusic LJLIL;
                    public final boolean LJLILLLLZI;

                    @Override // X.F9E
                    public final Object[] getObjects() {
                        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
                    }

                    {
                        o.LJIIIZ(it, "music");
                        this.LJLIL = it;
                        this.LJLILLLLZI = z2;
                    }
                }, null, 4));
                if (z2) {
                    return;
                }
                if (z) {
                    H78.LJI("JDW: AUTO MUSIC: musicActivityDetected start setter");
                    VoiceDetectorService.LIZ().setVoiceDetectionListener(1, new C126384xe(new AqS106S0300000_2(C162466Ze.this, it, interfaceC149485to, 6)));
                    return;
                }
                C162466Ze c162466Ze = C162466Ze.this;
                InterfaceC149485to interfaceC149485to2 = interfaceC149485to;
                c162466Ze.getClass();
                interfaceC149485to2.LIZ(it);
                AqS56S1100000_2 aqS56S1100000_2 = c162466Ze.LIZLLL;
                if (aqS56S1100000_2 == null) {
                    return;
                }
                aqS56S1100000_2.invoke(it);
            }
        }).LJIJJ(new AfS54S0100000_2(this, 9));
    }
}
