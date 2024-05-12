package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity;

/* renamed from: X.GAi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41080GAi implements InterfaceC41079GAh {
    public final /* synthetic */ SelectSaveLocalOptionActivity LJLIL;

    @Override // X.InterfaceC41079GAh
    public final void LLILL() {
        this.LJLIL.finish();
    }

    @Override // X.InterfaceC41079GAh
    public final void cancel() {
        this.LJLIL.setResult(0);
    }

    public C41080GAi(SelectSaveLocalOptionActivity selectSaveLocalOptionActivity) {
        this.LJLIL = selectSaveLocalOptionActivity;
    }

    @Override // X.InterfaceC41079GAh
    public final void M7(int i) {
        this.LJLIL.setResult(-1, new Intent().putExtra("extra_save_option", i));
    }
}
