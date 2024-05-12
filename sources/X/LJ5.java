package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.interfaces.INearbyBottomTabAbility;
import com.ss.android.ugc.aweme.roaming.NearbyLocationRegion;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ5 {
    public static int LIZ;
    public static boolean LIZIZ;

    static {
        new LinkedHashMap();
    }

    public static boolean LIZ() {
        int i;
        if (LIZIZ && NearbyTabConfig.LIZLLL() && NearbyTabConfig.LJI() && ((i = LIZ) == 1 || i == 2)) {
            return true;
        }
        return false;
    }

    public static RoamingLocationInfo LJFF() {
        LocationRegion LIZJ;
        NearbyLocationRegion nearbyLocationRegion;
        int i;
        RoamingLocationInfo LIZ2 = LJ6.LIZ();
        RoamingLocationInfo roamingLocationInfo = null;
        if (LIZ2 == null) {
            Keva keva = LJ6.LIZ;
            String string = keva.getString(LJ6.LIZJ("last_selected_region"), null);
            if (C78685UuP.LJJJZ(string) && (nearbyLocationRegion = (NearbyLocationRegion) JsonParseUtils.LIZJ(NearbyLocationRegion.class, string)) != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(nearbyLocationRegion.getRegion().getL0Code());
                LIZ3.append('_');
                LIZ3.append(nearbyLocationRegion.getRegion().getId());
                LIZ3.append('_');
                LIZ3.append(nearbyLocationRegion.getRegion().getLevel().getLevel());
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                String name = nearbyLocationRegion.getRegion().getName();
                boolean z = !nearbyLocationRegion.isCurrentRegionAutoSelected();
                if (nearbyLocationRegion.isCurrentRegionAutoSelected()) {
                    i = 1;
                } else {
                    i = 2;
                }
                LIZ2 = new RoamingLocationInfo(LIZIZ2, name, z, i);
            }
            keva.erase(LJ6.LIZJ("last_selected_region"));
        }
        if (LIZ2 != null && LIZ2.isManual()) {
            Boolean valueOf = Boolean.valueOf(LIZ2.isManual());
            Keva keva2 = LJ6.LIZ;
            long j = keva2.getLong(LJ6.LIZJ("nearby_manually_selected_region_time"), 0L);
            if (j == 0 && o.LJ(valueOf, Boolean.TRUE)) {
                j = System.currentTimeMillis();
                keva2.storeLong(LJ6.LIZJ("nearby_manually_selected_region_time"), System.currentTimeMillis());
            }
            Integer num = NearbyTabConfig.LIZIZ().nearbyReturnDays;
            int i2 = -1;
            if (num != null && num.intValue() != -1) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                Integer num2 = NearbyTabConfig.LIZIZ().nearbyReturnDays;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                long j2 = i2 * 24 * 60 * 60 * 1000;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("needReturnToCurrentRegion: timeGap: ");
                LIZ4.append(currentTimeMillis / 86400000);
                LIZ4.append(", timeLimit: ");
                LIZ4.append(j2 / 86400000);
                L8O.LIZ(X1D.LIZIZ(LIZ4));
                if (currentTimeMillis > j2) {
                    keva2.erase(LJ6.LIZJ("last_roaming_region"));
                    if (NearbyTabConfig.LIZJ() == null && (LIZJ = NearbyTabConfig.LIZJ()) != null) {
                        return new RoamingLocationInfo(LIZJ.getRegionCode(), LIZJ.getName(), false, 1);
                    }
                }
            }
        }
        roamingLocationInfo = LIZ2;
        if (LIZ2 != null) {
            return roamingLocationInfo;
        }
        return NearbyTabConfig.LIZJ() == null ? roamingLocationInfo : roamingLocationInfo;
    }

    public static RoamingLocationInfo LIZIZ(ActivityC45651qj activityC45651qj) {
        RoamingLocationInfo roamingLocationInfo;
        if (LQA.LIZIZ.LJI()) {
            LJ1 LJII = LJII(activityC45651qj);
            if (LJII == null || (roamingLocationInfo = LJII.LJLJL) == null) {
                return C54040LIu.LIZIZ;
            }
            return roamingLocationInfo;
        }
        LJ1 LJII2 = LJII(activityC45651qj);
        if (LJII2 != null) {
            return LJII2.LJLJL;
        }
        return null;
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj) {
        String str;
        int i;
        String str2;
        String str3;
        if (!LQA.LIZIZ.LJIJI()) {
            return;
        }
        RoamingLocationInfo LIZIZ2 = LIZIZ(activityC45651qj);
        LocationRegion LIZJ = NearbyTabConfig.LIZJ();
        String str4 = null;
        if (LIZIZ2 != null) {
            str = LIZIZ2.getManualRegionName();
        } else {
            str = null;
        }
        if (LIZJ != null) {
            i = 3;
        } else {
            i = 1;
        }
        if (LIZIZ2 != null) {
            str2 = LIZIZ2.getCityCode();
        } else {
            str2 = null;
        }
        if (LIZJ == null || !o.LJ(str2, String.valueOf(LIZJ.getId())) || o.LJ(str, LIZJ.getName())) {
            return;
        }
        if (LIZJ != null) {
            str3 = LIZJ.getRegionCode();
            str4 = LIZJ.getName();
        } else {
            str3 = null;
        }
        C2U8.LIZ(new RoamingLocationInfo(str3, str4, false, i));
    }

    public static void LJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (LIZ()) {
            LJ1 LJII = LJII(activity);
            if (LJII != null) {
                LJII.LJLJJI = true;
                LJII.LIZIZ().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) LJII.LJLL.getValue(), (Drawable) null);
                LJII.LJLJJL = true;
                return;
            }
            return;
        }
        LJ1 LJII2 = LJII(activity);
        if (LJII2 == null) {
            return;
        }
        LJII2.LIZJ();
    }

    public static RoamingLocationInfo LJI(ActivityC45651qj activity) {
        RoamingLocationInfo roamingLocationInfo;
        o.LJIIIZ(activity, "activity");
        if (LQA.LIZIZ.LJI()) {
            LJ1 LJII = LJII(activity);
            if (LJII == null || (roamingLocationInfo = LJII.LJLJLJ) == null) {
                return C54040LIu.LIZJ;
            }
            return roamingLocationInfo;
        }
        LJ1 LJII2 = LJII(activity);
        if (LJII2 != null) {
            return LJII2.LJLJLJ;
        }
        return null;
    }

    public static LJ1 LJII(ActivityC45651qj activityC45651qj) {
        List<TopTabProtocol> L2;
        TopTabProtocol topTabProtocol;
        LCY LJFF;
        try {
            if (NearbyFeedServiceImpl.LJJI().LJI()) {
                INearbyBottomTabAbility iNearbyBottomTabAbility = (INearbyBottomTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), INearbyBottomTabAbility.class, null);
                if (iNearbyBottomTabAbility == null) {
                    return null;
                }
                return iNearbyBottomTabAbility.eb0(activityC45651qj);
            }
            HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), HomeTabAbility.class, null);
            if (homeTabAbility == null || (L2 = homeTabAbility.L2()) == null) {
                return null;
            }
            Iterator<TopTabProtocol> it = L2.iterator();
            while (true) {
                if (it.hasNext()) {
                    topTabProtocol = it.next();
                    if (o.LJ(topTabProtocol.getTag(), "Nearby")) {
                        break;
                    }
                } else {
                    topTabProtocol = null;
                    break;
                }
            }
            TopTabProtocol topTabProtocol2 = topTabProtocol;
            if (topTabProtocol2 == null || (LJFF = topTabProtocol2.LJFF()) == null) {
                return null;
            }
            InterfaceC53908LDs interfaceC53908LDs = LJFF.LIZ;
            if (interfaceC53908LDs == null) {
                interfaceC53908LDs = null;
            }
            return (LJ1) interfaceC53908LDs;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }

    public static boolean LJIIIIZZ(ActivityC45651qj activity) {
        CharSequence charSequence;
        o.LJIIIZ(activity, "activity");
        if (LQA.LIZIZ.LJI()) {
            LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(activity).Xm0();
            if (Xm0 != null) {
                charSequence = Xm0.LJIILJJIL();
            } else {
                charSequence = null;
            }
            o.LJIIIIZZ(activity.getString(R.string.il9), "activity.getString(R.string.nearby_tab_name)");
            return !TextUtils.equals(charSequence, r1);
        }
        LJ1 LJII = LJII(activity);
        if (LJII != null) {
            return LJII.LJLJLLL;
        }
        return false;
    }

    public static void LJIIJ(ActivityC45651qj activityC45651qj) {
        LJ1 LJII;
        if (LIZIZ && LIZ() && (LJII = LJII(activityC45651qj)) != null) {
            if (LJII.LJLJJL) {
                LJII.LJLJJI = true;
                LJII.LIZIZ().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) LJII.LJLL.getValue(), (Drawable) null);
                LJII.LJLJJL = true;
            } else {
                LJII.LJLJJI = true;
                LJII.LIZIZ().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) LJII.LJLLI.getValue(), (Drawable) null);
                LJII.LJLJJL = false;
            }
        }
    }

    public static void LJIIJJI(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (LIZ()) {
            LJ1 LJII = LJII(activity);
            if (LJII != null) {
                LJII.LJLJJI = true;
                LJII.LIZIZ().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) LJII.LJLLI.getValue(), (Drawable) null);
                LJII.LJLJJL = false;
                return;
            }
            return;
        }
        LJ1 LJII2 = LJII(activity);
        if (LJII2 == null) {
            return;
        }
        LJII2.LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r8.isManual() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r9 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        r0 = r9.getRegionCode();
        r3 = r9.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        X.C2U8.LIZ(new com.ss.android.ugc.aweme.roaming.RoamingLocationInfo(r0, r3, false, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r2 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r9 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.ActivityC45651qj r8, com.ss.android.ugc.tiktok.location_api.service.LocationRegion r9) {
        /*
            com.ss.android.ugc.aweme.roaming.RoamingLocationInfo r8 = LIZIZ(r8)
            if (r9 != 0) goto La
            com.ss.android.ugc.tiktok.location_api.service.LocationRegion r9 = com.ss.android.ugc.aweme.settings.NearbyTabConfig.LIZJ()
        La:
            r7 = 1
            if (r9 == 0) goto L24
            r5 = 3
        Le:
            r4 = 0
            if (r9 == 0) goto L26
            if (r8 != 0) goto L26
            com.ss.android.ugc.aweme.roaming.RoamingLocationInfo r2 = new com.ss.android.ugc.aweme.roaming.RoamingLocationInfo
            java.lang.String r1 = r9.getRegionCode()
            java.lang.String r0 = r9.getName()
            r2.<init>(r1, r0, r4, r5)
            X.C2U8.LIZ(r2)
            return r7
        L24:
            r5 = 1
            goto Le
        L26:
            r3 = 0
            if (r8 == 0) goto L4e
            java.lang.String r1 = r8.getL0Code()
            java.lang.String r6 = r8.getCityCode()
        L31:
            if (r9 == 0) goto L51
            java.lang.String r0 = r9.getL0Code()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L51
            com.ss.android.ugc.aweme.roaming.RoamingLocationInfo r2 = new com.ss.android.ugc.aweme.roaming.RoamingLocationInfo
            java.lang.String r1 = r9.getRegionCode()
            java.lang.String r0 = r9.getName()
            r2.<init>(r1, r0, r4, r5)
            X.C2U8.LIZ(r2)
            return r7
        L4e:
            r1 = r3
            r6 = r3
            goto L31
        L51:
            if (r8 == 0) goto La4
            java.lang.String r2 = r8.getManualRegionName()
        L57:
            if (r9 == 0) goto La6
            long r0 = r9.getId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L9d
            java.lang.String r0 = r9.getName()
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 != 0) goto L9d
            r2 = 1
        L72:
            long r0 = r9.getId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 != 0) goto La1
            if (r8 == 0) goto La1
            boolean r0 = r8.isManual()
            if (r0 != 0) goto La1
        L88:
            com.ss.android.ugc.aweme.roaming.RoamingLocationInfo r1 = new com.ss.android.ugc.aweme.roaming.RoamingLocationInfo
            if (r9 == 0) goto L9b
            java.lang.String r0 = r9.getRegionCode()
            java.lang.String r3 = r9.getName()
        L94:
            r1.<init>(r0, r3, r4, r5)
            X.C2U8.LIZ(r1)
            return r7
        L9b:
            r0 = r3
            goto L94
        L9d:
            r2 = 0
            if (r9 == 0) goto La1
            goto L72
        La1:
            if (r2 == 0) goto La6
            goto L88
        La4:
            r2 = r3
            goto L57
        La6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJ5.LIZJ(X.1qj, com.ss.android.ugc.tiktok.location_api.service.LocationRegion):boolean");
    }

    public static void LJIIIZ(int i, ActivityC45651qj activityC45651qj, boolean z) {
        LIZ = i;
        if (activityC45651qj != null && z && LIZIZ && LIZ() && NearbyTabConfig.LIZLLL() && NearbyTabConfig.LJI()) {
            C54045LIz.LIZ.getClass();
            if (C54045LIz.LIZIZ()) {
                LJIIJJI(activityC45651qj);
            }
        }
    }
}
