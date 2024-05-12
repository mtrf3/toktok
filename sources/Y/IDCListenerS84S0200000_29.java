package Y;

import X.ASQ;
import X.ASY;
import X.AbstractC91590Zx4;
import X.C68322mC;
import X.C76800UCe;
import X.C91218Zr4;
import X.C91246ZrW;
import X.C91249ZrZ;
import X.C91264Zro;
import X.C91287ZsB;
import X.C91293ZsH;
import X.C91299ZsN;
import X.C91301ZsP;
import X.C91395Ztv;
import X.C91437Zub;
import X.C91505Zvh;
import X.C91508Zvk;
import X.C91509Zvl;
import X.C91513Zvp;
import X.InterfaceC88471Ynr;
import X.YBM;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.dsp.common.model.DspExtraStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioconver.AudioCoverInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.PlayFullSongAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipPreviewCTAAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipTipsAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDCListenerS84S0200000_29 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        DspUpsellRessoStruct dspUpsellRessoStruct;
        String str;
        String str2;
        Context context = ((View) iDCListenerS84S0200000_29.l0).getContext();
        o.LJIIIIZZ(context, "view.context");
        C91395Ztv c91395Ztv = ((PlayFullSongAssem) iDCListenerS84S0200000_29.l1).LLFII;
        String str3 = null;
        if (c91395Ztv != null) {
            dspUpsellRessoStruct = c91395Ztv.LJLJI;
        } else {
            dspUpsellRessoStruct = null;
        }
        C91218Zr4.LJFF(context, dspUpsellRessoStruct, true, 8);
        Context context2 = ((PlayFullSongAssem) iDCListenerS84S0200000_29.l1).getContext();
        if (context2 != null) {
            C91395Ztv c91395Ztv2 = ((PlayFullSongAssem) iDCListenerS84S0200000_29.l1).LLFII;
            if (c91395Ztv2 != null) {
                str = c91395Ztv2.LJLLI;
                C91301ZsP c91301ZsP = c91395Ztv2.LJLJJI;
                if (c91301ZsP != null) {
                    str3 = c91301ZsP.LJI;
                }
            } else {
                str = null;
            }
            if (C91218Zr4.LIZLLL(context2)) {
                str2 = "other_app";
            } else {
                str2 = "app_store";
            }
            C91249ZrZ.LIZJ("previous_song", null, str3, "resso", str, str2, 34);
        }
    }

    public static final void onClick$1(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        DspUpsellRessoStruct dspUpsellRessoStruct;
        String str;
        String str2;
        Context context = ((View) iDCListenerS84S0200000_29.l0).getContext();
        o.LJIIIIZZ(context, "view.context");
        C91395Ztv c91395Ztv = ((SongClipPreviewCTAAssem) iDCListenerS84S0200000_29.l1).LLFII;
        String str3 = null;
        if (c91395Ztv != null) {
            dspUpsellRessoStruct = c91395Ztv.LJLJI;
        } else {
            dspUpsellRessoStruct = null;
        }
        C91218Zr4.LJ(context, dspUpsellRessoStruct, false, 2);
        Context context2 = ((SongClipPreviewCTAAssem) iDCListenerS84S0200000_29.l1).getContext();
        if (context2 != null) {
            C91395Ztv c91395Ztv2 = ((SongClipPreviewCTAAssem) iDCListenerS84S0200000_29.l1).LLFII;
            if (c91395Ztv2 != null) {
                str = c91395Ztv2.LJLLI;
                C91301ZsP c91301ZsP = c91395Ztv2.LJLJJI;
                if (c91301ZsP != null) {
                    str3 = c91301ZsP.LJI;
                }
            } else {
                str = null;
            }
            if (C91218Zr4.LIZLLL(context2)) {
                str2 = "other_app";
            } else {
                str2 = "app_store";
            }
            C91249ZrZ.LIZJ("preview_mode_cta", null, str3, "resso", str, str2, 34);
        }
    }

    public static final void onClick$2(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        DspUpsellRessoStruct dspUpsellRessoStruct;
        String str;
        String str2;
        Context context = ((View) iDCListenerS84S0200000_29.l0).getContext();
        o.LJIIIIZZ(context, "view.context");
        C91395Ztv c91395Ztv = ((SongClipTipsAssem) iDCListenerS84S0200000_29.l1).LLFZ;
        String str3 = null;
        if (c91395Ztv != null) {
            dspUpsellRessoStruct = c91395Ztv.LJLJI;
        } else {
            dspUpsellRessoStruct = null;
        }
        C91218Zr4.LJ(context, dspUpsellRessoStruct, false, 1);
        Context context2 = ((SongClipTipsAssem) iDCListenerS84S0200000_29.l1).getContext();
        if (context2 != null) {
            C91395Ztv c91395Ztv2 = ((SongClipTipsAssem) iDCListenerS84S0200000_29.l1).LLFZ;
            if (c91395Ztv2 != null) {
                str = c91395Ztv2.LJLLI;
                C91301ZsP c91301ZsP = c91395Ztv2.LJLJJI;
                if (c91301ZsP != null) {
                    str3 = c91301ZsP.LJI;
                }
            } else {
                str = null;
            }
            if (C91218Zr4.LIZLLL(context2)) {
                str2 = "other_app";
            } else {
                str2 = "app_store";
            }
            C91249ZrZ.LIZJ("preview_mode_tips", null, str3, "resso", str, str2, 34);
        }
    }

    public static final void onClick$3(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        AbstractC91590Zx4 HS;
        C91437Zub FP;
        if (((AudioCoverInfoAssem) iDCListenerS84S0200000_29.l0).LLIFFJFJJ) {
            if (((C91395Ztv) iDCListenerS84S0200000_29.l1).LJLJJLL) {
                YBM.LIZ.getClass();
                if (!YBM.LIZIZ()) {
                    return;
                }
            } else {
                return;
            }
        }
        if (((AudioCoverInfoAssem) iDCListenerS84S0200000_29.l0).LLIFFJFJJ) {
            YBM.LIZ.getClass();
            if (YBM.LIZIZ()) {
                ExpiredPlayableManager.INSTANCE.getWhitePreviewPlayableSet().add(((C91395Ztv) iDCListenerS84S0200000_29.l1).LJLIL);
                IAudioPlayerAbility Z3 = ((AudioCoverInfoAssem) iDCListenerS84S0200000_29.l0).Z3();
                if (Z3 != null && (FP = Z3.FP()) != null) {
                    FP.LJFF(true);
                }
            }
        }
        IAudioPlayerAbility LIZJ = C91264Zro.LIZJ((AudioCoverInfoAssem) iDCListenerS84S0200000_29.l0);
        if (LIZJ != null && (HS = LIZJ.HS()) != null) {
            AudioCoverInfoAssem audioCoverInfoAssem = (AudioCoverInfoAssem) iDCListenerS84S0200000_29.l0;
            C91395Ztv c91395Ztv = (C91395Ztv) iDCListenerS84S0200000_29.l1;
            if (HS.LJIJI().isPlayingState()) {
                HS.LJIL(new C91299ZsN("PAUSE_FROM_USER_PAUSE"));
                return;
            }
            Object LIZ = audioCoverInfoAssem.LLI.LIZ(audioCoverInfoAssem, AudioCoverInfoAssem.LLII[0]);
            String str = c91395Ztv.LJLJJL;
            LIZ.getClass();
            ExpirePlayableVM.hv0(str, false);
            C91287ZsB.LIZ(HS, new C91299ZsN("PLAY_FROM_USER_CLICK"), 2);
        }
    }

    public static final void onClick$4(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        C91513Zvp c91513Zvp = (C91513Zvp) iDCListenerS84S0200000_29.l0;
        InterfaceC88471Ynr<String, Context, C76800UCe> interfaceC88471Ynr = c91513Zvp.LJLJJLL;
        if (interfaceC88471Ynr != null) {
            String str = c91513Zvp.LJLIL;
            Context context = ((View) iDCListenerS84S0200000_29.l1).getContext();
            o.LJIIIIZZ(context, "context");
            interfaceC88471Ynr.invoke(str, context);
        }
    }

    public static final void onClick$5(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        ((C91505Zvh) iDCListenerS84S0200000_29.l0).getClass();
        Context context = ((View) iDCListenerS84S0200000_29.l1).getContext();
        o.LJIIIIZZ(context, "context");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$6(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        C91246ZrW c91246ZrW = (C91246ZrW) ((C68322mC) iDCListenerS84S0200000_29.l0).element;
        if (c91246ZrW != null) {
            c91246ZrW.LIZJ = true;
            C91249ZrZ.LIZLLL(c91246ZrW.LIZ, c91246ZrW.LIZIZ, "confirm");
        }
        View contentView = (View) iDCListenerS84S0200000_29.l1;
        o.LJIIIIZZ(contentView, "contentView");
        ASQ.LIZLLL(contentView, ASY.LIZ);
    }

    public static final void onClick$7(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        DspUpsellRessoStruct dspUpsellRessoStruct;
        String str;
        Context context = ((View) iDCListenerS84S0200000_29.l0).getContext();
        o.LJIIIIZZ(context, "context");
        DspExtraStruct dspExtraStruct = ((C91508Zvk) iDCListenerS84S0200000_29.l1).LJLJJL;
        if (dspExtraStruct != null) {
            dspUpsellRessoStruct = dspExtraStruct.getUpsellResso();
        } else {
            dspUpsellRessoStruct = null;
        }
        C91218Zr4.LJFF(context, dspUpsellRessoStruct, false, 12);
        Context context2 = ((View) iDCListenerS84S0200000_29.l0).getContext();
        o.LJIIIIZZ(context2, "context");
        if (C91218Zr4.LIZLLL(context2)) {
            str = "open_resso";
        } else {
            str = "download_resso";
        }
        C91508Zvk c91508Zvk = (C91508Zvk) iDCListenerS84S0200000_29.l1;
        C91395Ztv c91395Ztv = c91508Zvk.LJLJJLL;
        if (c91395Ztv != null) {
            String LIZ = C91293ZsH.LIZ(c91508Zvk.LJLJL);
            C91301ZsP c91301ZsP = c91395Ztv.LJLJJI;
            C91249ZrZ.LJIILJJIL(LIZ, c91301ZsP, "stream_limit", str, c91301ZsP.LJ, "artist", c91508Zvk.LJLIL);
        }
    }

    public static final void onClick$8(IDCListenerS84S0200000_29 iDCListenerS84S0200000_29, View view) {
        DspUpsellRessoStruct dspUpsellRessoStruct;
        String str;
        Context context = ((View) iDCListenerS84S0200000_29.l0).getContext();
        o.LJIIIIZZ(context, "context");
        DspExtraStruct dspExtraStruct = ((C91509Zvl) iDCListenerS84S0200000_29.l1).LJLJLLL;
        if (dspExtraStruct != null) {
            dspUpsellRessoStruct = dspExtraStruct.getUpsellResso();
        } else {
            dspUpsellRessoStruct = null;
        }
        C91218Zr4.LJFF(context, dspUpsellRessoStruct, false, 12);
        Context context2 = ((View) iDCListenerS84S0200000_29.l0).getContext();
        o.LJIIIIZZ(context2, "context");
        if (C91218Zr4.LIZLLL(context2)) {
            str = "open_resso";
        } else {
            str = "download_resso";
        }
        C91509Zvl c91509Zvl = (C91509Zvl) iDCListenerS84S0200000_29.l1;
        C91395Ztv c91395Ztv = c91509Zvl.LJLL;
        if (c91395Ztv != null) {
            String LIZ = C91293ZsH.LIZ(c91509Zvl.LJLLI);
            C91301ZsP c91301ZsP = c91395Ztv.LJLJJI;
            C91249ZrZ.LJIILJJIL(LIZ, c91301ZsP, "stream_limit", str, c91301ZsP.LJ, "track", c91509Zvl.LJLIL);
        }
    }

    public IDCListenerS84S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
