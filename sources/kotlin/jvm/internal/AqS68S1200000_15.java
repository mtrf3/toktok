package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C162476Zf;
import X.C16880lQ;
import X.C1FM;
import X.C2VP;
import X.C76800UCe;
import X.C84492XEa;
import X.I9Q;
import X.InterfaceC65784Pro;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import X.X1D;
import X.XW2;
import X.XW5;
import X.XZC;
import X.XZH;
import X.XZN;
import X.XZQ;
import X.XZS;
import X.XZX;
import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.knadapt.DataPreProcess;
import java.io.File;

/* loaded from: classes16.dex */
public class AqS68S1200000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS68S1200000_15 aqS68S1200000_15) {
        MusicModel.MusicItemType musicItemType;
        boolean z;
        String str;
        boolean z2;
        XZC xzc;
        String str2;
        String musicId;
        XZQ LJIIL;
        MusicModel musicModel = (MusicModel) aqS68S1200000_15.l1;
        boolean z3 = false;
        if (musicModel != null && o.LJ(XZX.LIZ, musicModel.getMusicId())) {
            MusicModel musicModel2 = (MusicModel) aqS68S1200000_15.l1;
            if (musicModel2 != null) {
                musicItemType = musicModel2.getMusicItemType();
            } else {
                musicItemType = null;
            }
            if (musicItemType == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                z = true;
            } else {
                z = false;
            }
            int i = XW5.LIZ[((VerticalMusicView) aqS68S1200000_15.l2).LLJJIJIIJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        xzc = ((VerticalMusicView) aqS68S1200000_15.l2).LLJJ;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    xzc = ((VerticalMusicView) aqS68S1200000_15.l2).LLJILLL;
                }
                z2 = false;
            } else {
                String str3 = ((VerticalMusicView) aqS68S1200000_15.l2).LLJLIL;
                MusicModel musicModel3 = (MusicModel) aqS68S1200000_15.l1;
                if (musicModel3 != null) {
                    str = musicModel3.getMusicId();
                } else {
                    str = null;
                }
                if (o.LJ(str3, str)) {
                    XZH xzh = ((VerticalMusicView) aqS68S1200000_15.l2).LJLJL;
                    if (xzh != null) {
                        xzh.LJIILJJIL.V9(true);
                        z2 = true;
                    } else {
                        o.LJIJI("params");
                        throw null;
                    }
                } else {
                    z2 = false;
                }
                xzc = ((VerticalMusicView) aqS68S1200000_15.l2).LLJILJILJ;
            }
            ((VerticalMusicView) aqS68S1200000_15.l2).LJJIJIIJIL();
            XZH xzh2 = ((VerticalMusicView) aqS68S1200000_15.l2).LJLJL;
            if (xzh2 != null) {
                XZN xzn = xzh2.LJIILJJIL;
                String str4 = aqS68S1200000_15.s0;
                new I9Q();
                AVMusic LIZ = I9Q.LIZ((MusicModel) aqS68S1200000_15.l1);
                Long valueOf = Long.valueOf(((VerticalMusicView) aqS68S1200000_15.l2).LLJJLIIIJLLLLLLLZ);
                XW2 xw2 = ((VerticalMusicView) aqS68S1200000_15.l2).LLJJIJIIJIL;
                if (xw2 == XW2.TAB_AI) {
                    z3 = true;
                }
                String stringValue = xw2.getStringValue();
                MusicModel musicModel4 = (MusicModel) aqS68S1200000_15.l1;
                if (musicModel4 != null && (musicId = musicModel4.getMusicId()) != null && (LJIIL = ((VerticalMusicView) aqS68S1200000_15.l2).LJIIL()) != null) {
                    str2 = LJIIL.pp(musicId);
                } else {
                    str2 = null;
                }
                XZS.LIZ(xzn, str4, LIZ, valueOf, z3, z, z2, stringValue, str2, 32);
                if (xzc != null) {
                    xzc.LJZ(-1);
                }
                VerticalMusicView verticalMusicView = (VerticalMusicView) aqS68S1200000_15.l2;
                XZH xzh3 = verticalMusicView.LJLJL;
                if (xzh3 != null) {
                    xzh3.LJIILJJIL.U9((MusicModel) aqS68S1200000_15.l1, z2, verticalMusicView.LLJJIJIIJIL.getStringValue(), ((VerticalMusicView) aqS68S1200000_15.l2).LLJJLIIIJLLLLLLLZ);
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS68S1200000_15 aqS68S1200000_15) {
        C1FM c1fm = ((FullEpisodeDetailFragment) aqS68S1200000_15.l1).LLI;
        if (c1fm != null) {
            c1fm.setRenderCacheTexture(aqS68S1200000_15.s0, ((File) aqS68S1200000_15.l2).getAbsolutePath());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS68S1200000_15 aqS68S1200000_15) {
        Context context = (Context) aqS68S1200000_15.l1;
        InterfaceC84498XEg interfaceC84498XEg = C84492XEa.LIZLLL;
        if (interfaceC84498XEg == null) {
            IEffectPlatformFactory LIZ = EffectPlatformFactory.LIZ();
            EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
            effectPlatformBuilder.setContext(context);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLIIJLIL(context).getPath());
            LIZ2.append("/podcast_effect/");
            effectPlatformBuilder.setCacheDir(new File(X1D.LIZIZ(LIZ2)));
            DataPreProcess.enable = true;
            interfaceC84498XEg = LIZ.create(effectPlatformBuilder);
            C84492XEa.LIZLLL = interfaceC84498XEg;
        }
        Effect effect = C84492XEa.LIZJ;
        if (effect != null && interfaceC84498XEg.LJJIL(effect)) {
            ((InterfaceC88472Yns) aqS68S1200000_15.l2).invoke(C84492XEa.LIZJ);
        } else {
            C2VP.LIZ(new AqS162S0200000_15(interfaceC84498XEg, new AqS55S1200000_15((InterfaceC88472Yns) aqS68S1200000_15.l2, (InterfaceC88472Yns<? super Effect, C76800UCe>) interfaceC84498XEg, (InterfaceC84498XEg) aqS68S1200000_15.s0, (String) 2), 79));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1200000_15(Context context, AqS146S0200000_15 aqS146S0200000_15, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = aqS146S0200000_15;
        this.s0 = "audio_mode_podcast_effect";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1200000_15(FullEpisodeDetailFragment fullEpisodeDetailFragment, String str, File file, int i) {
        super(0);
        this.$t = i;
        this.l1 = fullEpisodeDetailFragment;
        this.s0 = str;
        this.l2 = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S1200000_15(MusicModel musicModel, VerticalMusicView verticalMusicView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = musicModel;
        this.l2 = verticalMusicView;
        this.s0 = str;
    }
}
