package X;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.SuggestionSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C109934Td extends T5T {
    public View.OnKeyListener LJLJJLL;
    public InterfaceC65784Pro<C76800UCe> LJLJL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJLJ;

    private final List<C93073l1> getMentionSpans() {
        Object[] spans;
        Editable text = getText();
        List<C93073l1> list = null;
        if (text != null && (spans = text.getSpans(0, text.length(), C93073l1.class)) != null && (list = ORY.LJJZZIII(spans)) != null) {
            for (C93073l1 c93073l1 : list) {
                c93073l1.LIZLLL = new Range(text.getSpanStart(c93073l1), text.getSpanEnd(c93073l1));
            }
        }
        return list;
    }

    public final InterfaceC65784Pro<C76800UCe> getHeightChangeListener() {
        return this.LJLJL;
    }

    public final View.OnKeyListener getMOnKeyListener() {
        return this.LJLJJLL;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnMentionDeleted() {
        return this.LJLJLJ;
    }

    public static boolean LJIIIIZZ(C109934Td c109934Td) {
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns;
        List<C93073l1> LJJZZIII;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2;
        Editable text;
        int selectionStart = c109934Td.getSelectionStart();
        int selectionEnd = c109934Td.getSelectionEnd();
        c109934Td.getClass();
        if (!C81253Gv.LIZ()) {
            return false;
        }
        if (selectionStart == selectionEnd) {
            Editable text2 = c109934Td.getText();
            if (text2 == null) {
                return false;
            }
            if (text2.length() < selectionEnd) {
                Object[] spans = text2.getSpans(0, text2.length(), C93073l1.class);
                if (spans == null) {
                    return false;
                }
                LJJZZIII = ORY.LJJZZIII(spans);
            } else {
                Object[] spans2 = text2.getSpans(0, selectionEnd, C93073l1.class);
                if (spans2 == null) {
                    return false;
                }
                LJJZZIII = ORY.LJJZZIII(spans2);
            }
            if (LJJZZIII == null) {
                return false;
            }
            for (C93073l1 c93073l1 : LJJZZIII) {
                c93073l1.LIZLLL = new Range(text2.getSpanStart(c93073l1), text2.getSpanEnd(c93073l1));
            }
            for (C93073l1 c93073l12 : LJJZZIII) {
                Range range = c93073l12.LIZLLL;
                if (range != null && range.contains(selectionStart, selectionEnd) && selectionEnd != range.getFrom()) {
                    Range range2 = c93073l12.LIZLLL;
                    if (range2 != null && (text = c109934Td.getText()) != null) {
                        text.delete(range2.getFrom(), range2.getTo());
                    }
                    String str = c93073l12.LIZIZ;
                    if (str != null && (interfaceC88472Yns2 = c109934Td.LJLJLJ) != null) {
                        interfaceC88472Yns2.invoke(str);
                    }
                    return true;
                }
            }
            return false;
        }
        Iterator<C93073l1> it = c109934Td.LJII(selectionStart, selectionEnd).iterator();
        while (it.hasNext()) {
            String str2 = it.next().LIZIZ;
            if (str2 != null && (interfaceC88472Yns = c109934Td.LJLJLJ) != null) {
                interfaceC88472Yns.invoke(str2);
            }
        }
        return false;
    }

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        o.LJIIIZ(outAttrs, "outAttrs");
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(this, onCreateInputConnection, this) { // from class: X.4Te
            public final C109934Td LIZ;
            public final /* synthetic */ C109934Td LIZIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent event) {
                o.LJIIIZ(event, "event");
                if (event.getAction() == 0 && event.getKeyCode() == 67 && C109934Td.LJIIIIZZ(this.LIZ)) {
                    View.OnKeyListener mOnKeyListener = this.LIZIZ.getMOnKeyListener();
                    if (mOnKeyListener != null) {
                        mOnKeyListener.onKey(this.LIZ, event.getKeyCode(), event);
                    }
                } else if (!super.sendKeyEvent(event)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
            
                if (X.C109934Td.LJIIIIZZ(r5.LIZ) == false) goto L7;
             */
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean deleteSurroundingText(int r6, int r7) {
                /*
                    r5 = this;
                    r4 = 0
                    r0 = 1
                    if (r6 != r0) goto L16
                    if (r7 != 0) goto L16
                    X.4Td r0 = r5.LIZ
                    boolean r0 = X.C109934Td.LJIIIIZZ(r0)
                    if (r0 != 0) goto L14
                Le:
                    boolean r0 = super.deleteSurroundingText(r6, r7)
                    if (r0 == 0) goto L15
                L14:
                    r4 = 1
                L15:
                    return r4
                L16:
                    X.4Td r3 = r5.LIZIZ
                    r3.getClass()
                    boolean r0 = X.C81253Gv.LIZ()
                    if (r0 == 0) goto Le
                    int r1 = r3.getSelectionEnd()
                    int r0 = r3.getSelectionStart()
                    if (r1 == r0) goto L2c
                    goto Le
                L2c:
                    int r0 = r3.getSelectionEnd()
                    int r1 = r7 + r0
                    int r0 = r0 - r6
                    int r0 = java.lang.Math.max(r4, r0)
                    java.util.List r0 = r3.LJII(r0, r1)
                    java.util.Iterator r2 = r0.iterator()
                L3f:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto Le
                    java.lang.Object r0 = r2.next()
                    X.3l1 r0 = (X.C93073l1) r0
                    java.lang.String r1 = r0.LIZIZ
                    if (r1 == 0) goto L3f
                    X.Yns<? super java.lang.String, X.UCe> r0 = r3.LJLJLJ
                    if (r0 == 0) goto L3f
                    r0.invoke(r1)
                    goto L3f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C109944Te.deleteSurroundingText(int, int):boolean");
            }

            {
                o.LJIIIZ(this, "editText");
                this.LIZIZ = this;
                this.LIZ = this;
            }
        };
    }

    public final void setHeightChangeListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJL = interfaceC65784Pro;
    }

    public final void setMOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LJLJJLL = onKeyListener;
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LJLJJLL = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public final void setOnMentionDeleted(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LJLJLJ = interfaceC88472Yns;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C109934Td(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.jy);
        o.LJIIIZ(context, "context");
    }

    public final List<C93073l1> LJII(int i, int i2) {
        Object[] spans;
        List<C93073l1> LJJZZIII;
        Editable text = getText();
        if (text == null || (spans = text.getSpans(Math.min(i, i2), Math.max(i, i2), C93073l1.class)) == null || (LJJZZIII = ORY.LJJZZIII(spans)) == null) {
            return C61878OQg.INSTANCE;
        }
        return LJJZZIII;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        List<C93073l1> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            Iterator<C93073l1> it = mentionSpans.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C93073l1 next = it.next();
                Range range = next.LIZLLL;
                if (range != null && range.isWrappedBy(i, i2)) {
                    Range range2 = next.LIZLLL;
                    if (range2 != null) {
                        try {
                            if (i == i2) {
                                setSelection(range2.getAnchorPosition(i));
                            } else {
                                if (i2 < range2.getTo()) {
                                    setSelection(i, range2.getTo());
                                }
                                if (i > range2.getFrom()) {
                                    setSelection(range2.getFrom(), i2);
                                }
                            }
                        } catch (Exception e) {
                            C34B.LJ("MentionEditText", e);
                        }
                        if (C76800UCe.LIZ != null) {
                            return;
                        }
                    }
                }
            }
        }
        if (i == i2) {
            setSelection(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109934Td(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        Context context2 = getContext();
        if (context2 != null && C012403c.LIZ(context2) == 1) {
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.4Tf
            public int LJLIL;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (C109934Td.this.getHeight() != this.LJLIL) {
                    this.LJLIL = C109934Td.this.getHeight();
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = C109934Td.this.LJLJL;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                    }
                }
            }
        });
        if (C81253Gv.LIZ() && C19N.LJ("im_mention_no_suggestion_setting", false)) {
            setEditableFactory(new Editable.Factory() { // from class: X.4Tg
                @Override // android.text.Editable.Factory
                public final Editable newEditable(CharSequence source) {
                    o.LJIIIZ(source, "source");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(source) { // from class: X.4SG
                        @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
                        public final /* bridge */ int length() {
                            return super.length();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(source);
                            o.LJIIIZ(source, "text");
                        }

                        @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
                        public final /* bridge */ char charAt(int i2) {
                            return super.charAt(i2);
                        }

                        @Override // android.text.SpannableStringBuilder, android.text.Spannable
                        public final void setSpan(Object what, int i2, int i3, int i4) {
                            o.LJIIIZ(what, "what");
                            if (what instanceof SuggestionSpan) {
                                Object[] spans = getSpans(i2, i3, C93073l1.class);
                                o.LJIIIIZZ(spans, "getSpans(start, end, Men….MentionSpan::class.java)");
                                if (((C93073l1[]) spans).length != 0) {
                                    return;
                                }
                            }
                            if (i2 >= 0 && i2 <= i3 && i3 <= super.length()) {
                                super.setSpan(what, i2, i3, i4);
                            }
                        }
                    };
                    Selection.setSelection(spannableStringBuilder, 0);
                    return spannableStringBuilder;
                }
            });
        }
    }

    public final void LJI(Integer num, String str, String uid, String str2) {
        Editable text;
        o.LJIIIZ(uid, "uid");
        if (getEditableText() == null) {
            return;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        SpannableString spannableString = new SpannableString(C0F0.LIZLLL("@", str, ' '));
        spannableString.setSpan(new C93073l1(spannableString.toString(), uid, 0), 0, spannableString.length(), 33);
        if (num != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(num.intValue(), context);
            if (LJI != null) {
                spannableString.setSpan(new ForegroundColorSpan(LJI.intValue()), 0, spannableString.length(), 33);
            }
        }
        spannableString.setSpan(new T5U(32, true), 0, spannableString.length(), 33);
        Editable editableText = getEditableText();
        o.LJIIIIZZ(editableText, "editableText");
        if (editableText.length() <= 0) {
            return;
        }
        if (str2.length() == 0) {
            if (selectionStart >= 1) {
                Editable editableText2 = getEditableText();
                o.LJIIIIZZ(editableText2, "editableText");
                int i = selectionStart - 1;
                if (o.LJ(editableText2.subSequence(i, selectionStart).toString(), "@")) {
                    Editable text2 = getText();
                    if (text2 == null) {
                        return;
                    }
                    text2.replace(i, selectionStart, spannableString);
                    return;
                }
            }
            Editable text3 = getText();
            if (text3 == null) {
                return;
            }
            text3.insert(Math.max(selectionStart, selectionEnd), spannableString);
            return;
        }
        if (selectionStart < str2.length() + 1) {
            return;
        }
        Editable editableText3 = getEditableText();
        o.LJIIIIZZ(editableText3, "editableText");
        int i2 = selectionStart - 1;
        String charSequence = editableText3.subSequence(i2 - str2.length(), selectionStart).toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("@");
        LIZ.append(str2);
        if (!o.LJ(charSequence, X1D.LIZIZ(LIZ)) || (text = getText()) == null) {
            return;
        }
        text.replace(i2 - str2.length(), selectionStart, spannableString);
    }
}
