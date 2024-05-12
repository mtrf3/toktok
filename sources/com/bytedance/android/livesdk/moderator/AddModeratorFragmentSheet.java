package com.bytedance.android.livesdk.moderator;

import X.B83;
import X.BEM;
import X.BFC;
import X.C025908h;
import X.C03880Dg;
import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C19K;
import X.C238749Yo;
import X.C28442BEg;
import X.C28443BEh;
import X.C29306Beo;
import X.C29374Bfu;
import X.C30161Gi;
import X.C32I;
import X.C51029K0z;
import X.C61878OQg;
import X.C65300Pk0;
import X.C73943T0h;
import X.C78496UrM;
import X.ORZ;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDObjectS178S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AddModeratorFragmentSheet extends LiveSheetFragment {
    public C238749Yo LLD;
    public View LLF;
    public final Map<Integer, View> LLFF = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFF;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.npd));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    public final void Ol() {
        String str;
        C238749Yo c238749Yo = this.LLD;
        if (c238749Yo != null) {
            Editable text = ((C19K) _$_findCachedViewById(R.id.jf4)).getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            c238749Yo.LJLLLLLL(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final void Ml() {
        ?? r4;
        List list;
        List<C28443BEh> LJIIJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIJ();
        if (LJIIJ == null) {
            LJIIJ = C61878OQg.INSTANCE;
        }
        if (!(LJIIJ instanceof Collection) || !LJIIJ.isEmpty()) {
            Iterator<C28443BEh> it = LJIIJ.iterator();
            while (it.hasNext()) {
                Long l = it.next().LIZ;
                long Nl = Nl();
                if (l == null || l.longValue() != Nl) {
                    DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                    if (LJIILIIL != null && (list = (List) LJIILIIL.kv0(ModeratorListChannel.class)) != null) {
                        r4 = new ArrayList(C32I.LJJL(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            r4.add(Long.valueOf(((BFC) it2.next()).LIZ));
                        }
                    } else {
                        r4 = C61878OQg.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJ, 10));
                    for (C28443BEh c28443BEh : LJIIJ) {
                        arrayList.add(C28442BEg.LIZ(c28443BEh, ORZ.LJLJJI(c28443BEh.LIZ, r4)));
                    }
                    C238749Yo c238749Yo = new C238749Yo(Nl(), C51029K0z.LJIILIIL(this), "friend_panel", true, false);
                    c238749Yo.setData(arrayList);
                    c238749Yo.LJLJLJ = new AqS171S0100000_5(this, 708);
                    this.LLD = c238749Yo;
                    C73943T0h.LIZ().LIZJ(this, BEM.class).LIZIZ(new AfS57S0100000_5(this, 273));
                    C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.jh3));
                    C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.jfv));
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.jh3);
                    recyclerView.setAdapter(this.LLD);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.jg9), new ACListenerS25S0100000_5(this, 333));
                    ((TextView) _$_findCachedViewById(R.id.jf4)).addTextChangedListener(new IDObjectS178S0100000_5(this, 11));
                    return;
                }
            }
        }
        C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.h1p));
    }

    public final long Nl() {
        Room room;
        if (C29306Beo.LJJI()) {
            return C025908h.LIZ();
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-1052896782562329746");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/livesdk/moderator/AddModeratorFragmentSheet", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/livesdk/moderator/AddModeratorFragmentSheet", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (!z) {
            Ml();
            Ol();
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/android/livesdk/moderator/AddModeratorFragmentSheet", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cvp, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLF = view;
        Ml();
    }
}
