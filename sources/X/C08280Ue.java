package X;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08280Ue {
    public static final C08280Ue LIZ = new C08280Ue();

    public static final AutofillId LIZ(ViewStructure structure) {
        o.LJIIIZ(structure, "structure");
        return structure.getAutofillId();
    }

    public static final boolean LIZIZ(AutofillValue value) {
        o.LJIIIZ(value, "value");
        return value.isDate();
    }

    public static final boolean LIZJ(AutofillValue value) {
        o.LJIIIZ(value, "value");
        return value.isList();
    }

    public static final boolean LIZLLL(AutofillValue value) {
        o.LJIIIZ(value, "value");
        return value.isText();
    }

    public static final boolean LJ(AutofillValue value) {
        o.LJIIIZ(value, "value");
        return value.isToggle();
    }

    public static final CharSequence LJIIIIZZ(AutofillValue value) {
        o.LJIIIZ(value, "value");
        CharSequence textValue = value.getTextValue();
        o.LJIIIIZZ(textValue, "value.textValue");
        return textValue;
    }

    public static final void LJFF(ViewStructure structure, String[] hints) {
        o.LJIIIZ(structure, "structure");
        o.LJIIIZ(hints, "hints");
        structure.setAutofillHints(hints);
    }

    public static final void LJII(ViewStructure structure, int i) {
        o.LJIIIZ(structure, "structure");
        structure.setAutofillType(i);
    }

    public static final void LJI(ViewStructure structure, AutofillId parent, int i) {
        o.LJIIIZ(structure, "structure");
        o.LJIIIZ(parent, "parent");
        structure.setAutofillId(parent, i);
    }
}
