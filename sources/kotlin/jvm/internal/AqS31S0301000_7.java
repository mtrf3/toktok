package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C42303Gix;
import X.C45929I0v;
import X.C63K;
import X.C76800UCe;
import X.EnumC42282Gic;
import X.EnumC42283Gid;
import X.GGO;
import X.I1J;
import X.InterfaceC81454Vxy;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;

/* loaded from: classes8.dex */
public class AqS31S0301000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS31S0301000_7 aqS31S0301000_7, Object it) {
        o.LJIIIZ(it, "it");
        C42303Gix.LIZ(aqS31S0301000_7.i3, GGO.CLICK_CLOSE, (EnumC42283Gid) aqS31S0301000_7.l0, (EnumC42282Gic) aqS31S0301000_7.l1, ((CreativeLoadingDialogBuilder) aqS31S0301000_7.l2).getConfig().getMessage());
        ((CreativeLoadingDialogBuilder) aqS31S0301000_7.l2).getConfig().getClickCancelListener().invoke(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS31S0301000_7 aqS31S0301000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C63K) aqS31S0301000_7.l0).LJJIII();
        C45929I0v c45929I0v = (C45929I0v) aqS31S0301000_7.l1;
        CommentVideoModel commentVideoModel = (CommentVideoModel) aqS31S0301000_7.l2;
        int i = aqS31S0301000_7.i3;
        c45929I0v.LJLIIL(commentVideoModel);
        c45929I0v.Lz();
        c45929I0v.jV(commentVideoModel, c45929I0v.L10().getTabName(), "replace");
        c45929I0v.C("replace", i);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS31S0301000_7 aqS31S0301000_7, Object it) {
        o.LJIIIZ(it, "it");
        ((C63K) aqS31S0301000_7.l0).C("cancel", aqS31S0301000_7.i3);
        C45929I0v c45929I0v = (C45929I0v) aqS31S0301000_7.l1;
        c45929I0v.jV((CommentVideoModel) aqS31S0301000_7.l2, c45929I0v.L10().getTabName(), "cancel");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS31S0301000_7 aqS31S0301000_7, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC81454Vxy interfaceC81454Vxy = (InterfaceC81454Vxy) aqS31S0301000_7.l0;
        I1J i1j = (I1J) aqS31S0301000_7.l1;
        CommentVideoModel commentVideoModel = (CommentVideoModel) aqS31S0301000_7.l2;
        int i = aqS31S0301000_7.i3;
        i1j.LJLIIL(commentVideoModel);
        interfaceC81454Vxy.Lz();
        interfaceC81454Vxy.C("replace", i);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0301000_7(int i, EnumC42283Gid enumC42283Gid, EnumC42282Gic enumC42282Gic, CreativeLoadingDialogBuilder creativeLoadingDialogBuilder, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = enumC42283Gid;
        this.l1 = enumC42282Gic;
        this.l2 = creativeLoadingDialogBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0301000_7(int i, CommentVideoModel commentVideoModel, C45929I0v c45929I0v, C63K c63k, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c63k;
        this.i3 = i;
        this.l1 = c45929I0v;
        this.l2 = commentVideoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0301000_7(int i, CommentVideoModel commentVideoModel, InterfaceC81454Vxy interfaceC81454Vxy, I1J i1j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC81454Vxy;
        this.l1 = i1j;
        this.l2 = commentVideoModel;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0301000_7(C63K c63k, ARI ari, C45929I0v c45929I0v, CommentVideoModel commentVideoModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c63k;
        this.l1 = c45929I0v;
        this.l2 = commentVideoModel;
        this.i3 = i;
    }
}
