package X;

import Y.AfS58S0100000_6;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse;

/* renamed from: X.Ead, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36691Ead<T> implements InterfaceC64592gB {
    public final /* synthetic */ EditPreviewStickerViewModel LJLIL;
    public final /* synthetic */ CreativeInfo LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C36691Ead(EditPreviewStickerViewModel editPreviewStickerViewModel, CreativeInfo creativeInfo, long j) {
        this.LJLIL = editPreviewStickerViewModel;
        this.LJLILLLLZI = creativeInfo;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        CutoutResponse cutoutResponse = (CutoutResponse) obj;
        EditPreviewStickerViewModel editPreviewStickerViewModel = this.LJLIL;
        CreativeInfo creativeInfo = this.LJLILLLLZI;
        long j = this.LJLJI;
        C73318Sq2 c73318Sq2 = editPreviewStickerViewModel.LJLJJLL;
        if (c73318Sq2 != null && c73318Sq2.LJLILLLLZI) {
            return;
        }
        InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJIIJ(new C36693Eaf(j, creativeInfo, cutoutResponse)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0100000_6(editPreviewStickerViewModel, 48), new AfS58S0100000_6(editPreviewStickerViewModel, 49));
        C73318Sq2 c73318Sq22 = editPreviewStickerViewModel.LJLJJLL;
        if (c73318Sq22 == null) {
            return;
        }
        c73318Sq22.LIZ(LJJJLIIL);
    }
}
