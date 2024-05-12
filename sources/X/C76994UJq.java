package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkVoiceChatAudienceContainerSwitchSetting;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.UJq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76994UJq extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76994UJq(C1O4 elementContext) {
        super(elementContext);
        o.LJIIIZ(elementContext, "elementContext");
        MultiElementSpecImplKt.element(this, R.id.cww);
        MultiElementSpecImplKt.element(this, R.id.aiy);
        MultiElementSpecImplKt.element(this, R.id.aiw);
        MultiElementSpecImplKt.element(this, R.id.epk);
        MultiElementSpecImplKt.element(this, R.id.hql);
        if (LivesdkVoiceChatAudienceContainerSwitchSetting.INSTANCE.userInteractAnchorContainer()) {
            MultiElementSpecImplKt.element(this, R.id.h3c);
            MultiElementSpecImplKt.element(this, R.id.kq4);
            UKC.LIZ(this, R.id.he7);
        } else {
            UKC.LIZ(this, R.id.he7);
            MultiElementSpecImplKt.element(this, R.id.h3c);
            MultiElementSpecImplKt.element(this, R.id.kq4);
        }
        MultiElementSpecImplKt.groupableElement(this, R.id.eq5, UK8.LJLIL);
        UKC.LIZ(this, R.id.ch5);
        UKC.LIZ(this, R.id.fvv);
        UKC.LIZ(this, R.id.fzm);
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.e7d);
        elementSpecImpl.addSceneObserver(new C76996UJs());
        elementSpecImpl.addSceneObserver(new C76990UJm());
        elementSpecImpl.addSceneObserver(new C76998UJu(elementContext, elementSpecImpl));
        ElementSpecImplKt.onAttach(elementSpecImpl, new AqS171S0100000_5(elementContext, 1));
        registerElement(elementSpecImpl);
        UK5 uk5 = new UK5(R.id.dpg);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS160S0200000_13(elementContext, C221108m2.LIZIZ(new AqS155S0100000_5(elementContext, 0)), 0));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS155S0100000_5(elementContext, 1));
        uk5.addSceneObserver(new C76993UJp(LIZIZ));
        uk5.addSceneObserver(new C76992UJo(elementContext, LIZIZ2));
        uk5.addSceneObserver(new C76991UJn(elementContext, LIZIZ, LIZIZ2, new C68322mC()));
        registerElement(uk5);
        UKC.LIZ(this, R.id.fdl);
    }
}
