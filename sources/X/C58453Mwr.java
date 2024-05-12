package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.g;

/* renamed from: X.Mwr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58453Mwr extends AbstractC65781Prl implements InterfaceC65784Pro<g> {
    public static final C58453Mwr LJLIL = new C58453Mwr();

    public C58453Mwr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.gson.g, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final g invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        g gVar = C58452Mwq.LIZIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("music_title_icon_priority_config", g.class, gVar);
        if (LJIIIIZZ == 0) {
            return gVar;
        }
        return LJIIIIZZ;
    }
}
