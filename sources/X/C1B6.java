package X;

import androidx.fragment.app.FragmentManager;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.io.File;

/* renamed from: X.1B6, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1B6 implements IFilterManager.ErrorListener, FXB {
    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager.ErrorListener
    public void onError(int i, String str) {
        FilterManager.LJIIL(i, str);
    }

    public static boolean LIZIZ(String str) {
        return new File(str).exists();
    }

    public static C1B3 LIZ(FragmentManager fragmentManager, FragmentManager fragmentManager2) {
        fragmentManager.getClass();
        return new C1B3(fragmentManager2);
    }

    @Override // X.FXB
    public void log(String str, String str2) {
        C36922EeM.LIZLLL(4, str, str2);
    }
}
