package X;

import java.util.Map;

/* loaded from: classes16.dex */
public final class YJ6 extends YJ7<Object> {
    @Override // X.YJ7
    public final int LIZ(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // X.YJ7
    public final void LIZIZ(Map.Entry entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // X.YJ7
    public final boolean LIZJ(YIZ yiz) {
        return yiz instanceof YIW;
    }

    @Override // X.YJ7
    public final C87165YIv<Object> LIZLLL(Object obj) {
        return ((YIW) obj).zzfzg;
    }

    @Override // X.YJ7
    public final C87165YIv<Object> LJ(Object obj) {
        YIW yiw = (YIW) obj;
        C87165YIv<Object> c87165YIv = yiw.zzfzg;
        if (c87165YIv.LIZIZ) {
            yiw.zzfzg = (C87165YIv) c87165YIv.clone();
        }
        return yiw.zzfzg;
    }

    @Override // X.YJ7
    public final void LJFF(YIO yio) {
        C87165YIv<Object> c87165YIv = ((YIW) yio).zzfzg;
        if (c87165YIv.LIZIZ) {
            return;
        }
        c87165YIv.LIZ.LIZJ();
        c87165YIv.LIZIZ = true;
    }
}
