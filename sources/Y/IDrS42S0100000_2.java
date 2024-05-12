package Y;

import X.C0A6;
import X.C132805Jc;
import X.C145995oB;
import X.C150045ui;
import X.C170346mM;
import X.C29901Fi;
import X.C57V;
import X.C5QW;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC88472Yns;
import X.O6R;
import X.ORZ;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.TransitionTabItemFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDrS42S0100000_2 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 4:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 5:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
            case 3:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 2:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 4:
                o.LJIIIZ(recyclerView, "recyclerView");
                return;
        }
    }

    public IDrS42S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS42S0100000_2 iDrS42S0100000_2, int i, RecyclerView recyclerView) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        FilterEffectTabFragment filterEffectTabFragment = (FilterEffectTabFragment) iDrS42S0100000_2.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        filterEffectTabFragment.LJLZ = z;
        filterEffectTabFragment.Hl(z);
    }

    public static final void LJIILJJIL$1(IDrS42S0100000_2 iDrS42S0100000_2, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((EditTTSPanelFragment) iDrS42S0100000_2.l0).vl(true);
    }

    public static final void LJIILJJIL$2(IDrS42S0100000_2 iDrS42S0100000_2, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((C57V) iDrS42S0100000_2.l0).LJLJLLL = false;
        } else {
            C57V c57v = (C57V) iDrS42S0100000_2.l0;
            c57v.LJLJLLL = true;
            C29901Fi<Long> onScrollTouchUp = c57v.getOnScrollTouchUp();
            C57V c57v2 = (C57V) iDrS42S0100000_2.l0;
            onScrollTouchUp.LJII(Long.valueOf(O6R.LJJIJ(c57v2.LJLJL / c57v2.LJLJJI)));
        }
    }

    public static final void LJIILJJIL$3(IDrS42S0100000_2 iDrS42S0100000_2, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            ((C150045ui) iDrS42S0100000_2.l0).LIZ(recyclerView);
        }
    }

    public static final void LJIILJJIL$4(IDrS42S0100000_2 iDrS42S0100000_2, int i, RecyclerView recyclerView) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        C170346mM c170346mM = (C170346mM) iDrS42S0100000_2.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        c170346mM.LJIIJ(z);
    }

    public static final void LJIILJJIL$5(IDrS42S0100000_2 iDrS42S0100000_2, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            ((TransitionTabItemFragment) iDrS42S0100000_2.l0).getClass();
            VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
            if (LIZIZ != null) {
                TransitionTabItemFragment transitionTabItemFragment = (TransitionTabItemFragment) iDrS42S0100000_2.l0;
                List LLJI = ORZ.LLJI(ORZ.LLJJ(transitionTabItemFragment.LJLJJLL));
                ArrayList arrayList = new ArrayList();
                for (Object obj : LLJI) {
                    if (true ^ ujb.o.LJJJJJL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                EditorProContext editorContext = transitionTabItemFragment.vl();
                o.LJIIIZ(editorContext, "editorContext");
                C145995oB LJFF = C5QW.LJFF(LIZIZ, editorContext);
                LJFF.LJI("music_id", LIZIZ.getMusicId());
                LJFF.LJI("enter_from", LIZIZ.enterFrom);
                LJFF.LIZ(1, "is_editor_pro");
                LJFF.LIZ(size, "scroll_cnt");
                FMX.LJIIL("scroll_transition", LJFF.LIZ);
                transitionTabItemFragment.LJLJJLL.clear();
            }
        }
    }

    public static final void LJIILL$0(IDrS42S0100000_2 iDrS42S0100000_2, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        FilterEffectTabFragment filterEffectTabFragment = (FilterEffectTabFragment) iDrS42S0100000_2.l0;
        filterEffectTabFragment.Hl(filterEffectTabFragment.LJLZ);
    }

    public static final void LJIILL$1(IDrS42S0100000_2 iDrS42S0100000_2, RecyclerView recyclerView, int i, int i2) {
        C57V c57v;
        int i3;
        float translationX;
        o.LJIIIZ(recyclerView, "recyclerView");
        C57V c57v2 = (C57V) iDrS42S0100000_2.l0;
        if (c57v2.LJLJLJ) {
            if (c57v2.LJJLJLI()) {
                c57v = (C57V) iDrS42S0100000_2.l0;
                i3 = c57v.LJLJL - i;
            } else {
                c57v = (C57V) iDrS42S0100000_2.l0;
                i3 = c57v.LJLJL + i;
            }
            c57v.LJLJL = i3;
            C57V c57v3 = (C57V) iDrS42S0100000_2.l0;
            if (c57v3.LJLJJLL != null && c57v3.LJLJJI != 0.0f) {
                c57v3.getCurStartTimeEvent().LJII(Long.valueOf(O6R.LJJIJ(c57v3.LJLJL / c57v3.LJLJJI)));
                C29901Fi<Long> rangeSeekEvent = c57v3.getRangeSeekEvent();
                if (c57v3.LJJLJLI()) {
                    translationX = c57v3.LJLJL - c57v3.LJLILLLLZI.getTranslationX();
                } else {
                    translationX = c57v3.LJLILLLLZI.getTranslationX() + c57v3.LJLJL;
                }
                rangeSeekEvent.LJII(Long.valueOf(O6R.LJJIJ(translationX / c57v3.LJLJJI)));
            }
            InterfaceC88472Yns<Integer, C76800UCe> onScrollerChange = ((C57V) iDrS42S0100000_2.l0).getOnScrollerChange();
            if (onScrollerChange != null) {
                onScrollerChange.invoke(Integer.valueOf(((C57V) iDrS42S0100000_2.l0).LJLJL));
            }
        }
    }
}
