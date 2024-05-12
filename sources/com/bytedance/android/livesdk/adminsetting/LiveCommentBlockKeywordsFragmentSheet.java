package com.bytedance.android.livesdk.adminsetting;

import X.B83;
import X.C0KB;
import X.C15380j0;
import X.C1TQ;
import X.C29374Bfu;
import X.C30161Gi;
import X.C5H3;
import X.C78496UrM;
import X.C78996UzQ;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCommentBlockKeywordsFragmentSheet extends LiveSheetFragment {
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public final C5H3 LLD = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 91));
    public final C5H3 LLF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 89));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLFF;
        Integer valueOf = Integer.valueOf(R.id.ams);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.ams)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.mf2));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFF).clear();
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
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d0i, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC05190Ih interfaceC05190Ih;
        String secUid;
        long j;
        User owner;
        String secUid2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String str = "";
        if (this.LLD.getValue() != null) {
            C1TQ c1tq = (C1TQ) _$_findCachedViewById(R.id.ams);
            boolean booleanValue = ((Boolean) this.LLF.getValue()).booleanValue();
            Room room = (Room) this.LLD.getValue();
            if (room != null && (owner = room.getOwner()) != null && (secUid2 = owner.getSecUid()) != null) {
                str = secUid2;
            }
            Room room2 = (Room) this.LLD.getValue();
            if (room2 != null) {
                j = room2.getId();
            } else {
                j = 0;
            }
            c1tq.LJII(str, j, "live_take_detail", booleanValue, true);
        } else {
            C1TQ c1tq2 = (C1TQ) _$_findCachedViewById(R.id.ams);
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null && (secUid = interfaceC05190Ih.getSecUid()) != null) {
                str = secUid;
            }
            c1tq2.LJII(str, 0L, "live_take_detail", true, true);
        }
        ((C1TQ) _$_findCachedViewById(R.id.ams)).setOnAddSuccessCallback(new AqS155S0100000_5(this, 90));
    }
}
