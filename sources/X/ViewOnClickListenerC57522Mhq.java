package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.android.play.core.appupdate.v;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Mhq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class ViewOnClickListenerC57522Mhq extends RelativeLayout implements View.OnClickListener {
    public static final /* synthetic */ int LJZL = 0;
    public ViewStub LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public TextView LJLL;
    public RecyclerView LJLLI;
    public View LJLLILLLL;
    public TextView LJLLJ;
    public C57521Mhp LJLLL;
    public InterfaceC57531Mhz LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public List<User> LJZ;
    public final v LJZI;

    private C57521Mhp getAdapter() {
        if (this.LJLLL == null) {
            this.LJLLL = new C57521Mhp();
        }
        return this.LJLLL;
    }

    public List<User> getData() {
        if (this.LJZ == null) {
            this.LJZ = new ArrayList();
        }
        return this.LJZ;
    }

    public java.util.Map<String, Integer> getPosInApiListMap() {
        return getAdapter().LJLJJLL;
    }

    private void setFindMoreLayout(List<User> list) {
        if (list.size() <= 3) {
            findViewById(R.id.d_n).setVisibility(8);
            return;
        }
        View view = this.LJLJJLL;
        if (view == null) {
            return;
        }
        C62846OlW c62846OlW = (C62846OlW) view.findViewById(R.id.d_k);
        C62846OlW c62846OlW2 = (C62846OlW) this.LJLJJLL.findViewById(R.id.d_l);
        C62846OlW c62846OlW3 = (C62846OlW) this.LJLJJLL.findViewById(R.id.d_m);
        C78765Uvh.LJFF(c62846OlW, ((User) ListProtector.get(list, 3)).getAvatarThumb());
        if (list.size() >= 5) {
            C78765Uvh.LJFF(c62846OlW2, ((User) ListProtector.get(list, 4)).getAvatarThumb());
            if (list.size() >= 6) {
                C78765Uvh.LJFF(c62846OlW3, ((User) ListProtector.get(list, 5)).getAvatarThumb());
                return;
            } else {
                c62846OlW3.setVisibility(8);
                return;
            }
        }
        c62846OlW2.setVisibility(8);
        c62846OlW3.setVisibility(8);
    }

    public final void LIZ(Context context) {
        ViewStub viewStub;
        int i;
        if (this.LJLILLLLZI != null || (viewStub = this.LJLIL) == null) {
            return;
        }
        View inflate = viewStub.inflate();
        this.LJLILLLLZI = inflate;
        this.LJLJI = inflate.findViewById(R.id.g_m);
        this.LJLJJI = this.LJLILLLLZI.findViewById(R.id.g_n);
        this.LJLJJLL = this.LJLILLLLZI.findViewById(R.id.d_p);
        this.LJLJJL = this.LJLILLLLZI.findViewById(R.id.g_o);
        RecyclerView recyclerView = (RecyclerView) this.LJLILLLLZI.findViewById(R.id.isn);
        this.LJLLI = recyclerView;
        recyclerView.setAdapter(getAdapter());
        this.LJLLILLLL = this.LJLILLLLZI.findViewById(R.id.fs2);
        this.LJLLJ = (TextView) this.LJLILLLLZI.findViewById(R.id.mew);
        this.LJLJL = this.LJLILLLLZI.findViewById(R.id.i4i);
        this.LJLL = (TextView) this.LJLILLLLZI.findViewById(R.id.mgq);
        this.LJLJLLL = this.LJLILLLLZI.findViewById(R.id.nbm);
        this.LJLJLJ = this.LJLILLLLZI.findViewById(R.id.nbn);
        int i2 = 0;
        ((AbstractC28931Bp) this.LJLLI.getItemAnimator()).LJI = false;
        getAdapter().LJLILLLLZI = new C57529Mhx(this);
        getAdapter().LJLL = new C57528Mhw(this, context);
        RecyclerView recyclerView2 = this.LJLLI;
        recyclerView2.setPadding((int) KL2.LIZJ(recyclerView2.getContext(), 8.0f), 0, 0, 0);
        this.LJLLI.setClipToPadding(false);
        this.LJLLI.LJII(new C119394mN(0, (int) KL2.LIZJ(context, 4.0f), 0), -1);
        this.LJLLI.setLayoutManager(new WrapLinearLayoutManager(0));
        C16880lQ.LJIIJ(this, this.LJLJI);
        C16880lQ.LJIIJ(this, this.LJLJJLL);
        FFL.LJIIIZ().getClass();
        if (!FFL.LJ(31744, "enable_privacy_reminder", true, false)) {
            this.LJLJL.setVisibility(8);
        } else {
            this.LJLJL.setVisibility(0);
            C16880lQ.LJIIJ(this, this.LJLJL);
        }
        if (!SharePrefCache.inst().getIsEuropeCountry().LIZ().booleanValue() || (LOG.LIZ() && !((RBX) HG3.LJIILL()).isLogin())) {
            this.LJLLJ.setVisibility(8);
        } else {
            TextView textView = this.LJLLJ;
            if (textView != null) {
                textView.setVisibility(0);
                String string = getContext().getResources().getString(R.string.p9z);
                String LLLZ = C16880lQ.LLLZ(getContext().getString(R.string.p9y), new Object[]{string});
                String[] split = LLLZ.split(string);
                if (split != null && split.length == 2) {
                    i2 = split[0].length();
                    i = string.length() + i2;
                } else {
                    i = 0;
                }
                SpannableString spannableString = new SpannableString(LLLZ);
                spannableString.setSpan(new C57525Mht(this), i2, i, 33);
                this.LJLLJ.setText(spannableString);
                this.LJLLJ.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        View view = ((ViewOnClickListenerC57522Mhq) this.LJZI.LIZ).LJLJJLL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!(parent instanceof RecyclerView));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC57531Mhz interfaceC57531Mhz;
        InterfaceC57531Mhz interfaceC57531Mhz2;
        if (view.getId() == R.id.g_m && this.LJLLLLLL && (interfaceC57531Mhz2 = this.LJLLLL) != null) {
            ((C57526Mhu) interfaceC57531Mhz2).LIZ();
        }
        if (view.getId() == R.id.d_p && (interfaceC57531Mhz = this.LJLLLL) != null) {
            ((C57526Mhu) interfaceC57531Mhz).LIZ();
        }
        if (view.getId() == R.id.i4i) {
            HashMap hashMap = new HashMap();
            if (this.LJLZ == 1) {
                hashMap.put("enter_from", "homepage_follow");
            } else {
                hashMap.put("enter_from", "others_homepage");
            }
            FMX.LJIIL("click_privacy_tips", hashMap);
            String LIZ = SharePrefCache.inst().getPrivacyReminderH5Url().LIZ();
            if (LIZ != null) {
                try {
                    Context context = getContext();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("aweme://webview/?url=");
                    LIZ2.append(URLEncoder.encode(LIZ, "UTF-8"));
                    SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ2));
                    buildRoute.withParam("show_load_dialog", true);
                    buildRoute.withParam("hide_nav_bar", false);
                    buildRoute.withParam("use_webview_title", true);
                    buildRoute.open();
                } catch (UnsupportedEncodingException e) {
                    C16880lQ.LLLLIIL(e);
                    C36922EeM.LIZ(e);
                }
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        LIZ(getContext());
        findViewById(R.id.fkm).setBackgroundResource(i);
    }

    public void setOnItemOperationListener(InterfaceC57527Mhv interfaceC57527Mhv) {
        getAdapter().LJLIL = interfaceC57527Mhv;
    }

    public void setOnLookMoreUserListener(InterfaceC57531Mhz interfaceC57531Mhz) {
        this.LJLLLL = interfaceC57531Mhz;
    }

    public void setOnViewAttachedToWindowListener(JWG<ViewOnClickListenerC57520Mho> jwg) {
        getAdapter().LJLJI = jwg;
    }

    public void setPageType(int i) {
        this.LJLZ = i;
        getAdapter().LJLJJL = i;
        v vVar = this.LJZI;
        View view = ((ViewOnClickListenerC57522Mhq) vVar.LIZ).LJLJJL;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        ((ViewOnClickListenerC57522Mhq) vVar.LIZ).LJLJJLL.setVisibility(8);
        if (i != 0) {
            return;
        }
        ((ViewOnClickListenerC57522Mhq) vVar.LIZ).LJLJJL.setVisibility(8);
        ((ViewOnClickListenerC57522Mhq) vVar.LIZ).LJLJJLL.setVisibility(8);
        ((ViewOnClickListenerC57522Mhq) vVar.LIZ).LJLLJ.setVisibility(8);
        ((ViewOnClickListenerC57522Mhq) vVar.LIZ).LJLJL.setVisibility(8);
        ((ViewOnClickListenerC57522Mhq) vVar.LIZ).LJLL.setText(R.string.pfc);
        ((ViewOnClickListenerC57522Mhq) vVar.LIZ).setShowLookMore(false);
    }

    public void setReminderText(int i) {
        TextView textView = this.LJLL;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setShowLookMore(boolean z) {
        int i;
        LIZ(getContext());
        this.LJLLLLLL = z;
        View view = this.LJLJI;
        if (view != null && this.LJLJJI != null) {
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
            View view2 = this.LJLJJI;
            if (!z) {
                i2 = 4;
            }
            view2.setVisibility(i2);
        }
        getAdapter().setShowFooter(z);
    }

    public ViewOnClickListenerC57522Mhq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLLLLL = true;
        this.LJZI = new v(this);
        ViewStub viewStub = new ViewStub(context);
        this.LJLIL = viewStub;
        viewStub.setLayoutResource(R.layout.dtf);
        this.LJLIL.setInflatedId(R.id.fkm);
        addView(this.LJLIL);
    }

    public final void LIZIZ(String str, List list) {
        View view;
        if (list == null) {
            return;
        }
        LIZ(getContext());
        if (list.size() > 0 && (view = this.LJLJLLL) != null && this.LJLJLJ != null) {
            view.setVisibility(0);
            this.LJLJLJ.setVisibility(8);
        }
        this.LJZ = list;
        getAdapter().setData(this.LJZ);
        getAdapter().LJLJJI = str;
        if (this.LJLLLLLL && this.LJZ.size() >= 10) {
            getAdapter().setShowFooter(true);
        } else {
            getAdapter().setShowFooter(false);
        }
        if (this.LJLZ != 1) {
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
