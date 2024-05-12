package X;

import android.text.Layout;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VXv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79911VXv {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(List positionList) {
        int i;
        o.LJIIIZ(positionList, "positionList");
        if (positionList.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        List LLJILJILJ = ORZ.LLJILJILJ(positionList);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            int size2 = (arrayList.size() - i2) - 1;
            int i3 = 0;
            while (i3 < size2) {
                int i4 = i3 + 1;
                if (((Number) ((OSZ) ListProtector.get(LLJILJILJ, i3)).getFirst()).intValue() > ((Number) ((OSZ) ListProtector.get(LLJILJILJ, i4)).getFirst()).intValue()) {
                    Object obj = ListProtector.get(LLJILJILJ, i4);
                    ListProtector.set(LLJILJILJ, i4, ListProtector.get(LLJILJILJ, i3));
                    ListProtector.set(LLJILJILJ, i3, obj);
                }
                i3 = i4;
            }
            i2++;
        }
        ArrayList arrayList2 = new ArrayList();
        int intValue = ((Number) ((OSZ) ListProtector.get(LLJILJILJ, 0)).getFirst()).intValue();
        int intValue2 = ((Number) ((OSZ) ListProtector.get(LLJILJILJ, 0)).getSecond()).intValue();
        int size3 = arrayList.size();
        for (i = 1; i < size3; i++) {
            if (((Number) ((OSZ) ListProtector.get(LLJILJILJ, i)).getFirst()).intValue() <= intValue2) {
                if (((Number) ((OSZ) ListProtector.get(LLJILJILJ, i)).getSecond()).intValue() > intValue2) {
                    intValue2 = ((Number) ((OSZ) ListProtector.get(LLJILJILJ, i)).getSecond()).intValue();
                }
            } else {
                arrayList2.add(new OSZ(Integer.valueOf(intValue), Integer.valueOf(intValue2)));
                intValue = ((Number) ((OSZ) ListProtector.get(LLJILJILJ, i)).getFirst()).intValue();
                intValue2 = ((Number) ((OSZ) ListProtector.get(LLJILJILJ, i)).getSecond()).intValue();
            }
        }
        arrayList2.add(new OSZ(Integer.valueOf(intValue), Integer.valueOf(intValue2)));
        return arrayList2;
    }

    public static boolean LJ(int i, Layout layout) {
        if (i > 0 && layout.getLineForOffset(i) == layout.getLineForOffset(i - 1) + 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r0 < ':') goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(int r8, java.lang.CharSequence r9) {
        /*
            r7 = 0
            if (r9 != 0) goto L4
            return r7
        L4:
            if (r8 < 0) goto Lad
            int r0 = r9.length()
            if (r8 >= r0) goto Lad
            char r1 = r9.charAt(r8)
            java.lang.String r0 = ",./?;:'‘’\"<>[]{}()_+=-|\\`~!@#^&* ？，。！“”\u200b"
            boolean r0 = ujb.s.LJJJZ(r0, r1)
            if (r0 == 0) goto L50
            if (r8 < 0) goto L51
            int r0 = r9.length()
            if (r8 >= r0) goto L54
            char r1 = r9.charAt(r8)
            r0 = 44
            if (r1 != r0) goto L52
            int r1 = r9.length()
            int r0 = r8 + (-1)
            if (r0 < 0) goto L52
            if (r0 >= r1) goto L52
            char r0 = r9.charAt(r0)
            r3 = 58
            r2 = 48
            if (r2 > r0) goto L52
            if (r0 >= r3) goto L52
            int r1 = r9.length()
            int r0 = r8 + 1
            if (r0 < 0) goto L52
            if (r0 >= r1) goto L52
            char r0 = r9.charAt(r0)
            if (r2 > r0) goto L52
            if (r0 >= r3) goto L52
        L50:
            r7 = 1
        L51:
            return r7
        L52:
            if (r8 < 0) goto L51
        L54:
            int r0 = r9.length()
            if (r8 >= r0) goto L51
            char r1 = r9.charAt(r8)
            r0 = 45
            if (r1 == r0) goto L6a
            char r1 = r9.charAt(r8)
            r0 = 39
            if (r1 != r0) goto L51
        L6a:
            int r0 = r9.length()
            int r6 = r8 + (-1)
            if (r6 < 0) goto L51
            if (r6 >= r0) goto L51
            char r0 = r9.charAt(r6)
            r5 = 123(0x7b, float:1.72E-43)
            r4 = 97
            if (r4 > r0) goto La2
            if (r0 >= r5) goto La2
            r0 = 1
        L81:
            r3 = 91
            r2 = 65
            if (r0 != 0) goto L8f
            char r0 = r9.charAt(r6)
            if (r2 > r0) goto L51
            if (r0 >= r3) goto L51
        L8f:
            int r1 = r9.length()
            int r0 = r8 + 1
            if (r0 < 0) goto L51
            if (r0 >= r1) goto L51
            char r0 = r9.charAt(r0)
            if (r4 > r0) goto La4
            if (r0 >= r5) goto La4
            goto L50
        La2:
            r0 = 0
            goto L81
        La4:
            char r0 = r9.charAt(r6)
            if (r2 > r0) goto L51
            if (r0 >= r3) goto L51
            goto L50
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79911VXv.LJFF(int, java.lang.CharSequence):boolean");
    }

    public static int LIZ(int i, TextView textView, boolean z) {
        CharSequence charSequence;
        C79907VXr c79907VXr;
        List<Character> list = null;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return 0;
        }
        if ((textView instanceof C79907VXr) && (c79907VXr = (C79907VXr) textView) != null) {
            list = c79907VXr.getValidLetters();
        }
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        if (list == null) {
            list = c61878OQg;
        }
        Layout layout = textView.getLayout();
        if (layout == null) {
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int length = textView.getText().length();
        if (i > length) {
            i = length;
        }
        if (z) {
            AqS118S0300000_14 aqS118S0300000_14 = new AqS118S0300000_14(textView, (TextView) list, (List<Character>) layout, (Layout) 9);
            while (!((Boolean) aqS118S0300000_14.invoke(Integer.valueOf(i))).booleanValue() && i > 0) {
                i--;
            }
        } else {
            AqS118S0300000_14 aqS118S0300000_142 = new AqS118S0300000_14(textView, (TextView) list, (List<Character>) layout, (Layout) 10);
            while (!((Boolean) aqS118S0300000_142.invoke(Integer.valueOf(i - 1))).booleanValue() && i < textView.getText().length()) {
                i++;
            }
        }
        return i;
    }

    public static OSZ LIZJ(int i, TextView textView, boolean z) {
        o.LJIIIZ(textView, "textView");
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new OSZ(0, 0);
        }
        if (z) {
            return new OSZ(Integer.valueOf((int) layout.getPrimaryHorizontal(i)), Integer.valueOf(i));
        }
        if (i >= 0 && i < textView.getText().length() && textView.getText().charAt(i) == '\r') {
            if (i > 0) {
                int i2 = i - 1;
                return new OSZ(Integer.valueOf(((int) layout.getPrimaryHorizontal(i2)) + ((int) textView.getPaint().measureText(String.valueOf(textView.getText().charAt(i2))))), Integer.valueOf(i));
            }
            return new OSZ(Integer.valueOf((int) layout.getPrimaryHorizontal(i)), Integer.valueOf(i));
        }
        if (LJ(i, layout)) {
            int i3 = i - 1;
            return new OSZ(Integer.valueOf((int) layout.getPrimaryHorizontal(i3)), Integer.valueOf(i3));
        }
        return new OSZ(Integer.valueOf((int) layout.getPrimaryHorizontal(i)), Integer.valueOf(i));
    }

    public static int LIZLLL(int i, TextView textView, boolean z) {
        int lineBaseline;
        float f;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return 0;
        }
        TextPaint paint = layout.getPaint();
        if (z || !LJ(i, layout)) {
            lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i));
            f = paint.getFontMetrics().ascent;
        } else {
            lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i - 1));
            f = paint.getFontMetrics().ascent;
        }
        return lineBaseline + ((int) f);
    }
}
