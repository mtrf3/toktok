package X;

import Y.AfS61S0100000_9;
import Y.IDuS320S0100000_9;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class MP2 extends C56757MPh {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C56745MOv LJIIJJI;
    public final MP1 LJIIL;
    public MPV LJIILIIL;
    public volatile MP1 LJIILJJIL;
    public volatile MLW LJIILL;
    public final C62822Ol8 LJIILLIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MP2() {
        /*
            r2 = this;
            int r1 = X.C56702MNe.LIZ
            r2.<init>(r1)
            X.MLQ r0 = X.MLQ.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r2.LJIIIZ = r0
            X.MLR r0 = X.MLR.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r2.LJIIJ = r0
            X.MOv r0 = new X.MOv
            r0.<init>()
            r2.LJIIJJI = r0
            X.MP1 r0 = new X.MP1
            r0.<init>(r1)
            r2.LJIIL = r0
            X.MLX r0 = X.MLX.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r2.LJIILLIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP2.<init>():void");
    }

    @Override // X.C56757MPh
    public final boolean LJIIJJI() {
        return LJIIJ(new AqS159S0100000_9(this, 934));
    }

    public final ChangeLiveData<Boolean> LJIILJJIL() {
        return (ChangeLiveData) this.LJIIJ.getValue();
    }

    public final List<MLW> LJIILL() {
        return (List) this.LJIILLIIL.getValue();
    }

    public final boolean LJIJ() {
        MPV mpv = this.LJIILIIL;
        if (mpv == null || mpv.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.C56757MPh
    public final void LIZIZ(MusNotice notice) {
        o.LJIIIZ(notice, "notice");
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            super.LIZIZ(notice);
        } else {
            C221018lt.LIZIZ("NotificationTLModel", "deleteData net unavailable");
            LIZLLL().setValue(new OSZ<>(notice, MQ2.NET_ERR));
        }
    }

    @Override // X.C56757MPh
    public boolean LJIIL(MLW reason) {
        o.LJIIIZ(reason, "reason");
        return LJIJJ(reason);
    }

    public final void LJIILIIL(boolean z) {
        C221018lt.LJFF("NotificationTLModel", "expand start");
        C78999UzT.LJFF(AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, z, 8)).LJJL(T16.LIZ()).LJJJLIIL(new AfS61S0100000_9(this, 70), MPT.LJLIL), LJ());
    }

    public void LJIJI(MLW reason) {
        o.LJIIIZ(reason, "reason");
        if (LJIILL().contains(reason) && reason != MLW.PRELOAD_FORM_CACHE_AND_REFRESH && reason != MLW.FIRST_REFRESH) {
            C68925R3h.LIZ("new_activities");
        }
    }

    public final boolean LJIJJ(MLW reason) {
        o.LJIIIZ(reason, "reason");
        return LJIIJ(new AqS156S0200000_9(reason, this, 90));
    }

    public final synchronized void LJIIZILJ(MLW mlw, boolean z) {
        if (this.LJIIL.LJIILLIIL && LJIJ()) {
            MP1 mp1 = this.LJIIL;
            mp1.LJIILLIIL = false;
            mp1.LIZLLL();
            L08.LIZ(new C59512Vf(0L, "Activities", "middleSourceExpandList"));
        }
        LJIILLIIL(this, mlw, z, false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5 A[Catch: all -> 0x0182, TryCatch #0 {, blocks: (B:10:0x0011, B:12:0x0027, B:14:0x002d, B:16:0x0034, B:18:0x003a, B:21:0x0042, B:24:0x004b, B:29:0x0057, B:31:0x006d, B:33:0x0073, B:34:0x007f, B:36:0x0087, B:38:0x008d, B:40:0x0091, B:41:0x009b, B:43:0x00a5, B:44:0x00a7, B:46:0x00b1, B:47:0x00bc, B:51:0x00fd, B:53:0x0151, B:54:0x0153, B:58:0x016f, B:64:0x00e7, B:65:0x00f2, B:66:0x00f6, B:67:0x002b), top: B:9:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1 A[Catch: all -> 0x0182, TryCatch #0 {, blocks: (B:10:0x0011, B:12:0x0027, B:14:0x002d, B:16:0x0034, B:18:0x003a, B:21:0x0042, B:24:0x004b, B:29:0x0057, B:31:0x006d, B:33:0x0073, B:34:0x007f, B:36:0x0087, B:38:0x008d, B:40:0x0091, B:41:0x009b, B:43:0x00a5, B:44:0x00a7, B:46:0x00b1, B:47:0x00bc, B:51:0x00fd, B:53:0x0151, B:54:0x0153, B:58:0x016f, B:64:0x00e7, B:65:0x00f2, B:66:0x00f6, B:67:0x002b), top: B:9:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151 A[Catch: all -> 0x0182, TryCatch #0 {, blocks: (B:10:0x0011, B:12:0x0027, B:14:0x002d, B:16:0x0034, B:18:0x003a, B:21:0x0042, B:24:0x004b, B:29:0x0057, B:31:0x006d, B:33:0x0073, B:34:0x007f, B:36:0x0087, B:38:0x008d, B:40:0x0091, B:41:0x009b, B:43:0x00a5, B:44:0x00a7, B:46:0x00b1, B:47:0x00bc, B:51:0x00fd, B:53:0x0151, B:54:0x0153, B:58:0x016f, B:64:0x00e7, B:65:0x00f2, B:66:0x00f6, B:67:0x002b), top: B:9:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7 A[Catch: all -> 0x0182, TryCatch #0 {, blocks: (B:10:0x0011, B:12:0x0027, B:14:0x002d, B:16:0x0034, B:18:0x003a, B:21:0x0042, B:24:0x004b, B:29:0x0057, B:31:0x006d, B:33:0x0073, B:34:0x007f, B:36:0x0087, B:38:0x008d, B:40:0x0091, B:41:0x009b, B:43:0x00a5, B:44:0x00a7, B:46:0x00b1, B:47:0x00bc, B:51:0x00fd, B:53:0x0151, B:54:0x0153, B:58:0x016f, B:64:0x00e7, B:65:0x00f2, B:66:0x00f6, B:67:0x002b), top: B:9:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(X.MP2 r14, X.MLW r15, boolean r16, boolean r17, int r18) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP2.LJIILLIIL(X.MP2, X.MLW, boolean, boolean, int):void");
    }
}
