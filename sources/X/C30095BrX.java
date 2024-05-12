package X;

import Y.ACallableS108S0100000_5;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;

/* renamed from: X.BrX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30095BrX implements BZQ, InterfaceC62137Oa5 {
    public final /* synthetic */ Object LIZ;

    @Override // X.InterfaceC62137Oa5
    public final void LIZ() {
        SurfaceHolderCallbackC62131OZz surfaceHolderCallbackC62131OZz = (SurfaceHolderCallbackC62131OZz) this.LIZ;
        surfaceHolderCallbackC62131OZz.getClass();
        C10K.LIZIZ(new ACallableS108S0100000_5(surfaceHolderCallbackC62131OZz, 4), ExecutorC142245i8.LJLILLLLZI, null);
    }

    public final boolean LIZIZ() {
        if (((AbsAudienceInteractionFragment) this.LIZ).mRoom == null) {
            return false;
        }
        return !((Boolean) r1.widgetLoadConditions.LJI.getValue()).booleanValue();
    }

    public /* synthetic */ C30095BrX(Object obj) {
        this.LIZ = obj;
    }
}
