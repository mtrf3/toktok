package X;

import Y.ARunnableS25S0200000_6;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import java.util.ArrayList;

/* renamed from: X.F2v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38337F2v extends C38338F2w<PushSettingActivity> {
    public int LIZJ;
    public final C83815Wux LIZLLL = new C83815Wux(this);

    public final void LIZ(int i, boolean z) {
        this.LIZJ = i;
        if (this.LIZ != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C66619QCp("shield_type", String.valueOf(i)));
            arrayList.add(new C66619QCp("is_shield", String.valueOf(z ? 1 : 0)));
            C38334F2s c38334F2s = new C38334F2s(C3AO.LIZ, EnumC38335F2t.POST, arrayList, String.class);
            c38334F2s.LIZ = this.LIZLLL;
            C38816FLg.LJ(new ARunnableS25S0200000_6(c38334F2s, EF7.LIZIZ(), 17));
        }
    }
}
