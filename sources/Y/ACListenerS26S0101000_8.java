package Y;

import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.AnonymousClass745;
import X.C05630Jz;
import X.C29727Blb;
import X.C2U8;
import X.C30929CBx;
import X.C45804HyK;
import X.C51141K5h;
import X.C51208K7w;
import X.C51322KCg;
import X.C51421KGb;
import X.C5S1;
import X.C62648OiK;
import X.FMX;
import X.K4W;
import X.K75;
import X.K7D;
import X.K7J;
import X.K7T;
import X.KC6;
import X.XX7;
import X.XYM;
import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.ecomsearch.middle.utils.EcSearchSugMobHelper;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACListenerS26S0101000_8 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS26S0101000_8 aCListenerS26S0101000_8, View view) {
        DataChannel dataChannel;
        boolean z = true;
        switch (aCListenerS26S0101000_8.i1) {
            case 0:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aCListenerS26S0101000_8.l0;
                liveRoomUserInfoWidget.LLILLIZIL();
                if (!liveRoomUserInfoWidget.LLILLIZIL && (dataChannel = liveRoomUserInfoWidget.dataChannel) != null) {
                    dataChannel.pv0(ResetSilentTimerEvent.class);
                    return;
                }
                return;
            case 1:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) aCListenerS26S0101000_8.l0;
                ecBaseDiscoverAndSearchFragmentNew.LJLLL.setBackToMiddle(true);
                ecBaseDiscoverAndSearchFragmentNew.Ml();
                return;
            case 2:
                aCListenerS26S0101000_8.l0.getClass();
                return;
            default:
                C62648OiK c62648OiK = (C62648OiK) aCListenerS26S0101000_8.l0;
                c62648OiK.getClass();
                if (SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                    C5S1 c5s1 = new C5S1(c62648OiK.getContext());
                    c5s1.LIZLLL(c62648OiK.getContext().getString(R.string.pba));
                    c5s1.LJ();
                    return;
                } else {
                    RadioGroup radioGroup = c62648OiK.LJLJJI;
                    if (radioGroup == null) {
                        return;
                    }
                    if (radioGroup.getCheckedRadioButtonId() != R.id.ax2) {
                        z = false;
                    }
                    c62648OiK.LJIIL("line", z);
                    return;
                }
        }
    }

    public static final void onClick$1(ACListenerS26S0101000_8 aCListenerS26S0101000_8, View view) {
        boolean z;
        boolean z2 = true;
        switch (aCListenerS26S0101000_8.i1) {
            case 0:
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aCListenerS26S0101000_8.l0;
                C29727Blb c29727Blb = liveRoomUserInfoWidget.LLJILJILJ;
                if (c29727Blb != null) {
                    c29727Blb.LJII(view);
                    liveRoomUserInfoWidget.LLJILJILJ.LJIILJJIL();
                    JSONObject jSONObject = new JSONObject();
                    C05630Jz.LJI(jSONObject, "show_entrance", "live_left_corner");
                    C30929CBx.LJIIZILJ("subscription_badge_userinfo_click", jSONObject);
                    return;
                }
                return;
            case 1:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) aCListenerS26S0101000_8.l0;
                ecBaseDiscoverAndSearchFragmentNew.LJLLL.setBackToMiddle(true);
                C51421KGb.LIZIZ("click_clear");
                if (ecBaseDiscoverAndSearchFragmentNew.Hl() != 2 || K7J.LIZ(K7D.PRESS_CLEAR)) {
                    z = true;
                    ecBaseDiscoverAndSearchFragmentNew.LJLZ.LJLIL = true;
                } else {
                    z = false;
                    ecBaseDiscoverAndSearchFragmentNew.LJLZ.LJLIL = false;
                }
                ecBaseDiscoverAndSearchFragmentNew.Zl();
                String query = ecBaseDiscoverAndSearchFragmentNew.LJLJI.getText().toString();
                o.LJIIIZ(query, "query");
                K4W.LIZ = query;
                K4W.LIZIZ = System.currentTimeMillis();
                ecBaseDiscoverAndSearchFragmentNew.LJLJI.setText("");
                ecBaseDiscoverAndSearchFragmentNew.LJLJI.setSelection(0);
                ecBaseDiscoverAndSearchFragmentNew.Ll(z);
                ecBaseDiscoverAndSearchFragmentNew.lm("cancel");
                return;
            case 2:
                ((SettingNewVersionFragment) aCListenerS26S0101000_8.l0).lambda$initUnits$25(view);
                return;
            default:
                C62648OiK c62648OiK = (C62648OiK) aCListenerS26S0101000_8.l0;
                c62648OiK.getClass();
                if (SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                    C5S1 c5s1 = new C5S1(c62648OiK.getContext());
                    c5s1.LIZLLL(c62648OiK.getContext().getString(R.string.pba));
                    c5s1.LJ();
                    return;
                } else {
                    RadioGroup radioGroup = c62648OiK.LJLJJI;
                    if (radioGroup == null) {
                        return;
                    }
                    if (radioGroup.getCheckedRadioButtonId() != R.id.ax7) {
                        z2 = false;
                    }
                    c62648OiK.LJIIL("messenger", z2);
                    return;
                }
        }
    }

    public static final void onClick$2(ACListenerS26S0101000_8 aCListenerS26S0101000_8, View view) {
        switch (aCListenerS26S0101000_8.i1) {
            case 0:
                ((HeaderDetailActivity) aCListenerS26S0101000_8.l0).LLFZ();
                return;
            case 1:
                ((BaseDiscoverAndSearchFragmentNew) aCListenerS26S0101000_8.l0).om();
                return;
            default:
                ActivityC86117Xqz activityC86117Xqz = (ActivityC86117Xqz) aCListenerS26S0101000_8.l0;
                activityC86117Xqz.getClass();
                if (view.getId() == R.id.m0_) {
                    FMX.LJIIL("gif_re_edit", new HashMap());
                    activityC86117Xqz.setResult(0);
                    activityC86117Xqz.finish();
                    return;
                }
                return;
        }
    }

    public static final void onClick$3(ACListenerS26S0101000_8 aCListenerS26S0101000_8, View view) {
        switch (aCListenerS26S0101000_8.i1) {
            case 0:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS26S0101000_8.l0)).onUserInfoClick(view);
                return;
            case 1:
                ((SettingNewVersionFragment) ((Fragment) aCListenerS26S0101000_8.l0)).lambda$initUnits$100(view);
                return;
            default:
                ((BaseDiscoverAndSearchFragmentNew) ((Fragment) aCListenerS26S0101000_8.l0)).El(view);
                return;
        }
    }

    public static final void onClick$4(ACListenerS26S0101000_8 aCListenerS26S0101000_8, View view) {
        int i;
        switch (aCListenerS26S0101000_8.i1) {
            case 0:
                ((XX7) aCListenerS26S0101000_8.l0).LJLJI.onInternalEvent(new XYM("import_sound_from_video_click"));
                return;
            case 1:
                AnonymousClass745.Y((AnonymousClass745) aCListenerS26S0101000_8.l0, view);
                return;
            case 2:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aCListenerS26S0101000_8.l0;
                KeyboardUtils.LIZIZ(keyboardDialogFragment.LJLJL);
                keyboardDialogFragment.dismiss();
                return;
            default:
                C51322KCg c51322KCg = (C51322KCg) aCListenerS26S0101000_8.l0;
                if (c51322KCg.LJLLLLLL != null) {
                    KC6 kc6 = c51322KCg.LJLLLL;
                    if (kc6 != null) {
                        kc6.LLIIIL("sug", Integer.valueOf(c51322KCg.LJZ), "complete", c51322KCg.LJLLLLLL);
                    } else {
                        EcSearchSugMobHelper ecSearchSugMobHelper = c51322KCg.LLD;
                        if (ecSearchSugMobHelper != null) {
                            ecSearchSugMobHelper.gv0("sug", Integer.valueOf(c51322KCg.LJZ), "complete", c51322KCg.LJLLLLLL);
                        }
                    }
                    KC6 kc62 = c51322KCg.LJLLLL;
                    if (kc62 != null) {
                        kc62.LLIIIZ().i2(c51322KCg.LJLLLLLL.content);
                    } else {
                        C51141K5h c51141K5h = C51141K5h.LIZ;
                        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(c51322KCg.itemView.getContext());
                        c51141K5h.getClass();
                        if (!C51141K5h.LIZ(LJJIFFI)) {
                            if (!EcomSearchServiceImpl.LJJJJZI().LJIL(C45804HyK.LJJIFFI(c51322KCg.itemView.getContext()))) {
                                C2U8.LIZ(new C51208K7w(c51322KCg.LJLLLLLL.content));
                            }
                        }
                        K75 k75 = c51322KCg.LJLLL;
                        if (k75 != null && k75.LJ() != null) {
                            c51322KCg.LJLLL.LJ().i2(c51322KCg.LJLLLLLL.content);
                        }
                    }
                    K75 k752 = c51322KCg.LJLLL;
                    if (k752 != null && k752.LIZIZ() != null) {
                        i = c51322KCg.LJLLL.LIZIZ().LIZIZ();
                    } else {
                        i = 0;
                    }
                    KC6 kc63 = c51322KCg.LJLLLL;
                    if (kc63 != null && kc63.LLIIIZ() != null && c51322KCg.LJLLLL.LLIIIZ().Vk0() != null) {
                        i = c51322KCg.LJLLLL.LLIIIZ().Vk0().LIZ;
                    }
                    K7T.LIZJ(c51322KCg.LJZ, c51322KCg.LJLLLLLL, c51322KCg.LJLZ, i);
                    return;
                }
                return;
        }
    }

    public ACListenerS26S0101000_8(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
