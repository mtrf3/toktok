package X;

import Y.IDComparatorS336S0100000_3;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C224738rt extends T5T {
    public static final /* synthetic */ int LJLLL = 0;
    public RunnableC1790570z LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public C224808s0 LJLL;
    public List<C224808s0> LJLLI;
    public final List<TextWatcher> LJLLILLLL;
    public View.OnKeyListener LJLLJ;

    public String getAdTag() {
        return "";
    }

    public void setOnMentionInputListener(InterfaceC224828s2 interfaceC224828s2) {
    }

    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    public MentionEditText$MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionEditText$MentionSpan[] mentionEditText$MentionSpanArr = (MentionEditText$MentionSpan[]) text.getSpans(0, getNoAdTagText().length(), MentionEditText$MentionSpan.class);
        Arrays.sort(mentionEditText$MentionSpanArr, new IDComparatorS336S0100000_3(text, 2));
        return mentionEditText$MentionSpanArr;
    }

    public int getMentionTextCount() {
        MentionEditText$MentionSpan[] mentionText = getMentionText();
        if (mentionText == null) {
            return 0;
        }
        return mentionText.length;
    }

    public String getNoAdTagText() {
        return getText().toString();
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionEditText$MentionSpan mentionEditText$MentionSpan : getMentionText()) {
            if (mentionEditText$MentionSpan.mType == 0) {
                mentionEditText$MentionSpan.mStruct.setStart(text.getSpanStart(mentionEditText$MentionSpan));
                mentionEditText$MentionSpan.mStruct.setEnd(text.getSpanEnd(mentionEditText$MentionSpan));
                arrayList.add(mentionEditText$MentionSpan.mStruct);
            }
        }
        return arrayList;
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MentionEditText$MentionSavedState mentionEditText$MentionSavedState = new MentionEditText$MentionSavedState(super.onSaveInstanceState());
        mentionEditText$MentionSavedState.mText = getNoAdTagText();
        mentionEditText$MentionSavedState.mSelectionEnd = Math.max(getSelectionEnd(), 0);
        mentionEditText$MentionSavedState.mStructs = getCompatTextExtraStructList();
        return mentionEditText$MentionSavedState;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LJLLILLLL;
        if (list != null && textWatcher != null) {
            list.add(textWatcher);
        }
    }

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(onCreateInputConnection, this) { // from class: X.8rw
            public final C224738rt LIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                int i;
                C224738rt c224738rt = C224738rt.this;
                View.OnKeyListener onKeyListener = c224738rt.LJLLJ;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(c224738rt, keyEvent.getKeyCode(), keyEvent);
                }
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    int selectionStart = this.LIZ.getSelectionStart();
                    C224808s0 LJI = C224738rt.this.LJI(selectionStart, this.LIZ.getSelectionEnd());
                    if (LJI == null) {
                        C224738rt.this.LJLJLLL = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    C224738rt c224738rt2 = C224738rt.this;
                    if (c224738rt2.LJLJLLL || selectionStart == (i = LJI.LIZ)) {
                        c224738rt2.LJLJLLL = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    c224738rt2.LJLJLLL = true;
                    c224738rt2.LJLL = LJI;
                    if (Build.VERSION.SDK_INT >= 25) {
                        setSelection(i, LJI.LIZIZ);
                    } else {
                        setSelection(LJI.LIZIZ, i);
                    }
                    return true;
                }
                return super.sendKeyEvent(keyEvent);
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
                MentionEditText$MentionSpan[] mentionEditText$MentionSpanArr;
                int i3 = i;
                int i4 = i2;
                if (i3 == 1) {
                    if (i4 == 0) {
                        Editable text = C224738rt.this.getText();
                        if (text != null && text.length() > 0) {
                            C224738rt c224738rt = C224738rt.this;
                            c224738rt.getClass();
                            int length = text.length();
                            int max = Math.max(c224738rt.getSelectionStart() - i3, 0);
                            int min = Math.min(c224738rt.getSelectionEnd(), length);
                            int i5 = max;
                            int i6 = min;
                            boolean z = false;
                            boolean z2 = false;
                            for (CharacterStyle characterStyle : (CharacterStyle[]) text.getSpans(0, length, CharacterStyle.class)) {
                                if (!(characterStyle instanceof MentionEditText$MentionSpan) || ((MentionEditText$MentionSpan) characterStyle).mType != 1) {
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
                            C224808s0 LJI = C224738rt.this.LJI(i5, i6);
                            if (LJI != null && (mentionEditText$MentionSpanArr = (MentionEditText$MentionSpan[]) text.getSpans(LJI.LIZ, LJI.LIZIZ, MentionEditText$MentionSpan.class)) != null && mentionEditText$MentionSpanArr.length > 0) {
                                if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                                    return true;
                                }
                                return false;
                            }
                            text.delete(i5, i6);
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
                this.LIZ = this;
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionEditText$MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionEditText$MentionSavedState mentionEditText$MentionSavedState = (MentionEditText$MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionEditText$MentionSavedState.getSuperState());
        setText(mentionEditText$MentionSavedState.mText);
        if (getText() != null) {
            int min = Math.min(mentionEditText$MentionSavedState.mSelectionEnd, getText().length());
            if (min >= 0) {
                setSelection(min);
            }
            setTextExtraList(mentionEditText$MentionSavedState.mStructs);
        }
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LJLLILLLL;
        if (list != null && textWatcher != null) {
            ((ArrayList) list).remove(textWatcher);
        }
    }

    public void setMentionTextColor(int i) {
        this.LJLJL = i;
    }

    public void setMentionTextTypeface(int i) {
        this.LJLJLJ = i;
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LJLLJ = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable text;
        this.LJLJLLL = false;
        List<C224808s0> list2 = this.LJLLI;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        if (list == null || list.isEmpty() || (text = getText()) == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        int length = text.length();
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct.getType() == 0 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                MentionEditText$MentionSpan mentionEditText$MentionSpan = new MentionEditText$MentionSpan(text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), this.LJLJL, textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                    String awemeId = textExtraStruct.getAwemeId();
                    mentionEditText$MentionSpan.awemeId = awemeId;
                    mentionEditText$MentionSpan.mStruct.setAwemeId(awemeId);
                }
                int subtype = textExtraStruct.getSubtype();
                mentionEditText$MentionSpan.subType = subtype;
                mentionEditText$MentionSpan.mStruct.setSubType(subtype);
                text.setSpan(mentionEditText$MentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                ((ArrayList) this.LJLLI).add(new C224808s0(textExtraStruct.getStart(), textExtraStruct.getEnd()));
            }
        }
    }

    public C224738rt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLILLLL = new ArrayList();
        new HashSet();
        setImeOptions(268435456);
        this.LJLLI = new ArrayList(5);
        this.LJLJL = -65536;
        addTextChangedListener(new TextWatcher() { // from class: X.71Z
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i)) {
                    C224738rt.this.getClass();
                }
            }
        });
        Context context2 = getContext();
        if (context2 != null && C012403c.LIZ(context2) == 1) {
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
    }

    public final C224808s0 LJI(int i, int i2) {
        List<C224808s0> list = this.LJLLI;
        if (list == null) {
            return null;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C224808s0 c224808s0 = (C224808s0) it.next();
            if (c224808s0.LIZ <= i && c224808s0.LIZIZ >= i2) {
                return c224808s0;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        String adTag = getAdTag();
        if (!TextUtils.isEmpty(adTag)) {
            int length = getText().length() - adTag.length();
            if (i > length) {
                setSelection(length);
            } else if (i2 > length) {
                setSelection(i, length);
            }
        }
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
        C224808s0 LJI = LJI(i, i2);
        if (LJI != null && LJI.LIZIZ == i2) {
            this.LJLJLLL = false;
        }
        List<C224808s0> list = this.LJLLI;
        if (list == null) {
            return;
        }
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

    /* JADX WARN: Type inference failed for: r0v4, types: [X.70z] */
    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new Runnable(this) { // from class: X.70z
                public final WeakReference<C224738rt> LJLIL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C224738rt c224738rt = this.LJLIL.get();
                        if (c224738rt != null) {
                            c224738rt.setSelection(c224738rt.getText().length());
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                {
                    this.LJLIL = new WeakReference<>(this);
                }
            };
        }
        if (getText().length() > 0) {
            post(this.LJLJJLL);
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.LJLJLLL = false;
        List<C224808s0> list = this.LJLLI;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        for (MentionEditText$MentionSpan mentionEditText$MentionSpan : getMentionText()) {
            int spanStart = text.getSpanStart(mentionEditText$MentionSpan);
            int spanEnd = text.getSpanEnd(mentionEditText$MentionSpan);
            C224808s0 c224808s0 = new C224808s0(spanStart, spanEnd);
            if (!TextUtils.equals(text.subSequence(spanStart, spanEnd).toString(), mentionEditText$MentionSpan.mText)) {
                text.removeSpan(mentionEditText$MentionSpan);
            } else if (mentionEditText$MentionSpan.mType == 0) {
                ((ArrayList) this.LJLLI).add(c224808s0);
            }
        }
    }
}
