package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wad, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C82555Wad implements InterfaceC88472Yns {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        C76800UCe lambda$continueAfterWidgetLoaded$9;
        BKJ bkj;
        List<? extends InterfaceC82548WaW> arrayList;
        String str;
        MvThemeData mvThemeData;
        int i = 0;
        switch (this.LJLIL) {
            case 0:
                Integer num = (Integer) obj;
                BKP bkp = ((LiveRoomFragment) this.LJLILLLLZI).LLIIII;
                if (bkp != null && (bkj = bkp.LJLILLLLZI) != null) {
                    bkj.t7(num.intValue());
                }
                return null;
            case 1:
                lambda$continueAfterWidgetLoaded$9 = ((AbsAudienceInteractionFragment) this.LJLILLLLZI).lambda$continueAfterWidgetLoaded$9((Boolean) obj);
                return lambda$continueAfterWidgetLoaded$9;
            case 2:
                Long l = (Long) obj;
                Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = ((LiveNewGiftPanelWidget) this.LJLILLLLZI).LJLJLLL.LJLJL.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().LIZJ() != l.longValue()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                return Integer.valueOf(i);
            case 3:
                return MainServiceImpl.lambda$registerModerationResultPush$2((InterfaceC88472Yns) this.LJLILLLLZI, (String) obj);
            default:
                C82552Waa c82552Waa = (C82552Waa) this.LJLILLLLZI;
                List list = (List) obj;
                c82552Waa.getClass();
                if (C77413UZt.LJIILL(list)) {
                    c82552Waa.LJFF();
                } else {
                    Effect effect = c82552Waa.LJLJJLL;
                    if (effect != null && !TextUtils.isEmpty(effect.getEffectId())) {
                        Effect enterEffect = c82552Waa.LJLJJLL;
                        o.LJIIIZ(list, "<this>");
                        o.LJIIIZ(enterEffect, "enterEffect");
                        arrayList = ORZ.LLJILJILJ(list);
                        ArrayList arrayList2 = (ArrayList) arrayList;
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                InterfaceC82548WaW interfaceC82548WaW = (InterfaceC82548WaW) next;
                                if (interfaceC82548WaW.LJII() == EnumC43998HOo.MV_TEMPLATE) {
                                    if ((interfaceC82548WaW instanceof MvThemeData) && (mvThemeData = (MvThemeData) interfaceC82548WaW) != null) {
                                        str = mvThemeData.LJIIJJI();
                                    } else {
                                        str = null;
                                    }
                                    if (o.LJ(str, enterEffect.getEffectId())) {
                                        if (next != null) {
                                            arrayList2.remove(next);
                                            ListProtector.add(arrayList, 0, next);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!TextUtils.isEmpty(c82552Waa.LJLJL)) {
                        String enterCutSameId = c82552Waa.LJLJL;
                        o.LJIIIZ(list, "<this>");
                        o.LJIIIZ(enterCutSameId, "enterCutSameId");
                        arrayList = ORZ.LLJILJILJ(list);
                        ArrayList arrayList3 = (ArrayList) arrayList;
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                InterfaceC82548WaW interfaceC82548WaW2 = (InterfaceC82548WaW) next2;
                                if (interfaceC82548WaW2.LJII() == EnumC43998HOo.CUT_SAME && o.LJ(interfaceC82548WaW2.LIZIZ(), enterCutSameId)) {
                                    if (next2 != null) {
                                        arrayList3.remove(next2);
                                        ListProtector.add(arrayList, 0, next2);
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    C60903NvH.LJIIJJI().LJJIIJ();
                    if (c82552Waa.LJIIIIZZ()) {
                        C78855Ux9.LJLJL = "creativecloud";
                        c82552Waa.LJLJJI.LIZLLL(arrayList);
                        c82552Waa.LJLJJI.LJ();
                        c82552Waa.LJIIIZ(c82552Waa.LJLJJI.getCurTemplateId());
                    }
                }
                return null;
        }
    }

    public /* synthetic */ C82555Wad(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
