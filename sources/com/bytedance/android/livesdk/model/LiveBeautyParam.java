package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class LiveBeautyParam {

    @InterfaceC65349Pkn("brightening")
    public Param brightening = new Param(1.0f, 0.35f);

    @InterfaceC65349Pkn("beauty_skin")
    public Param beauty = new Param(1.0f, 0.35f);

    @InterfaceC65349Pkn("big_eyes")
    public Param bigEyes = new Param(1.0f, 0.5f);

    @InterfaceC65349Pkn("face_lift")
    public Param lift = new Param(1.0f, 0.5f);

    @InterfaceC65349Pkn("sharp")
    public Param sharp = new Param(1.0f, 0.05f);

    /* loaded from: classes6.dex */
    public static class Param {

        @InterfaceC65349Pkn("default")
        public float def;

        @InterfaceC65349Pkn("scale")
        public float scale;

        public Param() {
        }

        public Param(float f, float f2) {
            this.scale = f;
            this.def = f2;
        }
    }
}
