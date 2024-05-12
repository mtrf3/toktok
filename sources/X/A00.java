package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserProfileGuide;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A00 extends RecyclerView.ViewHolder implements A01, A02 {
    public final LinearLayout LJLIL;
    public final TextView LJLILLLLZI;
    public final SY4 LJLJI;
    public final Context LJLJJI;
    public String LJLJJL;

    @Override // X.A02
    public final void LJJIIJZLJL(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, C17N.LJIILL(48.0d), 0, C17N.LJIILL(24.0d));
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.LJLIL.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, C17N.LJIILL(24.0d), 0, C17N.LJIILL(24.0d));
        }
    }

    @Override // X.A01
    public final void LLZ(User user) {
        Integer valueOf;
        UserProfileGuide userProfileGuide;
        String str;
        if (user == null) {
            return;
        }
        List<UserProfileGuide> userProfileGuide2 = user.getUserProfileGuide();
        String str2 = null;
        if (userProfileGuide2 == null || (valueOf = Integer.valueOf(userProfileGuide2.size())) == null || valueOf.intValue() <= 0) {
            return;
        }
        int nextInt = V0Q.Default.nextInt(valueOf.intValue());
        List<UserProfileGuide> userProfileGuide3 = user.getUserProfileGuide();
        if (userProfileGuide3 != null) {
            userProfileGuide = (UserProfileGuide) ListProtector.get(userProfileGuide3, nextInt);
        } else {
            userProfileGuide = null;
        }
        TextView textView = this.LJLILLLLZI;
        if (userProfileGuide != null) {
            str = userProfileGuide.getGuideContext();
        } else {
            str = null;
        }
        textView.setText(str);
        if (userProfileGuide != null) {
            str2 = userProfileGuide.getGuideContextKeyToReport();
        }
        this.LJLJJL = str2;
        if (str2 == null) {
            str2 = "";
        }
        C255199zv.LJ = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A00(View view, ActivityC45651qj context, AwemeListFragmentImpl fragmentImpl, C56473MEj adapter) {
        super(view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fragmentImpl, "fragmentImpl");
        o.LJIIIZ(adapter, "adapter");
        View findViewById = view.findViewById(R.id.e0k);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.guide_card_container)");
        this.LJLIL = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.jvj);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.share_your_first_video)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mv0);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.upload_work)");
        this.LJLJI = (SY4) findViewById3;
        this.LJLJJI = context;
        C255199zv.LIZLLL = true;
        fragmentImpl.LLJLLIL.add(this);
        LLZ(fragmentImpl.LJLJJL);
        ((HashSet) adapter.LLIIL).add(this);
    }
}
