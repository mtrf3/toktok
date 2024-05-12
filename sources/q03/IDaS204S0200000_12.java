package q03;

import X.AbstractC70204Rgu;
import X.C113554cx;
import X.C78897Uxp;
import X.C98T;
import X.InterfaceC88471Ynr;
import X.OSZ;
import X.TD3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDaS204S0200000_12 extends C98T {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDaS204S0200000_12 iDaS204S0200000_12, View view) {
        if (view != null) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDaS204S0200000_12.l0;
            AbstractC70204Rgu abstractC70204Rgu = (AbstractC70204Rgu) iDaS204S0200000_12.l1;
            interfaceC88471Ynr.invoke(abstractC70204Rgu, abstractC70204Rgu.getNavButton());
        }
    }

    public static final void LIZ$1(IDaS204S0200000_12 iDaS204S0200000_12, View view) {
        if (view != null) {
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("creation_id", ((TD3) iDaS204S0200000_12.l0).LJZ.LJI());
            oszArr[1] = new OSZ("enter_from", ((TD3) iDaS204S0200000_12.l0).LJZ.enterFrom);
            String str = ((TD3) iDaS204S0200000_12.l0).LJZ.shootWay;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            oszArr[2] = new OSZ("shoot_way", str);
            C78897Uxp.LJJJ("advanced_mobile_effect_create_entry_click", C113554cx.LJJL(oszArr));
            C78897Uxp.LJJJ("advanced_mobile_editor_open", C113554cx.LJJL(new OSZ("is_pro_template", CardStruct.IStatusCode.DEFAULT), new OSZ("is_h5_entry", CardStruct.IStatusCode.DEFAULT), new OSZ("enter_from", ((TD3) iDaS204S0200000_12.l0).LJZ.enterFrom)));
            IEffectCreatorService LJIIJ = EffectCreatorServiceImpl.LJIIJ();
            Context context = ((ViewGroup) iDaS204S0200000_12.l1).getContext();
            o.LJIIIIZZ(context, "parent.context");
            ShortVideoContext shortVideoContext = ((TD3) iDaS204S0200000_12.l0).LJZ;
            String str3 = shortVideoContext.enterFrom;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = shortVideoContext.shootWay;
            if (str4 != null) {
                str2 = str4;
            }
            String LJI = shortVideoContext.LJI();
            o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
            LJIIJ.LJIIIIZZ("shootpage_create", str3, str2, LJI, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS204S0200000_12(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
