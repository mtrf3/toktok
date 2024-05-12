package Y;

import X.AbstractC55082Lja;
import X.C16880lQ;
import X.C2MA;
import X.C32151Nz;
import X.C3L4;
import X.C3Q9;
import X.C58582Rq;
import X.C63120Opw;
import X.C68322mC;
import X.C71791SFn;
import X.C76800UCe;
import X.C79004UzY;
import X.C7GV;
import X.FAJ;
import X.InterfaceC48720JAe;
import X.InterfaceC75532xp;
import X.InterfaceC88472Yns;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ARunnableS2S0301000_1 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((ViewPagerComponentTemp) this.l0).FQ() == 0) {
            ((InterfaceC48720JAe) this.l1).LJI(this.i3, ((BaseListFragmentPanel) this.l2).getContext(), ((BaseListFragmentPanel) this.l2).mAdapter.Q8());
            C58582Rq.LIZ("preRenderSuperLike: deal prepareRender", BaseListFragmentPanel.TAG);
            ((BaseListFragmentPanel) this.l2).mHandler.removeCallbacks(this);
            return;
        }
        ((BaseListFragmentPanel) this.l2).mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$1() {
        if (((ViewPagerComponentTemp) this.l0).FQ() == 0) {
            ((InterfaceC48720JAe) this.l1).LJI(this.i3, ((BaseListFragmentPanel) this.l2).getContext(), ((BaseListFragmentPanel) this.l2).mAdapter.Q8());
            C58582Rq.LIZ("preRenderDescriptiveTop: deal prepareRender", BaseListFragmentPanel.TAG);
            ((BaseListFragmentPanel) this.l2).mHandler.removeCallbacks(this);
            return;
        }
        ((BaseListFragmentPanel) this.l2).mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$2() {
        if (((ViewPagerComponentTemp) this.l0).FQ() == 0) {
            ((InterfaceC48720JAe) this.l1).LJI(this.i3, ((BaseListFragmentPanel) this.l2).getContext(), ((BaseListFragmentPanel) this.l2).mAdapter.Q8());
            C58582Rq.LIZ("preRenderDescriptiveTop: deal prepareRender", BaseListFragmentPanel.TAG);
            ((BaseListFragmentPanel) this.l2).mHandler.removeCallbacks(this);
            return;
        }
        ((BaseListFragmentPanel) this.l2).mHandler.postDelayed(this, 100L);
    }

    public final void LIZ$3() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C63120Opw LIZ = ((C3Q9) this.l0).LIZ(((C3L4) this.l1).LJFF());
        if (LIZ != null) {
            C3L4 c3l4 = (C3L4) this.l1;
            linkedHashMap.put("to_user_id", C79004UzY.LJIILL(LIZ));
            String LJFF = c3l4.LJFF();
            o.LJIIIIZZ(LJFF, "baseSession.sessionID");
            linkedHashMap.put("conversation_id", LJFF);
            linkedHashMap.put("chat_type", CardStruct.IStatusCode.DEFAULT);
        }
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("enter_method", "inbox_camera_icon");
        linkedHashMap.put("rank", String.valueOf(this.i3));
        ((InterfaceC75532xp) this.l2).LIZIZ("show_camera_entrance", linkedHashMap);
    }

    public final void LIZ$4() {
        if (((View) this.l0).findViewById(R.id.l4t) != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ((View) this.l0).findViewById(this.i3);
        if (viewGroup != null) {
            viewGroup.addView((View) this.l1, 0);
        }
        View view = (View) this.l1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        view.setLayoutParams(marginLayoutParams);
        C7GV.LIZ(4, ((View) this.l1).findViewById(R.id.l4t));
        ((InterfaceC88472Yns) this.l2).invoke((View) this.l1);
    }

    public final void LIZ$5() {
        if (((View) this.l0).findViewById(R.id.hoc) != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ((View) this.l0).findViewById(this.i3);
        if (viewGroup != null) {
            viewGroup.addView((View) this.l1, 0);
        }
        View view = (View) this.l1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        view.setLayoutParams(marginLayoutParams);
        C7GV.LIZ(4, ((View) this.l1).findViewById(R.id.hoc));
        ((InterfaceC88472Yns) this.l2).invoke((View) this.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$6() {
        FAJ.LIZ("tryplay_adapter_getview", false);
        AbstractC55082Lja abstractC55082Lja = (AbstractC55082Lja) this.l0;
        View view = (View) ((C68322mC) this.l1).element;
        abstractC55082Lja.getClass();
        if (view != null) {
            int i = AbstractC55082Lja.LLFZ;
            AbstractC55082Lja.LLFZ = i + 1;
            view.setTag(R.id.d88, Integer.valueOf(i));
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((C2MA) this.l2).LLLZ(this.i3, ((AbstractC55082Lja) this.l0).LJJIZ(this.i3));
        ((C2MA) this.l2).f8(((AbstractC55082Lja) this.l0).LJJIJLIJ());
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            Aweme item = ((AbstractC55082Lja) this.l0).getItem(this.i3);
            if (item != null) {
                ((AbstractC55082Lja) this.l0).LJJJJI(currentTimeMillis2 - currentTimeMillis, item);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        FAJ.LJFF("tryplay_adapter_getview", false);
    }

    public static final void run$0(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            aRunnableS2S0301000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            aRunnableS2S0301000_1.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            aRunnableS2S0301000_1.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            aRunnableS2S0301000_1.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            aRunnableS2S0301000_1.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            aRunnableS2S0301000_1.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.view.View] */
    public static final void run$6(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            ((C68322mC) aRunnableS2S0301000_1.l0).element = ((C71791SFn) aRunnableS2S0301000_1.l1).LJI(aRunnableS2S0301000_1.i3);
            ((InterfaceC88472Yns) aRunnableS2S0301000_1.l2).invoke(((C68322mC) aRunnableS2S0301000_1.l0).element);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS2S0301000_1 aRunnableS2S0301000_1) {
        boolean LIZ;
        try {
            aRunnableS2S0301000_1.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS2S0301000_1(Object obj, View view, int i, View view2, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.i3 = view;
        this.l1 = i;
        this.l2 = view2;
    }
}
