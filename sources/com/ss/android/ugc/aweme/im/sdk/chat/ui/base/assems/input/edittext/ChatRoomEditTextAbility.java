package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext;

import X.C105454Bx;
import X.C2K0;
import X.C32V;
import X.C4B8;
import X.EnumC105154At;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes2.dex */
public interface ChatRoomEditTextAbility extends C2K0 {
    void BN(TextWatcher textWatcher);

    void LLLZLZ(C105454Bx c105454Bx);

    void T0(C32V c32v, C4B8 c4b8);

    void Uc0(TextWatcher textWatcher);

    void YR();

    void av0(String str);

    void dispatchKeyEvent(KeyEvent keyEvent);

    EditText getEditText();

    void hN();

    void n9();

    void tr(EnumC105154At enumC105154At);

    void wT();
}
