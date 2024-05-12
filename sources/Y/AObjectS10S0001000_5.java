package Y;

import X.AnonymousClass030;
import X.BFS;
import X.BZI;
import X.C2068389v;
import X.C20880rs;
import X.C20910rv;
import X.C30443Bx9;
import X.C48459J0d;
import X.C76800UCe;
import X.EnumC12540eQ;
import X.GGS;
import X.GGT;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFeedbackSkipSetting;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AObjectS10S0001000_5 implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public AObjectS10S0001000_5(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS10S0001000_5 aObjectS10S0001000_5, Object obj) {
        switch (aObjectS10S0001000_5.i0) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    BFS.LIZIZ().LJII();
                }
                return C76800UCe.LIZ;
            default:
                if (((Boolean) obj).booleanValue()) {
                    C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.d4n, C20880rs.LIZ("ttlive_fragment_live_emoji_input_dialog_optimized_v2"), null, false, 24);
                }
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$1(AObjectS10S0001000_5 aObjectS10S0001000_5, Object obj) {
        switch (aObjectS10S0001000_5.i0) {
            case 0:
                return Boolean.TRUE;
            default:
                return SettingNewVersionFragment.lambda$initUnits$87((C2068389v) obj);
        }
    }

    public static final Object invoke$2(AObjectS10S0001000_5 aObjectS10S0001000_5, Object obj) {
        switch (aObjectS10S0001000_5.i0) {
            case 0:
                return C76800UCe.LIZ;
            default:
                return SettingNewVersionFragment.lambda$maybeCreateRemoveAccountOption$114((C2068389v) obj);
        }
    }

    public static final Object invoke$3(AObjectS10S0001000_5 aObjectS10S0001000_5, Object obj) {
        switch (aObjectS10S0001000_5.i0) {
            case 0:
                return EnumC12540eQ.fromInt(((AnchorLevelPermission) obj).pin);
            case 1:
                BZI bzi = (BZI) obj;
                bzi.LJIJJ("sticker", "features");
                return bzi;
            default:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS50S0101000_5(1, ggt, 4));
                return null;
        }
    }

    public static final Object invoke$4(AObjectS10S0001000_5 aObjectS10S0001000_5, Object obj) {
        switch (aObjectS10S0001000_5.i0) {
            case 0:
                BZI bzi = (BZI) obj;
                bzi.LJIJJ("comment_pin", "features");
                return bzi;
            default:
                return SettingNewVersionFragment.lambda$initUnits$20((C2068389v) obj);
        }
    }

    public static final Object invoke$5(AObjectS10S0001000_5 aObjectS10S0001000_5, Object obj) {
        switch (aObjectS10S0001000_5.i0) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    AnonymousClass030.LJFF(InterfaceC30442Bx8.LLILZIL);
                    InterfaceC30442Bx8.LLILZLL.LIZ(0);
                    InterfaceC30442Bx8.LLIZLLLIL.LIZ(Integer.valueOf(CastIntegerProtector.parseInt(C30443Bx9.LIZ())));
                } else {
                    C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLILZLL;
                    c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
                    Integer LIZJ = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ, "MULTI_CO_HOST_FEEDBACK_SKIP_COUNT.value");
                    if (LIZJ.intValue() >= 3) {
                        c48459J0d.LIZ(0);
                        InterfaceC30442Bx8.LLIZ.LIZ(Long.valueOf((LiveCohostFeedbackSkipSetting.INSTANCE.getValue() * 86400000) + System.currentTimeMillis()));
                    }
                }
                return C76800UCe.LIZ;
            case 1:
                Aweme aweme = (Aweme) obj;
                if (aweme != null) {
                    return aweme.getAid();
                }
                return null;
            default:
                return SettingNewVersionFragment.lambda$setWallpaperEntranceVisibility$119((C2068389v) obj);
        }
    }

    public static final Object invoke$6(AObjectS10S0001000_5 aObjectS10S0001000_5, Object obj) {
        switch (aObjectS10S0001000_5.i0) {
            case 0:
                BZI bzi = (BZI) obj;
                bzi.LJIJJ("intro", "features");
                return bzi;
            case 1:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS47S0101000_2(0, ggt, 0));
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$36((C2068389v) obj);
        }
    }
}
