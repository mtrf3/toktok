package com.vega.nletodraft.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Clip extends F9E {

    @InterfaceC65349Pkn("rotation")
    public final float rotation;

    @InterfaceC65349Pkn("scale")
    public final Scale scale;

    @InterfaceC65349Pkn("transform")
    public final Transform transform;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.rotation), this.scale, this.transform};
    }

    public Clip(float f, Scale scale, Transform transform) {
        o.LJIIIZ(scale, "scale");
        o.LJIIIZ(transform, "transform");
        this.rotation = f;
        this.scale = scale;
        this.transform = transform;
    }
}
