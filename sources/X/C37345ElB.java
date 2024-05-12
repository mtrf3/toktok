package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import java.io.File;
import kotlin.jvm.internal.AqS8S0002000_14;

/* renamed from: X.ElB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37345ElB<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ EditPreviewStickerViewModel LJLJI;
    public final /* synthetic */ CreativeInfo LJLJJI;

    public C37345ElB(String str, int[] iArr, EditPreviewStickerViewModel editPreviewStickerViewModel, CreativeInfo creativeInfo) {
        this.LJLIL = str;
        this.LJLILLLLZI = iArr;
        this.LJLJI = editPreviewStickerViewModel;
        this.LJLJJI = creativeInfo;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<File> interfaceC73573Su9) {
        Bitmap LIZ = C42299Git.LIZ(this.LJLIL, this.LJLILLLLZI);
        EditPreviewStickerViewModel editPreviewStickerViewModel = this.LJLJI;
        int width = LIZ.getWidth();
        int height = LIZ.getHeight();
        editPreviewStickerViewModel.getClass();
        editPreviewStickerViewModel.setState(new AqS8S0002000_14(width, height, 1));
        File LIZJ = C43080GvU.LIZJ(this.LJLJJI, LIZ, Bitmap.CompressFormat.JPEG);
        if (LIZJ != null) {
            interfaceC73573Su9.onNext(LIZJ);
        } else {
            interfaceC73573Su9.tryOnError(new IllegalStateException("Compress Error"));
        }
    }
}
