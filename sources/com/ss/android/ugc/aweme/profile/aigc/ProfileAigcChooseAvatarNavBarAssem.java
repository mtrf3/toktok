package com.ss.android.ugc.aweme.profile.aigc;

import X.C109824Ss;
import X.C214298b3;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.C9KF;
import X.EnumC252729vw;
import X.SR5;
import X.SRW;
import X.TBT;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcChooseAvatarNavBarAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public C235119Kp LJLJI;
    public C235119Kp LJLJJI;
    public C235119Kp LJLJJL;

    public ProfileAigcChooseAvatarNavBarAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcAvatarViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 834), SR5.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, SRW.class, "hierarchy_data_choose_avatar"), checkSupervisorPrepared());
    }

    public final ProfileAigcAvatarViewModel v3() {
        return (ProfileAigcAvatarViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Resources resources;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 17));
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            C9KF c9kf = new C9KF();
            String string = resources.getString(R.string.ck);
            o.LJIIIIZZ(string, "it.getString(R.string.AI…Page_selectAvatars_title)");
            c9kf.LIZJ = string;
            C234509Ig c234509Ig = new C234509Ig();
            String string2 = resources.getString(R.string.cf);
            o.LJIIIIZZ(string2, "it.getString(R.string.AI…ctAvatars_downloadButton)");
            c234509Ig.LIZJ = string2;
            EnumC252729vw enumC252729vw = EnumC252729vw.SECONDARY;
            c234509Ig.LIZ(enumC252729vw);
            c234509Ig.LIZ = new C109824Ss(new AqS162S0100000_12(this, 15));
            C234509Ig c234509Ig2 = new C234509Ig();
            String string3 = resources.getString(R.string.c7);
            o.LJIIIIZZ(string3, "it.getString(R.string.AI…Avatars_selectAll_button)");
            c234509Ig2.LIZJ = string3;
            c234509Ig2.LIZLLL = enumC252729vw;
            c234509Ig2.LIZ = new C109824Ss(new AqS162S0100000_12(this, 16));
            C234509Ig c234509Ig3 = new C234509Ig();
            String string4 = resources.getString(R.string.c1);
            o.LJIIIIZZ(string4, "it.getString(R.string.AI…atars_deselectAll_button)");
            c234509Ig3.LIZJ = string4;
            c234509Ig3.LIZLLL = enumC252729vw;
            c234509Ig3.LIZ = new C109824Ss(new AqS162S0100000_12(this, 14));
            C234509Ig c234509Ig4 = new C234509Ig();
            String string5 = resources.getString(R.string.bz);
            o.LJIIIIZZ(string5, "it.getString(R.string.AI…oadAvatars_cancel_button)");
            c234509Ig4.LIZJ = string5;
            c234509Ig4.LIZLLL = enumC252729vw;
            c234509Ig4.LIZ = new C109824Ss(new AqS162S0100000_12(this, 12));
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZLLL(LIZJ);
            c235119Kp.LIZJ = c9kf;
            c235119Kp.LIZIZ(c234509Ig);
            this.LJLJI = c235119Kp;
            C235119Kp c235119Kp2 = new C235119Kp();
            c235119Kp2.LIZLLL(c234509Ig4);
            c235119Kp2.LIZJ = c9kf;
            c235119Kp2.LIZIZ(c234509Ig2);
            this.LJLJJI = c235119Kp2;
            C235119Kp c235119Kp3 = new C235119Kp();
            c235119Kp3.LIZLLL(c234509Ig4);
            c235119Kp3.LIZJ = c9kf;
            c235119Kp3.LIZIZ(c234509Ig3);
            this.LJLJJL = c235119Kp3;
            C235119Kp c235119Kp4 = this.LJLJI;
            if (c235119Kp4 != null) {
                ((C252709vu) getContainerView().findViewById(R.id.gwg)).setNavActions(c235119Kp4);
            }
        }
        C8YN.LJII(this, v3(), new TBT() { // from class: X.SR4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJJI;
            }
        }, null, new AqS194S0100000_12(this, 134), 6);
    }
}
