package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.e1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WHs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82040WHs implements InterfaceC83790WuY {
    public final ShortVideoContext LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 160));

    @Override // X.InterfaceC83790WuY
    public final Integer LIZ() {
        int cameraPosition;
        if (!this.LIZIZ && o.LJ(this.LIZLLL.getValue(), Boolean.TRUE)) {
            return 0;
        }
        if (o.LJ(this.LIZLLL.getValue(), Boolean.TRUE)) {
            cameraPosition = this.LIZJ;
        } else {
            cameraPosition = C60903NvH.LJIIJJI().LJJIL().getCameraPosition(1);
        }
        return Integer.valueOf(cameraPosition);
    }

    public C82040WHs(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
        C44172HVg.LJIIJ.getClass();
        if (C1A7.LJIIL().LIZJ("key_first_use_camera", true)) {
            C44172HVg.LJIIJ.getClass();
            C1A7.LJIIL().LJI("key_first_use_camera", false);
            if (e1.LIZ(31744, "rear_camera", true, false)) {
                LIZIZ(0);
            } else {
                LIZIZ(1);
            }
        }
    }

    @Override // X.InterfaceC83790WuY
    public final void LIZIZ(int i) {
        if (o.LJ(this.LIZLLL.getValue(), Boolean.TRUE)) {
            if (!this.LIZIZ) {
                i = 0;
            }
            this.LIZJ = i;
        } else {
            C60903NvH.LJIIJJI().LJJIL().setCameraPosition(i);
        }
        this.LIZIZ = true;
    }
}
