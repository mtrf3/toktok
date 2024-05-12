package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.ss.android.elearning.lingo.log.LogLevel;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class TBP extends FrameLayout {
    public C79907VXr LJLIL;
    public int LJLILLLLZI;
    public final List<OSZ<Integer, Integer>> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    public final void LIZ() {
        CharSequence text;
        ArrayList arrayList;
        C79907VXr c79907VXr = this.LJLIL;
        CharSequence charSequence = null;
        if (c79907VXr == null || (text = c79907VXr.getText()) == null || text.length() == 0 || this.LJLILLLLZI == -1 || !(!((ArrayList) this.LJLJI).isEmpty())) {
            return;
        }
        C79907VXr c79907VXr2 = this.LJLIL;
        if (c79907VXr2 != null) {
            charSequence = c79907VXr2.getText();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            if (intValue >= 0 && intValue < spannableStringBuilder.length()) {
                Iterable LJJLIIIIJ = s.LJJLIIIIJ(spannableStringBuilder);
                if (LJJLIIIIJ instanceof Collection) {
                    arrayList = ORZ.LLIIJI(1, (Collection) LJJLIIIIJ);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ORS.LJJLIIIJILLIZJL(LJJLIIIIJ, arrayList2);
                    arrayList2.add(1);
                    arrayList = arrayList2;
                }
                if (arrayList.contains(Integer.valueOf(intValue2))) {
                    try {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.LJLILLLLZI), intValue, intValue2, 33);
                    } catch (Exception e) {
                        NJO njo = NJO.LIZIZ;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        njo.getClass();
                        njo.LIZ(LogLevel.ERROR, "SafetyExtension", message);
                    }
                }
            }
        }
        C79907VXr c79907VXr3 = this.LJLIL;
        if (c79907VXr3 == null) {
            return;
        }
        c79907VXr3.setText(spannableStringBuilder);
    }

    public final OSZ<Rect, Rect> getCursorPosition() {
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr != null) {
            return c79907VXr.getCursorsPosition();
        }
        return null;
    }

    public final int getSelectAreaCenterX() {
        OSZ<Float, Float> osz;
        Rect rect;
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr == null || (osz = c79907VXr.getDrawAreaHorizontal()) == null) {
            osz = new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        float floatValue = (osz.getSecond().floatValue() + osz.getFirst().floatValue()) / 2;
        C79907VXr c79907VXr2 = this.LJLIL;
        if (c79907VXr2 == null) {
            rect = new Rect(0, 0, 0, 0);
        } else {
            int[] iArr = new int[2];
            c79907VXr2.getLocationInWindow(iArr);
            int i = iArr[0];
            rect = new Rect(i, iArr[1], c79907VXr2.getWidth() + i, c79907VXr2.getHeight() + iArr[1]);
        }
        return (int) (rect.left + floatValue);
    }

    public final String getSelectText() {
        String selectText;
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr == null || (selectText = c79907VXr.getSelectText()) == null) {
            return "";
        }
        return selectText;
    }

    public final int getStartIndex() {
        Integer num;
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr != null) {
            num = Integer.valueOf(c79907VXr.getSelectTextStart());
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final String getText() {
        CharSequence charSequence;
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr != null) {
            charSequence = c79907VXr.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    public final C79907VXr getCustomSelectTextView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBP(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = -1;
        this.LJLJI = new ArrayList();
        C79907VXr c79907VXr = new C79907VXr(context);
        this.LJLIL = c79907VXr;
        c79907VXr.setEnableTextSelect(true);
        addView(this.LJLIL, new ViewGroup.LayoutParams(-2, -2));
    }

    public final void setCustomSelectTextView(C79907VXr c79907VXr) {
        this.LJLIL = c79907VXr;
    }

    public final void setEnableAutoComplete(boolean z) {
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr != null) {
            c79907VXr.setEnableAutoComplete(z);
        }
    }

    public final void setFavorTextColor(String favorTextColor) {
        int parseColor;
        o.LJIIIZ(favorTextColor, "favorTextColor");
        try {
            parseColor = Color.parseColor(favorTextColor);
        } catch (Throwable unused) {
            parseColor = ColorProtector.parseColor("#000000");
        }
        this.LJLILLLLZI = parseColor;
        LIZ();
    }

    public final void setFavorTextRange(ReadableArray favorTextRange) {
        JavaOnlyArray javaOnlyArray;
        Object obj;
        int i;
        int i2;
        Integer num;
        Integer num2;
        o.LJIIIZ(favorTextRange, "favorTextRange");
        ((ArrayList) this.LJLJI).clear();
        int size = favorTextRange.size();
        for (int i3 = 0; i3 < size; i3++) {
            ReadableArray array = favorTextRange.getArray(i3);
            Object obj2 = null;
            if (array instanceof JavaOnlyArray) {
                javaOnlyArray = (JavaOnlyArray) array;
            } else {
                javaOnlyArray = null;
            }
            if (javaOnlyArray != null && javaOnlyArray.size() > 0) {
                obj = ListProtector.get(javaOnlyArray, 0);
            } else {
                obj = null;
            }
            if ((obj instanceof Integer) && (num2 = (Integer) obj) != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            if (javaOnlyArray != null && 1 < javaOnlyArray.size()) {
                obj2 = ListProtector.get(javaOnlyArray, 1);
            }
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            ((ArrayList) this.LJLJI).add(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
        }
        LIZ();
    }

    public final void setFontSize(int i) {
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr != null) {
            c79907VXr.setTextSize(1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextModels(ReadableArray textModels) {
        ArrayList arrayList;
        int i;
        C79907VXr c79907VXr;
        String str;
        String str2;
        int i2;
        Number valueOf;
        Integer num;
        String str3;
        String str4;
        int i3;
        Number valueOf2;
        Integer num2;
        boolean z;
        boolean z2;
        boolean z3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        o.LJIIIZ(textModels, "textModels");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (textModels instanceof JavaOnlyArray) {
            arrayList = (ArrayList) textModels;
        } else {
            arrayList = null;
        }
        int i4 = 0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            int i5 = 0;
            i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JavaOnlyMap) {
                    HashMap hashMap = (HashMap) next;
                    Object obj = hashMap.get("text");
                    if (!(obj instanceof String) || (str = (String) obj) == null) {
                        str = "";
                    }
                    Object obj2 = hashMap.get("fontFamily");
                    if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                        str2 = "Proxima Nova";
                    }
                    Object obj3 = hashMap.get("fontSize");
                    if (!(obj3 instanceof Long) || (valueOf = (Number) obj3) == null) {
                        Object obj4 = hashMap.get("fontSize");
                        if ((obj4 instanceof Integer) && (num = (Integer) obj4) != null) {
                            i2 = num.intValue();
                        } else {
                            i2 = 1;
                        }
                        valueOf = Integer.valueOf(i2);
                    }
                    Object obj5 = hashMap.get("fontStyle");
                    if (!(obj5 instanceof String) || (str3 = (String) obj5) == null) {
                        str3 = "normal";
                    }
                    Object obj6 = hashMap.get("fontColor");
                    if (!(obj6 instanceof String) || (str4 = (String) obj6) == null) {
                        str4 = "#000000";
                    }
                    Object obj7 = hashMap.get("fontWeight");
                    if (!(obj7 instanceof Long) || (valueOf2 = (Number) obj7) == null) {
                        Object obj8 = hashMap.get("fontWeight");
                        if ((obj8 instanceof Integer) && (num2 = (Integer) obj8) != null) {
                            i3 = num2.intValue();
                        } else {
                            i3 = 0;
                        }
                        valueOf2 = Integer.valueOf(i3);
                    }
                    Object obj9 = hashMap.get("super");
                    if ((obj9 instanceof Boolean) && (bool3 = (Boolean) obj9) != null) {
                        z = bool3.booleanValue();
                    } else {
                        z = false;
                    }
                    Object obj10 = hashMap.get("sub");
                    if ((obj10 instanceof Boolean) && (bool2 = (Boolean) obj10) != null) {
                        z2 = bool2.booleanValue();
                    } else {
                        z2 = false;
                    }
                    Object obj11 = hashMap.get("deleteLine");
                    if ((obj11 instanceof Boolean) && (bool = (Boolean) obj11) != null) {
                        z3 = bool.booleanValue();
                    } else {
                        z3 = false;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    spannableStringBuilder2.setSpan(new C74081T5p(valueOf.intValue(), valueOf2.intValue(), str2, str3, str4, z, z2, z3), 0, str.length(), 33);
                    spannableStringBuilder2.setSpan(new T5U(TBQ.LIZ(valueOf.intValue(), valueOf2.intValue()), false), 0, str.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                    i5 = Math.max(i5, valueOf.intValue());
                    i = Math.max(i, valueOf2.intValue());
                }
            }
            i4 = i5;
        } else {
            i = 0;
        }
        C79907VXr c79907VXr2 = this.LJLIL;
        if (c79907VXr2 != null) {
            c79907VXr2.setTuxFont(TBQ.LIZ(i4, i));
        }
        if (i4 != 0 && (c79907VXr = this.LJLIL) != null) {
            c79907VXr.setTextSize(1, i4);
        }
        C79907VXr c79907VXr3 = this.LJLIL;
        if (c79907VXr3 != null) {
            c79907VXr3.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
    }

    public final void LIZIZ(String selectableColor, String cursorColor) {
        o.LJIIIZ(selectableColor, "selectableColor");
        o.LJIIIZ(cursorColor, "cursorColor");
        int LIZ = C61499OBr.LIZ(selectableColor);
        int LIZ2 = C61499OBr.LIZ(cursorColor);
        C79907VXr c79907VXr = this.LJLIL;
        if (c79907VXr != null) {
            c79907VXr.LJZ = LIZ;
            C79909VXt c79909VXt = c79907VXr.LJLZ;
            if (c79909VXt != null) {
                c79909VXt.LIZLLL = LIZ2;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        NJO njo = NJO.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIEW-GROUP: measure--- ");
        C79907VXr c79907VXr = this.LJLIL;
        Integer num = null;
        if (c79907VXr != null) {
            charSequence = c79907VXr.getText();
        } else {
            charSequence = null;
        }
        LIZ.append((Object) charSequence);
        LIZ.append(" --- ");
        C79907VXr c79907VXr2 = this.LJLIL;
        if (c79907VXr2 != null) {
            num = Integer.valueOf(c79907VXr2.hashCode());
        }
        LIZ.append(num);
        njo.LIZIZ("CustomSelectTextViewGroup", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VIEW-GROUP: measure--- ");
        C15890jp.LIZIZ(LIZ2, mode, "--", size, "---");
        LIZ2.append(mode2);
        LIZ2.append("---");
        LIZ2.append(size2);
        njo.LIZIZ("CustomSelectTextViewGroup", X1D.LIZIZ(LIZ2));
        super.onMeasure(i, i2);
    }
}
