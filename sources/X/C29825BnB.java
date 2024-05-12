package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BnB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29825BnB extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final void setTagForUserTicket(User user) {
        if (C30922CBq.LIZIZ) {
            LIZ(R.id.n0y).setTag(C05170If.LIZ(user));
        }
    }

    public final void LIZIZ(C29826BnC c29826BnC) {
        float f;
        List<String> list;
        float f2;
        float f3;
        float f4;
        if (c29826BnC.LIZJ == null) {
            return;
        }
        Context context = getContext();
        if (c29826BnC.LIZLLL) {
            f = 56.0f;
        } else {
            f = 48.0f;
        }
        int LIZJ = (int) KL2.LIZJ(context, f);
        View LIZ = LIZ(R.id.my0);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.my0).getLayoutParams();
        layoutParams.width = LIZJ;
        layoutParams.height = LIZJ;
        LIZ.setLayoutParams(layoutParams);
        View LIZ2 = LIZ(R.id.geh);
        ViewGroup.LayoutParams layoutParams2 = LIZ(R.id.geh).getLayoutParams();
        layoutParams2.width = LIZJ;
        layoutParams2.height = LIZJ;
        LIZ2.setLayoutParams(layoutParams2);
        User user = c29826BnC.LIZJ.user;
        o.LJIIIIZZ(user, "bindModel.item.user");
        setTagForUserTicket(user);
        ((TextView) LIZ(R.id.n0y)).setText(c29826BnC.LIZJ.scoreDescription);
        ((TextView) LIZ(R.id.mzt)).setText(C05170If.LIZ(c29826BnC.LIZJ.user));
        C87277YNd.LJJIIJZLJL((C47121t6) LIZ(R.id.mzt), R.color.a28);
        C87277YNd.LJJIIJZLJL((C47121t6) LIZ(R.id.n0y), R.color.cu);
        if (c29826BnC.LJFF) {
            BQO LIZ3 = C15650jR.LIZ();
            ImageModel avatarThumb = c29826BnC.LIZJ.user.getAvatarThumb();
            if (avatarThumb != null) {
                list = avatarThumb.getUrls();
            } else {
                list = null;
            }
            C78720Uuy LIZ4 = LIZ3.LIZ(list);
            LIZ4.LJIIL = Boolean.TRUE;
            LIZ4.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            int width = LIZ(R.id.my0).getWidth();
            int height = LIZ(R.id.my0).getHeight();
            LIZ4.LJ = width;
            LIZ4.LJFF = height;
            LIZ4.LJIIIIZZ = R.drawable.d65;
            LIZ4.LJIIJJI(LIZ(R.id.my0));
            BorderInfo LIZ5 = C29504Bi0.LIZ(c29826BnC.LIZJ.user);
            if (LIZ5 != null) {
                if (c29826BnC.LIZLLL) {
                    f3 = 70.0f;
                    f4 = 4.0f;
                } else {
                    f3 = 60.0f;
                    f4 = 3.0f;
                }
                LIZJ(f3, f4);
                C15620jO.LIZIZ(LIZ5.icon, (C47061t0) LIZ(R.id.eyl));
                ((ImageView) LIZ(R.id.eyl)).setVisibility(0);
                String str = c29826BnC.LIZ;
                User user2 = c29826BnC.LIZJ.user;
                o.LJIIIIZZ(user2, "bindModel.item.user");
                C31522CYs.LJIIJJI(str, user2, LIZ5, c29826BnC.LIZIZ, c29826BnC.LJI);
            } else if (c29826BnC.LIZJ.roomId > 0) {
                if (c29826BnC.LIZLLL) {
                    f2 = 62.0f;
                } else {
                    f2 = 54.0f;
                }
                LIZJ(f2, 0.0f);
                C15620jO.LIZ((C47061t0) LIZ(R.id.eyl), R.drawable.d_t);
                ((ImageView) LIZ(R.id.eyl)).setVisibility(0);
            } else {
                ((ImageView) LIZ(R.id.eyl)).setVisibility(8);
            }
            if (c29826BnC.LIZJ.roomId > 0) {
                View LIZ6 = LIZ(R.id.f82);
                if (C78688UuS.LJLILLLLZI == null) {
                    C78688UuS.LJLILLLLZI = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_item_rank_top_on_going_hd.webp");
                }
                C15490jB.LIZJ(LIZ6, C78688UuS.LJLILLLLZI);
                KL2.LJIILLIIL(0, LIZ(R.id.f82));
            } else {
                KL2.LJIILLIIL(8, LIZ(R.id.f82));
            }
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(c29826BnC, 39)));
    }

    public C29825BnB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.di3, this, true);
        setGravity(81);
    }

    public final void LIZJ(float f, float f2) {
        C47061t0 c47061t0 = (C47061t0) LIZ(R.id.eyl);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.eyl).getLayoutParams();
        layoutParams.width = C15380j0.LIZ(f);
        layoutParams.height = C15380j0.LIZ(f);
        c47061t0.setLayoutParams(layoutParams);
        C29306Beo.LJJLI(C15380j0.LIZ(f2), LIZ(R.id.f82));
        C29306Beo.LJJJJJL(C15380j0.LIZ(f2), LIZ(R.id.f82));
    }
}
