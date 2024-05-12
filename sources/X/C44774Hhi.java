package X;

/* renamed from: X.Hhi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44774Hhi implements InterfaceC44775Hhj {
    public static final C44774Hhi LJIILJJIL = new C44774Hhi();

    static {
        C5Z6.LIZ("FuncSwitchByteBenchApi -> use DefaultApi");
    }

    @Override // X.InterfaceC44775Hhj
    public final boolean enableDefaultOpenHDSwitch() {
        return C19N.LJ("enable_default_open_hd_video_switch", false);
    }

    @Override // X.InterfaceC44775Hhj
    public final boolean enableFastImport1080pHigher() {
        return C19N.LJ("fast_import_1080p_higher_benchmark_enable", false);
    }

    @Override // X.InterfaceC44775Hhj
    public final boolean enableFastImport1080pLower() {
        return C19N.LJ("fast_import_1080p_lower_benchmark_enable", false);
    }

    @Override // X.InterfaceC44775Hhj
    public final boolean enableImportHD() {
        return C19N.LJ("avtools_enable_hd_import_resolution", false);
    }

    @Override // X.InterfaceC44775Hhj
    public final boolean enableRecordHD() {
        return C19N.LJ("avtools_enable_hd_record_resolution", false);
    }

    @Override // X.InterfaceC44775Hhj
    public final boolean showHDButton() {
        return C19N.LJ("enable_high_quality_video", false);
    }
}
