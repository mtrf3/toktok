package com.ss.android.ugc.aweme.profile.popup;

import X.C119644mm;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78609UtB;
import X.C78926UyI;
import X.C8EK;
import X.C8YN;
import X.C9BE;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.popup.AvatarAddedSetUpNicknameAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AvatarAddedSetUpNicknameAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public C119644mm LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public AvatarAddedSetUpNicknameAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AvatarAndNicknamePopupViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 804), C8EK.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 803));
    }

    public final AvatarAndNicknamePopupViewModel v3() {
        return (AvatarAndNicknamePopupViewModel) this.LJLIL.getValue();
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
        ((ViewStub) view).setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.8EH
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                String str;
                User curUser;
                AvatarAddedSetUpNicknameAssem.this.LJLILLLLZI = (C119644mm) view2.findViewById(R.id.e44);
                C119644mm c119644mm = AvatarAddedSetUpNicknameAssem.this.LJLILLLLZI;
                if (c119644mm != null) {
                    C78609UtB.LJJIFFI(c119644mm);
                }
                TextView textView = (TextView) view2.findViewById(R.id.myy);
                IAccountUserService LJIILL = HG3.LJIILL();
                if (LJIILL == null || (curUser = LJIILL.getCurUser()) == null || (str = curUser.getNickname()) == null) {
                    str = "";
                }
                textView.setText(str);
                SY4 sy4 = (SY4) view2.findViewById(R.id.cp6);
                if (sy4 != null) {
                    C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(AvatarAddedSetUpNicknameAssem.this, 139));
                }
                SY4 sy42 = (SY4) view2.findViewById(R.id.h3n);
                if (sy42 != null) {
                    C16880lQ.LJJIZ(sy42, new ACListenerS23S0100000_3(AvatarAddedSetUpNicknameAssem.this, UserLevelGeckoUpdateSetting.DEFAULT));
                }
                C16880lQ.LJJJ((TuxIconView) view2.findViewById(R.id.i75), new ACListenerS23S0100000_3(AvatarAddedSetUpNicknameAssem.this, 141));
            }
        });
        C8YN.LJII(this, v3(), new TBT() { // from class: X.8EC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8E3) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(view, 70), 6);
    }
}
