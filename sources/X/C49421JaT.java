package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JaT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49421JaT {
    public static boolean LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;
    public static int LIZLLL;
    public static Integer LJ = 0;

    public static boolean LIZ(List list) {
        if (list == null) {
            return false;
        }
        for (Object obj : list) {
            if (((SearchUser) obj).awemeCards != null && (!r0.isEmpty())) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static void LIZJ(String str) {
        if (LIZIZ < 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", currentTimeMillis);
        jSONObject.put("logid", str);
        jSONObject.put("token_type", "user");
        jSONObject.put("search_id", str);
        AppLogNewUtils.onEventV3("search_horizontal_loading_show", jSONObject);
    }

    public static boolean LIZLLL(User user) {
        if (user == null || !user.isEnableDirectMessage()) {
            return true;
        }
        return false;
    }

    public static void LJFF(C57127MbT c57127MbT) {
        int i;
        OvalShape ovalShape = new OvalShape();
        Context context = c57127MbT.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.cj, context);
        int i2 = 0;
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        int width = c57127MbT.getWidth();
        int height = c57127MbT.getHeight();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(ovalShape);
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.setIntrinsicHeight(height);
        shapeDrawable.setIntrinsicWidth(width);
        c57127MbT.setPlaceholderImage(shapeDrawable);
        V8L v8l = ((V92) c57127MbT.getHierarchy()).LIZJ;
        if (v8l != null) {
            v8l.LIZLLL(C32151Nz.LJIIZILJ(Float.valueOf(0.5f)));
            Context context2 = c57127MbT.getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.dz, context2);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            v8l.LJFF = i2;
        }
    }

    public static void LIZIZ(int i, String str) {
        if (LIZIZ < 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", currentTimeMillis);
        jSONObject.put("logid", str);
        jSONObject.put("token_type", "user");
        jSONObject.put("loading_status", i);
        jSONObject.put("search_id", str);
        AppLogNewUtils.onEventV3("search_horizontal_loadmore_result", jSONObject);
    }

    public static void LJ(SmartImageView smartImageView, boolean z) {
        Shape rectShape;
        int i;
        o.LJIIIZ(smartImageView, "<this>");
        if (z) {
            rectShape = new OvalShape();
        } else {
            rectShape = new RectShape();
        }
        Context context = smartImageView.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.cj, context);
        int i2 = 0;
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        int width = smartImageView.getWidth();
        int height = smartImageView.getHeight();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(rectShape);
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.setIntrinsicHeight(height);
        shapeDrawable.setIntrinsicWidth(width);
        smartImageView.setPlaceholderImage(shapeDrawable);
        V8L v8l = ((V92) smartImageView.getHierarchy()).LIZJ;
        if (v8l != null) {
            v8l.LIZLLL(C32151Nz.LJIIZILJ(Float.valueOf(0.5f)));
            Context context2 = smartImageView.getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.dz, context2);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            v8l.LJFF = i2;
        }
    }
}
