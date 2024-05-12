package X;

import Y.IDComparatorS336S0100000_3;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSavedState;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.comment.widgets.EmojiStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C224748ru extends T5T {
    public RunnableC115854gf LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public C224808s0 LJLL;
    public final List<C224808s0> LJLLI;
    public List<TextWatcher> LJLLILLLL;
    public View.OnKeyListener LJLLJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C224748ru(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C224748ru(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final InterfaceC224838s3 getOnCommitTextListener() {
        return null;
    }

    public final void setOnCommitTextListener(InterfaceC224838s3 interfaceC224838s3) {
    }

    public final void setOnMentionInputListener(InterfaceC224818s1 interfaceC224818s1) {
    }

    public final void LJIIIZ() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        int length = text.length();
        CommentEditText$MentionSpan[] mentionSpan = getMentionSpan();
        if (mentionSpan == null) {
            return;
        }
        for (CommentEditText$MentionSpan commentEditText$MentionSpan : mentionSpan) {
            TextExtraStruct textExtraStruct = commentEditText$MentionSpan.struct;
            if (textExtraStruct == null) {
                return;
            }
            if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getType() == 0) {
                text.removeSpan(commentEditText$MentionSpan);
                CommentEditText$MentionSpan commentEditText$MentionSpan2 = new CommentEditText$MentionSpan(this.LJLJL, textExtraStruct.getType(), text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getSecUid());
                if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                    String awemeId = textExtraStruct.getAwemeId();
                    commentEditText$MentionSpan2.awemeId = awemeId;
                    TextExtraStruct textExtraStruct2 = commentEditText$MentionSpan2.struct;
                    if (textExtraStruct2 != null) {
                        textExtraStruct2.setAwemeId(awemeId);
                    }
                }
                text.setSpan(commentEditText$MentionSpan2, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
            }
        }
    }

    public final List<CommentEmojiSpan> getEmojiSpanList() {
        Editable text = getText();
        if (text == null || text.length() == 0) {
            return null;
        }
        Object[] spans = text.getSpans(0, text.length(), CommentEmojiSpan.class);
        Arrays.sort(spans, new IDComparatorS336S0100000_3(text, 0));
        o.LJIIIIZZ(spans, "spans");
        return ORY.LJJZZIII(spans);
    }

    public final ArrayList<EmojiStruct> getEmojiStructList() {
        Editable text = getText();
        if (text == null || text.length() == 0) {
            return null;
        }
        ArrayList<EmojiStruct> arrayList = new ArrayList<>();
        List<CommentEmojiSpan> emojiSpanList = getEmojiSpanList();
        if (emojiSpanList == null) {
            return arrayList;
        }
        for (CommentEmojiSpan commentEmojiSpan : emojiSpanList) {
            arrayList.add(new EmojiStruct(commentEmojiSpan, text.getSpanStart(commentEmojiSpan), text.getSpanStart(commentEmojiSpan)));
        }
        return arrayList;
    }

    public final ArrayList<TextExtraStruct> getMentionExtraStructList() {
        Editable text = getText();
        if (text == null || text.length() == 0) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        CommentEditText$MentionSpan[] mentionSpan = getMentionSpan();
        if (mentionSpan == null) {
            return arrayList;
        }
        for (CommentEditText$MentionSpan commentEditText$MentionSpan : mentionSpan) {
            if (commentEditText$MentionSpan.type == 0) {
                TextExtraStruct textExtraStruct = commentEditText$MentionSpan.struct;
                if (textExtraStruct != null) {
                    textExtraStruct.setStart(text.getSpanStart(commentEditText$MentionSpan));
                }
                TextExtraStruct textExtraStruct2 = commentEditText$MentionSpan.struct;
                if (textExtraStruct2 != null) {
                    textExtraStruct2.setEnd(text.getSpanEnd(commentEditText$MentionSpan));
                }
                TextExtraStruct textExtraStruct3 = commentEditText$MentionSpan.struct;
                if (textExtraStruct3 != null) {
                    arrayList.add(textExtraStruct3);
                }
            }
        }
        return arrayList;
    }

    public final CommentEditText$MentionSpan[] getMentionSpan() {
        Editable text = getText();
        if (text == null || text.length() == 0) {
            return null;
        }
        CommentEditText$MentionSpan[] commentEditText$MentionSpanArr = (CommentEditText$MentionSpan[]) text.getSpans(0, text.length(), CommentEditText$MentionSpan.class);
        Arrays.sort(commentEditText$MentionSpanArr, new IDComparatorS336S0100000_3(text, 1));
        return commentEditText$MentionSpanArr;
    }

    public final ArrayList<TextExtraStruct> getTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        CommentEditText$MentionSpan[] mentionSpan = getMentionSpan();
        if (mentionSpan == null) {
            return arrayList;
        }
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(mentionSpan);
        while (LJJIIJZLJL.hasNext()) {
            CommentEditText$MentionSpan commentEditText$MentionSpan = (CommentEditText$MentionSpan) LJJIIJZLJL.next();
            if (commentEditText$MentionSpan.type == 0) {
                TextExtraStruct textExtraStruct = commentEditText$MentionSpan.struct;
                if (textExtraStruct != null) {
                    textExtraStruct.setStart(text.getSpanStart(commentEditText$MentionSpan));
                }
                TextExtraStruct textExtraStruct2 = commentEditText$MentionSpan.struct;
                if (textExtraStruct2 != null) {
                    textExtraStruct2.setEnd(text.getSpanEnd(commentEditText$MentionSpan));
                }
                TextExtraStruct textExtraStruct3 = commentEditText$MentionSpan.struct;
                if (textExtraStruct3 != null) {
                    arrayList.add(textExtraStruct3);
                }
            }
        }
        return arrayList;
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        CommentEditText$MentionSavedState commentEditText$MentionSavedState = new CommentEditText$MentionSavedState(super.onSaveInstanceState());
        commentEditText$MentionSavedState.text = String.valueOf(getText());
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        commentEditText$MentionSavedState.selectionEnd = selectionEnd;
        commentEditText$MentionSavedState.structs = getMentionExtraStructList();
        commentEditText$MentionSavedState.emojis = getEmojiStructList();
        return commentEditText$MentionSavedState;
    }

    public final int getMentionTextColor() {
        return this.LJLJL;
    }

    public final int getMentionTextTypeface() {
        return this.LJLJLJ;
    }

    public final List<TextWatcher> getTextWatcherList() {
        return this.LJLLILLLL;
    }

    private final void setEmojiSpanList(List<EmojiStruct> list) {
        Editable text;
        int i;
        if (list == null || list.isEmpty() || (text = getText()) == null || text.length() == 0) {
            return;
        }
        int length = text.length();
        for (EmojiStruct emojiStruct : list) {
            int i2 = emojiStruct.start;
            if (i2 <= length || (i = emojiStruct.end) <= length || i2 <= i) {
                text.setSpan(emojiStruct.emojiSpan, i2, emojiStruct.end, 33);
            }
        }
    }

    private final void setTextExtraList(List<? extends TextExtraStruct> list) {
        Editable text;
        this.LJLJLLL = false;
        List<C224808s0> list2 = this.LJLLI;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        if (list == null || list.isEmpty() || (text = getText()) == null || text.length() == 0) {
            return;
        }
        int length = text.length();
        for (TextExtraStruct textExtraStruct : list) {
            int i = this.LJLJL;
            if (textExtraStruct.getType() == 0 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                CommentEditText$MentionSpan commentEditText$MentionSpan = new CommentEditText$MentionSpan(i, textExtraStruct.getType(), text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getSecUid());
                if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                    String awemeId = textExtraStruct.getAwemeId();
                    commentEditText$MentionSpan.awemeId = awemeId;
                    TextExtraStruct textExtraStruct2 = commentEditText$MentionSpan.struct;
                    if (textExtraStruct2 != null) {
                        textExtraStruct2.setAwemeId(awemeId);
                    }
                }
                text.setSpan(commentEditText$MentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                C224808s0 c224808s0 = new C224808s0(textExtraStruct.getStart(), textExtraStruct.getEnd());
                List<C224808s0> list3 = this.LJLLI;
                if (list3 != null) {
                    ((ArrayList) list3).add(c224808s0);
                }
            }
        }
    }

    public final boolean LJIIIIZZ(String str) {
        TextExtraStruct textExtraStruct;
        CommentEditText$MentionSpan[] mentionSpan = getMentionSpan();
        if (mentionSpan != null && str != null && str.length() != 0) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(mentionSpan);
            while (LJJIIJZLJL.hasNext()) {
                CommentEditText$MentionSpan commentEditText$MentionSpan = (CommentEditText$MentionSpan) LJJIIJZLJL.next();
                if (TextUtils.equals(str, commentEditText$MentionSpan.uid) && (textExtraStruct = commentEditText$MentionSpan.struct) != null) {
                    int end = textExtraStruct.getEnd();
                    int i = end + 1;
                    if (i <= getEditableText().length() && ' ' == getEditableText().charAt(end)) {
                        end = i;
                    }
                    getEditableText().delete(textExtraStruct.getStart(), end);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        if (textWatcher == null) {
            return;
        }
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LJLLILLLL;
        if (list != null) {
            list.add(textWatcher);
        }
    }

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        o.LJIIIZ(outAttrs, "outAttrs");
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(this, onCreateInputConnection, this) { // from class: X.8rv
            public final C224748ru LIZ;
            public final /* synthetic */ C224748ru LIZIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent event) {
                int i;
                o.LJIIIZ(event, "event");
                C224748ru c224748ru = this.LIZIZ;
                View.OnKeyListener onKeyListener = c224748ru.LJLLJ;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(c224748ru, event.getKeyCode(), event);
                }
                if (event.getAction() == 0 && event.getKeyCode() == 67) {
                    int selectionStart = this.LIZ.getSelectionStart();
                    C224808s0 LJII = this.LIZIZ.LJII(selectionStart, this.LIZ.getSelectionEnd());
                    if (LJII == null) {
                        this.LIZIZ.LJLJLLL = false;
                        return super.sendKeyEvent(event);
                    }
                    C224748ru c224748ru2 = this.LIZIZ;
                    if (c224748ru2.LJLJLLL || selectionStart == (i = LJII.LIZ)) {
                        c224748ru2.LJLJLLL = false;
                        return super.sendKeyEvent(event);
                    }
                    c224748ru2.LJLJLLL = true;
                    c224748ru2.LJLL = LJII;
                    if (Build.VERSION.SDK_INT >= 25) {
                        setSelection(i, LJII.LIZIZ);
                    } else {
                        setSelection(LJII.LIZIZ, i);
                    }
                    return true;
                }
                return super.sendKeyEvent(event);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                try {
                    return super.commitText(charSequence, i);
                } catch (NullPointerException e) {
                    C16880lQ.LLLLIIL(e);
                    return true;
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                CommentEditText$MentionSpan[] commentEditText$MentionSpanArr;
                int i3 = i;
                int i4 = i2;
                if (i3 == 1) {
                    if (i4 == 0) {
                        Editable text = this.LIZIZ.getText();
                        if (text != null && text.length() != 0) {
                            C224748ru c224748ru = this.LIZIZ;
                            c224748ru.getClass();
                            int length = text.length();
                            int max = Math.max(c224748ru.getSelectionStart() - i3, 0);
                            int min = Math.min(c224748ru.getSelectionEnd(), length);
                            CharacterStyle[] characterStyles = (CharacterStyle[]) text.getSpans(0, length, CharacterStyle.class);
                            o.LJIIIIZZ(characterStyles, "characterStyles");
                            int i5 = max;
                            int i6 = min;
                            boolean z = false;
                            boolean z2 = false;
                            for (CharacterStyle characterStyle : characterStyles) {
                                if (!(characterStyle instanceof CommentEditText$MentionSpan) || ((CommentEditText$MentionSpan) characterStyle).type != 1) {
                                    int spanStart = text.getSpanStart(characterStyle);
                                    int spanEnd = text.getSpanEnd(characterStyle);
                                    if (!z && spanStart <= max && spanEnd > max) {
                                        i5 = spanStart;
                                        z = true;
                                    }
                                    if (!z2 && spanStart < min && spanEnd >= min) {
                                        i6 = spanEnd;
                                        z2 = true;
                                    }
                                    if (z && z2) {
                                        break;
                                    }
                                }
                            }
                            if (i5 > i6) {
                                int i7 = i6;
                                i6 = i5;
                                i5 = i7;
                            }
                            C224808s0 LJII = this.LIZIZ.LJII(i5, i6);
                            if (LJII == null || (commentEditText$MentionSpanArr = (CommentEditText$MentionSpan[]) text.getSpans(LJII.LIZ, LJII.LIZIZ, CommentEditText$MentionSpan.class)) == null || commentEditText$MentionSpanArr.length == 0) {
                                text.delete(i5, i6);
                            } else {
                                if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                                    return true;
                                }
                                return false;
                            }
                        }
                        return false;
                    }
                } else if (i3 < 0) {
                    int i8 = -i4;
                    i4 = -i3;
                    i3 = i8;
                }
                return super.deleteSurroundingText(i3, i4);
            }

            {
                o.LJIIIZ(this, "editText");
                this.LIZIZ = this;
                this.LIZ = this;
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        int i;
        o.LJIIIZ(state, "state");
        if (!(state instanceof CommentEditText$MentionSavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        CommentEditText$MentionSavedState commentEditText$MentionSavedState = (CommentEditText$MentionSavedState) state;
        super.onRestoreInstanceState(commentEditText$MentionSavedState.getSuperState());
        setText(commentEditText$MentionSavedState.text);
        if (getText() != null) {
            int i2 = commentEditText$MentionSavedState.selectionEnd;
            Editable text = getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            int min = Math.min(i2, i);
            if (min >= 0) {
                setSelection(min);
            }
            setTextExtraList(commentEditText$MentionSavedState.structs);
            setEmojiSpanList(commentEditText$MentionSavedState.emojis);
        }
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        if (textWatcher == null) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LJLLILLLL;
        if (list != null) {
            list.remove(textWatcher);
        }
    }

    public final void setMentionTextColor(int i) {
        this.LJLJL = i;
    }

    public final void setMentionTextTypeface(int i) {
        this.LJLJLJ = i;
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LJLLJ = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public final void setTextWatcherList(List<TextWatcher> list) {
        this.LJLLILLLL = list;
    }

    public final C224808s0 LJII(int i, int i2) {
        List<C224808s0> list = this.LJLLI;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C224808s0 c224808s0 = (C224808s0) it.next();
                if (c224808s0.LIZ <= i && c224808s0.LIZIZ >= i2) {
                    return c224808s0;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C224808s0 c224808s0 = this.LJLL;
        if (c224808s0 != null) {
            int i3 = c224808s0.LIZ;
            if (i3 != i || c224808s0.LIZIZ != i2) {
                if (i3 == i2 && c224808s0.LIZIZ == i) {
                    return;
                }
            } else {
                return;
            }
        }
        C224808s0 LJII = LJII(i, i2);
        if (LJII != null && LJII.LIZIZ == i2) {
            this.LJLJLLL = false;
        }
        List<C224808s0> list = this.LJLLI;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C224808s0 c224808s02 = (C224808s0) it.next();
                int i4 = c224808s02.LIZ;
                if ((i > i4 && i < c224808s02.LIZIZ) || (i2 > i4 && i2 < c224808s02.LIZIZ)) {
                    try {
                        if (i == i2) {
                            int i5 = c224808s02.LIZ;
                            int i6 = c224808s02.LIZIZ;
                            if ((i - i5) - (i6 - i) >= 0) {
                                i5 = i6;
                            }
                            setSelection(i5);
                            return;
                        }
                        int i7 = c224808s02.LIZIZ;
                        if (i2 < i7) {
                            setSelection(i, i7);
                        }
                        int i8 = c224808s02.LIZ;
                        if (i > i8) {
                            setSelection(i8, i2);
                            return;
                        }
                        return;
                    } catch (IndexOutOfBoundsException e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.4gf] */
    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType type) {
        o.LJIIIZ(type, "type");
        try {
            super.setText(charSequence, type);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new Runnable(this) { // from class: X.4gf
                public final WeakReference<C224748ru> LJLIL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    int i;
                    try {
                        C224748ru c224748ru = this.LJLIL.get();
                        if (c224748ru != null) {
                            Editable text = c224748ru.getText();
                            if (text != null) {
                                i = text.length();
                            } else {
                                i = 0;
                            }
                            c224748ru.setSelection(i);
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                {
                    o.LJIIIZ(this, "editText");
                    this.LJLIL = new WeakReference<>(this);
                }
            };
        }
        Editable text = getText();
        if (text == null || text.length() == 0) {
            return;
        }
        post(this.LJLJJLL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C224748ru(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            r0 = r6 & 4
            if (r0 == 0) goto L52
            r1 = 2130968878(0x7f04012e, float:1.7546422E38)
        Lc:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r4, r0)
            r3.<init>(r4, r5, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.LJLLILLLL = r0
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.setImeOptions(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 5
            r0.<init>(r2)
            r3.LJLLI = r0
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r3.LJLJL = r0
            X.4iB r0 = new X.4iB
            r0.<init>()
            r3.addTextChangedListener(r0)
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L51
            r3.setTextAlignment(r2)
            int r1 = r3.getGravity()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r0
            r3.setGravity(r1)
        L51:
            return
        L52:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224748ru.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final boolean LJI(String text, String str, String str2) {
        o.LJIIIZ(text, "text");
        int selectionStart = getSelectionStart();
        Editable text2 = getText();
        if (text2 == null) {
            return false;
        }
        SpannableString spannableString = new SpannableString(i0.LJFF("@", text));
        CommentEditText$MentionSpan commentEditText$MentionSpan = new CommentEditText$MentionSpan(this.LJLJL, 0, spannableString.toString(), str, str2);
        spannableString.setSpan(commentEditText$MentionSpan, 0, spannableString.length(), 33);
        if (this.LJLJLJ != 0) {
            spannableString.setSpan(new StyleSpan(this.LJLJLJ), 0, spannableString.length(), 33);
        }
        CommentEditText$MentionSpan[] mentionSpan = getMentionSpan();
        if (mentionSpan != null && C61898ORa.LJIILL(mentionSpan).contains(commentEditText$MentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(text2)) {
            text2.insert(0, spannableString);
            text2.append((CharSequence) " ");
            return true;
        }
        int length = text2.length();
        if (selectionStart >= 0 && selectionStart <= length) {
            if (selectionStart > 0) {
                int i = selectionStart - 1;
                if (TextUtils.equals(text2.subSequence(i, selectionStart), "@")) {
                    text2.delete(i, selectionStart);
                    length--;
                    selectionStart = i;
                }
            }
            int min = Math.min(length, Math.max(0, selectionStart));
            text2.insert(min, spannableString);
            text2.insert(Math.min(spannableString.length() + min, text2.length()), " ");
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CommentEditText$MentionSpan[] mentionSpan;
        List<C224808s0> list;
        this.LJLJLLL = false;
        List<C224808s0> list2 = this.LJLLI;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        Editable text = getText();
        if (text == null || text.length() == 0 || (mentionSpan = getMentionSpan()) == null) {
            return;
        }
        for (CommentEditText$MentionSpan commentEditText$MentionSpan : mentionSpan) {
            int spanStart = text.getSpanStart(commentEditText$MentionSpan);
            int spanEnd = text.getSpanEnd(commentEditText$MentionSpan);
            C224808s0 c224808s0 = new C224808s0(spanStart, spanEnd);
            if (!TextUtils.equals(text.subSequence(spanStart, spanEnd).toString(), commentEditText$MentionSpan.text)) {
                text.removeSpan(commentEditText$MentionSpan);
            } else if (commentEditText$MentionSpan.type == 0 && (list = this.LJLLI) != null) {
                ((ArrayList) list).add(c224808s0);
            }
        }
    }
}
