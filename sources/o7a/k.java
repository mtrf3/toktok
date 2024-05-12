package o7a;

import X.K5T;
import X.T5T;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes9.dex */
public final class k {
    public int LIZ;
    public int LIZIZ;

    public final void LIZ(String str, p8.a aVar, K5T k5t, ViewGroup.LayoutParams layoutParams) {
        switch (str.hashCode()) {
            case -2140420418:
                if (!str.equals("app:tux_hasInnerStartIcon")) {
                    return;
                }
                k5t.setHasInnerStartIcon(q8.a.LIZ(aVar));
                return;
            case -290299425:
                if (!str.equals("app:tux_editHintText")) {
                    return;
                }
                if (aVar instanceof a.c) {
                    k5t.getEditTextView().setHint(aVar.LIZ);
                    return;
                }
                if (!(aVar instanceof a.b)) {
                    return;
                }
                T5T editTextView = k5t.getEditTextView();
                Context context = k5t.getContext();
                String str2 = aVar.LIZ;
                o.LJIIIIZZ(str2, "type.value");
                editTextView.setHint(context.getString(CastIntegerProtector.parseInt(str2)));
                return;
            case 9715179:
                if (!str.equals("app:tux_editBackgroundRadius")) {
                    return;
                }
                Context context2 = k5t.getContext();
                o.LJIIIIZZ(context2, "view.context");
                k5t.setEditBackgroundRadius(q8.a.LIZJ(context2, aVar));
                return;
            case 313100539:
                if (!str.equals("app:tux_emptyEndIconColor")) {
                    return;
                }
                Context context3 = k5t.getContext();
                o.LJIIIIZZ(context3, "view.context");
                this.LIZ = q8.a.LIZIZ(context3, aVar);
                return;
            case 323954744:
                if (!str.equals("app:tux_editText")) {
                    return;
                }
                if (aVar instanceof a.c) {
                    k5t.getEditTextView().setText(aVar.LIZ);
                    return;
                } else {
                    if (!(aVar instanceof a.b)) {
                        return;
                    }
                    T5T editTextView2 = k5t.getEditTextView();
                    String str3 = aVar.LIZ;
                    o.LJIIIIZZ(str3, "type.value");
                    editTextView2.setText(CastIntegerProtector.parseInt(str3));
                    return;
                }
            case 1234273096:
                if (!str.equals("app:tux_emptyEndIcon")) {
                    return;
                }
                String str4 = aVar.LIZ;
                o.LJIIIIZZ(str4, "type.value");
                this.LIZIZ = CastIntegerProtector.parseInt(str4);
                return;
            case 1983161127:
                if (!str.equals("app:tux_showSeparator")) {
                    return;
                }
                k5t.setShowSeparator(q8.a.LIZ(aVar));
                return;
            default:
                return;
        }
    }
}
