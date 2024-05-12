package com.ss.android.ugc.aweme.notification.service;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C32I;
import X.C42625Go9;
import X.C53405Kxd;
import X.C54301LSv;
import X.C54310LTe;
import X.C54311LTf;
import X.C54362LVe;
import X.C61878OQg;
import X.C62822Ol8;
import X.EnumC54302LSw;
import X.HG3;
import X.L0W;
import X.LT7;
import X.LTA;
import X.LVB;
import X.LVG;
import X.ORZ;
import android.os.Message;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService;
import com.ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class OldNoticeCountServiceImpl implements OldNoticeCountService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C54310LTe.LJLIL);

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final Map<Integer, Integer> LJIILL() {
        C54311LTf c54311LTf = C54311LTf.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List LLJILJILJ = ORZ.LLJILJILJ(LVB.LIZLLL());
        C53405Kxd.LIZ(LLJILJILJ);
        Iterator it = ((ArrayList) LLJILJILJ).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int LJIILJJIL = C54362LVe.LJIILJJIL(intValue);
            if (LJIILJJIL != 0) {
                linkedHashMap.put(Integer.valueOf(intValue), Integer.valueOf(LJIILJJIL));
            }
        }
        linkedHashMap.put(99, Integer.valueOf(c54311LTf.LIZ()));
        return linkedHashMap;
    }

    public final OldRedPointService LJIL() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-oldPointService>(...)");
        return (OldRedPointService) value;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LIZLLL() {
        List LIZJ = LVB.LIZJ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZJ, 10));
        Iterator it = LIZJ.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(LJIIJJI(((Number) it.next()).intValue())));
        }
        return C54311LTf.LIZ.LIZ() + ORZ.LLILLIZIL(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJFF() {
        List LIZLLL = LVB.LIZLLL();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        Iterator it = LIZLLL.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(LJIIJJI(((Number) it.next()).intValue())));
        }
        return C54311LTf.LIZ.LIZ() + ORZ.LLILLIZIL(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LJIIIZ() {
        LJIL().LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LJIILLIIL() {
        if (L0W.LIZ()) {
            C42625Go9.LIZIZ(LT7.LIZ);
            IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJIJ() {
        return C54301LSv.LIZJ().LIZIZ(HG3.LJIILL().getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJIJJ() {
        return C54301LSv.LIZJ().LIZ(HG3.LJIILL().getCurUserId());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final AbstractC73672Svk LIZ(NoticeList noticeList) {
        return LJIL().LIZ(noticeList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LIZJ(boolean z) {
        LJIL().LIZJ(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJ(int i) {
        return LJIL().LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJI(int i) {
        return LJIL().LJI(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LJII(Message message) {
        LJIL().LJII(message);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final NoticeGroupAttrs LJIIJ(int i) {
        return LVB.LIZIZ.get(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJIIJJI(int i) {
        return LJIL().LJIIJJI(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJIILIIL(String uid) {
        Integer num;
        o.LJIIIZ(uid, "uid");
        C54301LSv LIZJ = C54301LSv.LIZJ();
        LIZJ.getClass();
        try {
            num = LIZJ.LIZ.get(Long.valueOf(CastLongProtector.parseLong(uid)));
        } catch (NumberFormatException unused) {
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final List LJIJI(int i) {
        return LVB.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LIZIZ(int i, boolean z) {
        LJIL().LIZIZ(i, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LJIIIIZZ(int i, int i2) {
        LJIL().LJIIIIZZ(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LJIIL(LVG lvg, int... iArr) {
        for (int i : iArr) {
            LJIL().LIZLLL(i, lvg);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LJIILJJIL(LVG lvg, int[] iArr) {
        for (int i : iArr) {
            LJIL().LJFF(i, lvg);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final void LJIIZILJ(String str, List list) {
        C54301LSv.LIZJ().LIZLLL(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.notice.api.count.OldNoticeCountService
    public final int LJIJJLI(int i, EnumC54302LSw showType) {
        ?? r4;
        int[] LLJ;
        EnumC54302LSw enumC54302LSw;
        ?? r42;
        EnumC54302LSw enumC54302LSw2;
        o.LJIIIZ(showType, "showType");
        int i2 = LTA.LIZ[showType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return 0;
            }
            List LIZ = LVB.LIZ(i);
            if (LIZ == null || LIZ.isEmpty()) {
                r42 = C61878OQg.INSTANCE;
            } else {
                r42 = new ArrayList();
                for (Object obj : LIZ) {
                    NoticeGroupAttrs noticeGroupAttrs = LVB.LIZIZ.get(Integer.valueOf(((Number) obj).intValue()));
                    if (noticeGroupAttrs != null) {
                        enumC54302LSw2 = noticeGroupAttrs.showType;
                    } else {
                        enumC54302LSw2 = null;
                    }
                    if (enumC54302LSw2 == EnumC54302LSw.ShowDot) {
                        r42.add(obj);
                    }
                }
            }
            LLJ = ORZ.LLJ(r42);
        } else {
            List LIZ2 = LVB.LIZ(i);
            if (LIZ2 == null || LIZ2.isEmpty()) {
                r4 = C61878OQg.INSTANCE;
            } else {
                r4 = new ArrayList();
                for (Object obj2 : LIZ2) {
                    NoticeGroupAttrs noticeGroupAttrs2 = LVB.LIZIZ.get(Integer.valueOf(((Number) obj2).intValue()));
                    if (noticeGroupAttrs2 != null) {
                        enumC54302LSw = noticeGroupAttrs2.showType;
                    } else {
                        enumC54302LSw = null;
                    }
                    if (enumC54302LSw == EnumC54302LSw.ShowNum) {
                        r4.add(obj2);
                    }
                }
            }
            LLJ = ORZ.LLJ(r4);
        }
        ArrayList arrayList = new ArrayList(LLJ.length);
        for (int i3 : LLJ) {
            arrayList.add(Integer.valueOf(LJIIJJI(i3)));
        }
        return ORZ.LLILLIZIL(arrayList);
    }
}
