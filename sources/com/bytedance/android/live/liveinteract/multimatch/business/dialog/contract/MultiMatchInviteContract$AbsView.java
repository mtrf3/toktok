package com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract;

import X.AbstractC76233Tvx;
import X.C16880lQ;
import X.C29306Beo;
import X.InterfaceC40159FpT;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchInviteFragmentV2;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public abstract class MultiMatchInviteContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC76233Tvx> {
    public SparkContext LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public abstract void Al();

    public abstract void LLJJIII(Throwable th);

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    public abstract int wl();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC40159FpT LJIILL;
        super.onDestroyView();
        SparkContext sparkContext = this.LJLJJI;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        _$_clearFindViewByIdCache();
    }

    public final View xl() {
        ViewGroup viewGroup;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        View view = getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.dkk, viewGroup, false);
        if (LLLLIILL == null) {
            return null;
        }
        C29306Beo.LJJJLL(LLLLIILL, 500L, new AqS179S0100000_13((MultiMatchInviteFragmentV2) this, 212));
        return LLLLIILL;
    }
}
