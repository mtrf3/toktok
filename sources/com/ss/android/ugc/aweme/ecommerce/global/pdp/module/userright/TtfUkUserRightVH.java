package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright;

import X.C03090Af;
import X.C0F1;
import X.X1D;
import android.graphics.Color;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class TtfUkUserRightVH extends PdpHolder {
    public final Fragment LJLIL;
    public final StringBuilder LJLILLLLZI;
    public int LJLJI;
    public final String LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L33;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.TtfUkUserRightVH.onBind(java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfUkUserRightVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a47);
        this.LJLJJLL = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        this.LJLILLLLZI = new StringBuilder();
        this.LJLJJI = CardStruct.IStatusCode.DEFAULT;
    }

    public final Integer L(String str, String str2) {
        boolean z;
        if (C0F1.LIZIZ(this.itemView, "itemView.context")) {
            str = str2;
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    z = false;
                    if (!z && str.charAt(0) != '#') {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('#');
                        LIZ.append(str);
                        str = X1D.LIZIZ(LIZ);
                    }
                    return Integer.valueOf(Color.parseColor(str));
                }
            } catch (Exception unused) {
                return null;
            }
        }
        z = true;
        if (!z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('#');
            LIZ2.append(str);
            str = X1D.LIZIZ(LIZ2);
        }
        return Integer.valueOf(Color.parseColor(str));
    }
}
