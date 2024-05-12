package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRC extends WRB {
    @Override // X.WRB, X.InterfaceC82271WQp
    public final List<C79155V4t> LIZIZ() {
        List list;
        LIZLLL();
        String[] strArr = LJ().LIZ;
        String[] strArr2 = LJ().LIZIZ;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            int i3 = i2 + 1;
            LJ();
            int intValue = LJ().LIZJ[i2].intValue();
            int i4 = (-1) - i2;
            String valueOf = String.valueOf(i4);
            String str2 = strArr2[i2];
            if (i2 == 0) {
                list = C47261Igj.LJJIJIL("normal");
            } else {
                list = C61878OQg.INSTANCE;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("res://");
            LIZ.append(this.LIZIZ.getPackageName());
            LIZ.append('/');
            LIZ.append(intValue);
            arrayList.add(new C79155V4t(i4, valueOf, str, "", str2, null, list, null, UriProtector.parse(X1D.LIZIZ(LIZ)), ""));
            i++;
            i2 = i3;
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("viki filter, ComposerFilterLocalDataService.loadBackupFilters -> filter.size=");
        LIZ2.append(arrayList.size());
        LIZLLL.d(X1D.LIZIZ(LIZ2));
        return arrayList;
    }

    @Override // X.WRB
    public final boolean LJFF() {
        return C82807Weh.LIZ();
    }

    @Override // X.WRB, X.InterfaceC82271WQp
    public final C82273WQr LIZ(int i) {
        C82273WQr LIZ = super.LIZ(i);
        if (C140465fG.LIZ()) {
            return new C82273WQr(LIZ.LJLIL, LJI((-1) - i));
        }
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WRC(Context context, String filterRootDir, int i, List list, AndroidResourceFilterBackupPreferences preferences) {
        super(context, filterRootDir, i, list, preferences);
        o.LJIIIZ(filterRootDir, "filterRootDir");
        o.LJIIIZ(preferences, "preferences");
    }
}
