package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.gift.render.model.Effect;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.CoE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32438CoE {
    public int LIZ;
    public Effect LIZJ;
    public C32437CoD LIZLLL;
    public int LJ;
    public C78160Ulw LJFF;
    public List<LynxGiftExtra> LJI;
    public InterfaceC65784Pro<? extends List<? extends ImageModel>> LJIIIZ;
    public boolean LJIIJ;
    public boolean LIZIZ = true;
    public final java.util.Map<String, String> LJII = new LinkedHashMap();
    public final java.util.Map<Class<?>, Object> LJIIIIZZ = new LinkedHashMap();

    public final C32449CoP LIZ() {
        if (this.LIZJ == null && this.LIZLLL == null) {
            return null;
        }
        return new C32449CoP(this);
    }
}
