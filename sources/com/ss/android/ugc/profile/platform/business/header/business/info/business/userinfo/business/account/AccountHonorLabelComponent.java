package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account;

import X.C7MY;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AccountHonorLabelComponent extends AccountInfoBaseUIComponent<BizBaseData> {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        Describe describe;
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TextView textView = (TextView) view;
        textView.setVisibility(0);
        T t = this.LJLILLLLZI;
        if (t != 0 && (describe = t.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        textView.setText(str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = C7MY.LIZIZ(4);
        tuxTextView.setSingleLine();
        tuxTextView.setTextColorRes(R.attr.gx);
        tuxTextView.setTuxFont(61);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setVisibility(8);
        return tuxTextView;
    }
}
