package com.ss.android.ugc.aweme.shortvideo.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutogeneratedCaptionLanguageSelection extends F9E {

    @InterfaceC65349Pkn("code")
    public String code;

    @InterfaceC65349Pkn("localName")
    public String localName;

    /* JADX WARN: Multi-variable type inference failed */
    public AutogeneratedCaptionLanguageSelection() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AutogeneratedCaptionLanguageSelection copy$default(AutogeneratedCaptionLanguageSelection autogeneratedCaptionLanguageSelection, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autogeneratedCaptionLanguageSelection.code;
        }
        if ((i & 2) != 0) {
            str2 = autogeneratedCaptionLanguageSelection.localName;
        }
        return autogeneratedCaptionLanguageSelection.copy(str, str2);
    }

    public final AutogeneratedCaptionLanguageSelection copy(String code, String localName) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(localName, "localName");
        return new AutogeneratedCaptionLanguageSelection(code, localName);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.code, this.localName};
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLocalName() {
        return this.localName;
    }

    public final void setCode(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.code = str;
    }

    public final void setLocalName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.localName = str;
    }

    public AutogeneratedCaptionLanguageSelection(String code, String localName) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(localName, "localName");
        this.code = code;
        this.localName = localName;
    }

    public /* synthetic */ AutogeneratedCaptionLanguageSelection(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}