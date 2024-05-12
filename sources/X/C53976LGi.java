package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.LGi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53976LGi {
    public static final /* synthetic */ int LIZ = 0;

    public static IFriendsTabLayoutAbility LIZ(Context context) {
        o.LJIIIZ(context, "<this>");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return null;
        }
        return (IFriendsTabLayoutAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), IFriendsTabLayoutAbility.class, null);
    }

    public static IFriendsTabLayoutAbility LIZIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        if (fragment.getFragmentManager() == null) {
            return null;
        }
        return (IFriendsTabLayoutAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IFriendsTabLayoutAbility.class, null);
    }

    public static IFriendsTabLayoutAbility LIZJ(ActivityC45651qj activityC45651qj) {
        return (IFriendsTabLayoutAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), IFriendsTabLayoutAbility.class, null);
    }

    public static ISocial2TabProtocolAbility LIZLLL(Context context) {
        o.LJIIIZ(context, "<this>");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return null;
        }
        return (ISocial2TabProtocolAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), ISocial2TabProtocolAbility.class, null);
    }

    public static ISocial2TabProtocolAbility LJ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        if (fragment.getFragmentManager() == null) {
            return null;
        }
        return (ISocial2TabProtocolAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), ISocial2TabProtocolAbility.class, null);
    }

    public static ISocial2TabProtocolAbility LJFF(ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(activityC45651qj, "<this>");
        return (ISocial2TabProtocolAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), ISocial2TabProtocolAbility.class, null);
    }

    public static IBottomTabLayoutAbility LJI(Context context) {
        o.LJIIIZ(context, "<this>");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return null;
        }
        return (IBottomTabLayoutAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), IBottomTabLayoutAbility.class, null);
    }

    public static IBottomTabLayoutAbility LJII(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        if (fragment.getFragmentManager() == null) {
            return null;
        }
        return (IBottomTabLayoutAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IBottomTabLayoutAbility.class, null);
    }

    public static IBottomTabLayoutAbility LJIIIIZZ(ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(activityC45651qj, "<this>");
        return (IBottomTabLayoutAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), IBottomTabLayoutAbility.class, null);
    }

    public static IBottomFriendsTabAvatarAbility LJIIIZ(Context context) {
        o.LJIIIZ(context, "<this>");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return null;
        }
        return (IBottomFriendsTabAvatarAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), IBottomFriendsTabAvatarAbility.class, null);
    }

    public static IBottomFriendsTabAvatarAbility LJIIJ(ActivityC45651qj activityC45651qj) {
        return (IBottomFriendsTabAvatarAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), IBottomFriendsTabAvatarAbility.class, null);
    }
}
