package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;

/* loaded from: classes14.dex */
public final class UOF implements InterfaceC75512TkK {
    public final /* synthetic */ CaptionTextWidgetV2 LIZ;

    public UOF(CaptionTextWidgetV2 captionTextWidgetV2) {
        this.LIZ = captionTextWidgetV2;
    }

    @Override // X.InterfaceC75512TkK
    public final void LIZ(boolean z) {
        CaptionTextWidgetV2 captionTextWidgetV2 = this.LIZ;
        captionTextWidgetV2.LJLJL = z;
        UO1 uo1 = captionTextWidgetV2.LLFZ;
        if (uo1 != null) {
            uo1.LJIIIIZZ = false;
        }
        captionTextWidgetV2.LJZI(true);
    }
}
