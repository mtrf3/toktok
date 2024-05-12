package X;

import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* loaded from: classes14.dex */
public final class UXK implements UXN {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C77343UXb.LJLIL);

    public final Keva LJIIIIZZ() {
        return (Keva) this.LIZ.getValue();
    }

    @Override // X.UXN
    public final GuideKeywordsResponse.UserInfo LIZ() {
        try {
            String string = LJIIIIZZ().getString("user_info", "");
            UXY.LIZ.getClass();
            return (GuideKeywordsResponse.UserInfo) UXW.LIZIZ.LJI(string, GuideKeywordsResponse.UserInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.UXN
    public final boolean LIZJ() {
        return LJIIIIZZ().getBoolean("warn_expensive_gift", true);
    }

    @Override // X.UXN
    public final void LJ() {
        LJIIIIZZ().storeBoolean("warn_expensive_gift", false);
    }

    @Override // X.UXN
    public final Long LJFF() {
        Long valueOf = Long.valueOf(LJIIIIZZ().getLong("eea_show_timestamp", -1L));
        if (valueOf.longValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @Override // X.UXN
    public final Long LJII() {
        Long valueOf = Long.valueOf(LJIIIIZZ().getLong("row_show_timestamp", -1L));
        if (valueOf.longValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @Override // X.UXN
    public final void LIZIZ(GuideKeywordsResponse.UserInfo userInfo) {
        Keva LJIIIIZZ = LJIIIIZZ();
        UXY.LIZ.getClass();
        LJIIIIZZ.storeString("user_info", GsonProtectorUtils.toJson(UXW.LIZIZ, userInfo));
    }

    @Override // X.UXN
    public final void LIZLLL(long j) {
        LJIIIIZZ().storeLong("row_show_timestamp", j);
    }

    @Override // X.UXN
    public final void LJI(long j) {
        LJIIIIZZ().storeLong("eea_show_timestamp", j);
    }
}
