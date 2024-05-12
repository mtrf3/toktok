package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* renamed from: X.LJs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54064LJs extends MEG {
    public final ActivityC45651qj LJIIIIZZ;
    public final View LJIIIZ;
    public final ViewGroup LJIIJ;
    public final InterfaceC55235Lm3 LJIIJJI;

    @Override // X.MEG
    public final String LIZJ() {
        return "MainImmersiveTopBottomManager";
    }

    @Override // X.MEG
    public final int LIZ() {
        return this.LJIIIZ.getHeight();
    }

    @Override // X.MEG
    public final Aweme LIZIZ() {
        MainBusinessAbility LJIL = C1JD.LJIL(this.LJIIJJI);
        if (LJIL != null) {
            return LJIL.getCurrentAweme();
        }
        return null;
    }

    @Override // X.MEG
    public final void LJ(boolean z) {
        IMFToolBarAbility LJIJJ;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbility;
        float f;
        HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(this.LJIIJJI, HomeTabAbility.class, null);
        if (homeTabAbility != null) {
            int xb0 = homeTabAbility.xb0();
            if (xb0 != 0) {
                if (xb0 != 1 || (iFriendsTabLayoutAbility = (IFriendsTabLayoutAbility) C55096Ljo.LIZ(this.LJIIJJI, IFriendsTabLayoutAbility.class, null)) == null) {
                    return;
                }
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                iFriendsTabLayoutAbility.g70(f);
                return;
            }
            HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) C55096Ljo.LIZ(this.LJIIJJI, HomeViewPagerAbility.class, null);
            if (homeViewPagerAbility != null) {
                homeViewPagerAbility.LJJJJZ(z);
            }
            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(this.LJIIIIZZ);
            if (LJJLIIIJJI == null || (LJIJJ = C78923UyF.LJIJJ(LJJLIIIJJI)) == null) {
                return;
            }
            LJIJJ.Un0(this.LJII, z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54064LJs(ActivityC45651qj activityC45651qj, View view, ViewGroup viewGroup, InterfaceC55235Lm3 vScope) {
        super(activityC45651qj, view, viewGroup);
        o.LJIIIZ(vScope, "vScope");
        this.LJIIIIZZ = activityC45651qj;
        this.LJIIIZ = view;
        this.LJIIJ = viewGroup;
        this.LJIIJJI = vScope;
    }
}
