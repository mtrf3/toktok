package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import q03.IDaS199S0200000_3;

/* loaded from: classes11.dex */
public final class OMA implements FeedBottomBannerConfig.Callback {
    public final /* synthetic */ InteractPlayListBottomBarAssem LIZ;

    public OMA(InteractPlayListBottomBarAssem interactPlayListBottomBarAssem) {
        this.LIZ = interactPlayListBottomBarAssem;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig.Callback
    public final void onFinishedInflate(View view) {
        o.LJIIIZ(view, "view");
        InteractPlayListBottomBarAssem interactPlayListBottomBarAssem = this.LIZ;
        interactPlayListBottomBarAssem.getClass();
        interactPlayListBottomBarAssem.LLIIJI = (TuxIconView) view.findViewById(R.id.cw9);
        SY4 sy4 = (SY4) view.findViewById(R.id.b1h);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(34);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
        Context context = sy4.getContext();
        o.LJIIIIZZ(context, "context");
        sy4.setBackground(c110614Vt.LIZ(context));
        sy4.LJJJ(12.0f);
        C16880lQ.LJIIJ(new IDaS199S0200000_3(interactPlayListBottomBarAssem, sy4, 6, 42), sy4);
        interactPlayListBottomBarAssem.LLIIIL = sy4;
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(interactPlayListBottomBarAssem)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        C8MZ.LIZ(context2, aweme, interactPlayListBottomBarAssem.LLIIJI);
    }
}
