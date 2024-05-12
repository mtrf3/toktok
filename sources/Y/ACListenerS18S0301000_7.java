package Y;

import X.C09K;
import X.C145995oB;
import X.C41878Gc6;
import X.C41879Gc7;
import X.C42117Gfx;
import X.C45658Hvy;
import X.C45662Hw2;
import X.C73214SoM;
import X.C76800UCe;
import X.C79081V1x;
import X.FMX;
import X.InterfaceC88472Yns;
import Y.ARunnableS15S0101000_11;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACListenerS18S0301000_7 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS18S0301000_7 aCListenerS18S0301000_7, View view) {
        String str;
        int i;
        C73214SoM c73214SoM;
        final C45658Hvy c45658Hvy = (C45658Hvy) aCListenerS18S0301000_7.l0;
        final MediaModel mediaModel = (MediaModel) aCListenerS18S0301000_7.l1;
        final C45662Hw2 c45662Hw2 = (C45662Hw2) aCListenerS18S0301000_7.l2;
        final int i2 = aCListenerS18S0301000_7.i3;
        if (c45658Hvy.LJLIL) {
            return;
        }
        boolean LJJIJL = C79081V1x.LJJIJL(mediaModel);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "video");
        c145995oB.LJI("upload_type", "mutiple_content");
        if (LJJIJL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("source_is_hdr", str);
        FMX.LJIIL("choose_upload_content", c145995oB.LIZ);
        List<Integer> list = c45658Hvy.LJLJJL;
        if (list != null) {
            i = ((ArrayList) list).indexOf(Integer.valueOf(i2));
        } else {
            i = 0;
        }
        if (i >= 0) {
            ListProtector.set(c45658Hvy.LJLJJI, i2, -1);
            TextView textView = c45662Hw2.LJLJI;
            if (textView != null) {
                textView.setText("");
            }
            c45662Hw2.LJLJI.setBackgroundResource(R.drawable.a3e);
            c45658Hvy.LJLIL = true;
            C09K.LIZ(c45662Hw2.LJLJJLL, 0.0f, 300L).withEndAction(new ARunnableS10S0201000_7(i2, c45658Hvy, c45662Hw2, 0)).start();
            c45662Hw2.LJLIL.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300L).start();
            List<MediaModel> list2 = c45658Hvy.LJLLILLLL;
            if (list2 != null) {
                ListProtector.remove(list2, i);
            }
            ((ArrayList) c45658Hvy.LJLJJL).remove(Integer.valueOf(i2));
            int size = ((ArrayList) c45658Hvy.LJLJJL).size();
            while (i < size) {
                ListProtector.set(c45658Hvy.LJLJJI, ((Integer) ListProtector.get(c45658Hvy.LJLJJL, i)).intValue(), Integer.valueOf(i));
                if (size != 11) {
                    c45658Hvy.notifyItemChanged(((Integer) ListProtector.get(c45658Hvy.LJLJJL, i)).intValue());
                }
                i++;
            }
            if (size != 11 || (c73214SoM = c45658Hvy.LJLLJ.LJLLI) == null) {
                return;
            }
            c73214SoM.notifyDataSetChanged();
            return;
        }
        c45658Hvy.LJLLL.LIZ(mediaModel, C42117Gfx.LJ(), 0L, -1L, true, false, new InterfaceC88472Yns() { // from class: X.Hvz
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                C45658Hvy c45658Hvy2 = c45658Hvy;
                C45662Hw2 c45662Hw22 = c45662Hw2;
                int i3 = i2;
                MediaModel mediaModel2 = mediaModel;
                C43933HMb c43933HMb = (C43933HMb) obj;
                c45658Hvy2.getClass();
                c45658Hvy2.LJLZ(0, c43933HMb.LJLILLLLZI, c43933HMb.LJLJI);
                List<Integer> list3 = c45658Hvy2.LJLJJL;
                if (list3 != null && ((ArrayList) list3).size() >= 12) {
                    View view2 = c45662Hw22.itemView;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.cqa);
                    C78915Uy7.LJJIJ(view2, 3014, creativeToastBuilder);
                    return null;
                }
                if (c45658Hvy2.LJLLILLLL == null) {
                    c45658Hvy2.LJLLILLLL = new ArrayList();
                }
                ((ArrayList) c45658Hvy2.LJLLILLLL).add(mediaModel2);
                ((ArrayList) c45658Hvy2.LJLJJL).add(Integer.valueOf(i3));
                c45662Hw22.LJLJI.setText(String.valueOf((((ArrayList) c45658Hvy2.LJLJJL).size() - 1) + 1));
                c45662Hw22.LJLJI.setBackgroundResource(R.drawable.a3f);
                ListProtector.set(c45658Hvy2.LJLJJI, i3, Integer.valueOf(((ArrayList) c45658Hvy2.LJLJJL).size() - 1));
                c45658Hvy2.LJLIL = true;
                c45662Hw22.LJLIL.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300L).withEndAction(new ARunnableS15S0101000_11(6, c45658Hvy2, 8)).start();
                View view3 = c45662Hw22.LJLJJLL;
                if (view3 == null) {
                    return null;
                }
                view3.setAlpha(0.0f);
                c45662Hw22.LJLJJLL.setVisibility(0);
                c45662Hw22.LJLJJLL.animate().alpha(1.0f).setDuration(300L).start();
                return null;
            }
        }, new AObjectS40S0201000_7(1, c45658Hvy, c45662Hw2.itemView.getContext(), 3));
    }

    public static final void onClick$1(ACListenerS18S0301000_7 aCListenerS18S0301000_7, View view) {
        C41878Gc6 c41878Gc6 = (C41878Gc6) aCListenerS18S0301000_7.l0;
        int i = c41878Gc6.LJLJJI;
        if (i == aCListenerS18S0301000_7.i3) {
            return;
        }
        c41878Gc6.notifyItemChanged(i, 1);
        ((C41878Gc6) aCListenerS18S0301000_7.l0).notifyItemChanged(aCListenerS18S0301000_7.i3, 2);
        ((C41878Gc6) aCListenerS18S0301000_7.l0).LJLJJI = ((C41879Gc7) aCListenerS18S0301000_7.l1).getAdapterPosition();
        InterfaceC88472Yns<? super Effect, C76800UCe> interfaceC88472Yns = ((C41878Gc6) aCListenerS18S0301000_7.l0).LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke((Effect) aCListenerS18S0301000_7.l2);
        } else {
            o.LJIJI("clickMethod");
            throw null;
        }
    }

    public ACListenerS18S0301000_7(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
        this.i3 = i;
    }
}
