package defpackage;

import X.AbstractC234519Ih;
import X.C235119Kp;
import X.C29374Bfu;
import X.C9KF;
import X.FMX;
import X.InterfaceC65843Psl;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.AccountService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final /* synthetic */ class t1 implements InterfaceC65843Psl {
    @Override // X.InterfaceC65843Psl
    public void LIZ(boolean z) {
    }

    public static boolean LJI() {
        return AccountService.LJIJ().LJFF().isLogin();
    }

    public static Iterator LIZJ(NLEModel nLEModel, String str) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, str);
        return tracks.iterator();
    }

    public static C9KF LIZLLL(C235119Kp c235119Kp, AbstractC234519Ih[] abstractC234519IhArr) {
        c235119Kp.LIZLLL(abstractC234519IhArr);
        return new C9KF();
    }

    public static void LJ(C29374Bfu c29374Bfu, HashMap hashMap, String str) {
        hashMap.put(str, String.valueOf(c29374Bfu.getCurrentUserId()));
    }

    public static void LJFF(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        FMX.LJIIL(str3, linkedHashMap);
    }

    public static String LIZIZ(int i, int i2, String str, char c) {
        StringBuilder sb = new StringBuilder();
        sb.replace(i, i2, str);
        sb.append(c);
        return sb.toString();
    }
}
