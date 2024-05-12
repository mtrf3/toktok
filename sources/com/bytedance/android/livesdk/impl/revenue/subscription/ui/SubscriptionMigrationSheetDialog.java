package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.C15490jB;
import X.C15540jG;
import X.C16880lQ;
import X.C28507BGt;
import X.C47061t0;
import X.CFX;
import X.SY4;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubscriptionMigrationSheetDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJJL = 0;
    public C47061t0 LJLIL;
    public SY4 LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLJI = "";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1g);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (C47061t0) view.findViewById(R.id.a5h);
        this.LJLILLLLZI = (SY4) view.findViewById(R.id.h_w);
        C47061t0 c47061t0 = this.LJLIL;
        if (c47061t0 != null) {
            C15540jG c15540jG = new C15540jG();
            c15540jG.LJFF = true;
            c15540jG.LIZ = c47061t0;
            c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
            c15540jG.LIZJ = "subscription_migrate_animation.webp";
            c15540jG.LJIIL = true;
            c15540jG.LJI = 1;
            C15490jB.LJI(c15540jG);
        }
        SY4 sy4 = this.LJLILLLLZI;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS25S0100000_5(this, 323));
        }
    }
}
