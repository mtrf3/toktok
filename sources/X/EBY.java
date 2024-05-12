package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EBY extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ C70997Rth LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBY(C70997Rth c70997Rth, String str, String str2, int i) {
        super(1);
        this.LJLIL = c70997Rth;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams update = laneParams;
        o.LJIIIZ(update, "$this$update");
        update.plusAssign(WM7.SCENE_SERVICE, EBZ.SCHEMA.getValue());
        update.plusAssign("rule", this.LJLIL.LJIIIIZZ);
        String str = this.LJLILLLLZI;
        if (str != null) {
            update.plusAssign("source", str);
        }
        String str2 = this.LJLJI;
        if (str2 != null) {
            update.plusAssign("path", str2);
        }
        update.plusAssign("type", Integer.valueOf(this.LJLJJI));
        return C76800UCe.LIZ;
    }
}
