package X;

import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class T28 implements InterfaceC67373QcL, C0K7 {
    public static RequestLog LIZ(K4J k4j) {
        C64668PZo requestInfo = k4j.getRequestInfo();
        if (requestInfo == null) {
            return null;
        }
        return (RequestLog) GsonProtectorUtils.fromJson(K4J.LJLI, requestInfo.LJIL, RequestLog.class);
    }

    public static GradientDrawable LIZIZ(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        return gradientDrawable;
    }

    public static String LIZJ(Integer num) {
        return GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), num);
    }

    public static AbstractC73638SvC LIZLLL(AbstractC73638SvC abstractC73638SvC) {
        return abstractC73638SvC.LJFF(new C62705OjF());
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC67373QcL
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public static void LJ(Rect rect, String str, View view, String str2, RecyclerView recyclerView, String str3, C0AC c0ac, String str4) {
        o.LJIIIZ(rect, str);
        o.LJIIIZ(view, str2);
        o.LJIIIZ(recyclerView, str3);
        o.LJIIIZ(c0ac, str4);
    }
}
