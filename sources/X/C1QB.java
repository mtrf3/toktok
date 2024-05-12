package X;

import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;

/* renamed from: X.1QB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QB extends C11030bz {
    public String LIZIZ;

    public C1QB() {
        super(0);
    }

    public final void LJJIIZI() {
        if (this.LIZ != null) {
            if (LiveEffectDowngradeSetting.INSTANCE.remove()) {
                ((IFilterManager) this.LIZ).enable(false);
            }
            ((IFilterManager) this.LIZ).setFilter(null, 1.0f);
        }
    }

    public final void LJJIJ(float f, String str) {
        this.LIZIZ = str;
        if (this.LIZ != null) {
            if (LiveEffectDowngradeSetting.INSTANCE.remove()) {
                ((IFilterManager) this.LIZ).enable(true);
            }
            ((IFilterManager) this.LIZ).setFilter(this.LIZIZ, f);
        }
    }
}
