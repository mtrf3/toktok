package X;

import Y.ACListenerS26S0201000_9;
import Y.ACListenerS29S0100000_9;
import Y.AObjectS142S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Mhp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57521Mhp extends C8HS<User> {
    public InterfaceC57527Mhv LJLIL;
    public C57529Mhx LJLILLLLZI;
    public JWG LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public final java.util.Map<String, Integer> LJLJJLL = new HashMap();
    public boolean LJLJL = false;
    public final Object LJLJLJ = new Object();
    public final C57524Mhs LJLJLLL = new C57524Mhs(this);
    public C57528Mhw LJLL;

    @Override // X.MK7, X.C4II
    public final void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // X.C8HS
    public final List<User> getData() {
        return this.mmItems;
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        List<T> list = this.mmItems;
        Objects.requireNonNull(list);
        if (ListProtector.get(list, i) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    @Override // X.MK7, X.C4II
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        View LIZ = C28289B8j.LIZ(viewGroup, R.layout.bdv, viewGroup, false);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 21), LIZ);
        return new C57530Mhy(LIZ);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        JWG jwg;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof ViewOnClickListenerC57520Mho) && (jwg = this.LJLJI) != null) {
            jwg.vk(viewHolder);
        } else {
            if (!(viewHolder instanceof C57523Mhr) || this.LJLJL) {
                return;
            }
            this.LJLJL = true;
        }
    }

    @Override // X.C8HS
    public final void setData(List<User> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        List list2 = this.mmItems;
        if (list2 == null) {
            list2 = new ArrayList();
            this.mmItems = list2;
        }
        list2.clear();
        list2.addAll(list);
        for (int i = 0; i < list2.size(); i++) {
            User user = (User) ListProtector.get(list2, i);
            if (!(user instanceof RecommendContact)) {
                ((HashMap) this.LJLJJLL).put(user.getUid(), Integer.valueOf(i));
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        User user = null;
        if (viewHolder instanceof ViewOnClickListenerC57520Mho) {
            ViewOnClickListenerC57520Mho viewOnClickListenerC57520Mho = (ViewOnClickListenerC57520Mho) viewHolder;
            List<T> list = this.mmItems;
            if (list != 0 && i >= 0 && i < list.size()) {
                user = (User) ListProtector.get(list, i);
            }
            C57524Mhs c57524Mhs = this.LJLJLLL;
            C57528Mhw c57528Mhw = this.LJLL;
            InterfaceC57527Mhv interfaceC57527Mhv = this.LJLIL;
            String str = this.LJLJJI;
            if (user == null) {
                viewOnClickListenerC57520Mho.getClass();
                return;
            }
            viewOnClickListenerC57520Mho.LJLLILLLL = interfaceC57527Mhv;
            viewOnClickListenerC57520Mho.LJLJJLL = user;
            viewOnClickListenerC57520Mho.LJLJLJ = c57524Mhs;
            viewOnClickListenerC57520Mho.LJLJLLL = c57528Mhw;
            viewOnClickListenerC57520Mho.LJLJL = i;
            viewOnClickListenerC57520Mho.LJLILLLLZI.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            viewOnClickListenerC57520Mho.LJLILLLLZI.LIZ();
            viewOnClickListenerC57520Mho.L(viewOnClickListenerC57520Mho.LJLJJLL);
            TextView textView = viewOnClickListenerC57520Mho.LJLJJI;
            int i2 = viewOnClickListenerC57520Mho.LJLLLL;
            User user2 = viewOnClickListenerC57520Mho.LJLJJLL;
            if (i2 == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("@");
                LIZ.append(user2.getUniqueId());
                textView.setText(X1D.LIZIZ(LIZ));
                textView.setMaxLines(1);
            } else {
                textView.setText(user2.getRecommendReason());
            }
            viewOnClickListenerC57520Mho.P(viewOnClickListenerC57520Mho.LJLJJLL.getFollowStatus(), viewOnClickListenerC57520Mho.LJLJJLL.getFollowerStatus());
            viewOnClickListenerC57520Mho.LJLJJLL.getFollowStatus();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewOnClickListenerC57520Mho.LJLLJ.getLayoutParams();
            marginLayoutParams.leftMargin = 0;
            viewOnClickListenerC57520Mho.LJLLJ.setLayoutParams(marginLayoutParams);
            viewOnClickListenerC57520Mho.LJLLL = str;
            AJ9.LJ(viewOnClickListenerC57520Mho.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), viewOnClickListenerC57520Mho.LJLJI);
            return;
        }
        if (!(viewHolder instanceof C57523Mhr)) {
            return;
        }
        C57523Mhr c57523Mhr = (C57523Mhr) viewHolder;
        List<T> list2 = this.mmItems;
        if (list2 != 0 && i >= 0 && i < list2.size()) {
            user = (User) ListProtector.get(list2, i);
        }
        RecommendContact contact = (RecommendContact) user;
        c57523Mhr.getClass();
        o.LJIIIZ(contact, "contact");
        c57523Mhr.LJLILLLLZI.setPlaceHolder(R.drawable.c07);
        c57523Mhr.LJLJI.setText(R.string.ggr);
        c57523Mhr.LJLJJI.setText(R.string.bf9);
        C16880lQ.LJIILLIIL(c57523Mhr.LJLJJLL, new ACListenerS26S0201000_9(c57523Mhr, contact, i, 0));
        c57523Mhr.LJLJJL.setText("");
        c57523Mhr.LJLJJL.setBackgroundResource(R.drawable.yh);
        TextView textView2 = c57523Mhr.LJLJJL;
        Context mContext = c57523Mhr.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, mContext));
        c57523Mhr.LJLJL = new AObjectS142S0100000_9(this, 0);
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C57523Mhr(C28289B8j.LIZ(viewGroup, R.layout.bdu, viewGroup, false));
        }
        return new ViewOnClickListenerC57520Mho(this.LJLJJL, C28289B8j.LIZ(viewGroup, R.layout.bdu, viewGroup, false), this.LJLJLJ);
    }
}
