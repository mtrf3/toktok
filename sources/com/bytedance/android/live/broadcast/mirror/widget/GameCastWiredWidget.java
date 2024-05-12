package com.bytedance.android.live.broadcast.mirror.widget;

import X.ActivityC45651qj;
import X.C05400Jc;
import X.C05440Jg;
import X.C0JV;
import X.C0JW;
import X.C15380j0;
import X.C15490jB;
import X.C1B3;
import X.C29306Beo;
import X.C47121t6;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.mirror.GameCastWiredFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public final class GameCastWiredWidget extends GameCastWidget {
    @Override // com.bytedance.android.live.broadcast.mirror.widget.GameCastWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.mirror.widget.GameCastWidget
    public final void LJZ() {
        String str;
        Bundle bundle = this.LJLILLLLZI;
        if (bundle != null) {
            str = bundle.getString("screen_cast_type_from");
        } else {
            str = null;
        }
        C0JV.LJIILIIL(str, false, false);
        super.LJZ();
    }

    @Override // com.bytedance.android.live.broadcast.mirror.widget.GameCastWidget
    public final void LJZL() {
        Context context = this.context;
        if (context != null && C05400Jc.LJII && C05400Jc.LJI != null) {
            C05400Jc.LJIILIIL(context, false);
            C0JV.LJIIJ("other_casting", true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.mirror.widget.GameCastWidget
    public final void LJLZ(boolean z) {
        Context context;
        ActivityC45651qj LIZIZ;
        FragmentManager supportFragmentManager;
        C0JW.LIZ.getClass();
        if (C0JW.LIZLLL() && (context = this.context) != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null && (supportFragmentManager = LIZIZ.getSupportFragmentManager()) != null) {
            boolean LIZ = C05440Jg.LIZ(GameCastWiredWidget.class);
            GameCastWiredFragment gameCastWiredFragment = new GameCastWiredFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_wired_cast_is_showing", LIZ);
            gameCastWiredFragment.setArguments(bundle);
            Fragment LJJJI = supportFragmentManager.LJJJI(this.LJLIL);
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            if (LJJJI != null) {
                c1b3.LJIIIZ(LJJJI);
            }
            String str = null;
            c1b3.LJIIIIZZ(this.LJLIL, 1, gameCastWiredFragment, null);
            c1b3.LJ(null);
            c1b3.LJI();
            if (z) {
                Bundle bundle2 = this.LJLILLLLZI;
                if (bundle2 != null) {
                    str = bundle2.getString("screen_cast_type_from");
                }
                C0JV.LJIILIIL(str, false, true);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.mirror.widget.GameCastWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.lah));
        }
        C15490jB.LJ(this.LJLJI, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_ic.png");
        super.onLoad(objArr);
    }

    public GameCastWiredWidget(int i, Bundle bundle) {
        super(i, bundle);
    }
}
