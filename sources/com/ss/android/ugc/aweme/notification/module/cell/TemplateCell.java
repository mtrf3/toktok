package com.ss.android.ugc.aweme.notification.module.cell;

import X.C06490Nh;
import X.C56882MUc;
import X.C65352Pkq;
import X.C72513Sd3;
import X.C72519Sd9;
import X.C72522SdC;
import X.InterfaceC74236TBo;
import X.MVZ;
import X.SIS;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateCell extends NotificationCell<C72522SdC> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public MVZ LJLJL;
    public final C72519Sd9 LJLJLJ = new C72519Sd9(this);

    static {
        TBT tbt = new TBT(TemplateCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt};
    }

    public final C72513Sd3 P() {
        return (C72513Sd3) this.LJLJLJ.LIZ(this, LJLJLLL[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell
    public final void M() {
        super.M();
        C72522SdC c72522SdC = (C72522SdC) getItem();
        if (c72522SdC != null) {
            N(c72522SdC);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.NotificationCell, com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        MVZ mvz = this.LJLJL;
        if (mvz != null) {
            mvz.onAttached();
        } else {
            o.LJIJI("delegate");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.NotificationCell, com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        MVZ mvz = this.LJLJL;
        if (mvz != null) {
            mvz.onDetached();
        } else {
            o.LJIJI("delegate");
            throw null;
        }
    }

    public final void N(C72522SdC c72522SdC) {
        String str;
        NotificationChunkVM notificationChunkVM;
        SIS sis;
        Map<String, String> map;
        MVZ mvz = this.LJLJL;
        if (mvz != null) {
            mvz.bindNotice(c72522SdC.LJLILLLLZI, c72522SdC.LJLIL - 1);
            C72513Sd3 P = P();
            if (P == null || (notificationChunkVM = P.LJLILLLLZI) == null || (sis = notificationChunkVM.LJLL) == null || (map = sis.LJFF) == null || (str = map.get("enter_from")) == null || str.length() == 0) {
                str = "notification_page";
            }
            MVZ mvz2 = this.LJLJL;
            if (mvz2 != null) {
                MusNotice musNotice = c72522SdC.LJLILLLLZI;
                MVZ.M(mvz2, musNotice, c72522SdC.LJLIL - 1, "", "", str, c72522SdC.LJLJI, C56882MUc.LIZ(musNotice.type), false, false, "shop_message", 384);
                return;
            } else {
                o.LJIJI("delegate");
                throw null;
            }
        }
        o.LJIJI("delegate");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C72522SdC t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        MVZ mvz = this.LJLJL;
        if (mvz != null) {
            mvz.setItemClickListener(P());
            MVZ mvz2 = this.LJLJL;
            if (mvz2 != null) {
                C72513Sd3 P = P();
                o.LJI(P);
                mvz2.vm = P.LJLILLLLZI;
                N(t);
                return;
            }
            o.LJIJI("delegate");
            throw null;
        }
        o.LJIJI("delegate");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.tf, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        this.LJLJL = new MVZ(view, new AqS178S0100000_12(this, 241));
        return view;
    }
}
