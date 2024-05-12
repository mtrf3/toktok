package X;

import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;

/* renamed from: X.BPh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC28729BPh {
    public static final String LIZ = "com.zhiliao.musically.livewallpaper";
    public static final android.net.Uri LIZIZ;

    static {
        String LJFF = i0.LJFF("com.zhiliao.musically.livewallpaper", ".wallpaperplugincaller");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("content://");
        LIZ2.append(LJFF);
        LIZ2.append("/");
        LIZ2.append("START_WALL_PAPER");
        LIZIZ = UriProtector.parse(X1D.LIZIZ(LIZ2));
    }
}
