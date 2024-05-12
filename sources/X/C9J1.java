package X;

import com.ss.android.ugc.aweme.profile.widgets.bind.account.ProfileBindAccountAssem;

/* renamed from: X.9J1, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class C9J1 extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public C9J1(ProfileBindAccountAssem profileBindAccountAssem) {
        super(1, profileBindAccountAssem, ProfileBindAccountAssem.class, "updateIconRes", "updateIconRes(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        ProfileBindAccountAssem profileBindAccountAssem = (ProfileBindAccountAssem) this.receiver;
        if (!profileBindAccountAssem.L7() && !C2318698c.LIZIZ()) {
            SY4 sy4 = profileBindAccountAssem.LJLJJL;
            if (sy4 != null) {
                sy4.setButtonStartIcon(Integer.valueOf(intValue));
            }
        } else {
            profileBindAccountAssem.updateIcon(Integer.valueOf(intValue));
        }
        return C76800UCe.LIZ;
    }
}
