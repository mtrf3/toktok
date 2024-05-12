package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ffl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39557Ffl implements InterfaceC39559Ffn {
    public static final Class LIZ(InterfaceC65350Pko interfaceC65350Pko) {
        o.LJIIIZ(interfaceC65350Pko, "<this>");
        Class<?> LIZIZ = ((InterfaceC39558Ffm) interfaceC65350Pko).LIZIZ();
        o.LJII(LIZIZ, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return LIZIZ;
    }

    public static final Class LIZIZ(InterfaceC65350Pko interfaceC65350Pko) {
        o.LJIIIZ(interfaceC65350Pko, "<this>");
        Class<?> LIZIZ = ((InterfaceC39558Ffm) interfaceC65350Pko).LIZIZ();
        if (!LIZIZ.isPrimitive()) {
            return LIZIZ;
        }
        String name = LIZIZ.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return LIZIZ;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return LIZIZ;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return LIZIZ;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return LIZIZ;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return LIZIZ;
                }
                return Long.class;
            case 3625364:
                if (!name.equals("void")) {
                    return LIZIZ;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return LIZIZ;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return LIZIZ;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return LIZIZ;
                }
                return Short.class;
            default:
                return LIZIZ;
        }
    }

    public static final void LIZJ(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            str = "https://api.tiktokv.com/magic/runtime/?id=1079";
        }
        intent.setData(UriProtector.parse(str));
        String string = context.getResources().getString(R.string.phg);
        if (C85990Xow.LJIIIZ()) {
            string = context.getResources().getString(R.string.phk);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = string;
        }
        intent.putExtra("title", str2);
        intent.putExtra("aweme_model", bundle);
        C16880lQ.LIZJ(context, intent);
    }
}
