package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.storage.experiment.StorageConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Mnu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57898Mnu {
    public static final String[] LIZ = {"1-1", "1-2", "1-3", "1-4", "1-5", "1-6", "1-7", "3-1", "3-2", "3-3", "6-1"};

    public static final Context LIZIZ(C57859MnH c57859MnH) {
        Context hostActivity;
        o.LJIIIZ(c57859MnH, "<this>");
        Fragment hostFragment = c57859MnH.getHostFragment();
        if ((hostFragment != null && (hostActivity = hostFragment.requireContext()) != null) || (hostActivity = c57859MnH.getHostActivity()) != null) {
            return hostActivity;
        }
        "not attach context!".toString();
        throw new IllegalStateException("not attach context!");
    }

    public static final boolean LIZJ(C57859MnH c57859MnH) {
        Integer num;
        int i;
        int i2;
        o.LJIIIZ(c57859MnH, "<this>");
        if (c57859MnH.getListConfig().LIZ != 401 || c57859MnH.getTrackerConfig().LJ) {
            return false;
        }
        if (c57859MnH.getListConfig().LJFF) {
            EnumC57901Mnx enumC57901Mnx = EnumC57901Mnx.CARD;
            o.LJIIIZ(enumC57901Mnx, "<this>");
            return RecMoreExperiment.LIZIZ(enumC57901Mnx, enumC57901Mnx.getMaxCount());
        }
        RecMoreExperiment.CardStrategy cardStrategy = RecMoreExperiment.LJI().cardStrategy;
        if (cardStrategy == null || (num = cardStrategy.enable) == null || num.intValue() != 1) {
            return false;
        }
        RecMoreExperiment.LIZ();
        Integer num2 = cardStrategy.low;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = -1;
        }
        Integer num3 = cardStrategy.high;
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            i2 = -1;
        }
        if (i == -1 || i2 == -1 || i2 < i) {
            return RecMoreExperiment.LIZIZ(EnumC57901Mnx.CARD, cardStrategy.maxFollowCount);
        }
        int i3 = RecMoreExperiment.LJ;
        if (i > i3 || i3 > i2) {
            return false;
        }
        return RecMoreExperiment.LIZIZ(EnumC57901Mnx.CARD, cardStrategy.maxFollowCount);
    }

    public static final LifecycleOwner LIZLLL(C57859MnH c57859MnH) {
        o.LJIIIZ(c57859MnH, "<this>");
        LifecycleOwner hostFragment = c57859MnH.getHostFragment();
        if (hostFragment != null || (hostFragment = c57859MnH.getHostActivity()) != null) {
            return hostFragment;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String LJ(C57859MnH c57859MnH) {
        o.LJIIIZ(c57859MnH, "<this>");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c57859MnH.getTrackerConfig().LIZ);
        LIZ2.append('|');
        LIZ2.append(c57859MnH.getTrackerConfig().LJFF);
        return X1D.LIZIZ(LIZ2);
    }

    public static final boolean LJFF(C57859MnH c57859MnH) {
        o.LJIIIZ(c57859MnH, "<this>");
        if (!c57859MnH.getApiConfig().LJII || !C57955Mop.LIZ()) {
            return false;
        }
        if (((StorageConfig) C90343gc.LIZIZ.getValue()).enablePoorNetworkOptimize == 1 && C2NU.LIZ.LIZJ == EnumC111394Yt.AVAILABLE) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C57859MnH c57859MnH) {
        if (c57859MnH.getApiConfig().LIZ == EnumC57876MnY.FIND_FRIENDS || c57859MnH.getApiConfig().LIZ == EnumC57876MnY.VERSION_UPDATE || c57859MnH.getApiConfig().LIZ == EnumC57876MnY.SUGGESTED_TAB_PAGE || c57859MnH.getApiConfig().LIZ == EnumC57876MnY.FRIENDS_TAB_EMPTY) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(C57859MnH c57859MnH) {
        if (c57859MnH.getApiConfig().LIZ == EnumC57876MnY.FIND_FRIENDS || c57859MnH.getApiConfig().LIZ == EnumC57876MnY.VERSION_UPDATE || c57859MnH.getApiConfig().LIZ == EnumC57876MnY.SUGGESTED_TAB_PAGE || c57859MnH.getApiConfig().LIZ == EnumC57876MnY.FRIENDS_TAB_EMPTY) {
            return true;
        }
        return false;
    }

    public static final UrlModel LIZ(C57846Mn4 c57846Mn4, int i, RecUser user, boolean z) {
        o.LJIIIZ(c57846Mn4, "<this>");
        o.LJIIIZ(user, "user");
        if (z) {
            UrlModel avatar300 = user.getAvatar300();
            if (avatar300 == null) {
                return user.getAvatarMedium();
            }
            return avatar300;
        }
        if (i != 400) {
            if (i != 401) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("can't support the listVariant: ");
                LIZ2.append(i);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                LIZIZ.toString();
                throw new IllegalStateException(LIZIZ);
            }
            switch (c57846Mn4.LIZ) {
                case 100:
                case 101:
                case 102:
                    UrlModel avatar168 = user.getAvatar168();
                    if (avatar168 == null) {
                        UrlModel avatar3002 = user.getAvatar300();
                        if (avatar3002 == null) {
                            return user.getAvatarMedium();
                        }
                        return avatar3002;
                    }
                    return avatar168;
                case 103:
                case 104:
                    UrlModel avatarThumb = user.getAvatarThumb();
                    if (avatarThumb == null) {
                        UrlModel avatar1682 = user.getAvatar168();
                        if (avatar1682 == null) {
                            UrlModel avatar3003 = user.getAvatar300();
                            if (avatar3003 == null) {
                                return user.getAvatarMedium();
                            }
                            return avatar3003;
                        }
                        return avatar1682;
                    }
                    return avatarThumb;
                default:
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("can't support the cell variant: ");
                    LIZ3.append(c57846Mn4.LIZ);
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    LIZIZ2.toString();
                    throw new IllegalStateException(LIZIZ2);
            }
        }
        UrlModel avatar3004 = user.getAvatar300();
        if (avatar3004 == null) {
            return user.getAvatarMedium();
        }
        return avatar3004;
    }
}
