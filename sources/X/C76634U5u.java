package X;

import android.util.Property;
import kotlin.jvm.internal.o;

/* renamed from: X.U5u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76634U5u extends Property<C76633U5t, Integer> {
    public final /* synthetic */ C76633U5t LIZ;

    @Override // android.util.Property
    public final Integer get(C76633U5t c76633U5t) {
        C76633U5t micSoundEffectView = c76633U5t;
        o.LJIIIZ(micSoundEffectView, "micSoundEffectView");
        return Integer.valueOf(micSoundEffectView.LJZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76634U5u(C76633U5t c76633U5t, Class<Integer> cls) {
        super(cls, "currentVolumeLevel");
        this.LIZ = c76633U5t;
    }

    @Override // android.util.Property
    public final void set(C76633U5t c76633U5t, Integer num) {
        C76633U5t micSoundEffectView = c76633U5t;
        int intValue = num.intValue();
        o.LJIIIZ(micSoundEffectView, "micSoundEffectView");
        micSoundEffectView.LJZ = intValue;
        this.LIZ.postInvalidate();
    }
}
