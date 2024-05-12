package com.bytedance.android.livesdk.giftlimitnotification;

import X.ActivityC45651qj;
import X.BE7;
import X.BE9;
import X.BEA;
import X.C0EH;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C247089mq;
import X.C29S;
import X.C2A7;
import X.C30868C9o;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftReminderAmountFragment extends BaseFragment implements BE7 {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final ArrayList<Integer> LJLIL = new ArrayList<>();
    public final ArrayList<String> LJLILLLLZI = new ArrayList<>();

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

    @Override // X.BE7
    public final void onFailure() {
        BEA.LIZ.getClass();
        C30868C9o.LJI(BEA.LJJIFFI);
    }

    @Override // X.BE7
    public final void onSuccess() {
        BEA.LIZ.getClass();
        C30868C9o.LJI(BEA.LJJI);
        _$_findCachedViewById(R.id.e36).performClick();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    public static String vl(String num) {
        o.LJIIIZ(num, "num");
        C0NB.LIZIZ("LiveGiftReminderAmountFragment", "addSeparator");
        int length = num.length();
        ArrayList arrayList = new ArrayList();
        while (length > 3) {
            int i = length - 3;
            String substring = num.substring(i, length);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            length = i;
        }
        String substring2 = num.substring(0, length);
        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        arrayList.add(substring2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((String) ListProtector.get(arrayList, size));
                LIZ.append(',');
                sb.append(X1D.LIZIZ(LIZ));
            } else {
                return C0EH.LIZJ(sb, (String) ListProtector.get(arrayList, 0), "sb.toString()");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer value;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.e36), new ACListenerS25S0100000_5(this, 314));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.ayc), new ACListenerS25S0100000_5(this, 315));
        this.LJLIL.clear();
        this.LJLILLLLZI.clear();
        BEA.LIZ.getClass();
        List<Integer> list = BEA.LJIILJJIL;
        if (list != null) {
            this.LJLIL.addAll(list);
        }
        List<Integer> list2 = BEA.LJIILJJIL;
        if (list2 != null) {
            Iterator<Integer> it = list2.iterator();
            while (it.hasNext()) {
                this.LJLILLLLZI.add(vl(String.valueOf(it.next().intValue())));
            }
        }
        char c = 1;
        while (true) {
            str = "";
            ListProtector.add(this.LJLILLLLZI, 0, "");
            this.LJLILLLLZI.add("");
            ListProtector.add(this.LJLIL, 0, 0);
            this.LJLIL.add(0);
            if (c == 2) {
                break;
            } else {
                c = 2;
            }
        }
        BEA.LIZ.getClass();
        MutableLiveData<Integer> mutableLiveData = BEA.LJJ;
        if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null) {
            str = String.valueOf(value);
        }
        String vl = vl(str);
        ((C247089mq) _$_findCachedViewById(R.id.duw)).setData(this.LJLILLLLZI);
        ((C247089mq) _$_findCachedViewById(R.id.duw)).setWheelSize(5);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.duw);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        int indexOf = this.LJLILLLLZI.indexOf(vl) - 2;
        ((C247089mq) _$_findCachedViewById(R.id.duw)).setMCurrentPositon(indexOf);
        ((RecyclerView) _$_findCachedViewById(R.id.duw)).LJLI(indexOf);
        BE9.LIZIZ(BEA.LJ() ? 1 : 0, -1, -1, 1, BEA.LJJIIZI, BEA.LJJIJ, "-1", BEA.LJIILIIL, BEA.LJIILL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d65, viewGroup, false);
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
