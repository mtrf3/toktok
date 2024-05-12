package com.bytedance.touchpoint.core.model;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Animation extends F9E {
    public String LJLIL;

    @InterfaceC65349Pkn("cover_image")
    public String coverImage;

    @InterfaceC65349Pkn("end_frame")
    public int endFrame;

    @InterfaceC65349Pkn("lottie")
    public String lottie;

    @InterfaceC65349Pkn("lottie_md5")
    public String lottieMd5;

    @InterfaceC65349Pkn("transition_frame")
    public int transitionFrame;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.lottie, this.lottieMd5, Integer.valueOf(this.transitionFrame), Integer.valueOf(this.endFrame), this.coverImage, this.LJLIL};
    }

    public Animation(String str, String str2, int i, int i2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "lottie", str2, "lottieMd5", str3, "coverImage", str4, "lottieLocalPath");
        this.lottie = str;
        this.lottieMd5 = str2;
        this.transitionFrame = i;
        this.endFrame = i2;
        this.coverImage = str3;
        this.LJLIL = str4;
    }

    public /* synthetic */ Animation(String str, String str2, int i, int i2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, i, i2, str3, (i3 & 32) == 0 ? str4 : "");
    }
}
