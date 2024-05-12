package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9IA, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9IA extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ ProfileRootBaseComponent LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9IA(ProfileRootBaseComponent profileRootBaseComponent) {
        super(1);
        this.LJLIL = profileRootBaseComponent;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        ProfileUser profileUser;
        ProfileUser profileUser2;
        ProfileUser profileUser3;
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        Collection values = ((LinkedHashMap) this.LJLIL.LJLIL).values();
        ProfileRootBaseComponent profileRootBaseComponent = this.LJLIL;
        int i = 0;
        for (Object obj : values) {
            int i2 = i + 1;
            ProfileComponents profileComponents = null;
            if (i >= 0) {
                C234109Gs c234109Gs = (C234109Gs) obj;
                String str = c234109Gs.LIZ;
                profileRootBaseComponent.getClass();
                int hashCode = str.hashCode();
                if (hashCode != -1221270899) {
                    if (hashCode != 178027519) {
                        if (hashCode == 1730087671 && str.equals("nav_bar") && (profileUser3 = profileRootBaseComponent.LJLJLJ) != null) {
                            profileComponents = profileUser3.navBarComponents;
                        }
                    } else if (str.equals("profile_tab") && (profileUser2 = profileRootBaseComponent.LJLJLJ) != null) {
                        profileComponents = profileUser2.tabsComponents;
                    }
                } else if (str.equals("header") && (profileUser = profileRootBaseComponent.LJLJLJ) != null) {
                    profileComponents = profileUser.headerComponents;
                }
                if (profileRootBaseComponent.LJLL) {
                    profileRootBaseComponent.H3(i, profileComponents, c234109Gs.LIZ);
                } else {
                    assemble.nv0(profileRootBaseComponent, new AqS108S0300000_4(profileComponents, profileRootBaseComponent, c234109Gs, 22));
                    assemble.wv0(profileRootBaseComponent, new AqS170S0100000_4(c234109Gs, 811));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        this.LJLIL.LJLL = true;
        return C76800UCe.LIZ;
    }
}
