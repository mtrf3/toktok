package Y;

import X.C224238r5;
import X.C57092Lx;
import X.C61447O9r;
import X.C72272SYa;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class IDLListenerS9S0300000_8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS9S0300000_8 iDLListenerS9S0300000_8) {
        ((RecyclerView) iDLListenerS9S0300000_8.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS9S0300000_8);
        ((ArrayList) ((C72272SYa) iDLListenerS9S0300000_8.l1).LJZI).clear();
        List list = (List) iDLListenerS9S0300000_8.l2;
        C72272SYa c72272SYa = (C72272SYa) iDLListenerS9S0300000_8.l1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ArrayList) c72272SYa.LJZI).add(it.next());
        }
        ((C72272SYa) iDLListenerS9S0300000_8.l1).LLFF(false);
    }

    public static final void onGlobalLayout$1(IDLListenerS9S0300000_8 iDLListenerS9S0300000_8) {
        int i;
        int LJI;
        int i2;
        if (((TextureView) iDLListenerS9S0300000_8.l0).getWidth() > 0 && ((TextureView) iDLListenerS9S0300000_8.l0).getHeight() > 0) {
            ((TextureView) iDLListenerS9S0300000_8.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS9S0300000_8);
            if (((Video) iDLListenerS9S0300000_8.l1).getWidth() > 0 && ((Video) iDLListenerS9S0300000_8.l1).getHeight() > 0) {
                C224238r5 c224238r5 = new C224238r5();
                ShoutoutsPlayActivity shoutoutsPlayActivity = (ShoutoutsPlayActivity) iDLListenerS9S0300000_8.l2;
                TextureView textureView = (TextureView) iDLListenerS9S0300000_8.l0;
                int width = ((Video) iDLListenerS9S0300000_8.l1).getWidth();
                int height = ((Video) iDLListenerS9S0300000_8.l1).getHeight();
                C224238r5.LJFF(shoutoutsPlayActivity);
                int i3 = C224238r5.LJFF;
                int i4 = C224238r5.LJI;
                double d = i3 / i4;
                int i5 = 0;
                if (d <= 0.5d) {
                    C61447O9r c61447O9r = C57092Lx.LIZ;
                    if (c61447O9r.LIZIZ == 0) {
                        if (c61447O9r.LJFF) {
                            LJI = C224238r5.LJI() - C61447O9r.LIZ();
                            i2 = 0;
                            c61447O9r.getClass();
                        } else {
                            LJI = C224238r5.LJI();
                            i2 = c61447O9r.LIZ;
                        }
                    } else {
                        i = c61447O9r.LIZJ;
                        if (i == 0) {
                            LJI = C224238r5.LJI();
                            i2 = c61447O9r.LIZ;
                        }
                        c224238r5.LIZJ(textureView, width, height, i, C224238r5.LJFF, null);
                        return;
                    }
                    i = LJI - i2;
                    if (!c61447O9r.LIZLLL) {
                        i -= c61447O9r.LIZIZ;
                    }
                    c224238r5.LIZJ(textureView, width, height, i, C224238r5.LJFF, null);
                    return;
                }
                if (d >= 0.6666666666666666d) {
                    c224238r5.LJIIJJI(textureView, width, height, i3, i4, null);
                    return;
                }
                int i6 = C224238r5.LJIIIIZZ;
                C61447O9r c61447O9r2 = C57092Lx.LIZ;
                if (c61447O9r2.LJFF) {
                    i5 = C61447O9r.LIZ();
                }
                c224238r5.LJIIJ(textureView, width, height, (i6 - i5) - c61447O9r2.LIZ, C224238r5.LJFF, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDLListenerS9S0300000_8(Object obj, RecyclerView recyclerView, C72272SYa c72272SYa, List<PowerViewPagerFragmentItem<?>> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = recyclerView;
        this.l2 = c72272SYa;
    }
}
