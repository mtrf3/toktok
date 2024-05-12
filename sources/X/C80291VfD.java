package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.VfD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80291VfD extends C28921Bo {
    public final /* synthetic */ C80290VfC LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80291VfD(C80290VfC c80290VfC, C72418SbW c72418SbW) {
        super(c72418SbW);
        this.LIZJ = c80290VfC;
    }

    @Override // X.C28921Bo, X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        C80288VfA c80288VfA = this.LIZJ.LJLJJL;
        if (c80288VfA.LJLJJI.LJLILLLLZI.getChildCount() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        for (int i2 = 0; i2 < c80288VfA.LJLJJI.LJLJJL.getItemCount(); i2++) {
            if (c80288VfA.LJLJJI.LJLJJL.getItemViewType(i2) == 0) {
                i++;
            }
        }
        c17760mq.LJIILLIIL(new C17730mn(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false)));
    }
}
