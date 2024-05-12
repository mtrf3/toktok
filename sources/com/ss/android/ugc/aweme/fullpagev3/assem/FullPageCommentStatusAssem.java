package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C16880lQ;
import X.C184387Lm;
import Y.AObserverS71S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageCommentStatusAssem extends BaseFullPageAssem {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        Context context;
        Aweme aweme;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.bk2);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new View.OnClickListener() { // from class: X.7Lc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e3w);
        if (_$_findCachedViewById != null) {
            C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7Ld
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, _$_findCachedViewById);
        }
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.hzn);
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new View.OnClickListener() { // from class: X.7Le
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        if (C184387Lm.LJI(A3().getAweme()) && (context = getContainerView().getContext()) != null && (aweme = A3().getAweme()) != null) {
            TuxTextView LJFF = C184387Lm.LJFF(context);
            LJFF.setId(R.id.hz_);
            LJFF.setText(C184387Lm.LIZLLL(context, aweme));
            ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.hzn);
            if (viewGroup != null) {
                C184387Lm.LJII(LJFF, viewGroup);
            }
        }
        PostModeContainerViewModel v3 = v3();
        if (v3 != null && (mutableLiveData = v3.LJZI) != null) {
            getActualLifecycleOwner();
            mutableLiveData.observe(this, new AObserverS71S0100000_3(this, 55));
        }
    }
}
