package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C19K;
import X.C238709Yk;
import X.C26743AeZ;
import X.C27021Aj3;
import X.C27235AmV;
import X.C27311Anj;
import X.C27313Anl;
import X.C27354AoQ;
import X.C27356AoS;
import X.C32151Nz;
import X.C62822Ol8;
import X.C68322mC;
import X.C70917RsP;
import X.C70929Rsb;
import X.C70930Rsc;
import X.C70990Rta;
import X.C70991Rtb;
import X.C76800UCe;
import X.C78565UsT;
import X.C78946Uyc;
import X.InterfaceC27239AmZ;
import X.InterfaceC27330Ao2;
import X.InterfaceC27359AoV;
import X.InterfaceC88472Yns;
import X.O6R;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS5S0002000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class SearchInputItemViewHolder extends BaseViewHolder implements InterfaceC27330Ao2, InterfaceC27359AoV, InterfaceC27239AmZ {
    public final AddressEditFragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C27354AoQ<CandInputData> LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public final Map<Integer, View> LJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    public final void L() {
        InputMethodManager inputMethodManager;
        Object LLILL = C16880lQ.LLILL(this.itemView.getContext(), "input_method");
        if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null) {
            inputMethodManager.hideSoftInputFromWindow(this.itemView.getWindowToken(), 0);
        }
    }

    @Override // X.InterfaceC27359AoV
    public final void c7() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70917RsP(), C27313Anl.LJLIL);
        M(false);
        L();
        AddressEditViewModel viewModel = getViewModel();
        Boolean bool = Boolean.FALSE;
        AddressEditViewModel.Uv0(viewModel, 0, bool, bool, null, 8);
    }

    @Override // X.InterfaceC27239AmZ
    public final View getFocusView() {
        C27354AoQ<CandInputData> c27354AoQ = this.LJLJI;
        if (c27354AoQ != null) {
            return c27354AoQ.LIZIZ(R.id.jdi);
        }
        return null;
    }

    public final AddressEditViewModel getViewModel() {
        return (AddressEditViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC27330Ao2
    public final void LJIIZILJ() {
        getViewModel().setState(C27235AmV.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC27239AmZ
    public final boolean needFocus() {
        C27354AoQ<CandInputData> c27354AoQ;
        C19K c19k;
        C27021Aj3 c27021Aj3 = (C27021Aj3) getItem();
        if ((c27021Aj3 != null && !c27021Aj3.LJFF) || (c27354AoQ = this.LJLJI) == null || (c19k = (C19K) c27354AoQ.LIZIZ(R.id.jdi)) == null || String.valueOf(c19k.getText()).length() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C27354AoQ<CandInputData> c27354AoQ = this.LJLJI;
        if (c27354AoQ != null) {
            c27354AoQ.LIZJ(this);
        }
        View findViewById = this.itemView.findViewById(R.id.ge5);
        o.LJIIIIZZ(findViewById, "itemView.manually_text_layout");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 25, 42), findViewById);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        C27354AoQ<CandInputData> c27354AoQ = this.LJLJI;
        if (c27354AoQ != null) {
            ((ArrayList) c27354AoQ.LJLIL).remove(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r5 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r4.getViewModel()
            java.lang.Integer r0 = r0.LLIILII
            r3 = 0
            if (r0 != 0) goto L21
        L9:
            r2 = 0
        La:
            android.view.View r1 = r4.itemView
            r0 = 2131371185(0x7f0a24b1, float:1.8362398E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = "itemView.manually_text_layout"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            if (r2 == 0) goto L1e
        L1a:
            r1.setVisibility(r3)
            return
        L1e:
            r3 = 8
            goto L1a
        L21:
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L9
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = r4.getViewModel()
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r0.LJLJLLL
            if (r0 != 0) goto L9
            if (r5 == 0) goto L9
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder.M(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC27330Ao2
    public final void Rb(String str) {
        if (!o.LJ(str, ((C27021Aj3) getItem()).LIZIZ)) {
            getViewModel().LJLLJ = true;
        }
        ((C27021Aj3) getItem()).LIZIZ = str;
        AddressEditViewModel viewModel = getViewModel();
        String str2 = ((C27021Aj3) getItem()).LIZ.key;
        AqS58S1100000_4 aqS58S1100000_4 = new AqS58S1100000_4(this, str, 3);
        viewModel.getClass();
        viewModel.withState(new AqS47S1200000_4(viewModel, (AddressEditViewModel) str2, (String) aqS58S1100000_4, (InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe>) 2));
    }

    @Override // X.InterfaceC27359AoV
    public final void hg(int i) {
        this.LJLJLJ = false;
        if (this.LJLJLLL != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLLL;
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70991Rtb(), new C27311Anj(i, elapsedRealtime));
            this.LJLJLLL = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    public final void onBind(C27021Aj3 item) {
        Integer num;
        TextView textView;
        C27354AoQ<CandInputData> c27354AoQ;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        String str = item.LIZ.hint;
        if (str != null && (c27354AoQ = this.LJLJI) != null) {
            c27354AoQ.setHint(str);
        }
        M(true);
        if (!item.LJFF) {
            View findViewById = this.itemView.findViewById(R.id.gas);
            o.LJIIIIZZ(findViewById, "itemView.lv_address_search");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 109, 42), findViewById);
            this.itemView.findViewById(R.id.gas).findViewById(R.id.jdi).setFocusable(false);
            ((TextView) this.itemView.findViewById(R.id.gas).findViewById(R.id.jdi)).setCursorVisible(false);
            this.itemView.findViewById(R.id.gas).findViewById(R.id.jdi).setFocusableInTouchMode(false);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.gas).findViewById(R.id.jdi);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            textView2.setHintTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
            View findViewById2 = this.itemView.findViewById(R.id.gas).findViewById(R.id.jdi);
            o.LJIIIIZZ(findViewById2, "itemView.lv_address_search.searchEdit");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 110, 42), findViewById2);
        }
        C27021Aj3 c27021Aj3 = (C27021Aj3) getItem();
        if (c27021Aj3 != null && (num = c27021Aj3.LJII) != null) {
            int intValue = num.intValue();
            C27354AoQ<CandInputData> c27354AoQ2 = this.LJLJI;
            if (c27354AoQ2 != null && (textView = (TextView) c27354AoQ2.LIZIZ(R.id.jdi)) != null) {
                textView.setImeOptions(intValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C27021Aj3) obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchInputItemViewHolder(android.view.ViewGroup r11, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r12) {
        /*
            r10 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r10.LJLL = r0
            android.content.Context r1 = r11.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2131559206(0x7f0d0326, float:1.874375E38)
            r3 = 0
            android.view.View r0 = X.C27532ArI.LIZ(r0, r1, r11, r3)
            r10.<init>(r0)
            r10.LJLIL = r12
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 11
            r1.<init>(r10, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r10.LJLILLLLZI = r0
            java.lang.String r0 = ""
            r10.LJLJJI = r0
            X.AoQ r4 = new X.AoQ
            android.view.View r0 = r10.itemView
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "itemView.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.<init>(r1)
            r0 = 6
            java.lang.Integer r5 = X.AnonymousClass391.LIZJ(r0)
            r0 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = X.C1FJ.LIZIZ(r1)
            r0 = 12
            java.lang.Integer r7 = X.AnonymousClass391.LIZJ(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 16
            X.C26338AVi.LJIIIZ(r4, r5, r6, r7, r8, r9)
            android.content.Context r1 = r4.getContext()
            r0 = 2131231774(0x7f08041e, float:1.8079639E38)
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r1, r0)
            r4.setBackground(r0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            r4.setLayoutParams(r2)
            r10.LJLJI = r4
            android.view.View r1 = r10.itemView
            r0 = 2131371061(0x7f0a2435, float:1.8362146E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r4, r3)
            android.view.View r2 = r10.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            X.Anm r1 = new X.Anm
            r1.<init>()
            r0 = 2131365972(0x7f0a1054, float:1.8351824E38)
            r2.setTag(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC27330Ao2
    public final void eh(View view, String str, boolean z) {
        int i;
        T t;
        o.LJIIIZ(view, "view");
        int i2 = 0;
        if (z) {
            getViewModel().LJLLJ = true;
            if (str != null) {
                i2 = str.length();
            }
            this.LJLJJLL = i2;
            this.LJLJJL = SystemClock.elapsedRealtime();
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70929Rsb(), null);
            M(true);
            C78565UsT.LJJIJIIJIL(this.LJLIL, new C238709Yk(this, null));
            return;
        }
        this.LJLIL.Gl(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJL;
        if (str != null) {
            i = str.length();
        } else {
            i = -this.LJLJJLL;
        }
        C68322mC c68322mC = new C68322mC();
        if (i > 0) {
            t = "add";
        } else if (i < 0) {
            t = "del";
        } else {
            t = "";
        }
        c68322mC.element = t;
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C78946Uyc.LJJIIJ(itemView2, new C70930Rsc(), new C26743AeZ(elapsedRealtime, c68322mC, str, this));
        this.LJLJL = false;
    }

    @Override // X.InterfaceC27359AoV
    public final void ke(C27356AoS<CandInputData> result, int i, int i2) {
        o.LJIIIZ(result, "result");
        this.LJLJL = true;
        Integer num = getViewModel().LLIILII;
        if (num == null || num.intValue() != 0) {
            AddressEditViewModel viewModel = getViewModel();
            Boolean bool = Boolean.FALSE;
            viewModel.Tv0(0, bool, bool, new AqS151S0200000_4(this, (SearchInputItemViewHolder) result, (C27356AoS<CandInputData>) 5));
        } else {
            AddressEditViewModel viewModel2 = getViewModel();
            CandInputData candInputData = result.LIZ;
            viewModel2.jw0(candInputData.address, this.LJLJJI, candInputData.autocompleteAddressId, candInputData.placeType, new AqS170S0100000_4(this, 206));
        }
        getViewModel().LLIIII = null;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70990Rta(), new AqS5S0002000_4(i, i2, 0));
    }
}
