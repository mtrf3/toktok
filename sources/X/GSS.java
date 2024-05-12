package X;

import Y.ARunnableS10S0201000_7;
import Y.IDComparatorS35S0000000_7;
import Y.IDRunnableS6S0101000;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.Pair;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class GSS implements TextWatcher {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ GSR LJLJI;

    public GSS(GSR gsr) {
        this.LJLJI = gsr;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String substring;
        int i;
        Pair pair;
        GSR gsr = this.LJLJI;
        if (!gsr.LLJI) {
            int i2 = this.LJLIL + this.LJLILLLLZI;
            gsr.LJIILJJIL();
            C78934UyQ.LJLIL.LIZLLL().getClass();
            if (!AnonymousClass842.LIZ() && i2 > 0) {
                int i3 = i2 - 1;
                if (editable.charAt(i3) == '\n') {
                    i2 = i3;
                }
            }
            C41549GSj[] c41549GSjArr = (C41549GSj[]) editable.getSpans(0, editable.length(), C41549GSj.class);
            if (c41549GSjArr.length > 0) {
                int length = c41549GSjArr.length;
                int[] iArr = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = editable.getSpanStart(c41549GSjArr[i4]);
                }
                Arrays.sort(iArr);
                for (int i5 = length - 1; i5 >= 0; i5--) {
                    int i6 = iArr[i5];
                    editable.delete(i6, i6 + 1);
                    if (i2 >= iArr[i5]) {
                        i2--;
                    }
                }
                z = true;
            } else {
                z = false;
            }
            String obj = editable.toString();
            LinkedHashMap<String, Bitmap> LJFF = AVCommerceServiceImpl.LJIIJ().LJFF();
            for (int i7 = 1; obj.length() > i7; i7 = 1) {
                int length2 = obj.length();
                if (!TextUtils.isEmpty(obj)) {
                    for (int i8 = length2 - 1; i8 >= 0; i8--) {
                        char charAt = obj.charAt(i8);
                        if (charAt == ' ' || String.valueOf(charAt).equals(gsr.getContext().getString(R.string.rhe)) || charAt == '@' || charAt == '\n') {
                            pair = new Pair(Integer.valueOf(i8), -1);
                            break;
                        } else {
                            if (charAt == '#') {
                                pair = new Pair(Integer.valueOf(i8), Integer.valueOf(length2));
                                break;
                            }
                        }
                    }
                }
                pair = new Pair(-1, -1);
                if (((Integer) pair.second).intValue() == -1) {
                    if (((Integer) pair.first).intValue() > 0) {
                        obj = obj.substring(0, ((Integer) pair.first).intValue());
                    } else {
                        obj = "";
                    }
                } else {
                    String lowerCase = obj.substring(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue()).toLowerCase(Locale.getDefault());
                    if (LJFF != null && LJFF.containsKey(lowerCase.substring(1))) {
                        Bitmap bitmap = LJFF.get(lowerCase.substring(1));
                        if (bitmap != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                            bitmapDrawable.setBounds(0, 0, (int) gsr.getTextSize(), (int) gsr.getTextSize());
                            C41549GSj c41549GSj = new C41549GSj(bitmapDrawable);
                            editable.insert(obj.length(), gsr.getContext().getString(R.string.rhe));
                            if (editable.length() >= obj.length() + 1) {
                                editable.setSpan(c41549GSj, obj.length(), obj.length() + 1, 33);
                            }
                        }
                        if (i2 > obj.length()) {
                            i2++;
                        }
                        z = true;
                    }
                    obj = obj.substring(0, ((Integer) pair.first).intValue());
                }
            }
            if (z) {
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(gsr.LLILII)) {
                    substring = editable.toString();
                } else {
                    substring = editable.toString().substring(0, gsr.getCurAdTagStart());
                }
                Iterator it = ((ArrayList) gsr.LJIJ(substring)).iterator();
                while (it.hasNext()) {
                    C41529GRp c41529GRp = (C41529GRp) it.next();
                    arrayList.add(new C41545GSf(c41529GRp.LIZ, c41529GRp.LIZIZ));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                List<C41545GSf> list = gsr.LJLL;
                if (list != null && !((ArrayList) list).isEmpty()) {
                    arrayList2.addAll(gsr.LJLL);
                }
                Collections.sort(arrayList2, new IDComparatorS35S0000000_7(11));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C41545GSf c41545GSf = (C41545GSf) it2.next();
                    if (c41545GSf.LIZ(gsr.getSelectionStart() - 1, gsr.getSelectionEnd() - 1) || c41545GSf.LIZ(gsr.getSelectionStart() + 1, gsr.getSelectionEnd() + 1)) {
                        spannableStringBuilder.append((CharSequence) substring.substring(c41545GSf.LIZ, c41545GSf.LIZIZ));
                        MentionSpan mentionSpan = new MentionSpan(spannableStringBuilder.toString(), "", gsr.LJLJL, 1, "", "");
                        GSR.LJJIFFI(editable, c41545GSf.LIZ, c41545GSf.LIZIZ, false);
                        editable.setSpan(mentionSpan, c41545GSf.LIZ, c41545GSf.LIZIZ, 33);
                        editable.setSpan(new StyleSpan(1), c41545GSf.LIZ, c41545GSf.LIZIZ, 33);
                        spannableStringBuilder.clear();
                    }
                }
                int length3 = substring.length();
                Iterator it3 = arrayList2.iterator();
                int i9 = 0;
                while (it3.hasNext()) {
                    C41545GSf c41545GSf2 = (C41545GSf) it3.next();
                    if (i9 >= 0 && (i = c41545GSf2.LIZ) <= length3 && i9 <= i) {
                        GSR.LJJIFFI(editable, i9, i, false);
                        i9 = c41545GSf2.LIZIZ;
                    }
                }
                if (i9 <= length3) {
                    GSR.LJJIFFI(editable, i9, length3, false);
                }
                if (editable.length() != 0) {
                    gsr.LJIJJLI(editable);
                    gsr.LJIL(editable);
                }
                if (gsr.getText() != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("full: \n  text: ");
                    LIZ.append(gsr.getText().toString());
                    LIZ.append(" and se: ");
                    LIZ.append(gsr.getSelectionEnd());
                    C36922EeM.LIZLLL(2, "MentionEditText", X1D.LIZIZ(LIZ));
                }
            }
            gsr.LJII();
            if (z) {
                gsr.LLJI = true;
                gsr.LLJIJIL = i2;
                gsr.setCursorVisible(false);
                C41558GSs c41558GSs = gsr.LLILL;
                if (c41558GSs != null) {
                    gsr.LJJ(c41558GSs);
                }
                if (gsr.LLILIL.booleanValue()) {
                    gsr.LJJ(gsr.LLJ);
                }
                if (i2 >= editable.length()) {
                    i2 = editable.length();
                }
                int i10 = 5;
                if (gsr.LLILL != null) {
                    gsr.post(new HZD(i10, gsr));
                }
                if (gsr.LLILIL.booleanValue()) {
                    gsr.post(new IDRunnableS6S0101000(5, gsr, 30));
                }
                gsr.post(new ARunnableS10S0201000_7(i2, gsr, editable, 4));
                gsr.post(new Q8V(9, gsr));
            }
        }
        this.LJLJI.post(new IDRunnableS6S0101000(8, this, 9));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 == 0 && this.LJLJI.getText() != null && !TextUtils.isEmpty(this.LJLJI.getText().toString())) {
            GSR gsr = this.LJLJI;
            CommerceToolsMissionService.LJIIJ().LJFF(i, i + i2, gsr.LJZ, gsr.LLILII, gsr.getText().toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Editable text;
        Editable text2;
        int length;
        Editable text3 = this.LJLJI.getText();
        this.LJLILLLLZI = i3;
        this.LJLIL = i;
        if (text3 != null && !TextUtils.isEmpty(text3.toString())) {
            List<TextExtraStruct> compatTextExtraStructList = this.LJLJI.getCompatTextExtraStructList();
            int length2 = text3.length();
            for (TextExtraStruct textExtraStruct : compatTextExtraStructList) {
                if (textExtraStruct != null && textExtraStruct.getType() == 1 && textExtraStruct.getStart() <= length2 && textExtraStruct.getEnd() <= length2 && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                    this.LJLJI.LJJIII(textExtraStruct, text3);
                }
            }
        }
        GSR gsr = this.LJLJI;
        int i4 = 0;
        if (gsr.LLII != 0 && gsr.LLIIIILZ != null && (text2 = gsr.getText()) != null) {
            C8FD[] c8fdArr = (C8FD[]) text2.getSpans(0, text2.length(), C8FD.class);
            if (c8fdArr == null) {
                length = 0;
            } else {
                length = c8fdArr.length;
            }
            if (gsr.LLII == 1 && length == 0) {
                gsr.LJIIZILJ();
            }
            gsr.LLII = length;
        }
        GSR gsr2 = this.LJLJI;
        if (gsr2.LLIIIZ == 0 || gsr2.LLIIIL == null || (text = gsr2.getText()) == null) {
            return;
        }
        C208198Fb[] c208198FbArr = (C208198Fb[]) text.getSpans(0, text.length(), C208198Fb.class);
        if (c208198FbArr != null) {
            i4 = c208198FbArr.length;
        }
        if (gsr2.LLIIIZ == 1 && i4 == 0) {
            gsr2.LJIIZILJ();
        }
        gsr2.LLIIIZ = i4;
    }
}
