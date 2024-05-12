package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.servicimpl.TTEPPageFactoryDelegate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.O5c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C61328O5c implements InterfaceC48038ItG, InterfaceC67207QZf, InterfaceC44312HaG {
    public static Float LIZJ(int i) {
        return Float.valueOf(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
    }

    public static ArrayList LJ(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return arrayList;
    }

    @Override // X.InterfaceC44312HaG
    public void LIZ(WMH wmh) {
        TTEPPageFactoryDelegate.LIZIZ().LIZ(wmh);
    }

    @Override // X.InterfaceC67207QZf
    public String LIZIZ(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((BaseResponse) obj).data;
    }

    public static C48260Iwq LJFF(C67541Qf3 c67541Qf3, C61329O5d c61329O5d) {
        c61329O5d.LIZIZ(c67541Qf3.LIZ());
        return c61329O5d.LIZ();
    }

    public static String LIZLLL(StringBuilder sb, String str, String str2, Throwable th, StringBuilder sb2) {
        sb.append(str);
        sb.append(str2);
        sb.append(th.getMessage());
        return X1D.LIZIZ(sb2);
    }
}
