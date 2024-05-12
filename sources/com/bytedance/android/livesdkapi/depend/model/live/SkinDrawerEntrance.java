package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SkinDrawerEntrance extends F9E {

    @InterfaceC65349Pkn("cover")
    public ImageModel cover;

    @InterfaceC65349Pkn("style")
    public long style;

    /* JADX WARN: Multi-variable type inference failed */
    public SkinDrawerEntrance() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SkinDrawerEntrance copy$default(SkinDrawerEntrance skinDrawerEntrance, ImageModel imageModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            imageModel = skinDrawerEntrance.cover;
        }
        if ((i & 2) != 0) {
            j = skinDrawerEntrance.style;
        }
        return skinDrawerEntrance.copy(imageModel, j);
    }

    public final ImageModel component1() {
        return this.cover;
    }

    public final long component2() {
        return this.style;
    }

    public final SkinDrawerEntrance copy(ImageModel imageModel, long j) {
        return new SkinDrawerEntrance(imageModel, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.cover, Long.valueOf(this.style)};
    }

    public SkinDrawerEntrance(ImageModel imageModel, long j) {
        this.cover = imageModel;
        this.style = j;
    }

    public /* synthetic */ SkinDrawerEntrance(ImageModel imageModel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageModel, (i & 2) != 0 ? 0L : j);
    }
}
