package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.commentfilter;

import X.C234529Ii;
import X.C252709vu;
import X.C32151Nz;
import X.C7MY;
import X.InterfaceC61213O0r;
import X.InterfaceC71918SKk;
import X.O6R;
import X.ORZ;
import X.SHP;
import X.SKI;
import X.SKJ;
import X.SKQ;
import X.SLJ;
import X.SLR;
import X.SLY;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public abstract class SimplePrivacySettingFragment extends BaseFragment implements SKJ {
    public List<? extends SLJ> LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    public View _$_findCachedViewById(int i) {
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

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public final int getLayout() {
        return R.layout.ahj;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract List<SLJ> vl();

    @Override // X.SKJ
    public final void Ra() {
        List<? extends SLJ> list = this.LJLILLLLZI;
        if (list == null) {
            return;
        }
        SKJ.LJJJJLL.getClass();
        String LIZ = SKI.LIZ(list);
        TextView textView = (TextView) _$_findCachedViewById(R.id.lgi);
        if (textView != null) {
            if (LIZ == null || LIZ.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 170));
        c252709vu.LIZJ(LIZJ);
        getContext();
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setLayoutManager(new WrapLinearLayoutManager(1));
        Object obj = null;
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setItemAnimator(null);
        List<SLJ> vl = vl();
        o.LJIIIZ(vl, "<set-?>");
        this.LJLILLLLZI = vl;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ftq);
        List<? extends SLJ> list = this.LJLILLLLZI;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SLY(this, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), this));
            for (SLJ slj : list) {
                List LLJI = ORZ.LLJI(slj.LJLILLLLZI);
                if ((obj instanceof InterfaceC71918SKk) && !(ORZ.LJLLLL(LLJI) instanceof InterfaceC71918SKk)) {
                    arrayList.add(new SLY(this, C7MY.LIZIZ(8), this));
                }
                Object LLFII = ORZ.LLFII(LLJI);
                if (LLFII != null) {
                    obj = LLFII;
                }
                arrayList.add(slj);
            }
            arrayList.add(new SHP(new SKQ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), this));
            recyclerView.setAdapter(SLR.LIZ(arrayList));
            ((C252709vu) _$_findCachedViewById(R.id.la4)).LJIILJJIL(false);
            ((C252709vu) _$_findCachedViewById(R.id.la4)).setNavBackground(0);
            Ra();
            return;
        }
        o.LJIJI("adapters");
        throw null;
    }
}
