package X;

import Y.AObjectS134S0100000_5;
import Y.AObjectS42S0101000_5;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CUs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31418CUs {
    public static boolean LIZIZ;
    public static Resources LIZLLL;
    public static final C78866UxK LJIILIIL;
    public static final C31422CUw LJIILJJIL;
    public static final C31421CUv LJIILL;
    public static final C31419CUt LJIILLIIL;
    public static final C31418CUs LIZ = new C31418CUs();
    public static int LIZJ = -7829368;
    public static final HashMap<CQW, Drawable> LJ = new HashMap<>();
    public static final HashMap<String, EmoteModel> LJFF = new HashMap<>();
    public static final C31425CUz LJI = new C31425CUz();
    public static final ArrayList<C31423CUx<String>> LJII = new ArrayList<>();
    public static final ArrayList<C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>> LJIIIIZZ = new ArrayList<>();
    public static final ArrayList<C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>> LJIIIZ = new ArrayList<>();
    public static final ArrayList<C31423CUx<String>> LJIIJ = new ArrayList<>();
    public static final ArrayList<C31424CUy<InterfaceC88472Yns<java.util.Map<EmoteModel, ? extends Drawable>, C76800UCe>>> LJIIJJI = new ArrayList<>();
    public static final ArrayList<C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>> LJIIL = new ArrayList<>();

    static {
        C78866UxK c78866UxK = new C78866UxK();
        LJIILIIL = c78866UxK;
        C31422CUw c31422CUw = new C31422CUw(c78866UxK);
        LJIILJJIL = c31422CUw;
        C31421CUv c31421CUv = new C31421CUv(c31422CUw);
        LJIILL = c31421CUv;
        LJIILLIIL = new C31419CUt(c31421CUv);
    }

    public static void LIZJ(List list, CQW emoteType) {
        o.LJIIIZ(emoteType, "emoteType");
        C78866UxK c78866UxK = LJIILIIL;
        HashMap<String, EmoteModel> hashMap = LJFF;
        c78866UxK.getClass();
        C78866UxK.LJJLI(list, emoteType, hashMap, true);
    }

    public static SpannableStringBuilder LIZIZ(EmoteModel emoteModel, CQW emoteType, LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(emoteModel, "emoteModel");
        o.LJIIIZ(emoteType, "emoteType");
        return (SpannableStringBuilder) ListProtector.get(LJIILL.LLLLZ(C47261Igj.LJJIJ(emoteModel), emoteType, null, lifecycleOwner, new AqS171S0100000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 842), LJFF), 0);
    }

    public static SpannableStringBuilder LIZ(List list, CQW emoteType, String content, AObjectS42S0101000_5 aObjectS42S0101000_5, AObjectS134S0100000_5 aObjectS134S0100000_5, InterfaceC88472Yns interfaceC88472Yns, LifecycleOwner lifecycleOwner, boolean z) {
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(content, "content");
        return LJIILLIIL.LLLLZ(list, emoteType, content, aObjectS42S0101000_5, aObjectS134S0100000_5, interfaceC88472Yns, false, lifecycleOwner, LJFF, z);
    }
}
