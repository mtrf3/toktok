package com.bytedance.android.live.effect.api.soundeffect;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SoundEffect {
    public int LIZ;

    @InterfaceC65349Pkn("icon")
    public ImageModel iconUrl;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("name")
    public String name = "";

    @InterfaceC65349Pkn("eng_name")
    public String nameEn = "";

    @InterfaceC65349Pkn("url")
    public ImageModel resourceUrl;

    @InterfaceC65349Pkn("version")
    public long version;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.id);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(SoundEffect.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.effect.api.soundeffect.SoundEffect");
        if (this.id == ((SoundEffect) obj).id) {
            return true;
        }
        return false;
    }
}
