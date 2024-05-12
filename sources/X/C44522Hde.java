package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Hde, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44522Hde implements InterfaceC44516HdY {
    @Override // X.InterfaceC44516HdY
    public final Integer LIZIZ(int i) {
        if (i <= 720 && 1 <= i) {
            int LJIIIIZZ = C44660Hfs.LJIIIIZZ();
            SettingsManager.LIZLLL().getClass();
            int max = Math.max(SettingsManager.LJ("fast_import_720p_higher_fps_limited", 60), LJIIIIZZ);
            if (C19N.LJ("fast_import_720p_higher_benchmark_enable", false)) {
                return Integer.valueOf(max);
            }
            return Integer.valueOf(LJIIIIZZ);
        }
        return null;
    }

    @Override // X.InterfaceC44516HdY
    public final OSZ<Boolean, OSZ<Integer, Boolean>> LIZ(int i, int i2, int i3, int i4) {
        int LJIIIIZZ = C44660Hfs.LJIIIIZZ();
        SettingsManager.LIZLLL().getClass();
        int max = Math.max(SettingsManager.LJ("fast_import_720p_higher_fps_limited", 60), LJIIIIZZ);
        if (i <= 720 && 1 <= i) {
            if (i3 <= LJIIIIZZ || (LJIIIIZZ + 1 <= i3 && i3 <= max && C19N.LJ("fast_import_720p_higher_benchmark_enable", false))) {
                return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
            }
            return new OSZ<>(Boolean.TRUE, new OSZ(-11005, Boolean.FALSE));
        }
        Boolean bool = Boolean.FALSE;
        return new OSZ<>(bool, new OSZ(-1, bool));
    }
}
