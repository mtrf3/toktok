package X;

import android.view.Surface;
import android.view.TextureView;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.Wuk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83802Wuk {
    public final LinkedList<InterfaceC83803Wul> LIZ = new LinkedList<>();
    public Surface LIZIZ;
    public boolean LIZJ;
    public final InterfaceC65784Pro<TextureView> LIZLLL;

    public C83802Wuk(AqS164S0100000_14 aqS164S0100000_14) {
        this.LIZLLL = aqS164S0100000_14;
        ((TextureView) aqS164S0100000_14.invoke()).setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC83800Wui(this));
        this.LIZJ = false;
    }
}
