package X;

import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Bb1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29071Bb1 extends AbstractC65781Prl implements InterfaceC88472Yns<SparkContext, C76800UCe> {
    public final /* synthetic */ C29068Bay LJLIL;
    public final /* synthetic */ LiveGoalPinCardWidget LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29071Bb1(C29068Bay c29068Bay, LiveGoalPinCardWidget liveGoalPinCardWidget, long j) {
        super(1);
        this.LJLIL = c29068Bay;
        this.LJLILLLLZI = liveGoalPinCardWidget;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        o.LJIIIZ(sparkContext2, "sparkContext");
        String str = this.LJLIL.LJI;
        if (str == null) {
            str = "";
        }
        sparkContext2.LJJIIJ("content_info", str);
        sparkContext2.LJJI(new C29072Bb2(this.LJLJI, this.LJLILLLLZI));
        sparkContext2.LJIJJ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
