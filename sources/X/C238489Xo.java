package X;

import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.9Xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238489Xo extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, String>> {
    public final /* synthetic */ C238409Xg LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C238479Xn LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ User LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238489Xo(C238409Xg c238409Xg, boolean z, C238479Xn c238479Xn, long j, Integer num, User user, String str) {
        super(0);
        this.LJLIL = c238409Xg;
        this.LJLILLLLZI = z;
        this.LJLJI = c238479Xn;
        this.LJLJJI = j;
        this.LJLJJL = num;
        this.LJLJJLL = user;
        this.LJLJL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, String> invoke() {
        boolean z;
        C188727au c188727au = new C188727au();
        C238409Xg c238409Xg = this.LJLIL;
        boolean z2 = this.LJLILLLLZI;
        c238409Xg.getClass();
        c188727au.LJIIIZ("is_login", AbstractC238349Xa.LIZJ(z2));
        c188727au.LIZLLL(this.LJLJI.LJ.getRawValue(), "share_type");
        c188727au.LJIIIZ("share_source", this.LJLJI.LJFF);
        c188727au.LJIIIZ("share_link_id", this.LJLJI.LIZ);
        c188727au.LJIIIZ("share_uid", this.LJLJI.LIZIZ);
        c188727au.LJIIIZ("checksum", this.LJLJI.LIZLLL);
        c188727au.LJ(this.LJLJJI, "api_cost");
        Integer num = this.LJLJJL;
        User user = this.LJLJJLL;
        String str = this.LJLJL;
        if (num != null && num.intValue() != 0) {
            c188727au.LIZLLL(num.intValue(), "error_code");
        }
        if (user != null) {
            c188727au.LIZLLL(user.getFollowStatus(), "follow_status");
            c188727au.LJI("is_succeed", "1");
        } else {
            c188727au.LJI("is_succeed", CardStruct.IStatusCode.DEFAULT);
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                java.util.Set<Map.Entry<String, j>> entrySet = ((m) C75792yF.LIZ(str, m.class)).entrySet();
                o.LJIIIIZZ(entrySet, "jsonObject.entrySet()");
                for (Map.Entry<String, j> entry : entrySet) {
                    o.LJIIIIZZ(entry, "(key, value)");
                    c188727au.LJI(entry.getKey(), entry.getValue().LJJIFFI());
                }
            } catch (Throwable th) {
                C221018lt.LIZJ("@LinkRelation", "parse statusMsg error", th);
            }
        }
        return c188727au.LIZ;
    }
}
