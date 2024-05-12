package X;

import Y.ARunnableS15S0000000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostResource;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.J9d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48693J9d implements C01I, InterfaceC150675vj, InterfaceC48038ItG, InterfaceC48694J9e {
    public static int LJLIL = 0;
    public static final C48693J9d LJLILLLLZI = new C48693J9d();
    public static boolean LJLJI = false;
    public static Runnable LJLJJI = null;
    public static boolean LJLJJL = true;
    public static boolean LJLJJLL;
    public static InterfaceC47412IjA LJLJL;

    public static HashSet LIZIZ() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("allowed_vboost_scene_mt", int[].class, null);
        if (iArr != null) {
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        }
        return hashSet;
    }

    public static boolean LJ() {
        Object value = IZ8.m0.getValue();
        o.LJIIIIZZ(value, "<get-coldBootInitNetClientDelayOpt>(...)");
        return ((Boolean) value).booleanValue();
    }

    public static synchronized boolean LJFF() {
        synchronized (C48693J9d.class) {
            int i = LJLIL;
            boolean z = false;
            if (i != 0) {
                if (i > 0) {
                    z = true;
                }
                return z;
            }
            try {
                C16880lQ.LLJJJIL("jato");
                LJLIL = 1;
            } catch (Throwable unused) {
                LJLIL = -1;
            }
            if (LJLIL > 0) {
                z = true;
            }
            return z;
        }
    }

    public /* synthetic */ C48693J9d() {
    }

    @Override // X.InterfaceC48694J9e
    public C59239NMt LIZ() {
        return C59239NMt.INSTANCE;
    }

    public /* synthetic */ C48693J9d(LiveHostResource liveHostResource) {
        C259810g c259810g = C259710f.LIZ;
        C42061kw c42061kw = C42061kw.LIZJ;
        c259810g.getClass();
        C259810g.LJIIIIZZ(R.raw.icon_2pt_question_mark_circle_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_person_question_mark_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_question_mark_circle_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_large_error_qa_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_2pt_qa_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_qa_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_qa_fill_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_color_qa_fill_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_double_qa_ltr, c42061kw);
        C259810g.LJIIIIZZ(R.raw.icon_color_double_qa_ltr, c42061kw);
        C1MV c1mv = C1MV.LIZIZ;
        C259810g.LJIIIIZZ(R.raw.icon_2pt_horn_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_3pt_backspace_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_3pt_horn_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_arrow_left_circle_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_arrow_left_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_arrow_right_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_arrow_triangle_right_fill_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_arrow_up_left_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_backspace_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_bubble_left_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_left_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_left_offset_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_right_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_right_offset_fill_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_right_offset_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_right_offset_small_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_clipboard_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_horn_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_lines_horizontal_decrease_rectangle_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_speaker_2_fill_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_speaker_2_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_speaker_2_slash_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_speaker_x_mark_fill_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_speaker_x_mark_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_truck_moving_fill_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_truck_moving_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_right_circle_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_arrow_to_right, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_arrow_turn_up_left, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_speaker_1_fill_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_horizontal_rectangles_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_color_horizontal_rectangles_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_down_circle_ltr, c1mv);
        C259810g.LJIIIIZZ(R.raw.icon_chevron_up_circle_ltr, c1mv);
    }

    public static void LJI(ARunnableS15S0000000_8 aRunnableS15S0000000_8) {
        LJLJJI = aRunnableS15S0000000_8;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        return new JSONObject(it);
    }

    public static final Object LJII(InterfaceC88472Yns interfaceC88472Yns, C3CS c3cs) {
        InterfaceC39951hX interfaceC39951hX = (InterfaceC39951hX) c3cs.getContext().get(InterfaceC39951hX.LIZIZ);
        if (interfaceC39951hX == null) {
            return C1JD.LJJJJI(interfaceC88472Yns, c3cs);
        }
        new C2BR(interfaceC88472Yns, null);
        return interfaceC39951hX.LJIIL();
    }

    public Drawable LIZJ(int i, Context context) {
        C35366DuM c35366DuM;
        Object obj;
        if (context == null || (c35366DuM = C33233D2n.LIZ.get(Integer.valueOf(i))) == null) {
            return null;
        }
        InterfaceC65350Pko<?> interfaceC65350Pko = c35366DuM.LIZIZ;
        if (interfaceC65350Pko != null) {
            obj = C39557Ffl.LIZ(interfaceC65350Pko).newInstance();
        } else {
            obj = null;
        }
        if (!(obj instanceof Drawable)) {
            return null;
        }
        return (Drawable) obj;
    }

    @Override // X.InterfaceC150675vj
    public AnonymousClass671 LIZLLL(int i, Context context) {
        o.LJIIIZ(context, "context");
        C6B2 c6b2 = new C6B2(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C81184Vtc.LJ(context), C6B2.LJIIL(context));
        layoutParams.gravity = 1;
        c6b2.setLayoutParams(layoutParams);
        c6b2.setDeltaX(i);
        return c6b2;
    }
}
