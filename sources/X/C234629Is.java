package X;

import Y.ACListenerS30S0300000_4;
import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.bind.account.ProfileBindAccountAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9Is, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234629Is extends AbstractC65781Prl implements InterfaceC88472Yns<C43I<? extends User>, C76800UCe> {
    public final /* synthetic */ ProfileBindAccountAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C234629Is(ProfileBindAccountAssem profileBindAccountAssem) {
        super(1);
        this.LJLIL = profileBindAccountAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C43I<? extends User> c43i) {
        User user;
        C43I<? extends User> c43i2 = c43i;
        if (c43i2 != null && (user = (User) c43i2.LIZ) != null) {
            ProfileBindAccountAssem profileBindAccountAssem = this.LJLIL;
            if (!user.isBlock && profileBindAccountAssem._isViewValid) {
                if (!C46104I7o.LJJJJJL(user, profileBindAccountAssem.L7()) || C46104I7o.LJJJJL(user, profileBindAccountAssem.L7())) {
                    profileBindAccountAssem.L3(false);
                } else {
                    java.util.Map LIZJ = C243799hX.LIZJ(user);
                    C243799hX.LJII(((LinkedHashMap) LIZJ).keySet(), new C9J1(profileBindAccountAssem), new C9J2(profileBindAccountAssem));
                    boolean L7 = profileBindAccountAssem.L7();
                    C9IL c9il = C9IL.CTA;
                    String lowerCase = "HAS_TWITTER_FUNCTION".toLowerCase();
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                    C17J.LJIILLIIL(profileBindAccountAssem, L7, c9il, lowerCase, LIZJ.containsKey(3));
                    boolean L72 = profileBindAccountAssem.L7();
                    String lowerCase2 = "HAS_YOUTUBE_FUNCTION".toLowerCase();
                    o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
                    C17J.LJIILLIIL(profileBindAccountAssem, L72, c9il, lowerCase2, LIZJ.containsKey(2));
                    boolean L73 = profileBindAccountAssem.L7();
                    String lowerCase3 = "HAS_INSTAGRAM_FUNCTION".toLowerCase();
                    o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase()");
                    C17J.LJIILLIIL(profileBindAccountAssem, L73, c9il, lowerCase3, LIZJ.containsKey(1));
                    if (LIZJ.size() > 1) {
                        boolean L74 = profileBindAccountAssem.L7();
                        String lowerCase4 = "HAS_SOCIAL_BUTTON".toLowerCase();
                        o.LJIIIIZZ(lowerCase4, "this as java.lang.String).toLowerCase()");
                        C17J.LJIILLIIL(profileBindAccountAssem, L74, c9il, lowerCase4, true);
                    }
                    profileBindAccountAssem.L3(true);
                    if (!profileBindAccountAssem.L7() && !C2318698c.LIZIZ()) {
                        SY4 sy4 = profileBindAccountAssem.LJLJJL;
                        if (sy4 != null) {
                            C16880lQ.LJJIZ(sy4, new ACListenerS30S0300000_4(user, LIZJ, profileBindAccountAssem, 14));
                        }
                    } else {
                        profileBindAccountAssem.I3(new AqS93S0300000_4(user, (User) LIZJ, (java.util.Map<Integer, C243819hZ>) profileBindAccountAssem, (ProfileBindAccountAssem) 181));
                    }
                    Context context = profileBindAccountAssem.getContext();
                    C243839hb c243839hb = profileBindAccountAssem.LJLJJLL;
                    if (c243839hb != null) {
                        profileBindAccountAssem.updateActionList(C243799hX.LIZ(context, user, c243839hb, LIZJ));
                    } else {
                        o.LJIJI("mobParam");
                        throw null;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
