package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass391;
import X.C26338AVi;
import X.C26855AgN;
import X.C27021Aj3;
import X.C32151Nz;
import X.C62822Ol8;
import X.C78983UzD;
import X.O6R;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DescItemViewHolder extends BaseViewHolder {
    public final C62822Ol8 LJLIL;
    public final Map<LinkText, Boolean> LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressEditViewModel getViewModel() {
        return (AddressEditViewModel) this.LJLIL.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DescItemViewHolder(android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r4, r0)
            r3.LJLJI = r0
            android.content.Context r2 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 2131559188(0x7f0d0314, float:1.8743713E38)
            r0 = 0
            android.view.View r0 = X.C27532ArI.LIZ(r1, r2, r4, r0)
            r3.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 8
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLIL = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.DescItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    public final void onBind(C27021Aj3 item) {
        int i;
        String str;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        if (o.LJ(item.LIZ.key, "notice")) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), Integer.valueOf(this.itemView.getPaddingTop()), AnonymousClass391.LIZJ(8), Integer.valueOf(this.itemView.getPaddingBottom()), 16);
        } else {
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C26338AVi.LJIIIZ(itemView2, Integer.valueOf(this.itemView.getPaddingStart()), Integer.valueOf(this.itemView.getPaddingTop()), Integer.valueOf(this.itemView.getPaddingEnd()), Integer.valueOf(this.itemView.getPaddingBottom()), 16);
        }
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TuxTextView tuxTextView = (TuxTextView) view;
        InputItemDTO inputItemDTO = item.LIZ;
        Map<String, LinkText> map = inputItemDTO.arguments;
        if (map != null) {
            String str2 = inputItemDTO.title;
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder(str2);
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = map.keySet().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                LinkText linkText = map.get(next);
                if (linkText != null && (str = linkText.text) != null) {
                    arrayList.add(linkText);
                    int indexOf = sb.indexOf(next);
                    if (indexOf != -1) {
                        z = false;
                    }
                    IEnsure iEnsure = C78983UzD.LJLLLL;
                    if (iEnsure != null) {
                        iEnsure.ensureFalse(z, "starling key not found");
                    }
                    if (indexOf >= 0) {
                        sb.replace(indexOf, next.length() + indexOf, str);
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LinkText linkText2 = (LinkText) it2.next();
                Map<LinkText, Boolean> map2 = this.LJLILLLLZI;
                o.LJIIIIZZ(linkText2, "linkText");
                if (!map2.containsKey(linkText2)) {
                    this.LJLILLLLZI.put(linkText2, Boolean.FALSE);
                }
                String str3 = linkText2.text;
                if (str3 == null) {
                    str3 = "";
                }
                int indexOf2 = sb.indexOf(str3);
                String str4 = linkText2.text;
                if (str4 != null) {
                    i = str4.length();
                } else {
                    i = 0;
                }
                int i2 = i + indexOf2;
                if (indexOf2 >= 0 && i2 <= sb.length()) {
                    spannableStringBuilder.setSpan(new StyleSpan(1), indexOf2, i2, 17);
                    spannableStringBuilder.setSpan(new C26855AgN(linkText2, tuxTextView, item), indexOf2, i2, 17);
                    Object obj = ((LinkedHashMap) this.LJLILLLLZI).get(linkText2);
                    Boolean bool = Boolean.TRUE;
                    if (!o.LJ(obj, bool) && o.LJ(item.LIZ.key, "notice")) {
                        this.LJLILLLLZI.put(linkText2, bool);
                        getViewModel().Wv0().LIZJ("privacy_policy", new HashMap());
                    }
                }
            }
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setClickable(true);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        tuxTextView.setText(inputItemDTO.title);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C27021Aj3) obj);
    }
}
