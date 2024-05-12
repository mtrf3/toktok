package com.ss.android.ugc.aweme.live.slot;

import X.C16880lQ;
import X.C188727au;
import X.C259710f;
import X.C28507BGt;
import X.C31737Ccv;
import X.C31738Ccw;
import X.C31743Cd1;
import X.EnumC30736C4m;
import X.FMX;
import X.InterfaceC31710CcU;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS66S0300000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class SlotsBottomSheetDialog extends LiveDialogFragment {
    public C31737Ccv LJLIL;
    public RecyclerView LJLILLLLZI;
    public final EnumC30736C4m LJLJI;
    public final C31738Ccw LJLJJI;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cxn);
        c28507BGt.LIZIZ = 2;
        c28507BGt.LIZJ = R.style.aao;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String LIZ;
        super.onCreate(bundle);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        if (this.LJLJJI.LIZLLL.equals("before_live")) {
            LIZ = CardStruct.IStatusCode.DEFAULT;
        } else {
            LIZ = this.LJLJJI.LIZ();
        }
        c188727au.LJIIIZ("room_id", LIZ);
        c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c188727au.LJIIIZ("live_status", this.LJLJJI.LIZLLL);
        c188727au.LJIIIZ("page_name", "business_action_sheet");
        HashSet hashSet = new HashSet();
        Iterator it = ((HashMap) this.LJLIL.LIZIZ).keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC31710CcU) it.next()).LIZ());
        }
        c188727au.LJI("button_options", TextUtils.join(",", hashSet));
        FMX.LJIIL("livesdk_tiktokec_action_sheet_show", c188727au.LIZ);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Context context = onGetLayoutInflater.getContext();
        return onGetLayoutInflater.cloneInContext(new ContextThemeWrapper(context, C259710f.LIZ.LJFF(context)));
    }

    public SlotsBottomSheetDialog(EnumC30736C4m enumC30736C4m, C31738Ccw c31738Ccw) {
        this.LJLJI = enumC30736C4m;
        this.LJLJJI = c31738Ccw;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 260), view.findViewById(R.id.hej));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.k5a);
        this.LJLILLLLZI = recyclerView;
        if (recyclerView == null) {
            return;
        }
        mo49getActivity();
        recyclerView.setLayoutManager(new SSLinearLayoutManager(0));
        C31743Cd1 c31743Cd1 = new C31743Cd1(this, this.LJLJI, this.LJLJJI);
        for (Map.Entry entry : ((HashMap) this.LJLIL.LIZIZ).entrySet()) {
            ((IIconSlot.SlotViewModel) entry.getValue()).LJLILLLLZI.observe(getViewLifecycleOwner(), new AObserverS66S0300000_5(this, c31743Cd1, entry, 12));
        }
        this.LJLILLLLZI.setAdapter(c31743Cd1);
    }
}
