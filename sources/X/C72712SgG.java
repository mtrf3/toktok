package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SgG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72712SgG {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(int i, Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        if (bitmap.getWidth() <= i) {
            return bitmap;
        }
        float width = i / bitmap.getWidth();
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(width, width);
        Bitmap newBM = Bitmap.createBitmap(bitmap, 0, 0, width2, height, matrix, false);
        if (o.LJ(newBM, bitmap)) {
            o.LJIIIIZZ(newBM, "newBM");
        } else {
            o.LJIIIIZZ(newBM, "newBM");
        }
        return newBM;
    }

    public static void LIZIZ(UserPresenter userPresenter, String str, String str2, String str3, InterfaceC65784Pro callback) {
        o.LJIIIZ(userPresenter, "userPresenter");
        o.LJIIIZ(callback, "callback");
        C244379iT c244379iT = new C244379iT();
        c244379iT.LIZJ = str2;
        c244379iT.LJ = TextUtils.isEmpty(str3);
        c244379iT.LIZLLL = str3;
        java.util.Map<String, String> LIZ2 = c244379iT.LIZ();
        HashMap hashMap = (HashMap) LIZ2;
        hashMap.put("page_from", CardStruct.IStatusCode.DEFAULT);
        if (str != null) {
            hashMap.put("navi_id", str);
        }
        if (str3 != null) {
            hashMap.put("video_icon", str3);
        }
        userPresenter.bindView(new C72702Sg6(callback));
        userPresenter.updateUserInfo(LIZ2);
    }
}
