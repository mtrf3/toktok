package com.ss.android.ugc.aweme.emoji.sysemoji;

import X.C4ZX;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes2.dex */
public final class ImSysEmojiModel extends com.ss.android.ugc.aweme.emoji.model.Emoji {
    public static final C4ZX Companion = new Object() { // from class: X.4ZX
    };
    public int LJLIL;

    @InterfaceC65349Pkn("emoji_list")
    public List<String> emojiList;

    @InterfaceC65349Pkn("mini_support")
    public String miniSupportSysVersion;

    @InterfaceC65349Pkn("preview_emoji")
    public String previewEmoji;

    @InterfaceC65349Pkn("support_skin_type")
    public int supportSkinBusinessType = 1;

    @InterfaceC65349Pkn("business_type")
    public int businessType = 7;

    public final String getPreviewEmoji() {
        String str = this.previewEmoji;
        if (str == null) {
            List<String> list = this.emojiList;
            if (list != null) {
                return (String) ListProtector.get(list, 0);
            }
            return null;
        }
        return str;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }

    public final String getMiniSupportSysVersion() {
        return this.miniSupportSysVersion;
    }

    public final int getPosition() {
        return this.LJLIL;
    }

    public final int getSupportSkinBusinessType() {
        return this.supportSkinBusinessType;
    }

    public final void setBusinessType(int i) {
        this.businessType = i;
    }

    public final void setEmojiList(List<String> list) {
        this.emojiList = list;
    }

    public final void setMiniSupportSysVersion(String str) {
        this.miniSupportSysVersion = str;
    }

    public final void setPosition(int i) {
        this.LJLIL = i;
    }

    public final void setPreviewEmoji(String str) {
        this.previewEmoji = str;
    }

    public final void setSupportSkinBusinessType(int i) {
        this.supportSkinBusinessType = i;
    }
}
