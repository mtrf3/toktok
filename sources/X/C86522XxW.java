package X;

import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPopupWindow;
import java.lang.ref.WeakReference;

/* renamed from: X.XxW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86522XxW extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C86507XxH LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86522XxW(boolean z, C86507XxH c86507XxH, String str) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = c86507XxH;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InnerPushPopupWindow innerPushPopupWindow;
        InnerPushPopupWindow innerPushPopupWindow2;
        if (this.LJLIL) {
            WeakReference<InnerPushPopupWindow> weakReference = this.LJLILLLLZI.LIZ;
            if (weakReference != null && (innerPushPopupWindow2 = weakReference.get()) != null) {
                innerPushPopupWindow2.dismiss();
            }
        } else {
            WeakReference<InnerPushPopupWindow> weakReference2 = this.LJLILLLLZI.LIZ;
            if (weakReference2 != null && (innerPushPopupWindow = weakReference2.get()) != null) {
                innerPushPopupWindow.LIZIZ(this.LJLJI, false);
            }
        }
        return C76800UCe.LIZ;
    }
}
