package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Hdd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44521Hdd implements InterfaceC44516HdY {
    @Override // X.InterfaceC44516HdY
    public final Integer LIZIZ(int i) {
        if (i <= 1080 && 721 <= i) {
            int LJIIIIZZ = C44660Hfs.LJIIIIZZ();
            SettingsManager.LIZLLL().getClass();
            int max = Math.max(SettingsManager.LJ("fast_import_720p_higher_fps_limited", 60), LJIIIIZZ);
            if (C44660Hfs.LIZLLL()) {
                return Integer.valueOf(LJIIIIZZ);
            }
            if (C44660Hfs.LIZJ()) {
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
        int max = Math.max(SettingsManager.LJ("fast_import_1080p_higher_fps_limited", 60), LJIIIIZZ);
        boolean LIZ = C145805ns.LIZ();
        if (i <= 1080 && 721 <= i) {
            if (i3 <= LJIIIIZZ && C44660Hfs.LIZLLL()) {
                return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
            }
            if (LJIIIIZZ + 1 <= i3 && i3 <= max && C44660Hfs.LIZJ()) {
                return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
            }
            if (i3 <= LJIIIIZZ && LIZ) {
                return new OSZ<>(Boolean.TRUE, new OSZ(0, Boolean.FALSE));
            }
            return new OSZ<>(Boolean.TRUE, new OSZ(-11005, Boolean.FALSE));
        }
        Boolean bool = Boolean.FALSE;
        return new OSZ<>(bool, new OSZ(-1, bool));
    }
}
