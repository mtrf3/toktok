package X;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: X.Nx3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61013Nx3 implements InterfaceC61107NyZ {
    public final /* synthetic */ InterfaceC61015Nx5 LIZ;
    public final /* synthetic */ String[] LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        C164906da c164906da;
        InterfaceC58215Mt1 remove;
        InterfaceC58215Mt1 remove2;
        if (c164906daArr.length == 0 || (c164906da = c164906daArr[0]) == null) {
            return;
        }
        if (c164906da.LIZ()) {
            C61014Nx4 c61014Nx4 = (C61014Nx4) this.LIZ;
            String str = c61014Nx4.LIZIZ;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && (remove2 = C58214Mt0.LIZ.remove(str)) != null) {
                remove2.LIZ();
            }
            Activity activity = c61014Nx4.LIZ.get();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.finish();
            return;
        }
        C61014Nx4 c61014Nx42 = (C61014Nx4) this.LIZ;
        String str2 = c61014Nx42.LIZIZ;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && (remove = C58214Mt0.LIZ.remove(str2)) != null) {
            remove.LIZIZ();
        }
        Activity activity2 = c61014Nx42.LIZ.get();
        if (activity2 == null || activity2.isFinishing()) {
            return;
        }
        activity2.finish();
    }

    public C61013Nx3(C61014Nx4 c61014Nx4, String[] strArr) {
        this.LIZ = c61014Nx4;
        this.LIZIZ = strArr;
    }
}
