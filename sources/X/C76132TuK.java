package X;

import android.animation.ValueAnimator;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TuK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76132TuK extends AbstractC76131TuJ {
    public static final C76132TuK LJLJJLL = new C76132TuK();

    public static void LJJIII(InterfaceC76134TuM interfaceC76134TuM) {
        ValueAnimator LJJJI = interfaceC76134TuM.LJJJI();
        if (LJJJI != null) {
            LJJJI.cancel();
        }
    }

    public static final void LJJIIZI(InterfaceC76134TuM interfaceC76134TuM) {
        AbstractC76856UEi abstractC76856UEi = (AbstractC76856UEi) interfaceC76134TuM;
        C47061t0 LJJLIL = abstractC76856UEi.LJJLIL();
        if (LJJLIL != null) {
            LJJLIL.setVisibility(0);
        }
        C47061t0 LJLLLLLL = abstractC76856UEi.LJLLLLLL();
        if (LJLLLLLL != null) {
            LJLLLLLL.setVisibility(0);
        }
        C15620jO.LIZ(abstractC76856UEi.LJJLIL(), R.drawable.d5s);
        C15490jB.LJ(abstractC76856UEi.LJLLLLLL(), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_item_rank_top_on_going_hd.webp");
    }

    public final void LJJIIJZLJL(InterfaceC76134TuM viewHolder, C75981Trt data) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(data, "data");
        LJJIIJ(viewHolder, data, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        if (r1 <= r8) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ(X.InterfaceC76134TuM r14, X.C75981Trt r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76132TuK.LJJIIJ(X.TuM, X.Trt, boolean):void");
    }

    @Override // X.C78948Uye
    public final /* bridge */ /* synthetic */ void LJIJI(InterfaceC75966Tre interfaceC75966Tre, InterfaceC28306B9a interfaceC28306B9a, int i) {
        LJJIIJZLJL((InterfaceC76134TuM) interfaceC75966Tre, (C75981Trt) interfaceC28306B9a);
    }

    public final void LJJIIZ(InterfaceC76134TuM viewHolder, C75981Trt data, int i, List<Object> payloads) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.size() <= 0) {
            LJJIIJZLJL(viewHolder, data);
        } else {
            LJJIIJ(viewHolder, data, true);
        }
    }
}
