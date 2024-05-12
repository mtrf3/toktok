package com.ss.android.ugc.aweme.im.message.template.card;

import X.C64537PUn;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;

/* loaded from: classes2.dex */
public interface BaseTemplate extends Parcelable {
    BaseResponseComponent LLILLJJLI();

    BaseRequestComponent LLLL();

    BaseTemplate LLLLZLLLI(PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent);

    PreviewHintComponent LLZLL();

    C64537PUn encode();

    int getMessageType();
}
