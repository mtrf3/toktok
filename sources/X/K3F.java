package X;

import android.content.DialogInterface;

/* loaded from: classes9.dex */
public final class K3F implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C51105K3x LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;

    public K3F(C51105K3x c51105K3x, java.util.Map<String, String> map) {
        this.LJLIL = c51105K3x;
        this.LJLILLLLZI = map;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C51105K3x c51105K3x = this.LJLIL;
        java.util.Map<String, String> map = this.LJLILLLLZI;
        c51105K3x.getClass();
        C51105K3x.LIZIZ("close_filter", map);
    }
}
