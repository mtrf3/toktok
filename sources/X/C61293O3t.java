package X;

import com.bytedance.forest.Forest;
import java.io.InputStream;

/* renamed from: X.O3t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61293O3t implements InterfaceC61315O4p {
    public final /* synthetic */ String LIZ;

    @Override // X.InterfaceC61315O4p
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC61315O4p
    public final InputStream LIZ() {
        try {
            return Forest.Companion.getApp().getAssets().open(this.LIZ);
        } catch (Exception e) {
            C39930Flm.LIZJ("ForestBuffer", "error occurs when getting input stream from builtin", e, true);
            return null;
        }
    }

    public C61293O3t(String str) {
        this.LIZ = str;
    }
}
