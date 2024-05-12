package X;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.88n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2064988n extends TuxTextView {
    public static final /* synthetic */ int LLI = 0;
    public boolean LJLLLL;
    public C76Z LJLLLLLL;
    public C76Z LJLZ;
    public float LJZ;
    public int LJZI;
    public int LJZL;
    public float LL;
    public int LLD;
    public int LLF;
    public SY9 LLFF;
    public AbstractC2065388r LLFFF;
    public float LLFII;
    public final java.util.Map<Integer, View> LLFZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLFZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            return null;
        }
    }

    public final int getDesiredHeight() {
        Layout layout = getLayout();
        if (layout == null) {
            return getHeight();
        }
        return getCompoundPaddingStart() + getCompoundPaddingBottom() + layout.getLineTop(getLineCount());
    }

    public final float getLastScrollY() {
        return this.LLFII;
    }

    public final int getMentionSpanColor() {
        return this.LJZL;
    }

    public final int getMentionTuxFont() {
        return this.LLD;
    }

    public final float getPressAlpha() {
        return this.LL;
    }

    public final SY9 getSearchIconDrawable() {
        return this.LLFF;
    }

    public final int getSearchSpanColor() {
        return this.LJZI;
    }

    public final boolean getShowUnderline() {
        return this.LJLLLL;
    }

    public final float getSpanSize() {
        return this.LJZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2064988n(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    public final void LJJJJ(List list) {
        int start;
        int end;
        SpannableString spannableString = new SpannableString(getText());
        if (list == null || list.isEmpty() || TextUtils.isEmpty(spannableString.toString())) {
            return;
        }
        int length = spannableString.length();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
            if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
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
                    int type = textExtraStruct.getType();
                    if (type != 0) {
                        if (type != 6) {
                            switch (type) {
                                case 65281:
                                    spannableString.setSpan(textExtraStruct.getCustomSpan(), start, end, 33);
                                    break;
                                case 65282:
                                    spannableString.setSpan(new C2065188p(this, this.LJLLLLLL, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                                    break;
                            }
                        } else {
                            spannableString.setSpan(new T5U(this.LLF, true), start, end, 33);
                            int i = end + 1;
                            if (i > spannableString.length()) {
                                i = end;
                            }
                            if (this.LLFF != null) {
                                spannableString.setSpan(new C8FR(this.LLFF, 3), end, i, 33);
                            }
                            spannableString.setSpan(new C2065188p(this, this.LJLZ, textExtraStruct, this.LJZI), start, i, 33);
                        }
                    } else {
                        final C76Z c76z = this.LJLLLLLL;
                        spannableString.setSpan(new AbstractC2065388r(c76z, textExtraStruct) { // from class: X.88q
                            public final C76Z LJLJI;
                            public final TextExtraStruct LJLJJI;

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View widget) {
                                C76Z c76z2;
                                o.LJIIIZ(widget, "widget");
                                if (!C6ZT.LIZ(widget) && (c76z2 = this.LJLJI) != null) {
                                    c76z2.LIZ(this.LJLJJI);
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint ds) {
                                o.LJIIIZ(ds, "ds");
                                int mentionSpanColor = C2064988n.this.getMentionSpanColor();
                                if (this.LJLIL) {
                                    mentionSpanColor = Color.argb(Math.round(Color.alpha(mentionSpanColor) * C2064988n.this.getPressAlpha()), Color.red(mentionSpanColor), Color.green(mentionSpanColor), Color.blue(mentionSpanColor));
                                }
                                ds.setColor(mentionSpanColor);
                                ds.setUnderlineText(C2064988n.this.getShowUnderline());
                            }

                            {
                                super(C2064988n.this);
                                this.LJLJI = c76z;
                                this.LJLJJI = textExtraStruct;
                            }
                        }, start, end, 33);
                        spannableString.setSpan(new T5U(this.LLD, true), start, end, 33);
                    }
                }
            }
        }
        setText(spannableString);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        AbstractC2065388r abstractC2065388r;
        boolean z;
        o.LJIIIZ(event, "event");
        try {
            super.onTouchEvent(event);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        if (getDesiredHeight() > getHeight()) {
            int action = event.getAction();
            if (action != 0) {
                if (action != 2) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    float y = this.LLFII - event.getY();
                    if (y > 0.0f) {
                        if ((getDesiredHeight() - getHeight()) - getScrollY() <= 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(!z);
                    } else if (y < 0.0f) {
                        if (getScrollY() == 0) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.LLFII = event.getY();
                }
            } else {
                this.LLFII = event.getY();
            }
        }
        int action2 = event.getAction();
        if (action2 != 0) {
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 == 3 && (abstractC2065388r = this.LLFFF) != null) {
                        abstractC2065388r.LJLIL = false;
                        abstractC2065388r.LJLILLLLZI.invalidate();
                        this.LLFFF = null;
                    }
                    return false;
                }
                AbstractC2065388r abstractC2065388r2 = this.LLFFF;
                if (abstractC2065388r2 != null && abstractC2065388r2 != LJJJIL(event, AbstractC2065388r.class)) {
                    AbstractC2065388r abstractC2065388r3 = this.LLFFF;
                    if (abstractC2065388r3 != null) {
                        abstractC2065388r3.LJLIL = false;
                        abstractC2065388r3.LJLILLLLZI.invalidate();
                    }
                    this.LLFFF = null;
                }
                return false;
            }
            AbstractC2065388r abstractC2065388r4 = this.LLFFF;
            if (abstractC2065388r4 == null || abstractC2065388r4 != LJJJIL(event, AbstractC2065388r.class)) {
                return false;
            }
            AbstractC2065388r abstractC2065388r5 = this.LLFFF;
            if (abstractC2065388r5 != null) {
                abstractC2065388r5.LJLIL = false;
                abstractC2065388r5.LJLILLLLZI.invalidate();
            }
            this.LLFFF = null;
            return true;
        }
        AbstractC2065388r abstractC2065388r6 = (AbstractC2065388r) LJJJIL(event, AbstractC2065388r.class);
        if (abstractC2065388r6 != null) {
            abstractC2065388r6.LJLIL = true;
            abstractC2065388r6.LJLILLLLZI.invalidate();
            this.LLFFF = abstractC2065388r6;
            return true;
        }
        if (LJJJIL(event, ClickableSpan.class) != null) {
            return true;
        }
        return false;
    }

    public final void setLastScrollY(float f) {
        this.LLFII = f;
    }

    public final void setMentionSpanColor(int i) {
        this.LJZL = i;
    }

    public final void setMentionSpanStyle(int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LLD = 12;
            return;
        }
        this.LLD = 11;
    }

    public final void setMentionTuxFont(int i) {
        this.LLD = i;
    }

    public final void setOnSpanClickListener(C76Z c76z) {
        this.LJLLLLLL = c76z;
    }

    public final void setPressAlpha(float f) {
        this.LL = f;
    }

    public final void setSearchIconDrawable(SY9 sy9) {
        this.LLFF = sy9;
    }

    public final void setSearchOnSpanClickListener(C76Z c76z) {
        this.LJLZ = c76z;
    }

    public final void setSearchSpanColor(int i) {
        this.LJZI = i;
    }

    public final void setSearchSpanStyle(int i) {
        this.LLF = i;
    }

    public final void setShowUnderline(boolean z) {
        this.LJLLLL = z;
    }

    public final void setSpanSize(float f) {
        this.LJZ = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2064988n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LLFZ = C62850Ola.LJFF(context, "context");
        this.LLD = 12;
        this.LLF = 12;
        this.LJLLLL = false;
        this.LJZ = getTextSize();
        this.LJZL = -1;
        setHighlightColor(0);
        this.LL = 0.75f;
    }

    public final <T extends ClickableSpan> T LJJJIL(MotionEvent motionEvent, Class<T> cls) {
        CharSequence text = getText();
        if (!(text instanceof Spanned) || text == null) {
            return null;
        }
        CharSequence text2 = getText();
        o.LJII(text2, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text2;
        int scrollX = getScrollX() + (((int) motionEvent.getX()) - getTotalPaddingLeft());
        int scrollY = getScrollY() + (((int) motionEvent.getY()) - getTotalPaddingTop());
        Layout layout = getLayout();
        try {
            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] link = (ClickableSpan[]) spanned.getSpans(LLLLLLL, LLLLLLL, cls);
            o.LJIIIIZZ(link, "link");
            if (link.length == 0) {
                return null;
            }
            ClickableSpan clickableSpan = link[0];
            if (LLLLLLL < spanned.getSpanStart(clickableSpan) || LLLLLLL > spanned.getSpanEnd(clickableSpan)) {
                return null;
            }
            return (T) link[0];
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }
}
