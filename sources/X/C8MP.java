package X;

import Y.AObserverS71S0100000_3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.8MP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MP {
    public static final <T> void LIZ(C8MQ c8mq, String str, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns) {
        EventCenter eventCenter;
        o.LJIIIZ(c8mq, "<this>");
        KRA LIZIZ = c8mq.a1().LIZIZ();
        if (LIZIZ != null && (eventCenter = LIZIZ.LIZIZ) != null) {
            eventCenter.iv0(str, new AObserverS71S0100000_3(interfaceC88472Yns, 53), false);
        }
    }

    public static final void LIZIZ(BaseCellSlotComponent baseCellSlotComponent, String str, Aweme aweme) {
        EventCenter eventCenter;
        o.LJIIIZ(baseCellSlotComponent, "<this>");
        KRA LIZIZ = baseCellSlotComponent.a1().LIZIZ();
        if (LIZIZ != null && (eventCenter = LIZIZ.LIZIZ) != null) {
            eventCenter.lv0(baseCellSlotComponent, str, aweme);
        }
    }
}
