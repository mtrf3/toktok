package com.ss.android.ugc.aweme.ecommerce.base.osp.module.policy;

import X.AnonymousClass636;
import X.C1EU;
import X.C221108m2;
import X.C26508Aam;
import X.C26554AbW;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import android.content.Context;
import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PolicyVH extends ECJediViewHolder {
    public static final /* synthetic */ int LJLJJI = 0;
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, false);
    }

    public PolicyVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 28));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        LinkRichText privacyPolicyStatement;
        int i;
        int LIZ;
        C26554AbW item = (C26554AbW) obj;
        o.LJIIIZ(item, "item");
        View view = this.LJLIL;
        BillInfoData billInfoData = ((OrderSubmitViewModel) this.LJLILLLLZI.getValue()).LJZ;
        if (billInfoData == null || (privacyPolicyStatement = billInfoData.getPrivacyPolicyStatement()) == null || privacyPolicyStatement.template == null) {
            return;
        }
        if (privacyPolicyStatement.arguments != null) {
            try {
                String str = privacyPolicyStatement.textColor;
                if (str != null) {
                    LIZ = Color.parseColor(str);
                } else {
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "context");
                    LIZ = AnonymousClass636.LJIIIIZZ(R.attr.gu, context);
                }
            } catch (Throwable unused) {
                LIZ = C1EU.LIZ(view, "context", R.attr.gu);
            }
            TextView textView = (TextView) view.findViewById(R.id.hvy);
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            Context context2 = this.LJLIL.getContext();
            o.LJIIIIZZ(context2, "view.context");
            textView.setText(RichTextUtil.LIZJ(richTextUtil, context2, privacyPolicyStatement, Integer.valueOf(LIZ), 0, false, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT));
            view.findViewById(R.id.hvy).setClickable(true);
            ((TextView) view.findViewById(R.id.hvy)).setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (item.LJLIL) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }
}
