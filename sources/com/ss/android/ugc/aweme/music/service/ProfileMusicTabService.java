package com.ss.android.ugc.aweme.music.service;

import X.AMM;
import X.ANE;
import X.AV1;
import X.ActivityC45651qj;
import X.C199097rd;
import X.C1DJ;
import X.C235769Nc;
import X.C240599cN;
import X.C242169eu;
import X.C246299lZ;
import X.C246349le;
import X.C246419ll;
import X.C38350F3i;
import X.C58096Mr6;
import X.C61878OQg;
import X.C65352Pkq;
import X.C76732zl;
import X.C7Y8;
import X.C8VC;
import X.HG3;
import X.InterfaceC246289lY;
import X.InterfaceC246309la;
import X.InterfaceC246319lb;
import X.InterfaceC246329lc;
import X.InterfaceC246339ld;
import X.InterfaceC26350AVu;
import X.InterfaceC56322M8o;
import X.InterfaceC78280Uns;
import X.M71;
import X.M78;
import X.RBX;
import X.SU4;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.OriginMusicListNewFragment;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.music.ghost.GhostMusicFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS104S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileMusicTabService implements IProfileMusicTabService {
    public InterfaceC246339ld LIZ;

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIJJI() {
        C246349le.LIZLLL = null;
    }

    public static IProfileMusicTabService LJIJJLI() {
        Object LIZ = C58096Mr6.LIZ(IProfileMusicTabService.class, false);
        if (LIZ != null) {
            return (IProfileMusicTabService) LIZ;
        }
        if (C58096Mr6.h3 == null) {
            synchronized (IProfileMusicTabService.class) {
                if (C58096Mr6.h3 == null) {
                    C58096Mr6.h3 = new ProfileMusicTabService();
                }
            }
        }
        return C58096Mr6.h3;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZ() {
        InterfaceC246339ld interfaceC246339ld = this.LIZ;
        if (interfaceC246339ld != null) {
            interfaceC246339ld.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIILJJIL() {
        Keva.getRepo("repo_profile_music").storeBoolean("key_show_music_alert_badge", false);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJIILLIIL() {
        return Keva.getRepo("repo_profile_music").getBoolean("key_show_music_alert_badge", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZJ(ProfileListFragment profileListFragment) {
        InterfaceC246289lY interfaceC246289lY;
        if ((profileListFragment instanceof InterfaceC246289lY) && (interfaceC246289lY = (InterfaceC246289lY) profileListFragment) != null) {
            interfaceC246289lY.clearData();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJI(ProfileListFragment profileListFragment) {
        if ((profileListFragment instanceof GhostMusicFragment) && profileListFragment != null) {
            InterfaceC246319lb interfaceC246319lb = (InterfaceC246319lb) C8VC.LJI(profileListFragment, C65352Pkq.LIZ(InterfaceC246319lb.class));
            if (interfaceC246319lb != null) {
                interfaceC246319lb.LLLIIIIL();
            }
            InterfaceC246309la interfaceC246309la = (InterfaceC246309la) C8VC.LJI(profileListFragment, C65352Pkq.LIZ(InterfaceC246309la.class));
            if (interfaceC246309la != null) {
                interfaceC246309la.LLLIIIIL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIIIZZ(C199097rd c199097rd) {
        String string;
        InterfaceC246329lc interfaceC246329lc;
        M78 m78 = C246349le.LIZJ;
        if (m78 != null) {
            m78.LIZ();
        }
        C246349le.LIZJ = null;
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns == null || (string = interfaceC78280Uns.getString("type")) == null) {
            return;
        }
        if ((!o.LJ(string, "close") && !o.LJ(string, "confirm")) || (interfaceC246329lc = C246349le.LIZLLL) == null) {
            return;
        }
        interfaceC246329lc.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIL(String str) {
        C240599cN.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIILIIL(AMM amm) {
        C246349le.LIZLLL = amm;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIILL(ProfileListFragment profileListFragment) {
        if ((profileListFragment instanceof GhostMusicFragment) && profileListFragment != null) {
            InterfaceC246319lb interfaceC246319lb = (InterfaceC246319lb) C8VC.LJI(profileListFragment, C65352Pkq.LIZ(InterfaceC246319lb.class));
            if (interfaceC246319lb != null) {
                interfaceC246319lb.LJLJI();
            }
            InterfaceC246309la interfaceC246309la = (InterfaceC246309la) C8VC.LJI(profileListFragment, C65352Pkq.LIZ(InterfaceC246309la.class));
            if (interfaceC246309la != null) {
                interfaceC246309la.LJLJI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIZILJ(ANE ane) {
        this.LIZ = ane;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJIJI(User user) {
        o.LJIIIZ(user, "user");
        if (HG3.LJIILL().isLogin() && AV1.LJIJ(user) && C1DJ.LJJIJIIJIL(user)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJIJJ(User user) {
        if (((RBX) HG3.LJIILL()).isLogin() && AV1.LJIJ(user)) {
            if (user.getShowArtistPlaylist() != 1 && !C1DJ.LJJIJIIJIL(user)) {
                return false;
            }
        } else if (user.getShowArtistPlaylist() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZLLL(ProfileListFragment profileListFragment, InterfaceC26350AVu interfaceC26350AVu) {
        InterfaceC246289lY interfaceC246289lY;
        if ((profileListFragment instanceof InterfaceC246289lY) && (interfaceC246289lY = (InterfaceC246289lY) profileListFragment) != null) {
            interfaceC246289lY.o3(interfaceC26350AVu);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJ(Boolean bool, boolean z) {
        List<Long> list;
        boolean z2 = false;
        if (z && ((RBX) HG3.LJIILL()).isLogin() && !AV1.LJIILLIIL() && ((RBX) HG3.LJIILL()).getCurUser().getAccountType() != 3 && !o.LJ(bool, Boolean.FALSE) && ((RBX) HG3.LJIILL()).getCurUser().getShowArtistPlaylist() == 1 && C7Y8.LIZ()) {
            OriginalMusician originalMusician = ((RBX) HG3.LJIILL()).getCurUser().getOriginalMusician();
            if (originalMusician == null || (list = originalMusician.getNewReleaseClipIds()) == null) {
                list = C61878OQg.INSTANCE;
            }
            String[] array = Keva.getRepo("artist_new_release_highlight_repo").getStringArray(C246349le.LIZJ("artist_new_released_musics"), new String[0]);
            ArrayList arrayList = new ArrayList();
            o.LJIIIIZZ(array, "array");
            for (String it : array) {
                o.LJIIIIZZ(it, "it");
                arrayList.add(C38350F3i.LJJIZ(it));
            }
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!arrayList.contains(Long.valueOf(it2.next().longValue()))) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final ProfileListFragment LJII(Fragment fragment, OriginMusicArg originMusicArg) {
        User user;
        if (fragment instanceof OriginMusicListNewFragment) {
            return (ProfileListFragment) fragment;
        }
        if (originMusicArg.isMe() && (user = originMusicArg.getUser()) != null && C1DJ.LJJIJIIJIL(user)) {
            GhostMusicFragment ghostMusicFragment = new GhostMusicFragment();
            RouteArgExtension.INSTANCE.withNavArg(ghostMusicFragment, originMusicArg);
            return ghostMusicFragment;
        }
        OriginMusicListNewFragment originMusicListNewFragment = new OriginMusicListNewFragment();
        RouteArgExtension.INSTANCE.withNavArg(originMusicListNewFragment, originMusicArg);
        return originMusicListNewFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIIZ(ProfileListFragment profileListFragment, String str) {
        InterfaceC246289lY interfaceC246289lY;
        if ((profileListFragment instanceof InterfaceC246289lY) && (interfaceC246289lY = (InterfaceC246289lY) profileListFragment) != null) {
            interfaceC246289lY.setUsername(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIIJ(ProfileListFragment profileListFragment, boolean z) {
        if ((profileListFragment instanceof OriginMusicListNewFragment) && profileListFragment != null) {
            profileListFragment.onHiddenChanged(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final boolean LJFF(boolean z, boolean z2, boolean z3) {
        if (!SU4.LIZLLL(Keva.getRepo("artist_new_release_highlight_repo").getLong(C246349le.LIZJ("artist_music_offline_last_show_timestamp"), 0L)) && Keva.getRepo("artist_new_release_highlight_repo").getInt(C246349le.LIZJ("artist_music_offline_show_times"), 0) < C242169eu.LIZ().count && z && ((RBX) HG3.LJIILL()).isLogin() && !AV1.LJIILLIIL() && ((RBX) HG3.LJIILL()).getCurUser().getAccountType() != 3 && z2 && z3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LJIJ(ActivityC45651qj activity, View view, final C235769Nc c235769Nc) {
        o.LJIIIZ(activity, "activity");
        final C246419ll c246419ll = new C246419ll(view, this, activity, new C76732zl());
        PopupManager.LJIIL(new M71(c235769Nc, c246419ll) { // from class: X.9lh
            public final InterfaceC88472Yns<M78, C76800UCe> LJLIL;

            @Override // X.InterfaceC56321M8n
            public final int getPriority() {
                return 0;
            }

            {
                this.LJLIL = c246419ll;
            }

            @Override // X.M72
            public final void LIZLLL(C54082LKk context, M78 wrapper) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(wrapper, "wrapper");
                this.LJLIL.invoke(wrapper);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IProfileMusicTabService
    public final void LIZIZ(View view, ActivityC45651qj activity, InterfaceC56322M8o interfaceC56322M8o, C235769Nc c235769Nc) {
        long j;
        List<Long> list;
        OriginalMusician originalMusician;
        OriginalMusician originalMusician2;
        o.LJIIIZ(activity, "activity");
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && (originalMusician2 = curUser.getOriginalMusician()) != null) {
            j = originalMusician2.getHighlightMusicId();
        } else {
            j = 0;
        }
        User curUser2 = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser2 == null || (originalMusician = curUser2.getOriginalMusician()) == null || (list = originalMusician.getNewReleaseClipIds()) == null) {
            list = C61878OQg.INSTANCE;
        }
        int i = Keva.getRepo("artist_new_release_highlight_repo").getInt(C246349le.LIZJ("artist_new_release_show_times"), 0);
        AqS104S0101000_4 aqS104S0101000_4 = new AqS104S0101000_4(list, (List<Long>) i, 1);
        C246299lZ c246299lZ = C246299lZ.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (c235769Nc != null) {
                    C246349le.LIZ(aqS104S0101000_4, c246299lZ, view, c235769Nc);
                    return;
                }
                return;
            } else if (j == 0) {
                C246349le.LIZIZ(aqS104S0101000_4, c246299lZ, activity, interfaceC56322M8o);
                return;
            } else {
                if (c235769Nc == null) {
                    return;
                }
                C246349le.LIZ(aqS104S0101000_4, c246299lZ, view, c235769Nc);
                return;
            }
        }
        C246349le.LIZIZ(aqS104S0101000_4, c246299lZ, activity, interfaceC56322M8o);
    }
}
