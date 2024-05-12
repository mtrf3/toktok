package com.bytedance.android.livesdk.model.message;

import X.EnumC31519CYp;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class RankAnimationInfo {
    public int backgroundColor;
    public String backgroundColorString;
    public String content;
    public Text contentText;
    public long duration;
    public int type = EnumC31519CYp.NONE.getType();

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setContent(String str) {
        this.content = str;
    }
}
