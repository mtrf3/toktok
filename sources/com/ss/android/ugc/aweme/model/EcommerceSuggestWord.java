package com.ss.android.ugc.aweme.model;

import X.C08880Wm;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcommerceSuggestWord {

    @InterfaceC65349Pkn("ecom_promotion_icon")
    public final EcPromotionIcon ecomPromotionIcon;

    @InterfaceC65349Pkn("face_value_text")
    public final String faceValueText;

    @InterfaceC65349Pkn(alternate = {"group_id"}, value = "id")
    public String id;
    public String implId;

    @InterfaceC65349Pkn("is_show_voucher_icon")
    public final Boolean isShowVoucherIcon;
    public boolean isShowed;

    @InterfaceC65349Pkn("show_word")
    public String showWord;

    @InterfaceC65349Pkn("type_image")
    public com.ss.android.ugc.aweme.base.model.UrlModel typeImage;

    @InterfaceC65349Pkn(alternate = {"words_content"}, value = "word")
    public String word;

    @InterfaceC65349Pkn("words_position")
    public Integer wordPosition;

    @InterfaceC65349Pkn("words_source")
    public String wordSource;

    @InterfaceC65349Pkn("words_type")
    public String wordType;

    /* JADX WARN: Multi-variable type inference failed */
    public EcommerceSuggestWord() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 4095, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EcommerceSuggestWord copy$default(EcommerceSuggestWord ecommerceSuggestWord, String str, String str2, String str3, Integer num, String str4, String str5, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, EcPromotionIcon ecPromotionIcon, Boolean bool, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecommerceSuggestWord.id;
        }
        if ((i & 2) != 0) {
            str2 = ecommerceSuggestWord.word;
        }
        if ((i & 4) != 0) {
            str3 = ecommerceSuggestWord.showWord;
        }
        if ((i & 8) != 0) {
            num = ecommerceSuggestWord.wordPosition;
        }
        if ((i & 16) != 0) {
            str4 = ecommerceSuggestWord.wordSource;
        }
        if ((i & 32) != 0) {
            str5 = ecommerceSuggestWord.wordType;
        }
        if ((i & 64) != 0) {
            urlModel = ecommerceSuggestWord.typeImage;
        }
        if ((i & 128) != 0) {
            ecPromotionIcon = ecommerceSuggestWord.ecomPromotionIcon;
        }
        if ((i & 256) != 0) {
            bool = ecommerceSuggestWord.isShowVoucherIcon;
        }
        if ((i & 512) != 0) {
            str6 = ecommerceSuggestWord.faceValueText;
        }
        if ((i & 1024) != 0) {
            str7 = ecommerceSuggestWord.implId;
        }
        if ((i & 2048) != 0) {
            z = ecommerceSuggestWord.isShowed;
        }
        return ecommerceSuggestWord.copy(str, str2, str3, num, str4, str5, urlModel, ecPromotionIcon, bool, str6, str7, z);
    }

    public final EcommerceSuggestWord copy(String str, String str2, String str3, Integer num, String str4, String str5, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, EcPromotionIcon ecPromotionIcon, Boolean bool, String str6, String str7, boolean z) {
        return new EcommerceSuggestWord(str, str2, str3, num, str4, str5, urlModel, ecPromotionIcon, bool, str6, str7, z);
    }

    public int hashCode() {
        String str = this.word;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EcommerceSuggestWord(id=");
        sb.append(this.id);
        sb.append(", word=");
        sb.append(this.word);
        sb.append(", showWord=");
        sb.append(this.showWord);
        sb.append(", wordPosition=");
        sb.append(this.wordPosition);
        sb.append(", wordSource=");
        sb.append(this.wordSource);
        sb.append(", wordType=");
        sb.append(this.wordType);
        sb.append(", typeImage=");
        sb.append(this.typeImage);
        sb.append(", ecomPromotionIcon=");
        sb.append(this.ecomPromotionIcon);
        sb.append(", isShowVoucherIcon=");
        sb.append(this.isShowVoucherIcon);
        sb.append(", faceValueText=");
        sb.append(this.faceValueText);
        sb.append(", implId=");
        sb.append(this.implId);
        sb.append(", isShowed=");
        return C08880Wm.LIZJ(sb, this.isShowed, ')');
    }

    public final EcPromotionIcon getEcomPromotionIcon() {
        return this.ecomPromotionIcon;
    }

    public final String getFaceValueText() {
        return this.faceValueText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImplId() {
        return this.implId;
    }

    public final String getShowWord() {
        return this.showWord;
    }

    public final com.ss.android.ugc.aweme.base.model.UrlModel getTypeImage() {
        return this.typeImage;
    }

    public final String getWord() {
        return this.word;
    }

    public final Integer getWordPosition() {
        return this.wordPosition;
    }

    public final String getWordSource() {
        return this.wordSource;
    }

    public final String getWordType() {
        return this.wordType;
    }

    public final Boolean isShowVoucherIcon() {
        return this.isShowVoucherIcon;
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
        if (!o.LJ(EcommerceSuggestWord.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.model.EcommerceSuggestWord");
        if (o.LJ(this.word, ((EcommerceSuggestWord) obj).word)) {
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

    public final void setShowWord(String str) {
        this.showWord = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setTypeImage(com.ss.android.ugc.aweme.base.model.UrlModel urlModel) {
        this.typeImage = urlModel;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(Integer num) {
        this.wordPosition = num;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final void setWordType(String str) {
        this.wordType = str;
    }

    public EcommerceSuggestWord(String str, String str2, String str3, Integer num, String str4, String str5, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, EcPromotionIcon ecPromotionIcon, Boolean bool, String str6, String str7, boolean z) {
        this.id = str;
        this.word = str2;
        this.showWord = str3;
        this.wordPosition = num;
        this.wordSource = str4;
        this.wordType = str5;
        this.typeImage = urlModel;
        this.ecomPromotionIcon = ecPromotionIcon;
        this.isShowVoucherIcon = bool;
        this.faceValueText = str6;
        this.implId = str7;
        this.isShowed = z;
    }

    public /* synthetic */ EcommerceSuggestWord(String str, String str2, String str3, Integer num, String str4, String str5, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, EcPromotionIcon ecPromotionIcon, Boolean bool, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : urlModel, (i & 128) != 0 ? null : ecPromotionIcon, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str6, (i & 1024) == 0 ? str7 : null, (i & 2048) == 0 ? z : false);
    }
}
