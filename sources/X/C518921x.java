package X;

import com.bytedance.android.live.effect.model.FilterModel;

/* renamed from: X.21x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C518921x extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ FilterModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518921x(long j, FilterModel filterModel, boolean z) {
        super(0);
        this.LJLIL = j;
        this.LJLILLLLZI = filterModel;
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
        LIZ.LJIJJ(this.LJLILLLLZI.getName(), "beauty_type_name");
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
