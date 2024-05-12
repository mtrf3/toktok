package com.bytedance.android.live.rank.impl.list.fragment;

import X.ActivityC45651qj;
import X.B83;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29374Bfu;
import X.C29S;
import X.C31512CYi;
import X.C31855Cep;
import X.C3C5;
import X.C51029K0z;
import X.C76800UCe;
import X.C90903hW;
import X.CFU;
import X.EnumC31059CGx;
import X.OA0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RankSparkFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public OA0 LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public RankTypeV2 LJLILLLLZI = RankTypeV2.LJIILL;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        OA0 oa0 = this.LJLIL;
        if (oa0 != null) {
            oa0.LIZIZ();
        }
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        Room room;
        Room room2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (OA0) view.findViewById(R.id.k96);
        String LIZ = CFU.LIZ(this.LJLILLLLZI.type, EnumC31059CGx.RANK_PAGE.getScene());
        if (LIZ == null) {
            LIZ = "";
        }
        if (LIZ.length() == 0) {
            return;
        }
        C31855Cep c31855Cep = new C31855Cep();
        c31855Cep.LJIIIZ(LIZ);
        c31855Cep.LJIIJ();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        long j2 = 0;
        if (LJIILIIL != null && (room2 = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        c31855Cep.LJIIL("room_id", String.valueOf(j));
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL2 != null && (room = (Room) LJIILIIL2.kv0(RoomChannel.class)) != null) {
            j2 = room.getOwnerUserId();
        }
        c31855Cep.LJIIL("anchor_id", String.valueOf(j2));
        c31855Cep.LJIIL("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        String uri = c31855Cep.LIZ().toString();
        o.LJIIIIZZ(uri, "builder.build().toString()");
        OA0 oa0 = this.LJLIL;
        if (oa0 == null) {
            return;
        }
        oa0.LIZ(-1, C31512CYi.LIZ(uri), "");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5h, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
