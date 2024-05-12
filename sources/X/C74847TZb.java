package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TZb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74847TZb implements InterfaceC75414Tik<InviteResult> {
    public final /* synthetic */ C74846TZa LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C74849TZd LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(InviteResult value) {
        String str;
        o.LJIIIZ(value, "value");
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LJLIL.LJLJL;
        if (multiGuestAsGuestModeratorManageDialog != null) {
            multiGuestAsGuestModeratorManageDialog.LJJIIZI(this.LJLILLLLZI);
        }
        C30868C9o.LIZJ(R.string.mik);
        List LIZIZ = C74896TaO.LIZIZ(this.LJLILLLLZI);
        List LIZJ = C74896TaO.LIZJ(this.LJLILLLLZI);
        long id = this.LJLJI.LIZ.getId();
        EnumC74778TWk LIZJ2 = C59994Ngc.LIZJ();
        String str2 = this.LJLJJI;
        Gson gson = C09650Zl.LIZJ;
        String json = GsonProtectorUtils.toJson(gson, LIZJ);
        String json2 = GsonProtectorUtils.toJson(gson, LIZIZ);
        int size = LIZIZ.size();
        int followStatus = (int) this.LJLJI.LIZ.getFollowInfo().getFollowStatus();
        int i = this.LJLJJL;
        C74846TZa c74846TZa = this.LJLIL;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c74846TZa.LJLL.LIZ(c74846TZa, C74846TZa.LJLLL[1]);
        if (multiGuestDataHolder != null) {
            str = multiGuestDataHolder.LJII();
        } else {
            str = "panel_Golive";
        }
        C75017TcL.LJFF(id, LIZJ2, str2, json, json2, size, followStatus, true, i, str);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th instanceof C29401Dk) {
            BPP.LIZJ(C15380j0.LIZLLL(), th);
        } else {
            C30868C9o.LJI(C15380j0.LJIILL(R.string.mht, C05170If.LIZ(this.LJLJI.LIZ)));
        }
    }

    public C74847TZb(C74846TZa c74846TZa, long j, C74849TZd c74849TZd, String str, int i) {
        this.LJLIL = c74846TZa;
        this.LJLILLLLZI = j;
        this.LJLJI = c74849TZd;
        this.LJLJJI = str;
        this.LJLJJL = i;
    }
}
