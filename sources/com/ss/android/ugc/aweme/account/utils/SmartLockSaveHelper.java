package com.ss.android.ugc.aweme.account.utils;

import X.C221108m2;
import X.C48339Iy7;
import X.C52319Kg7;
import X.C53042Krm;
import X.C53140KtM;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.R5W;
import X.SU4;
import X.X1D;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SmartLockSaveHelper {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(R5W.LJLIL);

    /* loaded from: classes12.dex */
    public static final class FrequencyData {

        @InterfaceC65349Pkn("fyp_show_times")
        public final int fypShowTimes;

        @InterfaceC65349Pkn("has_authority")
        public final boolean hasAuthority;

        @InterfaceC65349Pkn("has_click_never")
        public final boolean hasClickNever;

        @InterfaceC65349Pkn("profile_enter_days")
        public final int profileAndInboxEnterDays;

        @InterfaceC65349Pkn("profile_last_show_time")
        public final long profileAndInboxLastShowTime;

        @InterfaceC65349Pkn("profile_show_times")
        public final int profileAndInboxShowTimes;

        @InterfaceC65349Pkn("profile_today_enter_time")
        public final long profileTodayEnterTime;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public FrequencyData() {
            /*
                r12 = this;
                r1 = 0
                r3 = 0
                r10 = 127(0x7f, float:1.78E-43)
                r11 = 0
                r0 = r12
                r2 = r1
                r5 = r3
                r7 = r1
                r8 = r1
                r9 = r1
                r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.utils.SmartLockSaveHelper.FrequencyData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyData)) {
                return false;
            }
            FrequencyData frequencyData = (FrequencyData) obj;
            return this.hasAuthority == frequencyData.hasAuthority && this.profileAndInboxShowTimes == frequencyData.profileAndInboxShowTimes && this.profileAndInboxLastShowTime == frequencyData.profileAndInboxLastShowTime && this.profileTodayEnterTime == frequencyData.profileTodayEnterTime && this.profileAndInboxEnterDays == frequencyData.profileAndInboxEnterDays && this.fypShowTimes == frequencyData.fypShowTimes && this.hasClickNever == frequencyData.hasClickNever;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z = this.hasAuthority;
            int i = 1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int LIZJ = (((JBR.LIZJ(this.profileTodayEnterTime, JBR.LIZJ(this.profileAndInboxLastShowTime, ((r0 * 31) + this.profileAndInboxShowTimes) * 31, 31), 31) + this.profileAndInboxEnterDays) * 31) + this.fypShowTimes) * 31;
            if (!this.hasClickNever) {
                i = 0;
            }
            return LIZJ + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FrequencyData(hasAuthority=");
            LIZ.append(this.hasAuthority);
            LIZ.append(", profileAndInboxShowTimes=");
            LIZ.append(this.profileAndInboxShowTimes);
            LIZ.append(", profileAndInboxLastShowTime=");
            LIZ.append(this.profileAndInboxLastShowTime);
            LIZ.append(", profileTodayEnterTime=");
            LIZ.append(this.profileTodayEnterTime);
            LIZ.append(", profileAndInboxEnterDays=");
            LIZ.append(this.profileAndInboxEnterDays);
            LIZ.append(", fypShowTimes=");
            LIZ.append(this.fypShowTimes);
            LIZ.append(", hasClickNever=");
            return C48339Iy7.LIZJ(LIZ, this.hasClickNever, ')', LIZ);
        }

        public FrequencyData(boolean z, int i, long j, long j2, int i2, int i3, boolean z2) {
            this.hasAuthority = z;
            this.profileAndInboxShowTimes = i;
            this.profileAndInboxLastShowTime = j;
            this.profileTodayEnterTime = j2;
            this.profileAndInboxEnterDays = i2;
            this.fypShowTimes = i3;
            this.hasClickNever = z2;
        }

        public /* synthetic */ FrequencyData(boolean z, int i, long j, long j2, int i2, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0L : j, (i4 & 8) == 0 ? j2 : 0L, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) == 0 ? z2 : false);
        }

        public static FrequencyData LIZ(FrequencyData frequencyData, boolean z, int i, long j, long j2, int i2, int i3, boolean z2, int i4) {
            boolean z3 = z2;
            int i5 = i;
            boolean z4 = z;
            int i6 = i3;
            long j3 = j;
            long j4 = j2;
            int i7 = i2;
            if ((i4 & 1) != 0) {
                z4 = frequencyData.hasAuthority;
            }
            if ((i4 & 2) != 0) {
                i5 = frequencyData.profileAndInboxShowTimes;
            }
            if ((i4 & 4) != 0) {
                j3 = frequencyData.profileAndInboxLastShowTime;
            }
            if ((i4 & 8) != 0) {
                j4 = frequencyData.profileTodayEnterTime;
            }
            if ((i4 & 16) != 0) {
                i7 = frequencyData.profileAndInboxEnterDays;
            }
            if ((i4 & 32) != 0) {
                i6 = frequencyData.fypShowTimes;
            }
            if ((i4 & 64) != 0) {
                z3 = frequencyData.hasClickNever;
            }
            return new FrequencyData(z4, i5, j3, j4, i7, i6, z3);
        }
    }

    public static Keva LIZLLL() {
        return (Keva) LIZ.getValue();
    }

    public static void LJ() {
        LIZLLL().storeInt("save_error_times", LIZLLL().getInt("save_error_times", 0) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FrequencyData LIZJ(String str) {
        String data = LIZLLL().getString(str, "");
        o.LJIIIIZZ(data, "data");
        if (data.length() > 0) {
            Object fromJson = GsonProtectorUtils.fromJson(new Gson(), data, (Class<Object>) FrequencyData.class);
            o.LJIIIIZZ(fromJson, "{\n            Gson().fro…ta::class.java)\n        }");
            return (FrequencyData) fromJson;
        }
        long j = 0;
        return new FrequencyData(false, 0 == true ? 1 : 0, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
    }

    public static void LJFF(String str) {
        LJI(str, FrequencyData.LIZ(LIZJ(str), true, 0, 0L, 0L, 0, 0, false, 126));
    }

    public static boolean LIZ(int i, String str) {
        if (((Boolean) C52319Kg7.LIZ.getValue()).booleanValue() && i == 1 && !((Boolean) C53042Krm.LIZ.getValue()).booleanValue()) {
            return false;
        }
        FrequencyData LIZJ = LIZJ(str);
        if (LIZJ.hasAuthority || LIZJ.hasClickNever) {
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !LIZIZ(str, LIZJ)) {
                    return false;
                }
            } else if (!((Boolean) C53140KtM.LIZ.getValue()).booleanValue() || !LIZIZ(str, LIZJ)) {
                return false;
            }
        } else if (!((Boolean) C53042Krm.LIZ.getValue()).booleanValue() || LIZJ.fypShowTimes != 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str, FrequencyData frequencyData) {
        int i = frequencyData.profileAndInboxShowTimes;
        int i2 = frequencyData.profileAndInboxEnterDays;
        long j = frequencyData.profileTodayEnterTime;
        if (i >= 4) {
            return false;
        }
        if (i == 3) {
            if (!SU4.LIZLLL(j)) {
                LJI(str, FrequencyData.LIZ(frequencyData, false, 0, 0L, System.currentTimeMillis(), i2 + 1, 0, false, 103));
                if (i2 != 8) {
                    return false;
                }
                return true;
            }
        } else if (i == 2) {
            if (!SU4.LIZLLL(j)) {
                LJI(str, FrequencyData.LIZ(frequencyData, false, 0, 0L, System.currentTimeMillis(), i2 + 1, 0, false, 103));
                if (i2 != 6) {
                    return false;
                }
                return true;
            }
        } else if (i == 1) {
            if (!SU4.LIZLLL(j)) {
                LJI(str, FrequencyData.LIZ(frequencyData, false, 0, 0L, System.currentTimeMillis(), i2 + 1, 0, false, 103));
                if (i2 != 2) {
                    return false;
                }
                return true;
            }
        } else if (i == 0) {
            LJI(str, FrequencyData.LIZ(frequencyData, false, 0, 0L, System.currentTimeMillis(), 1, 0, false, 103));
            return true;
        }
        return false;
    }

    public static void LJI(String str, FrequencyData frequencyData) {
        LIZLLL().storeString(str, GsonProtectorUtils.toJson(new Gson(), frequencyData));
    }
}
