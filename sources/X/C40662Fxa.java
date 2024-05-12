package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.assetpacks.l0;
import com.google.android.play.core.assetpacks.q0;
import com.google.android.play.core.assetpacks.y;
import java.util.HashMap;

/* renamed from: X.Fxa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40662Fxa implements InterfaceC153055zZ {
    public final Object LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;
    public final Object LJLJJI;

    public /* synthetic */ C40662Fxa(InterfaceC153055zZ interfaceC153055zZ, C40632Fx6 c40632Fx6, C40632Fx6 c40632Fx62, InterfaceC153055zZ interfaceC153055zZ2) {
        this.LJLIL = interfaceC153055zZ;
        this.LJLILLLLZI = c40632Fx6;
        this.LJLJI = c40632Fx62;
        this.LJLJJI = interfaceC153055zZ2;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        Object a = ((InterfaceC153055zZ) this.LJLIL).a();
        return new l0((y) a, (q0) ((InterfaceC153055zZ) this.LJLJJI).a(), C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLILLLLZI), C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLJI));
    }

    public C40662Fxa(Object obj) {
        Class<?> cls = obj.getClass();
        this.LJLILLLLZI = "tt_live_sdk";
        this.LJLIL = "has_play_gift_failure_on_mediaplayer";
        this.LJLJI = obj;
        this.LJLJJI = cls;
    }

    public final void LIZ(Object obj) {
        if (obj == null) {
            ((HashMap) C40663Fxb.LIZIZ).remove(this.LJLIL);
            C40663Fxb.LIZ().edit().remove((String) this.LJLIL).apply();
            return;
        }
        ((HashMap) C40663Fxb.LIZIZ).put(this.LJLIL, obj);
        Object obj2 = this.LJLJJI;
        if (obj2 == Boolean.class) {
            C40663Fxb.LIZ().edit().putBoolean((String) this.LJLIL, ((Boolean) obj).booleanValue()).apply();
            return;
        }
        if (obj2 == Integer.class) {
            C40663Fxb.LIZ().edit().putInt((String) this.LJLIL, ((Integer) obj).intValue()).apply();
            return;
        }
        if (obj2 == Float.class) {
            C40663Fxb.LIZ().edit().putFloat((String) this.LJLIL, ((Float) obj).floatValue()).apply();
            return;
        }
        if (obj2 == Long.class) {
            C40663Fxb.LIZ().edit().putLong((String) this.LJLIL, ((Long) obj).longValue()).apply();
            return;
        }
        if (obj2 == Double.class) {
            C40663Fxb.LIZ().edit().putString((String) this.LJLIL, obj.toString()).apply();
        } else if (obj2 == String.class) {
            C40663Fxb.LIZ().edit().putString((String) this.LJLIL, (String) obj).apply();
        } else {
            C40663Fxb.LIZ().edit().putString((String) this.LJLIL, GsonProtectorUtils.toJson(C40663Fxb.LIZJ, obj)).apply();
        }
    }
}
