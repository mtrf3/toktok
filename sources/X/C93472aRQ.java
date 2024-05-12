package X;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;

/* renamed from: X.aRQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93472aRQ {
    public static void LIZ(IDialog iDialog, Context context, String str, String str2, String str3, String str4, InterfaceC93473aRR interfaceC93473aRR, String str5, String str6, Rect rect, EnumC93404aQK enumC93404aQK, int i) {
        String str7 = str4;
        Rect rect2 = rect;
        String str8 = str5;
        EnumC93404aQK enumC93404aQK2 = enumC93404aQK;
        C61878OQg c61878OQg = null;
        if ((i & 16) != 0) {
            str7 = null;
        }
        String str9 = "";
        if ((i & 64) != 0) {
            str8 = "";
        }
        if ((i & 128) == 0) {
            str9 = str6;
        }
        if ((i & 256) != 0) {
            rect2 = null;
        }
        if ((i & 512) != 0) {
            c61878OQg = C61878OQg.INSTANCE;
        }
        if ((i & 1024) != 0) {
            enumC93404aQK2 = EnumC93404aQK.COMMON_DIALOG;
        }
        iDialog.show(context, str, str2, str3, str7, interfaceC93473aRR, str8, str9, rect2, c61878OQg, enumC93404aQK2);
    }
}
