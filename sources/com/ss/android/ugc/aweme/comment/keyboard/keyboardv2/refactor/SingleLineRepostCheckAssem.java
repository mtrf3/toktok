package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C175276uJ;
import X.C176356w3;
import X.C177336xd;
import X.C177876yV;
import X.C177886yW;
import X.C177896yX;
import X.C1793372b;
import X.C212428Vi;
import X.C214298b3;
import X.C224748ru;
import X.C2K0;
import X.C55096Ljo;
import X.C55247LmF;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71U;
import X.C71Y;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC1793272a;
import X.InterfaceC55102Lju;
import X.InterfaceC55251LmJ;
import X.InterfaceC82683Wch;
import X.TBT;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class SingleLineRepostCheckAssem extends UIContentAssem implements IRepostCheckAssemVAbility, InterfaceC1793272a, InterfaceC55102Lju {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public InterfaceC82683Wch LJLJI;
    public LinearLayout LJLJJI;

    public C2K0 provideAbility(String str) {
        if (str.hashCode() != 1867027516) {
            return null;
        }
        return this;
    }

    public SingleLineRepostCheckAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 119), C71U.INSTANCE, null);
    }

    @Override // X.InterfaceC1793272a
    public final boolean Gk() {
        Fragment LIZLLL;
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if ((LIZLLL2 == null || !LIZLLL2.isDetached()) && (LIZLLL = C212428Vi.LIZLLL(this)) != null && LIZLLL.getFragmentManager() != null && !o.LJ(((KeyboardVMV2) this.LJLIL.getValue()).gv0(), C177886yW.LIZ) && !o.LJ(((KeyboardVMV2) this.LJLIL.getValue()).gv0(), C177896yX.LIZ) && !o.LJ(((KeyboardVMV2) this.LJLIL.getValue()).gv0(), C177876yV.LIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1793272a
    public final boolean Hf() {
        Fragment LIZLLL;
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null && !LIZLLL2.isDetached() && (LIZLLL = C212428Vi.LIZLLL(this)) != null && LIZLLL.getFragmentManager() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onCreateView() {
        super.onCreateView();
        this.LJLILLLLZI = true;
        System.out.println((Object) "SingleLineRepostCheckAssem.onCreateView");
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public final C177336xd v3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            return (C177336xd) LIZLLL.getSource();
        }
        return null;
    }

    @Override // X.InterfaceC1793272a
    public final List<CommentPersonalizedEmoji> wj() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C224748ru c224748ru;
        String str;
        View containerView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.g6x);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ll_upvote_checkbox)");
        this.LJLJJI = (LinearLayout) findViewById;
        IKeyboardInputPanelAssemAbility LIZ = C176356w3.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ != null) {
            c224748ru = LIZ.U1();
        } else {
            c224748ru = null;
        }
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout != null) {
            C177336xd v3 = v3();
            if (v3 == null || (str = v3.LJLJJLL) == null) {
                str = "";
            }
            C1793372b.LIZ(linearLayout, str, c224748ru, this);
            if (C175276uJ.LIZ()) {
                containerView = this.LJLJJI;
                if (containerView == null) {
                    o.LJIJI("upvoteCheckBox");
                    throw null;
                }
            } else {
                containerView = getContainerView();
            }
            containerView.setVisibility(8);
            C71Y.LIZLLL("SingleLineRepostCheckAssem", "onViewCreated");
            C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.71T
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C177616y5) obj).LJLL);
                }
            }, null, new AqS185S0100000_3(this, 39), 6);
            return;
        }
        o.LJIJI("upvoteCheckBox");
        throw null;
    }
}
