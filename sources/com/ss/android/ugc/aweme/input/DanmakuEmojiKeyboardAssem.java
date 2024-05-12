package com.ss.android.ugc.aweme.input;

import X.AnonymousClass723;
import X.C110154Tz;
import X.C112094ab;
import X.C112214an;
import X.C1792671u;
import X.C1792771v;
import X.C1801375d;
import X.C214298b3;
import X.C221108m2;
import X.C224738rt;
import X.C48841JEv;
import X.C4VN;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DanmakuEmojiKeyboardAssem extends UIContentAssem {
    public C112094ab LJLIL;
    public final C214298b3 LJLILLLLZI;
    public ViewGroup LJLJI;
    public final C62822Ol8 LJLJJI;

    public DanmakuEmojiKeyboardAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DanmakuInputVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 438), C1792671u.INSTANCE, null);
        this.LJLJJI = C221108m2.LIZIZ(C1792771v.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C112094ab c112094ab = this.LJLIL;
        if (c112094ab != null) {
            C48841JEv.LIZJ(c112094ab.LJLJLLL, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ViewGroup rootView = (ViewGroup) view.findViewById(R.id.c37);
        C224738rt editView = (C224738rt) view.findViewById(R.id.cq8);
        o.LJIIIIZZ(editView, "editView");
        C1801375d c1801375d = new C1801375d(editView);
        o.LJIIIIZZ(rootView, "rootView");
        C112214an c112214an = new C112214an(c1801375d, rootView);
        C4VN.LIZ();
        if (C110154Tz.LIZ(2)) {
            c112214an.LIZJ.LIZIZ = true;
        }
        c112214an.LIZJ.LJI = 2;
        C112094ab c112094ab = new C112094ab(c112214an.LIZ, c112214an.LIZJ, c112214an.LIZIZ);
        this.LJLIL = c112094ab;
        rootView.addView(c112094ab.LJLIL);
        this.LJLJI = rootView;
        rootView.getLayoutParams().height = AnonymousClass723.LIZ().LIZJ();
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.71x
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass724) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 163), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.71w
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((AnonymousClass724) obj).LJLILLLLZI);
            }
        }, null, new AqS185S0100000_3(this, 164), 6);
    }
}
