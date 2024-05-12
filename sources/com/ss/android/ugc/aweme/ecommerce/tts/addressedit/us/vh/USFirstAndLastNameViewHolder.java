package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh;

import X.C1DD;
import X.C252989wM;
import X.C27021Aj3;
import X.C62822Ol8;
import X.C78983UzD;
import X.InterfaceC27239AmZ;
import X.T5T;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USFirstAndLastNameViewHolder extends ECJediViewHolder implements InterfaceC27239AmZ {
    public final AddressEditFragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public TextInputHelper LJLJI;
    public TextInputHelper LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC27239AmZ
    public final View getFocusView() {
        TextInputHelper textInputHelper = this.LJLJI;
        if (textInputHelper != null && textInputHelper.needFocus()) {
            return textInputHelper.getFocusView();
        }
        TextInputHelper textInputHelper2 = this.LJLJJI;
        if (textInputHelper2 != null && textInputHelper2.needFocus()) {
            return textInputHelper2.getFocusView();
        }
        TextInputHelper textInputHelper3 = this.LJLJI;
        if (textInputHelper3 != null) {
            return textInputHelper3.getFocusView();
        }
        return null;
    }

    @Override // X.InterfaceC27239AmZ
    public final boolean needFocus() {
        TextInputHelper textInputHelper = this.LJLJI;
        if (textInputHelper != null) {
            if (textInputHelper.needFocus()) {
                return true;
            }
            TextInputHelper textInputHelper2 = this.LJLJJI;
            if (textInputHelper2 != null) {
                return textInputHelper2.needFocus();
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        subscribeEvent("ec_address_item_value_change");
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        TextInputHelper textInputHelper = this.LJLJI;
        if (textInputHelper != null) {
            textInputHelper.onDestroy();
        }
        TextInputHelper textInputHelper2 = this.LJLJJI;
        if (textInputHelper2 != null) {
            textInputHelper2.onDestroy();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        List<C27021Aj3> list;
        TextInputHelper textInputHelper;
        T5T focusView;
        String str;
        C27021Aj3 item = (C27021Aj3) obj;
        o.LJIIIZ(item, "item");
        Object obj2 = item.LIZIZ;
        if ((obj2 instanceof List) && (list = (List) obj2) != null) {
            for (C27021Aj3 c27021Aj3 : list) {
                if (o.LJ(c27021Aj3.LIZ.key, "first_name")) {
                    if (this.LJLJI == null) {
                        View findViewById = this.itemView.findViewById(R.id.dam);
                        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.address.widget.inputitem.InputItem");
                        this.LJLJI = new TextInputHelper((C252989wM) findViewById, this.LJLIL, (AddressEditViewModel) this.LJLILLLLZI.getValue());
                        if ((e1.LIZ(31744, "ec_osp_auto_open_address_edit", true, false) || e1.LIZ(31744, "ec_osp_auto_open_address_edit_uk", true, false)) && c27021Aj3.LJFF) {
                            Object obj3 = c27021Aj3.LIZIZ;
                            if ((!(obj3 instanceof String) || (str = (String) obj3) == null || str.length() == 0) && (textInputHelper = this.LJLJI) != null && (focusView = textInputHelper.getFocusView()) != null) {
                                try {
                                    focusView.postDelayed(new ARunnableS39S0100000_3(focusView, 187), 200L);
                                } catch (Exception e) {
                                    C78983UzD.LJIIZILJ(new RuntimeException(C1DD.LJ("GECC EditText.focus(), ", e)));
                                }
                            }
                        }
                    }
                    TextInputHelper textInputHelper2 = this.LJLJI;
                    if (textInputHelper2 != null) {
                        textInputHelper2.onBind(c27021Aj3);
                    }
                }
                if (o.LJ(c27021Aj3.LIZ.key, "last_name")) {
                    if (this.LJLJJI == null) {
                        View findViewById2 = this.itemView.findViewById(R.id.ffs);
                        o.LJII(findViewById2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.address.widget.inputitem.InputItem");
                        this.LJLJJI = new TextInputHelper((C252989wM) findViewById2, this.LJLIL, (AddressEditViewModel) this.LJLILLLLZI.getValue());
                    }
                    TextInputHelper textInputHelper3 = this.LJLJJI;
                    if (textInputHelper3 != null) {
                        textInputHelper3.onBind(c27021Aj3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public USFirstAndLastNameViewHolder(android.view.ViewGroup r4, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LJLJJL = r0
            android.content.Context r2 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 2131559197(0x7f0d031d, float:1.8743731E38)
            r0 = 0
            android.view.View r0 = X.C27532ArI.LIZ(r1, r2, r4, r0)
            r3.<init>(r0)
            r3.LJLIL = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 112(0x70, float:1.57E-43)
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USFirstAndLastNameViewHolder.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment):void");
    }
}
