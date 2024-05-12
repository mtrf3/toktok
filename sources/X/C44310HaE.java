package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HaE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44310HaE implements InterfaceC74183T9n {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ String LJ = "";
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ String LJI;

    @Override // X.InterfaceC74183T9n
    public final void LIZ(Effect targetEffect, String creationId) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(targetEffect, "targetEffect");
        if (o.LJ(this.LIZ, "friends_effect")) {
            str = this.LIZIZ;
            str2 = "video_button";
        } else if (o.LJ(this.LIZ, "prop_recommend_card")) {
            str = "homepage_hot";
            str2 = "click_prop_publish";
        } else {
            str = "prop_page";
            str2 = "prop_feed";
        }
        Z9N z9n = Z9N.LIZIZ;
        z9n.LJFF().LJIL(this.LIZJ);
        z9n.LJFF().LJIILIIL(this.LIZLLL);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("prop_id", targetEffect.getEffectId());
        c188727au.LJIIIZ("prop_list", targetEffect.getEffectId());
        if (!TextUtils.isEmpty(this.LJ)) {
            str3 = (String) ListProtector.get(s.LJLJJL(this.LJ, new String[]{","}, 0, 6), 0);
        } else {
            str3 = "";
        }
        c188727au.LJIIIZ("giphy_id", str3);
        c188727au.LJIIIZ("group_id", this.LJFF);
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("shoot_way", this.LIZ);
        c188727au.LIZLLL(1, "after_consumption");
        c188727au.LIZLLL(HT5.LIZ(), "favorite_scene");
        c188727au.LJIIIZ("from_user_id", this.LJI);
        C50653JuL.LJLILLLLZI.getClass();
        C78983UzD.LJII(c188727au, C50654JuM.LIZIZ());
        FMX.LJIIL("shoot", c188727au.LIZ);
        z9n.LJFF().LJIIZILJ(targetEffect.getEffectId());
    }

    public C44310HaE(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
