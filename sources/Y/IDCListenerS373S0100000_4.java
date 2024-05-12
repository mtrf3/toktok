package Y;

import X.C19K;
import X.C253009wO;
import X.C27354AoQ;
import X.C28111B1n;
import X.C70929Rsb;
import X.C70930Rsc;
import X.C78946Uyc;
import X.C9UE;
import X.InterfaceC27330Ao2;
import X.K5T;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import com.ss.android.ugc.aweme.anchor.AddAnchorAssem;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.fragment.AddOrModifyKeywordFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity;
import com.ss.android.ugc.aweme.topic.trendingtopic.ui.VideoTrendingTopicHeaderAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS2S2100100_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCListenerS373S0100000_4 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            case 2:
                onFocusChange$2(this, view, z);
                return;
            case 3:
                onFocusChange$3(this, view, z);
                return;
            case 4:
                onFocusChange$4(this, view, z);
                return;
            case 5:
                onFocusChange$5(this, view, z);
                return;
            case 6:
                onFocusChange$6(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS373S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(IDCListenerS373S0100000_4 iDCListenerS373S0100000_4, View view, boolean z) {
        if (z) {
            ((C28111B1n) iDCListenerS373S0100000_4.l0).LIZJ();
            ((C28111B1n) iDCListenerS373S0100000_4.l0).getOnErrorClear().invoke();
        } else {
            String invoke = ((C28111B1n) iDCListenerS373S0100000_4.l0).getOnVerify().invoke(((C28111B1n) iDCListenerS373S0100000_4.l0).getValue());
            if (invoke == null) {
                return;
            }
            ((C28111B1n) iDCListenerS373S0100000_4.l0).LJ(new C253009wO(invoke, null, false, 6));
        }
    }

    public static final void onFocusChange$1(IDCListenerS373S0100000_4 iDCListenerS373S0100000_4, View view, boolean z) {
        if (!z) {
            ((AddOrModifyKeywordFragment) iDCListenerS373S0100000_4.l0).R7();
        }
    }

    public static final void onFocusChange$2(IDCListenerS373S0100000_4 iDCListenerS373S0100000_4, View view, boolean z) {
        if (z) {
            ((VideoTrendingTopicHeaderAssem) iDCListenerS373S0100000_4.l0).getContainerView().findViewById(R.id.izh).setVisibility(0);
            View view2 = ((VideoTrendingTopicHeaderAssem) iDCListenerS373S0100000_4.l0).LJLILLLLZI;
            if (view2 != null) {
                view2.setVisibility(0);
                View view3 = ((VideoTrendingTopicHeaderAssem) iDCListenerS373S0100000_4.l0).LJLJI;
                if (view3 != null) {
                    view3.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("searchBtn");
                    throw null;
                }
            }
            o.LJIJI("closeBtn");
            throw null;
        }
    }

    public static final void onFocusChange$3(IDCListenerS373S0100000_4 iDCListenerS373S0100000_4, View v, boolean z) {
        String str;
        if (!z) {
            ((C27354AoQ) iDCListenerS373S0100000_4.l0).LJLILLLLZI.LIZ();
        }
        C27354AoQ c27354AoQ = (C27354AoQ) iDCListenerS373S0100000_4.l0;
        for (InterfaceC27330Ao2 interfaceC27330Ao2 : c27354AoQ.LJLIL) {
            o.LJIIIIZZ(v, "v");
            Editable text = ((C19K) c27354AoQ.LIZIZ(R.id.jdi)).getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            interfaceC27330Ao2.eh(v, str, z);
        }
    }

    public static final void onFocusChange$4(IDCListenerS373S0100000_4 iDCListenerS373S0100000_4, View view, boolean z) {
        if (!z) {
            C9UE.LIZ((LinkAnchorAddActivity) iDCListenerS373S0100000_4.l0, view);
        }
    }

    public static final void onFocusChange$5(IDCListenerS373S0100000_4 iDCListenerS373S0100000_4, View view, boolean z) {
        if (!z) {
            C9UE.LIZ(((AddAnchorAssem) iDCListenerS373S0100000_4.l0).getContext(), view);
        }
    }

    public static final void onFocusChange$6(IDCListenerS373S0100000_4 iDCListenerS373S0100000_4, View view, boolean z) {
        String str;
        int i;
        String str2;
        Editable text = ((K5T) ((DistrictFragment) iDCListenerS373S0100000_4.l0)._$_findCachedViewById(R.id.jdg)).getEditTextView().getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        int i2 = 0;
        if (z) {
            DistrictFragment districtFragment = (DistrictFragment) iDCListenerS373S0100000_4.l0;
            if (str != null) {
                i2 = str.length();
            }
            districtFragment.LL = i2;
            ((DistrictFragment) iDCListenerS373S0100000_4.l0).LJZL = SystemClock.elapsedRealtime();
            View view2 = ((DistrictFragment) iDCListenerS373S0100000_4.l0).getView();
            if (view2 != null) {
                C78946Uyc.LJJIIJ(view2, new C70929Rsb(), null);
                return;
            }
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        DistrictFragment districtFragment2 = (DistrictFragment) iDCListenerS373S0100000_4.l0;
        long j = elapsedRealtime - districtFragment2.LJZL;
        if (str != null) {
            i = str.length();
        } else {
            i = -districtFragment2.LL;
        }
        if (i > 0) {
            str2 = "add";
        } else if (i < 0) {
            str2 = "del";
        } else {
            str2 = "";
        }
        View view3 = ((DistrictFragment) iDCListenerS373S0100000_4.l0).getView();
        if (view3 != null) {
            C78946Uyc.LJJIIJ(view3, new C70930Rsc(), new AqS2S2100100_4(j, str2, str, (DistrictFragment) iDCListenerS373S0100000_4.l0, 1));
        }
        ((DistrictFragment) iDCListenerS373S0100000_4.l0).LLD = false;
    }
}
