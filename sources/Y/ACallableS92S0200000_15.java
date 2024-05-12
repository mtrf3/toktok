package Y;

import X.ActivityC45651qj;
import X.C06460Ne;
import X.C06830Op;
import X.C188727au;
import X.C1CD;
import X.C25070yd;
import X.C25080ye;
import X.C26045AKb;
import X.C2KB;
import X.C35755E1n;
import X.C55063LjH;
import X.C55683LtH;
import X.C62707OjH;
import X.C76800UCe;
import X.C85057XZt;
import X.C86848Y6q;
import X.C86850Y6s;
import X.C86853Y6v;
import X.C86856Y6y;
import X.C86857Y6z;
import X.ED5;
import X.EF7;
import X.InterfaceC26157AOj;
import X.InterfaceC38263Ezz;
import X.InterfaceC84870XSo;
import X.InterfaceC86851Y6t;
import X.M5G;
import X.OSZ;
import X.X1D;
import X.XAL;
import X.XSX;
import X.XTH;
import X.XTK;
import X.Y70;
import X.Y71;
import X.Y72;
import X.YHK;
import X.YHS;
import X.YHT;
import X.YHV;
import X.YHY;
import X.YX3;
import android.database.Cursor;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ACallableS92S0200000_15 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case 24:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            default:
                return null;
        }
    }

    public final void finalize() {
        switch (this.$t) {
            case 0:
                finalize$0(this);
                return;
            default:
                super.finalize();
                return;
        }
    }

    public static final Object call$0(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        Long valueOf;
        String string;
        Cursor LIZIZ = C25080ye.LIZIZ(((YX3) aCallableS92S0200000_15.l1).LIZ, (C1CD) aCallableS92S0200000_15.l0, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "rid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "time");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "channel");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "share_type");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                C62707OjH c62707OjH = new C62707OjH();
                c62707OjH.LIZ = LIZIZ.getInt(LIZIZ2);
                Integer num = null;
                if (LIZIZ.isNull(LIZIZ3)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(LIZIZ.getLong(LIZIZ3));
                }
                c62707OjH.LIZIZ = valueOf;
                if (LIZIZ.isNull(LIZIZ4)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ4);
                }
                c62707OjH.LIZJ = string;
                if (!LIZIZ.isNull(LIZIZ5)) {
                    num = Integer.valueOf(LIZIZ.getInt(LIZIZ5));
                }
                c62707OjH.LIZLLL = num;
                arrayList.add(c62707OjH);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
        }
    }

    public static final Object call$1(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        EffectPlatform effectPlatform = (EffectPlatform) aCallableS92S0200000_15.l0;
        Effect effect = (Effect) aCallableS92S0200000_15.l1;
        EffectManager effectManager = effectPlatform.LJLIL.LIZIZ;
        if (effectManager == null || effect == null) {
            return null;
        }
        effectManager.getEffectPlatform().LJIILIIL(effect);
        return null;
    }

    public static final Object call$10(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LJIIJ = C86850Y6s.LIZIZ.LJIIJ();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LJIIJ.LJI);
        Integer num = LJIIJ.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$11(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        C86853Y6v LJFF = C86850Y6s.LIZIZ.LJFF();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        Boolean bool = null;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC86851Y6t.class, str);
        C86848Y6q c86848Y6q = (C86848Y6q) aCallableS92S0200000_15.l0;
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) LIZJ;
        interfaceC86851Y6t.setVopCode(LJFF.LJI);
        InterfaceC38263Ezz interfaceC38263Ezz2 = c86848Y6q.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            str2 = interfaceC38263Ezz2.LIZIZ();
        } else {
            str2 = null;
        }
        Y70 y70 = (Y70) ED5.LIZJ(Y70.class, str2);
        C86856Y6y c86856Y6y = LJFF.LJ;
        if (c86856Y6y != null) {
            str3 = c86856Y6y.LIZIZ;
        } else {
            str3 = null;
        }
        y70.setSpeakerId(str3);
        C86856Y6y c86856Y6y2 = LJFF.LJ;
        if (c86856Y6y2 != null) {
            l = c86856Y6y2.LIZJ;
        } else {
            l = null;
        }
        y70.setFinishedTime(l);
        C86856Y6y c86856Y6y3 = LJFF.LJ;
        if (c86856Y6y3 != null) {
            str4 = c86856Y6y3.LIZLLL;
        } else {
            str4 = null;
        }
        y70.setUpdateTime(str4);
        C86856Y6y c86856Y6y4 = LJFF.LJ;
        if (c86856Y6y4 != null) {
            bool = c86856Y6y4.LIZ;
        }
        y70.setPrivate(bool);
        interfaceC86851Y6t.setVopSpeakerInfo(y70);
        Integer num = LJFF.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LJIILIIL = C86850Y6s.LIZIZ.LJIILIIL();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LJIILIIL.LJI);
        Integer num = LJIILIIL.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LJIIL = C86850Y6s.LIZIZ.LJIIL();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LJIIL.LJI);
        Integer num = LJIIL.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$14(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LJI = C86850Y6s.LIZIZ.LJI();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LJI.LJI);
        Integer num = LJI.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v preparePlayer = C86850Y6s.LIZIZ.preparePlayer();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(preparePlayer.LJI);
        Integer num = preparePlayer.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v play = C86850Y6s.LIZIZ.play();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(play.LJI);
        Integer num = play.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error: total duration is 0", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$17(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v stop = C86850Y6s.LIZIZ.stop();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(stop.LJI);
        Integer num = stop.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LJIIIZ = C86850Y6s.LIZIZ.LJIIIZ();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LJIIIZ.LJI);
        interfaceC86851Y6t.setAudioPlayProgress(LJIIIZ.LJFF);
        Integer num = LJIIIZ.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "client error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$19(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v destroyEngine = C86850Y6s.LIZIZ.destroyEngine();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(destroyEngine.LJI);
        Integer num = destroyEngine.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "client error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        ((XTK) aCallableS92S0200000_15.l0).LIZ.LIZIZ((XAL) aCallableS92S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$20(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v currentState = C86850Y6s.LIZIZ.getCurrentState();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(currentState.LJI);
        interfaceC86851Y6t.setVopState(currentState.LIZ);
        Integer num = currentState.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$21(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LJ = C86850Y6s.LIZIZ.LJ();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LJ.LJI);
        Integer num = LJ.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$22(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LIZLLL = C86850Y6s.LIZIZ.LIZLLL();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LIZLLL.LJI);
        Integer num = LIZLLL.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$23(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LIZLLL = C86850Y6s.LIZIZ.LIZLLL();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LIZLLL.LJI);
        Integer num = LIZLLL.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$24(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        String str2;
        String str3;
        C86853Y6v LJIIIIZZ = C86850Y6s.LIZIZ.LJIIIIZZ();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        Integer num = null;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC86851Y6t.class, str);
        C86848Y6q c86848Y6q = (C86848Y6q) aCallableS92S0200000_15.l0;
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) LIZJ;
        interfaceC86851Y6t.setVopCode(LJIIIIZZ.LJI);
        InterfaceC38263Ezz interfaceC38263Ezz2 = c86848Y6q.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            str2 = interfaceC38263Ezz2.LIZIZ();
        } else {
            str2 = null;
        }
        Y71 y71 = (Y71) ED5.LIZJ(Y71.class, str2);
        C35755E1n c35755E1n = LJIIIIZZ.LIZJ;
        if (c35755E1n != null) {
            str3 = c35755E1n.LIZ;
        } else {
            str3 = null;
        }
        y71.setTextJson(str3);
        C35755E1n c35755E1n2 = LJIIIIZZ.LIZJ;
        if (c35755E1n2 != null) {
            num = c35755E1n2.LIZIZ;
        }
        y71.setTextState(num);
        interfaceC86851Y6t.setVopTextState(y71);
        Integer num2 = LJIIIIZZ.LJI;
        if (num2 == null || num2.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$25(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        C86853Y6v LJIIJJI = C86850Y6s.LIZIZ.LJIIJJI();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        Integer num3 = null;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC86851Y6t.class, str);
        C86848Y6q c86848Y6q = (C86848Y6q) aCallableS92S0200000_15.l0;
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) LIZJ;
        interfaceC86851Y6t.setVopCode(LJIIJJI.LJI);
        InterfaceC38263Ezz interfaceC38263Ezz2 = c86848Y6q.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            str2 = interfaceC38263Ezz2.LIZIZ();
        } else {
            str2 = null;
        }
        Y72 y72 = (Y72) ED5.LIZJ(Y72.class, str2);
        C86857Y6z c86857Y6z = LJIIJJI.LIZLLL;
        if (c86857Y6z != null) {
            num = c86857Y6z.LIZ;
        } else {
            num = null;
        }
        y72.setRequiredTextNum(num);
        C86857Y6z c86857Y6z2 = LJIIJJI.LIZLLL;
        if (c86857Y6z2 != null) {
            num2 = c86857Y6z2.LIZIZ;
        } else {
            num2 = null;
        }
        y72.setSuccessTextNum(num2);
        C86857Y6z c86857Y6z3 = LJIIJJI.LIZLLL;
        if (c86857Y6z3 != null) {
            num3 = c86857Y6z3.LIZJ;
        }
        y72.setUsedTextNum(num3);
        interfaceC86851Y6t.setRecordStatus(y72);
        Integer num4 = LJIIJJI.LJI;
        if (num4 == null || num4.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$26(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LIZIZ = C86850Y6s.LIZIZ.LIZIZ();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LIZIZ.LJI);
        interfaceC86851Y6t.setBlueToothConnected(LIZIZ.LJII);
        Integer num = LIZIZ.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "client error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$27(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LIZ = C86850Y6s.LIZIZ.LIZ();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LIZ.LJI);
        Integer num = LIZ.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "client error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        ActivityC45651qj mo49getActivity = ((InboxFragment) aCallableS92S0200000_15.l0).mo49getActivity();
        if (mo49getActivity != null) {
            InterfaceC26157AOj interfaceC26157AOj = (InterfaceC26157AOj) aCallableS92S0200000_15.l1;
            InboxFragment inboxFragment = (InboxFragment) aCallableS92S0200000_15.l0;
            if (interfaceC26157AOj.shouldShowUpsell2svHVAPopUp(mo49getActivity) && inboxFragment.isVisible()) {
                C85057XZt c85057XZt = new C85057XZt(0);
                String string = inboxFragment.getString(R.string.t9r);
                o.LJIIIIZZ(string, "getString(R.string.twosvHVA_2svModal_title)");
                c85057XZt.LIZIZ = string;
                String string2 = inboxFragment.getString(R.string.t9q);
                o.LJIIIIZZ(string2, "getString(R.string.twosvHVA_2svModal_desc)");
                c85057XZt.LIZJ = string2;
                String string3 = inboxFragment.getString(R.string.t9s);
                o.LJIIIIZZ(string3, "getString(R.string.twosvHVA_2svModal_turnOnBtn)");
                c85057XZt.LJ = string3;
                c85057XZt.LJFF = "notification_page";
                interfaceC26157AOj.upsell2svHVAPopTask(mo49getActivity, c85057XZt);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        InterfaceC84870XSo interfaceC84870XSo = (InterfaceC84870XSo) aCallableS92S0200000_15.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicFetcher music id is invalid : ");
        LIZ.append(((MusicModel) aCallableS92S0200000_15.l1).getId());
        interfaceC84870XSo.LIZ(new XSX(5, X1D.LIZIZ(LIZ)));
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        ((XTH) aCallableS92S0200000_15.l0).LIZ.LIZ((XSX) aCallableS92S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        ((M5G) aCallableS92S0200000_15.l0).onFailed((Exception) aCallableS92S0200000_15.l1);
        return null;
    }

    public static final Object call$7(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        ((M5G) aCallableS92S0200000_15.l0).onFailed((Exception) aCallableS92S0200000_15.l1);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$8(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        OSZ osz;
        int intValue;
        YHV yhv;
        Fragment fragment;
        RankData rankData;
        YHT yht = (YHT) aCallableS92S0200000_15.l0;
        C55063LjH c55063LjH = yht.LIZIZ;
        YHY yhy = yht.LIZ.LJ;
        List list = (List) aCallableS92S0200000_15.l1;
        if (c55063LjH != null && yhy != null) {
            YHS.LIZ.getClass();
            List LIZ = YHS.LIZ(c55063LjH);
            List<YHV> list2 = yht.LIZLLL;
            String str = null;
            String str2 = "";
            int i = -1;
            if (list.size() < list2.size()) {
                osz = new OSZ("", -1);
            } else {
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (((RankData) ListProtector.get(list, i2)).isAd() && !o.LJ(((YHV) ListProtector.get(list2, i2)).getRankData().getAid(), ((RankData) ListProtector.get(list, i2)).getAid())) {
                            osz = new OSZ(((RankData) ListProtector.get(list, i2)).getAid(), Integer.valueOf(i2));
                            break;
                        }
                        i2++;
                    } else {
                        osz = null;
                        break;
                    }
                }
            }
            if (osz == null) {
                YHK yhk = yht.LIZ;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("status", "request_success_no_diff");
                YHS.LIZ.getClass();
                YHS.LIZJ(c188727au, yhk);
            } else {
                YHK yhk2 = yht.LIZ;
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("status", "start_rerank");
                YHS.LIZ.getClass();
                YHS.LIZJ(c188727au2, yhk2);
                if (c55063LjH.LIZ() != yhy.LJLJI) {
                    YHT.LIZJ(yht, yht.LIZ, false, list, "user swiped", null, 16);
                } else {
                    OSZ osz2 = new OSZ(osz.getFirst(), Integer.valueOf((((Number) osz.getSecond()).intValue() + yhy.LJLIL) - yht.LIZLLL.size()));
                    int LIZ2 = c55063LjH.LIZ() + yht.LIZJ;
                    int i3 = yhy.LJLIL - 1;
                    if (LIZ2 > i3 || ((!ujb.o.LJJJJJL((CharSequence) osz2.getFirst()) || ((Number) osz2.getSecond()).intValue() != -1) && (LIZ2 > (intValue = ((Number) osz2.getSecond()).intValue()) || intValue > i3))) {
                        YHK yhk3 = yht.LIZ;
                        StringBuilder LIZJ = C06460Ne.LIZJ("index not valid, begin ", LIZ2, ", end ", i3, ", compare result ");
                        LIZJ.append(osz2);
                        YHT.LIZJ(yht, yhk3, false, list, X1D.LIZIZ(LIZJ), null, 16);
                    } else {
                        C55683LtH.LIZJ = true;
                        int size2 = LIZ.size();
                        while (true) {
                            if (LIZ2 < size2) {
                                if (((Aweme) ListProtector.get(LIZ, LIZ2)).isAd()) {
                                    yhv = yht.LJ.remove(((Aweme) ListProtector.get(LIZ, LIZ2)).getAid());
                                    if (yhv != null) {
                                        yht.LJFF.LJIJ(true);
                                        Aweme aweme = yhv.getRankData().getOriginItem();
                                        o.LJIIIZ(aweme, "aweme");
                                        c55063LjH.LIZ.LJJJJZI(LIZ2, aweme);
                                        str2 = yhv.getRankData().getAid();
                                        i = LIZ2;
                                    }
                                } else {
                                    LIZ2++;
                                }
                            } else {
                                yhv = null;
                                break;
                            }
                        }
                        Object first = osz2.getFirst();
                        if (yhv != null && (rankData = yhv.getRankData()) != null) {
                            str = rankData.getAid();
                        }
                        if (o.LJ(first, str)) {
                            yht.LJ.put(osz2.getFirst(), yhv);
                            int intValue2 = ((Number) osz2.getSecond()).intValue();
                            Aweme aweme2 = yhv.getRankData().getOriginItem();
                            o.LJIIIZ(aweme2, "aweme");
                            c55063LjH.LIZ.insertItemList(new C2KB<>(intValue2, "ad_rerank", Collections.singletonList(aweme2)));
                            if (o.LJ("local_test", EF7.LJIILIIL) && (fragment = c55063LjH.LIZ.getFragment()) != null) {
                                C26045AKb c26045AKb = new C26045AKb(fragment);
                                StringBuilder LIZ3 = C06830Op.LIZ("delete ", i, ", item aid ", str2, ", insert into ");
                                LIZ3.append(((Number) osz2.getSecond()).intValue());
                                c26045AKb.LJIIIZ(X1D.LIZIZ(LIZ3));
                                c26045AKb.LJIIJ();
                            }
                        }
                        yht.LJFF.LJIJ(false);
                        YHT.LIZJ(yht, yht.LIZ, true, list, null, null, 24);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        String str;
        C86853Y6v LJII = C86850Y6s.LIZIZ.LJII();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C86848Y6q) aCallableS92S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC86851Y6t interfaceC86851Y6t = (InterfaceC86851Y6t) ED5.LIZJ(InterfaceC86851Y6t.class, str);
        interfaceC86851Y6t.setVopCode(LJII.LJI);
        interfaceC86851Y6t.setQualityResult(LJII.LIZIZ);
        Integer num = LJII.LJI;
        if (num == null || num.intValue() != 0) {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onFailure(0, "sdk error", interfaceC86851Y6t);
        } else {
            ((CompletionBlock) aCallableS92S0200000_15.l1).onSuccess(interfaceC86851Y6t, "");
        }
        return C76800UCe.LIZ;
    }

    public static final void finalize$0(ACallableS92S0200000_15 aCallableS92S0200000_15) {
        ((C1CD) aCallableS92S0200000_15.l0).LIZLLL();
    }

    public ACallableS92S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
