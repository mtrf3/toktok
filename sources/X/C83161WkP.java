package X;

import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import kotlin.jvm.internal.o;

/* renamed from: X.WkP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83161WkP {
    public static String LIZIZ(String key, String gender, String str) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(gender, "gender");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(key);
        LIZ.append(gender);
        LIZ.append("_key_selected_album_");
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static String LIZ(String key, String gender, String resId, String str) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(gender, "gender");
        o.LJIIIZ(resId, "resId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(key);
        LIZ.append(gender);
        LIZ.append("_composer_beauty_manual_");
        LIZ.append(resId);
        LIZ.append('_');
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static String LIZJ(String uid, String key, String gender, String resId, String str) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(gender, "gender");
        o.LJIIIZ(resId, "resId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(key);
        LIZ.append(gender);
        LIZ.append("_composer_beauty_manual_");
        LIZ.append(uid);
        LIZ.append('_');
        LIZ.append(resId);
        LIZ.append('_');
        LIZ.append(str);
        String mD5String = MD5Utils.getMD5String(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(mD5String, "MD5Utils.getMD5String(\"$…d}_\" + \"${resId}_${tag}\")");
        return mD5String;
    }
}
