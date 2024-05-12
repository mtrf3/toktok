package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.e1;

/* loaded from: classes8.dex */
public final class HD5 {
    public final ActivityC45651qj LIZ;
    public final InterfaceC65784Pro<InterfaceC83624Wrs> LIZIZ;
    public final InterfaceC65784Pro<I0N> LIZJ;
    public final InterfaceC65784Pro<InterfaceC82086WJm> LIZLLL;
    public final InterfaceC65784Pro<ShortVideoContext> LJ;
    public final InterfaceC65784Pro<WRP> LJFF;
    public final InterfaceC65784Pro<I37> LJI;

    public final HDA LIZ() {
        LifecycleOwner lifecycleOwner = this.LIZIZ.invoke().getLifecycleOwner();
        if (e1.LIZ(31744, "studio_creation_enable_take_photo_optimize", true, false)) {
            return new HD3(this.LIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, lifecycleOwner);
        }
        return new HD4(this.LIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LIZIZ, this.LJFF, this.LJI, lifecycleOwner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HD5(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<? extends InterfaceC83624Wrs> interfaceC65784Pro, InterfaceC65784Pro<? extends I0N> interfaceC65784Pro2, InterfaceC65784Pro<? extends InterfaceC82086WJm> interfaceC65784Pro3, InterfaceC65784Pro<? extends ShortVideoContext> interfaceC65784Pro4, InterfaceC65784Pro<? extends WRP> interfaceC65784Pro5, InterfaceC65784Pro<? extends I37> interfaceC65784Pro6) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = interfaceC65784Pro2;
        this.LIZLLL = interfaceC65784Pro3;
        this.LJ = interfaceC65784Pro4;
        this.LJFF = interfaceC65784Pro5;
        this.LJI = interfaceC65784Pro6;
    }
}
