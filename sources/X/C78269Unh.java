package X;

import com.bytedance.android.live.design.app.LiveDialog;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Unh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78269Unh implements C0K7 {
    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static int LIZIZ(Object[] objArr, int i, int i2) {
        return (Objects.hash(objArr) + i) * i2;
    }

    public static void LIZJ(DIJ dij, String str, float f) {
        o.LJIIIZ(dij, str);
        dij.LJIILL(f);
        dij.LIZLLL();
    }

    public static void LIZ(C78263Unb c78263Unb, EnumC77751UfL enumC77751UfL, String str, JSONObject jSONObject) {
        c78263Unb.LIZ(enumC77751UfL, str, jSONObject, null, null);
    }
}
