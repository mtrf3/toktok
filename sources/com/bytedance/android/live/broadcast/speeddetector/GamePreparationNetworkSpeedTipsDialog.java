package com.bytedance.android.live.broadcast.speeddetector;

import X.C0KB;
import X.C0NB;
import X.C12770en;
import X.C15380j0;
import X.C16880lQ;
import X.C2A7;
import X.C30922CBq;
import X.C51029K0z;
import X.C78496UrM;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedTipsDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GamePreparationNetworkSpeedTipsDialog extends LiveSheetFragment {
    public int LLD;
    public boolean LLF;

    public GamePreparationNetworkSpeedTipsDialog() {
        new LinkedHashMap();
        this.LLD = -1;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.om1));
        return c0kb;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GamePreparationNetworkSpeedTipsDialogAlive.class, Boolean.FALSE);
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationNetworkSpeedTipsDialog", "onDestroy()");
        }
        if (!this.LLF) {
            C12770en.LJ(this.LLD, "click", "cancel");
        }
        this.LLF = false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(0);
        sheetOptions.cornerRadius = C15380j0.LIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(GamePreparationNetworkSpeedTipsDialogAlive.class, Boolean.TRUE);
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GamePreparationNetworkSpeedTipsDialog", "onCreate()");
        }
        this.LLF = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("enter_from");
        } else {
            i = -1;
        }
        this.LLD = i;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cxa, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, GamePreparationPageDestroyEvent.class, new IDqS416S0100000(this, 144));
        }
        C2A7 c2a7 = (C2A7) view.findViewById(R.id.lo6);
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new IDCListenerS135S0100000(this, 38));
        }
    }
}
