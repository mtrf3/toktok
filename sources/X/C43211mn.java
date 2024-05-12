package X;

import com.bytedance.android.live.effect.model.FilterModel;

/* renamed from: X.1mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C43211mn implements InterfaceC65784Pro {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ FilterModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public /* synthetic */ C43211mn(long j, FilterModel filterModel, boolean z) {
        this.LJLIL = j;
        this.LJLILLLLZI = filterModel;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        String str;
        long j = this.LJLIL;
        FilterModel filterModel = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_filter_resource_download");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - j), "duration");
        LIZ.LJIJJ(filterModel.getFilterId(), "filter_id");
        LIZ.LJIJJ(filterModel.getResourceId(), "resource_id");
        LIZ.LJIJJ(filterModel.getName(), "beauty_type_name");
        if (z) {
            str = "done";
        } else {
            str = "failed";
        }
        LIZ.LJIJJ(str, "status");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
