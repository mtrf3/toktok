package X;

import Y.IDComparatorS340S0100000_7;
import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.ss.android.ugc.aweme.api.VideoRelatedInfo;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$MentionSavedState;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class GSU extends GSZ implements IAVMentionEditText {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public GQC LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public C41545GSf LJLJLLL;
    public List<C41545GSf> LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public String LJLZ;
    public VideoPublishEditModel LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public G9T LLFFF;
    public final List<TextWatcher> LLFII;
    public final java.util.Set<String> LLFZ;
    public View.OnKeyListener LLI;

    public final void LJIIJJI() {
        this.LJLJLJ = false;
        List<C41545GSf> list = this.LJLL;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        for (MentionSpan mentionSpan : getMentionText()) {
            int spanStart = text.getSpanStart(mentionSpan);
            int spanEnd = text.getSpanEnd(mentionSpan);
            C41545GSf c41545GSf = new C41545GSf(spanStart, spanEnd);
            if (!TextUtils.equals(text.subSequence(spanStart, spanEnd).toString(), mentionSpan.mText)) {
                text.removeSpan(mentionSpan);
            } else {
                int i = mentionSpan.mType;
                if (i == 0 || i == 5) {
                    ((ArrayList) this.LJLL).add(c41545GSf);
                }
                LJIILIIL(mentionSpan, c41545GSf);
            }
        }
    }

    public void LJIILIIL(MentionSpan mentionSpan, C41545GSf c41545GSf) {
    }

    public void addHashTag(String str) {
    }

    public String getAdTag() {
        return "";
    }

    public void removeHashTag() {
    }

    public final void LJII() {
        Iterator it = ((ArrayList) this.LLFII).iterator();
        while (it.hasNext()) {
            super.addTextChangedListener((TextWatcher) it.next());
        }
    }

    public final void LJIILJJIL() {
        Iterator it = ((ArrayList) this.LLFII).iterator();
        while (it.hasNext()) {
            super.removeTextChangedListener((TextWatcher) it.next());
        }
    }

    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    public MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, getNoAdTagText().length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new IDComparatorS340S0100000_7(text, 0));
        return mentionSpanArr;
    }

    public List<String> getMentionVideoIdList() {
        MentionSpan[] mentionText = getMentionText();
        ArrayList arrayList = new ArrayList();
        if (mentionText != null) {
            for (MentionSpan mentionSpan : mentionText) {
                if (mentionSpan.mType == 5) {
                    arrayList.add(mentionSpan.awemeId);
                }
            }
        }
        return arrayList;
    }

    public String getNoAdTagText() {
        if (getText() != null) {
            return getText().toString();
        }
        return "";
    }

    @Override // X.C19K, android.widget.EditText, android.widget.TextView
    public Editable getText() {
        Editable text = super.getText();
        if (C19N.LJ("studio_enable_caption_editable_wrapper", false)) {
            C60903NvH.LJIIJJI().LJJIIJ();
        }
        return text;
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionSpan mentionSpan : getMentionText()) {
            if (mentionSpan.mType == 0) {
                mentionSpan.mStruct.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.mStruct.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.mStruct);
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

    public int getPasteEnd() {
        return this.LJLLLL;
    }

    public int getPasteStart() {
        return this.LJLLL;
    }

    public String getPasteUrl() {
        return this.LJLZ;
    }

    public int getUrlEnd() {
        return this.LJLLJ;
    }

    public int getUrlStart() {
        return this.LJLLILLLL;
    }

    public final boolean LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        setHasUrlTransforming(true);
        int selectionStart = getSelectionStart();
        Editable text = getText();
        if (text == null) {
            return false;
        }
        SpannableString spannableString = new SpannableString(i0.LJFF(str, " "));
        spannableString.setSpan(new C8FY(getContext(), this), spannableString.length() - 1, spannableString.length(), 33);
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableString);
            setUrlStart(0);
            setUrlEnd(spannableString.length() + 1);
            text.append((CharSequence) " ");
            return true;
        }
        int length = text.length();
        if (selectionStart <= length && selectionStart >= 0) {
            int min = Math.min(length, Math.max(0, selectionStart));
            text.insert(min, spannableString);
            setUrlStart(min);
            setUrlEnd(spannableString.length() + min + 1);
            text.insert(Math.min(spannableString.length() + min, text.length()), " ");
        }
        return true;
    }

    public final CharSequence LJIILL(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
            spannableStringBuilder.removeSpan(obj);
        }
        return spannableStringBuilder;
    }

    @Override // X.GSZ, android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLFII;
        if (list != null) {
            list.add(textWatcher);
        }
    }

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new GSV(this, onCreateInputConnection, this);
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
        int min = Math.min(mentionEditText$MentionSavedState.mSelectionEnd, getText().length());
        if (min >= 0) {
            setSelection(min);
        }
        setTextExtraList(mentionEditText$MentionSavedState.mStructs);
    }

    @Override // X.C19K, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InputFilter[] inputFilterArr;
        if (i == 16908322) {
            if (this.LJLLI) {
                return false;
            }
            setAddByPaste(true);
            Editable text = getText();
            if (text == null) {
                return false;
            }
            InputFilter[] filters = getFilters();
            if (filters == null) {
                inputFilterArr = new InputFilter[]{new C41541GSb(this)};
            } else {
                inputFilterArr = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[filters.length] = new C41541GSb(this);
            }
            setFilters(inputFilterArr);
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
            setFilters(filters);
            if (getPasteUrl() != null && getPasteStart() >= 0) {
                setHasUrlTransforming(true);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(getPasteUrl());
                LIZ.append(" ");
                SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ));
                spannableString.setSpan(new C8FY(getContext(), this), spannableString.length() - 1, spannableString.length(), 33);
                text.replace(getPasteStart(), getPasteEnd(), spannableString);
                setUrlStart(getPasteStart());
                setUrlEnd(spannableString.length() + getUrlStart() + 1);
                text.insert(Math.min(spannableString.length() + getPasteStart(), text.length()), " ");
                C41554GSo.LIZJ(this.LJLLILLLL, this.LJLLJ, this, getPasteUrl());
            }
            setPasteUrl(null);
            setPasteStart(-1);
            setPasteEnd(-1);
            return onTextContextMenuItem;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLFII;
        if (list != null && textWatcher != null) {
            ((ArrayList) list).remove(textWatcher);
        }
    }

    public void setAddByPaste(boolean z) {
        this.LJLLLLLL = z;
    }

    public void setAddChainSuccess(boolean z) {
        this.LJZL = z;
    }

    public void setAddVideoChain(boolean z) {
        this.LJZI = z;
    }

    public void setHasUrlTransforming(boolean z) {
        this.LJLLI = z;
    }

    public void setMentionTextColor(int i) {
        this.LJLJL = i;
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LLI = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void setOnMentionInputListener(G9T g9t) {
        this.LLFFF = g9t;
    }

    public void setPasteEnd(int i) {
        this.LJLLLL = i;
    }

    public void setPasteStart(int i) {
        this.LJLLL = i;
    }

    public void setPasteUrl(String str) {
        this.LJLZ = str;
    }

    public void setRepasteUrl(boolean z) {
        this.LL = z;
    }

    public void setRepasteUrlSuccess(boolean z) {
        this.LLD = z;
    }

    public void setShouldDisableTrim(boolean z) {
        this.LLF = z;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable text;
        this.LJLJLJ = false;
        List<C41545GSf> list2 = this.LJLL;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        if (list == null || list.isEmpty() || (text = getText()) == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        int length = text.length();
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 5) {
                if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() >= 0) {
                    MentionSpan mentionSpan = new MentionSpan(text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), this.LJLJL, textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        String awemeId = textExtraStruct.getAwemeId();
                        mentionSpan.awemeId = awemeId;
                        mentionSpan.mStruct.setAwemeId(awemeId);
                    }
                    int subtype = textExtraStruct.getSubtype();
                    mentionSpan.subType = subtype;
                    mentionSpan.mStruct.setSubType(subtype);
                    text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                    ((ArrayList) this.LJLL).add(new C41545GSf(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                }
            }
        }
    }

    public void setTransformingUrlRemoved(boolean z) {
        this.LLFF = z;
    }

    public void setUrlEnd(int i) {
        this.LJLLJ = i;
    }

    public void setUrlStart(int i) {
        this.LJLLILLLL = i;
    }

    public void setVideoPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LJZ = videoPublishEditModel;
    }

    public GSU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLL = -1;
        this.LJLLLL = -1;
        this.LLFII = new ArrayList();
        this.LLFZ = new HashSet();
        this.LJLL = new ArrayList(5);
        this.LJLJL = -65536;
        addTextChangedListener(new C41096GAy(this));
        Context context2 = getContext();
        if (context2 != null && C012403c.LIZ(context2) == 1) {
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
    }

    public final void LJIIIZ(GSX gsx, String str) {
        String uniqueId;
        if (FriendsServiceImpl.LJJJJ().LJIJJ()) {
            uniqueId = gsx.getNickname();
        } else if (C44296Ha0.LIZIZ().booleanValue()) {
            uniqueId = gsx.getNickname();
        } else {
            uniqueId = gsx.getUniqueId();
        }
        String aid = gsx.getAid();
        String userId = gsx.getUserId();
        String secUid = gsx.getSecUid();
        String enterMethod = gsx.getEnterMethod();
        int privateStatus = gsx.getPrivateStatus();
        int isPrivateAccount = gsx.isPrivateAccount();
        if (this.LJLLI || uniqueId == null || uniqueId.isEmpty() || TextUtils.isEmpty(uniqueId) || TextUtils.isEmpty(aid) || TextUtils.isEmpty(userId) || TextUtils.isEmpty(secUid)) {
            return;
        }
        if (getMentionVideoIdList().contains(aid)) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.e5x);
            C78915Uy7.LJJIJ(this, 2015, creativeToastBuilder);
            return;
        }
        if (privateStatus == 1 || privateStatus == 144 || privateStatus == 140) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(R.string.s2i);
            C78915Uy7.LJJIJ(this, 2012, creativeToastBuilder2);
            return;
        }
        int selectionStart = getSelectionStart();
        Editable text = getText();
        if (text == null) {
            return;
        }
        setAddVideoChain(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF("@", uniqueId));
        MentionSpan mentionSpan = new MentionSpan(spannableStringBuilder.toString(), userId, this.LJLJL, 5, " ", secUid);
        mentionSpan.awemeId = aid;
        mentionSpan.mStruct.setAwemeId(aid);
        int subType = gsx.getSubType();
        mentionSpan.subType = subType;
        mentionSpan.mStruct.setSubType(subType);
        spannableStringBuilder.setSpan(mentionSpan, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new C8FD(getContext(), new C41546GSg(this)), 0, spannableStringBuilder.length(), 33);
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableStringBuilder);
            text.append(" ");
            if (this.LJZL) {
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                if (TextUtils.isEmpty(str)) {
                    if (privateStatus == 2 || privateStatus == 143) {
                        creativeToastBuilder3.messageRes(R.string.s2p);
                    } else if (isPrivateAccount == 1) {
                        creativeToastBuilder3.messageRes(R.string.s2t);
                    }
                } else {
                    creativeToastBuilder3.message(str);
                }
                C78915Uy7.LJJIJ(this, 2013, creativeToastBuilder3);
                C41554GSo.LJFF(this.LJZ, enterMethod, privateStatus, isPrivateAccount);
            }
            this.LJZL = false;
            return;
        }
        int length = text.length();
        if (selectionStart > length || selectionStart < 0) {
            return;
        }
        if (selectionStart > 0) {
            int i = selectionStart - 1;
            if (TextUtils.equals(text.subSequence(i, selectionStart), "@")) {
                text.delete(i, selectionStart);
                length--;
                selectionStart = i;
            }
        }
        int min = Math.min(length, Math.max(0, selectionStart));
        text.insert(min, spannableStringBuilder);
        text.insert(Math.min(spannableStringBuilder.length() + min, text.length()), " ");
        if (this.LJZL) {
            CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
            if (TextUtils.isEmpty(str)) {
                if (privateStatus == 2 || privateStatus == 143) {
                    creativeToastBuilder4.messageRes(R.string.s2p);
                } else if (isPrivateAccount == 1) {
                    creativeToastBuilder4.messageRes(R.string.s2t);
                }
            } else {
                creativeToastBuilder4.message(str);
            }
            C78915Uy7.LJJIJ(this, 2013, creativeToastBuilder4);
            this.LJZL = false;
        }
        C41554GSo.LJFF(this.LJZ, enterMethod, privateStatus, isPrivateAccount);
    }

    public final C41545GSf LJIIL(int i, int i2) {
        List<C41545GSf> list = this.LJLL;
        if (list == null) {
            return null;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C41545GSf c41545GSf = (C41545GSf) it.next();
            if (c41545GSf.LIZ(i, i2)) {
                return c41545GSf;
            }
        }
        return null;
    }

    @Override // X.GSZ, android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
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
        C41545GSf c41545GSf = this.LJLJLLL;
        if (c41545GSf != null) {
            int i3 = c41545GSf.LIZ;
            if (i3 != i || c41545GSf.LIZIZ != i2) {
                if (i3 == i2 && c41545GSf.LIZIZ == i) {
                    return;
                }
            } else {
                return;
            }
        }
        C41545GSf LJIIL = LJIIL(i, i2);
        if (LJIIL != null && LJIIL.LIZIZ == i2) {
            this.LJLJLJ = false;
        }
        List<C41545GSf> list = this.LJLL;
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C41545GSf c41545GSf2 = (C41545GSf) it.next();
            int i4 = c41545GSf2.LIZ;
            if ((i > i4 && i < c41545GSf2.LIZIZ) || (i2 > i4 && i2 < c41545GSf2.LIZIZ)) {
                try {
                    if (i == i2) {
                        int i5 = c41545GSf2.LIZ;
                        int i6 = c41545GSf2.LIZIZ;
                        if ((i - i5) - (i6 - i) >= 0) {
                            i5 = i6;
                        }
                        setSelection(i5);
                        return;
                    }
                    int i7 = c41545GSf2.LIZIZ;
                    if (i2 < i7) {
                        setSelection(i, i7);
                    }
                    int i8 = c41545GSf2.LIZ;
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

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new GQC(this);
        }
        if (getText().length() > 0) {
            post(this.LJLJJLL);
        }
    }

    public final boolean LJI(String str, String uid, String str2) {
        int i = 1;
        if (!this.LJLLI) {
            int selectionStart = getSelectionStart();
            Editable text = getText();
            if (text != null) {
                SpannableString spannableString = new SpannableString(i0.LJFF("@", str));
                MentionSpan mentionSpan = new MentionSpan(spannableString.toString(), uid, this.LJLJL, 0, "", str2);
                spannableString.setSpan(mentionSpan, 0, spannableString.length(), 33);
                MentionSpan[] mentionText = getMentionText();
                if (mentionText != null && Arrays.asList(mentionText).contains(mentionSpan)) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.bnk);
                    C78915Uy7.LJJIJ(this, 2011, creativeToastBuilder);
                } else {
                    if (TextUtils.isEmpty(text)) {
                        text.insert(0, spannableString);
                        text.append((CharSequence) " ");
                    } else if (selectionStart <= text.length() && selectionStart >= 0) {
                        if (selectionStart > 0) {
                            int i2 = selectionStart - 1;
                            if (TextUtils.equals(text.subSequence(i2, selectionStart), "@")) {
                                text.delete(i2, selectionStart);
                                selectionStart = i2;
                            }
                        }
                        int min = Math.min(text.length(), Math.max(0, selectionStart));
                        text.insert(min, spannableString);
                        text.insert(Math.min(spannableString.length() + min, text.length()), " ");
                    }
                    o.LJIIIZ(uid, "uid");
                    C145995oB c145995oB = new C145995oB();
                    if (G9Z.LIZ == null) {
                        i = 0;
                    }
                    c145995oB.LIZ(i, "after_post");
                    c145995oB.LJI("to_user_id", uid);
                    G9Z.LIZ(c145995oB);
                    FMX.LJIIL("add_at_friends", c145995oB.LIZ);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        LJIIJJI();
    }

    public final void LJIIJ(String str, boolean z, int i, VideoRelatedInfo videoRelatedInfo, String str2) {
        String uniqueId;
        int i2;
        if (this.LLFF) {
            this.LLFF = false;
            return;
        }
        if (videoRelatedInfo == null) {
            setRepasteUrl(true);
            getText().insert(i, str2);
            if (this.LLD && !TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                if ("timeout".equals(str)) {
                    creativeToastBuilder.messageRes(R.string.s2o);
                } else {
                    creativeToastBuilder.message(str);
                }
                C78915Uy7.LJJIJ(this, 2014, creativeToastBuilder);
                this.LLD = false;
                return;
            }
            return;
        }
        Editable text = getText();
        if (text == null) {
            return;
        }
        setAddVideoChain(true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("@");
        if (FriendsServiceImpl.LJJJJ().LJIJJ()) {
            uniqueId = videoRelatedInfo.getAuthorNickName();
        } else {
            Boolean LIZIZ = C44296Ha0.LIZIZ();
            o.LJIIIIZZ(LIZIZ, "REGION_SERVICE.isInTikTokRegion");
            if (LIZIZ.booleanValue()) {
                uniqueId = videoRelatedInfo.getAuthorNickName();
            } else {
                uniqueId = videoRelatedInfo.getUniqueId();
            }
        }
        LIZ.append(uniqueId);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X1D.LIZIZ(LIZ));
        MentionSpan mentionSpan = new MentionSpan(spannableStringBuilder.toString(), Long.toString(videoRelatedInfo.getAuthorId()), this.LJLJL, 5, " ", videoRelatedInfo.getAuthorSecUid());
        String l = Long.toString(videoRelatedInfo.getAwemeId());
        mentionSpan.awemeId = l;
        mentionSpan.mStruct.setAwemeId(l);
        if (z) {
            i2 = 13;
        } else {
            i2 = 12;
        }
        mentionSpan.subType = i2;
        mentionSpan.mStruct.setSubType(i2);
        spannableStringBuilder.setSpan(mentionSpan, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new C8FD(getContext(), new C41547GSh(this)), 0, spannableStringBuilder.length(), 33);
        String str3 = "paste_long";
        if (i == 0) {
            text.insert(0, spannableStringBuilder);
            text.append(" ");
            if (this.LJZL && !TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.message(str);
                C78915Uy7.LJJIJ(this, 2014, creativeToastBuilder2);
                this.LJZL = false;
            }
            VideoPublishEditModel videoPublishEditModel = this.LJZ;
            if (!z) {
                str3 = "paste_short";
            }
            C41554GSo.LJFF(videoPublishEditModel, str3, videoRelatedInfo.getVideoStatus(), videoRelatedInfo.isPrivateAccount());
            return;
        }
        int length = text.length();
        if (i <= length && i >= 0) {
            int i3 = i - 1;
            if (TextUtils.equals(text.subSequence(i3, i), "@")) {
                text.delete(i3, i);
                length--;
            } else {
                i3 = i;
            }
            int min = Math.min(length, Math.max(0, i3));
            text.insert(min, spannableStringBuilder);
            text.insert(Math.min(spannableStringBuilder.length() + min, text.length()), " ");
            if (this.LJZL && !TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.message(str);
                C78915Uy7.LJJIJ(this, 2014, creativeToastBuilder3);
                this.LJZL = false;
            }
            VideoPublishEditModel videoPublishEditModel2 = this.LJZ;
            if (!z) {
                str3 = "paste_short";
            }
            C41554GSo.LJFF(videoPublishEditModel2, str3, videoRelatedInfo.getVideoStatus(), videoRelatedInfo.isPrivateAccount());
        }
    }
}
