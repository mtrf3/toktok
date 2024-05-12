package X;

import android.view.View;
import com.ss.android.ugc.aweme.story.feed.immersive.digg.ImmersiveStoryDiggAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202547xC extends AbstractC65781Prl implements InterfaceC88471Ynr<ImmersiveStoryDiggAssem, C200647u8, C76800UCe> {
    public static final C202547xC LJLIL = new C202547xC();

    public C202547xC() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ImmersiveStoryDiggAssem immersiveStoryDiggAssem, C200647u8 c200647u8) {
        ImmersiveStoryDiggAssem selectSubscribe = immersiveStoryDiggAssem;
        C200647u8 c200647u82 = c200647u8;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c200647u82 != null) {
            ((C202597xH) selectSubscribe.Y3().findViewById(R.id.c_r)).setSelected(c200647u82.LIZIZ);
            if (selectSubscribe.Y3().findViewById(R.id.c_r).isSelected()) {
                selectSubscribe.Y3().findViewById(R.id.c_x).setContentDescription(C86V.LJFF(R.string.aea));
            } else {
                View findViewById = selectSubscribe.Y3().findViewById(R.id.c_x);
                String LJFF = C86V.LJFF(R.string.abj);
                o.LJIIIIZZ(LJFF, "getString(com.ss.android…abels_following_btn_like)");
                findViewById.setContentDescription(C208078Ep.LIZ(LJFF, C51029K0z.LJJIIZI(new OSZ("number", String.valueOf(c200647u82.LIZ)))));
            }
        }
        return C76800UCe.LIZ;
    }
}
