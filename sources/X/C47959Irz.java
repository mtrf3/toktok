package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Irz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C47959Irz implements InterfaceC47125IeX, O0Z {
    @Override // X.O0Z
    public void onComplete() {
        I18nSettingNewVersionFragment.Qo();
    }

    @Override // X.InterfaceC47125IeX
    public Object apply(Object obj) {
        String str = (String) obj;
        C47729IoH LJJII = C47148Ieu.LIZ.LJJII(str);
        if (LJJII == null) {
            return new C46907Ib1(str, 0L, 0L);
        }
        return new C46907Ib1(str, LJJII.LIZ, LJJII.LIZIZ);
    }

    public static float LIZ(MotionEvent motionEvent, float f) {
        return Math.abs(f - motionEvent.getX());
    }

    public static int LIZJ(int i, int i2) {
        return O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))) + i2;
    }

    public static int LIZIZ(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static String LIZLLL(int i, String str, String str2, boolean z) {
        FFL.LJIIIZ().getClass();
        return FFL.LJIILJJIL(i, str, str2, z);
    }

    public static ArrayList LJ(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }
}
