package X;

/* loaded from: classes16.dex */
public final class YSH implements InterfaceC48221IwD {
    public final YS7 LIZ;
    public final YTJ LIZIZ;

    @Override // X.InterfaceC48221IwD
    public final int getCurrentPosition() {
        YS7 ys7 = this.LIZ;
        if (ys7 != null) {
            return ys7.getCurrentPosition();
        }
        return 0;
    }

    @Override // X.InterfaceC48221IwD
    public final C47160If6 getCurrentVideoInfo() {
        YS7 ys7 = this.LIZ;
        if (ys7 != null) {
            return ys7.getCurrentVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC48221IwD
    public final int getDuration() {
        YS7 ys7 = this.LIZ;
        if (ys7 != null) {
            return ys7.getDuration();
        }
        return 0;
    }

    @Override // X.InterfaceC48221IwD
    public final C46886Iag getPlaybackParams() {
        YS7 ys7 = this.LIZ;
        if (ys7 != null) {
            return ys7.getPlaybackParams();
        }
        return null;
    }

    @Override // X.InterfaceC48221IwD
    public final EnumC47176IfM getResolution() {
        YS7 ys7 = this.LIZ;
        if (ys7 != null) {
            return ys7.getResolution();
        }
        return null;
    }

    @Override // X.InterfaceC48221IwD
    public final boolean isLoop() {
        YS7 ys7 = this.LIZ;
        if (ys7 != null && ys7.isLoop()) {
            return true;
        }
        return false;
    }

    public YSH(YS7 ys7, YTJ ytj) {
        this.LIZ = ys7;
        this.LIZIZ = ytj;
    }
}
