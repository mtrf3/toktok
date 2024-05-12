package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes13.dex */
public interface S1E extends InterfaceC71405S0r {
    String LIZ();

    CharSequence LIZJ();

    void LIZLLL(SmartImageView smartImageView);

    void LJ(C188727au c188727au);

    EnumC26289ATl LJFF(List<AnchorCommonStruct> list);

    void LJI(C188727au c188727au);

    void LJII(C7F9 c7f9, S1F s1f, r2 r2Var);

    void LJIIIIZZ(C188727au c188727au);

    InterfaceC44105HSr LJIIIZ();

    void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i);

    void LJIIJJI(C7F9 c7f9);

    void LJIIL(C188727au c188727au, boolean z);

    void LJIILIIL(C7F9 c7f9, Dialog dialog, boolean z, boolean z2);

    int LJIILJJIL();

    void LJIILL(View view, Aweme aweme, boolean z);

    boolean LJIILLIIL();

    void LJIIZILJ(C7F9 c7f9, String str, boolean z);

    void LJIJ(Activity activity, Dialog dialog);

    InterfaceC44104HSq LJIJI();

    void LJIJJ(Aweme aweme);

    S1E clone();

    int priority();

    int type();
}
