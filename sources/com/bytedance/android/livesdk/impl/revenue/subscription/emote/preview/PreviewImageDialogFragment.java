package com.bytedance.android.livesdk.impl.revenue.subscription.emote.preview;

import X.BUA;
import X.BZI;
import X.C16880lQ;
import X.C1C8;
import X.C28507BGt;
import X.C28787BRn;
import X.C2A7;
import X.C40171ht;
import X.C77989UjB;
import X.ORZ;
import X.UDP;
import X.UDQ;
import X.UDT;
import X.UDV;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDiS274S0100000_13;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PreviewImageDialogFragment extends LiveDialogFragment {
    public UDV LJLILLLLZI;
    public LiveSubMediaModel LJLJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final List<LiveSubMediaModel> LJLIL = new ArrayList();
    public final BUA LJLJJI = new BUA();
    public final UDQ LJLJJL = new UDQ(Integer.valueOf(R.color.bc));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d4b);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        UDT udt;
        UDV udv = this.LJLILLLLZI;
        if (udv != null && (udt = udv.LJFF) != null) {
            udt.LIZ();
        }
        dismiss();
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final void vl(LiveSubMediaModel liveSubMediaModel) {
        int LJZ = ORZ.LJZ(liveSubMediaModel, this.LJLIL);
        if (LJZ >= 0) {
            ((ViewPager) _$_findCachedViewById(R.id.bya)).setCurrentItem(LJZ);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Map<String, Object> map;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        BZI LIZ = C28787BRn.LIZ("livesdk_emote_preedit_page_show");
        UDV udv = this.LJLILLLLZI;
        if (udv != null && (map = udv.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
            }
        }
        LIZ.LJJIIJZLJL();
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.bya);
        if (viewPager != null) {
            viewPager.setAdapter(this.LJLJJI);
        }
        this.LJLJJL.LJLJJI = this;
        Context context = getContext();
        if (context != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.i17);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new C77989UjB(context));
            }
            C40171ht c40171ht = new C40171ht();
            c40171ht.LIZJ = 0L;
            c40171ht.LJ = 250L;
            c40171ht.LIZLLL = 0L;
            c40171ht.LJFF = 250L;
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.i17);
            if (recyclerView2 != null) {
                recyclerView2.setItemAnimator(c40171ht);
            }
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.i17);
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.LJLJJL);
            }
            new C1C8(new UDP(this.LJLJJL)).LJII((RecyclerView) _$_findCachedViewById(R.id.i17));
        }
        ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(R.id.bya);
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new IDiS274S0100000_13(this, 1));
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.i17);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.post(new ARunnableS49S0100000_13(this, 103));
        }
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.auv), new ACListenerS33S0100000_13(this, 79));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.avw), new ACListenerS33S0100000_13(this, 80));
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.j4q), new ACListenerS33S0100000_13(this, 81));
    }

    public final void wl(int i, int i2) {
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(this.LJLJJL.LJLIL);
        this.LJLJJI.setData(this.LJLIL);
        vl(this.LJLJI);
    }
}
