package X;

import android.os.Message;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import com.ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LVf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54363LVf implements INoticeCountService {
    public static final C54363LVf LJLILLLLZI = new C54363LVf();
    public final /* synthetic */ INoticeCountService LJLIL;

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final AbstractC73672Svk LIZ(NoticeList noticeList) {
        return this.LJLIL.LIZ(noticeList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LIZIZ(int i, int i2) {
        this.LJLIL.LIZIZ(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZJ(int i, EnumC54302LSw showType) {
        o.LJIIIZ(showType, "showType");
        return this.LJLIL.LIZJ(i, showType);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZLLL() {
        return this.LJLIL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final java.util.Map<Integer, Integer> LJ() {
        return this.LJLIL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJFF() {
        return this.LJLIL.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJI(Message message) {
        this.LJLIL.LJI(message);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJII(String str, List list) {
        this.LJLIL.LJII(str, list);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIIIZZ(int i, EnumC54302LSw showType, boolean z) {
        o.LJIIIZ(showType, "showType");
        return this.LJLIL.LJIIIIZZ(i, showType, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIIZ(int i, LVG lvg, boolean z) {
        this.LJLIL.LJIIIZ(i, lvg, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final NoticeGroupAttrs LJIIJ(int i) {
        return this.LJLIL.LJIIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIJJI(LVG lvg, boolean z, int[] iArr) {
        this.LJLIL.LJIIJJI(lvg, z, iArr);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIILIIL(String uid) {
        o.LJIIIZ(uid, "uid");
        return this.LJLIL.LJIILIIL(uid);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILJJIL() {
        this.LJLIL.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final boolean LJIILL(LVG lvg, boolean z, int[] iArr) {
        return this.LJLIL.LJIILL(lvg, z, iArr);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILLIIL(int i, boolean z) {
        this.LJLIL.LJIILLIIL(i, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIZILJ(boolean z, int[] groupTypeArray) {
        o.LJIIIZ(groupTypeArray, "groupTypeArray");
        return this.LJLIL.LJIIZILJ(z, groupTypeArray);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJ() {
        return this.LJLIL.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJI() {
        return this.LJLIL.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJJ(int i) {
        return this.LJLIL.LJIJJ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIL(LVG lvg, int[] iArr) {
        this.LJLIL.LJIL(lvg, iArr);
    }

    public C54363LVf() {
        INoticeCountService iNoticeCountService;
        Object LIZ = C58096Mr6.LIZ(INoticeCountService.class, false);
        if (LIZ != null) {
            iNoticeCountService = (INoticeCountService) LIZ;
        } else {
            if (C58096Mr6.r3 == null) {
                synchronized (INoticeCountService.class) {
                    if (C58096Mr6.r3 == null) {
                        C58096Mr6.r3 = new NoticeCountServiceImpl();
                    }
                }
            }
            iNoticeCountService = C58096Mr6.r3;
        }
        this.LJLIL = iNoticeCountService;
    }
}
