package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$fetchSongList$2", f = "KaraokeViewModel.kt", l = {668, 671, 676, 679, 681, 683, 695, 702}, m = "invokeSuspend")
/* renamed from: X.2Bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54442Bs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C0EY LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ KaraokeViewModel LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54442Bs(boolean z, KaraokeViewModel karaokeViewModel, long j, boolean z2, InterfaceC67352kd<? super C54442Bs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = z;
        this.LJLJJI = karaokeViewModel;
        this.LJLJJL = j;
        this.LJLJJLL = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54442Bs(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e6 A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:8:0x00df, B:9:0x00e2, B:11:0x00e6, B:14:0x00ec, B:15:0x00ee, B:17:0x00fd, B:20:0x0117, B:22:0x011b, B:25:0x01b3, B:29:0x012e, B:31:0x0136, B:34:0x0149, B:36:0x014f, B:38:0x0159, B:39:0x0183, B:41:0x0199, B:43:0x019d, B:48:0x0108, B:49:0x010d, B:51:0x009b, B:52:0x009e, B:54:0x00a2, B:57:0x00a8, B:60:0x00ba, B:62:0x00ca, B:66:0x0073, B:67:0x0076, B:69:0x0082, B:71:0x0086, B:75:0x0021, B:77:0x0025, B:78:0x0033, B:80:0x0040, B:82:0x0044, B:86:0x0051, B:88:0x005b, B:90:0x0061, B:94:0x0114, B:95:0x01b0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:8:0x00df, B:9:0x00e2, B:11:0x00e6, B:14:0x00ec, B:15:0x00ee, B:17:0x00fd, B:20:0x0117, B:22:0x011b, B:25:0x01b3, B:29:0x012e, B:31:0x0136, B:34:0x0149, B:36:0x014f, B:38:0x0159, B:39:0x0183, B:41:0x0199, B:43:0x019d, B:48:0x0108, B:49:0x010d, B:51:0x009b, B:52:0x009e, B:54:0x00a2, B:57:0x00a8, B:60:0x00ba, B:62:0x00ca, B:66:0x0073, B:67:0x0076, B:69:0x0082, B:71:0x0086, B:75:0x0021, B:77:0x0025, B:78:0x0033, B:80:0x0040, B:82:0x0044, B:86:0x0051, B:88:0x005b, B:90:0x0061, B:94:0x0114, B:95:0x01b0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:8:0x00df, B:9:0x00e2, B:11:0x00e6, B:14:0x00ec, B:15:0x00ee, B:17:0x00fd, B:20:0x0117, B:22:0x011b, B:25:0x01b3, B:29:0x012e, B:31:0x0136, B:34:0x0149, B:36:0x014f, B:38:0x0159, B:39:0x0183, B:41:0x0199, B:43:0x019d, B:48:0x0108, B:49:0x010d, B:51:0x009b, B:52:0x009e, B:54:0x00a2, B:57:0x00a8, B:60:0x00ba, B:62:0x00ca, B:66:0x0073, B:67:0x0076, B:69:0x0082, B:71:0x0086, B:75:0x0021, B:77:0x0025, B:78:0x0033, B:80:0x0040, B:82:0x0044, B:86:0x0051, B:88:0x005b, B:90:0x0061, B:94:0x0114, B:95:0x01b0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012e A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:8:0x00df, B:9:0x00e2, B:11:0x00e6, B:14:0x00ec, B:15:0x00ee, B:17:0x00fd, B:20:0x0117, B:22:0x011b, B:25:0x01b3, B:29:0x012e, B:31:0x0136, B:34:0x0149, B:36:0x014f, B:38:0x0159, B:39:0x0183, B:41:0x0199, B:43:0x019d, B:48:0x0108, B:49:0x010d, B:51:0x009b, B:52:0x009e, B:54:0x00a2, B:57:0x00a8, B:60:0x00ba, B:62:0x00ca, B:66:0x0073, B:67:0x0076, B:69:0x0082, B:71:0x0086, B:75:0x0021, B:77:0x0025, B:78:0x0033, B:80:0x0040, B:82:0x0044, B:86:0x0051, B:88:0x005b, B:90:0x0061, B:94:0x0114, B:95:0x01b0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2 A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:8:0x00df, B:9:0x00e2, B:11:0x00e6, B:14:0x00ec, B:15:0x00ee, B:17:0x00fd, B:20:0x0117, B:22:0x011b, B:25:0x01b3, B:29:0x012e, B:31:0x0136, B:34:0x0149, B:36:0x014f, B:38:0x0159, B:39:0x0183, B:41:0x0199, B:43:0x019d, B:48:0x0108, B:49:0x010d, B:51:0x009b, B:52:0x009e, B:54:0x00a2, B:57:0x00a8, B:60:0x00ba, B:62:0x00ca, B:66:0x0073, B:67:0x0076, B:69:0x0082, B:71:0x0086, B:75:0x0021, B:77:0x0025, B:78:0x0033, B:80:0x0040, B:82:0x0044, B:86:0x0051, B:88:0x005b, B:90:0x0061, B:94:0x0114, B:95:0x01b0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:8:0x00df, B:9:0x00e2, B:11:0x00e6, B:14:0x00ec, B:15:0x00ee, B:17:0x00fd, B:20:0x0117, B:22:0x011b, B:25:0x01b3, B:29:0x012e, B:31:0x0136, B:34:0x0149, B:36:0x014f, B:38:0x0159, B:39:0x0183, B:41:0x0199, B:43:0x019d, B:48:0x0108, B:49:0x010d, B:51:0x009b, B:52:0x009e, B:54:0x00a2, B:57:0x00a8, B:60:0x00ba, B:62:0x00ca, B:66:0x0073, B:67:0x0076, B:69:0x0082, B:71:0x0086, B:75:0x0021, B:77:0x0025, B:78:0x0033, B:80:0x0040, B:82:0x0044, B:86:0x0051, B:88:0x005b, B:90:0x0061, B:94:0x0114, B:95:0x01b0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009a A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54442Bs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
