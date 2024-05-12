package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* renamed from: X.1yD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50291yD extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Map.Entry<Long, C08790Wd> LJLIL;
    public final /* synthetic */ C08790Wd LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ LiveEffect LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50291yD(Map.Entry<Long, C08790Wd> entry, C08790Wd c08790Wd, DataChannel dataChannel, boolean z, LiveEffect liveEffect) {
        super(0);
        this.LJLIL = entry;
        this.LJLILLLLZI = c08790Wd;
        this.LJLJI = dataChannel;
        this.LJLJJI = z;
        this.LJLJJL = liveEffect;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        long j = this.LJLIL.getValue().LJFF - this.LJLILLLLZI.LJFF;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_beauty_use_time");
        LIZ.LJIILLIIL(this.LJLJI);
        LIZ.LJIL("beauty_value", Float.valueOf(this.LJLILLLLZI.LIZIZ));
        LIZ.LJIJJ(Long.valueOf(j), "use_time");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJJI ? 1 : 0), "is_live_take_default");
        LIZ.LJIJJ(Integer.valueOf(this.LJLILLLLZI.LJ ? 1 : 0), "is_default_value");
        if (C32011Nl.LJI()) {
            str = "makeup";
        } else {
            str = "normal";
        }
        LIZ.LJIJJ(str, "beauty_status");
        C32011Nl.LJII(LIZ, this.LJLJJL);
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
