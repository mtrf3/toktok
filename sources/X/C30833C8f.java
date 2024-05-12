package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import kotlin.jvm.internal.o;

/* renamed from: X.C8f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30833C8f {
    public static C30833C8f LIZJ;
    public final Context LIZ = C15380j0.LIZLLL();
    public boolean LIZIZ;

    public static C30833C8f LIZIZ() {
        if (LIZJ == null) {
            synchronized (C30833C8f.class) {
                if (LIZJ == null) {
                    LIZJ = new C30833C8f();
                }
            }
        }
        return LIZJ;
    }

    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        EnumC30836C8i.LiveResource.preload();
        EnumC31814CeA.INST.loadResources();
        String[] strArr = {"yuv", "NailSLAM_jni", "ttffmpeg", "c++_shared", "audioeffect", "effect", "ttlivestreamercore", "ies_render"};
        Object value = C7N.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-hostPlugin>(...)");
        IHostPlugin iHostPlugin = (IHostPlugin) value;
        int i = 0;
        do {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start load library:");
                LIZ.append(strArr[i]);
                C0NB.LJ("LiveBroadcastContext", X1D.LIZIZ(LIZ));
                IHostPlugin.Companion.getClass();
                iHostPlugin.loadLibrary(2, this.LIZ, null, strArr[i], C30833C8f.class.getClassLoader());
            } catch (Throwable unused) {
            }
            i++;
        } while (i < 8);
        AbstractC73672Svk.LJJIJIL(1);
        try {
            EnumC30836C8i.LiveResource.load(this.LIZ, false);
        } catch (Throwable unused2) {
        }
        this.LIZIZ = true;
    }
}
