package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import X.C04270Et;
import X.C63144OqK;
import X.C78983UzD;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36101EEv;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes7.dex */
public class SplashBgInflate implements InterfaceC36101EEv {
    public Drawable LJLIL;

    @Override // X.InterfaceC36101EEv
    public final Class<? extends Activity> LIZ() {
        return null;
    }

    @Override // X.InterfaceC36101EEv
    public final int LIZIZ() {
        return R.style.ul;
    }

    @Override // X.EEY
    public final String key() {
        return "SplashBgInflate";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "inflate_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C63144OqK.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final EnumC36103EEx triggerType() {
        return EnumC36103EEx.INFLATE;
    }

    @Override // X.InterfaceC36101EEv
    public final void LJFF(Activity activity, Context context) {
        try {
            this.LJLIL = C04270Et.LIZIZ(context, R.drawable.splash_bg_normal);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
