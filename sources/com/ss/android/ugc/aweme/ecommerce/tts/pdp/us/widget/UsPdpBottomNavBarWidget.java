package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget;

import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70079Ret;
import X.C70179RgV;
import X.C73156SnQ;
import X.C76800UCe;
import X.C78948Uye;
import X.TBT;
import Y.IDLListenerS198S0100000_12;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsPdpBottomNavBarWidget extends JediBaseWidget {
    public final PdpFragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final C70079Ret LJLJJL;
    public final IDLListenerS198S0100000_12 LJLJJLL;
    public final Map<Integer, View> LJLJL;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return R.layout.xy;
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        this.LJLJJI = false;
        View view = this.contentView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJLJJLL);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        ViewTreeObserver viewTreeObserver;
        super.onCreate();
        View view = this.contentView;
        if (view != null) {
            C78948Uye.LJIJJLI(view, this.LJLIL);
        }
        ((C70179RgV) _$_findCachedViewById(R.id.b21)).setPdpBottomButtonListener(this.LJLJJL);
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Rb8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getBottomAreaElem();
            }
        }, new TBT() { // from class: X.Rbj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getProtectionProgramText();
            }
        }, new IDqS436S0100000_12(this, 1));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.RgS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getLoadingStatus());
            }
        }, new AqS186S0100000_4(this, 4));
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        View view2 = this.contentView;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.LJLJJLL);
    }

    public UsPdpBottomNavBarWidget(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 123));
        this.LJLJJL = new C70079Ret(this);
        this.LJLJJLL = new IDLListenerS198S0100000_12(this, 2);
    }

    public final void updateTip(TuxTextView tuxTextView, LinkRichText linkRichText) {
        if (linkRichText != null) {
            tuxTextView.setVisibility(0);
            tuxTextView.setText(RichTextUtil.LIZJ(RichTextUtil.LIZ, getContext(), linkRichText, null, 0, false, null, null, 124));
            tuxTextView.setTextColor(linkRichText.LIZ(getContext()));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        tuxTextView.setVisibility(8);
    }
}
