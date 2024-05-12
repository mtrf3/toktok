package com.bytedance.android.live.broadcast.dialog;

import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C28507BGt;
import X.C46761sW;
import X.C62822Ol8;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceConnectedFragment;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceIntroFragment;
import com.bytedance.android.live.broadcast.fragment.GameDualDevicePositionFragment;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceQRCodeFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.GameDualDevicePageChannel;
import com.bytedance.android.livesdk.comp.api.game.GamePreparePageStopCountDown;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameDualDeviceDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new C46761sW(this));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS420S0100000(this, 25));
    public int LJLJI = 1;
    public final String[] LJLJJI = {"ttlive_game_dual_device_camera_icon.png", "ttlive_game_dual_device_connected_img.png", "ttlive_game_dual_device_intro_img.png", "ttlive_game_dual_device_position_preview_mask.png", "ttlive_game_dual_device_position_selected.png"};

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwh);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.acp;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = C15380j0.LIZ(415.0f);
        return c28507BGt;
    }

    public final void vl() {
        Fragment gameDualDeviceIntroFragment;
        int i = this.LJLJI;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        dismiss();
                        return;
                    }
                    boolean booleanValue = ((Boolean) this.LJLIL.getValue()).booleanValue();
                    String str = (String) this.LJLILLLLZI.getValue();
                    gameDualDeviceIntroFragment = new GameDualDevicePositionFragment();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_landscape", booleanValue);
                    bundle.putString("event_page", str);
                    gameDualDeviceIntroFragment.setArguments(bundle);
                } else {
                    gameDualDeviceIntroFragment = new GameDualDeviceConnectedFragment();
                }
            } else {
                boolean booleanValue2 = ((Boolean) this.LJLIL.getValue()).booleanValue();
                gameDualDeviceIntroFragment = new GameDualDeviceQRCodeFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("is_landscape", booleanValue2);
                gameDualDeviceIntroFragment.setArguments(bundle2);
            }
        } else {
            gameDualDeviceIntroFragment = new GameDualDeviceIntroFragment();
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIJ(gameDualDeviceIntroFragment, C16880lQ.LJLLJ(gameDualDeviceIntroFragment.getClass()), R.id.lp5);
        LIZ.LJI();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GamePreparePageStopCountDown.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("current_page");
        } else {
            i = 1;
        }
        this.LJLJI = i;
        vl();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, GameDualDevicePageChannel.class, new IDqS416S0100000(this, 196));
        }
        for (String str : this.LJLJJI) {
            C15490jB.LJIJ("tiktok_live_game_demand_1", str);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.qv0(GamePreparePageStopCountDown.class, Boolean.TRUE);
        }
    }
}
