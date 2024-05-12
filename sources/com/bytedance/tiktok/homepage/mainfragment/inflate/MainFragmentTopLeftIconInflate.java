package com.bytedance.tiktok.homepage.mainfragment.inflate;

import X.C17N;
import X.C35183DrP;
import X.C52237Ken;
import X.C63144OqK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36101EEv;
import X.LL8;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainFragmentTopLeftIconInflate implements InterfaceC36101EEv {
    public ImageView LJLIL;

    @Override // X.InterfaceC36101EEv
    public final int LIZIZ() {
        return R.style.ul;
    }

    @Override // X.EEY
    public final String key() {
        return "MainFragmentTopLeftIconInflate";
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

    @Override // X.InterfaceC36101EEv
    public final Class<? extends Activity> LIZ() {
        return HomePageUIFrameServiceImpl.LIZ().getHomePageInflateActivityClass();
    }

    public final void LIZLLL() {
        boolean LIZ = C52237Ken.LIZ();
        int LJIILL = C17N.LJIILL(24.0d);
        int LJIILL2 = C17N.LJIILL(44.0d);
        if (LIZ) {
            LJIILL = C17N.LJIILL(56.0d);
            LJIILL2 = C17N.LJIILL(56.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJIILL, LJIILL2);
        if (!LIZ) {
            layoutParams.setMargins(C17N.LJIILL(16.0d), 0, 0, 0);
            layoutParams.setMarginStart(C17N.LJIILL(16.0d));
        }
        ImageView imageView = this.LJLIL;
        o.LJI(imageView);
        imageView.setLayoutParams(layoutParams);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final EnumC36103EEx triggerType() {
        return EnumC36103EEx.INFLATE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC36101EEv
    public final void LJFF(Activity activity, Context context) {
        if (activity == null) {
            activity = context;
        }
        this.LJLIL = LL8.LIZIZ(activity);
        if (((Boolean) C35183DrP.LJIIIIZZ.getValue()).booleanValue()) {
            LIZLLL();
        }
    }
}
