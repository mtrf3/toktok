package X;

import android.view.View;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.moderator.AddModeratorFragment;
import com.bytedance.android.livesdk.moderator.ModeratorListChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BBz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28383BBz implements InterfaceC28456BEu {
    public final /* synthetic */ AddModeratorFragment LJLIL;

    @Override // X.InterfaceC28456BEu
    public final void Ti(long j, boolean z) {
    }

    @Override // X.InterfaceC28456BEu
    public final void Ze(Exception exc) {
    }

    public C28383BBz(AddModeratorFragment addModeratorFragment) {
        this.LJLIL = addModeratorFragment;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Integer, O] */
    @Override // X.InterfaceC28456BEu
    public final void of(AdminUserBean adminUserBean, Exception exc) {
        View findViewById;
        if (adminUserBean != null) {
            AddModeratorFragment addModeratorFragment = this.LJLIL;
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(addModeratorFragment);
            if (LJIILIIL != null) {
                ((C32537Cpp) LJIILIIL.gv0(C28395BCl.class)).LIZ = Integer.valueOf(adminUserBean.mMaxCount);
            }
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(addModeratorFragment);
            if (LJIILIIL2 != null) {
                List<BFC> list = adminUserBean.LIZ;
                o.LJIIIIZZ(list, "it.userList");
                LJIILIIL2.rv0(ModeratorListChannel.class, list);
            }
        }
        this.LJLIL.initData();
        View view = this.LJLIL.getView();
        if (view != null && (findViewById = view.findViewById(R.id.l8x)) != null) {
            C29306Beo.LJJLJLI(findViewById);
        }
    }
}
