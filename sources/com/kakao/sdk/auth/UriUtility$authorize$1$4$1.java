package com.kakao.sdk.auth;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.kakao.sdk.auth.model.Prompt;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class UriUtility$authorize$1$4$1 extends AbstractC65781Prl implements InterfaceC88472Yns<Prompt, CharSequence> {
    public static final UriUtility$authorize$1$4$1 INSTANCE = new UriUtility$authorize$1$4$1();

    public UriUtility$authorize$1$4$1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Prompt prompt) {
        o.LJIIIZ(prompt, "prompt");
        return prompt.getValue();
    }
}
