package com.ss.android.ugc.aweme.service;

import X.C214778bp;
import X.C214788bq;
import X.C214828bu;
import X.C214838bv;
import X.C214878bz;
import X.C215608dA;
import X.C2U8;
import X.C3C8;
import X.C47261Igj;
import X.C53326KwM;
import X.C65352Pkq;
import X.C72R;
import X.EnumC214798br;
import X.EnumC214808bs;
import X.InterfaceC65350Pko;
import X.LFH;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.IDanmakuService;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DanmakuServiceImpl implements IDanmakuService {
    public final List<Integer> LIZ = C47261Igj.LJJIJIIJI(40, 150, 160, 41, 43);

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIJ() {
        return C65352Pkq.LIZ(DanmakuCreateEntranceAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIL() {
        return C65352Pkq.LIZ(DanmakuPresentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJ() {
        int i = C214828bu.LIZ;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJI() {
        return ((Boolean) C214878bz.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIJJI() {
        if (C214828bu.LIZ == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJII() {
        return C215608dA.LIZ().getBoolean("danmaku_allow_show", true);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIILJJIL() {
        return C214878bz.LIZIZ();
    }

    public static boolean LJIILL(Aweme aweme) {
        CommentService.LIZ.getClass();
        boolean LJJIJIIJI = CommentServiceImpl.LJJL().LJJIJIIJI(aweme);
        if (!CommentServiceImpl.LJJL().LJIILLIIL(aweme) && LJJIJIIJI) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LIZIZ(Aweme aweme) {
        if (aweme == null || this.LIZ.contains(Integer.valueOf(aweme.getAwemeType())) || aweme.isAd()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LIZJ(Aweme aweme) {
        boolean z;
        String str;
        if (C53326KwM.LIZ() || LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() == 1) {
            return false;
        }
        if (aweme != null && aweme.isHasDanmaku()) {
            z = true;
        } else {
            z = false;
        }
        String curUserId = C214838bv.LIZ().LJFF().getCurUserId();
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        if (!o.LJ(curUserId, str) || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJFF(Aweme aweme) {
        String str;
        if (aweme == null || !aweme.isSupportDanmaku()) {
            return false;
        }
        String curUserId = C214838bv.LIZ().LJFF().getCurUserId();
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        boolean LJ = o.LJ(curUserId, str);
        if (!LJIILL(aweme) && !LJ) {
            return false;
        }
        if (C214878bz.LIZIZ() || LIZJ(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIIZZ(Aweme aweme) {
        if (((Boolean) C214878bz.LIZJ.getValue()).booleanValue() || (LIZJ(aweme) && !C214878bz.LIZIZ())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIZ(Aweme aweme) {
        if (aweme == null || !aweme.isSupportDanmaku()) {
            return false;
        }
        if ((!C214878bz.LIZIZ() && !LIZJ(aweme)) || !LJII() || !LJIILL(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LIZ(ViewGroup viewGroup, Aweme aweme) {
        if (viewGroup == null) {
            return;
        }
        Object value = C214838bv.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-debugService>(...)");
        ((IDanmakuDebugService) value).LIZ(viewGroup, aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIILIIL(Aweme aweme, String enterFrom, boolean z) {
        EnumC214808bs enumC214808bs;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (z) {
            enumC214808bs = EnumC214808bs.HIDE;
        } else {
            enumC214808bs = EnumC214808bs.SHOW;
        }
        C214788bq.LIZIZ(aweme, enterFrom, enumC214808bs, EnumC214798br.LONG_PRESS);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LIZLLL(Aweme aweme, boolean z, int i, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (aweme == null) {
            return;
        }
        C214778bp c214778bp = C214778bp.LIZ;
        EnumC214798br enumC214798br = EnumC214798br.LONG_PRESS;
        c214778bp.getClass();
        C214778bp.LIZJ(z, aweme, enterFrom, enumC214798br);
        C2U8.LIZ(new C72R(z));
    }
}
