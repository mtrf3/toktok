package kotlin.jvm.internal;

import X.AbstractC46064I6a;
import X.AbstractC65781Prl;
import X.C42016GeK;
import X.C42018GeM;
import X.C44384HbQ;
import X.C46084I6u;
import X.C68322mC;
import X.C76800UCe;
import X.C82622Wbi;
import X.I61;
import X.InterfaceC153045zY;
import X.InterfaceC46045I5h;
import X.InterfaceC65784Pro;
import X.WM7;
import X.WMH;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AqS38S0210000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS38S0210000_7 aqS38S0210000_7) {
        boolean z;
        float f;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((AbstractC46064I6a) aqS38S0210000_7.l0).LJJLJLI().LIZLLL;
        if (multiEditVideoStatusRecordData != null) {
            multiEditVideoStatusRecordData.isLibraryMode = aqS38S0210000_7.z2;
        }
        EditAdjustClipsBottomViewModel LJJLIIJ = ((AbstractC46064I6a) aqS38S0210000_7.l0).LJJLIIJ();
        boolean z2 = aqS38S0210000_7.z2;
        LJJLIIJ.getClass();
        LJJLIIJ.setStateImmediate(new AqS12S0010000_7(z2, 10));
        ((AbstractC46064I6a) aqS38S0210000_7.l0).LJLJJLL().U2(false, false, false);
        InterfaceC153045zY interfaceC153045zY = ((AbstractC46064I6a) aqS38S0210000_7.l0).LJLLJ;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.LJJIJLIJ(false);
        }
        ((AbstractC46064I6a) aqS38S0210000_7.l0).LLJJIJIL();
        ((AbstractC46064I6a) aqS38S0210000_7.l0).WW(false);
        AbstractC46064I6a abstractC46064I6a = (AbstractC46064I6a) aqS38S0210000_7.l0;
        if (abstractC46064I6a.LLIIJI == null || (!abstractC46064I6a.LJJLJLI().LIZIZ && aqS38S0210000_7.z2)) {
            I61 LJJLJLI = ((AbstractC46064I6a) aqS38S0210000_7.l0).LJJLJLI();
            if (((AbstractC46064I6a) aqS38S0210000_7.l0).LJJLJLI().LIZIZ || aqS38S0210000_7.z2) {
                z = true;
            } else {
                z = false;
            }
            LJJLJLI.LIZIZ = z;
            AbstractC46064I6a abstractC46064I6a2 = (AbstractC46064I6a) aqS38S0210000_7.l0;
            C46084I6u c46084I6u = abstractC46064I6a2.LLIIJI;
            if (c46084I6u != null && abstractC46064I6a2.LJLJJI.isAdded(c46084I6u)) {
                AbstractC46064I6a abstractC46064I6a3 = (AbstractC46064I6a) aqS38S0210000_7.l0;
                WMH wmh = abstractC46064I6a3.LJLJJI;
                C46084I6u c46084I6u2 = abstractC46064I6a3.LLIIJI;
                if (c46084I6u2 != null) {
                    wmh.remove(c46084I6u2);
                } else {
                    o.LJIJI(WM7.SCENE_SERVICE);
                    throw null;
                }
            }
            ((AbstractC46064I6a) aqS38S0210000_7.l0).LJLLLLLL = false;
            AbstractC46064I6a abstractC46064I6a4 = (AbstractC46064I6a) aqS38S0210000_7.l0;
            C82622Wbi LJJLIIIJILLIZJL = C44384HbQ.LJJLIIIJILLIZJL((AbstractC46064I6a) aqS38S0210000_7.l0);
            if (LJJLIIIJILLIZJL != null) {
                C46084I6u c46084I6u3 = new C46084I6u(LJJLIIIJILLIZJL);
                AbstractC46064I6a abstractC46064I6a5 = (AbstractC46064I6a) aqS38S0210000_7.l0;
                abstractC46064I6a5.LJLJJI.add(abstractC46064I6a5.LJLJJL, c46084I6u3, "EditAdjustClipsRootScene");
                abstractC46064I6a4.LLIIJI = c46084I6u3;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ((AbstractC46064I6a) aqS38S0210000_7.l0).LLLJ();
        ((AbstractC46064I6a) aqS38S0210000_7.l0).LJJLL().LJIILJJIL(new AqS157S0100000_7((AbstractC46064I6a) aqS38S0210000_7.l0, 207), true);
        ((AbstractC46064I6a) aqS38S0210000_7.l0).LJJLL().LIZIZ();
        EditAdjustClipsBottomViewModel LJJLIIJ2 = ((AbstractC46064I6a) aqS38S0210000_7.l0).LJJLIIJ();
        InterfaceC46045I5h interfaceC46045I5h = ((AbstractC46064I6a) aqS38S0210000_7.l0).LJLLL;
        if (interfaceC46045I5h != null) {
            f = interfaceC46045I5h.getSelectedTime();
        } else {
            f = 0.0f;
        }
        LJJLIIJ2.Pv0(f);
        AbstractC46064I6a abstractC46064I6a6 = (AbstractC46064I6a) aqS38S0210000_7.l0;
        C46084I6u c46084I6u4 = abstractC46064I6a6.LLIIJI;
        if (c46084I6u4 != null) {
            c46084I6u4.LLJJ(true, new AqS154S0200000_7(abstractC46064I6a6, (AbstractC46064I6a) aqS38S0210000_7.l1, (InterfaceC65784Pro<C76800UCe>) 30));
            ((AbstractC46064I6a) aqS38S0210000_7.l0).LLILZIL();
            return C76800UCe.LIZ;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public static final Object invoke$1(AqS38S0210000_7 aqS38S0210000_7) {
        int i;
        boolean z = true;
        if (aqS38S0210000_7.z2) {
            ExpandedTitleModule expandedTitleModule = (ExpandedTitleModule) aqS38S0210000_7.l0;
            expandedTitleModule.LLILLJJLI = false;
            expandedTitleModule.LJLLLLLL.setForbidScroll(true);
            ((ExpandedTitleModule) aqS38S0210000_7.l0).LJIIIIZZ(false);
        } else {
            ((ExpandedTitleModule) aqS38S0210000_7.l0).LJIIIIZZ(true);
            View view = ((ExpandedTitleModule) aqS38S0210000_7.l0).LJLZ;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        if (!C42016GeK.LIZ() && !C42018GeM.LIZ()) {
            ExpandedTitleModule expandedTitleModule2 = (ExpandedTitleModule) aqS38S0210000_7.l0;
            MutableLiveData<Integer> mutableLiveData = expandedTitleModule2.LLILLL.LJLIL;
            if (expandedTitleModule2.LLJ == 1) {
                i = R.string.pik;
            } else {
                i = R.string.egs;
            }
            mutableLiveData.setValue(Integer.valueOf(i));
        }
        ExpandedTitleModule expandedTitleModule3 = (ExpandedTitleModule) aqS38S0210000_7.l0;
        MutableLiveData<Boolean> mutableLiveData2 = expandedTitleModule3.LLILLL.LJLILLLLZI;
        if (expandedTitleModule3.LLJ != 1) {
            z = false;
        }
        mutableLiveData2.setValue(Boolean.valueOf(z));
        ((InterfaceC65784Pro) ((C68322mC) aqS38S0210000_7.l1).element).invoke();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS38S0210000_7(AbstractC46064I6a abstractC46064I6a, AbstractC46064I6a abstractC46064I6a2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = abstractC46064I6a;
        this.z2 = abstractC46064I6a2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS38S0210000_7(boolean z, boolean z2, ExpandedTitleModule expandedTitleModule, C68322mC<InterfaceC65784Pro<C76800UCe>> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = expandedTitleModule;
    }
}
