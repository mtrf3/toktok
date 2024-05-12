package defpackage;

import X.C15380j0;
import X.C31012CFc;
import X.C96Q;
import X.V0N;
import X.X1D;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class c1 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final RechargeViewModel LIZ;
    public final LifecycleOwner LIZIZ;
    public final MutableLiveData<t0> LIZJ = new MutableLiveData<>();
    public b LIZLLL = b.NOT_APPLICABLE_NEED_LESS;
    public DiamondPackageExtra LJ;
    public ListResult.VoucherItem LJFF;
    public boolean LJI;
    public boolean LJII;

    /* loaded from: classes14.dex */
    public static final class a {
    }

    /* loaded from: classes14.dex */
    public enum b {
        NOT_APPLICABLE_NEED_LESS,
        NOT_APPLICABLE_NEED_MORE,
        FROZEN,
        NORMAL;

        public static b valueOf(String str) {
            return (b) V0N.LJJJ(b.class, str);
        }
    }

    /* loaded from: classes14.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] LIZ;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FROZEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.NOT_APPLICABLE_NEED_MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            LIZ = iArr;
        }
    }

    public final void LIZ() {
        int i;
        b bVar;
        String str;
        Number number;
        String str2;
        String LJIILJJIL;
        Map<Long, String> map;
        ListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage;
        ListResult.VoucherItem voucherItem = this.LJFF;
        if (voucherItem == null) {
            return;
        }
        Diamond value = this.LIZ.LJZ.getValue();
        if (value != null) {
            i = value.count;
        } else {
            i = 0;
        }
        if (voucherItem.voucherStatus == 2 && System.currentTimeMillis() / 1000 < voucherItem.lockExpiryUnix) {
            bVar = b.FROZEN;
        } else {
            long j = i;
            if (j <= voucherItem.maxOrderCoinsAmount) {
                if (j >= voucherItem.minOrderCoinsAmount) {
                    bVar = b.NORMAL;
                } else {
                    bVar = b.NOT_APPLICABLE_NEED_MORE;
                }
            } else {
                bVar = b.NOT_APPLICABLE_NEED_LESS;
            }
        }
        this.LIZLLL = bVar;
        t0 value2 = this.LIZJ.getValue();
        if (value2 == null) {
            value2 = new t0();
        }
        boolean z = value2.LIZ;
        ListResult.VoucherItem.CashbackInfo cashbackInfo = voucherItem.cashbackInfo;
        if (cashbackInfo == null || (cashbackPercentage = cashbackInfo.cashbackPercentage) == null || (str = cashbackPercentage.iap) == null) {
            str = "";
        }
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.m3a);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_ky…hargePanel_cashbackLabel)");
        String LJJJJZ = ujb.o.LJJJJZ(LJIILJJIL2, "{num}", str, false);
        int i2 = c.LIZ[this.LIZLLL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    StringBuilder LIZJ = b1.LIZJ(LJJJJZ, ": ");
                    LIZJ.append(C15380j0.LJIILJJIL(R.string.m3f));
                    String LIZIZ = X1D.LIZIZ(LIZJ);
                    o.LJIIIZ(LIZIZ, "<set-?>");
                    value2.LIZJ = LIZIZ;
                    int i3 = (int) voucherItem.maxOrderCoinsAmount;
                    String LJIIIIZZ2 = C15380j0.LJIIIIZZ(R.plurals.mg, i3, Integer.valueOf(i3));
                    o.LJIIIIZZ(LJIIIIZZ2, "getQuantityString(R.plur…OrderCoinsAmount.toInt())");
                    value2.LIZLLL = LJIIIIZZ2;
                    value2.LIZIZ = false;
                } else {
                    StringBuilder LIZJ2 = b1.LIZJ(LJJJJZ, ": ");
                    LIZJ2.append(C15380j0.LJIILJJIL(R.string.m3f));
                    String LIZIZ2 = X1D.LIZIZ(LIZJ2);
                    o.LJIIIZ(LIZIZ2, "<set-?>");
                    value2.LIZJ = LIZIZ2;
                    int i4 = (int) voucherItem.minOrderCoinsAmount;
                    String LJIIIIZZ3 = C15380j0.LJIIIIZZ(R.plurals.mf, i4, Integer.valueOf(i4));
                    o.LJIIIIZZ(LJIIIIZZ3, "getQuantityString(R.plur…OrderCoinsAmount.toInt())");
                    value2.LIZLLL = LJIIIIZZ3;
                    value2.LIZIZ = false;
                }
            } else {
                StringBuilder LIZJ3 = b1.LIZJ(LJJJJZ, ": ");
                LIZJ3.append(C15380j0.LJIILJJIL(R.string.m3c));
                String LIZIZ3 = X1D.LIZIZ(LIZJ3);
                o.LJIIIZ(LIZIZ3, "<set-?>");
                value2.LIZJ = LIZIZ3;
                String expiryDate = C31012CFc.LIZ(Long.valueOf(voucherItem.lockExpiryUnix), "HH:mm");
                String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.m3b);
                o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_ky…rechargePanel_frozenDesc)");
                o.LJIIIIZZ(expiryDate, "expiryDate");
                value2.LIZLLL = ujb.o.LJJJJZ(LJIILJJIL3, "{time}", expiryDate, false);
                value2.LIZIZ = true;
            }
        } else {
            Diamond value3 = this.LIZ.LJZ.getValue();
            if (value3 != null) {
                number = Integer.valueOf(value3.id);
            } else {
                number = 0L;
            }
            ListResult.VoucherItem.CashbackInfo cashbackInfo2 = voucherItem.cashbackInfo;
            if (cashbackInfo2 != null && (map = cashbackInfo2.diamondIdToCashbackUsdAmt) != null) {
                str2 = map.get(Long.valueOf(number.longValue()));
            } else {
                str2 = null;
            }
            if (C96Q.LIZ(str2)) {
                LJJJJZ = a1.LJ(LJJJJZ, ": $", str2);
            }
            o.LJIIIZ(LJJJJZ, "<set-?>");
            value2.LIZJ = LJJJJZ;
            if (z) {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.m39);
                o.LJIIIIZZ(LJIILJJIL, "{\n                    Re…edDesc)\n                }");
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.m3_);
                o.LJIIIIZZ(LJIILJJIL, "{\n                    Re…edDesc)\n                }");
            }
            value2.LIZLLL = LJIILJJIL;
            value2.LIZIZ = false;
        }
        this.LIZJ.setValue(value2);
    }

    public c1(RechargeViewModel rechargeViewModel, LifecycleOwner lifecycleOwner) {
        this.LIZ = rechargeViewModel;
        this.LIZIZ = lifecycleOwner;
    }
}
