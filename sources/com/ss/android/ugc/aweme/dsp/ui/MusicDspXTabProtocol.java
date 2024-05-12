package com.ss.android.ugc.aweme.dsp.ui;

import X.C16880lQ;
import X.C2U8;
import X.C39647FhD;
import X.C45804HyK;
import X.C51645KOr;
import X.C78983UzD;
import X.C91249ZrZ;
import X.C91348ZtA;
import X.C91412ZuC;
import X.EnumC53763L8d;
import X.LCY;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.dsp.v2.TTDspFragmentV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MusicDspXTabProtocol extends TopTabProtocol {
    public final String LJLJJI = "MUSIC_DSP_XTAB";
    public final Class<? extends Fragment> LJLJJL = TTDspFragmentV2.class;
    public final EnumC53763L8d LJLJJLL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        C2U8.LIZ(new C91412ZuC());
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LCY LIZJ() {
        return new C91348ZtA();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return C51645KOr.LIZIZ.LJIIIZ();
    }

    public MusicDspXTabProtocol() {
        if (!enable()) {
            C91249ZrZ.LJIILIIL("x_tab", CardStruct.IStatusCode.DEFAULT);
        }
        this.LJLJJLL = EnumC53763L8d.X_TAB;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle d(Context context) {
        Intent intent;
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("enter_method", "x_tab");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && (intent = LJIJJ.getIntent()) != null) {
            bundle.putString("profile_from_scene", C16880lQ.LLJJIJIIJIL(intent, "profile_from_scene"));
        }
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        try {
            C39647FhD.LJ(context);
        } catch (Exception unused) {
        }
        C51645KOr.LIZIZ.LJIIJ(context);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        try {
            String string = context.getResources().getString(R.string.ii0);
            o.LJIIIIZZ(string, "{\n            context.re….music_dsp_tab)\n        }");
            return string;
        } catch (Exception unused) {
            C78983UzD.LJIILL("music_dsp_tab not found");
            String string2 = C16880lQ.LLLLL(context).getResources().getString(R.string.ii0);
            o.LJIIIIZZ(string2, "{\n            EnsureMana….music_dsp_tab)\n        }");
            return string2;
        }
    }
}
