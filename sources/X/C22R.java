package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.22R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22R extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ LiveEffect LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22R(long j, LiveEffect liveEffect, boolean z) {
        super(0);
        this.LJLIL = j;
        this.LJLILLLLZI = liveEffect;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_filter_resource_download");
        LIZ.LJIIZILJ();
        I9A.LIZ(System.currentTimeMillis(), this.LJLIL, LIZ, "duration");
        LIZ.LJIJJ(this.LJLILLLLZI.getFilterId(), "filter_id");
        LIZ.LJIJJ(this.LJLILLLLZI.getResourceId(), "resource_id");
        LiveEffect liveEffect = this.LJLILLLLZI;
        String str2 = liveEffect.parentResName;
        if (str2 == null) {
            str2 = liveEffect.getName();
        }
        LIZ.LJIJJ(str2, "beauty_type_name");
        if (this.LJLJI) {
            str = "done";
        } else {
            str = "failed";
        }
        LIZ.LJIJJ(str, "status");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
