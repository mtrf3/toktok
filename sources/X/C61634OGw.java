package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.discover.helper.ViewPagerSwitchHelper;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.OGw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61634OGw {
    public static final List<Banner> LJIIIIZZ = Arrays.asList(new Banner());
    public final ViewPager LIZ;
    public final DJR LIZIZ;
    public final View LIZJ;
    public final ViewGroup LIZLLL;
    public C61623OGl LJ;
    public final ViewPagerSwitchHelper LJFF;
    public final Context LJI;
    public final int LJII;

    public C61634OGw(View view, int i) {
        Context context = view.getContext();
        this.LJI = context;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.ncx);
        this.LIZ = viewPager;
        DJR djr = (DJR) view.findViewById(R.id.cf7);
        this.LIZIZ = djr;
        View findViewById = view.findViewById(R.id.kej);
        this.LIZJ = findViewById;
        View findViewById2 = view.findViewById(R.id.agi);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.g2t);
        this.LIZLLL = viewGroup;
        this.LJII = i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        int LIZJ = (int) KL2.LIZJ(viewGroup.getContext(), 16.0f);
        marginLayoutParams.leftMargin = LIZJ;
        marginLayoutParams.rightMargin = LIZJ;
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        layoutParams.height = (int) ((KL2.LJIIJJI(context) - ((int) (KL2.LIZJ(context, 16.0f) * 2.0f))) * 0.26239067f);
        findViewById2.setLayoutParams(layoutParams);
        findViewById2.setOutlineProvider(new C43251GyF((int) KL2.LIZJ(context, 2.0f)));
        findViewById2.setClipToOutline(true);
        this.LJFF = new ViewPagerSwitchHelper(viewPager, 3000L);
        findViewById.getLayoutParams().height = C63081OpJ.LJJJJLI(view.getContext());
        C16310kV.LJIIIZ(djr, 0);
    }
}
