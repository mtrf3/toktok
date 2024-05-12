package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.1DG, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1DG implements InterfaceC67679QhH {
    public static InterfaceC46878IaY LIZ() {
        return (InterfaceC46878IaY) ESN.LIZ("com.ss.android.ugc.aweme.simkit.SimKitService");
    }

    public static int LIZIZ() {
        return C00F.LIZ(31744, 0, "creative_tool_profile_enable", true);
    }

    public static InterfaceC41417GNh LJFF() {
        return C60903NvH.LJIIJJI().LJJJI().LIZJ();
    }

    public static boolean LJIIIIZZ() {
        return C60903NvH.LJIIJJI().getAccountService().isChildrenMode();
    }

    @Override // X.InterfaceC67679QhH
    public void onFailure(Exception exc) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("fail_reason", exc.toString());
        c188727au.LIZLLL(3, "growth_deepevent");
        FMX.LJIIL("firebase_to_server", c188727au.LIZ);
    }

    public static ActivityC45651qj LJ(View view, String str) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return C45804HyK.LJJIFFI(context);
    }

    public static void LJI(View view, int i, TuxTextView tuxTextView) {
        tuxTextView.setText(view.getContext().getString(i));
    }

    public static Bundle LIZLLL(String str, int i, String str2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        bundle.putInt(str2, i2);
        return bundle;
    }

    public static void LJII(ActivityC45651qj activityC45651qj, String str, TuxSheet tuxSheet, String str2) {
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, str);
        tuxSheet.show(supportFragmentManager, str2);
    }

    public static ObjectAnimator LIZJ(C47061t0 c47061t0, Property property, float[] fArr, String str, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c47061t0, (Property<C47061t0, Float>) property, fArr);
        o.LJIIIIZZ(ofFloat, str);
        ofFloat.setDuration(j);
        return ofFloat;
    }
}
