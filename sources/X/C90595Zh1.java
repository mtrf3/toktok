package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import androidx.mediarouter.media.MediaRouteProviderService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: X.Zh1, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90595Zh1 implements ZXU {
    public final MediaRouteProviderService LIZ;
    public final ArrayList<ZXV> LIZIZ = new ArrayList<>();
    public C90524Zfs LIZJ;
    public C90524Zfs LIZLLL;

    @Override // X.ZXU
    public void LIZ(Context context) {
    }

    public final boolean LJI() {
        C90100ZXs c90100ZXs;
        boolean z;
        C90524Zfs c90524Zfs = this.LIZLLL;
        C90524Zfs c90524Zfs2 = null;
        if (c90524Zfs != null) {
            z = c90524Zfs.LIZIZ();
            C90524Zfs c90524Zfs3 = this.LIZLLL;
            c90524Zfs3.LIZ();
            c90100ZXs = new C90100ZXs(c90524Zfs3.LIZIZ);
        } else {
            c90100ZXs = null;
            z = false;
        }
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            C90524Zfs c90524Zfs4 = ((ZXV) ListProtector.get(this.LIZIZ, i)).LJLJJI;
            if (c90524Zfs4 != null) {
                c90524Zfs4.LIZ();
                if (!c90524Zfs4.LIZIZ.LIZJ() || c90524Zfs4.LIZIZ()) {
                    z |= c90524Zfs4.LIZIZ();
                    if (c90100ZXs == null) {
                        c90524Zfs4.LIZ();
                        c90100ZXs = new C90100ZXs(c90524Zfs4.LIZIZ);
                    } else {
                        c90524Zfs4.LIZ();
                        c90100ZXs.LIZIZ(c90524Zfs4.LIZIZ);
                    }
                }
            }
        }
        if (c90100ZXs != null) {
            c90524Zfs2 = new C90524Zfs(c90100ZXs.LIZJ(), z);
        }
        if (Objects.equals(this.LIZJ, c90524Zfs2)) {
            return false;
        }
        this.LIZJ = c90524Zfs2;
        this.LIZ.LJLJJI.LJIILLIIL(c90524Zfs2);
        return true;
    }

    public C90595Zh1(MediaRouteProviderService mediaRouteProviderService) {
        this.LIZ = mediaRouteProviderService;
    }

    @Override // X.ZXU
    public IBinder LIZIZ(Intent intent) {
        if (intent.getAction().equals("android.media.MediaRouteProviderService")) {
            this.LIZ.LIZIZ();
            MediaRouteProviderService mediaRouteProviderService = this.LIZ;
            if (mediaRouteProviderService.LJLJJI != null) {
                return mediaRouteProviderService.LJLIL.getBinder();
            }
            return null;
        }
        return null;
    }

    public final int LIZLLL(Messenger messenger) {
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            if (((ZXV) ListProtector.get(this.LIZIZ, i)).LJLIL.getBinder() == messenger.getBinder()) {
                return i;
            }
        }
        return -1;
    }

    public final ZXV LJ(Messenger messenger) {
        int LIZLLL = LIZLLL(messenger);
        if (LIZLLL >= 0) {
            return (ZXV) ListProtector.get(this.LIZIZ, LIZLLL);
        }
        return null;
    }

    public void LJFF(C90099ZXr c90099ZXr) {
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            ZXV zxv = (ZXV) ListProtector.get(this.LIZIZ, i);
            MediaRouteProviderService.LJ(zxv.LJLIL, 5, 0, 0, zxv.LIZ(c90099ZXr), null);
        }
    }

    public ZXV LIZJ(Messenger messenger, int i, String str) {
        return new ZXV(this, messenger, i, str);
    }
}
