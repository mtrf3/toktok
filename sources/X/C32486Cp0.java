package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Cp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32486Cp0 extends AbstractC65781Prl implements InterfaceC88472Yns<SparkContext, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Gift LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ List<Gift> LJLJJI;
    public final /* synthetic */ User LJLJJL;
    public final /* synthetic */ C32172Cjw LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32486Cp0(String str, Gift gift, Long l, List<Gift> list, User user, C32172Cjw c32172Cjw) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = gift;
        this.LJLJI = l;
        this.LJLJJI = list;
        this.LJLJJL = user;
        this.LJLJJLL = c32172Cjw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SparkContext sparkContext) {
        C3C4 c3c4;
        C3C4 LIZ;
        C3C4 LIZ2;
        Object obj;
        SparkContext it = sparkContext;
        o.LJIIIZ(it, "it");
        C32493Cp7 c32493Cp7 = C32493Cp7.LJLIL;
        Gift gift = this.LJLILLLLZI;
        Long l = this.LJLJI;
        if (gift != null) {
            try {
                JSONObject jSONObject = new JSONObject(C09650Zl.LIZIZ.LJIILL(gift));
                if (l != null && l.longValue() >= 0) {
                    jSONObject.put("gift_box_color_id", l.longValue());
                }
                it.LJJIIZ(jSONObject, "current_gift");
                c3c4 = it;
            } catch (Throwable th) {
                c3c4 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(c3c4);
            }
        } else {
            c3c4 = null;
        }
        C3C5.m7constructorimpl(c3c4);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
        if (m10exceptionOrNullimpl != null) {
            c32493Cp7.invoke(m10exceptionOrNullimpl);
        }
        try {
            it.LJJIIZ(new JSONArray(C09650Zl.LIZIZ.LJIILL(this.LJLJJI)), "gift_list");
            C3C5.m7constructorimpl(it);
            LIZ = it;
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl2 != null) {
            c32493Cp7.invoke(m10exceptionOrNullimpl2);
        }
        try {
            it.LJJIIZ(new JSONObject(C09650Zl.LIZIZ.LJIILL(this.LJLJJL)), "to_user");
            C3C5.m7constructorimpl(it);
            LIZ2 = it;
        } catch (Throwable th3) {
            LIZ2 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl3 = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl3 != null) {
            c32493Cp7.invoke(m10exceptionOrNullimpl3);
        }
        try {
            InterfaceC32666Cru LIZ3 = C78524Uro.LIZ(this.LJLJJLL.LIZ);
            Object LJIIIZ = LIZ3.LJIIIZ(null, "GIFT_BOX_HISTORY_DATA");
            if (LJIIIZ != null) {
                it.LJJIIZ(LJIIIZ, "history_data");
            }
            Object LJIIIZ2 = LIZ3.LJIIIZ(null, "GIFT_BOX_GUIDE_SHOW");
            if (LJIIIZ2 != null) {
                it.LJJIIZ(LJIIIZ2, "show_guide");
                obj = it;
            } else {
                obj = null;
            }
            C3C5.m7constructorimpl(obj);
        } catch (Throwable th4) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th4));
        }
        C0NB.LJIIIZ("FEGiftSendPresenter", "open gift box select page : lynxUrl=" + this.LJLIL);
        return C76800UCe.LIZ;
    }
}
