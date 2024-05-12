package com.bytedance.effectcreatormobile.ckeapi.api.text;

import X.V0N;

/* loaded from: classes34.dex */
public enum TextStyle {
    None,
    TextColor,
    TextBgColor,
    TextAlphaBgColor,
    TextStrokeColor;

    public static TextStyle valueOf(String str) {
        return (TextStyle) V0N.LJJJ(TextStyle.class, str);
    }
}
