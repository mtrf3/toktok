package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rwz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71201Rwz extends AnimatorListenerAdapter {
    public final /* synthetic */ C71264Ry0 LJLIL;
    public final /* synthetic */ C71188Rwm LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;
    public final /* synthetic */ C34K LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        C34K c34k = this.LJLJJL;
        if (!c34k.element) {
            c34k.element = true;
            C71264Ry0 c71264Ry0 = this.LJLIL;
            String name = c71264Ry0.LIZIZ;
            String schema = c71264Ry0.LIZJ;
            o.LJIIIZ(name, "name");
            o.LJIIIZ(schema, "schema");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", name);
                jSONObject.put("schema", schema);
                jSONObject.put("effect_style", "first_order");
                C48658J7u.LIZIZ("livesdk_tiktokec_short_touches_preview_cancel", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(animation, "animation");
        C71264Ry0 c71264Ry0 = this.LJLIL;
        String name = c71264Ry0.LIZIZ;
        String schema = c71264Ry0.LIZJ;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(schema, "schema");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", name);
            jSONObject.put("schema", schema);
            jSONObject.put("effect_style", "first_order");
            C48658J7u.LIZIZ("livesdk_tiktokec_short_touches_preview_success", jSONObject);
        } catch (Exception unused) {
        }
        if (this.LJLJI > 0) {
            ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int i = this.LJLJI;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.leftMargin = i;
            }
            this.LJLJJI.requestLayout();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FollowInfo followInfo;
        o.LJIIIZ(animation, "animation");
        String valueOf = String.valueOf(this.LJLIL.LIZ.getId());
        String valueOf2 = String.valueOf(this.LJLIL.LIZ.getOwnerUserId());
        C71188Rwm c71188Rwm = this.LJLILLLLZI;
        String str2 = c71188Rwm.LJLLJ;
        String str3 = c71188Rwm.LJLLL;
        String str4 = c71188Rwm.LJLZ;
        User owner = this.LJLIL.LIZ.getOwner();
        if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str = Q4K.LIZJ(followInfo)) == null) {
            str = "-1";
        }
        LinkedHashMap LIZ = C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (valueOf == null) {
            valueOf = "";
        }
        LIZ.put("author_id", valueOf);
        if (valueOf2 == null) {
            valueOf2 = "";
        }
        LIZ.put("room_id", valueOf2);
        if (str2 == null) {
            str2 = "";
        }
        LIZ.put("enter_from_merge", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ.put("enter_method", str3);
        if (str4 == null) {
            str4 = "";
        }
        LIZ.put("action_type", str4);
        LIZ.put("follow_status", str);
        LIZ.put("page_name", "live");
        LIZ.put("icon_type", "coupon");
        LIZ.put("icon_zone", "click_area");
        LIZ.put("effect_style", "first_order");
        LIZ.put("show_effect", "slide_in");
        C48658J7u.LIZ("livesdk_tiktokec_icon_effect", LIZ);
        if (this.LJLJI > 0) {
            ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.leftMargin = 0;
            }
            this.LJLJJI.requestLayout();
        }
    }

    public C71201Rwz(C71264Ry0 c71264Ry0, C71188Rwm c71188Rwm, int i, ViewGroup viewGroup, C34K c34k) {
        this.LJLIL = c71264Ry0;
        this.LJLILLLLZI = c71188Rwm;
        this.LJLJI = i;
        this.LJLJJI = viewGroup;
        this.LJLJJL = c34k;
    }
}
