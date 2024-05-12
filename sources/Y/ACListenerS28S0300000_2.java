package Y;

import X.C164996dj;
import X.C169776lR;
import X.C170296mH;
import X.C1NS;
import X.C5RT;
import X.C6SL;
import X.C6SO;
import X.C6SQ;
import X.C6SS;
import X.C6ST;
import X.C78920UyC;
import X.EnumC160626Sc;
import X.H7R;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursSuggestTopic;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACListenerS28S0300000_2 implements View.OnClickListener {
    public final int $t;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS28S0300000_2 aCListenerS28S0300000_2, View view) {
        boolean z;
        boolean z2;
        C169776lR c169776lR = (C169776lR) aCListenerS28S0300000_2.l0;
        List list = (List) aCListenerS28S0300000_2.l1;
        C170296mH c170296mH = (C170296mH) aCListenerS28S0300000_2.l2;
        C5RT c5rt = (C5RT) c169776lR.LIZJ.getValue();
        if (c5rt != null && c5rt.LJI == 0) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        if (H7R.LJJII(c169776lR.LIZ) && intValue == c169776lR.LJJIJLIJ.getCount() - 1 && c169776lR.LJJLIIIJL) {
            C78920UyC.LIZLLL(R.string.bxu, c169776lR.LJJIZ, 1045);
            return;
        }
        c169776lR.LJJ.setCurrentItem(intValue);
        Fragment fragment = c169776lR.LJJIJLIJ.LJLL;
        if (fragment != null && (fragment instanceof TimeEffectTabFragment)) {
            if (c169776lR.LJJLIIIJL && !H7R.LJJII(c169776lR.LIZ)) {
                z = true;
                if (c169776lR.LJJJLIIL.LJLJL) {
                    z2 = true;
                    ((TimeEffectTabFragment) c169776lR.LJJIJLIJ.LJLL).vl(z2, z);
                }
            } else {
                z = false;
            }
            z2 = false;
            ((TimeEffectTabFragment) c169776lR.LJJIJLIJ.LJLL).vl(z2, z);
        }
        if (!C164996dj.LIZ(((EffectCategoryResponse) ListProtector.get(list, intValue)).getKey()) || !c169776lR.LJJLIIIIJ || !c169776lR.LJIIIIZZ(true).booleanValue()) {
            return;
        }
        View view2 = c170296mH.LJLJI;
        if (view2 != null) {
            view2.setVisibility(8);
            c169776lR.LJJLIIIIJ = false;
        } else {
            o.LJIJI("dotView");
            throw null;
        }
    }

    public static final void onClick$1(ACListenerS28S0300000_2 aCListenerS28S0300000_2, View view) {
        AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic;
        Long l;
        int i;
        Integer type;
        C6SQ c6sq = (C6SQ) aCListenerS28S0300000_2.l0;
        c6sq.LJIIIZ(c6sq.getAddYoursStickerView().getContentEditText());
        ((C6SO) aCListenerS28S0300000_2.l1).getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list = ((C6SQ) aCListenerS28S0300000_2.l0).LLF.get(EnumC160626Sc.HOT);
        if (list != null) {
            addYoursStickerTopicRepoApi$AddYoursSuggestTopic = (AddYoursStickerTopicRepoApi$AddYoursSuggestTopic) ListProtector.get(list, LJJJJIZL);
        } else {
            addYoursStickerTopicRepoApi$AddYoursSuggestTopic = null;
        }
        C6SL LJIIJ = ((C6SQ) aCListenerS28S0300000_2.l0).LJLJJI.LJIIJ();
        if (LJIIJ != null) {
            C1NS<AddYoursStickerModel> c1ns = ((C6SQ) aCListenerS28S0300000_2.l0).LJLJL;
            if (c1ns != null) {
                String topicText = c1ns.LJ.getTopicText();
                String str = "";
                if (topicText == null) {
                    topicText = "";
                }
                String charSequence = ((TuxTextView) aCListenerS28S0300000_2.l2).getText().toString();
                String value = C6ST.TITLE.getValue();
                boolean z = C6SQ.LLIFFJFJJ;
                C1NS<AddYoursStickerModel> c1ns2 = ((C6SQ) aCListenerS28S0300000_2.l0).LJLJL;
                if (c1ns2 != null) {
                    String addYoursEnterMethod = c1ns2.LJ.getAddYoursEnterMethod();
                    if (addYoursEnterMethod != null) {
                        str = addYoursEnterMethod;
                    }
                    if (addYoursStickerTopicRepoApi$AddYoursSuggestTopic != null && (type = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getType()) != null) {
                        i = type.intValue();
                    } else {
                        i = 0;
                    }
                    LJIIJ.LJII(i, topicText, charSequence, value, str, z);
                } else {
                    o.LJIJI("stateContainer");
                    throw null;
                }
            } else {
                o.LJIJI("stateContainer");
                throw null;
            }
        }
        ((C6SQ) aCListenerS28S0300000_2.l0).LLFF = false;
        if (addYoursStickerTopicRepoApi$AddYoursSuggestTopic != null) {
            l = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getTopicId();
        } else {
            l = null;
        }
        C1NS<AddYoursStickerModel> c1ns3 = ((C6SQ) aCListenerS28S0300000_2.l0).LJLJL;
        if (c1ns3 != null) {
            c1ns3.LJ(new AqS106S0300000_2((TuxTextView) aCListenerS28S0300000_2.l2, addYoursStickerTopicRepoApi$AddYoursSuggestTopic, l, 13));
            ((C6SQ) aCListenerS28S0300000_2.l0).setInputMode(C6SS.AUTO);
            ((C6SQ) aCListenerS28S0300000_2.l0).LLFFF = ((TuxTextView) aCListenerS28S0300000_2.l2).getText().toString();
            return;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public ACListenerS28S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
