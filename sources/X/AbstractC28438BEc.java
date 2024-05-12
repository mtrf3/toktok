package X;

import Y.ACListenerS24S0101000_5;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS25S0101000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.model.Operation;
import com.bytedance.android.livesdk.adminsetting.LiveManageListFragment;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import java.util.List;

/* renamed from: X.BEc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC28438BEc extends AbstractC029409q {
    public boolean LJLIL = true;

    public abstract int getBasicItemCount();

    @Override // X.AbstractC029409q
    public int getItemCount() {
        if (this.LJLIL) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLIL && i == getBasicItemCount()) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        User user;
        long j;
        UserHonor userHonor;
        ImageModel imageModel;
        Operation operation;
        Long l;
        Operation operation2;
        int i2;
        BES bes;
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            BEY bey = (BEY) this;
            if (!(viewHolder instanceof C28437BEb)) {
                return;
            }
            C28437BEb c28437BEb = (C28437BEb) viewHolder;
            if (((BEQ) c28437BEb.itemView).LJLJI == -1 && (bes = c28437BEb.LJLIL.LJLJI) != null) {
                LiveManageListFragment liveManageListFragment = bes.LIZ;
                if (liveManageListFragment.LJLJL) {
                    liveManageListFragment.LJLJJLL++;
                    liveManageListFragment.wl();
                }
            }
            C28437BEb c28437BEb2 = bey.LJLILLLLZI;
            if (c28437BEb2 == null) {
                return;
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) c28437BEb2.itemView.getLayoutParams();
            if (layoutParams instanceof C1BZ) {
                ((C1BZ) layoutParams).LJLILLLLZI = true;
            }
            bey.LJLILLLLZI.itemView.setLayoutParams(layoutParams);
            return;
        }
        BEZ bez = (BEZ) this;
        if (bez.getItemViewType(i) == 4099) {
            C28436BEa c28436BEa = (C28436BEa) viewHolder;
            if (c28436BEa == null) {
                return;
            }
            String str = bez.LJLJLJ;
            TextView textView = c28436BEa.LJLIL;
            if (str.equals("activity_kick_out")) {
                i2 = R.string.srb;
            } else {
                i2 = R.string.sra;
            }
            textView.setText(i2);
            return;
        }
        C28439BEd c28439BEd = (C28439BEd) viewHolder;
        if (c28439BEd == null) {
            return;
        }
        List<User> list = bez.LJLJJL;
        java.util.Map<Long, Operation> map = bez.LJLJJLL;
        if (list == null) {
            return;
        }
        c28439BEd.LJLJLLL = list;
        User user2 = (User) ListProtector.get(list, i);
        if (user2 == null) {
            return;
        }
        View view = c28439BEd.LJLJI;
        if (view != null) {
            view.setVisibility(0);
        }
        if (user2.getAvatarThumb() != null) {
            C15640jQ.LJIIIIZZ(c28439BEd.LJLIL, user2.getAvatarThumb());
        } else {
            c28439BEd.LJLIL.setImageResource(R.drawable.cuk);
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(user2);
        userProfileEvent.mReportType = "report_user";
        C16880lQ.LJJIJIIJI(c28439BEd.LJLIL, new ACListenerS25S0101000_7(0, userProfileEvent, 4));
        c28439BEd.LJLJJLL.setText(C05170If.LJ(user2));
        long id = user2.getId();
        if (map == null || (operation2 = map.get(Long.valueOf(id))) == null || (user = operation2.operator) == null || user.getId() <= 0) {
            user = null;
        }
        long id2 = user2.getId();
        if (map != null && (operation = map.get(Long.valueOf(id2))) != null && (l = operation.timestampSecond) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (user != null && j > 0) {
            c28439BEd.LJLJJL.setVisibility(0);
            c28439BEd.LJLJJL.setText(C15380j0.LJIILL(R.string.n2t, C05170If.LIZ(user)));
            TextView textView2 = (TextView) c28439BEd.itemView.findViewById(R.id.hbr);
            textView2.setVisibility(0);
            textView2.setText(C28439BEd.LJLLLL.format(new Date(j * 1000)));
        }
        if (user2.getUserHonor() != null && (((imageModel = (userHonor = user2.getUserHonor()).newImIconWithLevel) != null || (imageModel = userHonor.imIconWithLevel) != null) && !C79004UzY.LJJIFFI(imageModel.getUrls()))) {
            C15640jQ.LJFF(c28439BEd.LJLJL, imageModel, 0, new IDdS56S0100000_5(c28439BEd, 10));
            c28439BEd.LJLJL.setVisibility(0);
        } else {
            c28439BEd.LJLJL.setVisibility(8);
        }
        if ("activity_banned_talk".equals(c28439BEd.LJLL)) {
            c28439BEd.LJLILLLLZI.setText(R.string.knh);
        }
        C16880lQ.LJIJI(c28439BEd.LJLILLLLZI, new ACListenerS24S0101000_5(i, c28439BEd, 8));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (Integer.MIN_VALUE == i) {
            BEY bey = (BEY) this;
            BEQ beq = new BEQ(viewGroup.getContext(), null);
            int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.ae4);
            int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.ae5);
            beq.setLayoutParams(new RecyclerView.LayoutParams(-1, dimensionPixelSize));
            Context context = viewGroup.getContext();
            BEP bep = new BEP(context);
            CVT cvt = new CVT(context, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.height = dimensionPixelSize2;
            layoutParams.width = dimensionPixelSize2;
            layoutParams.gravity = 17;
            cvt.setLayoutParams(layoutParams);
            bep.LIZIZ = cvt;
            ACListenerS25S0100000_5 aCListenerS25S0100000_5 = new ACListenerS25S0100000_5(bey, 262);
            TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.de5, C16880lQ.LLZIL(context), null);
            textView.setText(R.string.sop);
            C16880lQ.LJIIJ(aCListenerS25S0100000_5, textView);
            bep.LIZLLL = textView;
            bep.LIZIZ = C28289B8j.LIZ(viewGroup, R.layout.de4, viewGroup, false);
            beq.setBuilder(bep);
            C28437BEb c28437BEb = new C28437BEb(bey, beq);
            bey.LJLILLLLZI = c28437BEb;
            viewHolder = c28437BEb;
        } else {
            BEZ bez = (BEZ) this;
            if (i == 4099) {
                viewHolder = new C28436BEa(C16880lQ.LLLLIILL(C16880lQ.LLZIL(bez.LJLJJI), R.layout.d6n, viewGroup, false));
            } else {
                Context context2 = bez.LJLJJI;
                viewHolder = new C28439BEd(context2, C16880lQ.LLLLIILL(C16880lQ.LLZIL(context2), R.layout.d6o, viewGroup, false), bez.LJLJLJ, bez.LJLJLLL, bez.LJLL, bez.LJLJL);
            }
        }
        C0AX.LIZ(viewGroup, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
