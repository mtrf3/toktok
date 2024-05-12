package X;

/* renamed from: X.Kod, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52847Kod implements IFK {
    public static final C52847Kod LIZ = new C52847Kod();

    @Override // X.IFK
    public final int LIZ() {
        if (C35686DzW.LIZ("ITabletDropHelper.getFeedCacheExpireTime")) {
            return 0;
        }
        return ((Number) C52848Koe.LIZ.getValue()).intValue();
    }

    @Override // X.IFK
    public final boolean LIZJ() {
        if (C35686DzW.LIZ("ITabletDropHelper.needDropProgressBar") || !E1F.LIZIZ() || !LEP.LIZ(null) || !C52356Kgi.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.IFK
    public final boolean LJI() {
        if (C35686DzW.LIZ("ITabletDropHelper.needDropMusicAnimation") || !E1F.LIZIZ() || !LEP.LIZ(null) || !C52356Kgi.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.IFK
    public final boolean LJII() {
        if (C35686DzW.LIZ("ITabletDropHelper.needDropDynamicCover") || !E1F.LIZIZ() || !LEP.LIZ(null) || !C52356Kgi.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.IFK
    public final boolean LJIIIIZZ() {
        if (C35686DzW.LIZ("ITabletDropHelper.needDropHeadImageAnimation") || !E1F.LIZIZ() || !LEP.LIZ(null) || !C52356Kgi.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.IFK
    public final int LJIIIZ() {
        if (C35686DzW.LIZ("ITabletDropHelper.progressBarInterval")) {
            return 0;
        }
        if (LIZJ()) {
            return 600;
        }
        return 300;
    }

    @Override // X.IFK
    public final int LIZIZ(int i) {
        if (C35686DzW.LIZ("ITabletDropHelper.openTTOnMute")) {
            return i;
        }
        return ((Number) C52854Kok.LIZ.getValue()).intValue();
    }

    @Override // X.IFK
    public final int LIZLLL(int i) {
        if (C35686DzW.LIZ("ITabletDropHelper.getVideoCacheMaxSize")) {
            return i;
        }
        if (!((Boolean) C52352Kge.LIZ.getValue()).booleanValue()) {
            return i;
        }
        int intValue = ((Number) C52846Koc.LIZ.getValue()).intValue();
        if (intValue != 0) {
            return intValue;
        }
        return i;
    }

    @Override // X.IFK
    public final int LJ(int i) {
        if (C35686DzW.LIZ("ITabletDropHelper.loadMoreTriggerCountValue")) {
            return i;
        }
        if (((Number) C52850Kog.LIZ.getValue()).intValue() == 0) {
            return 3;
        }
        return i;
    }

    @Override // X.IFK
    public final int LJFF(int i) {
        if (C35686DzW.LIZ("ITabletDropHelper.playbackSpeedValue")) {
            return i;
        }
        return ((Number) C52852Koi.LIZ.getValue()).intValue();
    }

    @Override // X.IFK
    public final int LJIIJ(int i) {
        if (C35686DzW.LIZ("ITabletDropHelper.loadMoreTimingOptValue")) {
            return i;
        }
        return ((Number) C52850Kog.LIZ.getValue()).intValue();
    }

    @Override // X.IFK
    public final int LJIIJJI(int i) {
        if (C35686DzW.LIZ("ITabletDropHelper.openTTOnMuteV2")) {
            return i;
        }
        return 0;
    }

    @Override // X.IFK
    public final boolean LJIIL(boolean z) {
        if (C35686DzW.LIZ("ITabletDropHelper.enableAutoVolumeAdjustment")) {
            return z;
        }
        return ((Boolean) C52354Kgg.LIZ.getValue()).booleanValue();
    }
}
