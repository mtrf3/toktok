package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MGB implements View.OnClickListener {
    public final /* synthetic */ SY4 LJLIL;
    public final /* synthetic */ MGD LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C229238z9 LJLJJI;
    public final /* synthetic */ PlayListNameCell LJLJJL;

    public MGB(SY4 sy4, MGD mgd, boolean z, C229238z9 c229238z9, PlayListNameCell playListNameCell) {
        this.LJLIL = sy4;
        this.LJLILLLLZI = mgd;
        this.LJLJI = z;
        this.LJLJJI = c229238z9;
        this.LJLJJL = playListNameCell;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
        o.LJIIIIZZ(LJJIJIIJIL, "get()\n                  …xFeedService::class.java)");
        Context context = this.LJLIL.getContext();
        MGD mgd = this.LJLILLLLZI;
        String str = mgd.LJLJL;
        String str2 = mgd.LJLILLLLZI;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = mgd.LJLJJI;
        String str4 = mgd.LJLJJL;
        if (!this.LJLJI ? !DZ7.LIZ : mgd.LJLJLJ) {
            z = false;
        } else {
            z = true;
        }
        C1046948z.LIZ(LJJIJIIJIL, context, "", null, "from_profile_mix_list", str, str2, str3, str4, z, this.LJLJJI, mgd.LJLJJLL, 2048);
        MGD mgd2 = this.LJLILLLLZI;
        String str5 = mgd2.LJLJJLL;
        String str6 = mgd2.LJLILLLLZI;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = mgd2.LJLJJI;
        String str8 = mgd2.LJLL;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = mgd2.LJLLI;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = mgd2.LJLJLLL;
        if (str10 == null) {
            str10 = "";
        }
        C228888ya.LJII(str5, str6, str7, null, 0, mgd2.LJLJL, str8, str9, str10, this.LJLJJI, null, 1032);
        MGD mgd3 = this.LJLILLLLZI;
        String str11 = mgd3.LJLJJLL;
        String str12 = mgd3.LJLILLLLZI;
        if (str12 == null) {
            str12 = "";
        }
        C228888ya.LJI(str11, str12, "", mgd3.LJLJJI, null, mgd3.LJLJL, null, null);
        MGD mgd4 = this.LJLILLLLZI;
        MGH mgh = mgd4.LJLLJ;
        if (mgh != null) {
            mgh.LIZ(Integer.valueOf(this.LJLJJL.getLayoutPosition()), mgd4.LJLILLLLZI, mgd4.LJLIL);
        }
    }
}
