package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.LineHeightSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C201577vd extends C2065088o {
    public InterfaceC203977zV LJLJLJ;
    public View.OnClickListener LJLJLLL;
    public float LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public SpannableString LJLZ;
    public int LJZ;
    public float LJZI;
    public float LJZL;
    public int LL;
    public boolean LLD;

    public int getDesiredHeight() {
        Layout layout = getLayout();
        if (layout == null) {
            return getHeight();
        }
        return getCompoundPaddingTop() + getCompoundPaddingBottom() + layout.getLineTop(getLineCount());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        return super.getText();
    }

    public int getSpanColor() {
        return this.LJLLI;
    }

    public float getSpanSize() {
        return this.LJLL;
    }

    public int getSpanTuxFont() {
        return this.LJLLLL;
    }

    public C201577vd(Context context) {
        super(context);
        this.LJLLL = 12;
        this.LJLLLLLL = 12;
        this.LLD = true;
        this.LJLL = getTextSize();
        this.LJLLI = getCurrentTextColor();
        this.LJLLILLLL = -1;
        this.LJLLJ = 0.75f;
        setHighlightColor(0);
    }

    public final boolean LJJIJL(float f) {
        boolean z = false;
        if (getDesiredHeight() <= getHeight()) {
            return false;
        }
        if (f > 0.0f) {
            if ((getDesiredHeight() - getHeight()) - getScrollY() <= 8) {
                z = true;
            }
            getParent().requestDisallowInterceptTouchEvent(!z);
            getScrollY();
            return true;
        }
        ViewParent parent = getParent();
        if (getScrollY() != 0) {
            z = true;
        }
        parent.requestDisallowInterceptTouchEvent(z);
        getScrollY();
        return true;
    }

    @Override // X.C2065088o, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = this.LJZI - motionEvent.getY();
                    float x = this.LJZL - motionEvent.getX();
                    if (Math.abs(y) > 5.0f || Math.abs(x) > 5.0f) {
                        this.LLD = false;
                        int i = this.LL;
                        if (i == 0) {
                            if (Math.abs(y) > Math.abs(x)) {
                                boolean LJJIJL = LJJIJL(y);
                                this.LL = 2;
                                if (LJJIJL) {
                                    return true;
                                }
                            } else {
                                if (!C90193gN.LIZIZ(getContext()) ? x <= 0.0f : x >= 0.0f) {
                                    getParent().requestDisallowInterceptTouchEvent(false);
                                } else {
                                    getParent().requestDisallowInterceptTouchEvent(false);
                                }
                                this.LL = 1;
                                return true;
                            }
                        } else if (i == 2) {
                            LJJIJL(y);
                        }
                    }
                }
            } else {
                View.OnClickListener onClickListener = this.LJLJLLL;
                if (onClickListener != null && this.LLD) {
                    onClickListener.onClick(this);
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        } else {
            this.LL = 0;
            this.LLD = true;
        }
        this.LJZI = motionEvent.getY();
        this.LJZL = motionEvent.getX();
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAdHashTag(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            r10 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = r11.getAnchorsExtras()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r5 = 0
            r4 = 1
            r3 = 0
            if (r0 == 0) goto La6
            java.lang.String r5 = ""
        L14:
            android.text.SpannableString r0 = r10.LJLZ
            if (r0 == 0) goto L1e
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L1f
        L1e:
            return
        L1f:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            android.text.SpannableString r0 = r10.LJLZ
            r6.<init>(r0)
            java.lang.String r0 = r11.getAnchorsExtras()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L89
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L34:
            if (r0 != 0) goto L80
        L36:
            r0 = 1
        L37:
            r8 = -1
            r7 = 33
            r9 = 12
            if (r0 == 0) goto L68
            r6.append(r5)
            android.text.SpannableString r0 = r10.LJLZ
            int r0 = r0.length()
            int r2 = r0 + 1
            android.text.SpannableString r0 = r10.LJLZ
            int r0 = r0.length()
            int r1 = r5.length()
            int r1 = r1 + r0
            X.T5U r0 = new X.T5U
            r0.<init>(r9, r4)
            r6.setSpan(r0, r2, r1, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r8)
            r6.setSpan(r0, r2, r1, r7)
        L64:
            r10.setText(r6)
            goto L1e
        L68:
            r6.insert(r3, r5)
            int r1 = r5.length()
            X.T5U r0 = new X.T5U
            r0.<init>(r9, r4)
            r6.setSpan(r0, r3, r1, r7)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r8)
            r6.setSpan(r0, r3, r1, r7)
            goto L64
        L80:
            int r0 = r0.intValue()
            if (r0 == r4) goto L87
            goto L36
        L87:
            r0 = 0
            goto L37
        L89:
            com.google.gson.Gson r2 = X.C75792yF.LIZIZ()
            java.lang.String r1 = r11.getAnchorsExtras()
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r0 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r0
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.AdLabel r0 = r0.getAdLabel()
            if (r0 == 0) goto L36
            java.lang.Integer r0 = r0.getAdLabelPosition()
            goto L34
        La6:
            com.google.gson.Gson r2 = X.C75792yF.LIZIZ()
            java.lang.String r1 = r11.getAnchorsExtras()
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1
            if (r1 == 0) goto Lc4
            com.ss.android.ugc.aweme.feed.model.AdLabel r0 = r1.getAdLabel()
            if (r0 == 0) goto Lc4
            java.lang.Integer r0 = r0.getAdLabelPosition()
            if (r0 != 0) goto Ld9
        Lc4:
            r2 = 0
            if (r1 == 0) goto Ld1
        Lc7:
            com.ss.android.ugc.aweme.feed.model.AdLabel r0 = r1.getAdLabel()
            if (r0 == 0) goto Ld1
            java.lang.String r5 = r0.getAdLabelName()
        Ld1:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Le1
            goto L14
        Ld9:
            int r0 = r0.intValue()
            if (r0 != r4) goto Lc4
            r2 = 1
            goto Lc7
        Le1:
            r1 = 32
            java.lang.String r0 = X.C42398GkU.LIZIZ(r5, r1)
            if (r2 == 0) goto Leb
            if (r0 != 0) goto Lf1
        Leb:
            java.lang.String r5 = X.QZZ.LIZIZ(r1, r5)
            goto L14
        Lf1:
            r5 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201577vd.setAdHashTag(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.LJLJLLL = onClickListener;
    }

    public void setMaxSize(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setMentionSpanColor(int i) {
        this.LJLLILLLL = i;
    }

    public void setOnSpanClickListener(InterfaceC203977zV interfaceC203977zV) {
        this.LJLJLJ = interfaceC203977zV;
    }

    public void setPressAlpha(float f) {
        this.LJLLJ = f;
    }

    public void setSpanColor(int i) {
        this.LJZ = i;
    }

    public void setSpanSize(float f) {
        this.LJLL = f;
    }

    public void setSpanStyle(int i) {
        if (i == 0) {
            this.LJLLL = 11;
        } else {
            if (i != 1) {
                return;
            }
            this.LJLLL = 12;
        }
    }

    public void setSpanTuxFont(int i) {
        this.LJLLLL = i;
    }

    public void setTuxFont(int i) {
        this.LJLLLLLL = i;
    }

    public C201577vd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLL = 12;
        this.LJLLLLLL = 12;
        this.LLD = true;
        this.LJLL = getTextSize();
        this.LJLLI = getCurrentTextColor();
        this.LJLLILLLL = -1;
        this.LJLLJ = 0.75f;
        setHighlightColor(0);
    }

    public final void LJJIJLIJ(CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilder;
        if (TextUtils.equals("ko", str) || TextUtils.equals("ja", str) || TextUtils.equals("zh-Hant", str)) {
            final int LJIILL = C17N.LJIILL(20.0d);
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            spannableStringBuilder.setSpan(new LineHeightSpan(LJIILL) { // from class: X.8FS
                public final int LJLIL;

                {
                    this.LJLIL = LJIILL;
                }

                @Override // android.text.style.LineHeightSpan
                public final void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fm) {
                    o.LJIIIZ(text, "text");
                    o.LJIIIZ(fm, "fm");
                    int i5 = fm.descent;
                    int i6 = this.LJLIL;
                    if (i5 > i6) {
                        int min = Math.min(i6, i5);
                        fm.descent = min;
                        fm.bottom = min;
                        fm.ascent = 0;
                        fm.top = 0;
                        return;
                    }
                    int i7 = fm.ascent;
                    if ((-i7) + i5 > i6) {
                        fm.bottom = i5;
                        int i8 = (-i6) + i5;
                        fm.ascent = i8;
                        fm.top = i8;
                        return;
                    }
                    int i9 = fm.bottom;
                    if ((-i7) + i9 > i6) {
                        fm.top = i7;
                        fm.bottom = i7 + i6;
                        return;
                    }
                    int i10 = fm.top;
                    if ((-i10) + i9 > i6) {
                        fm.top = i9 - i6;
                        return;
                    }
                    double d = (i6 - ((-i10) + i9)) / 2.0f;
                    fm.top = i10 - ((int) Math.ceil(d));
                    int floor = fm.bottom + ((int) Math.floor(d));
                    fm.bottom = floor;
                    fm.ascent = fm.top;
                    fm.descent = floor;
                }
            }, 0, charSequence.length(), 33);
            setLineSpacing(0.0f, 1.0f);
            charSequence = spannableStringBuilder;
        }
        setText(charSequence);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    public final void LJJIL(int i, int i2, Object obj) {
        int length;
        SpannableString spannableString = this.LJLZ;
        if (spannableString == null || i > (length = spannableString.length()) || i2 > length || i > i2) {
            return;
        }
        this.LJLZ.setSpan(obj, i, i2, 33);
        setText(this.LJLZ);
    }

    public final void LJJIZ(List list, InterfaceC201227v4 interfaceC201227v4, InterfaceC201227v4 interfaceC201227v42) {
        int start;
        int end;
        SpannableString spannableString = new SpannableString(getText());
        if (list == null || list.isEmpty() || TextUtils.isEmpty(spannableString.toString())) {
            this.LJLZ = spannableString;
            return;
        }
        int length = spannableString.length();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
            if (interfaceC201227v4 == null || !interfaceC201227v4.LIZ(textExtraStruct)) {
                if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                    final int i = 0;
                    if (textExtraStruct.getStart() < 0) {
                        start = 0;
                    } else {
                        start = textExtraStruct.getStart();
                    }
                    if (textExtraStruct.getEnd() > length) {
                        end = length;
                    } else {
                        end = textExtraStruct.getEnd();
                    }
                    if (end > start) {
                        if (textExtraStruct.getType() == 65281) {
                            spannableString.setSpan(textExtraStruct.getCustomSpan(), start, end, 33);
                        } else if (textExtraStruct.getType() != 4 && (interfaceC201227v42 == null || !interfaceC201227v42.LIZ(textExtraStruct))) {
                            if (textExtraStruct.getType() == 65282) {
                                final InterfaceC203977zV interfaceC203977zV = this.LJLJLJ;
                                final int color = textExtraStruct.getColor();
                                spannableString.setSpan(new AbstractC204007zY(interfaceC203977zV, textExtraStruct, color) { // from class: X.7zX
                                    public final InterfaceC203977zV LJLJI;
                                    public final TextExtraStruct LJLJJI;
                                    public final int LJLJJL;
                                    public final boolean LJLJJLL;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View view) {
                                        InterfaceC203977zV interfaceC203977zV2;
                                        if (!C6ZT.LIZ(view) && (interfaceC203977zV2 = this.LJLJI) != null) {
                                            interfaceC203977zV2.LIZ(this.LJLJJI);
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        int i2 = this.LJLJJL;
                                        if (i2 == 0) {
                                            i2 = textPaint.linkColor;
                                        }
                                        if (this.LJLIL) {
                                            i2 = Color.argb(Math.round(Color.alpha(i2) * C201577vd.this.LJLLJ), Color.red(i2), Color.green(i2), Color.blue(i2));
                                        }
                                        textPaint.setColor(i2);
                                        C201577vd.this.getClass();
                                        textPaint.setUnderlineText(false);
                                        T5S t5s = new T5S();
                                        if (this.LJLJJLL) {
                                            t5s.LIZ(82);
                                        } else {
                                            t5s.LIZ(81);
                                        }
                                        textPaint.setTypeface(t5s.getTypeface());
                                    }

                                    {
                                        super(C201577vd.this);
                                        this.LJLJI = interfaceC203977zV;
                                        this.LJLJJI = textExtraStruct;
                                        this.LJLJJL = color;
                                        this.LJLJJLL = textExtraStruct.isBoldText();
                                    }
                                }, start, end, 33);
                            } else if (textExtraStruct.getType() == 5) {
                                final InterfaceC203977zV interfaceC203977zV2 = this.LJLJLJ;
                                final int color2 = textExtraStruct.getColor();
                                spannableString.setSpan(new AbstractC204007zY(interfaceC203977zV2, textExtraStruct, color2) { // from class: X.7zX
                                    public final InterfaceC203977zV LJLJI;
                                    public final TextExtraStruct LJLJJI;
                                    public final int LJLJJL;
                                    public final boolean LJLJJLL;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View view) {
                                        InterfaceC203977zV interfaceC203977zV22;
                                        if (!C6ZT.LIZ(view) && (interfaceC203977zV22 = this.LJLJI) != null) {
                                            interfaceC203977zV22.LIZ(this.LJLJJI);
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        int i2 = this.LJLJJL;
                                        if (i2 == 0) {
                                            i2 = textPaint.linkColor;
                                        }
                                        if (this.LJLIL) {
                                            i2 = Color.argb(Math.round(Color.alpha(i2) * C201577vd.this.LJLLJ), Color.red(i2), Color.green(i2), Color.blue(i2));
                                        }
                                        textPaint.setColor(i2);
                                        C201577vd.this.getClass();
                                        textPaint.setUnderlineText(false);
                                        T5S t5s = new T5S();
                                        if (this.LJLJJLL) {
                                            t5s.LIZ(82);
                                        } else {
                                            t5s.LIZ(81);
                                        }
                                        textPaint.setTypeface(t5s.getTypeface());
                                    }

                                    {
                                        super(C201577vd.this);
                                        this.LJLJI = interfaceC203977zV2;
                                        this.LJLJJI = textExtraStruct;
                                        this.LJLJJL = color2;
                                        this.LJLJJLL = textExtraStruct.isBoldText();
                                    }
                                }, start, end, 33);
                            } else if (textExtraStruct.getType() == 6) {
                                spannableString.setSpan(new T5U(this.LJLLLLLL, true), start, end, 33);
                                int i2 = end + 1;
                                if (i2 <= spannableString.length()) {
                                    end = i2;
                                }
                                final InterfaceC203977zV interfaceC203977zV3 = null;
                                spannableString.setSpan(new AbstractC204007zY(interfaceC203977zV3, textExtraStruct, i) { // from class: X.7zX
                                    public final InterfaceC203977zV LJLJI;
                                    public final TextExtraStruct LJLJJI;
                                    public final int LJLJJL;
                                    public final boolean LJLJJLL;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View view) {
                                        InterfaceC203977zV interfaceC203977zV22;
                                        if (!C6ZT.LIZ(view) && (interfaceC203977zV22 = this.LJLJI) != null) {
                                            interfaceC203977zV22.LIZ(this.LJLJJI);
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        int i22 = this.LJLJJL;
                                        if (i22 == 0) {
                                            i22 = textPaint.linkColor;
                                        }
                                        if (this.LJLIL) {
                                            i22 = Color.argb(Math.round(Color.alpha(i22) * C201577vd.this.LJLLJ), Color.red(i22), Color.green(i22), Color.blue(i22));
                                        }
                                        textPaint.setColor(i22);
                                        C201577vd.this.getClass();
                                        textPaint.setUnderlineText(false);
                                        T5S t5s = new T5S();
                                        if (this.LJLJJLL) {
                                            t5s.LIZ(82);
                                        } else {
                                            t5s.LIZ(81);
                                        }
                                        textPaint.setTypeface(t5s.getTypeface());
                                    }

                                    {
                                        super(C201577vd.this);
                                        this.LJLJI = interfaceC203977zV3;
                                        this.LJLJJI = textExtraStruct;
                                        this.LJLJJL = i;
                                        this.LJLJJLL = textExtraStruct.isBoldText();
                                    }
                                }, start, end, 33);
                            } else {
                                if (textExtraStruct.getType() == 2) {
                                    this.LJLLI = AnonymousClass636.LJIIIIZZ(R.attr.go, getContext());
                                } else if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1 || textExtraStruct.getType() == 5) {
                                    this.LJLLI = AnonymousClass636.LJIIIIZZ(R.attr.e4, getContext());
                                } else if (textExtraStruct.getType() == 3) {
                                    this.LJLLI = AnonymousClass636.LJIIIIZZ(R.attr.go, getContext());
                                }
                                final InterfaceC203977zV interfaceC203977zV4 = this.LJLJLJ;
                                final int i3 = this.LJLLI;
                                spannableString.setSpan(new AbstractC204007zY(interfaceC203977zV4, textExtraStruct, i3) { // from class: X.7zW
                                    public final InterfaceC203977zV LJLJI;
                                    public final TextExtraStruct LJLJJI;
                                    public final int LJLJJL;

                                    @Override // X.AbstractC204007zY
                                    public final void LIZ(boolean z) {
                                        super.LIZ(z);
                                    }

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View view) {
                                        InterfaceC203977zV interfaceC203977zV5;
                                        if (!C6ZT.LIZ(view) && (interfaceC203977zV5 = this.LJLJI) != null) {
                                            interfaceC203977zV5.LIZ(this.LJLJJI);
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        C201577vd c201577vd = C201577vd.this;
                                        int i4 = c201577vd.LJZ;
                                        if (i4 == 0 && (i4 = this.LJLJJL) == 0) {
                                            i4 = textPaint.linkColor;
                                        }
                                        if (c201577vd.LJLLILLLL != -1 && this.LJLJJI.getType() == 0) {
                                            i4 = C201577vd.this.LJLLILLLL;
                                        }
                                        if (this.LJLIL) {
                                            i4 = Color.argb(Math.round(Color.alpha(i4) * C201577vd.this.LJLLJ), Color.red(i4), Color.green(i4), Color.blue(i4));
                                        }
                                        textPaint.setColor(i4);
                                        C201577vd.this.getClass();
                                        textPaint.setUnderlineText(false);
                                    }

                                    {
                                        super(C201577vd.this);
                                        this.LJLJI = interfaceC203977zV4;
                                        this.LJLJJI = textExtraStruct;
                                        this.LJLJJL = i3;
                                        if (C201577vd.this.LJZ != 0) {
                                            C201577vd.this.getPaint().setColor(C201577vd.this.LJZ);
                                        } else {
                                            C201577vd.this.getPaint().setColor(i3 == 0 ? C201577vd.this.getPaint().linkColor : i3);
                                        }
                                    }
                                }, start, end, 33);
                                if (this.LJLLLL == 0) {
                                    spannableString.setSpan(new T5U(this.LJLLL, true), start, end, 33);
                                    spannableString.setSpan(new AbsoluteSizeSpan((int) this.LJLL), start, end, 33);
                                } else {
                                    spannableString.setSpan(new T5U(this.LJLLLL, true), start, end, 33);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.LJLZ = spannableString;
        setText(spannableString);
    }
}
