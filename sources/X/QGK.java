package X;

/* loaded from: classes12.dex */
public final class QGK {
    public static final boolean LIZ = LIZ("androidx.recyclerview.widget.RecyclerView");
    public static final boolean LIZIZ = LIZ("androidx.viewpager.widget.ViewPager");
    public static final boolean LIZJ = LIZ("androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;

    static {
        LIZ("androidx.fragment.app.Fragment");
        LIZ("androidx.fragment.app.FragmentActivity");
        LIZ("androidx.appcompat.app.AlertDialog");
        LIZ("androidx.appcompat.view.menu.ListMenuItemView");
        LIZLLL = LIZ("androidx.recyclerview.widget.RecyclerView");
        LJ = LIZ("androidx.viewpager.widget.ViewPager");
        LJFF = LIZ("androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        LIZ("androidx.fragment.app.Fragment");
        LIZ("androidx.fragment.app.FragmentActivity");
        LIZ("androidx.appcompat.app.AlertDialog");
        LIZ("androidx.appcompat.view.menu.ListMenuItemView");
    }

    public static boolean LIZ(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
