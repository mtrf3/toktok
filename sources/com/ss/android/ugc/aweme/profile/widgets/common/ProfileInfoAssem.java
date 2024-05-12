package com.ss.android.ugc.aweme.profile.widgets.common;

import X.C186557Tv;
import X.C26362AWg;
import X.C80896Voy;
import X.C8BJ;
import X.C9IJ;
import X.C9IL;
import X.InterfaceC235069Kk;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileInfoAssem extends UIContentAssem implements InterfaceC235069Kk {
    public C80896Voy LJLIL;
    public Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLILLLLZI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract String getEnterFrom();

    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public abstract void v3();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = (C80896Voy) view.findViewById(R.id.itq);
        if (C186557Tv.LIZ()) {
            C80896Voy c80896Voy = this.LJLIL;
            if (c80896Voy != null) {
                c80896Voy.setOnRefreshListener(new AqS154S0100000_4(this, 721));
            }
        } else {
            C80896Voy c80896Voy2 = this.LJLIL;
            if (c80896Voy2 != null) {
                c80896Voy2.setNestedHeader(null);
            }
            C80896Voy c80896Voy3 = this.LJLIL;
            if (c80896Voy3 != null) {
                c80896Voy3.setScrollMode(C8BJ.NONE);
            }
        }
        C80896Voy c80896Voy4 = this.LJLIL;
        if (c80896Voy4 == null) {
            return;
        }
        c80896Voy4.setOverScrollMode(C26362AWg.LIZ());
    }

    @Override // X.InterfaceC235069Kk
    public void y6(boolean z, C9IL contentType, String infoCollectValue, boolean z2) {
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(infoCollectValue, "infoCollectValue");
        C9IJ.LIZJ(z, contentType, infoCollectValue, z2);
    }
}
