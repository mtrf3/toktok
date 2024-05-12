package com.ss.android.ugc.aweme.profile.popup;

import X.C119644mm;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78609UtB;
import X.C78926UyI;
import X.C8EJ;
import X.C8YN;
import X.C9BE;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.popup.AvatarAddedAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AvatarAddedAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public C119644mm LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public AvatarAddedAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AvatarAndNicknamePopupViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 802), C8EJ.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 801));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        View containerView = getContainerView();
        o.LJII(containerView, "null cannot be cast to non-null type android.view.ViewStub");
        ((ViewStub) containerView).setOnInflateListener(null);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C119644mm c119644mm = this.LJLILLLLZI;
        if (c119644mm != null) {
            C78609UtB.LJJIFFI(c119644mm);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((ViewStub) view).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.8EG
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                String str;
                User curUser;
                AvatarAddedAssem.this.LJLILLLLZI = (C119644mm) view2.findViewById(R.id.e44);
                C119644mm c119644mm = AvatarAddedAssem.this.LJLILLLLZI;
                if (c119644mm != null) {
                    C78609UtB.LJJIFFI(c119644mm);
                }
                TextView textView = (TextView) view2.findViewById(R.id.myy);
                IAccountUserService LJIILL = HG3.LJIILL();
                if (LJIILL == null || (curUser = LJIILL.getCurUser()) == null || (str = curUser.getNickname()) == null) {
                    str = "";
                }
                textView.setText(str);
                C16880lQ.LJJJ((TuxIconView) view2.findViewById(R.id.i75), new ACListenerS23S0100000_3(AvatarAddedAssem.this, 137));
                C16880lQ.LJJIZ((SY4) view2.findViewById(R.id.kw), new ACListenerS23S0100000_3(AvatarAddedAssem.this, 138));
            }
        });
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.8EB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8E3) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(view, 69), 6);
    }
}
