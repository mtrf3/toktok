package X;

import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHouseEffectSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelEffectCountSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget$observeViewModel$1$1$result$1", f = "StickerShortCutWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54582Cg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StickerShortCutWidget LJLIL;
    public final /* synthetic */ AbstractC261010s<LiveEffect> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54582Cg(StickerShortCutWidget stickerShortCutWidget, AbstractC261010s<? extends LiveEffect> abstractC261010s, InterfaceC67352kd<? super C54582Cg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = stickerShortCutWidget;
        this.LJLILLLLZI = abstractC261010s;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54582Cg(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        LiveEffect liveEffect;
        LiveEffect liveEffect2;
        int i2;
        LiveEffect liveEffect3;
        C141335gf.LIZJ(obj);
        StickerShortCutWidget stickerShortCutWidget = this.LJLIL;
        List<T> list = ((C37151d1) this.LJLILLLLZI).LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LiveEffect liveEffect4 = (LiveEffect) next;
            if (!LiveEffectHouseEffectSetting.INSTANCE.shouldFilterEffectHouseEffects() || !C79004UzY.LJJI(liveEffect4)) {
                if (!C39591gx.LIZIZ(liveEffect4) && !C0LU.LIZJ(liveEffect4)) {
                    arrayList.add(next);
                }
            }
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        stickerShortCutWidget.getClass();
        C40641ie.LJLIL.getClass();
        C0WZ c0wz = C40641ie.LJLJJLL;
        if (c0wz != null && (liveEffect3 = c0wz.LIZ) != null) {
            liveEffect3.logParams.LIZ = true;
            ((ArrayList) LLJILJILJ).remove(liveEffect3);
            ListProtector.add(LLJILJILJ, 0, liveEffect3);
        }
        LiveEffect LIZ = C1HD.LIZ(LLJILJILJ);
        if (LIZ != null) {
            ((ArrayList) LLJILJILJ).remove(LIZ);
            ListProtector.add(LLJILJILJ, 0, LIZ);
        }
        List LIZJ = C40641ie.LIZJ();
        ArrayList arrayList2 = (ArrayList) LLJILJILJ;
        arrayList2.removeAll(LIZJ);
        arrayList2.addAll(0, LIZJ);
        LiveEffect LIZ2 = C0LU.LIZ(LLJILJILJ);
        if (LIZ2 != null && C0LU.LIZIZ()) {
            arrayList2.remove(LIZ2);
            ListProtector.add(LLJILJILJ, 0, LIZ2);
        }
        List<LiveEffect> subList = arrayList2.subList(0, Math.min(LiveEffectShortcutPanelEffectCountSetting.INSTANCE.getValue(), arrayList2.size()));
        StickerShortCutWidget stickerShortCutWidget2 = this.LJLIL;
        LiveEffect liveEffect5 = new LiveEffect();
        liveEffect5.setLocalViewType(C6NP.NONE);
        ListProtector.add(subList, 0, liveEffect5);
        LiveEffect liveEffect6 = stickerShortCutWidget2.LJZL;
        if (liveEffect6 != null) {
            subList.remove(liveEffect6);
            ListProtector.add(subList, 1, liveEffect6);
        }
        List LIZJ2 = C40641ie.LIZJ();
        subList.removeAll(LIZJ2);
        for (Object obj2 : LIZJ2) {
            int i3 = i + 1;
            if (i >= 0) {
                if (ORZ.LJLJJI(stickerShortCutWidget2.LJZL, LIZJ2)) {
                    i2 = i3;
                } else {
                    i2 = i + 2;
                }
                ListProtector.add(subList, i2, obj2);
                i = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (!ORZ.LJLJJI(stickerShortCutWidget2.LJLJL, subList) && (liveEffect2 = stickerShortCutWidget2.LJLJL) != null) {
            subList.add(liveEffect2);
        }
        if (stickerShortCutWidget2.LJLJL == null && !ORZ.LJLJJI(stickerShortCutWidget2.LJLLLL, subList) && (liveEffect = stickerShortCutWidget2.LJLLLL) != null) {
            subList.add(liveEffect);
        }
        stickerShortCutWidget2.LJLJJLL = subList;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
