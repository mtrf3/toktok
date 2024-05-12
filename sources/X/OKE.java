package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKE implements InterfaceC31687Cc7 {
    public final /* synthetic */ OKK LIZ;

    public OKE(OKK okk) {
        this.LIZ = okk;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        ActivityC45651qj context;
        OKK okk;
        String str2;
        Long l;
        String str3;
        String str4;
        User owner;
        User owner2;
        User owner3;
        ImageModel avatarLarge;
        List<String> urls;
        A72 a72 = this.LIZ.LJLJJI;
        if (a72 != null && (context = a72.getContext()) != null && (str2 = (okk = this.LIZ).LJLJLLL) != null) {
            Uri.Builder appendQueryParameter = C1EU.LIZIZ(str2, "enter_from", "during_live").appendQueryParameter("title", okk.LJLL);
            Room room = okk.LJLJI;
            Long l2 = null;
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("ba_uid", String.valueOf(l)).appendQueryParameter("is_ad", String.valueOf(okk.LJLJLJ));
            Room room2 = okk.LJLJI;
            if (room2 != null && (owner3 = room2.getOwner()) != null && (avatarLarge = owner3.getAvatarLarge()) != null && (urls = avatarLarge.getUrls()) != null) {
                str3 = (String) ListProtector.get(urls, 0);
            } else {
                str3 = null;
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("avatar", str3);
            Room room3 = okk.LJLJI;
            if (room3 != null && (owner2 = room3.getOwner()) != null) {
                str4 = owner2.getNickName();
            } else {
                str4 = null;
            }
            String builder = appendQueryParameter3.appendQueryParameter("name", str4).toString();
            o.LJIIIIZZ(builder, "parse(it).buildUpon()\n  …              .toString()");
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(builder);
            sparkContext.LJJIIJ("container_bg_color", "00000000");
            c40342FsQ.getClass();
            C40342FsQ.LIZ(context, sparkContext).LIZIZ();
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            Room room4 = okk.LJLJI;
            if (room4 != null && (owner = room4.getOwner()) != null) {
                l2 = Long.valueOf(owner.getId());
            }
            String valueOf = String.valueOf(l2);
            Integer num = okk.LJLJLJ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "live_anchor");
            c188727au.LJIIIZ("from_uid_id", currentUserID);
            c188727au.LJIIIZ("to_user_id", valueOf);
            c188727au.LJFF(num, "is_ad");
            FMX.LJIIL("ttelite_ba_lead_tt_click_cta", c188727au.LIZ);
        }
    }
}
