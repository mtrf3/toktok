package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final /* synthetic */ class WZK extends TBS implements InterfaceC88471Ynr<Integer, AbstractC77373UYf, C76800UCe> {
    public WZK(Object obj) {
        super(2, obj, WZJ.class, "onItemClickDebounceListener", "onItemClickDebounceListener(ILcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/state/SVCSlipEffect;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, AbstractC77373UYf abstractC77373UYf) {
        int intValue = num.intValue();
        AbstractC77373UYf p1 = abstractC77373UYf;
        o.LJIIIZ(p1, "p1");
        WZJ wzj = (WZJ) this.receiver;
        WZY wzy = wzj.LJLJJL;
        if (wzj.LJLJLLL != null) {
            wzy.getClass();
            WZJ wzj2 = wzy.LIZ;
            if (!wzj2.LJLJJI.LJLILLLLZI) {
                StringBuilder LJ = C7MY.LJ("onItemViewClicked: pos = ", intValue, ", item = ");
                LJ.append(C86793Y4n.LJJIFFI(p1));
                String msg = X1D.LIZIZ(LJ);
                o.LJIIIZ(msg, "msg");
                if (C86793Y4n.LJJIIZ(p1, wzj2.LL)) {
                    RecyclerView recyclerView = wzj2.LJLJLLL;
                    if (recyclerView != null) {
                        recyclerView.LJLIL(intValue);
                    } else {
                        o.LJIJI("bottomRecyclerView");
                        throw null;
                    }
                }
                if (p1 instanceof C77374UYg) {
                    wzj2.getUiActions().LJ.invoke();
                } else {
                    wzj2.getUiActions().LJFF.invoke(Integer.valueOf(intValue), p1);
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("bottomRecyclerView");
        throw null;
    }
}
