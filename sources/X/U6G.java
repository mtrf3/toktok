package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;

/* loaded from: classes14.dex */
public final class U6G implements UC6 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        if (layout != null) {
            U8H u8h = this.LIZ;
            String str = this.LIZIZ;
            String str2 = this.LIZJ;
            u8h.getClass();
            String LJJJ = U8H.LJJJ(527);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(u8h.LJJIJ());
            LIZ.append(":onRoomMsgReceived linkMicId = ");
            LIZ.append(str);
            LIZ.append(" layoutId = ");
            LIZ.append(str2);
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
            U8H.LJJLIIIJJIZ(u8h, layout, false, false, null, 28);
        }
    }

    public U6G(U8H u8h, String str, String str2) {
        this.LIZ = u8h;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
