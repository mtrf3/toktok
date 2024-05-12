package com.ss.android.ugc.aweme.sticker.bean;

import X.OSZ;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TemplateStickerState {
    public MutableLiveData<OSZ<String, View>> clickEvent;
    public MutableLiveData<String> showEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateStickerState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final MutableLiveData<OSZ<String, View>> getClickEvent() {
        return this.clickEvent;
    }

    public final MutableLiveData<String> getShowEvent() {
        return this.showEvent;
    }

    public final void setClickEvent(MutableLiveData<OSZ<String, View>> mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<set-?>");
        this.clickEvent = mutableLiveData;
    }

    public final void setShowEvent(MutableLiveData<String> mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<set-?>");
        this.showEvent = mutableLiveData;
    }

    public TemplateStickerState(MutableLiveData<OSZ<String, View>> clickEvent, MutableLiveData<String> showEvent) {
        o.LJIIIZ(clickEvent, "clickEvent");
        o.LJIIIZ(showEvent, "showEvent");
        this.clickEvent = clickEvent;
        this.showEvent = showEvent;
    }

    public /* synthetic */ TemplateStickerState(MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MutableLiveData() : mutableLiveData, (i & 2) != 0 ? new MutableLiveData() : mutableLiveData2);
    }
}
