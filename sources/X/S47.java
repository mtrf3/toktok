package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S47 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final /* synthetic */ USAddonOrderVH LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S47(USAddonOrderVH uSAddonOrderVH) {
        super(2);
        this.LJLIL = uSAddonOrderVH;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object selectSubscribe, Object obj) {
        EnumC26795AfP state = (EnumC26795AfP) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        if (C27747Aul.LIZ[state.ordinal()] == 1) {
            TuxTextView tuxTextView = (TuxTextView) this.LJLIL.LJLIL.findViewById(R.id.wy);
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.gp);
            }
            Iterator it = ((LinkedHashMap) this.LJLIL.LJLLILLLL).entrySet().iterator();
            while (it.hasNext()) {
                S48 s48 = (S48) ((Map.Entry) it.next()).getValue();
                if (s48 != null) {
                    s48.LJLJJI.setTextColorRes(R.attr.gp);
                    s48.LJLJJL.setTextColorRes(R.attr.gp);
                    s48.LJLJL.setTextColorRes(R.attr.gp);
                    s48.LJLILLLLZI.setClickable(false);
                    s48.LJLJJLL.setClickable(false);
                    s48.LJLJJLL.setOnTouchListener(S4E.LJLIL);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
