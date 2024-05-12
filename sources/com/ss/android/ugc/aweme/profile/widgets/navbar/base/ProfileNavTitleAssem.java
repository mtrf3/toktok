package com.ss.android.ugc.aweme.profile.widgets.navbar.base;

import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C8VC;
import X.C9KF;
import X.C9PE;
import X.C9PF;
import X.EnumC235859Nl;
import X.InterfaceC88472Yns;
import X.T5U;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileNavTitleAssem extends ProfileNavActionAssem<EnumC235859Nl, C9KF> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C9PF.LJLIL);

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        setService((C9PE) C8VC.LIZIZ(this, C65352Pkq.LIZ(C9PE.class), null));
        updateAction(new AqS170S0100000_4(this, 719));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final EnumC235859Nl getActionType() {
        return EnumC235859Nl.Nickname;
    }

    public static CharSequence v3(User user) {
        UserPronounsInfo pronounsInfo;
        String pronouns;
        if (user == null || (pronounsInfo = user.getPronounsInfo()) == null || (pronouns = pronounsInfo.getPronouns()) == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pronouns);
        spannableStringBuilder.setSpan(new T5U(62, false), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public void updateAction(InterfaceC88472Yns<? super C9KF, C76800UCe> updater) {
        o.LJIIIZ(updater, "updater");
        getService().Yf(EnumC235859Nl.Nickname, updater);
        TuxTextView tuxTextView = (TuxTextView) getService().z5().findViewById(R.id.gwk);
        if (tuxTextView != null) {
            tuxTextView.LJJIZ(17.0f, 22, (Typeface) this.LJLIL.getValue(), 0.02f);
        }
    }
}
