package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.C0NB;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C28507BGt;
import X.C62822Ol8;
import X.C72945Sk1;
import X.C74885TaD;
import X.C74886TaE;
import X.C74887TaF;
import X.C87277YNd;
import X.TS1;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestConnectDistributeDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJJLL = 0;
    public MultiGuestConnectDistributeParentFragment LJLIL;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 82));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new C74887TaF(this));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new C74886TaE(this));

    static {
        new C74885TaD();
    }

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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cz2);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJFF = false;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        C0NB.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeDialog", "onBackPressed");
        MultiGuestConnectDistributeParentFragment multiGuestConnectDistributeParentFragment = this.LJLIL;
        if (multiGuestConnectDistributeParentFragment != null) {
            if (multiGuestConnectDistributeParentFragment.onBackPressed()) {
                return true;
            }
            MultiGuestDialogManager LIZ = TS1.LIZ();
            if (LIZ != null) {
                LIZ.kv0(this);
            }
            dismissAllowingStateLoss();
            return true;
        }
        o.LJIJI("contentFragment");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.hej);
        o.LJIIIIZZ(findViewById, "this");
        C87277YNd.LJJIIZ(findViewById);
        MultiGuestConnectDistributeParentFragment LIZ = C72945Sk1.LIZ((String) this.LJLILLLLZI.getValue(), new AqS163S0100000_13(this, 81), ((Boolean) this.LJLJI.getValue()).booleanValue());
        LIZ.wl(new AqS163S0100000_13(this, 80));
        this.LJLIL = LIZ;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ2 = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ2.LJIIIIZZ(R.id.dm7, 1, LIZ, null);
        LIZ2.LJI();
    }
}
