package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.g;

/* renamed from: X.Mwj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58445Mwj extends AbstractC65781Prl implements InterfaceC65784Pro<g> {
    public static final C58445Mwj LJLIL = new C58445Mwj();

    public C58445Mwj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.gson.g, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final g invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        g gVar = C58444Mwi.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("mdp_music_button_priority_config", g.class, gVar);
        if (LJIIIIZZ == 0) {
            return gVar;
        }
        return LJIIIIZZ;
    }
}
