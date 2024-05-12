package X;

import Y.ACListenerS34S0100000_14;
import Y.AfS1S0101100_14;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.kids.commonfeed.digg.DiggApi;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.WdD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82715WdD extends AbstractC54946LhO implements Observer<C207668Da> {
    public LinearLayout LJLJJI;
    public C202517x9 LJLJJL;
    public TextView LJLJJLL;
    public int LJLJL;
    public long LJLJLJ;
    public boolean LJLJLLL;
    public final /* synthetic */ View LJLL;

    @Override // X.AbstractC54946LhO
    public final String LIZIZ() {
        return "like";
    }

    @Override // X.AbstractC54946LhO
    public final void LJFF() {
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82715WdD(View view) {
        super(view);
        this.LJLL = view;
    }

    @Override // X.AbstractC54946LhO
    public final void LIZ(LV8 lv8) {
        long j;
        Integer num;
        boolean z;
        AwemeStatistics statistics;
        super.LIZ(lv8);
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        this.LJLJLJ = j;
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            num = Integer.valueOf(aweme2.getUserDigg());
        } else {
            num = null;
        }
        o.LJI(num);
        this.LJLJL = num.intValue();
        Aweme aweme3 = this.LJLILLLLZI;
        boolean z2 = true;
        if (aweme3 != null && aweme3.getUserDigg() == 1) {
            z = true;
        } else {
            z = false;
        }
        LJIIIZ(z);
        C202517x9 c202517x9 = this.LJLJJL;
        if (c202517x9 != null) {
            Aweme aweme4 = this.LJLILLLLZI;
            if (aweme4 == null || aweme4.getUserDigg() != 1) {
                z2 = false;
            }
            c202517x9.setState(Boolean.valueOf(z2));
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LIZJ(View view) {
        if (view instanceof FrameLayout) {
            ViewGroup viewGroup = (ViewGroup) view;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bfm, C16880lQ.LLZIL(viewGroup.getContext()), null);
            this.LJLJJI = (LinearLayout) LLLZIIL.findViewById(R.id.fr2);
            this.LJLJJL = (C202517x9) LLLZIIL.findViewById(R.id.ejk);
            this.LJLJJLL = (TextView) LLLZIIL.findViewById(R.id.m_w);
            EventBus.LIZJ().LJIILJJIL(this);
            LinearLayout linearLayout = this.LJLJJI;
            if (linearLayout != null) {
                C16880lQ.LJIIZILJ(linearLayout, new ACListenerS34S0100000_14(this, 16));
            }
            viewGroup.addView(LLLZIIL);
        }
    }

    @Override // X.AbstractC54946LhO
    public final void LJ(DataCenter dataCenter) {
        dataCenter.iv0("digg_aweme", this, false);
    }

    public final void LJI(int i) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        DiggApi.LIZ.diggAweme(str, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS1S0101100_14(this, i, currentTimeMillis, 0), new AfS1S0101100_14(this, i, currentTimeMillis, 1));
    }

    public final void LJII(int i) {
        int i2;
        Context context;
        int i3 = 1;
        if (i == 1) {
            i2 = R.string.ei0;
        } else {
            i2 = R.string.tdd;
        }
        View view = this.LJLL;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        C5S1 c5s1 = new C5S1(context);
        c5s1.LIZJ(i2);
        c5s1.LJ();
        LJIIIZ(!this.LJLJLLL);
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null) {
            return;
        }
        if (i == 1) {
            i3 = 0;
        }
        aweme.setUserDigg(i3);
    }

    public final void LJIIIIZZ(String str) {
        String str2;
        String str3;
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_from", this.LJLJI);
        c198517qh.LIZ.put("enter_method", str);
        Aweme aweme = this.LJLILLLLZI;
        String str4 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        c198517qh.LIZ.put("group_id", str2);
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null) {
            str3 = aweme2.getAuthorUid();
        } else {
            str3 = null;
        }
        c198517qh.LIZ.put("author_id", str3);
        Aweme aweme3 = this.LJLILLLLZI;
        if (aweme3 != null) {
            str4 = aweme3.getLogPbString();
        }
        C39398FdC.LIZIZ("like", q.LIZJ(c198517qh.LIZ, "log_pb", str4, c198517qh, c39398FdC));
    }

    public final void LJIIIZ(boolean z) {
        long j;
        Aweme aweme;
        String LJJIIJ;
        Aweme aweme2;
        this.LJLJLLL = z;
        C202517x9 c202517x9 = this.LJLJJL;
        if (c202517x9 != null) {
            c202517x9.setSelected(z);
        }
        if (z) {
            if (this.LJLJL == 1) {
                if (this.LJLJLJ < 1 && ((aweme2 = this.LJLILLLLZI) == null || !aweme2.isDelete())) {
                    this.LJLJLJ = 1L;
                }
                j = this.LJLJLJ;
            } else {
                j = 1 + this.LJLJLJ;
            }
        } else if (this.LJLJL != 1 || ((aweme = this.LJLILLLLZI) != null && aweme.isDelete())) {
            j = this.LJLJLJ;
        } else {
            j = this.LJLJLJ - 1;
        }
        if (j < 0) {
            j = 0;
        }
        try {
            Aweme aweme3 = this.LJLILLLLZI;
            if (aweme3 != null && aweme3.isDelete() && j == 0) {
                TextView textView = this.LJLJJLL;
                if (textView != null) {
                    textView.setVisibility(4);
                    return;
                }
                return;
            }
            TextView textView2 = this.LJLJJLL;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.LJLJJLL;
            if (textView3 != null) {
                if (j <= 0) {
                    LJJIIJ = CardStruct.IStatusCode.DEFAULT;
                } else {
                    LJJIIJ = C77123UOp.LJJIIJ(j);
                }
                textView3.setText(LJJIIJ);
            }
        } catch (Exception e) {
            TextView textView4 = this.LJLJJLL;
            if (textView4 != null) {
                textView4.setText(CardStruct.IStatusCode.DEFAULT);
            }
            C36922EeM.LJFF(e);
            C16880lQ.LLLLIIL(e);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onChangeDiggEvent(OB8 event) {
        String str;
        long j;
        AwemeStatistics statistics;
        o.LJIIIZ(event, "event");
        Aweme aweme = this.LJLILLLLZI;
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, event.LJLIL)) {
            Aweme aweme2 = this.LJLILLLLZI;
            if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            this.LJLJLJ = j;
            Aweme aweme3 = this.LJLILLLLZI;
            if (aweme3 != null) {
                num = Integer.valueOf(aweme3.getUserDigg());
            }
            o.LJI(num);
            this.LJLJL = num.intValue();
            Aweme aweme4 = this.LJLILLLLZI;
            boolean z = false;
            if (aweme4 != null && aweme4.getUserDigg() == 1) {
                z = true;
            }
            LJIIIZ(z);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null || !o.LJ(c207668Da2.LIZ, "digg_aweme") || this.LJLJLLL) {
            return;
        }
        C202517x9 c202517x9 = this.LJLJJL;
        if (c202517x9 != null) {
            c202517x9.LIZIZ();
        }
        if (KidsAccountServiceImpl.LJIIIIZZ().isLogin()) {
            LJI(1);
            Aweme aweme = this.LJLILLLLZI;
            if (aweme != null) {
                aweme.setUserDigg(1);
            }
        }
        LJIIIZ(true);
        LJIIIIZZ("click_double_like");
    }
}
