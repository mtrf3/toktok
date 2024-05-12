package com.ss.android.ugc.aweme.profile.widgets.signature;

import X.AV1;
import X.C16880lQ;
import X.C234999Kd;
import X.C27740Aue;
import X.C65352Pkq;
import X.C66415Q4t;
import X.C8VC;
import X.C9NI;
import X.C9X4;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC82683Wch;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS297S0100000_4;
import Y.IDTListenerS114S0100000_4;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileSignatureAssem extends BaseProfileSignatureAssem {
    public boolean LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    public final void N3() {
        if (C9NI.LIZ()) {
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.setOnTouchListener(new IDTListenerS114S0100000_4(this, 7));
            }
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setOnLongClickListener(new IDCListenerS297S0100000_4(this, 2));
            }
            TuxTextView tuxTextView3 = this.LJLIL;
            if (tuxTextView3 != null) {
                C16880lQ.LJJJJI(tuxTextView3, new ACListenerS24S0100000_4(this, 157));
            }
        }
    }

    public final void O3(C9X4 c9x4) {
        if (C9NI.LIZ() && !this.LJLJLJ) {
            this.LJLJJI = v3(this.LJLIL, getContext(), c9x4, new AqS170S0100000_4(this, 752));
            L3();
            InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.show();
            }
            this.LJLJLJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (TuxTextView) view.findViewById(R.id.n0q);
        if (C9NI.LIZ() && C9NI.LIZ()) {
            this.LJLILLLLZI = (LinearLayout) view.findViewById(R.id.n0s);
            TuxIconView imageView = (TuxIconView) view.findViewById(R.id.n0t);
            o.LJIIIIZZ(imageView, "imageView");
            A3(imageView);
        }
        if (AV1.LJIIJJI()) {
            C27740Aue.LJIIJJI(false, this.LJLIL);
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9LG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 748));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9LB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 749));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9LC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, new AqS170S0100000_4(this, 750));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Mk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJJIII;
            }
        }, new AqS170S0100000_4(this, 751));
    }

    public final void W8(int i, String str) {
        User user;
        if (TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(8);
            return;
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        } else {
            user = null;
        }
        TuxTextView tuxTextView2 = this.LJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(0);
        }
        if (AV1.LJIJ(user) && AV1.LJIIJJI()) {
            TuxTextView tuxTextView3 = this.LJLIL;
            if (tuxTextView3 == null) {
                return;
            }
            tuxTextView3.setText(R.string.rd2);
            return;
        }
        if (!this._isViewValid) {
            return;
        }
        C66415Q4t.LIZIZ(this.LJLIL, str);
        if (!C9NI.LIZ() || !this.LJLL) {
            return;
        }
        N3();
    }
}
