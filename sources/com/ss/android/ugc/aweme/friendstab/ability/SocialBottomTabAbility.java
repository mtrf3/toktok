package com.ss.android.ugc.aweme.friendstab.ability;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C2NH;
import X.C45804HyK;
import X.C52287Kfb;
import X.C53295Kvr;
import X.C53976LGi;
import X.C78866UxK;
import X.C87277YNd;
import X.InterfaceC36571c5;
import X.LIF;
import X.LLE;
import X.LLQ;
import X.LNZ;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SocialBottomTabAbility implements IBottomTabLayoutAbility, LLE {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final void Hj0() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final LLQ Pp() {
        ActivityC45651qj LJJIFFI;
        LNZ lnz = LNZ.LIZIZ;
        Context context = this.LJLIL;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            return lnz.getHomeTabViewModel(LJJIFFI).Xm0();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final Fragment bn() {
        ActivityC45651qj LJJIFFI;
        Context context = this.LJLIL;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            return Hox.LJLLI.LIZ(LJJIFFI).Ja(this.LJLILLLLZI);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final void iC() {
        C2NH.LIZ.post(new ARunnableS45S0100000_9(this, 47));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final LIF tk() {
        ActivityC45651qj LJJIFFI;
        Context context = this.LJLIL;
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return null;
        }
        InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LJJIFFI).Ja(this.LJLILLLLZI);
        if (!(Ja instanceof LIF)) {
            return null;
        }
        return (LIF) Ja;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final int WZ() {
        LLQ Pp = Pp();
        if (Pp != null) {
            return Pp.LJIIIZ(this.LJLILLLLZI);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final boolean wY() {
        ActivityC45651qj activityC45651qj;
        ActivityC45651qj LJJIFFI;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        if (C53295Kvr.LIZJ()) {
            Context context = this.LJLIL;
            if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null && LJIL.zW(this.LJLILLLLZI)) {
                return true;
            }
            return false;
        }
        Context context2 = this.LJLIL;
        if (context2 != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context2);
        } else {
            activityC45651qj = null;
        }
        return o.LJ(C116694i1.LIZ(activityC45651qj).nv0(), this.LJLILLLLZI);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final boolean Ke() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility
    public final void iJ(boolean z) {
        this.LJLJI = z;
    }

    public SocialBottomTabAbility(Context context, String tabName) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(tabName, "tabName");
        this.LJLIL = context;
        this.LJLILLLLZI = tabName;
        if (context != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        C116694i1.LIZ(activityC45651qj).hv0(this);
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        String str4;
        Context context;
        ISocial2TabProtocolAbility LIZLLL;
        List<ISocialTabProtocol> L2;
        ISocialTabProtocol iSocialTabProtocol;
        Context context2;
        IFriendsTabLayoutAbility LIZ;
        IFriendsTabLayoutAbility LIZ2;
        if (o.LJ(str, this.LJLILLLLZI)) {
            Context context3 = this.LJLIL;
            if (context3 == null || (LIZ2 = C53976LGi.LIZ(context3)) == null || (str4 = LIZ2.TO()) == null) {
                str4 = "";
            }
            if (this.LJLJI && !o.LJ(str4, "FRIENDS_FEED") && (context2 = this.LJLIL) != null && (LIZ = C53976LGi.LIZ(context2)) != null) {
                LIZ.Mg();
            }
            if (this.LJLJJI && !C52287Kfb.LIZ() && (context = this.LJLIL) != null && (LIZLLL = C53976LGi.LIZLLL(context)) != null && (L2 = LIZLLL.L2()) != null) {
                Iterator<ISocialTabProtocol> it = L2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        iSocialTabProtocol = it.next();
                        if (o.LJ(iSocialTabProtocol.getTag(), str4)) {
                            break;
                        }
                    } else {
                        iSocialTabProtocol = null;
                        break;
                    }
                }
                ISocialTabProtocol iSocialTabProtocol2 = iSocialTabProtocol;
                if (iSocialTabProtocol2 != null) {
                    iSocialTabProtocol2.Y();
                }
            }
            this.LJLJJI = true;
        }
        if (o.LJ(str2, this.LJLILLLLZI)) {
            iC();
        }
    }
}
