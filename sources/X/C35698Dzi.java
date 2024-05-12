package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.PopupBlockList;

/* renamed from: X.Dzi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35698Dzi {
    public static final C35698Dzi LIZ = new C35698Dzi();

    public static PopupBlockList LIZ() {
        Object LIZ2;
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ2 = (PopupBlockList) SettingsManager.LJII("popup_block_list", PopupBlockList.class);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        return (PopupBlockList) LIZ2;
    }
}
