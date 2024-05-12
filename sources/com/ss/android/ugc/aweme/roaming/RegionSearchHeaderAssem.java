package com.ss.android.ugc.aweme.roaming;

import X.C110614Vt;
import X.C16880lQ;
import X.C214298b3;
import X.C54662Lco;
import X.C54680Ld6;
import X.C54681Ld7;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79045V0n;
import X.C7MY;
import X.C86V;
import X.C9BE;
import Y.ACListenerS29S0100000_9;
import Y.IDObjectS181S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RegionSearchHeaderAssem extends UIContentAssem {
    public LinearLayout LJLIL;
    public TuxIconView LJLILLLLZI;
    public EditText LJLJI;
    public final C214298b3 LJLJJI;

    public RegionSearchHeaderAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RegionSearchViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 603), C54681Ld7.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.g5r);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ll_search_bar)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.LJLIL = linearLayout;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        linearLayout.setBackground(c110614Vt.LIZ(context));
        LinearLayout linearLayout2 = this.LJLIL;
        if (linearLayout2 != null) {
            int i = 0;
            linearLayout2.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.avg);
            o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.btn_clear)");
            TuxIconView tuxIconView = (TuxIconView) findViewById2;
            this.LJLILLLLZI = tuxIconView;
            C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(this, 64));
            View findViewById3 = view.findViewById(R.id.czu);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.et_search_edit)");
            EditText editText = (EditText) findViewById3;
            this.LJLJI = editText;
            editText.addTextChangedListener(new IDObjectS181S0100000_9(this, 0));
            EditText editText2 = this.LJLJI;
            if (editText2 != null) {
                editText2.setOnEditorActionListener(new C54680Ld6(this));
                EditText editText3 = this.LJLJI;
                if (editText3 != null) {
                    String LJFF = C86V.LJFF(R.string.ile);
                    o.LJIIIIZZ(LJFF, "getString(R.string.nearb…ayregion_searchregionsin)");
                    Object[] objArr = new Object[1];
                    String str = ((C54662Lco) ((AssemViewModel) this.LJLJJI.getValue()).getState()).LJLJI;
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    String LLLZ = C16880lQ.LLLZ(LJFF, Arrays.copyOf(objArr, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                    editText3.setHint(LLLZ);
                    EditText editText4 = this.LJLJI;
                    if (editText4 != null) {
                        Context context2 = editText4.getContext();
                        o.LJIIIIZZ(context2, "searchInputView.context");
                        Integer LJI = C79045V0n.LJI(R.attr.gv, context2);
                        if (LJI != null) {
                            i = LJI.intValue();
                        }
                        editText4.setHintTextColor(i);
                        return;
                    }
                    o.LJIJI("searchInputView");
                    throw null;
                }
                o.LJIJI("searchInputView");
                throw null;
            }
            o.LJIJI("searchInputView");
            throw null;
        }
        o.LJIJI("searchBar");
        throw null;
    }
}
