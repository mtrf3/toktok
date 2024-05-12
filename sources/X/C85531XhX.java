package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.OneClickLoginViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS2S0311000_11;
import kotlin.jvm.internal.AqS64S0201000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XhX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85531XhX extends AbstractC029409q<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public List<BaseLoginMethod> LJLIL;
    public final InterfaceC85536Xhc LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final OneClickLoginViewModel LJLJJL;

    public final void LJLLLLLL() {
        this.LJLIL = R5G.LIZ(ORZ.LLJILJILJ(C68517Qun.LIZ.LJ(R41.LIZIZ.LJFF().allUidList())));
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size() + 1 + 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == this.LJLIL.size() + 1) {
            return 2;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (r4.equals("m_twitter") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0149, code lost:
    
        r1 = r3.getString(com.zhiliaoapp.musically.R.string.ja6);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "context.getString(R.stri…ogin_loginmethod_twitter)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        if (r4.equals("google_onetap") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0161, code lost:
    
        r1 = r3.getString(com.zhiliaoapp.musically.R.string.ja4);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "context.getString(R.stri…login_loginmethod_google)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0145, code lost:
    
        if (r4.equals("twitter") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015d, code lost:
    
        if (r4.equals("google") == false) goto L18;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r25, int r26) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85531XhX.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup p0, int i) {
        RecyclerView.ViewHolder c85533XhZ;
        o.LJIIIZ(p0, "p0");
        if (i == 0) {
            if (C53262KvK.LIZIZ()) {
                c85533XhZ = C74214TAs.LIZIZ(((Boolean) this.LJLJJL.LJLJJL.getValue()).booleanValue(), p0, false, null, 56);
            } else {
                c85533XhZ = new C85537Xhd(C1FL.LIZIZ(p0, R.layout.o1, p0, false, "from(p0.context)\n       …ccount_header, p0, false)"));
            }
        } else if (i == 2) {
            c85533XhZ = new C85535Xhb(this, C1FL.LIZIZ(p0, R.layout.m2, p0, false, "from(p0.context)\n       …sting_account, p0, false)"));
        } else {
            c85533XhZ = new C85533XhZ(this, C1FL.LIZIZ(p0, R.layout.n7, p0, false, "from(p0.context)\n       …_login_method, p0, false)"));
        }
        C0AX.LIZ(p0, c85533XhZ.itemView, R.id.lj7);
        View view = c85533XhZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(p0));
        }
        try {
            if (c85533XhZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c85533XhZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(p0.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c85533XhZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c85533XhZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c85533XhZ.getClass().getName();
        return c85533XhZ;
    }

    public final void LJLZ(int i, Context context, BaseLoginMethod baseLoginMethod, boolean z) {
        BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
        int i2 = i - 1;
        C26227ARb c26227ARb = new C26227ARb(context);
        if (baseLoginMethod2 == null) {
            baseLoginMethod2 = (BaseLoginMethod) ListProtector.get(this.LJLIL, i2);
        }
        c26227ARb.LJ(R.string.j_u);
        c26227ARb.LJII = false;
        c26227ARb.LIZ(R.string.j_s);
        UC0.LIZJ(c26227ARb, new AqS2S0311000_11(i, z, baseLoginMethod2, this, context, 1));
        c26227ARb.LJI().LIZLLL();
    }

    public C85531XhX(List list, R5B r5b, String str, String str2, OneClickLoginViewModel oneClickLoginViewModel) {
        o.LJIIIZ(oneClickLoginViewModel, "oneClickLoginViewModel");
        this.LJLIL = list;
        this.LJLILLLLZI = r5b;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = oneClickLoginViewModel;
    }

    public final void LJZ(int i, Context context, int i2, int i3, int i4, int i5, BaseLoginMethod baseLoginMethod) {
        BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
        int i6 = i - 1;
        C26227ARb c26227ARb = new C26227ARb(context);
        if (baseLoginMethod2 == null) {
            baseLoginMethod2 = (BaseLoginMethod) ListProtector.get(this.LJLIL, i6);
        }
        long time = baseLoginMethod2.getExpires().getTime() - 2592000000L;
        Long lastActiveTime = baseLoginMethod2.getLastActiveTime();
        if (lastActiveTime != null) {
            long longValue = lastActiveTime.longValue();
            if (longValue < 0) {
                time = longValue;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", baseLoginMethod2.getUid());
        c188727au.LJIIIZ("last_active", R3P.LIZ(time));
        c188727au.LJIIIZ("platform", R5D.LIZIZ(baseLoginMethod2));
        c188727au.LIZLLL(this.LJLIL.size(), "user_cnt");
        FMX.LJIIL("login_notify_remove_account", c188727au.LIZ);
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        C35936E8m c35936E8m = new C35936E8m();
        if (str == null) {
            str = "";
        }
        c35936E8m.LIZLLL("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("account_type", R5D.LIZ(baseLoginMethod2));
        c35936E8m.LIZLLL("platform", R5D.LIZIZ(baseLoginMethod2));
        FMX.LJIIL("oneclick_remove_account_show", c35936E8m.LIZ);
        c26227ARb.LJ(i2);
        c26227ARb.LJII = false;
        c26227ARb.LIZ(i3);
        c26227ARb.LIZJ(new AqS64S0201000_15(baseLoginMethod2, this, i, 8));
        UC0.LIZJ(c26227ARb, new R5F(i4, i5, i, this, baseLoginMethod2, context));
        c26227ARb.LJI().LIZLLL();
    }
}
