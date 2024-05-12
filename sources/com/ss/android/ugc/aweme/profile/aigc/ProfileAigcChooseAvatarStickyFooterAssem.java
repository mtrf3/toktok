package com.ss.android.ugc.aweme.profile.aigc;

import X.C116414hZ;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.SSB;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcChooseAvatarStickyFooterAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public View LJLILLLLZI;
    public TuxIconView LJLJI;
    public C116414hZ LJLJJI;
    public TuxTextView LJLJJL;

    public ProfileAigcChooseAvatarStickyFooterAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcAvatarViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 835), SSB.INSTANCE, null);
    }

    public final ProfileAigcAvatarViewModel v3() {
        return (ProfileAigcAvatarViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = getContainerView().findViewById(R.id.ack);
        o.LJIIIIZZ(findViewById, "containerView.avatar_list_sticky_footer");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.g7l);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.load_more_icon)");
        this.LJLJI = (TuxIconView) findViewById2;
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            View findViewById3 = view2.findViewById(R.id.k_i);
            o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.spinner_icon)");
            this.LJLJJI = (C116414hZ) findViewById3;
            View view3 = this.LJLILLLLZI;
            if (view3 != null) {
                View findViewById4 = view3.findViewById(R.id.text);
                o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.text)");
                this.LJLJJL = (TuxTextView) findViewById4;
                C8YN.LJII(this, v3(), new TBT() { // from class: X.SRB
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((SIN) obj).LJLJJLL;
                    }
                }, null, new AqS194S0100000_12(this, 135), 6);
                return;
            }
            o.LJIJI("itemView");
            throw null;
        }
        o.LJIJI("itemView");
        throw null;
    }

    public final void x3(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LJLJI;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(1.0f);
                TuxTextView tuxTextView = this.LJLJJL;
                if (tuxTextView != null) {
                    tuxTextView.setAlpha(1.0f);
                    return;
                } else {
                    o.LJIJI("textSticky");
                    throw null;
                }
            }
            o.LJIJI("loadMoreIconSticky");
            throw null;
        }
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setAlpha(0.5f);
            TuxTextView tuxTextView2 = this.LJLJJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setAlpha(0.5f);
                return;
            } else {
                o.LJIJI("textSticky");
                throw null;
            }
        }
        o.LJIJI("loadMoreIconSticky");
        throw null;
    }
}
