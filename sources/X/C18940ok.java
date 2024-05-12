package X;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.0ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18940ok {
    public static final C18940ok LIZ = new C18940ok();

    public static final Object LIZ(C33861Uo localeList) {
        o.LJIIIZ(localeList, "localeList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(localeList, 10));
        Iterator<C16030k3> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(OUP.LJJJZ(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        o.LJII(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static final void LIZIZ(C17650mf textPaint, C33861Uo localeList) {
        o.LJIIIZ(textPaint, "textPaint");
        o.LJIIIZ(localeList, "localeList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(localeList, 10));
        Iterator<C16030k3> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(OUP.LJJJZ(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        o.LJII(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
