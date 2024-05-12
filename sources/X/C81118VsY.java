package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.VsY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81118VsY extends C81116VsW {
    public final /* synthetic */ WM7 LJFF;

    @Override // X.C81116VsW, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (WM7.SCENE_SERVICE.equals(str)) {
            return this.LJFF;
        }
        if ("layout_inflater".equals(str)) {
            WM7 wm7 = this.LJFF;
            if (wm7.mActivity != null) {
                return wm7.getLayoutInflater();
            }
        }
        return super.getSystemService(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81118VsY(WM7 wm7, Context context, Resources.Theme theme) {
        super(context, theme);
        this.LJFF = wm7;
    }
}
