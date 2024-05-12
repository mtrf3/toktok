package X;

import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.68W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68W {
    public static int LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextStickerTextWrap LIZJ(String[] strArr) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (strArr == null || strArr.length == 0) {
            return new TextStickerTextWrap(null, 0 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            linkedHashMap.put(new TextStickerString(str), new ArrayList());
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "wholeStrBuilder.toString()");
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(sb2, new ArrayList()), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, null);
    }

    public static final List<TextStickerTextWrap> LIZLLL(String str) {
        return C47261Igj.LJII(LIZIZ(str, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<CreateAnchorInfo> LJ(List<? extends InteractStickerStruct> list) {
        boolean z;
        HashMap hashMap;
        String str;
        String str2;
        long j;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends InteractStickerStruct> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            InteractStickerStruct next = it.next();
            if (next.getType() == 6) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            try {
                Object LJII = C6PB.LIZIZ().LJII(((InteractStickerStruct) it2.next()).getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.68c
                }.getType());
                o.LJIIIIZZ(LJII, "gson\n                .fr…ring, String>>() {}.type)");
                hashMap = (HashMap) LJII;
                str = "";
                if (!(hashMap.get("donation_name") instanceof String)) {
                    str2 = "";
                } else {
                    Object obj = hashMap.get("donation_name");
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                    str2 = (String) obj;
                }
                if (hashMap.get("donation_url") instanceof String) {
                    Object obj2 = hashMap.get("donation_url");
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                    str = (String) obj2;
                }
            } catch (Exception e) {
                C6PB.LIZJ().LIZ(e.getMessage());
            }
            if (hashMap.get("add_anchor_time") instanceof String) {
                Object obj3 = hashMap.get("add_anchor_time");
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
                if (((String) obj3).length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Object obj4 = hashMap.get("add_anchor_time");
                    o.LJII(obj4, "null cannot be cast to non-null type kotlin.String");
                    j = CastLongProtector.parseLong((String) obj4);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("add_from", 1);
                    jSONObject.put("organization_id", hashMap.get("organization_id"));
                    jSONObject.put("organization_type", hashMap.get("organization_type"));
                    String jSONObject2 = jSONObject.toString();
                    o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
                    String str3 = str2;
                    arrayList.add(new CreateAnchorInfo(19, str3, str, "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png", Long.valueOf(j), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 8064, 0 == true ? 1 : 0));
                }
            }
            j = 0;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("add_from", 1);
            jSONObject3.put("organization_id", hashMap.get("organization_id"));
            jSONObject3.put("organization_type", hashMap.get("organization_type"));
            String jSONObject22 = jSONObject3.toString();
            o.LJIIIIZZ(jSONObject22, "jsonObject.toString()");
            String str32 = str2;
            arrayList.add(new CreateAnchorInfo(19, str32, str, "", jSONObject22, "https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png", Long.valueOf(j), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 8064, 0 == true ? 1 : 0));
        }
        return arrayList;
    }

    public static final String LJFF(List<TextStickerTextWrap> list) {
        boolean z;
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (textStickerTextWrap.isValid()) {
                arrayList.add(textStickerTextWrap);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (arrayList.size() > 1) {
            int size = arrayList.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, i)).safeStrPair().first);
                    sb.append("\n");
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, arrayList.size() - 1)).safeStrPair().first);
        } else {
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, 0)).safeStrPair().first);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }

    public static final List<InteractTextStructWrap> LJI(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (textStickerTextWrap.isValid()) {
                arrayList.add(textStickerTextWrap);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                return ((TextStickerTextWrap) ListProtector.get(arrayList, 0)).safeStrPair().second;
            }
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                for (InteractTextStructWrap interactTextStructWrap : ((TextStickerTextWrap) ListProtector.get(arrayList, i)).safeStrPair().second) {
                    interactTextStructWrap.getRange().getStart();
                    interactTextStructWrap.getRange().getEnd();
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<TextStickerTextWrap> it = list.iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it.next().safeStrPair().second, arrayList2);
            }
            return arrayList2;
        }
        return new ArrayList();
    }

    public static final String LJII(List<TextStickerTextWrap> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator<TextStickerTextWrap> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getText());
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final List<CreateAnchorInfo> LJIIIZ(List<? extends InteractStickerStruct> list) {
        boolean z;
        TextStruct textStruct;
        List<CreateAnchorInfo> arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (list == null) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<? extends InteractStickerStruct> it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            InteractStickerStruct next = it.next();
            if (next.getType() == 5) {
                z2 = true;
            }
            if (z2) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            try {
                textStruct = (TextStruct) C6PB.LIZIZ().LJI(((InteractStickerStruct) it2.next()).getTextStruct(), TextStruct.class);
            } catch (Exception unused) {
                textStruct = null;
            }
            if (textStruct == null || (arrayList = textStruct.getAnchors()) == null) {
                arrayList = new ArrayList<>();
            }
            ORS.LJJLIIIJILLIZJL(arrayList, arrayList4);
        }
        arrayList2.addAll(arrayList4);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) it3.next();
            String iconUrl = createAnchorInfo.getIconUrl();
            if (iconUrl == null || iconUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                createAnchorInfo.setIconUrl("https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png");
                createAnchorInfo.setAddTime(0L);
            }
        }
        return arrayList2;
    }

    public static final boolean LJIIJ(List<TextStickerTextWrap> list) {
        if (list == null) {
            return false;
        }
        Iterator<TextStickerTextWrap> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextStickerTextWrap next = it.next();
            if (!next.safeStrPair().second.isEmpty()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJIIJJI(List<TextStickerTextWrap> list) {
        o.LJIIIZ(list, "<this>");
        Iterator<TextStickerTextWrap> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextStickerTextWrap next = it.next();
            if (s.LJZI(next.safeStrPair().first).toString().length() > 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJIILIIL(List<TextStickerTextWrap> list) {
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (textStickerTextWrap.isValid()) {
                if (textStickerTextWrap != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextStickerTextWrap LIZ(TextView textView, List<InteractTextStructWrap> list) {
        TextStickerString textStickerString;
        if (textView == null) {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            return new TextStickerTextWrap(null, objArr, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, objArr2);
        }
        String charSequence = textView.getText().toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int lineCount = textView.getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = textView.getLayout().getLineEnd(i);
            String substring = charSequence.substring(i2, lineEnd);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (substring.length() > 1 && ujb.o.LJJJJ(substring, "\n", false)) {
                textStickerString = new TextStickerString(C58314Muc.LIZIZ(substring, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)"));
            } else {
                textStickerString = new TextStickerString(substring);
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (InteractTextStructWrap interactTextStructWrap : list) {
                    if (interactTextStructWrap.getRange().getStart() < lineEnd && interactTextStructWrap.getRange().getEnd() > i2) {
                        if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, lineEnd - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        } else if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, interactTextStructWrap.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, lineEnd - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, interactTextStructWrap.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        }
                    }
                }
            }
            if (arrayList.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(33));
            }
            linkedHashMap.put(textStickerString, arrayList);
            textView.getLayout().getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<InteractTextStructWrap> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(InteractTextStructWrap.copy$default(it.next(), null, null, 3, null));
            }
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(charSequence, arrayList2), textView.getSelectionStart(), textView.hasFocus(), false, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextStickerTextWrap LIZIZ(String str, boolean z) {
        if (str == null || str.length() == 0) {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            return new TextStickerTextWrap(null, objArr, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, objArr2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new TextStickerString(str), new ArrayList());
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(str, new ArrayList()), 0, 0 == true ? 1 : 0, z, 12, null);
    }

    public static final boolean LJIIL(int i, List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((InteractTextStructWrap) next).isValid(i)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String[] LJIILJJIL(TextStickerData textStickerData, Context context) {
        String obj;
        Layout layout;
        o.LJIIIZ(context, "context");
        ArrayList arrayList = new ArrayList();
        C1551767d c1551767d = new C1551767d(context, null);
        c1551767d.setAligin(textStickerData.getAlign());
        c1551767d.LJIILJJIL(textStickerData.getBgMode(), textStickerData.getColor());
        c1551767d.setFontType(C68M.LJIIJ().LJIIL(textStickerData.getFontType()));
        c1551767d.LJIILL(0, textStickerData.getTextStr());
        c1551767d.setTextSize(textStickerData.getFontSize());
        c1551767d.setPadding((int) C74275TDb.LIZIZ(context, 32.0f), (int) C74275TDb.LIZIZ(context, 12.0f), (int) C74275TDb.LIZIZ(context, 32.0f), (int) C74275TDb.LIZIZ(context, 12.0f));
        c1551767d.measure(View.MeasureSpec.makeMeasureSpec(C60996Nwm.LJIIJ(context), 1073741824), View.MeasureSpec.makeMeasureSpec(0, LiveLayoutPreloadThreadPriority.DEFAULT));
        c1551767d.layout(0, 0, c1551767d.getMeasuredWidth(), c1551767d.getMeasuredHeight());
        Editable text = c1551767d.getText();
        if (text != null && (obj = text.toString()) != null && (layout = c1551767d.getLayout()) != null) {
            int lineCount = layout.getLineCount();
            int i = 0;
            int i2 = 0;
            while (i < lineCount) {
                int lineEnd = layout.getLineEnd(i);
                String substring = obj.substring(i2, lineEnd);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                i++;
                i2 = lineEnd;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final OSZ LJIILL(int i, String str, List list) {
        Object obj;
        String LIZIZ;
        if (list == null) {
            return new OSZ(null, 0);
        }
        if (str == null) {
            return new OSZ(null, 0);
        }
        if (i < 0 || i >= str.length()) {
            return new OSZ(null, 0);
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) obj;
                if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InteractTextStructWrap interactTextStructWrap2 = (InteractTextStructWrap) obj;
        if (interactTextStructWrap2 != null && interactTextStructWrap2.getRange().isValid(str.length())) {
            if (interactTextStructWrap2.getRange().getStart() == 0 && interactTextStructWrap2.getRange().getEnd() == str.length()) {
                LIZIZ = "";
            } else if (interactTextStructWrap2.getRange().getStart() == 0) {
                LIZIZ = str.substring(interactTextStructWrap2.getRange().getEnd(), str.length());
                o.LJIIIIZZ(LIZIZ, "this as java.lang.String…ing(startIndex, endIndex)");
            } else if (interactTextStructWrap2.getRange().getEnd() == str.length()) {
                LIZIZ = str.substring(0, interactTextStructWrap2.getRange().getStart());
                o.LJIIIIZZ(LIZIZ, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                String substring = str.substring(0, interactTextStructWrap2.getRange().getStart());
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ2.append(substring);
                String substring2 = str.substring(interactTextStructWrap2.getRange().getEnd(), str.length());
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ2.append(substring2);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            if (list.remove(interactTextStructWrap2)) {
                int end = interactTextStructWrap2.getRange().getEnd() - interactTextStructWrap2.getRange().getStart();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InteractTextStructWrap interactTextStructWrap3 = (InteractTextStructWrap) it2.next();
                    if (interactTextStructWrap3.getRange().getStart() >= interactTextStructWrap2.getRange().getEnd()) {
                        TextStickerTextUnderlineIndexRange range = interactTextStructWrap3.getRange();
                        range.setStart(range.getStart() - end);
                        TextStickerTextUnderlineIndexRange range2 = interactTextStructWrap3.getRange();
                        range2.setEnd(range2.getEnd() - end);
                    }
                }
            }
            return new OSZ(LIZIZ, Integer.valueOf(interactTextStructWrap2.getRange().getStart()));
        }
        return new OSZ(null, 0);
    }

    public static final void LJIILLIIL(int i, int i2, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) it.next();
                if (interactTextStructWrap.getRange().getStart() >= i && i2 != 0) {
                    TextStickerTextUnderlineIndexRange range = interactTextStructWrap.getRange();
                    range.setStart(range.getStart() + i2);
                    TextStickerTextUnderlineIndexRange range2 = interactTextStructWrap.getRange();
                    range2.setEnd(range2.getEnd() + i2);
                }
            }
        }
    }

    public static final int LJIIIIZZ(Paint paint, String str, int i, int i2) {
        o.LJIIIZ(paint, "<this>");
        if (str == null || str.length() == 0 || i < 0 || i2 > str.length() || i >= i2) {
            return 0;
        }
        String substring = str.substring(i, i2);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        int length = substring.length();
        paint.getTextWidths(substring, new float[length]);
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i3 += (int) Math.ceil(r4[i4]);
        }
        return i3;
    }
}
