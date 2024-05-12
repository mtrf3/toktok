package X;

import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.MzT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58615MzT implements InterfaceC38821FLl {
    public final /* synthetic */ C58618MzW LJLIL;

    public C58615MzT(C58618MzW c58618MzW) {
        this.LJLIL = c58618MzW;
    }

    @Override // X.InterfaceC38821FLl
    public final void change(IESSettingsProxy it) {
        Object LIZ;
        o.LJIIIZ(it, "it");
        C58618MzW c58618MzW = this.LJLIL;
        try {
            UgAwemeActivitySetting awemeActivitySetting = it.getAwemeActivitySetting();
            c58618MzW.getClass();
            if (C58618MzW.LIZIZ(awemeActivitySetting)) {
                if (c58618MzW.LIZ) {
                    return;
                }
                c58618MzW.LIZ = true;
                TiktokShortcutManager.LJIIJ().LJIIIIZZ("setting on ", true);
            } else if (c58618MzW.LIZ) {
                c58618MzW.LIZ = false;
                TiktokShortcutManager.LJIIJ().LJIIIIZZ("setting off ", true);
            } else {
                return;
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }
}
