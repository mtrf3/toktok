package com.ss.android.ugc.aweme.discover.model.suggest;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Word implements Serializable {

    @InterfaceC65349Pkn(alternate = {"group_id"}, value = "id")
    public String id;
    public String implId;
    public boolean isShowed;

    @InterfaceC65349Pkn("show_position")
    public String showPosition;

    @InterfaceC65349Pkn("show_word")
    public String showWord;

    @InterfaceC65349Pkn("type_image")
    public UrlModel typeImage;

    @InterfaceC65349Pkn(alternate = {"words_content"}, value = "word")
    public String word;

    @InterfaceC65349Pkn("words_position")
    public int wordPosition;

    @InterfaceC65349Pkn("words_source")
    public String wordSource;

    @InterfaceC65349Pkn("words_type")
    public String wordType;

    public int hashCode() {
        String str = this.word;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public Word() {
    }

    public final String getId() {
        return this.id;
    }

    public final String getImplId() {
        return this.implId;
    }

    public final String getShowPosition() {
        return this.showPosition;
    }

    public final String getShowWord() {
        return this.showWord;
    }

    public final UrlModel getTypeImage() {
        return this.typeImage;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordPosition() {
        return this.wordPosition;
    }

    public final String getWordSource() {
        return this.wordSource;
    }

    public final String getWordType() {
        return this.wordType;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(Word.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.Word");
        if (o.LJ(this.word, ((Word) obj).word)) {
            return true;
        }
        return false;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImplId(String str) {
        this.implId = str;
    }

    public final void setShowPosition(String str) {
        this.showPosition = str;
    }

    public final void setShowWord(String str) {
        this.showWord = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setTypeImage(UrlModel urlModel) {
        this.typeImage = urlModel;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(int i) {
        this.wordPosition = i;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final void setWordType(String str) {
        this.wordType = str;
    }

    public Word(String str, String str2) {
        this.id = str;
        this.word = str2;
    }
}
