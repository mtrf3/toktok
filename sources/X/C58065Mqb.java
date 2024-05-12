package X;

import Y.AObserverS77S0100000_9;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Mqb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58065Mqb extends FrameLayout implements InterfaceC55117Lk9 {
    public final C53873LCj LJLIL;
    public final TuxTextView LJLILLLLZI;
    public View LJLJI;
    public InterfaceC53713L6f LJLJJI;
    public User LJLJJL;
    public final int LJLJJLL;
    public ListLiveCircleItemVM LJLJL;
    public final ActivityC45651qj LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public InterfaceC58069Mqf LJLLLL;
    public int LJLLLLLL;
    public String LJLZ;
    public final AObserverS77S0100000_9 LJZ;
    public final AObserverS77S0100000_9 LJZI;
    public final AObserverS77S0100000_9 LJZL;

    public C58065Mqb getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        User user = this.LJLJJL;
        String str = null;
        if (user != null && user.isLive()) {
            LIZ(user);
        }
        this.LJLLJ = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(' ');
        User user2 = this.LJLJJL;
        if (user2 != null) {
            str = user2.getUid();
        }
        C12400eC.LIZIZ(LIZ, str, " onAttachedToWindow", LIZ, "LYP_LOG");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        String str;
        super.onDetachedFromWindow();
        this.LJLLJ = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(' ');
        User user = this.LJLJJL;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        C12400eC.LIZIZ(LIZ, str, " onDetachedFromWindow", LIZ, "LYP_LOG");
    }

    public final Observer<Boolean> getNodeVisibleObserver() {
        return this.LJZI;
    }

    public final Observer<Boolean> getPageVisibleObserver() {
        return this.LJZ;
    }

    public final Observer<Boolean> getRefreshStateObserver() {
        return this.LJZL;
    }

    /* renamed from: getView, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ViewGroup m25getView() {
        getView();
        return this;
    }

    public final void LIZ(User user) {
        int followStatus = user.getFollowStatus();
        int i = 3;
        if (followStatus >= 0 && followStatus < 3) {
            i = user.getFollowStatus();
        } else if (user.getFollowerStatus() == 0) {
            i = 0;
        }
        try {
        } catch (Exception unused) {
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("enter_from_merge", this.LJLLI);
        c188727au.LJIIIZ("enter_method", this.LJLL);
        c188727au.LJ(user.roomId, "room_id");
        c188727au.LJIIIZ("anchor_id", user.getUid());
        c188727au.LIZLLL(i, "follow_status");
        c188727au.LJIIIZ("request_id", "");
        if (this.LJLZ.length() > 0) {
            c188727au.LJI("sort_status", this.LJLZ);
            c188727au.LIZLLL(this.LJLLLLLL, "followlist_order");
        }
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public final void setOnListItemLiveCircleStatusChange(InterfaceC58069Mqf interfaceC58069Mqf) {
        this.LJLLLL = interfaceC58069Mqf;
    }

    public final void setTagTextSize(float f) {
        this.LJLILLLLZI.LJJJ(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58065Mqb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = (int) KL2.LIZJ(context, 5.0f);
        this.LJLL = "";
        this.LJLLI = "";
        this.LJLLLLLL = -1;
        this.LJLZ = "";
        this.LJZ = new AObserverS77S0100000_9(this, 118);
        this.LJZI = new AObserverS77S0100000_9(this, 117);
        this.LJZL = new AObserverS77S0100000_9(this, 119);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bpu, C16880lQ.LLZIL(context), this);
        View findViewById = LLLZIIL.findViewById(R.id.f68);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.iv_live_circle)");
        C53873LCj c53873LCj = (C53873LCj) findViewById;
        this.LJLIL = c53873LCj;
        View findViewById2 = LLLZIIL.findViewById(R.id.m8p);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tv_icon_tag)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.LJLILLLLZI = tuxTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.axn, R.attr.axr, R.attr.axs, R.attr.axt, R.attr.bqy});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…e.ListItemLiveCircleView)");
        float dimension = obtainStyledAttributes.getDimension(1, KL2.LIZJ(context, 1.5f));
        int i = obtainStyledAttributes.getInt(4, 92);
        float dimension2 = obtainStyledAttributes.getDimension(2, 0.0f);
        int dimension3 = (int) obtainStyledAttributes.getDimension(0, KL2.LIZJ(context, 0.0f));
        int dimension4 = (int) obtainStyledAttributes.getDimension(3, KL2.LIZJ(context, 20.0f));
        obtainStyledAttributes.recycle();
        tuxTextView.setTuxFont(i);
        tuxTextView.setHeight(dimension4);
        c53873LCj.setStrokeWidth((int) dimension);
        if (dimension2 != 0.0f) {
            ViewGroup.LayoutParams layoutParams = c53873LCj.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).bottomMargin = (int) dimension2;
            }
            c53873LCj.setLayoutParams(layoutParams);
        }
        if (dimension3 != 0) {
            this.LJLJJLL = dimension3;
            c53873LCj.setPadding(dimension3, dimension3, dimension3, dimension3);
        }
        if (context instanceof ActivityC45651qj) {
            this.LJLJLJ = (ActivityC45651qj) context;
        }
        setClipChildren(false);
        setVisibility(8);
    }
}
