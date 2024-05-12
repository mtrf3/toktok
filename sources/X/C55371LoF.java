package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Calendar;

/* renamed from: X.LoF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55371LoF implements F67 {
    public static C55371LoF LJLJJLL;
    public int LJLIL = 22;
    public int LJLILLLLZI = -1;
    public int LJLJI = -1;
    public int LJLJJI = -1;
    public String LJLJJL;

    public static C55371LoF LIZIZ() {
        if (LJLJJLL == null) {
            synchronized (C55371LoF.class) {
                if (LJLJJLL == null) {
                    LJLJJLL = new C55371LoF();
                }
            }
        }
        return LJLJJLL;
    }

    public final void LIZ() {
        this.LJLIL = Q7K.LIZIZ("anti_addiction_separation", 22);
        this.LJLILLLLZI = Q7K.LIZIZ("anti_addiction_day_time", -1);
        this.LJLJI = Q7K.LIZIZ("anti_addiction_night_time", -1);
        this.LJLJJI = Q7K.LIZIZ("anti_addiction_toast_time", -1);
    }

    public C55371LoF() {
        LIZ();
        SettingsManager.LIZLLL().LJIIIZ(this);
    }

    @Override // X.F67
    public final void onChanged() {
        LIZ();
    }

    public final boolean LIZJ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(11);
        if (i >= this.LJLIL || i < 5) {
            return true;
        }
        return false;
    }
}
