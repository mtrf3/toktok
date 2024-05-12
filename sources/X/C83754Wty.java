package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wty, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83754Wty implements IModFavoriteList {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final IModFavoriteList LIZIZ;
    public final List<String> LIZJ;
    public final boolean LIZLLL;
    public final C44428Hc8 LJ = C44428Hc8.LIZ();

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
    public final void onFail(ExceptionResult exceptionResult) {
        String str;
        String str2;
        long LIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
        IModFavoriteList iModFavoriteList = this.LIZIZ;
        if (iModFavoriteList != null) {
            iModFavoriteList.onFail(exceptionResult);
        }
        C145995oB c145995oB = new C145995oB();
        String str3 = this.LIZ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c145995oB.LJI("api_type", C78880UxY.LJJLIL(str3));
        c145995oB.LIZIZ(LIZIZ, "duration");
        c145995oB.LIZ(1, "status");
        List<String> list = this.LIZJ;
        if (list != null && (str2 = (String) ORZ.LJLLLL(list)) != null) {
            str4 = str2;
        }
        c145995oB.LJI("prop_id", str4);
        c145995oB.LIZ(this.LIZLLL ? 1 : 0, "is_favorite");
        Object obj = null;
        if (exceptionResult != null) {
            obj = Integer.valueOf(exceptionResult.getErrorCode());
        }
        c145995oB.LIZJ(obj, "error_code");
        if (exceptionResult == null || (str = exceptionResult.getMsg()) == null) {
            str = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", str);
        GXR.LIZ("effect_favorite_change_success_rate", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<String> list) {
        String str;
        long LIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
        IModFavoriteList iModFavoriteList = this.LIZIZ;
        if (iModFavoriteList != null) {
            iModFavoriteList.onSuccess(list);
        }
        C145995oB c145995oB = new C145995oB();
        String str2 = this.LIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c145995oB.LJI("api_type", C78880UxY.LJJLIL(str2));
        c145995oB.LIZIZ(LIZIZ, "duration");
        c145995oB.LIZ(0, "status");
        List<String> list2 = this.LIZJ;
        if (list2 != null && (str = (String) ORZ.LJLLLL(list2)) != null) {
            str3 = str;
        }
        c145995oB.LJI("prop_id", str3);
        c145995oB.LIZ(this.LIZLLL ? 1 : 0, "is_favorite");
        GXR.LIZ("effect_favorite_change_success_rate", c145995oB.LIZ);
    }

    public C83754Wty(String str, IModFavoriteList iModFavoriteList, List list, boolean z) {
        this.LIZ = str;
        this.LIZIZ = iModFavoriteList;
        this.LIZJ = list;
        this.LIZLLL = z;
    }
}
