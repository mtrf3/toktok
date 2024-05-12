package X;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.17u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C279417u implements C0K7, InterfaceC14120gy {
    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static Object LIZ(Room room, java.util.Map map) {
        return map.get(Long.valueOf(room.getId()));
    }

    @Override // X.InterfaceC14120gy
    public void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        liveActionSheetDialog.cancel();
    }

    public static void LIZIZ(DIJ dij, float f, float f2, float f3, float f4) {
        dij.LJIIL(f, f2);
        dij.LIZLLL();
        dij.LJIIIIZZ(f3, f4);
    }
}
