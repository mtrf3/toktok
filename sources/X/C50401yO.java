package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: X.1yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50401yO extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ List<Integer> LJLILLLLZI;
    public final /* synthetic */ List<Long> LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50401yO(DataChannel dataChannel, List<Integer> list, List<Long> list2, List<String> list3, boolean z, String str) {
        super(0);
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = list;
        this.LJLJI = list2;
        this.LJLJJI = list3;
        this.LJLJJL = z;
        this.LJLJJLL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sticker_show");
        LIZ.LJIILLIIL(this.LJLIL);
        LIZ.LJIJJ(Integer.valueOf(C32041No.LJIIJ ? 1 : 0), "is_same_effect_scene");
        LIZ.LJIJJ(this.LJLILLLLZI.toString(), "sticker_position");
        LIZ.LJIJJ(this.LJLJI.toString(), "sticker_id_set");
        LIZ.LJIJJ(C32041No.LIZIZ, "effect_icon_type");
        LIZ.LJIJJ(this.LJLJJI.toString(), "resource_id_set");
        C32041No.LIZ(LIZ);
        boolean z = this.LJLJJL;
        String str = this.LJLJJLL;
        if (!z) {
            LIZ.LJIJJ(str, "tab");
        }
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(this.LJLJJL)) ? 1 : 0), "is_shortcut_panel");
        LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        C32041No.LJI(LIZ);
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
