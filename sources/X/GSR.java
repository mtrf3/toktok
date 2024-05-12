package X;

import Y.IDCListenerS375S0100000_7;
import Y.IDComparatorS35S0000000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.lexical.platform.span.AdSpan;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes8.dex */
public class GSR extends GSU implements InterfaceC41097GAz<AVTextExtraStruct> {
    public static final String LLJILJIL = C16880lQ.LJLLJ(GSR.class);
    public int LLII;
    public String LLIIII;
    public C8FD LLIIIILZ;
    public boolean LLIIIJ;
    public C208198Fb LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public List<InputFilter> LLIIL;
    public C41542GSc LLIILII;
    public final HashSet<String> LLIILZL;
    public String LLIIZ;
    public String LLIL;
    public String LLILII;
    public Boolean LLILIL;
    public C41558GSs LLILL;
    public GST LLILLIZIL;
    public View LLILLJJLI;
    public View LLILLL;
    public ActivityC45651qj LLILZ;
    public C41005G7l LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public View.OnFocusChangeListener LLIZLLLIL;
    public final C41540GSa LLJ;
    public boolean LLJI;
    public int LLJIJIL;

    public void setChainString(String str) {
    }

    @Override // X.InterfaceC41097GAz
    public final C41486GPy LIZ() {
        return new C41486GPy(this);
    }

    @Override // X.InterfaceC41097GAz
    public final C40964G5w LJ() {
        return new C40964G5w(this);
    }

    public final void LJIIZILJ() {
        if (this.LLIIIJ) {
            return;
        }
        if (getVideoType() == 1) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", this.LLIIII);
            c145995oB.LJI("caption_type", "duet");
            FMX.LJIIL("caption_delete", c145995oB.LIZ);
        } else if (getVideoType() == 2) {
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LJI("creation_id", this.LLIIII);
            c145995oB2.LJI("caption_type", "react");
            FMX.LJIIL("caption_delete", c145995oB2.LIZ);
        } else if (getVideoType() == 3) {
            C145995oB c145995oB3 = new C145995oB();
            c145995oB3.LJI("creation_id", this.LLIIII);
            c145995oB3.LJI("caption_type", "comment_reply");
            FMX.LJIIL("caption_delete", c145995oB3.LIZ);
        }
        this.LLIIIJ = true;
    }

    public int getCurAdTagStart() {
        int length = this.LLILII.length();
        if (getText() != null) {
            return Math.max(getText().length() - length, 0);
        }
        return -1;
    }

    public String getNoAdTagTextForTitleModule() {
        if (!TextUtils.isEmpty(this.LLILII)) {
            removeHashTag();
        }
        Editable text = getText();
        StringBuilder sb = new StringBuilder(text.toString());
        C41549GSj[] c41549GSjArr = (C41549GSj[]) text.getSpans(0, text.length(), C41549GSj.class);
        if (c41549GSjArr.length > 0) {
            int length = c41549GSjArr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = text.getSpanStart(c41549GSjArr[i]);
            }
            Arrays.sort(iArr);
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                int i2 = iArr[length];
                sb.delete(i2, i2 + 1);
            }
        }
        return sb.toString();
    }

    @Override // X.GSU, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void removeHashTag() {
        if (!TextUtils.isEmpty(this.LLILII)) {
            LJJ(this.LLJ);
            this.LLILIL = Boolean.FALSE;
            int curAdTagStart = getCurAdTagStart();
            this.LLILII = "";
            if (getText() != null) {
                getText().replace(curAdTagStart, getText().length(), "");
            }
        }
    }

    @Override // X.InterfaceC41097GAz
    public Activity getAndroidContext() {
        Activity LIZ = C105574Cj.LIZ(getContext());
        Objects.requireNonNull(LIZ);
        return LIZ;
    }

    @Override // X.GSU
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MentionSpan mentionSpan : getMentionText()) {
            int i = mentionSpan.mType;
            if (i == 0 || i == 5) {
                mentionSpan.mStruct.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.mStruct.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.mStruct);
            }
        }
        Iterator it = ((ArrayList) LJIJI(getNoAdTagText())).iterator();
        while (it.hasNext()) {
            C41529GRp c41529GRp = (C41529GRp) it.next();
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setHashTagName(c41529GRp.LIZJ.replaceAll("#", ""));
            textExtraStruct.setStart(c41529GRp.LIZ);
            textExtraStruct.setEnd(c41529GRp.LIZIZ);
            arrayList.add(textExtraStruct);
            LJJII(null, textExtraStruct.getHashTagName());
        }
        return arrayList;
    }

    @Override // android.widget.TextView
    public int getMaxWidth() {
        return super.getMaxWidth();
    }

    @Override // X.GSU
    public String getNoAdTagText() {
        if (getText() == null) {
            return "";
        }
        if (TextUtils.isEmpty(this.LLILII)) {
            return getText().toString();
        }
        return getText().toString().substring(0, getCurAdTagStart());
    }

    @Override // X.GSU
    public String getAdTag() {
        return this.LLILII;
    }

    public int getHookAtMaxWidth() {
        return this.LLIIJI;
    }

    public int getVideoType() {
        return this.LLIIJLIL;
    }

    @Override // X.InterfaceC41097GAz
    public int getWidthLimit() {
        return this.LLIIJI;
    }

    public final void LJIILLIIL(InputFilter inputFilter) {
        if (this.LLIIL == null) {
            this.LLIIL = new ArrayList();
        }
        this.LLIIL.add(inputFilter);
        setFilters((InputFilter[]) this.LLIIL.toArray(new InputFilter[0]));
    }

    public final List<C41529GRp> LJIJ(String str) {
        int indexOf;
        String str2;
        boolean z;
        if (SearchServiceImpl.LLLZI().LJLIL().disableHashtagSearch) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet();
        Iterator it = C73030SlO.LJII(str).iterator();
        int i = 0;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            int indexOf2 = str.indexOf(str3, i);
            if (indexOf2 >= 0) {
                Iterator it2 = ((HashSet) this.LLFZ).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str4 = (String) it2.next();
                        if (indexOf2 == str.indexOf(str4, i) && str4.length() >= str3.length()) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                i = str3.length() + indexOf2;
                if (!z) {
                    hashSet.add(new C41529GRp(str3, indexOf2, i));
                }
            }
        }
        Iterator it3 = ((HashSet) this.LLFZ).iterator();
        while (it3.hasNext()) {
            String str5 = (String) it3.next();
            int i2 = 0;
            while (i2 < str.length() && (indexOf = str.indexOf(str5, i2)) >= 0) {
                Matcher matcher = PatternProtector.compile(C73030SlO.LJIIIZ()).matcher(str.substring(indexOf));
                if (matcher.find()) {
                    str2 = matcher.group();
                } else {
                    str2 = "";
                }
                if (str2.length() > str5.length()) {
                    i2 = indexOf + str2.length();
                } else {
                    int length = str5.length() + indexOf;
                    hashSet.add(new C41529GRp(str5, indexOf, length));
                    i2 = length;
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new C41530GRq());
        return arrayList;
    }

    public final List<C41529GRp> LJIJI(String str) {
        List<C41529GRp> LJIJ = LJIJ(str);
        Iterator it = ((ArrayList) LJIJ).iterator();
        while (it.hasNext()) {
            C41529GRp c41529GRp = (C41529GRp) it.next();
            MentionSpan[] mentionSpanArr = (MentionSpan[]) getText().getSpans(c41529GRp.LIZ, c41529GRp.LIZIZ, MentionSpan.class);
            if (mentionSpanArr != null) {
                int length = mentionSpanArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        TextExtraStruct textExtraStruct = mentionSpanArr[i].mStruct;
                        if (textExtraStruct != null && textExtraStruct.getType() != 1) {
                            it.remove();
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }
        return LJIJ;
    }

    public final void LJIJJ(boolean z) {
        int i;
        if (getText() == null) {
            return;
        }
        System.currentTimeMillis();
        LJIILJJIL();
        ArrayList arrayList = new ArrayList();
        String noAdTagText = getNoAdTagText();
        Iterator it = ((ArrayList) LJIJI(noAdTagText)).iterator();
        while (it.hasNext()) {
            C41529GRp c41529GRp = (C41529GRp) it.next();
            arrayList.add(new C41545GSf(c41529GRp.LIZ, c41529GRp.LIZIZ));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        List<C41545GSf> list = this.LJLL;
        if (list != null && !((ArrayList) list).isEmpty()) {
            arrayList2.addAll(this.LJLL);
        }
        Collections.sort(arrayList2, new IDComparatorS35S0000000_7(11));
        int i2 = 0;
        if (getText() != null) {
            for (StyleSpan styleSpan : (StyleSpan[]) getText().getSpans(0, getText().length(), StyleSpan.class)) {
                if (styleSpan.getStyle() == 1) {
                    getText().removeSpan(styleSpan);
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C41545GSf c41545GSf = (C41545GSf) it2.next();
            if (z || c41545GSf.LIZ(getSelectionStart() - 1, getSelectionEnd() - 1) || c41545GSf.LIZ(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                spannableStringBuilder.append((CharSequence) noAdTagText.substring(c41545GSf.LIZ, c41545GSf.LIZIZ));
                MentionSpan mentionSpan = new MentionSpan(spannableStringBuilder.toString(), "", this.LJLJL, 1, "", "");
                LJJI(c41545GSf.LIZ, c41545GSf.LIZIZ);
                getText().setSpan(mentionSpan, c41545GSf.LIZ, c41545GSf.LIZIZ, 33);
                getText().setSpan(new StyleSpan(1), c41545GSf.LIZ, c41545GSf.LIZIZ, 33);
                spannableStringBuilder.clear();
            }
        }
        int length = noAdTagText.length();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C41545GSf c41545GSf2 = (C41545GSf) it3.next();
            if (i2 >= 0 && (i = c41545GSf2.LIZ) <= length && i2 <= i) {
                LJJI(i2, i);
                getText().setSpan(new StyleSpan(1), c41545GSf2.LIZ, c41545GSf2.LIZIZ, 33);
                i2 = c41545GSf2.LIZIZ;
            }
        }
        if (i2 <= length) {
            LJJI(i2, length);
        }
        Editable text = getText();
        if (text == null || text.length() != 0) {
            LJIJJLI(text);
            LJIL(text);
        }
        LJII();
        if (getText() == null) {
            return;
        }
        StringBuilder LJI = JBR.LJI("full: ", z, "\n  text: ");
        LJI.append(getText().toString());
        LJI.append(" and se: ");
        LJI.append(getSelectionEnd());
        C36922EeM.LIZLLL(2, "MentionEditText", X1D.LIZIZ(LJI));
        LJIIJJI();
    }

    public final void LJIJJLI(Editable editable) {
        if (this.LLIIIILZ != null) {
            for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class)) {
                if (!TextUtils.isEmpty(mentionSpan.awemeId)) {
                    return;
                }
            }
        }
        editable.removeSpan(this.LLIIIILZ);
        this.LLIIIILZ = null;
        LJIIZILJ();
    }

    public final void LJIL(Editable editable) {
        if (this.LLIIIL != null) {
            for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class)) {
                if (mentionSpan.subType == 2) {
                    return;
                }
            }
        }
        editable.removeSpan(this.LLIIIL);
        this.LLIIIL = null;
        LJIIZILJ();
    }

    public final void LJJ(InputFilter inputFilter) {
        List<InputFilter> list = this.LLIIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(inputFilter);
        setFilters((InputFilter[]) ((ArrayList) this.LLIIL).toArray(new InputFilter[0]));
    }

    @Override // X.GSU, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void addHashTag(String str) {
        if (!TextUtils.isEmpty(this.LLILII)) {
            return;
        }
        this.LLILII = i0.LJFF(" ", str);
        if (getText() == null) {
            return;
        }
        getText().insert(Math.max(getSelectionEnd(), getText().length()), this.LLILII);
        getText().setSpan(new AdSpan(AnonymousClass636.LJIIIIZZ(R.attr.gv, getContext())), getCurAdTagStart(), getText().length(), 33);
        LJIILLIIL(this.LLJ);
        this.LLILIL = Boolean.TRUE;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.LLIZ) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.LLIZ) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return onTouchEvent;
    }

    public void setAccountTagView(View view) {
        this.LLILLL = view;
    }

    public void setConfig(C41005G7l c41005G7l) {
        this.LLILZIL = c41005G7l;
    }

    public void setCreationId(String str) {
        this.LLIIII = str;
    }

    public void setEmoticonFilter(int i) {
        InputFilter inputFilter = this.LLILLIZIL;
        if (inputFilter != null) {
            LJJ(inputFilter);
        }
        C40949G5h.LIZ = i;
        GST gst = new GST(this.LLILZIL.LIZIZ() + C40949G5h.LIZ, this, this.LLILZIL.LIZ());
        this.LLILLIZIL = gst;
        gst.LJLJJLL = new G7C(this);
        LJIILLIIL(gst);
    }

    public void setFixLengthInFront(String str) {
        int length;
        InputFilter inputFilter = this.LLILL;
        if (inputFilter != null) {
            LJJ(inputFilter);
        }
        if (TextUtils.isEmpty(str) || length() < (length = str.length())) {
            return;
        }
        C41558GSs c41558GSs = new C41558GSs(new C65769PrZ(this), length, this);
        this.LLILL = c41558GSs;
        LJIILLIIL(c41558GSs);
        this.LLIILII = new C41542GSc(this, length);
    }

    public void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LLIZLLLIL = onFocusChangeListener;
    }

    public void setFragmentActivity(ActivityC45651qj activityC45651qj) {
        this.LLILZ = activityC45651qj;
    }

    public void setHashTagView(View view) {
        this.LLILLJJLI = view;
    }

    @Override // X.GSU
    public void setTextExtraList(List<TextExtraStruct> list) {
        super.setTextExtraList(list);
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(getNoAdTagText())) {
            return;
        }
        int length = getNoAdTagText().length();
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct != null) {
                if (textExtraStruct.getType() == 1) {
                    if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        LJJIII(textExtraStruct, text);
                    }
                }
                if ((textExtraStruct.getType() == 0 && !TextUtils.isEmpty(textExtraStruct.getAwemeId())) || (textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                    if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        if (textExtraStruct.getEnd() < length && text.charAt(textExtraStruct.getEnd()) == 160) {
                            text.replace(textExtraStruct.getEnd(), textExtraStruct.getEnd() + 1, " ");
                        }
                        if (textExtraStruct.getSubtype() == 1 || C42053Gev.LIZIZ.LIZ(textExtraStruct.getSubtype())) {
                            C8FD c8fd = new C8FD(getContext(), new C41543GSd(this));
                            this.LLIIIILZ = c8fd;
                            text.setSpan(c8fd, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                            this.LLII++;
                        }
                    }
                }
                if (textExtraStruct.getType() == 0 && textExtraStruct.getSubtype() == 2 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() >= 0) {
                    C208198Fb c208198Fb = new C208198Fb(getContext(), new C41544GSe(this));
                    this.LLIIIL = c208198Fb;
                    c208198Fb.LJLLILLLL = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.c7s);
                    text.setSpan(this.LLIIIL, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                    this.LLIIIZ = 1;
                }
            }
        }
    }

    public void setVideoType(int i) {
        this.LLIIJLIL = i;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.GSa] */
    public GSR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIIII = "";
        this.LLIILZL = new HashSet<>();
        this.LLIIZ = "";
        this.LLIL = getHint().toString();
        this.LLILII = "";
        this.LLILIL = Boolean.FALSE;
        this.LLILL = null;
        this.LLILLIZIL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLIZ = true;
        IDCListenerS375S0100000_7 iDCListenerS375S0100000_7 = new IDCListenerS375S0100000_7(this, 0);
        this.LLJ = new InputFilter() { // from class: X.GSa
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                int length = spanned.length() - GSR.this.LLILII.length();
                if (length < 0) {
                    length = 0;
                }
                if (TextUtils.isEmpty(charSequence) && i4 > length) {
                    return spanned.subSequence(i3, i4);
                }
                if (i4 > length) {
                    return "";
                }
                return null;
            }
        };
        this.LLJI = false;
        this.LLJIJIL = 0;
        addTextChangedListener(new GSS(this));
        setOnFocusChangeListener(iDCListenerS375S0100000_7);
    }

    public static void LJJII(String str, String str2) {
        if (TextUtils.equals(C44172HVg.LJIJ.getCurrentUserID(), str)) {
            C44172HVg.LJIIIIZZ.saveLocalHashTag(true, str2);
        }
    }

    @Override // X.GSU
    public final void LJIILIIL(MentionSpan mentionSpan, C41545GSf c41545GSf) {
        List<C41545GSf> list;
        if (AVCommerceServiceImpl.LJIIJ().LJIIIIZZ(mentionSpan.mText) != null && getNoAdTagText().length() > c41545GSf.LIZIZ && String.valueOf(getNoAdTagText().charAt(c41545GSf.LIZIZ)).equals(getContext().getString(R.string.rhe))) {
            ((ArrayList) this.LJLL).add(new C41545GSf(c41545GSf.LIZ, c41545GSf.LIZIZ + 1));
        }
        if (TextUtils.isEmpty(mentionSpan.mText) || this.LLIILZL.contains(mentionSpan.mText)) {
            return;
        }
        if (!((HashSet) this.LLFZ).contains(mentionSpan.mText) || (list = this.LJLL) == null) {
            return;
        }
        ((ArrayList) list).add(c41545GSf);
    }

    public final void LJJI(int i, int i2) {
        if (i >= i2 || getText() == null) {
            return;
        }
        Editable text = getText();
        Objects.requireNonNull(text);
        for (MentionSpan mentionSpan : (MentionSpan[]) text.getSpans(i, i2, MentionSpan.class)) {
            getText().removeSpan(mentionSpan);
        }
    }

    public final void LJJIII(TextExtraStruct textExtraStruct, Editable editable) {
        int end;
        MentionSpan mentionSpan;
        int i;
        if (textExtraStruct.getEnd() - textExtraStruct.getStart() > 71) {
            String string = getContext().getString(R.string.h0g, 70);
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZLLL(string);
            c5s1.LJ();
            editable.replace(textExtraStruct.getStart() + 70 + 1, textExtraStruct.getEnd(), "");
            end = editable.length();
        } else {
            end = textExtraStruct.getEnd();
        }
        try {
            mentionSpan = new MentionSpan(editable.subSequence(textExtraStruct.getStart(), end).toString(), textExtraStruct.getUserId(), this.LJLJL, textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
        } catch (Exception e) {
            H78.LIZLLL(LLJILJIL, e);
            if (!C19N.LJ("tool_enable_publish_input_exception_rethrow", false)) {
                mentionSpan = null;
            } else {
                throw e;
            }
        }
        if (end >= editable.length()) {
            i = editable.length() - 1;
        } else {
            i = end;
        }
        try {
            LJJIFFI(editable, textExtraStruct.getStart(), i, true);
        } catch (Exception unused) {
        }
        try {
            editable.setSpan(mentionSpan, textExtraStruct.getStart(), end, 33);
        } catch (Exception unused2) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLIIJI = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
        int height = getLayout().getHeight();
        int totalPaddingTop = getTotalPaddingTop();
        this.LLILZLL = ((height + totalPaddingTop) + getTotalPaddingBottom()) - getHeight();
    }

    @Override // X.GSU, X.GSZ, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.LJLLI) {
            return;
        }
        C41542GSc c41542GSc = this.LLIILII;
        if (c41542GSc != null && (i != 0 || i2 != c41542GSc.LIZJ.length())) {
            if (i < c41542GSc.LIZIZ) {
                c41542GSc.LIZJ.setSelection(c41542GSc.LIZ);
            } else {
                c41542GSc.LIZ = i;
            }
        }
        if (getText() != null && i >= 0 && i2 >= 0 && i < i2 && getText() != null) {
            String charSequence = getText().subSequence(i, i2).toString();
            if (!TextUtils.isEmpty(getText().toString())) {
                CommerceToolsMissionService.LJIIJ().LJIIIIZZ(charSequence, i2, this.LJZ, this.LLILII, getText().toString(), this.LLILZ);
            }
        }
    }

    public static void LJJIFFI(Editable editable, int i, int i2, boolean z) {
        if (i >= i2 || editable == null) {
            return;
        }
        for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(i, i2, MentionSpan.class)) {
            if (editable.getSpanEnd(mentionSpan) < editable.length() && editable.getSpanStart(mentionSpan) > -1) {
                if (z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("oldSpan: ");
                    LIZ.append(mentionSpan.mText);
                    LIZ.append(" oldSpan.start:");
                    LIZ.append(editable.getSpanStart(mentionSpan));
                    LIZ.append(" oldSpan.end:");
                    LIZ.append(editable.getSpanEnd(mentionSpan));
                    LIZ.append("\n editable: ");
                    LIZ.append((Object) editable);
                    LIZ.append(" editable.length: ");
                    LIZ.append(editable.length());
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("MentionEditText", X1D.LIZIZ(LIZ));
                }
                editable.removeSpan(mentionSpan);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.LLIZ) {
            return;
        }
        if (i2 == this.LLILZLL || i2 == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // X.GSU, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2;
        LJIIJJI();
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        Iterator it = ((HashSet) this.LLFZ).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!charSequence2.contains(str)) {
                this.LLIILZL.add(str);
            }
        }
    }
}
