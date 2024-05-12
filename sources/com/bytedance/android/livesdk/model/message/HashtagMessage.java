package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Hashtag;

/* loaded from: classes6.dex */
public class HashtagMessage extends CR6 {

    @InterfaceC65349Pkn("hashtag")
    public Hashtag hashtag;

    public HashtagMessage() {
        this.type = EnumC31509CYf.HASHTAG;
    }
}
