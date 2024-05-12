package com.ss.android.ugc.aweme.im.sdk.search.ui.assem;

import X.C16880lQ;
import X.C17N;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C3PJ;
import X.C47704Ins;
import X.C53330KwQ;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C96203q4;
import X.C96213q5;
import X.C96223q6;
import X.C96283qC;
import X.C9BE;
import X.EnumC96193q3;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import Y.IDObjectS174S0100000_1;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS18S0310000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMSearchAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C55749LuL LJLJI;

    public IMSearchAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 660), C96203q4.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(C96213q5.LJLIL);
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C96223q6.class, "im_search_animation_data"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C3PJ(null));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        EnumC96193q3 style;
        o.LJIIIZ(view, "view");
        if (((C96223q6) this.LJLJI.getValue()).LJLILLLLZI != -1) {
            z = true;
        } else {
            z = false;
        }
        C96283qC c96283qC = (C96283qC) view.findViewById(R.id.jeb);
        C53330KwQ.LIZ.getClass();
        if (C53330KwQ.LIZIZ()) {
            style = EnumC96193q3.END;
        } else {
            style = EnumC96193q3.START;
        }
        AqS18S0310000_1 aqS18S0310000_1 = new AqS18S0310000_1(z, this, view, c96283qC, 0);
        c96283qC.getClass();
        o.LJIIIZ(style, "style");
        if (style == EnumC96193q3.START) {
            C17N.LJJLIIIJJI(c96283qC._$_findCachedViewById(R.id.aej));
            C17N.LJJIIJZLJL(c96283qC._$_findCachedViewById(R.id.b3r));
            C16880lQ.LJJJ((TuxIconView) c96283qC._$_findCachedViewById(R.id.aej), new ACListenerS21S0100000_1(aqS18S0310000_1, 104));
        } else {
            C17N.LJJIIJZLJL(c96283qC._$_findCachedViewById(R.id.aej));
            C17N.LJJLIIIJJI(c96283qC._$_findCachedViewById(R.id.b3r));
            C16880lQ.LJJJJI((TuxTextView) c96283qC._$_findCachedViewById(R.id.b3r), new ACListenerS21S0100000_1(aqS18S0310000_1, 104));
        }
        if (!z) {
            c96283qC.getCancelBtn$im_base_release().setAlpha(1.0f);
        }
        final EditText editText$im_base_release = c96283qC.getEditText$im_base_release();
        editText$im_base_release.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.3q2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3) {
                    C96373qL.LIZ(editText$im_base_release);
                    return false;
                }
                return false;
            }
        });
        editText$im_base_release.addTextChangedListener(new IDObjectS174S0100000_1(this, 4));
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.3cX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C86393aF) obj).LJLIL);
            }
        }, C213688a4.LJ(), new AqS164S0200000_1(view, this, 6), 4);
        if (!z) {
            view.findViewById(R.id.ajr).setAlpha(1.0f);
            view.findViewById(R.id.btg).setAlpha(1.0f);
            C17N.LJJLIIIJJI(view.findViewById(R.id.je_));
            EditText editText = ((C96283qC) view.findViewById(R.id.jeb)).getEditText$im_base_release();
            o.LJIIIZ(editText, "editText");
            editText.post(new ARunnableS37S0100000_1(editText, 80));
            return;
        }
        view.findViewById(R.id.bsj).post(new ARunnableS20S0200000_1(view, this, 18));
    }
}
