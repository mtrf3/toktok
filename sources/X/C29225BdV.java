package X;

import Y.ARunnableS9S0101000_5;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.FeedBanner;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.BdV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29225BdV implements C0C3 {
    public final ViewPager LJLIL;
    public final RunnableC29228BdY LJLILLLLZI;
    public final String LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL = true;
    public final String LJLJL;

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        FeedBanner LJJIIJZLJL;
        if (i != 1 || !(this.LJLIL.getAdapter() instanceof C29226BdW) || (LJJIIJZLJL = ((C29226BdW) this.LJLIL.getAdapter()).LJJIIJZLJL(this.LJLJJL)) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("show_source", this.LJLJI);
        hashMap.put("banner_id", String.valueOf(LJJIIJZLJL.id));
        hashMap.put("banner_position", String.valueOf(this.LJLJJL + 1));
        hashMap.put("banner_page", "more_anchor");
        hashMap.put("tab_type", this.LJLJL);
        hashMap.put("banner_type", "campaign_static");
        hashMap.put("landing_reason", C08680Vs.LJIILJJIL.LJIIJJI);
        BZI LIZ = C28787BRn.LIZ("banner_slide");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C29226BdW c29226BdW;
        FeedBanner LJJIIJZLJL;
        this.LJLJJL = i;
        if (!this.LJLJJI) {
            return;
        }
        String str = this.LJLJL;
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        String str2 = c08680Vs.LJII;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2)) {
            ViewPager viewPager = this.LJLIL;
            RunnableC29228BdY runnableC29228BdY = this.LJLILLLLZI;
            viewPager.removeCallbacks(runnableC29228BdY);
            viewPager.postDelayed(runnableC29228BdY, 5000L);
            if (!this.LJLJJLL || (c29226BdW = (C29226BdW) this.LJLIL.getAdapter()) == null || (LJJIIJZLJL = ((C29226BdW) this.LJLIL.getAdapter()).LJJIIJZLJL(i)) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", this.LJLJI);
            hashMap.put("banner_id", String.valueOf(LJJIIJZLJL.id));
            hashMap.put("banner_position", String.valueOf((i % ((ArrayList) c29226BdW.LJLJJLL).size()) + 1));
            hashMap.put("banner_page", "more_anchor");
            hashMap.put("tab_type", this.LJLJL);
            hashMap.put("banner_type", "campaign_static");
            hashMap.put("activity_id", C77117UOj.LJIIL(LJJIIJZLJL));
            hashMap.put("landing_reason", c08680Vs.LJIIJJI);
            BZI LIZ = C28787BRn.LIZ("banner_show");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIIZILJ();
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
            ViewPager viewPager2 = this.LJLIL;
            if (viewPager2 instanceof C29230Bda) {
                C29230Bda c29230Bda = (C29230Bda) viewPager2;
                MotionEvent motionEvent = c29230Bda.LJLJJL;
                if (motionEvent == null || motionEvent.getAction() == 3 || c29230Bda.LJLJJL.getAction() == 1) {
                    c29230Bda.post(new ARunnableS9S0101000_5(0, c29230Bda, 21));
                }
                C0NB.LIZIZ("BannerViewPager", "onPageSelected ");
            }
        }
    }

    public C29225BdV(ViewPager viewPager, RunnableC29228BdY runnableC29228BdY, String str, String str2) {
        this.LJLIL = viewPager;
        this.LJLILLLLZI = runnableC29228BdY;
        this.LJLJI = str;
        this.LJLJL = str2;
    }
}
