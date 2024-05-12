package com.kakao.sdk.auth;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.kakao.sdk.auth.model.Prompt;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthCodeClient$authorizeWithKakaoTalk$1$5$1 extends AbstractC65781Prl implements InterfaceC88472Yns<Prompt, CharSequence> {
    public static final AuthCodeClient$authorizeWithKakaoTalk$1$5$1 INSTANCE = new AuthCodeClient$authorizeWithKakaoTalk$1$5$1();

    public AuthCodeClient$authorizeWithKakaoTalk$1$5$1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Prompt prompt) {
        o.LJIIIZ(prompt, "prompt");
        return prompt.getValue();
    }
}
