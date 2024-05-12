package X;

import java.util.HashMap;

/* renamed from: X.UAp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76759UAp extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ UAS LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76759UAp(long j, long j2, UAS uas, String str, String str2, boolean z) {
        super(0);
        this.LJLIL = uas;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = str2;
        this.LJLJJL = j2;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        HashMap LIZ = UAR.LIZ(this.LJLIL);
        String str = this.LJLILLLLZI;
        long j = this.LJLJI;
        String str2 = this.LJLJJI;
        long j2 = this.LJLJJL;
        UAS uas = this.LJLIL;
        boolean z = this.LJLJJLL;
        AnonymousClass391.LJFF(LIZ, "connect_end_reason", str, j, "connect_finish_error_code");
        if (str2 == null) {
            str2 = "";
        }
        LIZ.put("connect_end_source", str2);
        C7MY.LJFF(j2, uas.LJIJJ, LIZ, "connect_duration");
        LIZ.put("is_mute_video", String.valueOf(uas.LJIJJLI ? 1 : 0));
        LIZ.put("is_mute_audio", String.valueOf(uas.LJIL ? 1 : 0));
        LIZ.put("is_connected", String.valueOf(z ? 1 : 0));
        AnonymousClass172.LIZ("livesdk_linkmic_perf_connect_finish", LIZ);
        return C76800UCe.LIZ;
    }
}
