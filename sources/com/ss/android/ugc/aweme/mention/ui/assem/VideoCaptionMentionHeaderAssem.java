package com.ss.android.ugc.aweme.mention.ui.assem;

import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C218418hh;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C9KF;
import X.EnumC51135K5b;
import X.InterfaceC65784Pro;
import X.K5T;
import X.T5T;
import Y.IDObjectS176S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionStateViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCaptionMentionHeaderAssem extends UIContentAssem {
    public final C214378bB LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public VideoCaptionMentionHeaderAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCaptionMentionStateViewModel.class);
        C218418hh c218418hh = C218418hh.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 444);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLIL = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c218418hh, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 441));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 443));
    }

    public final K5T v3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-searchBox>(...)");
        return (K5T) value;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        Resources resources;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-navBar>(...)");
        C252709vu c252709vu = (C252709vu) value;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        Context context = getContext();
        String str2 = "";
        if (context == null || (str = context.getString(R.string.bur)) == null) {
            str = "";
        }
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 442));
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        v3().setSearchBarHeight(EnumC51135K5b.HIGH);
        T5T editTextView = v3().getEditTextView();
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(R.string.bup)) != null) {
            str2 = string;
        }
        editTextView.setHint(str2);
        v3().getEditTextView().addTextChangedListener(new IDObjectS176S0100000_3(this, 4));
    }
}
