package kotlin.jvm.internal;

import X.AbstractC274515x;
import X.AbstractC39201gK;
import X.AbstractC65781Prl;
import X.C0K2;
import X.C0NP;
import X.C0UT;
import X.C0VG;
import X.C0Z4;
import X.C0Z8;
import X.C14770i1;
import X.C18610oD;
import X.C18830oZ;
import X.C23Q;
import X.C30868C9o;
import X.C51171zd;
import X.C523423q;
import X.C76800UCe;
import X.EnumC23500w6;
import X.InterfaceC272715f;
import X.InterfaceC44861pS;
import X.InterfaceC74834TYo;
import X.InterfaceC88472Yns;
import X.O6R;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes.dex */
public class IDqS0S0301000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS0S0301000 iDqS0S0301000, Object obj) {
        ViolationStatusResponse.ResponseData responseData = (ViolationStatusResponse.ResponseData) obj;
        if (responseData == null || responseData.status == 0 || responseData == null || (responseData.perceptionDialog == null && (responseData == null || responseData.punishEvent == null))) {
            C30868C9o.LIZJ(R.string.nfo);
        } else {
            Context context = (Context) iDqS0S0301000.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) iDqS0S0301000.l1;
            InterfaceC74834TYo interfaceC74834TYo = (InterfaceC74834TYo) iDqS0S0301000.l2;
            int i = iDqS0S0301000.i3;
            if (responseData != null) {
                PerceptionDialogInfo perceptionDialogInfo = responseData.perceptionDialog;
                if (perceptionDialogInfo != null) {
                    C0NP.LIZLLL(perceptionDialogInfo, context, lifecycleOwner, interfaceC74834TYo, null, new IDqS11S0101000(responseData, i, 2), 88);
                }
            } else {
                C0K2.LIZ("on live suspended, but get no perception info ....", new IllegalStateException("on live suspended, but get no perception info ...."));
            }
            DataChannelGlobal.LJLJJI.rv0(MultiGuestLiveSuspended.class);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS0S0301000 iDqS0S0301000, Object obj) {
        InterfaceC272715f searchBeyondBounds = (InterfaceC272715f) obj;
        o.LJIIIZ(searchBeyondBounds, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(C0Z4.LJ((C51171zd) iDqS0S0301000.l0, (C51171zd) iDqS0S0301000.l1, iDqS0S0301000.i3, (InterfaceC88472Yns) iDqS0S0301000.l2));
        if (valueOf.booleanValue() || !searchBeyondBounds.LIZ()) {
            return valueOf;
        }
        return null;
    }

    public static final Object invoke$2(IDqS0S0301000 iDqS0S0301000, Object obj) {
        InterfaceC272715f searchBeyondBounds = (InterfaceC272715f) obj;
        o.LJIIIZ(searchBeyondBounds, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(C0Z8.LJII((C51171zd) iDqS0S0301000.l0, (C51171zd) iDqS0S0301000.l1, iDqS0S0301000.i3, (InterfaceC88472Yns) iDqS0S0301000.l2));
        if (valueOf.booleanValue() || !searchBeyondBounds.LIZ()) {
            return valueOf;
        }
        return null;
    }

    public static final Object invoke$3(IDqS0S0301000 iDqS0S0301000, Object obj) {
        C0VG c0vg;
        boolean z;
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        InterfaceC44861pS interfaceC44861pS = (InterfaceC44861pS) iDqS0S0301000.l0;
        C23Q c23q = (C23Q) iDqS0S0301000.l1;
        int i = c23q.LJLILLLLZI;
        C14770i1 c14770i1 = c23q.LJLJI;
        C18830oZ invoke = c23q.LJLJJI.invoke();
        if (invoke != null) {
            c0vg = invoke.LIZ;
        } else {
            c0vg = null;
        }
        if (((InterfaceC44861pS) iDqS0S0301000.l0).getLayoutDirection() == EnumC23500w6.Rtl) {
            z = true;
        } else {
            z = false;
        }
        ((C23Q) iDqS0S0301000.l1).LJLIL.LIZIZ(C0UT.Horizontal, C18610oD.LIZ(interfaceC44861pS, i, c14770i1, c0vg, z, ((AbstractC39201gK) iDqS0S0301000.l2).LJLIL), iDqS0S0301000.i3, ((AbstractC39201gK) iDqS0S0301000.l2).LJLIL);
        AbstractC274515x.LJI(layout, (AbstractC39201gK) iDqS0S0301000.l2, O6R.LJJIIZ(-((C23Q) iDqS0S0301000.l1).LJLIL.LIZ()), 0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS0S0301000 iDqS0S0301000, Object obj) {
        C0VG c0vg;
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        InterfaceC44861pS interfaceC44861pS = (InterfaceC44861pS) iDqS0S0301000.l0;
        C523423q c523423q = (C523423q) iDqS0S0301000.l1;
        int i = c523423q.LJLILLLLZI;
        C14770i1 c14770i1 = c523423q.LJLJI;
        C18830oZ invoke = c523423q.LJLJJI.invoke();
        if (invoke != null) {
            c0vg = invoke.LIZ;
        } else {
            c0vg = null;
        }
        ((C523423q) iDqS0S0301000.l1).LJLIL.LIZIZ(C0UT.Vertical, C18610oD.LIZ(interfaceC44861pS, i, c14770i1, c0vg, false, ((AbstractC39201gK) iDqS0S0301000.l2).LJLIL), iDqS0S0301000.i3, ((AbstractC39201gK) iDqS0S0301000.l2).LJLILLLLZI);
        AbstractC274515x.LJI(layout, (AbstractC39201gK) iDqS0S0301000.l2, 0, O6R.LJJIIZ(-((C523423q) iDqS0S0301000.l1).LJLIL.LIZ()));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0301000(InterfaceC44861pS interfaceC44861pS, C23Q c23q, AbstractC39201gK abstractC39201gK, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC44861pS;
        this.l1 = c23q;
        this.l2 = abstractC39201gK;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0301000(InterfaceC44861pS interfaceC44861pS, C523423q c523423q, AbstractC39201gK abstractC39201gK, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC44861pS;
        this.l1 = c523423q;
        this.l2 = abstractC39201gK;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS0S0301000(C51171zd c51171zd, C51171zd c51171zd2, C51171zd c51171zd3, int i, InterfaceC88472Yns<? super C51171zd, Boolean> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = c51171zd;
        this.l1 = c51171zd2;
        this.i3 = c51171zd3;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0301000(Context context, LifecycleOwner lifecycleOwner, InterfaceC74834TYo interfaceC74834TYo, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = context;
        this.l1 = lifecycleOwner;
        this.l2 = interfaceC74834TYo;
        this.i3 = i;
    }
}
