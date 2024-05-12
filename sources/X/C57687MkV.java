package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;

/* renamed from: X.MkV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57687MkV implements InterfaceC78660Uu0 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C57688MkW LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("image load canceled, tag is ");
        LIZ.append(this.LJLIL);
        C221018lt.LIZ("RecSwipeFlyMainColorManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() < 1 || bitmap.getHeight() < 1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("image load complete, tag is ");
        LIZ.append(this.LJLIL);
        C221018lt.LIZ("RecSwipeFlyMainColorManager", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.getClass();
        int width = bitmap.getWidth();
        int height = (int) (bitmap.getHeight() * 0.1f);
        if (height < 1) {
            height = 1;
        }
        Rect rect = new Rect(0, 0, width, height);
        FlyMainColor flyMainColor = FlyMainColor.LIZ;
        Integer LIZ2 = C57688MkW.LIZ(flyMainColor.LIZ(new C23220ve(bitmap, rect)), true);
        int height2 = bitmap.getHeight();
        int height3 = (int) (bitmap.getHeight() * 0.1f);
        if (height3 < 1) {
            height3 = 1;
        }
        rect.set(0, height2 - height3, bitmap.getWidth(), bitmap.getHeight());
        Integer LIZ3 = C57688MkW.LIZ(flyMainColor.LIZ(new C23220ve(bitmap, rect)), false);
        if (LIZ2 == null || LIZ3 == null) {
            return;
        }
        this.LJLILLLLZI.LIZIZ.put(this.LJLJI, new int[]{LIZ2.intValue(), LIZ3.intValue()});
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("image load failed, tag is ");
        LIZ.append(this.LJLIL);
        C221018lt.LIZ("RecSwipeFlyMainColorManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("image load on progress, tag is ");
        LIZ.append(this.LJLIL);
        C221018lt.LIZ("RecSwipeFlyMainColorManager", X1D.LIZIZ(LIZ));
    }

    public C57687MkV(String str, C57688MkW c57688MkW, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = c57688MkW;
        this.LJLJI = str2;
    }
}
