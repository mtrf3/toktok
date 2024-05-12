package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.discover.helper.ViewPagerSwitchHelper;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.OGx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61635OGx {
    public static final List<Banner> LJIIJJI = Arrays.asList(new Banner());
    public final ViewPager LIZ;
    public final DJR LIZIZ;
    public final View LIZJ;
    public final FrameLayout LIZLLL;
    public C61622OGk LJ;
    public final ViewPagerSwitchHelper LJFF;
    public final Context LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;

    public C61635OGx(View view, int i, int i2, long j, long j2) {
        Context context = view.getContext();
        this.LJI = context;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.ncx);
        this.LIZ = viewPager;
        DJR djr = (DJR) view.findViewById(R.id.cf7);
        this.LIZIZ = djr;
        View findViewById = view.findViewById(R.id.kej);
        this.LIZJ = findViewById;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.agi);
        this.LIZLLL = frameLayout;
        this.LJII = i;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = j;
        this.LJIIJ = j2;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = (int) ((KL2.LJIIJJI(context) - ((int) (KL2.LIZJ(context, 16.0f) * 2.0f))) * 0.26239067f);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOutlineProvider(new C43251GyF((int) KL2.LIZJ(context, 2.0f)));
        frameLayout.setClipToOutline(true);
        this.LJFF = new ViewPagerSwitchHelper(viewPager, 3000L);
        findViewById.getLayoutParams().height = C63081OpJ.LJJJJLI(view.getContext());
        C16310kV.LJIIIZ(djr, 0);
    }
}
