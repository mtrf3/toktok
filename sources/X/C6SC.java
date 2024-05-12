package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.6SC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SC {
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final InterfaceC159886Pg LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    public C6SC(Context context, FrameLayout stickerContainer, InterfaceC159886Pg editProvideStickerService, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(editProvideStickerService, "editProvideStickerService");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = stickerContainer;
        this.LIZJ = editProvideStickerService;
        this.LIZLLL = lifecycleOwner;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 897));
        this.LJFF = C221108m2.LIZIZ(new AqS162S0100000_12(this, LinkMicRtcMixBitrateSetting.DEFAULT));
    }
}
