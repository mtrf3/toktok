package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.GiT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42273GiT {
    /* JADX WARN: Multi-variable type inference failed */
    public static final HA3 LIZ(Activity activity, WM7 wm7) {
        if (wm7 instanceof HA3) {
            return (HA3) wm7;
        }
        if (activity instanceof SAAActivity) {
            InterfaceC36571c5 LLIIIILZ = ((SAAActivity) activity).LLIIIILZ();
            if (LLIIIILZ instanceof HA3) {
                return (HA3) LLIIIILZ;
            }
            return null;
        }
        if (activity instanceof VideoRecordNewActivity) {
            InterfaceC165696er interfaceC165696er = ((VideoRecordNewActivity) activity).LJLJJI;
            o.LJIIIIZZ(interfaceC165696er, "activity.rootScene");
            if (interfaceC165696er instanceof HA3) {
                return (HA3) interfaceC165696er;
            }
            return null;
        }
        return null;
    }
}
