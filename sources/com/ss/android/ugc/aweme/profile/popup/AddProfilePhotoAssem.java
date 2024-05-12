package com.ss.android.ugc.aweme.profile.popup;

import X.C119644mm;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8EE;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.InterfaceC207908Dy;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.popup.AddProfilePhotoAssem;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupViewModel;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddProfilePhotoAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public C119644mm LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public AddProfilePhotoAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AvatarAndNicknamePopupViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 800), C8EE.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 799));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C119644mm c119644mm = this.LJLILLLLZI;
        if (c119644mm != null) {
            c119644mm.setOnClickListener(new ViewOnClickListenerC13880ga(null));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((ViewStub) view).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.8EF
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                SY9 sy9;
                AddProfilePhotoAssem.this.LJLILLLLZI = (C119644mm) view2.findViewById(R.id.e44);
                AddProfilePhotoAssem addProfilePhotoAssem = AddProfilePhotoAssem.this;
                C119644mm c119644mm = addProfilePhotoAssem.LJLILLLLZI;
                if (c119644mm != null) {
                    Context context = addProfilePhotoAssem.getContext();
                    if (context != null) {
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_color_default_avatar;
                        sy9 = c2068389v.LIZ(context);
                    } else {
                        sy9 = null;
                    }
                    c119644mm.setImageDrawable(sy9);
                }
                User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                AddProfilePhotoAssem addProfilePhotoAssem2 = AddProfilePhotoAssem.this;
                C119644mm c119644mm2 = addProfilePhotoAssem2.LJLILLLLZI;
                if (c119644mm2 != null) {
                    c119644mm2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS38S0200000_3(addProfilePhotoAssem2, currentUser, 45)));
                }
                C8EN c8en = ((AvatarAndNicknamePopupViewModel) AddProfilePhotoAssem.this.LJLIL.getValue()).LJLIL;
                if (c8en != null) {
                    C188727au c188727au = new C188727au();
                    c8en.LIZ(c188727au);
                    FMX.LJIIL("show_update_avatar_sheet", c188727au.LIZ);
                }
            }
        });
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.8EA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8E3) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(view, 68), 6);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC207908Dy.class), new TBT() { // from class: X.8E9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C207858Dt) obj).LIZ;
            }
        }, new AqS169S0100000_3(this, 403));
    }
}
