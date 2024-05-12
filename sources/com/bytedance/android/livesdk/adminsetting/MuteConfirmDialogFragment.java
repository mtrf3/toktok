package com.bytedance.android.livesdk.adminsetting;

import X.C05490Jl;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C28381BBx;
import X.C28507BGt;
import X.C2A7;
import X.C62822Ol8;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC88472Yns;
import Y.ACListenerS40S0200000_5;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MuteConfirmDialogFragment extends LiveDialogFragment {
    public InterfaceC88472Yns<? super C05490Jl, C76800UCe> LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 103));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        int i;
        int i2;
        int i3;
        int LIZ;
        if (wg0()) {
            i = R.layout.d0m;
        } else {
            i = R.layout.d0n;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        if (wg0()) {
            i2 = R.style.aap;
        } else {
            i2 = R.style.aar;
        }
        c28507BGt.LIZJ = i2;
        c28507BGt.LIZLLL = wg0();
        c28507BGt.LJIIL = new ColorDrawable(0);
        if (wg0()) {
            i3 = 80;
        } else {
            i3 = 8388613;
        }
        c28507BGt.LJII = i3;
        int i4 = -1;
        if (wg0()) {
            LIZ = -1;
        } else {
            LIZ = C15380j0.LIZ(375.0f);
        }
        c28507BGt.LJIIIZ = LIZ;
        if (wg0()) {
            i4 = -2;
        }
        c28507BGt.LJIIJ = i4;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    public final boolean wg0() {
        return ((Boolean) this.LJLILLLLZI.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cjd);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        Context context = getContext();
        o.LJI(context);
        C28381BBx c28381BBx = new C28381BBx(context, wg0());
        ((RecyclerView) _$_findCachedViewById(R.id.cjd)).setAdapter(c28381BBx);
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Zo0(new AqS171S0100000_5(c28381BBx, 122));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.br6), new ACListenerS40S0200000_5(this, c28381BBx, 4));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 123));
        }
    }
}
