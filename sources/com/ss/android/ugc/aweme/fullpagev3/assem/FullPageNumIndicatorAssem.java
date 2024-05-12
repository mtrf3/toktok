package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C018905p;
import X.C16880lQ;
import X.C188827b4;
import X.C188837b5;
import X.C32151Nz;
import X.C82A;
import X.C8YN;
import X.O6R;
import X.TBT;
import X.V16;
import X.Z9N;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageNumIndicatorAssem extends BaseFullPageAssem {
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
        C018905p c018905p;
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (_$_findCachedViewById(R.id.hoy) == null) {
            ViewStub viewStub = (ViewStub) _$_findCachedViewById(R.id.hoz);
            if (viewStub != null) {
                viewStub.inflate();
            }
            int i3 = 0;
            if (Z9N.LIZIZ.LLILZIL()) {
                ViewGroup viewGroup2 = (ViewGroup) getContainerView().findViewById(R.id.e4d);
                if (viewGroup2 != null) {
                    C16880lQ.LJLLL(_$_findCachedViewById(R.id.hoy), viewGroup2);
                }
                View _$_findCachedViewById = _$_findCachedViewById(R.id.hoy);
                ViewGroup.LayoutParams layoutParams3 = null;
                if (_$_findCachedViewById != null) {
                    layoutParams3 = _$_findCachedViewById.getLayoutParams();
                }
                if (!(layoutParams3 instanceof C018905p) || (c018905p = (C018905p) layoutParams3) == null) {
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hoy);
                    if (_$_findCachedViewById2 != null && (layoutParams2 = _$_findCachedViewById2.getLayoutParams()) != null) {
                        i = layoutParams2.width;
                    } else {
                        i = 0;
                    }
                    View _$_findCachedViewById3 = _$_findCachedViewById(R.id.hoy);
                    if (_$_findCachedViewById3 != null && (layoutParams = _$_findCachedViewById3.getLayoutParams()) != null) {
                        i2 = layoutParams.height;
                    } else {
                        i2 = 0;
                    }
                    c018905p = new C018905p(i, i2);
                }
                c018905p.topToBottom = R.id.e4d;
                c018905p.startToStart = -1;
                c018905p.bottomToBottom = -1;
                c018905p.endToEnd = R.id.e4d;
                c018905p.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
                View _$_findCachedViewById4 = _$_findCachedViewById(R.id.hoy);
                if (_$_findCachedViewById4 != null) {
                    _$_findCachedViewById4.setLayoutParams(c018905p);
                }
                View containerView = getContainerView();
                if ((containerView instanceof ViewGroup) && (viewGroup = (ViewGroup) containerView) != null) {
                    viewGroup.addView(_$_findCachedViewById(R.id.hoy));
                }
            }
            C82A c82a = (C82A) _$_findCachedViewById(R.id.hoy);
            if (c82a != null) {
                Aweme aweme = A3().getAweme();
                if (aweme != null) {
                    i3 = V16.LJJIFFI(aweme);
                }
                c82a.setTotalNum(i3);
            }
        }
        C8YN.LJII(this, x3(), new TBT() { // from class: X.7b6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C203127y8) obj).LJLIL);
            }
        }, null, C188837b5.LJLIL, 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.7b7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C203127y8) obj).LJLJJI);
            }
        }, null, C188827b4.LJLIL, 6);
    }
}
