package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.BZI;
import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29044Baa;
import X.C2A7;
import X.CFX;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CppUnlockGuideDialog extends LiveDialogFragment {
    public InterfaceC88472Yns<? super BZI, BZI> LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLIL = "this feature";
    public boolean LJLJI = true;

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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        C28507BGt c28507BGt = new C28507BGt(R.layout.cw5);
        if (this.LJLJI) {
            i = R.style.aba;
        } else {
            i = R.style.ab_;
        }
        c28507BGt.LIZJ = i;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJII((LiveIconView) view.findViewById(R.id.eb1), new ACListenerS25S0100000_5(this, 97));
        ((TextView) view.findViewById(R.id.title)).setText(C15380j0.LJIILL(R.string.kos, this.LJLIL));
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 98), view.findViewById(R.id.nb4));
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.ayy), new ACListenerS25S0100000_5(this, 99));
        View view3 = getView();
        if (view3 != null) {
            view2 = view3.findViewById(R.id.c_b);
        } else {
            view2 = null;
        }
        C15490jB.LIZJ(view2, C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1"), "cpp_unlock_guide_dialog_picture.png"));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        Long l;
        Long l2;
        LiveMode streamType;
        o.LJIIIZ(manager, "manager");
        super.show(manager, str);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        String str2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room3 != null && (streamType = room3.getStreamType()) != null) {
            str2 = streamType.logStreamingType;
        }
        InterfaceC88472Yns<? super BZI, BZI> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_cpp_gray_out_pop_up_show");
            LIZ.LJIJJ(l, "anchor_id");
            LIZ.LJIJJ(l2, "room_id");
            LIZ.LJIJJ(str2, "live_type");
            BZI invoke = interfaceC88472Yns.invoke(LIZ);
            if (invoke != null) {
                invoke.LJJIIJZLJL();
            }
        }
    }
}
