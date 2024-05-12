package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C107074Id;
import X.C109544Rq;
import X.C3L4;
import X.C4LX;
import X.C4T8;
import X.C63540Owi;
import X.C76800UCe;
import X.C87303bi;
import X.C88913eJ;
import X.C97383ry;
import X.InterfaceC88472Yns;
import X.InterfaceC99673vf;
import X.ORZ;
import X.Q8U;
import Y.ARunnableS4S0201000_1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AqS52S0201000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(IMUser it) {
        o.LJIIIZ(it, "it");
        ((C3L4) this.l0).LJLJI = it.getAvatarThumb();
        ((C3L4) this.l0).LJLJJI = it.getDisplayName();
        C3L4 c3l4 = (C3L4) this.l0;
        if (c3l4.LJLJLLL == 15) {
            String LIZ = C88913eJ.LIZ(((SessionListViewHolder) this.l1).itemView, R.string.h8t, "itemView.context.getStri…ay_hello_tips_to_someone)");
            Object[] objArr = new Object[1];
            String displayName = it.getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            objArr[0] = displayName;
            c3l4.LJLJJL = Q8U.LIZIZ(objArr, 1, LIZ, "format(format, *args)");
        }
        SessionListViewHolder sessionListViewHolder = (SessionListViewHolder) this.l1;
        sessionListViewHolder.itemView.post(new ARunnableS4S0201000_1(this.i2, sessionListViewHolder, (C3L4) this.l0, 3));
    }

    public static final Object invoke$0(AqS52S0201000_1 aqS52S0201000_1, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C87303bi((List) aqS52S0201000_1.l0, aqS52S0201000_1.i2, (Integer) aqS52S0201000_1.l1);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS52S0201000_1 aqS52S0201000_1, Object obj) {
        aqS52S0201000_1.invoke$0((IMUser) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS52S0201000_1 aqS52S0201000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.x6((List) aqS52S0201000_1.l0, aqS52S0201000_1.i2, (C107074Id) aqS52S0201000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS52S0201000_1 aqS52S0201000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.m4(aqS52S0201000_1.i2, (C109544Rq) aqS52S0201000_1.l0, (C63540Owi) aqS52S0201000_1.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS52S0201000_1 aqS52S0201000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.X8((Map) aqS52S0201000_1.l1, aqS52S0201000_1.i2, (List) aqS52S0201000_1.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS52S0201000_1 aqS52S0201000_1, Object obj) {
        C4T8 setState = (C4T8) obj;
        o.LJIIIZ(setState, "$this$setState");
        List LLJILJILJ = ORZ.LLJILJILJ(((C4T8) aqS52S0201000_1.l0).LJLJJL);
        ListProtector.set(LLJILJILJ, aqS52S0201000_1.i2, (C97383ry) aqS52S0201000_1.l1);
        return C4T8.L(setState, null, null, null, null, LLJILJILJ, false, 47);
    }

    public static final Object invoke$6(AqS52S0201000_1 aqS52S0201000_1, Object obj) {
        C4T8 state = (C4T8) obj;
        o.LJIIIZ(state, "state");
        ((MessageRequestViewModel) aqS52S0201000_1.l0).setState(new AqS52S0201000_1(state, aqS52S0201000_1.i2, (C97383ry) aqS52S0201000_1.l1, 5));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0201000_1(int i, C109544Rq c109544Rq, C63540Owi c63540Owi, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c109544Rq;
        this.l1 = c63540Owi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0201000_1(int i, SessionListViewHolder sessionListViewHolder, C3L4 c3l4, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c3l4;
        this.l1 = sessionListViewHolder;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0201000_1(C4T8 c4t8, int i, C97383ry c97383ry, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c4t8;
        this.i2 = i;
        this.l1 = c97383ry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0201000_1(MessageRequestViewModel messageRequestViewModel, int i, C97383ry c97383ry, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = messageRequestViewModel;
        this.i2 = i;
        this.l1 = c97383ry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS52S0201000_1(List list, List<C109544Rq> list2, int i, C107074Id c107074Id) {
        super(1);
        this.$t = c107074Id;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS52S0201000_1(List list, List<String> list2, int i, Integer num) {
        super(1);
        this.$t = num;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0201000_1(Map map, int i, List list, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = list;
        this.l1 = map;
        this.i2 = i;
    }
}
