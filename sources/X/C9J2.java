package X;

import com.ss.android.ugc.aweme.profile.widgets.bind.account.ProfileBindAccountAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9J2, reason: invalid class name */
/* loaded from: classes5.dex */
public final /* synthetic */ class C9J2 extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public C9J2(ProfileBindAccountAssem profileBindAccountAssem) {
        super(1, profileBindAccountAssem, ProfileBindAccountAssem.class, "updateDescription", "updateDescription(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        ProfileBindAccountAssem profileBindAccountAssem = (ProfileBindAccountAssem) this.receiver;
        if (!profileBindAccountAssem.L7() && !C2318698c.LIZIZ()) {
            SY4 sy4 = profileBindAccountAssem.LJLJJL;
            if (sy4 != null) {
                sy4.setContentDescription(p0);
            }
        } else {
            profileBindAccountAssem.updateContentDescription(p0);
        }
        return C76800UCe.LIZ;
    }
}
